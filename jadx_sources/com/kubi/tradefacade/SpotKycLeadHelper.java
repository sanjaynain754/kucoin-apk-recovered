package com.kubi.tradefacade;

import androidx.lifecycle.LifecycleCoroutineScope;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotKycLeadView.kt */
/* JADX INFO: loaded from: classes49.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ8\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rJ\u0010\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradefacade/SpotKycLeadHelper;", "", "<init>", "()V", "checkKycLead", "", "leadView", "Lcom/kubi/tradefacade/SpotKycLeadView;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "tradeFragment", "Lcom/kubi/tradefacade/TradeFragment;", "trackPageProvider", "Lkotlin/Function0;", "", "displayAllowedProvider", "", "kycClickExpose", "from", "depositClickExpose", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotKycLeadHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SpotKycLeadHelper f51852a = new SpotKycLeadHelper();

    /* JADX INFO: renamed from: e */
    public static final boolean m63455e() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m63454d(SpotKycLeadHelper spotKycLeadHelper, SpotKycLeadView spotKycLeadView, LifecycleCoroutineScope lifecycleCoroutineScope, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function1 = new Function0() { // from class: com.kubi.tradefacade.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(SpotKycLeadHelper.m63455e());
                }
            };
        }
        spotKycLeadHelper.m63457c(spotKycLeadView, lifecycleCoroutineScope, function0, function1);
    }

    /* JADX INFO: renamed from: b */
    public final void m63456b(@Nullable SpotKycLeadView spotKycLeadView, @NotNull LifecycleCoroutineScope lifecycleScope, @NotNull TradeFragment tradeFragment) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        m63454d(this, spotKycLeadView, lifecycleScope, new SpotKycLeadHelper$checkKycLead$1(tradeFragment), null, 8, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m63457c(@Nullable SpotKycLeadView spotKycLeadView, @NotNull LifecycleCoroutineScope lifecycleScope, @NotNull Function0<String> trackPageProvider, @NotNull Function0<Boolean> displayAllowedProvider) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(trackPageProvider, "trackPageProvider");
        Intrinsics.checkNotNullParameter(displayAllowedProvider, "displayAllowedProvider");
        if (spotKycLeadView != null) {
            C41696j.m91104d(lifecycleScope, C42911a.m94120b(), null, new SpotKycLeadHelper$checkKycLead$3$1(displayAllowedProvider, spotKycLeadView, trackPageProvider, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m63458f(@Nullable String str) {
        if (str != null) {
            C43852m.m96591c(str, "openOrders", "verifyNowButton", null, 8, null);
        }
    }
}
