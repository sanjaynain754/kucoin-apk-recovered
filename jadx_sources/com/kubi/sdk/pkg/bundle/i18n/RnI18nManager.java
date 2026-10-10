package com.kubi.sdk.pkg.bundle.i18n;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.bundle.pkgplatform.PkgBundleUpdateItem;
import com.kubi.sdk.pkg.config.PackConfigManager;
import com.kubi.sdk.pkg.util.C23984a;
import com.kubi.sdk.pkg.util.C23985b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.JobKt__JobKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RnI18nManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u000fJG\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-¨\u0006/"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "g", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBundleUpdateItem;", "updateItems", "e", "(Landroid/content/Context;Ljava/util/List;)V", "f", "", "bizList", "d", Constants.BIZ, "entry", "siteType", "lang", "projectIds", "i", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;", "metadata", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/List;)V", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/io/File;", "j", "(Landroid/content/Context;)Ljava/io/File;", "Ljava/lang/Object;", "initLock", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/m0;", "scope", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;", "storage", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;", "prefetchTask", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnI18nManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnI18nManager.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RnI18nManager.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nManagerKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,182:1\n1603#2,9:183\n1855#2:192\n1856#2:195\n1612#2:196\n1603#2,9:197\n1855#2:206\n1856#2:208\n1612#2:209\n1620#2,3:220\n288#2,2:229\n1#3:193\n1#3:194\n1#3:207\n22#4,8:210\n22#4,2:218\n24#4,6:223\n49#5,4:231\n*S KotlinDebug\n*F\n+ 1 RnI18nManager.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nManager\n*L\n95#1:183,9\n95#1:192\n95#1:195\n95#1:196\n97#1:197,9\n97#1:206\n97#1:208\n97#1:209\n132#1:220,3\n154#1:229,2\n95#1:194\n97#1:207\n122#1:210,8\n130#1:218,2\n130#1:223,6\n44#1:231,4\n*E\n"})
public final class RnI18nManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RnI18nManager f47318a = new RnI18nManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Object initLock = new Object();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC41709m0 scope = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()).plus(new CoroutineName("rn-i18n-prefetch")).plus(new C23944a(CoroutineExceptionHandler.INSTANCE)));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static volatile RnI18nStorage storage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static volatile RnI18nPrefetchTask prefetchTask;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.i18n.RnI18nManager$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/sdk/pkg/bundle/i18n/RnI18nManager$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 RnI18nManager.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nManager\n*L\n1#1,110:1\n45#2,2:111\n*E\n"})
    public static final class C23944a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            C23985b.m57873d(C23985b.f47489a, "rnI18nManager", "i18n 后台任务异常: " + exception.getMessage(), null, 4, null);
        }

        public C23944a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m57556a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (initLock) {
            try {
                JobKt__JobKt.m90365i(scope.getF26335b(), null, 1, null);
                RnI18nStorage rnI18nStorage = storage;
                if (rnI18nStorage != null) {
                    rnI18nStorage.m57584h();
                } else {
                    FilesKt.deleteRecursively(f47318a.m57565j(context));
                }
                storage = null;
                prefetchTask = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57557b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (storage != null) {
            return;
        }
        synchronized (initLock) {
            if (storage != null) {
                return;
            }
            RnI18nStorage rnI18nStorage = new RnI18nStorage(f47318a.m57565j(context));
            storage = rnI18nStorage;
            prefetchTask = new RnI18nPrefetchTask(rnI18nStorage, PackageRnI18nFetcher.f47311a, 0, null, 12, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m57558c(String siteType, String lang) {
        return new RnI18nLocaleReader(storage).m57554e(CollectionsKt.emptyList(), siteType, lang);
    }

    /* JADX INFO: renamed from: d */
    public final void m57559d(@NotNull Context context, @NotNull List<String> bizList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bizList, "bizList");
        if (bizList.isEmpty()) {
            return;
        }
        try {
            f47318a.m57557b(context);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = bizList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((String) it.next()) + "-main");
            }
            RnI18nStorage rnI18nStorage = storage;
            if (rnI18nStorage != null) {
                rnI18nStorage.m57596t(linkedHashSet);
            }
        } catch (Exception e11) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C23985b.m57873d(C23985b.f47489a, "rnI18nManager", "delete i18n metadata 失败，已降级 RN 原链路: " + e11.getMessage(), null, 4, null);
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX INFO: renamed from: e */
    public final void m57560e(@NotNull Context context, @Nullable List<PkgBundleUpdateItem> updateItems) {
        RnI18nBundleMeta rnI18nBundleMeta;
        RnI18nMeta i18n;
        Intrinsics.checkNotNullParameter(context, "context");
        m57557b(context);
        RnI18nStorage rnI18nStorage = storage;
        if (rnI18nStorage == null) {
            return;
        }
        List<PkgBundleUpdateItem> listEmptyList = updateItems == null ? CollectionsKt.emptyList() : updateItems;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listEmptyList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String biz = ((PkgBundleUpdateItem) it.next()).getBiz();
            if (biz != null) {
                if (StringsKt.isBlank(biz)) {
                    biz = null;
                }
                if (biz != null) {
                    str = biz + "-main";
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        Set<String> set = CollectionsKt.toSet(arrayList);
        if (updateItems == null) {
            updateItems = CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (PkgBundleUpdateItem pkgBundleUpdateItem : updateItems) {
            String biz2 = pkgBundleUpdateItem.getBiz();
            if (biz2 == null) {
                rnI18nBundleMeta = null;
            } else {
                String str2 = !StringsKt.isBlank(biz2) ? biz2 : null;
                if (str2 == null || (i18n = pkgBundleUpdateItem.getI18n()) == null) {
                    rnI18nBundleMeta = null;
                } else {
                    RnI18nMeta rnI18nMeta = i18n.isValid() ? i18n : null;
                    if (rnI18nMeta == null) {
                        rnI18nBundleMeta = null;
                    } else {
                        rnI18nBundleMeta = new RnI18nBundleMeta(str2, "main", pkgBundleUpdateItem.getVersion(), pkgBundleUpdateItem.getBuildNo(), rnI18nMeta);
                    }
                }
            }
            if (rnI18nBundleMeta != null) {
                arrayList2.add(rnI18nBundleMeta);
            }
        }
        rnI18nStorage.m57583g(arrayList2, set);
        C23985b.f47489a.m57877e("rnI18nManager", "calcBundle 登记 i18n=" + arrayList2.size() + ", 更新包=" + set.size());
        m57563h(arrayList2);
    }

    /* JADX INFO: renamed from: f */
    public final void m57561f(@NotNull Context context, @Nullable List<PkgBundleUpdateItem> updateItems) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            f47318a.m57560e(context, updateItems);
        } catch (Exception e11) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C23985b.m57873d(C23985b.f47489a, "rnI18nManager", "calcBundle i18n 失败，已降级 RN 原链路: " + e11.getMessage(), null, 4, null);
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m57562g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m57557b(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m57563h(List<RnI18nBundleMeta> metadata) {
        RnI18nLocaleContext rnI18nLocaleContextM57687a;
        RnI18nPrefetchTask rnI18nPrefetchTask;
        PackConfigManager packConfigManager = PackConfigManager.f47378a;
        if (!packConfigManager.m57694h() || (rnI18nLocaleContextM57687a = packConfigManager.m57687a()) == null || StringsKt.isBlank(rnI18nLocaleContextM57687a.getSiteType()) || StringsKt.isBlank(rnI18nLocaleContextM57687a.getLang()) || (rnI18nPrefetchTask = prefetchTask) == null || metadata.isEmpty()) {
            return;
        }
        C41696j.m91104d(scope, null, null, new RnI18nManager$prefetch$1(rnI18nPrefetchTask, metadata, rnI18nLocaleContextM57687a, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m57564i(@NotNull Context context, @NotNull String biz, @NotNull String entry, @NotNull String siteType, @NotNull String lang, @Nullable List<String> projectIds) {
        List<String> listProjectIds;
        Object next;
        RnI18nMeta i18n;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(lang, "lang");
        m57557b(context);
        RnI18nStorage rnI18nStorage = storage;
        if (rnI18nStorage == null) {
            return m57558c(siteType, lang);
        }
        if (!PackConfigManager.f47378a.m57694h()) {
            return m57558c(siteType, lang);
        }
        if (projectIds == null) {
            projectIds = CollectionsKt.emptyList();
        }
        if (projectIds.isEmpty()) {
            Iterator<T> it = rnI18nStorage.m57588l().iterator();
            while (true) {
                listProjectIds = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                RnI18nBundleMeta rnI18nBundleMeta = (RnI18nBundleMeta) next;
                if (Intrinsics.areEqual(rnI18nBundleMeta.getBiz(), biz) && Intrinsics.areEqual(rnI18nBundleMeta.getEntry(), entry)) {
                    break;
                }
            }
            RnI18nBundleMeta rnI18nBundleMeta2 = (RnI18nBundleMeta) next;
            if (rnI18nBundleMeta2 != null && (i18n = rnI18nBundleMeta2.getI18n()) != null) {
                listProjectIds = i18n.projectIds();
            }
            projectIds = listProjectIds == null ? CollectionsKt.emptyList() : listProjectIds;
        }
        return new RnI18nLocaleReader(rnI18nStorage).m57554e(projectIds, siteType, lang);
    }

    /* JADX INFO: renamed from: j */
    public final File m57565j(Context context) {
        return new File(C23984a.f47488a.m57864c(context), C23949c.m57603a());
    }
}
