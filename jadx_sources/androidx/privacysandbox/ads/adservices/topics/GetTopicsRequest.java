package androidx.privacysandbox.ads.adservices.topics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GetTopicsRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0010"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "", "adsSdkName", "", "shouldRecordObservation", "", "(Ljava/lang/String;Z)V", "getAdsSdkName", "()Ljava/lang/String;", "()Z", "equals", "other", "hashCode", "", "toString", "Builder", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class GetTopicsRequest {

    @NotNull
    private final String adsSdkName;
    private final boolean shouldRecordObservation;

    /* JADX INFO: compiled from: GetTopicsRequest.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest$Builder;", "", "()V", "adsSdkName", "", "shouldRecordObservation", "", "build", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "setAdsSdkName", "setShouldRecordObservation", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGetTopicsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTopicsRequest.kt\nandroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
    public static final class Builder {

        @NotNull
        private String adsSdkName = "";
        private boolean shouldRecordObservation = true;

        @NotNull
        public final GetTopicsRequest build() {
            return new GetTopicsRequest(this.adsSdkName, this.shouldRecordObservation);
        }

        @NotNull
        public final Builder setAdsSdkName(@NotNull String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.adsSdkName = adsSdkName;
            return this;
        }

        @NotNull
        public final Builder setShouldRecordObservation(boolean shouldRecordObservation) {
            this.shouldRecordObservation = shouldRecordObservation;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetTopicsRequest() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) other;
        return Intrinsics.areEqual(this.adsSdkName, getTopicsRequest.adsSdkName) && this.shouldRecordObservation == getTopicsRequest.shouldRecordObservation;
    }

    public GetTopicsRequest(@NotNull String adsSdkName, boolean z11) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.adsSdkName = adsSdkName;
        this.shouldRecordObservation = z11;
    }

    @NotNull
    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + Boolean.hashCode(this.shouldRecordObservation);
    }

    @JvmName(name = "shouldRecordObservation")
    /* JADX INFO: renamed from: shouldRecordObservation, reason: from getter */
    public final boolean getShouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    @NotNull
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public /* synthetic */ GetTopicsRequest(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? false : z11);
    }
}
