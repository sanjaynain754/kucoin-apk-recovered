package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.ConsumerChainTimestamp;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.k */
/* JADX INFO: loaded from: classes59.dex */
public final class C34892k extends AbstractC34889h<b> {

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.k$a */
    public static class a extends PixelFrame {

        /* JADX INFO: renamed from: b */
        private static final InterfaceC34888g<a> f74278b = C34893l.m76553a();

        /* JADX INFO: renamed from: a */
        private final b f74279a;

        public /* synthetic */ a(b bVar, Object obj, byte b11) {
            this(bVar, obj);
        }

        private a(b bVar, Object obj) {
            super(f74278b);
            bVar.retain();
            this.mWidth = bVar.f74282c;
            this.mHeight = bVar.f74283d;
            this.f74279a = bVar;
            this.mTextureId = bVar.f74280a;
            this.mGLContext = obj;
            int i11 = bVar.f74281b;
            if (i11 == 3553) {
                this.mPixelBufferType = GLConstants.EnumC34866a.TEXTURE_2D;
            } else if (i11 == 36197) {
                this.mPixelBufferType = GLConstants.EnumC34866a.TEXTURE_OES;
            }
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
        }

        @Override // com.tencent.liteav.videobase.frame.PixelFrame
        public final void setTextureId(int i11) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.k$b */
    public static class b extends AbstractC34885d {

        /* JADX INFO: renamed from: a */
        public int f74280a;

        /* JADX INFO: renamed from: b */
        public int f74281b;

        /* JADX INFO: renamed from: c */
        public int f74282c;

        /* JADX INFO: renamed from: d */
        public int f74283d;

        /* JADX INFO: renamed from: e */
        private FrameMetaData f74284e;

        /* JADX INFO: renamed from: f */
        private ProducerChainTimestamp f74285f;

        /* JADX INFO: renamed from: g */
        private ConsumerChainTimestamp f74286g;

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: a */
        public final int mo76526a() {
            return this.f74280a;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: e */
        public final void mo76531e() {
            this.f74280a = -1;
            this.f74281b = 3553;
            this.f74282c = 0;
            this.f74283d = 0;
            this.f74284e = null;
            this.f74286g = null;
            this.f74285f = null;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: a */
        public final PixelFrame mo76527a(Object obj) {
            a aVar = new a(this, obj, (byte) 0);
            aVar.retain();
            return aVar;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: b */
        public final int mo76528b() {
            return this.f74282c;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: c */
        public final int mo76529c() {
            return this.f74283d;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: d */
        public final FrameMetaData mo76530d() {
            return this.f74284e;
        }

        public b(InterfaceC34888g<? extends AbstractC34885d> interfaceC34888g) {
            super(interfaceC34888g);
            this.f74280a = -1;
            this.f74281b = 3553;
            this.f74282c = 0;
            this.f74283d = 0;
        }
    }

    @Override // com.tencent.liteav.videobase.frame.AbstractC34889h
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC34891j mo76536a(InterfaceC34888g interfaceC34888g) {
        return new b(interfaceC34888g);
    }
}
