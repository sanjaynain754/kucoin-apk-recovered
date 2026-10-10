package com.tencent.rmonitor.p145fd.utils;

import com.tencent.bugly.proguard.C33648fb;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import shark.C44495q;
import shark.FilteringLeakingObjectFinder;
import shark.HeapAnalysis;
import shark.HeapAnalysisFailure;
import shark.HeapAnalysisSuccess;
import shark.HeapAnalyzer;
import shark.HeapObject;
import shark.InterfaceC44456i;
import shark.Leak;
import shark.LeakTrace;
import shark.LeakTraceReference;
import shark.ObjectInspector;
import shark.OnAnalysisProgressListener;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, m90084d2 = {"Lcom/tencent/rmonitor/fd/utils/SharkAnalysisUtil;", "Lshark/OnAnalysisProgressListener;", "<init>", "()V", "Lshark/i;", "graph", "", "", "objectIds", "", "", "findPathsFromGcRoots", "(Lshark/i;Ljava/util/Set;)Ljava/util/Map;", "Lshark/HeapAnalysis;", "heapAnalysis", "processAnalysisResult", "(Lshark/HeapAnalysis;)Ljava/util/Map;", "Lshark/LeakTrace;", "trace", "getGcPathFeature", "(Lshark/LeakTrace;)Ljava/lang/String;", "getObjectIdFromLeakTrace", "(Lshark/LeakTrace;)J", "Lshark/OnAnalysisProgressListener$Step;", "step", "", "onAnalysisProgress", "(Lshark/OnAnalysisProgressListener$Step;)V", "TAG", "Ljava/lang/String;", "OBJECT_ID_PREFIX", "CLASS_FINALIZER_REFERENCE", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class SharkAnalysisUtil implements OnAnalysisProgressListener {

    @NotNull
    private static final String CLASS_FINALIZER_REFERENCE = "java.lang.ref.FinalizerReference";

    @NotNull
    public static final SharkAnalysisUtil INSTANCE = new SharkAnalysisUtil();

    @NotNull
    private static final String OBJECT_ID_PREFIX = "ObjectId=";

    @NotNull
    private static final String TAG = "SharkAnalysisUtil";

    @JvmStatic
    @NotNull
    public static final Map<Long, String> findPathsFromGcRoots(@NotNull InterfaceC44456i graph, @NotNull final Set<Long> objectIds) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(objectIds, "objectIds");
        FilteringLeakingObjectFinder filteringLeakingObjectFinder = new FilteringLeakingObjectFinder(CollectionsKt.listOf(new FilteringLeakingObjectFinder.InterfaceC44419a() { // from class: com.tencent.rmonitor.fd.utils.SharkAnalysisUtil$findPathsFromGcRoots$objectFilter$1
            @Override // shark.FilteringLeakingObjectFinder.InterfaceC44419a
            public boolean isLeakingObject(@NotNull HeapObject heapObject) {
                Intrinsics.checkNotNullParameter(heapObject, "heapObject");
                return objectIds.contains(Long.valueOf(heapObject.getObjectId()));
            }
        }));
        ObjectInspector objectInspector = new ObjectInspector() { // from class: com.tencent.rmonitor.fd.utils.a
            @Override // shark.ObjectInspector
            public final void inspect(C44495q c44495q) {
                SharkAnalysisUtil.m103829findPathsFromGcRoots$lambda0(c44495q);
            }
        };
        SharkAnalysisUtil sharkAnalysisUtil = INSTANCE;
        return sharkAnalysisUtil.processAnalysisResult(HeapAnalyzer.m97967b(new HeapAnalyzer(sharkAnalysisUtil), new File(""), graph, filteringLeakingObjectFinder, null, false, CollectionsKt.listOf(objectInspector), null, 88, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: findPathsFromGcRoots$lambda-0, reason: not valid java name */
    public static final void m103829findPathsFromGcRoots$lambda0(C44495q it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.m98458b().add(OBJECT_ID_PREFIX + it.getHeapObject().getObjectId());
    }

    private final String getGcPathFeature(LeakTrace trace) {
        StringBuilder sb2 = new StringBuilder(trace.getLeakingObject().getClassName() + " -> \n");
        boolean z11 = false;
        for (LeakTraceReference leakTraceReference : CollectionsKt.reversed(trace.getReferencePath())) {
            String className = leakTraceReference.getOriginObject().getClassName();
            boolean zAreEqual = Intrinsics.areEqual(className, CLASS_FINALIZER_REFERENCE);
            String str = className + " -> " + leakTraceReference.getReferenceName() + '\n';
            if (zAreEqual && !z11) {
                sb2.append(str);
                z11 = true;
            } else if (!zAreEqual) {
                sb2.append(str);
            }
        }
        sb2.append("GcRoot: " + trace.getGcRootType());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    private final Map<Long, String> processAnalysisResult(HeapAnalysis heapAnalysis) {
        HashMap map = new HashMap();
        if (heapAnalysis instanceof HeapAnalysisSuccess) {
            HeapAnalysisSuccess heapAnalysisSuccess = (HeapAnalysisSuccess) heapAnalysis;
            Iterator it = CollectionsKt.plus((Collection) heapAnalysisSuccess.getApplicationLeaks(), (Iterable) heapAnalysisSuccess.getLibraryLeaks()).iterator();
            while (it.hasNext()) {
                LeakTrace leakTrace = (LeakTrace) CollectionsKt.firstOrNull((List) ((Leak) it.next()).getLeakTraces());
                if (leakTrace != null) {
                    long objectIdFromLeakTrace = getObjectIdFromLeakTrace(leakTrace);
                    if (objectIdFromLeakTrace != 0) {
                        map.put(Long.valueOf(objectIdFromLeakTrace), getGcPathFeature(leakTrace));
                    }
                }
            }
        } else if (heapAnalysis instanceof HeapAnalysisFailure) {
            C33648fb.m73043b(TAG, "findPathsFromGcRoots failed: " + heapAnalysis);
        }
        return map;
    }

    @Override // shark.OnAnalysisProgressListener
    public void onAnalysisProgress(@NotNull OnAnalysisProgressListener.Step step) {
        Intrinsics.checkNotNullParameter(step, "step");
    }

    private SharkAnalysisUtil() {
    }

    private final long getObjectIdFromLeakTrace(LeakTrace trace) {
        Object next;
        String strSubstringAfter$default;
        Long longOrNull;
        Iterator<T> it = trace.getLeakingObject().getLabels().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!StringsKt.startsWith$default((String) next, OBJECT_ID_PREFIX, false, 2, (Object) null));
        String str = (String) next;
        if (str != null && (strSubstringAfter$default = StringsKt.substringAfter$default(str, OBJECT_ID_PREFIX, (String) null, 2, (Object) null)) != null && (longOrNull = StringsKt.toLongOrNull(strSubstringAfter$default)) != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }
}
