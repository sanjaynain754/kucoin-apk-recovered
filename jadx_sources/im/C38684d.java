package im;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27039d;
import fm.C37569d;
import java.math.BigDecimal;
import ki.InterfaceC41049a;
import l30.C42051d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: im.d */
/* JADX INFO: compiled from: BookUtil.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001c\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"mAmountDisplayRule", "Lcom/kubi/tradebase/business/orderbook/PricePrecisionLessThan8;", "formatterAmount", "", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "qtyUnit", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "formatterTotalAmount", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38684d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42051d f86709a = new C42051d();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m87448a(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @NotNull InterfaceC38213a contract, @NotNull InterfaceC41049a qtyUnit) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(qtyUnit, "qtyUnit");
        if (bigDecimal == null) {
            return C37569d.m84684y();
        }
        return f86709a.mo92251a(C27039d.m66656p(qtyUnit.mo90012f(contract, bigDecimal2, bigDecimal, null)).doubleValue(), qtyUnit.mo90017k(contract));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m87449b(@Nullable BigDecimal bigDecimal, @NotNull InterfaceC38213a contract, @NotNull InterfaceC41049a qtyUnit) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(qtyUnit, "qtyUnit");
        if (bigDecimal == null) {
            return C37569d.m84684y();
        }
        return f86709a.mo92251a(bigDecimal.doubleValue(), qtyUnit.mo90017k(contract));
    }
}
