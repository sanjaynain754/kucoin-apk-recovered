package com.kubi.payment.fast.paymentmethod;

/* JADX INFO: compiled from: PaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@kotlin.Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019J*\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0011J\u0012\u0010#\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0002J\u0016\u0010$\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010%R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/PaymentMethodVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", "application", "Landroid/app/Application;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Landroid/app/Application;)V", "_paymentMethods", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "paymentMethods", "Landroidx/lifecycle/LiveData;", "getPaymentMethods", "()Landroidx/lifecycle/LiveData;", "selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "googlePayClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "loadPaymentMethods", "", "extraParams", "Lcom/kubi/payment/fast/paymentmethod/ExtraParams;", "isFirstLoading", "", "onSuccess", "result", "Lcom/kubi/payment/base/Result$Success;", "(Lcom/kubi/payment/base/Result$Success;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGooglePay", "response", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSelectedPaymentMethod", "paymentMethod", "isGooglePay", "loadCanUseGooglePay", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPaymentMethodVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodVM.kt\ncom/kubi/payment/fast/paymentmethod/PaymentMethodVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,159:1\n1869#2:160\n1869#2,2:161\n1870#2:163\n1#3:164\n44#4,2:165\n*S KotlinDebug\n*F\n+ 1 PaymentMethodVM.kt\ncom/kubi/payment/fast/paymentmethod/PaymentMethodVM\n*L\n87#1:160\n89#1:161,2\n87#1:163\n155#1:165,2\n*E\n"})
public final class PaymentMethodVM extends com.kubi.payment.base.BasePaymentVM<com.kubi.payment.fast.data.source.InterfaceC20506a> {

    /* JADX INFO: renamed from: Z */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.payment.fast.data.source.InterfaceC20506a f38607Z;

    /* JADX INFO: renamed from: a0 */
    @org.jetbrains.annotations.NotNull
    public final android.app.Application f38608a0;

    /* JADX INFO: renamed from: b0 */
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.kubi.payment.fast.data.entities.PaymentMethodList.Response>> f38609b0;

    /* JADX INFO: renamed from: c0 */
    @org.jetbrains.annotations.Nullable
    public com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod f38610c0;

    /* JADX INFO: renamed from: d0 */
    @org.jetbrains.annotations.Nullable
    public com.google.android.gms.wallet.PaymentsClient f38611d0;

    public PaymentMethodVM(@org.jetbrains.annotations.NotNull com.kubi.payment.fast.data.source.InterfaceC20506a r2, @org.jetbrains.annotations.NotNull android.app.Application r3) {
            r1 = this;
            java.lang.String r0 = "repository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "application"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.f38607Z = r2
            r1.f38608a0 = r3
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.f38609b0 = r2
            return
    }

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ com.kubi.payment.fast.data.source.InterfaceC20506a m46568t(com.kubi.payment.fast.paymentmethod.PaymentMethodVM r0) {
            com.kubi.payment.fast.data.source.a r0 = r0.f38607Z
            return r0
    }

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m46569u(com.kubi.payment.fast.paymentmethod.PaymentMethodVM r0) {
            androidx.lifecycle.MutableLiveData r0 = r0.m45657p()
            return r0
    }

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m46570v(com.kubi.payment.fast.paymentmethod.PaymentMethodVM r0) {
            androidx.lifecycle.MutableLiveData r0 = r0.m45658q()
            return r0
    }

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ androidx.lifecycle.MutableLiveData m46571w(com.kubi.payment.fast.paymentmethod.PaymentMethodVM r0) {
            androidx.lifecycle.MutableLiveData r0 = r0.m45659r()
            return r0
    }

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ java.lang.Object m46572x(com.kubi.payment.fast.paymentmethod.PaymentMethodVM r0, com.kubi.payment.fast.data.entities.PaymentMethodList.Response r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m46576B(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ java.lang.Object m46573y(com.kubi.payment.fast.paymentmethod.PaymentMethodVM r0, com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.m46578D(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ java.lang.Object m46574z(com.kubi.payment.fast.paymentmethod.PaymentMethodVM r0, p477nt.AbstractC42878k.b r1, boolean r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.m46580F(r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: A */
    public final androidx.lifecycle.LiveData<java.util.List<com.kubi.payment.fast.data.entities.PaymentMethodList.Response>> m46575A() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<java.util.List<com.kubi.payment.fast.data.entities.PaymentMethodList$Response>> r0 = r1.f38609b0
            return r0
    }

    /* JADX INFO: renamed from: B */
    public final java.lang.Object m46576B(com.kubi.payment.fast.data.entities.PaymentMethodList.Response r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r6 = this;
            boolean r0 = r8 instanceof com.kubi.payment.fast.paymentmethod.PaymentMethodVM$handleGooglePay$1
            if (r0 == 0) goto L13
            r0 = r8
            com.kubi.payment.fast.paymentmethod.PaymentMethodVM$handleGooglePay$1 r0 = (com.kubi.payment.fast.paymentmethod.PaymentMethodVM$handleGooglePay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.payment.fast.paymentmethod.PaymentMethodVM$handleGooglePay$1 r0 = new com.kubi.payment.fast.paymentmethod.PaymentMethodVM$handleGooglePay$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$1
            com.kubi.payment.fast.data.entities.PaymentMethodList$PaymentMethod r7 = (com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod) r7
            java.lang.Object r0 = r0.L$0
            com.kubi.payment.fast.data.entities.PaymentMethodList$Response r0 = (com.kubi.payment.fast.data.entities.PaymentMethodList.Response) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = r7.getPaymentType()
            java.lang.String r2 = "POPULAR_PAY"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r2)
            if (r8 != 0) goto L4b
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L4b:
            java.util.List r8 = r7.getPaymentMethods()
            r2 = 0
            if (r8 == 0) goto L6c
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r8.next()
            r5 = r4
            com.kubi.payment.fast.data.entities.PaymentMethodList$PaymentMethod r5 = (com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod) r5
            boolean r5 = r6.m46577C(r5)
            if (r5 == 0) goto L56
            r2 = r4
        L6a:
            com.kubi.payment.fast.data.entities.PaymentMethodList$PaymentMethod r2 = (com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod) r2
        L6c:
            if (r2 == 0) goto L9d
            r0.L$0 = r7
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r6.m46578D(r2, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            r0 = r7
            r7 = r2
        L7d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L9d
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r7.setHidden(r8)
            java.util.List r7 = r0.getPaymentMethods()
            int r7 = r7.size()
            if (r7 > r3) goto L9d
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r0.setHidden(r7)
        L9d:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }

    /* JADX INFO: renamed from: C */
    public final boolean m46577C(com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L8
            java.lang.String r1 = r4.getPaymentMethodCode()
            goto L9
        L8:
            r1 = r0
        L9:
            java.lang.String r2 = "google_pay"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L32
            if (r4 == 0) goto L18
            java.lang.String r1 = r4.getPaymentMethodCode()
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.String r2 = "google_pay_au"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L32
            if (r4 == 0) goto L27
            java.lang.String r0 = r4.getPaymentMethodCode()
        L27:
            java.lang.String r4 = "google_pay_eu"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            if (r4 == 0) goto L30
            goto L32
        L30:
            r4 = 0
            return r4
        L32:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: D */
    public final java.lang.Object m46578D(com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod r13, kotlin.coroutines.Continuation<? super java.lang.Boolean> r14) {
            r12 = this;
            boolean r0 = r14 instanceof com.kubi.payment.fast.paymentmethod.PaymentMethodVM$loadCanUseGooglePay$1
            if (r0 == 0) goto L13
            r0 = r14
            com.kubi.payment.fast.paymentmethod.PaymentMethodVM$loadCanUseGooglePay$1 r0 = (com.kubi.payment.fast.paymentmethod.PaymentMethodVM$loadCanUseGooglePay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.payment.fast.paymentmethod.PaymentMethodVM$loadCanUseGooglePay$1 r0 = new com.kubi.payment.fast.paymentmethod.PaymentMethodVM$loadCanUseGooglePay$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r13 = r0.L$2
            com.google.android.gms.wallet.IsReadyToPayRequest r13 = (com.google.android.gms.wallet.IsReadyToPayRequest) r13
            java.lang.Object r13 = r0.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.L$0
            com.kubi.payment.fast.data.entities.PaymentMethodList$PaymentMethod r13 = (com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod) r13
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Exception -> L36
            goto L88
        L36:
            r0 = move-exception
            r13 = r0
            goto L95
        L39:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L41:
            kotlin.ResultKt.throwOnFailure(r14)
            com.kubi.payment.fast.buy.popularpay.googlepay.h r14 = com.kubi.payment.fast.buy.popularpay.googlepay.h.a     // Catch: java.lang.Exception -> L36
            android.app.Application r2 = r12.f38608a0     // Catch: java.lang.Exception -> L36
            com.google.android.gms.wallet.PaymentsClient r2 = r14.e(r2)     // Catch: java.lang.Exception -> L36
            r12.f38611d0 = r2     // Catch: java.lang.Exception -> L36
            java.util.List r2 = r13.getSupportedNetworks()     // Catch: java.lang.Exception -> L36
            org.json.JSONObject r14 = r14.c(r2)     // Catch: java.lang.Exception -> L36
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Exception -> L36
            com.google.android.gms.wallet.IsReadyToPayRequest r2 = com.google.android.gms.wallet.IsReadyToPayRequest.fromJson(r14)     // Catch: java.lang.Exception -> L36
            java.lang.String r5 = "fromJson(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Exception -> L36
            com.google.android.gms.wallet.PaymentsClient r5 = r12.f38611d0     // Catch: java.lang.Exception -> L36
            if (r5 == 0) goto L8b
            com.google.android.gms.tasks.Task r5 = r5.isReadyToPay(r2)     // Catch: java.lang.Exception -> L36
            if (r5 == 0) goto L8b
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)     // Catch: java.lang.Exception -> L36
            r0.L$0 = r13     // Catch: java.lang.Exception -> L36
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)     // Catch: java.lang.Exception -> L36
            r0.L$1 = r13     // Catch: java.lang.Exception -> L36
            java.lang.Object r13 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)     // Catch: java.lang.Exception -> L36
            r0.L$2 = r13     // Catch: java.lang.Exception -> L36
            r0.label = r3     // Catch: java.lang.Exception -> L36
            java.lang.Object r14 = com.kubi.payment.fast.buy.popularpay.googlepay.g.a(r5, r0)     // Catch: java.lang.Exception -> L36
            if (r14 != r1) goto L88
            return r1
        L88:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Exception -> L36
            goto L8c
        L8b:
            r14 = r4
        L8c:
            boolean r13 = com.kubi.utils.extensions.C27025c.m66566d(r14)     // Catch: java.lang.Exception -> L36
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r13)     // Catch: java.lang.Exception -> L36
            return r13
        L95:
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "google pay load can use error: "
            r14.append(r0)
            java.lang.String r13 = r13.getMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r6.<init>(r13)
            com.kubi.otc.exception.OtcException r5 = new com.kubi.otc.exception.OtcException
            r10 = 8
            r11 = 0
            java.lang.String r7 = "payment"
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13 = 2
            p569qq.C43846g.m96568c(r5, r4, r13, r4)
            r13 = 0
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r13)
            return r13
    }

    /* JADX INFO: renamed from: E */
    public final void m46579E(@org.jetbrains.annotations.Nullable com.kubi.payment.fast.paymentmethod.ExtraParams r7, boolean r8) {
            r6 = this;
            kotlinx.coroutines.m0 r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            com.kubi.payment.fast.paymentmethod.PaymentMethodVM$loadPaymentMethods$1 r3 = new com.kubi.payment.fast.paymentmethod.PaymentMethodVM$loadPaymentMethods$1
            r1 = 0
            r3.<init>(r8, r6, r7, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.C41686h.m91046d(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: F */
    public final java.lang.Object m46580F(p477nt.AbstractC42878k.b<? extends java.util.List<com.kubi.payment.fast.data.entities.PaymentMethodList.Response>> r12, boolean r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
            r11 = this;
            boolean r0 = r14 instanceof com.kubi.payment.fast.paymentmethod.PaymentMethodVM$onSuccess$1
            if (r0 == 0) goto L13
            r0 = r14
            com.kubi.payment.fast.paymentmethod.PaymentMethodVM$onSuccess$1 r0 = (com.kubi.payment.fast.paymentmethod.PaymentMethodVM$onSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.payment.fast.paymentmethod.PaymentMethodVM$onSuccess$1 r0 = new com.kubi.payment.fast.paymentmethod.PaymentMethodVM$onSuccess$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 != r4) goto L45
            int r12 = r0.I$0
            boolean r13 = r0.Z$0
            java.lang.Object r2 = r0.L$5
            com.kubi.payment.fast.data.entities.PaymentMethodList$Response r2 = (com.kubi.payment.fast.data.entities.PaymentMethodList.Response) r2
            java.lang.Object r5 = r0.L$3
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.L$0
            nt.k$b r8 = (p477nt.AbstractC42878k.b) r8
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = r13
            r13 = r12
            r12 = r8
            goto L94
        L45:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L4d:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r12.m94040a()
            java.util.List r14 = (java.util.List) r14
            java.util.Iterator r2 = r14.iterator()
            r6 = r14
            r7 = r6
            r5 = r2
            r14 = r13
            r13 = r3
        L5f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r5.next()
            r8 = r2
            com.kubi.payment.fast.data.entities.PaymentMethodList$Response r8 = (com.kubi.payment.fast.data.entities.PaymentMethodList.Response) r8
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r0.L$0 = r9
            r0.L$1 = r7
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$2 = r9
            r0.L$3 = r5
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.L$4 = r2
            r0.L$5 = r8
            r0.Z$0 = r14
            r0.I$0 = r13
            r0.I$1 = r3
            r0.label = r4
            java.lang.Object r2 = r11.m46576B(r8, r0)
            if (r2 != r1) goto L93
            return r1
        L93:
            r2 = r8
        L94:
            java.util.List r8 = r2.getPaymentMethods()
            if (r8 == 0) goto L5f
            java.util.Iterator r8 = r8.iterator()
        L9e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L5f
            java.lang.Object r9 = r8.next()
            com.kubi.payment.fast.data.entities.PaymentMethodList$PaymentMethod r9 = (com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod) r9
            com.kubi.payment.fast.data.entities.PaymentMethodList$DailyLimit r10 = r2.getDailyLimit()
            r9.setDailyLimit(r10)
            goto L9e
        Lb2:
            boolean r12 = r7.isEmpty()
            if (r12 == 0) goto Ld3
            androidx.lifecycle.MutableLiveData r12 = r11.m45658q()
            com.kubi.payment.base.BasePaymentVM$LoadingUIState r0 = new com.kubi.payment.base.BasePaymentVM$LoadingUIState
            r5 = 15
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5 = 12
            r2 = 1
            com.kubi.payment.base.BasePaymentVM$LoadingUIState r13 = com.kubi.payment.base.BasePaymentVM.LoadingUIState.copy$default(r0, r1, r2, r3, r4, r5, r6)
            r12.postValue(r13)
            goto Lf3
        Ld3:
            if (r14 == 0) goto Lee
            androidx.lifecycle.MutableLiveData r12 = r11.m45658q()
            com.kubi.payment.base.BasePaymentVM$LoadingUIState r0 = new com.kubi.payment.base.BasePaymentVM$LoadingUIState
            r5 = 15
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5 = 6
            r4 = 1
            com.kubi.payment.base.BasePaymentVM$LoadingUIState r13 = com.kubi.payment.base.BasePaymentVM.LoadingUIState.copy$default(r0, r1, r2, r3, r4, r5, r6)
            r12.postValue(r13)
        Lee:
            androidx.lifecycle.MutableLiveData<java.util.List<com.kubi.payment.fast.data.entities.PaymentMethodList$Response>> r12 = r11.f38609b0
            r12.postValue(r7)
        Lf3:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }

    /* JADX INFO: renamed from: G */
    public final void m46581G(@org.jetbrains.annotations.Nullable com.kubi.payment.fast.data.entities.PaymentMethodList.PaymentMethod r1) {
            r0 = this;
            r0.f38610c0 = r1
            return
    }
}
