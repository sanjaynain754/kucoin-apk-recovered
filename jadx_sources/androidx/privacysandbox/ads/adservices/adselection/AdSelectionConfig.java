package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p708w.C45669a;
import p708w.C45671c;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdSelectionConfig.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 52\u00020\u0001:\u00015BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0012\u001a\u00020!H\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010/R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b4\u0010)¨\u00066"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "seller", "Landroid/net/Uri;", "decisionLogicUri", "", "customAudienceBuyers", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "adSelectionSignals", "sellerSignals", "", "perBuyerSignals", "trustedScoringSignalsUri", "<init>", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Landroid/net/Uri;Ljava/util/List;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Ljava/util/Map;Landroid/net/Uri;)V", "", "Lw/c;", "convertToAdServices", "(Ljava/util/List;)Ljava/util/List;", "", "Lw/a;", "(Ljava/util/Map;)Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/adselection/AdSelectionConfig;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/adselection/AdSelectionConfig;", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "Landroid/net/Uri;", "getDecisionLogicUri", "()Landroid/net/Uri;", "Ljava/util/List;", "getCustomAudienceBuyers", "()Ljava/util/List;", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "getAdSelectionSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "getSellerSignals", "Ljava/util/Map;", "getPerBuyerSignals", "()Ljava/util/Map;", "getTrustedScoringSignalsUri", "Companion", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"ClassVerificationFailure"})
public final class AdSelectionConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AdSelectionConfig EMPTY;

    @NotNull
    private final AdSelectionSignals adSelectionSignals;

    @NotNull
    private final List<AdTechIdentifier> customAudienceBuyers;

    @NotNull
    private final Uri decisionLogicUri;

    @NotNull
    private final Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals;

    @NotNull
    private final AdTechIdentifier seller;

    @NotNull
    private final AdSelectionSignals sellerSignals;

    @NotNull
    private final Uri trustedScoringSignalsUri;

    /* JADX INFO: compiled from: AdSelectionConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig$Companion;", "", "()V", "EMPTY", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "getEMPTY", "()Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final AdSelectionConfig getEMPTY() {
            return AdSelectionConfig.EMPTY;
        }
    }

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private final List<C45671c> convertToAdServices(List<AdTechIdentifier> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AdTechIdentifier> it = list.iterator();
        while (it.hasNext()) {
            it.next().convertToAdServices$ads_adservices_release();
            arrayList.add(null);
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) other;
        return Intrinsics.areEqual(this.seller, adSelectionConfig.seller) && Intrinsics.areEqual(this.decisionLogicUri, adSelectionConfig.decisionLogicUri) && Intrinsics.areEqual(this.customAudienceBuyers, adSelectionConfig.customAudienceBuyers) && Intrinsics.areEqual(this.adSelectionSignals, adSelectionConfig.adSelectionSignals) && Intrinsics.areEqual(this.sellerSignals, adSelectionConfig.sellerSignals) && Intrinsics.areEqual(this.perBuyerSignals, adSelectionConfig.perBuyerSignals) && Intrinsics.areEqual(this.trustedScoringSignalsUri, adSelectionConfig.trustedScoringSignalsUri);
    }

    static {
        AdTechIdentifier adTechIdentifier = new AdTechIdentifier("");
        Uri EMPTY2 = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
        List listEmptyList = CollectionsKt.emptyList();
        AdSelectionSignals adSelectionSignals = new AdSelectionSignals("");
        AdSelectionSignals adSelectionSignals2 = new AdSelectionSignals("");
        Map mapEmptyMap = MapsKt.emptyMap();
        Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
        EMPTY = new AdSelectionConfig(adTechIdentifier, EMPTY2, listEmptyList, adSelectionSignals, adSelectionSignals2, mapEmptyMap, EMPTY2);
    }

    @NotNull
    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    @NotNull
    public final List<AdTechIdentifier> getCustomAudienceBuyers() {
        return this.customAudienceBuyers;
    }

    @NotNull
    public final Uri getDecisionLogicUri() {
        return this.decisionLogicUri;
    }

    @NotNull
    public final Map<AdTechIdentifier, AdSelectionSignals> getPerBuyerSignals() {
        return this.perBuyerSignals;
    }

    @NotNull
    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    @NotNull
    public final AdSelectionSignals getSellerSignals() {
        return this.sellerSignals;
    }

    @NotNull
    public final Uri getTrustedScoringSignalsUri() {
        return this.trustedScoringSignalsUri;
    }

    public int hashCode() {
        return (((((((((((this.seller.hashCode() * 31) + this.decisionLogicUri.hashCode()) * 31) + this.customAudienceBuyers.hashCode()) * 31) + this.adSelectionSignals.hashCode()) * 31) + this.sellerSignals.hashCode()) * 31) + this.perBuyerSignals.hashCode()) * 31) + this.trustedScoringSignalsUri.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionConfig: seller=" + this.seller + ", decisionLogicUri='" + this.decisionLogicUri + "', customAudienceBuyers=" + this.customAudienceBuyers + ", adSelectionSignals=" + this.adSelectionSignals + ", sellerSignals=" + this.sellerSignals + ", perBuyerSignals=" + this.perBuyerSignals + ", trustedScoringSignalsUri=" + this.trustedScoringSignalsUri;
    }

    public AdSelectionConfig(@NotNull AdTechIdentifier seller, @NotNull Uri decisionLogicUri, @NotNull List<AdTechIdentifier> customAudienceBuyers, @NotNull AdSelectionSignals adSelectionSignals, @NotNull AdSelectionSignals sellerSignals, @NotNull Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals, @NotNull Uri trustedScoringSignalsUri) {
        Intrinsics.checkNotNullParameter(seller, "seller");
        Intrinsics.checkNotNullParameter(decisionLogicUri, "decisionLogicUri");
        Intrinsics.checkNotNullParameter(customAudienceBuyers, "customAudienceBuyers");
        Intrinsics.checkNotNullParameter(adSelectionSignals, "adSelectionSignals");
        Intrinsics.checkNotNullParameter(sellerSignals, "sellerSignals");
        Intrinsics.checkNotNullParameter(perBuyerSignals, "perBuyerSignals");
        Intrinsics.checkNotNullParameter(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.seller = seller;
        this.decisionLogicUri = decisionLogicUri;
        this.customAudienceBuyers = customAudienceBuyers;
        this.adSelectionSignals = adSelectionSignals;
        this.sellerSignals = sellerSignals;
        this.perBuyerSignals = perBuyerSignals;
        this.trustedScoringSignalsUri = trustedScoringSignalsUri;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final android.adservices.adselection.AdSelectionConfig convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.AdSelectionConfig.Builder builderM3617a = C3767i.m3617a();
        this.adSelectionSignals.convertToAdServices$ads_adservices_release();
        android.adservices.adselection.AdSelectionConfig.Builder decisionLogicUri = builderM3617a.setAdSelectionSignals(null).setCustomAudienceBuyers(convertToAdServices(this.customAudienceBuyers)).setDecisionLogicUri(this.decisionLogicUri);
        this.seller.convertToAdServices$ads_adservices_release();
        android.adservices.adselection.AdSelectionConfig.Builder perBuyerSignals = decisionLogicUri.setSeller(null).setPerBuyerSignals(convertToAdServices(this.perBuyerSignals));
        this.sellerSignals.convertToAdServices$ads_adservices_release();
        android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = perBuyerSignals.setSellerSignals(null).setTrustedScoringSignalsUri(this.trustedScoringSignalsUri).build();
        Intrinsics.checkNotNullExpressionValue(adSelectionConfigBuild, "Builder()\n            .s…Uri)\n            .build()");
        return adSelectionConfigBuild;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private final Map<C45671c, C45669a> convertToAdServices(Map<AdTechIdentifier, AdSelectionSignals> map) {
        HashMap map2 = new HashMap();
        for (AdTechIdentifier adTechIdentifier : map.keySet()) {
            adTechIdentifier.convertToAdServices$ads_adservices_release();
            AdSelectionSignals adSelectionSignals = map.get(adTechIdentifier);
            if (adSelectionSignals != null) {
                adSelectionSignals.convertToAdServices$ads_adservices_release();
            }
            map2.put(null, null);
        }
        return map2;
    }
}
