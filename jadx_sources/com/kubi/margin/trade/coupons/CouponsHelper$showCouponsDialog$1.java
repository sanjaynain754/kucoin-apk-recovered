package com.kubi.margin.trade.coupons;

import com.kubi.margin.api.entity.MarginCouponConfig;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.BaseFragment;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CouponsHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.coupons.CouponsHelper$showCouponsDialog$1", m90122f = "CouponsHelper.kt", m90123i = {0}, m90124l = {78}, m90125m = "invokeSuspend", m90126n = {"tag"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nCouponsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsHelper.kt\ncom/kubi/margin/trade/coupons/CouponsHelper$showCouponsDialog$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n25#2:200\n26#2:202\n1#3:201\n*S KotlinDebug\n*F\n+ 1 CouponsHelper.kt\ncom/kubi/margin/trade/coupons/CouponsHelper$showCouponsDialog$1\n*L\n82#1:200\n82#1:202\n82#1:201\n*E\n"})
public final class CouponsHelper$showCouponsDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ BaseFragment $fragment;
    final /* synthetic */ String $positionTag;
    final /* synthetic */ String $positionType;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.margin.trade.coupons.CouponsHelper$showCouponsDialog$1$1 */
    /* JADX INFO: compiled from: CouponsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/margin/api/entity/MarginCouponConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.trade.coupons.CouponsHelper$showCouponsDialog$1$1", m90122f = "CouponsHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C181981 extends SuspendLambda implements Function2<List<? extends MarginCouponConfig>, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseFragment $fragment;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MarginCouponConfig> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MarginCouponConfig>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C181981(BaseFragment baseFragment, Continuation<? super C181981> continuation) {
            super(2, continuation);
            this.$fragment = baseFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C181981 c181981 = new C181981(this.$fragment, continuation);
            c181981.L$0 = obj;
            return c181981;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MarginCouponConfig> list, Continuation<? super Unit> continuation) {
            return ((C181981) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BaseFragment.hideLoadingDialog$default(this.$fragment, false, 1, null);
            CouponsHelper.f33730a.m40026i(this.$fragment, list);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsHelper$showCouponsDialog$1(BaseFragment baseFragment, String str, String str2, String str3, Continuation<? super CouponsHelper$showCouponsDialog$1> continuation) {
        super(2, continuation);
        this.$fragment = baseFragment;
        this.$positionType = str;
        this.$positionTag = str2;
        this.$currency = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CouponsHelper$showCouponsDialog$1(this.$fragment, this.$positionType, this.$positionTag, this.$currency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CouponsHelper$showCouponsDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CouponsHelper$showCouponsDialog$1 couponsHelper$showCouponsDialog$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                couponsHelper$showCouponsDialog$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.$fragment.showLoadingDialog();
            if (Intrinsics.areEqual(this.$positionType, "MARGIN")) {
                str = "DEFAULT";
            } else {
                str = this.$positionTag;
            }
            InterfaceC41634e<List<MarginCouponConfig>> interfaceC41634eM102055c = CouponsHelper.f33730a.m40024g().m102055c(this.$currency, this.$positionType, str);
            C181981 c181981 = new C181981(this.$fragment, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(str);
            this.label = 1;
            couponsHelper$showCouponsDialog$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM102055c, false, c181981, couponsHelper$showCouponsDialog$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        BaseFragment baseFragment = couponsHelper$showCouponsDialog$1.$fragment;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
