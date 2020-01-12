package com.client;

import com.reservation.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    //gRPC client
    public static void main(String[] args) {
        //Abro el canal
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost",8085)
                .usePlaintext() //Security context
                .build();

        //Client generation
        ReservationServiceGrpc.ReservationServiceBlockingStub client =
                ReservationServiceGrpc.newBlockingStub(channel);

        //Call to the service server
        ReservationResponse response = client.createReservation(ReservationRequest.newBuilder()
                .setReservation(
                        Reservation.newBuilder()
                                .setOrigin("MAD")
                                .setDestination("MIA")
                                .build()
                )
                .build());

        //Show the response
        System.out.println("ID generated: " + response.getId() + ", PNR: " + response.getPnr() + ", provider of payment: " + response.getPaymentProvider());

        channel.shutdown();
    }
}
