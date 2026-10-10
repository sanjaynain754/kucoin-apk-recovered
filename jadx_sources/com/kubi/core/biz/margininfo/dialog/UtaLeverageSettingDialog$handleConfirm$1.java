package com.kubi.core.biz.margininfo.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.ToastCompat;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import v30.C45406s;

/* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$handleConfirm$1", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {0}, m90124l = {592}, m90125m = "invokeSuspend", m90126n = {ReportDataTable.COLUMN_PARAMS}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nUtaLeverageSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaLeverageSettingDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$handleConfirm$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,633:1\n25#2:634\n26#2:636\n1#3:635\n*S KotlinDebug\n*F\n+ 1 UtaLeverageSettingDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$handleConfirm$1\n*L\n602#1:634\n602#1:636\n602#1:635\n*E\n"})
public final class UtaLeverageSettingDialog$handleConfirm$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ UtaLeverageSettingDialog this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$handleConfirm$1$1 */
    /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$handleConfirm$1$1", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119411 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UtaLeverageSettingDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119411(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super C119411> continuation) {
            super(2, continuation);
            this.this$0 = utaLeverageSettingDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119411 c119411 = new C119411(this.this$0, continuation);
            c119411.L$0 = obj;
            return c119411;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C119411) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            KcPrimaryButton kcPrimaryButton;
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j("UtaLeverageSettingDialog", "modifyMarginLeverage success: " + obj2);
            IUnifyAccountService.f53155a.get().mo64981E();
            C45406s c45406sM21929N4 = this.this$0.m21929N4();
            if (c45406sM21929N4 != null && (kcPrimaryButton = c45406sM21929N4.f102329b) != null) {
                kcPrimaryButton.mo28851l();
            }
            String str = this.this$0.f20472u0;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString(FirebaseAnalytics.Param.CURRENCY)) == null) {
                string = this.this$0.f20471t0;
            }
            if (Intrinsics.areEqual(str, string)) {
                C12572a.m23695d("unify_account_leverage_setting_success", this.this$0.f20470s0, 0L, 4, null);
            }
            this.this$0.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaLeverageSettingDialog$handleConfirm$1(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super UtaLeverageSettingDialog$handleConfirm$1> continuation) {
        super(2, continuation);
        this.this$0 = utaLeverageSettingDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaLeverageSettingDialog$handleConfirm$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaLeverageSettingDialog$handleConfirm$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Window window;
        String message;
        KcPrimaryButton kcPrimaryButton;
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
            Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("leverage", C6447a.m11724a(this.this$0.f20470s0).toPlainString()), TuplesKt.m90091to(FirebaseAnalytics.Param.CURRENCY, this.this$0.f20472u0));
            C44128b.m97266j("UtaLeverageSettingDialog", "modifyMarginLeverage params: " + mapMapOf);
            InterfaceC41634e<Object> interfaceC41634eM21870c = this.this$0.m21932Q4().m21870c(mapMapOf);
            C119411 c119411 = new C119411(this.this$0, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(mapMapOf);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM21870c, false, c119411, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        UtaLeverageSettingDialog utaLeverageSettingDialog = this.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97266j("UtaLeverageSettingDialog", "modifyMarginLeverage failed: " + throwable.getMessage());
            C45406s c45406sM21929N4 = utaLeverageSettingDialog.m21929N4();
            if (c45406sM21929N4 != null && (kcPrimaryButton = c45406sM21929N4.f102329b) != null) {
                kcPrimaryButton.mo28851l();
            }
            Dialog dialog = utaLeverageSettingDialog.getDialog();
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            if ((throwable instanceof ApiException) && (message = throwable.getMessage()) != null && !StringsKt.isBlank(message) && window != null) {
                ToastCompat.m66439E(window, throwable.getMessage() + '(' + ((ApiException) throwable).code + ')', new Object[0]);
            } else {
                C19331c.m42836c(throwable, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
