package com.kubi.payment.fasttradev2.buy;

import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
import org.tensorflow.lite.schema.BuiltinOperator;
import p477nt.AbstractC42878k;
import p477nt.C42875h;
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

/* JADX INFO: compiled from: BuyVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.BuyVM$loadBuyPaymentMethodList$1", m90122f = "BuyVM.kt", m90123i = {1, 1, 2, 2, 2, 2}, m90124l = {BuiltinOperator.RANDOM_UNIFORM, 160, 175}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT, "categoryPaymentMethods", DbParams.KEY_CHANNEL_RESULT, "categoryPaymentMethods", "paymentMethods", "tempSelectedPaymentMethod"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
public final class BuyVM$loadBuyPaymentMethodList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ String $cryptoCurrency;
    final /* synthetic */ String $fiatCurrency;
    final /* synthetic */ boolean $isRecurring;
    final /* synthetic */ boolean $isSelectedPaymentMethod;
    final /* synthetic */ String $quoteType;
    final /* synthetic */ boolean $refreshBankCard;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ BuyVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyVM$loadBuyPaymentMethodList$1(BuyVM buyVM, boolean z11, String str, String str2, String str3, String str4, boolean z12, boolean z13, Continuation<? super BuyVM$loadBuyPaymentMethodList$1> continuation) {
        super(2, continuation);
        this.this$0 = buyVM;
        this.$refreshBankCard = z11;
        this.$fiatCurrency = str;
        this.$cryptoCurrency = str2;
        this.$amount = str3;
        this.$quoteType = str4;
        this.$isRecurring = z12;
        this.$isSelectedPaymentMethod = z13;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyVM$loadBuyPaymentMethodList$1(this.this$0, this.$refreshBankCard, this.$fiatCurrency, this.$cryptoCurrency, this.$amount, this.$quoteType, this.$isRecurring, this.$isSelectedPaymentMethod, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyVM$loadBuyPaymentMethodList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0158  */
    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        BuyVM$loadBuyPaymentMethodList$1 buyVM$loadBuyPaymentMethodList$1;
        AbstractC42878k abstractC42878k;
        List list;
        List list2;
        BuyPaymentMethod.Response.PaymentMethod paymentMethod;
        Object objM47440Q;
        List list3;
        BuyItemPaymentMethod.ItemNormalPaymentMethod itemNormalPaymentMethod;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        list3 = (List) this.L$2;
                        ResultKt.throwOnFailure(obj);
                        buyVM$loadBuyPaymentMethodList$1 = this;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    list = (List) this.L$1;
                    abstractC42878k = (AbstractC42878k) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    buyVM$loadBuyPaymentMethodList$1 = this;
                    list2 = (List) obj;
                    paymentMethod = (BuyPaymentMethod.Response.PaymentMethod) buyVM$loadBuyPaymentMethodList$1.this$0.f39044d0.getValue();
                    if (paymentMethod == null) {
                        buyVM$loadBuyPaymentMethodList$1.this$0.m47428O(list2);
                    } else {
                        BuyVM buyVM = buyVM$loadBuyPaymentMethodList$1.this$0;
                        buyVM$loadBuyPaymentMethodList$1.L$0 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                        buyVM$loadBuyPaymentMethodList$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                        buyVM$loadBuyPaymentMethodList$1.L$2 = list2;
                        buyVM$loadBuyPaymentMethodList$1.L$3 = SpillingKt.nullOutSpilledVariable(paymentMethod);
                        buyVM$loadBuyPaymentMethodList$1.label = 3;
                        objM47440Q = buyVM.m47440Q(list2, paymentMethod, this);
                        if (objM47440Q != coroutine_suspended) {
                            list3 = list2;
                            obj = objM47440Q;
                        }
                        return coroutine_suspended;
                    }
                    buyVM$loadBuyPaymentMethodList$1.this$0.f39043c0.postValue(list2);
                    buyVM$loadBuyPaymentMethodList$1.this$0.f39046f0.postValue(new C42875h(Boxing.boxBoolean(buyVM$loadBuyPaymentMethodList$1.$isSelectedPaymentMethod)));
                    if (buyVM$loadBuyPaymentMethodList$1.$refreshBankCard) {
                        buyVM$loadBuyPaymentMethodList$1.this$0.f39048h0.setValue(Boxing.boxBoolean(false));
                    } else {
                        buyVM$loadBuyPaymentMethodList$1.this$0.m45657p().setValue(Boxing.boxBoolean(false));
                    }
                    buyVM$loadBuyPaymentMethodList$1.this$0.f39047g0 = false;
                    return Unit.INSTANCE;
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) obj;
            if (itemNormalPaymentMethod == null) {
                buyVM$loadBuyPaymentMethodList$1.this$0.m47428O(list3);
            } else {
                itemNormalPaymentMethod.setSelected(true);
                buyVM$loadBuyPaymentMethodList$1.this$0.m47456g0(itemNormalPaymentMethod.getPaymentMethod());
            }
            list2 = list3;
            buyVM$loadBuyPaymentMethodList$1.this$0.f39043c0.postValue(list2);
            buyVM$loadBuyPaymentMethodList$1.this$0.f39046f0.postValue(new C42875h(Boxing.boxBoolean(buyVM$loadBuyPaymentMethodList$1.$isSelectedPaymentMethod)));
            if (buyVM$loadBuyPaymentMethodList$1.$refreshBankCard) {
                buyVM$loadBuyPaymentMethodList$1.this$0.f39048h0.setValue(Boxing.boxBoolean(false));
            } else {
                buyVM$loadBuyPaymentMethodList$1.this$0.m45657p().setValue(Boxing.boxBoolean(false));
            }
            buyVM$loadBuyPaymentMethodList$1.this$0.f39047g0 = false;
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!this.this$0.f39047g0) {
            this.this$0.f39047g0 = true;
            if (this.$refreshBankCard) {
                this.this$0.f39048h0.setValue(Boxing.boxBoolean(true));
            } else {
                this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            }
            IFastRepository iFastRepository = this.this$0.f39040Z;
            BuyPaymentMethod.Request request = new BuyPaymentMethod.Request(this.$fiatCurrency, this.$cryptoCurrency, this.$amount, this.$quoteType, Boxing.boxBoolean(this.$isRecurring));
            this.label = 1;
            obj = iFastRepository.mo46432m(request, this);
            if (obj == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        AbstractC42878k abstractC42878k2 = (AbstractC42878k) obj;
        if (abstractC42878k2 instanceof AbstractC42878k.Success) {
            List list4 = (List) ((AbstractC42878k.Success) abstractC42878k2).m94040a();
            BuyVM buyVM2 = this.this$0;
            String str = this.$fiatCurrency;
            String str2 = this.$cryptoCurrency;
            String str3 = this.$amount;
            String str4 = this.$quoteType;
            this.L$0 = SpillingKt.nullOutSpilledVariable(abstractC42878k2);
            this.L$1 = SpillingKt.nullOutSpilledVariable(list4);
            this.label = 2;
            buyVM$loadBuyPaymentMethodList$1 = this;
            Object objM47427N = buyVM2.m47427N(str, str2, str3, str4, list4, buyVM$loadBuyPaymentMethodList$1);
            if (objM47427N != coroutine_suspended) {
                abstractC42878k = abstractC42878k2;
                obj = objM47427N;
                list = list4;
                list2 = (List) obj;
                paymentMethod = (BuyPaymentMethod.Response.PaymentMethod) buyVM$loadBuyPaymentMethodList$1.this$0.f39044d0.getValue();
                if (paymentMethod == null) {
                    buyVM$loadBuyPaymentMethodList$1.this$0.m47428O(list2);
                } else {
                    BuyVM buyVM3 = buyVM$loadBuyPaymentMethodList$1.this$0;
                    buyVM$loadBuyPaymentMethodList$1.L$0 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                    buyVM$loadBuyPaymentMethodList$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                    buyVM$loadBuyPaymentMethodList$1.L$2 = list2;
                    buyVM$loadBuyPaymentMethodList$1.L$3 = SpillingKt.nullOutSpilledVariable(paymentMethod);
                    buyVM$loadBuyPaymentMethodList$1.label = 3;
                    objM47440Q = buyVM3.m47440Q(list2, paymentMethod, this);
                    if (objM47440Q != coroutine_suspended) {
                        list3 = list2;
                        obj = objM47440Q;
                        itemNormalPaymentMethod = (BuyItemPaymentMethod.ItemNormalPaymentMethod) obj;
                        if (itemNormalPaymentMethod == null) {
                            buyVM$loadBuyPaymentMethodList$1.this$0.m47428O(list3);
                        } else {
                            itemNormalPaymentMethod.setSelected(true);
                            buyVM$loadBuyPaymentMethodList$1.this$0.m47456g0(itemNormalPaymentMethod.getPaymentMethod());
                        }
                        list2 = list3;
                    }
                }
                buyVM$loadBuyPaymentMethodList$1.this$0.f39043c0.postValue(list2);
                buyVM$loadBuyPaymentMethodList$1.this$0.f39046f0.postValue(new C42875h(Boxing.boxBoolean(buyVM$loadBuyPaymentMethodList$1.$isSelectedPaymentMethod)));
            }
            return coroutine_suspended;
        }
        buyVM$loadBuyPaymentMethodList$1 = this;
        if (abstractC42878k2 instanceof AbstractC42878k.Error) {
            buyVM$loadBuyPaymentMethodList$1.this$0.f39044d0.postValue(null);
            buyVM$loadBuyPaymentMethodList$1.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k2).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (buyVM$loadBuyPaymentMethodList$1.$refreshBankCard) {
            buyVM$loadBuyPaymentMethodList$1.this$0.f39048h0.setValue(Boxing.boxBoolean(false));
        } else {
            buyVM$loadBuyPaymentMethodList$1.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        }
        buyVM$loadBuyPaymentMethodList$1.this$0.f39047g0 = false;
        return Unit.INSTANCE;
    }
}
