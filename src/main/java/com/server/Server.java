package com.server;

import com.server.services.ReservationServiceImpl;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server = ServerBuilder
                .forPort(8085)
                .addService(new ReservationServiceImpl())
                .build();

        server.start();
        System.out.println("Server is running");
        server.awaitTermination();
    }
}
