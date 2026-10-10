package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.DeprecatedSinceApi;
import androidx.annotation.RequiresApi;
import java.security.PublicKey;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SigningInfoCompat.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBK\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\nH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0014\u0010\r\u001a\u00020\fX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017¨\u0006\u001c"}, m90084d2 = {"Landroidx/credentials/provider/SigningInfoCompat;", "", "signingCertificateHistory", "", "Landroid/content/pm/Signature;", "apkContentsSigners", "publicKeys", "", "Ljava/security/PublicKey;", "schemeVersion", "", "hasPastSigningCertificates", "", "hasMultipleSigners", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Collection;IZZ)V", "getSigningCertificateHistory", "()Ljava/util/List;", "getApkContentsSigners", "getPublicKeys", "()Ljava/util/Collection;", "getSchemeVersion", "()I", "()Z", "equals", "other", "hashCode", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SigningInfoCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @RequiresApi(28)
    @NotNull
    private final List<Signature> apkContentsSigners;

    @RequiresApi(28)
    private final boolean hasMultipleSigners;

    @RequiresApi(28)
    private final boolean hasPastSigningCertificates;

    @RequiresApi(35)
    @NotNull
    private final Collection<PublicKey> publicKeys;

    @RequiresApi(35)
    private final int schemeVersion;

    @NotNull
    private final List<Signature> signingCertificateHistory;

    /* JADX INFO: compiled from: SigningInfoCompat.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/provider/SigningInfoCompat$Companion;", "", "<init>", "()V", "fromSigningInfo", "Landroidx/credentials/provider/SigningInfoCompat;", "signingInfo", "Landroid/content/pm/SigningInfo;", "fromSignatures", "signatures", "", "Landroid/content/pm/Signature;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @DeprecatedSinceApi(api = 28, message = "Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead")
        @NotNull
        public final SigningInfoCompat fromSignatures(@NotNull List<? extends Signature> signatures) {
            Intrinsics.checkNotNullParameter(signatures, "signatures");
            if (Build.VERSION.SDK_INT < 28) {
                return new SigningInfoCompat(signatures, CollectionsKt.emptyList(), SetsKt.emptySet(), 0, false, false);
            }
            throw new IllegalArgumentException("Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead");
        }

        @JvmStatic
        @RequiresApi(28)
        @NotNull
        public final SigningInfoCompat fromSigningInfo(@NotNull SigningInfo signingInfo) {
            List listEmptyList;
            Collection collectionEmptySet;
            int schemeVersion;
            List listEmptyList2;
            Intrinsics.checkNotNullParameter(signingInfo, "signingInfo");
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners == null || (listEmptyList = ArraysKt.filterNotNull(apkContentsSigners)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list = listEmptyList;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 35 || (collectionEmptySet = signingInfo.getPublicKeys()) == null) {
                collectionEmptySet = SetsKt.emptySet();
            }
            Collection collection = collectionEmptySet;
            if (i11 >= 35) {
                schemeVersion = signingInfo.getSchemeVersion();
            } else {
                schemeVersion = 0;
            }
            int i12 = schemeVersion;
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory == null || (listEmptyList2 = ArraysKt.filterNotNull(signingCertificateHistory)) == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            return new SigningInfoCompat(listEmptyList2, list, collection, i12, signingInfo.hasPastSigningCertificates(), signingInfo.hasMultipleSigners());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SigningInfoCompat)) {
            return false;
        }
        SigningInfoCompat signingInfoCompat = (SigningInfoCompat) other;
        return Intrinsics.areEqual(this.signingCertificateHistory, signingInfoCompat.signingCertificateHistory) && Intrinsics.areEqual(this.apkContentsSigners, signingInfoCompat.apkContentsSigners) && Intrinsics.areEqual(this.publicKeys, signingInfoCompat.publicKeys) && this.schemeVersion == signingInfoCompat.schemeVersion && this.hasPastSigningCertificates == signingInfoCompat.hasPastSigningCertificates && this.hasMultipleSigners == signingInfoCompat.hasMultipleSigners;
    }

    @JvmStatic
    @DeprecatedSinceApi(api = 28, message = "Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead")
    @NotNull
    public static final SigningInfoCompat fromSignatures(@NotNull List<? extends Signature> list) {
        return INSTANCE.fromSignatures(list);
    }

    @JvmStatic
    @RequiresApi(28)
    @NotNull
    public static final SigningInfoCompat fromSigningInfo(@NotNull SigningInfo signingInfo) {
        return INSTANCE.fromSigningInfo(signingInfo);
    }

    @NotNull
    public final List<Signature> getApkContentsSigners() {
        return this.apkContentsSigners;
    }

    @NotNull
    public final Collection<PublicKey> getPublicKeys() {
        return this.publicKeys;
    }

    public final int getSchemeVersion() {
        return this.schemeVersion;
    }

    @NotNull
    public final List<Signature> getSigningCertificateHistory() {
        return this.signingCertificateHistory;
    }

    @JvmName(name = "hasMultipleSigners")
    /* JADX INFO: renamed from: hasMultipleSigners, reason: from getter */
    public final boolean getHasMultipleSigners() {
        return this.hasMultipleSigners;
    }

    @JvmName(name = "hasPastSigningCertificates")
    /* JADX INFO: renamed from: hasPastSigningCertificates, reason: from getter */
    public final boolean getHasPastSigningCertificates() {
        return this.hasPastSigningCertificates;
    }

    public int hashCode() {
        return (((((((((this.signingCertificateHistory.hashCode() * 31) + this.apkContentsSigners.hashCode()) * 31) + this.publicKeys.hashCode()) * 31) + this.schemeVersion) * 31) + Boolean.hashCode(this.hasPastSigningCertificates)) * 31) + Boolean.hashCode(this.hasMultipleSigners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SigningInfoCompat(@NotNull List<? extends Signature> signingCertificateHistory, @NotNull List<? extends Signature> apkContentsSigners, @NotNull Collection<? extends PublicKey> publicKeys, int i11, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(signingCertificateHistory, "signingCertificateHistory");
        Intrinsics.checkNotNullParameter(apkContentsSigners, "apkContentsSigners");
        Intrinsics.checkNotNullParameter(publicKeys, "publicKeys");
        this.signingCertificateHistory = signingCertificateHistory;
        this.apkContentsSigners = apkContentsSigners;
        this.publicKeys = publicKeys;
        this.schemeVersion = i11;
        this.hasPastSigningCertificates = z11;
        this.hasMultipleSigners = z12;
    }
}
