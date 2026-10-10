package com.kubi.payment.fasttrade;

import com.kubi.otc.entity.FastLimits;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import y70.C46392a;

/* JADX INFO: compiled from: FastTradeVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttrade.FastTradeVM$loadTradingPairInfo$1", m90122f = "FastTradeVM.kt", m90123i = {}, m90124l = {62}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FastTradeVM$loadTradingPairInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FastTradeVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeVM$loadTradingPairInfo$1(FastTradeVM fastTradeVM, Continuation<? super FastTradeVM$loadTradingPairInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = fastTradeVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeVM$loadTradingPairInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeVM$loadTradingPairInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Map<String, Map<String, FastLimits>> currencyAmounts;
        Set<String> setKeySet;
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
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            IFastRepository iFastRepository = this.this$0.f38722Z;
            this.label = 1;
            obj = iFastRepository.mo46434o0(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f38723a0 = (FastSymbol) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            FastSymbol f38723a0 = this.this$0.getF38723a0();
            String strFirstLegal = null;
            if (f38723a0 != null && (currencyAmounts = f38723a0.getCurrencyAmounts()) != null && (setKeySet = currencyAmounts.keySet()) != null) {
                list = CollectionsKt.toList(setKeySet);
            } else {
                list = null;
            }
            List listM66560c = C27024b.m66560c(list);
            FastSymbol f38723a1 = this.this$0.getF38723a0();
            if (f38723a1 != null) {
                strFirstLegal = f38723a1.firstLegal();
            }
            String strM66668h = C27041f.m66668h(strFirstLegal);
            String strM66668h2 = C27041f.m66668h((String) this.this$0.f38724b0.getValue());
            String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49832j(), "");
            if (strM66668h2.length() > 0) {
                if (listM66560c.contains(strM66668h2)) {
                    strM66668h = strM66668h2;
                }
            } else if (strM102326h.length() > 0 && listM66560c.contains(strM102326h)) {
                strM66668h = strM102326h;
            }
            this.this$0.m46722D(strM66668h, false);
            this.this$0.f38725c0.setValue(Boxing.boxBoolean(true));
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            this.this$0.f38725c0.setValue(Boxing.boxBoolean(false));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
