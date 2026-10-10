package com.kubi.mine.lib.p101ui;

import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p319hq.InterfaceC38285b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MineViewModel.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/mine/api/entity/KycStatusEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$1", m90122f = "MineViewModel.kt", m90123i = {}, m90124l = {126}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super KycStatusEntity>, Object> {
    final /* synthetic */ InterfaceC38285b $api;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$1(InterfaceC38285b interfaceC38285b, Continuation<? super MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$1> continuation) {
        super(2, continuation);
        this.$api = interfaceC38285b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$1(this.$api, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super KycStatusEntity> continuation) {
        return ((MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (MineDepend.f35159a.m41829h()) {
                InterfaceC41634e<KycStatusEntity> interfaceC41634eM86408a = this.$api.m86408a();
                this.label = 1;
                obj = RetrofitFlowExKt.m42826g(interfaceC41634eM86408a, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return null;
            }
        }
        return (KycStatusEntity) ((C19334f) obj).m42846a();
    }
}
