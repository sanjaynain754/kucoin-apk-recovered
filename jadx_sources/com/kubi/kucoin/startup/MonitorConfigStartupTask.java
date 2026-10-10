package com.kubi.kucoin.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.monitor.duration.IDurationRuleSetting;
import com.kubi.router.core.Router;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import java.lang.reflect.Type;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p569qq.C43848i;
import p671uq.C45290a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: MonitorConfigStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/startup/MonitorConfigStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "Companion", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "monitor_config", priority = 200, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Await)
@SourceDebugExtension({"SMAP\nMonitorConfigStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorConfigStartupTask.kt\ncom/kubi/kucoin/startup/MonitorConfigStartupTask\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,42:1\n35#2,4:43\n39#2:49\n44#3,2:47\n*S KotlinDebug\n*F\n+ 1 MonitorConfigStartupTask.kt\ncom/kubi/kucoin/startup/MonitorConfigStartupTask\n*L\n30#1:43,4\n30#1:49\n30#1:47,2\n*E\n"})
public final class MonitorConfigStartupTask implements IStartupTask {

    @NotNull
    private static final String STUTTER_MONITOR_SWITCH = "stutter_monitor_switch";

    @NotNull
    private static final String TAG = "DurationMonitorStartup";

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.MonitorConfigStartupTask$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15604a extends TypeToken<Boolean> {
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(application, "application");
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15604a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a(STUTTER_MONITOR_SWITCH, type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        Boolean bool = (Boolean) objM20457a;
        if (bool != null) {
            C44128b.m97266j(TAG, "enableStutter = " + bool);
            C43848i.m96581i(bool.booleanValue());
        }
        Iterator it = Router.f46192a.m56190l(IDurationRuleSetting.class).iterator();
        while (it.hasNext()) {
            C45290a.f101823a.m100100a((IDurationRuleSetting) it.next());
        }
    }
}
