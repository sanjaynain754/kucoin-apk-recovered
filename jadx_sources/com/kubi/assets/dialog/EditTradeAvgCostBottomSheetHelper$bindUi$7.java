package com.kubi.assets.dialog;

import android.content.Context;
import android.widget.TextView;
import com.kubi.assets.entity.UserAssetCostDetailEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.tencent.bugly.proguard.C33556b3;
import java.math.BigDecimal;
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
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: EditTradeAvgCostBottomSheetHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$bindUi$7", m90122f = "EditTradeAvgCostBottomSheetHelper.kt", m90123i = {}, m90124l = {187}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nEditTradeAvgCostBottomSheetHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n25#2:199\n26#2:201\n1#3:200\n*S KotlinDebug\n*F\n+ 1 EditTradeAvgCostBottomSheetHelper.kt\ncom/kubi/assets/dialog/EditTradeAvgCostBottomSheetHelper$bindUi$7\n*L\n190#1:199\n190#1:201\n190#1:200\n*E\n"})
public final class EditTradeAvgCostBottomSheetHelper$bindUi$7 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ KcPrimaryButton $btnModify;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $currency;
    final /* synthetic */ FinancialInputEditText $etInput;
    final /* synthetic */ Ref.BooleanRef $isAvgMode;
    final /* synthetic */ int $precision;
    final /* synthetic */ Ref.ObjectRef<BigDecimal> $totalBalance;
    final /* synthetic */ TextView $tvApprox;
    final /* synthetic */ String $unit;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$bindUi$7$1 */
    /* JADX INFO: compiled from: EditTradeAvgCostBottomSheetHelper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", C33556b3.f68963J, "Lcom/kubi/assets/entity/UserAssetCostDetailEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper$bindUi$7$1", m90122f = "EditTradeAvgCostBottomSheetHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C97131 extends SuspendLambda implements Function2<UserAssetCostDetailEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ KcPrimaryButton $btnModify;
        final /* synthetic */ Context $ctx;
        final /* synthetic */ FinancialInputEditText $etInput;
        final /* synthetic */ Ref.BooleanRef $isAvgMode;
        final /* synthetic */ int $precision;
        final /* synthetic */ Ref.ObjectRef<BigDecimal> $totalBalance;
        final /* synthetic */ TextView $tvApprox;
        final /* synthetic */ String $unit;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UserAssetCostDetailEntity userAssetCostDetailEntity, Continuation<? super Unit> continuation) {
            return ((C97131) create(userAssetCostDetailEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97131(Ref.ObjectRef<BigDecimal> objectRef, FinancialInputEditText financialInputEditText, KcPrimaryButton kcPrimaryButton, Ref.BooleanRef booleanRef, TextView textView, Context context, int i11, String str, Continuation<? super C97131> continuation) {
            super(2, continuation);
            this.$totalBalance = objectRef;
            this.$etInput = financialInputEditText;
            this.$btnModify = kcPrimaryButton;
            this.$isAvgMode = booleanRef;
            this.$tvApprox = textView;
            this.$ctx = context;
            this.$precision = i11;
            this.$unit = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97131 c97131 = new C97131(this.$totalBalance, this.$etInput, this.$btnModify, this.$isAvgMode, this.$tvApprox, this.$ctx, this.$precision, this.$unit, continuation);
            c97131.L$0 = obj;
            return c97131;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.math.BigDecimal] */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UserAssetCostDetailEntity userAssetCostDetailEntity = (UserAssetCostDetailEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$totalBalance.element = userAssetCostDetailEntity.getTotalAmount();
            EditTradeAvgCostBottomSheetHelper.m16013k(this.$etInput, this.$btnModify, this.$isAvgMode, this.$tvApprox, this.$totalBalance, this.$ctx, this.$precision, this.$unit);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTradeAvgCostBottomSheetHelper$bindUi$7(String str, Ref.ObjectRef<BigDecimal> objectRef, FinancialInputEditText financialInputEditText, KcPrimaryButton kcPrimaryButton, Ref.BooleanRef booleanRef, TextView textView, Context context, int i11, String str2, Continuation<? super EditTradeAvgCostBottomSheetHelper$bindUi$7> continuation) {
        super(2, continuation);
        this.$currency = str;
        this.$totalBalance = objectRef;
        this.$etInput = financialInputEditText;
        this.$btnModify = kcPrimaryButton;
        this.$isAvgMode = booleanRef;
        this.$tvApprox = textView;
        this.$ctx = context;
        this.$precision = i11;
        this.$unit = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditTradeAvgCostBottomSheetHelper$bindUi$7(this.$currency, this.$totalBalance, this.$etInput, this.$btnModify, this.$isAvgMode, this.$tvApprox, this.$ctx, this.$precision, this.$unit, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EditTradeAvgCostBottomSheetHelper$bindUi$7) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM42824e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(EditTradeAvgCostBottomSheetHelper.f16934a.m16016l().m17097Q(this.$currency), C42911a.m94120b());
            C97131 c97131 = new C97131(this.$totalBalance, this.$etInput, this.$btnModify, this.$isAvgMode, this.$tvApprox, this.$ctx, this.$precision, this.$unit, null);
            this.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM90890N, false, c97131, this, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM42824e = obj;
        }
        Ref.ObjectRef<BigDecimal> objectRef = this.$totalBalance;
        FinancialInputEditText financialInputEditText = this.$etInput;
        KcPrimaryButton kcPrimaryButton = this.$btnModify;
        Ref.BooleanRef booleanRef = this.$isAvgMode;
        TextView textView = this.$tvApprox;
        Context context = this.$ctx;
        int i12 = this.$precision;
        String str = this.$unit;
        Throwable throwable = ((C19334f) objM42824e).getThrowable();
        if (throwable != null) {
            C44128b.m97263g("EditTradeAvgCostSheet", throwable);
            objectRef.element = null;
            EditTradeAvgCostBottomSheetHelper.m16013k(financialInputEditText, kcPrimaryButton, booleanRef, textView, objectRef, context, i12, str);
        }
        return Unit.INSTANCE;
    }
}
