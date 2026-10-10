package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;
import com.tencent.liteav.videobase.videobase.C34908e;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class NativeEncoderDataListener extends VideoEncoderDef.AbstractC34963b {
    public static final String TAG = "NativeEncoderDataListener";
    private long mNativeVideoEncodeDataListener;
    private int mStreamType;

    private native void nativeOnEncodedFail(long j11, int i11, int i12);

    private native void nativeOnEncodedNAL(long j11, int i11, EncodedVideoFrame encodedVideoFrame, ByteBuffer byteBuffer, ProducerChainTimestamp producerChainTimestamp, int i12, int i13, int i14, int i15, long j12, long j13, long j14, long j15, long j16, long j17, int i16, int i17, boolean z11, int i18);

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.AbstractC34963b
    public synchronized void onEncodedFail(C34908e.a aVar) {
        long j11 = this.mNativeVideoEncodeDataListener;
        if (j11 != 0) {
            nativeOnEncodedFail(j11, this.mStreamType, C34908e.m76567a(aVar));
        } else {
            LiteavLog.m76087i(TAG, "onEncodedFail nativeclient is zero.");
        }
    }

    public synchronized void reset() {
        this.mNativeVideoEncodeDataListener = 0L;
    }

    @Override // com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.AbstractC34963b
    public synchronized void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z11) {
        long j11 = this.mNativeVideoEncodeDataListener;
        if (j11 == 0 || z11) {
            LiteavLog.m76080d(TAG, "onEncodedNAL mNativeVideoEncodeDataListener=%d,isEos=%b", Long.valueOf(j11), Boolean.valueOf(z11));
            return;
        }
        int i11 = this.mStreamType;
        ByteBuffer byteBuffer = encodedVideoFrame.data;
        ProducerChainTimestamp producerChainTimestamp = encodedVideoFrame.producerChainTimestamp;
        int i12 = encodedVideoFrame.nalType.mValue;
        int i13 = encodedVideoFrame.profileType.mValue;
        int i14 = encodedVideoFrame.codecType.mValue;
        int i15 = encodedVideoFrame.rotation;
        long j12 = encodedVideoFrame.dts;
        long j13 = encodedVideoFrame.pts;
        long j14 = encodedVideoFrame.gopIndex;
        long j15 = encodedVideoFrame.gopFrameIndex;
        long j16 = encodedVideoFrame.frameIndex;
        long j17 = encodedVideoFrame.refFrameIndex;
        int i16 = encodedVideoFrame.width;
        int i17 = encodedVideoFrame.height;
        Integer num = encodedVideoFrame.svcInfo;
        nativeOnEncodedNAL(j11, i11, encodedVideoFrame, byteBuffer, producerChainTimestamp, i12, i13, i14, i15, j12, j13, j14, j15, j16, j17, i16, i17, num != null, num != null ? num.intValue() : 0);
    }

    public NativeEncoderDataListener(long j11, int i11) {
        this.mNativeVideoEncodeDataListener = j11;
        this.mStreamType = i11;
    }
}
