package ru.itpark.userservice.application.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import proto.ExampleRequest;
import proto.ExampleResponse;
import proto.ExampleServiceGrpc;

@GrpcService
public class ExampleServiceImpl extends ExampleServiceGrpc.ExampleServiceImplBase {
    @Override
    public void sayHello(ExampleRequest request, StreamObserver<ExampleResponse> responseObserver) {
        var message = "Hello:  " + request.getName();
        var age = request.getAge();

        ExampleResponse response = ExampleResponse
                .newBuilder()
                .setMessage(message + " Age: " + age)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
