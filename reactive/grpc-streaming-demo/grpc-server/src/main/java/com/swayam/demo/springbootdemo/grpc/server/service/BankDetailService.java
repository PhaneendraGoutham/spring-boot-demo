package com.swayam.demo.springbootdemo.grpc.server.service;

import com.swayam.demo.springbootdemo.grpc.proto.BankDetailDto;

import io.grpc.stub.StreamObserver;

public interface BankDetailService {

    void getBankDetailsReactive(StreamObserver<BankDetailDto> responseObserver);

}