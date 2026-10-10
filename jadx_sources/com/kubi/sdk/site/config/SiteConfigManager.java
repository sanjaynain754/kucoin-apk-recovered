package com.kubi.sdk.site.config;

import android.content.Context;
import com.kubi.sdk.site.SiteBizConfigKey;
import com.kubi.sdk.site.SiteExtConfigKey;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.config.client.LocalConfigClient;
import com.kubi.sdk.site.config.client.RemoteConfigClient;
import com.kubi.sdk.site.config.data.SiteConfigEntity;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SiteConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0019J \u0010\u001a\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020!J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0002J\u0018\u0010 \u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0002J\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010(J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010*\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/site/config/SiteConfigManager;", "", "<init>", "()V", "localClient", "Lcom/kubi/sdk/site/config/client/LocalConfigClient;", "remoteClient", "Lcom/kubi/sdk/site/config/client/RemoteConfigClient;", "TAG", "", "fetchSiteConfigDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "delayJob", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "TIMEOUT_DURATION", "", "init", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCacheFileExist", "targetSite", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchConfig", "queryBoolConfig", "key", "Lcom/kubi/sdk/site/SiteVisibleConfigKey;", "queryStringConfig", "Lcom/kubi/sdk/site/SiteBizConfigKey;", "queryExtConfig", "Lcom/kubi/sdk/site/SiteExtConfigKey;", "queryBooleanConfig", "configKey", "configType", "getConfigEntity", "Lcom/kubi/sdk/site/config/data/SiteConfigEntity;", "watchTimeout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFetchSiteConfigDeferred", "clear", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SiteConfigManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteConfigManager f47884a = new SiteConfigManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static LocalConfigClient f47885b = new LocalConfigClient();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static RemoteConfigClient f47886c = new RemoteConfigClient();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC41769w<Boolean> f47887d = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final AtomicReference<InterfaceC41775x1> f47888e = new AtomicReference<>(null);

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m58036e(SiteConfigManager siteConfigManager, Context context, String str, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        return siteConfigManager.m58038d(context, str, continuation);
    }

    /* JADX INFO: renamed from: c */
    public final void m58037c() {
        InterfaceC41775x1 andSet = f47888e.getAndSet(null);
        if (andSet != null) {
            InterfaceC41775x1.a.m91377a(andSet, null, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m58038d(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        SiteConfigManager$fetchConfig$1 siteConfigManager$fetchConfig$1;
        if (continuation instanceof SiteConfigManager$fetchConfig$1) {
            siteConfigManager$fetchConfig$1 = (SiteConfigManager$fetchConfig$1) continuation;
            int i11 = siteConfigManager$fetchConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteConfigManager$fetchConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteConfigManager$fetchConfig$1 = new SiteConfigManager$fetchConfig$1(this, continuation);
            }
        } else {
            siteConfigManager$fetchConfig$1 = new SiteConfigManager$fetchConfig$1(this, continuation);
        }
        Object objM58080b = siteConfigManager$fetchConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteConfigManager$fetchConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM58080b);
            C44128b.m97266j("SiteConfigManager", "fetchConfig start!!!");
            RemoteConfigClient remoteConfigClient = f47886c;
            siteConfigManager$fetchConfig$1.L$0 = context;
            siteConfigManager$fetchConfig$1.L$1 = str;
            siteConfigManager$fetchConfig$1.label = 1;
            objM58080b = remoteConfigClient.m58080b(siteConfigManager$fetchConfig$1);
            if (objM58080b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) siteConfigManager$fetchConfig$1.L$1;
            context = (Context) siteConfigManager$fetchConfig$1.L$0;
            ResultKt.throwOnFailure(objM58080b);
        }
        SiteConfigEntity siteConfigEntity = (SiteConfigEntity) objM58080b;
        C44128b.m97266j("SiteConfigManager", "fetchConfig end!!!");
        if (siteConfigEntity != null) {
            f47885b.m58078m(context, siteConfigEntity);
        }
        f47887d.mo91370n(Boxing.boxBoolean(true));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fetchConfig newSiteConfig=");
        sb2.append(siteConfigEntity != null ? siteConfigEntity.getSiteType() : null);
        sb2.append(", targetSite=");
        sb2.append(str);
        C44128b.m97266j("SiteConfigManager", sb2.toString());
        return Boxing.boxBoolean(Intrinsics.areEqual(siteConfigEntity != null ? siteConfigEntity.getSiteType() : null, str));
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final SiteConfigEntity m58039f() {
        return f47885b.m58070e();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41769w<Boolean> m58040g() {
        return f47887d;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m58041h(@NotNull Context context, @NotNull Continuation<? super Unit> continuation) {
        Object objM58071f = f47885b.m58071f(context, continuation);
        return objM58071f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM58071f : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m58042i(@NotNull SiteVisibleConfigKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key != SiteVisibleConfigKey.None) {
            return m58043j(key.getConfigKey());
        }
        C44128b.m97266j("SiteConfigManager", "queryBoolConfig key is None, return true");
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m58043j(String str) {
        return f47885b.m58074i(str);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m58044k(@NotNull SiteExtConfigKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == SiteExtConfigKey.None ? "" : m58045l(key.getConfigType(), key.getConfigKey());
    }

    /* JADX INFO: renamed from: l */
    public final String m58045l(String str, String str2) {
        return f47885b.m58075j(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m58046m(@NotNull SiteBizConfigKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == SiteBizConfigKey.None ? "" : m58047n(key.getConfigKey());
    }

    /* JADX INFO: renamed from: n */
    public final String m58047n(String str) {
        return f47885b.m58076k(str);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m58048o(@NotNull Continuation<? super Unit> continuation) {
        Object objM91130f = C41713n0.m91130f(new SiteConfigManager$watchTimeout$2(null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }
}
