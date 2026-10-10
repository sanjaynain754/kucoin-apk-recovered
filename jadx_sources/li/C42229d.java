package li;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.R$string;
import com.kubi.utils.C27017c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import ki.InterfaceC41049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.C38214b;
import p314hi.InterfaceC38213a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: li.d */
/* JADX INFO: compiled from: QtyUnitOfLotStrategy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J,\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J,\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J.\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/trade/config/qty/impl/QtyUnitOfLotStrategy;", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "<init>", "()V", "precision", "", "contract", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "unit", "", "stepOfAdd", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "singleCost", "step", "getQtyByUnit", "anyLotSize", "formatQtyByUnit", "", "getQtyOfLot", "inputQty", ViewProps.TRANSFORM, "transformNoScale", "getMinQtyByUnit", "getMaxQtyByUnit", "isLimit", "", "getValue", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42229d implements InterfaceC41049a {
    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: a */
    public BigDecimal mo90007a(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return bigDecimal2;
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: b */
    public CharSequence mo90008b(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal anyLotSize, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(anyLotSize, "anyLotSize");
        return C42180b.m92640e(anyLotSize, RoundingMode.DOWN, C38214b.m86259h(contract), true, false, false, 0, null, 120, null);
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: c */
    public BigDecimal mo90009c(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal anyLotSize, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(anyLotSize, "anyLotSize");
        BigDecimal scale = anyLotSize.setScale(C38214b.m86259h(contract), RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: d */
    public BigDecimal mo90010d(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return contract.mo86242m();
    }

    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: e */
    public BigDecimal mo90011e(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, boolean z11, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return z11 ? contract.mo86249t() : contract.mo86232c();
    }

    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: f */
    public BigDecimal mo90012f(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return bigDecimal2;
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: g */
    public BigDecimal mo90013g(@NotNull InterfaceC38213a contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return contract.mo86242m();
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo90014h(@NotNull InterfaceC38213a contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return C27017c.f54310a.m66516f(R$string.card, new Object[0]);
    }

    @Override // ki.InterfaceC41049a
    @Nullable
    /* JADX INFO: renamed from: i */
    public BigDecimal mo90015i(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return bigDecimal2;
    }

    @Override // ki.InterfaceC41049a
    @NotNull
    /* JADX INFO: renamed from: j */
    public BigDecimal mo90016j(@NotNull InterfaceC38213a contract, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return contract.mo86242m();
    }

    @Override // ki.InterfaceC41049a
    /* JADX INFO: renamed from: k */
    public int mo90017k(@NotNull InterfaceC38213a contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        return C38214b.m86259h(contract);
    }
}
