package com.kubi.assets.overview.ongoing.mapper;

import com.kubi.assets.R$string;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.entity.PositionWrapperEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import gb.C37858a;
import gf.C37890n;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ContractMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/ContractMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;", "Lcom/kubi/kumex/entity/PositionWrapperEntity;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$ContractItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "map", "input", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ContractMapper extends C37858a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f18526a;

    public ContractMapper(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18526a = title;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public ProductItem.ContractItem m18867d(@NotNull PositionWrapperEntity input) {
        Intrinsics.checkNotNullParameter(input, "input");
        C37890n c37890n = C37890n.f85269a;
        String spotCurrency = input.getSpotCurrency();
        if (spotCurrency == null) {
            spotCurrency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(spotCurrency);
        String iconUrl = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null;
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb2.append(c27017c.m66516f(R$string.position_profit, new Object[0]));
        sb2.append('(');
        sb2.append(C27041f.m66677q(input.getSettleCurrency()));
        sb2.append(')');
        String string = sb2.toString();
        String str = C27039d.m66647g(input.getUnPnl()) > 0.0d ? "+" : "";
        BigDecimal roi = input.getRoi();
        int iM85434a = m85434a(roi != null ? roi.toPlainString() : null);
        String strM66516f = Intrinsics.areEqual(input.getMarginMode(), SharedPositionInfo.MARGIN_MODE_ISOLATED) ? c27017c.m66516f(R$string.force_close_price, new Object[0]) : c27017c.m66516f(R$string.kumex_position_risk_ratio, new Object[0]);
        String formatLiquidationPrice = Intrinsics.areEqual(input.getMarginMode(), SharedPositionInfo.MARGIN_MODE_ISOLATED) ? input.getFormatLiquidationPrice() : input.getFormatRiskRatio();
        ProductItem.ContractItem contractItem = new ProductItem.ContractItem(iconUrl, input.getFormatSide(), string, str + input.getFormatUnPnl(), str + input.getFormatRoi(), input.getFormatMarginMode(), input.getFormatLeverage(), input.getFormatSymbol(), input.getSymbol(), strM66516f, formatLiquidationPrice, input.getFormatMarkPrice(), input.getMarginMode(), input.isTrial(), input.getPrizeType(), iM85434a);
        contractItem.m18776c(this.f18526a);
        return contractItem;
    }
}
