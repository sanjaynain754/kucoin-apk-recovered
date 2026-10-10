package com.tencent.ugc.preprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.beauty.gpufilters.TXCGPUGaussianBlurFilter;
import com.tencent.ugc.beauty.gpufilters.TXCGPUGreenScreenFilter;
import com.tencent.ugc.beauty.gpufilters.TXCGPULookupFilterGroup;
import com.tencent.ugc.beauty.gpufilters.TXCGPUWatermarkFilter;
import com.tencent.ugc.videobase.chain.GPUInterceptor;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.DelayQueue;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.videobase.ConvertParams;
import com.tencent.ugc.videobase.videobase.FrameConverter;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GPUPreprocessor {
    private final Context mAppContext;
    private final BeautyProcessor mBeautyProcessor;
    private FrameConverter mBeforeWatermarkConverter;
    private Object mEGLContext;
    private EGLCore mEGLCore;
    private GLTexturePool mGLTexturePool;
    private PixelFrameRenderer mPixelFrameRenderer;
    private final String mTAG = "GPUPreprocessor_" + hashCode();
    private final TXCGPUImageFilter[] mGPUImageFilters = new TXCGPUImageFilter[EnumC35758b.values().length];
    private final DelayQueue mRunOnDrawQueue = new DelayQueue();
    private final TXCGPUImageFilterChain mGPUImageFilterChain = new TXCGPUImageFilterChain();
    private final C34692b mThrottlers = new C34692b();
    private int mProcessWidth = 128;
    private int mProcessHeight = 128;
    private final FrameConverter mAfterWatermarkConverter = new FrameConverter();
    private final List<C35759c> mNoNeedWatermarkListeners = new ArrayList();
    private final List<C35759c> mNeedWatermarkListeners = new ArrayList();
    private final FloatBuffer mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
    private final FloatBuffer mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);

    /* JADX INFO: renamed from: com.tencent.ugc.preprocessor.GPUPreprocessor$a */
    public static class C35757a extends GPUInterceptor {

        /* JADX INFO: renamed from: a */
        private final FrameConverter f77229a;

        @Override // com.tencent.ugc.videobase.chain.GPUInterceptor
        public final GLTexture intercept(long j11, GLTexture gLTexture) {
            FrameConverter frameConverter = this.f77229a;
            if (frameConverter != null) {
                frameConverter.processFrame(j11, gLTexture);
            }
            return gLTexture;
        }

        public C35757a(FrameConverter frameConverter) {
            this.f77229a = frameConverter;
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.preprocessor.GPUPreprocessor$b */
    public enum EnumC35758b {
        MOTION_BASE,
        GAUSSIAN_BLUR,
        LOOK_UP_FILTER,
        GREEN_SCREEN,
        WATERMARK
    }

    /* JADX INFO: renamed from: com.tencent.ugc.preprocessor.GPUPreprocessor$c */
    public class C35759c implements FrameConverter.FrameConvertListener {

        /* JADX INFO: renamed from: a */
        public int f77236a;

        /* JADX INFO: renamed from: b */
        public ConvertParams f77237b;

        /* JADX INFO: renamed from: c */
        public GLConstants.EnumC34866a f77238c;

        /* JADX INFO: renamed from: d */
        public GLConstants.PixelFormatType f77239d;

        /* JADX INFO: renamed from: e */
        public VideoPreprocessorListener f77240e;

        public C35759c(int i11, ConvertParams convertParams, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType, VideoPreprocessorListener videoPreprocessorListener) {
            this.f77236a = i11;
            this.f77237b = convertParams;
            this.f77239d = pixelFormatType;
            this.f77238c = enumC34866a;
            this.f77240e = videoPreprocessorListener;
        }

        @Override // com.tencent.ugc.videobase.videobase.FrameConverter.FrameConvertListener
        public final void onFrameConverted(int i11, PixelFrame pixelFrame) {
            if (this.f77240e == null || GPUPreprocessor.this.mEGLCore == null) {
                return;
            }
            this.f77240e.didProcessFrame(i11, pixelFrame);
            GPUPreprocessor.this.makeCurrent();
        }
    }

    public static /* synthetic */ void lambda$setGaussianBlurLevel$1(GPUPreprocessor gPUPreprocessor, float f11) {
        if (f11 < 0.0f) {
            gPUPreprocessor.disableFilter(EnumC35758b.GAUSSIAN_BLUR);
            return;
        }
        TXCGPUGaussianBlurFilter tXCGPUGaussianBlurFilter = (TXCGPUGaussianBlurFilter) gPUPreprocessor.enableFilter(EnumC35758b.GAUSSIAN_BLUR);
        if (tXCGPUGaussianBlurFilter != null) {
            tXCGPUGaussianBlurFilter.setBlurSize(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean makeCurrent() {
        try {
            EGLCore eGLCore = this.mEGLCore;
            if (eGLCore != null) {
                eGLCore.makeCurrent();
                return true;
            }
        } catch (EGLException e11) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("makeCurrent"), this.mTAG, "makeCurrent failed. ".concat(String.valueOf(e11)), new Object[0]);
        }
        return false;
    }

    private C35759c removeListenerFromList(int i11, VideoPreprocessorListener videoPreprocessorListener, List<C35759c> list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            C35759c c35759c = list.get(i12);
            if (c35759c.f77236a == i11 && c35759c.f77240e == videoPreprocessorListener) {
                list.remove(i12);
                return c35759c;
            }
        }
        return null;
    }

    public void processFrame(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        PixelFrame pixelFrameWrap;
        pixelFrame.getGLContext();
        setGLContext(pixelFrame.getGLContext());
        try {
            if (this.mEGLCore == null) {
                initializeGLComponents(pixelFrame.getGLContext());
            }
            this.mEGLCore.makeCurrent();
            this.mRunOnDrawQueue.rerun();
            if (this.mPixelFrameRenderer == null) {
                this.mPixelFrameRenderer = new PixelFrameRenderer(this.mProcessWidth, this.mProcessHeight);
            }
            OpenGlUtils.glViewport(0, 0, this.mProcessWidth, this.mProcessHeight);
            if (pixelFrame.getHeight() == this.mProcessHeight && pixelFrame.getWidth() == this.mProcessWidth && pixelFrame.getRotation() == EnumC34747l.NORMAL && !pixelFrame.isMirrorVertical() && !pixelFrame.isMirrorHorizontal() && pixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_2D) {
                pixelFrame.retain();
                pixelFrameWrap = pixelFrame;
            } else {
                GLTexture gLTextureObtain = this.mGLTexturePool.obtain(this.mProcessWidth, this.mProcessHeight);
                gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                this.mPixelFrameRenderer.renderFrame(pixelFrame, gLScaleType, gLTextureObtain);
                pixelFrameWrap = gLTextureObtain.wrap(this.mEGLCore.getEglContext());
                gLTextureObtain.release();
            }
            this.mGPUImageFilterChain.setTimestamp(pixelFrame.getTimestamp());
            GLTexture gLTextureObtain2 = this.mGLTexturePool.obtain(this.mProcessWidth, this.mProcessHeight);
            gLTextureObtain2.setColorFormat(pixelFrameWrap.getColorRange(), pixelFrameWrap.getColorSpace());
            gLTextureObtain2.setMetaData(pixelFrame.getMetaData());
            this.mGPUImageFilterChain.setColorFormat(gLTextureObtain2.getColorRange(), gLTextureObtain2.getColorSpace());
            this.mGPUImageFilterChain.onDraw(pixelFrameWrap.getTextureId(), gLTextureObtain2, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            pixelFrameWrap.release();
            gLTextureObtain2.release();
            while (true) {
                int iGlGetError = GLES20.glGetError();
                if (iGlGetError == 0) {
                    return;
                }
                LiteavLog.m76082e(this.mThrottlers.m76042a("processFrame"), this.mTAG, "GL error occurred when preprocess frame, error :" + GLUtils.getEGLErrorString(iGlGetError), new Object[0]);
            }
        } catch (EGLException e11) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("make"), this.mTAG, "initializeEGL failed. " + e11.getMessage(), new Object[0]);
            uninitializeGLComponents();
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.preprocessor.GPUPreprocessor$1 */
    public static /* synthetic */ class C357561 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77228a;

        static {
            int[] iArr = new int[EnumC35758b.values().length];
            f77228a = iArr;
            try {
                iArr[EnumC35758b.WATERMARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77228a[EnumC35758b.GAUSSIAN_BLUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77228a[EnumC35758b.LOOK_UP_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77228a[EnumC35758b.GREEN_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private TXCGPUImageFilter createFilter(EnumC35758b enumC35758b) {
        int i11 = C357561.f77228a[enumC35758b.ordinal()];
        if (i11 == 1) {
            return new TXCGPUWatermarkFilter();
        }
        if (i11 == 2) {
            return new TXCGPUGaussianBlurFilter(0.8f);
        }
        if (i11 == 3) {
            return new TXCGPULookupFilterGroup();
        }
        if (i11 == 4) {
            return new TXCGPUGreenScreenFilter(this.mAppContext);
        }
        throw new RuntimeException("unknown filter type");
    }

    private void disableFilter(EnumC35758b enumC35758b) {
        TXCGPUImageFilter tXCGPUImageFilter;
        if (this.mGPUImageFilters[enumC35758b.ordinal()] == null || (tXCGPUImageFilter = this.mGPUImageFilters[enumC35758b.ordinal()]) == null) {
            return;
        }
        this.mGPUImageFilters[enumC35758b.ordinal()] = null;
        tXCGPUImageFilter.uninitialize();
        updateFilterChain();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.tencent.ugc.videobase.chain.TXCGPUImageFilter] */
    private <T> T enableFilter(EnumC35758b enumC35758b) {
        if (this.mGPUImageFilters[enumC35758b.ordinal()] != null) {
            return (T) this.mGPUImageFilters[enumC35758b.ordinal()];
        }
        ?? r11 = (T) createFilter(enumC35758b);
        r11.initialize(this.mGLTexturePool);
        r11.onOutputSizeChanged(this.mProcessWidth, this.mProcessHeight);
        this.mGPUImageFilters[enumC35758b.ordinal()] = r11;
        updateFilterChain();
        return r11;
    }

    private <T> T getFilter(EnumC35758b enumC35758b) {
        return (T) this.mGPUImageFilters[enumC35758b.ordinal()];
    }

    private void initializeGLComponents(Object obj) throws EGLException {
        LiteavLog.m76086i(this.mThrottlers.m76042a("initGL"), this.mTAG, "initialize internal, eglContextFromPixelFrame: %s", obj);
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        eGLCore.initialize(obj, null, 128, 128);
        this.mEGLCore.makeCurrent();
        GLTexturePool gLTexturePool = new GLTexturePool();
        this.mGLTexturePool = gLTexturePool;
        this.mAfterWatermarkConverter.initialize(gLTexturePool);
        this.mBeautyProcessor.initialize(this.mGLTexturePool);
        updateFilterChain();
    }

    public static /* synthetic */ void lambda$setFilterGroupImages$3(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, Bitmap bitmap2, float f11, float f12, float f13) {
        if (bitmap == null && bitmap2 == null) {
            gPUPreprocessor.disableFilter(EnumC35758b.LOOK_UP_FILTER);
        } else {
            ((TXCGPULookupFilterGroup) gPUPreprocessor.enableFilter(EnumC35758b.LOOK_UP_FILTER)).setBitmap(f11, bitmap, f12, bitmap2, f13);
        }
    }

    public static /* synthetic */ void lambda$setFilterMixLevel$2(GPUPreprocessor gPUPreprocessor, float f11) {
        TXCGPULookupFilterGroup tXCGPULookupFilterGroup = (TXCGPULookupFilterGroup) gPUPreprocessor.getFilter(EnumC35758b.LOOK_UP_FILTER);
        if (tXCGPULookupFilterGroup != null) {
            tXCGPULookupFilterGroup.setIntensity(f11);
        }
    }

    public static /* synthetic */ void lambda$setWatermark$0(GPUPreprocessor gPUPreprocessor, Bitmap bitmap, float f11, float f12, float f13) {
        if (bitmap == null) {
            gPUPreprocessor.disableFilter(EnumC35758b.WATERMARK);
            return;
        }
        TXCGPUWatermarkFilter tXCGPUWatermarkFilter = (TXCGPUWatermarkFilter) gPUPreprocessor.enableFilter(EnumC35758b.WATERMARK);
        tXCGPUWatermarkFilter.enableWatermark(true);
        tXCGPUWatermarkFilter.setWatermark(bitmap, f11, f12, f13);
    }

    private void setGLContext(Object obj) {
        if (CommonUtil.equals(this.mEGLContext, obj)) {
            return;
        }
        this.mEGLContext = obj;
        uninitializeGLComponents();
        LiteavLog.m76088i(this.mTAG, "set unique eglcore: %s", obj);
    }

    private void updateFilterChain() {
        this.mGPUImageFilterChain.removeAllFilterAndInterceptor();
        this.mGPUImageFilterChain.uninitialize();
        registerListenersToRightConverter();
        for (EnumC35758b enumC35758b : EnumC35758b.values()) {
            if (enumC35758b == EnumC35758b.WATERMARK) {
                this.mGPUImageFilterChain.addInterceptor(new C35757a(this.mBeforeWatermarkConverter));
            }
            if (enumC35758b == EnumC35758b.MOTION_BASE) {
                this.mGPUImageFilterChain.addFilter(this.mBeautyProcessor);
            } else {
                this.mGPUImageFilterChain.addFilter(this.mGPUImageFilters[enumC35758b.ordinal()]);
            }
        }
        this.mGPUImageFilterChain.addInterceptor(new C35757a(this.mAfterWatermarkConverter));
        this.mGPUImageFilterChain.initialize(this.mGLTexturePool);
        this.mGPUImageFilterChain.onOutputSizeChanged(this.mProcessWidth, this.mProcessHeight);
    }

    public BeautyProcessor getBeautyProcessor() {
        return this.mBeautyProcessor;
    }

    public void registerVideoProcessedListener(int i11, ConvertParams convertParams, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType, boolean z11, VideoPreprocessorListener videoPreprocessorListener) {
        C35759c c35759c = new C35759c(i11, convertParams, enumC34866a, pixelFormatType, videoPreprocessorListener);
        if (z11) {
            addListenerToList(c35759c, this.mNeedWatermarkListeners);
        } else {
            addListenerToList(c35759c, this.mNoNeedWatermarkListeners);
        }
        registerListenersToRightConverter();
        LiteavLog.m76088i(this.mTAG, "register listener, identity:%d, bufferType:%s, formatType:%s, withWatermark:%b, listener:%s", Integer.valueOf(i11), enumC34866a, pixelFormatType, Boolean.valueOf(z11), videoPreprocessorListener);
    }

    public void setFilterGroupImages(float f11, Bitmap bitmap, float f12, Bitmap bitmap2, float f13) {
        this.mRunOnDrawQueue.add(RunnableC35767h.m79257a(this, bitmap, bitmap2, f11, f12, f13));
    }

    public void setFilterMixLevel(float f11) {
        this.mRunOnDrawQueue.add(RunnableC35766g.m79256a(this, f11));
    }

    public void setGaussianBlurLevel(float f11) {
        this.mRunOnDrawQueue.add(RunnableC35765f.m79255a(this, f11));
    }

    public void setProcessSize(int i11, int i12) {
        if (this.mProcessWidth == i11 && this.mProcessHeight == i12) {
            return;
        }
        this.mProcessWidth = i11;
        this.mProcessHeight = i12;
        LiteavLog.m76088i(this.mTAG, "process size update to %dx%d", Integer.valueOf(i11), Integer.valueOf(i12));
        if (makeCurrent()) {
            PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
            if (pixelFrameRenderer != null) {
                pixelFrameRenderer.uninitialize();
                this.mPixelFrameRenderer = null;
            }
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                gLTexturePool.evictAll();
            }
            this.mGPUImageFilterChain.onOutputSizeChanged(i11, i12);
        }
    }

    public void setWatermark(Bitmap bitmap, float f11, float f12, float f13) {
        LiteavLog.m76080d(this.mTAG, "setWatermark xOffsetRatio: %.2f, yOffsetRatio: %.2f, widthRatio: %.2f", Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13));
        this.mRunOnDrawQueue.add(RunnableC35764e.m79254a(this, bitmap, f11, f12, f13));
    }

    public void unregisterVideoProcessedListener(int i11, VideoPreprocessorListener videoPreprocessorListener) {
        C35759c c35759cRemoveListenerFromList = removeListenerFromList(i11, videoPreprocessorListener, this.mNoNeedWatermarkListeners);
        if (c35759cRemoveListenerFromList == null && (c35759cRemoveListenerFromList = removeListenerFromList(i11, videoPreprocessorListener, this.mNeedWatermarkListeners)) == null) {
            return;
        }
        this.mAfterWatermarkConverter.removeListener(i11, c35759cRemoveListenerFromList);
        FrameConverter frameConverter = this.mBeforeWatermarkConverter;
        if (frameConverter != null) {
            frameConverter.removeListener(i11, c35759cRemoveListenerFromList);
        }
        LiteavLog.m76088i(this.mTAG, "unregister listener: identity: %d, listener: %s", Integer.valueOf(i11), videoPreprocessorListener);
    }

    public GPUPreprocessor(Context context, BeautyProcessor beautyProcessor) {
        this.mAppContext = context.getApplicationContext();
        this.mBeautyProcessor = beautyProcessor;
    }

    private void addListenerToList(C35759c c35759c, List<C35759c> list) {
        for (C35759c c35759c2 : list) {
            if (c35759c2.f77236a == c35759c.f77236a && c35759c2.f77240e == c35759c.f77240e) {
                return;
            }
        }
        list.add(c35759c);
    }

    private void registerListenersToRightConverter() {
        if (makeCurrent()) {
            if (this.mGPUImageFilters[EnumC35758b.WATERMARK.ordinal()] != null) {
                if (this.mBeforeWatermarkConverter == null) {
                    FrameConverter frameConverter = new FrameConverter();
                    this.mBeforeWatermarkConverter = frameConverter;
                    frameConverter.initialize(this.mGLTexturePool);
                }
                for (C35759c c35759c : this.mNoNeedWatermarkListeners) {
                    this.mAfterWatermarkConverter.removeListener(c35759c.f77236a, c35759c);
                    this.mBeforeWatermarkConverter.addListener(c35759c.f77237b, c35759c.f77238c, c35759c.f77239d, c35759c.f77236a, c35759c);
                }
            } else {
                for (C35759c c35759c2 : this.mNoNeedWatermarkListeners) {
                    FrameConverter frameConverter2 = this.mBeforeWatermarkConverter;
                    if (frameConverter2 != null) {
                        frameConverter2.removeListener(c35759c2.f77236a, c35759c2);
                    }
                    this.mAfterWatermarkConverter.addListener(c35759c2.f77237b, c35759c2.f77238c, c35759c2.f77239d, c35759c2.f77236a, c35759c2);
                }
                FrameConverter frameConverter3 = this.mBeforeWatermarkConverter;
                if (frameConverter3 != null) {
                    frameConverter3.uninitialize();
                    this.mBeforeWatermarkConverter = null;
                }
            }
            for (C35759c c35759c3 : this.mNeedWatermarkListeners) {
                this.mAfterWatermarkConverter.addListener(c35759c3.f77237b, c35759c3.f77238c, c35759c3.f77239d, c35759c3.f77236a, c35759c3);
            }
        }
    }

    public void uninitialize() {
        uninitializeGLComponents();
        LiteavLog.m76087i(this.mTAG, "destroy gpu preprocessor");
    }

    public void uninitializeGLComponents() {
        if (!makeCurrent()) {
            return;
        }
        this.mAfterWatermarkConverter.uninitialize();
        FrameConverter frameConverter = this.mBeforeWatermarkConverter;
        if (frameConverter != null) {
            frameConverter.uninitialize();
            this.mBeforeWatermarkConverter = null;
        }
        this.mBeautyProcessor.uninitialize();
        GLTexturePool gLTexturePool = this.mGLTexturePool;
        if (gLTexturePool != null) {
            gLTexturePool.evictAll();
            this.mGLTexturePool.destroy();
            this.mGLTexturePool = null;
        }
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRenderer = null;
        }
        this.mGPUImageFilterChain.uninitialize();
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
        LiteavLog.m76086i(this.mThrottlers.m76042a("uninitGL"), this.mTAG, "uninitialize opengl components", new Object[0]);
    }
}
