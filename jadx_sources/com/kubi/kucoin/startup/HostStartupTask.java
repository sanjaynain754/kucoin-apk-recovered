package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.config.RemoteConfig;
import com.kubi.fingerprint.FingerprintManager;
import com.kubi.host.HostManager;
import com.kubi.host.service.C15189b;
import com.kubi.host.service.ProductService;
import com.kubi.host.utils.ConfigUrl;
import com.kubi.host.utils.HostUtils;
import com.kubi.kucoin.interceptor.ReplaceUrlInterceptor;
import com.kubi.kucoin.utils.LocateManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import gl.InterfaceC37971a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p764xk.InterfaceC46254b;
import p777xx.C46337a;
import p799yj.C46509a;
import p799yj.C46510b;
import p813yy.C46612b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HostStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/HostStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "host", priority = 12, stepType = StartupStepType.Setup, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nHostStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostStartupTask.kt\ncom/kubi/kucoin/startup/HostStartupTask\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n17#2,2:99\n17#2,2:101\n16#3:103\n2756#4:104\n1#5:105\n*S KotlinDebug\n*F\n+ 1 HostStartupTask.kt\ncom/kubi/kucoin/startup/HostStartupTask\n*L\n63#1:99,2\n83#1:101,2\n40#1:103\n40#1:104\n40#1:105\n*E\n"})
public final class HostStartupTask implements IStartupTask {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List run$lambda$1() {
        String strZ = HostManager.a.z();
        ReplaceUrlInterceptor.a.setSBaseUrl(strZ);
        C46337a c46337a = C46337a.f103912a;
        List listM56190l = Router.f46192a.m56190l(InterfaceC46254b.class);
        Iterator it = listM56190l.iterator();
        while (it.hasNext()) {
            ((InterfaceC46254b) it.next()).invoke(strZ);
        }
        return listM56190l;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        C15189b c15189b;
        Object objM56186h;
        Intrinsics.checkNotNullParameter(application, "application");
        final Function0 function0 = new Function0() { // from class: com.kubi.kucoin.startup.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HostStartupTask.run$lambda$1();
            }
        };
        HashMap map = new HashMap();
        LocateManager.LocationData locationDataM33101d = LocateManager.f28544a.m33101d();
        if (locationDataM33101d != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(locationDataM33101d.getLongitude());
            sb2.append(',');
            sb2.append(locationDataM33101d.getLatitude());
            map.put(FirebaseAnalytics.Param.LOCATION, sb2.toString());
        }
        map.put("locale", C46612b.f104366a.m102772a().getCountry());
        HostUtils hostUtils = HostUtils.a;
        String strB = hostUtils.b(application);
        if (strB != null) {
            map.put("mcc", strB);
        }
        String strC = hostUtils.c(application);
        if (strC != null) {
            map.put("mnc", strC);
        }
        C46509a.a aVarM102591b = new C46509a.a().m102591b("\n{'availableAppHost': 'xcoinsystem.com', 'appStaticImgHost': 'staticimg.com', 'appSupportHost': 'support.kucoin.plus', 'availableWebHosts': ['kucoin.com', 'kucoin.com'], 'availableH5Hosts': ['www.kucoin.plus'], 'cmsH5Hosts': ['www.kucoin.cloud', 'www.kucoin.com'], 'offlineDefault': ['https://www.kucoin.com/trading-bot-h5/source/source.json', 'https://www.kucoin.com/kucoins/source/source.json', 'https://www.kucoin.plus/earn-h5/source/source.json'], 'cmsHostDict': {}, 'external': {'appZendeskHost': 'kucoin.zendesk.com', 'appPushHost': 'aurorapush.cc', 'appPlusHost': 'kucoin.plus', 'appPciHost': 'paypci.kucoin.com'}}\n");
        ConfigUrl configUrlA = hostUtils.a(RemoteConfig.m20458b("host_config"));
        if (configUrlA == null && ((objM56186h = Router.f46192a.m56186h(InterfaceC37971a.class, SiteInfoManager.f47913a.m58109c())) == null || (configUrlA = ((InterfaceC37971a) objM56186h).m85815a()) == null)) {
            configUrlA = ConfigUrl.INSTANCE.m103793default();
        }
        C46510b.m102599c(aVarM102591b.m102593d(configUrlA).m102592c(map).m102595f("\n173.245.48.0/20\n103.21.244.0/22\n103.22.200.0/22\n103.31.4.0/22\n141.101.64.0/18\n108.162.192.0/18\n190.93.240.0/20\n188.114.96.0/20\n197.234.240.0/22\n198.41.128.0/17\n162.158.0.0/15\n104.16.0.0/13\n104.24.0.0/14\n172.64.0.0/13\n131.0.72.0/22\n").m102596g("\n2400:cb00::/32\n2606:4700::/32\n2803:f800::/32\n2405:b500::/32\n2405:8100::/32\n2a06:98c0::/29\n2c0f:f248::/32\n").m102594e(hostUtils.d(RemoteConfig.m20458b("monitor_config"))).m102590a());
        Observable<Boolean> observableObserveOn = C46510b.m102601e().observeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.startup.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HostStartupTask.run$lambda$9(function0, (Boolean) obj);
            }
        };
        observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kucoin.startup.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
        HostManager hostManager = HostManager.a;
        Object objM56186h2 = Router.f46192a.m56186h(InterfaceC37971a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h2 == null || (c15189b = ((InterfaceC37971a) objM56186h2).m85816b()) == null) {
            c15189b = new C15189b(null, null, null, null, null, null, null, null, 255, null);
        }
        hostManager.B(new ProductService(c15189b));
        function0.invoke();
        if (map.containsKey(FirebaseAnalytics.Param.LOCATION)) {
            FingerprintManager.a.n((String) map.get(FirebaseAnalytics.Param.LOCATION));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$9(Function0 function0, Boolean bool) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
