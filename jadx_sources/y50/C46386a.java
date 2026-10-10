package y50;

import com.kubi.monitor.duration.DurationCate;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: y50.a */
/* JADX INFO: compiled from: TransferDurationRuleSetting.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/transfer/duration/TransferDurationRuleSetting;", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "<init>", "()V", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferDurationRuleSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferDurationRuleSetting.kt\ncom/kubi/transfer/duration/TransferDurationRuleSetting\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,37:1\n37#2:38\n*S KotlinDebug\n*F\n+ 1 TransferDurationRuleSetting.kt\ncom/kubi/transfer/duration/TransferDurationRuleSetting\n*L\n22#1:38\n*E\n"})
public final class C46386a implements IDurationRuleSetting {
    @Override // com.kubi.monitor.duration.IDurationRuleSetting
    @NotNull
    public List<DurationRule> getRules() {
        DurationRule.Companion companion = DurationRule.INSTANCE;
        DurationRule.C19218a c19218a = new DurationRule.C19218a();
        c19218a.m42430i("Transfer_currency_click");
        c19218a.m42429h(DurationCate.click);
        c19218a.m42432k("click_start_btn");
        c19218a.m42428g(CollectionsKt.listOf("data_load_finish"));
        return CollectionsKt.listOf(c19218a.m42422a());
    }
}
