package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.internal.FrameworkClassParsingException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CreatePasswordRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016BQ\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB9\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0010B=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m90084d2 = {"Landroidx/credentials/CreatePasswordRequest;", "Landroidx/credentials/CreateCredentialRequest;", "id", "", "password", "isAutoSelectAllowed", "", "displayInfo", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "origin", "preferImmediatelyAvailableCredentials", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;Ljava/lang/String;ZLandroid/os/Bundle;Landroid/os/Bundle;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "preferDefaultProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getId", "()Ljava/lang/String;", "getPassword", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCreatePasswordRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePasswordRequest.kt\nandroidx/credentials/CreatePasswordRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
public final class CreatePasswordRequest extends CreateCredentialRequest {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final String BUNDLE_KEY_ID = "androidx.credentials.BUNDLE_KEY_ID";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final String BUNDLE_KEY_PASSWORD = "androidx.credentials.BUNDLE_KEY_PASSWORD";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String id;

    @NotNull
    private final String password;

    /* JADX INFO: compiled from: CreatePasswordRequest.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\bH\u0001¢\u0006\u0002\b\rJ'\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0013R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Landroidx/credentials/CreatePasswordRequest$Companion;", "", "<init>", "()V", "BUNDLE_KEY_ID", "", "BUNDLE_KEY_PASSWORD", "toCredentialDataBundle", "Landroid/os/Bundle;", "id", "password", "toCredentialDataBundle$credentials", "toCandidateDataBundle", "toCandidateDataBundle$credentials", "createFrom", "Landroidx/credentials/CreatePasswordRequest;", "data", "origin", "candidateQueryData", "createFrom$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @RequiresApi(23)
        @NotNull
        public final CreatePasswordRequest createFrom$credentials(@NotNull Bundle data, @Nullable String origin, @NotNull Bundle candidateQueryData) throws FrameworkClassParsingException {
            CreateCredentialRequest.DisplayInfo displayInfo;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                Intrinsics.checkNotNull(string);
                String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                Intrinsics.checkNotNull(string2);
                try {
                    displayInfo = CreateCredentialRequest.DisplayInfo.INSTANCE.createFrom(data);
                } catch (IllegalArgumentException unused) {
                    displayInfo = new CreateCredentialRequest.DisplayInfo(string, null);
                }
                return new CreatePasswordRequest(string, string2, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), displayInfo, origin, data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false), data, candidateQueryData, null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        @JvmStatic
        @NotNull
        public final Bundle toCandidateDataBundle$credentials() {
            return new Bundle();
        }

        @JvmStatic
        @NotNull
        public final Bundle toCredentialDataBundle$credentials(@NotNull String id2, @NotNull String password) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(password, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePasswordRequest(@NotNull String id2, @NotNull String password) {
        this(id2, password, null, false, false, 28, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePasswordRequest(@NotNull String id2, @NotNull String password, @Nullable String str) {
        this(id2, password, str, false, false, 24, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePasswordRequest(@NotNull String id2, @NotNull String password, @Nullable String str, boolean z11) {
        this(id2, password, str, z11, false, 16, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, boolean z11, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z12, Bundle bundle, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z11, displayInfo, str3, z12, bundle, bundle2);
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, boolean z11, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z12, Bundle bundle, Bundle bundle2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z11, displayInfo, (i11 & 16) != 0 ? null : str3, z12, (i11 & 64) != 0 ? INSTANCE.toCredentialDataBundle$credentials(str, str2) : bundle, (i11 & 128) != 0 ? INSTANCE.toCandidateDataBundle$credentials() : bundle2);
    }

    private CreatePasswordRequest(String str, String str2, boolean z11, CreateCredentialRequest.DisplayInfo displayInfo, String str3, boolean z12, Bundle bundle, Bundle bundle2) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z11, displayInfo, str3, z12);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    public /* synthetic */ CreatePasswordRequest(String str, String str2, String str3, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePasswordRequest(@NotNull String id2, @NotNull String password, @Nullable String str, boolean z11, boolean z12) {
        this(id2, password, z12, new CreateCredentialRequest.DisplayInfo(id2, null), str, z11, null, null, 192, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePasswordRequest(@NotNull String id2, @NotNull String password, @Nullable String str, @Nullable String str2, boolean z11, boolean z12) {
        this(id2, password, z12, new CreateCredentialRequest.DisplayInfo(id2, null, str2), str, z11, null, null, 192, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
    }
}
