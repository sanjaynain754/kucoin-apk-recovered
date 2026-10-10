package com.kubi.assets.dialog;

import android.app.Dialog;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.ModifyTradeHoldingCostBody;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: EditTradeAvgCostBottomSheetHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$bindUi$6$1", m90122f = "EditTradeAvgCostBottomSheetHelper.kt", m90123i = {}, m90124l = {168}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nEditTradeAvgCostBottomSheetHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$6$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n25#2:199\n26#2:201\n1#3:200\n*S KotlinDebug\n*F\n+ 1 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$6$1\n*L\n174#1:199\n174#1:201\n174#1:200\n*E\n"})
public final class EditTradeAvgCostBottomSheetHelper$bindUi$6$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ModifyTradeHoldingCostBody $body;
    final /* synthetic */ KcPrimaryButton $btnModify;
    final /* synthetic */ DialogFragmentHelper $helper;
    final /* synthetic */ Function0<Unit> $onSuccess;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$bindUi$6$1$1 */
    /* JADX INFO: compiled from: EditTradeAvgCostBottomSheetHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$bindUi$6$1$1", m90122f = "EditTradeAvgCostBottomSheetHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C97121 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ KcPrimaryButton $btnModify;
        final /* synthetic */ DialogFragmentHelper $helper;
        final /* synthetic */ Function0<Unit> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97121(Function0<Unit> function0, KcPrimaryButton kcPrimaryButton, DialogFragmentHelper dialogFragmentHelper, Continuation<? super C97121> continuation) {
            super(2, continuation);
            this.$onSuccess = function0;
            this.$btnModify = kcPrimaryButton;
            this.$helper = dialogFragmentHelper;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C97121(this.$onSuccess, this.$btnModify, this.$helper, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C97121) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$onSuccess.invoke();
                ToastCompat.m66437C(R$string.modify_change_success);
                this.$btnModify.mo28851l();
                Dialog dialog = this.$helper.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                this.$helper.dismiss();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTradeAvgCostBottomSheetHelper$bindUi$6$1(ModifyTradeHoldingCostBody modifyTradeHoldingCostBody, Function0<Unit> function0, KcPrimaryButton kcPrimaryButton, DialogFragmentHelper dialogFragmentHelper, Continuation<? super EditTradeAvgCostBottomSheetHelper$bindUi$6$1> continuation) {
        super(2, continuation);
        this.$body = modifyTradeHoldingCostBody;
        this.$onSuccess = function0;
        this.$btnModify = kcPrimaryButton;
        this.$helper = dialogFragmentHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditTradeAvgCostBottomSheetHelper$bindUi$6$1(this.$body, this.$onSuccess, this.$btnModify, this.$helper, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EditTradeAvgCostBottomSheetHelper$bindUi$6$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EditTradeAvgCostBottomSheetHelper$bindUi$6$1 editTradeAvgCostBottomSheetHelper$bindUi$6$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                editTradeAvgCostBottomSheetHelper$bindUi$6$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(EditTradeAvgCostBottomSheetHelper.f16934a.m16016l().m17163s1(this.$body), C42911a.m94120b());
            C97121 c97121 = new C97121(this.$onSuccess, this.$btnModify, this.$helper, null);
            this.label = 1;
            editTradeAvgCostBottomSheetHelper$bindUi$6$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM90890N, false, c97121, editTradeAvgCostBottomSheetHelper$bindUi$6$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        KcPrimaryButton kcPrimaryButton = editTradeAvgCostBottomSheetHelper$bindUi$6$1.$btnModify;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97263g("EditTradeAvgCostSheet", throwable);
            kcPrimaryButton.mo28851l();
            C19331c.m42836c(throwable, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
