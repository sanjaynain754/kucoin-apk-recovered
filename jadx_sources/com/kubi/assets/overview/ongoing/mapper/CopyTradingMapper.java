package com.kubi.assets.overview.ongoing.mapper;

import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.CopyTradingItem;
import com.kubi.assets.entity.TraderInfoResponse;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.DowngradeExKt;
import gb.C37858a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CopyTradingMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/CopyTradingMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;", "Lcom/kubi/assets/entity/CopyTradingItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CopyTradingItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "map", "input", "getProfit", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CopyTradingMapper extends C37858a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f18527a;

    public CopyTradingMapper(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18527a = title;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public ProductItem.CopyTradingItem m18869e(@NotNull CopyTradingItem input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String strM18868d = m18868d(input);
        String strM15120h = AssetExKt.m15120h(input.getTotalPnlRatio(), null, true, false, 5, null);
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb2.append(c27017c.m66516f(R$string.position_profit, new Object[0]));
        sb2.append('(');
        String pnlCurrency = input.getPnlCurrency();
        if (pnlCurrency == null) {
            pnlCurrency = "";
        }
        sb2.append(pnlCurrency);
        sb2.append(')');
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c27017c.m66516f(R$string.kc_tb_grid_invest_title, new Object[0]));
        sb3.append('(');
        String investmentCurrency = input.getInvestmentCurrency();
        if (investmentCurrency == null) {
            investmentCurrency = "";
        }
        sb3.append(investmentCurrency);
        sb3.append(')');
        String string2 = sb3.toString();
        String strM15137y = AssetExKt.m15137y(input.getCopyAmount(), input.getInvestmentCurrency());
        int iM85434a = m85434a(input.getTotalPnlRatio());
        TraderInfoResponse traderInfoResponse = input.getTraderInfoResponse();
        Long leadConfigId = traderInfoResponse != null ? traderInfoResponse.getLeadConfigId() : null;
        TraderInfoResponse traderInfoResponse2 = input.getTraderInfoResponse();
        String avatarUrl = traderInfoResponse2 != null ? traderInfoResponse2.getAvatarUrl() : null;
        TraderInfoResponse traderInfoResponse3 = input.getTraderInfoResponse();
        String nickName = traderInfoResponse3 != null ? traderInfoResponse3.getNickName() : null;
        String str = nickName == null ? "" : nickName;
        String duration = input.getDuration();
        ProductItem.CopyTradingItem copyTradingItem = new ProductItem.CopyTradingItem(leadConfigId, avatarUrl, str, duration != null ? duration : "", strM18868d, strM15120h, string, string2, strM15137y, iM85434a);
        copyTradingItem.m18776c(this.f18527a);
        return copyTradingItem;
    }

    /* JADX INFO: renamed from: d */
    public final String m18868d(CopyTradingItem copyTradingItem) {
        String str;
        if (DowngradeExKt.m66538h(copyTradingItem.getTotalPnl(), 0.0d, 1, null) > 0.0d) {
            str = "+";
        } else {
            str = "";
        }
        return str + AssetExKt.m15118f(copyTradingItem.getTotalPnl(), copyTradingItem.getPnlCurrency());
    }
}
