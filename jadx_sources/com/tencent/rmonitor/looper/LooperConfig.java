package com.tencent.rmonitor.looper;

import com.tencent.bugly.proguard.C33694hf;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/LooperConfig;", "", "", "pluginName", "", "isCanCollect", "whetherPluginSampling", "Lcom/tencent/bugly/proguard/hf;", "getPluginConfig", "<init>", "()V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class LooperConfig {

    @NotNull
    public static final LooperConfig INSTANCE = new LooperConfig();

    @Nullable
    public final C33694hf getPluginConfig(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        try {
            return ConfigProxy.INSTANCE.getConfig().m77076e(pluginName);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean isCanCollect(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        return PluginController.INSTANCE.canCollect(pluginName);
    }

    public final boolean whetherPluginSampling(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        return PluginController.INSTANCE.whetherPluginEventSampling(pluginName);
    }

    private LooperConfig() {
    }
}
