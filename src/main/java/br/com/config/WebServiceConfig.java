package br.com.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

import java.io.*;
import java.util.Scanner;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        return new ServletRegistrationBean(servlet, "/wsdlfirst/*");
    }

    @Bean(name="tutorialService")
    public Wsdl11Definition defaultWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();

        File temp = null;

        try {
            // criando arquivo temporario.
            temp = File.createTempFile("TutorialService",".wsdl");

            // lendo arquivo modelo
            InputStream is = WebServiceConfig.class.getResourceAsStream("/wsdl/TutorialServiceModelo.wsdl");

            // escrevendo em arquivo temporario.
            OutputStream os = new FileOutputStream(temp.getAbsolutePath());
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            Scanner entrada = new Scanner(is);

            while (entrada.hasNextLine()) {
                String linha = entrada.nextLine();
                // realizando alteraçoes de parametros passado no sistema.
                if(linha.contains("localhost")){
                    linha = linha.replace("localhost", "25.62.205.59");
                }
                bw.write(linha);
                bw.newLine();
            }

            bw.close();
            entrada.close();

        }catch (Exception e){
            e.printStackTrace();
        }


        // pegar caminho
        String caminhoAbsoluto = this.getClass().getResource("/wsdl/TutorialService.wsdl").getPath();

        // apagando arquivo de configuração para subistituir.
        new File(caminhoAbsoluto).delete();

        // mover
        temp.renameTo(new File(caminhoAbsoluto));
        ClassPathResource classPathResource = new ClassPathResource("/wsdl/TutorialService.wsdl");
        wsdl11Definition.setWsdl(classPathResource);
        return wsdl11Definition;
    }
}