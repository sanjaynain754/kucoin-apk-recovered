package com.kubi.sdk.site.config;

import android.util.Log;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.config.data.SiteTypeEntity;
import com.kubi.sdk.site.info.ISiteInfoProxy;
import com.kubi.sdk.site.info.data.SiteInfoEntity;
import com.kubi.utils.storage.StorageType;
import java.util.List;
import m00.C42345a;
import m00.InterfaceC42346b;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SiteInfoProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/site/config/SiteInfoProxy;", "Lcom/kubi/sdk/site/info/ISiteInfoProxy;", "<init>", "()V", "TAG", "", "forceRedirect", "", "getForceRedirect", "()Z", "setForceRedirect", "(Z)V", "SiteInfoSId", "Lcom/kubi/utils/storage/StorageId;", "loadSiteType", "fetchSiteType", "defaultValue", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSupportSiteConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSiteType", "", "siteType", "logd", "tag", "message", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteInfoProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteInfoProxy.kt\ncom/kubi/sdk/site/config/SiteInfoProxy\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,100:1\n23#2,2:101\n*S KotlinDebug\n*F\n+ 1 SiteInfoProxy.kt\ncom/kubi/sdk/site/config/SiteInfoProxy\n*L\n94#1:101,2\n*E\n"})
public final class SiteInfoProxy implements ISiteInfoProxy {

