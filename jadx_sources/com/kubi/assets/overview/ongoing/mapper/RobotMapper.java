package com.kubi.assets.overview.ongoing.mapper;

import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.RobotItem;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import gb.C37858a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RobotMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/RobotMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;", "Lcom/kubi/assets/entity/RobotItem;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "map", "input", "getBuildCurrency", "quota", "gerProfit", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RobotMapper extends C37858a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f18532a;

    public RobotMapper(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18532a = title;
    }

    /* JADX INFO: renamed from: e */
    public final String m18884e(String str) {
        return '(' + C27041f.m66669i(str, "--") + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public ProductItem.RobotItem m18885f(@NotNull RobotItem input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int drawableId = RobotType.INSTANCE.fromType(input.getType()).getDrawableId();
        String symbol = input.getSymbol();
        String str = symbol == null ? "" : symbol;
        String i18nType = input.getI18nType();
        String str2 = i18nType == null ? "" : i18nType;
        String strM15137y = AssetExKt.m15137y(input.getTotalCost(), input.getQuota());
        String strM18883d = m18883d(input);
        String strM15120h = AssetExKt.m15120h(input.getTotalProfitRate(), null, true, false, 5, null);
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb2.append(c27017c.m66516f(R$string.position_profit, new Object[0]));
        sb2.append(m18884e(input.getQuota()));
        ProductItem.RobotItem robotItem = new ProductItem.RobotItem(input.getId(), input.getType(), drawableId, str, str2, strM15137y, strM18883d, strM15120h, sb2.toString(), c27017c.m66516f(R$string.kc_tb_grid_invest_title, new Object[0]) + m18884e(input.getQuota()), m85434a(input.getTotalProfitRate()));
        robotItem.m18776c(this.f18532a);
        return robotItem;
    }

    /* JADX INFO: renamed from: d */
    public final String m18883d(RobotItem robotItem) {
        String str;
        if (DowngradeExKt.m66538h(robotItem.getTotalProfit(), 0.0d, 1, null) > 0.0d) {
            str = "+";
        } else {
            str = "";
        }
        return str + AssetExKt.m15118f(robotItem.getTotalProfit(), robotItem.getQuota());
    }
}
