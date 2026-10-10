package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FidoDataTypes.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialParameters;", "", "type", "", "alg", "", "<init>", "(Ljava/lang/String;J)V", "getType", "()Ljava/lang/String;", "getAlg", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final /* data */ class PublicKeyCredentialParameters {
    private final long alg;

    @NotNull
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) other;
        return Intrinsics.areEqual(this.type, publicKeyCredentialParameters.type) && this.alg == publicKeyCredentialParameters.alg;
    }

    public static /* synthetic */ PublicKeyCredentialParameters copy$default(PublicKeyCredentialParameters publicKeyCredentialParameters, String str, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = publicKeyCredentialParameters.type;
        }
        if ((i11 & 2) != 0) {
            j11 = publicKeyCredentialParameters.alg;
        }
        return publicKeyCredentialParameters.copy(str, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAlg() {
        return this.alg;
    }

    public final long getAlg() {
        return this.alg;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Long.hashCode(this.alg);
    }

    @NotNull
    public String toString() {
        return "PublicKeyCredentialParameters(type=" + this.type + ", alg=" + this.alg + ')';
    }

    public PublicKeyCredentialParameters(@NotNull String type, long j11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.alg = j11;
    }

    @NotNull
    public final PublicKeyCredentialParameters copy(@NotNull String type, long alg) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new PublicKeyCredentialParameters(type, alg);
    }
}
