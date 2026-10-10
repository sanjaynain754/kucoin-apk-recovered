package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.nfc.C28903h;
import com.sumsub.sns.internal.core.presentation.nfc.C28907l;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.mrtd.AbstractC30268y;
import com.sumsub.sns.internal.features.domain.mrtd.C30234G;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import java.util.Arrays;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KFunction;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31868f0 extends AbstractC28142p0 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty[] f64760k = {AbstractC28118g.m69077a(C31868f0.class, "idDocType", "getIdDocType()Ljava/lang/String;", 0), AbstractC28118g.m69077a(C31868f0.class, "idDocSetType", "getIdDocSetType()Ljava/lang/String;", 0), AbstractC28118g.m69077a(C31868f0.class, "attemptsToSkip", "getAttemptsToSkip()I", 0), AbstractC28118g.m69077a(C31868f0.class, "attemptsToFallback", "getAttemptsToFallback()I", 0)};

    /* JADX INFO: renamed from: a */
    public final C30316a f64761a;

    /* JADX INFO: renamed from: b */
    public final AbstractC28978A2 f64762b;

    /* JADX INFO: renamed from: c */
    public final C30234G f64763c;

    /* JADX INFO: renamed from: d */
    public final C28936t f64764d;

    /* JADX INFO: renamed from: e */
    public final C28936t f64765e;

    /* JADX INFO: renamed from: f */
    public final C28936t f64766f;

    /* JADX INFO: renamed from: g */
    public final C28936t f64767g;

    /* JADX INFO: renamed from: h */
    public final C28907l f64768h;

    /* JADX INFO: renamed from: i */
    public final C31879j f64769i;

    /* JADX INFO: renamed from: j */
    public final C31862d0 f64770j;

    /* JADX INFO: renamed from: a */
    public static final Unit m70920a(C31868f0 c31868f0, Throwable th2) {
        C28936t c28936t = c31868f0.f64765e;
        KProperty kProperty = f64760k[1];
        AbstractC28052C.throwError$default(c31868f0, th2, (String) c28936t.m69705a(), null, 4, null);
        return Unit.INSTANCE;
    }

    public C31868f0(SavedStateHandle savedStateHandle, C30316a c30316a, AbstractC28978A2 abstractC28978A2, AbstractC30268y abstractC30268y, C30234G c30234g, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f64761a = c30316a;
        this.f64762b = abstractC28978A2;
        this.f64763c = c30234g;
        this.f64764d = new C28936t(savedStateHandle, "STATE_IDDOCTYPE", abstractC28978A2.mo69721f(), false);
        this.f64765e = new C28936t(savedStateHandle, "STATE_IDDOCSETTYPE", abstractC28978A2.mo69719d().getType().f59014a, false);
        this.f64766f = new C28936t(savedStateHandle, "STATE_ATTEMPTS_TO_SKIP", Integer.valueOf(abstractC28978A2.mo69726k() ? abstractC28978A2.mo69725j() : Integer.MAX_VALUE), false);
        this.f64767g = new C28936t(savedStateHandle, "STATE_ATTEMPTS_TO_FALLBACK", Integer.valueOf(abstractC28978A2.mo69724i()), false);
        this.f64768h = new C28907l(ViewModelKt.getViewModelScope(this), savedStateHandle, abstractC28978A2, abstractC30268y, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C31868f0.m70920a(this.f64820b, (Throwable) obj);
            }
        });
        this.f64769i = new C31879j(ViewModelKt.getViewModelScope(this), savedStateHandle, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31868f0.m70919a(this.f64824b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31868f0.m70921e();
            }
        });
        this.f64770j = new C31862d0(this);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31834H(this, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m70921e() {
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        C29983l c29983l = c28075o.f57271c;
        if (c29983l != null) {
            final C31848W c31848w = new C31848W(c29983l);
            return new C31847V(this.f64768h.f58784k, c31848w, new Function2() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.o0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C31868f0.m70918a(c31848w, this, (String) obj, (String) obj2);
                }
            }, this);
        }
        C30316a.m70182a(this.f64761a, "SNSMRTDReadViewModel", "buildViewStateFlow: no strings or config");
        IllegalStateException illegalStateException = new IllegalStateException("Empty strings");
        C28936t c28936t = this.f64765e;
        KProperty kProperty = f64760k[1];
        AbstractC28052C.throwError$default(this, illegalStateException, (String) c28936t.m69705a(), null, 4, null);
        return C41636g.m90879C();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        C30316a.m70183b(this.f64761a, "SNSMRTDReadViewModel", "intent, " + interfaceC28077Q);
        if (!(interfaceC28077Q instanceof InterfaceC31838L)) {
            super.intent(interfaceC28077Q);
            return;
        }
        InterfaceC31838L interfaceC31838L = (InterfaceC31838L) interfaceC28077Q;
        if (Intrinsics.areEqual(interfaceC31838L, C31837K.f64700a)) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C31865e0(this, null, this, true), 2, null);
        } else if (Intrinsics.areEqual(interfaceC31838L, C31836J.f64699a)) {
            this.f64768h.m69680c();
        } else {
            if (!Intrinsics.areEqual(interfaceC31838L, C31835I.f64698a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f64768h.m69679b();
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if ((this.f64768h.f58784k.getValue() instanceof C28903h) || !Intrinsics.areEqual(abstractC28503w, C28497u.f58029b)) {
            return super.onFinishCalled(abstractC28503w);
        }
        if (this.f64762b.mo69726k()) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C31865e0(this, null, this, false), 2, null);
        } else {
            C28936t c28936t = this.f64769i.f64788c;
            KProperty kProperty = C31879j.f64785e[0];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final String m70918a(KFunction kFunction, C31868f0 c31868f0, String str, String str2) {
        Function1 function1 = (Function1) kFunction;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        C28936t c28936t = c31868f0.f64764d;
        KProperty kProperty = f64760k[0];
        String str3 = (String) function1.invoke(String.format(str, Arrays.copyOf(new Object[]{(String) c28936t.m69705a()}, 1)));
        return str3 == null ? (String) function1.invoke(str2) : str3;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70919a(C31868f0 c31868f0) {
        c31868f0.showProgress(true);
        C41696j.m91104d(ViewModelKt.getViewModelScope(c31868f0), C41782z0.m91392b(), null, new C31865e0(c31868f0, null, c31868f0, false), 2, null);
        return Unit.INSTANCE;
    }
}
