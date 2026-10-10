package com.kubi.margin.trade.coupons;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.kubi.event.api.C12572a;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.MarginCouponConfig;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.ToastCompat;
import java.util.HashMap;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p768xo.InterfaceC46300a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CouponsHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.coupons.CouponsHelper$showAllCouponsDialog$1$1$convert$2$1", m90122f = "CouponsHelper.kt", m90123i = {}, m90124l = {181}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCouponsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsHelper.kt\ncom/kubi/margin/trade/coupons/CouponsHelper$showAllCouponsDialog$1$1$convert$2$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n25#2:200\n26#2:202\n1#3:201\n*S KotlinDebug\n*F\n+ 1 CouponsHelper.kt\ncom/kubi/margin/trade/coupons/CouponsHelper$showAllCouponsDialog$1$1$convert$2$1\n*L\n189#1:200\n189#1:202\n189#1:201\n*E\n"})
public final class CouponsHelper$showAllCouponsDialog$1$1$convert$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ KcPrimaryButton $btn;
    final /* synthetic */ BaseFragment $fragment;
    final /* synthetic */ MarginCouponConfig $item;
    int label;

    /* JADX INFO: renamed from: com.kubi.margin.trade.coupons.CouponsHelper$showAllCouponsDialog$1$1$convert$2$1$2 */
    /* JADX INFO: compiled from: CouponsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.trade.coupons.CouponsHelper$showAllCouponsDialog$1$1$convert$2$1$2", m90122f = "CouponsHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C181972 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ KcPrimaryButton $btn;
        final /* synthetic */ BaseFragment $fragment;
        final /* synthetic */ MarginCouponConfig $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C181972(MarginCouponConfig marginCouponConfig, KcPrimaryButton kcPrimaryButton, BaseFragment baseFragment, Continuation<? super C181972> continuation) {
            super(2, continuation);
            this.$item = marginCouponConfig;
            this.$btn = kcPrimaryButton;
            this.$fragment = baseFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C181972(this.$item, this.$btn, this.$fragment, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C181972) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DialogFragment dialogFragment;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String couponId = this.$item.getCouponId();
                if (couponId == null) {
                    couponId = "";
                }
                C12572a.m23695d("useMarginCouponsSuccess", couponId, 0L, 4, null);
                ToastCompat.m66437C(R$string.margin_coupons_use_success);
                this.$btn.mo28851l();
                Fragment fragmentFindFragmentByTag = this.$fragment.getChildFragmentManager().findFragmentByTag("showAllCouponsDialog");
                if (fragmentFindFragmentByTag instanceof DialogFragment) {
                    dialogFragment = (DialogFragment) fragmentFindFragmentByTag;
                } else {
                    dialogFragment = null;
                }
                if (dialogFragment != null) {
                    dialogFragment.dismissAllowingStateLoss();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsHelper$showAllCouponsDialog$1$1$convert$2$1(MarginCouponConfig marginCouponConfig, KcPrimaryButton kcPrimaryButton, BaseFragment baseFragment, Continuation<? super CouponsHelper$showAllCouponsDialog$1$1$convert$2$1> continuation) {
        super(2, continuation);
        this.$item = marginCouponConfig;
        this.$btn = kcPrimaryButton;
        this.$fragment = baseFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CouponsHelper$showAllCouponsDialog$1$1$convert$2$1(this.$item, this.$btn, this.$fragment, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CouponsHelper$showAllCouponsDialog$1$1$convert$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CouponsHelper$showAllCouponsDialog$1$1$convert$2$1 couponsHelper$showAllCouponsDialog$1$1$convert$2$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                couponsHelper$showAllCouponsDialog$1$1$convert$2$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC46300a interfaceC46300aM40024g = CouponsHelper.f33730a.m40024g();
            HashMap<String, String> map = new HashMap<>();
            MarginCouponConfig marginCouponConfig = this.$item;
            String activityId = marginCouponConfig.getActivityId();
            String str = "";
            if (activityId == null) {
                activityId = "";
            }
            map.put("activityId", activityId);
            String couponId = marginCouponConfig.getCouponId();
            if (couponId != null) {
                str = couponId;
            }
            map.put("couponId", str);
            InterfaceC41634e<Object> interfaceC41634eM102053a = interfaceC46300aM40024g.m102053a(map);
            C181972 c181972 = new C181972(this.$item, this.$btn, this.$fragment, null);
            this.label = 1;
            couponsHelper$showAllCouponsDialog$1$1$convert$2$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM102053a, false, c181972, couponsHelper$showAllCouponsDialog$1$1$convert$2$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        KcPrimaryButton kcPrimaryButton = couponsHelper$showAllCouponsDialog$1$1$convert$2$1.$btn;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            kcPrimaryButton.mo28851l();
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
