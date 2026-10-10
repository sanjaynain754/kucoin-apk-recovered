package androidx.privacysandbox.ads.adservices.java.adid;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adid.AdId;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AdIdManagerFutures.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¨\u0006\b"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures;", "", "()V", "getAdIdAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "Api33Ext4JavaImpl", "Companion", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AdIdManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AdIdManagerFutures.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures;", "mAdIdManager", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "(Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;)V", "getAdIdAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api33Ext4JavaImpl extends AdIdManagerFutures {

        @NotNull
        private final AdIdManager mAdIdManager;

        public Api33Ext4JavaImpl(@NotNull AdIdManager mAdIdManager) {
            Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
            this.mAdIdManager = mAdIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        @DoNotInline
        @NotNull
        public ListenableFuture<AdId> getAdIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AdIdManagerFutures.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures$Companion;", "", "()V", "from", "Landroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures;", "context", "Landroid/content/Context;", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAdIdManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adid/AdIdManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final AdIdManagerFutures from(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AdIdManager adIdManagerObtain = AdIdManager.INSTANCE.obtain(context);
            if (adIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(adIdManagerObtain);
            }
            return null;
        }
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    @NotNull
    public abstract ListenableFuture<AdId> getAdIdAsync();

    @JvmStatic
    @Nullable
    public static final AdIdManagerFutures from(@NotNull Context context) {
        return INSTANCE.from(context);
    }
}
