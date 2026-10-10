package com.kubi.mine.lib.p101ui;

import android.widget.TextView;
import com.kubi.mine.R$string;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.user.config.UserInfo;
import gq.C37986g;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AccountMoveActivity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.AccountMoveActivity$initView$1", m90122f = "AccountMoveActivity.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {62, 63}, m90125m = "invokeSuspend", m90126n = {"$this$launchWhenStarted", "task1", "task2", "$this$launchWhenStarted", "task1", "task2", "total"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class AccountMoveActivity$initView$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AccountMoveActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountMoveActivity$initView$1(AccountMoveActivity accountMoveActivity, Continuation<? super AccountMoveActivity$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = accountMoveActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountMoveActivity$initView$1 accountMoveActivity$initView$1 = new AccountMoveActivity$initView$1(this.this$0, continuation);
        accountMoveActivity$initView$1.L$0 = obj;
        return accountMoveActivity$initView$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountMoveActivity$initView$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0M91102b2;
        Object objMo91198h;
        Object objMo91198h2;
        BigDecimal bigDecimal;
        ArrayList arrayList;
        AccountMoveActivity accountMoveActivity;
        C37986g c37986gM41863W;
        C37986g c37986gM41863W2;
        ShowHideTextView showHideTextView;
        TextView textView;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.showLoadingView();
            interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new AccountMoveActivity$initView$1$task1$1(null), 3, null);
            interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new AccountMoveActivity$initView$1$task2$1(null), 3, null);
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
            InterfaceC41729r0 interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC41729r0M91102b = interfaceC41729r0;
            objMo91198h = obj;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BigDecimal bigDecimal2 = (BigDecimal) this.L$3;
            ResultKt.throwOnFailure(obj);
            objMo91198h2 = obj;
            bigDecimal = bigDecimal2;
        }
        arrayList = (ArrayList) objMo91198h2;
        if (arrayList != null) {
            accountMoveActivity = this.this$0;
            accountMoveActivity.f35170j = arrayList;
            accountMoveActivity.showContentView();
            c37986gM41863W = accountMoveActivity.m41863W();
            if (c37986gM41863W != null && (textView = c37986gM41863W.f85464e) != null) {
                textView.setText(UserInfo.c().email);
            }
            c37986gM41863W2 = accountMoveActivity.m41863W();
            if (c37986gM41863W2 != null && (showHideTextView = c37986gM41863W2.f85465f) != null) {
                showHideTextView.setText(accountMoveActivity.getString(R$string.account_move_size, C41014a.m89946t(bigDecimal, null, 8, false, false, false, false, false, null, 0, 445, null)));
            }
        } else {
            this.this$0.finish();
        }
        return Unit.INSTANCE;
        BigDecimal bigDecimalM89922G = C41014a.m89922G((BigDecimal) objMo91198h, null, 1, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
        this.L$3 = bigDecimalM89922G;
        this.label = 2;
        objMo91198h2 = interfaceC41729r0M91102b2.mo91198h(this);
        if (objMo91198h2 != coroutine_suspended) {
            bigDecimal = bigDecimalM89922G;
            arrayList = (ArrayList) objMo91198h2;
            if (arrayList != null) {
                accountMoveActivity = this.this$0;
                accountMoveActivity.f35170j = arrayList;
                accountMoveActivity.showContentView();
                c37986gM41863W = accountMoveActivity.m41863W();
                if (c37986gM41863W != null) {
                    textView.setText(UserInfo.c().email);
                }
                c37986gM41863W2 = accountMoveActivity.m41863W();
                if (c37986gM41863W2 != null) {
                    showHideTextView.setText(accountMoveActivity.getString(R$string.account_move_size, C41014a.m89946t(bigDecimal, null, 8, false, false, false, false, false, null, 0, 445, null)));
                }
            } else {
                this.this$0.finish();
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
