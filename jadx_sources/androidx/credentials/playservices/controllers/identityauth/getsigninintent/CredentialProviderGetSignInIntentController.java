package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
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
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: CredentialProviderGetSignInIntentController.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u001e\b\u0000\u0018\u0000 22 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00012B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ6\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0017J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0004H\u0014J\u0010\u0010)\u001a\u00020*2\u0006\u0010(\u001a\u00020\u0004H\u0007J'\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0002\b1R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u000eR\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u00063"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/GetCredentialRequest;", "Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", TUIConstants.TUIChat.CALL_BACK, "Landroidx/credentials/CredentialManagerCallback;", "getCallback$annotations", "()V", "getCallback", "()Landroidx/credentials/CredentialManagerCallback;", "setCallback", "(Landroidx/credentials/CredentialManagerCallback;)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "cancellationSignal", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "resultReceiver", "androidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1", "Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;", "invokePlayServices", "", "request", "fromGmsException", "e", "", "convertRequestToPlayServices", "convertResponseToCredentialManager", "response", "createGoogleIdCredential", "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "handleResponse", "uniqueRequestCode", "", "resultCode", "data", "Landroid/content/Intent;", "handleResponse$credentials_play_services_auth", "Companion", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController<GetCredentialRequest, GetSignInIntentRequest, SignInCredential, GetCredentialResponse, GetCredentialException> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "GetSignInIntent";
    public CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    public Executor executor;

    @NotNull
    private final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    /* JADX INFO: compiled from: CredentialProviderGetSignInIntentController.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$Companion;", "", "<init>", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController;", "context", "Landroid/content/Context;", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final CredentialProviderGetSignInIntentController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialProviderGetSignInIntentController(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new C2066xf12f72ff(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final GetCredentialException fromGmsException(Throwable e11) {
        String str = ((e11 instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        return CredentialProviderBaseController.INSTANCE.m2666x3c5129cd(str, "During get sign-in intent, failure response from one tap: " + e11.getMessage());
    }

    @JvmStatic
    @NotNull
    public static final CredentialProviderGetSignInIntentController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$0(CancellationSignal cancellationSignal, Function0 f11) {
        Intrinsics.checkNotNullParameter(f11, "f");
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$1(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialException e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.k
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$1$0(this.f2446b, e11);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$3(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, CancellationSignal cancellationSignal, Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        final GetCredentialException getCredentialExceptionFromGmsException = credentialProviderGetSignInIntentController.fromGmsException(e11);
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0(this.f2450b, getCredentialExceptionFromGmsException);
            }
        });
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @VisibleForTesting
    @NotNull
    public GetSignInIntentRequest convertRequestToPlayServices(@NotNull GetCredentialRequest request) throws GetCredentialUnsupportedException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.getCredentialOptions().size() != 1) {
            throw new GetCredentialUnsupportedException("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        CredentialOption credentialOption = request.getCredentialOptions().get(0);
        Intrinsics.checkNotNull(credentialOption, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        GetSignInWithGoogleOption getSignInWithGoogleOption = (GetSignInWithGoogleOption) credentialOption;
        GetSignInIntentRequest getSignInIntentRequestBuild = GetSignInIntentRequest.builder().setServerClientId(getSignInWithGoogleOption.getZza()).filterByHostedDomain(getSignInWithGoogleOption.getZzb()).setNonce(getSignInWithGoogleOption.getZzc()).build();
        Intrinsics.checkNotNullExpressionValue(getSignInIntentRequestBuild, "build(...)");
        return getSignInIntentRequestBuild;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public GetCredentialResponse convertResponseToCredentialManager(@NotNull SignInCredential response) throws GetCredentialUnknownException {
        GoogleIdTokenCredential googleIdTokenCredentialCreateGoogleIdCredential;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getGoogleIdToken() != null) {
            googleIdTokenCredentialCreateGoogleIdCredential = createGoogleIdCredential(response);
        } else {
            Log.w(TAG, "Credential returned but no google Id found");
            googleIdTokenCredentialCreateGoogleIdCredential = null;
        }
        if (googleIdTokenCredentialCreateGoogleIdCredential != null) {
            return new GetCredentialResponse(googleIdTokenCredentialCreateGoogleIdCredential);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    @NotNull
    public final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> getCallback() {
        CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback = this.callback;
        if (credentialManagerCallback != null) {
            return credentialManagerCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException(TUIConstants.TUIChat.CALL_BACK);
        return null;
    }

    @NotNull
    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("executor");
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.credentials.exceptions.GetCredentialInterruptedException] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
    public final void handleResponse$credentials_play_services_auth(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
        if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth(resultCode, new Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$0((CancellationSignal) obj, (Function0) obj2);
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$1(this.f2432b, (GetCredentialException) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.context).getSignInCredentialFromIntent(data);
            Intrinsics.checkNotNullExpressionValue(signInCredentialFromIntent, "getSignInCredentialFromIntent(...)");
            final GetCredentialResponse getCredentialResponseConvertResponseToCredentialManager = convertResponseToCredentialManager(signInCredentialFromIntent);
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.handleResponse$lambda$2(this.f2433b, getCredentialResponseConvertResponseToCredentialManager);
                }
            });
        } catch (GetCredentialException e11) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.handleResponse$lambda$4(this.f2437b, e11);
                }
            });
        } catch (ApiException e12) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new GetCredentialUnknownException(e12.getMessage());
            if (e12.getStatusCode() == 16) {
                objectRef.element = new GetCredentialCancellationException(e12.getMessage());
            } else if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(e12.getStatusCode()))) {
                objectRef.element = new GetCredentialInterruptedException(e12.getMessage());
            }
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.handleResponse$lambda$3(this.f2435b, objectRef);
                }
            });
        } catch (Throwable th2) {
            final GetCredentialUnknownException getCredentialUnknownException = new GetCredentialUnknownException(th2.getMessage());
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.handleResponse$lambda$5(this.f2439b, getCredentialUnknownException);
                }
            });
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull GetCredentialRequest request, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback, @NotNull Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        try {
            Task<PendingIntent> signInIntent = Identity.getSignInClient(this.context).getSignInIntent(convertRequestToPlayServices(request));
            final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1(cancellationSignal, this, (PendingIntent) obj);
                }
            };
            signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.q
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.r
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3(this.f2459a, cancellationSignal, exc);
                }
            });
        } catch (GetCredentialUnsupportedException e11) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$0(this.f2454b, e11);
                }
            });
        }
    }

    public final void setCallback(@NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        Intrinsics.checkNotNullParameter(credentialManagerCallback, "<set-?>");
        this.callback = credentialManagerCallback;
    }

    public final void setExecutor(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$2(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialResponse getCredentialResponse) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.s
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$2$0(this.f2461b, getCredentialResponse);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialResponse getCredentialResponse) {
        credentialProviderGetSignInIntentController.getCallback().onResult(getCredentialResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$3(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final Ref.ObjectRef objectRef) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.l
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$3$0(this.f2448b, objectRef);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleResponse$lambda$3$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Ref.ObjectRef objectRef) {
        credentialProviderGetSignInIntentController.getCallback().onError(objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$4(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.n
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$4$0(this.f2452b, getCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$5(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.j
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$5$0(this.f2444b, getCredentialUnknownException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialUnknownException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialUnsupportedException getCredentialUnsupportedException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.t
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$0$0(this.f2463b, getCredentialUnsupportedException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialUnsupportedException getCredentialUnsupportedException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialUnsupportedException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$1(CancellationSignal cancellationSignal, final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, PendingIntent result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return Unit.INSTANCE;
        }
        Intent intent = new Intent(credentialProviderGetSignInIntentController.context, (Class<?>) HiddenActivity.class);
        credentialProviderGetSignInIntentController.generateHiddenActivityIntent(credentialProviderGetSignInIntentController.resultReceiver, intent, CredentialProviderBaseController.SIGN_IN_INTENT_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, result);
        try {
            credentialProviderGetSignInIntentController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0(this.f2443b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$1$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0$0(this.f2431b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getCallback().onError(new GetCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$3$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0$0(this.f2441b, getCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$3$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialException);
    }

    @VisibleForTesting
    @NotNull
    public final GoogleIdTokenCredential createGoogleIdCredential(@NotNull SignInCredential response) throws GetCredentialUnknownException {
        Intrinsics.checkNotNullParameter(response, "response");
        GoogleIdTokenCredential.Builder builder = new GoogleIdTokenCredential.Builder();
        String id2 = response.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
        GoogleIdTokenCredential.Builder id3 = builder.setId(id2);
        try {
            String googleIdToken = response.getGoogleIdToken();
            Intrinsics.checkNotNull(googleIdToken);
            id3.setIdToken(googleIdToken);
            if (response.getDisplayName() != null) {
                id3.setDisplayName(response.getDisplayName());
            }
            if (response.getGivenName() != null) {
                id3.setGivenName(response.getGivenName());
            }
            if (response.getFamilyName() != null) {
                id3.setFamilyName(response.getFamilyName());
            }
            if (response.getPhoneNumber() != null) {
                id3.setPhoneNumber(response.getPhoneNumber());
            }
            if (response.getProfilePictureUri() != null) {
                id3.setProfilePictureUri(response.getProfilePictureUri());
            }
            return id3.build();
        } catch (Exception unused) {
            throw new GetCredentialUnknownException("When attempting to convert get response, null Google ID Token found");
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCallback$annotations() {
    }

    @VisibleForTesting
    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExecutor$annotations() {
    }
}
