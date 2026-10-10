package com.kubi.assets.overview.ongoing.mapper;

import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.RiskViewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gb.C37858a;
import gf.C37885i;
import gf.C37890n;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IsolatedMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/IsolatedMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;", "Lcom/kubi/margin/api/entity/MarginPosition;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$IsolatedItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "map", "input", "isIntercept", "", "getProfitText", "getProfitRateText", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IsolatedMapper extends C37858a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f18531a;

    public IsolatedMapper(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18531a = title;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public ProductItem.IsolatedItem m18882g(@NotNull MarginPosition input) {
        Intrinsics.checkNotNullParameter(input, "input");
        C37890n c37890n = C37890n.f85269a;
        CurrencyBalance baseAsset = input.getBaseAsset();
        String currency = baseAsset != null ? baseAsset.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
        String tag = input.getTag();
        SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(tag != null ? tag : "");
        String iconUrl = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null;
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb2.append(c27017c.m66516f(R$string.margin_isolated, new Object[0]));
        sb2.append(' ');
        sb2.append(C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, "--"));
        String string = sb2.toString();
        String strM18880e = m18880e(input);
        String strM18879d = m18879d(input);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c27017c.m66516f(R$string.margin_profit_loss, new Object[0]));
        sb3.append('(');
        CurrencyBalance quoteAsset = input.getQuoteAsset();
        sb3.append(C27041f.m66669i(quoteAsset != null ? quoteAsset.getCurrencyName() : null, "--"));
        sb3.append(')');
        String string2 = sb3.toString();
        BigDecimal bigDecimalCalculatorProfitPercent = input.calculatorProfitPercent();
        int iM85434a = m85434a(bigDecimalCalculatorProfitPercent != null ? bigDecimalCalculatorProfitPercent.toPlainString() : null);
        String markPriceString = input.getMarkPriceString();
        AssetsDepend assetsDepend = AssetsDepend.f18689a;
        BigDecimal bigDecimalMo37962u = assetsDepend.m19183d().mo37962u(true, C27041f.m66668h(input.getTag()));
        ProductItem.IsolatedItem isolatedItem = new ProductItem.IsolatedItem(input.getTag(), iconUrl, string, strM18880e, strM18879d, string2, markPriceString, input.liquidationPriceString(bigDecimalMo37962u), iM85434a, new RiskViewEntity(C27041f.m66668h(input.getStatus()), C27039d.m66647g(input.calculatorLiabilityRate()), C27041f.m66668h(input.getRiskGrade()), assetsDepend.m19183d().mo37963u0(true, C27041f.m66668h(input.getTag())), bigDecimalMo37962u, null, true));
        isolatedItem.m18776c(this.f18531a);
        return isolatedItem;
    }

    /* JADX INFO: renamed from: d */
    public final String m18879d(MarginPosition marginPosition) {
        BigDecimal bigDecimalCalculatorProfitPercent;
        if (m18881f(marginPosition) || (bigDecimalCalculatorProfitPercent = marginPosition.calculatorProfitPercent()) == null) {
            return "--";
        }
        return AssetExKt.m15120h(bigDecimalCalculatorProfitPercent.toPlainString(), null, true, false, 5, null);
    }

    /* JADX INFO: renamed from: e */
    public final String m18880e(MarginPosition marginPosition) {
        String strM92640e;
        String currency;
        if (m18881f(marginPosition)) {
            return "--";
        }
        IMarginService iMarginService = IMarginService.f32724a.get();
        String tag = marginPosition.getTag();
        String str = "";
        if (tag == null) {
            tag = "";
        }
        Integer numMo37972z = iMarginService.mo37972z(tag);
        BigDecimal bigDecimalCalculatorProfitValue = marginPosition.calculatorProfitValue();
        if (bigDecimalCalculatorProfitValue == null) {
            return "--";
        }
        if (C27039d.m66646f(Double.valueOf(bigDecimalCalculatorProfitValue.doubleValue())) > 0.0d) {
            str = "+";
        }
        if (numMo37972z == null) {
            CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
            if (quoteAsset != null) {
                currency = quoteAsset.getCurrency();
            } else {
                currency = null;
            }
            strM92640e = C37885i.m85563b(bigDecimalCalculatorProfitValue, C27041f.m66668h(currency), 0, 2, null);
        } else {
            strM92640e = C42180b.m92640e(bigDecimalCalculatorProfitValue, null, numMo37972z.intValue(), false, true, false, 2, null, 85, null);
        }
        return str + strM92640e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18881f(MarginPosition marginPosition) {
        Integer numValueOf;
        if (!Intrinsics.areEqual(marginPosition.getStatus(), "BANKRUPTCY") && !Intrinsics.areEqual(marginPosition.getStatus(), "IN_LIQUIDATION")) {
            BigDecimal bigDecimalLiabilityConversionCompat = marginPosition.liabilityConversionCompat();
            if (bigDecimalLiabilityConversionCompat != null) {
                numValueOf = Integer.valueOf(bigDecimalLiabilityConversionCompat.compareTo(BigDecimal.ZERO));
            } else {
                numValueOf = null;
            }
            if (C27039d.m66650j(numValueOf) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
