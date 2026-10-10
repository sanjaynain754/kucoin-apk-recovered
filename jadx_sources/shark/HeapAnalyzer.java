package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.TypeCastException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.sequences.SequencesKt;
import shark.internal.AbstractC44484j;
import shark.internal.C44468a;
import shark.internal.C44471d;
import shark.internal.C44485k;
import shark.internal.C44486l;
import shark.internal.KeyedWeakReferenceMirror;
import shark.internal.PathFinder;

/* JADX INFO: compiled from: HeapAnalyzer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\u0016c\u001cKBB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001c\u001a\u00020\u001b*\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020 *\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f*\u00020\u00182\u0006\u0010$\u001a\u00020#2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0002¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\fH\u0002¢\u0006\u0004\b+\u0010,J5\u00104\u001a\u0002032\u0006\u0010-\u001a\u00020(2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J%\u00108\u001a\u0002032\u0006\u00102\u001a\u0002012\f\u00107\u001a\b\u0012\u0004\u0012\u00020(06H\u0002¢\u0006\u0004\b8\u00109Jo\u0010B\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\f0>*\u00020\u00182\f\u0010:\u001a\b\u0012\u0004\u0012\u00020*0\f2\u0012\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\f0\f2 \u0010?\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0>\u0018\u00010=H\u0002¢\u0006\u0004\bB\u0010CJ-\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\f0\f*\u00020\u00182\f\u0010:\u001a\b\u0012\u0004\u0012\u00020*0\fH\u0002¢\u0006\u0004\bD\u0010EJI\u0010H\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0>\u0018\u00010=*\u00020\u00182\u0012\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\f0\f2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJE\u0010K\u001a\b\u0012\u0004\u0012\u00020%0\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020;0\f2 \u0010?\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0>\u0018\u00010=H\u0002¢\u0006\u0004\bK\u0010LJ5\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\f*\u00020\u00182\f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\f2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020%0\fH\u0002¢\u0006\u0004\bQ\u0010RJ#\u0010U\u001a\b\u0012\u0004\u0012\u00020;0\f2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\fH\u0002¢\u0006\u0004\bU\u0010,J+\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y0>2\u0006\u0010V\u001a\u00020S2\u0006\u0010W\u001a\u00020\u000fH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020Y2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b`\u0010aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010b¨\u0006d"}, m90084d2 = {"Lshark/HeapAnalyzer;", "", "Lshark/OnAnalysisProgressListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lshark/OnAnalysisProgressListener;)V", "Ljava/io/File;", "heapDumpFile", "Lshark/i;", "graph", "Lshark/LeakingObjectFinder;", "leakingObjectFinder", "", "Lshark/u;", "referenceMatchers", "", "computeRetainedHeapSize", "Lshark/ObjectInspector;", "objectInspectors", "Lshark/MetadataExtractor;", "metadataExtractor", "Lshark/HeapAnalysis;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/io/File;Lshark/i;Lshark/LeakingObjectFinder;Ljava/util/List;ZLjava/util/List;Lshark/MetadataExtractor;)Lshark/HeapAnalysis;", "Lshark/HeapAnalyzer$a;", "", "analysisStartNanoTime", "Lshark/HeapAnalysisSuccess;", "c", "(Lshark/HeapAnalyzer$a;Lshark/MetadataExtractor;Lshark/LeakingObjectFinder;Ljava/io/File;J)Lshark/HeapAnalysisSuccess;", "", "leakingObjectIds", "Lshark/HeapAnalyzer$c;", "j", "(Lshark/HeapAnalyzer$a;Ljava/util/Set;)Lshark/HeapAnalyzer$c;", "Lshark/internal/PathFinder$b;", "pathFindingResults", "Lshark/LeakTraceObject;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lshark/HeapAnalyzer$a;Lshark/internal/PathFinder$b;Ljava/util/Set;)Ljava/util/List;", "Lshark/internal/j;", "inputPathResults", "Lshark/HeapAnalyzer$d;", "i", "(Ljava/util/List;)Ljava/util/List;", "pathNode", "path", "", "pathIndex", "Lshark/HeapAnalyzer$e$b;", "parentNode", "", "q", "(Lshark/internal/j;Ljava/util/List;ILshark/HeapAnalyzer$e$b;)V", "", "outputPathResults", "k", "(Lshark/HeapAnalyzer$e$b;Ljava/util/List;)V", "shortestPaths", "Lshark/HeapAnalyzer$b;", "inspectedObjectsByPath", "", "Lkotlin/Pair;", "retainedSizes", "Lshark/ApplicationLeak;", "Lshark/LibraryLeak;", "e", "(Lshark/HeapAnalyzer$a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lkotlin/Pair;", "m", "(Lshark/HeapAnalyzer$a;Ljava/util/List;)Ljava/util/List;", "Lshark/internal/d;", "dominatorTree", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lshark/HeapAnalyzer$a;Ljava/util/List;Lshark/internal/d;)Ljava/util/Map;", "inspectedObjects", "d", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;", "Lshark/internal/j$a;", "shortestChildPath", "leakTraceObjects", "Lshark/LeakTraceReference;", "f", "(Lshark/HeapAnalyzer$a;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lshark/q;", "leakReporters", "g", "reporter", "leakingWins", "Lshark/LeakTraceObject$LeakingStatus;", "", "o", "(Lshark/q;Z)Lkotlin/Pair;", "Lshark/HeapObject;", "heap", "n", "(Lshark/HeapObject;)Ljava/lang/String;", "p", "(J)J", "Lshark/OnAnalysisProgressListener;", "b", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class HeapAnalyzer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final OnAnalysisProgressListener listener;

    /* JADX INFO: renamed from: shark.HeapAnalyzer$a */
    /* JADX INFO: compiled from: HeapAnalyzer.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, m90084d2 = {"Lshark/HeapAnalyzer$a;", "", "Lshark/i;", "graph", "", "Lshark/u;", "referenceMatchers", "", "computeRetainedHeapSize", "Lshark/ObjectInspector;", "objectInspectors", "<init>", "(Lshark/i;Ljava/util/List;ZLjava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/i;", "b", "()Lshark/i;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Z", "()Z", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44420a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC44456i graph;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<AbstractC44499u> referenceMatchers;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final boolean computeRetainedHeapSize;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<ObjectInspector> objectInspectors;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getComputeRetainedHeapSize() {
            return this.computeRetainedHeapSize;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC44456i getGraph() {
            return this.graph;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<ObjectInspector> m97986c() {
            return this.objectInspectors;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final List<AbstractC44499u> m97987d() {
            return this.referenceMatchers;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C44420a(@NotNull InterfaceC44456i interfaceC44456i, @NotNull List<? extends AbstractC44499u> list, boolean z11, @NotNull List<? extends ObjectInspector> list2) {
            this.graph = interfaceC44456i;
            this.referenceMatchers = list;
            this.computeRetainedHeapSize = z11;
            this.objectInspectors = list2;
        }
    }

    /* JADX INFO: renamed from: shark.HeapAnalyzer$b */
    /* JADX INFO: compiled from: HeapAnalyzer.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lshark/HeapAnalyzer$b;", "", "Lshark/HeapObject;", "heapObject", "Lshark/LeakTraceObject$LeakingStatus;", "leakingStatus", "", "leakingStatusReason", "", "labels", "<init>", "(Lshark/HeapObject;Lshark/LeakTraceObject$LeakingStatus;Ljava/lang/String;Ljava/util/Set;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/HeapObject;", "()Lshark/HeapObject;", "b", "Lshark/LeakTraceObject$LeakingStatus;", "c", "()Lshark/LeakTraceObject$LeakingStatus;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/Set;", "()Ljava/util/Set;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44421b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final HeapObject heapObject;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final LeakTraceObject.LeakingStatus leakingStatus;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String leakingStatusReason;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Set<String> labels;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final HeapObject getHeapObject() {
            return this.heapObject;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Set<String> m97989b() {
            return this.labels;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LeakTraceObject.LeakingStatus getLeakingStatus() {
            return this.leakingStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLeakingStatusReason() {
            return this.leakingStatusReason;
        }

        public C44421b(@NotNull HeapObject heapObject, @NotNull LeakTraceObject.LeakingStatus leakingStatus, @NotNull String str, @NotNull Set<String> set) {
            this.heapObject = heapObject;
            this.leakingStatus = leakingStatus;
            this.leakingStatusReason = str;
            this.labels = set;
        }
    }

    /* JADX INFO: renamed from: shark.HeapAnalyzer$c, reason: from toString */
    /* JADX INFO: compiled from: HeapAnalyzer.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lshark/HeapAnalyzer$c;", "", "", "Lshark/ApplicationLeak;", "applicationLeaks", "Lshark/LibraryLeak;", "libraryLeaks", "Lshark/LeakTraceObject;", "unreachableObjects", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "b", "c", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getApplicationLeaks", "getLibraryLeaks", "getUnreachableObjects", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class LeaksAndUnreachableObjects {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<ApplicationLeak> applicationLeaks;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<LibraryLeak> libraryLeaks;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<LeakTraceObject> unreachableObjects;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<ApplicationLeak> m97992a() {
            return this.applicationLeaks;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<LibraryLeak> m97993b() {
            return this.libraryLeaks;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final List<LeakTraceObject> m97994c() {
            return this.unreachableObjects;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeaksAndUnreachableObjects)) {
                return false;
            }
            LeaksAndUnreachableObjects leaksAndUnreachableObjects = (LeaksAndUnreachableObjects) other;
            return Intrinsics.areEqual(this.applicationLeaks, leaksAndUnreachableObjects.applicationLeaks) && Intrinsics.areEqual(this.libraryLeaks, leaksAndUnreachableObjects.libraryLeaks) && Intrinsics.areEqual(this.unreachableObjects, leaksAndUnreachableObjects.unreachableObjects);
        }

        public int hashCode() {
            List<ApplicationLeak> list = this.applicationLeaks;
            int iHashCode = (list != null ? list.hashCode() : 0) * 31;
            List<LibraryLeak> list2 = this.libraryLeaks;
            int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            List<LeakTraceObject> list3 = this.unreachableObjects;
            return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LeaksAndUnreachableObjects(applicationLeaks=" + this.applicationLeaks + ", libraryLeaks=" + this.libraryLeaks + ", unreachableObjects=" + this.unreachableObjects + ")";
        }

        public LeaksAndUnreachableObjects(@NotNull List<ApplicationLeak> list, @NotNull List<LibraryLeak> list2, @NotNull List<LeakTraceObject> list3) {
            this.applicationLeaks = list;
            this.libraryLeaks = list2;
            this.unreachableObjects = list3;
        }
    }

    /* JADX INFO: renamed from: shark.HeapAnalyzer$d */
    /* JADX INFO: compiled from: HeapAnalyzer.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lshark/HeapAnalyzer$d;", "", "Lshark/internal/j$c;", "root", "", "Lshark/internal/j$a;", "childPath", "<init>", "(Lshark/internal/j$c;Ljava/util/List;)V", "Lshark/internal/j;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "Lshark/internal/j$c;", "c", "()Lshark/internal/j$c;", "b", "Ljava/util/List;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44423d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AbstractC44484j.c root;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<AbstractC44484j.a> childPath;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<AbstractC44484j> m97995a() {
            return CollectionsKt.plus((Collection) CollectionsKt.listOf(this.root), (Iterable) this.childPath);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<AbstractC44484j.a> m97996b() {
            return this.childPath;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC44484j.c getRoot() {
            return this.root;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C44423d(@NotNull AbstractC44484j.c cVar, @NotNull List<? extends AbstractC44484j.a> list) {
            this.root = cVar;
            this.childPath = list;
        }
    }

    /* JADX INFO: renamed from: shark.HeapAnalyzer$e */
    /* JADX INFO: compiled from: HeapAnalyzer.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lshark/HeapAnalyzer$e;", "", "<init>", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lshark/HeapAnalyzer$e$b;", "Lshark/HeapAnalyzer$e$a;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static abstract class AbstractC44424e {

        /* JADX INFO: renamed from: shark.HeapAnalyzer$e$a */
        /* JADX INFO: compiled from: HeapAnalyzer.kt */
        @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lshark/HeapAnalyzer$e$a;", "Lshark/HeapAnalyzer$e;", "", "objectId", "Lshark/internal/j;", "pathNode", "<init>", "(JLshark/internal/j;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "getObjectId", "()J", "b", "Lshark/internal/j;", "()Lshark/internal/j;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class a extends AbstractC44424e {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long objectId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final AbstractC44484j pathNode;

            public a(long j11, @NotNull AbstractC44484j abstractC44484j) {
                super(null);
                this.objectId = j11;
                this.pathNode = abstractC44484j;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC44484j getPathNode() {
                return this.pathNode;
            }
        }

        /* JADX INFO: renamed from: shark.HeapAnalyzer$e$b, reason: from toString */
        /* JADX INFO: compiled from: HeapAnalyzer.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lshark/HeapAnalyzer$e$b;", "Lshark/HeapAnalyzer$e;", "", "objectId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "()Ljava/util/Map;", "children", "b", "J", "()J", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class ParentNode extends AbstractC44424e {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<Long, AbstractC44424e> children;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final long objectId;

            public ParentNode(long j11) {
                super(null);
                this.objectId = j11;
                this.children = new LinkedHashMap();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Map<Long, AbstractC44424e> m97999a() {
                return this.children;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public long getObjectId() {
                return this.objectId;
            }

            @NotNull
            public String toString() {
                return "ParentNode(objectId=" + getObjectId() + ", children=" + this.children + ')';
            }
        }

        public AbstractC44424e() {
        }

        public /* synthetic */ AbstractC44424e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ HeapAnalysis m97967b(HeapAnalyzer heapAnalyzer, File file, InterfaceC44456i interfaceC44456i, LeakingObjectFinder leakingObjectFinder, List list, boolean z11, List list2, MetadataExtractor metadataExtractor, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 32) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return heapAnalyzer.m97968a(file, interfaceC44456i, leakingObjectFinder, list3, z12, list2, (i11 & 64) != 0 ? MetadataExtractor.INSTANCE.getNO_OP() : metadataExtractor);
    }

    /* JADX INFO: renamed from: c */
    public final HeapAnalysisSuccess m97969c(C44420a c44420a, MetadataExtractor metadataExtractor, LeakingObjectFinder leakingObjectFinder, File file, long j11) {
        this.listener.onAnalysisProgress(OnAnalysisProgressListener.Step.EXTRACTING_METADATA);
        Map<String, String> mapMo98152a = metadataExtractor.mo98152a(c44420a.getGraph());
        List<KeyedWeakReferenceMirror> listM98147b = KeyedWeakReferenceFinder.f98205a.m98147b(c44420a.getGraph());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM98147b) {
            KeyedWeakReferenceMirror keyedWeakReferenceMirror = (KeyedWeakReferenceMirror) obj;
            if (keyedWeakReferenceMirror.getIsRetained() && !keyedWeakReferenceMirror.getHasReferent()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            mapMo98152a = MapsKt.plus(mapMo98152a, TuplesKt.m90091to("Count of retained yet cleared", size + " KeyedWeakReference instances"));
        }
        Map<String, String> map = mapMo98152a;
        this.listener.onAnalysisProgress(OnAnalysisProgressListener.Step.FINDING_RETAINED_OBJECTS);
        LeaksAndUnreachableObjects leaksAndUnreachableObjectsM97976j = m97976j(c44420a, leakingObjectFinder.mo97966a(c44420a.getGraph()));
        return new HeapAnalysisSuccess(file, System.currentTimeMillis(), 0L, m97982p(j11), map, leaksAndUnreachableObjectsM97976j.m97992a(), leaksAndUnreachableObjectsM97976j.m97993b(), leaksAndUnreachableObjectsM97976j.m97994c(), 4, null);
    }

    /* JADX INFO: renamed from: d */
    public final List<LeakTraceObject> m97970d(List<C44421b> inspectedObjects, Map<Long, Pair<Integer, Integer>> retainedSizes) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(inspectedObjects, 10));
        for (C44421b c44421b : inspectedObjects) {
            HeapObject heapObject = c44421b.getHeapObject();
            String strM97980n = m97980n(heapObject);
            LeakTraceObject.ObjectType objectType = heapObject instanceof HeapObject.HeapClass ? LeakTraceObject.ObjectType.CLASS : ((heapObject instanceof HeapObject.C44426a) || (heapObject instanceof HeapObject.C44427b)) ? LeakTraceObject.ObjectType.ARRAY : LeakTraceObject.ObjectType.INSTANCE;
            Integer second = null;
            Pair<Integer, Integer> pair = retainedSizes != null ? retainedSizes.get(Long.valueOf(c44421b.getHeapObject().getObjectId())) : null;
            Set<String> setM97989b = c44421b.m97989b();
            LeakTraceObject.LeakingStatus leakingStatus = c44421b.getLeakingStatus();
            String leakingStatusReason = c44421b.getLeakingStatusReason();
            Integer first = pair != null ? pair.getFirst() : null;
            if (pair != null) {
                second = pair.getSecond();
            }
            arrayList.add(new LeakTraceObject(objectType, strM97980n, setM97989b, leakingStatus, leakingStatusReason, first, second));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final Pair<List<ApplicationLeak>, List<LibraryLeak>> m97971e(C44420a c44420a, List<C44423d> list, List<? extends List<C44421b>> list2, Map<Long, Pair<Integer, Integer>> map) {
        Object next;
        AbstractC44484j.b bVar;
        this.listener.onAnalysisProgress(OnAnalysisProgressListener.Step.BUILDING_LEAK_TRACES);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C44423d c44423d = (C44423d) obj;
            List<LeakTraceObject> listM97970d = m97970d(list2.get(i11), map);
            LeakTrace leakTrace = new LeakTrace(LeakTrace.GcRootType.INSTANCE.fromGcRoot(c44423d.getRoot().getGcRoot()), m97972f(c44420a, c44423d.m97996b(), listM97970d), (LeakTraceObject) CollectionsKt.last((List) listM97970d));
            if (c44423d.getRoot() instanceof AbstractC44484j.b) {
                bVar = (AbstractC44484j.b) c44423d.getRoot();
            } else {
                Iterator<T> it = c44423d.m97996b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((AbstractC44484j.a) next) instanceof AbstractC44484j.b));
                bVar = (AbstractC44484j.b) next;
            }
            if (bVar != null) {
                C44494p matcher = bVar.getMatcher();
                String strM98412b = C44486l.m98412b(matcher.getPattern().toString());
                Object objM90091to = linkedHashMap2.get(strM98412b);
                if (objM90091to == null) {
                    objM90091to = TuplesKt.m90091to(matcher, new ArrayList());
                    linkedHashMap2.put(strM98412b, objM90091to);
                }
                ((List) ((Pair) objM90091to).getSecond()).add(leakTrace);
            } else {
                String signature = leakTrace.getSignature();
                Object arrayList = linkedHashMap.get(signature);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(signature, arrayList);
                }
                ((List) arrayList).add(leakTrace);
            }
            i11 = i12;
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ApplicationLeak((List) ((Map.Entry) it2.next()).getValue()));
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it3 = linkedHashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            Pair pair = (Pair) ((Map.Entry) it3.next()).getValue();
            C44494p c44494p = (C44494p) pair.component1();
            arrayList3.add(new LibraryLeak((List) pair.component2(), c44494p.getPattern(), c44494p.getCom.tencent.qcloud.tuicore.TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION java.lang.String()));
        }
        return TuplesKt.m90091to(arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: f */
    public final List<LeakTraceReference> m97972f(C44420a c44420a, List<? extends AbstractC44484j.a> list, List<LeakTraceObject> list2) {
        String className;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AbstractC44484j.a aVar = (AbstractC44484j.a) obj;
            LeakTraceObject leakTraceObject = list2.get(i11);
            LeakTraceReference.ReferenceType refFromParentType = aVar.getRefFromParentType();
            if (aVar.getOwningClassId() != 0) {
                HeapObject.HeapClass heapClassM98003c = c44420a.getGraph().mo98078l(aVar.getOwningClassId()).m98003c();
                if (heapClassM98003c == null) {
                    Intrinsics.throwNpe();
                }
                className = heapClassM98003c.m98017p();
            } else {
                className = list2.get(i11).getClassName();
            }
            arrayList.add(new LeakTraceReference(leakTraceObject, refFromParentType, className, aVar.getRefFromParentName()));
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final List<C44421b> m97973g(List<C44495q> leakReporters) {
        int i11;
        Number number;
        LeakTraceObject.LeakingStatus leakingStatus;
        LeakTraceObject.LeakingStatus leakingStatus2;
        Pair pairM90091to;
        Number number2;
        LeakTraceObject.LeakingStatus leakingStatus3;
        LeakTraceObject.LeakingStatus leakingStatus4;
        Pair pairM90091to2;
        int size = leakReporters.size();
        int i12 = size - 1;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = i12;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = leakReporters.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Pair<LeakTraceObject.LeakingStatus, String> pairM97981o = m97981o((C44495q) it.next(), i13 == i12);
            if (i13 == i12) {
                int i14 = C44454g.$EnumSwitchMapping$1[pairM97981o.getFirst().ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        pairM97981o = TuplesKt.m90091to(LeakTraceObject.LeakingStatus.LEAKING, "This is the leaking object");
                    } else {
                        if (i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pairM97981o = TuplesKt.m90091to(LeakTraceObject.LeakingStatus.LEAKING, "This is the leaking object. Conflicts with " + pairM97981o.getSecond());
                    }
                }
            }
            arrayList.add(pairM97981o);
            LeakTraceObject.LeakingStatus leakingStatusComponent1 = pairM97981o.component1();
            if (leakingStatusComponent1 == LeakTraceObject.LeakingStatus.NOT_LEAKING) {
                intRef.element = i13;
                intRef2.element = i12;
            } else if (leakingStatusComponent1 == LeakTraceObject.LeakingStatus.LEAKING && intRef2.element == i12) {
                intRef2.element = i13;
            }
            i13++;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(leakReporters, 10));
        Iterator<T> it2 = leakReporters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C44486l.m98414d(m97980n(((C44495q) it2.next()).getHeapObject()), '.'));
        }
        int i15 = intRef.element;
        int i16 = 0;
        while (i16 < i15) {
            Pair pair = (Pair) arrayList.get(i16);
            LeakTraceObject.LeakingStatus leakingStatus5 = (LeakTraceObject.LeakingStatus) pair.component1();
            String str = (String) pair.component2();
            int i17 = i16 + 1;
            Iterator it3 = SequencesKt.generateSequence(Integer.valueOf(i17), new Function1<Integer, Integer>() { // from class: shark.HeapAnalyzer$computeLeakStatuses$nextNotLeakingIndex$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                {
                    super(1);
                }

                @Nullable
                public final Integer invoke(int i18) {
                    if (i18 < intRef.element) {
                        return Integer.valueOf(i18 + 1);
                    }
                    return null;
                }
            }).iterator();
            do {
                if (!it3.hasNext()) {
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                number2 = (Number) it3.next();
                leakingStatus3 = (LeakTraceObject.LeakingStatus) ((Pair) arrayList.get(number2.intValue())).getFirst();
                leakingStatus4 = LeakTraceObject.LeakingStatus.NOT_LEAKING;
            } while (leakingStatus3 != leakingStatus4);
            String str2 = (String) arrayList2.get(number2.intValue());
            int i18 = C44454g.$EnumSwitchMapping$2[leakingStatus5.ordinal()];
            if (i18 == 1) {
                pairM90091to2 = TuplesKt.m90091to(leakingStatus4, str2 + "↓ is not leaking");
            } else if (i18 == 2) {
                pairM90091to2 = TuplesKt.m90091to(leakingStatus4, str2 + "↓ is not leaking and " + str);
            } else {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                pairM90091to2 = TuplesKt.m90091to(leakingStatus4, str2 + "↓ is not leaking. Conflicts with " + str);
            }
            arrayList.set(i16, pairM90091to2);
            i16 = i17;
        }
        int i19 = intRef2.element;
        int i21 = size - 2;
        if (i19 < i21 && i21 >= (i11 = i19 + 1)) {
            while (true) {
                Pair pair2 = (Pair) arrayList.get(i21);
                LeakTraceObject.LeakingStatus leakingStatus6 = (LeakTraceObject.LeakingStatus) pair2.component1();
                String str3 = (String) pair2.component2();
                Iterator it4 = SequencesKt.generateSequence(Integer.valueOf(i21 - 1), new Function1<Integer, Integer>() { // from class: shark.HeapAnalyzer$computeLeakStatuses$previousLeakingIndex$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    {
                        super(1);
                    }

                    @Nullable
                    public final Integer invoke(int i22) {
                        if (i22 > intRef2.element) {
                            return Integer.valueOf(i22 - 1);
                        }
                        return null;
                    }
                }).iterator();
                do {
                    if (!it4.hasNext()) {
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                    number = (Number) it4.next();
                    leakingStatus = (LeakTraceObject.LeakingStatus) ((Pair) arrayList.get(number.intValue())).getFirst();
                    leakingStatus2 = LeakTraceObject.LeakingStatus.LEAKING;
                } while (leakingStatus != leakingStatus2);
                String str4 = (String) arrayList2.get(number.intValue());
                int i22 = C44454g.$EnumSwitchMapping$3[leakingStatus6.ordinal()];
                if (i22 == 1) {
                    pairM90091to = TuplesKt.m90091to(leakingStatus2, str4 + "↑ is leaking");
                } else {
                    if (i22 != 2) {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("Should never happen");
                    }
                    pairM90091to = TuplesKt.m90091to(leakingStatus2, str4 + "↑ is leaking and " + str3);
                }
                arrayList.set(i21, pairM90091to);
                if (i21 == i11) {
                    break;
                }
                i21--;
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(leakReporters, 10));
        int i23 = 0;
        for (Object obj : leakReporters) {
            int i24 = i23 + 1;
            if (i23 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C44495q c44495q = (C44495q) obj;
            Pair pair3 = (Pair) arrayList.get(i23);
            arrayList3.add(new C44421b(c44495q.getHeapObject(), (LeakTraceObject.LeakingStatus) pair3.component1(), (String) pair3.component2(), c44495q.m98458b()));
            i23 = i24;
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: h */
    public final Map<Long, Pair<Integer, Integer>> m97974h(C44420a c44420a, List<? extends List<C44421b>> list, C44471d c44471d) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                C44421b c44421b = (C44421b) obj;
                if (c44421b.getLeakingStatus() == LeakTraceObject.LeakingStatus.UNKNOWN || c44421b.getLeakingStatus() == LeakTraceObject.LeakingStatus.LEAKING) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((C44421b) it2.next()).getHeapObject().getObjectId()));
            }
            CollectionsKt.addAll(arrayList, arrayList3);
        }
        Set<Long> set = CollectionsKt.toSet(arrayList);
        this.listener.onAnalysisProgress(OnAnalysisProgressListener.Step.COMPUTING_NATIVE_RETAINED_SIZE);
        final Map<Long, Integer> mapM98301a = new C44468a(c44420a.getGraph()).m98301a();
        this.listener.onAnalysisProgress(OnAnalysisProgressListener.Step.COMPUTING_RETAINED_SIZE);
        final C44485k c44485k = new C44485k(c44420a.getGraph());
        return c44471d.m98331b(set, new Function1<Long, Integer>() { // from class: shark.HeapAnalyzer$computeRetainedSizes$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Long l11) {
                return Integer.valueOf(invoke(l11.longValue()));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final int invoke(long j11) {
                Integer num = (Integer) mapM98301a.get(Long.valueOf(j11));
                return (num != null ? num.intValue() : 0) + c44485k.m98410a(j11);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final List<C44423d> m97975i(List<? extends AbstractC44484j> inputPathResults) {
        AbstractC44424e.ParentNode parentNode = new AbstractC44424e.ParentNode(0L);
        for (AbstractC44484j abstractC44484j : inputPathResults) {
            ArrayList arrayList = new ArrayList();
            AbstractC44484j parent = abstractC44484j;
            while (parent instanceof AbstractC44484j.a) {
                arrayList.add(0, Long.valueOf(parent.getObjectId()));
                parent = ((AbstractC44484j.a) parent).getParent();
            }
            arrayList.add(0, Long.valueOf(parent.getObjectId()));
            m97983q(abstractC44484j, arrayList, 0, parentNode);
        }
        ArrayList<AbstractC44484j> arrayList2 = new ArrayList();
        m97977k(parentNode, arrayList2);
        if (arrayList2.size() != inputPathResults.size()) {
            C44500v.f98559a.m98466a();
        } else {
            C44500v.f98559a.m98466a();
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (AbstractC44484j parent2 : arrayList2) {
            ArrayList arrayList4 = new ArrayList();
            while (parent2 instanceof AbstractC44484j.a) {
                arrayList4.add(0, parent2);
                parent2 = ((AbstractC44484j.a) parent2).getParent();
            }
            if (parent2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type shark.internal.ReferencePathNode.RootNode");
            }
            arrayList3.add(new C44423d((AbstractC44484j.c) parent2, arrayList4));
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: j */
    public final LeaksAndUnreachableObjects m97976j(C44420a c44420a, Set<Long> set) {
        PathFinder.C44463b c44463bM98259e = new PathFinder(c44420a.getGraph(), this.listener, c44420a.m97987d()).m98259e(set, c44420a.getComputeRetainedHeapSize());
        List<LeakTraceObject> listM97978l = m97978l(c44420a, c44463bM98259e, set);
        List<C44423d> listM97975i = m97975i(c44463bM98259e.m98273b());
        List<List<C44421b>> listM97979m = m97979m(c44420a, listM97975i);
        Pair<List<ApplicationLeak>, List<LibraryLeak>> pairM97971e = m97971e(c44420a, listM97975i, listM97979m, c44463bM98259e.getDominatorTree() != null ? m97974h(c44420a, listM97979m, c44463bM98259e.getDominatorTree()) : null);
        return new LeaksAndUnreachableObjects(pairM97971e.component1(), pairM97971e.component2(), listM97978l);
    }

    /* JADX INFO: renamed from: m */
    public final List<List<C44421b>> m97979m(C44420a c44420a, List<C44423d> list) {
        this.listener.onAnalysisProgress(OnAnalysisProgressListener.Step.INSPECTING_OBJECTS);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<AbstractC44484j> listM97995a = ((C44423d) it.next()).m97995a();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM97995a, 10));
            int i11 = 0;
            for (Object obj : listM97995a) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C44495q c44495q = new C44495q(c44420a.getGraph().mo98078l(((AbstractC44484j) obj).getObjectId()));
                Object obj2 = i12 < listM97995a.size() ? (AbstractC44484j) listM97995a.get(i12) : null;
                if (obj2 instanceof AbstractC44484j.b) {
                    c44495q.m98458b().add("Library leak match: " + ((AbstractC44484j.b) obj2).getMatcher().getPattern());
                }
                arrayList2.add(c44495q);
                i11 = i12;
            }
            arrayList.add(arrayList2);
        }
        for (ObjectInspector objectInspector : c44420a.m97986c()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((List) it2.next()).iterator();
                while (it3.hasNext()) {
                    objectInspector.inspect((C44495q) it3.next());
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(m97973g((List) it4.next()));
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: n */
    public final String m97980n(HeapObject heap) {
        if (heap instanceof HeapObject.HeapClass) {
            return ((HeapObject.HeapClass) heap).m98017p();
        }
        if (heap instanceof HeapObject.HeapInstance) {
            return ((HeapObject.HeapInstance) heap).m98034p();
        }
        if (heap instanceof HeapObject.C44426a) {
            return ((HeapObject.C44426a) heap).m98043i();
        }
        if (heap instanceof HeapObject.C44427b) {
            return ((HeapObject.C44427b) heap).m98046i();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    public final Pair<LeakTraceObject.LeakingStatus, String> m97981o(C44495q reporter, boolean leakingWins) {
        String strJoinToString$default;
        LeakTraceObject.LeakingStatus leakingStatus = LeakTraceObject.LeakingStatus.UNKNOWN;
        if (reporter.m98460d().isEmpty()) {
            strJoinToString$default = "";
        } else {
            leakingStatus = LeakTraceObject.LeakingStatus.NOT_LEAKING;
            strJoinToString$default = CollectionsKt.joinToString$default(reporter.m98460d(), " and ", null, null, 0, null, null, 62, null);
        }
        Set<String> setM98459c = reporter.m98459c();
        if (!setM98459c.isEmpty()) {
            String strJoinToString$default2 = CollectionsKt.joinToString$default(setM98459c, " and ", null, null, 0, null, null, 62, null);
            if (leakingStatus != LeakTraceObject.LeakingStatus.NOT_LEAKING) {
                leakingStatus = LeakTraceObject.LeakingStatus.LEAKING;
                strJoinToString$default = strJoinToString$default2;
            } else if (leakingWins) {
                leakingStatus = LeakTraceObject.LeakingStatus.LEAKING;
                strJoinToString$default = strJoinToString$default2 + ". Conflicts with " + strJoinToString$default;
            } else {
                strJoinToString$default = strJoinToString$default + ". Conflicts with " + strJoinToString$default2;
            }
        }
        return TuplesKt.m90091to(leakingStatus, strJoinToString$default);
    }

    /* JADX INFO: renamed from: p */
    public final long m97982p(long analysisStartNanoTime) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - analysisStartNanoTime);
    }

    public HeapAnalyzer(@NotNull OnAnalysisProgressListener onAnalysisProgressListener) {
        this.listener = onAnalysisProgressListener;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HeapAnalysis m97968a(@NotNull File heapDumpFile, @NotNull InterfaceC44456i graph, @NotNull LeakingObjectFinder leakingObjectFinder, @NotNull List<? extends AbstractC44499u> referenceMatchers, boolean computeRetainedHeapSize, @NotNull List<? extends ObjectInspector> objectInspectors, @NotNull MetadataExtractor metadataExtractor) {
        long jNanoTime = System.nanoTime();
        try {
            return m97969c(new C44420a(graph, referenceMatchers, computeRetainedHeapSize, objectInspectors), metadataExtractor, leakingObjectFinder, heapDumpFile, jNanoTime);
        } catch (Throwable th2) {
            return new HeapAnalysisFailure(heapDumpFile, System.currentTimeMillis(), 0L, m97982p(jNanoTime), new HeapAnalysisException(th2), 4, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m97977k(AbstractC44424e.ParentNode parentNode, List<AbstractC44484j> outputPathResults) {
        for (AbstractC44424e abstractC44424e : parentNode.m97999a().values()) {
            if (abstractC44424e instanceof AbstractC44424e.ParentNode) {
                m97977k((AbstractC44424e.ParentNode) abstractC44424e, outputPathResults);
            } else if (abstractC44424e instanceof AbstractC44424e.a) {
                outputPathResults.add(((AbstractC44424e.a) abstractC44424e).getPathNode());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final List<LeakTraceObject> m97978l(C44420a c44420a, PathFinder.C44463b c44463b, Set<Long> set) {
        List<AbstractC44484j> listM98273b = c44463b.m98273b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM98273b, 10));
        Iterator<T> it = listM98273b.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((AbstractC44484j) it.next()).getObjectId()));
        }
        Set setMinus = SetsKt.minus((Set) set, (Iterable) CollectionsKt.toSet(arrayList));
        ArrayList<C44495q> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setMinus, 10));
        Iterator it2 = setMinus.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C44495q(c44420a.getGraph().mo98078l(((Number) it2.next()).longValue())));
        }
        for (ObjectInspector objectInspector : c44420a.m97986c()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                objectInspector.inspect((C44495q) it3.next());
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (C44495q c44495q : arrayList2) {
            Pair<LeakTraceObject.LeakingStatus, String> pairM97981o = m97981o(c44495q, true);
            LeakTraceObject.LeakingStatus leakingStatusComponent1 = pairM97981o.component1();
            String strComponent2 = pairM97981o.component2();
            int i11 = C44454g.$EnumSwitchMapping$0[leakingStatusComponent1.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        strComponent2 = "This is a leaking object. Conflicts with " + strComponent2;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    strComponent2 = "This is a leaking object";
                }
            }
            arrayList3.add(new C44421b(c44495q.getHeapObject(), LeakTraceObject.LeakingStatus.LEAKING, strComponent2, c44495q.m98458b()));
        }
        return m97970d(arrayList3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m97983q(AbstractC44484j pathNode, List<Long> path, int pathIndex, final AbstractC44424e.ParentNode parentNode) {
        final long jLongValue = path.get(pathIndex).longValue();
        if (pathIndex == CollectionsKt.getLastIndex(path)) {
            parentNode.m97999a().put(Long.valueOf(jLongValue), new AbstractC44424e.a(jLongValue, pathNode));
            return;
        }
        AbstractC44424e.ParentNode parentNodeInvoke = parentNode.m97999a().get(Long.valueOf(jLongValue));
        if (parentNodeInvoke == null) {
            parentNodeInvoke = new Function0<AbstractC44424e.ParentNode>() { // from class: shark.HeapAnalyzer$updateTrie$childNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final HeapAnalyzer.AbstractC44424e.ParentNode invoke() {
                    HeapAnalyzer.AbstractC44424e.ParentNode parentNode2 = new HeapAnalyzer.AbstractC44424e.ParentNode(jLongValue);
                    parentNode.m97999a().put(Long.valueOf(jLongValue), parentNode2);
                    return parentNode2;
                }
            }.invoke();
        }
        if (parentNodeInvoke instanceof AbstractC44424e.ParentNode) {
            m97983q(pathNode, path, pathIndex + 1, (AbstractC44424e.ParentNode) parentNodeInvoke);
        }
    }
}
