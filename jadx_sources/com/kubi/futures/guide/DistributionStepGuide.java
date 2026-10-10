package com.kubi.futures.guide;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.kubi.futures.trade.welfare.distribution.DistributionBonusMainDialog;
import com.kubi.futures.trade.welfare.distribution.DistributionManager;
import com.kubi.futures.trade.welfare.distribution.PopupFrequencyManager;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.guide.StepGuide;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DistributionStepGuide.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u001e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/futures/guide/DistributionStepGuide;", "Lcom/kubi/kumex/guide/StepGuide;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "priority", "", "runnable", "Ljava/lang/Runnable;", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "<init>", "(Lcom/kubi/sdk/BaseFragment;ILjava/lang/Runnable;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getPriority", "()I", "getRunnable", "()Ljava/lang/Runnable;", "showGuide", "", "allowOtherStepGuideFloatToDisplayOnUpper", "", "other", TIMPushProvider.f75063o, "forceNotifyTranslationY", "enabled", "showTrialDialog", "(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DistributionStepGuide implements StepGuide {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f23058f = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BaseFragment f23059b;

    /* JADX INFO: renamed from: c */
    public final int f23060c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Runnable f23061d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final FuturesWelfareTrialItemEntity f23062e;

    /* JADX INFO: compiled from: DistributionStepGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/guide/DistributionStepGuide$Companion;", "", "<init>", "()V", "KEY", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

    public DistributionStepGuide(@Nullable BaseFragment baseFragment, int i11, @NotNull Runnable runnable, @Nullable FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f23059b = baseFragment;
        this.f23060c = i11;
        this.f23061d = runnable;
        this.f23062e = futuresWelfareTrialItemEntity;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BaseFragment getF23059b() {
        return this.f23059b;
    }

    /* JADX INFO: renamed from: d */
    public final Object m25581d(BaseFragment baseFragment, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, Continuation<? super Boolean> continuation) {
        if (!PopupFrequencyManager.f24773a.m28615b(C46894j.f104736a.m103273l(C27041f.m66668h(futuresWelfareTrialItemEntity.getCode())))) {
            return Boxing.boxBoolean(true);
        }
        if (baseFragment.getChildFragmentManager().findFragmentByTag("DistributionBonusMainDialog") != null || baseFragment.getChildFragmentManager().findFragmentByTag("DistributionChooseSymbolDialog") != null || baseFragment.getChildFragmentManager().findFragmentByTag("DistributionFinishDialog") != null) {
            return Boxing.boxBoolean(true);
        }
        DistributionBonusMainDialog distributionBonusMainDialog = new DistributionBonusMainDialog();
        distributionBonusMainDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialItemEntity)));
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        distributionBonusMainDialog.show(childFragmentManager, "DistributionBonusMainDialog");
        DistributionManager.f24703a.m28550e();
        return distributionBonusMainDialog.m54187h3().mo91198h(continuation);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF29194c() {
        return this.f23060c;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF29193b() {
        return this.f23061d;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        Lifecycle lifecycle;
        LifecycleCoroutineScope coroutineScope;
        BaseFragment baseFragment = this.f23059b;
        if (baseFragment == null || (lifecycle = baseFragment.getLifecycle()) == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
            return;
        }
        C41696j.m91104d(coroutineScope, null, null, new DistributionStepGuide$showGuide$1(this, null), 3, null);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
    }
}
