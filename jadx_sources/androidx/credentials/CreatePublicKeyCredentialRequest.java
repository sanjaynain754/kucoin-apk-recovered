package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CreatePublicKeyCredentialRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB]\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0012B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Landroidx/credentials/CreatePublicKeyCredentialRequest;", "Landroidx/credentials/CreateCredentialRequest;", "requestJson", "", "clientDataHash", "", "isAutoSelectAllowed", "", "preferImmediatelyAvailableCredentials", "displayInfo", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "origin", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "isConditional", "<init>", "(Ljava/lang/String;[BZZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Z)V", "(Ljava/lang/String;[BZLjava/lang/String;ZZ)V", "preferDefaultProvider", "(Ljava/lang/String;[BZLjava/lang/String;Ljava/lang/String;Z)V", "getRequestJson", "()Ljava/lang/String;", "getClientDataHash", "()[B", "()Z", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CreatePublicKeyCredentialRequest extends CreateCredentialRequest {

    @NotNull
    public static final String BUNDLE_KEY_CLIENT_DATA_HASH = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";

    @NotNull
    public static final String BUNDLE_KEY_CONDITIONAL_CREATE = "androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST";

    @NotNull
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    @NotNull
    public static final String BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final byte[] clientDataHash;
    private final boolean isConditional;

    @NotNull
    private final String requestJson;

    /* JADX INFO: compiled from: CreatePublicKeyCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\b\rJ!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0002\b\u0014J'\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Landroidx/credentials/CreatePublicKeyCredentialRequest$Companion;", "", "<init>", "()V", "BUNDLE_KEY_CLIENT_DATA_HASH", "", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", "BUNDLE_KEY_CONDITIONAL_CREATE", "getRequestDisplayInfo", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "requestJson", "defaultProvider", "getRequestDisplayInfo$credentials", "toCredentialDataBundle", "Landroid/os/Bundle;", "clientDataHash", "", "toCredentialDataBundle$credentials", "toCandidateDataBundle", "toCandidateDataBundle$credentials", "createFrom", "Landroidx/credentials/CreatePublicKeyCredentialRequest;", "data", "origin", "candidateQueryData", "createFrom$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials$default(Companion companion, String str, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            return companion.getRequestDisplayInfo$credentials(str, str2);
        }

        public static /* synthetic */ Bundle toCredentialDataBundle$credentials$default(Companion companion, String str, byte[] bArr, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bArr = null;
            }
            return companion.toCredentialDataBundle$credentials(str, bArr);
        }

        @JvmStatic
        @RequiresApi(23)
        @NotNull
        public final CreatePublicKeyCredentialRequest createFrom$credentials(@NotNull Bundle data, @Nullable String origin, @NotNull Bundle candidateQueryData) throws FrameworkClassParsingException {
            CreateCredentialRequest.DisplayInfo requestDisplayInfo$credentials$default;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                Intrinsics.checkNotNull(string);
                byte[] byteArray = data.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                boolean z11 = data.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                try {
                    requestDisplayInfo$credentials$default = CreateCredentialRequest.DisplayInfo.INSTANCE.createFrom(data);
                } catch (IllegalArgumentException unused) {
                    requestDisplayInfo$credentials$default = getRequestDisplayInfo$credentials$default(this, string, null, 2, null);
                }
                return new CreatePublicKeyCredentialRequest(string, byteArray, data.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), z11, requestDisplayInfo$credentials$default, origin, data, candidateQueryData, data.getBoolean(CreatePublicKeyCredentialRequest.BUNDLE_KEY_CONDITIONAL_CREATE), null);
            } catch (Exception unused2) {
                throw new FrameworkClassParsingException();
            }
        }

        @JvmStatic
        @NotNull
        public final CreateCredentialRequest.DisplayInfo getRequestDisplayInfo$credentials(@NotNull String requestJson, @Nullable String defaultProvider) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
                String string = jSONObject.getString("name");
                String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                Intrinsics.checkNotNull(string);
                return new CreateCredentialRequest.DisplayInfo(string, string2, (Icon) null, defaultProvider);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        @JvmStatic
        @NotNull
        public final Bundle toCandidateDataBundle$credentials(@NotNull String requestJson, @Nullable byte[] clientDataHash) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        @JvmStatic
        @NotNull
        public final Bundle toCredentialDataBundle$credentials(@NotNull String requestJson, @Nullable byte[] clientDataHash) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE, CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePublicKeyCredentialRequest(@NotNull String requestJson) {
        this(requestJson, null, false, null, false, false, 62, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePublicKeyCredentialRequest(@NotNull String requestJson, @Nullable byte[] bArr) {
        this(requestJson, bArr, false, null, false, false, 60, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    @Nullable
    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    @NotNull
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX INFO: renamed from: isConditional, reason: from getter */
    public final boolean getIsConditional() {
        return this.isConditional;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePublicKeyCredentialRequest(@NotNull String requestJson, @Nullable byte[] bArr, boolean z11) {
        this(requestJson, bArr, z11, null, false, false, 56, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePublicKeyCredentialRequest(@NotNull String requestJson, @Nullable byte[] bArr, boolean z11, @Nullable String str) {
        this(requestJson, bArr, z11, str, false, false, 48, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePublicKeyCredentialRequest(@NotNull String requestJson, @Nullable byte[] bArr, boolean z11, @Nullable String str, boolean z12) {
        this(requestJson, bArr, z11, str, z12, false, 32, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z11, boolean z12, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, z11, z12, displayInfo, str2, bundle, bundle2, z13);
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z11, boolean z12, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, z11, z12, displayInfo, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? INSTANCE.toCredentialDataBundle$credentials(str, bArr) : bundle, (i11 & 128) != 0 ? INSTANCE.toCandidateDataBundle$credentials(str, bArr) : bundle2, (i11 & 256) != 0 ? false : z13);
    }

    private CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z11, boolean z12, CreateCredentialRequest.DisplayInfo displayInfo, String str2, Bundle bundle, Bundle bundle2, boolean z13) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle, bundle2, false, z11, displayInfo, str2, z12);
        this.requestJson = str;
        this.clientDataHash = bArr;
        this.isConditional = z13;
        if (!RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
        if (z13) {
            bundle2.putBoolean(BUNDLE_KEY_CONDITIONAL_CREATE, true);
            bundle.putBoolean(BUNDLE_KEY_CONDITIONAL_CREATE, true);
        }
    }

    public /* synthetic */ CreatePublicKeyCredentialRequest(String str, byte[] bArr, boolean z11, String str2, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : bArr, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreatePublicKeyCredentialRequest(@NotNull String requestJson, @Nullable byte[] bArr, boolean z11, @Nullable String str, boolean z12, boolean z13) {
        this(requestJson, bArr, z12, z11, Companion.getRequestDisplayInfo$credentials$default(INSTANCE, requestJson, null, 2, null), str, null, null, z13, 192, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialRequest(@NotNull String requestJson, @Nullable byte[] bArr, boolean z11, @Nullable String str, @Nullable String str2, boolean z12) {
        this(requestJson, bArr, z12, z11, INSTANCE.getRequestDisplayInfo$credentials(requestJson, str2), str, null, null, false, 448, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }
}
