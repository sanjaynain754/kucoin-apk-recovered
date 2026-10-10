package p472nk;

import android.content.Context;
import com.kubi.jsbridge.impl.storage.KCJSApiStorageMigrationStatus;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: nk.d */
/* JADX INFO: compiled from: KlineNewsBannerStorageMigration.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/jsbridge/impl/storage/KlineNewsBannerStorageMigration;", "", "<init>", "()V", "TAG", "", "RN_STORAGE_BIZ", "FLUTTER_LEGACY_CATEGORY", "KEY_HAS_CLOSE", "migrateIfNeeded", "", "Lcom/kubi/jsbridge/impl/storage/KCJSApiStorageMigrationResult;", "context", "Landroid/content/Context;", "JsBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineNewsBannerStorageMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineNewsBannerStorageMigration.kt\ncom/kubi/jsbridge/impl/storage/KlineNewsBannerStorageMigration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1869#2,2:47\n*S KotlinDebug\n*F\n+ 1 KlineNewsBannerStorageMigration.kt\ncom/kubi/jsbridge/impl/storage/KlineNewsBannerStorageMigration\n*L\n32#1:47,2\n*E\n"})
public final class C42847d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42847d f94914a = new C42847d();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<KCJSApiStorageMigrationResult> m93975a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<KCJSApiStorageMigrationResult> listM93962a = C42844a.f94904a.m93962a(context, CollectionsKt.listOf(new KCJSApiStorageMigrationItem("flutter_kline_news_banner", "has_close", "has_close", "flutter_kline_news_banner", true)));
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
                C44128b.m97266j("KlineNewsBannerStorageMigration", sb2.toString());
            }
        }
        return listM93962a;
    }
}
