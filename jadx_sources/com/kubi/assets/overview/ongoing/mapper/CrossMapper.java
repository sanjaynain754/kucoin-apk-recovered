package com.kubi.assets.overview.ongoing.mapper;

import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.FundsInfo;
import com.kubi.assets.entity.MarginPositionDetail;
import com.kubi.assets.entity.RiskViewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import gb.C37858a;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.mapper.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CrossMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0003H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/mapper/CrossMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/BaseMapper;", "Lcom/kubi/assets/overview/ongoing/mapper/IMapper;", "Lcom/kubi/assets/entity/MarginPositionDetail;", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$CrossItem;", "number", "", "hasMore", "", "<init>", "(ILjava/lang/Boolean;)V", "getNumber", "()I", "Ljava/lang/Boolean;", "map", "input", "gerProfit", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossMapper.kt\ncom/kubi/assets/overview/ongoing/mapper/CrossMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class CrossMapper extends C37858a {

    /* JADX INFO: renamed from: a */
    public final int f18528a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Boolean f18529b;

    @NotNull
    /* JADX INFO: renamed from: e */
    public ProductItem.CrossItem m18871e(@NotNull MarginPositionDetail input) {
        Object next;
        Intrinsics.checkNotNullParameter(input, "input");
        C27017c c27017c = C27017c.f54310a;
        String currency = null;
        String strM66551u = DowngradeExKt.m66551u(c27017c.m66516f(R$string.kc_assets_my_margin, new Object[0]), new Object[]{Integer.valueOf(this.f18528a)}, null, 2, null);
        String strM18870d = m18870d(input);
        String strM15120h = AssetExKt.m15120h(input.getTodayPnlRatio(), null, true, false, 5, null);
        String str = c27017c.m66516f(R$string.margin_profit_loss, new Object[0]) + '(' + input.getBalanceCurrency() + ')';
        int iM85434a = m85434a(input.getTodayPnlRatio());
        String strM66668h = C27041f.m66668h(input.getStatus());
        double dM66538h = DowngradeExKt.m66538h(input.getLiabilityRate(), 0.0d, 1, null);
        AssetsDepend assetsDepend = AssetsDepend.f18689a;
        String strM66668h2 = C27041f.m66668h(assetsDepend.m19183d().mo37923W());
        BigDecimal bigDecimalMo37963u0 = assetsDepend.m19183d().mo37963u0(false, "");
        BigDecimal bigDecimalMo37962u = assetsDepend.m19183d().mo37962u(false, "");
        List<FundsInfo> fundsInfoList = input.getFundsInfoList();
        if (fundsInfoList != null) {
            Iterator<T> it = fundsInfoList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (DowngradeExKt.m66538h(((FundsInfo) next).getLiability(), 0.0d, 1, null) <= 0.0d);
            FundsInfo fundsInfo = (FundsInfo) next;
            if (fundsInfo != null) {
                currency = fundsInfo.getCurrency();
            }
        }
        ProductItem.CrossItem crossItem = new ProductItem.CrossItem(this.f18528a, strM18870d, strM15120h, str, input.getFundsInfoList(), this.f18529b, iM85434a, new RiskViewEntity(strM66668h, dM66538h, strM66668h2, bigDecimalMo37963u0, bigDecimalMo37962u, currency, false));
        crossItem.m18776c(strM66551u);
        return crossItem;
    }

    public CrossMapper(int i11, @Nullable Boolean bool) {
        this.f18528a = i11;
        this.f18529b = bool;
    }

    /* JADX INFO: renamed from: d */
    public final String m18870d(MarginPositionDetail marginPositionDetail) {
        String str;
        if (DowngradeExKt.m66538h(marginPositionDetail.getTodayPnlAmount(), 0.0d, 1, null) > 0.0d) {
            str = "+";
        } else {
            str = "";
        }
        return str + AssetExKt.m15137y(marginPositionDetail.getTodayPnlAmount(), marginPositionDetail.getBalanceCurrency());
    }
}
