package com.tencent.ugc.beauty.gpufilters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.beauty.decoder.VideoFrameReader;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUGreenScreenFilter extends TXCGPUImageFilter {
    private static final String TAG = "TXCGPUGreenScreenFilter";
    private TXCGPUColorScreenFilter mColorScreenFilter;
    private final Context mContext;
    private String mGreenScreenFile;
    private boolean mMirrorX;
    private PixelFrameRenderer mPixelFrameRenderer;
    private GLConstants.GLScaleType mScaleType;
    private VideoFrameReader mVideoFrameReader;
    private final PixelFrame mPixelFrame = new PixelFrame();
    private boolean mLoopVideo = false;
    private GreenScreenFilterEventListener mEventListener = null;
    private VideoFrameReader.VideoFrameReaderListener mVideoFrameReaderListener = new C355261();

    /* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.TXCGPUGreenScreenFilter$1 */
    public class C355261 implements VideoFrameReader.VideoFrameReaderListener {
        public C355261() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m79026a(C355261 c355261) {
            if (TXCGPUGreenScreenFilter.this.mVideoFrameReader != null) {
                TXCGPUGreenScreenFilter.this.mPixelFrame.setTextureId(-1);
                TXCGPUGreenScreenFilter.this.destroyPlayer();
            }
        }

        @Override // com.tencent.ugc.beauty.decoder.VideoFrameReader.VideoFrameReaderListener
        public final void onFrameAvailable(PixelFrame pixelFrame) {
            if (TXCGPUGreenScreenFilter.this.mPixelFrame.getMatrix() == null) {
                TXCGPUGreenScreenFilter.this.mPixelFrame.setMatrix(new float[16]);
            }
            TXCGPUGreenScreenFilter.this.mPixelFrame.setPixelBufferType(pixelFrame.getPixelBufferType());
            TXCGPUGreenScreenFilter.this.mPixelFrame.setPixelFormatType(pixelFrame.getPixelFormatType());
            System.arraycopy(pixelFrame.getMatrix(), 0, TXCGPUGreenScreenFilter.this.mPixelFrame.getMatrix(), 0, pixelFrame.getMatrix().length);
            TXCGPUGreenScreenFilter.this.mPixelFrame.setTimestamp(pixelFrame.getTimestamp());
            TXCGPUGreenScreenFilter.this.mPixelFrame.setTextureId(pixelFrame.getTextureId());
            TXCGPUGreenScreenFilter.this.mPixelFrame.setWidth(pixelFrame.getWidth());
            TXCGPUGreenScreenFilter.this.mPixelFrame.setHeight(pixelFrame.getHeight());
        }

        @Override // com.tencent.ugc.beauty.decoder.VideoFrameReader.VideoFrameReaderListener
        public final void onReadFinished() {
            TXCGPUGreenScreenFilter.this.runOnDrawAndWaitDone(RunnableC35529c.m79029a(this));
        }
    }

    public interface GreenScreenFilterEventListener {
        void onLoadFailed();
    }

    private void deleteTextureInPixelFrame() {
        if (this.mPixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_2D) {
            OpenGlUtils.deleteTexture(this.mPixelFrame.getTextureId());
            this.mPixelFrame.setTextureId(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyPlayer() {
        VideoFrameReader videoFrameReader = this.mVideoFrameReader;
        if (videoFrameReader != null) {
            videoFrameReader.setVideoFrameReadListener(null);
            this.mVideoFrameReader.stop();
            this.mVideoFrameReader = null;
        }
    }

    private boolean initializeVideoPlayer() {
        VideoFrameReader videoFrameReader = new VideoFrameReader(this.mContext, OpenGlUtils.getCurrentContext(), this.mGreenScreenFile, this.mLoopVideo);
        this.mVideoFrameReader = videoFrameReader;
        videoFrameReader.setVideoFrameReadListener(this.mVideoFrameReaderListener);
        boolean zStart = this.mVideoFrameReader.start();
        if (zStart) {
            this.mPixelFrame.setWidth(-1);
            this.mPixelFrame.setHeight(-1);
            this.mPixelFrame.setPixelBufferType(GLConstants.EnumC34866a.TEXTURE_OES);
            this.mPixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
            this.mPixelFrame.setTextureId(-1);
        }
        return zStart;
    }

    public static /* synthetic */ void lambda$setGreenScreenFile$0(TXCGPUGreenScreenFilter tXCGPUGreenScreenFilter, String str, boolean z11) throws Throwable {
        tXCGPUGreenScreenFilter.mGreenScreenFile = str;
        tXCGPUGreenScreenFilter.mLoopVideo = z11;
        tXCGPUGreenScreenFilter.loadGreenScreenFile();
    }

    private void loadGreenScreenFile() throws Throwable {
        boolean zLoadPictureToTexture;
        String str;
        String str2 = this.mGreenScreenFile;
        if (str2 == null || str2.isEmpty()) {
            LiteavLog.m76083e(TAG, "green file is empty!");
            return;
        }
        String fileExtension = CommonUtil.getFileExtension(this.mGreenScreenFile);
        boolean z11 = true;
        if (fileExtension == null) {
            destroyPlayer();
        } else {
            String lowerCase = fileExtension.toLowerCase();
            if ("jpg".equals(lowerCase) || "png".equals(lowerCase) || "bmp".equals(lowerCase)) {
                destroyPlayer();
                deleteTextureInPixelFrame();
                zLoadPictureToTexture = loadPictureToTexture(this.mGreenScreenFile);
            } else if ("mp4".equals(lowerCase)) {
                destroyPlayer();
                deleteTextureInPixelFrame();
                zLoadPictureToTexture = initializeVideoPlayer();
            } else {
                z11 = false;
            }
            z11 = true ^ zLoadPictureToTexture;
        }
        if (!z11 || (str = this.mGreenScreenFile) == null || str.isEmpty()) {
            return;
        }
        GreenScreenFilterEventListener greenScreenFilterEventListener = this.mEventListener;
        if (greenScreenFilterEventListener != null) {
            greenScreenFilterEventListener.onLoadFailed();
        }
        LiteavLog.m76085e(TAG, "Load GreenScreenFile: %s fail, and report EVENT_GREENFILE_DECODE_FAILED", this.mGreenScreenFile);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0020 A[EXC_TOP_SPLITTER, PHI: r0 r6
      0x0020: PHI (r0v7 android.graphics.Bitmap) = (r0v2 android.graphics.Bitmap), (r0v10 android.graphics.Bitmap) binds: [B:20:0x0035, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0020: PHI (r6v7 java.io.InputStream) = (r6v6 java.io.InputStream), (r6v9 java.io.InputStream) binds: [B:20:0x0035, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private boolean loadPictureToTexture(String str) throws Throwable {
        Throwable th2;
        InputStream inputStreamOpen;
        Bitmap bitmapDecodeFile;
        if (str.startsWith("/")) {
            bitmapDecodeFile = BitmapFactory.decodeFile(str);
        } else {
            Bitmap bitmapDecodeStream = null;
            try {
                inputStreamOpen = this.mContext.getAssets().open(str);
                try {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException e11) {
                        e = e11;
                        LiteavLog.m76084e(TAG, "open file failed.", e);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                e = e12;
                inputStreamOpen = null;
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamOpen = null;
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                throw th2;
            }
            bitmapDecodeFile = bitmapDecodeStream;
        }
        if (bitmapDecodeFile == null) {
            return false;
        }
        this.mPixelFrame.setWidth(bitmapDecodeFile.getWidth());
        this.mPixelFrame.setHeight(bitmapDecodeFile.getHeight());
        this.mPixelFrame.setPixelBufferType(GLConstants.EnumC34866a.TEXTURE_2D);
        this.mPixelFrame.setTextureId(OpenGlUtils.loadTexture(bitmapDecodeFile, -1, true));
        this.mPixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        LiteavLog.m76088i(TAG, "picture set GreenFile %dx%d", Integer.valueOf(this.mPixelFrame.getWidth()), Integer.valueOf(this.mPixelFrame.getHeight()));
        return true;
    }

    public void setEventListener(GreenScreenFilterEventListener greenScreenFilterEventListener) {
        this.mEventListener = greenScreenFilterEventListener;
    }

    public void setGreenScreenParam(GLConstants.GLScaleType gLScaleType, boolean z11) {
        this.mScaleType = gLScaleType;
        this.mMirrorX = z11;
    }

    public TXCGPUGreenScreenFilter(Context context) {
        this.mContext = context;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i11, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int id2;
        if (!isInitialized()) {
            return;
        }
        runPendingOnDrawTasks();
        if (this.mPixelFrame.getTextureId() == -1) {
            super.onDraw(i11, gLTexture, floatBuffer, floatBuffer2);
            return;
        }
        GLTexturePool gLTexturePool = this.mTexturePool;
        Size size = this.mOutputSize;
        GLTexture gLTextureObtain = gLTexturePool.obtain(size.width, size.height);
        if (this.mPixelFrameRenderer == null) {
            Size size2 = this.mOutputSize;
            this.mPixelFrameRenderer = new PixelFrameRenderer(size2.width, size2.height);
        }
        if (!this.mPixelFrame.hasTransformParams() && this.mPixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_2D && this.mPixelFrame.getPixelFormatType() == GLConstants.PixelFormatType.RGBA) {
            id2 = this.mPixelFrame.getTextureId();
        } else {
            this.mPixelFrameRenderer.renderFrame(this.mPixelFrame, this.mScaleType, gLTextureObtain);
            id2 = gLTextureObtain.getId();
        }
        this.mColorScreenFilter.setScreenMirrorX(this.mMirrorX);
        this.mColorScreenFilter.setSecondInputTexture(i11);
        this.mColorScreenFilter.setThirdInputTexture(id2);
        this.mColorScreenFilter.onDraw(i11, gLTexture, floatBuffer, floatBuffer2);
        gLTextureObtain.release();
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        TXCGPUColorScreenFilter tXCGPUColorScreenFilter = new TXCGPUColorScreenFilter();
        this.mColorScreenFilter = tXCGPUColorScreenFilter;
        tXCGPUColorScreenFilter.initialize(gLTexturePool);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        super.onOutputSizeChanged(i11, i12);
        this.mColorScreenFilter.onOutputSizeChanged(i11, i12);
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRenderer = null;
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        destroyPlayer();
        TXCGPUColorScreenFilter tXCGPUColorScreenFilter = this.mColorScreenFilter;
        if (tXCGPUColorScreenFilter != null) {
            tXCGPUColorScreenFilter.uninitialize();
            this.mColorScreenFilter = null;
        }
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRenderer = null;
        }
        super.onUninit();
    }

    public void setGreenScreenFile(String str, boolean z11) {
        runOnDraw(RunnableC35528b.m79028a(this, str, z11));
    }
}
