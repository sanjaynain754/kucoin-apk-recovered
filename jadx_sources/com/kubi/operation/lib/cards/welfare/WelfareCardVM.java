package com.kubi.operation.lib.cards.welfare;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.operation.lib.api.OperationApi;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.utils.extensions.C27025c;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import us.C45300a;
import us.C45308i;

/* JADX INFO: compiled from: WelfareCardVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0094@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/WelfareCardVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/operation/lib/api/OperationApi;", "initState", "getInitState", "()Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWelfareData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyJoinTask", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WelfareCardVM extends AbstractC19291m<WelfareContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final OperationApi f36738X = (OperationApi) RetrofitFlowExKt.m42820a(OperationApi.class);

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (interfaceC19282d instanceof WelfareContract$UiIntent.LoadData) {
            Object objM43459o = m43459o(continuation);
            return objM43459o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM43459o : Unit.INSTANCE;
        }
        if (!(interfaceC19282d instanceof WelfareContract$UiIntent.ApplyJoinTask)) {
            return Unit.INSTANCE;
        }
        Object objM43457d = m43457d(((WelfareContract$UiIntent.ApplyJoinTask) interfaceC19282d).getTaskId(), continuation);
        return objM43457d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM43457d : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.operation.lib.cards.welfare.WelfareContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public WelfareContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.operation.lib.cards.welfare.WelfareContract$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m43459o(Continuation<? super Unit> continuation) {
        WelfareCardVM$loadWelfareData$1 welfareCardVM$loadWelfareData$1;
        if (continuation instanceof WelfareCardVM$loadWelfareData$1) {
            welfareCardVM$loadWelfareData$1 = (WelfareCardVM$loadWelfareData$1) continuation;
            int i11 = welfareCardVM$loadWelfareData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                welfareCardVM$loadWelfareData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                welfareCardVM$loadWelfareData$1 = new WelfareCardVM$loadWelfareData$1(this, continuation);
            }
        } else {
            welfareCardVM$loadWelfareData$1 = new WelfareCardVM$loadWelfareData$1(this, continuation);
        }
        Object objM42830k = welfareCardVM$loadWelfareData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = welfareCardVM$loadWelfareData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            InterfaceC41634e<WelfareTaskInfoEntity> interfaceC41634eM43290g = this.f36738X.m43290g(C45308i.m100176a());
            welfareCardVM$loadWelfareData$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM43290g, welfareCardVM$loadWelfareData$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42830k);
        }
        WelfareTaskInfoEntity welfareTaskInfoEntity = (WelfareTaskInfoEntity) objM42830k;
        if (C27025c.m66566d(welfareTaskInfoEntity != null ? welfareTaskInfoEntity.getTaskCompletion() : null)) {
            C45300a.m100161b(false);
            send(new C19502s());
        } else {
            send(new C19501r(welfareTaskInfoEntity));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final Object m43457d(String str, Continuation<? super Unit> continuation) {
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        Object objM42825f = RetrofitFlowExKt.m42825f(this.f36738X.m43298o(str), false, new WelfareCardVM$applyJoinTask$2(null), continuation);
        if (objM42825f == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM42825f;
        }
        return Unit.INSTANCE;
    }
}
