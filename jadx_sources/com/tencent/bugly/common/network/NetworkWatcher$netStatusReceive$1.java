package com.tencent.bugly.common.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.tencent.bugly.proguard.C33598d3;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class NetworkWatcher$netStatusReceive$1 extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onReceive$lambda-0, reason: not valid java name */
    public static final void m103811onReceive$lambda0() {
        NetworkWatcher.INSTANCE.checkConnInfo();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Handler handler;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (C33598d3.m72772c() == null || (handler = NetworkWatcher.handler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.tencent.bugly.common.network.a
            @Override // java.lang.Runnable
            public final void run() {
                NetworkWatcher$netStatusReceive$1.m103811onReceive$lambda0();
            }
        });
    }
}
