package com.tencent.liteav.videobase.frame;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.p135a.C34861a;
import com.tencent.liteav.videobase.p136b.C34862a;
import com.tencent.liteav.videobase.p136b.C34865d;
import com.tencent.liteav.videobase.p137c.AbstractC34872e;
import com.tencent.liteav.videobase.p137c.C34868a;
import com.tencent.liteav.videobase.p137c.C34870c;
import com.tencent.liteav.videobase.p137c.C34871d;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.i */
/* JADX INFO: loaded from: classes59.dex */
public final class C34890i {

    /* JADX INFO: renamed from: a */
    private static final float[] f74263a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: b */
    private static final float[] f74264b = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: c */
    private static final float[] f74265c = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: d */
    private static final float[] f74266d = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: e */
    private int f74267e;

    /* JADX INFO: renamed from: f */
    private int f74268f;

    /* JADX INFO: renamed from: g */
    private final FloatBuffer f74269g;

    /* JADX INFO: renamed from: h */
    private final FloatBuffer f74270h;

    /* JADX INFO: renamed from: j */
    private GLConstants.GLScaleType f74272j;

    /* JADX INFO: renamed from: n */
    private C34884c f74276n;

    /* JADX INFO: renamed from: i */
    private final C34861a[] f74271i = new C34861a[GLConstants.PixelFormatType.values().length];

    /* JADX INFO: renamed from: k */
    private PixelFrame f74273k = null;

    /* JADX INFO: renamed from: l */
    private C34862a f74274l = null;

    /* JADX INFO: renamed from: m */
    private C34861a f74275m = null;

