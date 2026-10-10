package com.kubi.assets.finance;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.FinanceProductEntity;
import com.kubi.assets.entity.ProductChildEntity;
import com.kubi.assets.entity.PwmProductEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
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

/* JADX INFO: compiled from: FinanceVipViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0094@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0015J \u0010\u0017\u001a\u00020\u00102\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002J \u0010\u001c\u001a\u00020\u00102\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceVipViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/finance/FinanceVipContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/assets/finance/FinanceVipContract$UIState;", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleLoadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestDefaultProducts", "buildList", "financeList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/FinanceProductEntity;", "Lkotlin/collections/ArrayList;", "updateData", "getTotalPrice", "Ljava/math/BigDecimal;", "it", "code", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceVipViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceVipViewModel.kt\ncom/kubi/assets/finance/FinanceVipViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n25#2:107\n26#2:109\n25#2:110\n26#2:112\n1#3:108\n1#3:111\n1869#4:113\n1869#4,2:114\n1870#4:116\n*S KotlinDebug\n*F\n+ 1 FinanceVipViewModel.kt\ncom/kubi/assets/finance/FinanceVipViewModel\n*L\n42#1:107\n42#1:109\n61#1:110\n61#1:112\n42#1:108\n61#1:111\n73#1:113\n75#1:114,2\n73#1:116\n*E\n"})
public final class FinanceVipViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17406W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.finance.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinanceVipViewModel.m16740u();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceVipViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: FinanceVipViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceVipViewModel", m90122f = "FinanceVipViewModel.kt", m90123i = {0, 1}, m90124l = {26, 29}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C99661 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C99661(Continuation<? super C99661> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinanceVipViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m16728A(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, 2, null);
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m16729C(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(null, null);
    }

    /* JADX INFO: renamed from: E */
    public static final UIState m16730E(ArrayList arrayList, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, arrayList, null, 2, null);
    }

    /* JADX INFO: renamed from: w */
    private final AssetV2Api m16741w() {
        return (AssetV2Api) this.f17406W.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: B */
    public final Object m16742B(Continuation<? super Unit> continuation) {
        FinanceVipViewModel$requestDefaultProducts$1 financeVipViewModel$requestDefaultProducts$1;
        if (continuation instanceof FinanceVipViewModel$requestDefaultProducts$1) {
            financeVipViewModel$requestDefaultProducts$1 = (FinanceVipViewModel$requestDefaultProducts$1) continuation;
            int i11 = financeVipViewModel$requestDefaultProducts$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                financeVipViewModel$requestDefaultProducts$1.label = i11 - Integer.MIN_VALUE;
            } else {
                financeVipViewModel$requestDefaultProducts$1 = new FinanceVipViewModel$requestDefaultProducts$1(this, continuation);
            }
        } else {
            financeVipViewModel$requestDefaultProducts$1 = new FinanceVipViewModel$requestDefaultProducts$1(this, continuation);
        }
        FinanceVipViewModel$requestDefaultProducts$1 financeVipViewModel$requestDefaultProducts$2 = financeVipViewModel$requestDefaultProducts$1;
        Object objM42824e = financeVipViewModel$requestDefaultProducts$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = financeVipViewModel$requestDefaultProducts$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<PwmProductEntity> interfaceC41634eM17175x1 = m16741w().m17175x1();
            FinanceVipViewModel$requestDefaultProducts$2 financeVipViewModel$requestDefaultProducts$3 = new FinanceVipViewModel$requestDefaultProducts$2(this, null);
            financeVipViewModel$requestDefaultProducts$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17175x1, false, financeVipViewModel$requestDefaultProducts$3, financeVipViewModel$requestDefaultProducts$2, 1, null);
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
            updateState(new Function1() { // from class: com.kubi.assets.finance.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinanceVipViewModel.m16729C((UIState) obj);
                }
            });
            sendSingleEvent(SingleEvent.C19249e.f35628b);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final void m16743D(final ArrayList<FinanceProductEntity> arrayList) {
        updateState(new Function1() { // from class: com.kubi.assets.finance.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinanceVipViewModel.m16730E(arrayList, (UIState) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (m16747z(r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C99661 c99661;
        if (continuation instanceof C99661) {
            c99661 = (C99661) continuation;
            int i11 = c99661.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c99661.label = i11 - Integer.MIN_VALUE;
            } else {
                c99661 = new C99661(continuation);
            }
        } else {
            c99661 = new C99661(continuation);
        }
        Object obj = c99661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c99661.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c99661.L$0 = interfaceC19282d;
            c99661.label = 1;
            if (super.dispatchIntentOnIO(interfaceC19282d, c99661) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c99661.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(interfaceC19282d instanceof FinanceVipContract$UiIntent.LoadData)) {
            return Unit.INSTANCE;
        }
        c99661.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c99661.label = 2;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, 3, null);
    }

    /* JADX INFO: renamed from: y */
    public final BigDecimal m16746y(BigDecimal bigDecimal, String str) {
        return C41014a.m89916A(bigDecimal, str, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (m16742B(r4) == r0) goto L24;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m16747z(Continuation<? super Unit> continuation) {
        FinanceVipViewModel$handleLoadData$1 financeVipViewModel$handleLoadData$1;
        if (continuation instanceof FinanceVipViewModel$handleLoadData$1) {
            financeVipViewModel$handleLoadData$1 = (FinanceVipViewModel$handleLoadData$1) continuation;
            int i11 = financeVipViewModel$handleLoadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                financeVipViewModel$handleLoadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                financeVipViewModel$handleLoadData$1 = new FinanceVipViewModel$handleLoadData$1(this, continuation);
            }
        } else {
            financeVipViewModel$handleLoadData$1 = new FinanceVipViewModel$handleLoadData$1(this, continuation);
        }
        FinanceVipViewModel$handleLoadData$1 financeVipViewModel$handleLoadData$2 = financeVipViewModel$handleLoadData$1;
        Object objM42824e = financeVipViewModel$handleLoadData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = financeVipViewModel$handleLoadData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<ArrayList<FinanceProductEntity>> interfaceC41634eM17119b0 = m16741w().m17119b0("PWM");
            FinanceVipViewModel$handleLoadData$2 financeVipViewModel$handleLoadData$3 = new FinanceVipViewModel$handleLoadData$2(this, null);
            financeVipViewModel$handleLoadData$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17119b0, false, financeVipViewModel$handleLoadData$3, financeVipViewModel$handleLoadData$2, 1, null);
            if (objM42824e != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM42824e);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        return Unit.INSTANCE;
        C19334f c19334f = (C19334f) objM42824e;
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null) {
            updateState(new Function1() { // from class: com.kubi.assets.finance.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinanceVipViewModel.m16728A((UIState) obj);
                }
            });
            financeVipViewModel$handleLoadData$2.L$0 = c19334f;
            financeVipViewModel$handleLoadData$2.L$1 = SpillingKt.nullOutSpilledVariable(throwable);
            financeVipViewModel$handleLoadData$2.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
            financeVipViewModel$handleLoadData$2.I$0 = 0;
            financeVipViewModel$handleLoadData$2.I$1 = 0;
            financeVipViewModel$handleLoadData$2.I$2 = 0;
            financeVipViewModel$handleLoadData$2.label = 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final AssetV2Api m16740u() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: v */
    public final void m16744v(ArrayList<FinanceProductEntity> arrayList) {
        BigDecimal lockAmount;
        for (FinanceProductEntity financeProductEntity : arrayList) {
            BigDecimal element = BigDecimal.ZERO;
            List<ProductChildEntity> list = financeProductEntity.getList();
            if (list != null) {
                for (ProductChildEntity productChildEntity : list) {
                    if (productChildEntity != null) {
                        lockAmount = productChildEntity.getLockAmount();
                    } else {
                        lockAmount = null;
                    }
                    if (lockAmount == null) {
                        m16743D(arrayList);
                        return;
                    }
                    element = m16746y(productChildEntity.getLockAmount(), productChildEntity.getCurrency()).add(element);
                    if (element.compareTo(BigDecimal.ZERO) == 0) {
                        m16743D(arrayList);
                        return;
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(element, "element");
            financeProductEntity.setTotalPrice(C41014a.m89950x(C41014a.m89940n(element, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency()), null, null, 0, false, false, false, true, 55, null));
            financeProductEntity.setTotalAmount(element);
        }
        m16743D(arrayList);
    }
}
