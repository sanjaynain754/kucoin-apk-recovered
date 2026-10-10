package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.ConsumerChainTimestamp;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C34886e extends AbstractC34882a<AbstractC34885d> {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f74246a = new AtomicInteger();

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.e$a */
    public static class a extends AbstractC34885d {

        /* JADX INFO: renamed from: a */
        int f74247a;

        /* JADX INFO: renamed from: b */
        final int f74248b;

        /* JADX INFO: renamed from: c */
        final int f74249c;

        /* JADX INFO: renamed from: d */
        private FrameMetaData f74250d;

        /* JADX INFO: renamed from: e */
        private ProducerChainTimestamp f74251e;

        /* JADX INFO: renamed from: f */
        private ConsumerChainTimestamp f74252f;

        public /* synthetic */ a(InterfaceC34888g interfaceC34888g, int i11, int i12, byte b11) {
            this(interfaceC34888g, i11, i12);
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: a */
        public final int mo76526a() {
            return this.f74247a;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: e */
        public final void mo76531e() {
            this.f74250d = null;
            this.f74251e = null;
            this.f74252f = null;
        }

        private a(InterfaceC34888g<AbstractC34885d> interfaceC34888g, int i11, int i12) {
            super(interfaceC34888g);
            this.f74247a = -1;
            this.f74248b = i11;
            this.f74249c = i12;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: a */
        public final PixelFrame mo76527a(Object obj) {
            b bVar = new b(this, obj, (byte) 0);
            bVar.retain();
            return bVar;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: b */
        public final int mo76528b() {
            return this.f74248b;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: c */
        public final int mo76529c() {
            return this.f74249c;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34885d
        /* JADX INFO: renamed from: d */
        public final FrameMetaData mo76530d() {
            return this.f74250d;
        }

        @Override // com.tencent.liteav.videobase.frame.AbstractC34891j
        public final void release() {
            super.release();
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.e$b */
    public static class b extends PixelFrame {

        /* JADX INFO: renamed from: b */
        private static final InterfaceC34888g<b> f74253b = C34887f.m76534a();

        /* JADX INFO: renamed from: a */
        private final AbstractC34885d f74254a;

        public /* synthetic */ b(AbstractC34885d abstractC34885d, Object obj, byte b11) {
            this(abstractC34885d, obj);
        }

        private b(AbstractC34885d abstractC34885d, Object obj) {
            super(f74253b);
            abstractC34885d.retain();
            this.mWidth = abstractC34885d.mo76528b();
            this.mHeight = abstractC34885d.mo76529c();
            this.f74254a = abstractC34885d;
            this.mTextureId = abstractC34885d.mo76526a();
            this.mGLContext = obj;
            this.mPixelBufferType = GLConstants.EnumC34866a.TEXTURE_2D;
            this.mPixelFormatType = GLConstants.PixelFormatType.RGBA;
            this.mMetaData = abstractC34885d.mo76530d();
        }

        @Override // com.tencent.liteav.videobase.frame.PixelFrame
        public final void setTextureId(int i11) {
            throw new UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.e$c */
    public static class c implements AbstractC34882a.a {

        /* JADX INFO: renamed from: a */
        final int f74255a;

        /* JADX INFO: renamed from: b */
        final int f74256b;

        public final int hashCode() {
            return (this.f74255a * 37213) + this.f74256b;
        }

        public c(int i11, int i12) {
            this.f74255a = i11;
            this.f74256b = i12;
        }

        public final boolean equals(Object obj) {
            if (obj.getClass() != c.class) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f74255a != cVar.f74255a || this.f74256b != cVar.f74256b) {
                return false;
            }
            return true;
        }
    }

    @Override // com.tencent.liteav.videobase.frame.AbstractC34882a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo76517a(AbstractC34891j abstractC34891j) {
        a aVar = (a) ((AbstractC34885d) abstractC34891j);
        OpenGlUtils.deleteTexture(aVar.f74247a);
        aVar.f74247a = -1;
        f74246a.getAndDecrement();
    }

    @Override // com.tencent.liteav.videobase.frame.AbstractC34882a
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC34882a.a mo76518b(AbstractC34891j abstractC34891j) {
        AbstractC34885d abstractC34885d = (AbstractC34885d) abstractC34891j;
        return new c(abstractC34885d.mo76528b(), abstractC34885d.mo76529c());
    }

    @Override // com.tencent.liteav.videobase.frame.AbstractC34882a
    /* JADX INFO: renamed from: b */
    public final void mo76519b() {
        super.mo76519b();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC34885d m76532a(int i11, int i12) {
        AbstractC34885d abstractC34885d = (AbstractC34885d) super.m76514a(new c(i11, i12));
        abstractC34885d.mo76531e();
        return abstractC34885d;
    }

    @Override // com.tencent.liteav.videobase.frame.AbstractC34882a
    /* JADX INFO: renamed from: a */
    public final void mo76516a() {
        super.mo76516a();
    }

    @Override // com.tencent.liteav.videobase.frame.AbstractC34882a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC34891j mo76515a(InterfaceC34888g interfaceC34888g, AbstractC34882a.a aVar) {
        c cVar = (c) aVar;
        a aVar2 = new a(interfaceC34888g, cVar.f74255a, cVar.f74256b, (byte) 0);
        aVar2.f74247a = OpenGlUtils.createTexture(aVar2.f74248b, aVar2.f74249c, 6408, 6408);
        f74246a.incrementAndGet();
        return aVar2;
    }
}
