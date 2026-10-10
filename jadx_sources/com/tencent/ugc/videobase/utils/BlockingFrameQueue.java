package com.tencent.ugc.videobase.utils;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.ArrayList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes2.dex */
public class BlockingFrameQueue implements PixelFrameQueue {
    private static final String TAG = "BlockingFrameQueue";
    private final BlockingDeque<PixelFrame> mPixelFrameList;

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        this.mPixelFrameList.drainTo(arrayList);
        PixelFrame.releasePixelFrames(arrayList);
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public PixelFrame peek() {
        return this.mPixelFrameList.peek();
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public PixelFrame poll() {
        return this.mPixelFrameList.poll();
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public boolean remove(PixelFrame pixelFrame) {
        if (!this.mPixelFrameList.removeFirstOccurrence(pixelFrame)) {
            return false;
        }
        pixelFrame.release();
        return true;
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public int size() {
        return this.mPixelFrameList.size();
    }

    public BlockingFrameQueue(int i11) {
        this.mPixelFrameList = new LinkedBlockingDeque(i11);
    }

    @Override // com.tencent.ugc.videobase.utils.PixelFrameQueue
    public void push(PixelFrame pixelFrame) {
        pixelFrame.retain();
        try {
            this.mPixelFrameList.put(pixelFrame);
        } catch (InterruptedException e11) {
            LiteavLog.m76084e(TAG, "push frame failed with exception", e11);
        }
    }
}
