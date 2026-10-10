package com.tencent.rmonitor.base.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/PluginCombination;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class PluginCombination {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<DefaultPluginConfig> allPlugin;

    @NotNull
    private static final DefaultPluginConfig asanPlugin;

    @NotNull
    private static final DefaultPluginConfig batteryElementMetricPlugin;

    @NotNull
    private static final DefaultPluginConfig batteryElementPlugin;

    @NotNull
    private static final DefaultPluginConfig batteryMetricPlugin;

    @NotNull
    private static final DefaultPluginConfig batteryPlugin;

    @NotNull
    private static final DefaultPluginConfig bigBitmapPlugin;

    @NotNull
    private static final DefaultPluginConfig ceilingHprofPlugin;

    @NotNull
    private static final DefaultPluginConfig customEventPlugin;

    @NotNull
    private static final DefaultPluginConfig dbPlugin;

    @NotNull
    private static final DefaultPluginConfig devicePlugin;

    @NotNull
    private static final DefaultPluginConfig fdLeakPlugin;

    @NotNull
    private static final DefaultPluginConfig ioPlugin;

    @NotNull
    private static final DefaultPluginConfig launchMetricPlugin;

    @NotNull
    private static final DefaultPluginConfig leakPlugin;

    @NotNull
    private static final DefaultPluginConfig loopStackPlugin;

    @NotNull
    private static final DefaultPluginConfig looperMetricPlugin;

    @NotNull
    private static final DefaultPluginConfig memoryQuantilePlugin;

    @NotNull
    private static final Lazy<List<String>> modeAllNames$delegate;

    @NotNull
    private static final Lazy<List<String>> modeStableNames$delegate;

    @NotNull
    private static final DefaultPluginConfig natMemPlugin;

    @NotNull
    private static final DefaultPluginConfig netQualityPlugin;

    @NotNull
    private static final DefaultPluginConfig pageLaunchPlugin;

    @NotNull
    private static final List<DefaultPluginConfig> stablePlugins;

    @NotNull
    private static final DefaultPluginConfig subMemoryQuantilePlugin;

    @NotNull
    private static final DefaultPluginConfig trafficDetailMetricPlugin;

    @NotNull
    private static final DefaultPluginConfig trafficMetricPlugin;

    @NotNull
    private static final DefaultPluginConfig workThreadLagPlugin;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010)\u001a\u0004\u0018\u00010\u00012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020\u001aH\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0007R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u0007R\u000e\u0010!\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/tencent/rmonitor/base/config/PluginCombination$Companion;", "", "()V", "allPlugin", "", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "getAllPlugin", "()Ljava/util/List;", "asanPlugin", "batteryElementMetricPlugin", "batteryElementPlugin", "batteryMetricPlugin", "batteryPlugin", "bigBitmapPlugin", "ceilingHprofPlugin", "customEventPlugin", "dbPlugin", "devicePlugin", "fdLeakPlugin", "ioPlugin", "launchMetricPlugin", "leakPlugin", "loopStackPlugin", "looperMetricPlugin", "memoryQuantilePlugin", "modeAllNames", "", "getModeAllNames", "modeAllNames$delegate", "Lkotlin/Lazy;", "modeStableNames", "getModeStableNames", "modeStableNames$delegate", "natMemPlugin", "netQualityPlugin", "pageLaunchPlugin", "stablePlugins", "subMemoryQuantilePlugin", "trafficDetailMetricPlugin", "trafficMetricPlugin", "workThreadLagPlugin", "each", "block", "Lkotlin/Function1;", "getPluginConfig", "pluginName", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final Object each(@NotNull Function1<? super DefaultPluginConfig, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Iterator<T> it = getAllPlugin().iterator();
            Object objInvoke = null;
            while (it.hasNext()) {
                objInvoke = block.invoke((DefaultPluginConfig) it.next());
            }
            return objInvoke;
        }

        @JvmStatic
        @Nullable
        public final DefaultPluginConfig getPluginConfig(@NotNull String pluginName) {
            Object next;
            Intrinsics.checkNotNullParameter(pluginName, "pluginName");
            Iterator<T> it = getAllPlugin().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((DefaultPluginConfig) next).pluginName, pluginName)) {
                    return (DefaultPluginConfig) next;
                }
            }
            next = null;
            return (DefaultPluginConfig) next;
        }

        @NotNull
        public final List<DefaultPluginConfig> getAllPlugin() {
            return PluginCombination.allPlugin;
        }

        @NotNull
        public final List<String> getModeAllNames() {
            return (List) PluginCombination.modeAllNames$delegate.getValue();
        }

        @NotNull
        public final List<String> getModeStableNames() {
            return (List) PluginCombination.modeStableNames$delegate.getValue();
        }
    }

    static {
        DefaultPluginConfig.LoopStackPlugin loopStackPlugin2 = new DefaultPluginConfig.LoopStackPlugin(null, null, 3, null);
        loopStackPlugin = loopStackPlugin2;
        DefaultPluginConfig.DBPlugin dBPlugin = new DefaultPluginConfig.DBPlugin(null, null, 3, null);
        dbPlugin = dBPlugin;
        DefaultPluginConfig.IOPlugin iOPlugin = new DefaultPluginConfig.IOPlugin(null, null, 3, null);
        ioPlugin = iOPlugin;
        DefaultPluginConfig.LeakPlugin leakPlugin2 = new DefaultPluginConfig.LeakPlugin(null, null, 3, null);
        leakPlugin = leakPlugin2;
        DefaultPluginConfig.CeilingHprofPlugin ceilingHprofPlugin2 = new DefaultPluginConfig.CeilingHprofPlugin(null, null, 3, null);
        ceilingHprofPlugin = ceilingHprofPlugin2;
        DefaultPluginConfig.DevicePlugin devicePlugin2 = new DefaultPluginConfig.DevicePlugin(null, null, 3, null);
        devicePlugin = devicePlugin2;
        DefaultPluginConfig.MemoryQuantilePlugin memoryQuantilePlugin2 = new DefaultPluginConfig.MemoryQuantilePlugin(null, null, 3, null);
        memoryQuantilePlugin = memoryQuantilePlugin2;
        DefaultPluginConfig.SubMemoryQuantilePlugin subMemoryQuantilePlugin2 = new DefaultPluginConfig.SubMemoryQuantilePlugin(null, null, 3, null);
        subMemoryQuantilePlugin = subMemoryQuantilePlugin2;
        DefaultPluginConfig.FdLeakPlugin fdLeakPlugin2 = new DefaultPluginConfig.FdLeakPlugin(null, null, 3, null);
        fdLeakPlugin = fdLeakPlugin2;
        DefaultPluginConfig.NatMemPlugin natMemPlugin2 = new DefaultPluginConfig.NatMemPlugin(null, null, 3, null);
        natMemPlugin = natMemPlugin2;
        DefaultPluginConfig.AsanPlugin asanPlugin2 = new DefaultPluginConfig.AsanPlugin(null, null, 3, null);
        asanPlugin = asanPlugin2;
        DefaultPluginConfig.BigBitmapPlugin bigBitmapPlugin2 = new DefaultPluginConfig.BigBitmapPlugin(null, null, 3, null);
        bigBitmapPlugin = bigBitmapPlugin2;
        DefaultPluginConfig.QQBatteryPlugin qQBatteryPlugin = new DefaultPluginConfig.QQBatteryPlugin(null, null, 3, null);
        batteryPlugin = qQBatteryPlugin;
        DefaultPluginConfig.LooperMetricPlugin looperMetricPlugin2 = new DefaultPluginConfig.LooperMetricPlugin(null, null, 3, null);
        looperMetricPlugin = looperMetricPlugin2;
        DefaultPluginConfig.LaunchMetricPlugin launchMetricPlugin2 = new DefaultPluginConfig.LaunchMetricPlugin(null, null, 3, null);
        launchMetricPlugin = launchMetricPlugin2;
        DefaultPluginConfig.WorkThreadLagPlugin workThreadLagPlugin2 = new DefaultPluginConfig.WorkThreadLagPlugin(null, null, 3, null);
        workThreadLagPlugin = workThreadLagPlugin2;
        DefaultPluginConfig.TrafficMetricPlugin trafficMetricPlugin2 = new DefaultPluginConfig.TrafficMetricPlugin(null, null, 3, null);
        trafficMetricPlugin = trafficMetricPlugin2;
        DefaultPluginConfig.TrafficDetailMetricPlugin trafficDetailMetricPlugin2 = new DefaultPluginConfig.TrafficDetailMetricPlugin(null, null, 3, null);
        trafficDetailMetricPlugin = trafficDetailMetricPlugin2;
        DefaultPluginConfig.NetQualityPlugin netQualityPlugin2 = new DefaultPluginConfig.NetQualityPlugin(null, null, 3, null);
        netQualityPlugin = netQualityPlugin2;
        DefaultPluginConfig.BatteryMetricPlugin batteryMetricPlugin2 = new DefaultPluginConfig.BatteryMetricPlugin(null, null, 3, null);
        batteryMetricPlugin = batteryMetricPlugin2;
        DefaultPluginConfig.BatteryElementPlugin batteryElementPlugin2 = new DefaultPluginConfig.BatteryElementPlugin(null, null, 3, null);
        batteryElementPlugin = batteryElementPlugin2;
        DefaultPluginConfig.BatteryElementMetricPlugin batteryElementMetricPlugin2 = new DefaultPluginConfig.BatteryElementMetricPlugin(null, null, 3, null);
        batteryElementMetricPlugin = batteryElementMetricPlugin2;
        DefaultPluginConfig.PageLaunchPlugin pageLaunchPlugin2 = new DefaultPluginConfig.PageLaunchPlugin(null, null, 3, null);
        pageLaunchPlugin = pageLaunchPlugin2;
        DefaultPluginConfig.CustomEventPlugin customEventPlugin2 = new DefaultPluginConfig.CustomEventPlugin(null, null, 3, null);
        customEventPlugin = customEventPlugin2;
        allPlugin = CollectionsKt.listOf((Object[]) new DefaultPluginConfig[]{iOPlugin, dBPlugin, devicePlugin2, loopStackPlugin2, leakPlugin2, fdLeakPlugin2, natMemPlugin2, asanPlugin2, bigBitmapPlugin2, qQBatteryPlugin, ceilingHprofPlugin2, looperMetricPlugin2, memoryQuantilePlugin2, subMemoryQuantilePlugin2, launchMetricPlugin2, workThreadLagPlugin2, trafficMetricPlugin2, trafficDetailMetricPlugin2, netQualityPlugin2, batteryElementPlugin2, batteryMetricPlugin2, batteryElementMetricPlugin2, pageLaunchPlugin2, customEventPlugin2});
        stablePlugins = CollectionsKt.listOf((Object[]) new DefaultPluginConfig[]{loopStackPlugin2, looperMetricPlugin2, leakPlugin2, bigBitmapPlugin2, fdLeakPlugin2, natMemPlugin2, trafficMetricPlugin2, trafficDetailMetricPlugin2, netQualityPlugin2, batteryElementPlugin2, batteryMetricPlugin2, batteryElementMetricPlugin2, ceilingHprofPlugin2, pageLaunchPlugin2, customEventPlugin2});
        modeAllNames$delegate = LazyKt.lazy(new Function0<List<String>>() { // from class: com.tencent.rmonitor.base.config.PluginCombination$Companion$modeAllNames$2
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final List<String> invoke() {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = PluginCombination.INSTANCE.getAllPlugin().iterator();
                while (it.hasNext()) {
                    arrayList.add(((DefaultPluginConfig) it.next()).pluginName);
                }
                return arrayList;
            }
        });
        modeStableNames$delegate = LazyKt.lazy(new Function0<List<String>>() { // from class: com.tencent.rmonitor.base.config.PluginCombination$Companion$modeStableNames$2
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final List<String> invoke() {
                ArrayList arrayList = new ArrayList();
                Iterator it = PluginCombination.stablePlugins.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DefaultPluginConfig) it.next()).pluginName);
                }
                return arrayList;
            }
        });
    }

    @JvmStatic
    @Nullable
    public static final DefaultPluginConfig getPluginConfig(@NotNull String str) {
        return INSTANCE.getPluginConfig(str);
    }
}
