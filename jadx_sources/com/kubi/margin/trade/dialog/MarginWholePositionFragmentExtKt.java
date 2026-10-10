package com.kubi.margin.trade.dialog;

import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.margin.R$string;
import com.kubi.margin.trade.position.MarginWholePositionFragment;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.utils.ToastCompat;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: MarginWholePositionFragmentExt.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\b\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\nH\u0002¨\u0006\u000b"}, m90084d2 = {"collectEventFlowForUI", "", "Lcom/kubi/margin/trade/position/MarginWholePositionFragment;", "cancelLiquidationResultCallback", "cancelLiquidationResultException", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event$CancelClosePositionResultFailed;", "closePositionResultSuccess", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event$ClosePositionResultSuccess;", "closePositionResultException", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$Event$ClosePositionResultFailed;", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginWholePositionFragmentExtKt {
    /* JADX INFO: renamed from: e */
    public static final void m40252e() {
        ToastCompat.m66437C(R$string.margin_one_key_close_cancel_ok_tips);
    }

    /* JADX INFO: renamed from: h */
    public static final void m40255h(ClosePositionResultSuccess closePositionResultSuccess) {
        ToastCompat.m66437C(R$string.kc_margin_cross_close_position_doing);
    }

    /* JADX INFO: renamed from: i */
    public static final void m40256i(@NotNull MarginWholePositionFragment marginWholePositionFragment) {
        Intrinsics.checkNotNullParameter(marginWholePositionFragment, "<this>");
        LifecycleOwnerKt.getLifecycleScope(marginWholePositionFragment).launchWhenCreated(new MarginWholePositionFragmentExtKt$collectEventFlowForUI$1(marginWholePositionFragment, null));
    }

    /* JADX INFO: renamed from: f */
    public static final void m40253f(CancelClosePositionResultFailed cancelClosePositionResultFailed) {
        C19331c.m42836c(cancelClosePositionResultFailed.getE(), null, 2, null);
        C44128b.m97264h(cancelClosePositionResultFailed.getE());
    }

    /* JADX INFO: renamed from: g */
    public static final void m40254g(ClosePositionResultFailed closePositionResultFailed) {
        C19331c.m42836c(closePositionResultFailed.getE(), null, 2, null);
        C44128b.m97264h(closePositionResultFailed.getE());
    }
}
