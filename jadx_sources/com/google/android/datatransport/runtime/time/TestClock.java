package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes45.dex */
public class TestClock implements Clock {
    private final AtomicLong timestamp;

    public void advance(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.timestamp.addAndGet(j11);
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.timestamp.get();
    }

    public void tick() {
        advance(1L);
    }

    public TestClock(long j11) {
        this.timestamp = new AtomicLong(j11);
    }
}
