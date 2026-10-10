package com.kubi.operation.lib.cards.bonus;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.operation.lib.api.OperationApi;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;

/* JADX INFO: compiled from: BonusCardVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0094@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/bonus/BonusCardVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/operation/lib/cards/bonus/BonusCardContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/operation/lib/api/OperationApi;", "initState", "getInitState", "()Lcom/kubi/operation/lib/cards/bonus/BonusCardContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "ignoreCacheTime", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BonusCardVM extends AbstractC19291m<BonusCardContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final OperationApi f36682X = (OperationApi) RetrofitFlowExKt.m42820a(OperationApi.class);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m43341o(boolean z11, Continuation<? super Unit> continuation) {
        BonusCardVM$loadData$1 bonusCardVM$loadData$1;
        if (continuation instanceof BonusCardVM$loadData$1) {
            bonusCardVM$loadData$1 = (BonusCardVM$loadData$1) continuation;
            int i11 = bonusCardVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bonusCardVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bonusCardVM$loadData$1 = new BonusCardVM$loadData$1(this, continuation);
            }
        } else {
            bonusCardVM$loadData$1 = new BonusCardVM$loadData$1(this, continuation);
        }
        BonusCardVM$loadData$1 bonusCardVM$loadData$2 = bonusCardVM$loadData$1;
        Object objM42826g = bonusCardVM$loadData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bonusCardVM$loadData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            Long lBoxLong = z11 ? null : Boxing.boxLong(30000L);
            InterfaceC41634e<WelfareTaskInfoEntity> interfaceC41634eM43285b = this.f36682X.m43285b(lBoxLong);
            bonusCardVM$loadData$2.L$0 = SpillingKt.nullOutSpilledVariable(lBoxLong);
            bonusCardVM$loadData$2.Z$0 = z11;
            bonusCardVM$loadData$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM43285b, false, null, bonusCardVM$loadData$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        send(new C19458k((WelfareTaskInfoEntity) ((C19334f) objM42826g).m42846a()));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (!(interfaceC19282d instanceof BonusCardContract$UiIntent.LoadData)) {
            return Unit.INSTANCE;
        }
        Object objM43341o = m43341o(((BonusCardContract$UiIntent.LoadData) interfaceC19282d).getIgnoreCacheTime(), continuation);
        return objM43341o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM43341o : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.operation.lib.cards.bonus.BonusCardContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public BonusCardContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.operation.lib.cards.bonus.BonusCardContract$UIState
        };
    }
}
