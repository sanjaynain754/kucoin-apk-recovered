package com.tencent.bugly.common.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/video/SimpleFrameMuxer;", "", "getVideoTime", "", "isStarted", "", "muxVideoFrame", "", "encodedData", "Ljava/nio/ByteBuffer;", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "release", "start", "videoFormat", "Landroid/media/MediaFormat;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface SimpleFrameMuxer {
    long getVideoTime();

    boolean isStarted();

    void muxVideoFrame(@NotNull ByteBuffer encodedData, @NotNull MediaCodec.BufferInfo bufferInfo);

    void release();

    void start(@NotNull MediaFormat videoFormat);
}
