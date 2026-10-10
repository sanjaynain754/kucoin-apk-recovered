package shark;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HeapAnalysis.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, m90084d2 = {"Lshark/HeapAnalysisFailure;", "Lshark/HeapAnalysis;", "heapDumpFile", "Ljava/io/File;", "createdAtTimeMillis", "", "dumpDurationMillis", "analysisDurationMillis", "exception", "Lshark/HeapAnalysisException;", "(Ljava/io/File;JJJLshark/HeapAnalysisException;)V", "getAnalysisDurationMillis", "()J", "getCreatedAtTimeMillis", "getDumpDurationMillis", "getException", "()Lshark/HeapAnalysisException;", "getHeapDumpFile", "()Ljava/io/File;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class HeapAnalysisFailure extends HeapAnalysis {
    private static final long serialVersionUID = 8483254400637792414L;
    private final long analysisDurationMillis;
    private final long createdAtTimeMillis;
    private final long dumpDurationMillis;

    @NotNull
    private final HeapAnalysisException exception;

    @NotNull
    private final File heapDumpFile;

    public /* synthetic */ HeapAnalysisFailure(File file, long j11, long j12, long j13, HeapAnalysisException heapAnalysisException, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, j11, (i11 & 4) != 0 ? -1L : j12, j13, heapAnalysisException);
    }

    public HeapAnalysisFailure(@NotNull File file, long j11, long j12, long j13, @NotNull HeapAnalysisException heapAnalysisException) {
        super(null);
        this.heapDumpFile = file;
        this.createdAtTimeMillis = j11;
        this.dumpDurationMillis = j12;
        this.analysisDurationMillis = j13;
        this.exception = heapAnalysisException;
    }

    public static /* synthetic */ HeapAnalysisFailure copy$default(HeapAnalysisFailure heapAnalysisFailure, File file, long j11, long j12, long j13, HeapAnalysisException heapAnalysisException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            file = heapAnalysisFailure.getHeapDumpFile();
        }
        if ((i11 & 2) != 0) {
            j11 = heapAnalysisFailure.getCreatedAtTimeMillis();
        }
        if ((i11 & 4) != 0) {
            j12 = heapAnalysisFailure.getDumpDurationMillis();
        }
        if ((i11 & 8) != 0) {
            j13 = heapAnalysisFailure.getAnalysisDurationMillis();
        }
        if ((i11 & 16) != 0) {
            heapAnalysisException = heapAnalysisFailure.exception;
        }
        HeapAnalysisException heapAnalysisException2 = heapAnalysisException;
        long j14 = j13;
        return heapAnalysisFailure.copy(file, j11, j12, j14, heapAnalysisException2);
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HeapAnalysisException getException() {
        return this.exception;
    }

    @NotNull
    public final HeapAnalysisFailure copy(@NotNull File heapDumpFile, long createdAtTimeMillis, long dumpDurationMillis, long analysisDurationMillis, @NotNull HeapAnalysisException exception) {
        return new HeapAnalysisFailure(heapDumpFile, createdAtTimeMillis, dumpDurationMillis, analysisDurationMillis, exception);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeapAnalysisFailure)) {
            return false;
        }
        HeapAnalysisFailure heapAnalysisFailure = (HeapAnalysisFailure) other;
        return Intrinsics.areEqual(getHeapDumpFile(), heapAnalysisFailure.getHeapDumpFile()) && getCreatedAtTimeMillis() == heapAnalysisFailure.getCreatedAtTimeMillis() && getDumpDurationMillis() == heapAnalysisFailure.getDumpDurationMillis() && getAnalysisDurationMillis() == heapAnalysisFailure.getAnalysisDurationMillis() && Intrinsics.areEqual(this.exception, heapAnalysisFailure.exception);
    }

    @Override // shark.HeapAnalysis
    public long getAnalysisDurationMillis() {
        return this.analysisDurationMillis;
    }

    @Override // shark.HeapAnalysis
    public long getCreatedAtTimeMillis() {
        return this.createdAtTimeMillis;
    }

    @Override // shark.HeapAnalysis
    public long getDumpDurationMillis() {
        return this.dumpDurationMillis;
    }

    @NotNull
    public final HeapAnalysisException getException() {
        return this.exception;
    }

    @Override // shark.HeapAnalysis
    @NotNull
    public File getHeapDumpFile() {
        return this.heapDumpFile;
    }

    @NotNull
    public String toString() {
        return "====================================\nHEAP ANALYSIS FAILED\n\nYou can report this failure at https://github.com/square/leakcanary/issues\nPlease provide the stacktrace, metadata and the heap dump file.\n====================================\nSTACKTRACE\n\n" + this.exception + "====================================\nMETADATA\n\nBuild.VERSION.SDK_INT: " + C44453f.m98173e() + "\nBuild.MANUFACTURER: " + C44453f.m98172d() + "\nLeakCanary version: " + C44453f.m98174f() + "\nAnalysis duration: " + getAnalysisDurationMillis() + " ms\nHeap dump file path: " + getHeapDumpFile().getAbsolutePath() + "\nHeap dump timestamp: " + getCreatedAtTimeMillis() + "\n====================================";
    }

    @NotNull
    public final File component1() {
        return getHeapDumpFile();
    }

    public final long component2() {
        return getCreatedAtTimeMillis();
    }

    public final long component3() {
        return getDumpDurationMillis();
    }

    public final long component4() {
        return getAnalysisDurationMillis();
    }

    public int hashCode() {
        int iHashCode;
        File heapDumpFile = getHeapDumpFile();
        int iHashCode2 = 0;
        if (heapDumpFile != null) {
            iHashCode = heapDumpFile.hashCode();
        } else {
            iHashCode = 0;
        }
        long createdAtTimeMillis = getCreatedAtTimeMillis();
        int i11 = ((iHashCode * 31) + ((int) (createdAtTimeMillis ^ (createdAtTimeMillis >>> 32)))) * 31;
        long dumpDurationMillis = getDumpDurationMillis();
        int i12 = (i11 + ((int) (dumpDurationMillis ^ (dumpDurationMillis >>> 32)))) * 31;
        long analysisDurationMillis = getAnalysisDurationMillis();
        int i13 = (i12 + ((int) (analysisDurationMillis ^ (analysisDurationMillis >>> 32)))) * 31;
        HeapAnalysisException heapAnalysisException = this.exception;
        if (heapAnalysisException != null) {
            iHashCode2 = heapAnalysisException.hashCode();
        }
        return i13 + iHashCode2;
    }
}
