package com.kubi.futures.settings.vm;

import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
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

/* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchPreferenceData$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m90124l = {69, 70, 71}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "marginModeAsync", "hedgeAvailableAsync", "positionModeAsync", "$this$launch", "marginModeAsync", "hedgeAvailableAsync", "positionModeAsync", "marginMode", "$this$launch", "marginModeAsync", "hedgeAvailableAsync", "positionModeAsync", "marginMode", "hedgeAvailable"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
public final class TradingPreferenceViewModel$fetchPreferenceData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $symbol;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ TradingPreferenceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingPreferenceViewModel$fetchPreferenceData$1(TradingPreferenceViewModel tradingPreferenceViewModel, String str, boolean z11, Continuation<? super TradingPreferenceViewModel$fetchPreferenceData$1> continuation) {
        super(2, continuation);
        this.this$0 = tradingPreferenceViewModel;
        this.$symbol = str;
        this.$isTrial = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradingPreferenceViewModel$fetchPreferenceData$1 tradingPreferenceViewModel$fetchPreferenceData$1 = new TradingPreferenceViewModel$fetchPreferenceData$1(this.this$0, this.$symbol, this.$isTrial, continuation);
        tradingPreferenceViewModel$fetchPreferenceData$1.L$0 = obj;
        return tradingPreferenceViewModel$fetchPreferenceData$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradingPreferenceViewModel$fetchPreferenceData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:27:0x011f  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0;
        InterfaceC41729r0 interfaceC41729r1;
        InterfaceC41729r0 interfaceC41729r2;
        String str;
        boolean zBooleanValue;
        Object objMo91198h;
        boolean z11;
        String str2;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new C13515xa5ef5684(this.$isTrial, this.$symbol, null), 3, null);
            InterfaceC41729r0 interfaceC41729r0M91102b3 = C41696j.m91102b(interfaceC41709m0, null, null, new C13514xb2aa8371(null), 3, null);
            interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new C13516x75e97d29(this.$isTrial, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
            this.L$2 = interfaceC41729r0M91102b3;
            this.L$3 = interfaceC41729r0M91102b;
            this.label = 1;
            Object objMo91198h2 = interfaceC41729r0M91102b2.mo91198h(this);
            if (objMo91198h2 != coroutine_suspended) {
                interfaceC41729r0 = interfaceC41729r0M91102b2;
                obj = objMo91198h2;
                interfaceC41729r1 = interfaceC41729r0M91102b3;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            interfaceC41729r0M91102b = (InterfaceC41729r0) this.L$3;
            InterfaceC41729r0 interfaceC41729r3 = (InterfaceC41729r0) this.L$2;
            InterfaceC41729r0 interfaceC41729r4 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC41729r0 = interfaceC41729r4;
            interfaceC41729r1 = interfaceC41729r3;
        } else {
            if (i11 == 2) {
                str = (String) this.L$4;
                interfaceC41729r2 = (InterfaceC41729r0) this.L$3;
                interfaceC41729r1 = (InterfaceC41729r0) this.L$2;
                interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
                this.L$4 = str;
                this.Z$0 = zBooleanValue;
                this.label = 3;
                objMo91198h = interfaceC41729r2.mo91198h(this);
                if (objMo91198h != coroutine_suspended) {
                    z11 = zBooleanValue;
                    obj = objMo91198h;
                    str2 = str;
                }
                return coroutine_suspended;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = this.Z$0;
            str2 = (String) this.L$4;
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.m26415p().postValue(Boxing.boxBoolean(z11));
        this.this$0.m26412l().postValue(str2);
        this.this$0.m26416q().postValue((String) obj);
        if (Intrinsics.areEqual(str2, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
            this.this$0.m26410e(this.$symbol, this.$isTrial);
            this.this$0.m26409g(this.$symbol, this.$isTrial);
        }
        this.this$0.m26414o().postValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
        interfaceC41729r2 = interfaceC41729r0M91102b;
        String str3 = (String) obj;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
        this.L$3 = interfaceC41729r2;
        this.L$4 = str3;
        this.label = 2;
        Object objMo91198h3 = interfaceC41729r1.mo91198h(this);
        if (objMo91198h3 != coroutine_suspended) {
            str = str3;
            obj = objMo91198h3;
            zBooleanValue = ((Boolean) obj).booleanValue();
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
            this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
            this.L$4 = str;
            this.Z$0 = zBooleanValue;
            this.label = 3;
            objMo91198h = interfaceC41729r2.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                z11 = zBooleanValue;
                obj = objMo91198h;
                str2 = str;
                this.this$0.m26415p().postValue(Boxing.boxBoolean(z11));
                this.this$0.m26412l().postValue(str2);
                this.this$0.m26416q().postValue((String) obj);
                if (Intrinsics.areEqual(str2, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                    this.this$0.m26410e(this.$symbol, this.$isTrial);
                    this.this$0.m26409g(this.$symbol, this.$isTrial);
                }
                this.this$0.m26414o().postValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
