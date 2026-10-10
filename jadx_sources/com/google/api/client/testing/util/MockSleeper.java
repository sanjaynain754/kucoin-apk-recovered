package com.google.api.client.testing.util;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Sleeper;

/* JADX INFO: loaded from: classes56.dex */
@Beta
public class MockSleeper implements Sleeper {
    private int count;
    private long lastMillis;

    public final int getCount() {
        return this.count;
    }

    public final long getLastMillis() {
        return this.lastMillis;
    }

    @Override // com.google.api.client.util.Sleeper
    public void sleep(long j11) throws InterruptedException {
        this.count++;
        this.lastMillis = j11;
    }
}
