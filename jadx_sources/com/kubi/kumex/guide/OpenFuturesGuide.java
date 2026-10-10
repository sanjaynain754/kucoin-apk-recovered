package com.kubi.kumex.guide;

import com.kubi.event.api.C12572a;
import com.kubi.futures.trade.welfare.distribution.PopupFrequencyManager;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17060n0;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37752d;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OpenFuturesGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/guide/OpenFuturesGuide;", "Lcom/kubi/kumex/guide/StepGuide;", "priority", "", "runnable", "Ljava/lang/Runnable;", "<init>", "(ILjava/lang/Runnable;)V", "getPriority", "()I", "getRunnable", "()Ljava/lang/Runnable;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "showGuide", "", "allowOtherStepGuideFloatToDisplayOnUpper", "", "other", TIMPushProvider.f75063o, "forceNotifyTranslationY", "enabled", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OpenFuturesGuide implements StepGuide {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f29111e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f29112f = "OpenFuturesGuide";

    /* JADX INFO: renamed from: b */
    public final int f29113b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Runnable f29114c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public InterfaceC41775x1 f29115d;

    /* JADX INFO: compiled from: OpenFuturesGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/guide/OpenFuturesGuide$Companion;", "", "<init>", "()V", "Key", "", "getKey", "()Ljava/lang/String;", "sendNextStep", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void sendNextStep() {
            C12572a.m23695d("javaClass", null, 0L, 6, null);
        }

        public Companion() {
        }

        @NotNull
        public final String getKey() {
            return OpenFuturesGuide.f29112f;
        }
    }

    public OpenFuturesGuide(int i11, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29113b = i11;
        this.f29114c = runnable;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return false;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public boolean enabled() {
        return KuMexDepend.f30378a.m35905g().c();
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF29106b() {
        return this.f29113b;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF29107c() {
        return this.f29114c;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        if (!PopupFrequencyManager.f24773a.m28615b(C46894j.f104736a.m103263c0())) {
            hide();
        } else {
            InterfaceC37752d.a.m85123b(C37304a.f82764a, C17060n0.m36552b(), null, null, null, null, null, 62, null);
            this.f29115d = C41696j.m91104d(C41713n0.m91125a(C42911a.m94121c()), C41727q2.m91192b(null, 1, null), null, new OpenFuturesGuide$showGuide$1(this, null), 2, null);
        }
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
        getF29107c().run();
        InterfaceC41775x1 interfaceC41775x1 = this.f29115d;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }
}
