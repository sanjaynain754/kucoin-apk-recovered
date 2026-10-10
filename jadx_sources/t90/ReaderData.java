package t90;

import aa0.InterfaceC0214b;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: t90.c, reason: from toString */
/* JADX INFO: compiled from: Reader.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lt90/c;", "", "Laa0/b$a;", "chunk", "", "id", "<init>", "(Laa0/b$a;I)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Laa0/b$a;", "b", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laa0/b$a;", "c", "I", "d", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final /* data */ class ReaderData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final InterfaceC0214b.a chunk;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int id;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderData)) {
            return false;
        }
        ReaderData readerData = (ReaderData) other;
        return Intrinsics.areEqual(this.chunk, readerData.chunk) && this.id == readerData.id;
    }

    public ReaderData(@NotNull InterfaceC0214b.a chunk, int i11) {
        Intrinsics.checkNotNullParameter(chunk, "chunk");
        this.chunk = chunk;
        this.id = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC0214b.a getChunk() {
        return this.chunk;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC0214b.a m98942c() {
        return this.chunk;
    }

    /* JADX INFO: renamed from: d */
    public final int m98943d() {
        return this.id;
    }

    public int hashCode() {
        return (this.chunk.hashCode() * 31) + Integer.hashCode(this.id);
    }

    @NotNull
    public String toString() {
        return "ReaderData(chunk=" + this.chunk + ", id=" + this.id + ')';
    }
}
