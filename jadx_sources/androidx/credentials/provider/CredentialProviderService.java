package androidx.credentials.provider;

import android.os.CancellationSignal;
import android.p018os.OutcomeReceiver;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.C1708b;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.credentials.provider.utils.ClearCredentialUtil;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CredentialProviderService.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(34)
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"J*\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\"J*\u0010)\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\"J.\u0010-\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020.0\"H&J,\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010\"H&J,\u00102\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\"H&R\u001e\u0010\u0004\u001a\u00020\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00065"}, m90084d2 = {"Landroidx/credentials/provider/CredentialProviderService;", "Landroid/service/credentials/CredentialProviderService;", "<init>", "()V", "isTestMode", "", "()Z", "setTestMode", "(Z)V", "lastCreateRequest", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "getLastCreateRequest", "()Landroidx/credentials/provider/BeginCreateCredentialRequest;", "setLastCreateRequest", "(Landroidx/credentials/provider/BeginCreateCredentialRequest;)V", "lastGetRequest", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "getLastGetRequest", "()Landroidx/credentials/provider/BeginGetCredentialRequest;", "setLastGetRequest", "(Landroidx/credentials/provider/BeginGetCredentialRequest;)V", "lastClearRequest", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "getLastClearRequest", "()Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "setLastClearRequest", "(Landroidx/credentials/provider/ProviderClearCredentialStateRequest;)V", "onBeginGetCredential", "", "request", "Landroid/service/credentials/BeginGetCredentialRequest;", "cancellationSignal", "Landroid/os/CancellationSignal;", TUIConstants.TUIChat.CALL_BACK, "Landroid/os/OutcomeReceiver;", "Landroid/service/credentials/BeginGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "onBeginCreateCredential", "Landroid/service/credentials/BeginCreateCredentialRequest;", "Landroid/service/credentials/BeginCreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "onClearCredentialState", "Landroid/service/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "onClearCredentialStateRequest", "Landroidx/credentials/exceptions/ClearCredentialException;", "onBeginGetCredentialRequest", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "onBeginCreateCredentialRequest", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {
    private boolean isTestMode;

    @Nullable
    private ProviderClearCredentialStateRequest lastClearRequest;

    @Nullable
    private BeginCreateCredentialRequest lastCreateRequest;

    @Nullable
    private BeginGetCredentialRequest lastGetRequest;

    public abstract void onBeginCreateCredentialRequest(@NotNull BeginCreateCredentialRequest request, @NotNull CancellationSignal cancellationSignal, @NotNull OutcomeReceiver callback);

    public abstract void onBeginGetCredentialRequest(@NotNull BeginGetCredentialRequest request, @NotNull CancellationSignal cancellationSignal, @NotNull OutcomeReceiver callback);

    public abstract void onClearCredentialStateRequest(@NotNull ProviderClearCredentialStateRequest request, @NotNull CancellationSignal cancellationSignal, @NotNull OutcomeReceiver callback);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    @Nullable
    public final ProviderClearCredentialStateRequest getLastClearRequest() {
        return this.lastClearRequest;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    @Nullable
    public final BeginCreateCredentialRequest getLastCreateRequest() {
        return this.lastCreateRequest;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    @Nullable
    public final BeginGetCredentialRequest getLastGetRequest() {
        return this.lastGetRequest;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    /* JADX INFO: renamed from: isTestMode, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final void setLastClearRequest(@Nullable ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        this.lastClearRequest = providerClearCredentialStateRequest;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final void setLastCreateRequest(@Nullable BeginCreateCredentialRequest beginCreateCredentialRequest) {
        this.lastCreateRequest = beginCreateCredentialRequest;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final void setLastGetRequest(@Nullable BeginGetCredentialRequest beginGetCredentialRequest) {
        this.lastGetRequest = beginGetCredentialRequest;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final void setTestMode(boolean z11) {
        this.isTestMode = z11;
    }

    public final void onBeginCreateCredential(@NotNull android.service.credentials.BeginCreateCredentialRequest request, @NotNull CancellationSignal cancellationSignal, @NotNull final OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginCreateCredential$outcome$1
            public void onError(CreateCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                OutcomeReceiver outcomeReceiver2 = callback;
                C2186i.m2688a();
                outcomeReceiver2.onError(C2185h.m2687a(error.getType(), error.getMessage()));
            }

            public void onResult(BeginCreateCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                callback.onResult(BeginCreateCredentialUtil.INSTANCE.convertToFrameworkResponse(response));
            }
        };
        BeginCreateCredentialRequest beginCreateCredentialRequestConvertToJetpackRequest$credentials = BeginCreateCredentialUtil.INSTANCE.convertToJetpackRequest$credentials(request);
        if (this.isTestMode) {
            this.lastCreateRequest = beginCreateCredentialRequestConvertToJetpackRequest$credentials;
        }
        onBeginCreateCredentialRequest(beginCreateCredentialRequestConvertToJetpackRequest$credentials, cancellationSignal, C1708b.m2427a(outcomeReceiver));
    }

    public final void onBeginGetCredential(@NotNull android.service.credentials.BeginGetCredentialRequest request, @NotNull CancellationSignal cancellationSignal, @NotNull final OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BeginGetCredentialRequest beginGetCredentialRequestConvertToJetpackRequest$credentials = BeginGetCredentialUtil.INSTANCE.convertToJetpackRequest$credentials(request);
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginGetCredential$outcome$1
            public void onError(GetCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                OutcomeReceiver outcomeReceiver2 = callback;
                C2188k.m2690a();
                outcomeReceiver2.onError(C2187j.m2689a(error.getType(), error.getMessage()));
            }

            public void onResult(BeginGetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                callback.onResult(BeginGetCredentialUtil.INSTANCE.convertToFrameworkResponse(response));
            }
        };
        if (this.isTestMode) {
            this.lastGetRequest = beginGetCredentialRequestConvertToJetpackRequest$credentials;
        }
        onBeginGetCredentialRequest(beginGetCredentialRequestConvertToJetpackRequest$credentials, cancellationSignal, C1708b.m2427a(outcomeReceiver));
    }

    public final void onClearCredentialState(@NotNull ClearCredentialStateRequest request, @NotNull CancellationSignal cancellationSignal, @NotNull final OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onClearCredentialState$outcome$1
            public void onError(ClearCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                OutcomeReceiver outcomeReceiver2 = callback;
                C2190m.m2692a();
                outcomeReceiver2.onError(C2189l.m2691a(error.getType(), error.getMessage()));
            }

            public void onResult(Void response) {
                callback.onResult(response);
            }
        };
        ProviderClearCredentialStateRequest providerClearCredentialStateRequestConvertToJetpackRequest$credentials = ClearCredentialUtil.INSTANCE.convertToJetpackRequest$credentials(request);
        if (this.isTestMode) {
            this.lastClearRequest = providerClearCredentialStateRequestConvertToJetpackRequest$credentials;
        }
        onClearCredentialStateRequest(providerClearCredentialStateRequestConvertToJetpackRequest$credentials, cancellationSignal, C1708b.m2427a(outcomeReceiver));
    }
}
