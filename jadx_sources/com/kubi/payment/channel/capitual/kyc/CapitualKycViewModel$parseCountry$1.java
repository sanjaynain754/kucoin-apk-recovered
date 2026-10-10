package com.kubi.payment.channel.capitual.kyc;

import com.kubi.payment.common.data.entities.Country;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CapitualKycViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.capitual.kyc.CapitualKycViewModel$parseCountry$1", m90122f = "CapitualKycViewModel.kt", m90123i = {0, 0, 0}, m90124l = {142}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nCapitualKycViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapitualKycViewModel.kt\ncom/kubi/payment/channel/capitual/kyc/CapitualKycViewModel$parseCountry$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,139:1\n196#2,3:140\n*S KotlinDebug\n*F\n+ 1 CapitualKycViewModel.kt\ncom/kubi/payment/channel/capitual/kyc/CapitualKycViewModel$parseCountry$1\n*L\n131#1:140,3\n*E\n"})
public final class CapitualKycViewModel$parseCountry$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $json;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CapitualKycViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapitualKycViewModel$parseCountry$1(String str, CapitualKycViewModel capitualKycViewModel, Continuation<? super CapitualKycViewModel$parseCountry$1> continuation) {
        super(2, continuation);
        this.$json = str;
        this.this$0 = capitualKycViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CapitualKycViewModel$parseCountry$1(this.$json, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CapitualKycViewModel$parseCountry$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C27099x c27099x = C27099x.f54458a;
            String str = this.$json;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C20306x6ed91e44(str, null)), C42911a.m94120b());
            this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$1 = SpillingKt.nullOutSpilledVariable(str);
            this.I$0 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Country country = (Country) obj;
        if (country == null) {
            return Unit.INSTANCE;
        }
        this.this$0.f38239d0.setValue(country);
        return Unit.INSTANCE;
    }
}
