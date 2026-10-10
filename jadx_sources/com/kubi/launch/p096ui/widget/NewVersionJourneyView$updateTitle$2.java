package com.kubi.launch.p096ui.widget;

import com.kubi.app.bizcontrol.BizControlLoader;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: NewVersionJourneyView.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.ui.widget.NewVersionJourneyView$updateTitle$2", m90122f = "NewVersionJourneyView.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, m90124l = {326, 327}, m90125m = "invokeSuspend", m90126n = {"$this$coroutineScope", "bizControlLoader", "bizControlEnableDeferred", "rewardTextDeferred", "$this$coroutineScope", "bizControlLoader", "bizControlEnableDeferred", "rewardTextDeferred", "bizControlEnable"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "Z$0"})
public final class NewVersionJourneyView$updateTitle$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ NewVersionJourneyView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewVersionJourneyView$updateTitle$2(NewVersionJourneyView newVersionJourneyView, Continuation<? super NewVersionJourneyView$updateTitle$2> continuation) {
        super(2, continuation);
        this.this$0 = newVersionJourneyView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewVersionJourneyView$updateTitle$2 newVersionJourneyView$updateTitle$2 = new NewVersionJourneyView$updateTitle$2(this.this$0, continuation);
        newVersionJourneyView$updateTitle$2.L$0 = obj;
        return newVersionJourneyView$updateTitle$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NewVersionJourneyView$updateTitle$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        BizControlLoader bizControlLoader;
        InterfaceC41729r0 interfaceC41729r0;
        boolean z11;
        String str;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            BizControlLoader bizControlLoader2 = new BizControlLoader("kcApp.B1OnboardingPromotion.Bouns.1");
            InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new NewVersionJourneyView$updateTitle$2$bizControlEnableDeferred$1(bizControlLoader2, null), 3, null);
            interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new NewVersionJourneyView$updateTitle$2$rewardTextDeferred$1(null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(bizControlLoader2);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
            this.L$3 = interfaceC41729r0M91102b;
            this.label = 1;
            Object objMo91198h = interfaceC41729r0M91102b2.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                bizControlLoader = bizControlLoader2;
                obj = objMo91198h;
                interfaceC41729r0 = interfaceC41729r0M91102b2;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            interfaceC41729r0M91102b = (InterfaceC41729r0) this.L$3;
            interfaceC41729r0 = (InterfaceC41729r0) this.L$2;
            bizControlLoader = (BizControlLoader) this.L$1;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = this.Z$0;
            ResultKt.throwOnFailure(obj);
        }
        str = (String) obj;
        if (z11 && str != null && str.length() != 0) {
            this.this$0.f31828s.set(3, str);
        }
        return Unit.INSTANCE;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(bizControlLoader);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.Z$0 = zBooleanValue;
        this.label = 2;
        Object objMo91198h2 = interfaceC41729r0M91102b.mo91198h(this);
        if (objMo91198h2 != coroutine_suspended) {
            z11 = zBooleanValue;
            obj = objMo91198h2;
            str = (String) obj;
            if (z11) {
                this.this$0.f31828s.set(3, str);
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
