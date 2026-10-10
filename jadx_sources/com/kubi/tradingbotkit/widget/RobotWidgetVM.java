package com.kubi.tradingbotkit.widget;

import com.kubi.home.api.HomeWidgetCode;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p502oj.C43103h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RobotWidgetVM.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0094@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradingbotkit/widget/RobotWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/tradingbotkit/widget/RobotWidgetContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/tradingbotkit/widget/RobotWidgetRepository;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasSuccess", "initState", "getInitState", "()Lcom/kubi/tradingbotkit/widget/RobotWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRobotWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RobotWidgetVM.kt\ncom/kubi/tradingbotkit/widget/RobotWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,54:1\n473#2,4:55\n*S KotlinDebug\n*F\n+ 1 RobotWidgetVM.kt\ncom/kubi/tradingbotkit/widget/RobotWidgetVM\n*L\n24#1:55,4\n*E\n"})
public final class RobotWidgetVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final RobotWidgetRepository f52510X = RobotWidgetRepository.f52508a;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f52511Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final AtomicBoolean f52512Z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.widget.RobotWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: RobotWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.widget.RobotWidgetVM", m90122f = "RobotWidgetVM.kt", m90123i = {0, 1, 1, 1, 1, 1, 1}, m90124l = {23, 25}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-RobotWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C262491 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C262491(Continuation<? super C262491> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RobotWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m64359o(boolean z11, Continuation<? super Unit> continuation) throws JSONException {
        RobotWidgetVM$loadData$1 robotWidgetVM$loadData$1;
        long jM94718b;
        long j11;
        final List list;
        if (continuation instanceof RobotWidgetVM$loadData$1) {
            robotWidgetVM$loadData$1 = (RobotWidgetVM$loadData$1) continuation;
            int i11 = robotWidgetVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                robotWidgetVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                robotWidgetVM$loadData$1 = new RobotWidgetVM$loadData$1(this, continuation);
            }
        } else {
            robotWidgetVM$loadData$1 = new RobotWidgetVM$loadData$1(this, continuation);
        }
        Object objM64355e = robotWidgetVM$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = robotWidgetVM$loadData$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                z11 = robotWidgetVM$loadData$1.Z$0;
                ResultKt.throwOnFailure(objM64355e);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = robotWidgetVM$loadData$1.J$0;
                ResultKt.throwOnFailure(objM64355e);
            }
            list = (List) objM64355e;
            C43103h c43103h = C43103h.f95308a;
            c43103h.m94720d(HomeWidgetCode.TradingRobot.getCode(), c43103h.m94718b() - j11);
            if (list != null) {
                updateState(new Function1() { // from class: com.kubi.tradingbotkit.widget.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RobotWidgetVM.m64361q(list, (UIState) obj);
                    }
                });
                this.f52512Z.set(true);
            } else if (((UIState) getState()).getData() == null) {
                send(C26256g.f52520a);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM64355e);
        if (!this.f52511Y.compareAndSet(true, false)) {
            if (this.f52512Z.get() || z11) {
                jM94718b = C43103h.f95308a.m94718b();
                RobotWidgetRepository robotWidgetRepository = this.f52510X;
                robotWidgetVM$loadData$1.Z$0 = z11;
                robotWidgetVM$loadData$1.J$0 = jM94718b;
                robotWidgetVM$loadData$1.label = 2;
                objM64355e = robotWidgetRepository.m64353c(robotWidgetVM$loadData$1);
                if (objM64355e != coroutine_suspended) {
                    j11 = jM94718b;
                    list = (List) objM64355e;
                    C43103h c43103h2 = C43103h.f95308a;
                    c43103h2.m94720d(HomeWidgetCode.TradingRobot.getCode(), c43103h2.m94718b() - j11);
                    if (list != null) {
                        updateState(new Function1() { // from class: com.kubi.tradingbotkit.widget.k
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RobotWidgetVM.m64361q(list, (UIState) obj);
                            }
                        });
                        this.f52512Z.set(true);
                    } else if (((UIState) getState()).getData() == null) {
                        send(C26256g.f52520a);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        RobotWidgetRepository robotWidgetRepository2 = this.f52510X;
        robotWidgetVM$loadData$1.Z$0 = z11;
        robotWidgetVM$loadData$1.label = 1;
        objM64355e = robotWidgetRepository2.m64355e(robotWidgetVM$loadData$1);
        return coroutine_suspended;
        final List list2 = (List) objM64355e;
        if (list2 != null) {
            updateState(new Function1() { // from class: com.kubi.tradingbotkit.widget.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RobotWidgetVM.m64360p(list2, (UIState) obj);
                }
            });
        }
        if (this.f52512Z.get()) {
        }
        jM94718b = C43103h.f95308a.m94718b();
        RobotWidgetRepository robotWidgetRepository3 = this.f52510X;
        robotWidgetVM$loadData$1.Z$0 = z11;
        robotWidgetVM$loadData$1.J$0 = jM94718b;
        robotWidgetVM$loadData$1.label = 2;
        objM64355e = robotWidgetRepository3.m64353c(robotWidgetVM$loadData$1);
        if (objM64355e != coroutine_suspended) {
            j11 = jM94718b;
            list = (List) objM64355e;
            C43103h c43103h3 = C43103h.f95308a;
            c43103h3.m94720d(HomeWidgetCode.TradingRobot.getCode(), c43103h3.m94718b() - j11);
            if (list != null) {
                updateState(new Function1() { // from class: com.kubi.tradingbotkit.widget.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RobotWidgetVM.m64361q(list, (UIState) obj);
                    }
                });
                this.f52512Z.set(true);
            } else if (((UIState) getState()).getData() == null) {
                send(C26256g.f52520a);
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: p */
    public static final UIState m64360p(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(list);
    }

    /* JADX INFO: renamed from: q */
    public static final UIState m64361q(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (m64359o(r2, r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C262491 c262491;
        if (continuation instanceof C262491) {
            c262491 = (C262491) continuation;
            int i11 = c262491.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c262491.label = i11 - Integer.MIN_VALUE;
            } else {
                c262491 = new C262491(continuation);
            }
        } else {
            c262491 = new C262491(continuation);
        }
        Object obj = c262491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c262491.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c262491.L$0 = interfaceC19282d;
            c262491.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c262491) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c262491.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (interfaceC19282d instanceof RobotWidgetContract$UiIntent.LoadData) {
            RobotWidgetContract$UiIntent.LoadData loadData = (RobotWidgetContract$UiIntent.LoadData) interfaceC19282d;
            boolean forceRefresh = loadData.getForceRefresh();
            c262491.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c262491.L$1 = SpillingKt.nullOutSpilledVariable(this);
            c262491.L$2 = interfaceC19282d;
            c262491.L$3 = SpillingKt.nullOutSpilledVariable(loadData);
            c262491.I$0 = 0;
            c262491.I$1 = 0;
            c262491.label = 2;
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }
}
