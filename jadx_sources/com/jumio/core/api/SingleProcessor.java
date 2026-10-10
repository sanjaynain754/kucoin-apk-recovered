package com.jumio.core.api;

import com.google.firebase.messaging.Constants;
import com.jumio.core.model.Subscriber;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.network.ApiCall;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00102\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/jumio/core/api/SingleProcessor;", "Lcom/jumio/core/model/Subscriber;", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "apiCallSettings", "Lcom/jumio/core/network/ApiCallSettings;", "apiResult", "Lcom/jumio/core/network/ApiResult;", "<init>", "(Ljava/util/concurrent/ExecutorService;Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/network/ApiResult;)V", "call", "Lcom/jumio/core/network/ApiCall;", "currentCallable", "Ljava/util/concurrent/Future;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "", "execute", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "retry", "", "abort", "onResult", DbParams.KEY_CHANNEL_RESULT, "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "persist", "persistor", "Lcom/jumio/core/persistence/PersistenceUtil$Persist;", "restore", "restorer", "Lcom/jumio/core/persistence/PersistenceUtil$Restore;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSingleProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessor.kt\ncom/jumio/core/api/SingleProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public final class SingleProcessor implements Subscriber<Object> {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f13706a;

    /* JADX INFO: renamed from: b */
    public final BackendManager f13707b;

    /* JADX INFO: renamed from: c */
    public final BackendManager f13708c;

    /* JADX INFO: renamed from: d */
    public ApiCall f13709d;

    /* JADX INFO: renamed from: e */
    public Future f13710e;

    public SingleProcessor(ExecutorService executorService, BackendManager apiCallSettings, BackendManager apiResult) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiResult, "apiResult");
        this.f13706a = executorService;
        this.f13707b = apiCallSettings;
        this.f13708c = apiResult;
    }

    /* JADX INFO: renamed from: a */
    public final void m14503a(ApiCallDataModel apiCallDataModel) {
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (this.f13710e != null) {
            throw new IllegalArgumentException("Another call is being executed");
        }
        Object objNewInstance = apiCallDataModel.getCall().getDeclaredConstructor(InterfaceC40657f.class, ApiCallDataModel.class).newInstance(this.f13707b, apiCallDataModel);
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.jumio.core.network.ApiCall<*>");
        ApiCall apiCall = (ApiCall) objNewInstance;
        this.f13709d = apiCall;
        Intrinsics.checkNotNull(apiCall, "null cannot be cast to non-null type com.jumio.core.model.Publisher<kotlin.Any?>");
        apiCall.add(this);
        Future futureSubmit = this.f13706a.submit(this.f13709d);
        Intrinsics.checkNotNull(futureSubmit, "null cannot be cast to non-null type java.util.concurrent.Future<com.jumio.core.network.ApiCall<*>>");
        this.f13710e = futureSubmit;
    }

    @Override // com.jumio.core.model.Subscriber
    public void onError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ApiCall apiCall = this.f13709d;
        if (apiCall != null) {
            this.f13708c.onError(apiCall.getApiCallDataModel(), error);
        }
        this.f13710e = null;
    }

    @Override // com.jumio.core.model.Subscriber
    public void onResult(@Nullable Object result) {
        ApiCall apiCall = this.f13709d;
        if (apiCall != null) {
            this.f13708c.onResult(apiCall.getApiCallDataModel(), result);
        }
        this.f13710e = null;
    }
}
