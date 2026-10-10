package retrofit2;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNullPointerException;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\b\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\tH\u0086\b¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00060\rj\u0002`\u000eH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m90084d2 = {"await", ExifInterface.GPS_DIRECTION_TRUE, "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "awaitResponse", "Lretrofit2/Response;", "create", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, m90085k = 2, m90086mv = {1, 1, 15})
@JvmName(name = "KotlinExtensions")
public final class KotlinExtensions {

    /* JADX INFO: renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1 */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@"}, m90084d2 = {"suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, m90085k = 3, m90086mv = {1, 1, 15})
    @DebugMetadata(m90121c = "retrofit2.KotlinExtensions", m90122f = "KotlinExtensions.kt", m90123i = {0}, m90124l = {113}, m90125m = "suspendAndThrow", m90126n = {"$this$suspendAndThrow"}, m90127s = {"L$0"})
    public static final class C440551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }

        public C440551(Continuation continuation) {
            super(continuation);
        }
    }

    public static final /* synthetic */ <T> T create(@NotNull Retrofit retrofit) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) retrofit.create(Object.class);
    }

    @Nullable
    public static final <T> Object await(@NotNull final Call<T> call, @NotNull Continuation<? super T> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t11) {
                InterfaceC41708m interfaceC41708m = c41716o;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(t11)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                if (response.isSuccessful()) {
                    T tBody = response.body();
                    if (tBody == null) {
                        Object objTag = call2.request().tag(Invocation.class);
                        if (objTag == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(objTag, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((Invocation) objTag).method();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Response from ");
                        Intrinsics.checkExpressionValueIsNotNull(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
                        sb2.append(declaringClass.getName());
                        sb2.append('.');
                        sb2.append(method.getName());
                        sb2.append(" was null but response body type was declared as non-null");
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
                        InterfaceC41708m interfaceC41708m = c41716o;
                        Result.Companion companion = Result.INSTANCE;
                        interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
                        return;
                    }
                    c41716o.resumeWith(Result.m103844constructorimpl(tBody));
                    return;
                }
                InterfaceC41708m interfaceC41708m2 = c41716o;
                HttpException httpException = new HttpException(response);
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC41708m2.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(httpException)));
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    @JvmName(name = "awaitNullable")
    @Nullable
    public static final <T> Object awaitNullable(@NotNull final Call<T> call, @NotNull Continuation<? super T> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t11) {
                InterfaceC41708m interfaceC41708m = c41716o;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(t11)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                if (response.isSuccessful()) {
                    c41716o.resumeWith(Result.m103844constructorimpl(response.body()));
                    return;
                }
                InterfaceC41708m interfaceC41708m = c41716o;
                HttpException httpException = new HttpException(response);
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(httpException)));
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    @Nullable
    public static final <T> Object awaitResponse(@NotNull final Call<T> call, @NotNull Continuation<? super Response<T>> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t11) {
                InterfaceC41708m interfaceC41708m = c41716o;
                Result.Companion companion = Result.INSTANCE;
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(t11)));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                c41716o.resumeWith(Result.m103844constructorimpl(response));
            }
        });
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object suspendAndThrow(@NotNull final Exception exc, @NotNull Continuation<?> continuation) {
        final C440551 c440551;
        if (continuation instanceof C440551) {
            c440551 = (C440551) continuation;
            int i11 = c440551.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c440551.label = i11 - Integer.MIN_VALUE;
            } else {
                c440551 = new C440551(continuation);
            }
        } else {
            c440551 = new C440551(continuation);
        }
        Object obj = c440551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c440551.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c440551.L$0 = exc;
            c440551.label = 1;
            C41782z0.m91391a().dispatch(c440551.get$context(), new Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    Continuation continuationIntercepted = IntrinsicsKt.intercepted(c440551);
                    Exception exc2 = exc;
                    Result.Companion companion = Result.INSTANCE;
                    continuationIntercepted.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exc2)));
                }
            });
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c440551);
            }
            if (coroutine_suspended2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
