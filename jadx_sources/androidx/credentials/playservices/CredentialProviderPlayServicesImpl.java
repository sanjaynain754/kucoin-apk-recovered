package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreateDigitalCredentialRequest;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreateRestoreCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.CredentialProvider;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetDigitalCredentialOption;
import androidx.credentials.GetRestoreCredentialOption;
import androidx.credentials.SignalCredentialStateRequest;
import androidx.credentials.SignalCredentialStateResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateProviderConfigurationException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.IdentityCredentialManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: CredentialProviderPlayServicesImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0017J>\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0017H\u0017J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H\u0002J8\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020$2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&0\u0017H\u0016J,\u0010'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0017H\u0016J8\u0010+\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020$2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&0\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006-"}, m90084d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Landroidx/credentials/CredentialProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability$annotations", "()V", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "onGetCredential", "", "request", "Landroidx/credentials/GetCredentialRequest;", "cancellationSignal", "Landroid/os/CancellationSignal;", "executor", "Ljava/util/concurrent/Executor;", TUIConstants.TUIChat.CALL_BACK, "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "onCreateCredential", "Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "isAvailableOnDevice", "", "minApkVersion", "", "isGooglePlayServicesAvailable", "onClearCredential", "Landroidx/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onSignalCredentialState", "Landroidx/credentials/SignalCredentialStateRequest;", "Landroidx/credentials/SignalCredentialStateResponse;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "runFallbackClearCredFlow", "Companion", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class CredentialProviderPlayServicesImpl implements CredentialProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int MIN_GMS_APK_VERSION = 230815045;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;

    @NotNull
    private static final String TAG = "PlayServicesImpl";

    @NotNull
    private final Context context;

    @NotNull
    private GoogleApiAvailability googleApiAvailability;

    /* JADX INFO: compiled from: CredentialProviderPlayServicesImpl.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0000¢\u0006\u0002\b\u0012J\u0017\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "TAG", "", "MIN_GMS_APK_VERSION", "", "PRE_U_MIN_GMS_APK_VERSION", "MIN_GMS_APK_VERSION_RESTORE_CRED", "MIN_GMS_APK_VERSION_DIGITAL_CRED", "MIN_GMS_APK_VERSION_SIGNAL_API", "cancellationReviewerWithCallback", "", "cancellationSignal", "Landroid/os/CancellationSignal;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "cancellationReviewerWithCallback$credentials_play_services_auth", "cancellationReviewer", "", "cancellationReviewer$credentials_play_services_auth", "isGetSignInIntentRequest", "request", "Landroidx/credentials/GetCredentialRequest;", "isGetSignInIntentRequest$credentials_play_services_auth", "isGetRestoreCredentialRequest", "isGetRestoreCredentialRequest$credentials_play_services_auth", "isDigitalCredentialRequest", "isDigitalCredentialRequest$credentials_play_services_auth", "credentials-play-services-auth"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean cancellationReviewer$credentials_play_services_auth(@Nullable CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth(@Nullable CancellationSignal cancellationSignal, @NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth(@NotNull GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<CredentialOption> it = request.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GetDigitalCredentialOption) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth(@NotNull GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<CredentialOption> it = request.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GetRestoreCredentialOption) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth(@NotNull GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<CredentialOption> it = request.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GetSignInWithGoogleOption) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
        this.googleApiAvailability = googleApiAvailability;
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, minApkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.u
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(credentialManagerCallback);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$1(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Boolean bool) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0(executor, credentialManagerCallback);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$1$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.y
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    public static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Log.w(TAG, "Clearing restore credential failed", e11);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((e11 instanceof ApiException) && ((ApiException) e11).getStatusCode() == 40201) {
            objectRef.element = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0(executor, credentialManagerCallback, objectRef);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$3$0(Executor executor, final CredentialManagerCallback credentialManagerCallback, final Ref.ObjectRef objectRef) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.v
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0(credentialManagerCallback, objectRef);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(CredentialManagerCallback credentialManagerCallback, Ref.ObjectRef objectRef) {
        credentialManagerCallback.onError(objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$4(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, ClearCredentialStateResponse clearCredentialStateResponse) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0(executor, credentialManagerCallback);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$4$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.k
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateCredential$lambda$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.x
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(credentialManagerCallback);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.i
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(credentialManagerCallback);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$1(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(credentialManagerCallback);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSignalCredentialState$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new SignalCredentialStateProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    private final void runFallbackClearCredFlow(ClearCredentialStateRequest request, final CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback<Void, ClearCredentialException> callback) {
        Task<Void> taskSignOut = Identity.getSignInClient(this.context).signOut();
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, callback, (Void) obj);
            }
        };
        taskSignOut.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.r
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.s
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2(this.f2609a, cancellationSignal, executor, callback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Void r11) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0(executor, credentialManagerCallback);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0$0(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.z
            @Override // java.lang.Runnable
            public final void run() {
                credentialManagerCallback.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, final Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0(e11, executor, credentialManagerCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$2$0$0(final Exception exc, Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.j
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0(credentialManagerCallback, exc);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(CredentialManagerCallback credentialManagerCallback, Exception exc) {
        credentialManagerCallback.onError(new ClearCredentialUnknownException(exc.getMessage()));
    }

    @NotNull
    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z11 = iIsGooglePlayServicesAvailable == 0;
        if (!z11) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable));
        }
        return z11;
    }

    @Override // androidx.credentials.CredentialProvider
    @RequiresApi(23)
    public void onCreateCredential(@NotNull Context context, @NotNull CreateCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (request instanceof CreatePasswordRequest) {
            if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                CreatePasswordCredentialController.INSTANCE.getInstance(context).invokePlayServices((CreatePasswordRequest) request, callback, executor, cancellationSignal);
                return;
            } else {
                CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((CreatePasswordRequest) request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (request instanceof CreatePublicKeyCredentialRequest) {
            if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = (CreatePublicKeyCredentialRequest) request;
                if (!createPublicKeyCredentialRequest.getIsConditional()) {
                    CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices(createPublicKeyCredentialRequest, callback, executor, cancellationSignal);
                    return;
                }
            }
            CreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((CreatePublicKeyCredentialRequest) request, callback, executor, cancellationSignal);
            return;
        }
        if (!(request instanceof CreateRestoreCredentialRequest)) {
            if (!(request instanceof CreateDigitalCredentialRequest)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            new CreateDigitalCredentialController(context).invokePlayServices((CreateDigitalCredentialRequest) request, callback, executor, cancellationSignal);
        } else if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
            new CredentialProviderCreateRestoreCredentialController(context).invokePlayServices((CreateRestoreCredentialRequest) request, callback, executor, cancellationSignal);
        } else {
            companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0(executor, callback);
                }
            });
        }
    }

    @Override // androidx.credentials.CredentialProvider
    @RequiresApi(23)
    public void onGetCredential(@NotNull Context context, @NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onGetCredential$lambda$0(executor, callback);
                    }
                });
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.l
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(executor, callback);
                    }
                });
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new GetCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else if (companion.isGetSignInIntentRequest$credentials_play_services_auth(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    public final void setGoogleApiAvailability(@NotNull GoogleApiAvailability googleApiAvailability) {
        Intrinsics.checkNotNullParameter(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }

    @Override // androidx.credentials.CredentialProvider
    public void onClearCredential(@NotNull final ClearCredentialStateRequest request, @Nullable final CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final CredentialManagerCallback<Void, ClearCredentialException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (Intrinsics.areEqual(request.getRequestType(), ClearCredentialStateRequest.TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.a0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(executor, callback);
                    }
                });
                return;
            }
            Task<Boolean> taskClearRestoreCredential = RestoreCredential.getRestoreCredentialClient(this.context).clearRestoreCredential(new ClearRestoreCredentialRequest(request.getRequestBundle()));
            final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(cancellationSignal, executor, callback, (Boolean) obj);
                }
            };
            Intrinsics.checkNotNull(taskClearRestoreCredential.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.b
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.c
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$3(cancellationSignal, executor, callback, exc);
                }
            }));
            return;
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Task<ClearCredentialStateResponse> taskClearCredentialState = IdentityCredentialManager.INSTANCE.getClient(this.context).clearCredentialState(new com.google.android.gms.identitycredentials.ClearCredentialStateRequest());
            final Function1 function2 = new Function1() { // from class: androidx.credentials.playservices.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(cancellationSignal, executor, callback, (ClearCredentialStateResponse) obj);
                }
            };
            Intrinsics.checkNotNull(taskClearCredentialState.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    function2.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.f
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$6(this.f2583a, request, cancellationSignal, executor, callback, exc);
                }
            }));
            return;
        }
        runFallbackClearCredFlow(request, cancellationSignal, executor, callback);
    }

    @Override // androidx.credentials.CredentialProvider
    public void onSignalCredentialState(@NotNull SignalCredentialStateRequest request, @NotNull Executor executor, @NotNull final CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_SIGNAL_API)) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.n
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.onSignalCredentialState$lambda$0(callback);
                }
            });
        } else {
            CredentialProviderController.invokePlayServices$default(SignalCredentialStateController.INSTANCE.getInstance(this.context), request, callback, executor, null, 8, null);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
