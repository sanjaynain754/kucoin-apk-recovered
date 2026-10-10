package com.kubi.operation.lib.widgets.learn;

import com.kubi.home.api.HomeConst;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.entity.LearnVideoEntity;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LearnWidgetVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/learn/LearnWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/operation/lib/widgets/learn/LearnWidgetContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/operation/lib/api/OperationRepo;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initState", "getInitState", "()Lcom/kubi/operation/lib/widgets/learn/LearnWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLearnWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LearnWidgetVM.kt\ncom/kubi/operation/lib/widgets/learn/LearnWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,35:1\n473#2,4:36\n*S KotlinDebug\n*F\n+ 1 LearnWidgetVM.kt\ncom/kubi/operation/lib/widgets/learn/LearnWidgetVM\n*L\n22#1:36,4\n*E\n"})
public final class LearnWidgetVM extends AbstractC19291m<LearnWidgetContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final OperationRepo f36900X = new OperationRepo();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f36901Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.kubi.operation.lib.widgets.learn.LearnWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: LearnWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.learn.LearnWidgetVM", m90122f = "LearnWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {22}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-LearnWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C195751 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C195751(Continuation<? super C195751> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LearnWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m43714o(boolean z11, Continuation<? super Unit> continuation) {
        LearnWidgetVM$loadData$1 learnWidgetVM$loadData$1;
        LearnVideoEntity learnVideoEntityM43265e;
        if (continuation instanceof LearnWidgetVM$loadData$1) {
            learnWidgetVM$loadData$1 = (LearnWidgetVM$loadData$1) continuation;
            int i11 = learnWidgetVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                learnWidgetVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                learnWidgetVM$loadData$1 = new LearnWidgetVM$loadData$1(this, continuation);
            }
        } else {
            learnWidgetVM$loadData$1 = new LearnWidgetVM$loadData$1(this, continuation);
        }
        Object objM43272m = learnWidgetVM$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = learnWidgetVM$loadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM43272m);
            if (this.f36901Y.compareAndSet(true, false) && (learnVideoEntityM43265e = this.f36900X.m43265e()) != null) {
                send(new CardDataEvent(learnVideoEntityM43265e));
            }
            Long lBoxLong = z11 ? null : Boxing.boxLong(HomeConst.f25513a.m28962b());
            OperationRepo operationRepo = this.f36900X;
            learnWidgetVM$loadData$1.L$0 = SpillingKt.nullOutSpilledVariable(lBoxLong);
            learnWidgetVM$loadData$1.Z$0 = z11;
            learnWidgetVM$loadData$1.label = 1;
            objM43272m = operationRepo.m43272m(lBoxLong, learnWidgetVM$loadData$1);
            if (objM43272m == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM43272m);
        }
        send(new CardDataEvent((LearnVideoEntity) objM43272m));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C195751 c195751;
        if (continuation instanceof C195751) {
            c195751 = (C195751) continuation;
            int i11 = c195751.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c195751.label = i11 - Integer.MIN_VALUE;
            } else {
                c195751 = new C195751(continuation);
            }
        } else {
            c195751 = new C195751(continuation);
        }
        Object obj = c195751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c195751.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof LearnWidgetContract$UiIntent.LoadData) {
                LearnWidgetContract$UiIntent.LoadData loadData = (LearnWidgetContract$UiIntent.LoadData) interfaceC19282d;
                boolean forceRefresh = loadData.getForceRefresh();
                c195751.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c195751.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c195751.L$2 = interfaceC19282d;
                c195751.L$3 = SpillingKt.nullOutSpilledVariable(loadData);
                c195751.I$0 = 0;
                c195751.I$1 = 0;
                c195751.label = 1;
                if (m43714o(forceRefresh, c195751) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.operation.lib.widgets.learn.LearnWidgetContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public LearnWidgetContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.operation.lib.widgets.learn.LearnWidgetContract$UIState
        };
    }
}
