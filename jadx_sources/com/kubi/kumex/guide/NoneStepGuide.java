package com.kubi.kumex.guide;

import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.guide.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NoneStepGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kumex/guide/NoneStepGuide;", "Lcom/kubi/kumex/guide/StepGuide;", "runnable", "Ljava/lang/Runnable;", "<init>", "(Ljava/lang/Runnable;)V", "getRunnable", "()Ljava/lang/Runnable;", "priority", "", "getPriority", "()I", "showGuide", "", "allowOtherStepGuideFloatToDisplayOnUpper", "", "other", TIMPushProvider.f75063o, "forceNotifyTranslationY", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NoneStepGuide implements StepGuide {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Runnable f29193b;

    /* JADX INFO: renamed from: c */
    public final int f29194c;

    public NoneStepGuide(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29193b = runnable;
        this.f29194c = -100;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return true;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF29194c() {
        return this.f29194c;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF29193b() {
        return this.f29193b;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        getF29193b().run();
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
    }
}
