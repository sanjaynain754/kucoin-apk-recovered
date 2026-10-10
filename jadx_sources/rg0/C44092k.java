package rg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReferenceArray;
import og0.AbstractC43081x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: rg0.k */
/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006¨\u0006\u001a"}, m90084d2 = {"Lrg0/k;", "Log0/x;", "", "id", "prev", "", "pointers", "<init>", "(JLrg0/k;I)V", "index", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "", "toString", "()Ljava/lang/String;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n370#1,2:397\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n383#1:397,2\n*E\n"})
public final class C44092k extends AbstractC43081x<C44092k> {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f97344f;

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF97344f() {
        return this.f97344f;
    }

    public C44092k(long j11, @Nullable C44092k c44092k, int i11) {
        super(j11, c44092k, i11);
        this.f97344f = new AtomicReferenceArray(C44091j.f97343f);
    }

    @Override // og0.AbstractC43081x
    /* JADX INFO: renamed from: r */
    public int mo90699r() {
        return C44091j.f97343f;
    }

    @Override // og0.AbstractC43081x
    /* JADX INFO: renamed from: s */
    public void mo90700s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        getF97344f().set(index, C44091j.f97342e);
        m94644t();
    }
}
