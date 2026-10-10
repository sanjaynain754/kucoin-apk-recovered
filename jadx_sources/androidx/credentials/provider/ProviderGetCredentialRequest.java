package androidx.credentials.provider;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.credentials.CredentialOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ProviderGetCredentialRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B3\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB+\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Landroidx/credentials/provider/ProviderGetCredentialRequest;", "", "credentialOptions", "", "Landroidx/credentials/CredentialOption;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "biometricPromptResult", "Landroidx/credentials/provider/BiometricPromptResult;", "sourceBundle", "Landroid/os/Bundle;", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;Landroidx/credentials/provider/BiometricPromptResult;Landroid/os/Bundle;)V", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;Landroidx/credentials/provider/BiometricPromptResult;)V", "getCredentialOptions", "()Ljava/util/List;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "getBiometricPromptResult", "()Landroidx/credentials/provider/BiometricPromptResult;", "getSourceBundle", "()Landroid/os/Bundle;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ProviderGetCredentialRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ALLOWED_PROVIDERS_";

    @NotNull
    private static final String EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_";

    @NotNull
    private static final String EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_";

    @NotNull
    private static final String EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_";

    @NotNull
    private static final String EXTRA_CREDENTIAL_OPTION_SIZE = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_SIZE";

    @NotNull
    private static final String EXTRA_CREDENTIAL_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_";

    @Nullable
    private final BiometricPromptResult biometricPromptResult;

    @NotNull
    private final CallingAppInfo callingAppInfo;

    @NotNull
    private final List<CredentialOption> credentialOptions;

    @Nullable
    private final Bundle sourceBundle;

    /* JADX INFO: compiled from: ProviderGetCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0002\b\u000fJ\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000eH\u0007R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Landroidx/credentials/provider/ProviderGetCredentialRequest$Companion;", "", "<init>", "()V", "createFrom", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "options", "", "Landroidx/credentials/CredentialOption;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "biometricPromptResult", "Landroidx/credentials/provider/BiometricPromptResult;", "sourceBundle", "Landroid/os/Bundle;", "createFrom$credentials", "EXTRA_CREDENTIAL_OPTION_SIZE", "", "EXTRA_CREDENTIAL_OPTION_TYPE_PREFIX", "EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX", "EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX", "EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX", "EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX", "asBundle", "request", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nProviderGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProviderGetCredentialRequest.kt\nandroidx/credentials/provider/ProviderGetCredentialRequest$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n37#2:208\n36#2,3:209\n11546#3,9:212\n13472#3:221\n13473#3:223\n11555#3:224\n1#4:222\n*S KotlinDebug\n*F\n+ 1 ProviderGetCredentialRequest.kt\nandroidx/credentials/provider/ProviderGetCredentialRequest$Companion\n*L\n133#1:208\n133#1:209,3\n187#1:212,9\n187#1:221\n187#1:223\n187#1:224\n187#1:222\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ProviderGetCredentialRequest createFrom$credentials$default(Companion companion, List list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                biometricPromptResult = null;
            }
            return companion.createFrom$credentials(list, callingAppInfo, biometricPromptResult, bundle);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00b0 A[Catch: Exception -> 0x00b6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b6, blocks: (B:15:0x007d, B:17:0x0094, B:19:0x009d, B:21:0x00a3, B:22:0x00a6, B:23:0x00a9, B:26:0x00b0), top: B:42:0x007d }] */
        @JvmStatic
        @NotNull
        public final ProviderGetCredentialRequest fromBundle(@NotNull Bundle bundle) {
            Set<ComponentName> setEmptySet;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            CallingAppInfo callingAppInfoExtractCallingAppInfo = CallingAppInfo.INSTANCE.extractCallingAppInfo(bundle);
            if (callingAppInfoExtractCallingAppInfo == null) {
                throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
            }
            int i11 = bundle.getInt(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_SIZE, -1);
            if (i11 < 0) {
                throw new IllegalArgumentException("Bundle had invalid option size as " + i11 + '.');
            }
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i11; i12++) {
                String string = bundle.getString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_" + i12);
                if (string == null) {
                    throw new IllegalArgumentException("Bundle was missing option type at index " + i11 + '.');
                }
                Bundle bundle2 = bundle.getBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i12);
                if (bundle2 == null) {
                    throw new IllegalArgumentException("Bundle was missing candidate query data at index " + i11 + '.');
                }
                Bundle bundle3 = bundle.getBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX + i12);
                if (bundle3 == null) {
                    throw new IllegalArgumentException("Bundle was missing request data at index " + i11 + '.');
                }
                boolean z11 = bundle.getBoolean(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX + i12, false);
                try {
                    Parcelable[] parcelableArray = bundle.getParcelableArray(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX + i12);
                    if (parcelableArray != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Parcelable parcelable : parcelableArray) {
                            ComponentName componentName = (ComponentName) parcelable;
                            if (componentName != null) {
                                arrayList2.add(componentName);
                            }
                        }
                        setEmptySet = CollectionsKt.toSet(arrayList2);
                        if (setEmptySet == null) {
                            setEmptySet = SetsKt.emptySet();
                        }
                    } else {
                        setEmptySet = SetsKt.emptySet();
                    }
                } catch (Exception unused) {
                    setEmptySet = SetsKt.emptySet();
                }
                arrayList.add(CredentialOption.INSTANCE.createFrom(string, bundle3, bundle2, z11, setEmptySet));
            }
            return createFrom$credentials(arrayList, callingAppInfoExtractCallingAppInfo, null, bundle);
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull ProviderGetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Bundle bundle = new Bundle();
            int size = request.getCredentialOptions().size();
            bundle.putInt(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_SIZE, size);
            for (int i11 = 0; i11 < size; i11++) {
                CredentialOption credentialOption = request.getCredentialOptions().get(i11);
                bundle.putString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_" + i11, credentialOption.getType());
                bundle.putBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i11, credentialOption.getCandidateQueryData());
                bundle.putBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX + i11, credentialOption.getRequestData());
                bundle.putBoolean(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX + i11, credentialOption.getIsSystemProviderRequired());
                bundle.putParcelableArray(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX + i11, (Parcelable[]) credentialOption.getAllowedProviders().toArray(new ComponentName[0]));
            }
            CallingAppInfo.INSTANCE.setCallingAppInfo$credentials(bundle, request.getCallingAppInfo());
            return bundle;
        }

        @JvmStatic
        @NotNull
        public final ProviderGetCredentialRequest createFrom$credentials(@NotNull List<? extends CredentialOption> options, @NotNull CallingAppInfo callingAppInfo, @Nullable BiometricPromptResult biometricPromptResult, @Nullable Bundle sourceBundle) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
            return new ProviderGetCredentialRequest(options, callingAppInfo, biometricPromptResult, sourceBundle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProviderGetCredentialRequest(@NotNull List<? extends CredentialOption> credentialOptions, @NotNull CallingAppInfo callingAppInfo) {
        this(credentialOptions, callingAppInfo, null, 4, null);
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ProviderGetCredentialRequest(@NotNull List<? extends CredentialOption> credentialOptions, @NotNull CallingAppInfo callingAppInfo, @Nullable BiometricPromptResult biometricPromptResult, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
        this.credentialOptions = credentialOptions;
        this.callingAppInfo = callingAppInfo;
        this.biometricPromptResult = biometricPromptResult;
        this.sourceBundle = bundle;
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull ProviderGetCredentialRequest providerGetCredentialRequest) {
        return INSTANCE.asBundle(providerGetCredentialRequest);
    }

    @JvmStatic
    @NotNull
    public static final ProviderGetCredentialRequest fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @Nullable
    public final BiometricPromptResult getBiometricPromptResult() {
        return this.biometricPromptResult;
    }

    @NotNull
    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    @NotNull
    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public final Bundle getSourceBundle() {
        return this.sourceBundle;
    }

    public /* synthetic */ ProviderGetCredentialRequest(List list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, callingAppInfo, (i11 & 4) != 0 ? null : biometricPromptResult);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProviderGetCredentialRequest(@NotNull List<? extends CredentialOption> credentialOptions, @NotNull CallingAppInfo callingAppInfo, @Nullable BiometricPromptResult biometricPromptResult) {
        this(credentialOptions, callingAppInfo, biometricPromptResult, null);
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
    }
}
