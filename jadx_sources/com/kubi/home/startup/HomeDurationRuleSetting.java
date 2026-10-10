package com.kubi.home.startup;

import com.kubi.monitor.duration.DurationCate;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.home.startup.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeDurationRuleSetting.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/home/startup/HomeDurationRuleSetting;", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "<init>", "()V", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeDurationRuleSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeDurationRuleSetting.kt\ncom/kubi/home/startup/HomeDurationRuleSetting\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,110:1\n37#2:111\n37#2:112\n37#2:113\n37#2:114\n37#2:115\n37#2:116\n37#2:117\n37#2:118\n37#2:119\n*S KotlinDebug\n*F\n+ 1 HomeDurationRuleSetting.kt\ncom/kubi/home/startup/HomeDurationRuleSetting\n*L\n25#1:111\n33#1:112\n41#1:113\n48#1:114\n55#1:115\n62#1:116\n69#1:117\n76#1:118\n83#1:119\n*E\n"})
public final class HomeDurationRuleSetting implements IDurationRuleSetting {
    @Override // com.kubi.monitor.duration.IDurationRuleSetting
    @NotNull
    public List<DurationRule> getRules() {
        DurationRule.Companion companion = DurationRule.INSTANCE;
        DurationRule.C19218a c19218a = new DurationRule.C19218a();
        c19218a.m42430i("event_click_home_search");
        DurationCate durationCate = DurationCate.click;
        c19218a.m42429h(durationCate);
        c19218a.m42432k("click_start_btn");
        c19218a.m42428g(CollectionsKt.listOf("data_load_finish"));
        Unit unit = Unit.INSTANCE;
        DurationRule durationRuleM42422a = c19218a.m42422a();
        DurationRule.C19218a c19218a2 = new DurationRule.C19218a();
        c19218a2.m42430i("event_click_home_grid_fast_trade");
        c19218a2.m42429h(durationCate);
        c19218a2.m42432k("click_start_btn");
        c19218a2.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a2 = c19218a2.m42422a();
        DurationRule.C19218a c19218a3 = new DurationRule.C19218a();
        c19218a3.m42430i("event_click_home_mine");
        c19218a3.m42429h(durationCate);
        c19218a3.m42432k("click_start_btn");
        c19218a3.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a3 = c19218a3.m42422a();
        DurationRule.C19218a c19218a4 = new DurationRule.C19218a();
        c19218a4.m42430i("event_load_home_grid_menu");
        DurationCate durationCate2 = DurationCate.page_load;
        c19218a4.m42429h(durationCate2);
        c19218a4.m42432k("page_load_start");
        c19218a4.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a4 = c19218a4.m42422a();
        DurationRule.C19218a c19218a5 = new DurationRule.C19218a();
        c19218a5.m42430i("event_load_home_mood");
        c19218a5.m42429h(durationCate2);
        c19218a5.m42432k("page_load_start");
        c19218a5.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a5 = c19218a5.m42422a();
        DurationRule.C19218a c19218a6 = new DurationRule.C19218a();
        c19218a6.m42430i("event_load_home_banner");
        c19218a6.m42429h(durationCate2);
        c19218a6.m42432k("page_load_start");
        c19218a6.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a6 = c19218a6.m42422a();
        DurationRule.C19218a c19218a7 = new DurationRule.C19218a();
        c19218a7.m42430i("event_load_home_gembox");
        c19218a7.m42429h(durationCate2);
        c19218a7.m42432k("page_load_start");
        c19218a7.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a7 = c19218a7.m42422a();
        DurationRule.C19218a c19218a8 = new DurationRule.C19218a();
        c19218a8.m42430i("event_load_home_rank");
        c19218a8.m42429h(durationCate2);
        c19218a8.m42432k("page_load_start");
        c19218a8.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a8 = c19218a8.m42422a();
        DurationRule.C19218a c19218a9 = new DurationRule.C19218a();
        c19218a9.m42430i("event_load_home_recommend");
        c19218a9.m42429h(durationCate2);
        c19218a9.m42432k("page_load_start");
        c19218a9.m42428g(CollectionsKt.listOf("page_load_end"));
        return CollectionsKt.listOf((Object[]) new DurationRule[]{durationRuleM42422a, durationRuleM42422a2, durationRuleM42422a3, durationRuleM42422a4, durationRuleM42422a5, durationRuleM42422a6, durationRuleM42422a7, durationRuleM42422a8, c19218a9.m42422a()});
    }
}
