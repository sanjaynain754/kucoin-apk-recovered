package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import shark.C44455h;
import shark.C44488j;
import shark.HeapObject;
import shark.InterfaceC44456i;

/* JADX INFO: renamed from: shark.internal.a */
/* JADX INFO: compiled from: AndroidNativeSizeMapper.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lshark/internal/a;", "", "Lshark/i;", "graph", "<init>", "(Lshark/i;)V", "", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/Map;", "Lshark/i;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44468a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final InterfaceC44456i graph;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<Long, Integer> m98301a() {
        C44455h c44455hM98028j;
        C44488j value;
        Long lM98434b;
        C44488j value2;
        C44488j value3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HeapObject.HeapClass heapClassMo98072b = this.graph.mo98072b("sun.misc.Cleaner");
        if (heapClassMo98072b != null) {
            for (HeapObject.HeapInstance heapInstance : heapClassMo98072b.m98013l()) {
                C44455h c44455hM98028j2 = heapInstance.m98028j("sun.misc.Cleaner", "thunk");
                Long lM98435c = null;
                Long lM98435c2 = (c44455hM98028j2 == null || (value3 = c44455hM98028j2.getValue()) == null) ? null : value3.m98435c();
                C44455h c44455hM98028j3 = heapInstance.m98028j("java.lang.ref.Reference", "referent");
                if (c44455hM98028j3 != null && (value2 = c44455hM98028j3.getValue()) != null) {
                    lM98435c = value2.m98435c();
                }
                if (lM98435c2 != null && lM98435c != null) {
                    HeapObject heapObjectM98436d = c44455hM98028j2.getValue().m98436d();
                    if (heapObjectM98436d instanceof HeapObject.HeapInstance) {
                        HeapObject.HeapInstance heapInstance2 = (HeapObject.HeapInstance) heapObjectM98436d;
                        if (heapInstance2.m98035q("libcore.util.NativeAllocationRegistry$CleanerThunk") && (c44455hM98028j = heapInstance2.m98028j("libcore.util.NativeAllocationRegistry$CleanerThunk", "this$0")) != null && c44455hM98028j.getValue().m98438f()) {
                            HeapObject heapObjectM98436d2 = c44455hM98028j.getValue().m98436d();
                            if (heapObjectM98436d2 instanceof HeapObject.HeapInstance) {
                                HeapObject.HeapInstance heapInstance3 = (HeapObject.HeapInstance) heapObjectM98436d2;
                                if (heapInstance3.m98035q("libcore.util.NativeAllocationRegistry")) {
                                    Integer num = (Integer) linkedHashMap.get(lM98435c);
                                    int iLongValue = 0;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    C44455h c44455hM98028j4 = heapInstance3.m98028j("libcore.util.NativeAllocationRegistry", "size");
                                    if (c44455hM98028j4 != null && (value = c44455hM98028j4.getValue()) != null && (lM98434b = value.m98434b()) != null) {
                                        iLongValue = (int) lM98434b.longValue();
                                    }
                                    linkedHashMap.put(lM98435c, Integer.valueOf(iIntValue + iLongValue));
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public C44468a(@NotNull InterfaceC44456i interfaceC44456i) {
        this.graph = interfaceC44456i;
    }
}
