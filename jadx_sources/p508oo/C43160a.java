package p508oo;

import com.kubi.monitor.duration.DurationCate;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: oo.a */
/* JADX INFO: compiled from: LoanDurationRuleSetting.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/loan/startup/LoanDurationRuleSetting;", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "<init>", "()V", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLoanDurationRuleSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoanDurationRuleSetting.kt\ncom/kubi/loan/startup/LoanDurationRuleSetting\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,46:1\n37#2:47\n37#2:48\n*S KotlinDebug\n*F\n+ 1 LoanDurationRuleSetting.kt\ncom/kubi/loan/startup/LoanDurationRuleSetting\n*L\n20#1:47\n28#1:48\n*E\n"})
public final class C43160a implements IDurationRuleSetting {
    @Override // com.kubi.monitor.duration.IDurationRuleSetting
    @NotNull
    public List<DurationRule> getRules() {
        DurationRule.Companion companion = DurationRule.INSTANCE;
        DurationRule.C19218a c19218a = new DurationRule.C19218a();
        c19218a.m42430i("click_margin_borrow");
        DurationCate durationCate = DurationCate.click;
        c19218a.m42429h(durationCate);
        c19218a.m42432k("click_start_btn");
        c19218a.m42428g(CollectionsKt.listOf("data_load_finish"));
        Unit unit = Unit.INSTANCE;
        DurationRule durationRuleM42422a = c19218a.m42422a();
        DurationRule.C19218a c19218a2 = new DurationRule.C19218a();
        c19218a2.m42430i("click_margin_repay");
        c19218a2.m42429h(durationCate);
        c19218a2.m42432k("click_start_btn");
        c19218a2.m42428g(CollectionsKt.listOf("data_load_finish"));
        return CollectionsKt.listOf((Object[]) new DurationRule[]{durationRuleM42422a, c19218a2.m42422a()});
    }
}
