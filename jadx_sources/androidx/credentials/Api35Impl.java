package androidx.credentials;

import android.credentials.GetCredentialException;
import android.p018os.OutcomeReceiver;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkImplHelper;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CredentialManagerViewHandler.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(35)
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/Api35Impl;", "", "<init>", "()V", "setPendingGetCredentialRequest", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "request", "Landroidx/credentials/GetCredentialRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Landroidx/credentials/GetCredentialResponse;", "clearPendingGetCredentialRequest", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
final class Api35Impl {

    @NotNull
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public final void clearPendingGetCredentialRequest(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.clearPendingCredentialRequest();
    }

    public final void setPendingGetCredentialRequest(@NotNull View view, @NotNull GetCredentialRequest request, @NotNull final Function1<? super GetCredentialResponse, Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        view.setPendingCredentialRequest(FrameworkImplHelper.INSTANCE.convertGetRequestToFrameworkClass(request), new OutcomeReceiver() { // from class: androidx.credentials.Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1
            public void onError(GetCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Log.w("ViewHandler", "Error: " + error.getType() + " , " + error.getMessage());
            }

            public void onResult(android.credentials.GetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                callback.invoke(FrameworkImplHelper.INSTANCE.convertGetResponseToJetpackClass(response));
            }
        });
    }
}
