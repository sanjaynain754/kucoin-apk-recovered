package com.tencent.thumbplayer.tcmedia.core.decoder;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncoderConfig;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.p164g.C35360b;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes63.dex */
public class TPMediaCodecVideoDecoder extends TPBaseMediaCodecDecoder {
    private static final String DEVICE_NAME_VIVO_X5L = "vivo X5L";
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int PIXEL_STRIDE_CONTINUOUS = 1;
    private static final String TAG = "TPMediaCodecVideoDecode";
    private static final int YUV420P_PLANAR_COUNT = 3;
    private int mCropBottom;
    private int mCropLeft;
    private int mCropRight;
    private int mCropTop;
    private byte[] mCsd0Data;
    private byte[] mCsd1Data;
    private byte[] mCsd2Data;
    private boolean mDisableDolbyVisionComponent;
    private int mDolbyVisionLevel;
    private int mDolbyVisionProfile;
    private boolean mEnableMediaCodecOutputData;
    private ArrayList<String> mMimeCandidates;
    private int mRotation;
    private int mVideoHeight;
    private int mVideoWidth;

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public ArrayList<String> getMimeCandidates() {
        return this.mMimeCandidates;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputConfigData(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tPFrameInfo.errCode = 0;
        processOutputBuffer(c35360b, i11, bufferInfo, tPFrameInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i11, boolean z11) {
        String logTag;
        StringBuilder sb2;
        if (5 == i11) {
            if (this.mStarted) {
                logTag = getLogTag();
                sb2 = new StringBuilder("BOOL_ENABLE_MEDIACODEC_OUTPUT_DATA failed. need set before start, mStart=");
                sb2.append(this.mStarted);
                sb2.append(", api level is ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(", support api level = 21");
                TPNativeLog.printLog(3, logTag, sb2.toString());
            } else {
                this.mEnableMediaCodecOutputData = z11;
            }
        } else if (6 == i11) {
            if (this.mStarted) {
                logTag = getLogTag();
                sb2 = new StringBuilder("BOOL_FORCE_DOLBY_VISION_USE_HEVC_CODEC failed. need set before start, mStart=");
                sb2.append(this.mStarted);
                TPNativeLog.printLog(3, logTag, sb2.toString());
            } else {
                this.mDisableDolbyVisionComponent = z11;
            }
        }
        return super.setParamBool(i11, z11);
    }

    private void processOutputData(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            TPNativeLog.printLog(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 2;
            c35360b.m78216a(i11, false);
            return;
        }
        Image imageM78223b = c35360b.m78223b(i11);
        if (imageM78223b != null) {
            copyVideoDataFromImage(imageM78223b, tPFrameInfo);
            c35360b.m78216a(i11, false);
        } else {
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 3;
            c35360b.m78216a(i11, false);
            TPNativeLog.printLog(4, TAG, "processOutputBuffer: getOutputImage return null");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void configCodec(C35360b c35360b, String str) {
        Surface surface;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, this.mVideoWidth, this.mVideoHeight);
        mediaFormatCreateVideoFormat.setInteger(MediaUtils.KEY_ROTATION, this.mRotation);
        if (TPSystemInfo.getDeviceName().equalsIgnoreCase(DEVICE_NAME_VIVO_X5L)) {
            mediaFormatCreateVideoFormat.setInteger("max-input-size", this.mVideoWidth * this.mVideoHeight);
        }
        byte[] bArr = this.mCsd0Data;
        if (bArr != null) {
            mediaFormatCreateVideoFormat.setByteBuffer(EncoderConfig.KEY_CSD_0, ByteBuffer.wrap(bArr));
        }
        byte[] bArr2 = this.mCsd1Data;
        if (bArr2 != null) {
            mediaFormatCreateVideoFormat.setByteBuffer(EncoderConfig.KEY_CSD_1, ByteBuffer.wrap(bArr2));
        }
        byte[] bArr3 = this.mCsd2Data;
        if (bArr3 != null) {
            mediaFormatCreateVideoFormat.setByteBuffer(EncoderConfig.KEY_CSD_2, ByteBuffer.wrap(bArr3));
        }
        if ("video/dolby-vision".equals(str)) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, TPCodecUtils.convertDolbyVisionToOmxProfile(this.mDolbyVisionProfile));
            mediaFormatCreateVideoFormat.setInteger(FirebaseAnalytics.Param.LEVEL, TPCodecUtils.convertDolbyVisionToOmxLevel(this.mDolbyVisionLevel));
        }
        if (this.mEnableMediaCodecOutputData) {
            mediaFormatCreateVideoFormat.setInteger("color-format", 2135033992);
            surface = null;
        } else {
            surface = this.mSurface;
        }
        c35360b.m78217a(mediaFormatCreateVideoFormat, surface, this.mMediaCrypto, 0);
        c35360b.m78227d(1);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public String getCodecName(String str, boolean z11) {
        String dolbyVisionDecoderName;
        int i11 = this.mDolbyVisionProfile;
        return (i11 <= 0 || this.mDisableDolbyVisionComponent || (dolbyVisionDecoderName = TPCodecUtils.getDolbyVisionDecoderName(str, i11, this.mDolbyVisionLevel, z11)) == null) ? TPCodecUtils.getDecoderName(str, z11) : dolbyVisionDecoderName;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public String getLogTag() {
        return TAG;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0070  */
    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i11, int i12, int i13, Surface surface, int i14, int i15, int i16) {
        TPNativeLog.printLog(2, TAG, "initDecoder, mimeType:" + str + " width:" + i11 + " height:" + i12 + " rotation:" + i13 + " dvProfile:" + i15 + " dvLevel:" + i16);
        this.mVideoWidth = i11;
        this.mVideoHeight = i12;
        this.mRotation = i13;
        this.mSurface = surface;
        this.mDrmType = i14;
        this.mDolbyVisionProfile = i15;
        this.mDolbyVisionLevel = i16;
        this.mMimeCandidates.clear();
        if ("video/dolby-vision".equals(str)) {
            int iConvertDolbyVisionToOmxProfile = TPCodecUtils.convertDolbyVisionToOmxProfile(this.mDolbyVisionProfile);
            boolean z11 = iConvertDolbyVisionToOmxProfile >= 4 && iConvertDolbyVisionToOmxProfile <= 256;
            if (this.mDisableDolbyVisionComponent && z11) {
                this.mMimeCandidates.add("video/hevc");
            } else {
                this.mMimeCandidates.add(str);
                if (z11) {
                    this.mMimeCandidates.add("video/hevc");
                }
            }
        } else {
            this.mMimeCandidates.add(str);
        }
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputBuffer(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tPFrameInfo.width = this.mVideoWidth;
        tPFrameInfo.height = this.mVideoHeight;
        tPFrameInfo.cropLeft = this.mCropLeft;
        tPFrameInfo.cropRight = this.mCropRight;
        tPFrameInfo.cropTop = this.mCropTop;
        tPFrameInfo.cropBottom = this.mCropBottom;
        tPFrameInfo.format = TPPixelFormat.TP_PIX_FMT_MEDIACODEC;
        if (this.mEnableMediaCodecOutputData) {
            processOutputData(c35360b, i11, bufferInfo, tPFrameInfo);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputFormatChanged(MediaFormat mediaFormat) {
        boolean z11 = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
        this.mVideoWidth = mediaFormat.getInteger("width");
        this.mVideoHeight = mediaFormat.getInteger("height");
        if (z11) {
            this.mCropLeft = mediaFormat.getInteger(KEY_CROP_LEFT);
            this.mCropRight = mediaFormat.getInteger(KEY_CROP_RIGHT);
            this.mCropTop = mediaFormat.getInteger(KEY_CROP_TOP);
            this.mCropBottom = mediaFormat.getInteger(KEY_CROP_BOTTOM);
        }
        TPNativeLog.printLog(2, TAG, "processOutputFormatChanged: mVideoWidth: " + this.mVideoWidth + ", mVideoHeight: " + this.mVideoHeight + ", mCropLeft: " + this.mCropLeft + ", mCropRight: " + this.mCropRight + ", mCropTop: " + this.mCropTop + ", mCropBottom: " + this.mCropBottom);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOutputSurface(Surface surface) {
        if (this.mEnableMediaCodecOutputData) {
            return 3;
        }
        return super.setOutputSurface(surface);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i11, byte[] bArr) {
        if (i11 == 200) {
            this.mCsd0Data = bArr;
        } else if (i11 == 201) {
            this.mCsd1Data = bArr;
        } else if (i11 == 202) {
            this.mCsd2Data = bArr;
        }
        return super.setParamBytes(i11, bArr);
    }

    public TPMediaCodecVideoDecoder(int i11) {
        super(i11);
        this.mEnableMediaCodecOutputData = false;
        this.mMimeCandidates = new ArrayList<>();
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mCropLeft = 0;
        this.mCropRight = 0;
        this.mCropTop = 0;
        this.mCropBottom = 0;
        this.mRotation = 0;
        this.mDolbyVisionProfile = 0;
        this.mDolbyVisionLevel = 0;
        this.mCsd0Data = null;
        this.mCsd1Data = null;
        this.mCsd2Data = null;
        this.mDisableDolbyVisionComponent = false;
    }

    private void copyVideoDataFromImage(Image image, TPFrameInfo tPFrameInfo) {
        int i11;
        if (image.getFormat() != 35) {
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 3;
            TPNativeLog.printLog(4, TAG, "copyVideoDataFromImage: image format not support!");
            return;
        }
        tPFrameInfo.format = 0;
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        int[] iArr = tPFrameInfo.lineSize;
        if (iArr == null || iArr.length < 3) {
            tPFrameInfo.lineSize = new int[3];
        }
        byte[][] bArr = tPFrameInfo.videoData;
        if (bArr == null || bArr.length < 3) {
            tPFrameInfo.videoData = new byte[3][];
        }
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            copyVideoDataFromPlane(planes[i12], width >> i11, height >> i11, i12, tPFrameInfo);
        }
    }

    private void copyVideoDataFromPlane(Image.Plane plane, int i11, int i12, int i13, TPFrameInfo tPFrameInfo) {
        ByteBuffer buffer = plane.getBuffer();
        tPFrameInfo.lineSize[i13] = i11;
        int i14 = i11 * i12;
        byte[][] bArr = tPFrameInfo.videoData;
        byte[] bArr2 = bArr[i13];
        if (bArr2 == null || bArr2.length < i14) {
            bArr[i13] = new byte[i14];
        }
        if (plane.getPixelStride() == 1) {
            buffer.get(tPFrameInfo.videoData[i13], 0, i14);
            return;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            tPFrameInfo.videoData[i13][i15] = buffer.get(plane.getPixelStride() * i15);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f11) {
        return super.setOperateRate(f11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i11, Object obj) {
        return super.setParamObject(i11, obj);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void processMediaCodecException(Exception exc) {
    }
}
