package com.tencent.ugc.videobase.frame;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class PixelFrame extends RefCounted {
    protected ByteBuffer mBuffer;
    protected GLConstants.ColorRange mColorRange;
    protected GLConstants.ColorSpace mColorSpace;
    protected byte[] mData;
    protected Object mGLContext;
    private HDRType mHdrType;
    protected int mHeight;
    private boolean mIsMirrorHorizontal;
    private boolean mIsMirrorVertical;
    private float[] mMatrix;
    protected FrameMetaData mMetaData;
    protected GLConstants.EnumC34866a mPixelBufferType;
    protected GLConstants.PixelFormatType mPixelFormatType;
    private EnumC34747l mRotation;
    protected int mTextureId;
    private long mTimestamp;
    protected int mWidth;

    public PixelFrame() {
        super(null);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = EnumC34747l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mHdrType = HDRType.NONE;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
    }

    private int getColorRangeValue() {
        return this.mColorRange.getValue();
    }

    private int getColorSpaceValue() {
        return this.mColorSpace.getValue();
    }

    private int getPixelBufferTypeValue() {
        return this.mPixelBufferType.mValue;
    }

    private int getPixelFormatTypeValue() {
        return this.mPixelFormatType.getValue();
    }

    private int getRotationValue() {
        return this.mRotation.mValue;
    }

    public static void releasePixelFrames(Collection<PixelFrame> collection) {
        if (collection == null) {
            return;
        }
        for (PixelFrame pixelFrame : collection) {
            if (pixelFrame != null) {
                pixelFrame.release();
            }
        }
        collection.clear();
    }

    public void copy(PixelFrame pixelFrame) {
        this.mTimestamp = pixelFrame.mTimestamp;
        this.mWidth = pixelFrame.mWidth;
        this.mHeight = pixelFrame.mHeight;
        this.mPixelBufferType = pixelFrame.mPixelBufferType;
        this.mPixelFormatType = pixelFrame.mPixelFormatType;
        this.mRotation = pixelFrame.mRotation;
        this.mIsMirrorHorizontal = pixelFrame.mIsMirrorHorizontal;
        this.mIsMirrorVertical = pixelFrame.mIsMirrorVertical;
        if (pixelFrame.mMatrix != null) {
            this.mMatrix = new float[16];
            float[] matrix = pixelFrame.getMatrix();
            float[] fArr = this.mMatrix;
            System.arraycopy(matrix, 0, fArr, 0, fArr.length);
        }
        this.mMatrix = pixelFrame.mMatrix;
        this.mData = pixelFrame.mData;
        this.mBuffer = pixelFrame.mBuffer;
        this.mTextureId = pixelFrame.mTextureId;
        this.mGLContext = pixelFrame.mGLContext;
        this.mMetaData = pixelFrame.mMetaData;
        this.mColorSpace = pixelFrame.mColorSpace;
        this.mColorRange = pixelFrame.mColorRange;
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public GLConstants.ColorRange getColorRange() {
        return this.mColorRange;
    }

    public GLConstants.ColorSpace getColorSpace() {
        return this.mColorSpace;
    }

    public byte[] getData() {
        return this.mData;
    }

    public Object getGLContext() {
        return this.mGLContext;
    }

    public long getGLContextNativeHandle() {
        return OpenGlUtils.getGLContextNativeHandle(this.mGLContext);
    }

    public HDRType getHdrType() {
        return this.mHdrType;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public float[] getMatrix() {
        return this.mMatrix;
    }

    public FrameMetaData getMetaData() {
        return this.mMetaData;
    }

    public GLConstants.EnumC34866a getPixelBufferType() {
        return this.mPixelBufferType;
    }

    public GLConstants.PixelFormatType getPixelFormatType() {
        return this.mPixelFormatType;
    }

    public EnumC34747l getRotation() {
        return this.mRotation;
    }

    public int getTextureId() {
        return this.mTextureId;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean hasTransformParams() {
        return this.mRotation != EnumC34747l.NORMAL || this.mIsMirrorHorizontal || this.mIsMirrorVertical || this.mMatrix != null;
    }

    public boolean isFrameDataValid() {
        GLConstants.EnumC34866a enumC34866a = this.mPixelBufferType;
        if (enumC34866a == GLConstants.EnumC34866a.TEXTURE_2D && this.mTextureId == -1) {
            return false;
        }
        if (enumC34866a == GLConstants.EnumC34866a.BYTE_BUFFER && this.mBuffer == null) {
            return false;
        }
        return (enumC34866a == GLConstants.EnumC34866a.BYTE_ARRAY && this.mData == null) ? false : true;
    }

    public boolean isMirrorHorizontal() {
        return this.mIsMirrorHorizontal;
    }

    public boolean isMirrorVertical() {
        return this.mIsMirrorVertical;
    }

    public void postRotate(EnumC34747l enumC34747l) {
        if (enumC34747l == EnumC34747l.ROTATION_90 || enumC34747l == EnumC34747l.ROTATION_270) {
            swapWidthHeight();
        }
        setRotation(EnumC34747l.m76131a((this.mRotation.mValue + enumC34747l.mValue) % TXVodDownloadDataSource.QUALITY_360P));
    }

    public void reset() {
        this.mTimestamp = 0L;
        this.mRotation = EnumC34747l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mMetaData = null;
        this.mColorRange = GLConstants.ColorRange.UNKNOWN;
        this.mColorSpace = GLConstants.ColorSpace.UNKNOWN;
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public void setColorFormat(GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        this.mColorRange = colorRange;
        this.mColorSpace = colorSpace;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setHdrType(HDRType hDRType) {
        this.mHdrType = hDRType;
    }

    public void setHeight(int i11) {
        this.mHeight = i11;
    }

    public void setMatrix(float[] fArr) {
        this.mMatrix = fArr;
    }

    public void setMetaData(FrameMetaData frameMetaData) {
        this.mMetaData = frameMetaData;
    }

    public void setMirrorHorizontal(boolean z11) {
        this.mIsMirrorHorizontal = z11;
    }

    public void setMirrorVertical(boolean z11) {
        this.mIsMirrorVertical = z11;
    }

    public void setPixelBufferType(GLConstants.EnumC34866a enumC34866a) {
        this.mPixelBufferType = enumC34866a;
    }

    public void setPixelFormatType(GLConstants.PixelFormatType pixelFormatType) {
        this.mPixelFormatType = pixelFormatType;
    }

    public void setRotation(EnumC34747l enumC34747l) {
        this.mRotation = enumC34747l;
    }

    public void setTextureId(int i11) {
        this.mTextureId = i11;
    }

    public void setTimestamp(long j11) {
        this.mTimestamp = j11;
    }

    public void setWidth(int i11) {
        this.mWidth = i11;
    }

    public void swapWidthHeight() {
        int i11 = this.mWidth;
        this.mWidth = this.mHeight;
        this.mHeight = i11;
    }

    public static PixelFrame createFromBitmap(Bitmap bitmap) {
        int width = (bitmap.getWidth() / 2) * 2;
        int height = (bitmap.getHeight() / 2) * 2;
        if (width != 0 && height != 0 && (bitmap.getWidth() % 2 != 0 || bitmap.getHeight() % 2 != 0)) {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
        }
        ByteBuffer byteBufferAllocateDirectBuffer = MemoryAllocator.allocateDirectBuffer(bitmap.getWidth() * 4 * bitmap.getHeight());
        if (byteBufferAllocateDirectBuffer == null) {
            return null;
        }
        bitmap.copyPixelsToBuffer(byteBufferAllocateDirectBuffer);
        byteBufferAllocateDirectBuffer.position(0);
        PixelFrame pixelFrame = new PixelFrame();
        pixelFrame.setBuffer(byteBufferAllocateDirectBuffer);
        pixelFrame.setWidth(bitmap.getWidth());
        pixelFrame.setHeight(bitmap.getHeight());
        pixelFrame.setPixelBufferType(GLConstants.EnumC34866a.BYTE_BUFFER);
        pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        return pixelFrame;
    }

    @Override // com.tencent.ugc.videobase.frame.RefCounted
    public void release() {
        super.release();
    }

    @Override // com.tencent.ugc.videobase.frame.RefCounted
    public int retain() {
        return super.retain();
    }

    public PixelFrame(PixelFrame pixelFrame) {
        super(null);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = EnumC34747l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mHdrType = HDRType.NONE;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        copy(pixelFrame);
    }

    public PixelFrame(int i11, int i12, int i13, int i14, int i15) {
        this(null, i11, i12, i13, GLConstants.EnumC34866a.m76485a(i14), GLConstants.PixelFormatType.m76484a(i15));
    }

    public PixelFrame(IRecycler<PixelFrame> iRecycler, int i11, int i12, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType) {
        this(iRecycler, i11, i12, pixelFormatType == GLConstants.PixelFormatType.RGBA ? i11 * i12 * 4 : ((i11 * i12) * 3) / 2, enumC34866a, pixelFormatType);
    }

    public PixelFrame(IRecycler<PixelFrame> iRecycler, int i11, int i12, int i13, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType) {
        super(iRecycler);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = EnumC34747l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mHdrType = HDRType.NONE;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mWidth = i11;
        this.mHeight = i12;
        this.mPixelFormatType = pixelFormatType;
        this.mPixelBufferType = enumC34866a;
        if (enumC34866a == GLConstants.EnumC34866a.BYTE_ARRAY) {
            this.mData = MemoryAllocator.allocateByteArray(i13);
        } else {
            this.mBuffer = MemoryAllocator.allocateDirectBuffer(i13);
        }
    }

    public PixelFrame(IRecycler<? extends PixelFrame> iRecycler) {
        super(iRecycler);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = EnumC34747l.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mHdrType = HDRType.NONE;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
    }
}
