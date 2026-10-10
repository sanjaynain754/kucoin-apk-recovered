package com.kubi.assets.finance;

import com.google.android.gms.stats.CodePackage;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.FinanceCoinEntity;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import java.util.ArrayList;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: FinanceCommonViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceCommonViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/finance/FinanceCommonContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetCoinList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFetchFinanceRecommendData", "initState", "getInitState", "()Lcom/kubi/assets/finance/FinanceCommonContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceCommonViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceCommonViewModel.kt\ncom/kubi/assets/finance/FinanceCommonViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n126#2,2:82\n25#3:84\n26#3:86\n25#3:87\n26#3:89\n1#4:85\n1#4:88\n*S KotlinDebug\n*F\n+ 1 FinanceCommonViewModel.kt\ncom/kubi/assets/finance/FinanceCommonViewModel\n*L\n36#1:82,2\n59#1:84\n59#1:86\n74#1:87\n74#1:89\n59#1:85\n74#1:88\n*E\n"})
public final class FinanceCommonViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17381W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.finance.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinanceCommonViewModel.m16647s();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceCommonViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: FinanceCommonViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceCommonViewModel", m90122f = "FinanceCommonViewModel.kt", m90123i = {0, 1, 2}, m90124l = {24, 28, 32}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C99521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C99521(Continuation<? super C99521> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinanceCommonViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final UIState m16648t(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, ((FinanceCommonContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked(), 3, null);
    }

    /* JADX INFO: renamed from: u */
    private final AssetV2Api m16649u() {
        return (AssetV2Api) this.f17381W.getValue();
    }

    /* JADX INFO: renamed from: x */
    public static final UIState m16650x(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new ArrayList(), false, 5, null);
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m16651z(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new ArrayList(), false, 5, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (m16654y(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (m16653w(r0) == r1) goto L32;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C99521 c99521;
        if (continuation instanceof C99521) {
            c99521 = (C99521) continuation;
            int i11 = c99521.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c99521.label = i11 - Integer.MIN_VALUE;
            } else {
                c99521 = new C99521(continuation);
            }
        } else {
            c99521 = new C99521(continuation);
        }
        Object obj = c99521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c99521.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c99521.L$0 = interfaceC19282d;
            c99521.label = 1;
            if (super.dispatchIntentOnIO(interfaceC19282d, c99521) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        interfaceC19282d = (InterfaceC19282d) c99521.L$0;
        ResultKt.throwOnFailure(obj);
        if (interfaceC19282d instanceof FinanceCommonContract$UiIntent.GetCoinList) {
            c99521.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c99521.label = 2;
        } else {
            if (!(interfaceC19282d instanceof FinanceCommonContract$UiIntent.FetchFinanceRecommendData)) {
                if (interfaceC19282d instanceof FinanceCommonContract$UiIntent.HideOrShowNumber) {
                    FinanceCommonContract$UiIntent.HideOrShowNumber hideOrShowNumber = (FinanceCommonContract$UiIntent.HideOrShowNumber) interfaceC19282d;
                    AssetsProfitLossAnalysisManager.f40608a.m49943e(hideOrShowNumber.getIsChecked());
                    C46392a.m102328k(C42153h.f93593a.m92500D(), hideOrShowNumber.getIsChecked());
                    updateState(new Function1() { // from class: com.kubi.assets.finance.i
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return FinanceCommonViewModel.m16648t(interfaceC19282d, (UIState) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            c99521.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c99521.label = 3;
        }
        return coroutine_suspended;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: w */
    public final Object m16653w(Continuation<? super Unit> continuation) {
        FinanceCommonViewModel$handleFetchFinanceRecommendData$1 financeCommonViewModel$handleFetchFinanceRecommendData$1;
        if (continuation instanceof FinanceCommonViewModel$handleFetchFinanceRecommendData$1) {
            financeCommonViewModel$handleFetchFinanceRecommendData$1 = (FinanceCommonViewModel$handleFetchFinanceRecommendData$1) continuation;
            int i11 = financeCommonViewModel$handleFetchFinanceRecommendData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                financeCommonViewModel$handleFetchFinanceRecommendData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                financeCommonViewModel$handleFetchFinanceRecommendData$1 = new FinanceCommonViewModel$handleFetchFinanceRecommendData$1(this, continuation);
            }
        } else {
            financeCommonViewModel$handleFetchFinanceRecommendData$1 = new FinanceCommonViewModel$handleFetchFinanceRecommendData$1(this, continuation);
        }
        FinanceCommonViewModel$handleFetchFinanceRecommendData$1 financeCommonViewModel$handleFetchFinanceRecommendData$2 = financeCommonViewModel$handleFetchFinanceRecommendData$1;
        Object objM42824e = financeCommonViewModel$handleFetchFinanceRecommendData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = financeCommonViewModel$handleFetchFinanceRecommendData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e interfaceC41634eM90895S = C41636g.m90895S(AssetV2Api.m17065l0(m16649u(), 0, null, 3, null), new FinanceCommonViewModel$handleFetchFinanceRecommendData$2(this, null));
            FinanceCommonViewModel$handleFetchFinanceRecommendData$3 financeCommonViewModel$handleFetchFinanceRecommendData$3 = new FinanceCommonViewModel$handleFetchFinanceRecommendData$3(this, null);
            financeCommonViewModel$handleFetchFinanceRecommendData$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM90895S, false, financeCommonViewModel$handleFetchFinanceRecommendData$3, financeCommonViewModel$handleFetchFinanceRecommendData$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        if (((C19334f) objM42824e).getThrowable() != null) {
            updateState(new Function1() { // from class: com.kubi.assets.finance.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinanceCommonViewModel.m16650x((UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: y */
    public final Object m16654y(Continuation<? super Unit> continuation) {
        FinanceCommonViewModel$handleGetCoinList$1 financeCommonViewModel$handleGetCoinList$1;
        if (continuation instanceof FinanceCommonViewModel$handleGetCoinList$1) {
            financeCommonViewModel$handleGetCoinList$1 = (FinanceCommonViewModel$handleGetCoinList$1) continuation;
            int i11 = financeCommonViewModel$handleGetCoinList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                financeCommonViewModel$handleGetCoinList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                financeCommonViewModel$handleGetCoinList$1 = new FinanceCommonViewModel$handleGetCoinList$1(this, continuation);
            }
        } else {
            financeCommonViewModel$handleGetCoinList$1 = new FinanceCommonViewModel$handleGetCoinList$1(this, continuation);
        }
        FinanceCommonViewModel$handleGetCoinList$1 financeCommonViewModel$handleGetCoinList$2 = financeCommonViewModel$handleGetCoinList$1;
        Object objM42824e = financeCommonViewModel$handleGetCoinList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = financeCommonViewModel$handleGetCoinList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<ArrayList<FinanceCoinEntity>> interfaceC41634eM17091L0 = m16649u().m17091L0(CodePackage.COMMON);
            FinanceCommonViewModel$handleGetCoinList$2 financeCommonViewModel$handleGetCoinList$3 = new FinanceCommonViewModel$handleGetCoinList$2(this, null);
            financeCommonViewModel$handleGetCoinList$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17091L0, false, financeCommonViewModel$handleGetCoinList$3, financeCommonViewModel$handleGetCoinList$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        if (((C19334f) objM42824e).getThrowable() != null) {
            updateState(new Function1() { // from class: com.kubi.assets.finance.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinanceCommonViewModel.m16651z((UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AssetV2Api m16647s() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
