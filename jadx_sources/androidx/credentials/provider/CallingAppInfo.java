package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.DeprecatedSinceApi;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.provider.utils.PrivilegedApp;
import androidx.credentials.provider.utils.RequestValidationUtil;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.C33844oi;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CallingAppInfo.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0002%&B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u000bB+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\rH\u0002J\u0016\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0002J\u0013\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b8\u0007@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m90084d2 = {"Landroidx/credentials/provider/CallingAppInfo;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "origin", "signingInfoCompat", "Landroidx/credentials/provider/SigningInfoCompat;", "signingInfo", "Landroid/content/pm/SigningInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/credentials/provider/SigningInfoCompat;Landroid/content/pm/SigningInfo;)V", "(Ljava/lang/String;Landroid/content/pm/SigningInfo;Ljava/lang/String;)V", "signatures", "", "Landroid/content/pm/Signature;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getOrigin$credentials", "getSigningInfoCompat", "()Landroidx/credentials/provider/SigningInfoCompat;", "value", "getSigningInfo", "()Landroid/content/pm/SigningInfo;", "getOrigin", "privilegedAllowlist", "isOriginPopulated", "", "isAppPrivileged", "candidateApps", "Landroidx/credentials/provider/utils/PrivilegedApp;", "candidateFingerprints", "", "equals", "other", "hashCode", "", "Companion", "SignatureVerifier", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallingAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallingAppInfo.kt\nandroidx/credentials/provider/CallingAppInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,355:1\n1#2:356\n*E\n"})
public final class CallingAppInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_CREDENTIAL_REQUEST_ORIGIN = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN";

    @NotNull
    private static final String EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME";

    @NotNull
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNATURES = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNATURES";

    @NotNull
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO";

    @Nullable
    private final String origin;

    @NotNull
    private final String packageName;
    private SigningInfo signingInfo;

    @NotNull
    private final SigningInfoCompat signingInfoCompat;

    /* JADX INFO: compiled from: CallingAppInfo.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0014H\u0007R\u000e\u0010\u000e\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Landroidx/credentials/provider/CallingAppInfo$Companion;", "", "<init>", "()V", "create", "Landroidx/credentials/provider/CallingAppInfo;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "signingInfo", "Landroid/content/pm/SigningInfo;", "origin", "signatures", "", "Landroid/content/pm/Signature;", "EXTRA_CREDENTIAL_REQUEST_ORIGIN", "EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME", "EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO", "EXTRA_CREDENTIAL_REQUEST_SIGNATURES", "setCallingAppInfo", "", "Landroid/os/Bundle;", "info", "setCallingAppInfo$credentials", "extractCallingAppInfo", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCallingAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallingAppInfo.kt\nandroidx/credentials/provider/CallingAppInfo$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,355:1\n37#2:356\n36#2,3:357\n11228#3:360\n11563#3,3:361\n*S KotlinDebug\n*F\n+ 1 CallingAppInfo.kt\nandroidx/credentials/provider/CallingAppInfo$Companion\n*L\n168#1:356\n168#1:357,3\n194#1:360\n194#1:361,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, SigningInfo signingInfo, String str2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, signingInfo, str2);
        }

        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final CallingAppInfo create(@NotNull String packageName, @NotNull SigningInfo signingInfo, @Nullable String origin) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(signingInfo, "signingInfo");
            return new CallingAppInfo(packageName, signingInfo, origin);
        }

        private Companion() {
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, List list, String str2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, (List<? extends Signature>) list, str2);
        }

        @DeprecatedSinceApi(api = 28, message = "Use the SigningInfo based constructor instead")
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final CallingAppInfo create(@NotNull String packageName, @NotNull List<? extends Signature> signatures, @Nullable String origin) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(signatures, "signatures");
            return new CallingAppInfo(packageName, signatures, origin);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final CallingAppInfo extractCallingAppInfo(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            String string2 = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME);
            if (string2 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfoM2680a = C2177b.m2680a(bundle.getParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO));
                if (signingInfoM2680a == null) {
                    return null;
                }
                return create(string2, signingInfoM2680a, string);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNATURES);
            if (parcelableArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type android.content.pm.Signature");
                arrayList.add((Signature) parcelable);
            }
            return create(string2, arrayList, string);
        }

        public final void setCallingAppInfo$credentials(@NotNull Bundle bundle, @NotNull CallingAppInfo info) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            Intrinsics.checkNotNullParameter(info, "info");
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN, info.getOrigin());
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME, info.getPackageName());
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO, info.getSigningInfo());
            } else {
                bundle.putParcelableArray(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNATURES, (Parcelable[]) info.getSigningInfoCompat().getSigningCertificateHistory().toArray(new Signature[0]));
            }
        }
    }

    /* JADX INFO: compiled from: CallingAppInfo.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/provider/CallingAppInfo$SignatureVerifier;", "", "signingInfoCompat", "Landroidx/credentials/provider/SigningInfoCompat;", "<init>", "(Landroidx/credentials/provider/SigningInfoCompat;)V", "getSignatureFingerprints", "", "", "convertToFingerprints", "signatures", "", "Landroid/content/pm/Signature;", "verifySignatureFingerprints", "", "candidateSigFingerprints", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class SignatureVerifier {

        @NotNull
        private final SigningInfoCompat signingInfoCompat;

        private final Set<String> convertToFingerprints(List<? extends Signature> signatures) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<? extends Signature> it = signatures.iterator();
            while (it.hasNext()) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(it.next().toByteArray());
                Intrinsics.checkNotNull(bArrDigest);
                linkedHashSet.add(ArraysKt.joinToString$default(bArrDigest, (CharSequence) C33844oi.f71346o, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: androidx.credentials.provider.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CallingAppInfo.SignatureVerifier.convertToFingerprints$lambda$0(((Byte) obj).byteValue());
                    }
                }, 30, (Object) null));
            }
            return linkedHashSet;
        }

        private final Set<String> getSignatureFingerprints() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<Signature> apkContentsSigners = this.signingInfoCompat.getApkContentsSigners();
            if (this.signingInfoCompat.getHasMultipleSigners() && !apkContentsSigners.isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(apkContentsSigners));
                return linkedHashSet;
            }
            if (!this.signingInfoCompat.getSigningCertificateHistory().isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(CollectionsKt.listOf(this.signingInfoCompat.getSigningCertificateHistory().get(0))));
            }
            return linkedHashSet;
        }

        public final boolean verifySignatureFingerprints(@NotNull Set<String> candidateSigFingerprints) {
            Intrinsics.checkNotNullParameter(candidateSigFingerprints, "candidateSigFingerprints");
            Set<String> signatureFingerprints = getSignatureFingerprints();
            if (this.signingInfoCompat.getHasMultipleSigners()) {
                return candidateSigFingerprints.containsAll(signatureFingerprints);
            }
            return !CollectionsKt.intersect(candidateSigFingerprints, signatureFingerprints).isEmpty();
        }

        public SignatureVerifier(@NotNull SigningInfoCompat signingInfoCompat) {
            Intrinsics.checkNotNullParameter(signingInfoCompat, "signingInfoCompat");
            this.signingInfoCompat = signingInfoCompat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence convertToFingerprints$lambda$0(byte b11) {
            String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @RequiresApi(28)
    @VisibleForTesting
    public CallingAppInfo(@NotNull String packageName, @NotNull SigningInfo signingInfo) {
        this(packageName, signingInfo, (String) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(signingInfo, "signingInfo");
    }

    private final boolean isAppPrivileged(List<PrivilegedApp> candidateApps) {
        for (PrivilegedApp privilegedApp : candidateApps) {
            if (Intrinsics.areEqual(privilegedApp.getPackageName(), this.packageName)) {
                return isAppPrivileged(privilegedApp.getFingerprints());
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallingAppInfo)) {
            return false;
        }
        CallingAppInfo callingAppInfo = (CallingAppInfo) other;
        return Intrinsics.areEqual(this.packageName, callingAppInfo.packageName) && Intrinsics.areEqual(this.origin, callingAppInfo.origin) && Intrinsics.areEqual(this.signingInfoCompat, callingAppInfo.signingInfoCompat);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @DeprecatedSinceApi(api = 28, message = "Use the SigningInfo based constructor instead")
    @JvmOverloads
    @VisibleForTesting
    public CallingAppInfo(@NotNull String packageName, @NotNull List<? extends Signature> signatures) {
        this(packageName, signatures, (String) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
    }

    @Nullable
    /* JADX INFO: renamed from: getOrigin$credentials, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @RequiresApi(28)
    @NotNull
    public final SigningInfo getSigningInfo() {
        SigningInfo signingInfo = this.signingInfo;
        if (signingInfo != null) {
            return signingInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signingInfo");
        return null;
    }

    @NotNull
    public final SigningInfoCompat getSigningInfoCompat() {
        return this.signingInfoCompat;
    }

    public int hashCode() {
        int iHashCode = this.packageName.hashCode() * 31;
        String str = this.origin;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.signingInfoCompat.hashCode();
    }

    public final boolean isOriginPopulated() {
        return this.origin != null;
    }

    private CallingAppInfo(String str, String str2, SigningInfoCompat signingInfoCompat, SigningInfo signingInfo) {
        this.packageName = str;
        this.origin = str2;
        this.signingInfoCompat = signingInfoCompat;
        if (Build.VERSION.SDK_INT >= 28) {
            Intrinsics.checkNotNull(signingInfo);
            this.signingInfo = signingInfo;
        }
        if (str.length() <= 0) {
            throw new IllegalArgumentException("packageName must not be empty");
        }
    }

    @Nullable
    public final String getOrigin(@NotNull String privilegedAllowlist) {
        Intrinsics.checkNotNullParameter(privilegedAllowlist, "privilegedAllowlist");
        if (RequestValidationUtil.INSTANCE.isValidJSON(privilegedAllowlist)) {
            String str = this.origin;
            if (str == null) {
                return str;
            }
            try {
                if (isAppPrivileged(PrivilegedApp.INSTANCE.extractPrivilegedApps$credentials(new JSONObject(privilegedAllowlist)))) {
                    return this.origin;
                }
                throw new IllegalStateException("Origin is not being returned as the calling app did notmatch the privileged allowlist");
            } catch (JSONException unused) {
                throw new IllegalArgumentException("privilegedAllowlist must be formatted properly");
            }
        }
        throw new IllegalArgumentException("privilegedAllowlist must not be empty, and must be a valid JSON");
    }

    private final boolean isAppPrivileged(Set<String> candidateFingerprints) {
        return new SignatureVerifier(this.signingInfoCompat).verifySignatureFingerprints(candidateFingerprints);
    }

    public /* synthetic */ CallingAppInfo(String str, SigningInfo signingInfo, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, signingInfo, (i11 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @RequiresApi(28)
    @VisibleForTesting
    public CallingAppInfo(@NotNull String packageName, @NotNull SigningInfo signingInfo, @Nullable String str) {
        this(packageName, str, SigningInfoCompat.INSTANCE.fromSigningInfo(signingInfo), signingInfo);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(signingInfo, "signingInfo");
    }

    public /* synthetic */ CallingAppInfo(String str, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends Signature>) list, (i11 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @DeprecatedSinceApi(api = 28, message = "Use the SigningInfo based constructor instead")
    @JvmOverloads
    @VisibleForTesting
    public CallingAppInfo(@NotNull String packageName, @NotNull List<? extends Signature> signatures, @Nullable String str) {
        this(packageName, str, SigningInfoCompat.INSTANCE.fromSignatures(signatures), null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
    }
}
