package com.kubi.futures.guide;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.kubi.kumex.guide.StepGuide;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SiteTransferStepGuide.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/guide/SiteTransferStepGuide;", "Lcom/kubi/kumex/guide/StepGuide;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "priority", "", "runnable", "Ljava/lang/Runnable;", "<init>", "(Lcom/kubi/sdk/BaseFragment;ILjava/lang/Runnable;)V", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getPriority", "()I", "getRunnable", "()Ljava/lang/Runnable;", "showGuide", "", "allowOtherStepGuideFloatToDisplayOnUpper", "", "other", TIMPushProvider.f75063o, "forceNotifyTranslationY", "enabled", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SiteTransferStepGuide implements StepGuide {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f23072e = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BaseFragment f23073b;

    /* JADX INFO: renamed from: c */
    public final int f23074c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Runnable f23075d;

    /* JADX INFO: compiled from: SiteTransferStepGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/guide/SiteTransferStepGuide$Companion;", "", "<init>", "()V", "KEY", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public boolean enabled() {
        return true;
    }

    public SiteTransferStepGuide(@Nullable BaseFragment baseFragment, int i11, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f23073b = baseFragment;
        this.f23074c = i11;
        this.f23075d = runnable;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return false;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF23074c() {
        return this.f23074c;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF23075d() {
        return this.f23075d;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        Lifecycle lifecycle;
        LifecycleCoroutineScope coroutineScope;
        BaseFragment baseFragment = this.f23073b;
        if (baseFragment == null || (lifecycle = baseFragment.getLifecycle()) == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
            return;
        }
        C41696j.m91104d(coroutineScope, null, null, new SiteTransferStepGuide$showGuide$1(this, null), 3, null);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
    }
}
