package p314hi;

import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import ki.C41050b;
import ki.InterfaceC41049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: hi.b */
/* JADX INFO: compiled from: IFuturesContractConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\f\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0002\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b\u001a\n\u0010\u000b\u001a\u00020\b*\u00020\u0002\u001a&\u0010\f\u001a\u00020\b*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b\u001a*\u0010\u000e\u001a\u0004\u0018\u00010\b*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b\u001a*\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b\u001a\n\u0010\u0012\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u001a\n\u0010\u0018\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0019\u001a\u00020\u0015*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u001b\u001a\u00020\b*\u00020\u0002¨\u0006\u001c"}, m90084d2 = {"getQtyPrecisionOfLot", "", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "getQtyPrecision", "getSettleUnit", "", "getQtyUnit", "getQtyStepOfAdd", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "singleCost", "getQtyStep", "getQtyByUnit", "anyLotSize", "getQtyOfLot", "delegationPrice", "inputQty", "getReverseQty", "getPriceStep", "getPricePrecision", "isLot", "", "userConfig", "Lcom/kubi/futures/trade/config/IFuturesUserConfig;", "getShortPrecision", "isSettled", "getIndexPrecision", "getIndexPriceStep", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIFuturesContractConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IFuturesContractConfig.kt\ncom/kubi/futures/trade/config/IFuturesContractConfigKt\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,300:1\n20#2:301\n*S KotlinDebug\n*F\n+ 1 IFuturesContractConfig.kt\ncom/kubi/futures/trade/config/IFuturesContractConfigKt\n*L\n278#1:301\n*E\n"})
public final class C38214b {
    /* JADX INFO: renamed from: a */
    public static final int m86252a(@NotNull InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        BigDecimal bigDecimalM11724a = C6447a.m11724a(C41014a.m89921F(interfaceC38213a.mo86230a(), "0.01"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        return C41014a.m89952z(bigDecimalM11724a);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BigDecimal m86253b(@NotNull InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        return interfaceC38213a.mo86230a();
    }

    /* JADX INFO: renamed from: c */
    public static final int m86254c(@NotNull InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        return C41014a.m89952z(interfaceC38213a.mo86248s());
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final BigDecimal m86255d(@NotNull InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        return interfaceC38213a.mo86248s();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final BigDecimal m86256e(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @NotNull BigDecimal anyLotSize, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        Intrinsics.checkNotNullParameter(anyLotSize, "anyLotSize");
        return C41050b.f91264a.m90021d().mo90009c(interfaceC38213a, bigDecimal, anyLotSize, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final BigDecimal m86257f(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        return C41050b.f91264a.m90021d().mo90015i(interfaceC38213a, bigDecimal, bigDecimal2, bigDecimal3);
    }

    /* JADX INFO: renamed from: g */
    public static final int m86258g(@NotNull InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        return C41050b.f91264a.m90021d().mo90017k(interfaceC38213a);
    }

    /* JADX INFO: renamed from: h */
    public static final int m86259h(@NotNull InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        BigDecimal bigDecimalM11724a = C6447a.m11724a(interfaceC38213a.mo86242m());
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        return C41014a.m89952z(bigDecimalM11724a);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final BigDecimal m86260i(@NotNull InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        return C41050b.f91264a.m90021d().mo90013g(interfaceC38213a);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final BigDecimal m86261j(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        return C41050b.f91264a.m90021d().mo90016j(interfaceC38213a, bigDecimal, bigDecimal2);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m86262k(@Nullable InterfaceC38213a interfaceC38213a) {
        String strMo90014h;
        return (interfaceC38213a == null || (strMo90014h = C41050b.f91264a.m90021d().mo90014h(interfaceC38213a)) == null) ? C27017c.f54310a.m66516f(R$string.card, new Object[0]) : strMo90014h;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final BigDecimal m86263l(@NotNull InterfaceC38213a interfaceC38213a, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        C41050b c41050b = C41050b.f91264a;
        InterfaceC41049a interfaceC41049aM90021d = c41050b.m90021d();
        InterfaceC41049a interfaceC41049aM90023f = c41050b.m90023f();
        return interfaceC41049aM90021d.mo90007a(interfaceC38213a, bigDecimal, interfaceC41049aM90023f != null ? interfaceC41049aM90023f.mo90015i(interfaceC38213a, bigDecimal, bigDecimal2, bigDecimal3) : null, bigDecimal3);
    }

    /* JADX INFO: renamed from: m */
    public static final int m86264m(@NotNull InterfaceC38213a interfaceC38213a) {
        PropertyEntity properties;
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        Integer shortDisplayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), interfaceC38213a.mo86250u(), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        return C27039d.m66651k(shortDisplayPrecision, 4);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m86265n(@NotNull InterfaceC38213a interfaceC38213a) {
        Intrinsics.checkNotNullParameter(interfaceC38213a, "<this>");
        return Intrinsics.areEqual(interfaceC38213a.status(), "BeingSettled") || Intrinsics.areEqual(interfaceC38213a.status(), "PrepareSettled");
    }
}
