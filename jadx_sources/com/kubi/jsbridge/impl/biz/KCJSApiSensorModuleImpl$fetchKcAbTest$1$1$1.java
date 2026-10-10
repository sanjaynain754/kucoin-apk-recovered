package com.kubi.jsbridge.impl.biz;

import com.kubi.abtest.api.IKCABTestService;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCJSApiSensorModuleImpl.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.biz.KCJSApiSensorModuleImpl$fetchKcAbTest$1$1$1", m90122f = "KCJSApiSensorModuleImpl.kt", m90123i = {}, m90124l = {137}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCJSApiSensorModuleImpl$fetchKcAbTest$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    final /* synthetic */ String $defaultValue;
    final /* synthetic */ String $experimentKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJSApiSensorModuleImpl$fetchKcAbTest$1$1$1(String str, String str2, Function2<? super String, ? super ProtocolException, Unit> function2, Continuation<? super KCJSApiSensorModuleImpl$fetchKcAbTest$1$1$1> continuation) {
        super(2, continuation);
        this.$experimentKey = str;
        this.$defaultValue = str2;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJSApiSensorModuleImpl$fetchKcAbTest$1$1$1(this.$experimentKey, this.$defaultValue, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJSApiSensorModuleImpl$fetchKcAbTest$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            IKCABTestService iKCABTestService = IKCABTestService.f14850a.get();
            String str = this.$experimentKey;
            String str2 = this.$defaultValue;
            this.label = 1;
            obj = iKCABTestService.mo14634a(str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.$callback.invoke((String) obj, null);
        return Unit.INSTANCE;
    }
}
