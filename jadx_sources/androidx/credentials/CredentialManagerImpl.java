package androidx.credentials;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialSecurityException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateProviderConfigurationException;
import androidx.credentials.internal.FormFactorHelper;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CredentialManagerImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0017J6\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u000fH\u0017J>\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000fH\u0016J8\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u001d0\u000fH\u0016J,\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u000fH\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020%H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Landroidx/credentials/CredentialManagerImpl;", "Landroidx/credentials/CredentialManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getCredentialAsync", "", "request", "Landroidx/credentials/GetCredentialRequest;", "cancellationSignal", "Landroid/os/CancellationSignal;", "executor", "Ljava/util/concurrent/Executor;", TUIConstants.TUIChat.CALL_BACK, "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "pendingGetCredentialHandle", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "prepareGetCredentialAsync", "Landroidx/credentials/PrepareGetCredentialResponse;", "createCredentialAsync", "Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "clearCredentialStateAsync", "Landroidx/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "signalCredentialStateAsync", "Landroidx/credentials/SignalCredentialStateRequest;", "Landroidx/credentials/SignalCredentialStateResponse;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "isOriginAllowed", "", "createSettingsPendingIntent", "Landroid/app/PendingIntent;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
public final class CredentialManagerImpl implements CredentialManager {

    @NotNull
    private static final String INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS = "android.settings.CREDENTIAL_PROVIDER";

    @NotNull
    private static final String ORIGIN_PERMISSION = "android.permission.CREDENTIAL_MANAGER_SET_ORIGIN";

    @NotNull
    private final Context context;

    @Override // androidx.credentials.CredentialManager
    public void getCredentialAsync(@NotNull Context context, @NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(context), request, false, 2, null);
        if (bestAvailableProvider$default == null) {
            callback.onError(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider$default.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    public CredentialManagerImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean isOriginAllowed(Context context) {
        return Build.VERSION.SDK_INT < 34 || context.checkSelfPermission(ORIGIN_PERMISSION) == 0;
    }

    @Override // androidx.credentials.CredentialManager
    public void createCredentialAsync(@NotNull Context context, @NotNull CreateCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(this.context), request, false, 2, null);
        if (bestAvailableProvider$default == null) {
            callback.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (FormFactorHelper.isWear(context)) {
            callback.onError(new CreateCredentialUnsupportedException("createCredential is not supported on this device"));
        } else {
            bestAvailableProvider$default.onCreateCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    @RequiresApi(34)
    @NotNull
    public PendingIntent createSettingsPendingIntent() {
        Intent intent = new Intent(INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS);
        intent.setData(Uri.parse("package:" + this.context.getPackageName()));
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, intent, 67108864);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @Override // androidx.credentials.CredentialManager
    public void clearCredentialStateAsync(@NotNull ClearCredentialStateRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<Void, ClearCredentialException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(this.context), request.getRequestType(), false, 2, null);
        if (bestAvailableProvider$default == null) {
            callback.onError(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider$default.onClearCredential(request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    @RequiresApi(34)
    public void prepareGetCredentialAsync(@NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(this.context).getBestAvailableProvider(false);
        if (bestAvailableProvider == null) {
            callback.onError(new GetCredentialProviderConfigurationException("No Credential Manager provider found"));
        } else {
            bestAvailableProvider.onPrepareCredential(request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public void signalCredentialStateAsync(@NotNull SignalCredentialStateRequest request, @NotNull Executor executor, @NotNull CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (request.getOrigin() != null && !isOriginAllowed(this.context)) {
            callback.onError(new SignalCredentialSecurityException("Must have android.permissions.CREDENTIAL_MANAGER_SET_ORIGIN permission"));
        }
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(this.context), request, false, 2, null);
        if (bestAvailableProvider$default == null) {
            callback.onError(new SignalCredentialStateProviderConfigurationException("No Credential Manager provider found"));
        } else {
            bestAvailableProvider$default.onSignalCredentialState(request, executor, callback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    @RequiresApi(34)
    public void getCredentialAsync(@NotNull Context context, @NotNull PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(context).getBestAvailableProvider(false);
        if (bestAvailableProvider == null) {
            callback.onError(new GetCredentialProviderConfigurationException("No Credential Manager provider found"));
        } else {
            bestAvailableProvider.onGetCredential(context, pendingGetCredentialHandle, cancellationSignal, executor, callback);
        }
    }
}
