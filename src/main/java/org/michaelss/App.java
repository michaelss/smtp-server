package org.michaelss;

import org.subethamail.smtp.server.SMTPServer;

public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando servidor SMTP...");
        
        MyMessageHandlerFactory myFactory = new MyMessageHandlerFactory() ;
		SMTPServer smtpServer = new SMTPServer(myFactory);
		smtpServer.setPort(25000);
        smtpServer.start();

        System.out.println("Servidor SMTP iniciado!");
    }
}
