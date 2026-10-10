package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FidoDataTypes.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m90084d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialUserEntity;", "", "name", "", "id", "", "displayName", "<init>", "(Ljava/lang/String;[BLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getId", "()[B", "getDisplayName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final /* data */ class PublicKeyCredentialUserEntity {

    @NotNull
    private final String displayName;

    @NotNull
    private final byte[] id;

    @NotNull
    private final String name;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) other;
        return Intrinsics.areEqual(this.name, publicKeyCredentialUserEntity.name) && Intrinsics.areEqual(this.id, publicKeyCredentialUserEntity.id) && Intrinsics.areEqual(this.displayName, publicKeyCredentialUserEntity.displayName);
    }

    public PublicKeyCredentialUserEntity(@NotNull String name, @NotNull byte[] id2, @NotNull String displayName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.name = name;
        this.id = id2;
        this.displayName = displayName;
    }

    public static /* synthetic */ PublicKeyCredentialUserEntity copy$default(PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, String str, byte[] bArr, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = publicKeyCredentialUserEntity.name;
        }
        if ((i11 & 2) != 0) {
            bArr = publicKeyCredentialUserEntity.id;
        }
        if ((i11 & 4) != 0) {
            str2 = publicKeyCredentialUserEntity.displayName;
        }
        return publicKeyCredentialUserEntity.copy(str, bArr, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final PublicKeyCredentialUserEntity copy(@NotNull String name, @NotNull byte[] id2, @NotNull String displayName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new PublicKeyCredentialUserEntity(name, id2, displayName);
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final byte[] getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Arrays.hashCode(this.id)) * 31) + this.displayName.hashCode();
    }

    @NotNull
    public String toString() {
        return "PublicKeyCredentialUserEntity(name=" + this.name + ", id=" + Arrays.toString(this.id) + ", displayName=" + this.displayName + ')';
    }
}
