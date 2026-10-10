package com.sumsub.sns.core.presentation.base;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.camera.C30386l;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28070L implements InterfaceC28773g {

    /* JADX INFO: renamed from: a */
    public final SavedStateHandle f57253a;

    /* JADX INFO: renamed from: b */
    public final C29070X f57254b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41709m0 f57255c;

    /* JADX INFO: renamed from: d */
    public final SuspendLambda f57256d;

    /* JADX INFO: renamed from: e */
    public final Function2 f57257e;

    /* JADX INFO: renamed from: f */
    public final C30316a f57258f;

    /* JADX INFO: renamed from: g */
    public final String f57259g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n f57260h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41678w f57261i;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC28070L(SavedStateHandle savedStateHandle, String str, C29070X c29070x, InterfaceC41709m0 interfaceC41709m0, Function1 function1, Function2 function2) {
        this.f57253a = savedStateHandle;
        this.f57254b = c29070x;
        this.f57255c = interfaceC41709m0;
        this.f57256d = (SuspendLambda) function1;
        this.f57257e = function2;
        this.f57258f = new C30316a();
        this.f57259g = str;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f57260h = interfaceC41669nM91009a;
        this.f57261i = C41636g.m90907c(interfaceC41669nM91009a);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69064a(AbstractC28052C abstractC28052C, AbstractC29149l0 abstractC29149l0, String str) {
        AbstractC28052C.throwError$default(abstractC28052C, abstractC29149l0, str, false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo69066a();

    /* JADX INFO: renamed from: a */
    public final void m69067a(String str) {
        C30316a.m70183b(this.f57258f, this.f57259g, mo69066a() + C33627eb.f69716f + str);
    }

    /* JADX INFO: renamed from: b */
    public final void m69068b(String str) {
        C30316a c30316a = this.f57258f;
        String str2 = this.f57259g;
        String str3 = mo69066a() + C33627eb.f69716f + str;
        c30316a.getClass();
        C33272c.f67816e.f67810a.mo68956e(str2, str3, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g
    public final InterfaceC41678w getState() {
        return this.f57261i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f2, code lost:
    
        if (r7.invoke(r5, r1, r2, r3) == r4) goto L36;
     */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m69065a(InterfaceC29984m interfaceC29984m, C30386l c30386l, ContinuationImpl continuationImpl) {
        C28068K c28068k;
        Function4 function4;
        Object objM70042a;
        AbstractC29172p abstractC29172p;
        C29124h c29124hM70039a;
        Function4 function5;
        InterfaceC29984m interfaceC29984m2 = interfaceC29984m;
        if (continuationImpl instanceof C28068K) {
            c28068k = (C28068K) continuationImpl;
            int i11 = c28068k.f57251f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28068k.f57251f = i11 - Integer.MIN_VALUE;
            } else {
                c28068k = new C28068K(this, continuationImpl);
            }
        } else {
            c28068k = new C28068K(this, continuationImpl);
        }
        Object obj = c28068k.f57249d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28068k.f57251f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c28068k.f57246a = interfaceC29984m2;
            function4 = c30386l;
            c28068k.f57247b = function4;
            c28068k.f57251f = 1;
            objM70042a = ((C29967J) interfaceC29984m2).m70042a(false, (Continuation) c28068k);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Function4 function6 = (Function4) c28068k.f57247b;
            InterfaceC29984m interfaceC29984m3 = (InterfaceC29984m) c28068k.f57246a;
            ResultKt.throwOnFailure(obj);
            function4 = function6;
            interfaceC29984m2 = interfaceC29984m3;
            objM70042a = obj;
        } else if (i12 == 2) {
            c29124hM70039a = c28068k.f57248c;
            abstractC29172p = (AbstractC29172p) c28068k.f57247b;
            function5 = (Function4) c28068k.f57246a;
            ResultKt.throwOnFailure(obj);
            C29983l c29983l = (C29983l) obj;
            if (abstractC29172p != null || c29124hM70039a == null) {
                return Unit.INSTANCE;
            }
            c28068k.f57246a = null;
            c28068k.f57247b = null;
            c28068k.f57248c = null;
            c28068k.f57251f = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p == null) {
            m69068b("Failed to load applicant");
            this.f57257e.invoke(new C29107e0(new SNSGeneralException("Applicant null", null, null, 6, null), null, null, 6), this.f57254b.f59014a);
        }
        c29124hM70039a = ((C29967J) interfaceC29984m2).m70039a();
        if (c29124hM70039a == null) {
            m69068b("Failed to load config");
            this.f57257e.invoke(new C29107e0(new SNSGeneralException("Config null", null, null, 6, null), null, null, 6), this.f57254b.f59014a);
        }
        ?? r11 = this.f57256d;
        c28068k.f57246a = function4;
        c28068k.f57247b = abstractC29172p;
        c28068k.f57248c = c29124hM70039a;
        c28068k.f57251f = 2;
        Object objInvoke = r11.invoke(c28068k);
        if (objInvoke != coroutine_suspended) {
            function5 = function4;
            obj = objInvoke;
            C29983l c29983l2 = (C29983l) obj;
            if (abstractC29172p != null) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    public AbstractC28070L(final AbstractC28142p0 abstractC28142p0, SavedStateHandle savedStateHandle, String str, C29070X c29070x) {
        this(savedStateHandle, str, c29070x, ViewModelKt.getViewModelScope(abstractC28142p0), new C28066J(abstractC28142p0, null), new Function2() { // from class: com.sumsub.sns.core.presentation.base.e1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC28070L.m69064a(abstractC28142p0, (AbstractC29149l0) obj, (String) obj2);
            }
        });
    }
}
