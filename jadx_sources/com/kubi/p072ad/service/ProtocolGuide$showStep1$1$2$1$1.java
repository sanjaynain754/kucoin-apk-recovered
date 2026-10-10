package com.kubi.p072ad.service;

import com.kubi.launch.helper.SensorAbConfigHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: ProtocolGuide.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.ProtocolGuide$showStep1$1$2$1$1", m90122f = "ProtocolGuide.kt", m90123i = {0}, m90124l = {117}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class ProtocolGuide$showStep1$1$2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DialogFragmentHelper $dialog;
    final /* synthetic */ InterfaceC41769w<Boolean> $startupRegisterSensorDeferred;
    final /* synthetic */ KcPrimaryButton $this_apply;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProtocolGuide this$0;

    /* JADX INFO: renamed from: com.kubi.ad.service.ProtocolGuide$showStep1$1$2$1$1$1 */
    /* JADX INFO: compiled from: ProtocolGuide.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.ad.service.ProtocolGuide$showStep1$1$2$1$1$1", m90122f = "ProtocolGuide.kt", m90123i = {}, m90124l = {118}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C93251 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41769w<Boolean> $startupRegisterSensorDeferred;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C93251(InterfaceC41769w<Boolean> interfaceC41769w, Continuation<? super C93251> continuation) {
            super(2, continuation);
            this.$startupRegisterSensorDeferred = interfaceC41769w;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C93251(this.$startupRegisterSensorDeferred, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C93251) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
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
                InterfaceC41769w<Boolean> interfaceC41769w = this.$startupRegisterSensorDeferred;
                this.label = 1;
                if (interfaceC41769w.mo91198h(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            SensorAbConfigHelper sensorAbConfigHelper = SensorAbConfigHelper.f31790a;
            sensorAbConfigHelper.m37473n(this.$startupRegisterSensorDeferred.mo91197b().booleanValue());
            if (sensorAbConfigHelper.m37471l()) {
                sensorAbConfigHelper.m37465f();
            } else {
                sensorAbConfigHelper.m37466g();
            }
            C44128b.m97259c("ProtocolGuide", "不到4s就拿到结果了，继续执行，结果是：" + this.$startupRegisterSensorDeferred.mo91197b().booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtocolGuide$showStep1$1$2$1$1(KcPrimaryButton kcPrimaryButton, DialogFragmentHelper dialogFragmentHelper, ProtocolGuide protocolGuide, InterfaceC41769w<Boolean> interfaceC41769w, Continuation<? super ProtocolGuide$showStep1$1$2$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = kcPrimaryButton;
        this.$dialog = dialogFragmentHelper;
        this.this$0 = protocolGuide;
        this.$startupRegisterSensorDeferred = interfaceC41769w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProtocolGuide$showStep1$1$2$1$1 protocolGuide$showStep1$1$2$1$1 = new ProtocolGuide$showStep1$1$2$1$1(this.$this_apply, this.$dialog, this.this$0, this.$startupRegisterSensorDeferred, continuation);
        protocolGuide$showStep1$1$2$1$1.L$0 = obj;
        return protocolGuide$showStep1$1$2$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ProtocolGuide$showStep1$1$2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C93251 c93251 = new C93251(this.$startupRegisterSensorDeferred, null);
            this.L$0 = interfaceC41709m0;
            this.label = 1;
            obj = TimeoutKt.m90469d(4000L, c93251, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Unit) obj) == null) {
            SensorAbConfigHelper sensorAbConfigHelper = SensorAbConfigHelper.f31790a;
            sensorAbConfigHelper.m37464e("timeout");
            sensorAbConfigHelper.m37467h();
            C44128b.m97259c("ProtocolGuide", "ABTest timeout on click, fallback to false!!!!!!");
        }
        this.$this_apply.mo28851l();
        C44128b.m97259c("ProtocolGuide", "startupRegisterSensor gogogo");
        this.$dialog.dismissAllowingStateLoss();
        this.this$0.m14675o(true);
        return Unit.INSTANCE;
    }
}
