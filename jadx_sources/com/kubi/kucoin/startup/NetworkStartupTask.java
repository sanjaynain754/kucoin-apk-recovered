package com.kubi.kucoin.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.fingerprint.FingerprintInterceptor;
import com.kubi.kucoin.interceptor.MultiAccountTokenRetryInterceptor;
import com.kubi.kucoin.interceptor.ReplaceUrlInterceptor;
import com.kubi.kucoin.interceptor.RequestLimitInterceptor;
import com.kubi.kucoin.interceptor.SafeGuardInterceptor;
import com.kubi.kucoin.interceptor.TokenRetryInterceptor;
import com.kubi.kucoin.token.Token401Interceptor;
import com.kubi.kucoin.token.TokenLifecycleInterceptor;
import com.kubi.kucoin.utils.CompositeCookieJar;
import com.kubi.kucoin.utils.NetworkToastHandler;
import com.kubi.network.encryption.adapter.NetworkEncryptInterceptor;
import com.kubi.network.retrofit.interceptor.IllegalStageInterceptor;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.router.core.Router;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.sdk.util.NullGson;
import il.C38662d;
import il.C38663e;
import il.C38664f;
import il.C38666h;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import mr.C42598b;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import p039bk.C4626a;
import p351iy.C40192c;
import p694vk.C45590s;
import p764xk.InterfaceC46258f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NetworkStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/NetworkStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "network", priority = 100, stepType = StartupStepType.Setup, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nNetworkStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkStartupTask.kt\ncom/kubi/kucoin/startup/NetworkStartupTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1#2:68\n1869#3,2:69\n*S KotlinDebug\n*F\n+ 1 NetworkStartupTask.kt\ncom/kubi/kucoin/startup/NetworkStartupTask\n*L\n49#1:69,2\n*E\n"})
public final class NetworkStartupTask implements IStartupTask {
    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) {
        Interceptor tokenRetryInterceptor;
        Intrinsics.checkNotNullParameter(application, "application");
        C19331c.m42834a(new NetworkToastHandler());
        Router router = Router.f46192a;
        List listM56190l = router.m56190l(InterfaceC46258f.class);
        List listM56190l2 = router.m56190l(Interceptor.class);
        C42598b.a aVar = new C42598b.a();
        C45590s c45590s = C45590s.f102687a;
        C42598b.a aVarM93402a = aVar.m93405d(c45590s.m100666Q()).m93407f(new C4626a(null, null, 3, null)).m93406e(NullGson.m58333g()).m93402a(new IllegalStageInterceptor(c45590s.m100666Q())).m93402a(new C38663e(null, 1, null)).m93402a(new SafeGuardInterceptor()).m93402a(new C38664f()).m93402a(new C38662d()).m93402a(new ReplaceUrlInterceptor()).m93402a(new TokenLifecycleInterceptor());
        C40192c c40192c = C40192c.f89321a;
        if (c40192c.m88545g()) {
            tokenRetryInterceptor = new Token401Interceptor();
        } else {
            tokenRetryInterceptor = c40192c.m88546h() ? new TokenRetryInterceptor() : new MultiAccountTokenRetryInterceptor();
        }
        C42598b.a aVarM93402a2 = aVarM93402a.m93402a(tokenRetryInterceptor);
        Iterator it = listM56190l2.iterator();
        while (it.hasNext()) {
            aVarM93402a2.m93402a((Interceptor) it.next());
        }
        C42597a.m93394j(aVarM93402a2.m93402a(new C38666h()).m93402a(new RequestLimitInterceptor()).m93402a(new FingerprintInterceptor()).m93402a(new NetworkEncryptInterceptor((com.kubi.network.encryption.track.g.a) null, 1, (DefaultConstructorMarker) null)).m93404c(new CompositeCookieJar(listM56190l)).m93403b());
    }
}
