package com.example.springdocserverbeanissue;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.servers.ServerVariable;
import io.swagger.v3.oas.models.servers.ServerVariables;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@OpenAPIDefinition
public class OpenApiSwaggerConfig {

//    @Bean
//    public OpenAPI api() {
//        Map<String,Object> extensions = new HashMap<>();
//        extensions.put("x-keywords", "MMS Acl Ordering");
//        extensions.put("x-related-masterdata", "article, orders");
//        extensions.put("x-solution", "MMSACL");
//        extensions.put("x-scope", "metro");
//        License license = new License();
//        license.setName("Apache License Version 2.0");
//        license.setUrl("https://www.apache.org/licenses/LICENSE-2.0");
//        Contact contact = new Contact();
//        contact.setName("MMSACL Team");
//        contact.setEmail("Metrosystemsrobuk-devops-mmsacl@metrosystems.net");
//        contact.addExtension("x-teams", "ACL");
//
//
//        var server= new Server();
//        server.setUrl("{protocol}://");
//        server.setDescription("test");
//        //server.setVariables(new ServerVariables().addServerVariable("protocol",new ServerVariable().addEnumItem("https")));
//
//        var serverVariable = new ServerVariable();
//        //serverVariable.
//        serverVariable.setDefault("https");
//
//        server.setVariables(new ServerVariables().addServerVariable("protocol",serverVariable));
//
//
//
//        var openApi = new OpenAPI()
//                //.addServersItem(new Server().setVariables(new ServerVariables().addServerVariable("protocol",new ServerVariable().addEnumItem("https"))))
//                //.servers(List.of(server))
//                //.paths(PathSelectors.regex("/api/.*"))
//                // for basic auth
////                .components(new Components().addSecuritySchemes("basicScheme",
////                        new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
//                .info(new Info()
//                        .title("MMSACL Ordering service")
//                        .description("REST API for MMS Store Ordering information")
//                        .version("1.0.0")
//                        .termsOfService("http://terms-of-services.url")
//                        .license(license)
//                        .contact(contact)
//                        .extensions(extensions)
//                );
//       // openApi.addServersItem(server);
//       // openApi.servers(List.of(server));
//
//        return openApi.addServersItem(new Server().url("https://myserver.com"));
//    }



    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().addServersItem(new Server().url("https://myserver.com"))
                .components(new Components().addSecuritySchemes("basicScheme",
                        new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
                .info(new Info().title("SpringShop API").version("V0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }



}

