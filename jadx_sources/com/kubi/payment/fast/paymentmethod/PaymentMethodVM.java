package com.kubi.payment.fast.paymentmethod;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.utils.extensions.C27025c;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019J*\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0011J\u0012\u0010#\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0002J\u0016\u0010$\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010%R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/PaymentMethodVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "repository", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Landroid/app/Application;)V", "_paymentMethods", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "paymentMethods", "Landroidx/lifecycle/LiveData;", "getPaymentMethods", "()Landroidx/lifecycle/LiveData;", "selectedPaymentMethod", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "googlePayClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "loadPaymentMethods", "", "extraParams", "Lcom/kubi/payment/fast/paymentmethod/ExtraParams;", "isFirstLoading", "", "onSuccess", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/payment/base/Result$Success;", "(Lcom/kubi/payment/base/Result$Success;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGooglePay", "response", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSelectedPaymentMethod", "paymentMethod", "isGooglePay", "loadCanUseGooglePay", "(Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodVM.kt\ncom/kubi/payment/fast/paymentmethod/PaymentMethodVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,159:1\n1869#2:160\n1869#2,2:161\n1870#2:163\n1#3:164\n44#4,2:165\n*S KotlinDebug\n*F\n+ 1 PaymentMethodVM.kt\ncom/kubi/payment/fast/paymentmethod/PaymentMethodVM\n*L\n87#1:160\n89#1:161,2\n87#1:163\n155#1:165,2\n*E\n"})
public final class PaymentMethodVM extends BasePaymentVM<IFastRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IFastRepository f38607Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Application f38608a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<List<PaymentMethodList.Response>> f38609b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public PaymentMethodList.PaymentMethod f38610c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public PaymentsClient f38611d0;

    /* JADX INFO: renamed from: C */
    public final boolean m46577C(PaymentMethodList.PaymentMethod paymentMethod) {
        if (Intrinsics.areEqual(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null, "google_pay")) {
            return true;
        }
        if (Intrinsics.areEqual(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null, "google_pay_au")) {
            return true;
        }
        return Intrinsics.areEqual(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null, "google_pay_eu");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodVM(@NotNull IFastRepository repository, @NotNull Application application) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f38607Z = repository;
        this.f38608a0 = application;
        this.f38609b0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<List<PaymentMethodList.Response>> m46575A() {
        return this.f38609b0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m46576B(PaymentMethodList.Response response, Continuation<? super Unit> continuation) {
        PaymentMethodVM$handleGooglePay$1 paymentMethodVM$handleGooglePay$1;
        PaymentMethodList.Response response2;
        PaymentMethodList.PaymentMethod paymentMethod;
        if (continuation instanceof PaymentMethodVM$handleGooglePay$1) {
            paymentMethodVM$handleGooglePay$1 = (PaymentMethodVM$handleGooglePay$1) continuation;
            int i11 = paymentMethodVM$handleGooglePay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                paymentMethodVM$handleGooglePay$1.label = i11 - Integer.MIN_VALUE;
            } else {
                paymentMethodVM$handleGooglePay$1 = new PaymentMethodVM$handleGooglePay$1(this, continuation);
            }
        } else {
            paymentMethodVM$handleGooglePay$1 = new PaymentMethodVM$handleGooglePay$1(this, continuation);
        }
        Object objM46578D = paymentMethodVM$handleGooglePay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = paymentMethodVM$handleGooglePay$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM46578D);
            if (!Intrinsics.areEqual(response.getPaymentType(), "POPULAR_PAY")) {
                return Unit.INSTANCE;
            }
            List<PaymentMethodList.PaymentMethod> paymentMethods = response.getPaymentMethods();
            PaymentMethodList.PaymentMethod paymentMethod2 = null;
            Object obj = null;
            if (paymentMethods != null) {
                for (Object obj2 : paymentMethods) {
                    if (m46577C((PaymentMethodList.PaymentMethod) obj2)) {
                        obj = obj2;
                        break;
                    }
                }
                paymentMethod2 = (PaymentMethodList.PaymentMethod) obj;
            }
            if (paymentMethod2 != null) {
                paymentMethodVM$handleGooglePay$1.L$0 = response;
                paymentMethodVM$handleGooglePay$1.L$1 = paymentMethod2;
                paymentMethodVM$handleGooglePay$1.label = 1;
                objM46578D = m46578D(paymentMethod2, paymentMethodVM$handleGooglePay$1);
                if (objM46578D == coroutine_suspended) {
                    return coroutine_suspended;
                }
                response2 = response;
                paymentMethod = paymentMethod2;
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paymentMethod = (PaymentMethodList.PaymentMethod) paymentMethodVM$handleGooglePay$1.L$1;
        response2 = (PaymentMethodList.Response) paymentMethodVM$handleGooglePay$1.L$0;
        ResultKt.throwOnFailure(objM46578D);
        if (!((Boolean) objM46578D).booleanValue()) {
            paymentMethod.setHidden(Boxing.boxBoolean(true));
            if (response2.getPaymentMethods().size() <= 1) {
                response2.setHidden(Boxing.boxBoolean(true));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D */
    public final Object m46578D(PaymentMethodList.PaymentMethod paymentMethod, Continuation<? super Boolean> continuation) {
        PaymentMethodVM$loadCanUseGooglePay$1 paymentMethodVM$loadCanUseGooglePay$1;
        Boolean bool;
        Task<Boolean> taskIsReadyToPay;
        if (continuation instanceof PaymentMethodVM$loadCanUseGooglePay$1) {
            paymentMethodVM$loadCanUseGooglePay$1 = (PaymentMethodVM$loadCanUseGooglePay$1) continuation;
            int i11 = paymentMethodVM$loadCanUseGooglePay$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                paymentMethodVM$loadCanUseGooglePay$1.label = i11 - Integer.MIN_VALUE;
            } else {
                paymentMethodVM$loadCanUseGooglePay$1 = new PaymentMethodVM$loadCanUseGooglePay$1(this, continuation);
            }
        } else {
            paymentMethodVM$loadCanUseGooglePay$1 = new PaymentMethodVM$loadCanUseGooglePay$1(this, continuation);
        }
        Object objA = paymentMethodVM$loadCanUseGooglePay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = paymentMethodVM$loadCanUseGooglePay$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objA);
                com.kubi.payment.fast.buy.popularpay.googlepay.h hVar = com.kubi.payment.fast.buy.popularpay.googlepay.h.a;
                this.f38611d0 = hVar.e(this.f38608a0);
                String strValueOf = String.valueOf(hVar.c(paymentMethod.getSupportedNetworks()));
                IsReadyToPayRequest isReadyToPayRequestFromJson = IsReadyToPayRequest.fromJson(strValueOf);
                Intrinsics.checkNotNullExpressionValue(isReadyToPayRequestFromJson, "fromJson(...)");
                PaymentsClient paymentsClient = this.f38611d0;
                if (paymentsClient == null || (taskIsReadyToPay = paymentsClient.isReadyToPay(isReadyToPayRequestFromJson)) == null) {
                    bool = null;
                } else {
                    paymentMethodVM$loadCanUseGooglePay$1.L$0 = SpillingKt.nullOutSpilledVariable(paymentMethod);
                    paymentMethodVM$loadCanUseGooglePay$1.L$1 = SpillingKt.nullOutSpilledVariable(strValueOf);
                    paymentMethodVM$loadCanUseGooglePay$1.L$2 = SpillingKt.nullOutSpilledVariable(isReadyToPayRequestFromJson);
                    paymentMethodVM$loadCanUseGooglePay$1.label = 1;
                    objA = com.kubi.payment.fast.buy.popularpay.googlepay.g.a(taskIsReadyToPay, paymentMethodVM$loadCanUseGooglePay$1);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(C27025c.m66566d(bool));
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
            bool = (Boolean) objA;
            return Boxing.boxBoolean(C27025c.m66566d(bool));
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(new Throwable("google pay load can use error: " + e11.getMessage()), "payment", false, null, 8, null), null, 2, null);
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4 A[LOOP:0: B:24:0x009e->B:26:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.kubi.payment.base.BasePaymentVM, com.kubi.payment.fast.paymentmethod.PaymentMethodVM] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0093 -> B:21:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: F */
    public final java.lang.Object m46580F(p477nt.AbstractC42878k.Success<? extends java.util.List<com.kubi.payment.fast.data.entities.PaymentMethodList.Response>> r12, boolean r13, p852kotlin.coroutines.Continuation<? super p852kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.payment.fast.paymentmethod.PaymentMethodVM.m46580F(nt.k$b, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: G */
    public final void m46581G(@Nullable PaymentMethodList.PaymentMethod paymentMethod) {
        this.f38610c0 = paymentMethod;
    }

    /* JADX INFO: renamed from: E */
    public final void m46579E(@Nullable ExtraParams extraParams, boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new PaymentMethodVM$loadPaymentMethods$1(z11, this, extraParams, null), 3, null);
    }
}
