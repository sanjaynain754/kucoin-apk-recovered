package p723we;

import com.kubi.monitor.duration.DurationCate;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: we.a */
/* JADX INFO: compiled from: SpotDurationRuleSetting.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/core/spot/startup/SpotDurationRuleSetting;", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "<init>", "()V", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotDurationRuleSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotDurationRuleSetting.kt\ncom/kubi/core/spot/startup/SpotDurationRuleSetting\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,135:1\n37#2:136\n37#2:137\n37#2:138\n37#2:139\n37#2:140\n37#2:141\n37#2:142\n37#2:143\n37#2:144\n*S KotlinDebug\n*F\n+ 1 SpotDurationRuleSetting.kt\ncom/kubi/core/spot/startup/SpotDurationRuleSetting\n*L\n26#1:136\n33#1:137\n41#1:138\n50#1:139\n58#1:140\n66#1:141\n74#1:142\n81#1:143\n89#1:144\n*E\n"})
public final class C45813a implements IDurationRuleSetting {
    @Override // com.kubi.monitor.duration.IDurationRuleSetting
    @NotNull
    public List<DurationRule> getRules() {
        DurationRule.Companion companion = DurationRule.INSTANCE;
        DurationRule.C19218a c19218a = new DurationRule.C19218a();
        c19218a.m42430i("unified_click_spot_exchange");
        DurationCate durationCate = DurationCate.click;
        c19218a.m42429h(durationCate);
        c19218a.m42432k("click_start_btn");
        c19218a.m42428g(CollectionsKt.listOf("data_load_finish"));
        Unit unit = Unit.INSTANCE;
        DurationRule durationRuleM42422a = c19218a.m42422a();
        DurationRule.C19218a c19218a2 = new DurationRule.C19218a();
        c19218a2.m42430i("unified_click_submit_spot_order");
        c19218a2.m42429h(durationCate);
        c19218a2.m42432k("click_start_btn");
        c19218a2.m42431j(CollectionsKt.listOf("show_toast"));
        c19218a2.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a2 = c19218a2.m42422a();
        DurationRule.C19218a c19218a3 = new DurationRule.C19218a();
        c19218a3.m42430i("unified_spot_cancel_order");
        c19218a3.m42429h(durationCate);
        c19218a3.m42432k("click_start_btn");
        c19218a3.m42431j(CollectionsKt.listOf("show_toast"));
        c19218a3.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a3 = c19218a3.m42422a();
        DurationRule.C19218a c19218a4 = new DurationRule.C19218a();
        c19218a4.m42430i("B5UnifyTrading");
        DurationCate durationCate2 = DurationCate.page_load;
        c19218a4.m42429h(durationCate2);
        c19218a4.m42432k("page_load_start");
        c19218a4.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a4 = c19218a4.m42422a();
        DurationRule.C19218a c19218a5 = new DurationRule.C19218a();
        c19218a5.m42430i("unified_spot_kline_load");
        c19218a5.m42429h(durationCate);
        c19218a5.m42432k("click_start_btn");
        c19218a5.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a5 = c19218a5.m42422a();
        DurationRule.C19218a c19218a6 = new DurationRule.C19218a();
        c19218a6.m42430i("B5markets");
        c19218a6.m42429h(durationCate2);
        c19218a6.m42432k("page_load_start");
        c19218a6.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a6 = c19218a6.m42422a();
        DurationRule.C19218a c19218a7 = new DurationRule.C19218a();
        c19218a7.m42430i("unified_click_submit_spot_order_without_pass");
        c19218a7.m42429h(durationCate);
        c19218a7.m42432k("click_start_btn");
        c19218a7.m42428g(CollectionsKt.listOf("show_toast"));
        DurationRule durationRuleM42422a7 = c19218a7.m42422a();
        DurationRule.C19218a c19218a8 = new DurationRule.C19218a();
        c19218a8.m42430i("unified_refresh_delegation_list");
        c19218a8.m42429h(durationCate);
        c19218a8.m42432k("unified_wait_socket");
        c19218a8.m42431j(CollectionsKt.listOf("receive_socket"));
        c19218a8.m42428g(CollectionsKt.listOf("receive_list"));
        DurationRule durationRuleM42422a8 = c19218a8.m42422a();
        DurationRule.C19218a c19218a9 = new DurationRule.C19218a();
        c19218a9.m42430i("spot_k_line_page_load");
        c19218a9.m42429h(durationCate2);
        c19218a9.m42432k("page_load_start");
        c19218a9.m42428g(CollectionsKt.listOf("page_load_end"));
        return CollectionsKt.listOf((Object[]) new DurationRule[]{durationRuleM42422a, durationRuleM42422a2, durationRuleM42422a3, durationRuleM42422a4, durationRuleM42422a5, durationRuleM42422a6, durationRuleM42422a7, durationRuleM42422a8, c19218a9.m42422a()});
    }
}
