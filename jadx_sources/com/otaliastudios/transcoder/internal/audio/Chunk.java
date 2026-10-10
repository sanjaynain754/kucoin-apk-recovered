package com.otaliastudios.transcoder.internal.audio;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ShortBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: chunks.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\b\u0018\u0000 %2\u00020\u0001:\u0001'B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/audio/Chunk;", "", "Ljava/nio/ShortBuffer;", "buffer", "", "timeUs", "", "timeStretch", "Lkotlin/Function0;", "", "release", "<init>", "(Ljava/nio/ShortBuffer;JDLkotlin/jvm/functions/Function0;)V", "b", "(Ljava/nio/ShortBuffer;JDLkotlin/jvm/functions/Function0;)Lcom/otaliastudios/transcoder/internal/audio/Chunk;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/nio/ShortBuffer;", "d", "()Ljava/nio/ShortBuffer;", "J", "g", "()J", "c", "D", "f", "()D", "Lkotlin/jvm/functions/Function0;", "e", "()Lkotlin/jvm/functions/Function0;", "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final /* data */ class Chunk {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Chunk f55643f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final ShortBuffer buffer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long timeUs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final double timeStretch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function0<Unit> release;

    /* JADX INFO: compiled from: chunks.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/audio/Chunk$Companion;", "", "()V", "Eos", "Lcom/otaliastudios/transcoder/internal/audio/Chunk;", "getEos", "()Lcom/otaliastudios/transcoder/internal/audio/Chunk;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Chunk getEos() {
            return Chunk.f55643f;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Chunk)) {
            return false;
        }
        Chunk chunk = (Chunk) other;
        return Intrinsics.areEqual(this.buffer, chunk.buffer) && this.timeUs == chunk.timeUs && Intrinsics.areEqual((Object) Double.valueOf(this.timeStretch), (Object) Double.valueOf(chunk.timeStretch)) && Intrinsics.areEqual(this.release, chunk.release);
    }

    static {
        ShortBuffer shortBufferAllocate = ShortBuffer.allocate(0);
        Intrinsics.checkNotNullExpressionValue(shortBufferAllocate, "allocate(0)");
        f55643f = new Chunk(shortBufferAllocate, 0L, 0.0d, new Function0<Unit>() { // from class: com.otaliastudios.transcoder.internal.audio.Chunk$Companion$Eos$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    public Chunk(@NotNull ShortBuffer buffer, long j11, double d11, @NotNull Function0<Unit> release) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(release, "release");
        this.buffer = buffer;
        this.timeUs = j11;
        this.timeStretch = d11;
        this.release = release;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Chunk m67929c(Chunk chunk, ShortBuffer shortBuffer, long j11, double d11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            shortBuffer = chunk.buffer;
        }
        if ((i11 & 2) != 0) {
            j11 = chunk.timeUs;
        }
        if ((i11 & 4) != 0) {
            d11 = chunk.timeStretch;
        }
        if ((i11 & 8) != 0) {
            function0 = chunk.release;
        }
        Function0 function1 = function0;
        return chunk.m67930b(shortBuffer, j11, d11, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Chunk m67930b(@NotNull ShortBuffer buffer, long timeUs, double timeStretch, @NotNull Function0<Unit> release) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(release, "release");
        return new Chunk(buffer, timeUs, timeStretch, release);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ShortBuffer getBuffer() {
        return this.buffer;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Function0<Unit> m67932e() {
        return this.release;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getTimeStretch() {
        return this.timeStretch;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTimeUs() {
        return this.timeUs;
    }

    public int hashCode() {
        return (((((this.buffer.hashCode() * 31) + Long.hashCode(this.timeUs)) * 31) + Double.hashCode(this.timeStretch)) * 31) + this.release.hashCode();
    }

    @NotNull
    public String toString() {
        return "Chunk(buffer=" + this.buffer + ", timeUs=" + this.timeUs + ", timeStretch=" + this.timeStretch + ", release=" + this.release + ')';
    }
}
