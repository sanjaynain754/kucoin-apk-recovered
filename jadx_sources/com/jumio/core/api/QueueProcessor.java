package com.jumio.core.api;

import com.google.firebase.messaging.Constants;
import com.jumio.commons.log.Log;
import com.jumio.core.api.QueueProcessor;
import com.jumio.core.model.InvokeOnUiThread;
import com.jumio.core.model.Subscriber;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.network.ApiCall;
import com.jumio.core.scope.ScopeProviderInterface;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import jumio.core.C40574O2;
import jumio.core.C40656e3;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0017J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\u0016\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\u00172\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u000fJ\u0006\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u0017J\u001a\u0010'\u001a\u00020\u00172\u0012\u0010(\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00150)J\u0016\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020\"J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/jumio/core/api/QueueProcessor;", "Lcom/jumio/core/model/Subscriber;", "", "sendThread", "Ljava/util/concurrent/ExecutorService;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "apiCallSettings", "Lcom/jumio/core/network/ApiCallSettings;", "apiResult", "Lcom/jumio/core/network/ApiResult;", "<init>", "(Ljava/util/concurrent/ExecutorService;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/network/ApiResult;)V", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/jumio/core/models/ApiCallDataModel;", "queueLock", "executorService", "currentCallable", "Ljava/util/concurrent/Future;", "currentHead", "Lcom/jumio/core/network/ApiCall;", "proceed", "", "proceedDelayed", "delay", "", "onResult", DbParams.KEY_CHANNEL_RESULT, "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "checkHead", "removeFromQueue", "", "addToQueue", "c", "abort", "clear", "cleanFromQueue", "clazz", "Ljava/lang/Class;", "persist", "persistor", "Lcom/jumio/core/persistence/PersistenceUtil$Persist;", "restore", "restorer", "Lcom/jumio/core/persistence/PersistenceUtil$Restore;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQueueProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueueProcessor.kt\ncom/jumio/core/api/QueueProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1863#2,2:156\n*S KotlinDebug\n*F\n+ 1 QueueProcessor.kt\ncom/jumio/core/api/QueueProcessor\n*L\n130#1:156,2\n*E\n"})
public final class QueueProcessor implements Subscriber<Object> {

    /* JADX INFO: renamed from: a */
    public final ScopeProviderInterface f13698a;

    /* JADX INFO: renamed from: b */
    public final BackendManager f13699b;

    /* JADX INFO: renamed from: c */
    public final BackendManager f13700c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue f13701d;

    /* JADX INFO: renamed from: e */
    public final Object f13702e;

    /* JADX INFO: renamed from: f */
    public final ExecutorService f13703f;

    /* JADX INFO: renamed from: g */
    public Future f13704g;

    /* JADX INFO: renamed from: h */
    public ApiCall f13705h;

    /* JADX INFO: renamed from: a */
    public static final void m14497a(long j11, QueueProcessor queueProcessor) throws InterruptedException {
        Thread.sleep(j11);
        queueProcessor.f13704g = null;
        queueProcessor.f13698a.runOnMain(new C40656e3(queueProcessor, null));
    }

    @Override // com.jumio.core.model.Subscriber
    @InvokeOnUiThread(true)
    public void onResult(@Nullable Object result) {
        ApiCall apiCallM14498a = m14498a(true);
        if (apiCallM14498a == null) {
            return;
        }
        this.f13700c.onResult(apiCallM14498a.getApiCallDataModel(), result);
        m14501b();
    }

    public QueueProcessor(ExecutorService sendThread, ScopeProviderInterface scopeProvider, BackendManager apiCallSettings, BackendManager apiResult) {
        Intrinsics.checkNotNullParameter(sendThread, "sendThread");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiResult, "apiResult");
        this.f13698a = scopeProvider;
        this.f13699b = apiCallSettings;
        this.f13700c = apiResult;
        this.f13701d = new ConcurrentLinkedQueue();
        this.f13702e = new Object();
        this.f13703f = sendThread;
    }

    /* JADX INFO: renamed from: b */
    public final void m14501b() {
        synchronized (this.f13702e) {
            if (!this.f13701d.isEmpty() && this.f13704g == null) {
                ApiCallDataModel apiCallDataModel = (ApiCallDataModel) this.f13701d.peek();
                Object objNewInstance = apiCallDataModel.getCall().getDeclaredConstructor(InterfaceC40657f.class, ApiCallDataModel.class).newInstance(this.f13699b, apiCallDataModel);
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.jumio.core.network.ApiCall<*>");
                ApiCall apiCall = (ApiCall) objNewInstance;
                this.f13705h = apiCall;
                if (apiCall != null) {
                    Log.m14474i("QueueProcessor", "proceed() starting ".concat(apiCall.getClass().getSimpleName()));
                    Intrinsics.checkNotNull(apiCall, "null cannot be cast to non-null type com.jumio.core.model.Publisher<kotlin.Any>");
                    apiCall.add(this);
                    Future futureSubmit = this.f13703f.submit(this.f13705h);
                    Intrinsics.checkNotNull(futureSubmit, "null cannot be cast to non-null type java.util.concurrent.Future<com.jumio.core.network.ApiCall<*>>");
                    this.f13704g = futureSubmit;
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14502c() {
        synchronized (this.f13702e) {
            final long j11 = 250;
            this.f13704g = this.f13703f.submit(new Runnable() { // from class: i9.c
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    QueueProcessor.m14497a(j11, this);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.jumio.core.model.Subscriber
    @InvokeOnUiThread(true)
    public void onError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ApiCall apiCallM14498a = m14498a(false);
        if (apiCallM14498a == null) {
            return;
        }
        this.f13700c.onError(apiCallM14498a.getApiCallDataModel(), error);
    }

    /* JADX INFO: renamed from: a */
    public final ApiCall m14498a(boolean z11) {
        ApiCall apiCall;
        synchronized (this.f13702e) {
            try {
                if (this.f13705h != null && this.f13704g != null) {
                    Class<?> call = ((ApiCallDataModel) this.f13701d.peek()).getCall();
                    ApiCall apiCall2 = this.f13705h;
                    Intrinsics.checkNotNull(apiCall2);
                    if (call == apiCall2.getClass()) {
                        if (z11) {
                        }
                        apiCall = this.f13705h;
                    } else {
                        apiCall = null;
                    }
                    this.f13704g = null;
                    this.f13705h = null;
                    Unit unit = Unit.INSTANCE;
                    return apiCall;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14499a() {
        synchronized (this.f13702e) {
            try {
                try {
                    ApiCall apiCall = this.f13705h;
                    if (apiCall != null) {
                        apiCall.remove(this);
                    }
                    Future future = this.f13704g;
                    if (future != null) {
                        future.cancel(true);
                    }
                    this.f13704g = null;
                } catch (Exception unused) {
                    Unit unit = Unit.INSTANCE;
                    this.f13704g = null;
                }
            } catch (Throwable th2) {
                this.f13704g = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14500a(C40574O2 persistor, boolean z11) {
        Intrinsics.checkNotNullParameter(persistor, "persistor");
        synchronized (this.f13702e) {
            if (z11) {
                try {
                    m14499a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            persistor.m89207a(this.f13701d);
            Unit unit = Unit.INSTANCE;
        }
    }
}
