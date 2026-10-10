package p472nk;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.jsbridge.impl.storage.KCJSApiStorageMigrationStatus;
import com.kubi.utils.storage.StorageType;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p373jk.C40432e;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: nk.a */
/* JADX INFO: compiled from: KCJSApiStorageMigrationHelper.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007J\u0016\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J$\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationHelper;", "", "<init>", "()V", "TAG", "", "migrate", "", "Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationResult;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.ITEMS, "Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationItem;", "item", "readLegacyString", "category", "key", DbParams.KEY_CHANNEL_RESULT, "status", "Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationStatus;", "message", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiStorageMigrationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiStorageMigrationHelper.kt\ncom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1563#2:108\n1634#2,3:109\n1#3:112\n*S KotlinDebug\n*F\n+ 1 KCJSApiStorageMigrationHelper.kt\ncom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationHelper\n*L\n44#1:108\n44#1:109,3\n*E\n"})
public final class C42844a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42844a f94904a = new C42844a();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ KCJSApiStorageMigrationResult m93961e(C42844a c42844a, KCJSApiStorageMigrationItem kCJSApiStorageMigrationItem, KCJSApiStorageMigrationStatus kCJSApiStorageMigrationStatus, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        return c42844a.m93965d(kCJSApiStorageMigrationItem, kCJSApiStorageMigrationStatus, str);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KCJSApiStorageMigrationResult> m93962a(@NotNull Context context, @NotNull List<KCJSApiStorageMigrationItem> items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(f94904a.m93963b(context, (KCJSApiStorageMigrationItem) it.next()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KCJSApiStorageMigrationResult m93963b(@NotNull Context context, @NotNull KCJSApiStorageMigrationItem item) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        C40432e c40432e = C40432e.f89748a;
        String strM89075r = c40432e.m89075r(item.getTargetKey());
        if (strM89075r != null) {
            return f94904a.m93965d(item, KCJSApiStorageMigrationStatus.INVALID_ARGUMENT, strM89075r);
        }
        String strM89074q = c40432e.m89074q(item.getTargetBiz());
        if (strM89074q != null) {
            return f94904a.m93965d(item, KCJSApiStorageMigrationStatus.INVALID_ARGUMENT, strM89074q);
        }
        if (!item.getOverwrite() && c40432e.m89066e(context, item.getTargetKey(), item.getTargetBiz())) {
            return m93961e(this, item, KCJSApiStorageMigrationStatus.SKIPPED_EXISTING, null, 4, null);
        }
        String strM93964c = m93964c(item.getLegacyCategory(), item.getSourceKey());
        if (strM93964c == null || strM93964c.length() == 0) {
            return m93961e(this, item, KCJSApiStorageMigrationStatus.SOURCE_MISSING, null, 4, null);
        }
        if (!c40432e.m89072n(context, item.getTargetKey(), strM93964c, item.getTargetBiz())) {
            return m93965d(item, KCJSApiStorageMigrationStatus.FAILED, "setItem failed");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("migrated legacyCategory=");
        sb2.append(item.getLegacyCategory());
        sb2.append(", sourceKey=");
        sb2.append(item.getSourceKey());
        sb2.append(", targetKey=");
        sb2.append(item.getTargetKey());
        sb2.append(", targetBiz=");
        String targetBiz = item.getTargetBiz();
        if (targetBiz == null) {
            targetBiz = "";
        }
        sb2.append(targetBiz);
        C44128b.m97266j("KCJSApiStorageMigrationHelper", sb2.toString());
        return m93961e(this, item, KCJSApiStorageMigrationStatus.MIGRATED, null, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public final String m93964c(String str, String str2) {
        StorageId storageId = new StorageId(str, str2, StorageType.Shared, false, 8, null);
        if (!C46392a.m102320b(storageId)) {
            return null;
        }
        String strM102326h = C46392a.m102326h(storageId, "");
        if (strM102326h.length() > 0) {
            return strM102326h;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final KCJSApiStorageMigrationResult m93965d(KCJSApiStorageMigrationItem kCJSApiStorageMigrationItem, KCJSApiStorageMigrationStatus kCJSApiStorageMigrationStatus, String str) {
        return new KCJSApiStorageMigrationResult(kCJSApiStorageMigrationItem.getTargetKey(), kCJSApiStorageMigrationItem.getTargetBiz(), kCJSApiStorageMigrationStatus, str);
    }
}
