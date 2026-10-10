package com.kubi.sdk.site.info;

import android.util.Log;
import androidx.camera.view.C1454t;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.config.SiteInfoProxy;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SiteInfoManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0017J\u0006\u0010\u001b\u001a\u00020\fJ\u0016\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00050\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00050\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00050\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/site/info/SiteInfoManager;", "", "<init>", "()V", "TAG", "", "currentSiteType", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "targetSiteType", "preSite", "init", "", "siteType", "getSiteType", "()Ljava/lang/String;", "targetSite", "getTargetSite", "isGlobalSite", "", "updateSiteType", "fetchSiteType", "defaultValue", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceRedirect", "getForceRedirect", "()Z", "reset", "logi", "tag", "message", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SiteInfoManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteInfoManager f47913a = new SiteInfoManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicReference<String> f47914b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AtomicReference<String> f47915c;

    /* JADX INFO: renamed from: d */
    public static String f47916d;

    static {
        SiteInfoProxy siteInfoProxy = SiteInfoProxy.f47889a;
        AtomicReference<String> atomicReference = new AtomicReference<>(siteInfoProxy.m58116a());
        f47914b = atomicReference;
        f47915c = new AtomicReference<>(siteInfoProxy.m58116a());
        f47916d = atomicReference.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m58107a(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        SiteInfoManager$fetchSiteType$1 siteInfoManager$fetchSiteType$1;
        if (continuation instanceof SiteInfoManager$fetchSiteType$1) {
            siteInfoManager$fetchSiteType$1 = (SiteInfoManager$fetchSiteType$1) continuation;
            int i11 = siteInfoManager$fetchSiteType$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteInfoManager$fetchSiteType$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteInfoManager$fetchSiteType$1 = new SiteInfoManager$fetchSiteType$1(this, continuation);
            }
        } else {
            siteInfoManager$fetchSiteType$1 = new SiteInfoManager$fetchSiteType$1(this, continuation);
        }
        Object objM58049b = siteInfoManager$fetchSiteType$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteInfoManager$fetchSiteType$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM58049b);
            SiteInfoProxy siteInfoProxy = SiteInfoProxy.f47889a;
            siteInfoManager$fetchSiteType$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            siteInfoManager$fetchSiteType$1.label = 1;
            objM58049b = siteInfoProxy.m58049b(str, siteInfoManager$fetchSiteType$1);
            if (objM58049b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM58049b);
        }
        String str2 = (String) objM58049b;
        m58113g("SiteConfig_SiteInfoManager", "fetch site type: " + str2);
        f47915c.set(str2);
        return str2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58108b() {
        return SiteInfoProxy.f47889a.m58051d();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m58109c() {
        String str = f47914b.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m58110d() {
        String str = f47915c.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    /* JADX INFO: renamed from: e */
    public final void m58111e() {
        String strM58052e = SiteInfoProxy.f47889a.m58052e();
        AtomicReference<String> atomicReference = f47914b;
        atomicReference.set(strM58052e);
        f47915c.set(strM58052e);
        f47916d = atomicReference.get();
    }

    /* JADX INFO: renamed from: g */
    public final void m58113g(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(tag, message);
    }

    /* JADX INFO: renamed from: h */
    public final void m58114h() {
        AtomicReference<String> atomicReference = f47914b;
        atomicReference.set(f47916d);
        SiteInfoProxy.f47889a.m58054g(m58109c());
        m58113g("SiteConfig_SiteInfoManager", "reset currentSiteType: " + atomicReference.get());
    }

    /* JADX INFO: renamed from: i */
    public final boolean m58115i(@NotNull String siteType) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("update site type before: siteType=");
        sb2.append(siteType);
        sb2.append(", current: ");
        AtomicReference<String> atomicReference = f47914b;
        sb2.append(atomicReference);
        sb2.append(",targetSiteType=");
        AtomicReference<String> atomicReference2 = f47915c;
        sb2.append(atomicReference2);
        m58113g("SiteConfig_SiteInfoManager", sb2.toString());
        if (C1454t.m2255a(atomicReference, siteType, siteType)) {
            return true;
        }
        f47916d = atomicReference.get();
        atomicReference.set(siteType);
        atomicReference2.set(siteType);
        m58113g("SiteConfig_SiteInfoManager", "update site type after: siteType=" + siteType + ",current: " + atomicReference + ",targetSiteType=" + m58110d() + ",preSite=" + f47916d);
        SiteInfoProxy.f47889a.m58054g(siteType);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58112f() {
        return Intrinsics.areEqual(m58109c(), SiteType.Global.getSiteType());
    }
}
