package n40;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.beginnerGuide.C26090i;
import com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.entity.gudiGuide.PictureEntity;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import o50.C42970d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n40.a */
/* JADX INFO: compiled from: FuturesFirstPageInfo.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/beginnerGuide/futuresGrid/FuturesFirstPageInfo;", "Lcom/kubi/tradingbotkit/business/beginnerGuide/IGuideInformation;", "<init>", "()V", "getLayoutId", "", "getPageTitle", "showPagePicture", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "mutableMap", "", "", "Lcom/kubi/tradingbotkit/entity/gudiGuide/PictureEntity;", "showPageInformation", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42746a implements IGuideInformation {
    @Override // com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation
    /* JADX INFO: renamed from: a */
    public int mo63847a() {
        return R$string.kc_tb_guide_create;
    }

    @Override // com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation
    /* JADX INFO: renamed from: b */
    public void mo63848b(@NotNull View view, @NotNull Map<String, PictureEntity> mutableMap) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(mutableMap, "mutableMap");
        PictureEntity pictureEntity = mutableMap.get("futures_longshort");
        View viewFindViewById = view.findViewById(R$id.iv_direction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        String strM63842a = C26090i.m63842a(pictureEntity);
        int i11 = R$mipmap.kucoin_icon_guide_place_holder_small;
        C42970d.m94364a((ImageView) viewFindViewById, strM63842a, i11);
        PictureEntity pictureEntity2 = mutableMap.get("price_range");
        View viewFindViewById2 = view.findViewById(R$id.iv_price_range);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C42970d.m94364a((ImageView) viewFindViewById2, C26090i.m63842a(pictureEntity2), i11);
        PictureEntity pictureEntity3 = mutableMap.get("grid_number");
        View viewFindViewById3 = view.findViewById(R$id.iv_grid_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C42970d.m94364a((ImageView) viewFindViewById3, C26090i.m63842a(pictureEntity3), i11);
        PictureEntity pictureEntity4 = mutableMap.get("invest");
        View viewFindViewById4 = view.findViewById(R$id.tv_invest);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        C42970d.m94364a((ImageView) viewFindViewById4, C26090i.m63842a(pictureEntity4), i11);
        PictureEntity pictureEntity5 = mutableMap.get("bot_create");
        View viewFindViewById5 = view.findViewById(R$id.iv_create);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        C42970d.m94364a((ImageView) viewFindViewById5, C26090i.m63842a(pictureEntity5), i11);
    }

    @Override // com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation
    /* JADX INFO: renamed from: c */
    public int mo63849c() {
        return R$layout.btrading_bot_kit_fragment_guide_futures_grid_create_strategy;
    }

    @Override // com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation
    /* JADX INFO: renamed from: d */
    public void mo63850d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextView textView = (TextView) view.findViewById(R$id.tv_direction);
        C27017c c27017c = C27017c.f54310a;
        textView.setText(t0.a("1.", c27017c.m66516f(R$string.kc_tb_guide_longshort, new Object[0])));
        ((TextView) view.findViewById(R$id.tv_price_range)).setText(t0.a("2.", c27017c.m66516f(R$string.kc_tb_grid_order_section, new Object[0])));
        ((TextView) view.findViewById(R$id.tv_suspend_number)).setText(t0.a("3.", c27017c.m66516f(R$string.kc_tb_grid_order_suspend_num, new Object[0])));
        ((TextView) view.findViewById(R$id.tv_investment)).setText(t0.a("4.", c27017c.m66516f(R$string.kc_tb_grid_invest_title, new Object[0])));
    }
}
