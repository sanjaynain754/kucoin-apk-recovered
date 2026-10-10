package androidx.credentials.playservices.controllers;

import android.content.Intent;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.provider.PendingIntentHandler;
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

/* JADX INFO: compiled from: ResponseUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(23)
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils;", "", "<init>", "()V", "Companion", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ResponseUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "GetCredentialController";

    /* JADX INFO: compiled from: ResponseUtils.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils$Companion;", "", "<init>", "()V", "TAG", "", "handleGetCredentialResponse", "", "uniqueRequestCode", "", "resultCode", "data", "Landroid/content/Intent;", "executor", "Ljava/util/concurrent/Executor;", TUIConstants.TUIChat.CALL_BACK, "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "cancellationSignal", "Landroid/os/CancellationSignal;", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$0(CancellationSignal cancellationSignal, Function0 f11) {
            Intrinsics.checkNotNullParameter(f11, "f");
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f11);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$1(Executor executor, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            executor.execute(new Runnable() { // from class: e0.f
                @Override // java.lang.Runnable
                public final void run() {
                    credentialManagerCallback.onError(e11);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$2(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
            executor.execute(new Runnable() { // from class: e0.g
                @Override // java.lang.Runnable
                public final void run() {
                    ResponseUtils.Companion.handleGetCredentialResponse$lambda$2$0(credentialManagerCallback);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$2$0(CredentialManagerCallback credentialManagerCallback) {
            credentialManagerCallback.onError(new GetCredentialUnknownException("No provider data returned."));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$3(Executor executor, final CredentialManagerCallback credentialManagerCallback, final GetCredentialResponse getCredentialResponse) {
            executor.execute(new Runnable() { // from class: e0.e
                @Override // java.lang.Runnable
                public final void run() {
                    credentialManagerCallback.onResult(getCredentialResponse);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleGetCredentialResponse$lambda$4(Executor executor, final CredentialManagerCallback credentialManagerCallback, final GetCredentialException getCredentialException) {
            executor.execute(new Runnable() { // from class: e0.m
                @Override // java.lang.Runnable
                public final void run() {
                    ResponseUtils.Companion.handleGetCredentialResponse$lambda$4$0(credentialManagerCallback, getCredentialException);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$4$0(CredentialManagerCallback credentialManagerCallback, GetCredentialException getCredentialException) {
            if (getCredentialException == null) {
                getCredentialException = new GetCredentialUnknownException("No provider data returned");
            }
            credentialManagerCallback.onError(getCredentialException);
        }

        @JvmStatic
        public final void handleGetCredentialResponse(int uniqueRequestCode, int resultCode, @Nullable Intent data, @NotNull final Executor executor, @NotNull final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback, @Nullable CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
            if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
                Log.w(ResponseUtils.TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + uniqueRequestCode);
                return;
            }
            CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
            if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth(resultCode, new Function2() { // from class: e0.h
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResponseUtils.Companion.handleGetCredentialResponse$lambda$0((CancellationSignal) obj, (Function0) obj2);
                }
            }, new Function1() { // from class: e0.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ResponseUtils.Companion.handleGetCredentialResponse$lambda$1(executor, callback, (GetCredentialException) obj);
                }
            }, cancellationSignal)) {
                return;
            }
            if (data == null) {
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: e0.j
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$2(executor, callback);
                    }
                });
                return;
            }
            PendingIntentHandler.Companion companion3 = PendingIntentHandler.INSTANCE;
            final GetCredentialResponse getCredentialResponseRetrieveGetCredentialResponse = companion3.retrieveGetCredentialResponse(data);
            if (getCredentialResponseRetrieveGetCredentialResponse != null) {
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: e0.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$3(executor, callback, getCredentialResponseRetrieveGetCredentialResponse);
                    }
                });
            } else {
                final GetCredentialException getCredentialExceptionRetrieveGetCredentialException = companion3.retrieveGetCredentialException(data);
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: e0.l
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$4(executor, callback, getCredentialExceptionRetrieveGetCredentialException);
                    }
                });
            }
        }
    }

    @JvmStatic
    public static final void handleGetCredentialResponse(int i11, int i12, @Nullable Intent intent, @NotNull Executor executor, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, @Nullable CancellationSignal cancellationSignal) {
        INSTANCE.handleGetCredentialResponse(i11, i12, intent, executor, credentialManagerCallback, cancellationSignal);
    }
}
