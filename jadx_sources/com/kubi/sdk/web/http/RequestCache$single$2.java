package com.kubi.sdk.web.http;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: RequestCache.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u00020\u0003H\u008a@"}, m90084d2 = {"", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.web.http.RequestCache$single$2", m90122f = "RequestCache.kt", m90123i = {0, 0}, m90124l = {129, 70}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nRequestCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCache.kt\ncom/kubi/sdk/web/http/RequestCache$single$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,123:1\n108#2,10:124\n*S KotlinDebug\n*F\n+ 1 RequestCache.kt\ncom/kubi/sdk/web/http/RequestCache$single$2\n*L\n53#1:124,10\n*E\n"})
public final class RequestCache$single$2<V> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super V>, Object> {
    final /* synthetic */ Function1<Continuation<? super V>, Object> $action;
    final /* synthetic */ K $key;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ RequestCache<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RequestCache$single$2(RequestCache<K, V> requestCache, K k11, Function1<? super Continuation<? super V>, ? extends Object> function1, Continuation<? super RequestCache$single$2> continuation) {
        super(2, continuation);
        this.this$0 = requestCache;
        this.$key = k11;
        this.$action = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RequestCache$single$2 requestCache$single$2 = new RequestCache$single$2(this.this$0, this.$key, this.$action, continuation);
        requestCache$single$2.L$0 = obj;
        return requestCache$single$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super V> continuation) {
        return ((RequestCache$single$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        InterfaceC44082a interfaceC44082a;
        RequestCache requestCache;
        Function1<Continuation<? super V>, Object> function1;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$4;
                obj2 = this.L$3;
                requestCache = (RequestCache) this.L$2;
                interfaceC44082a = (InterfaceC44082a) this.L$1;
                interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                interfaceC44082a = this.this$0.singleLock;
                requestCache = this.this$0;
                Object obj3 = this.$key;
                function1 = this.$action;
                this.L$0 = interfaceC41709m0;
                this.L$1 = interfaceC44082a;
                this.L$2 = requestCache;
                this.L$3 = obj3;
                this.L$4 = function1;
                this.label = 1;
                if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                    obj2 = obj3;
                }
                return coroutine_suspended;
            }
            InterfaceC41729r0 interfaceC41729r0M91102b = (InterfaceC41729r0) requestCache.singleCache.get(obj2);
            if (interfaceC41729r0M91102b == null) {
                interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new RequestCache$single$2$deferred$1$newDeferred$1(function1, requestCache, obj2, null), 3, null);
                requestCache.singleCache.put(obj2, interfaceC41729r0M91102b);
            }
            interfaceC44082a.mo91345e(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            Object objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
            if (objMo91198h == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objMo91198h;
        } catch (Throwable th2) {
            interfaceC44082a.mo91345e(null);
            throw th2;
        }
    }
}
