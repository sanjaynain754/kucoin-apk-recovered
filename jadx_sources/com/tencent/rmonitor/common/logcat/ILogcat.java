package com.tencent.rmonitor.common.logcat;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u001d\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/tencent/rmonitor/common/logcat/ILogcat;", "", "getLogcatFile", "", "setArgs", "", "args", "", "([Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface ILogcat {
    @Nullable
    String getLogcatFile();

    void setArgs(@Nullable String[] args);
}
