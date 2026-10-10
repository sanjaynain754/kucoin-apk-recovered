package com.tencent.rmonitor.manager;

import android.app.Application;
import com.tencent.bugly.proguard.C33872q4;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\f"}, m90084d2 = {"Lcom/tencent/rmonitor/manager/EnvironmentChecker;", "", "()V", "sysPermissionsNeeded", "", "", "[Ljava/lang/String;", "checkConfigs", "", "monitorList", "checkSysPermission", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public class EnvironmentChecker {

    @NotNull
    private final String[] sysPermissionsNeeded = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"};

    @Nullable
    public List<String> checkConfigs(@NotNull List<String> monitorList) {
        Intrinsics.checkNotNullParameter(monitorList, "monitorList");
        return ConfigProxy.INSTANCE.getConfig().m77059a(monitorList);
    }

    public boolean checkSysPermission() {
        Application application = BaseInfo.app;
        if (application != null) {
            return C33872q4.m74664a(application, this.sysPermissionsNeeded);
        }
        return false;
    }
}
