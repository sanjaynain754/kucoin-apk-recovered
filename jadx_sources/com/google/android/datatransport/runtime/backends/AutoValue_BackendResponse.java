package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_BackendResponse extends BackendResponse {
    private final long nextRequestWaitMillis;
    private final BackendResponse.Status status;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            if (this.status.equals(backendResponse.getStatus()) && this.nextRequestWaitMillis == backendResponse.getNextRequestWaitMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() ^ 1000003) * 1000003;
        long j11 = this.nextRequestWaitMillis;
        return iHashCode ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.status + ", nextRequestWaitMillis=" + this.nextRequestWaitMillis + "}";
    }

    public AutoValue_BackendResponse(BackendResponse.Status status, long j11) {
        if (status != null) {
            this.status = status;
            this.nextRequestWaitMillis = j11;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
