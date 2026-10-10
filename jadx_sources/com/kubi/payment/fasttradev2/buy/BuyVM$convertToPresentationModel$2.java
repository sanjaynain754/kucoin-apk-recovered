package com.kubi.payment.fasttradev2.buy;

import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BuyVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.BuyVM$convertToPresentationModel$2", m90122f = "BuyVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {228}, m90125m = "invokeSuspend", m90126n = {"paymentMethods", "$this$forEach$iv", "element$iv", "categoryPaymentMethod", "googlePay", "isInitial", "$i$f$forEach", "$i$a$-forEach-BuyVM$convertToPresentationModel$2$1"}, m90127s = {"L$0", "L$1", "L$8", "L$9", "L$10", "Z$0", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nBuyVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyVM.kt\ncom/kubi/payment/fasttradev2/buy/BuyVM$convertToPresentationModel$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,743:1\n1869#2:744\n1869#2,2:745\n1870#2:747\n*S KotlinDebug\n*F\n+ 1 BuyVM.kt\ncom/kubi/payment/fasttradev2/buy/BuyVM$convertToPresentationModel$2\n*L\n222#1:744\n248#1:745,2\n222#1:747\n*E\n"})
public final class BuyVM$convertToPresentationModel$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<BuyItemPaymentMethod>>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ List<BuyPaymentMethod.Response> $categoryPaymentMethods;
    final /* synthetic */ String $cryptoCurrency;
    final /* synthetic */ String $fiatCurrency;
    final /* synthetic */ String $quoteType;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ BuyVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyVM$convertToPresentationModel$2(BuyVM buyVM, String str, List<BuyPaymentMethod.Response> list, String str2, String str3, String str4, Continuation<? super BuyVM$convertToPresentationModel$2> continuation) {
        super(2, continuation);
        this.this$0 = buyVM;
        this.$amount = str;
        this.$categoryPaymentMethods = list;
        this.$quoteType = str2;
        this.$fiatCurrency = str3;
        this.$cryptoCurrency = str4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyVM$convertToPresentationModel$2(this.this$0, this.$amount, this.$categoryPaymentMethods, this.$quoteType, this.$fiatCurrency, this.$cryptoCurrency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<BuyItemPaymentMethod>> continuation) {
        return ((BuyVM$convertToPresentationModel$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0088  */
    /* JADX WARN: Code duplicated, block: B:16:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:37:0x0110  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x0161  */
    /* JADX WARN: Code duplicated, block: B:50:0x016a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0174  */
    /* JADX WARN: Code duplicated, block: B:55:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0233  */
    /* JADX WARN: Code duplicated, block: B:70:0x0246  */
    /* JADX WARN: Code duplicated, block: B:77:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f1 -> B:32:0x00f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0104 -> B:33:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x00ad
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.payment.fasttradev2.buy.BuyVM$convertToPresentationModel$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
