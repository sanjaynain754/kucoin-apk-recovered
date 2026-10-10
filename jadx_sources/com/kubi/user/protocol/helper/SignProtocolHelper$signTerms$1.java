package com.kubi.user.protocol.helper;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.user.api.entity.SignUserTermSubRequest;
import com.kubi.user.api.entity.UserTermSubRequest;
import com.kubi.user.api.n;
import com.kubi.user.exception.UserCenterMessage;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SignProtocolHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.protocol.helper.SignProtocolHelper$signTerms$1", m90122f = "SignProtocolHelper.kt", m90123i = {0, 0}, m90124l = {45}, m90125m = "invokeSuspend", m90126n = {"signTermApi", "userTermSubRequests"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nSignProtocolHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignProtocolHelper.kt\ncom/kubi/user/protocol/helper/SignProtocolHelper$signTerms$1\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,165:1\n67#2,2:166\n*S KotlinDebug\n*F\n+ 1 SignProtocolHelper.kt\ncom/kubi/user/protocol/helper/SignProtocolHelper$signTerms$1\n*L\n56#1:166,2\n*E\n"})
public final class SignProtocolHelper$signTerms$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<UserTermSubRequest> $userTermList;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignProtocolHelper$signTerms$1(List<UserTermSubRequest> list, Continuation<? super SignProtocolHelper$signTerms$1> continuation) {
        super(2, continuation);
        this.$userTermList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignProtocolHelper$signTerms$1(this.$userTermList, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SignProtocolHelper$signTerms$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SignUserTermSubRequest signUserTermSubRequest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    signUserTermSubRequest = (SignUserTermSubRequest) this.L$1;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                n nVar = (n) C42597a.m93388d().create(n.class);
                SignUserTermSubRequest signUserTermSubRequest2 = new SignUserTermSubRequest(this.$userTermList);
                this.L$0 = SpillingKt.nullOutSpilledVariable(nVar);
                this.L$1 = signUserTermSubRequest2;
                this.label = 1;
                obj = nVar.a(signUserTermSubRequest2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                signUserTermSubRequest = signUserTermSubRequest2;
            }
            C44128b.m97259c("SignProtocolHelper", "signTerms success, userTermSubRequests is " + signUserTermSubRequest + ", result is " + ((Boolean) obj).booleanValue());
        } catch (Exception e11) {
            C44128b.m97261e("SignProtocolHelper", "signTerms failed, userTermList is " + this.$userTermList + ", exception is " + e11);
        } catch (ApiException e12) {
            String str = "signTerms failed, userTermList is " + this.$userTermList + ", exception is " + e12;
            C44128b.m97261e("SignProtocolHelper", str);
            if (Intrinsics.areEqual(e12.code, "500720")) {
                C43846g.m96568c(new UserCenterMessage(str, "SignProtocolHelper", false, 4, null), null, 2, null);
            }
        } catch (CancellationException e13) {
            C44128b.m97263g("SignProtocolHelper", e13);
        } finally {
            UserTermSubRequest.Companion.resetUserTermSubRequests();
        }
        return Unit.INSTANCE;
    }
}
