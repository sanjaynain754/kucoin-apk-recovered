package com.kubi.quotefacade.rank.container;

import androidx.lifecycle.ViewModelKt;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RankContainerVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0094@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/container/RankContainerVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/rank/container/RankContainerContract$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/quotefacade/rank/container/RankContainerContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkToShowRedDot", "subType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankContainerVM extends AbstractC19291m<RankContainerContract$UIState> {

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.container.RankContainerVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: RankContainerVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.rank.container.RankContainerVM", m90122f = "RankContainerVM.kt", m90123i = {0}, m90124l = {22}, m90125m = "dispatchIntent", m90126n = {"intent"}, m90127s = {"L$0"})
    public static final class C224501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C224501(Continuation<? super C224501> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RankContainerVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C224501 c224501;
        if (continuation instanceof C224501) {
            c224501 = (C224501) continuation;
            int i11 = c224501.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c224501.label = i11 - Integer.MIN_VALUE;
            } else {
                c224501 = new C224501(continuation);
            }
        } else {
            c224501 = new C224501(continuation);
        }
        Object obj = c224501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c224501.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c224501.L$0 = interfaceC19282d;
            c224501.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c224501) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC19282d = (InterfaceC19282d) c224501.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (interfaceC19282d instanceof RankContainerContract$UiIntent.CheckToShowNewTabRedDot) {
            m52771d(((RankContainerContract$UiIntent.CheckToShowNewTabRedDot) interfaceC19282d).getSubType());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.quotefacade.rank.container.RankContainerContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public RankContainerContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.quotefacade.rank.container.RankContainerContract$UIState
        };
    }

    /* JADX INFO: renamed from: d */
    public final void m52771d(String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new RankContainerVM$checkToShowRedDot$1(str, this, null), 3, null);
    }
}
