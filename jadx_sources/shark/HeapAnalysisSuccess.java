package shark;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: HeapAnalysis.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\fHÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\b\u00103\u001a\u00020\nH\u0016R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001b¨\u00065"}, m90084d2 = {"Lshark/HeapAnalysisSuccess;", "Lshark/HeapAnalysis;", "heapDumpFile", "Ljava/io/File;", "createdAtTimeMillis", "", "dumpDurationMillis", "analysisDurationMillis", "metadata", "", "", "applicationLeaks", "", "Lshark/ApplicationLeak;", "libraryLeaks", "Lshark/LibraryLeak;", "unreachableObjects", "Lshark/LeakTraceObject;", "(Ljava/io/File;JJJLjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "allLeaks", "Lkotlin/sequences/Sequence;", "Lshark/Leak;", "getAllLeaks", "()Lkotlin/sequences/Sequence;", "getAnalysisDurationMillis", "()J", "getApplicationLeaks", "()Ljava/util/List;", "getCreatedAtTimeMillis", "getDumpDurationMillis", "getHeapDumpFile", "()Ljava/io/File;", "getLibraryLeaks", "getMetadata", "()Ljava/util/Map;", "getUnreachableObjects", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class HeapAnalysisSuccess extends HeapAnalysis {
    private static final long serialVersionUID = 130453013437459642L;
    private final long analysisDurationMillis;

    @NotNull
    private final List<ApplicationLeak> applicationLeaks;
    private final long createdAtTimeMillis;
    private final long dumpDurationMillis;

    @NotNull
    private final File heapDumpFile;

    @NotNull
    private final List<LibraryLeak> libraryLeaks;

    @NotNull
    private final Map<String, String> metadata;

    @NotNull
    private final List<LeakTraceObject> unreachableObjects;

    public /* synthetic */ HeapAnalysisSuccess(File file, long j11, long j12, long j13, Map map, List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, j11, (i11 & 4) != 0 ? -1L : j12, j13, map, list, list2, list3);
    }

    public HeapAnalysisSuccess(@NotNull File file, long j11, long j12, long j13, @NotNull Map<String, String> map, @NotNull List<ApplicationLeak> list, @NotNull List<LibraryLeak> list2, @NotNull List<LeakTraceObject> list3) {
        super(null);
        this.heapDumpFile = file;
        this.createdAtTimeMillis = j11;
        this.dumpDurationMillis = j12;
        this.analysisDurationMillis = j13;
        this.metadata = map;
        this.applicationLeaks = list;
        this.libraryLeaks = list2;
        this.unreachableObjects = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeapAnalysisSuccess copy$default(HeapAnalysisSuccess heapAnalysisSuccess, File file, long j11, long j12, long j13, Map map, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            file = heapAnalysisSuccess.getHeapDumpFile();
        }
        if ((i11 & 2) != 0) {
            j11 = heapAnalysisSuccess.getCreatedAtTimeMillis();
        }
        if ((i11 & 4) != 0) {
            j12 = heapAnalysisSuccess.getDumpDurationMillis();
        }
        if ((i11 & 8) != 0) {
            j13 = heapAnalysisSuccess.getAnalysisDurationMillis();
        }
        if ((i11 & 16) != 0) {
            map = heapAnalysisSuccess.metadata;
        }
        if ((i11 & 32) != 0) {
            list = heapAnalysisSuccess.applicationLeaks;
        }
        if ((i11 & 64) != 0) {
            list2 = heapAnalysisSuccess.libraryLeaks;
        }
        if ((i11 & 128) != 0) {
            list3 = heapAnalysisSuccess.unreachableObjects;
        }
        long j14 = j13;
        long j15 = j12;
        return heapAnalysisSuccess.copy(file, j11, j15, j14, map, list, list2, list3);
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.metadata;
    }

    @NotNull
    public final List<ApplicationLeak> component6() {
        return this.applicationLeaks;
    }

    @NotNull
    public final List<LibraryLeak> component7() {
        return this.libraryLeaks;
    }

    @NotNull
    public final List<LeakTraceObject> component8() {
        return this.unreachableObjects;
    }

    @NotNull
    public final HeapAnalysisSuccess copy(@NotNull File heapDumpFile, long createdAtTimeMillis, long dumpDurationMillis, long analysisDurationMillis, @NotNull Map<String, String> metadata, @NotNull List<ApplicationLeak> applicationLeaks, @NotNull List<LibraryLeak> libraryLeaks, @NotNull List<LeakTraceObject> unreachableObjects) {
        return new HeapAnalysisSuccess(heapDumpFile, createdAtTimeMillis, dumpDurationMillis, analysisDurationMillis, metadata, applicationLeaks, libraryLeaks, unreachableObjects);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeapAnalysisSuccess)) {
            return false;
        }
        HeapAnalysisSuccess heapAnalysisSuccess = (HeapAnalysisSuccess) other;
        return Intrinsics.areEqual(getHeapDumpFile(), heapAnalysisSuccess.getHeapDumpFile()) && getCreatedAtTimeMillis() == heapAnalysisSuccess.getCreatedAtTimeMillis() && getDumpDurationMillis() == heapAnalysisSuccess.getDumpDurationMillis() && getAnalysisDurationMillis() == heapAnalysisSuccess.getAnalysisDurationMillis() && Intrinsics.areEqual(this.metadata, heapAnalysisSuccess.metadata) && Intrinsics.areEqual(this.applicationLeaks, heapAnalysisSuccess.applicationLeaks) && Intrinsics.areEqual(this.libraryLeaks, heapAnalysisSuccess.libraryLeaks) && Intrinsics.areEqual(this.unreachableObjects, heapAnalysisSuccess.unreachableObjects);
    }

    @NotNull
    public final Sequence<Leak> getAllLeaks() {
        return SequencesKt.plus(CollectionsKt.asSequence(this.applicationLeaks), CollectionsKt.asSequence(this.libraryLeaks));
    }

    @Override // shark.HeapAnalysis
    public long getAnalysisDurationMillis() {
        return this.analysisDurationMillis;
    }

    @NotNull
    public final List<ApplicationLeak> getApplicationLeaks() {
        return this.applicationLeaks;
    }

    @Override // shark.HeapAnalysis
    public long getCreatedAtTimeMillis() {
        return this.createdAtTimeMillis;
    }

    @Override // shark.HeapAnalysis
    public long getDumpDurationMillis() {
        return this.dumpDurationMillis;
    }

    @Override // shark.HeapAnalysis
    @NotNull
    public File getHeapDumpFile() {
        return this.heapDumpFile;
    }

    @NotNull
    public final List<LibraryLeak> getLibraryLeaks() {
        return this.libraryLeaks;
    }

    @NotNull
    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final List<LeakTraceObject> getUnreachableObjects() {
        return this.unreachableObjects;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("====================================\nHEAP ANALYSIS RESULT\n====================================\n");
        sb2.append(this.applicationLeaks.size());
        sb2.append(" APPLICATION LEAKS\n\nReferences underlined with \"~~~\" are likely causes.\nLearn more at https://squ.re/leaks.\n");
        String string = "";
        sb2.append(this.applicationLeaks.isEmpty() ? "" : ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + CollectionsKt.joinToString$default(this.applicationLeaks, "\n\n", null, null, 0, null, null, 62, null) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("====================================\n");
        sb2.append(this.libraryLeaks.size());
        sb2.append(" LIBRARY LEAKS\n\nA Library Leak is a leak caused by a known bug in 3rd party code that you do not have control over.\nSee https://square.github.io/leakcanary/fundamentals-how-leakcanary-works/#4-categorizing-leaks\n");
        sb2.append(this.libraryLeaks.isEmpty() ? "" : ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + CollectionsKt.joinToString$default(this.libraryLeaks, "\n\n", null, null, 0, null, null, 62, null) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("====================================\n");
        sb2.append(this.unreachableObjects.size());
        sb2.append(" UNREACHABLE OBJECTS\n\nAn unreachable object is still in memory but LeakCanary could not find a strong reference path\nfrom GC roots.\n");
        sb2.append(this.unreachableObjects.isEmpty() ? "" : ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + CollectionsKt.joinToString$default(this.unreachableObjects, "\n\n", null, null, 0, null, null, 62, null) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("====================================\nMETADATA\n\nPlease include this in bug reports and Stack Overflow questions.\n");
        if (!this.metadata.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            Map<String, String> map = this.metadata;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(entry.getKey() + ": " + entry.getValue());
            }
            sb3.append(CollectionsKt.joinToString$default(arrayList, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 62, null));
            string = sb3.toString();
        }
        sb2.append(string);
        sb2.append("\nAnalysis duration: ");
        sb2.append(getAnalysisDurationMillis());
        sb2.append(" ms\nHeap dump file path: ");
        sb2.append(getHeapDumpFile().getAbsolutePath());
        sb2.append("\nHeap dump timestamp: ");
        sb2.append(getCreatedAtTimeMillis());
        sb2.append("\nHeap dump duration: ");
        sb2.append(getDumpDurationMillis() != -1 ? getDumpDurationMillis() + " ms" : "Unknown");
        sb2.append("\n====================================");
        return sb2.toString();
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
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        File heapDumpFile = getHeapDumpFile();
        int iHashCode5 = 0;
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
        Map<String, String> map = this.metadata;
        if (map != null) {
            iHashCode2 = map.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i14 = (i13 + iHashCode2) * 31;
        List<ApplicationLeak> list = this.applicationLeaks;
        if (list != null) {
            iHashCode3 = list.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i15 = (i14 + iHashCode3) * 31;
        List<LibraryLeak> list2 = this.libraryLeaks;
        if (list2 != null) {
            iHashCode4 = list2.hashCode();
        } else {
            iHashCode4 = 0;
        }
        int i16 = (i15 + iHashCode4) * 31;
        List<LeakTraceObject> list3 = this.unreachableObjects;
        if (list3 != null) {
            iHashCode5 = list3.hashCode();
        }
        return i16 + iHashCode5;
    }
}
