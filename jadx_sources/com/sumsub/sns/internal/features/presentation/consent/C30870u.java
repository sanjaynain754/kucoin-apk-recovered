package com.sumsub.sns.internal.features.presentation.consent;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.common.C28447d1;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.remote.C29380i;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30088W;
import com.sumsub.sns.internal.features.presentation.utils.C32649e;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30870u extends AbstractC28142p0 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty[] f62359h = {AbstractC28639a.m69485a(C30870u.class, "selectedAgreement", "getSelectedAgreement()Ljava/lang/Integer;", 0)};

    /* JADX INFO: renamed from: a */
    public final InterfaceC29984m f62360a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29921d f62361b;

    /* JADX INFO: renamed from: c */
    public final C30088W f62362c;

    /* JADX INFO: renamed from: d */
    public final C32649e f62363d;

    /* JADX INFO: renamed from: e */
    public final C28936t f62364e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41678w f62365f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41634e f62366g;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m70500a(C30870u c30870u, ContinuationImpl continuationImpl) {
        C30867r c30867r;
        if (continuationImpl instanceof C30867r) {
            c30867r = (C30867r) continuationImpl;
            int i11 = c30867r.f62350c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30867r.f62350c = i11 - Integer.MIN_VALUE;
            } else {
                c30867r = new C30867r(c30870u, continuationImpl);
            }
        } else {
            c30867r = new C30867r(c30870u, continuationImpl);
        }
        Object objM90884H = c30867r.f62348a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30867r.f62350c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90884H);
            InterfaceC41634e interfaceC41634e = c30870u.f62366g;
            c30867r.f62350c = 1;
            objM90884H = C41636g.m90884H(interfaceC41634e, c30867r);
            if (objM90884H == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90884H);
        }
        List list = (List) objM90884H;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            int i13 = ((C30857h) obj2).f62320a;
            C28936t c28936t = c30870u.f62364e;
            KProperty kProperty = f62359h[0];
            Integer num = (Integer) c28936t.m69705a();
            if (num != null && i13 == num.intValue()) {
                obj = obj2;
                break;
            }
        }
        return (C30857h) obj;
    }

    public C30870u(InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, InterfaceC29921d interfaceC29921d, C30088W c30088w, C28547d c28547d, SavedStateHandle savedStateHandle) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f62360a = interfaceC29984m;
        this.f62361b = interfaceC29921d;
        this.f62362c = c30088w;
        this.f62363d = new C32649e(c28547d);
        this.f62364e = new C28936t(savedStateHandle, "consent_selected_agreement", null, false);
        this.f62365f = savedStateHandle.getStateFlow("consent_selected_agreement", null);
        this.f62366g = C41636g.m90887K(new C30864o(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m70502b(C30870u c30870u, ContinuationImpl continuationImpl) {
        C30868s c30868s;
        int i11;
        C29380i c29380i;
        if (continuationImpl instanceof C30868s) {
            c30868s = (C30868s) continuationImpl;
            int i12 = c30868s.f62354d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30868s.f62354d = i12 - Integer.MIN_VALUE;
            } else {
                c30868s = new C30868s(c30870u, continuationImpl);
            }
        } else {
            c30868s = new C30868s(c30870u, continuationImpl);
        }
        Object obj = c30868s.f62352b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30868s.f62354d;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            C28936t c28936t = c30870u.f62364e;
            KProperty kProperty = f62359h[0];
            Integer num = (Integer) c28936t.m69705a();
            if (num != null) {
                int iIntValue = num.intValue();
                c30868s.f62351a = iIntValue;
                c30868s.f62354d = 1;
                Object strings = c30870u.getStrings(c30868s);
                if (strings == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = strings;
                i11 = iIntValue;
            }
            return null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = c30868s.f62351a;
        ResultKt.throwOnFailure(obj);
        List list = ((C29983l) obj).f60249b;
        if (list != null && (c29380i = (C29380i) CollectionsKt.getOrNull(list, i11)) != null) {
            return c29380i.f59390b;
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90917h(C41636g.m90927m(this.f62365f, this.f62366g, new C30865p(c28075o, this, null)), new C30866q(null));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return "Agreements";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        if (interfaceC28077Q instanceof C30858i) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C30869t(this, null, this), 2, null);
            return;
        }
        if (interfaceC28077Q instanceof C30860k) {
            String str = ((C30860k) interfaceC28077Q).f62324a;
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C28447d1(this, this.f62363d, str, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.consent.z
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30870u.m70501a(this.f62372b, (String) obj);
                }
            }, null), 3, null);
            return;
        }
        if (interfaceC28077Q instanceof C30859j) {
            Integer numValueOf = Integer.valueOf(((C30859j) interfaceC28077Q).f62323a);
            C28936t c28936t = this.f62364e;
            KProperty kProperty = f62359h[0];
            c28936t.f58834a.set(c28936t.f58835b, numValueOf);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70501a(C30870u c30870u, String str) {
        c30870u.fireEvent(new C30862m(str));
        return Unit.INSTANCE;
    }
}
