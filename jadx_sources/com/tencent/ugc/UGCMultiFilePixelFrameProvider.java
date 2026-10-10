package com.tencent.ugc;

import android.os.Looper;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UGCMultiFilePixelFrameProvider implements UGCFrameQueue.UGCFrameQueueListener, UGCPixelFrameProvider {
    private static final String TAG = "UGCMultiFileVideoFrameProvider";
    private final List<Clip> mClipList;
    private final TXVideoJoiner.DurationControlMode mDurationControlMode;
    private UGCPixelFrameProvider.UGCFilePixelFrameProviderListener mListener;
    private final UGCFrameQueue<List<PixelFrame>> mPixelFrameListQueue;
    private final PixelFrame[] mPixelFrameStash;
    private final UGCPixelFrameProvider[] mProviderList;
    private final CustomHandler mSingleFileProviderHandler;
    private final CustomHandler mWorkHandler;
    private long mCurrentTimestamp = 0;
    private long mFrameDuration = 0;
    final UGCPixelFrameProvider.UGCFilePixelFrameProviderListener mUGCFilePixelFrameProviderListener = new UGCPixelFrameProvider.UGCFilePixelFrameProviderListener() { // from class: com.tencent.ugc.UGCMultiFilePixelFrameProvider.1
        @Override // com.tencent.ugc.UGCPixelFrameProvider.UGCFilePixelFrameProviderListener
        public final void onDecodeFailed() {
            if (UGCMultiFilePixelFrameProvider.this.mListener != null) {
                UGCMultiFilePixelFrameProvider.this.mListener.onDecodeFailed();
                UGCMultiFilePixelFrameProvider.this.mListener = null;
            }
        }
    };

    private void clearFrameCache() {
        int i11 = 0;
        while (true) {
            PixelFrame[] pixelFrameArr = this.mPixelFrameStash;
            if (i11 >= pixelFrameArr.length) {
                return;
            }
            PixelFrame pixelFrame = pixelFrameArr[i11];
            if (pixelFrame != null) {
                pixelFrame.release();
                this.mPixelFrameStash[i11] = null;
            }
            i11++;
        }
    }

    public static /* synthetic */ void lambda$stop$1(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        int i11 = 0;
        while (true) {
            UGCPixelFrameProvider[] uGCPixelFrameProviderArr = uGCMultiFilePixelFrameProvider.mProviderList;
            if (i11 >= uGCPixelFrameProviderArr.length) {
                uGCMultiFilePixelFrameProvider.clearFrameCache();
                uGCMultiFilePixelFrameProvider.clearFrameQueue();
                return;
            }
            UGCPixelFrameProvider uGCPixelFrameProvider = uGCPixelFrameProviderArr[i11];
            if (uGCPixelFrameProvider != null) {
                uGCPixelFrameProvider.stop();
                uGCMultiFilePixelFrameProvider.mProviderList[i11].uninitialize();
            }
            uGCMultiFilePixelFrameProvider.mProviderList[i11] = null;
            i11++;
        }
    }

    private void readFrameToCache() {
        PixelFrame frameFromProvider;
        for (int i11 = 0; i11 < this.mProviderList.length; i11++) {
            PixelFrame pixelFrame = this.mPixelFrameStash[i11];
            if ((pixelFrame == null || this.mCurrentTimestamp - pixelFrame.getTimestamp() > this.mFrameDuration / 2) && (frameFromProvider = getFrameFromProvider(i11)) != null) {
                this.mPixelFrameStash[i11] = frameFromProvider;
                if (pixelFrame != null) {
                    pixelFrame.release();
                }
            }
        }
    }

    private void clearFrameQueue() {
        Iterator<List<PixelFrame>> it = this.mPixelFrameListQueue.dequeueAll().iterator();
        while (it.hasNext()) {
            PixelFrame.releasePixelFrames(it.next());
        }
    }

    private PixelFrame copyPixelFrame(PixelFrame pixelFrame) {
        if (!(pixelFrame instanceof GLTexturePool.TextureFrame)) {
            return null;
        }
        GLTexturePool.TextureFrame textureFrame = (GLTexturePool.TextureFrame) pixelFrame;
        return textureFrame.getGLTexture().wrap(textureFrame.getGLContext());
    }

    private PixelFrame getFrameFromProvider(int i11) {
        UGCPixelFrameProvider uGCPixelFrameProvider = this.mProviderList[i11];
        if (uGCPixelFrameProvider == null) {
            return null;
        }
        List<PixelFrame> listDequeue = uGCPixelFrameProvider.getFrameQueue().dequeue();
        if (listDequeue != UGCPixelFrameProvider.END_OF_STREAM) {
            return listDequeue.get(0);
        }
        uGCPixelFrameProvider.stop();
        uGCPixelFrameProvider.uninitialize();
        this.mProviderList[i11] = null;
        return null;
    }

    private boolean hasOneProviderMeetsEndOfStream() {
        for (UGCPixelFrameProvider uGCPixelFrameProvider : this.mProviderList) {
            if (uGCPixelFrameProvider == null) {
                return true;
            }
        }
        return false;
    }

    private boolean isAllProviderEndOfStream() {
        for (UGCPixelFrameProvider uGCPixelFrameProvider : this.mProviderList) {
            if (uGCPixelFrameProvider != null) {
                return false;
            }
        }
        return true;
    }

    private boolean isEndStream() {
        return this.mDurationControlMode == TXVideoJoiner.DurationControlMode.ALIGNS_TO_LONGEST ? isAllProviderEndOfStream() : hasOneProviderMeetsEndOfStream();
    }

    public static /* synthetic */ void lambda$seekTo$2(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider, long j11, boolean z11) {
        for (UGCPixelFrameProvider uGCPixelFrameProvider : uGCMultiFilePixelFrameProvider.mProviderList) {
            if (uGCPixelFrameProvider != null) {
                uGCPixelFrameProvider.seekTo(j11, z11);
            }
        }
        uGCMultiFilePixelFrameProvider.mCurrentTimestamp = j11;
        uGCMultiFilePixelFrameProvider.clearFrameCache();
        uGCMultiFilePixelFrameProvider.clearFrameQueue();
        uGCMultiFilePixelFrameProvider.readFrameToQueue();
    }

    public static /* synthetic */ void lambda$start$0(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        float f11 = -1.0f;
        for (int i11 = 0; i11 < uGCMultiFilePixelFrameProvider.mClipList.size(); i11++) {
            UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider = new UGCSingleFilePixelFrameProvider(uGCMultiFilePixelFrameProvider.mClipList.get(i11), uGCMultiFilePixelFrameProvider.mSingleFileProviderHandler, uGCMultiFilePixelFrameProvider.mUGCFilePixelFrameProviderListener);
            uGCSingleFilePixelFrameProvider.initialize();
            uGCSingleFilePixelFrameProvider.start();
            uGCMultiFilePixelFrameProvider.mProviderList[i11] = uGCSingleFilePixelFrameProvider;
            if (f11 < uGCMultiFilePixelFrameProvider.mClipList.get(i11).fps) {
                f11 = uGCMultiFilePixelFrameProvider.mClipList.get(i11).fps;
            }
        }
        uGCMultiFilePixelFrameProvider.mFrameDuration = (long) (f11 > 0.0f ? 1000.0f / f11 : 40.0f);
        uGCMultiFilePixelFrameProvider.readFrameToQueue();
    }

    private void putOneFrameToList(PixelFrame pixelFrame, List<PixelFrame> list) {
        if (pixelFrame == null) {
            return;
        }
        if (pixelFrame.getTimestamp() == this.mCurrentTimestamp) {
            list.add(pixelFrame);
            pixelFrame.retain();
            return;
        }
        PixelFrame pixelFrameCopyPixelFrame = copyPixelFrame(pixelFrame);
        if (pixelFrameCopyPixelFrame != null) {
            pixelFrameCopyPixelFrame.setTimestamp(this.mCurrentTimestamp);
            pixelFrame = pixelFrameCopyPixelFrame;
        } else {
            pixelFrame.retain();
        }
        list.add(pixelFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFrameToQueue() {
        if (this.mPixelFrameListQueue.size() > 1) {
            return;
        }
        this.mCurrentTimestamp += this.mFrameDuration;
        readFrameToCache();
        if (isEndStream()) {
            this.mPixelFrameListQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (PixelFrame pixelFrame : this.mPixelFrameStash) {
            putOneFrameToList(pixelFrame, linkedList);
        }
        if (linkedList.isEmpty()) {
            this.mPixelFrameListQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
        } else {
            this.mPixelFrameListQueue.queue(linkedList);
        }
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
        return this.mPixelFrameListQueue;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
        LiteavLog.m76087i(TAG, "initialize");
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
        this.mWorkHandler.runOrPost(RunnableC35675ff.m79169a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j11, boolean z11) {
        this.mWorkHandler.runOrPost(RunnableC35674fe.m79168a(this, j11, z11));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void start() {
        this.mWorkHandler.runOrPost(RunnableC35672fc.m79166a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void stop() {
        this.mWorkHandler.runOrPost(RunnableC35673fd.m79167a(this));
    }

    public UGCMultiFilePixelFrameProvider(List<Clip> list, TXVideoJoiner.DurationControlMode durationControlMode, CustomHandler customHandler, UGCPixelFrameProvider.UGCFilePixelFrameProviderListener uGCFilePixelFrameProviderListener) {
        UGCFrameQueue<List<PixelFrame>> uGCFrameQueue = new UGCFrameQueue<>();
        this.mPixelFrameListQueue = uGCFrameQueue;
        this.mProviderList = new UGCPixelFrameProvider[list.size()];
        this.mPixelFrameStash = new PixelFrame[list.size()];
        this.mClipList = list;
        this.mDurationControlMode = durationControlMode;
        this.mSingleFileProviderHandler = customHandler;
        this.mWorkHandler = new CustomHandler(Looper.myLooper());
        this.mListener = uGCFilePixelFrameProviderListener;
        uGCFrameQueue.setUGCFrameQueueListener(this);
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void uninitialize() {
        stop();
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setMaxBufferFrameCount(int i11) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setPlayEndPts(long j11) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setReverse(boolean z11) {
    }
}
