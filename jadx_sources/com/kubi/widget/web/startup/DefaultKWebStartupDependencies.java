package com.kubi.widget.web.startup;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.widget.web.helper.SsgConfigHelper;
import com.kubi.widget.web.helper.WhitePageCheckHelper;
import java.lang.reflect.Type;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import t80.C44703a;
import x00.C45979d;

/* JADX INFO: renamed from: com.kubi.widget.web.startup.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KWebStartupDependencies.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0016\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\u001c\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/widget/web/startup/DefaultKWebStartupDependencies;", "Lcom/kubi/widget/web/startup/KWebStartupDependencies;", "<init>", "()V", "prepareDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getPrepareDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "isParallelEnabled", "", "loadExperimentLegacy", "", "loadSiteAndBaseLegacy", "loadWhitePageLegacy", "loadSsgLegacy", "prepareExperiment", "Lcom/kubi/widget/web/startup/PreparedConfig;", "prepareWhitePage", "Lcom/kubi/widget/web/helper/WhitePageCheckHelper$PreparedWhitePageConfig;", "prepareSsg", "", "Lcom/kubi/sdk/web/config/WebSsgInfo;", "applyExperiment", "prepared", "applySiteAndBase", "applyWhitePage", "applySsg", "registerSsgObserver", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebStartupDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/DefaultKWebStartupDependencies\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,131:1\n35#2,4:132\n39#2:138\n44#3,2:136\n*S KotlinDebug\n*F\n+ 1 KWebStartupDependencies.kt\ncom/kubi/widget/web/startup/DefaultKWebStartupDependencies\n*L\n49#1:132,4\n49#1:138\n49#1:136,2\n*E\n"})
public final class DefaultKWebStartupDependencies implements KWebStartupDependencies {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DefaultKWebStartupDependencies f55237a = new DefaultKWebStartupDependencies();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AbstractC41697j0 f55238b = AbstractC41697j0.limitedParallelism$default(C41782z0.m91392b(), 3, null, 2, null);

    /* JADX INFO: renamed from: com.kubi.widget.web.startup.b$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: p */
    public static final Boolean m67380p() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_startup_kweb_parallel_prepare", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return (Boolean) objM20457a;
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    @NotNull
    /* JADX INFO: renamed from: a */
    public PreparedConfig<List<C45979d>> mo67381a() {
        return SsgConfigHelper.f55153a.m67286n();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: b */
    public boolean mo67382b() {
        return KWebStartupPolicy.f55243a.m67408a(new Function0() { // from class: com.kubi.widget.web.startup.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultKWebStartupDependencies.m67380p();
            }
        });
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: e */
    public void mo67385e() {
        SsgConfigHelper.f55153a.m67282f();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: f */
    public void mo67386f() {
        C44703a.f99490a.m98902b();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    @NotNull
    /* JADX INFO: renamed from: g */
    public PreparedConfig<WhitePageCheckHelper.PreparedWhitePageConfig> mo67387g() {
        return WhitePageCheckHelper.f55155a.m67291e();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: h */
    public void mo67388h() {
        KWebSiteBaseConfigurator.f55241a.m67406d();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    @NotNull
    /* JADX INFO: renamed from: i */
    public AbstractC41697j0 mo67389i() {
        return f55238b;
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: j */
    public void mo67390j() {
        SsgConfigHelper.f55153a.m67283g();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: k */
    public void mo67391k() throws Throwable {
        WhitePageCheckHelper.f55155a.m67290d();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    @NotNull
    /* JADX INFO: renamed from: l */
    public PreparedConfig<Boolean> mo67392l() {
        return C44703a.f99490a.m98903c();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: n */
    public void mo67394n() {
        KWebSiteBaseConfigurator.f55241a.m67406d();
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: c */
    public void mo67383c(@NotNull PreparedConfig<Boolean> prepared) {
        Intrinsics.checkNotNullParameter(prepared, "prepared");
        C44703a.f99490a.m98901a(prepared);
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: d */
    public void mo67384d(@NotNull PreparedConfig<? extends List<C45979d>> prepared) {
        Intrinsics.checkNotNullParameter(prepared, "prepared");
        SsgConfigHelper.f55153a.m67281e(prepared);
    }

    @Override // com.kubi.widget.web.startup.KWebStartupDependencies
    /* JADX INFO: renamed from: m */
    public void mo67393m(@NotNull PreparedConfig<WhitePageCheckHelper.PreparedWhitePageConfig> prepared) throws Throwable {
        Intrinsics.checkNotNullParameter(prepared, "prepared");
        WhitePageCheckHelper.f55155a.m67287a(prepared);
    }
}
