package com.kubi.core.spot.business.holder;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.spot.business.businessTrack.DurationTrackManager;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.tradecorebiz.R$string;
import com.kubi.user.api.IUserService;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37759k;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43841b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.core.spot.business.holder.c0 */
/* JADX INFO: compiled from: HolderEx.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a&\u0010\n\u001a\u00020\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\f\u001a\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010\u001a\u001a\u00020\b*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u001e\u0010\u001e\u001a\u00020\b*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0010¨\u0006!"}, m90084d2 = {"setInputHintText", "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "viewGroup", "id", "", "hint", "", "refreshTrailRadioButton", "", "Landroid/widget/RadioButton;", "refreshRadioButton", "isBuyHolder", "", "buyBg", "sellBg", "getFormatMoney", "", "totalValue", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "showBySymbol", "checkHasSetPwd", "fragment", "Lcom/kubi/sdk/BaseFragment;", "fm", "Landroidx/fragment/app/FragmentManager;", "clearInputFocus", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "trackOrderSuccessOrFail", "success", "errorMsg", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHolderEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolderEx.kt\ncom/kubi/core/spot/business/holder/HolderExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
public final class C12322c0 {
    /* JADX INFO: renamed from: c */
    public static final boolean m23253c(@NotNull FragmentManager fm2) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        if (IUserService.a.get().d0().isWithDrawPassword()) {
            return true;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.go_set_trade_pwd).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: com.kubi.core.spot.business.holder.a0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C12322c0.m23254d(dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).show(fm2, "check_pwd");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final void m23254d(DialogInterface dialogInterface, int i11) {
        InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m23255e(@NotNull KcPrimaryButton kcPrimaryButton, @NotNull Action action) throws Exception {
        Intrinsics.checkNotNullParameter(kcPrimaryButton, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        kcPrimaryButton.setFocusable(true);
        kcPrimaryButton.setFocusableInTouchMode(true);
        kcPrimaryButton.requestFocus();
        action.run();
        kcPrimaryButton.setFocusable(false);
        kcPrimaryButton.setFocusableInTouchMode(false);
        kcPrimaryButton.clearFocus();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m23256f(@NotNull BigDecimal totalValue, @NotNull String currency, boolean z11) {
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return C41014a.m89948v(C41014a.m89940n(totalValue, currency), null, null, 0, false, true, z11, 15, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m23257g(BigDecimal bigDecimal, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return m23256f(bigDecimal, str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final BaseOrderHolder m23258h(@NotNull BaseOrderHolder viewGroup, int i11, @NotNull CharSequence hint) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(hint, "hint");
        View viewFindViewById = viewGroup.findViewById(i11);
        if (viewFindViewById instanceof TradeInputLayoutProxy) {
            ((TradeInputLayoutProxy) viewFindViewById).setHint(hint);
            return viewGroup;
        }
        if (viewFindViewById instanceof EditText) {
            ((EditText) viewFindViewById).setHint(hint);
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: i */
    public static final void m23259i(@NotNull final BaseOrderHolder baseOrderHolder, boolean z11, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "<this>");
        if (z11) {
            SpotInputProgressView progressPercent = baseOrderHolder.getProgressPercent();
            if (progressPercent != null) {
                progressPercent.m23419J();
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.kubi.core.spot.business.holder.b0
                @Override // java.lang.Runnable
                public final void run() {
                    C12322c0.m23260j(baseOrderHolder);
                }
            });
            SpotBusinessTracker.f21010a.trackSpotOrderSuccess();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", z11);
        if (str == null) {
            str = "none";
        }
        jSONObject.put("fail_reason", str);
        String trackOrderType = baseOrderHolder.getTrackOrderType();
        if (trackOrderType == null) {
            trackOrderType = "";
        }
        jSONObject.put("pricing_type", trackOrderType);
        String symbol = baseOrderHolder.getF21029b().mo22365N().getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        jSONObject.put("trade_pair", symbol);
        jSONObject.put("trade_type", baseOrderHolder.getF21036i() ? "buy" : "sell");
        String baseCurrency = baseOrderHolder.getF21029b().mo22365N().getBaseCurrency();
        jSONObject.put("trade_currency", baseCurrency != null ? baseCurrency : "");
        jSONObject.put("trade_service_type", SpotBusinessTracker.f21010a.getTradeServiceType());
        C43852m.m96605q("trade_results", jSONObject);
        if (z11) {
            DurationTrackManager.Companion companion = DurationTrackManager.f21006c;
            C43841b.m96556c("unified_click_submit_spot_order", "show_toast", companion.getInstance().getF21009b());
            C43841b.m96556c("unified_click_submit_spot_order_without_pass", "show_toast", companion.getInstance().getF21009b());
            C43841b.m96557d("unified_refresh_delegation_list", "unified_wait_socket", null, 4, null);
        } else {
            DurationTrackManager.Companion companion2 = DurationTrackManager.f21006c;
            C43841b.m96554a("unified_click_submit_spot_order", companion2.getInstance().getF21009b());
            C43841b.m96554a("unified_click_submit_spot_order_without_pass", companion2.getInstance().getF21009b());
        }
        DurationTrackManager.f21006c.getInstance().m22856c();
    }

    /* JADX INFO: renamed from: j */
    public static final void m23260j(BaseOrderHolder baseOrderHolder) {
        try {
            Result.Companion companion = Result.INSTANCE;
            baseOrderHolder.getNumEditText().getEditText().setText("");
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
