package dj;

import com.kubi.p110rn.Constants;
import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p294gz.C38058b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: dj.c */
/* JADX INFO: compiled from: HomeKVEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001a\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0000¨\u0006\t"}, m90084d2 = {"homeCardOrderConfigCacheTimeRefresh", "", "homeCardOrderConfigCacheIsValid", "", "setAppGuideAlertDone", Constants.BIZ, "", "bindUser", "isAppGuideAlertDone", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeKVEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeKVEx.kt\ncom/kubi/home/common/ex/HomeKVExKt\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 4 StorageId.kt\ncom/kubi/utils/storage/StorageId\n*L\n1#1,46:1\n75#2,2:47\n84#2:49\n126#2,2:52\n136#2:56\n109#3:50\n109#3:54\n46#4:51\n46#4:55\n*S KotlinDebug\n*F\n+ 1 HomeKVEx.kt\ncom/kubi/home/common/ex/HomeKVExKt\n*L\n14#1:47,2\n21#1:49\n33#1:52,2\n44#1:56\n33#1:50\n44#1:54\n33#1:51\n44#1:55\n*E\n"})
public final class C36718c {
    /* JADX INFO: renamed from: a */
    public static final boolean m82250a() {
        long jM102324f = C46392a.m102324f(C36719d.f79632a.m82271p(), -1L);
        return jM102324f > 0 && System.currentTimeMillis() - jM102324f <= (C38058b.f85672a.m85930b() * ((long) 60)) * 1000;
    }

    /* JADX INFO: renamed from: b */
    public static final void m82251b() {
        C46392a.m102330m(C36719d.f79632a.m82271p(), System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m82252c(@NotNull String biz, boolean z11) {
        String str;
        Intrinsics.checkNotNullParameter(biz, "biz");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(biz);
        if (z11) {
            str = '-' + UserInfo.a.h();
        } else {
            str = "";
        }
        sb2.append(str);
        String string = sb2.toString();
        StorageId<Boolean> storageIdM82256a = C36719d.f79632a.m82256a();
        return C46392a.m102322d(new StorageId(storageIdM82256a.getCategory(), storageIdM82256a.getKey() + string, storageIdM82256a.getStorageType(), storageIdM82256a.getSupportLegacy()), false);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m82253d(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m82252c(str, z11);
    }

    /* JADX INFO: renamed from: e */
    public static final void m82254e(@NotNull String biz, boolean z11) {
        String str;
        Intrinsics.checkNotNullParameter(biz, "biz");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(biz);
        if (z11) {
            str = '-' + UserInfo.a.h();
        } else {
            str = "";
        }
        sb2.append(str);
        String string = sb2.toString();
        StorageId<Boolean> storageIdM82256a = C36719d.f79632a.m82256a();
        C46392a.m102328k(new StorageId(storageIdM82256a.getCategory(), storageIdM82256a.getKey() + string, storageIdM82256a.getStorageType(), storageIdM82256a.getSupportLegacy()), true);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m82255f(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        m82254e(str, z11);
    }
}
