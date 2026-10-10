package com.tencent.rmonitor.manager;

import android.text.TextUtils;
import com.tencent.bugly.proguard.InterfaceC34001wd;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Constructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/rmonitor/manager/DefaultPluginFactoryImpl;", "Lcom/tencent/bugly/proguard/wd;", "Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;", "pluginConfig", "Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;", "createPlugin", "", "tag", "Ljava/lang/String;", "<init>", "()V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class DefaultPluginFactoryImpl implements InterfaceC34001wd {

    @NotNull
    private final String tag = "RMonitor_manager";

    @Override // com.tencent.bugly.proguard.InterfaceC34001wd
    @Nullable
    public QAPMMonitorPlugin createPlugin(@Nullable DefaultPluginConfig pluginConfig) {
        QAPMMonitorPlugin qAPMMonitorPlugin;
        Throwable th2;
        QAPMMonitorPlugin qAPMMonitorPlugin2 = null;
        if (pluginConfig == null || TextUtils.isEmpty(pluginConfig.entrance)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(pluginConfig.entrance);
            try {
                Object objInvoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                qAPMMonitorPlugin = objInvoke instanceof QAPMMonitorPlugin ? (QAPMMonitorPlugin) objInvoke : null;
            } catch (Throwable unused) {
            }
            if (qAPMMonitorPlugin == null) {
                try {
                    Constructor<?> constructor = cls.getConstructor(new Class[0]);
                    if (constructor != null) {
                        return (QAPMMonitorPlugin) constructor.newInstance(new Object[0]);
                    }
                    return null;
                } catch (ClassNotFoundException unused2) {
                    qAPMMonitorPlugin2 = qAPMMonitorPlugin;
                    Logger.INSTANCE.mo77132i(this.tag, "can not find plugin {name: " + pluginConfig.pluginName + ", entrance: " + pluginConfig.entrance + '}');
                    return qAPMMonitorPlugin2;
                } catch (Throwable th3) {
                    th2 = th3;
                    Logger.INSTANCE.exception(this.tag, "fail to register plugin {name: " + pluginConfig.pluginName + ", entrance: " + pluginConfig.entrance + '}', th2);
                    return qAPMMonitorPlugin;
                }
            }
        } catch (ClassNotFoundException unused3) {
        } catch (Throwable th4) {
            qAPMMonitorPlugin = null;
            th2 = th4;
        }
        return qAPMMonitorPlugin;
    }
}
