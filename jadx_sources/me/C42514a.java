package me;

import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.spot.helper.SymbolInfoHelper;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.BaseApplication;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.ToastCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ve.C45518a;

/* JADX INFO: renamed from: me.a */
/* JADX INFO: compiled from: CanTradeIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/CanTradeIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/IOrderIntercept;", "<init>", "()V", "checkPreInterceptFailed", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "isMaintenance", "fm", "Landroidx/fragment/app/FragmentManager;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42514a implements InterfaceC42516c {
    @Override // me.InterfaceC42516c
    /* JADX INFO: renamed from: a */
    public boolean mo93235a(@NotNull TradeItemBean tradeItemBean, boolean z11, @Nullable FragmentManager fragmentManager) throws JSONException {
        Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
        if (SymbolInfoHelper.f21263a.m23360a(tradeItemBean, true)) {
            return false;
        }
        C45518a.m100507a("当前交易对币种交易暂停:" + tradeItemBean.getSymbol(), "BaseOrderHolder");
        ToastCompat.m66441G(TextUtils.isEmpty(tradeItemBean.getSymbolInfoEntity().getDisabledTip()) ? BaseApplication.INSTANCE.get().getString(R$string.current_trade_pause) : tradeItemBean.getSymbolInfoEntity().getDisabledTip(), new Object[0]);
        SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_STOP, SpotBusinessTracker.SpotFailReason.CURRENCY_STOP);
        return true;
    }
}
