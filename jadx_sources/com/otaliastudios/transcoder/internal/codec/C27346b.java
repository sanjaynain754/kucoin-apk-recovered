package com.otaliastudios.transcoder.internal.codec;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.b */
/* JADX INFO: compiled from: Decoder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0010\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R2\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/b;", "", "Ljava/nio/ByteBuffer;", "buffer", "", "timeUs", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "render", "", "release", "<init>", "(Ljava/nio/ByteBuffer;JLkotlin/jvm/functions/Function1;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/nio/ByteBuffer;", "()Ljava/nio/ByteBuffer;", "b", "J", "c", "()J", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public class C27346b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ByteBuffer buffer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long timeUs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<Boolean, Unit> release;

    /* JADX WARN: Multi-variable type inference failed */
    public C27346b(@NotNull ByteBuffer buffer, long j11, @NotNull Function1<? super Boolean, Unit> release) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(release, "release");
        this.buffer = buffer;
        this.timeUs = j11;
        this.release = release;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function1<Boolean, Unit> m67991b() {
        return this.release;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimeUs() {
        return this.timeUs;
    }
}
