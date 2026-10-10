package com.tencent.thumbplayer.tcmedia.core.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncoderConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.p164g.C35360b;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes63.dex */
public class TPMediaCodecAudioDecoder extends TPBaseMediaCodecDecoder {
    private static final String TAG = "TPMediaCodecAudioDecoder";
    private int mAudioFormat;
    private int mChannelCount;
    private byte[] mCsd0Data;
    private boolean mEnableAudioPassThrough;
    private boolean mIsAdts;
    private ArrayList<String> mMimeCandidates;
    private int mSampleRate;

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public ArrayList<String> getMimeCandidates() {
        return this.mMimeCandidates;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i11, int i12, int i13, int i14) {
        TPNativeLog.printLog(2, TAG, "initDecoder, mimeType:" + str + " sampleRate:" + i11 + " channelCount:" + i12 + " drmType:" + i13 + " audioFormat:" + i14);
        this.mSampleRate = i11;
        this.mChannelCount = i12;
        this.mDrmType = i13;
        this.mAudioFormat = i14;
        this.mMimeCandidates.clear();
        this.mMimeCandidates.add(str);
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputConfigData(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        c35360b.m78216a(i11, false);
        tPFrameInfo.errCode = 1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i11, boolean z11) {
        if (i11 == 2) {
            this.mIsAdts = z11;
            return true;
        }
        if (i11 != 3) {
            return super.setParamBool(i11, z11);
        }
        this.mEnableAudioPassThrough = z11;
        TPNativeLog.printLog(2, getLogTag(), "setParamBool mEnableAudioPassThrough:" + this.mEnableAudioPassThrough);
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void configCodec(C35360b c35360b, String str) {
        TPNativeLog.printLog(2, TAG, "configCodec: ");
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, this.mSampleRate, this.mChannelCount);
        byte[] bArr = this.mCsd0Data;
        if (bArr != null) {
            mediaFormatCreateAudioFormat.setByteBuffer(EncoderConfig.KEY_CSD_0, ByteBuffer.wrap(bArr));
        }
        if (this.mIsAdts) {
            TPNativeLog.printLog(2, TAG, "configCodec: set is adts");
            mediaFormatCreateAudioFormat.setInteger("is-adts", 1);
        }
        c35360b.m78217a(mediaFormatCreateAudioFormat, null, this.mMediaCrypto, 0);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public String getLogTag() {
        return TAG;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i11, int i12, int i13, Surface surface, int i14, int i15, int i16) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputBuffer(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        byte[] bArr;
        tPFrameInfo.sampleRate = this.mSampleRate;
        tPFrameInfo.channelCount = this.mChannelCount;
        tPFrameInfo.format = this.mAudioFormat;
        ByteBuffer byteBufferM78213a = c35360b.m78213a(i11);
        if (byteBufferM78213a != null) {
            int i12 = bufferInfo.size;
            bArr = new byte[i12];
            byteBufferM78213a.get(bArr, bufferInfo.offset, i12);
        } else {
            bArr = null;
        }
        tPFrameInfo.data = bArr;
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            TPNativeLog.printLog(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            tPFrameInfo.errCode = 2;
        }
        c35360b.m78216a(i11, false);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputFormatChanged(MediaFormat mediaFormat) {
        int i11;
        int integer;
        try {
            if (mediaFormat.containsKey("sample-rate")) {
                this.mSampleRate = mediaFormat.getInteger("sample-rate");
            }
            if (mediaFormat.containsKey("channel-count")) {
                this.mChannelCount = mediaFormat.getInteger("channel-count");
            }
            if (mediaFormat.containsKey("pcm-encoding")) {
                integer = mediaFormat.getInteger("pcm-encoding");
                try {
                    TPNativeLog.printLog(2, TAG, "processOutputFormatChanged: MediaFormat.KEY_PCM_ENCODING: ".concat(String.valueOf(integer)));
                } catch (Exception e11) {
                    i11 = integer;
                    e = e11;
                    TPNativeLog.printLog(4, TAG, "processOutputFormatChanged got one exception: " + getStackTrace(e));
                    integer = i11;
                }
            } else {
                integer = 2;
            }
        } catch (Exception e12) {
            e = e12;
            i11 = 2;
        }
        TPNativeLog.printLog(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.mEnableAudioPassThrough + ", mSampleRate: " + this.mSampleRate + ", mChannelCount: " + this.mChannelCount + " mAudioFormat: " + this.mAudioFormat + " pcmFormat:" + integer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i11, byte[] bArr) {
        if (i11 == 200) {
            this.mCsd0Data = bArr;
        }
        return super.setParamBytes(i11, bArr);
    }

    public TPMediaCodecAudioDecoder(int i11) {
        super(i11);
        this.mMimeCandidates = new ArrayList<>();
        this.mSampleRate = 0;
        this.mChannelCount = 0;
        this.mAudioFormat = 0;
        this.mCsd0Data = null;
        this.mIsAdts = false;
        this.mEnableAudioPassThrough = false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public String getCodecName(String str, boolean z11) {
        return TPCodecUtils.getDecoderName(str, z11);
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
