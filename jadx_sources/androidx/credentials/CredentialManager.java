package androidx.credentials;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CredentialManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 -2\u00020\u0001:\u0001-J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0097@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0097@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ>\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0!H&J>\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0!H'J6\u0010#\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\"0!H'J>\u0010$\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020%0!H&J8\u0010&\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020(0!H&J,\u0010)\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020*0!H\u0016J\b\u0010+\u001a\u00020,H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, m90084d2 = {"Landroidx/credentials/CredentialManager;", "", "getCredential", "Landroidx/credentials/GetCredentialResponse;", "context", "Landroid/content/Context;", "request", "Landroidx/credentials/GetCredentialRequest;", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pendingGetCredentialHandle", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "(Landroid/content/Context;Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareGetCredential", "Landroidx/credentials/PrepareGetCredentialResponse;", "(Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCredential", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/CreateCredentialRequest;", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCredentialState", "", "Landroidx/credentials/ClearCredentialStateRequest;", "(Landroidx/credentials/ClearCredentialStateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signalCredentialState", "Landroidx/credentials/SignalCredentialStateResponse;", "Landroidx/credentials/SignalCredentialStateRequest;", "(Landroidx/credentials/SignalCredentialStateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCredentialAsync", "cancellationSignal", "Landroid/os/CancellationSignal;", "executor", "Ljava/util/concurrent/Executor;", TUIConstants.TUIChat.CALL_BACK, "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/exceptions/GetCredentialException;", "prepareGetCredentialAsync", "createCredentialAsync", "Landroidx/credentials/exceptions/CreateCredentialException;", "clearCredentialStateAsync", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "signalCredentialStateAsync", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "createSettingsPendingIntent", "Landroid/app/PendingIntent;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SuppressLint({"ObsoleteSdkInt"})
@SourceDebugExtension({"SMAP\nCredentialManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,547:1\n351#2,11:548\n351#2,11:559\n351#2,11:570\n351#2,11:581\n351#2,11:592\n351#2,11:603\n*S KotlinDebug\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n*L\n111#1:548,11\n164#1:559,11\n210#1:570,11\n260#1:581,11\n312#1:592,11\n359#1:603,11\n*E\n"})
public interface CredentialManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: CredentialManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/CredentialManager$Companion;", "", "<init>", "()V", "create", "Landroidx/credentials/CredentialManager;", "context", "Landroid/content/Context;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @JvmStatic
        @NotNull
        public final CredentialManager create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialManagerImpl(context);
        }

        private Companion() {
        }
    }

    static /* synthetic */ Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, GetCredentialRequest getCredentialRequest, Continuation<? super GetCredentialResponse> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$getCredential$2$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.getCredentialAsync(context, getCredentialRequest, cancellationSignal, new ExecutorC1980h(), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (c41716o.isActive()) {
                    InterfaceC41708m<GetCredentialResponse> interfaceC41708m = c41716o;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(GetCredentialResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (c41716o.isActive()) {
                    c41716o.resumeWith(Result.m103844constructorimpl(result));
                }
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    void clearCredentialStateAsync(@NotNull ClearCredentialStateRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<Void, ClearCredentialException> callback);

    void createCredentialAsync(@NotNull Context context, @NotNull CreateCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> callback);

    @RequiresApi(34)
    @NotNull
    PendingIntent createSettingsPendingIntent();

    @Nullable
    default Object getCredential(@NotNull Context context, @NotNull GetCredentialRequest getCredentialRequest, @NotNull Continuation<? super GetCredentialResponse> continuation) {
        return getCredential$suspendImpl(this, context, getCredentialRequest, continuation);
    }

    void getCredentialAsync(@NotNull Context context, @NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback);

    @RequiresApi(34)
    void getCredentialAsync(@NotNull Context context, @NotNull PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<GetCredentialResponse, GetCredentialException> callback);

    @RequiresApi(34)
    void prepareGetCredentialAsync(@NotNull GetCredentialRequest request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> callback);

    static /* synthetic */ Object clearCredentialState$suspendImpl(CredentialManager credentialManager, ClearCredentialStateRequest clearCredentialStateRequest, Continuation<? super Unit> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.clearCredentialStateAsync(clearCredentialStateRequest, cancellationSignal, new ExecutorC1980h(), new CredentialManagerCallback<Void, ClearCredentialException>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(ClearCredentialException e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (c41716o.isActive()) {
                    InterfaceC41708m<Unit> interfaceC41708m = c41716o;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(Void result) {
                if (c41716o.isActive()) {
                    InterfaceC41708m<Unit> interfaceC41708m = c41716o;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC41708m.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
                }
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @JvmStatic
    @NotNull
    static CredentialManager create(@NotNull Context context) {
        return INSTANCE.create(context);
    }

    static /* synthetic */ Object createCredential$suspendImpl(CredentialManager credentialManager, Context context, CreateCredentialRequest createCredentialRequest, Continuation<? super CreateCredentialResponse> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$createCredential$2$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.createCredentialAsync(context, createCredentialRequest, cancellationSignal, new ExecutorC1980h(), new CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException>() { // from class: androidx.credentials.CredentialManager$createCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(CreateCredentialException e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (c41716o.isActive()) {
                    InterfaceC41708m<CreateCredentialResponse> interfaceC41708m = c41716o;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(CreateCredentialResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (c41716o.isActive()) {
                    c41716o.resumeWith(Result.m103844constructorimpl(result));
                }
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    @RequiresApi(34)
    static /* synthetic */ Object prepareGetCredential$suspendImpl(CredentialManager credentialManager, GetCredentialRequest getCredentialRequest, Continuation<? super PrepareGetCredentialResponse> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$prepareGetCredential$2$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.prepareGetCredentialAsync(getCredentialRequest, cancellationSignal, new ExecutorC1980h(), new CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$prepareGetCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (c41716o.isActive()) {
                    InterfaceC41708m<PrepareGetCredentialResponse> interfaceC41708m = c41716o;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(PrepareGetCredentialResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (c41716o.isActive()) {
                    c41716o.resumeWith(Result.m103844constructorimpl(result));
                }
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    static /* synthetic */ Object signalCredentialState$suspendImpl(CredentialManager credentialManager, SignalCredentialStateRequest signalCredentialStateRequest, Continuation<? super SignalCredentialStateResponse> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        credentialManager.signalCredentialStateAsync(signalCredentialStateRequest, new ExecutorC1980h(), new CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException>() { // from class: androidx.credentials.CredentialManager$signalCredentialState$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(SignalCredentialStateException e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (c41716o.isActive()) {
                    InterfaceC41708m<SignalCredentialStateResponse> interfaceC41708m = c41716o;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(SignalCredentialStateResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (c41716o.isActive()) {
                    c41716o.resumeWith(Result.m103844constructorimpl(result));
                }
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    @RequiresApi(34)
    @Nullable
    default Object getCredential(@NotNull Context context, @NotNull PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, @NotNull Continuation<? super GetCredentialResponse> continuation) {
        return getCredential$suspendImpl(this, context, pendingGetCredentialHandle, continuation);
    }

    @Nullable
    default Object clearCredentialState(@NotNull ClearCredentialStateRequest clearCredentialStateRequest, @NotNull Continuation<? super Unit> continuation) {
        return clearCredentialState$suspendImpl(this, clearCredentialStateRequest, continuation);
    }

    @Nullable
    default Object createCredential(@NotNull Context context, @NotNull CreateCredentialRequest createCredentialRequest, @NotNull Continuation<? super CreateCredentialResponse> continuation) {
        return createCredential$suspendImpl(this, context, createCredentialRequest, continuation);
    }

    @RequiresApi(34)
    @Nullable
    default Object prepareGetCredential(@NotNull GetCredentialRequest getCredentialRequest, @NotNull Continuation<? super PrepareGetCredentialResponse> continuation) {
        return prepareGetCredential$suspendImpl(this, getCredentialRequest, continuation);
    }

    @Nullable
    default Object signalCredentialState(@NotNull SignalCredentialStateRequest signalCredentialStateRequest, @NotNull Continuation<? super SignalCredentialStateResponse> continuation) {
        return signalCredentialState$suspendImpl(this, signalCredentialStateRequest, continuation);
    }

    default void signalCredentialStateAsync(@NotNull SignalCredentialStateRequest request, @NotNull Executor executor, @NotNull CredentialManagerCallback<SignalCredentialStateResponse, SignalCredentialStateException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @RequiresApi(34)
    static /* synthetic */ Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, Continuation<? super GetCredentialResponse> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$getCredential$4$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.getCredentialAsync(context, pendingGetCredentialHandle, cancellationSignal, new ExecutorC1980h(), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$4$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (c41716o.isActive()) {
                    InterfaceC41708m<GetCredentialResponse> interfaceC41708m = c41716o;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(GetCredentialResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (c41716o.isActive()) {
                    c41716o.resumeWith(Result.m103844constructorimpl(result));
                }
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }
}
