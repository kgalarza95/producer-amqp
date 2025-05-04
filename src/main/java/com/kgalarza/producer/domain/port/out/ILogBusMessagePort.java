package com.kgalarza.producer.domain.port.out;

public interface ILogBusMessagePort {

    void sendMessage(String message);
}
