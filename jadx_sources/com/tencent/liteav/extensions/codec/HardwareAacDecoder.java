package com.tencent.liteav.extensions.codec;

import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.EncoderConfig;
import com.tencent.liteav.base.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
public class HardwareAacDecoder {

    /* JADX INFO: renamed from: a */
    private final AacMediaCodecWrapper f73580a = new AacMediaCodecWrapper(AacMediaCodecWrapper.EnumC34759a.f73578b);

    public ByteBuffer decode(ByteBuffer byteBuffer) {
        return this.f73580a.processFrame(byteBuffer);
    }

    public int getCacheSize() {
        return this.f73580a.f73572b;
    }

    public int getOutputChannelCount() {
        MediaFormat mediaFormat = this.f73580a.f73571a;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("channel-count");
        } catch (Exception e11) {
            Log.m76033e("HardwareAacDecoder", "getOutputChannelCount failed. ".concat(String.valueOf(e11)), new Object[0]);
            return -1;
        }
    }

    public int getOutputSampleRate() {
        MediaFormat mediaFormat = this.f73580a.f73571a;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("sample-rate");
        } catch (Exception e11) {
            Log.m76033e("HardwareAacDecoder", "getOutputSampleRate failed. ".concat(String.valueOf(e11)), new Object[0]);
            return -1;
        }
    }

    public boolean init(int i11, int i12, ByteBuffer byteBuffer) {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i11, i12);
        mediaFormatCreateAudioFormat.setString("mime", "audio/mp4a-latm");
        mediaFormatCreateAudioFormat.setByteBuffer(EncoderConfig.KEY_CSD_0, byteBuffer);
        return this.f73580a.m76161a(mediaFormatCreateAudioFormat);
    }

    public void unInit() {
        this.f73580a.m76160a();
    }
}
