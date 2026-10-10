package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: FilteringLeakingObjectFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lshark/FilteringLeakingObjectFinder;", "Lshark/LeakingObjectFinder;", "", "Lshark/FilteringLeakingObjectFinder$a;", "filters", "<init>", "(Ljava/util/List;)V", "Lshark/i;", "graph", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/i;)Ljava/util/Set;", "Ljava/util/List;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class FilteringLeakingObjectFinder implements LeakingObjectFinder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List<InterfaceC44419a> filters;

    /* JADX INFO: renamed from: shark.FilteringLeakingObjectFinder$a */
    /* JADX INFO: compiled from: FilteringLeakingObjectFinder.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lshark/FilteringLeakingObjectFinder$a;", "", "Lshark/HeapObject;", "heapObject", "", "isLeakingObject", "(Lshark/HeapObject;)Z", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public interface InterfaceC44419a {
        boolean isLeakingObject(@NotNull HeapObject heapObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilteringLeakingObjectFinder(@NotNull List<? extends InterfaceC44419a> list) {
        this.filters = list;
    }

    @Override // shark.LeakingObjectFinder
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<Long> mo97966a(@NotNull InterfaceC44456i graph) {
        return SequencesKt.toSet(SequencesKt.map(SequencesKt.filter(graph.mo98077k(), new Function1<HeapObject, Boolean>() { // from class: shark.FilteringLeakingObjectFinder$findLeakingObjectIds$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(HeapObject heapObject) {
                return Boolean.valueOf(invoke2(heapObject));
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull HeapObject heapObject) {
                List list = this.this$0.filters;
                if (list != null && list.isEmpty()) {
                    return false;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((FilteringLeakingObjectFinder.InterfaceC44419a) it.next()).isLeakingObject(heapObject)) {
                        return true;
                    }
                }
                return false;
            }
        }), new Function1<HeapObject, Long>() { // from class: shark.FilteringLeakingObjectFinder$findLeakingObjectIds$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(HeapObject heapObject) {
                return Long.valueOf(invoke2(heapObject));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final long invoke2(@NotNull HeapObject heapObject) {
                return heapObject.getObjectId();
            }
        }));
    }
}
