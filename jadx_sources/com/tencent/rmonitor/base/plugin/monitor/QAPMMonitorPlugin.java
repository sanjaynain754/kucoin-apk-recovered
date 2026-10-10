package com.tencent.rmonitor.base.plugin.monitor;

import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m90084d2 = {"Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;", "", "()V", "pluginConfig", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "getPluginConfig", "()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "setPluginConfig", "(Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;)V", "start", "", InterfaceC33730j9.f70350a, "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public abstract class QAPMMonitorPlugin {

    @Nullable
    private DefaultPluginConfig pluginConfig;

    public abstract void start();

    public abstract void stop();

    @Nullable
    public final DefaultPluginConfig getPluginConfig() {
        return this.pluginConfig;
    }

    public final void setPluginConfig(@Nullable DefaultPluginConfig defaultPluginConfig) {
        this.pluginConfig = defaultPluginConfig;
    }
}
