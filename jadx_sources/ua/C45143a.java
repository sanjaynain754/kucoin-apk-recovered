package ua;

import com.kubi.monitor.duration.DurationCate;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ua.a */
/* JADX INFO: compiled from: AssertsDurationRuleSetting.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/duration/AssertsDurationRuleSetting;", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "<init>", "()V", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssertsDurationRuleSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssertsDurationRuleSetting.kt\ncom/kubi/assets/duration/AssertsDurationRuleSetting\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,169:1\n37#2:170\n37#2:171\n37#2:172\n37#2:173\n37#2:174\n37#2:175\n37#2:176\n37#2:177\n37#2:178\n37#2:179\n37#2:180\n37#2:181\n37#2:182\n*S KotlinDebug\n*F\n+ 1 AssertsDurationRuleSetting.kt\ncom/kubi/assets/duration/AssertsDurationRuleSetting\n*L\n24#1:170\n32#1:171\n40#1:172\n48#1:173\n56#1:174\n64#1:175\n73#1:176\n81#1:177\n89#1:178\n97#1:179\n105#1:180\n113#1:181\n121#1:182\n*E\n"})
public final class C45143a implements IDurationRuleSetting {
    @Override // com.kubi.monitor.duration.IDurationRuleSetting
    @NotNull
    public List<DurationRule> getRules() {
        DurationRule.Companion companion = DurationRule.INSTANCE;
        DurationRule.C19218a c19218a = new DurationRule.C19218a();
        c19218a.m42430i("B1overview_account_detail_load");
        DurationCate durationCate = DurationCate.page_load;
        c19218a.m42429h(durationCate);
        c19218a.m42432k("page_load_start");
        c19218a.m42428g(CollectionsKt.listOf("page_load_end"));
        Unit unit = Unit.INSTANCE;
        DurationRule durationRuleM42422a = c19218a.m42422a();
        DurationRule.C19218a c19218a2 = new DurationRule.C19218a();
        c19218a2.m42430i("B1overview_charge_record_load");
        c19218a2.m42429h(durationCate);
        c19218a2.m42432k("page_load_start");
        c19218a2.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a2 = c19218a2.m42422a();
        DurationRule.C19218a c19218a3 = new DurationRule.C19218a();
        c19218a3.m42430i("B1depositCoinList_choose_coin_load");
        c19218a3.m42429h(durationCate);
        c19218a3.m42432k("page_load_start");
        c19218a3.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a3 = c19218a3.m42422a();
        DurationRule.C19218a c19218a4 = new DurationRule.C19218a();
        c19218a4.m42430i("B1depositpage_net_choose_load");
        c19218a4.m42429h(durationCate);
        c19218a4.m42432k("page_load_start");
        c19218a4.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a4 = c19218a4.m42422a();
        DurationRule.C19218a c19218a5 = new DurationRule.C19218a();
        c19218a5.m42430i("B1withdrawCoinList_choose_coin_load");
        c19218a5.m42429h(durationCate);
        c19218a5.m42432k("page_load_start");
        c19218a5.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a5 = c19218a5.m42422a();
        DurationRule.C19218a c19218a6 = new DurationRule.C19218a();
        c19218a6.m42430i("B1withdrawPage_available_coin_load");
        c19218a6.m42429h(durationCate);
        c19218a6.m42432k("page_load_start");
        c19218a6.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a6 = c19218a6.m42422a();
        DurationRule.C19218a c19218a7 = new DurationRule.C19218a();
        c19218a7.m42430i("B1mainAccount_account_detail_load");
        c19218a7.m42429h(durationCate);
        c19218a7.m42432k("page_load_start");
        c19218a7.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a7 = c19218a7.m42422a();
        DurationRule.C19218a c19218a8 = new DurationRule.C19218a();
        c19218a8.m42430i("B5TradeAccount_account_detail_load");
        c19218a8.m42429h(durationCate);
        c19218a8.m42432k("page_load_start");
        c19218a8.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a8 = c19218a8.m42422a();
        DurationRule.C19218a c19218a9 = new DurationRule.C19218a();
        c19218a9.m42430i("B1DepositPage_net_address_click");
        DurationCate durationCate2 = DurationCate.click;
        c19218a9.m42429h(durationCate2);
        c19218a9.m42432k("click_start_btn");
        c19218a9.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a9 = c19218a9.m42422a();
        DurationRule.C19218a c19218a10 = new DurationRule.C19218a();
        c19218a10.m42430i("B1withdrawPage_withdraw_click");
        c19218a10.m42429h(durationCate2);
        c19218a10.m42432k("click_start_btn");
        c19218a10.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a10 = c19218a10.m42422a();
        DurationRule.C19218a c19218a11 = new DurationRule.C19218a();
        c19218a11.m42430i("Transfer_currency_click");
        c19218a11.m42429h(durationCate2);
        c19218a11.m42432k("click_start_btn");
        c19218a11.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a11 = c19218a11.m42422a();
        DurationRule.C19218a c19218a12 = new DurationRule.C19218a();
        c19218a12.m42430i("b1overview_transfer_load");
        c19218a12.m42429h(durationCate);
        c19218a12.m42432k("page_load_start");
        c19218a12.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a12 = c19218a12.m42422a();
        DurationRule.C19218a c19218a13 = new DurationRule.C19218a();
        c19218a13.m42430i("b1overview_asset_detail_load");
        c19218a13.m42429h(durationCate);
        c19218a13.m42432k("page_load_start");
        c19218a13.m42428g(CollectionsKt.listOf("data_load_finish"));
        return CollectionsKt.listOf((Object[]) new DurationRule[]{durationRuleM42422a, durationRuleM42422a2, durationRuleM42422a3, durationRuleM42422a4, durationRuleM42422a5, durationRuleM42422a6, durationRuleM42422a7, durationRuleM42422a8, durationRuleM42422a9, durationRuleM42422a10, durationRuleM42422a11, durationRuleM42422a12, c19218a13.m42422a()});
    }
}
