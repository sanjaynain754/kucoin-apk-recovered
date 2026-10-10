package com.tencent.rmonitor.manager;

import android.app.Application;
import android.content.SharedPreferences;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33547af;
import com.tencent.bugly.proguard.C33589cf;
import com.tencent.bugly.proguard.C34018xa;
import com.tencent.bugly.proguard.C34045yh;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.bugly.proguard.InterfaceC33792m8;
import com.tencent.bugly.proguard.InterfaceC33835o9;
import com.tencent.bugly.proguard.InterfaceC34001wd;
import com.tencent.bugly.proguard.RunnableC33595d0;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;
import com.tencent.rmonitor.base.config.PluginCombination;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.sla.C35185b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u001e\u0010\u0014\u001a\u00020\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0012J\u0016\u0010\u0016\u001a\u00020\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u001a2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0016\u0010\u001f\u001a\u00020\u001a2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011R\u0014\u0010 \u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m90084d2 = {"Lcom/tencent/rmonitor/manager/RMonitorLauncher;", "", "", "initCrashInfo", "addPluginNameForUserInfoReport", "initLifecycleCallback", "initConfigListener", "Lcom/tencent/rmonitor/manager/EnvironmentChecker;", "checker", "setEnvironmentChecker", "Lcom/tencent/rmonitor/manager/RMonitorPluginManager;", "manager", "setQAPMPluginManager", "preLaunch", "Lcom/tencent/bugly/proguard/wd;", "pluginFactory", "setPluginFactory", "", "", "monitorList", InterfaceC33617e1.f69659h, "from", InterfaceC33730j9.f70350a, "abolish", "stopDisabledPlugins", "pluginName", "", "needRegister", "Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;", "getPlugin", "checkAllDesiredPluginStarted", "checkSomeDesiredPluginStarted", "TAG", "Ljava/lang/String;", "environmentChecker", "Lcom/tencent/rmonitor/manager/EnvironmentChecker;", "Lcom/tencent/bugly/proguard/o9;", "pluginManager", "Lcom/tencent/bugly/proguard/o9;", "hasPreLaunched", "Z", "Lcom/tencent/bugly/proguard/m8;", "configLoadListener", "Lcom/tencent/bugly/proguard/m8;", "<init>", "()V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class RMonitorLauncher {

    @NotNull
    public static final String TAG = "RMonitor_plugins";

    @Nullable
    private static InterfaceC33792m8 configLoadListener;
    private static volatile boolean hasPreLaunched;

    @NotNull
    public static final RMonitorLauncher INSTANCE = new RMonitorLauncher();

    @NotNull
    private static EnvironmentChecker environmentChecker = new EnvironmentChecker();

    @NotNull
    private static InterfaceC33835o9 pluginManager = new RMonitorPluginManager();

    public final boolean checkAllDesiredPluginStarted(@Nullable List<String> monitorList) {
        boolean z11 = true;
        if (monitorList != null && !monitorList.isEmpty()) {
            Iterator<T> it = monitorList.iterator();
            while (it.hasNext()) {
                if (!pluginManager.isPluginStart((String) it.next())) {
                    z11 = false;
                }
            }
        }
        return z11;
    }

    public final boolean checkSomeDesiredPluginStarted(@Nullable List<String> monitorList) {
        if (monitorList == null || monitorList.isEmpty()) {
            return true;
        }
        Iterator<T> it = monitorList.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (pluginManager.isPluginStart((String) it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    public final void launch(@Nullable List<String> monitorList) {
        launch(monitorList, "Magnifier");
    }

    public final synchronized void preLaunch() {
        if (hasPreLaunched) {
            return;
        }
        Logger.INSTANCE.mo77132i("RMonitor_plugins", "preLaunch");
        C35185b.c.f75333a.m77225a();
        initLifecycleCallback();
        BaseInfo.Companion companion = BaseInfo.INSTANCE;
        companion.initUrl();
        companion.initInfo();
        initCrashInfo();
        RunnableC33595d0.m72759b().m72760a();
        initConfigListener();
        C34018xa.m75452a(BaseInfo.app, BaseInfo.userMeta.appId);
        addPluginNameForUserInfoReport();
        hasPreLaunched = true;
        C35185b.c.f75333a.m77232h();
    }

    private final void addPluginNameForUserInfoReport() {
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"looper_stack", "battery_ele_metric", "battery_element", "battery_metric", "page_launch", "asan", "fd_leak", "java_memory_ceiling_hprof", "activity_leak", "native_memory"});
        C33589cf c33589cfM72692a = C33589cf.m72692a();
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            c33589cfM72692a.m72694a((String) it.next());
        }
    }

    private final void initConfigListener() {
        if (configLoadListener == null) {
            configLoadListener = new InterfaceC33792m8() { // from class: com.tencent.rmonitor.manager.a
                @Override // com.tencent.bugly.proguard.InterfaceC33792m8
                /* JADX INFO: renamed from: a */
                public final void mo74062a(C33547af c33547af) {
                    RMonitorLauncher.m103832initConfigListener$lambda8(c33547af);
                }
            };
            ConfigProxy.INSTANCE.getConfig().m77062a(configLoadListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initConfigListener$lambda-8, reason: not valid java name */
    public static final void m103832initConfigListener$lambda8(C33547af c33547af) {
        if (Logger.debug && c33547af != null) {
            c33547af.m72367a("onConfigLoad");
        }
        INSTANCE.launch(C34045yh.m75539c().m75543b(), "onConfigLoad");
    }

    private final void initCrashInfo() {
        Application application = BaseInfo.app;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("BuglySdkInfos", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "application.getSharedPre…s\", Context.MODE_PRIVATE)");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("730dcb1b75", BaseInfo.userMeta.sdkVersion);
            editorEdit.commit();
        }
    }

    private final void initLifecycleCallback() {
        Application application;
        if (!AndroidVersion.INSTANCE.isOverIceScreamSandwich() || (application = BaseInfo.app) == null) {
            return;
        }
        LifecycleCallback.init(application);
    }

    public final void abolish() {
        DBHandler dbHandler;
        Logger.INSTANCE.mo77132i("RMonitor_plugins", "abolish");
        DBHelper dBHelper = BaseInfo.dbHelper;
        if (dBHelper != null && (dbHandler = dBHelper.getDbHandler()) != null) {
            dbHandler.close();
        }
        pluginManager.stopAll();
        NetworkWatcher.INSTANCE.unInit();
    }

    @Nullable
    public final QAPMMonitorPlugin getPlugin(@NotNull String pluginName, boolean needRegister) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        return pluginManager.getPlugin(needRegister, pluginName);
    }

    public final void launch(@Nullable List<String> monitorList, @NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Logger logger = Logger.INSTANCE;
        logger.mo77132i("RMonitor_plugins", "launch: " + monitorList + ", from: " + from);
        if (monitorList == null || monitorList.isEmpty()) {
            logger.mo77131e("RMonitor_plugins", "none plugin to launch.");
            return;
        }
        if (BaseInfo.app == null) {
            logger.mo77134w("RMonitor_plugins", "launch fail for app is null.");
            return;
        }
        if (!environmentChecker.checkSysPermission()) {
            logger.mo77131e("RMonitor_plugins", "launch fail, please check environment.");
            return;
        }
        NetworkWatcher.INSTANCE.init();
        List<String> listCheckConfigs = environmentChecker.checkConfigs(monitorList);
        if (listCheckConfigs == null || listCheckConfigs.isEmpty()) {
            stop(monitorList);
        } else {
            Iterator<T> it = listCheckConfigs.iterator();
            while (it.hasNext()) {
                pluginManager.start((String) it.next());
            }
        }
        ReporterMachine.INSTANCE.start();
    }

    public final void setEnvironmentChecker(@NotNull EnvironmentChecker checker) {
        Intrinsics.checkNotNullParameter(checker, "checker");
        environmentChecker = checker;
    }

    public final void setPluginFactory(@NotNull InterfaceC34001wd pluginFactory) {
        Intrinsics.checkNotNullParameter(pluginFactory, "pluginFactory");
        pluginManager.setPluginFactory(pluginFactory);
    }

    public final void setQAPMPluginManager(@NotNull RMonitorPluginManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        pluginManager = manager;
    }

    public final void stop(@Nullable List<String> monitorList) {
        if (monitorList == null || monitorList.isEmpty()) {
            Logger.INSTANCE.mo77131e("RMonitor_plugins", "none plugin to stop.");
            return;
        }
        Iterator<T> it = monitorList.iterator();
        while (it.hasNext()) {
            pluginManager.stop((String) it.next());
        }
    }

    public final void stopDisabledPlugins() {
        ArrayList arrayList = new ArrayList();
        for (DefaultPluginConfig defaultPluginConfig : PluginCombination.INSTANCE.getAllPlugin()) {
            if (!defaultPluginConfig.config.f70122g) {
                arrayList.add(defaultPluginConfig.pluginName);
            }
        }
        Logger.INSTANCE.mo77132i("RMonitor_plugins", "stop disabled plugins {" + arrayList + '}');
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pluginManager.stop((String) it.next());
        }
    }

    private RMonitorLauncher() {
    }
}
