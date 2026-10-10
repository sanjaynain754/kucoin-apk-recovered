package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract long getNextRequestWaitMillis();

    public abstract Status getStatus();

    public static BackendResponse fatalError() {
        return new AutoValue_BackendResponse(Status.FATAL_ERROR, -1L);
    }

    public static BackendResponse invalidPayload() {
        return new AutoValue_BackendResponse(Status.INVALID_PAYLOAD, -1L);
    }

    /* JADX INFO: renamed from: ok */
    public static BackendResponse m12816ok(long j11) {
        return new AutoValue_BackendResponse(Status.OK, j11);
    }

    public static BackendResponse transientError() {
        return new AutoValue_BackendResponse(Status.TRANSIENT_ERROR, -1L);
    }
}
