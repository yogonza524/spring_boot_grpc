package com.server.services;

import com.google.protobuf.Timestamp;
import com.reservation.ReservationRequest;
import com.reservation.ReservationResponse;
import com.reservation.ReservationServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

public class ReservationServiceImpl extends ReservationServiceGrpc.ReservationServiceImplBase {

    @Override
    public void createReservation(ReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        responseObserver.onNext(ReservationResponse.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(Timestamp.newBuilder().build())
                .setPnr("ABCDEF")
                .setPaymentProvider("Paypal")
                .build());
        responseObserver.onCompleted();
    }
}
