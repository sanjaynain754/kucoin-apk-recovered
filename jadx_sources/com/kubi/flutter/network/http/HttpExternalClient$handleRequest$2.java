package com.kubi.flutter.network.http;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import p263fg.InterfaceC37457f;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HttpExternalClient.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/Object;"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "com.kubi.flutter.network.http.HttpExternalClient$handleRequest$2", m90122f = "HttpExternalClient.kt", m90123i = {}, m90124l = {78}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nHttpExternalClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpExternalClient.kt\ncom/kubi/flutter/network/http/HttpExternalClient$handleRequest$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,77:1\n314#2,11:78\n*S KotlinDebug\n*F\n+ 1 HttpExternalClient.kt\ncom/kubi/flutter/network/http/HttpExternalClient$handleRequest$2\n*L\n57#1:78,11\n*E\n"})
public final class HttpExternalClient$handleRequest$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Object>, Object> {
    final /* synthetic */ Object $arguments;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HttpExternalClient this$0;

    /* JADX INFO: renamed from: com.kubi.flutter.network.http.HttpExternalClient$handleRequest$2$a */
    /* JADX INFO: compiled from: HttpExternalClient.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C12607a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Call f22011b;

        public C12607a(Call call) {
            this.f22011b = call;
        }

        /* JADX INFO: renamed from: a */
        public final void m23816a(Throwable th2) {
            this.f22011b.cancel();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m23816a(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.network.http.HttpExternalClient$handleRequest$2$b */
    /* JADX INFO: compiled from: HttpExternalClient.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"com/kubi/flutter/network/http/HttpExternalClient$handleRequest$2$b", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "exception", "", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C12608b implements Callback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<Object> f22012b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HttpExternalClient f22013c;

        public C12608b(InterfaceC41708m<Object> interfaceC41708m, HttpExternalClient httpExternalClient) {
            this.f22012b = interfaceC41708m;
            this.f22013c = httpExternalClient;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException exception) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(exception, "exception");
            InterfaceC41708m<Object> interfaceC41708m = this.f22012b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exception)));
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                InterfaceC41708m<Object> interfaceC41708m = this.f22012b;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(this.f22013c.channelCodec.mo84246b(response)));
            } catch (Throwable th2) {
                InterfaceC41708m<Object> interfaceC41708m2 = this.f22012b;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC41708m2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
            }
        }
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Object> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<Object>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpExternalClient$handleRequest$2(HttpExternalClient httpExternalClient, Object obj, Continuation<? super HttpExternalClient$handleRequest$2> continuation) {
        super(2, continuation);
        this.this$0 = httpExternalClient;
        this.$arguments = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HttpExternalClient$handleRequest$2(this.this$0, this.$arguments, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<Object> continuation) {
        return ((HttpExternalClient$handleRequest$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HttpExternalClient httpExternalClient = this.this$0;
        Object obj2 = this.$arguments;
        this.L$0 = httpExternalClient;
        this.L$1 = obj2;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        OkHttpClient okHttpClient = httpExternalClient.networkClient;
        if (okHttpClient != null) {
            InterfaceC37457f interfaceC37457f = httpExternalClient.channelCodec;
            if (obj2 == null) {
                Result.Companion companion = Result.INSTANCE;
                c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new NullPointerException("arguments is null"))));
            } else {
                Call callNewCall = okHttpClient.newCall(interfaceC37457f.mo84244a(obj2));
                if (callNewCall != null) {
                    c41716o.mo91119t(new C12607a(callNewCall));
                    FirebasePerfOkHttpClient.enqueue(callNewCall, new C12608b(c41716o, httpExternalClient));
                }
            }
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objM91171w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91171w;
    }
}
