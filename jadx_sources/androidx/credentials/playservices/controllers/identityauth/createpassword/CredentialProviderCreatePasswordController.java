package androidx.credentials.playservices.controllers.identityauth.createpassword;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePasswordResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CredentialProviderCreatePasswordController.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0015\b\u0000\u0018\u0000 %2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ6\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0017J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0004H\u0017¢\u0006\u0002\u0010$R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u000eR\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006&"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/CreatePasswordRequest;", "Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", TUIConstants.TUIChat.CALL_BACK, "Landroidx/credentials/CredentialManagerCallback;", "getCallback$annotations", "()V", "executor", "Ljava/util/concurrent/Executor;", "cancellationSignal", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "resultReceiver", "androidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$resultReceiver$1", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$resultReceiver$1;", "invokePlayServices", "request", "fromGmsException", "e", "", "handleResponse", "uniqueRequestCode", "", "resultCode", "handleResponse$credentials_play_services_auth", "convertRequestToPlayServices", "convertResponseToCredentialManager", "response", "(Lkotlin/Unit;)Landroidx/credentials/CreateCredentialResponse;", "Companion", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<CreatePasswordRequest, SavePasswordRequest, Unit, CreateCredentialResponse, CreateCredentialException> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "CreatePassword";
    private CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    private Executor executor;

    @NotNull
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    /* JADX INFO: compiled from: CredentialProviderCreatePasswordController.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$Companion;", "", "<init>", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;", "context", "Landroid/content/Context;", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final CredentialProviderCreatePasswordController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialProviderCreatePasswordController(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Executor executor;
                CredentialManagerCallback credentialManagerCallback;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
                C2027x4c19f34c c2027x4c19f34c = new C2027x4c19f34c(CredentialProviderBaseController.INSTANCE);
                Executor executor2 = this.this$0.executor;
                if (executor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor = null;
                } else {
                    executor = executor2;
                }
                CredentialManagerCallback credentialManagerCallback2 = this.this$0.callback;
                if (credentialManagerCallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(TUIConstants.TUIChat.CALL_BACK);
                    credentialManagerCallback = null;
                } else {
                    credentialManagerCallback = credentialManagerCallback2;
                }
                if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, c2027x4c19f34c, executor, credentialManagerCallback, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode);
            }
        };
    }

    private final CreateCredentialException fromGmsException(Throwable e11) {
        String str = ((e11 instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        return CredentialProviderBaseController.INSTANCE.m2665x9c497ce7(str, "During save password, found password failure response from one tap " + e11.getMessage());
    }

    @JvmStatic
    @NotNull
    public static final CredentialProviderCreatePasswordController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$0(CancellationSignal cancellationSignal, Function0 f11) {
        Intrinsics.checkNotNullParameter(f11, "f");
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$1(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final CreateCredentialException e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.c
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.handleResponse$lambda$1$0(this.f2378b, e11);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TUIConstants.TUIChat.CALL_BACK);
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$2(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final CreateCredentialResponse createCredentialResponse) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.handleResponse$lambda$2$0(this.f2374b, createCredentialResponse);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialResponse createCredentialResponse) {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TUIConstants.TUIChat.CALL_BACK);
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onResult(createCredentialResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$0(CancellationSignal cancellationSignal, final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, SavePasswordResult savePasswordResult) {
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return Unit.INSTANCE;
        }
        Intent intent = new Intent(credentialProviderCreatePasswordController.context, (Class<?>) HiddenActivity.class);
        credentialProviderCreatePasswordController.generateHiddenActivityIntent(credentialProviderCreatePasswordController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, savePasswordResult.getPendingIntent());
        try {
            credentialProviderCreatePasswordController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0(this.f2380b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$0$0(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0$0(this.f2384b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TUIConstants.TUIChat.CALL_BACK);
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CancellationSignal cancellationSignal, Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        final CreateCredentialException createCredentialExceptionFromGmsException = credentialProviderCreatePasswordController.fromGmsException(e11);
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0(this.f2376b, createCredentialExceptionFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2$0(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final CreateCredentialException createCredentialException) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.l
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0$0(this.f2390b, createCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = credentialProviderCreatePasswordController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException(TUIConstants.TUIChat.CALL_BACK);
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @VisibleForTesting
    @NotNull
    public SavePasswordRequest convertRequestToPlayServices(@NotNull CreatePasswordRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        SavePasswordRequest savePasswordRequestBuild = SavePasswordRequest.builder().setSignInPassword(new SignInPassword(request.getId(), request.getPassword())).build();
        Intrinsics.checkNotNullExpressionValue(savePasswordRequestBuild, "build(...)");
        return savePasswordRequestBuild;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @VisibleForTesting
    @NotNull
    public CreateCredentialResponse convertResponseToCredentialManager(@NotNull Unit response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new CreatePasswordResponse();
    }

    public final void handleResponse$credentials_play_services_auth(int uniqueRequestCode, int resultCode) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode == companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.e
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$0((CancellationSignal) obj, (Function0) obj2);
                }
            }, new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$1(this.f2381b, (CreateCredentialException) obj);
                }
            }, this.cancellationSignal)) {
                return;
            }
            final CreateCredentialResponse createCredentialResponseConvertResponseToCredentialManager = convertResponseToCredentialManager(Unit.INSTANCE);
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$2(this.f2382b, createCredentialResponseConvertResponseToCredentialManager);
                }
            });
            return;
        }
        Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which does not match what was given " + uniqueRequestCode);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull CreatePasswordRequest request, @NotNull CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback, @NotNull Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        Task<SavePasswordResult> taskSavePassword = Identity.getCredentialSavingClient(this.context).savePassword(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$0(cancellationSignal, this, (SavePasswordResult) obj);
            }
        };
        taskSavePassword.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.j
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.k
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2(this.f2388a, cancellationSignal, exc);
            }
        });
    }

    @VisibleForTesting
    private static /* synthetic */ void getCallback$annotations() {
    }

    @VisibleForTesting
    private static /* synthetic */ void getCancellationSignal$annotations() {
    }
}
