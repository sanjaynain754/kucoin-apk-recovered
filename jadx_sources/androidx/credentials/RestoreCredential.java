package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.RequestValidationHelper;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RestoreCredential.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Landroidx/credentials/RestoreCredential;", "Landroidx/credentials/Credential;", "authenticationResponseJson", "", "data", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getAuthenticationResponseJson", "()Ljava/lang/String;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class RestoreCredential extends Credential {

    @NotNull
    private static final String BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TYPE_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_RESTORE_CREDENTIAL";

    @NotNull
    private final String authenticationResponseJson;

    /* JADX INFO: compiled from: RestoreCredential.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/RestoreCredential$Companion;", "", "<init>", "()V", "createFrom", "Landroidx/credentials/RestoreCredential;", "data", "Landroid/os/Bundle;", "createFrom$credentials", "TYPE_RESTORE_CREDENTIAL", "", "BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final RestoreCredential createFrom$credentials(@NotNull Bundle data) throws NoCredentialException {
            Intrinsics.checkNotNullParameter(data, "data");
            String string = data.getString(RestoreCredential.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new RestoreCredential(string, data, null);
            }
            throw new NoCredentialException("The device does not contain a restore credential.");
        }
    }

    public /* synthetic */ RestoreCredential(String str, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }

    private RestoreCredential(String str, Bundle bundle) {
        super(TYPE_RESTORE_CREDENTIAL, bundle);
        this.authenticationResponseJson = str;
        if (!RequestValidationHelper.INSTANCE.isValidJSON(str)) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    @NotNull
    public final String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }
}
