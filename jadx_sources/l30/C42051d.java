package l30;

import com.kubi.utils.C27021e;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: l30.d */
/* JADX INFO: compiled from: PricePrecisionLessThan8.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradebase/business/orderbook/PricePrecisionLessThan8;", "Lcom/kubi/tradebase/business/orderbook/IOrderBookAmountDisplayRule;", "<init>", "()V", "amountDisplayRule", "", "amount", "", "amountPrecision", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42051d implements InterfaceC42048a {
    @Override // l30.InterfaceC42048a
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo92251a(double d11, int i11) {
        if (d11 >= 1000.0d && d11 < 1000000.0d) {
            return C42180b.m92640e(new BigDecimal(String.valueOf(C27021e.m66525d(d11, 1000.0d, 2, 1))), null, 2, true, false, false, 0, null, 121, null) + 'K';
        }
        if (d11 >= 1000000.0d && d11 < 1.0E9d) {
            return C42180b.m92640e(new BigDecimal(String.valueOf(C27021e.m66525d(d11, 1000000.0d, 2, 1))), null, 2, true, false, false, 0, null, 121, null) + 'M';
        }
        if (d11 >= 1.0E9d && d11 < 1.0E12d) {
            return C42180b.m92640e(new BigDecimal(String.valueOf(C27021e.m66525d(d11, 1.0E9d, 3, 1))), null, 3, true, false, false, 0, null, 121, null) + 'B';
        }
        if (d11 >= 1.0E12d) {
            return C42180b.m92640e(new BigDecimal(String.valueOf(C27021e.m66525d(d11, 1.0E12d, 3, 1))), null, 3, true, false, false, 0, null, 121, null) + 'T';
        }
        return C42180b.m92640e(new BigDecimal(String.valueOf(d11)), null, i11, true, true, false, 0, null, 113, null);
    }
}
