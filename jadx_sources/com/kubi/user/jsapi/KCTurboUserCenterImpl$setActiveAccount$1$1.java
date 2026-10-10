package com.kubi.user.jsapi;

import com.facebook.react.bridge.ReadableMap;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCTurboUserCenterImpl.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.jsapi.KCTurboUserCenterImpl$setActiveAccount$1$1", m90122f = "KCTurboUserCenterImpl.kt", m90123i = {}, m90124l = {118}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCTurboUserCenterImpl$setActiveAccount$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ ReadableMap $extParams;
    final /* synthetic */ String $targetid;
    int label;
    final /* synthetic */ KCTurboUserCenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCTurboUserCenterImpl$setActiveAccount$1$1(String str, ReadableMap readableMap, KCTurboUserCenterImpl kCTurboUserCenterImpl, Function1<? super Boolean, Unit> function1, Continuation<? super KCTurboUserCenterImpl$setActiveAccount$1$1> continuation) {
        super(2, continuation);
        this.$targetid = str;
        this.$extParams = readableMap;
        this.this$0 = kCTurboUserCenterImpl;
        this.$callback = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCTurboUserCenterImpl$setActiveAccount$1$1(this.$targetid, this.$extParams, this.this$0, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCTurboUserCenterImpl$setActiveAccount$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
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
                UserCenterAccountOps userCenterAccountOps = UserCenterAccountOps.f53679a;
                String str = this.$targetid;
                ReadableMap readableMap = this.$extParams;
                this.label = 1;
                obj = userCenterAccountOps.m65549r(str, readableMap, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        if (this.this$0.getReactApplicationContext().hasActiveReactInstance()) {
            this.$callback.invoke(Boxing.boxBoolean(zBooleanValue));
        }
        return Unit.INSTANCE;
    }
}
