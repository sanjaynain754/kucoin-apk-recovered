package androidx.privacysandbox.ads.adservices.common;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p708w.C45669a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdSelectionSignals.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "", "", "signals", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lw/a;", "convertToAdServices$ads_adservices_release", "()Lw/a;", "convertToAdServices", "Ljava/lang/String;", "getSignals", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"ClassVerificationFailure"})
public final class AdSelectionSignals {

    @NotNull
    private final String signals;

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final C45669a convertToAdServices$ads_adservices_release() {
        C45669a.m100783a(this.signals);
        Intrinsics.checkNotNullExpressionValue(null, "fromString(signals)");
        return null;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AdSelectionSignals) {
            return Intrinsics.areEqual(this.signals, ((AdSelectionSignals) other).signals);
        }
        return false;
    }

    @NotNull
    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        return this.signals.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionSignals: " + this.signals;
    }

    public AdSelectionSignals(@NotNull String signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        this.signals = signals;
    }
}
