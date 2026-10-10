package com.sumsub.sns.internal.core.presentation.screen.base;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.core.presentation.screen.navigation.InterfaceC28952i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.intro.InterfaceC31150c;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.verification2.host.AbstractC32816L;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32813I;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28935s extends AbstractC28142p0 implements InterfaceC31150c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28952i f58831a;

    /* JADX INFO: renamed from: b */
    public final C31283h f58832b;

    /* JADX INFO: renamed from: c */
    public final C28927k f58833c;

    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[PHI: r14
      0x00ae: PHI (r14v5 com.sumsub.sns.internal.core.presentation.screen.base.s) = 
      (r14v0 com.sumsub.sns.internal.core.presentation.screen.base.s)
      (r14v15 com.sumsub.sns.internal.core.presentation.screen.base.s)
     binds: [B:28:0x007a, B:38:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m69702a(AbstractC28935s abstractC28935s, ContinuationImpl continuationImpl) {
        C28933q c28933q;
        String str;
        C29697t2 c29697t2;
        AbstractC28935s abstractC28935s2;
        C31283h c31283h;
        Object obj;
        AbstractC28935s abstractC28935s3;
        InterfaceC28952i interfaceC28952i;
        if (continuationImpl instanceof C28933q) {
            c28933q = (C28933q) continuationImpl;
            int i11 = c28933q.f58828f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28933q.f58828f = i11 - Integer.MIN_VALUE;
            } else {
                c28933q = new C28933q(abstractC28935s, continuationImpl);
            }
        } else {
            c28933q = new C28933q(abstractC28935s, continuationImpl);
        }
        Object objM69687a = c28933q.f58826d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28933q.f58828f;
        if (i12 != 0) {
            if (i12 == 1) {
                c31283h = c28933q.f58825c;
                c29697t2 = c28933q.f58824b;
                abstractC28935s2 = c28933q.f58823a;
                ResultKt.throwOnFailure(objM69687a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC28935s = c28933q.f58823a;
                ResultKt.throwOnFailure(objM69687a);
            }
            obj = (InterfaceC28926j) objM69687a;
            if (obj == null) {
                obj = C28924h.f58812a;
            }
            abstractC28935s3 = abstractC28935s;
            if (obj instanceof C28925i) {
                abstractC28935s3.f58833c.m69697b(((C28925i) obj).f58813a);
            } else if (obj instanceof C28923g) {
                C28923g c28923g = (C28923g) obj;
                AbstractC28052C.throwError$default(abstractC28935s3, c28923g.f58810a, c28923g.f58811b, false, null, 12, null);
            } else {
                if (!Intrinsics.areEqual(obj, C28924h.f58812a)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC28952i = abstractC28935s3.f58831a;
                if (interfaceC28952i != null) {
                    abstractC28935s3.f58833c.m69697b(interfaceC28952i);
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM69687a);
        C32814J c32814j = (C32814J) abstractC28935s;
        if (c32814j.f67149e) {
            c29697t2 = null;
        } else {
            int i13 = AbstractC32816L.f67159a[c32814j.f67148d.ordinal()];
            if (i13 == 1) {
                str = "EMAIL_VERIFICATION";
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "PHONE_VERIFICATION";
            }
            c29697t2 = new C29697t2(str, IntroScene.CONFIRMATION.getSceneName(), (String) null, (String) null, (Map) null, 60);
        }
        if (c29697t2 != null) {
            C31283h c31283h2 = abstractC28935s.f58832b;
            InterfaceC41634e<C28075O> dataFlow = abstractC28935s.getDataFlow();
            c28933q.f58823a = abstractC28935s;
            c28933q.f58824b = c29697t2;
            c28933q.f58825c = c31283h2;
            c28933q.f58828f = 1;
            Object objM90882F = C41636g.m90882F(dataFlow, c28933q);
            if (objM90882F != coroutine_suspended) {
                abstractC28935s2 = abstractC28935s;
                c31283h = c31283h2;
                objM69687a = objM90882F;
            }
            return coroutine_suspended;
        }
        obj = C28924h.f58812a;
        abstractC28935s3 = abstractC28935s;
        if (obj instanceof C28925i) {
            abstractC28935s3.f58833c.m69697b(((C28925i) obj).f58813a);
        } else if (obj instanceof C28923g) {
            C28923g c28923g2 = (C28923g) obj;
            AbstractC28052C.throwError$default(abstractC28935s3, c28923g2.f58810a, c28923g2.f58811b, false, null, 12, null);
        } else {
            if (!Intrinsics.areEqual(obj, C28924h.f58812a)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC28952i = abstractC28935s3.f58831a;
            if (interfaceC28952i != null) {
                abstractC28935s3.f58833c.m69697b(interfaceC28952i);
            }
        }
        return Unit.INSTANCE;
        c28933q.f58823a = abstractC28935s2;
        c28933q.f58824b = null;
        c28933q.f58825c = null;
        c28933q.f58828f = 2;
        objM69687a = AbstractC28922f.m69687a(c31283h, (C28075O) objM69687a, c29697t2, c28933q);
        if (objM69687a != coroutine_suspended) {
            abstractC28935s = abstractC28935s2;
            obj = (InterfaceC28926j) objM69687a;
            if (obj == null) {
                obj = C28924h.f58812a;
            }
            abstractC28935s3 = abstractC28935s;
            if (obj instanceof C28925i) {
                abstractC28935s3.f58833c.m69697b(((C28925i) obj).f58813a);
            } else if (obj instanceof C28923g) {
                C28923g c28923g3 = (C28923g) obj;
                AbstractC28052C.throwError$default(abstractC28935s3, c28923g3.f58810a, c28923g3.f58811b, false, null, 12, null);
            } else {
                if (!Intrinsics.areEqual(obj, C28924h.f58812a)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC28952i = abstractC28935s3.f58831a;
                if (interfaceC28952i != null) {
                    abstractC28935s3.f58833c.m69697b(interfaceC28952i);
                }
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        C32814J c32814j = (C32814J) this;
        AbstractC29172p abstractC29172p = c28075o.f57269a;
        String strMo69757h = abstractC29172p != null ? abstractC29172p.mo69757h() : null;
        if (c32814j.f67150f && !c32814j.f67153i && strMo69757h != null && (!StringsKt.isBlank(strMo69757h))) {
            Logger.DefaultImpls.i$default(C33272c.f67812a, "VerificationStepHostViewModel", "Requesting phone number code immediately...", null, 4, null);
            c32814j.f67153i = true;
            c32814j.m71349b(strMo69757h);
        }
        return new C28932p(new C32813I(c32814j.f58833c.f58816b));
    }

    public AbstractC28935s(InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, SavedStateHandle savedStateHandle, InterfaceC28952i interfaceC28952i, C31283h c31283h) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f58831a = interfaceC28952i;
        this.f58832b = c31283h;
        this.f58833c = new C28927k(savedStateHandle);
    }

    /* JADX INFO: renamed from: e */
    public final void m69704e() {
        this.f58833c.m69695a(new Function1() { // from class: com.sumsub.sns.internal.core.presentation.screen.base.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28935s.m69703a(this.f58841b, (List) obj);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (!Intrinsics.areEqual(abstractC28503w, C28497u.f58029b) || this.f58833c.m69692a().size() <= 1) {
            return true;
        }
        this.f58833c.m69696b();
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onFirstAttach() {
        super.onFirstAttach();
        if (this.f58833c.m69692a().isEmpty()) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C28934r(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final List m69703a(AbstractC28935s abstractC28935s, List list) {
        InterfaceC28952i interfaceC28952i;
        List listDropLast = CollectionsKt.dropLast(list, 1);
        return (!listDropLast.isEmpty() || (interfaceC28952i = abstractC28935s.f58831a) == null) ? listDropLast : CollectionsKt.plus((Collection<? extends InterfaceC28952i>) listDropLast, interfaceC28952i);
    }
}
