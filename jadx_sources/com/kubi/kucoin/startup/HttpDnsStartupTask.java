package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p016ak.C0376a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HttpDnsStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/HttpDnsStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "httpdns", priority = 99, stepType = StartupStepType.Setup, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nHttpDnsStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpDnsStartupTask.kt\ncom/kubi/kucoin/startup/HttpDnsStartupTask\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,55:1\n35#2,4:56\n39#2:62\n44#3,2:60\n*S KotlinDebug\n*F\n+ 1 HttpDnsStartupTask.kt\ncom/kubi/kucoin/startup/HttpDnsStartupTask\n*L\n26#1:56,4\n26#1:62\n26#1:60,2\n*E\n"})
public final class HttpDnsStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.HttpDnsStartupTask$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15601a extends TypeToken<KHttpDnsConfig> {
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(application, "application");
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15601a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_httpdns_config", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        KHttpDnsConfig kHttpDnsConfig = (KHttpDnsConfig) objM20457a;
        C0376a.m1476b(new HttpDnsConfig.C15191a().m31454f(C27025c.m66567e(kHttpDnsConfig != null ? kHttpDnsConfig.getDnsEnable() : null, false)).m31450b(C27025c.m66567e(kHttpDnsConfig != null ? kHttpDnsConfig.getAllowDiskCache() : null, true)).m31453e(C27039d.m66651k(kHttpDnsConfig != null ? kHttpDnsConfig.getAllowRetryCount() : null, 1)).m31452d(C27039d.m66653m(kHttpDnsConfig != null ? kHttpDnsConfig.getAllowMaxTtl() : null, 86400L)).m31451c(C27025c.m66567e(kHttpDnsConfig != null ? kHttpDnsConfig.getAllowExpiredIp() : null, false)).m31455g(C27039d.m66653m(kHttpDnsConfig != null ? kHttpDnsConfig.getGloomyInterval() : null, 30L)).m31456h(C27024b.m66560c(kHttpDnsConfig != null ? kHttpDnsConfig.getPreFetchHost() : null)).m31457i(C27024b.m66560c(kHttpDnsConfig != null ? kHttpDnsConfig.getProbeConfig() : null)).m31458j(C27024b.m66560c(kHttpDnsConfig != null ? kHttpDnsConfig.getServerConfig() : null)).m31449a(application));
    }
}
