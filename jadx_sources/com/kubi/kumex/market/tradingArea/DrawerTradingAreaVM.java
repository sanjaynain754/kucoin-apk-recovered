package com.kubi.kumex.market.tradingArea;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.data.market.IMarketService;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.utils.Log;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DrawerTradingAreaVM.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH\u0082@¢\u0006\u0002\u0010\u0019J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u0016\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0087@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaVM;", "Lcom/kubi/kumex/market/tradingArea/BaseTradingAreaVM;", "Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaIntent;", "Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaState;", "isRobot", "", "<init>", "(Z)V", "tag", "", "needCatchException", "getNeedCatchException", "()Z", "defaultThreadMode", "", "getDefaultThreadMode", "()I", "initState", "getInitState", "()Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaState;", "dispatchIntent", "", "intent", "(Lcom/kubi/kumex/market/tradingArea/DrawerTradingAreaIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCompose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeAsync", "fetchTradingArea", "Lcom/kubi/network/retrofit/utils/RetrofitResult;", "", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "getDefaultTabIndex", "testDispatchIntentOnIO", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDrawerTradingAreaVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawerTradingAreaVM.kt\ncom/kubi/kumex/market/tradingArea/DrawerTradingAreaVM\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,118:1\n375#2:119\n*S KotlinDebug\n*F\n+ 1 DrawerTradingAreaVM.kt\ncom/kubi/kumex/market/tradingArea/DrawerTradingAreaVM\n*L\n75#1:119\n*E\n"})
public final class DrawerTradingAreaVM extends BaseTradingAreaVM<DrawerTradingAreaIntent, DrawerTradingAreaState> {

