package p472nk;

import android.content.Context;
import com.kubi.jsbridge.impl.storage.KCJSApiStorageMigrationStatus;
import com.kubi.sdk.site.C24137e;
import com.kubi.sdk.site.SiteType;
import com.kubi.user.config.UserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: nk.e */
/* JADX INFO: compiled from: LiteMarketStorageMigration.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/storage/LiteMarketStorageMigration;", "", "<init>", "()V", "TAG", "", "BIZ", "LEGACY_CATEGORY", "targetKeys", "", "migrateIfNeeded", "Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationResult;", "context", "Landroid/content/Context;", "buildMigrationItems", "Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationItem;", "legacyCategories", "legacySourceKeys", "targetKey", "currentUserId", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteMarketStorageMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteMarketStorageMigration.kt\ncom/kubi/jsbridge/impl/storage/LiteMarketStorageMigration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1869#2,2:100\n1869#2:102\n1869#2:103\n1869#2,2:104\n1870#2:106\n1870#2:107\n*S KotlinDebug\n*F\n+ 1 LiteMarketStorageMigration.kt\ncom/kubi/jsbridge/impl/storage/LiteMarketStorageMigration\n*L\n33#1:100,2\n51#1:102\n52#1:103\n53#1:104,2\n52#1:106\n51#1:107\n*E\n"})
public final class C42848e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42848e f94915a = new C42848e();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<String> f94916b = CollectionsKt.listOf((Object[]) new String[]{"lite_visitor_fav_coins", "lite_market_tab_list_key", "lite_market_watchlist_tab2_key"});

    /* JADX INFO: renamed from: a */
    public final List<KCJSApiStorageMigrationItem> m93976a() {
        ArrayList arrayList = new ArrayList();
        for (String str : m93978c()) {
            for (String str2 : f94916b) {
                Iterator<T> it = f94915a.m93979d(str2).iterator();
                while (it.hasNext()) {
                    arrayList.add(new KCJSApiStorageMigrationItem(str, (String) it.next(), str2, "lite_market", false, 16, null));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final String m93977b() {
        UserInfo userInfo = UserInfo.a;
        String strI = userInfo.i();
        if (strI.length() > 0) {
            return strI;
        }
        String strH = userInfo.h();
        if (strH == null || strH.length() == 0) {
            return null;
        }
        return strH;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m93978c() {
        List listMutableListOf = CollectionsKt.mutableListOf("flutter_lite_market");
        String currentSiteType = SiteType.INSTANCE.getCurrentSiteType();
        if (C24137e.m58087a(currentSiteType)) {
            listMutableListOf.add("flutter_lite_market.site_" + currentSiteType);
        }
        return CollectionsKt.distinct(listMutableListOf);
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m93979d(String str) {
        LinkedHashSet linkedHashSetLinkedSetOf = SetsKt.linkedSetOf(str, str + '-');
        String strM93977b = m93977b();
        if (strM93977b != null) {
            linkedHashSetLinkedSetOf.add(str + '-' + strM93977b);
        }
        return CollectionsKt.toList(linkedHashSetLinkedSetOf);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<KCJSApiStorageMigrationResult> m93980e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<KCJSApiStorageMigrationItem> listM93976a = m93976a();
        if (listM93976a.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<KCJSApiStorageMigrationResult> listM93962a = C42844a.f94904a.m93962a(context, listM93976a);
        for (KCJSApiStorageMigrationResult kCJSApiStorageMigrationResult : listM93962a) {
            if (kCJSApiStorageMigrationResult.getStatus() != KCJSApiStorageMigrationStatus.SKIPPED_EXISTING && kCJSApiStorageMigrationResult.getStatus() != KCJSApiStorageMigrationStatus.SOURCE_MISSING) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("status=");
                sb2.append(kCJSApiStorageMigrationResult.getStatus().name());
                sb2.append(", key=");
                sb2.append(kCJSApiStorageMigrationResult.getTargetKey());
                sb2.append(", biz=");
                String targetBiz = kCJSApiStorageMigrationResult.getTargetBiz();
                if (targetBiz == null) {
                    targetBiz = "";
                }
                sb2.append(targetBiz);
                sb2.append(", message=");
                String message = kCJSApiStorageMigrationResult.getMessage();
                sb2.append(message != null ? message : "");
                C44128b.m97266j("LiteMarketStorageMigration", sb2.toString());
            }
        }
        return listM93962a;
    }
}