    /* JADX INFO: renamed from: a */
    private static float m76537a(float f11) {
        return f11 == 0.0f ? 1.0f : 0.0f;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.i$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f74277a;

        static {
            int[] iArr = new int[EnumC34747l.values().length];
            f74277a = iArr;
            try {
                iArr[EnumC34747l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74277a[EnumC34747l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74277a[EnumC34747l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74277a[EnumC34747l.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static float m76538a(float f11, float f12) {
        return f11 == 0.0f ? f12 : 1.0f - f12;
    }

    /* JADX INFO: renamed from: b */
    private void m76546b() {
        PixelFrame pixelFrame = this.f74273k;
        if (pixelFrame == null) {
            return;
        }
        boolean z11 = pixelFrame.getRotation() == EnumC34747l.ROTATION_90 || this.f74273k.getRotation() == EnumC34747l.ROTATION_270;
        float width = this.f74273k.getWidth();
        float height = this.f74273k.getHeight();
        float fMax = Math.max((this.f74267e * 1.0f) / width, (this.f74268f * 1.0f) / height);
        float fRound = (Math.round(width * fMax) * 1.0f) / this.f74267e;
        float fRound2 = (Math.round(height * fMax) * 1.0f) / this.f74268f;
        float[] fArr = GLConstants.f74126d;
        float[] fArr2 = new float[8];
        if (this.f74273k.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_OES) {
            m76544a(fArr2, this.f74273k.getRotation(), this.f74273k.isMirrorHorizontal(), this.f74273k.isMirrorVertical());
        } else {
            OpenGlUtils.initTextureCoordsBuffer(fArr2, this.f74273k.getRotation(), this.f74273k.isMirrorHorizontal(), this.f74273k.isMirrorVertical());
        }
        GLConstants.GLScaleType gLScaleType = this.f74272j;
        if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
            float f11 = (1.0f - (z11 ? 1.0f / fRound2 : 1.0f / fRound)) / 2.0f;
            float f12 = (1.0f - (z11 ? 1.0f / fRound : 1.0f / fRound2)) / 2.0f;
            fArr2[0] = m76538a(fArr2[0], f11);
            fArr2[1] = m76538a(fArr2[1], f12);
            fArr2[2] = m76538a(fArr2[2], f11);
            fArr2[3] = m76538a(fArr2[3], f12);
            fArr2[4] = m76538a(fArr2[4], f11);
            fArr2[5] = m76538a(fArr2[5], f12);
            fArr2[6] = m76538a(fArr2[6], f11);
            fArr2[7] = m76538a(fArr2[7], f12);
        } else if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            fArr = new float[]{fArr[0] / fRound2, fArr[1] / fRound, fArr[2] / fRound2, fArr[3] / fRound, fArr[4] / fRound2, fArr[5] / fRound, fArr[6] / fRound2, fArr[7] / fRound};
        }
        this.f74269g.clear();
        this.f74269g.put(fArr).position(0);
        this.f74270h.clear();
        this.f74270h.put(fArr2).position(0);
    }

    /* JADX INFO: renamed from: c */
    private void m76547c() {
        if (this.f74275m != null) {
            return;
        }
        C34861a c34861a = new C34861a();
        this.f74275m = c34861a;
        c34861a.m76473a((C34886e) null);
    }

    /* JADX INFO: renamed from: d */
    private void m76548d() {
        C34862a c34862a = this.f74274l;
        if (c34862a != null) {
            c34862a.m76475b();
            this.f74274l = null;
        }
        C34861a c34861a = this.f74275m;
        if (c34861a != null) {
            c34861a.m76475b();
            this.f74275m = null;
        }
        C34884c c34884c = this.f74276n;
        if (c34884c != null) {
            c34884c.m76525d();
            this.f74276n = null;
        }
        int i11 = 0;
        while (true) {
            C34861a[] c34861aArr = this.f74271i;
            if (i11 >= c34861aArr.length) {
                LiteavLog.m76087i("PixelFrameRenderer", "uninitialize GL components");
                return;
            }
            C34861a c34861a2 = c34861aArr[i11];
            if (c34861a2 != null) {
                c34861a2.m76475b();
                this.f74271i[i11] = null;
            }
            i11++;
        }
    }

    public C34890i(int i11, int i12) {
        this.f74267e = i11;
        this.f74268f = i12;
        float[] fArr = GLConstants.f74126d;
        this.f74269g = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.f74270h = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m76551a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType, AbstractC34885d abstractC34885d) {
        if (pixelFrame != null && pixelFrame.isFrameDataValid()) {
            if (this.f74273k == null || m76545a(pixelFrame, gLScaleType)) {
                this.f74272j = gLScaleType;
                this.f74273k = new PixelFrame(pixelFrame);
                m76548d();
                m76546b();
            }
            if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
                m76540a(abstractC34885d);
            }
            if (this.f74273k.getPixelBufferType() == GLConstants.EnumC34866a.BYTE_BUFFER) {
                if (this.f74273k.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                    m76539a(this.f74273k.getPixelFormatType(), abstractC34885d, pixelFrame.getBuffer(), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                    return;
                } else {
                    m76543a(abstractC34885d, pixelFrame.getBuffer());
                    return;
                }
            }
            if (this.f74273k.getPixelBufferType() == GLConstants.EnumC34866a.BYTE_ARRAY) {
                if (this.f74273k.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                    m76539a(this.f74273k.getPixelFormatType(), abstractC34885d, ByteBuffer.wrap(pixelFrame.getData()), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                    return;
                } else {
                    m76543a(abstractC34885d, ByteBuffer.wrap(pixelFrame.getData()));
                    return;
                }
            }
            if (this.f74273k.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_OES) {
                m76542a(abstractC34885d, pixelFrame.getTextureId(), pixelFrame.getMatrix());
                return;
            } else {
                if (this.f74273k.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_2D) {
                    m76541a(abstractC34885d, pixelFrame.getTextureId());
                    return;
                }
                return;
            }
        }
        LiteavLog.m76093w("PixelFrameRenderer", "renderFrame: pixelFrame is not valid");
    }

    /* JADX INFO: renamed from: a */
    public final void m76550a(int i11, int i12) {
        if (this.f74267e == i11 && this.f74268f == i12) {
            return;
        }
        this.f74267e = i11;
        this.f74268f = i12;
        m76546b();
    }

    /* JADX INFO: renamed from: a */
    public final void m76549a() {
        this.f74273k = null;
        m76548d();
    }

    /* JADX INFO: renamed from: a */
    private boolean m76545a(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        return (gLScaleType == this.f74272j && pixelFrame.getWidth() == this.f74273k.getWidth() && pixelFrame.getHeight() == this.f74273k.getHeight() && pixelFrame.getPixelBufferType() == this.f74273k.getPixelBufferType() && pixelFrame.getPixelFormatType() == this.f74273k.getPixelFormatType() && pixelFrame.isMirrorHorizontal() == this.f74273k.isMirrorHorizontal() && pixelFrame.isMirrorVertical() == this.f74273k.isMirrorVertical() && pixelFrame.getRotation() == this.f74273k.getRotation()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private void m76543a(AbstractC34885d abstractC34885d, Buffer buffer) {
        int iOrdinal = GLConstants.PixelFormatType.RGBA.ordinal();
        C34861a[] c34861aArr = this.f74271i;
        if (c34861aArr[iOrdinal] == null) {
            c34861aArr[iOrdinal] = new C34865d();
            this.f74271i[iOrdinal].m76473a((C34886e) null);
        }
        C34865d c34865d = (C34865d) this.f74271i[iOrdinal];
        c34865d.m76471a(this.f74267e, this.f74268f);
        OpenGlUtils.glViewport(0, 0, this.f74267e, this.f74268f);
        if (this.f74273k.getRotation() != EnumC34747l.ROTATION_90 && this.f74273k.getRotation() != EnumC34747l.ROTATION_270) {
            c34865d.m76480a(buffer, this.f74273k.getWidth(), this.f74273k.getHeight());
        } else {
            c34865d.m76480a(buffer, this.f74273k.getHeight(), this.f74273k.getWidth());
        }
        c34865d.mo76472a(-1, abstractC34885d, this.f74269g, this.f74270h);
    }

    /* JADX INFO: renamed from: a */
    private void m76539a(GLConstants.PixelFormatType pixelFormatType, AbstractC34885d abstractC34885d, ByteBuffer byteBuffer, GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        int iOrdinal = pixelFormatType.ordinal();
        C34861a[] c34861aArr = this.f74271i;
        if (c34861aArr[iOrdinal] == null) {
            if (pixelFormatType == GLConstants.PixelFormatType.I420) {
                c34861aArr[iOrdinal] = new C34868a(colorRange, colorSpace);
            } else if (pixelFormatType == GLConstants.PixelFormatType.NV21) {
                c34861aArr[iOrdinal] = new C34871d();
            } else {
                c34861aArr[iOrdinal] = new C34870c();
            }
            this.f74271i[iOrdinal].m76473a((C34886e) null);
        }
        AbstractC34872e abstractC34872e = (AbstractC34872e) this.f74271i[iOrdinal];
        abstractC34872e.m76471a(this.f74267e, this.f74268f);
        OpenGlUtils.glViewport(0, 0, this.f74267e, this.f74268f);
        if (this.f74273k.getRotation() != EnumC34747l.ROTATION_90 && this.f74273k.getRotation() != EnumC34747l.ROTATION_270) {
            abstractC34872e.m76490a(byteBuffer, this.f74273k.getWidth(), this.f74273k.getHeight());
        } else {
            abstractC34872e.m76490a(byteBuffer, this.f74273k.getHeight(), this.f74273k.getWidth());
        }
        abstractC34872e.mo76472a(-1, abstractC34885d, this.f74269g, this.f74270h);
    }

    /* JADX INFO: renamed from: a */
    private void m76542a(AbstractC34885d abstractC34885d, int i11, float[] fArr) {
        if (this.f74274l == null) {
            C34862a c34862a = new C34862a();
            this.f74274l = c34862a;
            c34862a.m76473a((C34886e) null);
        }
        OpenGlUtils.glViewport(0, 0, this.f74267e, this.f74268f);
        C34862a c34862a2 = this.f74274l;
        c34862a2.f74109g = fArr;
        c34862a2.m76471a(this.f74267e, this.f74268f);
        this.f74274l.mo76472a(i11, abstractC34885d, this.f74269g, this.f74270h);
    }

    /* JADX INFO: renamed from: a */
    private void m76541a(AbstractC34885d abstractC34885d, int i11) {
        m76547c();
        OpenGlUtils.glViewport(0, 0, this.f74267e, this.f74268f);
        this.f74275m.m76471a(this.f74267e, this.f74268f);
        this.f74275m.mo76472a(i11, abstractC34885d, this.f74269g, this.f74270h);
    }

    /* JADX INFO: renamed from: a */
    private void m76540a(AbstractC34885d abstractC34885d) {
        if (this.f74276n == null) {
            C34884c c34884c = new C34884c();
            this.f74276n = c34884c;
            c34884c.m76521a();
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (abstractC34885d == null) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(16640);
            return;
        }
        this.f74276n.m76522a(abstractC34885d.mo76526a());
        this.f74276n.m76523b();
        GLES20.glClear(16640);
        OpenGlUtils.bindFramebuffer(36160, 0);
        this.f74276n.m76524c();
    }

    /* JADX INFO: renamed from: a */
    private static void m76544a(float[] fArr, EnumC34747l enumC34747l, boolean z11, boolean z12) {
        float[] fArr2 = f74263a;
        if (enumC34747l != null) {
            int i11 = AnonymousClass1.f74277a[enumC34747l.ordinal()];
            if (i11 == 1) {
                fArr2 = f74264b;
            } else if (i11 == 2) {
                fArr2 = f74266d;
            } else if (i11 == 3) {
                fArr2 = f74265c;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z11) {
            fArr[0] = m76537a(fArr[0]);
            fArr[2] = m76537a(fArr[2]);
            fArr[4] = m76537a(fArr[4]);
            fArr[6] = m76537a(fArr[6]);
        }
        if (z12) {
            fArr[1] = m76537a(fArr[1]);
            fArr[3] = m76537a(fArr[3]);
            fArr[5] = m76537a(fArr[5]);
            fArr[7] = m76537a(fArr[7]);
        }
    }
}
