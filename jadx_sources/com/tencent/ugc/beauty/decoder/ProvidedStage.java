package com.tencent.ugc.beauty.decoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProvidedStage<T> extends Stage implements Provider<T> {
    protected final Queue<T> mWaitOutBuffers = new LinkedList();
    protected final Queue<T> mRecycledBuffers = new LinkedList();
    protected int mBufferOutedCount = 0;

    @Override // com.tencent.ugc.beauty.decoder.Provider
    public T dequeueOutputBuffer() {
        T tPoll;
        synchronized (this) {
            try {
                tPoll = this.mWaitOutBuffers.poll();
                if (tPoll != null) {
                    this.mBufferOutedCount++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tPoll;
    }

    @Override // com.tencent.ugc.beauty.decoder.Provider
    public void enqueueOutputBuffer(T t11) {
        synchronized (this) {
            this.mBufferOutedCount--;
            this.mRecycledBuffers.add(t11);
        }
    }

    public boolean noBufferKeepByUs() {
        boolean z11;
        synchronized (this) {
            try {
                z11 = this.mRecycledBuffers.isEmpty() && this.mWaitOutBuffers.isEmpty() && this.mBufferOutedCount == 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.tencent.ugc.beauty.decoder.Stage
    public void processFrame() throws ProcessException {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mRecycledBuffers);
            this.mRecycledBuffers.clear();
        }
        recycleBuffers(arrayList);
        synchronized (this) {
            try {
                if (isAllDataReady() && noBufferKeepByUs()) {
                    setState(Stage.State.DONE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void recycleBuffers(List<T> list);

    public void drainOutputBuffers() {
        T tDequeueOutputBuffer = dequeueOutputBuffer();
        if (tDequeueOutputBuffer != null) {
            enqueueOutputBuffer(tDequeueOutputBuffer);
        }
    }
}
