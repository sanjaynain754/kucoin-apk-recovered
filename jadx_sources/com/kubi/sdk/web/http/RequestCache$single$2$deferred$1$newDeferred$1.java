package com.kubi.sdk.web.http;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: RequestCache.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u00020\u0003H\u008a@"}, m90084d2 = {"", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.web.http.RequestCache$single$2$deferred$1$newDeferred$1", m90122f = "RequestCache.kt", m90123i = {}, m90124l = {61}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RequestCache$single$2$deferred$1$newDeferred$1<V> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super V>, Object> {
    final /* synthetic */ Function1<Continuation<? super V>, Object> $action;
    final /* synthetic */ K $key;
    int label;
    final /* synthetic */ RequestCache<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RequestCache$single$2$deferred$1$newDeferred$1(Function1<? super Continuation<? super V>, ? extends Object> function1, RequestCache<K, V> requestCache, K k11, Continuation<? super RequestCache$single$2$deferred$1$newDeferred$1> continuation) {
        super(2, continuation);
        this.$action = function1;
        this.this$0 = requestCache;
        this.$key = k11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RequestCache$single$2$deferred$1$newDeferred$1(this.$action, this.this$0, this.$key, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super V> continuation) {
        return ((RequestCache$single$2$deferred$1$newDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super V>, Object> function1 = this.$action;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.this$0.singleCache.remove(this.$key);
            return obj;
        } catch (Throwable th2) {
            this.this$0.singleCache.remove(this.$key);
            throw th2;
        }
    }
}