    /* JADX INFO: renamed from: b */
    public static boolean f47890b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteInfoProxy f47889a = new SiteInfoProxy();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<String> f47891c = new StorageId<>("site", "siteType", StorageType.Shared, false, 8, null);

    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0122 A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:13:0x0038, B:35:0x0103, B:38:0x0122, B:42:0x0144, B:44:0x014a, B:46:0x0157), top: B:54:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0142  */
    /* JADX WARN: Code duplicated, block: B:41:0x0143  */
    /* JADX WARN: Code duplicated, block: B:44:0x014a A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:13:0x0038, B:35:0x0103, B:38:0x0122, B:42:0x0144, B:44:0x014a, B:46:0x0157), top: B:54:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r2 == r1) goto L33;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x0122, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.kubi.sdk.site.config.SiteInfoProxy] */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m58049b(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        SiteInfoProxy$fetchSiteType$1 siteInfoProxy$fetchSiteType$1;
        String strM102326h;
        ?? BooleanValue;
        Object objM58050c;
        String str2;
        Exception e11;
        ?? r11;
        SiteInfoEntity siteInfoEntity;
        SupportSiteManager supportSiteManager;
        String siteType;
        String siteType2;
        if (continuation instanceof SiteInfoProxy$fetchSiteType$1) {
            siteInfoProxy$fetchSiteType$1 = (SiteInfoProxy$fetchSiteType$1) continuation;
            int i11 = siteInfoProxy$fetchSiteType$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteInfoProxy$fetchSiteType$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteInfoProxy$fetchSiteType$1 = new SiteInfoProxy$fetchSiteType$1(this, continuation);
            }
        } else {
            siteInfoProxy$fetchSiteType$1 = new SiteInfoProxy$fetchSiteType$1(this, continuation);
        }
        Object objM92917a = siteInfoProxy$fetchSiteType$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteInfoProxy$fetchSiteType$1.label;
        boolean z11 = true;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM92917a);
                m58053f("SiteConfig::SiteInfoProxy", "fetchSiteType from server start " + str);
                SupportSiteManager supportSiteManager2 = SupportSiteManager.f47892a;
                if (supportSiteManager2.m58058b().size() == 1) {
                    return CollectionsKt.first((List) supportSiteManager2.m58058b());
                }
                strM102326h = C46392a.m102326h(supportSiteManager2.m58059c(), "");
                m58053f("SiteConfig::SiteInfoProxy", "fetchSiteType supportList = " + strM102326h);
                if (strM102326h.length() == 0) {
                    m58053f("SiteConfig::SiteInfoProxy", "hava no support site list, fetch it first");
                    siteInfoProxy$fetchSiteType$1.L$0 = str;
                    siteInfoProxy$fetchSiteType$1.L$1 = SpillingKt.nullOutSpilledVariable(strM102326h);
                    siteInfoProxy$fetchSiteType$1.I$0 = 1;
                    siteInfoProxy$fetchSiteType$1.label = 1;
                    objM58050c = m58050c(siteInfoProxy$fetchSiteType$1);
                } else {
                    BooleanValue = 1;
                    m58053f("SiteConfig::SiteInfoProxy", "fetchSiteType begin: " + str);
                    InterfaceC42346b interfaceC42346b = (InterfaceC42346b) C42597a.m93386b().create(InterfaceC42346b.class);
                    siteInfoProxy$fetchSiteType$1.L$0 = str;
                    siteInfoProxy$fetchSiteType$1.L$1 = SpillingKt.nullOutSpilledVariable(strM102326h);
                    siteInfoProxy$fetchSiteType$1.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC42346b);
                    siteInfoProxy$fetchSiteType$1.I$0 = BooleanValue;
                    siteInfoProxy$fetchSiteType$1.label = 2;
                    objM92917a = interfaceC42346b.m92917a(siteInfoProxy$fetchSiteType$1);
                    if (objM92917a != coroutine_suspended) {
                        str2 = str;
                        r11 = BooleanValue;
                        siteInfoEntity = (SiteInfoEntity) ((C42345a) objM92917a).m92916a();
                        m58053f("SiteConfig::SiteInfoProxy", "fetchSiteType end entity = " + siteInfoEntity);
                        if (siteInfoEntity == null) {
                            return str2;
                        }
                        C43840a.m96550d("fetchSiteType end " + siteInfoEntity.getSiteType(), "SiteConfig::SiteInfoProxy");
                        supportSiteManager = SupportSiteManager.f47892a;
                        siteType = siteInfoEntity.getSiteType();
                        if (r11 == 0) {
                            z11 = false;
                        }
                        if (supportSiteManager.m58062f(siteType, z11)) {
                            m58055h(siteInfoEntity.getForceRedirect());
                            siteType2 = siteInfoEntity.getSiteType();
                        } else {
                            siteType2 = str2;
                        }
                        C44128b.m97261e("SiteConfig::SupportSiteManager", "fetchSiteType isSupportSite: = " + siteType2);
                        return siteType2;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = siteInfoProxy$fetchSiteType$1.I$0;
                str2 = (String) siteInfoProxy$fetchSiteType$1.L$0;
                try {
                    ResultKt.throwOnFailure(objM92917a);
                    r11 = i13;
                    siteInfoEntity = (SiteInfoEntity) ((C42345a) objM92917a).m92916a();
                    m58053f("SiteConfig::SiteInfoProxy", "fetchSiteType end entity = " + siteInfoEntity);
                    if (siteInfoEntity == null) {
                        return str2;
                    }
                    C43840a.m96550d("fetchSiteType end " + siteInfoEntity.getSiteType(), "SiteConfig::SiteInfoProxy");
                    supportSiteManager = SupportSiteManager.f47892a;
                    siteType = siteInfoEntity.getSiteType();
                    if (r11 == 0) {
                        z11 = false;
                    }
                    if (supportSiteManager.m58062f(siteType, z11)) {
                        m58055h(siteInfoEntity.getForceRedirect());
                        siteType2 = siteInfoEntity.getSiteType();
                    } else {
                        siteType2 = str2;
                    }
                    C44128b.m97261e("SiteConfig::SupportSiteManager", "fetchSiteType isSupportSite: = " + siteType2);
                    return siteType2;
                } catch (Exception e12) {
                    e11 = e12;
                    C44128b.m97261e("SiteConfig::SiteInfoProxy", "load site type error: " + e11.getMessage());
                    return str2;
                }
            }
            String str3 = (String) siteInfoProxy$fetchSiteType$1.L$1;
            String str4 = (String) siteInfoProxy$fetchSiteType$1.L$0;
            ResultKt.throwOnFailure(objM92917a);
            strM102326h = str3;
            str = str4;
            objM58050c = objM92917a;
            m58053f("SiteConfig::SiteInfoProxy", "fetchSiteType begin: " + str);
            InterfaceC42346b interfaceC42346b2 = (InterfaceC42346b) C42597a.m93386b().create(InterfaceC42346b.class);
            siteInfoProxy$fetchSiteType$1.L$0 = str;
            siteInfoProxy$fetchSiteType$1.L$1 = SpillingKt.nullOutSpilledVariable(strM102326h);
            siteInfoProxy$fetchSiteType$1.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC42346b2);
            siteInfoProxy$fetchSiteType$1.I$0 = BooleanValue;
            siteInfoProxy$fetchSiteType$1.label = 2;
            objM92917a = interfaceC42346b2.m92917a(siteInfoProxy$fetchSiteType$1);
            if (objM92917a != coroutine_suspended) {
                str2 = str;
                r11 = BooleanValue;
                siteInfoEntity = (SiteInfoEntity) ((C42345a) objM92917a).m92916a();
                m58053f("SiteConfig::SiteInfoProxy", "fetchSiteType end entity = " + siteInfoEntity);
                if (siteInfoEntity == null) {
                    return str2;
                }
                C43840a.m96550d("fetchSiteType end " + siteInfoEntity.getSiteType(), "SiteConfig::SiteInfoProxy");
                supportSiteManager = SupportSiteManager.f47892a;
                siteType = siteInfoEntity.getSiteType();
                if (r11 == 0) {
                    z11 = false;
                }
                if (supportSiteManager.m58062f(siteType, z11)) {
                    m58055h(siteInfoEntity.getForceRedirect());
                    siteType2 = siteInfoEntity.getSiteType();
                } else {
                    siteType2 = str2;
                }
                C44128b.m97261e("SiteConfig::SupportSiteManager", "fetchSiteType isSupportSite: = " + siteType2);
                return siteType2;
            }
            return coroutine_suspended;
        } catch (Exception e13) {
            str2 = str;
            e11 = e13;
            C44128b.m97261e("SiteConfig::SiteInfoProxy", "load site type error: " + e11.getMessage());
            return str2;
        }
        BooleanValue = ((Boolean) objM58050c).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object m58050c(@NotNull Continuation<? super Boolean> continuation) {
        SiteInfoProxy$fetchSupportSiteConfig$1 siteInfoProxy$fetchSupportSiteConfig$1;
        if (continuation instanceof SiteInfoProxy$fetchSupportSiteConfig$1) {
            siteInfoProxy$fetchSupportSiteConfig$1 = (SiteInfoProxy$fetchSupportSiteConfig$1) continuation;
            int i11 = siteInfoProxy$fetchSupportSiteConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                siteInfoProxy$fetchSupportSiteConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                siteInfoProxy$fetchSupportSiteConfig$1 = new SiteInfoProxy$fetchSupportSiteConfig$1(this, continuation);
            }
        } else {
            siteInfoProxy$fetchSupportSiteConfig$1 = new SiteInfoProxy$fetchSupportSiteConfig$1(this, continuation);
        }
        Object objM92918b = siteInfoProxy$fetchSupportSiteConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = siteInfoProxy$fetchSupportSiteConfig$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM92918b);
                m58053f("SiteConfig::SiteInfoProxy", "fetchSupportSiteConfig start");
                InterfaceC42346b interfaceC42346b = (InterfaceC42346b) C42597a.m93386b().create(InterfaceC42346b.class);
                siteInfoProxy$fetchSupportSiteConfig$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC42346b);
                siteInfoProxy$fetchSupportSiteConfig$1.label = 1;
                objM92918b = interfaceC42346b.m92918b(siteInfoProxy$fetchSupportSiteConfig$1);
                if (objM92918b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM92918b);
            }
            List<SiteTypeEntity> list = (List) ((C42345a) objM92918b).m92916a();
            m58053f("SiteConfig::SiteInfoProxy", "fetchSupportSiteConfig res = " + list);
            if (list != null) {
                SupportSiteManager.f47892a.m58065j(list);
            }
            C43840a.m96550d("fetchSupportSiteConfig " + list, "SiteConfig::SiteInfoProxy");
            return Boxing.boxBoolean(true);
        } catch (Exception e11) {
            C44128b.m97261e("SiteConfig::SiteInfoProxy", "fetchSupportSiteConfig error: " + e11.getMessage());
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m58051d() {
        return f47890b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public String m58052e() {
        String strM102326h = C46392a.m102326h(f47891c, SiteType.Global.getSiteType());
        C43840a.m96550d("loadSiteType end " + strM102326h, "SiteConfig::SiteInfoProxy");
        return strM102326h;
    }

    /* JADX INFO: renamed from: f */
    public final void m58053f(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(tag, message);
    }

    /* JADX INFO: renamed from: g */
    public void m58054g(@NotNull String siteType) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        m58053f("SiteConfig::SiteInfoProxy", "save site type: " + siteType);
        C46392a.m102333p(f47891c, siteType);
    }

    /* JADX INFO: renamed from: h */
    public void m58055h(boolean z11) {
        f47890b = z11;
    }
}
