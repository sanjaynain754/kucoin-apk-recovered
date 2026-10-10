package com.tencent.ugc;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UGCFrameQueue<T> {
    private final Deque<T> mDeque = new LinkedList();
    private UGCFrameQueueListener mListener;

    public interface UGCFrameQueueListener {
        void onFrameDequeued();
    }

    public T dequeue(long j11) {
        T tPollFirst;
        synchronized (this.mDeque) {
            try {
                try {
                    if (this.mDeque.isEmpty()) {
                        this.mDeque.wait(j11);
                    }
                    tPollFirst = this.mDeque.pollFirst();
                } catch (InterruptedException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (tPollFirst != null) {
            notifyFrameBeenDequeued();
        }
        return tPollFirst;
    }

    public void setUGCFrameQueueListener(UGCFrameQueueListener uGCFrameQueueListener) {
        synchronized (this) {
            this.mListener = uGCFrameQueueListener;
        }
    }

    private void notifyFrameBeenDequeued() {
        UGCFrameQueueListener uGCFrameQueueListener = this.mListener;
        if (uGCFrameQueueListener != null) {
            uGCFrameQueueListener.onFrameDequeued();
        }
    }

    public void clear() {
        synchronized (this.mDeque) {
            this.mDeque.clear();
        }
    }

    public List<T> dequeueAll() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.mDeque) {
            while (!this.mDeque.isEmpty()) {
                try {
                    linkedList.add(this.mDeque.pollFirst());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return linkedList;
    }

    public T peek() {
        T tPeekFirst;
        synchronized (this.mDeque) {
            tPeekFirst = this.mDeque.peekFirst();
        }
        return tPeekFirst;
    }

    public void queue(T t11) {
        synchronized (this.mDeque) {
            this.mDeque.addLast(t11);
            this.mDeque.notify();
        }
    }

    public int size() {
        int size;
        synchronized (this.mDeque) {
            size = this.mDeque.size();
        }
        return size;
    }

    public T dequeue() {
        return dequeue(0L);
    }
}
