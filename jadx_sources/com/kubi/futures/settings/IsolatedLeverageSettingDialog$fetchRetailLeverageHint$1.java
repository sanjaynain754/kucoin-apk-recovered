package com.kubi.futures.settings;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.AuUserCategoryVO;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import dm.C36758f0;
import java.math.BigDecimal;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IsolatedLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.IsolatedLeverageSettingDialog$fetchRetailLeverageHint$1", m90122f = "IsolatedLeverageSettingDialog.kt", m90123i = {}, m90124l = {276}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IsolatedLeverageSettingDialog$fetchRetailLeverageHint$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36758f0 $binding;
    int label;
    final /* synthetic */ IsolatedLeverageSettingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsolatedLeverageSettingDialog$fetchRetailLeverageHint$1(C36758f0 c36758f0, IsolatedLeverageSettingDialog isolatedLeverageSettingDialog, Continuation<? super IsolatedLeverageSettingDialog$fetchRetailLeverageHint$1> continuation) {
        super(2, continuation);
        this.$binding = c36758f0;
        this.this$0 = isolatedLeverageSettingDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IsolatedLeverageSettingDialog$fetchRetailLeverageHint$1(this.$binding, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IsolatedLeverageSettingDialog$fetchRetailLeverageHint$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C13245x79f19c63 c13245x79f19c63 = new C13245x79f19c63(null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M94120b, c13245x79f19c63, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AuUserCategoryVO auUserCategoryVO = (AuUserCategoryVO) obj;
        if (auUserCategoryVO != null && auUserCategoryVO.isRetail() && C27039d.m66656p(auUserCategoryVO.getMaxLeverage()).compareTo(BigDecimal.ZERO) > 0) {
            String plainString = C6447a.m11724a(C27039d.m66656p(auUserCategoryVO.getMaxLeverage())).toPlainString();
            ConstraintLayout retailLeverageHintCl = this.$binding.f80001p;
            Intrinsics.checkNotNullExpressionValue(retailLeverageHintCl, "retailLeverageHintCl");
            C27046k.m66685H(retailLeverageHintCl);
            this.$binding.f80002q.setText(this.this$0.getString(R$string.kumex_futures_au_levr_tips, plainString));
            this.this$0.m25839w5(true);
        } else {
            ConstraintLayout retailLeverageHintCl2 = this.$binding.f80001p;
            Intrinsics.checkNotNullExpressionValue(retailLeverageHintCl2, "retailLeverageHintCl");
            ViewExtKt.m66577h(retailLeverageHintCl2);
            this.this$0.m25839w5(false);
        }
        return Unit.INSTANCE;
    }
}
