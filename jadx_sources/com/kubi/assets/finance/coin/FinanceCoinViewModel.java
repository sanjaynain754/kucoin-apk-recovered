package com.kubi.assets.finance.coin;

import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceCoinViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/finance/coin/FinanceCoinViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/finance/coin/FinanceCoinContract$UIState;", "<init>", "()V", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/assets/finance/coin/FinanceCoinContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinanceCoinViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: com.kubi.assets.finance.coin.FinanceCoinViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: FinanceCoinViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.coin.FinanceCoinViewModel", m90122f = "FinanceCoinViewModel.kt", m90123i = {0}, m90124l = {14}, m90125m = "dispatchIntentOnIO", m90126n = {"intent"}, m90127s = {"L$0"})
    public static final class C99761 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C99761(Continuation<? super C99761> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinanceCoinViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final UIState m16791d(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(((FinanceCoinContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntentOnIO(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C99761 c99761;
        if (continuation instanceof C99761) {
            c99761 = (C99761) continuation;
            int i11 = c99761.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c99761.label = i11 - Integer.MIN_VALUE;
            } else {
                c99761 = new C99761(continuation);
            }
        } else {
            c99761 = new C99761(continuation);
        }
        Object obj = c99761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c99761.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c99761.L$0 = interfaceC19282d;
            c99761.label = 1;
            if (super.dispatchIntentOnIO(interfaceC19282d, c99761) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC19282d = (InterfaceC19282d) c99761.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (interfaceC19282d instanceof FinanceCoinContract$UiIntent.HideOrShowNumber) {
            updateState(new Function1() { // from class: com.kubi.assets.finance.coin.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FinanceCoinViewModel.m16791d(interfaceC19282d, (UIState) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(false, 1, null);
    }
}
