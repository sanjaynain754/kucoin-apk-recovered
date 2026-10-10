package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes2.dex */
public class TextureHolderPool extends LimitedFramePool<TextureHolder> {

    public static class TextureHolder extends GLTexture {
        private GLConstants.ColorRange mColorRange;
        private GLConstants.ColorSpace mColorSpace;
        private int mHeight;
        private FrameMetaData mMetaData;
        private int mTarget;
        private int mTextureId;
        private int mWidth;

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public void reset() {
            this.mTextureId = -1;
            this.mTarget = 3553;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mMetaData = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTarget() {
            return this.mTarget;
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

        public void updateTexture(int i11, int i12, int i13, int i14) {
            this.mTarget = i11;
            this.mTextureId = i12;
            this.mWidth = i13;
            this.mHeight = i14;
        }

        @Override // com.tencent.ugc.videobase.frame.GLTexture
        public PixelFrame wrap(Object obj) {
            C35822a c35822a = new C35822a(this, obj, (byte) 0);
            c35822a.setColorFormat(this.mColorRange, this.mColorSpace);
            c35822a.retain();
            return c35822a;
        }

        public TextureHolder(IRecycler<? extends GLTexture> iRecycler) {
            super(iRecycler);
            this.mTextureId = -1;
            this.mTarget = 3553;
            this.mWidth = 0;
            this.mHeight = 0;
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.TextureHolderPool$a */
    public static class C35822a extends PixelFrame {

        /* JADX INFO: renamed from: b */
        private static final IRecycler<C35822a> f77368b = C35825c.m79311a();

        /* JADX INFO: renamed from: a */
        private final TextureHolder f77369a;

        public /* synthetic */ C35822a(TextureHolder textureHolder, Object obj, byte b11) {
            this(textureHolder, obj);
        }

        private C35822a(TextureHolder textureHolder, Object obj) {
            super(f77368b);
            textureHolder.retain();
            this.mWidth = textureHolder.getWidth();
            this.mHeight = textureHolder.getHeight();
            this.f77369a = textureHolder;
            this.mTextureId = textureHolder.getId();
            this.mColorRange = textureHolder.mColorRange;
            this.mColorSpace = textureHolder.mColorSpace;
            this.mGLContext = obj;
            if (textureHolder.getTarget() == 3553) {
                this.mPixelBufferType = GLConstants.EnumC34866a.TEXTURE_2D;
            } else if (textureHolder.getTarget() == 36197) {
                this.mPixelBufferType = GLConstants.EnumC34866a.TEXTURE_OES;
            }
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setTextureId(int i11) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }
    }

    @Override // com.tencent.ugc.videobase.frame.LimitedFramePool
    public /* bridge */ /* synthetic */ RefCounted createInstance(IRecycler iRecycler) {
        return createInstance((IRecycler<TextureHolder>) iRecycler);
    }

    @Override // com.tencent.ugc.videobase.frame.LimitedFramePool
    public void destroyInstance(TextureHolder textureHolder) {
    }

    @Override // com.tencent.ugc.videobase.frame.LimitedFramePool
    public TextureHolder createInstance(IRecycler<TextureHolder> iRecycler) {
        return new TextureHolder(iRecycler);
    }

    public TextureHolderPool(int i11) {
        super(i11);
    }
}
