package com.google.api.client.testing.util;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class MockBackOff implements BackOff {
    private long backOffMillis;
    private int maxTries = 10;
    private int numTries;

    @Override // com.google.api.client.util.BackOff
    public void reset() throws IOException {
        this.numTries = 0;
    }

    public final int getMaxTries() {
        return this.maxTries;
    }

    public final int getNumberOfTries() {
        return this.numTries;
    }

    @Override // com.google.api.client.util.BackOff
    public long nextBackOffMillis() throws IOException {
        int i11 = this.numTries;
        if (i11 < this.maxTries) {
            long j11 = this.backOffMillis;
            if (j11 != -1) {
                this.numTries = i11 + 1;
                return j11;
            }
        }
        return -1L;
    }

    public MockBackOff setBackOffMillis(long j11) {
        Preconditions.checkArgument(j11 == -1 || j11 >= 0);
        this.backOffMillis = j11;
        return this;
    }

    public MockBackOff setMaxTries(int i11) {
        Preconditions.checkArgument(i11 >= 0);
        this.maxTries = i11;
        return this;
    }
}
