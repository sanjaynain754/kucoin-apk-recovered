package com.kubi.futures.guide;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.kubi.futures.trade.welfare.airdrop.AirDropBonusDialog;
import com.kubi.futures.trade.welfare.airdrop.AirDropDialogManager;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.guide.StepGuide;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AirdropStepGuide.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J(\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/guide/AirdropStepGuide;", "Lcom/kubi/kumex/guide/StepGuide;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "priority", "", "runnable", "Ljava/lang/Runnable;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "<init>", "(Lcom/kubi/sdk/BaseFragment;ILjava/lang/Runnable;Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V", "getFragment", "()Lcom/kubi/sdk/BaseFragment;", "getPriority", "()I", "getRunnable", "()Ljava/lang/Runnable;", "showGuide", "", "allowOtherStepGuideFloatToDisplayOnUpper", "", "other", TIMPushProvider.f75063o, "forceNotifyTranslationY", "enabled", "showAirdropDialog", "(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AirdropStepGuide implements StepGuide {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f23046g = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BaseFragment f23047b;

    /* JADX INFO: renamed from: c */
    public final int f23048c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Runnable f23049d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final AirdropBonusEntity f23050e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final FuturesWelfareTrialItemEntity f23051f;

    /* JADX INFO: compiled from: AirdropStepGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/guide/AirdropStepGuide$Companion;", "", "<init>", "()V", "KEY", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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

    public AirdropStepGuide(@Nullable BaseFragment baseFragment, int i11, @NotNull Runnable runnable, @Nullable AirdropBonusEntity airdropBonusEntity, @Nullable FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f23047b = baseFragment;
        this.f23048c = i11;
        this.f23049d = runnable;
        this.f23050e = airdropBonusEntity;
        this.f23051f = futuresWelfareTrialItemEntity;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BaseFragment getF23047b() {
        return this.f23047b;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF23060c() {
        return this.f23048c;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF23061d() {
        return this.f23049d;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        Lifecycle lifecycle;
        LifecycleCoroutineScope coroutineScope;
        BaseFragment baseFragment = this.f23047b;
        if (baseFragment == null || (lifecycle = baseFragment.getLifecycle()) == null || (coroutineScope = LifecycleKt.getCoroutineScope(lifecycle)) == null) {
            return;
        }
        C41696j.m91104d(coroutineScope, null, null, new AirdropStepGuide$showGuide$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final Object m25564e(BaseFragment baseFragment, AirdropBonusEntity airdropBonusEntity, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, Continuation<? super Boolean> continuation) {
        if (baseFragment.getChildFragmentManager().findFragmentByTag("AirDropBonusDialog") == null && baseFragment.getChildFragmentManager().findFragmentByTag("AIRDROP_ACTIVE_SUCCESS_KEY") == null) {
            AirDropBonusDialog airDropBonusDialog = new AirDropBonusDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", airdropBonusEntity);
            bundle.putString("data_1", C27041f.m66668h(futuresWelfareTrialItemEntity.getCode()));
            airDropBonusDialog.setArguments(bundle);
            FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            airDropBonusDialog.show(childFragmentManager, "AirDropBonusDialog");
            AirDropDialogManager.f24559a.m28347i();
            return airDropBonusDialog.m54187h3().mo91198h(continuation);
        }
        return Boxing.boxBoolean(true);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
    }
}
