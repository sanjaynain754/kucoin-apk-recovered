package pe;

import android.content.Context;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.ToastCompat;
import gf.C37890n;
import h30.C38104b;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p758xe.C46153b;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ve.C45518a;

/* JADX INFO: renamed from: pe.f */
/* JADX INFO: compiled from: SpotLimitTradeInputIntercept.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JH\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/input/SpotLimitTradeInputIntercept;", "Lcom/kubi/core/spot/business/holder/intercept/input/ILimitTradeInputIntercept;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "checkInterceptFailed", "", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "inputLimitPrice", "Ljava/math/BigDecimal;", "inputTriggerPrice", "inputNumber", "volumeErrorCallBack", "Lio/reactivex/functions/Consumer;", "balanceNotEnough", "Lkotlin/Function0;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43450f implements InterfaceC43445a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f95979a;

    public C43450f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f95979a = context;
    }

    @Override // pe.InterfaceC43445a
    /* JADX INFO: renamed from: a */
    public boolean mo95653a(@NotNull ITradeHolderDependDelegate parentBehavior, @NotNull BigDecimal inputLimitPrice, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal inputNumber, @Nullable Consumer<BigDecimal> consumer, @NotNull Function0<Boolean> balanceNotEnough) throws Exception {
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(inputLimitPrice, "inputLimitPrice");
        Intrinsics.checkNotNullParameter(inputNumber, "inputNumber");
        Intrinsics.checkNotNullParameter(balanceNotEnough, "balanceNotEnough");
        if (!C46153b.m101747b(C46153b.f103658a, false, 1, null).mo21624a(inputLimitPrice)) {
            return true;
        }
        if (bigDecimal != null && C41014a.m89919D(bigDecimal)) {
            C45518a.m100507a("当前订单-止损价为0", "LimitOrderHolder");
            ToastCompat.m66441G(this.f95979a.getString(R$string.trigger_price_not_zero), new Object[0]);
            SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_LIMIT_PRICE, SpotBusinessTracker.SpotFailReason.LIMIT_PRICE_ILLEGAL);
            return true;
        }
        if (!C38104b.m86031c(inputNumber, new BigDecimal(String.valueOf(parentBehavior.mo22365N().getBaseMinSize())), new BigDecimal(String.valueOf(parentBehavior.mo22365N().getBaseMaxSize())))) {
            C45518a.m100507a("当前订单-数量最大最小值校验失败:当前数量:" + C6447a.m11724a(inputNumber).toPlainString() + " 最小值:" + C6447a.m11724a(new BigDecimal(String.valueOf(parentBehavior.mo22365N().getBaseMinSize()))).toPlainString() + " 最大值:" + C6447a.m11724a(new BigDecimal(String.valueOf(parentBehavior.mo22365N().getBaseMaxSize()))).toPlainString() + ' ', "LimitOrderHolder");
            ToastCompat.m66441G(this.f95979a.getString(R$string.quantity_must_range, C42180b.m92640e(new BigDecimal(String.valueOf(parentBehavior.mo22365N().getBaseMinSize())), null, 20, false, false, false, 0, null, 125, null), C42180b.m92640e(new BigDecimal(String.valueOf(parentBehavior.mo22365N().getBaseMaxSize())), null, 20, false, false, false, 0, null, 125, null)), new Object[0]);
            SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_NUM_RANGE, SpotBusinessTracker.SpotFailReason.NUM_RANGE_ILLEGAL);
            return true;
        }
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(parentBehavior.mo22365N().getQuoteCurrency())));
        BigDecimal bigDecimalMultiply = inputLimitPrice.multiply(inputNumber);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        if (bigDecimalMultiply.compareTo(bigDecimal2) >= 0) {
            if (!balanceNotEnough.invoke().booleanValue()) {
                return false;
            }
            C45518a.m100507a("当前订单-限价单余额不足", "LimitOrderHolder");
            return true;
        }
        C45518a.m100507a("当前订单-成交额最小值校验失败:当前成交额:" + bigDecimalMultiply + " 最小值:" + C6447a.m11724a(bigDecimal2).toPlainString(), "LimitOrderHolder");
        if (consumer != null) {
            consumer.accept(bigDecimal2);
        }
        SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_TURNOVER, SpotBusinessTracker.SpotFailReason.TURNOVER_ILLEGAL);
        return true;
    }
}
