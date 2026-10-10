package com.kubi.sdk.site.config;

import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.config.data.SiteTypeEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.storage.StorageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SupportSiteManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0016JA\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u001a\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u001d\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/site/config/SupportSiteManager;", "", "<init>", "()V", "TAG", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "supportSites", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lcom/kubi/sdk/site/config/data/SiteTypeEntity;", "defaultSupportSites", "SiteSupportsId", "Lcom/kubi/utils/storage/StorageId;", "getSiteSupportsId", "()Lcom/kubi/utils/storage/StorageId;", "loadData", "", "getSupportSiteName", "type", "isSupportSite", "", "isUseRemote", "currentSupportSites", "defaultSites", "defaultSiteType", "isSupportSite$LSiteConfig_googleRelease", "getSupportSiteList", "updateSupportSites", "sites", "getDefaultSupportSites", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSupportSiteManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSiteManager.kt\ncom/kubi/sdk/site/config/SupportSiteManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,125:1\n295#2,2:126\n295#2,2:128\n1761#2,3:130\n1761#2,3:133\n1563#2:136\n1634#2,3:137\n23#3,2:140\n*S KotlinDebug\n*F\n+ 1 SupportSiteManager.kt\ncom/kubi/sdk/site/config/SupportSiteManager\n*L\n59#1:126,2\n63#1:128,2\n87#1:130,3\n93#1:133,3\n104#1:136\n104#1:137,3\n109#1:140,2\n*E\n"})
public final class SupportSiteManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SupportSiteManager f47892a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC41709m0 f47893b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AtomicReference<List<SiteTypeEntity>> f47894c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static List<String> f47895d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<String> f47896e;

    static {
        SupportSiteManager supportSiteManager = new SupportSiteManager();
        f47892a = supportSiteManager;
        f47893b = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C41782z0.m91392b()));
        f47894c = new AtomicReference<>(CollectionsKt.emptyList());
        f47895d = CollectionsKt.emptyList();
        f47896e = new StorageId<>("site", "siteSupports", StorageType.Shared, false, 8, null);
        supportSiteManager.m58064i();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m58057h(SupportSiteManager supportSiteManager, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return supportSiteManager.m58062f(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m58058b() {
        if (f47895d.isEmpty()) {
            f47895d = CollectionsKt.listOf((Object[]) new String[]{"global", SiteType.AUSTRALIA_NAME});
        }
        return f47895d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<String> m58059c() {
        return f47896e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<SiteTypeEntity> m58060d() {
        List<SiteTypeEntity> list = f47894c.get();
        Intrinsics.checkNotNull(list);
        if (!list.isEmpty()) {
            return list;
        }
        List<String> listM58058b = m58058b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM58058b, 10));
        for (String str : listM58058b) {
            arrayList.add(new SiteTypeEntity(str, str));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m58061e(@NotNull String type) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(type, "type");
        if (f47894c.get().isEmpty()) {
            Iterator<T> it = f47895d.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.areEqual((String) next2, type));
            String str = (String) next2;
            if (str != null) {
                return str;
            }
        }
        List<SiteTypeEntity> list = f47894c.get();
        Intrinsics.checkNotNullExpressionValue(list, "get(...)");
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((SiteTypeEntity) next).getSiteType(), type));
        SiteTypeEntity siteTypeEntity = (SiteTypeEntity) next;
        if (siteTypeEntity != null) {
            return siteTypeEntity.getSiteName();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58062f(@NotNull String type, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        List<SiteTypeEntity> list = f47894c.get();
        C44128b.m97261e("SiteConfig::SupportSiteManager", "isSupportSite: sites = " + type + ", isUseRemote=" + z11 + ", supportSites=" + list);
        Intrinsics.checkNotNull(list);
        return m58063g(type, z11, list, m58058b(), SiteInfoProxy.f47889a.m58116a());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m58063g(@NotNull String type, boolean z11, @NotNull List<SiteTypeEntity> currentSupportSites, @NotNull List<String> defaultSites, @NotNull String defaultSiteType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currentSupportSites, "currentSupportSites");
        Intrinsics.checkNotNullParameter(defaultSites, "defaultSites");
        Intrinsics.checkNotNullParameter(defaultSiteType, "defaultSiteType");
        if (z11 && !currentSupportSites.isEmpty()) {
            if (currentSupportSites != null && currentSupportSites.isEmpty()) {
                return false;
            }
            Iterator<T> it = currentSupportSites.iterator();
            while (it.hasNext()) {
                if (StringsKt.equals(((SiteTypeEntity) it.next()).getSiteType(), type, true)) {
                    return true;
                }
            }
            return false;
        }
        if (!Intrinsics.areEqual(defaultSiteType, "global")) {
            return false;
        }
        if (defaultSites != null && defaultSites.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = defaultSites.iterator();
        while (it2.hasNext()) {
            if (StringsKt.equals((String) it2.next(), type, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m58064i() {
        C41696j.m91104d(f47893b, null, null, new SupportSiteManager$loadData$1(null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m58065j(@NotNull List<SiteTypeEntity> sites) {
        Intrinsics.checkNotNullParameter(sites, "sites");
        C44128b.m97261e("SiteConfig::SupportSiteManager", "updateSupportSites: sites = " + sites);
        C46392a.m102333p(f47896e, C27099x.m66919i(sites, false, 2, null));
        AtomicReference<List<SiteTypeEntity>> atomicReference = f47894c;
        atomicReference.set(sites);
        C44128b.m97270n("SiteConfig::SupportSiteManager", "updateSupportSites supportSites=" + atomicReference.get());
    }
}
