package androidx.privacysandbox.ads.adservices.adselection;

import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistAdSelectionResultRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@ExperimentalFeatures.Ext10OptIn
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "", "adSelectionId", "", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "adSelectionResult", "", "(JLandroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;[B)V", "getAdSelectionId", "()J", "getAdSelectionResult", "()[B", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "convertToAdServices", "Landroid/adservices/adselection/PersistAdSelectionResultRequest;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "", "toString", "", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PersistAdSelectionResultRequest {
    private final long adSelectionId;

    @Nullable
    private final byte[] adSelectionResult;

    @Nullable
    private final AdTechIdentifier seller;

    @JvmOverloads
    public PersistAdSelectionResultRequest(long j11) {
        this(j11, null, null, 6, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersistAdSelectionResultRequest)) {
            return false;
        }
        PersistAdSelectionResultRequest persistAdSelectionResultRequest = (PersistAdSelectionResultRequest) other;
        return this.adSelectionId == persistAdSelectionResultRequest.adSelectionId && Intrinsics.areEqual(this.seller, persistAdSelectionResultRequest.seller) && Arrays.equals(this.adSelectionResult, persistAdSelectionResultRequest.adSelectionResult);
    }

    @JvmOverloads
    public PersistAdSelectionResultRequest(long j11, @Nullable AdTechIdentifier adTechIdentifier) {
        this(j11, adTechIdentifier, null, 4, null);
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    @Nullable
    public final byte[] getAdSelectionResult() {
        return this.adSelectionResult;
    }

    @Nullable
    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.adSelectionId) * 31;
        AdTechIdentifier adTechIdentifier = this.seller;
        int iHashCode2 = (iHashCode + (adTechIdentifier != null ? adTechIdentifier.hashCode() : 0)) * 31;
        byte[] bArr = this.adSelectionResult;
        return iHashCode2 + (bArr != null ? bArr.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PersistAdSelectionResultRequest: adSelectionId=" + this.adSelectionId + ", seller=" + this.seller + ", adSelectionResult=" + this.adSelectionResult;
    }

    @JvmOverloads
    public PersistAdSelectionResultRequest(long j11, @Nullable AdTechIdentifier adTechIdentifier, @Nullable byte[] bArr) {
        this.adSelectionId = j11;
        this.seller = adTechIdentifier;
        this.adSelectionResult = bArr;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 10), @RequiresExtension(extension = 31, version = 10)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final android.adservices.adselection.PersistAdSelectionResultRequest convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.PersistAdSelectionResultRequest.Builder adSelectionId = C3778n0.m3628a().setAdSelectionId(this.adSelectionId);
        AdTechIdentifier adTechIdentifier = this.seller;
        if (adTechIdentifier != null) {
            adTechIdentifier.convertToAdServices$ads_adservices_release();
        }
        android.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequestBuild = adSelectionId.setSeller(null).setAdSelectionResult(this.adSelectionResult).build();
        Intrinsics.checkNotNullExpressionValue(persistAdSelectionResultRequestBuild, "Builder()\n            .s…ult)\n            .build()");
        return persistAdSelectionResultRequestBuild;
    }

    public /* synthetic */ PersistAdSelectionResultRequest(long j11, AdTechIdentifier adTechIdentifier, byte[] bArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? null : adTechIdentifier, (i11 & 4) != 0 ? null : bArr);
    }
}
