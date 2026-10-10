package com.tencent.rmonitor.base.plugin.monitor;

import android.content.SharedPreferences;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;
import com.tencent.rmonitor.base.config.PluginCombination;
import com.tencent.rmonitor.base.meta.BaseInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;", "", "()V", "KEY_COUNT_PLUGIN_PREFIX", "", "KEY_LAST_START_DATE", "startDate", "", "addPluginReportNum", "", "pluginName", "canCollect", "", "resetReportNum", "whetherPluginEventSampling", "whetherPluginReportSampling", "whetherPluginSampling", "sampleRatio", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class PluginController {

    @NotNull
    private static final String KEY_COUNT_PLUGIN_PREFIX = "count_plugin_";

    @NotNull
    private static final String KEY_LAST_START_DATE = "last_start_date";

    @NotNull
    public static final PluginController INSTANCE = new PluginController();
    private static final long startDate = (long) Math.rint(System.currentTimeMillis() / ((long) 86400000));

    public final boolean whetherPluginSampling(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        DefaultPluginConfig defaultPluginConfigM77072c = ConfigProxy.INSTANCE.getConfig().m77072c(pluginName);
        if (defaultPluginConfigM77072c != null) {
            return defaultPluginConfigM77072c.config.f70122g;
        }
        return false;
    }

    public final void addPluginReportNum(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        DefaultPluginConfig defaultPluginConfigM77072c = ConfigProxy.INSTANCE.getConfig().m77072c(pluginName);
        if (defaultPluginConfigM77072c != null) {
            defaultPluginConfigM77072c.curReportNum++;
            BaseInfo.editor.putInt(KEY_COUNT_PLUGIN_PREFIX + defaultPluginConfigM77072c.pluginName, defaultPluginConfigM77072c.curReportNum);
            BaseInfo.editor.apply();
        }
    }

    public final boolean canCollect(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        DefaultPluginConfig defaultPluginConfigM77072c = ConfigProxy.INSTANCE.getConfig().m77072c(pluginName);
        return defaultPluginConfigM77072c != null && defaultPluginConfigM77072c.curReportNum < defaultPluginConfigM77072c.config.f70123h;
    }

    public final void resetReportNum() {
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        long j11 = sharedPreferences != null ? sharedPreferences.getLong(KEY_LAST_START_DATE, 0L) : startDate;
        long j12 = startDate;
        if (j12 - j11 > 0) {
            BaseInfo.editor.putLong(KEY_LAST_START_DATE, j12);
            PluginCombination.INSTANCE.each(new Function1<DefaultPluginConfig, Unit>() { // from class: com.tencent.rmonitor.base.plugin.monitor.PluginController.resetReportNum.1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DefaultPluginConfig defaultPluginConfig) {
                    invoke2(defaultPluginConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DefaultPluginConfig it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseInfo.editor.putInt(PluginController.KEY_COUNT_PLUGIN_PREFIX + it.pluginName, 0);
                    it.curReportNum = 0;
                }
            });
            BaseInfo.editor.apply();
        } else {
            final SharedPreferences sharedPreferences2 = BaseInfo.sharePreference;
            if (sharedPreferences2 != null) {
                PluginCombination.INSTANCE.each(new Function1<DefaultPluginConfig, Unit>() { // from class: com.tencent.rmonitor.base.plugin.monitor.PluginController$resetReportNum$2$1
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DefaultPluginConfig defaultPluginConfig) {
                        invoke2(defaultPluginConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DefaultPluginConfig it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        it.curReportNum = sharedPreferences2.getInt("count_plugin_" + it.pluginName, 0);
                    }
                });
            }
        }
    }

    public final boolean whetherPluginEventSampling(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        if (!canCollect(pluginName)) {
            return false;
        }
        DefaultPluginConfig defaultPluginConfigM77072c = ConfigProxy.INSTANCE.getConfig().m77072c(pluginName);
        return Math.random() < ((double) (defaultPluginConfigM77072c != null ? defaultPluginConfigM77072c.config.f70125j : 0.0f));
    }

    public final boolean whetherPluginReportSampling(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        if (!canCollect(pluginName)) {
            return false;
        }
        DefaultPluginConfig defaultPluginConfigM77072c = ConfigProxy.INSTANCE.getConfig().m77072c(pluginName);
        return Math.random() < ((double) (defaultPluginConfigM77072c != null ? defaultPluginConfigM77072c.config.f70126k : 0.0f));
    }

    private PluginController() {
    }

    @JvmStatic
    public static final boolean whetherPluginSampling(@NotNull String pluginName, float sampleRatio) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        return INSTANCE.canCollect(pluginName) && Math.random() < ((double) sampleRatio);
    }
}
