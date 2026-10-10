package androidx.media3.common.util;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z11 = false;
        while (!this.isOpen) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z11;
        z11 = this.isOpen;
        this.isOpen = false;
        return z11;
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public synchronized boolean block(long j11) throws InterruptedException {
        try {
            if (j11 <= 0) {
                return this.isOpen;
            }
            long jElapsedRealtime = this.clock.elapsedRealtime();
            long j12 = j11 + jElapsedRealtime;
            if (j12 < jElapsedRealtime) {
                block();
            } else {
                while (!this.isOpen && jElapsedRealtime < j12) {
                    wait(j12 - jElapsedRealtime);
                    jElapsedRealtime = this.clock.elapsedRealtime();
                }
            }
            return this.isOpen;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
