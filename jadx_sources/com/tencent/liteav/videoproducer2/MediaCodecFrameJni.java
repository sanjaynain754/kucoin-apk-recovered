package com.tencent.liteav.videoproducer2;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.EnumC34875c;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class MediaCodecFrameJni {
    public ByteBuffer data;
    public EnumC34875c nalType = EnumC34875c.UNKNOWN;
    public long pts;

    public static MediaCodecFrameJni create() {
        return new MediaCodecFrameJni();
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int getNalType() {
        return this.nalType.mValue;
    }

    public long getPTS() {
        return this.pts;
    }
}
