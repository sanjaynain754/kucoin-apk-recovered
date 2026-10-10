package com.google.firebase.perf.p070v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes56.dex */
public interface AndroidMemoryReadingOrBuilder extends MessageLiteOrBuilder {
    long getClientTimeUs();

    int getUsedAppJavaHeapMemoryKb();

    boolean hasClientTimeUs();

    boolean hasUsedAppJavaHeapMemoryKb();
}
