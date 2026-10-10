package com.otaliastudios.transcoder.internal.audio;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.audio.c */
/* JADX INFO: compiled from: shorts.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/audio/c;", "", "<init>", "()V", "", "name", "", "size", "Ljava/nio/ShortBuffer;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;I)Ljava/nio/ShortBuffer;", "", "Ljava/util/Map;", "map", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27338c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, ShortBuffer> map = new LinkedHashMap();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ShortBuffer m67943a(@NotNull String name, int size) {
        Intrinsics.checkNotNullParameter(name, "name");
        ShortBuffer shortBufferAsShortBuffer = this.map.get(name);
        if (shortBufferAsShortBuffer == null || shortBufferAsShortBuffer.capacity() < size) {
            shortBufferAsShortBuffer = ByteBuffer.allocateDirect(size * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        Intrinsics.checkNotNull(shortBufferAsShortBuffer);
        ShortBuffer shortBuffer = shortBufferAsShortBuffer;
        shortBuffer.clear();
        shortBuffer.limit(size);
        this.map.put(name, shortBufferAsShortBuffer);
        return shortBuffer;
    }
}
