package shark;

import java.io.File;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HeapAnalysis.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lshark/HeapAnalysis;", "Ljava/io/Serializable;", "()V", "analysisDurationMillis", "", "getAnalysisDurationMillis", "()J", "createdAtTimeMillis", "getCreatedAtTimeMillis", "dumpDurationMillis", "getDumpDurationMillis", "heapDumpFile", "Ljava/io/File;", "getHeapDumpFile", "()Ljava/io/File;", "Companion", "Lshark/HeapAnalysisFailure;", "Lshark/HeapAnalysisSuccess;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public abstract class HeapAnalysis implements Serializable {
    public static final long DUMP_DURATION_UNKNOWN = -1;
    private static final long serialVersionUID = -8657286725869987172L;

    private HeapAnalysis() {
    }

    public abstract long getAnalysisDurationMillis();

    public abstract long getCreatedAtTimeMillis();

    public abstract long getDumpDurationMillis();

    @NotNull
    public abstract File getHeapDumpFile();

    public /* synthetic */ HeapAnalysis(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
