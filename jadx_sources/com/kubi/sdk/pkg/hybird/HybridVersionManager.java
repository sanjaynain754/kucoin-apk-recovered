package com.kubi.sdk.pkg.hybird;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.util.C23984a;
import com.kubi.sdk.pkg.util.PackageException;
import com.kubi.utils.storage.StorageType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: compiled from: HybridVersionManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0003R'\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lcom/kubi/sdk/pkg/hybird/HybridVersionManager;", "", "<init>", "()V", "", "name", "d", "(Ljava/lang/String;)Ljava/lang/String;", "version", "", "k", "(Ljava/lang/String;Ljava/lang/String;)V", "", "f", "(Ljava/lang/String;)Z", "i", "(Ljava/lang/String;)V", "j", CmcdData.Factory.STREAMING_FORMAT_HLS, "Landroid/content/Context;", "context", "e", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "b", "(Landroid/content/Context;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "g", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;", "Lkotlin/Lazy;", "c", "()Ljava/util/concurrent/ConcurrentHashMap;", "pkgInfoMap", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHybridVersionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridVersionManager.kt\ncom/kubi/sdk/pkg/hybird/HybridVersionManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 4 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,139:1\n1855#2,2:140\n1855#2:149\n1856#2:151\n62#3:142\n62#3:145\n62#3:150\n22#4,2:143\n22#4,2:152\n4117#5:146\n4217#5,2:147\n*S KotlinDebug\n*F\n+ 1 HybridVersionManager.kt\ncom/kubi/sdk/pkg/hybird/HybridVersionManager\n*L\n71#1:140,2\n117#1:149\n117#1:151\n90#1:142\n113#1:145\n119#1:150\n97#1:143,2\n136#1:152,2\n115#1:146\n115#1:147,2\n*E\n"})
public final class HybridVersionManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HybridVersionManager f47398a = new HybridVersionManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy pkgInfoMap = LazyKt.lazy(new Function0<ConcurrentHashMap<String, OfflinePkgInfo>>() { // from class: com.kubi.sdk.pkg.hybird.HybridVersionManager$pkgInfoMap$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ConcurrentHashMap<String, OfflinePkgInfo> invoke() {
            List<OfflinePkgInfo> packages;
            ConcurrentHashMap<String, OfflinePkgInfo> concurrentHashMap = new ConcurrentHashMap<>();
            C46396e c46396e = C46396e.f104049a;
            OfflinePkgInfoMemento offlinePkgInfoMemento = (OfflinePkgInfoMemento) C46392a.f104043a.m102336j(new StorageId("hybrid", "hybrid_version_list", StorageType.Shared, true), OfflinePkgInfoMemento.class, null);
            if (offlinePkgInfoMemento != null && (packages = offlinePkgInfoMemento.getPackages()) != null) {
                for (OfflinePkgInfo offlinePkgInfo : packages) {
                    concurrentHashMap.put(offlinePkgInfo.getName(), offlinePkgInfo);
                }
            }
            return concurrentHashMap;
        }
    });

    /* JADX INFO: renamed from: b */
    public final void m57742b(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            OfflinePkgInfo offlinePkgInfo = m57743c().get(name);
            if (offlinePkgInfo == null) {
                return;
            }
            String oldVersion = offlinePkgInfo.getOldVersion();
            String version = offlinePkgInfo.getVersion();
            String strM57795e = TaskCommonKt.m57795e(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM57795e);
            String str = File.separator;
            sb2.append(str);
            sb2.append("hybrid_app");
            String str2 = sb2.toString() + str + name;
            String[] strArrM57866e = C23984a.f47488a.m57866e(str2);
            ArrayList arrayList = new ArrayList();
            for (String str3 : strArrM57866e) {
                if (!Intrinsics.areEqual(str3, oldVersion) && !Intrinsics.areEqual(str3, version)) {
                    arrayList.add(str3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    String str4 = str2 + File.separator + ((String) it.next());
                    C43840a.m96548b(name + " 清理不用的目录 " + str4, "package_deploy");
                    C23984a.f47488a.m57863b(new File(str4));
                } catch (Exception unused) {
                    C43840a.m96548b(name + " 清理文件失败", "package_deploy");
                }
            }
        } catch (Exception unused2) {
            C43840a.m96548b(name + " 清理文件失败", "package_deploy");
        }
    }

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap<String, OfflinePkgInfo> m57743c() {
        return (ConcurrentHashMap) pkgInfoMap.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m57744d(@NotNull String name) {
        String version;
        Intrinsics.checkNotNullParameter(name, "name");
        OfflinePkgInfo offlinePkgInfo = m57743c().get(name);
        return (offlinePkgInfo == null || (version = offlinePkgInfo.getVersion()) == null) ? "" : version;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m57745e(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        String strM57744d = m57744d(name);
        if (strM57744d.length() == 0) {
            return "";
        }
        try {
            if (C23984a.f47488a.m57865d(TaskCommonKt.m57796f(TaskCommonKt.m57795e(context) + File.separator + "hybrid_app", name, strM57744d))) {
                return strM57744d;
            }
            C43840a.m96549c(name + ' ' + strM57744d + " 版本文件丢失", null, 2, null);
            return "";
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "HybridVersionManager", false, null, 8, null), null, 2, null);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57746f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        OfflinePkgInfo offlinePkgInfo = m57743c().get(name);
        if (offlinePkgInfo == null) {
            return true;
        }
        return !offlinePkgInfo.getIndexEnable();
    }

    /* JADX INFO: renamed from: h */
    public final void m57748h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        OfflinePkgInfo offlinePkgInfo = m57743c().get(name);
        if (offlinePkgInfo == null) {
            return;
        }
        offlinePkgInfo.setIndexEnable(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m57749i(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        OfflinePkgInfo offlinePkgInfo = m57743c().get(name);
        if (offlinePkgInfo == null) {
            return;
        }
        offlinePkgInfo.setIndexEnable(false);
    }

    /* JADX INFO: renamed from: k */
    public final void m57751k(@NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        OfflinePkgInfo offlinePkgInfo = m57743c().get(name);
        if (offlinePkgInfo == null) {
            m57743c().put(name, new OfflinePkgInfo(name, version, null, true, 4, null));
        } else {
            offlinePkgInfo.setNewVersion(version);
        }
        m57747g();
    }

    /* JADX INFO: renamed from: a */
    public final void m57741a() {
        try {
            m57743c().clear();
            C46396e.m102360q("hybrid", "hybrid_version_list");
        } catch (Exception e11) {
            C43846g.m96568c(new PackageException(e11, "package_deploy", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m57747g() {
        Collection<OfflinePkgInfo> collectionValues = m57743c().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "pkgInfoMap.values");
        C46396e.m102357n("hybrid", "hybrid_version_list", new OfflinePkgInfoMemento(CollectionsKt.toList(collectionValues)));
    }

    /* JADX INFO: renamed from: j */
    public final void m57750j() {
        Collection<OfflinePkgInfo> collectionValues = m57743c().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "pkgInfoMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((OfflinePkgInfo) it.next()).setIndexEnable(false);
        }
    }
}
