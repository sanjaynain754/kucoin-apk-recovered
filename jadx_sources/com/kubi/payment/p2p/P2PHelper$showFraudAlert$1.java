package com.kubi.payment.p2p;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.payment.p2p.data.entities.P2PConfigInfo;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27025c;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p477nt.C42879l;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: P2PHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.P2PHelper$showFraudAlert$1", m90122f = "P2PHelper.kt", m90123i = {0}, m90124l = {65}, m90125m = "invokeSuspend", m90126n = {"repository"}, m90127s = {"L$0"})
public final class P2PHelper$showFraudAlert$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fragmentManager;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PHelper$showFraudAlert$1(FragmentManager fragmentManager, Continuation<? super P2PHelper$showFraudAlert$1> continuation) {
        super(2, continuation);
        this.$fragmentManager = fragmentManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PHelper$showFraudAlert$1(this.$fragmentManager, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PHelper$showFraudAlert$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IP2PRepository iP2PRepositoryM48466d = P2PServiceLocator.m48466d(BaseApplication.INSTANCE.get());
            this.L$0 = SpillingKt.nullOutSpilledVariable(iP2PRepositoryM48466d);
            this.label = 1;
            obj = iP2PRepositoryM48466d.mo48493r(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        P2PConfigInfo p2PConfigInfo = (P2PConfigInfo) C42879l.m94041a((AbstractC42878k) obj);
        if (p2PConfigInfo == null) {
            return Unit.INSTANCE;
        }
        if (!C27025c.m66566d(p2PConfigInfo.getNeedFraudRemind())) {
            return Unit.INSTANCE;
        }
        if (!this.$fragmentManager.isDestroyed() && !this.$fragmentManager.isStateSaved()) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54169Z4(true).m54157N4(true).m54167X4(R$string.payment_please_be_alert).m54153J4(R$string.payment_p2p_fraud).m54162S4(R$string.payment_i_know, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    P2PHelper$showFraudAlert$1.m48421f(dialogInterface, i12);
                }
            }).show(this.$fragmentManager, "payment_p2p_fraud");
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m48421f(DialogInterface dialogInterface, int i11) {
    }
}
