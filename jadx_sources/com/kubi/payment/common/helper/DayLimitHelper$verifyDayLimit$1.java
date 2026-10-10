package com.kubi.payment.common.helper;

import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5283m0;
import com.kubi.otc.R$string;
import com.kubi.payment.common.data.entities.DayLimit;
import com.kubi.utils.extensions.C27025c;
import ht.C38346y;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DayLimitHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.common.helper.DayLimitHelper$verifyDayLimit$1", m90122f = "DayLimitHelper.kt", m90123i = {}, m90124l = {60}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DayLimitHelper$verifyDayLimit$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ Function0<Unit> $hideLoading;
    final /* synthetic */ String $inputAmount;
    final /* synthetic */ FragmentManager $manage;
    final /* synthetic */ String $tradeType;
    final /* synthetic */ Function1<String, Unit> $verifyLimit;
    final /* synthetic */ Function0<Unit> $verifySuccess;
    int label;
    final /* synthetic */ DayLimitHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DayLimitHelper$verifyDayLimit$1(DayLimitHelper dayLimitHelper, String str, String str2, Function0<Unit> function0, String str3, Function0<Unit> function1, FragmentManager fragmentManager, Function1<? super String, Unit> function2, Continuation<? super DayLimitHelper$verifyDayLimit$1> continuation) {
        super(2, continuation);
        this.this$0 = dayLimitHelper;
        this.$currency = str;
        this.$tradeType = str2;
        this.$hideLoading = function0;
        this.$inputAmount = str3;
        this.$verifySuccess = function1;
        this.$manage = fragmentManager;
        this.$verifyLimit = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DayLimitHelper$verifyDayLimit$1(this.this$0, this.$currency, this.$tradeType, this.$hideLoading, this.$inputAmount, this.$verifySuccess, this.$manage, this.$verifyLimit, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DayLimitHelper$verifyDayLimit$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DayLimitHelper dayLimitHelper = this.this$0;
            String str = this.$currency;
            String str2 = this.$tradeType;
            this.label = 1;
            obj = dayLimitHelper.m46252h(str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        DayLimit dayLimit = (DayLimit) obj;
        if (dayLimit == null) {
            C5283m0.m6288o(R$string.system_error);
            Function0<Unit> function0 = this.$hideLoading;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        if (!C27025c.m66566d(dayLimit.getDayLimitWhiteUser()) && C38346y.m86490A(dayLimit.getLeftAmountCurrency()).compareTo(C38346y.m86490A(this.$inputAmount)) < 0) {
            Function0<Unit> function1 = this.$hideLoading;
            if (function1 != null) {
                function1.invoke();
            }
            this.this$0.m46254j(dayLimit, this.$manage, this.$verifyLimit);
            return Unit.INSTANCE;
        }
        Function0<Unit> function2 = this.$verifySuccess;
        if (function2 != null) {
            function2.invoke();
        }
        Function0<Unit> function3 = this.$hideLoading;
        if (function3 != null) {
            function3.invoke();
        }
        return Unit.INSTANCE;
    }
}
