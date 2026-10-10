package com.kubi.payment.p2p;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.sdk.BaseApplication;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: P2PHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PHelper;", "", "<init>", "()V", "DIALOG_TAG_FRAUD", "", "DIALOG_TAG_REVENUE", "TYPE_P2P_SELL", "loadTaxInfo", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showFraudAlert", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "showTaxInfoAlert", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "showTaxExplainDialog", "preCheckSpecifiedTax", "onContinue", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final P2PHelper f39683a = new P2PHelper();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m48409a(@NotNull Continuation<? super TaxInfo> continuation) {
        P2PHelper$loadTaxInfo$1 p2PHelper$loadTaxInfo$1;
        if (continuation instanceof P2PHelper$loadTaxInfo$1) {
            p2PHelper$loadTaxInfo$1 = (P2PHelper$loadTaxInfo$1) continuation;
            int i11 = p2PHelper$loadTaxInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p2PHelper$loadTaxInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                p2PHelper$loadTaxInfo$1 = new P2PHelper$loadTaxInfo$1(this, continuation);
            }
        } else {
            p2PHelper$loadTaxInfo$1 = new P2PHelper$loadTaxInfo$1(this, continuation);
        }
        Object objMo48480W = p2PHelper$loadTaxInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = p2PHelper$loadTaxInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo48480W);
            IP2PRepository iP2PRepositoryM48466d = P2PServiceLocator.m48466d(BaseApplication.INSTANCE.get());
            p2PHelper$loadTaxInfo$1.label = 1;
            objMo48480W = iP2PRepositoryM48466d.mo48480W("P2P_SELL", p2PHelper$loadTaxInfo$1);
            if (objMo48480W == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo48480W);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo48480W;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            return (TaxInfo) ((AbstractC42878k.Success) abstractC42878k).m94040a();
        }
        C44128b.m97261e("P2PHelper", "loadRevenueInfo failed.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m48410b(@NotNull FragmentManager fragmentManager, @NotNull LifecycleCoroutineScope coroutineScope, @NotNull Function0<Unit> onContinue) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        coroutineScope.launchWhenStarted(new P2PHelper$preCheckSpecifiedTax$1(onContinue, fragmentManager, null));
    }

    /* JADX INFO: renamed from: c */
    public final void m48411c(@NotNull FragmentManager fragmentManager, @NotNull LifecycleCoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        coroutineScope.launchWhenResumed(new P2PHelper$showFraudAlert$1(fragmentManager, null));
    }

    /* JADX INFO: renamed from: d */
    public final void m48412d(@NotNull FragmentManager fragmentManager, @NotNull LifecycleCoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        coroutineScope.launchWhenStarted(new P2PHelper$showTaxExplainDialog$1(fragmentManager, null));
    }

    /* JADX INFO: renamed from: e */
    public final void m48413e(@NotNull FragmentManager fragmentManager, @NotNull LifecycleCoroutineScope coroutineScope, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(callback, "callback");
        coroutineScope.launchWhenStarted(new P2PHelper$showTaxInfoAlert$1(callback, fragmentManager, null));
    }
}
