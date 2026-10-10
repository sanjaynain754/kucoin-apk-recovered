package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import shark.C44455h;
import shark.C44488j;
import shark.HeapObject;
import shark.InterfaceC44456i;

/* JADX INFO: renamed from: shark.internal.k */
/* JADX INFO: compiled from: ShallowSizeCalculator.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lshark/internal/k;", "", "Lshark/i;", "graph", "<init>", "(Lshark/i;)V", "", "objectId", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)I", "Lshark/i;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44485k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final InterfaceC44456i graph;

    /* JADX INFO: renamed from: a */
    public final int m98410a(long objectId) {
        C44488j value;
        HeapObject heapObjectMo98078l = this.graph.mo98078l(objectId);
        Long lValueOf = null;
        if (heapObjectMo98078l instanceof HeapObject.HeapInstance) {
            HeapObject.HeapInstance heapInstance = (HeapObject.HeapInstance) heapObjectMo98078l;
            if (!Intrinsics.areEqual(heapInstance.m98034p(), "java.lang.String")) {
                return heapInstance.m98030l();
            }
            C44455h c44455hM98028j = heapInstance.m98028j("java.lang.String", "value");
            if (c44455hM98028j != null && (value = c44455hM98028j.getValue()) != null) {
                lValueOf = value.m98435c();
            }
            return heapInstance.m98030l() + (lValueOf != null ? m98410a(lValueOf.longValue()) : 0);
        }
        if (!(heapObjectMo98078l instanceof HeapObject.C44426a)) {
            if (heapObjectMo98078l instanceof HeapObject.C44427b) {
                return ((HeapObject.C44427b) heapObjectMo98078l).m98048k();
            }
            if (heapObjectMo98078l instanceof HeapObject.HeapClass) {
                return heapObjectMo98078l.mo98007g();
            }
            throw new NoWhenBranchMatchedException();
        }
        HeapObject.C44426a c44426a = (HeapObject.C44426a) heapObjectMo98078l;
        if (!C44483i.m98402a(c44426a)) {
            return c44426a.m98044j();
        }
        long[] elementIds = c44426a.mo98008h().getElementIds();
        int length = elementIds.length * this.graph.mo98075i();
        for (long j11 : elementIds) {
            if (j11 != 0) {
                lValueOf = Long.valueOf(j11);
                break;
            }
        }
        if (lValueOf == null) {
            return length;
        }
        int iM98410a = m98410a(lValueOf.longValue());
        int i11 = 0;
        for (long j12 : elementIds) {
            if (j12 != 0) {
                i11++;
            }
        }
        return length + (iM98410a * i11);
    }

    public C44485k(@NotNull InterfaceC44456i interfaceC44456i) {
        this.graph = interfaceC44456i;
    }
}
