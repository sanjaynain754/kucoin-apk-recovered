package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdData;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.time.Instant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CustomAudience.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001*Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006+"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "name", "", "dailyUpdateUri", "Landroid/net/Uri;", "biddingLogicUri", "ads", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "activationTime", "Ljava/time/Instant;", "expirationTime", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "trustedBiddingSignals", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Ljava/time/Instant;Ljava/time/Instant;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;)V", "getActivationTime", "()Ljava/time/Instant;", "getAds", "()Ljava/util/List;", "getBiddingLogicUri", "()Landroid/net/Uri;", "getBuyer", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getDailyUpdateUri", "getExpirationTime", "getName", "()Ljava/lang/String;", "getTrustedBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "getUserBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "equals", "", "other", "hashCode", "", "toString", "Builder", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CustomAudience {

    @Nullable
    private final Instant activationTime;

    @NotNull
    private final List<AdData> ads;

    @NotNull
    private final Uri biddingLogicUri;

    @NotNull
    private final AdTechIdentifier buyer;

    @NotNull
    private final Uri dailyUpdateUri;

    @Nullable
    private final Instant expirationTime;

    @NotNull
    private final String name;

    @Nullable
    private final TrustedBiddingData trustedBiddingSignals;

    @Nullable
    private final AdSelectionSignals userBiddingSignals;

    /* JADX INFO: compiled from: CustomAudience.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "name", "", "dailyUpdateUri", "Landroid/net/Uri;", "biddingLogicUri", "ads", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)V", "activationTime", "Ljava/time/Instant;", "expirationTime", "trustedBiddingData", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "build", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "setActivationTime", "setAds", "setBiddingLogicUri", "setBuyer", "setDailyUpdateUri", "setExpirationTime", "setName", "setTrustedBiddingData", "trustedBiddingSignals", "setUserBiddingSignals", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCustomAudience.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudience.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
    public static final class Builder {

        @Nullable
        private Instant activationTime;

        @NotNull
        private List<AdData> ads;

        @NotNull
        private Uri biddingLogicUri;

        @NotNull
        private AdTechIdentifier buyer;

        @NotNull
        private Uri dailyUpdateUri;

        @Nullable
        private Instant expirationTime;

        @NotNull
        private String name;

        @Nullable
        private TrustedBiddingData trustedBiddingData;

        @Nullable
        private AdSelectionSignals userBiddingSignals;

        public Builder(@NotNull AdTechIdentifier buyer, @NotNull String name, @NotNull Uri dailyUpdateUri, @NotNull Uri biddingLogicUri, @NotNull List<AdData> ads) {
            Intrinsics.checkNotNullParameter(buyer, "buyer");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
            Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
            Intrinsics.checkNotNullParameter(ads, "ads");
            this.buyer = buyer;
            this.name = name;
            this.dailyUpdateUri = dailyUpdateUri;
            this.biddingLogicUri = biddingLogicUri;
            this.ads = ads;
        }

        @NotNull
        public final CustomAudience build() {
            return new CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }

        @NotNull
        public final Builder setActivationTime(@NotNull Instant activationTime) {
            Intrinsics.checkNotNullParameter(activationTime, "activationTime");
            this.activationTime = activationTime;
            return this;
        }

        @NotNull
        public final Builder setAds(@NotNull List<AdData> ads) {
            Intrinsics.checkNotNullParameter(ads, "ads");
            this.ads = ads;
            return this;
        }

        @NotNull
        public final Builder setBiddingLogicUri(@NotNull Uri biddingLogicUri) {
            Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
            this.biddingLogicUri = biddingLogicUri;
            return this;
        }

        @NotNull
        public final Builder setBuyer(@NotNull AdTechIdentifier buyer) {
            Intrinsics.checkNotNullParameter(buyer, "buyer");
            this.buyer = buyer;
            return this;
        }

        @NotNull
        public final Builder setDailyUpdateUri(@NotNull Uri dailyUpdateUri) {
            Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
            this.dailyUpdateUri = dailyUpdateUri;
            return this;
        }

        @NotNull
        public final Builder setExpirationTime(@NotNull Instant expirationTime) {
            Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
            this.expirationTime = expirationTime;
            return this;
        }

        @NotNull
        public final Builder setName(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            return this;
        }

        @NotNull
        public final Builder setTrustedBiddingData(@NotNull TrustedBiddingData trustedBiddingSignals) {
            Intrinsics.checkNotNullParameter(trustedBiddingSignals, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingSignals;
            return this;
        }

        @NotNull
        public final Builder setUserBiddingSignals(@NotNull AdSelectionSignals userBiddingSignals) {
            Intrinsics.checkNotNullParameter(userBiddingSignals, "userBiddingSignals");
            this.userBiddingSignals = userBiddingSignals;
            return this;
        }
    }

    public CustomAudience(@NotNull AdTechIdentifier buyer, @NotNull String name, @NotNull Uri dailyUpdateUri, @NotNull Uri biddingLogicUri, @NotNull List<AdData> ads, @Nullable Instant instant, @Nullable Instant instant2, @Nullable AdSelectionSignals adSelectionSignals, @Nullable TrustedBiddingData trustedBiddingData) {
        Intrinsics.checkNotNullParameter(buyer, "buyer");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
        Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
        Intrinsics.checkNotNullParameter(ads, "ads");
        this.buyer = buyer;
        this.name = name;
        this.dailyUpdateUri = dailyUpdateUri;
        this.biddingLogicUri = biddingLogicUri;
        this.ads = ads;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
        this.trustedBiddingSignals = trustedBiddingData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) other;
        return Intrinsics.areEqual(this.buyer, customAudience.buyer) && Intrinsics.areEqual(this.name, customAudience.name) && Intrinsics.areEqual(this.activationTime, customAudience.activationTime) && Intrinsics.areEqual(this.expirationTime, customAudience.expirationTime) && Intrinsics.areEqual(this.dailyUpdateUri, customAudience.dailyUpdateUri) && Intrinsics.areEqual(this.userBiddingSignals, customAudience.userBiddingSignals) && Intrinsics.areEqual(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && Intrinsics.areEqual(this.ads, customAudience.ads);
    }

    @Nullable
    public final Instant getActivationTime() {
        return this.activationTime;
    }

    @NotNull
    public final List<AdData> getAds() {
        return this.ads;
    }

    @NotNull
    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    @NotNull
    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    @NotNull
    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    @Nullable
    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    @Nullable
    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public int hashCode() {
        int iHashCode = ((this.buyer.hashCode() * 31) + this.name.hashCode()) * 31;
        Instant instant = this.activationTime;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.expirationTime;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.dailyUpdateUri.hashCode()) * 31;
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int iHashCode4 = (iHashCode3 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        return ((((iHashCode4 + (trustedBiddingData != null ? trustedBiddingData.hashCode() : 0)) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", name=" + this.name + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }

    public /* synthetic */ CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(adTechIdentifier, str, uri, uri2, list, (i11 & 32) != 0 ? null : instant, (i11 & 64) != 0 ? null : instant2, (i11 & 128) != 0 ? null : adSelectionSignals, (i11 & 256) != 0 ? null : trustedBiddingData);
    }
}
