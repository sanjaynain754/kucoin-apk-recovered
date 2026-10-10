package li;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import ki.InterfaceC41049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.C38214b;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p429lf.C42180b;
import p599rk.C44110b;
import p599rk.C44111c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import uk.C45257b;

/* JADX INFO: renamed from: li.a */
/* JADX INFO: compiled from: QtyUnitOfCostStrategy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J,\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J,\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J.\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/trade/config/qty/impl/QtyUnitOfCostStrategy;", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "<init>", "()V", "precision", "", "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "unit", "", "stepOfAdd", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "singleCost", "step", "getQtyByUnit", "anyLotSize", "formatQtyByUnit", "", "getQtyOfLot", "inputQty", ViewProps.TRANSFORM, "transformNoScale", "getMinQtyByUnit", "getMaxQtyByUnit", "isLimit", "", "getValue", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42226a implements InterfaceC41049a {
    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: a */
    public BigDecimal mo90007a(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(contract, "contract");
        if (!C41014a.m89917B(bigDecimal3)) {
            if (bigDecimal3 == null || (bigDecimalMultiply = bigDecimal3.multiply(C27039d.m66656p(bigDecimal2))) == null) {
                return null;
            }
            return bigDecimalMultiply.setScale(mo90017k(contract), RoundingMode.UP);
        }
        BigDecimal bigDecimalM66656p = C27039d.m66656p(bigDecimal);
        BigDecimal bigDecimalM66656p2 = C27039d.m66656p(bigDecimal2);
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        if (bigDecimalM66656p2.compareTo(bigDecimal4) == 0 || bigDecimalM66656p.compareTo(bigDecimal4) <= 0) {
            return null;
        }
        return bigDecimalM66656p2.multiply(contract.mo86240k()).multiply(bigDecimalM66656p).setScale(mo90017k(contract), RoundingMode.UP);
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: b */
    public CharSequence mo90008b(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal anyLotSize, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(anyLotSize, "anyLotSize");
        BigDecimal bigDecimalM66656p = !C41014a.m89917B(bigDecimal2) ? C27039d.m66656p(bigDecimal2) : anyLotSize.setScale(C41014a.m89952z(contract.mo86242m()), RoundingMode.DOWN).multiply(contract.mo86240k()).multiply(C27039d.m66656p(bigDecimal));
        Intrinsics.checkNotNull(bigDecimalM66656p);
        return C42180b.m92640e(bigDecimalM66656p, RoundingMode.UP, mo90017k(contract), true, false, false, 0, null, 120, null);
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: c */
    public BigDecimal mo90009c(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal anyLotSize, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(anyLotSize, "anyLotSize");
        if (C41014a.m89917B(bigDecimal2)) {
            BigDecimal scale = anyLotSize.setScale(C41014a.m89952z(contract.mo86242m()), RoundingMode.DOWN).multiply(contract.mo86240k()).multiply(C27039d.m66656p(bigDecimal)).setScale(mo90017k(contract), RoundingMode.UP);
            Intrinsics.checkNotNull(scale);
            return scale;
        }
        BigDecimal bigDecimalMultiply = C27039d.m66656p(bigDecimal2).multiply(anyLotSize);
        Intrinsics.checkNotNull(bigDecimalMultiply);
        return bigDecimalMultiply;
    }

    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: d */
    public BigDecimal mo90010d(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        if (!C41014a.m89917B(bigDecimal2)) {
            if (bigDecimal2 != null) {
                return bigDecimal2.setScale(mo90017k(contract), RoundingMode.UP);
            }
            return null;
        }
        if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        return contract.mo86242m().multiply(contract.mo86240k()).multiply(bigDecimal);
    }

    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: e */
    public BigDecimal mo90011e(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, boolean z11, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        if (C41014a.m89917B(bigDecimal2)) {
            if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
                return null;
            }
            return z11 ? contract.mo86249t().multiply(contract.mo86240k()).multiply(bigDecimal) : contract.mo86232c().multiply(contract.mo86240k()).multiply(bigDecimal);
        }
        if (bigDecimal2 != null) {
            BigDecimal bigDecimalMultiply = bigDecimal2.multiply(z11 ? contract.mo86249t() : contract.mo86232c());
            if (bigDecimalMultiply != null) {
                return bigDecimalMultiply.setScale(mo90017k(contract), RoundingMode.UP);
            }
        }
        return null;
    }

    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: f */
    public BigDecimal mo90012f(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        if (!C41014a.m89917B(bigDecimal3)) {
            if (bigDecimal3 != null) {
                return bigDecimal3.multiply(C27039d.m66656p(bigDecimal2));
            }
            return null;
        }
        BigDecimal bigDecimalM66656p = C27039d.m66656p(bigDecimal);
        BigDecimal bigDecimalM66656p2 = C27039d.m66656p(bigDecimal2);
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        if (bigDecimalM66656p2.compareTo(bigDecimal4) == 0 || bigDecimalM66656p.compareTo(bigDecimal4) <= 0) {
            return null;
        }
        return bigDecimalM66656p2.multiply(contract.mo86240k()).multiply(bigDecimalM66656p);
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: g */
    public BigDecimal mo90013g(@NotNull InterfaceC38213a contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return new BigDecimal(String.valueOf(Math.pow(10.0d, ((double) mo90017k(contract)) * (-1.0d))));
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo90014h(@NotNull InterfaceC38213a contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return C27041f.m66669i(C27041f.m66677q(contract.mo86250u()), "USDT");
    }

    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: i */
    public BigDecimal mo90015i(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        if (!C41014a.m89917B(bigDecimal3)) {
            if (bigDecimal2 != null) {
                BigDecimal bigDecimalM66656p = C27039d.m66656p(bigDecimal3);
                int iMo90017k = mo90017k(contract);
                RoundingMode roundingMode = RoundingMode.DOWN;
                BigDecimal bigDecimalDivide = bigDecimal2.divide(bigDecimalM66656p, iMo90017k, roundingMode);
                if (bigDecimalDivide != null) {
                    return bigDecimalDivide.setScale(contract.mo86242m().scale(), roundingMode);
                }
            }
            return null;
        }
        BigDecimal bigDecimalM66656p2 = C27039d.m66656p(bigDecimal);
        BigDecimal bigDecimalM66656p3 = C27039d.m66656p(bigDecimal2);
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        if (bigDecimalM66656p2.compareTo(bigDecimal4) <= 0 || bigDecimalM66656p3.compareTo(bigDecimal4) <= 0) {
            return null;
        }
        BigDecimal bigDecimalMo86242m = contract.mo86242m();
        BigDecimal bigDecimalMo86240k = contract.mo86240k();
        BigDecimal bigDecimalMultiply = bigDecimalMo86242m.multiply(bigDecimalMo86240k);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        int iM89952z = C41014a.m89952z(bigDecimalMultiply) + 1;
        RoundingMode roundingMode2 = RoundingMode.DOWN;
        return bigDecimalM66656p3.divide(bigDecimalM66656p2, iM89952z, roundingMode2).divide(bigDecimalMo86240k, C41014a.m89952z(bigDecimalMo86242m), roundingMode2);
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: j */
    public BigDecimal mo90016j(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        if (!C41014a.m89917B(bigDecimal2)) {
            BigDecimal scale = C27039d.m66656p(bigDecimal2).setScale(mo90017k(contract), RoundingMode.UP);
            Intrinsics.checkNotNull(scale);
            return scale;
        }
        BigDecimal bigDecimalMultiply = contract.mo86242m().multiply(contract.mo86240k());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(C27039d.m66656p(bigDecimal));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal scale2 = BigDecimal.ZERO;
        if (bigDecimalMultiply2.compareTo(scale2) != 0) {
            scale2 = bigDecimalMultiply2.setScale(mo90017k(contract), RoundingMode.UP);
        }
        Intrinsics.checkNotNull(scale2);
        return scale2;
    }

    @Override // ki.InterfaceC41049a
    /* JADX INFO: renamed from: k */
    public int mo90017k(@NotNull InterfaceC38213a contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return C38214b.m86264m(contract);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public BigDecimal m92670l(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) throws Throwable {
        Intrinsics.checkNotNullParameter(contract, "contract");
        BigDecimal bigDecimalMo90015i = mo90015i(contract, bigDecimal, bigDecimal2, bigDecimal3);
        if (bigDecimalMo90015i != null && bigDecimal != null) {
            C44110b c44110bM100039g = C45257b.f101798a.m100039g(contract.mo86246q(), C44111c.m97192c(contract.mo86240k()), C44111c.m97192c(bigDecimal), C44111c.m97192c(bigDecimalMo90015i));
            if (c44110bM100039g != null) {
                return c44110bM100039g.getDecimal();
            }
        }
        return null;
    }
}
