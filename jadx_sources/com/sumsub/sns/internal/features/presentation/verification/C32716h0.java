package com.sumsub.sns.internal.features.presentation.verification;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29570k0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32716h0 extends SuspendLambda implements Function5 {

    /* JADX INFO: renamed from: a */
    public int f66921a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66922b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ CharSequence f66923c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C32742x f66924d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C29570k0 f66925e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C32720j0 f66926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32716h0(C32720j0 c32720j0, Continuation continuation) {
        super(5, continuation);
        this.f66926f = c32720j0;
    }

    @Override // p852kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C32716h0 c32716h0 = new C32716h0(this.f66926f, (Continuation) obj5);
        c32716h0.f66922b = (SNSVerificationStepViewModel$Step) obj;
        c32716h0.f66923c = (CharSequence) obj2;
        c32716h0.f66924d = (C32742x) obj3;
        c32716h0.f66925e = (C29570k0) obj4;
        return c32716h0.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0107, code lost:
    
        if (r0 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
    
        if (r0 == r6) goto L41;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM71297a;
        Object objM70043a;
        C32742x c32742x;
        C29570k0 c29570k0;
        SNSVerificationStepViewModel$Step sNSVerificationStepViewModel$Step;
        CharSequence charSequence;
        String strMo69757h;
        Object objM71297a2;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66921a;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            SNSVerificationStepViewModel$Step sNSVerificationStepViewModel$Step2 = (SNSVerificationStepViewModel$Step) this.f66922b;
            CharSequence charSequence2 = this.f66923c;
            C32742x c32742x2 = this.f66924d;
            C29570k0 c29570k1 = this.f66925e;
            C32720j0 c32720j0 = this.f66926f;
            if (!c32720j0.f66934b || c32720j0.f66947o) {
                this.f66922b = null;
                this.f66923c = null;
                this.f66924d = null;
                this.f66921a = 3;
                objM71297a = C32720j0.m71297a(c32720j0, sNSVerificationStepViewModel$Step2, charSequence2, c32742x2, c29570k1, this);
            } else {
                c32720j0.f66947o = true;
                Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSVerificationStepViewModel", "Try requesting phone number code immediately...", null, 4, null);
                InterfaceC29984m interfaceC29984m = this.f66926f.f66939g;
                this.f66922b = sNSVerificationStepViewModel$Step2;
                this.f66923c = charSequence2;
                this.f66924d = c32742x2;
                this.f66925e = c29570k1;
                this.f66921a = 1;
                objM70043a = ((C29967J) interfaceC29984m).m70043a(false, (ContinuationImpl) this);
                if (objM70043a != coroutine_suspended) {
                    c32742x = c32742x2;
                    c29570k0 = c29570k1;
                    sNSVerificationStepViewModel$Step = sNSVerificationStepViewModel$Step2;
                    charSequence = charSequence2;
                    strMo69757h = ((AbstractC29172p) objM70043a).mo69757h();
                    if (strMo69757h == null) {
                    }
                    Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSVerificationStepViewModel", "Phone is empty, start as usual then, skip immediate code request.", null, 4, null);
                    C29570k0 c29570k2 = c29570k0;
                    C32720j0 c32720j1 = this.f66926f;
                    this.f66922b = null;
                    this.f66923c = null;
                    this.f66924d = null;
                    this.f66925e = null;
                    this.f66921a = 2;
                    objM71297a2 = C32720j0.m71297a(c32720j1, sNSVerificationStepViewModel$Step, charSequence, c32742x, c29570k2, this);
                }
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            c29570k0 = this.f66925e;
            C32742x c32742x3 = this.f66924d;
            CharSequence charSequence3 = this.f66923c;
            SNSVerificationStepViewModel$Step sNSVerificationStepViewModel$Step3 = (SNSVerificationStepViewModel$Step) this.f66922b;
            ResultKt.throwOnFailure(obj);
            sNSVerificationStepViewModel$Step = sNSVerificationStepViewModel$Step3;
            charSequence = charSequence3;
            c32742x = c32742x3;
            objM70043a = obj;
            strMo69757h = ((AbstractC29172p) objM70043a).mo69757h();
            if (strMo69757h == null && (!StringsKt.isBlank(strMo69757h))) {
                Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSVerificationStepViewModel", "Phone is not empty, requesting phone number code...", null, 4, null);
                C32720j0 c32720j2 = this.f66926f;
                int i12 = AbstractC32681F.f66733a[c32720j2.f66933a.ordinal()];
                if (i12 == 1) {
                    str = "EMAIL_VERIFICATION";
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "PHONE_VERIFICATION";
                }
                C41696j.m91104d(ViewModelKt.getViewModelScope(c32720j2), null, null, new C32708d0(c32720j2, str, null, c32720j2, strMo69757h), 3, null);
                this.f66926f.fireEvent(C32732q.f66983a);
                return C41636g.m90889M(C32744z.f67003a);
            }
            Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSVerificationStepViewModel", "Phone is empty, start as usual then, skip immediate code request.", null, 4, null);
            C29570k0 c29570k3 = c29570k0;
            C32720j0 c32720j3 = this.f66926f;
            this.f66922b = null;
            this.f66923c = null;
            this.f66924d = null;
            this.f66925e = null;
            this.f66921a = 2;
            objM71297a2 = C32720j0.m71297a(c32720j3, sNSVerificationStepViewModel$Step, charSequence, c32742x, c29570k3, this);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM71297a = obj;
                return (InterfaceC41634e) objM71297a;
            }
            ResultKt.throwOnFailure(obj);
            objM71297a2 = obj;
        }
        return (InterfaceC41634e) objM71297a2;
    }
}
