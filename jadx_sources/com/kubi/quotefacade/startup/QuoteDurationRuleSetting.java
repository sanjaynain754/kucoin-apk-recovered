package com.kubi.quotefacade.startup;

import com.kubi.monitor.duration.DurationCate;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.startup.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuoteDurationRuleSetting.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/quotefacade/startup/QuoteDurationRuleSetting;", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "<init>", "()V", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteDurationRuleSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteDurationRuleSetting.kt\ncom/kubi/quotefacade/startup/QuoteDurationRuleSetting\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,77:1\n37#2:78\n37#2:79\n37#2:80\n37#2:81\n37#2:82\n37#2:83\n37#2:84\n*S KotlinDebug\n*F\n+ 1 QuoteDurationRuleSetting.kt\ncom/kubi/quotefacade/startup/QuoteDurationRuleSetting\n*L\n29#1:78\n36#1:79\n43#1:80\n49#1:81\n55#1:82\n61#1:83\n67#1:84\n*E\n"})
public final class QuoteDurationRuleSetting implements IDurationRuleSetting {
    @Override // com.kubi.monitor.duration.IDurationRuleSetting
    @NotNull
    public List<DurationRule> getRules() {
        DurationRule.Companion companion = DurationRule.INSTANCE;
        DurationRule.C19218a c19218a = new DurationRule.C19218a();
        c19218a.m42430i("B5markets_spot");
        DurationCate durationCate = DurationCate.click;
        c19218a.m42429h(durationCate);
        c19218a.m42432k("click_start_btn");
        c19218a.m42428g(CollectionsKt.listOf("data_load_finish"));
        Unit unit = Unit.INSTANCE;
        DurationRule durationRuleM42422a = c19218a.m42422a();
        DurationRule.C19218a c19218a2 = new DurationRule.C19218a();
        c19218a2.m42430i("B5markets_futures");
        c19218a2.m42429h(durationCate);
        c19218a2.m42432k("click_start_btn");
        c19218a2.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a2 = c19218a2.m42422a();
        DurationRule.C19218a c19218a3 = new DurationRule.C19218a();
        c19218a3.m42430i("B5markets_fav_add");
        c19218a3.m42429h(durationCate);
        c19218a3.m42432k("click_start_btn");
        c19218a3.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a3 = c19218a3.m42422a();
        DurationRule.C19218a c19218a4 = new DurationRule.C19218a();
        c19218a4.m42430i("B5markets_fav_delete");
        c19218a4.m42429h(durationCate);
        c19218a4.m42432k("click_start_btn");
        c19218a4.m42428g(CollectionsKt.listOf("data_load_finish"));
        DurationRule durationRuleM42422a4 = c19218a4.m42422a();
        DurationRule.C19218a c19218a5 = new DurationRule.C19218a();
        c19218a5.m42430i("B5markets_market_render");
        DurationCate durationCate2 = DurationCate.page_load;
        c19218a5.m42429h(durationCate2);
        c19218a5.m42432k("page_load_start");
        c19218a5.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a5 = c19218a5.m42422a();
        DurationRule.C19218a c19218a6 = new DurationRule.C19218a();
        c19218a6.m42430i("B5markets_krazy_degen_render");
        c19218a6.m42429h(durationCate2);
        c19218a6.m42432k("page_load_start");
        c19218a6.m42428g(CollectionsKt.listOf("page_load_end"));
        DurationRule durationRuleM42422a6 = c19218a6.m42422a();
        DurationRule.C19218a c19218a7 = new DurationRule.C19218a();
        c19218a7.m42430i("B5markets_chance_trade_render");
        c19218a7.m42429h(durationCate2);
        c19218a7.m42432k("page_load_start");
        c19218a7.m42428g(CollectionsKt.listOf("page_load_end"));
        return CollectionsKt.listOf((Object[]) new DurationRule[]{durationRuleM42422a, durationRuleM42422a2, durationRuleM42422a3, durationRuleM42422a4, durationRuleM42422a5, durationRuleM42422a6, c19218a7.m42422a()});
    }
}
