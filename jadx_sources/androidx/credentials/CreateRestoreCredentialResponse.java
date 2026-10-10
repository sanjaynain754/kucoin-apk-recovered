package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.internal.RequestValidationHelper;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CreateRestoreCredentialResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/CreateRestoreCredentialResponse;", "Landroidx/credentials/CreateCredentialResponse;", "responseJson", "", "data", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;)V", "getResponseJson", "()Ljava/lang/String;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CreateRestoreCredentialResponse extends CreateCredentialResponse {

    @NotNull
    public static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String responseJson;

    /* JADX INFO: compiled from: CreateRestoreCredentialResponse.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/CreateRestoreCredentialResponse$Companion;", "", "<init>", "()V", "BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE", "", "createFrom", "Landroidx/credentials/CreateRestoreCredentialResponse;", "data", "Landroid/os/Bundle;", "toBundle", "responseJson", "toBundle$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final CreateRestoreCredentialResponse createFrom(@NotNull Bundle data) throws CreateCredentialUnknownException {
            Intrinsics.checkNotNullParameter(data, "data");
            String string = data.getString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new CreateRestoreCredentialResponse(string, data, null);
            }
            throw new CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
        }

        @JvmStatic
        @NotNull
        public final Bundle toBundle$credentials(@NotNull String responseJson) {
            Intrinsics.checkNotNullParameter(responseJson, "responseJson");
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE, responseJson);
            return bundle;
        }
    }

    public /* synthetic */ CreateRestoreCredentialResponse(String str, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }

    private CreateRestoreCredentialResponse(String str, Bundle bundle) {
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, bundle);
        this.responseJson = str;
        if (!RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final CreateRestoreCredentialResponse createFrom(@NotNull Bundle bundle) {
        return INSTANCE.createFrom(bundle);
    }

    @NotNull
    public final String getResponseJson() {
        return this.responseJson;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialResponse(@NotNull String responseJson) {
        this(responseJson, INSTANCE.toBundle$credentials(responseJson));
        Intrinsics.checkNotNullParameter(responseJson, "responseJson");
    }
}
