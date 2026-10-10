package com.kubi.payment.fasttradev2.sell;

import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fasttradev2.sell.paymentmethod.SellItemPaymentMethod;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SellVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.sell.SellVM$convertToPresentationModel$2", m90122f = "SellVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSellVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellVM.kt\ncom/kubi/payment/fasttradev2/sell/SellVM$convertToPresentationModel$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,686:1\n1869#2:687\n1869#2,2:688\n1870#2:690\n*S KotlinDebug\n*F\n+ 1 SellVM.kt\ncom/kubi/payment/fasttradev2/sell/SellVM$convertToPresentationModel$2\n*L\n226#1:687\n240#1:688,2\n226#1:690\n*E\n"})
public final class SellVM$convertToPresentationModel$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<SellItemPaymentMethod>>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ List<SellPaymentMethod.Response> $categoryPaymentMethods;
    final /* synthetic */ String $cryptoCurrency;
    final /* synthetic */ String $fiatCurrency;
    final /* synthetic */ String $quoteType;
    int label;
    final /* synthetic */ SellVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellVM$convertToPresentationModel$2(SellVM sellVM, String str, List<SellPaymentMethod.Response> list, String str2, String str3, String str4, Continuation<? super SellVM$convertToPresentationModel$2> continuation) {
        super(2, continuation);
        this.this$0 = sellVM;
        this.$amount = str;
        this.$categoryPaymentMethods = list;
        this.$quoteType = str2;
        this.$fiatCurrency = str3;
        this.$cryptoCurrency = str4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SellVM$convertToPresentationModel$2(this.this$0, this.$amount, this.$categoryPaymentMethods, this.$quoteType, this.$fiatCurrency, this.$cryptoCurrency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<SellItemPaymentMethod>> continuation) {
        return ((SellVM$convertToPresentationModel$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strM92647l;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean zM48074Z = this.this$0.m48074Z(this.$amount);
        ArrayList arrayList = new ArrayList();
        List<SellPaymentMethod.Response> list = this.$categoryPaymentMethods;
        String str2 = this.$quoteType;
        String str3 = this.$fiatCurrency;
        String str4 = this.$amount;
        String str5 = this.$cryptoCurrency;
        for (SellPaymentMethod.Response response : list) {
            arrayList.add(new SellItemPaymentMethod.ItemCategory(C27041f.m66668h(response.getCategoryTitle()), str2, Boxing.boxInt(C27039d.m66650j(response.getMaxCardCount())), C27025c.m66566d(response.getCanEdit()), zM48074Z, C27025c.m66566d(response.getHasP2PGuide()) && C27024b.m66560c(response.getPaymentMethods()).isEmpty()));
            List<SellPaymentMethod.Response.PaymentMethod> paymentMethods = response.getPaymentMethods();
            if (paymentMethods != null) {
                for (SellPaymentMethod.Response.PaymentMethod paymentMethod : paymentMethods) {
                    BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(paymentMethod.getCryptoUnitPrice(), null, 1, null);
                    if (zM48074Z) {
                        strM92647l = C42180b.m92647l(C42180b.m92640e(bigDecimalM66535e, null, PrecisionHelper.f39545a.m48248b(str3), false, false, false, 0, null, 125, null));
                    } else {
                        if (Intrinsics.areEqual(str2, "FIAT")) {
                            BigDecimal bigDecimalMultiply = DowngradeExKt.m66535e(str4, null, 1, null).multiply(DowngradeExKt.m66535e(paymentMethod.getFiatUnitPrice(), null, 1, null));
                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                            strM92647l = C42180b.m92647l(C42180b.m92640e(bigDecimalMultiply, null, PrecisionHelper.f39545a.m48247a(str5), false, false, false, 0, null, 125, null));
                            str = str5;
                        } else {
                            BigDecimal bigDecimalMultiply2 = DowngradeExKt.m66535e(str4, null, 1, null).multiply(DowngradeExKt.m66535e(paymentMethod.getCryptoUnitPrice(), null, 1, null));
                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                            strM92647l = C42180b.m92647l(C42180b.m92640e(bigDecimalMultiply2, null, PrecisionHelper.f39545a.m48248b(str3), false, false, false, 0, null, 125, null));
                        }
                        arrayList.add(new SellItemPaymentMethod.ItemNormalPaymentMethod(paymentMethod, strM92647l, str, false));
                    }
                    str = str3;
                    arrayList.add(new SellItemPaymentMethod.ItemNormalPaymentMethod(paymentMethod, strM92647l, str, false));
                }
            }
            if (C27025c.m66566d(response.getHasP2PGuide())) {
                arrayList.add(SellItemPaymentMethod.ItemGuideP2P.INSTANCE);
            }
        }
        return arrayList;
    }
}
