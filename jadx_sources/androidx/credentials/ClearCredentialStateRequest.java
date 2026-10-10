package androidx.credentials;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClearCredentialStateRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/ClearCredentialStateRequest;", "", "requestType", "", "<init>", "(Ljava/lang/String;)V", "getRequestType", "()Ljava/lang/String;", "requestBundle", "Landroid/os/Bundle;", "getRequestBundle", "()Landroid/os/Bundle;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ClearCredentialStateRequest {

    @NotNull
    private static final String BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST";

    @NotNull
    public static final String TYPE_CLEAR_CREDENTIAL_STATE = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";

    @NotNull
    public static final String TYPE_CLEAR_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL";

    @NotNull
    private final Bundle requestBundle;

    @NotNull
    private final String requestType;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ClearCredentialStateRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public ClearCredentialStateRequest(@NotNull String requestType) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.requestType = requestType;
        Bundle bundle = new Bundle();
        this.requestBundle = bundle;
        if (Intrinsics.areEqual(requestType, TYPE_CLEAR_CREDENTIAL_STATE) || Intrinsics.areEqual(requestType, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            if (Intrinsics.areEqual(requestType, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
                bundle.putBoolean(BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST, true);
            }
        } else {
            throw new IllegalArgumentException("The request type " + requestType + " is not supported.");
        }
    }

    @NotNull
    public final Bundle getRequestBundle() {
        return this.requestBundle;
    }

    @NotNull
    public final String getRequestType() {
        return this.requestType;
    }

    public /* synthetic */ ClearCredentialStateRequest(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? TYPE_CLEAR_CREDENTIAL_STATE : str);
    }
}
