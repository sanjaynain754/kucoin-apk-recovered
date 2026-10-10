package com.tencent.ugc.videobase.videobase;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFramePool;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.utils.YUVReadTools;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.videobase.a */
/* JADX INFO: loaded from: classes2.dex */
final class C35832a {

    /* JADX INFO: renamed from: a */
    static final GLConstants.PixelFormatType[] f77384a = {GLConstants.PixelFormatType.I420, GLConstants.PixelFormatType.NV21, GLConstants.PixelFormatType.NV12};

    /* JADX INFO: renamed from: d */
    final ConvertParams f77387d;

    /* JADX INFO: renamed from: g */
    PixelFrameRenderer f77390g;

    /* JADX INFO: renamed from: i */
    PixelFramePool f77392i;

    /* JADX INFO: renamed from: j */
    GLTexturePool f77393j;

    /* JADX INFO: renamed from: k */
    private int f77394k = -1;

    /* JADX INFO: renamed from: h */
    boolean f77391h = false;

    /* JADX INFO: renamed from: b */
    final FloatBuffer f77385b = OpenGlUtils.createNormalCubeVerticesBuffer();

    /* JADX INFO: renamed from: c */
    final FloatBuffer f77386c = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);

    /* JADX INFO: renamed from: e */
    final Map<GLConstants.PixelFormatType, List<a>> f77388e = new HashMap();

    /* JADX INFO: renamed from: f */
    final Map<GLConstants.PixelFormatType, TXCGPUImageFilter> f77389f = new HashMap();

    /* JADX INFO: renamed from: a */
    public final void m79319a(GLTexturePool gLTexturePool) {
        if (!this.f77391h && gLTexturePool != null) {
            this.f77391h = true;
            this.f77392i = new PixelFramePool();
            this.f77393j = gLTexturePool;
        } else {
            LiteavLog.m76087i("SameParamsConverter", "SameParamsConverter mIsInitialized " + this.f77391h + " , texturePool " + gLTexturePool);
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.videobase.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77395a;

        static {
            int[] iArr = new int[GLConstants.PixelFormatType.values().length];
            f77395a = iArr;
            try {
                iArr[GLConstants.PixelFormatType.I420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77395a[GLConstants.PixelFormatType.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77395a[GLConstants.PixelFormatType.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.videobase.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final GLConstants.EnumC34866a f77396a;

        /* JADX INFO: renamed from: b */
        public final int f77397b;

        /* JADX INFO: renamed from: c */
        public final FrameConverter.FrameConvertListener f77398c;

        public a(GLConstants.EnumC34866a enumC34866a, int i11, FrameConverter.FrameConvertListener frameConvertListener) {
            this.f77396a = enumC34866a;
            this.f77397b = i11;
            this.f77398c = frameConvertListener;
        }
    }

    public C35832a(ConvertParams convertParams) {
        this.f77387d = convertParams;
    }

    /* JADX INFO: renamed from: a */
    public final void m79316a() {
        Iterator<TXCGPUImageFilter> it = this.f77389f.values().iterator();
        while (it.hasNext()) {
            it.next().uninitialize();
        }
        this.f77389f.clear();
        PixelFrameRenderer pixelFrameRenderer = this.f77390g;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.f77390g = null;
        }
        PixelFramePool pixelFramePool = this.f77392i;
        if (pixelFramePool != null) {
            pixelFramePool.destroy();
            this.f77392i = null;
        }
        OpenGlUtils.deleteFrameBuffer(this.f77394k);
        this.f77394k = -1;
        this.f77391h = false;
    }

    /* JADX INFO: renamed from: a */
    public final PixelFrame m79315a(long j11, GLTexture gLTexture, GLConstants.PixelFormatType pixelFormatType) {
        GLConstants.EnumC34866a enumC34866a = GLConstants.EnumC34866a.BYTE_BUFFER;
        int iM79314a = m79314a(pixelFormatType, enumC34866a);
        GLConstants.EnumC34866a enumC34866a2 = GLConstants.EnumC34866a.BYTE_ARRAY;
        int iM79314a2 = m79314a(pixelFormatType, enumC34866a2);
        if (iM79314a == 0 && iM79314a2 == 0) {
            return null;
        }
        boolean z11 = iM79314a != 0;
        PixelFramePool pixelFramePool = this.f77392i;
        int width = gLTexture.getWidth();
        int height = gLTexture.getHeight();
        if (!z11) {
            enumC34866a = enumC34866a2;
        }
        PixelFrame pixelFrameObtain = pixelFramePool.obtain(width, height, enumC34866a, pixelFormatType);
        pixelFrameObtain.setColorFormat(gLTexture.getColorRange(), gLTexture.getColorSpace());
        if (!pixelFrameObtain.isFrameDataValid()) {
            pixelFrameObtain.release();
            return null;
        }
        m79313a(pixelFormatType, gLTexture, z11 ? pixelFrameObtain.getBuffer() : pixelFrameObtain.getData());
        pixelFrameObtain.setMetaData(gLTexture.getMetaData());
        m79320a(pixelFrameObtain, j11);
        m79318a(j11, pixelFrameObtain, iM79314a, iM79314a2);
        return pixelFrameObtain;
    }

    /* JADX INFO: renamed from: a */
    public final void m79318a(long j11, PixelFrame pixelFrame, int i11, int i12) {
        GLConstants.EnumC34866a pixelBufferType = pixelFrame.getPixelBufferType();
        GLConstants.EnumC34866a enumC34866a = GLConstants.EnumC34866a.BYTE_BUFFER;
        boolean z11 = false;
        boolean z12 = pixelBufferType == enumC34866a && i12 != 0;
        GLConstants.EnumC34866a pixelBufferType2 = pixelFrame.getPixelBufferType();
        GLConstants.EnumC34866a enumC34866a2 = GLConstants.EnumC34866a.BYTE_ARRAY;
        if (pixelBufferType2 == enumC34866a2 && i11 != 0) {
            z11 = true;
        }
        if (z12 || z11) {
            PixelFramePool pixelFramePool = this.f77392i;
            int width = pixelFrame.getWidth();
            int height = pixelFrame.getHeight();
            if (z12) {
                enumC34866a = enumC34866a2;
            }
            PixelFrame pixelFrameObtain = pixelFramePool.obtain(width, height, enumC34866a, pixelFrame.getPixelFormatType());
            pixelFrameObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
            if (!pixelFrameObtain.isFrameDataValid()) {
                pixelFrameObtain.release();
                return;
            }
            if (z12) {
                OpenGlUtils.nativeCopyDataFromByteBufferToByteArray(pixelFrame.getBuffer(), pixelFrameObtain.getData(), pixelFrameObtain.getData().length);
            } else {
                OpenGlUtils.nativeCopyDataFromByteArrayToByteBuffer(pixelFrame.getData(), pixelFrameObtain.getBuffer(), pixelFrame.getData().length);
            }
            m79320a(pixelFrameObtain, j11);
            pixelFrameObtain.release();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79313a(GLConstants.PixelFormatType pixelFormatType, GLTexture gLTexture, Object obj) {
        ConvertParams convertParams = this.f77387d;
        int i11 = convertParams.width;
        int i12 = convertParams.height;
        if (this.f77394k == -1) {
            this.f77394k = OpenGlUtils.generateFrameBufferId();
        }
        OpenGlUtils.attachTextureToFrameBuffer(gLTexture.getId(), this.f77394k);
        GLES20.glBindFramebuffer(36160, this.f77394k);
        if (pixelFormatType == GLConstants.PixelFormatType.RGBA) {
            OpenGlUtils.readPixels(0, 0, i11, i12, obj);
            OpenGlUtils.detachTextureFromFrameBuffer(this.f77394k);
            return;
        }
        if (i12 % 16 == 0) {
            OpenGlUtils.readPixels(0, 0, i11, (i12 * 3) / 8, obj);
        } else if (obj instanceof ByteBuffer) {
            YUVReadTools.nativeReadYUVPlanesForByteBuffer(i11, i12, (ByteBuffer) obj);
        } else {
            YUVReadTools.nativeReadYUVPlanesForByteArray(i11, i12, (byte[]) obj);
        }
        OpenGlUtils.detachTextureFromFrameBuffer(this.f77394k);
    }

    /* JADX INFO: renamed from: a */
    public final void m79320a(PixelFrame pixelFrame, long j11) {
        List<a> list = this.f77388e.get(pixelFrame.getPixelFormatType());
        if (list == null || list.isEmpty()) {
            return;
        }
        pixelFrame.setTimestamp(j11);
        for (a aVar : new ArrayList(list)) {
            if (aVar.f77396a == pixelFrame.getPixelBufferType()) {
                aVar.f77398c.onFrameConverted(aVar.f77397b, pixelFrame);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m79314a(GLConstants.PixelFormatType pixelFormatType, GLConstants.EnumC34866a enumC34866a) {
        List<a> list = this.f77388e.get(pixelFormatType);
        int i11 = 0;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f77396a == enumC34866a) {
                    i11++;
                }
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m79317a(int i11, FrameConverter.FrameConvertListener frameConvertListener) {
        for (Map.Entry<GLConstants.PixelFormatType, List<a>> entry : this.f77388e.entrySet()) {
            for (a aVar : entry.getValue()) {
                if (aVar.f77397b == i11 && aVar.f77398c == frameConvertListener) {
                    entry.getValue().remove(aVar);
                    break;
                }
            }
            if (entry.getValue().isEmpty()) {
                this.f77388e.remove(entry.getKey());
                return;
            }
        }
    }
}
