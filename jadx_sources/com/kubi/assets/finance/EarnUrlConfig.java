package com.kubi.assets.finance;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.host.HostManager;
import com.kubi.utils.extensions.C27041f;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.finance.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EarnUrlConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/finance/EarnUrlConfig;", "", "<init>", "()V", "CONFIG_NAME", "", "DEFAULT_EARN", "DEFAULT_EARN_DETAIL", "DEFAULT_EARN_LOCKUP", "DEFAULT_EARN_ANALYSIS", "DEFAULT_EARN_BILLS", "DEFAULT_EARN_POL_V1", "getEarnUrl", "getEarnDetailUrl", "getEarnLockupUrl", "getEarnAnalysisUrl", "getEarnBillsUrl", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEarnUrlConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EarnUrlConfig.kt\ncom/kubi/assets/finance/EarnUrlConfig\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,83:1\n35#2,4:84\n39#2:90\n35#2,4:91\n39#2:97\n35#2,4:98\n39#2:104\n35#2,4:105\n39#2:111\n35#2,4:112\n39#2:118\n44#3,2:88\n44#3,2:95\n44#3,2:102\n44#3,2:109\n44#3,2:116\n*S KotlinDebug\n*F\n+ 1 EarnUrlConfig.kt\ncom/kubi/assets/finance/EarnUrlConfig\n*L\n27#1:84,4\n27#1:90\n36#1:91,4\n36#1:97\n45#1:98,4\n45#1:104\n54#1:105,4\n54#1:111\n63#1:112,4\n63#1:118\n27#1:88,2\n36#1:95,2\n45#1:102,2\n54#1:109,2\n63#1:116,2\n*E\n"})
public final class EarnUrlConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final EarnUrlConfig f17409a = new EarnUrlConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f17410b = "/earn";

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f17411c = "/earn/assets/detail";

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f17412d = "/earn/lockup/staking";

    /* JADX INFO: renamed from: e */
    @NotNull
    public static String f17413e = "/earn-h5/analysis";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static String f17414f = "/earn-h5/history/account-bill";

    /* JADX INFO: renamed from: g */
    @NotNull
    public static String f17415g = "/earn-h5/history/account-bill";

    /* JADX INFO: renamed from: com.kubi.assets.finance.a$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<EarnConfig> {
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.a$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<EarnConfig> {
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.a$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class c extends TypeToken<EarnConfig> {
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.a$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class d extends TypeToken<EarnConfig> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m16751a() {
        Object objM20457a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("earn_url", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        EarnConfig earnConfig = (EarnConfig) objM20457a;
        sb2.append(C27041f.m66669i(earnConfig != null ? earnConfig.getEarnAnalysis() : null, f17413e));
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m16752b() {
        Object objM20457a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("earn_url", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        EarnConfig earnConfig = (EarnConfig) objM20457a;
        sb2.append(C27041f.m66669i(earnConfig != null ? earnConfig.getEarnBills() : null, f17414f));
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m16753c() {
        Object objM20457a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("earn_url", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        EarnConfig earnConfig = (EarnConfig) objM20457a;
        sb2.append(C27041f.m66669i(earnConfig != null ? earnConfig.getEarnLockup() : null, f17412d));
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m16754d() {
        Object objM20457a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HostManager.a.m());
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("earn_url", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        EarnConfig earnConfig = (EarnConfig) objM20457a;
        sb2.append(C27041f.m66669i(earnConfig != null ? earnConfig.getEarn() : null, f17410b));
        return sb2.toString();
    }
}
