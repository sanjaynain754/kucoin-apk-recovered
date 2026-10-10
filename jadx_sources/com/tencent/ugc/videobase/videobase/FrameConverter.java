package com.tencent.ugc.videobase.videobase;

import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.yuv.TXCGPUImageRGBAToI420Filter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageRGBAToI420NoDiv16Filter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageRGBAToNV12Filter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageRGBAToNV21Filter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FrameConverter {
    private static final String TAG = "FrameConverter";
    private GLTexturePool mGLTexturePool;
    private final Map<ConvertParams, C35832a> mSameParamsConverts = new HashMap();

    public interface FrameConvertListener {
        void onFrameConverted(int i11, PixelFrame pixelFrame);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    public void processFrame(long j11, GLTexture gLTexture) {
        PixelFrame pixelFrameWrap;
        EnumC34747l enumC34747l;
        GLTexture gLTexture2;
        GLConstants.PixelFormatType[] pixelFormatTypeArr;
        TXCGPUImageFilter tXCGPUImageFilter;
        TXCGPUImageFilter tXCGPUImageRGBAToI420Filter;
        GLConstants.ColorRange colorRange;
        Object obj;
        if (this.mSameParamsConverts.size() <= 0) {
            LiteavLog.m76093w(TAG, "process frame without SameParamsConverter.");
        }
        for (C35832a c35832a : this.mSameParamsConverts.values()) {
            if (c35832a.f77391h) {
                int width = c35832a.f77387d.width;
                if (width == 0) {
                    width = gLTexture.getWidth();
                }
                int height = c35832a.f77387d.height;
                if (height == 0) {
                    height = gLTexture.getHeight();
                }
                if (gLTexture.getWidth() == width && gLTexture.getHeight() == height) {
                    ConvertParams convertParams = c35832a.f77387d;
                    if (convertParams.rotation != EnumC34747l.NORMAL || convertParams.mirror) {
                        if (c35832a.f77390g == null) {
                            c35832a.f77390g = new PixelFrameRenderer(width, height);
                        }
                        pixelFrameWrap = gLTexture.wrap(OpenGlUtils.getCurrentContext());
                        enumC34747l = c35832a.f77387d.rotation;
                        if (enumC34747l != EnumC34747l.ROTATION_90) {
                            pixelFrameWrap.setWidth(gLTexture.getHeight());
                            pixelFrameWrap.setHeight(gLTexture.getWidth());
                        } else {
                            pixelFrameWrap.setWidth(gLTexture.getHeight());
                            pixelFrameWrap.setHeight(gLTexture.getWidth());
                        }
                        pixelFrameWrap.setRotation(c35832a.f77387d.rotation);
                        pixelFrameWrap.setMirrorHorizontal(c35832a.f77387d.mirror);
                        GLTexture gLTextureObtain = c35832a.f77393j.obtain(width, height);
                        gLTextureObtain.setColorFormat(pixelFrameWrap.getColorRange(), pixelFrameWrap.getColorSpace());
                        gLTextureObtain.setMetaData(gLTexture.getMetaData());
                        c35832a.f77390g.renderFrame(pixelFrameWrap, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain);
                        pixelFrameWrap.release();
                        gLTexture2 = gLTextureObtain;
                    } else {
                        gLTexture.retain();
                        gLTexture2 = gLTexture;
                    }
                } else {
                    if (c35832a.f77390g == null) {
                        c35832a.f77390g = new PixelFrameRenderer(width, height);
                    }
                    pixelFrameWrap = gLTexture.wrap(OpenGlUtils.getCurrentContext());
                    enumC34747l = c35832a.f77387d.rotation;
                    if (enumC34747l != EnumC34747l.ROTATION_90 || enumC34747l == EnumC34747l.ROTATION_270) {
                        pixelFrameWrap.setWidth(gLTexture.getHeight());
                        pixelFrameWrap.setHeight(gLTexture.getWidth());
                    } else {
                        pixelFrameWrap.setWidth(gLTexture.getWidth());
                        pixelFrameWrap.setHeight(gLTexture.getHeight());
                    }
                    pixelFrameWrap.setRotation(c35832a.f77387d.rotation);
                    pixelFrameWrap.setMirrorHorizontal(c35832a.f77387d.mirror);
                    GLTexture gLTextureObtain2 = c35832a.f77393j.obtain(width, height);
                    gLTextureObtain2.setColorFormat(pixelFrameWrap.getColorRange(), pixelFrameWrap.getColorSpace());
                    gLTextureObtain2.setMetaData(gLTexture.getMetaData());
                    c35832a.f77390g.renderFrame(pixelFrameWrap, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain2);
                    pixelFrameWrap.release();
                    gLTexture2 = gLTextureObtain2;
                }
                PixelFrame pixelFrameWrap2 = gLTexture2.wrap(OpenGlUtils.getCurrentContext());
                pixelFrameWrap2.setMetaData(gLTexture2.getMetaData());
                c35832a.m79320a(pixelFrameWrap2, j11);
                pixelFrameWrap2.release();
                PixelFrame pixelFrameM79315a = c35832a.m79315a(j11, gLTexture2, GLConstants.PixelFormatType.RGBA);
                if (pixelFrameM79315a != null) {
                    pixelFrameM79315a.release();
                }
                int i11 = 0;
                while (true) {
                    pixelFormatTypeArr = C35832a.f77384a;
                    if (i11 >= pixelFormatTypeArr.length) {
                        i11 = -1;
                        break;
                    } else if (c35832a.f77388e.containsKey(pixelFormatTypeArr[i11])) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    int width2 = gLTexture2.getWidth();
                    int height2 = gLTexture2.getHeight();
                    GLConstants.ColorRange colorRange2 = gLTexture2.getColorRange();
                    GLConstants.ColorSpace colorSpace = gLTexture2.getColorSpace();
                    GLTexture gLTextureObtain3 = c35832a.f77393j.obtain(width2, height2);
                    gLTextureObtain3.setColorFormat(colorRange2, colorSpace);
                    GLConstants.PixelFormatType pixelFormatType = pixelFormatTypeArr[i11];
                    if (pixelFormatType != null) {
                        tXCGPUImageFilter = c35832a.f77389f.get(pixelFormatType);
                        if (tXCGPUImageFilter == null) {
                            int i12 = C35832a.AnonymousClass1.f77395a[pixelFormatType.ordinal()];
                            if (i12 == 1) {
                                tXCGPUImageRGBAToI420Filter = c35832a.f77387d.height % 16 == 0 ? new TXCGPUImageRGBAToI420Filter() : new TXCGPUImageRGBAToI420NoDiv16Filter();
                            } else if (i12 == 2) {
                                tXCGPUImageRGBAToI420Filter = new TXCGPUImageRGBAToNV12Filter();
                            } else if (i12 != 3) {
                                tXCGPUImageFilter = null;
                            } else {
                                tXCGPUImageRGBAToI420Filter = new TXCGPUImageRGBAToNV21Filter();
                            }
                            tXCGPUImageFilter = tXCGPUImageRGBAToI420Filter;
                            tXCGPUImageFilter.initialize(null);
                            ConvertParams convertParams2 = c35832a.f77387d;
                            tXCGPUImageFilter.onOutputSizeChanged(convertParams2.width, convertParams2.height);
                            c35832a.f77389f.put(pixelFormatType, tXCGPUImageFilter);
                        }
                    } else {
                        tXCGPUImageFilter = null;
                    }
                    if (tXCGPUImageFilter != null) {
                        OpenGlUtils.glViewport(0, 0, width2, height2);
                        tXCGPUImageFilter.setColorFormat(colorRange2, colorSpace);
                        tXCGPUImageFilter.onDraw(gLTexture2.getId(), gLTextureObtain3, c35832a.f77385b, c35832a.f77386c);
                        gLTextureObtain3.setMetaData(gLTexture2.getMetaData());
                        PixelFrame pixelFrameM79315a2 = c35832a.m79315a(j11, gLTextureObtain3, pixelFormatTypeArr[i11]);
                        if (pixelFrameM79315a2 != null) {
                            gLTextureObtain3.release();
                            Object buffer = pixelFrameM79315a2.getPixelBufferType() == GLConstants.EnumC34866a.BYTE_BUFFER ? pixelFrameM79315a2.getBuffer() : pixelFrameM79315a2.getData();
                            int i13 = i11 + 1;
                            while (true) {
                                GLConstants.PixelFormatType[] pixelFormatTypeArr2 = C35832a.f77384a;
                                if (i13 >= pixelFormatTypeArr2.length) {
                                    break;
                                }
                                GLConstants.PixelFormatType pixelFormatType2 = pixelFormatTypeArr2[i13];
                                GLConstants.EnumC34866a enumC34866a = GLConstants.EnumC34866a.BYTE_BUFFER;
                                int iM79314a = c35832a.m79314a(pixelFormatType2, enumC34866a);
                                GLConstants.PixelFormatType pixelFormatType3 = pixelFormatTypeArr2[i13];
                                PixelFrame pixelFrame = pixelFrameM79315a2;
                                GLConstants.EnumC34866a enumC34866a2 = GLConstants.EnumC34866a.BYTE_ARRAY;
                                int iM79314a2 = c35832a.m79314a(pixelFormatType3, enumC34866a2);
                                PixelFrame pixelFrameObtain = iM79314a != 0 ? c35832a.f77392i.obtain(width2, height2, enumC34866a, pixelFormatTypeArr2[i13]) : iM79314a2 != 0 ? c35832a.f77392i.obtain(width2, height2, enumC34866a2, pixelFormatTypeArr2[i13]) : null;
                                if (pixelFrameObtain == null || !pixelFrameObtain.isFrameDataValid()) {
                                    colorRange = colorRange2;
                                    obj = buffer;
                                } else {
                                    pixelFrameObtain.setColorFormat(colorRange2, colorSpace);
                                    colorRange = colorRange2;
                                    obj = buffer;
                                    OpenGlUtils.convertYuvFormat(pixelFrame.getPixelFormatType(), obj, pixelFrameObtain.getPixelFormatType(), pixelFrameObtain.getBuffer(), width2, height2);
                                    pixelFrameObtain.setMetaData(gLTexture2.getMetaData());
                                    c35832a.m79320a(pixelFrameObtain, j11);
                                    PixelFrame pixelFrame2 = pixelFrameObtain;
                                    c35832a.m79318a(j11, pixelFrame2, iM79314a, iM79314a2);
                                    pixelFrame2.release();
                                }
                                i13++;
                                j11 = j11;
                                buffer = obj;
                                pixelFrameM79315a2 = pixelFrame;
                                colorRange2 = colorRange;
                                colorSpace = colorSpace;
                            }
                            pixelFrameM79315a2.release();
                        }
                    }
                }
                gLTexture2.release();
            }
        }
    }

    public void addListener(ConvertParams convertParams, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType, int i11, FrameConvertListener frameConvertListener) {
        C35832a c35832a = this.mSameParamsConverts.get(convertParams);
        if (c35832a == null) {
            c35832a = new C35832a(convertParams);
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            if (gLTexturePool != null) {
                c35832a.m79319a(gLTexturePool);
            }
            this.mSameParamsConverts.put(convertParams, c35832a);
        }
        List<C35832a.a> arrayList = c35832a.f77388e.get(pixelFormatType);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            c35832a.f77388e.put(pixelFormatType, arrayList);
        }
        for (C35832a.a aVar : arrayList) {
            if (aVar.f77397b == i11 && aVar.f77398c == frameConvertListener) {
                return;
            }
        }
        arrayList.add(new C35832a.a(enumC34866a, i11, frameConvertListener));
    }

    public void initialize(GLTexturePool gLTexturePool) {
        this.mGLTexturePool = gLTexturePool;
        Iterator<C35832a> it = this.mSameParamsConverts.values().iterator();
        while (it.hasNext()) {
            it.next().m79319a(gLTexturePool);
        }
    }

    public void removeListener(int i11, FrameConvertListener frameConvertListener) {
        ArrayList<ConvertParams> arrayList = new ArrayList();
        for (Map.Entry<ConvertParams, C35832a> entry : this.mSameParamsConverts.entrySet()) {
            entry.getValue().m79317a(i11, frameConvertListener);
            if (entry.getValue().f77388e.isEmpty()) {
                arrayList.add(entry.getKey());
            }
        }
        for (ConvertParams convertParams : arrayList) {
            C35832a c35832a = this.mSameParamsConverts.get(convertParams);
            if (c35832a != null) {
                c35832a.m79316a();
            }
            this.mSameParamsConverts.remove(convertParams);
        }
    }

    public void uninitialize() {
        Iterator<C35832a> it = this.mSameParamsConverts.values().iterator();
        while (it.hasNext()) {
            it.next().m79316a();
        }
    }
}
