package edu.escuelaing.arsw.model;

import java.net.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;

/**
 * Servidor Http SINGLETON
 * 
 * @author Johann Cepeda
 */
public class HttpServer  {

    private static HttpServer _instance = new HttpServer();
    private boolean isRunning = true;

    private HttpServer() {
    }

    /**
     * Devuelve la unica instancia de la clase
     * 
     * @return
     */
    public static HttpServer getInstance() {
        return _instance;
    }

    public static void main(String[] args) throws IOException {
        HttpServer.getInstance().startServer(args);
    }

    /**
     * Inicializar el servidor
     * 
     * @param args
     * @throws IOException
     */
    public void startServer(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        ExecutorService poolThread = Executors.newFixedThreadPool(20);
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        System.out.println("Listo para recibir ...");
        while (isRunning) {
            try {
                Socket clientSocket = serverSocket.accept();
                poolThread.submit(() -> new ResponseProcesor(clientSocket));
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }
        }

        serverSocket.close();
        poolThread.shutdown();
    }

    public void shutDownServer() {
        isRunning = false;
    }
}