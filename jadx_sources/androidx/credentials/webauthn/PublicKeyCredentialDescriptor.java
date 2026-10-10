package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FidoDataTypes.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialDescriptor;", "", "type", "", "id", "", "transports", "", "<init>", "(Ljava/lang/String;[BLjava/util/List;)V", "getType", "()Ljava/lang/String;", "getId", "()[B", "getTransports", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final /* data */ class PublicKeyCredentialDescriptor {

    @NotNull
    private final byte[] id;

    @NotNull
    private final List<String> transports;

    @NotNull
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) other;
        return Intrinsics.areEqual(this.type, publicKeyCredentialDescriptor.type) && Intrinsics.areEqual(this.id, publicKeyCredentialDescriptor.id) && Intrinsics.areEqual(this.transports, publicKeyCredentialDescriptor.transports);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublicKeyCredentialDescriptor copy$default(PublicKeyCredentialDescriptor publicKeyCredentialDescriptor, String str, byte[] bArr, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = publicKeyCredentialDescriptor.type;
        }
        if ((i11 & 2) != 0) {
            bArr = publicKeyCredentialDescriptor.id;
        }
        if ((i11 & 4) != 0) {
            list = publicKeyCredentialDescriptor.transports;
        }
        return publicKeyCredentialDescriptor.copy(str, bArr, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getId() {
        return this.id;
    }

    @NotNull
    public final List<String> component3() {
        return this.transports;
    }

    @NotNull
    public final byte[] getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getTransports() {
        return this.transports;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Arrays.hashCode(this.id)) * 31) + this.transports.hashCode();
    }

    @NotNull
    public String toString() {
        return "PublicKeyCredentialDescriptor(type=" + this.type + ", id=" + Arrays.toString(this.id) + ", transports=" + this.transports + ')';
    }

    public PublicKeyCredentialDescriptor(@NotNull String type, @NotNull byte[] id2, @NotNull List<String> transports) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(transports, "transports");
        this.type = type;
        this.id = id2;
        this.transports = transports;
    }

    @NotNull
    public final PublicKeyCredentialDescriptor copy(@NotNull String type, @NotNull byte[] id2, @NotNull List<String> transports) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(transports, "transports");
        return new PublicKeyCredentialDescriptor(type, id2, transports);
    }
}
