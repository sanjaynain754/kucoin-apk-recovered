package com.kubi.core.biz.coupon;

import com.tencent.qcloud.tuicore.TUIConstants;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.coupon.UnifiedCouponRepository$fetchAvailableCoupons$1", m90122f = "UnifiedTradeCoupon.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifiedCouponRepository$fetchAvailableCoupons$1 extends SuspendLambda implements Function2<UnifiedCouponAvailableEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnifiedCouponRepository.CacheKey $key;
    /* synthetic */ Object L$0;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(UnifiedCouponAvailableEntity unifiedCouponAvailableEntity, Continuation<? super Unit> continuation) {
        return ((UnifiedCouponRepository$fetchAvailableCoupons$1) create(unifiedCouponAvailableEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedCouponRepository$fetchAvailableCoupons$1(UnifiedCouponRepository.CacheKey cacheKey, Continuation<? super UnifiedCouponRepository$fetchAvailableCoupons$1> continuation) {
        super(2, continuation);
        this.$key = cacheKey;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifiedCouponRepository$fetchAvailableCoupons$1 unifiedCouponRepository$fetchAvailableCoupons$1 = new UnifiedCouponRepository$fetchAvailableCoupons$1(this.$key, continuation);
        unifiedCouponRepository$fetchAvailableCoupons$1.L$0 = obj;
        return unifiedCouponRepository$fetchAvailableCoupons$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UnifiedCouponAvailableEntity unifiedCouponAvailableEntity = (UnifiedCouponAvailableEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UnifiedCouponRepository.f20375c.put(this.$key, unifiedCouponAvailableEntity);
        return Unit.INSTANCE;
    }
}
