package com.kubi.core.spot.business.holder;

import com.kubi.core.biz.coupon.UnifiedCouponAvailableEntity;
import com.kubi.core.biz.coupon.UnifiedCouponRepository;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotDiffHolderImp.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.spot.business.holder.SpotDiffHolderImp$fetchUnifiedCoupon$1", m90122f = "SpotDiffHolderImp.kt", m90123i = {}, m90124l = {320}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SpotDiffHolderImp$fetchUnifiedCoupon$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseOrderHolder $baseOrderHolder;
    final /* synthetic */ int $prizeType;
    final /* synthetic */ String $requestKey;
    final /* synthetic */ String $symbol;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ SpotDiffHolderImp this$0;

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.SpotDiffHolderImp$fetchUnifiedCoupon$1$1 */
    /* JADX INFO: compiled from: SpotDiffHolderImp.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.spot.business.holder.SpotDiffHolderImp$fetchUnifiedCoupon$1$1", m90122f = "SpotDiffHolderImp.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C123071 extends SuspendLambda implements Function3<InterfaceC41635f<? super UnifiedCouponAvailableEntity>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseOrderHolder $baseOrderHolder;
        final /* synthetic */ int $prizeType;
        final /* synthetic */ String $requestKey;
        final /* synthetic */ String $symbol;
        final /* synthetic */ String $userId;
        int label;
        final /* synthetic */ SpotDiffHolderImp this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123071(SpotDiffHolderImp spotDiffHolderImp, String str, int i11, String str2, String str3, BaseOrderHolder baseOrderHolder, Continuation<? super C123071> continuation) {
            super(3, continuation);
            this.this$0 = spotDiffHolderImp;
            this.$requestKey = str;
            this.$prizeType = i11;
            this.$symbol = str2;
            this.$userId = str3;
            this.$baseOrderHolder = baseOrderHolder;
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super UnifiedCouponAvailableEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            return new C123071(this.this$0, this.$requestKey, this.$prizeType, this.$symbol, this.$userId, this.$baseOrderHolder, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(this.this$0.f21088f, this.$requestKey)) {
                    this.this$0.f21088f = null;
                }
                if (UnifiedCouponRepository.f20373a.m21722f(this.$prizeType, this.$symbol, this.$userId) == null) {
                    SpotDiffHolderImp spotDiffHolderImp = this.this$0;
                    BaseOrderHolder baseOrderHolder = spotDiffHolderImp.f21086d;
                    if (baseOrderHolder == null) {
                        baseOrderHolder = this.$baseOrderHolder;
                    }
                    spotDiffHolderImp.m23211T(baseOrderHolder);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.SpotDiffHolderImp$fetchUnifiedCoupon$1$2 */
    /* JADX INFO: compiled from: SpotDiffHolderImp.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.spot.business.holder.SpotDiffHolderImp$fetchUnifiedCoupon$1$2", m90122f = "SpotDiffHolderImp.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C123082 extends SuspendLambda implements Function2<UnifiedCouponAvailableEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseOrderHolder $baseOrderHolder;
        final /* synthetic */ int $prizeType;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SpotDiffHolderImp this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UnifiedCouponAvailableEntity unifiedCouponAvailableEntity, Continuation<? super Unit> continuation) {
            return ((C123082) create(unifiedCouponAvailableEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123082(SpotDiffHolderImp spotDiffHolderImp, BaseOrderHolder baseOrderHolder, int i11, Continuation<? super C123082> continuation) {
            super(2, continuation);
            this.this$0 = spotDiffHolderImp;
            this.$baseOrderHolder = baseOrderHolder;
            this.$prizeType = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C123082 c123082 = new C123082(this.this$0, this.$baseOrderHolder, this.$prizeType, continuation);
            c123082.L$0 = obj;
            return c123082;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UnifiedCouponAvailableEntity unifiedCouponAvailableEntity = (UnifiedCouponAvailableEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SpotDiffHolderImp spotDiffHolderImp = this.this$0;
            BaseOrderHolder baseOrderHolder = spotDiffHolderImp.f21086d;
            if (baseOrderHolder == null) {
                baseOrderHolder = this.$baseOrderHolder;
            }
            spotDiffHolderImp.m23201I(baseOrderHolder, this.$prizeType, unifiedCouponAvailableEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDiffHolderImp$fetchUnifiedCoupon$1(int i11, String str, String str2, SpotDiffHolderImp spotDiffHolderImp, String str3, BaseOrderHolder baseOrderHolder, Continuation<? super SpotDiffHolderImp$fetchUnifiedCoupon$1> continuation) {
        super(2, continuation);
        this.$prizeType = i11;
        this.$symbol = str;
        this.$userId = str2;
        this.this$0 = spotDiffHolderImp;
        this.$requestKey = str3;
        this.$baseOrderHolder = baseOrderHolder;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotDiffHolderImp$fetchUnifiedCoupon$1(this.$prizeType, this.$symbol, this.$userId, this.this$0, this.$requestKey, this.$baseOrderHolder, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SpotDiffHolderImp$fetchUnifiedCoupon$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(UnifiedCouponRepository.f20373a.m21720d(this.$prizeType, this.$symbol, this.$userId), new C123071(this.this$0, this.$requestKey, this.$prizeType, this.$symbol, this.$userId, this.$baseOrderHolder, null));
            C123082 c123082 = new C123082(this.this$0, this.$baseOrderHolder, this.$prizeType, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eM90917h, c123082, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
