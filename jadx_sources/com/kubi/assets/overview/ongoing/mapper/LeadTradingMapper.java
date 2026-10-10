package com.kubi.assets.overview.ongoing.mapper;

import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.LeadTradingItem;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import gb.C37858a;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeadTradingMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u000fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u000e\u0010\f\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\r\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u000e\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/LeadTradingMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;", "Lcom/kubi/assets/entity/LeadTradingItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LeadTradingItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "map", "input", "getProfit", "normalizeSide", "normalizeMarginMode", "asLeverageText", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LeadTradingMapper extends C37858a {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f18432b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f18433a;

    /* JADX INFO: compiled from: LeadTradingMapper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/LeadTradingMapper$Companion;", "", "<init>", "()V", "SIDE_LONG", "", "SIDE_SHORT", "MARGIN_MODE_CROSS", "MARGIN_MODE_ISOLATED", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LeadTradingMapper(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18433a = title;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public ProductItem.LeadTradingItem m18771f(@NotNull LeadTradingItem input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = C27017c.f54310a.m66516f(R$string.position_profit, new Object[0]) + '(' + C27041f.m66668h(input.getPnlCurrency()) + ')';
        String strM18770e = m18770e(input);
        String strM15120h = AssetExKt.m15120h(input.getPnlRatio(), null, true, false, 5, null);
        IKuMexService iKuMexServiceM19180c = AssetsDepend.m19180c();
        String symbol = input.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        C27096v0 c27096v0M33249T = IKuMexService.m33249T(iKuMexServiceM19180c, symbol, false, 2, null);
        IKuMexService iKuMexServiceM19180c2 = AssetsDepend.m19180c();
        String symbol2 = input.getSymbol();
        Object obj = iKuMexServiceM19180c2.mo33286o(symbol2 != null ? symbol2 : "").get("baseCurrency");
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66669i(C27041f.m66677q(obj != null ? obj.toString() : null), "BTC"));
        ProductItem.LeadTradingItem leadTradingItem = new ProductItem.LeadTradingItem(input.getSymbol(), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, m18773h(input.getPositionSide()), c27096v0M33249T, m18772g(input.getMarginMode()), m18769d(input.getLeverage()), str, strM18770e, strM15120h, AssetExKt.m15137y(input.getMarkPrice(), input.getPnlCurrency()), AssetExKt.m15137y(input.getLiquidationPrice(), input.getPnlCurrency()), m85434a(input.getPnlRatio()));
        leadTradingItem.m18776c(this.f18433a);
        return leadTradingItem;
    }

    /* JADX INFO: renamed from: g */
    public final String m18772g(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (Intrinsics.areEqual(upperCase, "CROSS")) {
            return C27017c.f54310a.m66516f(R$string.kumex_cross_position, new Object[0]);
        }
        return Intrinsics.areEqual(upperCase, SharedPositionInfo.MARGIN_MODE_ISOLATED) ? C27017c.f54310a.m66516f(R$string.kumex_isolate_position, new Object[0]) : C27041f.m66669i(str, "--");
    }

    /* JADX INFO: renamed from: h */
    public final String m18773h(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (Intrinsics.areEqual(upperCase, SharedPositionInfo.SIDE_LONG)) {
            return C27017c.f54310a.m66516f(R$string.contract_long, new Object[0]);
        }
        return Intrinsics.areEqual(upperCase, SharedPositionInfo.SIDE_SHORT) ? C27017c.f54310a.m66516f(R$string.contract_short, new Object[0]) : C27041f.m66669i(str, "--");
    }

    /* JADX INFO: renamed from: d */
    public final String m18769d(String str) {
        String plainString;
        BigDecimal bigDecimalM11724a;
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
        if (bigDecimalM66536f != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimalM66536f)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        } else {
            plainString = null;
        }
        return C27041f.m66669i(plainString, "--") + 'X';
    }

    /* JADX INFO: renamed from: e */
    public final String m18770e(LeadTradingItem leadTradingItem) {
        String str;
        if (DowngradeExKt.m66538h(leadTradingItem.getPnl(), 0.0d, 1, null) > 0.0d) {
            str = "+";
        } else {
            str = "";
        }
        return str + AssetExKt.m15118f(leadTradingItem.getPnl(), leadTradingItem.getPnlCurrency());
    }
}
