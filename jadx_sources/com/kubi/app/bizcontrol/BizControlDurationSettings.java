package com.kubi.app.bizcontrol;

import com.kubi.monitor.duration.DurationCate;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.app.bizcontrol.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BizControlDurationSettings.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/app/bizcontrol/BizControlDurationSettings;", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "<init>", "()V", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "LBizControl_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBizControlDurationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizControlDurationSettings.kt\ncom/kubi/app/bizcontrol/BizControlDurationSettings\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,31:1\n37#2:32\n*S KotlinDebug\n*F\n+ 1 BizControlDurationSettings.kt\ncom/kubi/app/bizcontrol/BizControlDurationSettings\n*L\n22#1:32\n*E\n"})
public final class BizControlDurationSettings implements IDurationRuleSetting {
    @Override // com.kubi.monitor.duration.IDurationRuleSetting
    @NotNull
    public List<DurationRule> getRules() {
        DurationRule.Companion companion = DurationRule.INSTANCE;
        DurationRule.C19218a c19218a = new DurationRule.C19218a();
        c19218a.m42430i("EVENT_BIZ_CONTROL_LOAD");
        c19218a.m42429h(DurationCate.page_load);
        c19218a.m42432k("page_load_start");
        c19218a.m42428g(CollectionsKt.listOf("page_load_end"));
        return CollectionsKt.listOf(c19218a.m42422a());
    }
}
