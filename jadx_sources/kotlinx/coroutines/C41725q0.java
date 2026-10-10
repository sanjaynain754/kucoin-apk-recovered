package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43047b0;
import og0.C43074q;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.q0 */
/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0007\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0002¨\u0006\u000b"}, m90084d2 = {"Lkotlinx/coroutines/t0;", "b", "()Lkotlinx/coroutines/t0;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "defaultMainDelayOptIn", "Lkotlinx/coroutines/t0;", "getDefaultDelay$annotations", "()V", "DefaultDelay", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41725q0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f91771a = C43047b0.m94543f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC41758t0 f91772b = m91190b();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC41758t0 m91189a() {
        return f91772b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC41758t0 m91190b() {
        if (!f91771a) {
            return RunnableC41721p0.f91769h;
        }
        AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
        return (C43074q.m94633c(abstractC41586e2M91393c) || !(abstractC41586e2M91393c instanceof InterfaceC41758t0)) ? RunnableC41721p0.f91769h : (InterfaceC41758t0) abstractC41586e2M91393c;
    }
}
