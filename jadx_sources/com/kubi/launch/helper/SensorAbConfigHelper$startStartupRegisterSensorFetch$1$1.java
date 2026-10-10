package com.kubi.launch.helper;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SensorAbConfigHelper.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.helper.SensorAbConfigHelper$startStartupRegisterSensorFetch$1$1", m90122f = "SensorAbConfigHelper.kt", m90123i = {0, 1, 1}, m90124l = {41, 54}, m90125m = "invokeSuspend", m90126n = {"bizDeferred", "bizDeferred", "bizRes"}, m90127s = {"L$0", "L$0", "Z$0"})
public final class SensorAbConfigHelper$startStartupRegisterSensorFetch$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41769w<Boolean> $deferred;
    Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SensorAbConfigHelper$startStartupRegisterSensorFetch$1$1(InterfaceC41769w<Boolean> interfaceC41769w, Continuation<? super SensorAbConfigHelper$startStartupRegisterSensorFetch$1$1> continuation) {
        super(2, continuation);
        this.$deferred = interfaceC41769w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SensorAbConfigHelper$startStartupRegisterSensorFetch$1$1(this.$deferred, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SensorAbConfigHelper$startStartupRegisterSensorFetch$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41769w<Boolean> interfaceC41769wM37475q;
        boolean z11;
        Boolean bool;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        z11 = this.Z$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    interfaceC41769wM37475q = (InterfaceC41769w) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                bool = (Boolean) obj;
                C44128b.m97259c("SensorAbConfigHelper", "startStartupRegisterSensorFetch: bizControlResult=" + z11 + ", abTestResult=" + bool);
                this.$deferred.mo91370n(Boxing.boxBoolean(Intrinsics.areEqual(bool, Boxing.boxBoolean(true))));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            interfaceC41769wM37475q = SensorAbConfigHelper.f31790a.m37475q();
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM37475q);
            this.label = 1;
            obj = interfaceC41769wM37475q.mo91198h(this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C44128b.m97259c("SensorAbConfigHelper", "startStartupRegisterSensorFetch: bizControlResult=" + zBooleanValue);
            if (!zBooleanValue) {
                C44128b.m97259c("SensorAbConfigHelper", "startStartupRegisterSensorFetch: bizControlResult=" + zBooleanValue + ", no need to wait for AB test");
                this.$deferred.mo91370n(Boxing.boxBoolean(zBooleanValue));
                return Unit.INSTANCE;
            }
            SensorAbConfigHelper sensorAbConfigHelper = SensorAbConfigHelper.f31790a;
            sensorAbConfigHelper.m37472m(sensorAbConfigHelper.m37474o());
            if (sensorAbConfigHelper.m37468i() == null) {
                C44128b.m97259c("SensorAbConfigHelper", "startStartupRegisterSensorFetch: abDeferred is null");
                return Unit.INSTANCE;
            }
            InterfaceC41769w<Boolean> interfaceC41769wM37468i = sensorAbConfigHelper.m37468i();
            if (interfaceC41769wM37468i != null) {
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM37475q);
                this.Z$0 = zBooleanValue;
                this.label = 2;
                Object objMo91198h = interfaceC41769wM37468i.mo91198h(this);
                if (objMo91198h != coroutine_suspended) {
                    z11 = zBooleanValue;
                    obj = objMo91198h;
                    bool = (Boolean) obj;
                }
                return coroutine_suspended;
            }
            z11 = zBooleanValue;
            bool = null;
            C44128b.m97259c("SensorAbConfigHelper", "startStartupRegisterSensorFetch: bizControlResult=" + z11 + ", abTestResult=" + bool);
            this.$deferred.mo91370n(Boxing.boxBoolean(Intrinsics.areEqual(bool, Boxing.boxBoolean(true))));
            return Unit.INSTANCE;
        } catch (Exception e11) {
            C44128b.m97262f("SensorAbConfigHelper", "startStartupRegisterSensorFetch error", e11);
            this.$deferred.mo91370n(Boxing.boxBoolean(false));
        }
    }
}
