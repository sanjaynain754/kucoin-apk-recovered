package com.tencent.ugc.videobase.utils;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class RingFrameQueue implements PixelFrameQueue {
    private static final String TAG = "RingFrameQueue";
    private int mCapability;
    private final Deque<PixelFrame> mPixelFrameList = new LinkedList();

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public void evictAll() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mPixelFrameList);
            this.mPixelFrameList.clear();
        }
        LiteavLog.m76087i(TAG, "evictAll pixelFrame.");
        PixelFrame.releasePixelFrames(arrayList);
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public PixelFrame peek() {
        PixelFrame pixelFramePeek;
        synchronized (this) {
            pixelFramePeek = this.mPixelFrameList.peek();
        }
        return pixelFramePeek;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public PixelFrame poll() {
        PixelFrame pixelFramePollFirst;
        synchronized (this) {
            pixelFramePollFirst = this.mPixelFrameList.pollFirst();
        }
        return pixelFramePollFirst;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public boolean remove(PixelFrame pixelFrame) {
        boolean zRemoveFirstOccurrence;
        if (pixelFrame == null) {
            return false;
        }
        synchronized (this) {
            try {
                zRemoveFirstOccurrence = this.mPixelFrameList.size() > 0 ? this.mPixelFrameList.removeFirstOccurrence(pixelFrame) : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zRemoveFirstOccurrence) {
            pixelFrame.release();
        }
        return zRemoveFirstOccurrence;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public int size() {
        int size;
        synchronized (this) {
            size = this.mPixelFrameList.size();
        }
        return size;
    }

    public RingFrameQueue(int i11) {
        this.mCapability = i11;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public void push(PixelFrame pixelFrame) {
        PixelFrame pixelFrameRemoveFirst;
        pixelFrame.retain();
        synchronized (this) {
            try {
                if (this.mPixelFrameList.size() >= this.mCapability) {
                    pixelFrameRemoveFirst = this.mPixelFrameList.removeFirst();
                } else {
                    pixelFrameRemoveFirst = null;
                }
                this.mPixelFrameList.addLast(pixelFrame);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pixelFrameRemoveFirst != null) {
            pixelFrameRemoveFirst.release();
        }
    }
}
