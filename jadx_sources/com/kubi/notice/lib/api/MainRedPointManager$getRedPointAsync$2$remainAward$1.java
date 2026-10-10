package com.kubi.notice.lib.api;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.welfare.api.entity.RemainAwardNumEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MainRedPointManager.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.notice.lib.api.MainRedPointManager$getRedPointAsync$2$remainAward$1", m90122f = "MainRedPointManager.kt", m90123i = {}, m90124l = {69}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MainRedPointManager$getRedPointAsync$2$remainAward$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super RemainAwardNumEntity>, Object> {
    int label;

    public MainRedPointManager$getRedPointAsync$2$remainAward$1(Continuation<? super MainRedPointManager$getRedPointAsync$2$remainAward$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainRedPointManager$getRedPointAsync$2$remainAward$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super RemainAwardNumEntity> continuation) {
        return ((MainRedPointManager$getRedPointAsync$2$remainAward$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<RemainAwardNumEntity> interfaceC41634eM43156a = MainRedPointManager.f36366a.m43150j().m43156a();
            this.label = 1;
            obj = RetrofitFlowExKt.m42826g(interfaceC41634eM43156a, false, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return ((C19334f) obj).m42846a();
    }
}
