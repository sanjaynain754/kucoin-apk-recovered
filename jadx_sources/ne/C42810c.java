package ne;

import android.content.Context;
import com.kubi.resources.C22890g;
import com.kubi.tradecorebiz.R$string;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ne.c */
/* JADX INFO: compiled from: LimitTradeData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m90084d2 = {"getTipsContentRes", "", "Lcom/kubi/core/spot/business/holder/intercept/data/LimitTradeInputData;", "getPriceTipColor", "context", "Landroid/content/Context;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42810c {
    /* JADX INFO: renamed from: a */
    public static final int m93839a(@NotNull LimitTradeInputData limitTradeInputData, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(limitTradeInputData, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return limitTradeInputData.getIsBuy() ? C22890g.m54291p(context) : C22890g.m54289n(context);
    }

    /* JADX INFO: renamed from: b */
    public static final int m93840b(@NotNull LimitTradeInputData limitTradeInputData) {
        Intrinsics.checkNotNullParameter(limitTradeInputData, "<this>");
        return limitTradeInputData.getIsBuy() ? R$string.kc_trade_order_priceprotect_buy : R$string.kc_trade_order_priceprotect_sell;
    }
}
