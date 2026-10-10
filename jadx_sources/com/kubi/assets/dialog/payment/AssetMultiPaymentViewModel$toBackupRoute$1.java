package com.kubi.assets.dialog.payment;

import f00.C37304a;
import g00.InterfaceC37749a;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetMultiPaymentViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.payment.AssetMultiPaymentViewModel$toBackupRoute$1", m90122f = "AssetMultiPaymentViewModel.kt", m90123i = {}, m90124l = {106}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetMultiPaymentViewModel$toBackupRoute$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $tradeType;
    int label;
    final /* synthetic */ AssetMultiPaymentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetMultiPaymentViewModel$toBackupRoute$1(String str, AssetMultiPaymentViewModel assetMultiPaymentViewModel, Continuation<? super AssetMultiPaymentViewModel$toBackupRoute$1> continuation) {
        super(2, continuation);
        this.$tradeType = str;
        this.this$0 = assetMultiPaymentViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetMultiPaymentViewModel$toBackupRoute$1(this.$tradeType, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetMultiPaymentViewModel$toBackupRoute$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (Intrinsics.areEqual(this.$tradeType, "WITHDRAW")) {
            InterfaceC37749a.a.m85118m(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        } else {
            InterfaceC37749a.a.m85110e(C37304a.f82764a, null, Boxing.boxLong(1L), null, null, null, null, 61, null);
        }
        this.this$0.f17166W.setValue(AssetMultiPaymentViewModel.AbstractC9822a.a.f17170a);
        return Unit.INSTANCE;
    }
}
