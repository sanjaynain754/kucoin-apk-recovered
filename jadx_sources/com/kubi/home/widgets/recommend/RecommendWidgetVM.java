package com.kubi.home.widgets.recommend;

import com.kubi.home.api.HomeConst;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.widgets.HomeWidgetRepo;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RecommendWidgetVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/widgets/recommend/RecommendWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/widgets/recommend/RecommendWidgetContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/home/widgets/HomeWidgetRepo;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initState", "getInitState", "()Lcom/kubi/home/widgets/recommend/RecommendWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecommendWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendWidgetVM.kt\ncom/kubi/home/widgets/recommend/RecommendWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n473#2,4:44\n1#3:48\n*S KotlinDebug\n*F\n+ 1 RecommendWidgetVM.kt\ncom/kubi/home/widgets/recommend/RecommendWidgetVM\n*L\n24#1:44,4\n*E\n"})
public final class RecommendWidgetVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final HomeWidgetRepo f26777X = new HomeWidgetRepo();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f26778Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.kubi.home.widgets.recommend.RecommendWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: RecommendWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.widgets.recommend.RecommendWidgetVM", m90122f = "RecommendWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {24}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-RecommendWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C151371 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C151371(Continuation<? super C151371> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RecommendWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m31223o(boolean z11, Continuation<? super Unit> continuation) throws JSONException {
        RecommendWidgetVM$loadData$1 recommendWidgetVM$loadData$1;
        Long lBoxLong;
        long jM94718b;
        long j11;
        final List list;
        if (continuation instanceof RecommendWidgetVM$loadData$1) {
            recommendWidgetVM$loadData$1 = (RecommendWidgetVM$loadData$1) continuation;
            int i11 = recommendWidgetVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                recommendWidgetVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                recommendWidgetVM$loadData$1 = new RecommendWidgetVM$loadData$1(this, continuation);
            }
        } else {
            recommendWidgetVM$loadData$1 = new RecommendWidgetVM$loadData$1(this, continuation);
        }
        Object objM31071e = recommendWidgetVM$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = recommendWidgetVM$loadData$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                z11 = recommendWidgetVM$loadData$1.Z$0;
                ResultKt.throwOnFailure(objM31071e);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = recommendWidgetVM$loadData$1.J$0;
                ResultKt.throwOnFailure(objM31071e);
            }
            list = (List) objM31071e;
            C43103h c43103h = C43103h.f95308a;
            c43103h.m94720d(HomeWidgetCode.RecommendedPosition.getCode(), c43103h.m94718b() - j11);
            if (list == null && !list.isEmpty()) {
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.home.widgets.recommend.i
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecommendWidgetVM.m31225q(list, (UIState) obj);
                    }
                }));
            } else if (((UIState) getState()).getDataList() == null) {
                send(C15143f.f26786a);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM31071e);
        if (this.f26778Y.compareAndSet(true, false)) {
            HomeWidgetRepo homeWidgetRepo = this.f26777X;
            recommendWidgetVM$loadData$1.Z$0 = z11;
            recommendWidgetVM$loadData$1.label = 1;
            objM31071e = homeWidgetRepo.m31071e(recommendWidgetVM$loadData$1);
        } else {
            if (z11) {
                lBoxLong = null;
            } else {
                lBoxLong = Boxing.boxLong(HomeConst.f25513a.m28962b());
            }
            jM94718b = C43103h.f95308a.m94718b();
            HomeWidgetRepo homeWidgetRepo2 = this.f26777X;
            recommendWidgetVM$loadData$1.L$0 = SpillingKt.nullOutSpilledVariable(lBoxLong);
            recommendWidgetVM$loadData$1.Z$0 = z11;
            recommendWidgetVM$loadData$1.J$0 = jM94718b;
            recommendWidgetVM$loadData$1.label = 2;
            objM31071e = homeWidgetRepo2.m31075i(lBoxLong, recommendWidgetVM$loadData$1);
            if (objM31071e != coroutine_suspended) {
                j11 = jM94718b;
                list = (List) objM31071e;
                C43103h c43103h2 = C43103h.f95308a;
                c43103h2.m94720d(HomeWidgetCode.RecommendedPosition.getCode(), c43103h2.m94718b() - j11);
                if (list == null) {
                    if (((UIState) getState()).getDataList() == null) {
                        send(C15143f.f26786a);
                    }
                } else if (((UIState) getState()).getDataList() == null) {
                    send(C15143f.f26786a);
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
        final List list2 = (List) objM31071e;
        if (list2 != null) {
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.home.widgets.recommend.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendWidgetVM.m31224p(list2, (UIState) obj);
                }
            }));
        }
        if (z11) {
            lBoxLong = null;
        } else {
            lBoxLong = Boxing.boxLong(HomeConst.f25513a.m28962b());
        }
        jM94718b = C43103h.f95308a.m94718b();
        HomeWidgetRepo homeWidgetRepo3 = this.f26777X;
        recommendWidgetVM$loadData$1.L$0 = SpillingKt.nullOutSpilledVariable(lBoxLong);
        recommendWidgetVM$loadData$1.Z$0 = z11;
        recommendWidgetVM$loadData$1.J$0 = jM94718b;
        recommendWidgetVM$loadData$1.label = 2;
        objM31071e = homeWidgetRepo3.m31075i(lBoxLong, recommendWidgetVM$loadData$1);
        if (objM31071e != coroutine_suspended) {
            j11 = jM94718b;
            list = (List) objM31071e;
            C43103h c43103h3 = C43103h.f95308a;
            c43103h3.m94720d(HomeWidgetCode.RecommendedPosition.getCode(), c43103h3.m94718b() - j11);
            if (list == null) {
                if (((UIState) getState()).getDataList() == null) {
                    send(C15143f.f26786a);
                }
            } else if (((UIState) getState()).getDataList() == null) {
                send(C15143f.f26786a);
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: p */
    public static final UIState m31224p(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(list);
    }

    /* JADX INFO: renamed from: q */
    public static final UIState m31225q(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C151371 c151371;
        if (continuation instanceof C151371) {
            c151371 = (C151371) continuation;
            int i11 = c151371.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c151371.label = i11 - Integer.MIN_VALUE;
            } else {
                c151371 = new C151371(continuation);
            }
        } else {
            c151371 = new C151371(continuation);
        }
        Object obj = c151371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c151371.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof RecommendWidgetContract$UiIntent.LoadData) {
                RecommendWidgetContract$UiIntent.LoadData loadData = (RecommendWidgetContract$UiIntent.LoadData) interfaceC19282d;
                boolean forceRefresh = loadData.getForceRefresh();
                c151371.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c151371.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c151371.L$2 = interfaceC19282d;
                c151371.L$3 = SpillingKt.nullOutSpilledVariable(loadData);
                c151371.I$0 = 0;
                c151371.I$1 = 0;
                c151371.label = 1;
                if (m31223o(forceRefresh, c151371) == coroutine_suspended) {
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

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }
}
