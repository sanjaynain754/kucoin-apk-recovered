package com.kubi.payment.helper;

import androidx.fragment.app.FragmentManager;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.payment.data.source.PaymentRepository;
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

/* JADX INFO: compiled from: PreCheckHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.helper.PreCheckHelper$preCheckKycExpired$1", m90122f = "PreCheckHelper.kt", m90123i = {0, 0}, m90124l = {178}, m90125m = "invokeSuspend", m90126n = {"repository", "needAlert"}, m90127s = {"L$0", "Z$0"})
public final class PreCheckHelper$preCheckKycExpired$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fragmentManager;
    Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreCheckHelper$preCheckKycExpired$1(FragmentManager fragmentManager, Continuation<? super PreCheckHelper$preCheckKycExpired$1> continuation) {
        super(2, continuation);
        this.$fragmentManager = fragmentManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreCheckHelper$preCheckKycExpired$1(this.$fragmentManager, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PreCheckHelper$preCheckKycExpired$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            boolean zM48233d = PreCheckHelper.f39543a.m48233d();
            if (!zM48233d) {
                return Unit.INSTANCE;
            }
            PaymentRepository paymentRepositoryM45618f = PaymentServiceLocator.f38204a.m45618f();
            this.L$0 = SpillingKt.nullOutSpilledVariable(paymentRepositoryM45618f);
            this.Z$0 = zM48233d;
            this.label = 1;
            obj = paymentRepositoryM45618f.mo46263C(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        FiatUserInfo fiatUserInfo = (FiatUserInfo) C42879l.m94041a((AbstractC42878k) obj);
        if (fiatUserInfo == null) {
            return Unit.INSTANCE;
        }
        if (!C27025c.m66566d(fiatUserInfo.getKycExpired())) {
            return Unit.INSTANCE;
        }
        PreCheckHelper.f39543a.m48244p(this.$fragmentManager, true);
        return Unit.INSTANCE;
    }
}
