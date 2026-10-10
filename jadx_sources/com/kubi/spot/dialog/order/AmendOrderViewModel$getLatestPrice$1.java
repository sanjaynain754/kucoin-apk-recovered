package com.kubi.spot.dialog.order;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.spot.entity.LatestPriceEntity;
import com.kubi.utils.extensions.C27039d;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
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

/* JADX INFO: compiled from: AmendOrderViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.dialog.order.AmendOrderViewModel$getLatestPrice$1", m90122f = "AmendOrderViewModel.kt", m90123i = {}, m90124l = {63}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAmendOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendOrderViewModel.kt\ncom/kubi/spot/dialog/order/AmendOrderViewModel$getLatestPrice$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n25#2:124\n26#2:126\n1#3:125\n*S KotlinDebug\n*F\n+ 1 AmendOrderViewModel.kt\ncom/kubi/spot/dialog/order/AmendOrderViewModel$getLatestPrice$1\n*L\n71#1:124\n71#1:126\n71#1:125\n*E\n"})
public final class AmendOrderViewModel$getLatestPrice$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ AmendOrderViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.AmendOrderViewModel$getLatestPrice$1$1 */
    /* JADX INFO: compiled from: AmendOrderViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/spot/entity/LatestPriceEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.dialog.order.AmendOrderViewModel$getLatestPrice$1$1", m90122f = "AmendOrderViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C252761 extends SuspendLambda implements Function2<LatestPriceEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AmendOrderViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(LatestPriceEntity latestPriceEntity, Continuation<? super Unit> continuation) {
            return ((C252761) create(latestPriceEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C252761(AmendOrderViewModel amendOrderViewModel, Continuation<? super C252761> continuation) {
            super(2, continuation);
            this.this$0 = amendOrderViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C252761 c252761 = new C252761(this.this$0, continuation);
            c252761.L$0 = obj;
            return c252761;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LatestPriceEntity latestPriceEntity = (LatestPriceEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long jM66652l = C27039d.m66652l(latestPriceEntity.getSequence());
            if (jM66652l > this.this$0.f50512c0) {
                this.this$0.f50512c0 = jM66652l;
                this.this$0.f50510a0.postValue(latestPriceEntity.getPrice());
            } else {
                C44128b.m97265i("忽略接口返回，sequence=" + jM66652l + " < latestSequence=" + this.this$0.f50512c0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmendOrderViewModel$getLatestPrice$1(AmendOrderViewModel amendOrderViewModel, String str, Continuation<? super AmendOrderViewModel$getLatestPrice$1> continuation) {
        super(2, continuation);
        this.this$0 = amendOrderViewModel;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AmendOrderViewModel$getLatestPrice$1(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AmendOrderViewModel$getLatestPrice$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AmendOrderViewModel$getLatestPrice$1 amendOrderViewModel$getLatestPrice$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                amendOrderViewModel$getLatestPrice$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<LatestPriceEntity> interfaceC41634eM61721a = this.this$0.m61716y().m61721a(this.$symbol);
            C252761 c252761 = new C252761(this.this$0, null);
            this.label = 1;
            amendOrderViewModel$getLatestPrice$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM61721a, false, c252761, amendOrderViewModel$getLatestPrice$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AmendOrderViewModel amendOrderViewModel = amendOrderViewModel$getLatestPrice$1.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            amendOrderViewModel.f50510a0.postValue(null);
        }
        return Unit.INSTANCE;
    }
}
