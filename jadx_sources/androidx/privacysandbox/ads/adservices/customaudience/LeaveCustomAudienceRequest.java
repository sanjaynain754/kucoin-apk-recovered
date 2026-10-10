package androidx.privacysandbox.ads.adservices.customaudience;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeaveCustomAudienceRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "name", "", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/lang/String;)V", "getBuyer", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getName", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LeaveCustomAudienceRequest {

    @NotNull
    private final AdTechIdentifier buyer;

    @NotNull
    private final String name;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaveCustomAudienceRequest)) {
            return false;
        }
        LeaveCustomAudienceRequest leaveCustomAudienceRequest = (LeaveCustomAudienceRequest) other;
        return Intrinsics.areEqual(this.buyer, leaveCustomAudienceRequest.buyer) && Intrinsics.areEqual(this.name, leaveCustomAudienceRequest.name);
    }

    public LeaveCustomAudienceRequest(@NotNull AdTechIdentifier buyer, @NotNull String name) {
        Intrinsics.checkNotNullParameter(buyer, "buyer");
        Intrinsics.checkNotNullParameter(name, "name");
        this.buyer = buyer;
        this.name = name;
    }

    @NotNull
    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.buyer.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.buyer + ", name=" + this.name;
    }
}
