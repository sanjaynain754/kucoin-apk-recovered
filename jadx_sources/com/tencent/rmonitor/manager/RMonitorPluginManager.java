package com.tencent.rmonitor.manager;

import android.text.TextUtils;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33778lf;
import com.tencent.bugly.proguard.C34025xh;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.bugly.proguard.InterfaceC33835o9;
import com.tencent.bugly.proguard.InterfaceC34001wd;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;
import com.tencent.rmonitor.base.config.PluginCombination;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006#"}, m90084d2 = {"Lcom/tencent/rmonitor/manager/RMonitorPluginManager;", "Lcom/tencent/bugly/proguard/o9;", "", "Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;", "allRegisteredPlugins", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginConfig", "", "registerPluginInner", "", "pluginName", "plugin", "stopMonitor", "startMonitor", "Lcom/tencent/bugly/proguard/wd;", "getPluginFactory", "", "needRegister", "getPlugin", "pluginFactory", "setPluginFactory", "start", InterfaceC33730j9.f70350a, "isPluginStart", "stopAll", "Ljava/util/concurrent/ConcurrentHashMap;", "plugins", "Ljava/util/concurrent/ConcurrentHashMap;", "", "startedPlugin", "Ljava/util/List;", "Lcom/tencent/bugly/proguard/wd;", "<init>", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public class RMonitorPluginManager implements InterfaceC33835o9 {

    @NotNull
    private static final String TAG = "RMonitor_plugins";

    @Nullable
    private InterfaceC34001wd pluginFactory;

    @NotNull
    private final ConcurrentHashMap<String, QAPMMonitorPlugin> plugins = new ConcurrentHashMap<>();

    @NotNull
    private final List<QAPMMonitorPlugin> startedPlugin = new ArrayList();

    private final void registerPluginInner(DefaultPluginConfig pluginConfig) {
        if (this.plugins.containsKey(pluginConfig.pluginName)) {
            return;
        }
        InterfaceC34001wd pluginFactory = getPluginFactory();
        QAPMMonitorPlugin qAPMMonitorPluginCreatePlugin = pluginFactory != null ? pluginFactory.createPlugin(pluginConfig) : null;
        if (qAPMMonitorPluginCreatePlugin != null) {
            this.plugins.put(pluginConfig.pluginName, qAPMMonitorPluginCreatePlugin);
            qAPMMonitorPluginCreatePlugin.setPluginConfig(pluginConfig);
            Logger.INSTANCE.mo77132i("RMonitor_plugins", C34025xh.m75464a(new StringBuilder("register module "), pluginConfig.pluginName, " success."));
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33835o9
    public boolean isPluginStart(@Nullable String pluginName) {
        QAPMMonitorPlugin plugin = getPlugin(false, pluginName);
        return plugin != null && this.startedPlugin.contains(plugin);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33835o9
    public void start(@Nullable String pluginName) {
        QAPMMonitorPlugin plugin = getPlugin(true, pluginName);
        if (plugin == null) {
            Logger.INSTANCE.mo77132i("RMonitor_plugins", C33778lf.m73987a("start plugin fail for ", pluginName, " is null."));
        } else if (isPluginStart(pluginName)) {
            Logger.INSTANCE.mo77130d("RMonitor_plugins", C33778lf.m73987a("plugin not need to start for ", pluginName, " has started before."));
        } else {
            startMonitor(plugin);
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33835o9
    public void stop(@Nullable String pluginName) {
        QAPMMonitorPlugin plugin = getPlugin(false, pluginName);
        if (plugin == null) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_plugins", C33778lf.m73987a("plugin not need to stop for ", pluginName, " is null."));
            }
        } else if (isPluginStart(pluginName)) {
            stopMonitor(plugin);
        } else if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_plugins", C33778lf.m73987a("plugin not need to stop for ", pluginName, " has not started before."));
        }
    }

    private final List<QAPMMonitorPlugin> allRegisteredPlugins() {
        ConcurrentHashMap<String, QAPMMonitorPlugin> concurrentHashMap = this.plugins;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, QAPMMonitorPlugin>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            QAPMMonitorPlugin value = it.next().getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    private final InterfaceC34001wd getPluginFactory() {
        if (this.pluginFactory == null) {
            this.pluginFactory = new DefaultPluginFactoryImpl();
        }
        return this.pluginFactory;
    }

    private final void startMonitor(QAPMMonitorPlugin plugin) {
        synchronized (this.startedPlugin) {
            try {
                if (!this.startedPlugin.contains(plugin)) {
                    plugin.start();
                    this.startedPlugin.add(plugin);
                    Logger logger = Logger.INSTANCE;
                    StringBuilder sb2 = new StringBuilder("start ");
                    DefaultPluginConfig pluginConfig = plugin.getPluginConfig();
                    sb2.append(pluginConfig != null ? pluginConfig.pluginName : null);
                    logger.mo77132i("RMonitor_plugins", sb2.toString());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void stopMonitor(QAPMMonitorPlugin plugin) {
        synchronized (this.startedPlugin) {
            try {
                if (this.startedPlugin.contains(plugin)) {
                    plugin.stop();
                    this.startedPlugin.remove(plugin);
                    Logger logger = Logger.INSTANCE;
                    StringBuilder sb2 = new StringBuilder("stop ");
                    DefaultPluginConfig pluginConfig = plugin.getPluginConfig();
                    sb2.append(pluginConfig != null ? pluginConfig.pluginName : null);
                    logger.mo77132i("RMonitor_plugins", sb2.toString());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33835o9
    public void setPluginFactory(@Nullable InterfaceC34001wd pluginFactory) {
        if (pluginFactory != null) {
            this.pluginFactory = pluginFactory;
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33835o9
    @Nullable
    public QAPMMonitorPlugin getPlugin(boolean needRegister, @Nullable String pluginName) {
        if (TextUtils.isEmpty(pluginName) || !AndroidVersion.INSTANCE.isOverJellyBean()) {
            return null;
        }
        if (needRegister) {
            Intrinsics.checkNotNull(pluginName);
            registerPluginInner(pluginName);
        }
        QAPMMonitorPlugin qAPMMonitorPlugin = this.plugins.get(pluginName);
        if (needRegister && qAPMMonitorPlugin == null) {
            Logger.INSTANCE.mo77132i("RMonitor_plugins", pluginName + " is null.");
        }
        return qAPMMonitorPlugin;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33835o9
    public void stopAll() {
        Iterator<T> it = allRegisteredPlugins().iterator();
        while (it.hasNext()) {
            stopMonitor((QAPMMonitorPlugin) it.next());
        }
    }

    private final void registerPluginInner(String pluginName) {
        DefaultPluginConfig pluginConfig = PluginCombination.INSTANCE.getPluginConfig(pluginName);
        if (pluginConfig != null) {
            registerPluginInner(pluginConfig);
        }
    }
}
