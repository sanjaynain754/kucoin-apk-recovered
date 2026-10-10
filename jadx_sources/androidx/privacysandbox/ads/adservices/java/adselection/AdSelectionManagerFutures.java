package androidx.privacysandbox.ads.adservices.java.adselection;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest;
import androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0011\u001a\u00020\u0012H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0016\u001a\u00020\u0017H'J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0019\u001a\u00020\u001aH'¨\u0006\u001d"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "", "()V", "getAdSelectionDataAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "persistAdSelectionResultAsync", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "reportEventAsync", "", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportImpressionAsync", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "selectAdsAsync", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "updateAdCounterHistogramAsync", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "Api33Ext4JavaImpl", "Companion", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AdSelectionManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
    @Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\rH\u0017J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Api33Ext4JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "mAdSelectionManager", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;)V", "getAdSelectionDataAsync", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "persistAdSelectionResultAsync", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "reportEventAsync", "", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "reportImpressionAsync", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "selectAdsAsync", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "updateAdCounterHistogramAsync", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {

        @Nullable
        private final AdSelectionManager mAdSelectionManager;

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public ListenableFuture<AdSelectionOutcome> selectAdsAsync(@NotNull AdSelectionConfig adSelectionConfig) {
            Intrinsics.checkNotNullParameter(adSelectionConfig, "adSelectionConfig");
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public ListenableFuture<GetAdSelectionDataOutcome> getAdSelectionDataAsync(@NotNull GetAdSelectionDataRequest getAdSelectionDataRequest) {
            Intrinsics.checkNotNullParameter(getAdSelectionDataRequest, "getAdSelectionDataRequest");
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new C3834x63036bbf(this, getAdSelectionDataRequest, null), 3, null), null, 1, null);
        }

        public Api33Ext4JavaImpl(@Nullable AdSelectionManager adSelectionManager) {
            this.mAdSelectionManager = adSelectionManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public ListenableFuture<AdSelectionOutcome> persistAdSelectionResultAsync(@NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest) {
            Intrinsics.checkNotNullParameter(persistAdSelectionResultRequest, "persistAdSelectionResultRequest");
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new C3835xcfbf2aea(this, persistAdSelectionResultRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> reportEventAsync(@NotNull ReportEventRequest reportEventRequest) {
            Intrinsics.checkNotNullParameter(reportEventRequest, "reportEventRequest");
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportEventAsync$1(this, reportEventRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> reportImpressionAsync(@NotNull ReportImpressionRequest reportImpressionRequest) {
            Intrinsics.checkNotNullParameter(reportImpressionRequest, "reportImpressionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new C3836x3453cbdf(this, reportImpressionRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> updateAdCounterHistogramAsync(@NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest) {
            Intrinsics.checkNotNullParameter(updateAdCounterHistogramRequest, "updateAdCounterHistogramRequest");
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new C3837x64bcb5a8(this, updateAdCounterHistogramRequest, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @NotNull
        public ListenableFuture<AdSelectionOutcome> selectAdsAsync(@NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig) {
            Intrinsics.checkNotNullParameter(adSelectionFromOutcomesConfig, "adSelectionFromOutcomesConfig");
            return CoroutineAdapterKt.asListenableFuture$default(C41696j.m91102b(C41713n0.m91125a(C41782z0.m91391a()), null, null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(this, adSelectionFromOutcomesConfig, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Companion;", "", "()V", "from", "Landroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures;", "context", "Landroid/content/Context;", "ads-adservices-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAdSelectionManagerFutures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerFutures.kt\nandroidx/privacysandbox/ads/adservices/java/adselection/AdSelectionManagerFutures$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final AdSelectionManagerFutures from(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AdSelectionManager adSelectionManagerObtain = AdSelectionManager.INSTANCE.obtain(context);
            if (adSelectionManagerObtain != null) {
                return new Api33Ext4JavaImpl(adSelectionManagerObtain);
            }
            return null;
        }
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @ExperimentalFeatures.Ext10OptIn
    @NotNull
    public abstract ListenableFuture<GetAdSelectionDataOutcome> getAdSelectionDataAsync(@NotNull GetAdSelectionDataRequest getAdSelectionDataRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @ExperimentalFeatures.Ext10OptIn
    @NotNull
    public abstract ListenableFuture<AdSelectionOutcome> persistAdSelectionResultAsync(@NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @ExperimentalFeatures.Ext8OptIn
    @NotNull
    public abstract ListenableFuture<Unit> reportEventAsync(@NotNull ReportEventRequest reportEventRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @NotNull
    public abstract ListenableFuture<Unit> reportImpressionAsync(@NotNull ReportImpressionRequest reportImpressionRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @NotNull
    public abstract ListenableFuture<AdSelectionOutcome> selectAdsAsync(@NotNull AdSelectionConfig adSelectionConfig);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @ExperimentalFeatures.Ext10OptIn
    @NotNull
    public abstract ListenableFuture<AdSelectionOutcome> selectAdsAsync(@NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @ExperimentalFeatures.Ext8OptIn
    @NotNull
    public abstract ListenableFuture<Unit> updateAdCounterHistogramAsync(@NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest);

    @JvmStatic
    @Nullable
    public static final AdSelectionManagerFutures from(@NotNull Context context) {
        return INSTANCE.from(context);
    }
}
