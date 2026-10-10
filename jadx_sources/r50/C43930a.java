package r50;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$string;
import com.kubi.tradingbotkit.business.asset.BotAssetsExt;
import com.kubi.tradingbotkit.entity.asset.AssetsTotalEntity;
import com.kubi.tradingbotkit.entity.asset.TaskAssetAndProfitGroupVO;
import com.kubi.tradingbotkit.entity.asset.TaskAssetAndProfitVO;
import com.kubi.tradingbotkit.entity.asset.TemplateInfo;
import com.kubi.tradingbotkit.model.assets.AssetsOverviewModel;
import com.kubi.tradingbotkit.model.assets.AssetsTotalModel;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C42828b;
import o50.C42974h;
import o50.C42975i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: r50.a */
/* JADX INFO: compiled from: AssetsTotalMapper.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0002R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/tradingbotkit/mapper/assets/AssetsTotalMapper;", "Lcom/kubi/tradingbotkit/mapper/IMapper;", "Lcom/kubi/tradingbotkit/entity/asset/AssetsTotalEntity;", "Lcom/kubi/tradingbotkit/model/assets/AssetsTotalModel;", "<init>", "()V", "map", "input", "genericOverModel", "Lcom/kubi/tradingbotkit/model/assets/AssetsOverviewModel;", "genericList", "", "assetsTotalModel", "getPrefixString", "Lcom/kubi/utils/StyledText;", "totalProfit", "", "setStrategyItemProperty", "strategyListItem", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "taskAssetAndProfitGroupVO", "Lcom/kubi/tradingbotkit/entity/asset/TaskAssetAndProfitGroupVO;", "getTitleFoldName", "subListItemNumber", "", "name", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43930a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f97143a;

    /* JADX INFO: renamed from: c */
    public final C27096v0 m96850c(String str) {
        BigDecimal bigDecimalM66535e = str != null ? DowngradeExKt.m66535e(str, null, 1, null) : null;
        String strM66668h = C27041f.m66668h(bigDecimalM66535e != null ? BotAssetsExt.f52232a.m63782a(bigDecimalM66535e) : null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM66668h);
        sb2.append(bigDecimalM66535e != null ? C42180b.m92640e(bigDecimalM66535e, null, 2, false, false, false, 2, null, 93, null) : null);
        String str2 = (char) 8237 + C42828b.m93911l(C27041f.m66669i(sb2.toString(), "- -")) + "\u202c / ";
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(str2);
        C42975i.m94380a(c27096v0, " / ", R$color.c_text40);
        return c27096v0;
    }

    /* JADX INFO: renamed from: g */
    public final void m96854g(BotAssetsTotalItemModel botAssetsTotalItemModel, TaskAssetAndProfitGroupVO taskAssetAndProfitGroupVO) {
        BigDecimal bigDecimalM66535e;
        botAssetsTotalItemModel.m64224E(1);
        TemplateInfo templateInfo = taskAssetAndProfitGroupVO.getTemplateInfo();
        String strM92640e = null;
        botAssetsTotalItemModel.m64228I(templateInfo != null ? templateInfo.getTitle() : null);
        TemplateInfo templateInfo2 = taskAssetAndProfitGroupVO.getTemplateInfo();
        botAssetsTotalItemModel.m64264x(templateInfo2 != null ? templateInfo2.getDesc() : null);
        TemplateInfo templateInfo3 = taskAssetAndProfitGroupVO.getTemplateInfo();
        botAssetsTotalItemModel.m64222C(templateInfo3 != null ? templateInfo3.getIcon() : null);
        TemplateInfo templateInfo4 = taskAssetAndProfitGroupVO.getTemplateInfo();
        botAssetsTotalItemModel.m64225F(templateInfo4 != null ? templateInfo4.getJumpLink1() : null);
        TemplateInfo templateInfo5 = taskAssetAndProfitGroupVO.getTemplateInfo();
        botAssetsTotalItemModel.m64226G(templateInfo5 != null ? templateInfo5.getJumpLink2() : null);
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.kc_tb_asset_unit;
        String str = this.f97143a;
        botAssetsTotalItemModel.m64238S(c27017c.m66516f(i11, str != null ? C42974h.m94374c(str) : null));
        int i12 = R$string.kc_tb_asset_today_total_p;
        String str2 = this.f97143a;
        botAssetsTotalItemModel.m64235P(c27017c.m66516f(i12, str2 != null ? C42974h.m94374c(str2) : null));
        botAssetsTotalItemModel.m64236Q(taskAssetAndProfitGroupVO.getRunningAmount());
        String runningAmount = taskAssetAndProfitGroupVO.getRunningAmount();
        if (runningAmount != null && (bigDecimalM66535e = DowngradeExKt.m66535e(runningAmount, null, 1, null)) != null) {
            strM92640e = C42180b.m92640e(bigDecimalM66535e, null, 2, false, false, false, 2, null, 93, null);
        }
        botAssetsTotalItemModel.m64237R(strM92640e);
        botAssetsTotalItemModel.m64233N(taskAssetAndProfitGroupVO.getTodayProfit());
        botAssetsTotalItemModel.m64234O(BotAssetsExt.f52232a.m63783b(taskAssetAndProfitGroupVO.getTodayProfit()));
        botAssetsTotalItemModel.m64239T(taskAssetAndProfitGroupVO.getTotalProfit());
        botAssetsTotalItemModel.m64240U(m96850c(taskAssetAndProfitGroupVO.getTotalProfit()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m96848a(AssetsTotalEntity assetsTotalEntity, AssetsTotalModel assetsTotalModel) {
        BigDecimal bigDecimalM66535e;
        int i11;
        BigDecimal bigDecimalM66535e2;
        int i12 = 0;
        assetsTotalModel.setCanExpend(false);
        int i13 = 1;
        boolean zM66763a = C27063n.m66763a("expend_bot_list", true);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TaskAssetAndProfitGroupVO> listM66560c = C27024b.m66560c(assetsTotalEntity.getTaskAssetAndProfitGroupVOList());
        Iterator it = listM66560c.iterator();
        while (it.hasNext()) {
            if (!C27024b.m66560c(((TaskAssetAndProfitGroupVO) it.next()).getTaskAssetAndProfitVOList()).isEmpty()) {
                assetsTotalModel.setCanExpend(true);
            }
        }
        for (TaskAssetAndProfitGroupVO taskAssetAndProfitGroupVO : listM66560c) {
            BotAssetsTotalItemModel botAssetsTotalItemModel = new BotAssetsTotalItemModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, 0, false, null, null, 67108863, null);
            m96854g(botAssetsTotalItemModel, taskAssetAndProfitGroupVO);
            arrayList.add(botAssetsTotalItemModel);
            arrayList2.add(botAssetsTotalItemModel);
            List listM66560c2 = C27024b.m66560c(taskAssetAndProfitGroupVO.getTaskAssetAndProfitVOList());
            botAssetsTotalItemModel.m64231L(Integer.valueOf(listM66560c2.size()));
            botAssetsTotalItemModel.m64220A(m96851d(C27039d.m66650j(botAssetsTotalItemModel.getSubListItemNumber()), botAssetsTotalItemModel.getName()));
            botAssetsTotalItemModel.m64223D(taskAssetAndProfitGroupVO.getTemplateId());
            botAssetsTotalItemModel.m64265y(zM66763a);
            botAssetsTotalItemModel.m64263w(assetsTotalModel.getCanExpend());
            int size = listM66560c2.size();
            int i14 = i12;
            while (i14 < size) {
                TaskAssetAndProfitVO taskAssetAndProfitVO = (TaskAssetAndProfitVO) listM66560c2.get(i14);
                BotAssetsTotalItemModel botAssetsTotalItemModel2 = new BotAssetsTotalItemModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, 0, false, null, null, 67108863, null);
                botAssetsTotalItemModel2.m64224E(2);
                botAssetsTotalItemModel2.m64228I(taskAssetAndProfitVO.getSymbolName());
                botAssetsTotalItemModel2.m64232M(taskAssetAndProfitVO.getSymbol());
                botAssetsTotalItemModel2.m64229J(C27025c.m66566d(taskAssetAndProfitVO.getIsNewAipVersion()));
                botAssetsTotalItemModel2.m64230K(taskAssetAndProfitVO.getNewAipVersionTip());
                C44128b.m97259c("genericList", "genericList: " + botAssetsTotalItemModel2.getName() + " -> " + botAssetsTotalItemModel2.getIsNewAipVersion());
                if (botAssetsTotalItemModel2.getIsNewAipVersion()) {
                    C27017c c27017c = C27017c.f54310a;
                    int i15 = R$string.kc_tb_grid_invest_title;
                    String str = this.f97143a;
                    botAssetsTotalItemModel2.m64238S(c27017c.m66516f(i15, str != null ? C42974h.m94374c(str) : null));
                } else {
                    C27017c c27017c2 = C27017c.f54310a;
                    int i16 = R$string.kc_tb_asset_unit;
                    String str2 = this.f97143a;
                    botAssetsTotalItemModel2.m64238S(c27017c2.m66516f(i16, str2 != null ? C42974h.m94374c(str2) : null));
                }
                if (botAssetsTotalItemModel2.getIsNewAipVersion()) {
                    botAssetsTotalItemModel2.m64236Q(taskAssetAndProfitVO.getTotalCost());
                    String totalCost = taskAssetAndProfitVO.getTotalCost();
                    botAssetsTotalItemModel2.m64237R((totalCost == null || (bigDecimalM66535e2 = DowngradeExKt.m66535e(totalCost, null, i13, null)) == null) ? null : C42180b.m92640e(bigDecimalM66535e2, null, 2, false, false, false, 2, null, 93, null));
                } else {
                    botAssetsTotalItemModel2.m64236Q(taskAssetAndProfitVO.getRunningAmount());
                    String runningAmount = taskAssetAndProfitVO.getRunningAmount();
                    botAssetsTotalItemModel2.m64237R((runningAmount == null || (bigDecimalM66535e = DowngradeExKt.m66535e(runningAmount, null, i13, null)) == null) ? null : C42180b.m92640e(bigDecimalM66535e, null, 2, false, false, false, 2, null, 93, null));
                }
                if (botAssetsTotalItemModel2.getIsNewAipVersion()) {
                    StringBuilder sb2 = new StringBuilder();
                    i11 = 0;
                    sb2.append(C27017c.f54310a.m66516f(R$string.kc_robot_jishu_profit, new Object[0]));
                    String str3 = this.f97143a;
                    sb2.append(str3 != null ? C42974h.m94374c(str3) : null);
                    botAssetsTotalItemModel2.m64235P(sb2.toString());
                } else {
                    i11 = 0;
                    C27017c c27017c3 = C27017c.f54310a;
                    int i17 = R$string.kc_tb_asset_today_total_p;
                    String str4 = this.f97143a;
                    botAssetsTotalItemModel2.m64235P(c27017c3.m66516f(i17, str4 != null ? C42974h.m94374c(str4) : null));
                }
                botAssetsTotalItemModel2.m64233N(taskAssetAndProfitVO.getTodayProfit());
                botAssetsTotalItemModel2.m64234O(BotAssetsExt.f52232a.m63783b(taskAssetAndProfitVO.getTodayProfit()));
                botAssetsTotalItemModel2.m64239T(taskAssetAndProfitVO.getTotalProfit());
                botAssetsTotalItemModel2.m64240U(m96850c(taskAssetAndProfitVO.getTotalProfit()));
                botAssetsTotalItemModel2.m64223D(taskAssetAndProfitVO.getTaskId());
                botAssetsTotalItemModel2.m64227H(i14 == listM66560c2.size() + (-1) ? i13 : i11);
                botAssetsTotalItemModel2.m64266z(i14 == 0 ? i13 : i11);
                arrayList.add(botAssetsTotalItemModel2);
                i14++;
                i12 = i11;
                i13 = i13;
            }
        }
        assetsTotalModel.setExpendList(arrayList);
        assetsTotalModel.setFoldList(arrayList2);
    }

    /* JADX INFO: renamed from: b */
    public final AssetsOverviewModel m96849b(AssetsTotalEntity assetsTotalEntity) {
        BigDecimal bigDecimalM66535e;
        BigDecimal bigDecimalM66535e2;
        BigDecimal bigDecimalM66535e3;
        AssetsOverviewModel assetsOverviewModel = new AssetsOverviewModel();
        assetsOverviewModel.setTotalRunningAmount(assetsTotalEntity.getTotalRunningAmount());
        String totalRunningAmount = assetsTotalEntity.getTotalRunningAmount();
        String strM89946t = null;
        assetsOverviewModel.setTotalRunningAmountShow((totalRunningAmount == null || (bigDecimalM66535e3 = DowngradeExKt.m66535e(totalRunningAmount, null, 1, null)) == null) ? null : C41014a.m89946t(bigDecimalM66535e3, null, 2, false, true, false, false, false, null, 0, 501, null));
        assetsOverviewModel.setTodayRunningProfit(assetsTotalEntity.getTodayRunningProfit());
        String todayRunningProfit = assetsTotalEntity.getTodayRunningProfit();
        assetsOverviewModel.setTodayRunningProfitShow((todayRunningProfit == null || (bigDecimalM66535e2 = DowngradeExKt.m66535e(todayRunningProfit, null, 1, null)) == null) ? null : C41014a.m89946t(bigDecimalM66535e2, null, 2, false, true, false, false, false, null, 0, 501, null));
        assetsOverviewModel.setTotalRunningProfit(assetsTotalEntity.getTotalRunningProfit());
        String totalRunningProfit = assetsTotalEntity.getTotalRunningProfit();
        if (totalRunningProfit != null && (bigDecimalM66535e = DowngradeExKt.m66535e(totalRunningProfit, null, 1, null)) != null) {
            strM89946t = C41014a.m89946t(bigDecimalM66535e, null, 2, false, true, false, false, false, null, 0, 501, null);
        }
        assetsOverviewModel.setTotalRunningProfitShow(strM89946t);
        return assetsOverviewModel;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public AssetsTotalModel m96852e(@NotNull AssetsTotalEntity input) {
        Intrinsics.checkNotNullParameter(input, "input");
        AssetsTotalModel assetsTotalModel = new AssetsTotalModel();
        m96848a(input, assetsTotalModel);
        assetsTotalModel.setAssetOverViewModel(m96849b(input));
        return assetsTotalModel;
    }

    /* JADX INFO: renamed from: f */
    public final void m96853f(@Nullable String str) {
        this.f97143a = str;
    }

    /* JADX INFO: renamed from: d */
    public final C27096v0 m96851d(int i11, String str) {
        String strM94372a = C42974h.m94372a(C42974h.m94374c(String.valueOf(i11)));
        if (i11 > 0) {
            str = C27041f.m66669i(str, "- -") + strM94372a;
        }
        String strM66668h = C27041f.m66668h(str);
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(strM66668h);
        if (i11 > 0) {
            C42975i.m94380a(c27096v0, strM94372a, R$color.complementary);
        }
        return c27096v0;
    }
}
