package com.tencent.rmonitor.base.config;

import com.tencent.bugly.proguard.C33680h1;
import com.tencent.bugly.proguard.C33694hf;
import com.tencent.bugly.proguard.C33701i1;
import com.tencent.bugly.proguard.C33806n1;
import com.tencent.bugly.proguard.C33941td;
import com.tencent.bugly.proguard.C33990w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0018\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%B-\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0001\u0018&'()*+,-./0123456789:;<=¨\u0006>"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "", "", "pluginName", "Ljava/lang/String;", "entrance", "Lcom/tencent/bugly/proguard/hf;", "config", "Lcom/tencent/bugly/proguard/hf;", "", "curReportNum", "I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/hf;I)V", "AsanPlugin", C33680h1.f70046c, C33701i1.f70153c, C33806n1.f71014c, "BigBitmapPlugin", "CeilingHprofPlugin", "CustomEventPlugin", "DBPlugin", "DevicePlugin", "FdLeakPlugin", "IOPlugin", "LaunchMetricPlugin", "LeakPlugin", "LoopStackPlugin", "LooperMetricPlugin", "MemoryQuantilePlugin", "NatMemPlugin", "NetQualityPlugin", C33941td.f72079c, "QQBatteryPlugin", "SubMemoryQuantilePlugin", "TrafficDetailMetricPlugin", "TrafficMetricPlugin", "WorkThreadLagPlugin", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LoopStackPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LooperMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$WorkThreadLagPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$DBPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$IOPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LeakPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$CeilingHprofPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$QQBatteryPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$DevicePlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$MemoryQuantilePlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$SubMemoryQuantilePlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BigBitmapPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$FdLeakPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$NatMemPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$AsanPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LaunchMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$TrafficMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$TrafficDetailMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$NetQualityPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryElementMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryElementPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$PageLaunchPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$CustomEventPlugin;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public abstract class DefaultPluginConfig {

    @JvmField
    @NotNull
    public C33694hf config;

    @JvmField
    public int curReportNum;

    @JvmField
    @NotNull
    public final String entrance;

    @JvmField
    @NotNull
    public final String pluginName;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$AsanPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class AsanPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public AsanPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ AsanPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "asan" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.asan.AddressSanitizer" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsanPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryElementMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class BatteryElementMetricPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public BatteryElementMetricPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ BatteryElementMetricPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "battery_ele_metric" : str, (i11 & 2) != 0 ? "com.tencent.bugly.battery.plugins.BatteryElementMetricPlugin" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BatteryElementMetricPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryElementPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class BatteryElementPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public BatteryElementPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ BatteryElementPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "battery_element" : str, (i11 & 2) != 0 ? "com.tencent.bugly.battery.plugins.BatteryElementPlugin" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BatteryElementPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BatteryMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class BatteryMetricPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public BatteryMetricPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ BatteryMetricPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "battery_metric" : str, (i11 & 2) != 0 ? "com.tencent.bugly.battery.plugins.BatteryMetricPlugin" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BatteryMetricPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$BigBitmapPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class BigBitmapPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public BigBitmapPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ BigBitmapPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "big_bitmap" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.bigbitmap.BigBitmapMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BigBitmapPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$CeilingHprofPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class CeilingHprofPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public CeilingHprofPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ CeilingHprofPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "java_memory_ceiling_hprof" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.memory.ceil.MemoryCeilingMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CeilingHprofPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$CustomEventPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class CustomEventPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public CustomEventPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ CustomEventPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "custom_event" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.metrics.event.CustomEventMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomEventPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$DBPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class DBPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public DBPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ DBPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "db" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.db.SQLiteLintCore" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DBPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$DevicePlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class DevicePlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public DevicePlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ DevicePlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "device" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.device.DeviceInfoMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DevicePlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$FdLeakPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class FdLeakPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public FdLeakPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ FdLeakPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "fd_leak" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.fd.FdLeakMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FdLeakPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$IOPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class IOPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public IOPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ IOPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "io" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.io.IoCanaryCore" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IOPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LaunchMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class LaunchMetricPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public LaunchMetricPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ LaunchMetricPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "launch_metric" : str, (i11 & 2) != 0 ? "" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchMetricPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LeakPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class LeakPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public LeakPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ LeakPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "activity_leak" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.memory.leakdetect.MemoryLeakMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LeakPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LoopStackPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class LoopStackPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public LoopStackPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ LoopStackPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "looper_stack" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.looper.LooperMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoopStackPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$LooperMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class LooperMetricPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public LooperMetricPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ LooperMetricPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "looper_metric" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.metrics.looper.DropFrameMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LooperMetricPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$MemoryQuantilePlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class MemoryQuantilePlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public MemoryQuantilePlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ MemoryQuantilePlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "memory_quantile" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.metrics.MemoryQuantileMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemoryQuantilePlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$NatMemPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class NatMemPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public NatMemPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ NatMemPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "native_memory" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.natmem.NatMemMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NatMemPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$NetQualityPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class NetQualityPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public NetQualityPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ NetQualityPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "net_quality" : str, (i11 & 2) != 0 ? "com.tencent.bugly.network.NetQualityMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetQualityPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$PageLaunchPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class PageLaunchPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public PageLaunchPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ PageLaunchPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "page_launch" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.pagelaunch.PageLaunchPlugin" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PageLaunchPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$QQBatteryPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class QQBatteryPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public QQBatteryPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ QQBatteryPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "battery" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.qqbattery.QQBatteryMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QQBatteryPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$SubMemoryQuantilePlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class SubMemoryQuantilePlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public SubMemoryQuantilePlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ SubMemoryQuantilePlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "sub_memory_quantile" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.metrics.MemoryQuantileMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubMemoryQuantilePlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$TrafficDetailMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class TrafficDetailMetricPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public TrafficDetailMetricPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ TrafficDetailMetricPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "traffic_detail" : str, (i11 & 2) != 0 ? "com.tencent.bugly.traffic.TrafficDetailPlugin" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrafficDetailMetricPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$TrafficMetricPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class TrafficMetricPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public TrafficMetricPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ TrafficMetricPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "traffic" : str, (i11 & 2) != 0 ? "com.tencent.bugly.traffic.TrafficPlugin" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrafficMetricPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/DefaultPluginConfig$WorkThreadLagPlugin;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginName", "", "entrance", "(Ljava/lang/String;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class WorkThreadLagPlugin extends DefaultPluginConfig {
        /* JADX WARN: Multi-variable type inference failed */
        public WorkThreadLagPlugin() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ WorkThreadLagPlugin(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "work_thread_lag" : str, (i11 & 2) != 0 ? "com.tencent.rmonitor.looper.WorkThreadMonitor" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WorkThreadLagPlugin(@NotNull String pluginName, @NotNull String entrance) {
            super(pluginName, entrance, null, 0, 12, null);
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Intrinsics.checkNotNullParameter(entrance, "entrance");
        }
    }

    public /* synthetic */ DefaultPluginConfig(String str, String str2, C33694hf c33694hf, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, c33694hf, i11);
    }

    private DefaultPluginConfig(String str, String str2, C33694hf c33694hf, int i11) {
        this.pluginName = str;
        this.entrance = str2;
        this.config = c33694hf;
        this.curReportNum = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DefaultPluginConfig(String str, String str2, C33694hf c33694hf, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i12 & 4) != 0) {
            c33694hf = C33990w2.m75337a(str);
            Intrinsics.checkNotNullExpressionValue(c33694hf, "createPluginDefaultConfig(pluginName)");
        }
        this(str, str2, c33694hf, (i12 & 8) != 0 ? 0 : i11, null);
    }
}
