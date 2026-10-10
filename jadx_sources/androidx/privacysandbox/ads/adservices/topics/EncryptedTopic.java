package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: EncryptedTopic.kt */
/* JADX INFO: loaded from: classes34.dex */
@ExperimentalFeatures.Ext11OptIn
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/topics/EncryptedTopic;", "", "encryptedTopic", "", "keyIdentifier", "", "encapsulatedKey", "([BLjava/lang/String;[B)V", "getEncapsulatedKey", "()[B", "getEncryptedTopic", "getKeyIdentifier", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class EncryptedTopic {

    /* JADX INFO: renamed from: encapsulatedKey, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] EncapsulatedKey;

    /* JADX INFO: renamed from: encryptedTopic, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] EncryptedTopic;

    /* JADX INFO: renamed from: keyIdentifier, reason: from kotlin metadata and from toString */
    @NotNull
    private final String KeyIdentifier;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedTopic)) {
            return false;
        }
        EncryptedTopic encryptedTopic = (EncryptedTopic) other;
        return Arrays.equals(this.EncryptedTopic, encryptedTopic.EncryptedTopic) && this.KeyIdentifier.contentEquals(encryptedTopic.KeyIdentifier) && Arrays.equals(this.EncapsulatedKey, encryptedTopic.EncapsulatedKey);
    }

    public EncryptedTopic(@NotNull byte[] encryptedTopic, @NotNull String keyIdentifier, @NotNull byte[] encapsulatedKey) {
        Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.EncryptedTopic = encryptedTopic;
        this.KeyIdentifier = keyIdentifier;
        this.EncapsulatedKey = encapsulatedKey;
    }

    @NotNull
    public final byte[] getEncapsulatedKey() {
        return this.EncapsulatedKey;
    }

    @NotNull
    public final byte[] getEncryptedTopic() {
        return this.EncryptedTopic;
    }

    @NotNull
    public final String getKeyIdentifier() {
        return this.KeyIdentifier;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.EncryptedTopic)), this.KeyIdentifier, Integer.valueOf(Arrays.hashCode(this.EncapsulatedKey)));
    }

    @NotNull
    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + StringsKt.decodeToString(this.EncryptedTopic) + ", KeyIdentifier=" + this.KeyIdentifier + ", EncapsulatedKey=" + StringsKt.decodeToString(this.EncapsulatedKey) + " }");
    }
}
