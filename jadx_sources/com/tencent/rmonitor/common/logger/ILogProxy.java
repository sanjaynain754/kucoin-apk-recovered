package com.tencent.rmonitor.common.logger;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH&¨\u0006\f"}, m90084d2 = {"Lcom/tencent/rmonitor/common/logger/ILogProxy;", "", "doLog", "", "state", "Lcom/tencent/rmonitor/common/logger/LogState;", "args", "", "", "(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V", "flush", "logInfo", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface ILogProxy {
    void doLog(@NotNull LogState state, @NotNull String... args);

    void flush(@NotNull String logInfo);
}
