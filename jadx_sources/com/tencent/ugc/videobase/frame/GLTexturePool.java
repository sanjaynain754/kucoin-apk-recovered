package com.tencent.ugc.videobase.frame;

import android.opengl.EGL14;
import com.tencent.liteav.base.util.C34744i;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class GLTexturePool extends FramePool<GLTexture> {
    private static final AtomicInteger sTextureCount = new AtomicInteger();

    public static class PooledGLTexture extends GLTexture {
        private static final String TAG = "GLTexture";
        private GLConstants.ColorRange mColorRange;
        private GLConstants.ColorSpace mColorSpace;
        private final int mHeight;
        private FrameMetaData mMetaData;
        private int mTextureId;
        private final int mWidth;

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public void reset() {
            this.mMetaData = null;
        }

        private PooledGLTexture(IRecycler<GLTexture> iRecycler, int i11, int i12) {
            super(iRecycler);
            this.mTextureId = -1;
            this.mWidth = i11;
            this.mHeight = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initialize() {
            this.mTextureId = OpenGlUtils.createTexture(this.mWidth, this.mHeight, 6408, 6408);
            GLTexturePool.sTextureCount.incrementAndGet();
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public GLConstants.ColorRange getColorRange() {
            return this.mColorRange;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public GLConstants.ColorSpace getColorSpace() {
            return this.mColorSpace;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public int getHeight() {
            return this.mHeight;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public int getId() {
            return this.mTextureId;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public FrameMetaData getMetaData() {
            return this.mMetaData;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public int getWidth() {
            return this.mWidth;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
            this.mColorRange = colorRange;
            this.mColorSpace = colorSpace;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public void setMetaData(FrameMetaData frameMetaData) {
            this.mMetaData = frameMetaData;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public PixelFrame wrap(Object obj) {
            TextureFrame textureFrame = new TextureFrame(this, obj);
            textureFrame.setColorFormat(this.mColorRange, this.mColorSpace);
            textureFrame.retain();
            return textureFrame;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void uninitialize() {
            C34744i.m76117a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT);
            OpenGlUtils.deleteTexture(this.mTextureId);
            this.mTextureId = -1;
            GLTexturePool.sTextureCount.getAndDecrement();
        }

        @Override // com.tencent.ugc.videobase.frame.RefCounted
        public void release() {
            super.release();
        }
    }

    public static class TextureFrame extends PixelFrame {
        private static final IRecycler<TextureFrame> RECYCLER = C35824b.m79310a();
        private final GLTexture mTexture;

        private TextureFrame(GLTexture gLTexture, Object obj) {
            super(RECYCLER);
            gLTexture.retain();
            this.mWidth = gLTexture.getWidth();
            this.mHeight = gLTexture.getHeight();
            this.mTexture = gLTexture;
            this.mTextureId = gLTexture.getId();
            this.mGLContext = obj;
            this.mPixelBufferType = GLConstants.EnumC34866a.TEXTURE_2D;
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
            this.mMetaData = gLTexture.getMetaData();
            this.mColorRange = gLTexture.getColorRange();
            this.mColorSpace = gLTexture.getColorSpace();
        }

        public GLTexture getGLTexture() {
            return this.mTexture;
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public void setTextureId(int i11) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.GLTexturePool$a */
    public static class C35817a implements FramePool.Key {

        /* JADX INFO: renamed from: a */
        private final int f77360a;

        /* JADX INFO: renamed from: b */
        private final int f77361b;

        @Override // com.tencent.ugc.videobase.frame.FramePool.Key
        public final int hashCode() {
            return (this.f77360a * 37213) + this.f77361b;
        }

        public C35817a(int i11, int i12) {
            this.f77360a = i11;
            this.f77361b = i12;
        }

        @Override // com.tencent.ugc.videobase.frame.FramePool.Key
        public final boolean equals(Object obj) {
            if (obj.getClass() != C35817a.class) {
                return false;
            }
            C35817a c35817a = (C35817a) obj;
            if (this.f77360a != c35817a.f77360a || this.f77361b != c35817a.f77361b) {
                return false;
            }
            return true;
        }
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public /* bridge */ /* synthetic */ RefCounted createInstance(IRecycler iRecycler, FramePool.Key key) {
        return createInstance((IRecycler<GLTexture>) iRecycler, key);
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public GLTexture createInstance(IRecycler<GLTexture> iRecycler, FramePool.Key key) {
        C35817a c35817a = (C35817a) key;
        PooledGLTexture pooledGLTexture = new PooledGLTexture(iRecycler, c35817a.f77360a, c35817a.f77361b);
        pooledGLTexture.initialize();
        return pooledGLTexture;
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public void destroyInstance(GLTexture gLTexture) {
        ((PooledGLTexture) gLTexture).uninitialize();
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public FramePool.Key keyForObject(GLTexture gLTexture) {
        return new C35817a(gLTexture.getWidth(), gLTexture.getHeight());
    }

    public GLTexture obtain(int i11, int i12) {
        GLTexture gLTexture = (GLTexture) super.obtain(new C35817a(i11, i12));
        gLTexture.reset();
        return gLTexture;
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public void destroy() {
        super.destroy();
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public void evictAll() {
        super.evictAll();
    }
}
