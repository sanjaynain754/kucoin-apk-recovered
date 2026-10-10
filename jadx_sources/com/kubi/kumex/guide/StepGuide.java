package com.kubi.kumex.guide;

import com.kubi.kumex.service.KuMexDepend;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.guide.l0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: StepGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H&J\b\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u0011\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kumex/guide/StepGuide;", "", "priority", "", "getPriority", "()I", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "showGuide", "", "allowOtherStepGuideFloatToDisplayOnUpper", "", "other", TIMPushProvider.f75063o, "forceNotifyTranslationY", "compareTo", "enabled", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface StepGuide extends Comparable<StepGuide> {
    /* JADX INFO: renamed from: H2 */
    boolean mo25562H2(@NotNull StepGuide stepGuide);

    /* JADX INFO: renamed from: W1 */
    void mo33798W1();

    int getPriority();

    @NotNull
    Runnable getRunnable();

    void hide();

    /* JADX INFO: renamed from: q2 */
    void mo25565q2();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    default int compareTo(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.getPriority() - getPriority();
    }

    default boolean enabled() {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        return kuMexDepend.m35905g().c() && kuMexDepend.m35906h();
    }
}
