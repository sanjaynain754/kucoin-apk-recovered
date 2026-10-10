package com.kubi.payment.channel.paymentmethod.recharge;

import androidx.lifecycle.MutableLiveData;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.channel.data.entities.GuidePayment;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.utils.extensions.C27041f;
import gf.C37900x;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RechargePaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.paymentmethod.recharge.RechargePaymentMethodVM$loadPaymentMethodList$1", m90122f = "RechargePaymentMethodVM.kt", m90123i = {}, m90124l = {131}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RechargePaymentMethodVM$loadPaymentMethodList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fiatCurrency;
    int label;
    final /* synthetic */ RechargePaymentMethodVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RechargePaymentMethodVM$loadPaymentMethodList$1(RechargePaymentMethodVM rechargePaymentMethodVM, String str, Continuation<? super RechargePaymentMethodVM$loadPaymentMethodList$1> continuation) {
        super(2, continuation);
        this.this$0 = rechargePaymentMethodVM;
        this.$fiatCurrency = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RechargePaymentMethodVM$loadPaymentMethodList$1(this.this$0, this.$fiatCurrency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RechargePaymentMethodVM$loadPaymentMethodList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String iconUrl;
        List<GuidePayment.PaymentMethod> listEmptyList;
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
            RechargePaymentMethodVM rechargePaymentMethodVM = this.this$0;
            String str = this.$fiatCurrency;
            this.label = 1;
            obj = rechargePaymentMethodVM.m45893J(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Pair pair = (Pair) obj;
        AbstractC42878k abstractC42878k = (AbstractC42878k) pair.component1();
        AbstractC42878k abstractC42878k2 = (AbstractC42878k) pair.component2();
        boolean z11 = abstractC42878k instanceof AbstractC42878k.Error;
        if (z11 && (abstractC42878k2 instanceof AbstractC42878k.Error)) {
            this.this$0.m45658q().setValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, false, true, false, 10, null));
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k2).getException());
        } else {
            List listEmptyList2 = CollectionsKt.emptyList();
            if (abstractC42878k instanceof AbstractC42878k.Success) {
                listEmptyList2 = (List) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                PaymentMethod paymentMethod = (PaymentMethod) CollectionsKt.getOrNull(listEmptyList2, 0);
                if (paymentMethod != null) {
                    iconUrl = paymentMethod.getFiatIconUrl();
                } else {
                    iconUrl = null;
                }
            } else {
                iconUrl = "";
            }
            if (!z11) {
                MutableLiveData mutableLiveData = this.this$0.f38310d0;
                if (abstractC42878k2 instanceof AbstractC42878k.Success) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                mutableLiveData.setValue(TuplesKt.m90091to(listEmptyList2, listEmptyList));
            } else {
                AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
                if (!(error.getException() instanceof ApiException) || !Intrinsics.areEqual(((ApiException) error.getException()).code, "800115")) {
                    MutableLiveData mutableLiveData2 = this.this$0.f38310d0;
                    if ((abstractC42878k2 instanceof AbstractC42878k.Success) || (listEmptyList = ((GuidePayment.Response) ((AbstractC42878k.Success) abstractC42878k2).m94040a()).getPaymentMethodList()) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    mutableLiveData2.setValue(TuplesKt.m90091to(listEmptyList2, listEmptyList));
                } else {
                    this.this$0.f38313g0.setValue(new Object());
                }
            }
            if (iconUrl == null || iconUrl.length() == 0) {
                CoinInfoEntity coinInfoEntityM85638D = C37900x.f85280a.m85638D(C27041f.m66668h(this.$fiatCurrency));
                if (coinInfoEntityM85638D != null) {
                    iconUrl = coinInfoEntityM85638D.getIconUrl();
                } else {
                    iconUrl = null;
                }
            }
            this.this$0.f38312f0.setValue(C27041f.m66668h(iconUrl));
        }
        if (this.this$0.f38307a0) {
            this.this$0.f38307a0 = false;
            C43841b.m96557d("B7channel_deposit", "data_load_finish", null, 4, null);
            C43841b.m96557d("B7channel_deposit", "page_load_end", null, 4, null);
        } else {
            this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
