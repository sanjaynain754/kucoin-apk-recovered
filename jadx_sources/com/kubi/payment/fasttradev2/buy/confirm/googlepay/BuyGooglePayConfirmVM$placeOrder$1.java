package com.kubi.payment.fasttradev2.buy.confirm.googlepay;

import android.os.Build;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.extractor.p021ts.PsExtractor;
import com.google.android.gms.wallet.PaymentData;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.BankCard;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.GooglePaymentData;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.util.ForterUtils;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import org.tensorflow.lite.schema.BuiltinOperator;
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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuyGooglePayConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmVM$placeOrder$1", m90122f = "BuyGooglePayConfirmVM.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_SUM, 156, 175, PsExtractor.PRIVATE_STREAM_1}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "googlePaymentDataDeferred", "riskSessionIdDeferred", "$this$launch", "googlePaymentDataDeferred", "riskSessionIdDeferred", "googlePaymentData", "$this$launch", "googlePaymentDataDeferred", "riskSessionIdDeferred", "googlePaymentData", "riskSessionId", "previewOrder", "request", "$this$launch", "googlePaymentDataDeferred", "riskSessionIdDeferred", "googlePaymentData", "riskSessionId", "previewOrder", "request", DbParams.KEY_CHANNEL_RESULT, "data"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
public final class BuyGooglePayConfirmVM$placeOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentData $paymentData;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ BuyGooglePayConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyGooglePayConfirmVM$placeOrder$1(BuyGooglePayConfirmVM buyGooglePayConfirmVM, PaymentData paymentData, Continuation<? super BuyGooglePayConfirmVM$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = buyGooglePayConfirmVM;
        this.$paymentData = paymentData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BuyGooglePayConfirmVM$placeOrder$1 buyGooglePayConfirmVM$placeOrder$1 = new BuyGooglePayConfirmVM$placeOrder$1(this.this$0, this.$paymentData, continuation);
        buyGooglePayConfirmVM$placeOrder$1.L$0 = obj;
        return buyGooglePayConfirmVM$placeOrder$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyGooglePayConfirmVM$placeOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x010d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0110  */
    /* JADX WARN: Code duplicated, block: B:27:0x0134  */
    /* JADX WARN: Code duplicated, block: B:28:0x0139  */
    /* JADX WARN: Code duplicated, block: B:31:0x0154  */
    /* JADX WARN: Code duplicated, block: B:32:0x015b  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x01db  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0207  */
    /* JADX WARN: Code duplicated, block: B:56:0x020c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0228  */
    /* JADX WARN: Code duplicated, block: B:60:0x022d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0282  */
    /* JADX WARN: Code duplicated, block: B:68:0x0288  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d9  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x026a, code lost:
    
        if (r11.m47642x0(r12, r13, r29) == r1) goto L63;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0M91102b2;
        Object objMo91198h;
        Object objMo91198h2;
        InterfaceC41729r0 interfaceC41729r0;
        GooglePaymentData googlePaymentData;
        InterfaceC41729r0 interfaceC41729r1;
        String str;
        BuyPreviewOrder.Response value;
        BankCard.BuyRequest buyRequest;
        BuyCommonConfirmExtraParams f39132n0;
        String cardId;
        boolean z11;
        String base64Token;
        Object objMo46431k0;
        InterfaceC41729r0 interfaceC41729r2;
        BankCard.BuyRequest buyRequest2;
        AbstractC42878k abstractC42878k;
        BankCard.BuyResponse buyResponse;
        String redirectUrl;
        String redirectUrl2;
        BankCard.BuyResponseExtension ext;
        String redirectUrlData;
        BankCard.BuyResponseExtension ext2;
        String redirectUrlData2;
        BankCard.BuyResponseExtension ext3;
        String delayTimeSeconds;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new BuyGooglePayConfirmVM$placeOrder$1$googlePaymentDataDeferred$1(this.this$0, this.$paymentData, null), 3, null);
            interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new BuyGooglePayConfirmVM$placeOrder$1$riskSessionIdDeferred$1(this.this$0, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
            this.L$2 = interfaceC41729r0M91102b2;
            this.label = 1;
            objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            interfaceC41729r0M91102b2 = (InterfaceC41729r0) this.L$2;
            InterfaceC41729r0 interfaceC41729r3 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC41729r0M91102b = interfaceC41729r3;
            objMo91198h = obj;
        } else {
            if (i11 == 2) {
                GooglePaymentData googlePaymentData2 = (GooglePaymentData) this.L$3;
                InterfaceC41729r0 interfaceC41729r4 = (InterfaceC41729r0) this.L$2;
                InterfaceC41729r0 interfaceC41729r5 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                googlePaymentData = googlePaymentData2;
                interfaceC41729r0 = interfaceC41729r4;
                interfaceC41729r1 = interfaceC41729r5;
                objMo91198h2 = obj;
                str = (String) objMo91198h2;
                value = this.this$0.m47534M().getValue();
                if (value == null) {
                    return Unit.INSTANCE;
                }
                String strM66668h = C27041f.m66668h(value.getQuoteId());
                String fiatCurrency = value.getFiatCurrency();
                String fiatAmount = value.getFiatAmount();
                String cryptoCurrency = value.getCryptoCurrency();
                String cryptoAmount = value.getCryptoAmount();
                f39132n0 = this.this$0.getF39132n0();
                if (f39132n0 != null) {
                    cardId = f39132n0.getCardId();
                } else {
                    cardId = null;
                }
                z11 = false;
                String strC = ForterUtils.a.c(BaseApplication.INSTANCE.get());
                String BRAND = Build.BRAND;
                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                BankCard.BuyRequestExtension buyRequestExtension = new BankCard.BuyRequestExtension(cardId, str, strC, BRAND);
                if (googlePaymentData != null) {
                    base64Token = googlePaymentData.getBase64Token();
                } else {
                    base64Token = null;
                }
                buyRequest = new BankCard.BuyRequest(strM66668h, null, fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, buyRequestExtension, base64Token, googlePaymentData, null, this.this$0.m47535N().getValue(), 514, null);
                IFastRepository f39131m0 = this.this$0.getF39131m0();
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$3 = SpillingKt.nullOutSpilledVariable(googlePaymentData);
                this.L$4 = SpillingKt.nullOutSpilledVariable(str);
                this.L$5 = SpillingKt.nullOutSpilledVariable(value);
                this.L$6 = SpillingKt.nullOutSpilledVariable(buyRequest);
                this.label = 3;
                objMo46431k0 = f39131m0.mo46431k0(buyRequest, this);
                if (objMo46431k0 != coroutine_suspended) {
                    interfaceC41729r2 = interfaceC41729r1;
                    buyRequest2 = buyRequest;
                    abstractC42878k = (AbstractC42878k) objMo46431k0;
                    if (abstractC42878k instanceof AbstractC42878k.Success) {
                        buyResponse = (BankCard.BuyResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                        if (Intrinsics.areEqual(buyResponse.getRedirectUrlType(), BankCard.BuyResponseExtension.TYPE_COLLECT_INFO)) {
                            redirectUrl = buyResponse.getRedirectUrl();
                            if (redirectUrl != null) {
                            }
                            ToastCompat.m66437C(R$string.system_error);
                            this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                            return Unit.INSTANCE;
                        }
                        redirectUrl2 = buyResponse.getRedirectUrl();
                        if (redirectUrl2 != null) {
                            ext = buyResponse.getExt();
                            if (ext != null) {
                                redirectUrlData = ext.getRedirectUrlData();
                            } else {
                                redirectUrlData = null;
                            }
                            if (redirectUrlData != null) {
                            }
                            ToastCompat.m66437C(R$string.system_error);
                            this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                            return Unit.INSTANCE;
                        }
                        ext = buyResponse.getExt();
                        if (ext != null) {
                            redirectUrlData = ext.getRedirectUrlData();
                        } else {
                            redirectUrlData = null;
                        }
                        if (redirectUrlData != null) {
                        }
                        ToastCompat.m66437C(R$string.system_error);
                        this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                        return Unit.INSTANCE;
                        MutableLiveData mutableLiveData = this.this$0.f39133o0;
                        BuyGooglePayConfirmVM buyGooglePayConfirmVM = this.this$0;
                        String strM66668h2 = C27041f.m66668h(buyResponse.getRedirectUrl());
                        ext2 = buyResponse.getExt();
                        if (ext2 != null) {
                            redirectUrlData2 = ext2.getRedirectUrlData();
                        } else {
                            redirectUrlData2 = null;
                        }
                        mutableLiveData.setValue(buyGooglePayConfirmVM.m47639h0(strM66668h2, C27041f.m66668h(redirectUrlData2)));
                        BuyGooglePayConfirmVM buyGooglePayConfirmVM2 = this.this$0;
                        String strM66668h3 = C27041f.m66668h(buyResponse.getOrderId());
                        ext3 = buyResponse.getExt();
                        if (ext3 != null) {
                            delayTimeSeconds = ext3.getDelayTimeSeconds();
                        } else {
                            delayTimeSeconds = null;
                        }
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(googlePaymentData);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(str);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(value);
                        this.L$6 = SpillingKt.nullOutSpilledVariable(buyRequest2);
                        this.L$7 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                        this.L$8 = SpillingKt.nullOutSpilledVariable(buyResponse);
                        this.label = 4;
                    } else {
                        if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.m47536O().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 3) {
                buyRequest2 = (BankCard.BuyRequest) this.L$6;
                value = (BuyPreviewOrder.Response) this.L$5;
                str = (String) this.L$4;
                GooglePaymentData googlePaymentData3 = (GooglePaymentData) this.L$3;
                interfaceC41729r0 = (InterfaceC41729r0) this.L$2;
                interfaceC41729r2 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                googlePaymentData = googlePaymentData3;
                z11 = false;
                objMo46431k0 = obj;
                abstractC42878k = (AbstractC42878k) objMo46431k0;
                if (abstractC42878k instanceof AbstractC42878k.Success) {
                    buyResponse = (BankCard.BuyResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                    if (Intrinsics.areEqual(buyResponse.getRedirectUrlType(), BankCard.BuyResponseExtension.TYPE_COLLECT_INFO)) {
                        redirectUrl2 = buyResponse.getRedirectUrl();
                        if (redirectUrl2 != null || redirectUrl2.length() == 0) {
                            ext = buyResponse.getExt();
                            if (ext != null) {
                                redirectUrlData = ext.getRedirectUrlData();
                            } else {
                                redirectUrlData = null;
                            }
                            if (redirectUrlData != null || redirectUrlData.length() == 0) {
                                ToastCompat.m66437C(R$string.system_error);
                                this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                                return Unit.INSTANCE;
                            }
                        }
                        MutableLiveData mutableLiveData2 = this.this$0.f39133o0;
                        BuyGooglePayConfirmVM buyGooglePayConfirmVM3 = this.this$0;
                        String strM66668h4 = C27041f.m66668h(buyResponse.getRedirectUrl());
                        ext2 = buyResponse.getExt();
                        if (ext2 != null) {
                            redirectUrlData2 = ext2.getRedirectUrlData();
                        } else {
                            redirectUrlData2 = null;
                        }
                        mutableLiveData2.setValue(buyGooglePayConfirmVM3.m47639h0(strM66668h4, C27041f.m66668h(redirectUrlData2)));
                        BuyGooglePayConfirmVM buyGooglePayConfirmVM4 = this.this$0;
                        String strM66668h5 = C27041f.m66668h(buyResponse.getOrderId());
                        ext3 = buyResponse.getExt();
                        if (ext3 != null) {
                            delayTimeSeconds = ext3.getDelayTimeSeconds();
                        } else {
                            delayTimeSeconds = null;
                        }
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(googlePaymentData);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(str);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(value);
                        this.L$6 = SpillingKt.nullOutSpilledVariable(buyRequest2);
                        this.L$7 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                        this.L$8 = SpillingKt.nullOutSpilledVariable(buyResponse);
                        this.label = 4;
                    } else {
                        redirectUrl = buyResponse.getRedirectUrl();
                        if (redirectUrl != null || redirectUrl.length() == 0) {
                            ToastCompat.m66437C(R$string.system_error);
                            this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                            return Unit.INSTANCE;
                        }
                        this.this$0.f39134p0.setValue(C27041f.m66668h(buyResponse.getRedirectUrl()));
                    }
                } else {
                    if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.m47536O().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                z11 = false;
            }
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
        return Unit.INSTANCE;
        GooglePaymentData googlePaymentData4 = (GooglePaymentData) objMo91198h;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
        this.L$3 = googlePaymentData4;
        this.label = 2;
        objMo91198h2 = interfaceC41729r0M91102b2.mo91198h(this);
        if (objMo91198h2 != coroutine_suspended) {
            interfaceC41729r0 = interfaceC41729r0M91102b2;
            googlePaymentData = googlePaymentData4;
            interfaceC41729r1 = interfaceC41729r0M91102b;
            str = (String) objMo91198h2;
            value = this.this$0.m47534M().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            String strM66668h6 = C27041f.m66668h(value.getQuoteId());
            String fiatCurrency2 = value.getFiatCurrency();
            String fiatAmount2 = value.getFiatAmount();
            String cryptoCurrency2 = value.getCryptoCurrency();
            String cryptoAmount2 = value.getCryptoAmount();
            f39132n0 = this.this$0.getF39132n0();
            if (f39132n0 != null) {
                cardId = f39132n0.getCardId();
            } else {
                cardId = null;
            }
            z11 = false;
            String strC2 = ForterUtils.a.c(BaseApplication.INSTANCE.get());
            String BRAND2 = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND2, "BRAND");
            BankCard.BuyRequestExtension buyRequestExtension2 = new BankCard.BuyRequestExtension(cardId, str, strC2, BRAND2);
            if (googlePaymentData != null) {
                base64Token = googlePaymentData.getBase64Token();
            } else {
                base64Token = null;
            }
            buyRequest = new BankCard.BuyRequest(strM66668h6, null, fiatCurrency2, fiatAmount2, cryptoCurrency2, cryptoAmount2, buyRequestExtension2, base64Token, googlePaymentData, null, this.this$0.m47535N().getValue(), 514, null);
            IFastRepository f39131m1 = this.this$0.getF39131m0();
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
            this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
            this.L$3 = SpillingKt.nullOutSpilledVariable(googlePaymentData);
            this.L$4 = SpillingKt.nullOutSpilledVariable(str);
            this.L$5 = SpillingKt.nullOutSpilledVariable(value);
            this.L$6 = SpillingKt.nullOutSpilledVariable(buyRequest);
            this.label = 3;
            objMo46431k0 = f39131m1.mo46431k0(buyRequest, this);
            if (objMo46431k0 != coroutine_suspended) {
                interfaceC41729r2 = interfaceC41729r1;
                buyRequest2 = buyRequest;
                abstractC42878k = (AbstractC42878k) objMo46431k0;
                if (abstractC42878k instanceof AbstractC42878k.Success) {
                    buyResponse = (BankCard.BuyResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                    if (Intrinsics.areEqual(buyResponse.getRedirectUrlType(), BankCard.BuyResponseExtension.TYPE_COLLECT_INFO)) {
                        redirectUrl = buyResponse.getRedirectUrl();
                        if (redirectUrl != null) {
                        }
                        ToastCompat.m66437C(R$string.system_error);
                        this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                        return Unit.INSTANCE;
                    }
                    redirectUrl2 = buyResponse.getRedirectUrl();
                    if (redirectUrl2 != null) {
                        ext = buyResponse.getExt();
                        if (ext != null) {
                            redirectUrlData = ext.getRedirectUrlData();
                        } else {
                            redirectUrlData = null;
                        }
                        if (redirectUrlData != null) {
                        }
                        ToastCompat.m66437C(R$string.system_error);
                        this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                        return Unit.INSTANCE;
                    }
                    ext = buyResponse.getExt();
                    if (ext != null) {
                        redirectUrlData = ext.getRedirectUrlData();
                    } else {
                        redirectUrlData = null;
                    }
                    if (redirectUrlData != null) {
                    }
                    ToastCompat.m66437C(R$string.system_error);
                    this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                    return Unit.INSTANCE;
                    MutableLiveData mutableLiveData3 = this.this$0.f39133o0;
                    BuyGooglePayConfirmVM buyGooglePayConfirmVM5 = this.this$0;
                    String strM66668h7 = C27041f.m66668h(buyResponse.getRedirectUrl());
                    ext2 = buyResponse.getExt();
                    if (ext2 != null) {
                        redirectUrlData2 = ext2.getRedirectUrlData();
                    } else {
                        redirectUrlData2 = null;
                    }
                    mutableLiveData3.setValue(buyGooglePayConfirmVM5.m47639h0(strM66668h7, C27041f.m66668h(redirectUrlData2)));
                    BuyGooglePayConfirmVM buyGooglePayConfirmVM6 = this.this$0;
                    String strM66668h8 = C27041f.m66668h(buyResponse.getOrderId());
                    ext3 = buyResponse.getExt();
                    if (ext3 != null) {
                        delayTimeSeconds = ext3.getDelayTimeSeconds();
                    } else {
                        delayTimeSeconds = null;
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r2);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(googlePaymentData);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(str);
                    this.L$5 = SpillingKt.nullOutSpilledVariable(value);
                    this.L$6 = SpillingKt.nullOutSpilledVariable(buyRequest2);
                    this.L$7 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                    this.L$8 = SpillingKt.nullOutSpilledVariable(buyResponse);
                    this.label = 4;
                } else {
                    if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.m47536O().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
                }
                this.this$0.m45657p().setValue(Boxing.boxBoolean(z11));
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
