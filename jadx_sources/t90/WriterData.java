package t90;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: t90.g, reason: from toString */
/* JADX INFO: compiled from: Writer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m90084d2 = {"Lt90/g;", "", "Ljava/nio/ByteBuffer;", "buffer", "", "timeUs", "", "flags", "Lkotlin/Function0;", "", "release", "<init>", "(Ljava/nio/ByteBuffer;JILkotlin/jvm/functions/Function0;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/nio/ByteBuffer;", "b", "()J", "c", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/nio/ByteBuffer;", "getBuffer", "J", "getTimeUs", "I", "getFlags", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final /* data */ class WriterData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final ByteBuffer buffer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long timeUs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final int flags;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function0<Unit> release;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WriterData)) {
            return false;
        }
        WriterData writerData = (WriterData) other;
        return Intrinsics.areEqual(this.buffer, writerData.buffer) && this.timeUs == writerData.timeUs && this.flags == writerData.flags && Intrinsics.areEqual(this.release, writerData.release);
    }

    public WriterData(@NotNull ByteBuffer buffer, long j11, int i11, @NotNull Function0<Unit> release) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(release, "release");
        this.buffer = buffer;
        this.timeUs = j11;
        this.flags = i11;
        this.release = release;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimeUs() {
        return this.timeUs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Function0<Unit> m98949d() {
        return this.release;
    }

    public int hashCode() {
        return (((((this.buffer.hashCode() * 31) + Long.hashCode(this.timeUs)) * 31) + Integer.hashCode(this.flags)) * 31) + this.release.hashCode();
    }

    @NotNull
    public String toString() {
        return "WriterData(buffer=" + this.buffer + ", timeUs=" + this.timeUs + ", flags=" + this.flags + ", release=" + this.release + ')';
    }
}
