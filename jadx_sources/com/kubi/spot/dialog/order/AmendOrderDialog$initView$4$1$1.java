package com.kubi.spot.dialog.order;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.utils.ToastCompat;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AmendOrderDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "validationToken", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.dialog.order.AmendOrderDialog$initView$4$1$1", m90122f = "AmendOrderDialog.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {179, 185}, m90125m = "invokeSuspend", m90126n = {"validationToken", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AmendOrderDialog$initView$4$1$1$1", "validationToken", DbParams.KEY_CHANNEL_RESULT, "$i$a$-onSuccess-AmendOrderDialog$initView$4$1$1$2"}, m90127s = {"L$0", "L$1", "I$0", "L$0", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nAmendOrderDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog$initView$4$1$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n25#2:404\n26#2:406\n1#3:405\n*S KotlinDebug\n*F\n+ 1 AmendOrderDialog.kt\ncom/kubi/spot/dialog/order/AmendOrderDialog$initView$4$1$1\n*L\n194#1:404\n194#1:406\n194#1:405\n*E\n"})
public final class AmendOrderDialog$initView$4$1$1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ AmendContext $amendContext;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AmendOrderDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmendOrderDialog$initView$4$1$1(AmendOrderDialog amendOrderDialog, AmendContext amendContext, Continuation<? super AmendOrderDialog$initView$4$1$1> continuation) {
        super(2, continuation);
        this.this$0 = amendOrderDialog;
        this.$amendContext = amendContext;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AmendOrderDialog$initView$4$1$1 amendOrderDialog$initView$4$1$1 = new AmendOrderDialog$initView$4$1$1(this.this$0, this.$amendContext, continuation);
        amendOrderDialog$initView$4$1$1.L$0 = obj;
        return amendOrderDialog$initView$4$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((AmendOrderDialog$initView$4$1$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00f7, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM103844constructorimpl;
        AmendOrderDialog amendOrderDialog;
        Object obj2;
        AmendOrderDialog amendOrderDialog2;
        AmendOrderDialog amendOrderDialog3;
        Throwable thM103847exceptionOrNullimpl;
        C19334f c19334f;
        Throwable throwable;
        String message;
        String str = (String) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.showLoading();
                AmendOrderDialog amendOrderDialog4 = this.this$0;
                AmendContext amendContext = this.$amendContext;
                Result.Companion companion = Result.INSTANCE;
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                AmendOrderDialog$initView$4$1$1$1$1 amendOrderDialog$initView$4$1$1$1$1 = new AmendOrderDialog$initView$4$1$1$1$1(amendOrderDialog4, amendContext, str, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                this.L$1 = SpillingKt.nullOutSpilledVariable(amendOrderDialog4);
                this.I$0 = 0;
                this.label = 1;
                obj = C41686h.m91049g(abstractC41697j0M94120b, amendOrderDialog$initView$4$1$1$1$1, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                amendOrderDialog2 = (AmendOrderDialog) this.L$2;
                obj2 = this.L$1;
                ResultKt.throwOnFailure(obj);
            }
            c19334f = (C19334f) obj;
            if (c19334f != null) {
                throwable = c19334f.getThrowable();
                if (throwable != null) {
                    message = throwable.getMessage();
                    if (message != null && message.length() != 0) {
                        ToastCompat.m66441G(throwable.getMessage(), new Object[0]);
                    }
                    if (throwable instanceof ApiException) {
                        amendOrderDialog2.m61694C4(false, ((ApiException) throwable).code);
                    }
                }
                objM103844constructorimpl = obj2;
            } else {
                amendOrderDialog = amendOrderDialog2;
                objM103844constructorimpl = obj2;
                amendOrderDialog2 = amendOrderDialog;
            }
            if (amendOrderDialog2.isVisible()) {
                amendOrderDialog2.m61663M4();
            }
            amendOrderDialog3 = this.this$0;
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97260d("AmendOrderDialog: " + thM103847exceptionOrNullimpl);
                if (amendOrderDialog3.isVisible()) {
                    amendOrderDialog3.m61663M4();
                }
            }
            return Unit.INSTANCE;
            Object value = ((Result) obj).getValue();
            if (Result.m103850isFailureimpl(value)) {
                value = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC41634e) value);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        amendOrderDialog = this.this$0;
        AmendContext amendContext2 = this.$amendContext;
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            InterfaceC41634e interfaceC41634e = (InterfaceC41634e) objM103844constructorimpl;
            amendOrderDialog.showLoading();
            if (interfaceC41634e != null) {
                AmendOrderDialog$initView$4$1$1$2$1 amendOrderDialog$initView$4$1$1$2$1 = new AmendOrderDialog$initView$4$1$1$2$1(amendOrderDialog, amendContext2, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                this.L$1 = objM103844constructorimpl;
                this.L$2 = amendOrderDialog;
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41634e);
                this.I$0 = 0;
                this.label = 2;
                Object objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634e, false, amendOrderDialog$initView$4$1$1$2$1, this);
                if (objM42823d != coroutine_suspended) {
                    obj2 = objM103844constructorimpl;
                    obj = objM42823d;
                    amendOrderDialog2 = amendOrderDialog;
                    c19334f = (C19334f) obj;
                    if (c19334f != null) {
                        throwable = c19334f.getThrowable();
                        if (throwable != null) {
                            message = throwable.getMessage();
                            if (message != null) {
                                ToastCompat.m66441G(throwable.getMessage(), new Object[0]);
                            }
                            if (throwable instanceof ApiException) {
                                amendOrderDialog2.m61694C4(false, ((ApiException) throwable).code);
                            }
                        }
                        objM103844constructorimpl = obj2;
                    } else {
                        amendOrderDialog = amendOrderDialog2;
                        objM103844constructorimpl = obj2;
                        amendOrderDialog2 = amendOrderDialog;
                    }
                }
                return coroutine_suspended;
            }
            amendOrderDialog2 = amendOrderDialog;
            if (amendOrderDialog2.isVisible()) {
                amendOrderDialog2.m61663M4();
            }
        }
        amendOrderDialog3 = this.this$0;
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97260d("AmendOrderDialog: " + thM103847exceptionOrNullimpl);
            if (amendOrderDialog3.isVisible()) {
                amendOrderDialog3.m61663M4();
            }
        }
        return Unit.INSTANCE;
    }
}
