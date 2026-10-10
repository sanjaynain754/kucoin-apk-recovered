package com.google.firebase.perf.p070v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes56.dex */
public interface CpuMetricReadingOrBuilder extends MessageLiteOrBuilder {
    long getClientTimeUs();

    long getSystemTimeUs();

    long getUserTimeUs();

    boolean hasClientTimeUs();

    boolean hasSystemTimeUs();

    boolean hasUserTimeUs();
}
