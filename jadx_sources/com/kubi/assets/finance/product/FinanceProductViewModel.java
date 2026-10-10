package com.kubi.assets.finance.product;

import com.google.android.gms.stats.CodePackage;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.FinanceProductEntity;
import com.kubi.assets.entity.ProductChildEntity;
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

/* JADX INFO: compiled from: FinanceProductViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\r2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\u0002J \u0010\u0018\u001a\u00020\r2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\u0002J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m90084d2 = {"Lcom/kubi/assets/finance/product/FinanceProductViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/finance/product/FinanceProductContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetProductList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildList", "financeList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/FinanceProductEntity;", "Lkotlin/collections/ArrayList;", "updateData", "getTotalPrice", "Ljava/math/BigDecimal;", "it", "code", "", "initState", "getInitState", "()Lcom/kubi/assets/finance/product/FinanceProductContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceProductViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceProductViewModel.kt\ncom/kubi/assets/finance/product/FinanceProductViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n25#2:90\n26#2:92\n1#3:91\n1869#4:93\n1869#4,2:94\n1870#4:96\n*S KotlinDebug\n*F\n+ 1 FinanceProductViewModel.kt\ncom/kubi/assets/finance/product/FinanceProductViewModel\n*L\n48#1:90\n48#1:92\n48#1:91\n54#1:93\n56#1:94,2\n54#1:96\n*E\n"})
public final class FinanceProductViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17469W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.finance.product.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinanceProductViewModel.m16830t();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.finance.product.FinanceProductViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: FinanceProductViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.product.FinanceProductViewModel", m90122f = "FinanceProductViewModel.kt", m90123i = {0, 1}, m90124l = {28, 31}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C100131 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C100131(Continuation<? super C100131> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinanceProductViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: A */
    private final void m16822A(final ArrayList<FinanceProductEntity> arrayList) {
        updateState(new Function1() { // from class: com.kubi.assets.finance.product.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinanceProductViewModel.m16823B(arrayList, (UIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final UIState m16823B(ArrayList arrayList, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, arrayList, false, null, 6, null);
    }

    /* JADX INFO: renamed from: v */
    public static final UIState m16832v(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, ((FinanceProductContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked(), null, 5, null);
    }

    /* JADX INFO: renamed from: w */
    private final AssetV2Api m16833w() {
        return (AssetV2Api) this.f17469W.getValue();
    }

    /* JADX INFO: renamed from: y */
    private final BigDecimal m16834y(BigDecimal bigDecimal, String str) {
        return C41014a.m89916A(bigDecimal, str, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (m16836z(r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C100131 c100131;
        if (continuation instanceof C100131) {
            c100131 = (C100131) continuation;
            int i11 = c100131.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c100131.label = i11 - Integer.MIN_VALUE;
            } else {
                c100131 = new C100131(continuation);
            }
        } else {
            c100131 = new C100131(continuation);
        }
        Object obj = c100131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c100131.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c100131.L$0 = interfaceC19282d;
            c100131.label = 1;
            if (super.dispatchIntentOnIO(interfaceC19282d, c100131) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c100131.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(interfaceC19282d instanceof FinanceProductContract$UiIntent.GetProductList)) {
            if (interfaceC19282d instanceof FinanceProductContract$UiIntent.HideOrShowNumber) {
                updateState(new Function1() { // from class: com.kubi.assets.finance.product.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FinanceProductViewModel.m16832v(interfaceC19282d, (UIState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        c100131.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c100131.label = 2;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, false, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: z */
    public final Object m16836z(Continuation<? super Unit> continuation) {
        FinanceProductViewModel$handleGetProductList$1 financeProductViewModel$handleGetProductList$1;
        if (continuation instanceof FinanceProductViewModel$handleGetProductList$1) {
            financeProductViewModel$handleGetProductList$1 = (FinanceProductViewModel$handleGetProductList$1) continuation;
            int i11 = financeProductViewModel$handleGetProductList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                financeProductViewModel$handleGetProductList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                financeProductViewModel$handleGetProductList$1 = new FinanceProductViewModel$handleGetProductList$1(this, continuation);
            }
        } else {
            financeProductViewModel$handleGetProductList$1 = new FinanceProductViewModel$handleGetProductList$1(this, continuation);
        }
        FinanceProductViewModel$handleGetProductList$1 financeProductViewModel$handleGetProductList$2 = financeProductViewModel$handleGetProductList$1;
        Object objM42824e = financeProductViewModel$handleGetProductList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = financeProductViewModel$handleGetProductList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<ArrayList<FinanceProductEntity>> interfaceC41634eM17119b0 = m16833w().m17119b0(CodePackage.COMMON);
            FinanceProductViewModel$handleGetProductList$2 financeProductViewModel$handleGetProductList$3 = new FinanceProductViewModel$handleGetProductList$2(this, null);
            financeProductViewModel$handleGetProductList$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17119b0, false, financeProductViewModel$handleGetProductList$3, financeProductViewModel$handleGetProductList$2, 1, null);
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
            sendSingleEvent(SingleEvent.C19247c.f35626b);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final AssetV2Api m16830t() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m16831u(ArrayList<FinanceProductEntity> arrayList) {
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
                        m16822A(arrayList);
                        return;
                    }
                    element = m16834y(productChildEntity.getLockAmount(), productChildEntity.getCurrency()).add(element);
                    if (element.compareTo(BigDecimal.ZERO) == 0) {
                        m16822A(arrayList);
                        return;
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(element, "element");
            financeProductEntity.setTotalPrice(C41014a.m89950x(C41014a.m89940n(element, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency()), null, null, 0, false, false, false, true, 55, null));
            financeProductEntity.setTotalAmount(element);
        }
        m16822A(arrayList);
    }
}
