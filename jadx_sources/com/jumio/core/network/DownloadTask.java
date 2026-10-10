package com.jumio.core.network;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jumio.commons.log.Log;
import com.jumio.core.ServiceLocator;
import com.jumio.core.network.DownloadTask;
import java.io.InputStream;
import jumio.core.C40599T3;
import jumio.core.C40611W0;
import jumio.core.C40621Y0;
import jumio.core.C40626Z0;
import jumio.core.C40638b1;
import jumio.core.C40644c1;
import jumio.core.C40649d1;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002#$B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H¤@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\bJ\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00018\u0000H\u0082@¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0082@¢\u0006\u0002\u0010\u001eJ\b\u0010 \u001a\u00020\u0004H\u0016J\u0016\u0010!\u001a\u00020\u00192\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006%"}, m90084d2 = {"Lcom/jumio/core/network/DownloadTask;", "Result", "Lcom/jumio/core/network/MonitorableCall;", "url", "", "timeout", "", "callbackDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljava/lang/String;ILkotlinx/coroutines/CoroutineDispatcher;)V", "getCallbackDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "progressListener", "Lcom/jumio/core/network/DownloadTask$ProgressListener;", "getProgressListener", "()Lcom/jumio/core/network/DownloadTask$ProgressListener;", "setProgressListener", "(Lcom/jumio/core/network/DownloadTask$ProgressListener;)V", "processInputStream", "inputStream", "Ljava/io/InputStream;", SessionDescription.ATTR_LENGTH, "(Ljava/io/InputStream;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "", "dispatcher", "startSync", "()Ljava/lang/Object;", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doInBackground", "getCallId", "setListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "ProgressListener", "DefaultProgressListener", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class DownloadTask<Result> {

    /* JADX INFO: renamed from: a */
    public final String f14416a;

    /* JADX INFO: renamed from: b */
    public final int f14417b;

    /* JADX INFO: renamed from: c */
    public final AbstractC41697j0 f14418c;

    /* JADX INFO: renamed from: d */
    public ProgressListener f14419d;

    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H¦@¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H¦@¢\u0006\u0002\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/network/DownloadTask$ProgressListener;", "Result", "", "isRateLimitExceeded", "", "onProgressUpdate", "", "percent", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onProgressDone", "data", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onProgressException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface ProgressListener<Result> {
        boolean isRateLimitExceeded();

        @Nullable
        Object onProgressDone(@Nullable Result result, @NotNull Continuation<? super Unit> continuation);

        @Nullable
        Object onProgressException(@NotNull Exception exc, @NotNull Continuation<? super Unit> continuation);

        @Nullable
        Object onProgressUpdate(float f11, @NotNull Continuation<? super Unit> continuation);
    }

    public DownloadTask(@NotNull String url, int i11, @NotNull AbstractC41697j0 callbackDispatcher) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callbackDispatcher, "callbackDispatcher");
        this.f14416a = url;
        this.f14417b = i11;
        this.f14418c = callbackDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c4 A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:22:0x0061, B:41:0x00b5, B:48:0x00c4), top: B:67:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        if (r13 == r1) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m14576a(Continuation continuation) throws Throwable {
        C40621Y0 c40621y0;
        Object obj;
        Throwable th2;
        DownloadServiceInterface downloadServiceInterface;
        String str;
        DownloadServiceInterface downloadServiceInterface2;
        C40611W0 c40611w0;
        DownloadServiceInterface downloadServiceInterface3;
        if (continuation instanceof C40621Y0) {
            c40621y0 = (C40621Y0) continuation;
            int i11 = c40621y0.f90184g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40621y0.f90184g = i11 - Integer.MIN_VALUE;
            } else {
                c40621y0 = new C40621Y0(this, continuation);
            }
        } else {
            c40621y0 = new C40621Y0(this, continuation);
        }
        Object objM91049g = c40621y0.f90182e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40621y0.f90184g;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    int i13 = c40621y0.f90181d;
                    downloadServiceInterface2 = (DownloadServiceInterface) c40621y0.f90179b;
                    str = (String) c40621y0.f90178a;
                    try {
                        ResultKt.throwOnFailure(objM91049g);
                        downloadServiceInterface2 = downloadServiceInterface2;
                        str = str;
                        c40611w0 = (C40611W0) objM91049g;
                        i12 = c40611w0.f90155a;
                        if (i12 == 200) {
                            InputStream inputStream = c40611w0.f90157c;
                            int i14 = c40611w0.f90156b;
                            c40621y0.f90178a = SpillingKt.nullOutSpilledVariable(str);
                            c40621y0.f90179b = downloadServiceInterface2;
                            c40621y0.f90180c = SpillingKt.nullOutSpilledVariable(c40611w0);
                            c40621y0.f90181d = i12;
                            c40621y0.f90184g = 2;
                            objM91049g = processInputStream(inputStream, i14, c40621y0);
                            if (objM91049g != coroutine_suspended) {
                                downloadServiceInterface3 = downloadServiceInterface2;
                            }
                            return coroutine_suspended;
                        }
                        try {
                            downloadServiceInterface2.close();
                            return null;
                        } catch (Exception e11) {
                            e = e11;
                            obj = str;
                            Log.m14470e("DownloadTask", "", e);
                            AbstractC41697j0 abstractC41697j0 = this.f14418c;
                            C9309c c9309c = new C9309c(this, e, null);
                            c40621y0.f90178a = SpillingKt.nullOutSpilledVariable(obj);
                            c40621y0.f90179b = SpillingKt.nullOutSpilledVariable(e);
                            c40621y0.f90180c = null;
                            c40621y0.f90181d = i12;
                            c40621y0.f90184g = 3;
                            objM91049g = C41686h.m91049g(abstractC41697j0, c9309c, c40621y0);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        downloadServiceInterface = downloadServiceInterface2;
                        downloadServiceInterface.close();
                        throw th2;
                    }
                } else {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objM91049g);
                        return null;
                    }
                    int i15 = c40621y0.f90181d;
                    downloadServiceInterface = (DownloadServiceInterface) c40621y0.f90179b;
                    try {
                        ResultKt.throwOnFailure(objM91049g);
                        downloadServiceInterface3 = downloadServiceInterface;
                    } catch (Throwable th4) {
                        th2 = th4;
                        downloadServiceInterface.close();
                        throw th2;
                    }
                }
                downloadServiceInterface3.close();
                return objM91049g;
            }
            ResultKt.throwOnFailure(objM91049g);
            String callId = getCallId();
            i12 = 0;
            try {
                ProgressListener progressListener = this.f14419d;
                if (progressListener != null && progressListener.isRateLimitExceeded()) {
                    throw new C40599T3(429, "Throttling limit reached");
                }
                DownloadServiceInterface downloadServiceInterface4 = (DownloadServiceInterface) ServiceLocator.INSTANCE.getServiceImplementation(DownloadServiceInterface.class, new Function0() { // from class: t9.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DownloadTask.m14575a();
                    }
                });
                try {
                    String str2 = this.f14416a;
                    int i16 = this.f14417b;
                    c40621y0.f90178a = SpillingKt.nullOutSpilledVariable(callId);
                    c40621y0.f90179b = downloadServiceInterface4;
                    c40621y0.f90181d = 0;
                    c40621y0.f90184g = 1;
                    Object objDownload = downloadServiceInterface4.download(str2, i16, callId, c40621y0);
                    if (objDownload != coroutine_suspended) {
                        str = callId;
                        objM91049g = objDownload;
                        downloadServiceInterface2 = downloadServiceInterface4;
                        c40611w0 = (C40611W0) objM91049g;
                        i12 = c40611w0.f90155a;
                        if (i12 == 200) {
                            downloadServiceInterface2.close();
                            return null;
                        }
                        InputStream inputStream2 = c40611w0.f90157c;
                        int i17 = c40611w0.f90156b;
                        c40621y0.f90178a = SpillingKt.nullOutSpilledVariable(str);
                        c40621y0.f90179b = downloadServiceInterface2;
                        c40621y0.f90180c = SpillingKt.nullOutSpilledVariable(c40611w0);
                        c40621y0.f90181d = i12;
                        c40621y0.f90184g = 2;
                        objM91049g = processInputStream(inputStream2, i17, c40621y0);
                        if (objM91049g != coroutine_suspended) {
                            downloadServiceInterface3 = downloadServiceInterface2;
                            downloadServiceInterface3.close();
                            return objM91049g;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th5) {
                    th2 = th5;
                    downloadServiceInterface = downloadServiceInterface4;
                    downloadServiceInterface.close();
                    throw th2;
                }
            } catch (Exception e12) {
                e = e12;
                obj = callId;
                Log.m14470e("DownloadTask", "", e);
                AbstractC41697j0 abstractC41697j1 = this.f14418c;
                C9309c c9309c2 = new C9309c(this, e, null);
                c40621y0.f90178a = SpillingKt.nullOutSpilledVariable(obj);
                c40621y0.f90179b = SpillingKt.nullOutSpilledVariable(e);
                c40621y0.f90180c = null;
                c40621y0.f90181d = i12;
                c40621y0.f90184g = 3;
                objM91049g = C41686h.m91049g(abstractC41697j1, c9309c2, c40621y0);
            }
        } catch (Exception e13) {
            e = e13;
            obj = 1;
        }
    }

    @Nullable
    public abstract Object processInputStream(@NotNull InputStream inputStream, int i11, @NotNull Continuation<? super Result> continuation);

    public static /* synthetic */ void start$default(DownloadTask downloadTask, AbstractC41697j0 abstractC41697j0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i11 & 1) != 0) {
            abstractC41697j0 = C41782z0.m91392b();
        }
        downloadTask.start(abstractC41697j0);
    }

    @NotNull
    public String getCallId() {
        Intrinsics.checkNotNullExpressionValue("DownloadTask", "getSimpleName(...)");
        return "DownloadTask";
    }

    @NotNull
    /* JADX INFO: renamed from: getCallbackDispatcher, reason: from getter */
    public final AbstractC41697j0 getF14418c() {
        return this.f14418c;
    }

    @Nullable
    public final ProgressListener<Result> getProgressListener() {
        return this.f14419d;
    }

    public final void setListener(@Nullable ProgressListener<Result> listener) {
        this.f14419d = listener;
    }

    public final void setProgressListener(@Nullable ProgressListener<Result> progressListener) {
        this.f14419d = progressListener;
    }

    public final void start(@NotNull AbstractC41697j0 dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        C41696j.m91104d(C41713n0.m91125a(dispatcher), null, null, new C40644c1(this, null), 3, null);
    }

    @Nullable
    public final Result startSync() {
        return (Result) C41690i.m91067b(null, new C40649d1(this, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$execute(DownloadTask downloadTask, Continuation continuation) throws Throwable {
        C40626Z0 c40626z0;
        downloadTask.getClass();
        if (continuation instanceof C40626Z0) {
            c40626z0 = (C40626Z0) continuation;
            int i11 = c40626z0.f90197d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40626z0.f90197d = i11 - Integer.MIN_VALUE;
            } else {
                c40626z0 = new C40626Z0(downloadTask, continuation);
            }
        } else {
            c40626z0 = new C40626Z0(downloadTask, continuation);
        }
        Object objM14576a = c40626z0.f90195b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40626z0.f90197d;
        if (i12 != 0) {
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3) {
                    Object obj = c40626z0.f90194a;
                    ResultKt.throwOnFailure(objM14576a);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM14576a);
        } else {
            ResultKt.throwOnFailure(objM14576a);
            int i13 = downloadTask.f14417b;
            if (i13 != 0) {
                long j11 = i13;
                C40638b1 c40638b1 = new C40638b1(downloadTask, null);
                c40626z0.f90197d = 1;
                objM14576a = TimeoutKt.m90469d(j11, c40638b1, c40626z0);
                if (objM14576a != coroutine_suspended) {
                }
            } else {
                c40626z0.f90197d = 2;
                objM14576a = downloadTask.m14576a(c40626z0);
                if (objM14576a != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        AbstractC41697j0 abstractC41697j0 = downloadTask.f14418c;
        C9310d c9310d = new C9310d(downloadTask, objM14576a, null);
        c40626z0.f90194a = objM14576a;
        c40626z0.f90197d = 3;
        if (C41686h.m91049g(abstractC41697j0, c9310d, c40626z0) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM14576a;
    }

    public /* synthetic */ DownloadTask(String str, int i11, AbstractC41697j0 abstractC41697j0, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C41782z0.m91393c() : abstractC41697j0);
    }

    /* JADX INFO: renamed from: a */
    public static final DownloadServiceInterface m14575a() {
        return new DownloadService();
    }
}
