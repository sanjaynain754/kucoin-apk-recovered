package com.kubi.margin.trade;

import androidx.fragment.app.Fragment;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p838zo.C46900d;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: BaseMarginFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.BaseMarginFragment$fetchMarginCoupons$1", m90122f = "BaseMarginFragment.kt", m90123i = {}, m90124l = {1419}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBaseMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$fetchMarginCoupons$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1449:1\n25#2:1450\n26#2:1452\n1#3:1451\n*S KotlinDebug\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$fetchMarginCoupons$1\n*L\n1424#1:1450\n1424#1:1452\n1424#1:1451\n*E\n"})
public final class BaseMarginFragment$fetchMarginCoupons$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseMarginFragment this$0;

    /* JADX INFO: renamed from: com.kubi.margin.trade.BaseMarginFragment$fetchMarginCoupons$1$1 */
    /* JADX INFO: compiled from: BaseMarginFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/kubi/margin/api/entity/CouponsOverview;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.trade.BaseMarginFragment$fetchMarginCoupons$1$1", m90122f = "BaseMarginFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nBaseMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$fetchMarginCoupons$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1449:1\n808#2,11:1450\n1869#2,2:1461\n*S KotlinDebug\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$fetchMarginCoupons$1$1\n*L\n1422#1:1450,11\n1423#1:1461,2\n*E\n"})
    public static final class C181651 extends SuspendLambda implements Function2<Pair<? extends CouponsOverview, ? extends CouponsOverview>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseMarginFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Pair<? extends CouponsOverview, ? extends CouponsOverview> pair, Continuation<? super Unit> continuation) {
            return invoke2((Pair<CouponsOverview, CouponsOverview>) pair, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C181651(BaseMarginFragment baseMarginFragment, Continuation<? super C181651> continuation) {
            super(2, continuation);
            this.this$0 = baseMarginFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C181651 c181651 = new C181651(this.this$0, continuation);
            c181651.L$0 = obj;
            return c181651;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Pair<CouponsOverview, CouponsOverview> pair, Continuation<? super Unit> continuation) {
            return ((C181651) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair2 = this.this$0.f33654b0;
            if (C46900d.m103307a(pair2 != null ? (CouponsOverview) pair2.getFirst() : null, (CouponsOverview) pair.getFirst())) {
                Pair pair3 = this.this$0.f33654b0;
                if (C46900d.m103307a(pair3 != null ? (CouponsOverview) pair3.getSecond() : null, (CouponsOverview) pair.getSecond())) {
                    return Unit.INSTANCE;
                }
            }
            this.this$0.f33654b0 = pair;
            List<Fragment> fragments = this.this$0.m39713F5().getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : fragments) {
                if (obj2 instanceof IMarginChildBehavior) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IMarginChildBehavior) it.next()).m40015u0();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarginFragment$fetchMarginCoupons$1(BaseMarginFragment baseMarginFragment, Continuation<? super BaseMarginFragment$fetchMarginCoupons$1> continuation) {
        super(2, continuation);
        this.this$0 = baseMarginFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseMarginFragment$fetchMarginCoupons$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseMarginFragment$fetchMarginCoupons$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
            if (2 == this.this$0.mo39705A0()) {
                str = SharedPositionInfo.MARGIN_MODE_ISOLATED;
            } else {
                str = "MARGIN";
            }
            SymbolInfoEntity symbolInfoEntity = this.this$0.getF33649W().getSymbolInfoEntity();
            Intrinsics.checkNotNullExpressionValue(symbolInfoEntity, "getSymbolInfoEntity(...)");
            InterfaceC41634e<Pair<CouponsOverview, CouponsOverview>> interfaceC41634eM39864A0 = marginConfigManager.m39864A0(str, symbolInfoEntity);
            C181651 c181651 = new C181651(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM39864A0, false, c181651, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
