package shark.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.TypeCastException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.ranges.RangesKt;
import shark.AbstractC44451d;
import shark.AbstractC44490l;
import shark.AbstractC44499u;
import shark.C44455h;
import shark.C44488j;
import shark.C44494p;
import shark.HeapObject;
import shark.InterfaceC44456i;
import shark.LeakTraceReference;
import shark.OnAnalysisProgressListener;
import shark.PrimitiveType;
import shark.ReferencePattern;
import shark.ValueHolder;
import shark.internal.hppc.C44481e;

/* JADX INFO: compiled from: PathFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u00047\u0016B\"B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$0\u0006H\u0002¢\u0006\u0004\b'\u0010(J#\u0010+\u001a\u00020!*\u00020\u001b2\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020!*\u00020\u001b2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u00100J'\u00104\u001a\b\u0012\u0004\u0012\u00020302*\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0002¢\u0006\u0004\b4\u00105J!\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006*\u00020\u00132\u0006\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u00020\u0015*\u00020\u00022\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J#\u0010?\u001a\u00020!*\u00020\u001b2\u0006\u0010>\u001a\u00020=2\u0006\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010B\u001a\u00020!*\u00020\u001b2\u0006\u0010A\u001a\u00020\u001eH\u0002¢\u0006\u0004\bB\u0010CR,\u0010G\u001a\u001a\u0012\u0004\u0012\u00020E\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00070D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010FR,\u0010H\u001a\u001a\u0012\u0004\u0012\u00020E\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00070D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010FR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00070D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010FR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00070D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010L¨\u0006M"}, m90084d2 = {"Lshark/internal/PathFinder;", "", "Lshark/i;", "graph", "Lshark/OnAnalysisProgressListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lshark/u;", "referenceMatchers", "<init>", "(Lshark/i;Lshark/OnAnalysisProgressListener;Ljava/util/List;)V", "", "", "leakingObjectIds", "", "computeRetainedHeapSize", "Lshark/internal/PathFinder$b;", "e", "(Ljava/util/Set;Z)Lshark/internal/PathFinder$b;", "Lshark/HeapObject$HeapClass;", "objectClass", "", "b", "(Lshark/HeapObject$HeapClass;Lshark/i;)I", "Lshark/internal/hppc/e;", "k", "(Ljava/util/Set;)Lshark/internal/hppc/e;", "Lshark/internal/PathFinder$c;", "f", "(Lshark/internal/PathFinder$c;)Lshark/internal/PathFinder$b;", "Lshark/internal/j;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lshark/internal/PathFinder$c;)Lshark/internal/j;", "", "d", "(Lshark/internal/PathFinder$c;)V", "Lkotlin/Pair;", "Lshark/HeapObject;", "Lshark/d;", "j", "()Ljava/util/List;", "heapClass", "parent", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lshark/internal/PathFinder$c;Lshark/HeapObject$HeapClass;Lshark/internal/j;)V", "Lshark/HeapObject$HeapInstance;", "instance", "m", "(Lshark/internal/PathFinder$c;Lshark/HeapObject$HeapInstance;Lshark/internal/j;)V", "classHierarchy", "", "Lshark/internal/PathFinder$a;", "i", "(Lshark/HeapObject$HeapInstance;Ljava/util/List;)Ljava/util/List;", "javaLangObjectId", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/HeapObject$HeapClass;J)Ljava/util/List;", "Lshark/l$b$c$a$a;", "field", "g", "(Lshark/i;Lshark/l$b$c$a$a;)I", "Lshark/HeapObject$a;", "objectArray", "n", "(Lshark/internal/PathFinder$c;Lshark/HeapObject$a;Lshark/internal/j;)V", "node", "c", "(Lshark/internal/PathFinder$c;Lshark/internal/j;)V", "", "", "Ljava/util/Map;", "fieldNameByClassName", "staticFieldNameByClassName", "threadNameReferenceMatchers", "jniGlobalReferenceMatchers", "Lshark/i;", "Lshark/OnAnalysisProgressListener;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class PathFinder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Map<String, Map<String, AbstractC44499u>> fieldNameByClassName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Map<String, Map<String, AbstractC44499u>> staticFieldNameByClassName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Map<String, AbstractC44499u> threadNameReferenceMatchers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Map<String, AbstractC44499u> jniGlobalReferenceMatchers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final InterfaceC44456i graph;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final OnAnalysisProgressListener listener;

    /* JADX INFO: renamed from: shark.internal.PathFinder$a */
    /* JADX INFO: compiled from: PathFinder.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lshark/internal/PathFinder$a;", "", "", "declaringClassId", "refObjectId", "", "fieldName", "<init>", "(JJLjava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "()J", "b", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44462a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long declaringClassId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long refObjectId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String fieldName;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDeclaringClassId() {
            return this.declaringClassId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getRefObjectId() {
            return this.refObjectId;
        }

        public C44462a(long j11, long j12, @NotNull String str) {
            this.declaringClassId = j11;
            this.refObjectId = j12;
            this.fieldName = str;
        }
    }

    /* JADX INFO: renamed from: shark.internal.PathFinder$b */
    /* JADX INFO: compiled from: PathFinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lshark/internal/PathFinder$b;", "", "", "Lshark/internal/j;", "pathsToLeakingObjects", "Lshark/internal/d;", "dominatorTree", "<init>", "(Ljava/util/List;Lshark/internal/d;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "b", "()Ljava/util/List;", "Lshark/internal/d;", "()Lshark/internal/d;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44463b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<AbstractC44484j> pathsToLeakingObjects;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final C44471d dominatorTree;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C44471d getDominatorTree() {
            return this.dominatorTree;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<AbstractC44484j> m98273b() {
            return this.pathsToLeakingObjects;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C44463b(@NotNull List<? extends AbstractC44484j> list, @Nullable C44471d c44471d) {
            this.pathsToLeakingObjects = list;
            this.dominatorTree = c44471d;
        }
    }

    /* JADX INFO: renamed from: shark.internal.PathFinder$c */
    /* JADX INFO: compiled from: PathFinder.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b \u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b\u000f\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b\u0014\u0010.R\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u00060"}, m90084d2 = {"Lshark/internal/PathFinder$c;", "", "Lshark/internal/hppc/e;", "leakingObjectIds", "", "sizeOfObjectInstances", "", "computeRetainedHeapSize", "", "javaLangObjectId", "estimatedVisitedObjects", "<init>", "(Lshark/internal/hppc/e;IZJI)V", "Ljava/util/Deque;", "Lshark/internal/j;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Deque;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/util/Deque;", "toVisitQueue", "b", "f", "toVisitLastQueue", "c", "Lshark/internal/hppc/e;", "i", "()Lshark/internal/hppc/e;", "toVisitSet", "d", "g", "toVisitLastSet", "Lshark/internal/PathFinder$d;", "e", "Lshark/internal/PathFinder$d;", "j", "()Lshark/internal/PathFinder$d;", "visitTracker", "Z", "k", "()Z", CmcdData.Factory.STREAM_TYPE_LIVE, "(Z)V", "visitingLast", "I", "()I", "J", "()J", "queuesNotEmpty", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class C44464c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Deque<AbstractC44484j> toVisitQueue = new ArrayDeque();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Deque<AbstractC44484j> toVisitLastQueue = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final C44481e toVisitSet = new C44481e(0, 1, null);

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final C44481e toVisitLastSet = new C44481e(0, 1, null);

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final AbstractC44465d visitTracker;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean visitingLast;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final C44481e leakingObjectIds;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public final int sizeOfObjectInstances;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final boolean computeRetainedHeapSize;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public final long javaLangObjectId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getComputeRetainedHeapSize() {
            return this.computeRetainedHeapSize;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getJavaLangObjectId() {
            return this.javaLangObjectId;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final C44481e getLeakingObjectIds() {
            return this.leakingObjectIds;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m98277d() {
            return (this.toVisitQueue.isEmpty() && this.toVisitLastQueue.isEmpty()) ? false : true;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getSizeOfObjectInstances() {
            return this.sizeOfObjectInstances;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Deque<AbstractC44484j> m98279f() {
            return this.toVisitLastQueue;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final C44481e getToVisitLastSet() {
            return this.toVisitLastSet;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final Deque<AbstractC44484j> m98281h() {
            return this.toVisitQueue;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final C44481e getToVisitSet() {
            return this.toVisitSet;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final AbstractC44465d getVisitTracker() {
            return this.visitTracker;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getVisitingLast() {
            return this.visitingLast;
        }

        /* JADX INFO: renamed from: l */
        public final void m98285l(boolean z11) {
            this.visitingLast = z11;
        }

        public C44464c(@NotNull C44481e c44481e, int i11, boolean z11, long j11, int i12) {
            AbstractC44465d bVar;
            this.leakingObjectIds = c44481e;
            this.sizeOfObjectInstances = i11;
            this.computeRetainedHeapSize = z11;
            this.javaLangObjectId = j11;
            if (z11) {
                bVar = new AbstractC44465d.a(i12);
            } else {
                bVar = new AbstractC44465d.b(i12);
            }
            this.visitTracker = bVar;
        }
    }

    /* JADX INFO: renamed from: shark.internal.PathFinder$d */
    /* JADX INFO: compiled from: PathFinder.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m90084d2 = {"Lshark/internal/PathFinder$d;", "", "<init>", "()V", "", "objectId", "parentObjectId", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JJ)Z", "b", "Lshark/internal/PathFinder$d$a;", "Lshark/internal/PathFinder$d$b;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static abstract class AbstractC44465d {

        /* JADX INFO: renamed from: shark.internal.PathFinder$d$a */
        /* JADX INFO: compiled from: PathFinder.kt */
        @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lshark/internal/PathFinder$d$a;", "Lshark/internal/PathFinder$d;", "", "expectedElements", "<init>", "(I)V", "", "objectId", "parentObjectId", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JJ)Z", "Lshark/internal/d;", "Lshark/internal/d;", "b", "()Lshark/internal/d;", "dominatorTree", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class a extends AbstractC44465d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final C44471d dominatorTree;

            public a(int i11) {
                super(null);
                this.dominatorTree = new C44471d(i11);
            }

            @Override // shark.internal.PathFinder.AbstractC44465d
            /* JADX INFO: renamed from: a */
            public boolean mo98286a(long objectId, long parentObjectId) {
                return this.dominatorTree.m98332c(objectId, parentObjectId);
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final C44471d getDominatorTree() {
                return this.dominatorTree;
            }
        }

        /* JADX INFO: renamed from: shark.internal.PathFinder$d$b */
        /* JADX INFO: compiled from: PathFinder.kt */
        @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lshark/internal/PathFinder$d$b;", "Lshark/internal/PathFinder$d;", "", "expectedElements", "<init>", "(I)V", "", "objectId", "parentObjectId", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JJ)Z", "Lshark/internal/hppc/e;", "Lshark/internal/hppc/e;", "visitedSet", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class b extends AbstractC44465d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final C44481e visitedSet;

            public b(int i11) {
                super(null);
                this.visitedSet = new C44481e(i11);
            }

            @Override // shark.internal.PathFinder.AbstractC44465d
            /* JADX INFO: renamed from: a */
            public boolean mo98286a(long objectId, long parentObjectId) {
                return !this.visitedSet.m98389a(objectId);
            }
        }

        public AbstractC44465d() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo98286a(long objectId, long parentObjectId);

        public /* synthetic */ AbstractC44465d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: shark.internal.PathFinder$e */
    /* JADX INFO: compiled from: PathFinder.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u00002&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m90084d2 = {"Lkotlin/Pair;", "Lshark/HeapObject;", "Lshark/d;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "<name for destructuring parameter 1>", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/Pair;Lkotlin/Pair;)I"}, m90085k = 3, m90086mv = {1, 4, 1})
    public static final class C44466e<T> implements Comparator<Pair<? extends HeapObject, ? extends AbstractC44451d>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f98395b;

        public C44466e(Function1 function1) {
            this.f98395b = function1;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(Pair<? extends HeapObject, ? extends AbstractC44451d> pair, Pair<? extends HeapObject, ? extends AbstractC44451d> pair2) {
            HeapObject heapObjectComponent1 = pair.component1();
            AbstractC44451d abstractC44451dComponent2 = pair.component2();
            HeapObject heapObjectComponent2 = pair2.component1();
            String name = pair2.component2().getClass().getName();
            String name2 = abstractC44451dComponent2.getClass().getName();
            Intrinsics.checkExpressionValueIsNotNull(name2, "root1::class.java.name");
            int iCompareTo = name.compareTo(name2);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            return ((String) this.f98395b.invoke(heapObjectComponent1)).compareTo((String) this.f98395b.invoke(heapObjectComponent2));
        }
    }

    /* JADX INFO: renamed from: shark.internal.PathFinder$f */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m90085k = 3, m90086mv = {1, 4, 1})
    public static final class C44467f<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((C44462a) t11).getFieldName(), ((C44462a) t12).getFieldName());
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m98256b(HeapObject.HeapClass objectClass, InterfaceC44456i graph) {
        if (objectClass != null) {
            int iM98021t = objectClass.m98021t();
            int iMo98075i = graph.mo98075i() + PrimitiveType.INT.getByteSize();
            if (iM98021t == iMo98075i) {
                return iMo98075i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final List<HeapObject.HeapClass> m98255a(HeapObject.HeapClass heapClass, long j11) {
        ArrayList arrayList = new ArrayList();
        while (heapClass != null && heapClass.getObjectId() != j11) {
            arrayList.add(heapClass);
            heapClass = heapClass.m98018q();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m98258d(final C44464c c44464c) {
        AbstractC44499u abstractC44499u;
        List<Pair<HeapObject, AbstractC44451d>> listM98264j = m98264j();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<T> it = listM98264j.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            HeapObject heapObject = (HeapObject) pair.component1();
            AbstractC44451d abstractC44451d = (AbstractC44451d) pair.component2();
            if (abstractC44451d instanceof AbstractC44451d.m) {
                Integer numValueOf = Integer.valueOf(((AbstractC44451d.m) abstractC44451d).getThreadSerialNumber());
                HeapObject.HeapInstance heapInstanceM98004d = heapObject.m98004d();
                if (heapInstanceM98004d == null) {
                    Intrinsics.throwNpe();
                }
                linkedHashMap2.put(numValueOf, TuplesKt.m90091to(heapInstanceM98004d, abstractC44451d));
                m98257c(c44464c, new AbstractC44484j.c.b(abstractC44451d.getId(), abstractC44451d));
            } else if (abstractC44451d instanceof AbstractC44451d.d) {
                Pair pair2 = (Pair) linkedHashMap2.get(Integer.valueOf(((AbstractC44451d.d) abstractC44451d).getThreadSerialNumber()));
                if (pair2 == null) {
                    m98257c(c44464c, new AbstractC44484j.c.b(abstractC44451d.getId(), abstractC44451d));
                } else {
                    final HeapObject.HeapInstance heapInstance = (HeapObject.HeapInstance) pair2.component1();
                    AbstractC44451d.m mVar = (AbstractC44451d.m) pair2.component2();
                    String strInvoke = (String) linkedHashMap.get(heapInstance);
                    if (strInvoke == null) {
                        strInvoke = new Function0<String>() { // from class: shark.internal.PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p852kotlin.jvm.functions.Function0
                            @NotNull
                            public final String invoke() {
                                String strM98439g;
                                C44488j value;
                                C44455h c44455hM98029k = heapInstance.m98029k(Reflection.getOrCreateKotlinClass(Thread.class), "name");
                                if (c44455hM98029k == null || (value = c44455hM98029k.getValue()) == null || (strM98439g = value.m98439g()) == null) {
                                    strM98439g = "";
                                }
                                linkedHashMap.put(heapInstance, strM98439g);
                                return strM98439g;
                            }
                        }.invoke();
                    }
                    AbstractC44499u abstractC44499u2 = this.threadNameReferenceMatchers.get(strInvoke);
                    AbstractC44484j.c.b bVar = new AbstractC44484j.c.b(mVar.getId(), abstractC44451d);
                    LeakTraceReference.ReferenceType referenceType = LeakTraceReference.ReferenceType.LOCAL;
                    m98257c(c44464c, abstractC44499u2 instanceof C44494p ? new AbstractC44484j.a.C47018a(abstractC44451d.getId(), bVar, referenceType, "", (C44494p) abstractC44499u2, 0L, 32, null) : new AbstractC44484j.a.b(abstractC44451d.getId(), bVar, referenceType, "", 0L, 16, null));
                }
            } else if (abstractC44451d instanceof AbstractC44451d.e) {
                if (heapObject instanceof HeapObject.HeapClass) {
                    abstractC44499u = this.jniGlobalReferenceMatchers.get(((HeapObject.HeapClass) heapObject).m98017p());
                } else if (heapObject instanceof HeapObject.HeapInstance) {
                    abstractC44499u = this.jniGlobalReferenceMatchers.get(((HeapObject.HeapInstance) heapObject).m98034p());
                } else if (heapObject instanceof HeapObject.C44426a) {
                    abstractC44499u = this.jniGlobalReferenceMatchers.get(((HeapObject.C44426a) heapObject).m98043i());
                } else {
                    if (!(heapObject instanceof HeapObject.C44427b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC44499u = this.jniGlobalReferenceMatchers.get(((HeapObject.C44427b) heapObject).m98046i());
                }
                if (abstractC44499u instanceof C44494p) {
                    m98257c(c44464c, new AbstractC44484j.c.a(abstractC44451d.getId(), abstractC44451d, (C44494p) abstractC44499u));
                } else {
                    m98257c(c44464c, new AbstractC44484j.c.b(abstractC44451d.getId(), abstractC44451d));
                }
            } else {
                m98257c(c44464c, new AbstractC44484j.c.b(abstractC44451d.getId(), abstractC44451d));
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C44463b m98259e(@NotNull Set<Long> leakingObjectIds, boolean computeRetainedHeapSize) {
        this.listener.onAnalysisProgress(OnAnalysisProgressListener.Step.FINDING_PATHS_TO_RETAINED_OBJECTS);
        HeapObject.HeapClass heapClassMo98072b = this.graph.mo98072b("java.lang.Object");
        return m98260f(new C44464c(m98265k(leakingObjectIds), m98256b(heapClassMo98072b, this.graph), computeRetainedHeapSize, heapClassMo98072b != null ? heapClassMo98072b.getObjectId() : -1L, RangesKt.coerceAtLeast(this.graph.mo98073g() / 2, 4)));
    }

    /* JADX INFO: renamed from: j */
    public final List<Pair<HeapObject, AbstractC44451d>> m98264j() {
        PathFinder$sortedGcRoots$rootClassName$1 pathFinder$sortedGcRoots$rootClassName$1 = new Function1<HeapObject, String>() { // from class: shark.internal.PathFinder$sortedGcRoots$rootClassName$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull HeapObject heapObject) {
                if (heapObject instanceof HeapObject.HeapClass) {
                    return ((HeapObject.HeapClass) heapObject).m98017p();
                }
                if (heapObject instanceof HeapObject.HeapInstance) {
                    return ((HeapObject.HeapInstance) heapObject).m98034p();
                }
                if (heapObject instanceof HeapObject.C44426a) {
                    return ((HeapObject.C44426a) heapObject).m98043i();
                }
                if (heapObject instanceof HeapObject.C44427b) {
                    return ((HeapObject.C44427b) heapObject).m98046i();
                }
                throw new NoWhenBranchMatchedException();
            }
        };
        List<AbstractC44451d> listMo98079m = this.graph.mo98079m();
        ArrayList<AbstractC44451d> arrayList = new ArrayList();
        for (Object obj : listMo98079m) {
            if (this.graph.mo98071a(((AbstractC44451d) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (AbstractC44451d abstractC44451d : arrayList) {
            arrayList2.add(TuplesKt.m90091to(this.graph.mo98078l(abstractC44451d.getId()), abstractC44451d));
        }
        return CollectionsKt.sortedWith(arrayList2, new C44466e(pathFinder$sortedGcRoots$rootClassName$1));
    }

    /* JADX INFO: renamed from: k */
    public final C44481e m98265k(Set<Long> set) {
        C44481e c44481e = new C44481e(0, 1, null);
        c44481e.m98393e(set.size());
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            c44481e.m98389a(((Number) it.next()).longValue());
        }
        return c44481e;
    }

    /* JADX INFO: renamed from: l */
    public final void m98266l(C44464c c44464c, HeapObject.HeapClass heapClass, AbstractC44484j abstractC44484j) {
        AbstractC44484j c47018a;
        Map<String, AbstractC44499u> mapEmptyMap = this.staticFieldNameByClassName.get(heapClass.m98017p());
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        for (C44455h c44455h : heapClass.m98026y()) {
            if (c44455h.getValue().m98438f()) {
                String name = c44455h.getName();
                if (!Intrinsics.areEqual(name, "$staticOverhead") && !Intrinsics.areEqual(name, "$classOverhead")) {
                    ValueHolder valueHolder = c44455h.getValue().getCom.tencent.bugly.proguard.u6.i java.lang.String();
                    if (valueHolder == null) {
                        throw new TypeCastException("null cannot be cast to non-null type shark.ValueHolder.ReferenceHolder");
                    }
                    long value = ((ValueHolder.ReferenceHolder) valueHolder).getValue();
                    AbstractC44499u abstractC44499u = mapEmptyMap.get(name);
                    if (abstractC44499u == null) {
                        c47018a = new AbstractC44484j.a.b(value, abstractC44484j, LeakTraceReference.ReferenceType.STATIC_FIELD, name, 0L, 16, null);
                    } else {
                        if (!(abstractC44499u instanceof C44494p)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c47018a = new AbstractC44484j.a.C47018a(value, abstractC44484j, LeakTraceReference.ReferenceType.STATIC_FIELD, name, (C44494p) abstractC44499u, 0L, 32, null);
                    }
                    m98257c(c44464c, c47018a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m98267m(C44464c c44464c, HeapObject.HeapInstance heapInstance, AbstractC44484j abstractC44484j) {
        AbstractC44484j c47018a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<HeapObject.HeapClass> it = heapInstance.m98032n().m98012k().iterator();
        while (it.hasNext()) {
            Map<String, AbstractC44499u> map = this.fieldNameByClassName.get(it.next().m98017p());
            if (map != null) {
                for (Map.Entry<String, AbstractC44499u> entry : map.entrySet()) {
                    String key = entry.getKey();
                    AbstractC44499u value = entry.getValue();
                    if (!linkedHashMap.containsKey(key)) {
                        linkedHashMap.put(key, value);
                    }
                }
            }
        }
        List<C44462a> listM98263i = m98263i(heapInstance, m98255a(heapInstance.m98032n(), c44464c.getJavaLangObjectId()));
        if (listM98263i.size() > 1) {
            CollectionsKt.sortWith(listM98263i, new C44467f());
        }
        for (C44462a c44462a : listM98263i) {
            AbstractC44499u abstractC44499u = (AbstractC44499u) linkedHashMap.get(c44462a.getFieldName());
            if (abstractC44499u == null) {
                c47018a = new AbstractC44484j.a.b(c44462a.getRefObjectId(), abstractC44484j, LeakTraceReference.ReferenceType.INSTANCE_FIELD, c44462a.getFieldName(), c44462a.getDeclaringClassId());
            } else {
                if (!(abstractC44499u instanceof C44494p)) {
                    throw new NoWhenBranchMatchedException();
                }
                c47018a = new AbstractC44484j.a.C47018a(c44462a.getRefObjectId(), abstractC44484j, LeakTraceReference.ReferenceType.INSTANCE_FIELD, c44462a.getFieldName(), (C44494p) abstractC44499u, c44462a.getDeclaringClassId());
            }
            m98257c(c44464c, c47018a);
        }
    }

    public PathFinder(@NotNull InterfaceC44456i interfaceC44456i, @NotNull OnAnalysisProgressListener onAnalysisProgressListener, @NotNull List<? extends AbstractC44499u> list) {
        this.graph = interfaceC44456i;
        this.listener = onAnalysisProgressListener;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList<AbstractC44499u> arrayList = new ArrayList();
        for (Object obj : list) {
            AbstractC44499u abstractC44499u = (AbstractC44499u) obj;
            if ((abstractC44499u instanceof C44494p) && ((C44494p) abstractC44499u).m98456c().invoke(this.graph).booleanValue()) {
                arrayList.add(obj);
            }
        }
        for (AbstractC44499u abstractC44499u2 : arrayList) {
            ReferencePattern pattern = abstractC44499u2.getPattern();
            if (pattern instanceof ReferencePattern.JavaLocalPattern) {
                linkedHashMap3.put(((ReferencePattern.JavaLocalPattern) pattern).getThreadName(), abstractC44499u2);
            } else if (pattern instanceof ReferencePattern.StaticFieldPattern) {
                ReferencePattern.StaticFieldPattern staticFieldPattern = (ReferencePattern.StaticFieldPattern) pattern;
                Map linkedHashMap5 = (Map) linkedHashMap2.get(staticFieldPattern.getClassName());
                if (linkedHashMap5 == null) {
                    linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap2.put(staticFieldPattern.getClassName(), linkedHashMap5);
                }
                linkedHashMap5.put(staticFieldPattern.getFieldName(), abstractC44499u2);
            } else if (pattern instanceof ReferencePattern.InstanceFieldPattern) {
                ReferencePattern.InstanceFieldPattern instanceFieldPattern = (ReferencePattern.InstanceFieldPattern) pattern;
                Map linkedHashMap6 = (Map) linkedHashMap.get(instanceFieldPattern.getClassName());
                if (linkedHashMap6 == null) {
                    linkedHashMap6 = new LinkedHashMap();
                    linkedHashMap.put(instanceFieldPattern.getClassName(), linkedHashMap6);
                }
                linkedHashMap6.put(instanceFieldPattern.getFieldName(), abstractC44499u2);
            } else if (pattern instanceof ReferencePattern.NativeGlobalVariablePattern) {
                linkedHashMap4.put(((ReferencePattern.NativeGlobalVariablePattern) pattern).getClassName(), abstractC44499u2);
            }
        }
        this.fieldNameByClassName = linkedHashMap;
        this.staticFieldNameByClassName = linkedHashMap2;
        this.threadNameReferenceMatchers = linkedHashMap3;
        this.jniGlobalReferenceMatchers = linkedHashMap4;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX INFO: renamed from: c */
    public final void m98257c(C44464c c44464c, AbstractC44484j abstractC44484j) {
        boolean z11;
        long objectId = 0;
        if (abstractC44484j.getObjectId() != 0) {
            if (!c44464c.getVisitingLast() && !(abstractC44484j instanceof AbstractC44484j.b) && (!(abstractC44484j instanceof AbstractC44484j.c) || !(((AbstractC44484j.c) abstractC44484j).getGcRoot() instanceof AbstractC44451d.m))) {
                if (abstractC44484j instanceof AbstractC44484j.a.b) {
                    AbstractC44484j.a.b bVar = (AbstractC44484j.a.b) abstractC44484j;
                    if ((bVar.getParent() instanceof AbstractC44484j.c) && (((AbstractC44484j.c) bVar.getParent()).getGcRoot() instanceof AbstractC44451d.d)) {
                        z11 = true;
                    }
                }
                z11 = false;
            } else {
                z11 = true;
            }
            if (!(abstractC44484j instanceof AbstractC44484j.c)) {
                objectId = ((AbstractC44484j.a) abstractC44484j).getParent().getObjectId();
            }
            boolean zMo98286a = c44464c.getVisitTracker().mo98286a(abstractC44484j.getObjectId(), objectId);
            if (zMo98286a && (z11 || c44464c.getToVisitSet().m98392d(abstractC44484j.getObjectId()) || !c44464c.getToVisitLastSet().m98392d(abstractC44484j.getObjectId()))) {
                return;
            }
            if (zMo98286a) {
                c44464c.m98281h().add(abstractC44484j);
                c44464c.getToVisitSet().m98389a(abstractC44484j.getObjectId());
                for (AbstractC44484j abstractC44484j2 : c44464c.m98279f()) {
                    if (abstractC44484j2.getObjectId() == abstractC44484j.getObjectId()) {
                        c44464c.m98279f().remove(abstractC44484j2);
                        c44464c.getToVisitLastSet().m98396h(abstractC44484j.getObjectId());
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (!c44464c.getLeakingObjectIds().m98392d(abstractC44484j.getObjectId())) {
                HeapObject heapObjectMo98078l = this.graph.mo98078l(abstractC44484j.getObjectId());
                if (!(heapObjectMo98078l instanceof HeapObject.HeapClass)) {
                    if (heapObjectMo98078l instanceof HeapObject.HeapInstance) {
                        HeapObject.HeapInstance heapInstance = (HeapObject.HeapInstance) heapObjectMo98078l;
                        if (heapInstance.m98037s() || Intrinsics.areEqual(heapInstance.m98034p(), "java.lang.String") || heapInstance.m98032n().m98015n() <= c44464c.getSizeOfObjectInstances()) {
                            return;
                        }
                        for (HeapObject.HeapClass heapClass : heapInstance.m98032n().m98012k()) {
                            if (heapClass.getObjectId() == c44464c.getJavaLangObjectId() || !heapClass.m98014m()) {
                            }
                        }
                        return;
                    }
                    if (heapObjectMo98078l instanceof HeapObject.C44426a) {
                        if (C44483i.m98402a((HeapObject.C44426a) heapObjectMo98078l)) {
                            return;
                        }
                    } else if (heapObjectMo98078l instanceof HeapObject.C44427b) {
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if (z11) {
                c44464c.m98279f().add(abstractC44484j);
                c44464c.getToVisitLastSet().m98389a(abstractC44484j.getObjectId());
            } else {
                c44464c.m98281h().add(abstractC44484j);
                c44464c.getToVisitSet().m98389a(abstractC44484j.getObjectId());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final C44463b m98260f(C44464c c44464c) {
        C44471d dominatorTree;
        m98258d(c44464c);
        ArrayList arrayList = new ArrayList();
        while (c44464c.m98277d()) {
            AbstractC44484j abstractC44484jM98262h = m98262h(c44464c);
            if (c44464c.getLeakingObjectIds().m98392d(abstractC44484jM98262h.getObjectId())) {
                arrayList.add(abstractC44484jM98262h);
                if (arrayList.size() == c44464c.getLeakingObjectIds().m98398j()) {
                    if (!c44464c.getComputeRetainedHeapSize()) {
                        break;
                    }
                    this.listener.onAnalysisProgress(OnAnalysisProgressListener.Step.FINDING_DOMINATORS);
                }
            }
            HeapObject heapObjectMo98078l = this.graph.mo98078l(abstractC44484jM98262h.getObjectId());
            if (heapObjectMo98078l instanceof HeapObject.HeapClass) {
                m98266l(c44464c, (HeapObject.HeapClass) heapObjectMo98078l, abstractC44484jM98262h);
            } else if (heapObjectMo98078l instanceof HeapObject.HeapInstance) {
                m98267m(c44464c, (HeapObject.HeapInstance) heapObjectMo98078l, abstractC44484jM98262h);
            } else if (heapObjectMo98078l instanceof HeapObject.C44426a) {
                m98268n(c44464c, (HeapObject.C44426a) heapObjectMo98078l, abstractC44484jM98262h);
            }
        }
        if (c44464c.getVisitTracker() instanceof AbstractC44465d.a) {
            dominatorTree = ((AbstractC44465d.a) c44464c.getVisitTracker()).getDominatorTree();
        } else {
            dominatorTree = null;
        }
        return new C44463b(arrayList, dominatorTree);
    }

    /* JADX INFO: renamed from: g */
    public final int m98261g(InterfaceC44456i interfaceC44456i, AbstractC44490l.b.c.a.FieldRecord fieldRecord) {
        int type = fieldRecord.getType();
        if (type == 2) {
            return interfaceC44456i.mo98075i();
        }
        if (type == PrimitiveType.BOOLEAN.getHprofType()) {
            return 1;
        }
        if (type == PrimitiveType.CHAR.getHprofType()) {
            return 2;
        }
        if (type == PrimitiveType.FLOAT.getHprofType()) {
            return 4;
        }
        if (type == PrimitiveType.DOUBLE.getHprofType()) {
            return 8;
        }
        if (type == PrimitiveType.BYTE.getHprofType()) {
            return 1;
        }
        if (type == PrimitiveType.SHORT.getHprofType()) {
            return 2;
        }
        if (type == PrimitiveType.INT.getHprofType()) {
            return 4;
        }
        if (type == PrimitiveType.LONG.getHprofType()) {
            return 8;
        }
        throw new IllegalStateException("Unknown type " + fieldRecord.getType());
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC44484j m98262h(C44464c c44464c) {
        if (!c44464c.getVisitingLast() && !c44464c.m98281h().isEmpty()) {
            AbstractC44484j removedNode = c44464c.m98281h().poll();
            c44464c.getToVisitSet().m98396h(removedNode.getObjectId());
            Intrinsics.checkExpressionValueIsNotNull(removedNode, "removedNode");
            return removedNode;
        }
        c44464c.m98285l(true);
        AbstractC44484j removedNode2 = c44464c.m98279f().poll();
        c44464c.getToVisitLastSet().m98396h(removedNode2.getObjectId());
        Intrinsics.checkExpressionValueIsNotNull(removedNode2, "removedNode");
        return removedNode2;
    }

    /* JADX INFO: renamed from: i */
    public final List<C44462a> m98263i(HeapObject.HeapInstance heapInstance, List<HeapObject.HeapClass> list) {
        InterfaceC44456i interfaceC44456iMo98005e = heapInstance.mo98005e();
        ArrayList arrayList = new ArrayList();
        C44472e c44472e = null;
        int iM98261g = 0;
        for (HeapObject.HeapClass heapClass : list) {
            for (AbstractC44490l.b.c.a.FieldRecord fieldRecord : heapClass.m98023v()) {
                if (fieldRecord.getType() != 2) {
                    iM98261g += m98261g(interfaceC44456iMo98005e, fieldRecord);
                } else {
                    if (c44472e == null) {
                        c44472e = new C44472e(heapInstance.mo98008h(), interfaceC44456iMo98005e.mo98075i());
                    }
                    c44472e.m98339f(iM98261g);
                    long jM98335b = c44472e.m98335b();
                    if (jM98335b != 0) {
                        arrayList.add(new C44462a(heapClass.getObjectId(), jM98335b, heapClass.m98019r(fieldRecord)));
                    }
                    iM98261g = 0;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final void m98268n(C44464c c44464c, HeapObject.C44426a c44426a, AbstractC44484j abstractC44484j) {
        long[] elementIds = c44426a.mo98008h().getElementIds();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (long j11 : elementIds) {
            if (j11 != 0 && this.graph.mo98071a(j11)) {
                arrayList.add(Long.valueOf(j11));
            }
        }
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            m98257c(c44464c, new AbstractC44484j.a.b(((Number) obj).longValue(), abstractC44484j, LeakTraceReference.ReferenceType.ARRAY_ENTRY, String.valueOf(i11), 0L, 16, null));
            i11 = i12;
        }
    }
}
