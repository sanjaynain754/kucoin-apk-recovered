package pe;

import android.content.Context;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.ToastCompat;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ve.C45518a;

/* JADX INFO: renamed from: pe.g */
/* JADX INFO: compiled from: SpotMarketTradeInputIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J[\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\t0\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/SpotMarketTradeInputIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/input/IMarketTradeInputIntercept;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "checkInterceptFailed", "", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isBuyHolder", "inputTriggerPrice", "Ljava/math/BigDecimal;", "inputNumber", "showErrorTip", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "numString", "balanceNotEnough", "Lkotlin/Function0;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43451g implements InterfaceC43446b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f95980a;

    public C43451g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f95980a = context;
    }

    @Override // pe.InterfaceC43446b
    /* JADX INFO: renamed from: a */
    public boolean mo95654a(@NotNull ITradeHolderDependDelegate parentBehavior, boolean z11, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal inputNumber, @NotNull Function1<? super String, Boolean> showErrorTip, @NotNull Function0<Boolean> balanceNotEnough) throws JSONException {
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(inputNumber, "inputNumber");
        Intrinsics.checkNotNullParameter(showErrorTip, "showErrorTip");
        Intrinsics.checkNotNullParameter(balanceNotEnough, "balanceNotEnough");
        if (bigDecimal != null && C41014a.m89919D(bigDecimal)) {
            C45518a.m100507a("当前订单-市价止损单&&触发价格为0", "MarketOrderHolder");
            ToastCompat.m66441G(this.f95980a.getString(R$string.trigger_price_not_zero), new Object[0]);
            SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_LIMIT_PRICE, SpotBusinessTracker.SpotFailReason.LIMIT_PRICE_ILLEGAL);
            return true;
        }
        String string = inputNumber.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (showErrorTip.invoke(string).booleanValue()) {
            SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_NUM_RANGE, SpotBusinessTracker.SpotFailReason.NUM_RANGE_ILLEGAL);
            return true;
        }
        if (!balanceNotEnough.invoke().booleanValue()) {
            return false;
        }
        C45518a.m100507a("当前订单-市价单余额不足", "MarketOrderHolder");
        return true;
    }
}
