package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GetCredentialResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m90084d2 = {"Landroidx/credentials/GetCredentialResponse;", "", URLCredentialContract.FeedEntry.TABLE_NAME, "Landroidx/credentials/Credential;", "<init>", "(Landroidx/credentials/Credential;)V", "getCredential", "()Landroidx/credentials/Credential;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class GetCredentialResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_CREDENTIAL_DATA = "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA";

    @NotNull
    private static final String EXTRA_CREDENTIAL_TYPE = "androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE";

    @NotNull
    private final Credential credential;

    /* JADX INFO: compiled from: GetCredentialResponse.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/GetCredentialResponse$Companion;", "", "<init>", "()V", "EXTRA_CREDENTIAL_TYPE", "", "EXTRA_CREDENTIAL_DATA", "asBundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/GetCredentialResponse;", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final GetCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Bundle bundle2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString(GetCredentialResponse.EXTRA_CREDENTIAL_TYPE);
            if (string == null || (bundle2 = bundle.getBundle(GetCredentialResponse.EXTRA_CREDENTIAL_DATA)) == null) {
                return null;
            }
            return new GetCredentialResponse(Credential.INSTANCE.createFrom(string, bundle2));
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final Bundle asBundle(@NotNull GetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Bundle bundle = new Bundle();
            bundle.putString(GetCredentialResponse.EXTRA_CREDENTIAL_TYPE, response.getCredential().getType());
            bundle.putBundle(GetCredentialResponse.EXTRA_CREDENTIAL_DATA, response.getCredential().getData());
            return bundle;
        }
    }

    public GetCredentialResponse(@NotNull Credential credential) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        this.credential = credential;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Bundle asBundle(@NotNull GetCredentialResponse getCredentialResponse) {
        return INSTANCE.asBundle(getCredentialResponse);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final GetCredentialResponse fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @NotNull
    public final Credential getCredential() {
        return this.credential;
    }
}
