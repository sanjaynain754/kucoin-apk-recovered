package com.kubi.fingerprint;

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
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FingerprintInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/lang/String;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.fingerprint.FingerprintInterceptor$intercept$token$1", m90122f = "FingerprintInterceptor.kt", m90123i = {}, m90124l = {21}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FingerprintInterceptor$intercept$token$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ String $checkHeader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FingerprintInterceptor$intercept$token$1(String str, Continuation<? super FingerprintInterceptor$intercept$token$1> continuation) {
        super(2, continuation);
        this.$checkHeader = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FingerprintInterceptor$intercept$token$1(this.$checkHeader, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super String> continuation) {
        return ((FingerprintInterceptor$intercept$token$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            FingerprintManager fingerprintManager = FingerprintManager.a;
            String str = this.$checkHeader;
            this.label = 1;
            obj = fingerprintManager.k(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
