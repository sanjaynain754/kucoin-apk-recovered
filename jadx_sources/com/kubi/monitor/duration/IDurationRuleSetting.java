package com.kubi.monitor.duration;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IDurationRuleSetting.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/monitor/duration/IDurationRuleSetting;", "", "getRules", "", "Lcom/kubi/monitor/duration/DurationRule;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IDurationRuleSetting {
    @NotNull
    List<DurationRule> getRules();
}
