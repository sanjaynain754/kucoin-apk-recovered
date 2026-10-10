package com.kubi.assets.dialog.evm;

import com.kubi.assets.entity.EvmRepeatAddressResponseEntity;
import com.kubi.assets.entity.EvmRepeatEntity;
import com.kubi.assets.entity.ReqEvmRepeatEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EvmRepo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.evm.EvmRepo$getEvmRepeatAddressList$2", m90122f = "EvmRepo.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EvmRepo$getEvmRepeatAddressList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super InterfaceC41634e<? extends List<? extends EvmRepeatAddressResponseEntity>>>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ String $memo;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super InterfaceC41634e<? extends List<? extends EvmRepeatAddressResponseEntity>>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super InterfaceC41634e<? extends List<EvmRepeatAddressResponseEntity>>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvmRepo$getEvmRepeatAddressList$2(String str, String str2, Continuation<? super EvmRepo$getEvmRepeatAddressList$2> continuation) {
        super(2, continuation);
        this.$address = str;
        this.$memo = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EvmRepo$getEvmRepeatAddressList$2(this.$address, this.$memo, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super InterfaceC41634e<? extends List<EvmRepeatAddressResponseEntity>>> continuation) {
        return ((EvmRepo$getEvmRepeatAddressList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return EvmRepo.f17055a.m16285e().m16289a(new ReqEvmRepeatEntity(CollectionsKt.arrayListOf(new EvmRepeatEntity(this.$address, this.$memo))));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
