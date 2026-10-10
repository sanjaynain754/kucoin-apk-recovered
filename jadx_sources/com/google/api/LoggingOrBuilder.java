package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public interface LoggingOrBuilder extends MessageLiteOrBuilder {
    Logging.LoggingDestination getConsumerDestinations(int i11);

    int getConsumerDestinationsCount();

    List<Logging.LoggingDestination> getConsumerDestinationsList();

    Logging.LoggingDestination getProducerDestinations(int i11);

    int getProducerDestinationsCount();

    List<Logging.LoggingDestination> getProducerDestinationsList();
}
