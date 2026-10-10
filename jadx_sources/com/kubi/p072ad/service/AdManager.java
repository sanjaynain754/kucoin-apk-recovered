package com.kubi.p072ad.service;

import ba.InterfaceC4523a;
import ca.InterfaceC4918a;
import com.blankj.utilcode.util.C5284n;
import com.blankj.utilcode.util.C5302w;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.p072ad.exception.AdException;
import com.kubi.p072ad.utils.AdScope;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: AdManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/ad/service/AdManager;", "", "<init>", "()V", "TAG", "", "MMKV_CATEGORY", "AD_SP_KEY", "AD_CODE", "getSplashAds", "Lcom/kubi/ad/api/entity/ResAdEntity;", "fetchSplashAds", "", "downloadAd", "list", "", "currentAdParentFileName", "loginfo", "msg", "fetchResourceAd", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAdManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdManager.kt\ncom/kubi/ad/service/AdManager\n+ 2 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 AdIssue.kt\ncom/kubi/ad/exception/AdIssueKt\n*L\n1#1,149:1\n178#2:150\n178#2:155\n25#3,3:151\n15#4:154\n15#4:156\n46#5,2:157\n*S KotlinDebug\n*F\n+ 1 AdManager.kt\ncom/kubi/ad/service/AdManager\n*L\n51#1:150\n86#1:155\n67#1:151,3\n83#1:154\n97#1:156\n144#1:157,2\n*E\n"})
public final class AdManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AdManager f14936a = new AdManager();

    /* JADX INFO: renamed from: a */
    public final String m14648a() {
        return SiteUtils.f47907a.m58089a("ad");
    }

    /* JADX INFO: renamed from: b */
    public final void m14649b(@NotNull List<ResAdEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        try {
            String str = C5302w.m6509d() + '/' + m14648a();
            if (list.isEmpty()) {
                m14653f("list is empty, delete adDir:" + str);
                C5284n.m6308k(str);
                C46392a.m102335r(new StorageId("AdManager", "splash_ad", null, false, 12, null));
                return;
            }
            ResAdEntity resAdEntity = (ResAdEntity) CollectionsKt.firstOrNull((List) list);
            if (resAdEntity == null) {
                return;
            }
            ResAdEntity resAdEntity2 = (ResAdEntity) C46392a.f104043a.m102336j(new StorageId("AdManager", "splash_ad", null, false, 12, null), ResAdEntity.class, null);
            String nightImageUrl = resAdEntity.getNightImageUrl();
            if (Intrinsics.areEqual(nightImageUrl, resAdEntity2 != null ? resAdEntity2.getNightImageUrl() : null)) {
                if (C5284n.m6313p(resAdEntity2 != null ? resAdEntity2.getFilePath() : null)) {
                    m14653f("newAd not change,use local ad, url:" + nightImageUrl);
                    resAdEntity.setFilePath(resAdEntity2 != null ? resAdEntity2.getFilePath() : null);
                    C46392a.m102331n(new StorageId("AdManager", "splash_ad", null, false, 12, null), resAdEntity);
                    return;
                }
            }
            m14653f("newAd changed, url:" + nightImageUrl);
            C5284n.m6308k(str);
            C46392a.m102335r(new StorageId("AdManager", "splash_ad", null, false, 12, null));
            if (nightImageUrl != null && nightImageUrl.length() != 0) {
                if (C5284n.m6305h(str)) {
                    File file = C46338a.m102151a(BaseApplication.INSTANCE.get()).mo6627o().mo6601L0(nightImageUrl).m6604O0().get();
                    m14653f("download ad finished, url:" + nightImageUrl);
                    String strSubstring = nightImageUrl.substring(C27039d.m66650j(Integer.valueOf(StringsKt.lastIndexOf$default((CharSequence) nightImageUrl, '/', 0, false, 6, (Object) null))) + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    File file2 = new File(str, strSubstring);
                    if (C5284n.m6298a(file, file2, null)) {
                        resAdEntity.setFilePath(file2.getAbsolutePath());
                        C46392a.m102331n(new StorageId("AdManager", "splash_ad", null, false, 12, null), resAdEntity);
                        m14653f("save ad, filePath:" + resAdEntity.getFilePath());
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th2) {
            C44128b.m97263g("Splash::AdManager", th2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("downloadError:");
            sb2.append(th2.getMessage());
            sb2.append(", adUrl:");
            ResAdEntity resAdEntity3 = (ResAdEntity) CollectionsKt.firstOrNull((List) list);
            sb2.append(resAdEntity3 != null ? resAdEntity3.getNightImageUrl() : null);
            sb2.append('}');
            C43840a.m96548b(sb2.toString(), "Splash::AdManager");
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m14650c(@NotNull String str, @NotNull Continuation<? super List<ResAdEntity>> continuation) {
        AdManager$fetchResourceAd$1 adManager$fetchResourceAd$1;
        if (continuation instanceof AdManager$fetchResourceAd$1) {
            adManager$fetchResourceAd$1 = (AdManager$fetchResourceAd$1) continuation;
            int i11 = adManager$fetchResourceAd$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                adManager$fetchResourceAd$1.label = i11 - Integer.MIN_VALUE;
            } else {
                adManager$fetchResourceAd$1 = new AdManager$fetchResourceAd$1(this, continuation);
            }
        } else {
            adManager$fetchResourceAd$1 = new AdManager$fetchResourceAd$1(this, continuation);
        }
        AdManager$fetchResourceAd$1 adManager$fetchResourceAd$2 = adManager$fetchResourceAd$1;
        Object objM42826g = adManager$fetchResourceAd$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = adManager$fetchResourceAd$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM42826g);
                InterfaceC41634e<Map<String, List<ResAdEntity>>> interfaceC41634eM4364a = ((InterfaceC4523a) RetrofitFlowExKt.m42820a(InterfaceC4523a.class)).m4364a(str);
                adManager$fetchResourceAd$2.L$0 = str;
                adManager$fetchResourceAd$2.label = 1;
                objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM4364a, false, null, adManager$fetchResourceAd$2, 2, null);
                if (objM42826g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) adManager$fetchResourceAd$2.L$0;
                ResultKt.throwOnFailure(objM42826g);
            }
            Map map = (Map) ((C19334f) objM42826g).m42846a();
            if (map != null) {
                return (List) map.get(str);
            }
            return null;
        } catch (Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                C43846g.m96568c(new AdException(th2, "AdService", false, null, 8, null), null, 2, null);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m14651d() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC4918a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC4918a) objM56186h).m5143a();
        } else {
            C41696j.m91104d(new AdScope(C42911a.m94120b(), null, 2, 0 == true ? 1 : 0), null, null, new AdManager$fetchSplashAds$2$1(null), 3, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ResAdEntity m14652e() {
        File parentFile;
        ResAdEntity resAdEntity = (ResAdEntity) C46392a.f104043a.m102336j(new StorageId("AdManager", "splash_ad", null, false, 12, null), ResAdEntity.class, null);
        if (resAdEntity == null) {
            return null;
        }
        boolean zM6313p = C5284n.m6313p(resAdEntity.getFilePath());
        String canceledAt = resAdEntity.getCanceledAt();
        boolean z11 = canceledAt == null || canceledAt.length() == 0 || TimeUtils.m66428o(resAdEntity.getCanceledAt());
        String strM14648a = m14648a();
        File fileM6311n = C5284n.m6311n(resAdEntity.getFilePath());
        boolean zEquals = StringsKt.equals(strM14648a, (fileM6311n == null || (parentFile = fileM6311n.getParentFile()) == null) ? null : parentFile.getName(), true);
        m14653f("getSplashAds: fileExists=" + zM6313p + ",adValid=" + z11 + ",sameSiteAd=" + zEquals + '(' + resAdEntity.getFilePath() + ')');
        if (zM6313p && z11 && zEquals) {
            return resAdEntity;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m14653f(String str) {
        String str2 = '[' + SiteType.INSTANCE.getCurrentSiteType() + ']' + str;
        C44128b.m97266j("Splash::AdManager", str2);
        C43840a.m96550d(str2, "Splash::AdManager");
    }
}
