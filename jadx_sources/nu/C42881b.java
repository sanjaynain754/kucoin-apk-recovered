package nu;

import com.kubi.monitor.duration.DurationCate;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: nu.b */
/* JADX INFO: compiled from: PaymentDurationRuleSetting.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/track/PaymentDurationRuleSetting;", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "<init>", "()V", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentDurationRuleSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentDurationRuleSetting.kt\ncom/kubi/payment/track/PaymentDurationRuleSetting\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,71:1\n37#2:72\n37#2:73\n37#2:74\n37#2:75\n37#2:76\n37#2:77\n*S KotlinDebug\n*F\n+ 1 PaymentDurationRuleSetting.kt\ncom/kubi/payment/track/PaymentDurationRuleSetting\n*L\n15#1:72\n23#1:73\n31#1:74\n39#1:75\n47#1:76\n55#1:77\n*E\n"})
public final class C42881b implements IDurationRuleSetting {
    @Override // com.kubi.monitor.duration.IDurationRuleSetting
    @NotNull
    public List<DurationRule> getRules() {
        DurationRule.Companion companion = DurationRule.INSTANCE;
        DurationRule.C19218a c19218a = new DurationRule.C19218a();
        c19218a.m42430i("B7fast_trade_load");
        DurationCate durationCate = DurationCate.page_load;
        c19218a.m42429h(durationCate);
        c19218a.m42432k("page_load_start");
        c19218a.m42431j(CollectionsKt.listOf("data_load_start"));
        c19218a.m42428g(CollectionsKt.listOf((Object[]) new String[]{"page_load_end", "data_load_finish"}));
        Unit unit = Unit.INSTANCE;
        DurationRule durationRuleM42422a = c19218a.m42422a();
        DurationRule.C19218a c19218a2 = new DurationRule.C19218a();
        c19218a2.m42430i("B7p2p_load");
        c19218a2.m42429h(durationCate);
        c19218a2.m42432k("page_load_start");
        c19218a2.m42431j(CollectionsKt.listOf("data_load_start"));
        c19218a2.m42428g(CollectionsKt.listOf((Object[]) new String[]{"page_load_end", "data_load_finish"}));
        DurationRule durationRuleM42422a2 = c19218a2.m42422a();
        DurationRule.C19218a c19218a3 = new DurationRule.C19218a();
        c19218a3.m42430i("B7channel_deposit");
        c19218a3.m42429h(durationCate);
        c19218a3.m42432k("page_load_start");
        c19218a3.m42431j(CollectionsKt.listOf("data_load_start"));
        c19218a3.m42428g(CollectionsKt.listOf((Object[]) new String[]{"page_load_end", "data_load_finish"}));
        DurationRule durationRuleM42422a3 = c19218a3.m42422a();
        DurationRule.C19218a c19218a4 = new DurationRule.C19218a();
        c19218a4.m42430i("B7channel_withdraw");
        c19218a4.m42429h(durationCate);
        c19218a4.m42432k("page_load_start");
        c19218a4.m42431j(CollectionsKt.listOf("data_load_start"));
        c19218a4.m42428g(CollectionsKt.listOf((Object[]) new String[]{"page_load_end", "data_load_finish"}));
        DurationRule durationRuleM42422a4 = c19218a4.m42422a();
        DurationRule.C19218a c19218a5 = new DurationRule.C19218a();
        c19218a5.m42430i("B7third_buy");
        c19218a5.m42429h(durationCate);
        c19218a5.m42432k("page_load_start");
        c19218a5.m42431j(CollectionsKt.listOf("data_load_start"));
        c19218a5.m42428g(CollectionsKt.listOf((Object[]) new String[]{"page_load_end", "data_load_finish"}));
        DurationRule durationRuleM42422a5 = c19218a5.m42422a();
        DurationRule.C19218a c19218a6 = new DurationRule.C19218a();
        c19218a6.m42430i("B7kucoinpay_loading");
        c19218a6.m42429h(DurationCate.click);
        c19218a6.m42432k("click_start_btn");
        c19218a6.m42428g(CollectionsKt.listOf("data_load_finish"));
        return CollectionsKt.listOf((Object[]) new DurationRule[]{durationRuleM42422a, durationRuleM42422a2, durationRuleM42422a3, durationRuleM42422a4, durationRuleM42422a5, c19218a6.m42422a()});
    }
}
