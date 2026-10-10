package com.kubi.margin.trade.coupons;

import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import io.reactivex.functions.Consumer;
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
@DebugMetadata(m90121c = "com.kubi.margin.trade.coupons.CouponsHelper$requestCouponsData$1", m90122f = "CouponsHelper.kt", m90123i = {0}, m90124l = {61}, m90125m = "invokeSuspend", m90126n = {"tag"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nCouponsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsHelper.kt\ncom/kubi/margin/trade/coupons/CouponsHelper$requestCouponsData$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n25#2:200\n26#2:202\n1#3:201\n*S KotlinDebug\n*F\n+ 1 CouponsHelper.kt\ncom/kubi/margin/trade/coupons/CouponsHelper$requestCouponsData$1\n*L\n64#1:200\n64#1:202\n64#1:201\n*E\n"})
public final class CouponsHelper$requestCouponsData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Consumer<CouponsOverview> $callBack;
    final /* synthetic */ String $currency;
    final /* synthetic */ String $positionType;
    final /* synthetic */ String $symbol;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.margin.trade.coupons.CouponsHelper$requestCouponsData$1$1 */
    /* JADX INFO: compiled from: CouponsHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/margin/api/entity/CouponsOverview;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.trade.coupons.CouponsHelper$requestCouponsData$1$1", m90122f = "CouponsHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C181961 extends SuspendLambda implements Function2<CouponsOverview, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<CouponsOverview> $callBack;
        final /* synthetic */ String $currency;
        final /* synthetic */ String $positionType;
        final /* synthetic */ String $symbol;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CouponsOverview couponsOverview, Continuation<? super Unit> continuation) {
            return ((C181961) create(couponsOverview, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C181961(String str, String str2, String str3, Consumer<CouponsOverview> consumer, Continuation<? super C181961> continuation) {
            super(2, continuation);
            this.$currency = str;
            this.$positionType = str2;
            this.$symbol = str3;
            this.$callBack = consumer;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C181961 c181961 = new C181961(this.$currency, this.$positionType, this.$symbol, this.$callBack, continuation);
            c181961.L$0 = obj;
            return c181961;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            CouponsOverview couponsOverview = (CouponsOverview) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CouponsHelper.f33732c.put(this.$currency + this.$positionType + this.$symbol, couponsOverview);
            this.$callBack.accept((CouponsOverview) CouponsHelper.f33732c.get(this.$currency + this.$positionType + this.$symbol));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponsHelper$requestCouponsData$1(String str, String str2, String str3, Consumer<CouponsOverview> consumer, Continuation<? super CouponsHelper$requestCouponsData$1> continuation) {
        super(2, continuation);
        this.$positionType = str;
        this.$symbol = str2;
        this.$currency = str3;
        this.$callBack = consumer;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CouponsHelper$requestCouponsData$1(this.$positionType, this.$symbol, this.$currency, this.$callBack, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CouponsHelper$requestCouponsData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (Intrinsics.areEqual(this.$positionType, "MARGIN")) {
                str = "DEFAULT";
            } else {
                str = this.$symbol;
            }
            InterfaceC41634e<CouponsOverview> interfaceC41634eM102054b = CouponsHelper.f33730a.m40024g().m102054b(this.$currency, this.$positionType, str);
            C181961 c181961 = new C181961(this.$currency, this.$positionType, this.$symbol, this.$callBack, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(str);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM102054b, false, c181961, this);
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
