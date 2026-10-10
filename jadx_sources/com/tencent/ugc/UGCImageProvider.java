package com.tencent.ugc;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class UGCImageProvider implements UGCFrameQueue.UGCFrameQueueListener, UGCPixelFrameProvider {
    private static final int MAX_FRAME_SIZE = 5;
    private static final String TAG = "UGCImageProvider";
    private final List<Bitmap> mBitmapList;
    private FutureTask<Long> mDurationFuture;
    private long mDurationMs;
    private EGLCore mEGLCore;
    private final int mFps;
    private final int mFrameIntervalMs;
    private final UGCFrameQueue<List<PixelFrame>> mFrameQueue;
    private final Map<Bitmap, GLTexture> mGLTextureMap;
    private GLTexturePool mGLTexturePool;
    private int mTotalFrameCount;
    private CustomHandler mWorkHandler;
    private final C34692b mThrottlers = new C34692b();
    private int mCurrentFrameCount = 0;
    private long mStayDurationMs = 1000;
    private long mMotionDurationMs = 500;
    private int mTransitionType = 1;

    private PixelFrame loadBitmapToPixelFrame(Bitmap bitmap, long j11) {
        GLTexture gLTextureObtain;
        try {
            EGLCore eGLCore = this.mEGLCore;
            if (eGLCore != null) {
                eGLCore.makeCurrent();
            }
        } catch (Exception e11) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("make_current_fail"), TAG, "loadBitmapToPixelFrame makeCurrent fail".concat(String.valueOf(e11)), new Object[0]);
        }
        if (this.mGLTextureMap.containsKey(bitmap)) {
            gLTextureObtain = this.mGLTextureMap.get(bitmap);
        } else {
            gLTextureObtain = this.mGLTexturePool.obtain(bitmap.getWidth(), bitmap.getHeight());
            gLTextureObtain.setColorFormat(GLConstants.ColorRange.VIDEO_RANGE, GLConstants.ColorSpace.BT601);
            OpenGlUtils.loadTexture(bitmap, gLTextureObtain.getId(), false);
            this.mGLTextureMap.put(bitmap, gLTextureObtain);
        }
        if (gLTextureObtain == null) {
            return null;
        }
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(GlobalContextManager.getInstance().getGLContext());
        pixelFrameWrap.setTimestamp(j11);
        return pixelFrameWrap;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void start() {
        Log.m76034i(TAG, "Start", new Object[0]);
        runOnWorkThread(RunnableC35615dk.m79111a(this));
    }

    private int clamp(int i11, int i12, int i13) {
        if (i11 < i12) {
            return i12;
        }
        return i11 > i13 ? i13 : i11;
    }

    private void clearGLTextureCache() {
        for (GLTexture gLTexture : this.mGLTextureMap.values()) {
            if (gLTexture != null) {
                gLTexture.release();
            }
        }
        this.mGLTextureMap.clear();
    }

    private void clearPixelFrameQueue() {
        for (List<PixelFrame> list : this.mFrameQueue.dequeueAll()) {
            if (list != null) {
                Iterator<PixelFrame> it = list.iterator();
                while (it.hasNext()) {
                    it.next().release();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decodeBitmapFrame() {
        if (this.mEGLCore == null || this.mFrameQueue.size() > 5) {
            return;
        }
        if (this.mCurrentFrameCount >= this.mTotalFrameCount) {
            this.mFrameQueue.queue(UGCPixelFrameProvider.END_OF_STREAM);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = this.mCurrentFrameCount;
        long j11 = ((long) i11) * ((long) this.mFrameIntervalMs);
        this.mCurrentFrameCount = i11 + 1;
        int iClamp = clamp((int) (j11 / (this.mStayDurationMs + this.mMotionDurationMs)), 0, this.mBitmapList.size() - 1);
        arrayList.add(loadBitmapToPixelFrame(this.mBitmapList.get(iClamp), j11));
        arrayList.add(loadBitmapToPixelFrame(this.mBitmapList.get(clamp(iClamp + 1, 0, this.mBitmapList.size() - 1)), j11));
        this.mFrameQueue.queue(arrayList);
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            customHandler.removeCallbacks(RunnableC35620dp.m79116a(this));
            customHandler.post(RunnableC35621dq.m79117a(this));
        }
    }

    private void initializeGLComponents() {
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(GlobalContextManager.getInstance().getGLContext(), null, 128, 128);
            this.mEGLCore.makeCurrent();
            this.mGLTexturePool = new GLTexturePool();
        } catch (EGLException e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("initGL"), TAG, "create EGLCore failed.", e11);
            this.mEGLCore = null;
        }
    }

    public static /* synthetic */ void lambda$initialize$0(UGCImageProvider uGCImageProvider) {
        uGCImageProvider.mFrameQueue.setUGCFrameQueueListener(uGCImageProvider);
        uGCImageProvider.initializeGLComponents();
    }

    public static /* synthetic */ void lambda$seekTo$4(UGCImageProvider uGCImageProvider, long j11) {
        uGCImageProvider.mCurrentFrameCount = (((int) (j11 - 1)) / uGCImageProvider.mFrameIntervalMs) + 1;
        uGCImageProvider.clearPixelFrameQueue();
        uGCImageProvider.runOnWorkThread(RunnableC35612dh.m79108a(uGCImageProvider));
    }

    public static /* synthetic */ void lambda$start$2(UGCImageProvider uGCImageProvider) {
        uGCImageProvider.setPictureTransitionInternal(uGCImageProvider.mTransitionType);
        uGCImageProvider.decodeBitmapFrame();
    }

    public static /* synthetic */ void lambda$stop$3(UGCImageProvider uGCImageProvider) {
        CustomHandler customHandler = uGCImageProvider.mWorkHandler;
        if (customHandler != null) {
            customHandler.removeCallbacks(RunnableC35613di.m79109a(uGCImageProvider));
        }
    }

    private boolean runOnWorkThread(Runnable runnable) {
        CustomHandler customHandler = this.mWorkHandler;
        if (customHandler != null) {
            return customHandler.runOrPost(runnable, 0);
        }
        return false;
    }

    private void setPictureTransitionInternal(int i11) {
        this.mTransitionType = i11;
        this.mStayDurationMs = UGCTransitionRules.getStayDurationMs(i11);
        this.mMotionDurationMs = UGCTransitionRules.getMotionDurationMs(i11);
        List<Bitmap> list = this.mBitmapList;
        if (list == null) {
            return;
        }
        if (i11 == 5 || i11 == 4) {
            this.mDurationMs = ((long) list.size()) * (this.mStayDurationMs + this.mMotionDurationMs);
        } else {
            long size = list.size();
            long j11 = this.mStayDurationMs;
            long j12 = this.mMotionDurationMs;
            this.mDurationMs = (size * (j11 + j12)) - j12;
        }
        this.mTotalFrameCount = (int) ((this.mDurationMs / 1000) * ((long) this.mFps));
    }

    private void uninitGLComponents() {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.makeCurrent();
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                gLTexturePool.evictAll();
                this.mGLTexturePool.destroy();
            }
        } catch (EGLException e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("uninitGL"), TAG, "EGLCore destroy failed.", e11);
        }
        this.mGLTexturePool = null;
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public long getDuration() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.mDurationFuture == null) {
            return 0L;
        }
        Long l11 = 0L;
        try {
            l11 = this.mDurationFuture.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            LiteavLog.m76093w(TAG, "getDuration future task exception: ".concat(String.valueOf(e11)));
        }
        return l11.longValue();
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
        return this.mFrameQueue;
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
        LiteavLog.m76087i(TAG, "initialize");
        synchronized (this) {
            try {
                if (this.mWorkHandler != null) {
                    LiteavLog.m76093w(TAG, "UGCPixelFrameProvider is initialized");
                    return;
                }
                HandlerThread handlerThread = new HandlerThread("ugc-image-frame-provider");
                handlerThread.start();
                this.mWorkHandler = new CustomHandler(handlerThread.getLooper());
                runOnWorkThread(RunnableC35611dg.m79107a(this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setPictureTransition(int i11) {
        LiteavLog.m76087i(TAG, "setPictureTransition type = ".concat(String.valueOf(i11)));
        FutureTask<Long> futureTask = new FutureTask<>(CallableC35618dn.m79114a(this, i11));
        this.mDurationFuture = futureTask;
        runOnWorkThread(futureTask);
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void stop() {
        LiteavLog.m76087i(TAG, InterfaceC33730j9.f70350a);
        runOnWorkThread(RunnableC35616dl.m79112a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void uninitialize() {
        LiteavLog.m76087i(TAG, "unInitialize");
        runOnWorkThread(RunnableC35614dj.m79110a(this));
    }

    public UGCImageProvider(List<Bitmap> list, int i11) {
        LiteavLog.m76087i(TAG, TAG);
        i11 = i11 <= 0 ? 20 : i11;
        this.mFps = i11;
        this.mFrameIntervalMs = 1000 / i11;
        this.mFrameQueue = new UGCFrameQueue<>();
        this.mGLTextureMap = new HashMap();
        this.mBitmapList = list;
    }

    public static /* synthetic */ Long lambda$setPictureTransition$5(UGCImageProvider uGCImageProvider, int i11) throws Exception {
        uGCImageProvider.setPictureTransitionInternal(i11);
        return Long.valueOf(uGCImageProvider.mDurationMs);
    }

    public static /* synthetic */ void lambda$uninitialize$1(UGCImageProvider uGCImageProvider) {
        uGCImageProvider.clearPixelFrameQueue();
        uGCImageProvider.clearGLTextureCache();
        uGCImageProvider.uninitGLComponents();
        uGCImageProvider.mFrameQueue.setUGCFrameQueueListener(null);
        CustomHandler customHandler = uGCImageProvider.mWorkHandler;
        if (customHandler != null) {
            customHandler.quitLooper();
            uGCImageProvider.mWorkHandler = null;
        }
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
        runOnWorkThread(RunnableC35619do.m79115a(this));
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j11, boolean z11) {
        runOnWorkThread(RunnableC35617dm.m79113a(this, j11));
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
