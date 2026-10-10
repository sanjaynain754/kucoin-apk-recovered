package com.tencent.liteav.extensions.codec;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
public class HardwareAacEncoder {

    /* JADX INFO: renamed from: a */
    private final AacMediaCodecWrapper f73581a = new AacMediaCodecWrapper(AacMediaCodecWrapper.EnumC34759a.f73577a);

    public ByteBuffer encode(ByteBuffer byteBuffer) {
        return this.f73581a.processFrame(byteBuffer);
    }

    public boolean init(int i11, int i12, int i13) {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i11, i12);
        mediaFormatCreateAudioFormat.setInteger("bitrate", i13);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        return this.f73581a.m76161a(mediaFormatCreateAudioFormat);
    }

    public void unInit() {
        this.f73581a.m76160a();
    }
}
