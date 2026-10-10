package com.tencent.rmonitor.base.config;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/ConfigProxy;", "", "Lcom/tencent/rmonitor/base/config/a;", "config", "Lcom/tencent/rmonitor/base/config/a;", "getConfig", "()Lcom/tencent/rmonitor/base/config/a;", "setConfig", "(Lcom/tencent/rmonitor/base/config/a;)V", "<init>", "()V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class ConfigProxy {

    @NotNull
    public static final ConfigProxy INSTANCE = new ConfigProxy();

    @NotNull
    private static C35100a config = new C35100a();

    @NotNull
    public final C35100a getConfig() {
        return config;
    }

    public final void setConfig(@NotNull C35100a c35100a) {
        Intrinsics.checkNotNullParameter(c35100a, "<set-?>");
        config = c35100a;
    }

    private ConfigProxy() {
    }
}
