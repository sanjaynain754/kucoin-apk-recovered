package fm;

import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33556b3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p343ii.C38645a;
import p402kf.C41014a;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: fm.b */
/* JADX INFO: compiled from: ContractEntityEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0002\u001a\f\u0010\t\u001a\u00020\u0005*\u0004\u0018\u00010\u0002\u001a\f\u0010\n\u001a\u00020\u0005*\u0004\u0018\u00010\u0002\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0002\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0014\u001a\u00020\u000e*\u0004\u0018\u00010\u0002\u001a\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0016\u001a\u00020\u0011*\u0004\u0018\u00010\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u000e\u001a\n\u0010\u0019\u001a\u00020\u001a*\u00020\u0002¨\u0006\u001b"}, m90084d2 = {"isForeverContract", "", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "isLot", "getMaxLeverage", "", "copyTradingForcefulFutureConfig", "getPricePrecision", "getAmountPrecision", "getShortPrecision", "getLongPrecision", "getIndexPrecision", "getTradePrecision", "getSettleUnit", "", "getSettleUnitPrecision", "getMinMarginAmount", "Ljava/math/BigDecimal;", "isStopTrade", "getSettleCurrencyShow", "getQuoteCurrencyShow", "getCurrencyShow", "getMaxPrice", "meetSearchRuleOf", "searchText", "toContractConfig", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContractEntityEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractEntityEx.kt\ncom/kubi/kumex/extensions/ContractEntityExKt\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n28#2:197\n20#2:198\n24#2:199\n16#2:200\n1#3:201\n*S KotlinDebug\n*F\n+ 1 ContractEntityEx.kt\ncom/kubi/kumex/extensions/ContractEntityExKt\n*L\n89#1:197\n89#1:198\n96#1:199\n96#1:200\n*E\n"})
public final class C37567b {
    /* JADX INFO: renamed from: c */
    public static final int m84613c(@Nullable ContractEntity contractEntity) {
        PropertyEntity properties;
        Integer displayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(contractEntity != null ? contractEntity.getSettleCurrency() : null), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            displayPrecision = properties.getDisplayPrecision();
        }
        return C27039d.m66651k(displayPrecision, 8);
    }

    /* JADX INFO: renamed from: d */
    public static final int m84614d(@Nullable ContractEntity contractEntity, boolean z11) {
        BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntity != null ? contractEntity.getMaxLeverage() : null, C27025c.m66566d(contractEntity != null ? Boolean.valueOf(m84625o(contractEntity)) : null) ? C33556b3.f68995S : "20");
        return z11 ? bigDecimalM89921F.intValue() : bigDecimalM89921F.min(BrokerConfig.f19211a.m20201d().mo20234V()).intValue();
    }

    /* JADX INFO: renamed from: m */
    public static final int m84623m(@Nullable ContractEntity contractEntity) {
        PropertyEntity properties;
        Integer shortDisplayPrecision = null;
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(contractEntity != null ? contractEntity.getSettleCurrency() : null), false, 2, null);
        if (coinEntityM99528E != null && (properties = coinEntityM99528E.getProperties()) != null) {
            shortDisplayPrecision = properties.getShortDisplayPrecision();
        }
        return C27039d.m66651k(shortDisplayPrecision, 4);
    }

    /* JADX INFO: renamed from: a */
    public static final int m84611a(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        BigDecimal bigDecimalM11724a = C6447a.m11724a(C41014a.m89921F(contractEntity.getLotSize(), "1"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        return C41014a.m89952z(bigDecimalM11724a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m84612b(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        BigDecimal bigDecimalM11724a = C6447a.m11724a(C41014a.m89921F(contractEntity.getIndexPriceTickSize(), "0.01"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        return C41014a.m89952z(bigDecimalM11724a);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m84615e(ContractEntity contractEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m84614d(contractEntity, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final BigDecimal m84616f(@Nullable ContractEntity contractEntity) {
        return contractEntity == null ? new BigDecimal("1000000") : C41014a.m89921F(contractEntity.getMaxPrice(), "1000000");
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final BigDecimal m84617g(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        BigDecimal scale = new BigDecimal(String.valueOf(Math.max(DowngradeExKt.m66535e("1", null, 1, null).divide(C41014a.m89921F(contractEntity.getTakerFeeRate(), "1"), 10, RoundingMode.HALF_EVEN).multiply(new BigDecimal(String.valueOf(Math.pow(10.0d, -8.0d)))).doubleValue(), (C27025c.m66566d(Boolean.valueOf(contractEntity.isInverse())) ? new BigDecimal("0.0000001") : new BigDecimal("0.01")).doubleValue()))).setScale(m84613c(contractEntity), RoundingMode.UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }

    /* JADX INFO: renamed from: h */
    public static final int m84618h(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        BigDecimal bigDecimalM11724a = C6447a.m11724a(C41014a.m89921F(contractEntity.getTickSize(), "1"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalM11724a, "stripTrailingZeros(...)");
        return C41014a.m89952z(bigDecimalM11724a);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m84619i(@Nullable ContractEntity contractEntity) {
        return C27041f.m66668h(contractEntity != null ? contractEntity.getQuoteCurrency() : null);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final String m84620j(@Nullable ContractEntity contractEntity) {
        return C27041f.m66677q(C27041f.m66668h(contractEntity != null ? contractEntity.getSettleCurrency() : null));
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m84621k(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        return C27041f.m66668h(C27041f.m66677q(contractEntity.isInverse() ? contractEntity.getQuoteCurrency() : contractEntity.getDisplayBaseCurrency()));
    }

    /* JADX INFO: renamed from: l */
    public static final int m84622l(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        return contractEntity.isInverse() ? m84611a(contractEntity) : m84624n(contractEntity);
    }

    /* JADX INFO: renamed from: n */
    public static final int m84624n(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        BigDecimal bigDecimalM89921F = C41014a.m89921F(contractEntity.getLotSize(), "1");
        BigDecimal bigDecimalAbs = C41014a.m89921F(contractEntity.getMultiplier(), "1").abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        BigDecimal bigDecimalMultiply = bigDecimalM89921F.multiply(bigDecimalAbs);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return C41014a.m89952z(bigDecimalMultiply);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m84625o(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        return Intrinsics.areEqual(contractEntity.getType(), "FFWCSX");
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m84626p(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        return contractEntity.isInverse() || C46527h0.f104291a.m102681Q();
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m84627q(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        return Intrinsics.areEqual(contractEntity.getStatus(), "BeingSettled") || Intrinsics.areEqual(contractEntity.getStatus(), "PrepareSettled");
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m84628r(@Nullable ContractEntity contractEntity, @NotNull String searchText) {
        String quoteCurrency;
        String strM66677q;
        String displayBaseCurrency;
        String strM66677q2;
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        String string = null;
        String string2 = (contractEntity == null || (displayBaseCurrency = contractEntity.getDisplayBaseCurrency()) == null || (strM66677q2 = C27041f.m66677q(displayBaseCurrency)) == null) ? null : StringsKt.trim((CharSequence) strM66677q2).toString();
        if (contractEntity != null && (quoteCurrency = contractEntity.getQuoteCurrency()) != null && (strM66677q = C27041f.m66677q(quoteCurrency)) != null) {
            string = StringsKt.trim((CharSequence) strM66677q).toString();
        }
        String string3 = StringsKt.trim((CharSequence) searchText).toString();
        if ((string2 == null || !StringsKt.contains((CharSequence) string2, (CharSequence) string3, true)) && (string == null || !StringsKt.contains((CharSequence) string, (CharSequence) string3, true))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2 == null ? "" : string2);
            sb2.append(string == null ? "" : string);
            if (!StringsKt.contains((CharSequence) sb2.toString(), (CharSequence) string3, true)) {
                StringBuilder sb3 = new StringBuilder();
                if (string2 == null) {
                    string2 = "";
                }
                sb3.append(string2);
                sb3.append("/");
                if (string == null) {
                    string = "";
                }
                sb3.append(string);
                if (!StringsKt.contains((CharSequence) sb3.toString(), (CharSequence) string3, true)) {
                    return false;
                }
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final InterfaceC38213a m84629s(@NotNull ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(contractEntity, "<this>");
        return new C38645a(contractEntity);
    }
}
