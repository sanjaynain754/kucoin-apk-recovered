package com.kubi.assets.finance;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.HoldEarnInfoEntity;
import com.kubi.assets.holdearn.HoldEarnOpenDialog;
import com.kubi.assets.holdearn.HoldEarnRepo;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceSettable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceSettableKt$handleLoanPledgeItemClick$1", m90122f = "FinanceSettable.kt", m90123i = {1}, m90124l = {149, 150}, m90125m = "invokeSuspend", m90126n = {"cardInfo"}, m90127s = {"L$0"})
public final class FinanceSettableKt$handleLoanPledgeItemClick$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceSettableKt$handleLoanPledgeItemClick$1$1 */
    /* JADX INFO: compiled from: FinanceSettable.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceSettableKt$handleLoanPledgeItemClick$1$1", m90122f = "FinanceSettable.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99601 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ HoldEarnInfoEntity $cardInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C99601(HoldEarnInfoEntity holdEarnInfoEntity, Continuation<? super C99601> continuation) {
            super(2, continuation);
            this.$cardInfo = holdEarnInfoEntity;
        }

        /* JADX INFO: renamed from: h */
        public static final Unit m16700h(HoldEarnInfoEntity holdEarnInfoEntity, final FragmentActivity fragmentActivity) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54146C4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_load_dialog_title).m54153J4(R$string.kc_load_dialog_desc).m54162S4(R$string.already_know, null).m54146C4(R$drawable.ic2_close_withcircle_24);
            if (holdEarnInfoEntity != null) {
                alertDialogFragmentHelperM54146C4.m54159P4(R$string.kc_load_dialog_holdearn, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.finance.d0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        FinanceSettableKt$handleLoanPledgeItemClick$1.C99601.m16701i(fragmentActivity, dialogInterface, i11);
                    }
                });
            }
            alertDialogFragmentHelperM54146C4.m54172c5(fragmentActivity.getSupportFragmentManager());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: i */
        public static final void m16701i(FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i11) {
            HoldEarnOpenDialog holdEarnOpenDialogM17366D4 = HoldEarnOpenDialog.f17726y0.create("").m17366D4(new Function1() { // from class: com.kubi.assets.finance.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinanceSettableKt$handleLoanPledgeItemClick$1.C99601.m16702j(((Boolean) obj).booleanValue());
                }
            });
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            holdEarnOpenDialogM17366D4.show(supportFragmentManager, "HoldEarnOpenDialog");
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m16702j(boolean z11) {
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C99601(this.$cardInfo, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C99601) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                final HoldEarnInfoEntity holdEarnInfoEntity = this.$cardInfo;
                C42899b.m94073c(new Function1() { // from class: com.kubi.assets.finance.c0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FinanceSettableKt$handleLoanPledgeItemClick$1.C99601.m16700h(holdEarnInfoEntity, (FragmentActivity) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public FinanceSettableKt$handleLoanPledgeItemClick$1(Continuation<? super FinanceSettableKt$handleLoanPledgeItemClick$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinanceSettableKt$handleLoanPledgeItemClick$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FinanceSettableKt$handleLoanPledgeItemClick$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r1, r3, r5) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HoldEarnRepo holdEarnRepo = HoldEarnRepo.f17741a;
        this.label = 1;
        obj = holdEarnRepo.m17383d(this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        HoldEarnInfoEntity holdEarnInfoEntity = (HoldEarnInfoEntity) obj;
        AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
        C99601 c99601 = new C99601(holdEarnInfoEntity, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(holdEarnInfoEntity);
        this.label = 2;
    }
}
