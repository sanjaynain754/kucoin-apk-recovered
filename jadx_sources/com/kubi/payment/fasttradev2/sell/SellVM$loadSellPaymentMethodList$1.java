package com.kubi.payment.fasttradev2.sell;

import androidx.media3.extractor.p021ts.PsExtractor;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttradev2.sell.paymentmethod.SellItemPaymentMethod;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SellVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.sell.SellVM$loadSellPaymentMethodList$1", m90122f = "SellVM.kt", m90123i = {1, 1, 2, 2, 2, 2}, m90124l = {163, 174, PsExtractor.PRIVATE_STREAM_1}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT, "categoryPaymentMethods", DbParams.KEY_CHANNEL_RESULT, "categoryPaymentMethods", "paymentMethods", "tempSelectedPaymentMethod"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
public final class SellVM$loadSellPaymentMethodList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ String $cryptoCurrency;
    final /* synthetic */ String $fiatCurrency;
    final /* synthetic */ boolean $isSelectedPaymentMethod;
    final /* synthetic */ String $quoteType;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SellVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellVM$loadSellPaymentMethodList$1(SellVM sellVM, String str, String str2, String str3, String str4, boolean z11, Continuation<? super SellVM$loadSellPaymentMethodList$1> continuation) {
        super(2, continuation);
        this.this$0 = sellVM;
        this.$fiatCurrency = str;
        this.$cryptoCurrency = str2;
        this.$amount = str3;
        this.$quoteType = str4;
        this.$isSelectedPaymentMethod = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SellVM$loadSellPaymentMethodList$1(this.this$0, this.$fiatCurrency, this.$cryptoCurrency, this.$amount, this.$quoteType, this.$isSelectedPaymentMethod, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SellVM$loadSellPaymentMethodList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        SellVM$loadSellPaymentMethodList$1 sellVM$loadSellPaymentMethodList$1;
        AbstractC42878k abstractC42878k;
        List list;
        List list2;
        SellPaymentMethod.Response.PaymentMethod paymentMethod;
        Object objM48049R;
        List list3;
        SellItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        list3 = (List) this.L$2;
                        ResultKt.throwOnFailure(obj);
                        sellVM$loadSellPaymentMethodList$1 = this;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    list = (List) this.L$1;
                    abstractC42878k = (AbstractC42878k) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    sellVM$loadSellPaymentMethodList$1 = this;
                    list2 = (List) obj;
                    paymentMethod = (SellPaymentMethod.Response.PaymentMethod) sellVM$loadSellPaymentMethodList$1.this$0.f39428d0.getValue();
                    if (paymentMethod == null) {
                        sellVM$loadSellPaymentMethodList$1.this$0.m48048N(list2);
                    } else {
                        SellVM sellVM = sellVM$loadSellPaymentMethodList$1.this$0;
                        sellVM$loadSellPaymentMethodList$1.L$0 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                        sellVM$loadSellPaymentMethodList$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                        sellVM$loadSellPaymentMethodList$1.L$2 = list2;
                        sellVM$loadSellPaymentMethodList$1.L$3 = SpillingKt.nullOutSpilledVariable(paymentMethod);
                        sellVM$loadSellPaymentMethodList$1.label = 3;
                        objM48049R = sellVM.m48049R(list2, paymentMethod, this);
                        if (objM48049R != coroutine_suspended) {
                            list3 = list2;
                            obj = objM48049R;
                        }
                        return coroutine_suspended;
                    }
                    sellVM$loadSellPaymentMethodList$1.this$0.f39427c0.setValue(list2);
                    sellVM$loadSellPaymentMethodList$1.this$0.f39429e0.setValue(Boxing.boxBoolean(sellVM$loadSellPaymentMethodList$1.$isSelectedPaymentMethod));
                    sellVM$loadSellPaymentMethodList$1.this$0.m45657p().setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            itemNormalPaymentMethod = (SellItemPaymentMethod.ItemNormalPaymentMethod) obj;
            if (itemNormalPaymentMethod == null) {
                sellVM$loadSellPaymentMethodList$1.this$0.m48048N(list3);
            } else {
                itemNormalPaymentMethod.setSelected(true);
                sellVM$loadSellPaymentMethodList$1.this$0.m48051f0(itemNormalPaymentMethod.getPaymentMethod());
            }
            list2 = list3;
            sellVM$loadSellPaymentMethodList$1.this$0.f39427c0.setValue(list2);
            sellVM$loadSellPaymentMethodList$1.this$0.f39429e0.setValue(Boxing.boxBoolean(sellVM$loadSellPaymentMethodList$1.$isSelectedPaymentMethod));
            sellVM$loadSellPaymentMethodList$1.this$0.m45657p().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
        IFastRepository iFastRepository = this.this$0.f39424Z;
        SellPaymentMethod.Request request = new SellPaymentMethod.Request(this.$fiatCurrency, this.$cryptoCurrency, this.$amount, this.$quoteType);
        this.label = 1;
        obj = iFastRepository.mo46441y(request, this);
        if (obj == coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC42878k abstractC42878k2 = (AbstractC42878k) obj;
        if (abstractC42878k2 instanceof AbstractC42878k.Success) {
            List list4 = (List) ((AbstractC42878k.Success) abstractC42878k2).m94040a();
            SellVM sellVM2 = this.this$0;
            String str = this.$fiatCurrency;
            String str2 = this.$cryptoCurrency;
            String str3 = this.$amount;
            String str4 = this.$quoteType;
            this.L$0 = SpillingKt.nullOutSpilledVariable(abstractC42878k2);
            this.L$1 = SpillingKt.nullOutSpilledVariable(list4);
            this.label = 2;
            sellVM$loadSellPaymentMethodList$1 = this;
            Object objM48047M = sellVM2.m48047M(str, str2, str3, str4, list4, sellVM$loadSellPaymentMethodList$1);
            if (objM48047M != coroutine_suspended) {
                abstractC42878k = abstractC42878k2;
                obj = objM48047M;
                list = list4;
                list2 = (List) obj;
                paymentMethod = (SellPaymentMethod.Response.PaymentMethod) sellVM$loadSellPaymentMethodList$1.this$0.f39428d0.getValue();
                if (paymentMethod == null) {
                    sellVM$loadSellPaymentMethodList$1.this$0.m48048N(list2);
                } else {
                    SellVM sellVM3 = sellVM$loadSellPaymentMethodList$1.this$0;
                    sellVM$loadSellPaymentMethodList$1.L$0 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                    sellVM$loadSellPaymentMethodList$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                    sellVM$loadSellPaymentMethodList$1.L$2 = list2;
                    sellVM$loadSellPaymentMethodList$1.L$3 = SpillingKt.nullOutSpilledVariable(paymentMethod);
                    sellVM$loadSellPaymentMethodList$1.label = 3;
                    objM48049R = sellVM3.m48049R(list2, paymentMethod, this);
                    if (objM48049R != coroutine_suspended) {
                        list3 = list2;
                        obj = objM48049R;
                        itemNormalPaymentMethod = (SellItemPaymentMethod.ItemNormalPaymentMethod) obj;
                        if (itemNormalPaymentMethod == null) {
                            sellVM$loadSellPaymentMethodList$1.this$0.m48048N(list3);
                        } else {
                            itemNormalPaymentMethod.setSelected(true);
                            sellVM$loadSellPaymentMethodList$1.this$0.m48051f0(itemNormalPaymentMethod.getPaymentMethod());
                        }
                        list2 = list3;
                    }
                }
                sellVM$loadSellPaymentMethodList$1.this$0.f39427c0.setValue(list2);
                sellVM$loadSellPaymentMethodList$1.this$0.f39429e0.setValue(Boxing.boxBoolean(sellVM$loadSellPaymentMethodList$1.$isSelectedPaymentMethod));
            }
            return coroutine_suspended;
        }
        sellVM$loadSellPaymentMethodList$1 = this;
        if (abstractC42878k2 instanceof AbstractC42878k.Error) {
            sellVM$loadSellPaymentMethodList$1.this$0.f39428d0.setValue(null);
            sellVM$loadSellPaymentMethodList$1.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k2).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        sellVM$loadSellPaymentMethodList$1.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
