package androidx.privacysandbox.ads.adservices.adselection;

import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpdateAdCounterHistogramRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "", "adSelectionId", "", "adEventType", "", "callerAdTech", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "(JILandroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;)V", "getAdEventType", "()I", "getAdSelectionId", "()J", "getCallerAdTech", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "convertToAdServices", "Landroid/adservices/adselection/UpdateAdCounterHistogramRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "toString", "", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@ExperimentalFeatures.Ext8OptIn
public final class UpdateAdCounterHistogramRequest {
    private final int adEventType;
    private final long adSelectionId;

    @NotNull
    private final AdTechIdentifier callerAdTech;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAdCounterHistogramRequest)) {
            return false;
        }
        UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest = (UpdateAdCounterHistogramRequest) other;
        return this.adSelectionId == updateAdCounterHistogramRequest.adSelectionId && this.adEventType == updateAdCounterHistogramRequest.adEventType && Intrinsics.areEqual(this.callerAdTech, updateAdCounterHistogramRequest.callerAdTech);
    }

    public UpdateAdCounterHistogramRequest(long j11, int i11, @NotNull AdTechIdentifier callerAdTech) {
        Intrinsics.checkNotNullParameter(callerAdTech, "callerAdTech");
        this.adSelectionId = j11;
        this.adEventType = i11;
        this.callerAdTech = callerAdTech;
        if (i11 == 0) {
            throw new IllegalArgumentException("Win event types cannot be manually updated.");
        }
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            throw new IllegalArgumentException("Ad event type must be one of AD_EVENT_TYPE_IMPRESSION, AD_EVENT_TYPE_VIEW, or AD_EVENT_TYPE_CLICK");
        }
    }

    public final int getAdEventType() {
        return this.adEventType;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    @NotNull
    public final AdTechIdentifier getCallerAdTech() {
        return this.callerAdTech;
    }

    public int hashCode() {
        return (((Long.hashCode(this.adSelectionId) * 31) + Integer.hashCode(this.adEventType)) * 31) + this.callerAdTech.hashCode();
    }

    @NotNull
    public String toString() {
        String str;
        int i11 = this.adEventType;
        if (i11 == 0) {
            str = "AD_EVENT_TYPE_WIN";
        } else if (i11 == 1) {
            str = "AD_EVENT_TYPE_IMPRESSION";
        } else if (i11 != 2) {
            str = i11 != 3 ? "Invalid ad event type" : "AD_EVENT_TYPE_CLICK";
        } else {
            str = "AD_EVENT_TYPE_VIEW";
        }
        return "UpdateAdCounterHistogramRequest: adSelectionId=" + this.adSelectionId + ", adEventType=" + str + ", callerAdTech=" + this.callerAdTech;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 8), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final android.adservices.adselection.UpdateAdCounterHistogramRequest convertToAdServices$ads_adservices_release() {
        C3798x0.m3648a();
        long j11 = this.adSelectionId;
        int i11 = this.adEventType;
        this.callerAdTech.convertToAdServices$ads_adservices_release();
        android.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequestBuild = C3796w0.m3646a(j11, i11, null).build();
        Intrinsics.checkNotNullExpressionValue(updateAdCounterHistogramRequestBuild, "Builder(\n               …   )\n            .build()");
        return updateAdCounterHistogramRequestBuild;
    }
}
