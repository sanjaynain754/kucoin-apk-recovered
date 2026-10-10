package o40;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.beginnerGuide.C26090i;
import com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation;
import com.kubi.tradingbotkit.entity.gudiGuide.PictureEntity;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import o50.C42970d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o40.b */
/* JADX INFO: compiled from: SpotIntroductionPageInfo.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/beginnerGuide/spotGrid/SpotIntroductionPageInfo;", "Lcom/kubi/tradingbotkit/business/beginnerGuide/IGuideInformation;", "<init>", "()V", "getPageTitle", "", "showPagePicture", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "mutableMap", "", "", "Lcom/kubi/tradingbotkit/entity/gudiGuide/PictureEntity;", "showPageInformation", "getLayoutId", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42960b implements IGuideInformation {
    @Override // com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation
    /* JADX INFO: renamed from: a */
    public int mo63847a() {
        return R$string.kc_tb_guide_spot;
    }

    @Override // com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation
    /* JADX INFO: renamed from: b */
    public void mo63848b(@NotNull View view, @NotNull Map<String, PictureEntity> mutableMap) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(mutableMap, "mutableMap");
        PictureEntity pictureEntity = mutableMap.get("kline");
        View viewFindViewById = view.findViewById(R$id.iv_instruction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C42970d.m94364a((ImageView) viewFindViewById, C26090i.m63842a(pictureEntity), R$mipmap.kucoin_icon_guide_place_holder_big);
    }

    @Override // com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation
    /* JADX INFO: renamed from: c */
    public int mo63849c() {
        return R$layout.btrading_bot_kit_fragment_strategy_introduction;
    }

    @Override // com.kubi.tradingbotkit.business.beginnerGuide.IGuideInformation
    /* JADX INFO: renamed from: d */
    public void mo63850d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((TextView) view.findViewById(R$id.tv_introduction)).setText(C27017c.f54310a.m66516f(R$string.kc_tb_guide_spot_desc, new Object[0]));
    }
}
