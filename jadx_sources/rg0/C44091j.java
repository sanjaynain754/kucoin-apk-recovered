package rg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.payment.fast.data.entities.RecurringPlan;
import og0.C43045a0;
import og0.C43051d0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rg0.j */
/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u001a"}, m90084d2 = {"", "permits", "acquiredPermits", "Lrg0/g;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(II)Lrg0/g;", "", "id", "Lrg0/k;", "prev", "j", "(JLrg0/k;)Lrg0/k;", "I", "MAX_SPIN_CYCLES", "Log0/a0;", "b", "Log0/a0;", "PERMIT", "c", "TAKEN", "d", "BROKEN", "e", RecurringPlan.CANCELLED, "f", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C44091j {

    /* JADX INFO: renamed from: a */
    public static final int f97338a = C43051d0.m94568e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C43045a0 f97339b = new C43045a0("PERMIT");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C43045a0 f97340c = new C43045a0("TAKEN");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C43045a0 f97341d = new C43045a0("BROKEN");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C43045a0 f97342e = new C43045a0(RecurringPlan.CANCELLED);

    /* JADX INFO: renamed from: f */
    public static final int f97343f = C43051d0.m94568e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC44088g m97147a(int i11, int i12) {
        return new C44090i(i11, i12);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC44088g m97148b(int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return m97147a(i11, i12);
    }

    /* JADX INFO: renamed from: j */
    public static final C44092k m97156j(long j11, C44092k c44092k) {
        return new C44092k(j11, c44092k, 0);
    }
}
