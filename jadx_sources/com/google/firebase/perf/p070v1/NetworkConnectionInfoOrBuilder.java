package com.google.firebase.perf.p070v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes56.dex */
public interface NetworkConnectionInfoOrBuilder extends MessageLiteOrBuilder {
    NetworkConnectionInfo.MobileSubtype getMobileSubtype();

    NetworkConnectionInfo.NetworkType getNetworkType();

    boolean hasMobileSubtype();

    boolean hasNetworkType();
}
