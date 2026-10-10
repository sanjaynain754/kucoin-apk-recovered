package androidx.credentials;

import android.annotation.SuppressLint;
import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.p018os.OutcomeReceiver;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.core.os.C1708b;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.ClearCredentialUnsupportedException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.internal.ConversionUtilsKt;
import com.google.firebase.messaging.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CredentialProviderFrameworkImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(34)
@Metadata(m90083d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016J>\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u0011H\u0016J>\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u0011H\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0002J>\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u001d2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u0011H\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\n\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0003J\u0010\u0010%\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010'\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020(H\u0003J\b\u0010)\u001a\u00020*H\u0002J\u0015\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J\u0015\u0010/\u001a\u00020\u001f2\u0006\u0010,\u001a\u000200H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0002\b5J\u0015\u00106\u001a\u00020\u00122\u0006\u00103\u001a\u000207H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0019H\u0016J8\u0010:\u001a\u00020\t2\u0006\u0010\n\u001a\u00020;2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0012\u0004\u0012\u00020=0\u0011H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Landroidx/credentials/CredentialProviderFrameworkImpl;", "Landroidx/credentials/CredentialProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "credentialManager", "Landroid/credentials/CredentialManager;", "onPrepareCredential", "", "request", "Landroidx/credentials/GetCredentialRequest;", "cancellationSignal", "Landroid/os/CancellationSignal;", "executor", "Ljava/util/concurrent/Executor;", TUIConstants.TUIChat.CALL_BACK, "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/PrepareGetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "onGetCredential", "pendingGetCredentialHandle", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "Landroidx/credentials/GetCredentialResponse;", "isCredmanDisabled", "", "handleNullCredMan", "Lkotlin/Function0;", "onCreateCredential", "Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "convertCreateRequestToFrameworkClass", "Landroid/credentials/CreateCredentialRequest;", "setOriginForCreateRequest", "builder", "Landroid/credentials/CreateCredentialRequest$Builder;", "convertGetRequestToFrameworkClass", "Landroid/credentials/GetCredentialRequest;", "setOriginForGetRequest", "Landroid/credentials/GetCredentialRequest$Builder;", "createFrameworkClearCredentialRequest", "Landroid/credentials/ClearCredentialStateRequest;", "convertToJetpackGetException", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroid/credentials/GetCredentialException;", "convertToJetpackGetException$credentials", "convertToJetpackCreateException", "Landroid/credentials/CreateCredentialException;", "convertToJetpackCreateException$credentials", "convertGetResponseToJetpackClass", "response", "Landroid/credentials/GetCredentialResponse;", "convertGetResponseToJetpackClass$credentials", "convertPrepareGetResponseToJetpackClass", "Landroid/credentials/PrepareGetCredentialResponse;", "convertPrepareGetResponseToJetpackClass$credentials", "isAvailableOnDevice", "onClearCredential", "Landroidx/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCredentialProviderFrameworkImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialProviderFrameworkImpl.kt\nandroidx/credentials/CredentialProviderFrameworkImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1869#2,2:379\n*S KotlinDebug\n*F\n+ 1 CredentialProviderFrameworkImpl.kt\nandroidx/credentials/CredentialProviderFrameworkImpl\n*L\n261#1:379,2\n*E\n"})
public final class CredentialProviderFrameworkImpl implements CredentialProvider {

    @NotNull
    private static final String CREATE_DOM_EXCEPTION_PREFIX = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String GET_DOM_EXCEPTION_PREFIX = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";

    @NotNull
    private static final String TAG = "CredManProvService";

    @Nullable
    private final android.credentials.CredentialManager credentialManager;

    /* JADX INFO: compiled from: CredentialProviderFrameworkImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/CredentialProviderFrameworkImpl$Companion;", "", "<init>", "()V", "TAG", "", "GET_DOM_EXCEPTION_PREFIX", "CREATE_DOM_EXCEPTION_PREFIX", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(@NotNull Context context, @NotNull PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isCredmanDisabled(new Function0() { // from class: androidx.credentials.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onGetCredential$lambda$0(callback);
            }
        })) {
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$1
            public /* bridge */ /* synthetic */ void onError(Throwable th2) {
                onError(C1967c1.m2630a(th2));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(C1964b1.m2627a(obj));
            }

            public void onError(android.credentials.GetCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                callback.onError(this.convertToJetpackGetException$credentials(error));
            }

            public void onResult(android.credentials.GetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                callback.onResult(this.convertGetResponseToJetpackClass$credentials(response));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle = pendingGetCredentialHandle.getFrameworkHandle();
        Intrinsics.checkNotNull(frameworkHandle);
        credentialManager.getCredential(context, frameworkHandle, cancellationSignal, executor, (OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>) C1708b.m2427a(outcomeReceiver));
    }

    public CredentialProviderFrameworkImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.credentialManager = C2293x.m2789a(context.getSystemService(URLCredentialContract.FeedEntry.TABLE_NAME));
    }

    private final boolean isCredmanDisabled(Function0<Unit> handleNullCredMan) {
        if (this.credentialManager != null) {
            return false;
        }
        handleNullCredMan.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new ClearCredentialUnsupportedException("Your device doesn't support credential manager"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateCredential$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$1(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPrepareCredential$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return Unit.INSTANCE;
    }

    @NotNull
    public final CreateCredentialException convertToJetpackCreateException$credentials(@NotNull android.credentials.CreateCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return ConversionUtilsKt.toJetpackCreateException(type, error.getMessage());
    }

    @NotNull
    public final GetCredentialException convertToJetpackGetException$credentials(@NotNull android.credentials.GetCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return ConversionUtilsKt.toJetpackGetException(type, error.getMessage());
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @Override // androidx.credentials.CredentialProvider
    public void onCreateCredential(@NotNull Context context, @NotNull final CreateCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isCredmanDisabled(new Function0() { // from class: androidx.credentials.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onCreateCredential$lambda$0(callback);
            }
        })) {
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onCreateCredential$outcome$1
            public /* bridge */ /* synthetic */ void onError(Throwable th2) {
                onError(C2296y0.m2792a(th2));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(C1961a1.m2624a(obj));
            }

            public void onError(android.credentials.CreateCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                callback.onError(this.convertToJetpackCreateException$credentials(error));
            }

            public void onResult(android.credentials.CreateCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = callback;
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.INSTANCE;
                String type = request.getType();
                Bundle data = response.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                credentialManagerCallback.onResult(companion.createFrom(type, data));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.createCredential(context, convertCreateRequestToFrameworkClass(request, context), cancellationSignal, executor, C1708b.m2427a(outcomeReceiver));
    }

    private final android.credentials.CreateCredentialRequest convertCreateRequestToFrameworkClass(CreateCredentialRequest request, Context context) {
        C1987j0.m2649a();
        android.credentials.CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = C1984i0.m2646a(request.getType(), ConversionUtilsKt.getFinalCreateCredentialData(request, context), request.getCandidateQueryData()).setIsSystemProviderRequired(request.getIsSystemProviderRequired()).setAlwaysSendAppInfoToProvider(true);
        Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        setOriginForCreateRequest(request, alwaysSendAppInfoToProvider);
        android.credentials.CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        Intrinsics.checkNotNullExpressionValue(createCredentialRequestBuild, "build(...)");
        return createCredentialRequestBuild;
    }

    private final android.credentials.GetCredentialRequest convertGetRequestToFrameworkClass(GetCredentialRequest request) {
        C1978g0.m2641a();
        android.credentials.GetCredentialRequest.Builder builderM2635a = C1972e0.m2635a(GetCredentialRequest.INSTANCE.getRequestMetadataBundle(request));
        for (CredentialOption credentialOption : request.getCredentialOptions()) {
            C1981h0.m2643a();
            builderM2635a.addCredentialOption(C1975f0.m2638a(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.getIsSystemProviderRequired()).setAllowedProviders(credentialOption.getAllowedProviders()).build());
        }
        setOriginForGetRequest(request, builderM2635a);
        android.credentials.GetCredentialRequest getCredentialRequestBuild = builderM2635a.build();
        Intrinsics.checkNotNullExpressionValue(getCredentialRequestBuild, "build(...)");
        return getCredentialRequestBuild;
    }

    private final android.credentials.ClearCredentialStateRequest createFrameworkClearCredentialRequest() {
        C1969d0.m2632a();
        return C1966c0.m2629a(new Bundle());
    }

    @SuppressLint({"MissingPermission"})
    private final void setOriginForCreateRequest(CreateCredentialRequest request, android.credentials.CreateCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void setOriginForGetRequest(GetCredentialRequest request, android.credentials.GetCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    @NotNull
    public final GetCredentialResponse convertGetResponseToJetpackClass$credentials(@NotNull android.credentials.GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        android.credentials.Credential credential = response.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
        Credential.Companion companion = Credential.INSTANCE;
        String type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Bundle data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return new GetCredentialResponse(companion.createFrom(type, data));
    }

    @NotNull
    public final PrepareGetCredentialResponse convertPrepareGetResponseToJetpackClass$credentials(@NotNull android.credentials.PrepareGetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new PrepareGetCredentialResponse.Builder().setFrameworkResponse(response).setPendingGetCredentialHandle(new PrepareGetCredentialResponse.PendingGetCredentialHandle(response.getPendingGetCredentialHandle())).build();
    }

    @Override // androidx.credentials.CredentialProvider
    public void onClearCredential(@NotNull ClearCredentialStateRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final CredentialManagerCallback<Void, ClearCredentialException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Log.i(TAG, "In CredentialProviderFrameworkImpl onClearCredential");
        if (isCredmanDisabled(new Function0() { // from class: androidx.credentials.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onClearCredential$lambda$0(callback);
            }
        })) {
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onClearCredential$outcome$1
            public /* bridge */ /* synthetic */ void onError(Throwable th2) {
                onError(C2294x0.m2790a(th2));
            }

            public void onError(ClearCredentialStateException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
                callback.onError(new ClearCredentialUnknownException(null, 1, null));
            }

            public void onResult(Void response) {
                Log.i("CredManProvService", "Clear result returned from framework: ");
                callback.onResult(response);
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.clearCredentialState(createFrameworkClearCredentialRequest(), cancellationSignal, executor, C1708b.m2427a(outcomeReceiver));
    }

    @Override // androidx.credentials.CredentialProvider
    public void onPrepareCredential(@NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isCredmanDisabled(new Function0() { // from class: androidx.credentials.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onPrepareCredential$lambda$0(callback);
            }
        })) {
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1
            public /* bridge */ /* synthetic */ void onError(Throwable th2) {
                onError(C1967c1.m2630a(th2));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(C1970d1.m2633a(obj));
            }

            public void onError(android.credentials.GetCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                callback.onError(this.convertToJetpackGetException$credentials(error));
            }

            public void onResult(android.credentials.PrepareGetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                callback.onResult(this.convertPrepareGetResponseToJetpackClass$credentials(response));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.prepareGetCredential(convertGetRequestToFrameworkClass(request), cancellationSignal, executor, C1708b.m2427a(outcomeReceiver));
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(@NotNull Context context, @NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isCredmanDisabled(new Function0() { // from class: androidx.credentials.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CredentialProviderFrameworkImpl.onGetCredential$lambda$1(callback);
            }
        })) {
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$2
            public /* bridge */ /* synthetic */ void onError(Throwable th2) {
                onError(C1967c1.m2630a(th2));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(C1964b1.m2627a(obj));
            }

            public void onError(android.credentials.GetCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                callback.onError(this.convertToJetpackGetException$credentials(error));
            }

            public void onResult(android.credentials.GetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                callback.onResult(this.convertGetResponseToJetpackClass$credentials(response));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.getCredential(context, convertGetRequestToFrameworkClass(request), cancellationSignal, executor, (OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>) C1708b.m2427a(outcomeReceiver));
    }
}
