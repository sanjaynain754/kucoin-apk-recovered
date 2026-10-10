package androidx.credentials;

import android.os.Build;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CredentialManagerViewHandler.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"2\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"TAG", "", "value", "Landroidx/credentials/PendingGetCredentialRequest;", "pendingGetCredentialRequest", "Landroid/view/View;", "getPendingGetCredentialRequest$annotations", "(Landroid/view/View;)V", "getPendingGetCredentialRequest", "(Landroid/view/View;)Landroidx/credentials/PendingGetCredentialRequest;", "setPendingGetCredentialRequest", "(Landroid/view/View;Landroidx/credentials/PendingGetCredentialRequest;)V", "credentials"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@JvmName(name = "CredentialManagerViewHandler")
public final class CredentialManagerViewHandler {

    @NotNull
    private static final String TAG = "ViewHandler";

    @Nullable
    public static final PendingGetCredentialRequest getPendingGetCredentialRequest(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(C1958R.id.androidx_credential_pendingCredentialRequest);
        if (tag instanceof PendingGetCredentialRequest) {
            return (PendingGetCredentialRequest) tag;
        }
        return null;
    }

    public static final void setPendingGetCredentialRequest(@NotNull View view, @Nullable PendingGetCredentialRequest pendingGetCredentialRequest) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C1958R.id.androidx_credential_pendingCredentialRequest, pendingGetCredentialRequest);
        if (pendingGetCredentialRequest != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35 || (i11 == 34 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                Api35Impl.INSTANCE.setPendingGetCredentialRequest(view, pendingGetCredentialRequest.getRequest(), pendingGetCredentialRequest.getCallback());
                return;
            }
            return;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 35 || (i12 == 34 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            Api35Impl.INSTANCE.clearPendingGetCredentialRequest(view);
        }
    }

    public static /* synthetic */ void getPendingGetCredentialRequest$annotations(View view) {
    }
}
