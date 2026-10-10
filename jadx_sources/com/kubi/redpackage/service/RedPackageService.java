package com.kubi.redpackage.service;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.redpackage.RedPackageHelperKt;
import com.kubi.redpackage.api.IRedPackageService;
import com.kubi.redpackage.service.RedPackageService;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.site.C24128a;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p810yv.C46602i;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RedPackageService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/redpackage/service/RedPackageService;", "Lcom/kubi/redpackage/api/IRedPackageService;", "<init>", "()V", "isSupportRedPackage", "", FirebaseAnalytics.Param.CURRENCY, "", "jumpToRedPackageHome", "", "fetchSupportRedPackageCoins", "getRedPacketData", "redCode", "Companion", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRedPackageService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPackageService.kt\ncom/kubi/redpackage/service/RedPackageService\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,50:1\n35#2,4:51\n39#2:57\n44#3,2:55\n*S KotlinDebug\n*F\n+ 1 RedPackageService.kt\ncom/kubi/redpackage/service/RedPackageService\n*L\n24#1:51,4\n24#1:57\n24#1:55,2\n*E\n"})
public final class RedPackageService implements IRedPackageService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f43148b = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<Boolean> f43149c = LazyKt.lazy(new Function0() { // from class: yv.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(RedPackageService.m53759g());
        }
    });

    /* JADX INFO: compiled from: RedPackageService.kt */
    /* JADX INFO: loaded from: classes38.dex */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006¨\u0006\t"}, m90084d2 = {"Lcom/kubi/redpackage/service/RedPackageService$Companion;", "", "<init>", "()V", "isSupportRNRedPacket", "", "()Z", "isSupportRNRedPacket$delegate", "Lkotlin/Lazy;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m53760a() {
            return ((Boolean) RedPackageService.f43149c.getValue()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.redpackage.service.RedPackageService$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes38.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C22730a extends TypeToken<Boolean> {
    }

    @Override // com.kubi.redpackage.api.IRedPackageService
    /* JADX INFO: renamed from: d */
    public void mo53746d(@Nullable String str) {
        RedPackageHelperKt.m53717f(str, null, null, 6, null);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m53759g() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C22730a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_redpacket_use_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @Override // com.kubi.redpackage.api.IRedPackageService
    /* JADX INFO: renamed from: b */
    public boolean mo53744b(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (C24128a.m58028a()) {
            return C46602i.f104351a.m102760p(currency);
        }
        return false;
    }

    @Override // com.kubi.redpackage.api.IRedPackageService
    /* JADX INFO: renamed from: c */
    public void mo53745c() {
        if (f43148b.m53760a()) {
            Router.f46192a.m56184f("krn/router?biz=redpacket&entry=main&component=kucoin_redpacket_rn&needLogin=true&backup=flutter%253Froute=redpacket_home").m4048k();
        } else {
            Router.f46192a.m56184f(C23767n.m56885i("redpacket_home", false, 1, null)).m4048k();
        }
    }

    @Override // com.kubi.redpackage.api.IRedPackageService
    /* JADX INFO: renamed from: a */
    public void mo53743a() {
        if (C24128a.m58028a()) {
            C46602i.f104351a.m102759h();
        }
    }
}
