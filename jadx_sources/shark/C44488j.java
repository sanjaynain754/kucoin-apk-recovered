package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: shark.j */
/* JADX INFO: compiled from: HeapValue.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m90084d2 = {"Lshark/j;", "", "Lshark/i;", "graph", "Lshark/ValueHolder;", C33954u6.f72238i, "<init>", "(Lshark/i;Lshark/ValueHolder;)V", "", "g", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/i;", "getGraph", "()Lshark/i;", "b", "Lshark/ValueHolder;", "e", "()Lshark/ValueHolder;", "", "()Ljava/lang/Integer;", "asInt", "", "()Ljava/lang/Long;", "asLong", "c", "asNonNullObjectId", "", "f", "()Z", "isNonNullReference", "Lshark/HeapObject;", "d", "()Lshark/HeapObject;", "asObject", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class C44488j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44456i graph;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ValueHolder holder;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Integer m98433a() {
        ValueHolder valueHolder = this.holder;
        if (valueHolder instanceof ValueHolder.IntHolder) {
            return Integer.valueOf(((ValueHolder.IntHolder) valueHolder).getValue());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Long m98434b() {
        ValueHolder valueHolder = this.holder;
        if (valueHolder instanceof ValueHolder.LongHolder) {
            return Long.valueOf(((ValueHolder.LongHolder) valueHolder).getValue());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Long m98435c() {
        ValueHolder valueHolder = this.holder;
        if (!(valueHolder instanceof ValueHolder.ReferenceHolder) || ((ValueHolder.ReferenceHolder) valueHolder).m98159b()) {
            return null;
        }
        return Long.valueOf(((ValueHolder.ReferenceHolder) this.holder).getValue());
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final HeapObject m98436d() {
        ValueHolder valueHolder = this.holder;
        if (!(valueHolder instanceof ValueHolder.ReferenceHolder) || ((ValueHolder.ReferenceHolder) valueHolder).m98159b()) {
            return null;
        }
        return this.graph.mo98078l(((ValueHolder.ReferenceHolder) this.holder).getValue());
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ValueHolder getHolder() {
        return this.holder;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m98438f() {
        ValueHolder valueHolder = this.holder;
        return (valueHolder instanceof ValueHolder.ReferenceHolder) && !((ValueHolder.ReferenceHolder) valueHolder).m98159b();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m98439g() {
        HeapObject heapObjectMo98076j;
        HeapObject.HeapInstance heapInstanceM98004d;
        ValueHolder valueHolder = this.holder;
        if (!(valueHolder instanceof ValueHolder.ReferenceHolder) || ((ValueHolder.ReferenceHolder) valueHolder).m98159b() || (heapObjectMo98076j = this.graph.mo98076j(((ValueHolder.ReferenceHolder) this.holder).getValue())) == null || (heapInstanceM98004d = heapObjectMo98076j.m98004d()) == null) {
            return null;
        }
        return heapInstanceM98004d.m98038t();
    }

    public C44488j(@NotNull InterfaceC44456i interfaceC44456i, @NotNull ValueHolder valueHolder) {
        this.graph = interfaceC44456i;
        this.holder = valueHolder;
    }
}
