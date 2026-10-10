package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public interface BillingOrBuilder extends MessageLiteOrBuilder {
    Billing.BillingDestination getConsumerDestinations(int i11);

    int getConsumerDestinationsCount();

    List<Billing.BillingDestination> getConsumerDestinationsList();
}