    /* JADX INFO: renamed from: V */
    public final boolean f29485V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final String f29486W = "DrawerTradingAreaVM";

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.DrawerTradingAreaVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: DrawerTradingAreaVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.market.tradingArea.DrawerTradingAreaVM", m90122f = "DrawerTradingAreaVM.kt", m90123i = {0, 1}, m90124l = {34, 36}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C162411 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C162411(Continuation<? super C162411> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DrawerTradingAreaVM.this.dispatchIntent(null, this);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    public int getDefaultThreadMode() {
        return 2;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    public boolean getNeedCatchException() {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static final DrawerTradingAreaState m34450p(List list, int i11, DrawerTradingAreaState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return DrawerTradingAreaState.copy$default(updateState, new Pair(list, Integer.valueOf(i11)), null, 2, null);
    }

    /* JADX INFO: renamed from: q */
    public static final DrawerTradingAreaState m34451q(List list, int i11, DrawerTradingAreaState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return DrawerTradingAreaState.copy$default(updateState, new Pair(list, Integer.valueOf(i11)), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (m34454o(r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull DrawerTradingAreaIntent drawerTradingAreaIntent, @NotNull Continuation<? super Unit> continuation) {
        C162411 c162411;
        if (continuation instanceof C162411) {
            c162411 = (C162411) continuation;
            int i11 = c162411.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c162411.label = i11 - Integer.MIN_VALUE;
            } else {
                c162411 = new C162411(continuation);
            }
        } else {
            c162411 = new C162411(continuation);
        }
        Object obj = c162411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c162411.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c162411.L$0 = drawerTradingAreaIntent;
            c162411.label = 1;
            if (super.dispatchIntent(drawerTradingAreaIntent, c162411) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            drawerTradingAreaIntent = (DrawerTradingAreaIntent) c162411.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(drawerTradingAreaIntent instanceof DrawerTradingAreaIntent.FetchComposeData)) {
            throw new NoWhenBranchMatchedException();
        }
        c162411.L$0 = SpillingKt.nullOutSpilledVariable(drawerTradingAreaIntent);
        c162411.label = 2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (m34453n(r0) == r1) goto L30;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m34454o(Continuation<? super Unit> continuation) {
        DrawerTradingAreaVM$fetchCompose$1 drawerTradingAreaVM$fetchCompose$1;
        List<AvailableTradeAreaEntity> list;
        final int i11;
        C19334f c19334f;
        final List<AvailableTradeAreaEntity> listEmptyList;
        Throwable throwable;
        String message;
        if (continuation instanceof DrawerTradingAreaVM$fetchCompose$1) {
            drawerTradingAreaVM$fetchCompose$1 = (DrawerTradingAreaVM$fetchCompose$1) continuation;
            int i12 = drawerTradingAreaVM$fetchCompose$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                drawerTradingAreaVM$fetchCompose$1.label = i12 - Integer.MIN_VALUE;
            } else {
                drawerTradingAreaVM$fetchCompose$1 = new DrawerTradingAreaVM$fetchCompose$1(this, continuation);
            }
        } else {
            drawerTradingAreaVM$fetchCompose$1 = new DrawerTradingAreaVM$fetchCompose$1(this, continuation);
        }
        Object objMo24811m = drawerTradingAreaVM$fetchCompose$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = drawerTradingAreaVM$fetchCompose$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objMo24811m);
            showLoadingView();
            IMarketService iMarketServiceM20286e = RepositoryServiceLocator.f19236a.m20286e();
            boolean z11 = this.f29485V;
            drawerTradingAreaVM$fetchCompose$1.label = 1;
            objMo24811m = iMarketServiceM20286e.mo24811m(z11, drawerTradingAreaVM$fetchCompose$1);
            if (objMo24811m != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                ResultKt.throwOnFailure(objMo24811m);
                return Unit.INSTANCE;
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = drawerTradingAreaVM$fetchCompose$1.I$0;
            list = (List) drawerTradingAreaVM$fetchCompose$1.L$0;
            ResultKt.throwOnFailure(objMo24811m);
            c19334f = (C19334f) objMo24811m;
            if (c19334f.getThrowable() != null) {
                listEmptyList = (List) c19334f.m42846a();
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (m34615b(listEmptyList, list)) {
                    Log.f30813a.m36617c(this.f29486W, "fetchCompose- cache differnt server");
                    updateState(new Function1() { // from class: com.kubi.kumex.market.tradingArea.n
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DrawerTradingAreaVM.m34451q(listEmptyList, i11, (DrawerTradingAreaState) obj);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            Log log = Log.f30813a;
            String str = this.f29486W;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fetchCompose-exception:");
            throwable = c19334f.getThrowable();
            if (throwable != null) {
                message = throwable.getMessage();
            } else {
                message = null;
            }
            sb2.append(C27041f.m66668h(message));
            log.m36617c(str, sb2.toString());
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objMo24811m);
        final List<AvailableTradeAreaEntity> list2 = (List) objMo24811m;
        if (list2.isEmpty()) {
            Log.f30813a.m36617c(this.f29486W, "fetchCompose-cache is empty");
            drawerTradingAreaVM$fetchCompose$1.L$0 = SpillingKt.nullOutSpilledVariable(list2);
            drawerTradingAreaVM$fetchCompose$1.label = 2;
        } else {
            Log.f30813a.m36617c(this.f29486W, "fetchCompose-cache is not empty");
            final int iM34456s = m34456s();
            updateState(new Function1() { // from class: com.kubi.kumex.market.tradingArea.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DrawerTradingAreaVM.m34450p(list2, iM34456s, (DrawerTradingAreaState) obj);
                }
            });
            showContentView();
            drawerTradingAreaVM$fetchCompose$1.L$0 = list2;
            drawerTradingAreaVM$fetchCompose$1.I$0 = iM34456s;
            drawerTradingAreaVM$fetchCompose$1.label = 3;
            Object objM34455r = m34455r(drawerTradingAreaVM$fetchCompose$1);
            if (objM34455r != coroutine_suspended) {
                list = list2;
                objMo24811m = objM34455r;
                i11 = iM34456s;
                c19334f = (C19334f) objMo24811m;
                if (c19334f.getThrowable() != null) {
                    listEmptyList = (List) c19334f.m42846a();
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    if (m34615b(listEmptyList, list)) {
                        Log.f30813a.m36617c(this.f29486W, "fetchCompose- cache differnt server");
                        updateState(new Function1() { // from class: com.kubi.kumex.market.tradingArea.n
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return DrawerTradingAreaVM.m34451q(listEmptyList, i11, (DrawerTradingAreaState) obj);
                            }
                        });
                    }
                    return Unit.INSTANCE;
                }
                Log log2 = Log.f30813a;
                String str2 = this.f29486W;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fetchCompose-exception:");
                throwable = c19334f.getThrowable();
                if (throwable != null) {
                    message = throwable.getMessage();
                } else {
                    message = null;
                }
                sb3.append(C27041f.m66668h(message));
                log2.m36617c(str2, sb3.toString());
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: r */
    public final Object m34455r(Continuation<? super C19334f<List<AvailableTradeAreaEntity>>> continuation) {
        return RepositoryServiceLocator.f19236a.m20286e().mo24815p(this.f29485V, continuation);
    }

    /* JADX INFO: renamed from: s */
    public final int m34456s() {
        return RepositoryServiceLocator.f19236a.m20288g().mo24976A().isEmpty() ? 1 : 0;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public DrawerTradingAreaState getInitState() {
        return new DrawerTradingAreaState(null, null, 3, null);
    }

    public DrawerTradingAreaVM(boolean z11) {
        this.f29485V = z11;
    }

    /* JADX INFO: renamed from: n */
    public final Object m34453n(Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(continuation.get$context(), new DrawerTradingAreaVM$executeAsync$2(this, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
