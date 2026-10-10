package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class PixelFramePool extends FramePool<PixelFrame> {

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.PixelFramePool$a */
    public static class C35819a implements FramePool.Key {

        /* JADX INFO: renamed from: a */
        private final int f77363a;

        /* JADX INFO: renamed from: b */
        private final int f77364b;

        /* JADX INFO: renamed from: c */
        private final GLConstants.EnumC34866a f77365c;

        /* JADX INFO: renamed from: d */
        private final GLConstants.PixelFormatType f77366d;

        @Override // com.tencent.ugc.videobase.frame.FramePool.Key
        public final int hashCode() {
            return (((((this.f77363a * 10001) + this.f77364b) << 2) + this.f77365c.ordinal()) << 2) + this.f77366d.ordinal();
        }

        public C35819a(int i11, int i12, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType) {
            this.f77363a = i11;
            this.f77364b = i12;
            this.f77365c = enumC34866a;
            this.f77366d = pixelFormatType;
        }

        @Override // com.tencent.ugc.videobase.frame.FramePool.Key
        public final boolean equals(Object obj) {
            if (C35819a.class != obj.getClass()) {
                return false;
            }
            C35819a c35819a = (C35819a) obj;
            if (this.f77363a != c35819a.f77363a || this.f77364b != c35819a.f77364b || this.f77365c != c35819a.f77365c || this.f77366d != c35819a.f77366d) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.PixelFramePool$b */
    public static class C35820b extends PixelFrame {
        public /* synthetic */ C35820b(IRecycler iRecycler, int i11, int i12, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType, byte b11) {
            this(iRecycler, i11, i12, enumC34866a, pixelFormatType);
        }

        private C35820b(IRecycler<PixelFrame> iRecycler, int i11, int i12, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType) {
            super(iRecycler, i11, i12, enumC34866a, pixelFormatType);
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setBuffer(ByteBuffer byteBuffer) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setData(byte[] bArr) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Data");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setHeight(int i11) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its height");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setPixelBufferType(GLConstants.EnumC34866a enumC34866a) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its buffer type");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setPixelFormatType(GLConstants.PixelFormatType pixelFormatType) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its format type");
        }

        @Override // com.tencent.ugc.videobase.frame.PixelFrame
        public final void setWidth(int i11) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its width");
        }
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public /* bridge */ /* synthetic */ RefCounted createInstance(IRecycler iRecycler, FramePool.Key key) {
        return createInstance((IRecycler<PixelFrame>) iRecycler, key);
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public void destroyInstance(PixelFrame pixelFrame) {
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public PixelFrame createInstance(IRecycler<PixelFrame> iRecycler, FramePool.Key key) {
        C35819a c35819a = (C35819a) key;
        return new C35820b(iRecycler, c35819a.f77363a, c35819a.f77364b, c35819a.f77365c, c35819a.f77366d, (byte) 0);
    }

    @Override // com.tencent.ugc.videobase.frame.FramePool
    public FramePool.Key keyForObject(PixelFrame pixelFrame) {
        return new C35819a(pixelFrame.getWidth(), pixelFrame.getHeight(), pixelFrame.getPixelBufferType(), pixelFrame.getPixelFormatType());
    }

    public PixelFrame obtain(int i11, int i12, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType) {
        PixelFrame pixelFrame = (PixelFrame) super.obtain(new C35819a(i11, i12, enumC34866a, pixelFormatType));
        pixelFrame.reset();
        return pixelFrame;
    }
}
