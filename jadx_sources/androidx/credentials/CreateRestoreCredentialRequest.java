package androidx.credentials;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CreateRestoreCredentialRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/CreateRestoreCredentialRequest;", "Landroidx/credentials/CreateCredentialRequest;", "requestJson", "", "isCloudBackupEnabled", "", "<init>", "(Ljava/lang/String;Z)V", "getRequestJson", "()Ljava/lang/String;", "()Z", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CreateRestoreCredentialRequest extends CreateCredentialRequest {

    @NotNull
    private static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST";

    @NotNull
    private static final String BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD = "androidx.credentials.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isCloudBackupEnabled;

    @NotNull
    private final String requestJson;

    /* JADX INFO: compiled from: CreateRestoreCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/CreateRestoreCredentialRequest$Companion;", "", "<init>", "()V", "BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST", "", "BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD", "getDisplayInfoFromJson", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "requestJson", "toCredentialDataBundle", "Landroid/os/Bundle;", "isCloudBackupEnabled", "", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CreateCredentialRequest.DisplayInfo getDisplayInfoFromJson(String requestJson) {
            try {
                String string = new JSONObject(requestJson).getJSONObject("user").getString("id");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return new CreateCredentialRequest.DisplayInfo(string, (CharSequence) null, 2, (DefaultConstructorMarker) null);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.id must be defined in requestJson");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle toCredentialDataBundle(String requestJson, boolean isCloudBackupEnabled) {
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialRequest.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST, requestJson);
            bundle.putBoolean(CreateRestoreCredentialRequest.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD, isCloudBackupEnabled);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateRestoreCredentialRequest(@NotNull String requestJson) {
        this(requestJson, false, 2, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    public /* synthetic */ CreateRestoreCredentialRequest(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? true : z11);
    }

    @NotNull
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX INFO: renamed from: isCloudBackupEnabled, reason: from getter */
    public final boolean getIsCloudBackupEnabled() {
        return this.isCloudBackupEnabled;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public CreateRestoreCredentialRequest(@NotNull String requestJson, boolean z11) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Companion companion = INSTANCE;
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, companion.toCredentialDataBundle(requestJson, z11), new Bundle(), false, false, companion.getDisplayInfoFromJson(requestJson), null, false);
        this.requestJson = requestJson;
        this.isCloudBackupEnabled = z11;
    }
}
