package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.sequences.SequencesKt;
import shark.internal.KeyedWeakReferenceMirror;

/* JADX INFO: compiled from: KeyedWeakReferenceFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lshark/KeyedWeakReferenceFinder;", "Lshark/LeakingObjectFinder;", "<init>", "()V", "Lshark/i;", "graph", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/i;)Ljava/util/Set;", "c", "(Lshark/i;)Ljava/lang/Long;", "", "Lshark/internal/KeyedWeakReferenceMirror;", "b", "(Lshark/i;)Ljava/util/List;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class KeyedWeakReferenceFinder implements LeakingObjectFinder {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KeyedWeakReferenceFinder f98205a = new KeyedWeakReferenceFinder();

    @Override // shark.LeakingObjectFinder
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Long> mo97966a(@NotNull InterfaceC44456i graph) {
        List<KeyedWeakReferenceMirror> listM98147b = m98147b(graph);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM98147b) {
            KeyedWeakReferenceMirror keyedWeakReferenceMirror = (KeyedWeakReferenceMirror) obj;
            if (keyedWeakReferenceMirror.getHasReferent() && keyedWeakReferenceMirror.getIsRetained()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((KeyedWeakReferenceMirror) it.next()).getReferent().getValue()));
        }
        return CollectionsKt.toSet(arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<KeyedWeakReferenceMirror> m98147b(@NotNull final InterfaceC44456i graph) {
        return (List) graph.getContext().m98167a(ObjectInspectors.KEYED_WEAK_REFERENCE.name(), new Function0<List<? extends KeyedWeakReferenceMirror>>() { // from class: shark.KeyedWeakReferenceFinder$findKeyedWeakReferences$1
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends KeyedWeakReferenceMirror> invoke() {
                HeapObject.HeapClass heapClassMo98072b = graph.mo98072b("leakcanary.KeyedWeakReference");
                final long objectId = heapClassMo98072b != null ? heapClassMo98072b.getObjectId() : 0L;
                HeapObject.HeapClass heapClassMo98072b2 = graph.mo98072b("com.squareup.leakcanary.KeyedWeakReference");
                final long objectId2 = heapClassMo98072b2 != null ? heapClassMo98072b2.getObjectId() : 0L;
                final Long lM98148c = KeyedWeakReferenceFinder.f98205a.m98148c(graph);
                List<? extends KeyedWeakReferenceMirror> list = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(graph.mo98074h(), new Function1<HeapObject.HeapInstance, Boolean>() { // from class: shark.KeyedWeakReferenceFinder$findKeyedWeakReferences$1$addedToContext$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(HeapObject.HeapInstance heapInstance) {
                        return Boolean.valueOf(invoke2(heapInstance));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2(@NotNull HeapObject.HeapInstance heapInstance) {
                        return heapInstance.m98033o() == objectId || heapInstance.m98033o() == objectId2;
                    }
                }), new Function1<HeapObject.HeapInstance, KeyedWeakReferenceMirror>() { // from class: shark.KeyedWeakReferenceFinder$findKeyedWeakReferences$1$addedToContext$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p852kotlin.jvm.functions.Function1
                    @NotNull
                    public final KeyedWeakReferenceMirror invoke(@NotNull HeapObject.HeapInstance heapInstance) {
                        return KeyedWeakReferenceMirror.INSTANCE.fromInstance(heapInstance, lM98148c);
                    }
                }));
                graph.getContext().m98168b(ObjectInspectors.KEYED_WEAK_REFERENCE.name(), list);
                return list;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Long m98148c(@NotNull final InterfaceC44456i graph) {
        return (Long) graph.getContext().m98167a("heapDumpUptimeMillis", new Function0<Long>() { // from class: shark.KeyedWeakReferenceFinder$heapDumpUptimeMillis$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Long invoke() {
                C44455h c44455hM98011j;
                C44488j value;
                HeapObject.HeapClass heapClassMo98072b = graph.mo98072b("leakcanary.KeyedWeakReference");
                Long lM98434b = null;
                if (heapClassMo98072b != null && (c44455hM98011j = heapClassMo98072b.m98011j("heapDumpUptimeMillis")) != null && (value = c44455hM98011j.getValue()) != null) {
                    lM98434b = value.m98434b();
                }
                if (lM98434b == null) {
                    C44500v.f98559a.m98466a();
                }
                return lM98434b;
            }
        });
    }
}
