package com.kubi.kumex.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CoroutineEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.utils.CoroutineExKt$catchWithContext$2", m90122f = "CoroutineEx.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CoroutineExKt$catchWithContext$2<T> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super T>, Object> {
    final /* synthetic */ Function0<T> $action;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExKt$catchWithContext$2(Function0<? extends T> function0, String str, Continuation<? super CoroutineExKt$catchWithContext$2> continuation) {
        super(2, continuation);
        this.$action = function0;
        this.$source = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoroutineExKt$catchWithContext$2(this.$action, this.$source, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super T> continuation) {
        return ((CoroutineExKt$catchWithContext$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                return this.$action.invoke();
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                String str = this.$source;
                if (str != null) {
                    C37214b.m83255a(th2, str);
                    return null;
                }
                return null;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
