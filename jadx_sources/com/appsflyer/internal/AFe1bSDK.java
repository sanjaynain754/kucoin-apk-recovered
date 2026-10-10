package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\r\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\r\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0019J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u001b*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u000e\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0013\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u001b\u0010\r\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010\tR\u0014\u0010 \u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0015\u0010#\u001a\u00020\u00148BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b*\u0010&"}, m90084d2 = {"Lcom/appsflyer/internal/AFe1bSDK;", "Lcom/appsflyer/internal/AFe1mSDK;", "Lcom/appsflyer/internal/AFh1rSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;)V", "", "copydefault", "()Z", "", "getMediationNetwork", "(I)Z", "getCurrencyIso4217Code", "getMonetizationNetwork", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFe1bSDK$AFa1tSDK;", "p1", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1bSDK$AFa1tSDK;)Z", "AFAdRevenueData", "", "()J", "Lcom/appsflyer/internal/AFe1qSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFe1qSDK;", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1rSDK;Ljava/lang/String;)V", "component1", "Lcom/appsflyer/internal/AFh1rSDK;", "Lcom/appsflyer/internal/AFc1fSDK;", "component3", "Lcom/appsflyer/internal/AFc1fSDK;", "Lcom/appsflyer/internal/AFc1kSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFc1kSDK;", "equals", "Lkotlin/Lazy;", "Lcom/appsflyer/internal/AFc1iSDK;", "component4", "Lcom/appsflyer/internal/AFc1iSDK;", "component2", "AFa1ySDK", "AFa1tSDK"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFetchAdvertisingIdTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n39#2:397\n1#3:398\n*S KotlinDebug\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n*L\n202#1:397\n*E\n"})
public final class AFe1bSDK extends AFe1mSDK<AdvertisingIdData> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final AFc1kSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final AdvertisingIdData getRevenue;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final Lazy areAllFieldsValid;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFc1fSDK getMediationNetwork;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    private final AFc1iSDK component3;

    /* JADX INFO: renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final Lazy getCurrencyIso4217Code;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1bSDK$AFa1tSDK, reason: from toString */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, m90084d2 = {"Lcom/appsflyer/internal/AFe1bSDK$AFa1tSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1bSDK$AFa1tSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class FetchGaidData {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public FetchGaidData() {
            this(null, null, false, null, 15, null);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchGaidData)) {
                return false;
            }
            FetchGaidData fetchGaidData = (FetchGaidData) other;
            return Intrinsics.areEqual(this.advertisingId, fetchGaidData.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, fetchGaidData.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == fetchGaidData.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, fetchGaidData.gaidError);
        }

        public FetchGaidData(@Nullable String str, @Nullable Boolean bool, boolean z11, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z11;
            this.gaidError = gaidError;
        }

        public static /* synthetic */ FetchGaidData copy$default(FetchGaidData fetchGaidData, String str, Boolean bool, boolean z11, StringBuilder sb2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fetchGaidData.advertisingId;
            }
            if ((i11 & 2) != 0) {
                bool = fetchGaidData.isLimitAdTrackingEnabled;
            }
            if ((i11 & 4) != 0) {
                z11 = fetchGaidData.advertisingIdWithGps;
            }
            if ((i11 & 8) != 0) {
                sb2 = fetchGaidData.gaidError;
            }
            return fetchGaidData.copy(str, bool, z11, sb2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final FetchGaidData copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new FetchGaidData(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        @JvmName(name = "getAdvertisingId")
        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @JvmName(name = "getAdvertisingIdWithGps")
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @JvmName(name = "getGaidError")
        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v8 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z11 = this.advertisingIdWithGps;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            return ((iHashCode2 + r11) * 31) + this.gaidError.hashCode();
        }

        @JvmName(name = "isLimitAdTrackingEnabled")
        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @JvmName(name = "setAdvertisingId")
        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        @JvmName(name = "setAdvertisingIdWithGps")
        public final void setAdvertisingIdWithGps(boolean z11) {
            this.advertisingIdWithGps = z11;
        }

        @JvmName(name = "setLimitAdTrackingEnabled")
        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public /* synthetic */ FetchGaidData(String str, Boolean bool, boolean z11, StringBuilder sb2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, m90084d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ FetchGaidData $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1zSDK(FetchGaidData fetchGaidData, CountDownLatch countDownLatch) {
            this.$fetchGaidData = fetchGaidData;
            this.$latch = countDownLatch;
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }

        public final void onError(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFg1bSDK.w$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }
    }

    private final boolean getCurrencyIso4217Code(Context p11, FetchGaidData p12) throws IllegalStateException {
        try {
            AFb1uSDK.AFa1tSDK aFa1tSDKAFAdRevenueData = AFb1uSDK.AFAdRevenueData(p11);
            p12.setAdvertisingId(aFa1tSDKAFAdRevenueData.getRevenue);
            p12.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1tSDKAFAdRevenueData.getMediationNetwork()));
            String advertisingId = p12.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p12.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.INSTANCE != null) {
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK aFh1ySDK = AFh1ySDK.ADVERTISING_ID;
            AFg1bSDK.e$default(aFLogger, aFh1ySDK, "Failed to fetch GAID: " + th2.getMessage(), th2, true, false, false, false, 64, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th2.toString();
            }
            AFg1bSDK.i$default(aFLogger, aFh1ySDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    private final boolean getMonetizationNetwork(int p11) {
        return getCurrencyIso4217Code(p11);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1bSDK(@NotNull AFd1zSDK aFd1zSDK) {
        super(AFe1oSDK.FETCH_ADVERTISING_ID, new AFe1oSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        AFc1fSDK aFc1fSDKAFInAppEventParameterName = aFd1zSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(aFc1fSDKAFInAppEventParameterName, "");
        this.getMediationNetwork = aFc1fSDKAFInAppEventParameterName;
        AFc1kSDK currencyIso4217Code = aFd1zSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        this.getMonetizationNetwork = currencyIso4217Code;
        AFc1iSDK aFc1iSDKMo5949v = aFd1zSDK.mo5949v();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKMo5949v, "");
        this.component3 = aFc1iSDKMo5949v;
        this.getRevenue = new AdvertisingIdData(null, null, null, null, null, null, null, null, 255, null);
        this.areAllFieldsValid = LazyKt.lazy(new Function0<Long>() { // from class: com.appsflyer.internal.AFe1bSDK.5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                Long longOrNull;
                String currencyIso4217Code2 = AFe1bSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((currencyIso4217Code2 == null || (longOrNull = StringsKt.toLongOrNull(currencyIso4217Code2)) == null) ? 1000L : longOrNull.longValue());
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFe1bSDK.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFe1bSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    private static int AFAdRevenueData(Context p11) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p11);
        } catch (Throwable th2) {
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th2, false, false, false, false, 96, null);
            return -1;
        }
    }

    @JvmName(name = "areAllFieldsValid")
    private static boolean areAllFieldsValid() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            if (th2 instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th2.getMessage();
            }
            AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, str, th2, true, false, false, false, 112, null);
            return false;
        }
    }

    @JvmName(name = "component3")
    private final boolean component3() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
    private final boolean copydefault() {
        boolean z11 = false;
        for (int i11 = 2; i11 > 0; i11--) {
            if (component3() && getMonetizationNetwork(i11)) {
                AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                if (getMediationNetwork(i11)) {
                    AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
            }
            z11 = true;
            if (!z11) {
                break;
                break;
            }
        }
        this.component3.component3 = this.getRevenue;
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    private final boolean getMediationNetwork(int p11) {
        boolean z11;
        AFg1bSDK.i$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        FetchGaidData fetchGaidData = new FetchGaidData(null, null, false, null, 15, null);
        Context context = this.getMediationNetwork.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        int iAFAdRevenueData = AFAdRevenueData(context);
        Context context2 = this.getMediationNetwork.getMonetizationNetwork;
        Intrinsics.checkNotNull(context2);
        if (!AFAdRevenueData(context2, fetchGaidData)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.getMediationNetwork.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                if (getCurrencyIso4217Code(context3, fetchGaidData)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            String string = fetchGaidData.getGaidError().toString();
            if (string != null && !StringsKt.isBlank(string)) {
                string = iAFAdRevenueData + ": " + StringsKt.trim((CharSequence) string).toString();
            }
            getMonetizationNetwork(this.getRevenue, string);
            if (!z11) {
                return false;
            }
        }
        AdvertisingIdData advertisingIdData = this.getRevenue;
        advertisingIdData.advertisingId = fetchGaidData.getAdvertisingId();
        advertisingIdData.isLimited = fetchGaidData.isLimitAdTrackingEnabled();
        Boolean boolIsLimitAdTrackingEnabled = fetchGaidData.isLimitAdTrackingEnabled();
        advertisingIdData.isEnabled = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
        advertisingIdData.isGaidWithGps = Boolean.valueOf(fetchGaidData.getAdvertisingIdWithGps());
        advertisingIdData.isGaidWithSamsungCloudDev = Boolean.FALSE;
        advertisingIdData.retry = Boolean.valueOf(p11 != 2);
        return true;
    }

    private static void getMonetizationNetwork(AdvertisingIdData advertisingIdData, String str) {
        if (str == null) {
            return;
        }
        String str2 = advertisingIdData.gaidError;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        advertisingIdData.gaidError = str;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    @VisibleForTesting(otherwise = 4)
    @NotNull
    public final AFe1qSDK getRevenue() {
        if (this.component3.getCurrencyIso4217Code()) {
            AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1qSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(copydefault());
        Boolean bool = Boolean.FALSE;
        AFe1qSDK aFe1qSDK = CollectionsKt.listOf((Object[]) new Boolean[]{boolValueOf, bool, bool}).contains(Boolean.TRUE) ? AFe1qSDK.SUCCESS : AFe1qSDK.FAILURE;
        AFc1iSDK aFc1iSDK = this.component3;
        AFd1eSDK aFd1eSDK = new AFd1eSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFg1bSDK.v$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1eSDK.getRevenue + "ms", false, 4, null);
        aFc1iSDK.getRevenue(aFd1eSDK);
        return aFe1qSDK;
    }

    private final boolean AFAdRevenueData(Context p11, FetchGaidData p12) throws IllegalStateException {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p11);
            if (advertisingIdInfo != null) {
                p12.setAdvertisingId(advertisingIdInfo.getId());
                p12.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p12.setAdvertisingIdWithGps(true);
                String advertisingId = p12.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p12.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK aFh1ySDK = AFh1ySDK.ADVERTISING_ID;
            AFg1bSDK.e$default(aFLogger, aFh1ySDK, "Google Play Services is missing " + th2.getMessage(), th2, false, false, false, false, 88, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1bSDK.i$default(aFLogger, aFh1ySDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    @RequiresApi(23)
    private final boolean getCurrencyIso4217Code(int p11) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK aFh1ySDK = AFh1ySDK.ADVERTISING_ID;
        AFg1bSDK.i$default(aFLogger, aFh1ySDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (areAllFieldsValid()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getMediationNetwork.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                FetchGaidData fetchGaidData = new FetchGaidData(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getMediationNetwork.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.listOf("gaid"), new AFa1zSDK(fetchGaidData, countDownLatch));
                    countDownLatch.await(((Number) this.areAllFieldsValid.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (fetchGaidData.getGaidError().length() > 0) {
                        getMonetizationNetwork(this.getRevenue, fetchGaidData.getGaidError().toString());
                    }
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th2 instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th2.getMessage();
                        }
                        AFg1bSDK.e$default(AFLogger.INSTANCE, AFh1ySDK.ADVERTISING_ID, str, th2, true, false, false, false, 112, null);
                        StringBuilder gaidError = fetchGaidData.getGaidError();
                        gaidError.append(th2.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (fetchGaidData.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th3) {
                        if (fetchGaidData.getGaidError().length() > 0) {
                            getMonetizationNetwork(this.getRevenue, fetchGaidData.getGaidError().toString());
                        }
                        throw th3;
                    }
                }
                String advertisingId = fetchGaidData.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AdvertisingIdData advertisingIdData = this.getRevenue;
                advertisingIdData.advertisingId = fetchGaidData.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                advertisingIdData.isLimited = bool;
                Boolean bool2 = Boolean.TRUE;
                advertisingIdData.isEnabled = bool2;
                advertisingIdData.isGaidWithGps = bool;
                advertisingIdData.isGaidWithSamsungCloudDev = bool2;
                advertisingIdData.retry = Boolean.valueOf(p11 != 2);
                return true;
            }
        }
        AFg1bSDK.i$default(aFLogger, aFh1ySDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    @VisibleForTesting(otherwise = 4)
    public final long getCurrencyIso4217Code() {
        return ((Number) this.areAllFieldsValid.getValue()).longValue();
    }
}
