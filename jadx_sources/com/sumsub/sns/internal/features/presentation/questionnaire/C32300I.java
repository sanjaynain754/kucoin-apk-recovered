package com.sumsub.sns.internal.features.presentation.questionnaire;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.android.material.internal.ViewUtils;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.common.AbstractC28441c;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28491s;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.form.AbstractC28806m;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.C28803j;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28842f;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28843f0;
import com.sumsub.sns.internal.core.presentation.form.model.C28807A;
import com.sumsub.sns.internal.core.presentation.form.model.C28809C;
import com.sumsub.sns.internal.core.presentation.form.model.C28817K;
import com.sumsub.sns.internal.core.presentation.form.model.C28819M;
import com.sumsub.sns.internal.core.presentation.form.model.C28821O;
import com.sumsub.sns.internal.core.presentation.form.model.C28823Q;
import com.sumsub.sns.internal.core.presentation.form.model.C28825T;
import com.sumsub.sns.internal.core.presentation.form.model.C28827V;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import com.sumsub.sns.internal.core.presentation.form.model.C28835b0;
import com.sumsub.sns.internal.core.presentation.form.model.C28840e;
import com.sumsub.sns.internal.core.presentation.form.model.C28847h0;
import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.core.presentation.form.model.C28854l;
import com.sumsub.sns.internal.core.presentation.form.model.C28857o;
import com.sumsub.sns.internal.core.presentation.form.model.C28859q;
import com.sumsub.sns.internal.core.presentation.form.model.C28861s;
import com.sumsub.sns.internal.core.presentation.form.model.C28863u;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29028M0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29024L0;
import com.sumsub.sns.internal.features.data.model.common.C29027M;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29069W2;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29086a3;
import com.sumsub.sns.internal.features.data.model.common.C29109e2;
import com.sumsub.sns.internal.features.data.model.common.C29110e3;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.C29134i3;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.C29164n3;
import com.sumsub.sns.internal.features.data.model.common.C29705v0;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.FieldType;
import com.sumsub.sns.internal.features.data.model.common.ReviewAnswerType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29550g0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29602s0;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.utils.AbstractC30063c;
import com.sumsub.sns.internal.features.data.utils.AbstractC30064d;
import com.sumsub.sns.internal.features.domain.C30084S;
import com.sumsub.sns.internal.features.domain.C30086U;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30157e0;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.domain.C30306q;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import com.sumsub.sns.internal.features.domain.documents.C30148s;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.DocCapture$PreferredMode;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32300I extends AbstractC28142p0 implements InterfaceC28804k {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ KProperty[] f65798w = {AbstractC28639a.m69485a(C32300I.class, "step", "getStep()Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireViewModel$Step;", 0), AbstractC28639a.m69485a(C32300I.class, "currentPageIndex", "getCurrentPageIndex()I", 0), AbstractC28639a.m69485a(C32300I.class, "currentQuestionnaire", "getCurrentQuestionnaire()Lcom/sumsub/sns/internal/features/data/model/common/Questionnaire;", 0), AbstractC28639a.m69485a(C32300I.class, "currentCountryKey", "getCurrentCountryKey()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C32300I.class, "pendingCameraFieldId", "getPendingCameraFieldId()Lcom/sumsub/sns/internal/core/presentation/form/FieldId;", 0), AbstractC28639a.m69485a(C32300I.class, "_formViewState", "get_formViewState()Lcom/sumsub/sns/internal/core/presentation/form/HostViewModel$FormViewState;", 0)};

    /* JADX INFO: renamed from: a */
    public final C30316a f65799a;

    /* JADX INFO: renamed from: b */
    public final C30156e f65800b;

    /* JADX INFO: renamed from: c */
    public final C30086U f65801c;

    /* JADX INFO: renamed from: d */
    public final C30157e0 f65802d;

    /* JADX INFO: renamed from: e */
    public final C30311s0 f65803e;

    /* JADX INFO: renamed from: f */
    public final C30306q f65804f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC29921d f65805g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC29984m f65806h;

    /* JADX INFO: renamed from: i */
    public final String f65807i;

    /* JADX INFO: renamed from: j */
    public final C28936t f65808j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41678w f65809k;

    /* JADX INFO: renamed from: l */
    public final C28936t f65810l;

    /* JADX INFO: renamed from: m */
    public final C28936t f65811m;

    /* JADX INFO: renamed from: n */
    public final C28936t f65812n;

    /* JADX INFO: renamed from: o */
    public final C28936t f65813o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41678w f65814p;

    /* JADX INFO: renamed from: q */
    public final C28936t f65815q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41678w f65816r;

    /* JADX INFO: renamed from: s */
    public final C32323s f65817s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC41634e f65818t;

    /* JADX INFO: renamed from: u */
    public Function1 f65819u;

    /* JADX INFO: renamed from: v */
    public InterfaceC41775x1 f65820v;

    /* JADX INFO: renamed from: b */
    public static final String m71084b(String str) {
        return str;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69616a() {
    }

    public C32300I(SavedStateHandle savedStateHandle, C30316a c30316a, C30156e c30156e, C30086U c30086u, C30157e0 c30157e0, C30311s0 c30311s0, C30306q c30306q, InterfaceC29953a interfaceC29953a, InterfaceC29921d interfaceC29921d, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f65799a = c30316a;
        this.f65800b = c30156e;
        this.f65801c = c30086u;
        this.f65802d = c30157e0;
        this.f65803e = c30311s0;
        this.f65804f = c30306q;
        this.f65805g = interfaceC29921d;
        this.f65806h = interfaceC29984m;
        String str = (String) savedStateHandle.get("IDDOCSETTYPE");
        this.f65807i = str == null ? "TYPE_UNKNOWN" : str;
        C28936t c28936t = new C28936t(savedStateHandle, "KEY_STEP", SNSQuestionnaireViewModel$Step.INIT, false);
        this.f65808j = c28936t;
        KProperty kProperty = f65798w[0];
        this.f65809k = savedStateHandle.getStateFlow("KEY_STEP", (SNSQuestionnaireViewModel$Step) c28936t.m69705a());
        this.f65810l = new C28936t(savedStateHandle, "KEY_PAGE_INDEX", 0, false);
        this.f65811m = new C28936t(savedStateHandle, "KEY_CURRENT_QUESTIONNAIRE", new C29069W2((String) null, 3), false);
        this.f65812n = new C28936t(savedStateHandle, "KEY_CURRENT_COUNTRY", null, false);
        this.f65813o = new C28936t(savedStateHandle, "KEY_PENDING_CAMERA_FIELD_ID", null, false);
        this.f65814p = C41636g.m90916g0(C41636g.m90890N(C41636g.m90917h(new C32330z(C41636g.m90887K(new C32326v(savedStateHandle, null)), this), new C32327w(this, null)), C41782z0.m91392b()), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getLazily(), null);
        this.f65815q = new C28936t(savedStateHandle, "KEY_FORM_VIEW_STATE", C28799f.f58565e, false);
        InterfaceC41678w stateFlow = savedStateHandle.getStateFlow("KEY_FORM_VIEW_STATE", m71091g());
        this.f65816r = stateFlow;
        this.f65817s = new C32323s(this);
        this.f65818t = C41636g.m90939v(new C32294C(stateFlow));
        this.f65819u = new Function1() { // from class: com.sumsub.sns.internal.features.presentation.questionnaire.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32300I.m71084b((String) obj);
            }
        };
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32312h(this, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69617a(AbstractC28841e0 abstractC28841e0) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final InterfaceC28805l mo69622b() {
        return this.f65817s;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        C29983l c29983l = c28075o.f57271c;
        if (c29983l == null) {
            C30316a.m70182a(this.f65799a, "SNSQuestionnaireViewModel", "buildViewStateFlow: no strings or config");
            AbstractC28052C.throwError$default(this, new IllegalStateException("Empty strings"), this.f65807i, null, 4, null);
            return C41636g.m90879C();
        }
        C28799f c28799fM71091g = m71091g();
        String strM70061a = c29983l.m70061a("sns_questionnaire_mime_types");
        C28799f c28799fM69615a = C28799f.m69615a(c28799fM71091g, 0, null, (strM70061a == null || !(StringsKt.isBlank(strM70061a) ^ true)) ? null : strM70061a, new C28803j(c29983l.m70061a("sns_quiestionnaire_field_isRequired"), c29983l.m70061a("sns_quiestionnaire_field_isNotValid")), 3);
        C28936t c28936t = this.f65815q;
        KProperty kProperty = f65798w[5];
        c28936t.f58834a.set(c28936t.f58835b, c28799fM69615a);
        return C41636g.m90929n(this.f65809k, this.f65814p, this.f65818t, new C32322r(this, c29983l, new C32320p(0, false, true, c29983l.m70061a("sns_quiestionnaire_action_continue")), null));
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w mo69624d() {
        return this.f65816r;
    }

    /* JADX INFO: renamed from: e */
    public final int m71089e() {
        C28936t c28936t = this.f65810l;
        KProperty kProperty = f65798w[1];
        return ((Number) c28936t.m69705a()).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final C29069W2 m71090f() {
        C28936t c28936t = this.f65811m;
        KProperty kProperty = f65798w[2];
        return (C29069W2) c28936t.m69705a();
    }

    /* JADX INFO: renamed from: g */
    public final C28799f m71091g() {
        C28936t c28936t = this.f65815q;
        KProperty kProperty = f65798w[5];
        return (C28799f) c28936t.m69705a();
    }

    /* JADX INFO: renamed from: i */
    public final void m71093i() {
        List list;
        boolean zContains;
        int i11 = m71091g().f58566a;
        int iM71089e = m71089e();
        if (i11 == iM71089e) {
            return;
        }
        boolean z11 = false;
        boolean z12 = i11 < iM71089e;
        C28847h0 c28847h0 = AbstractC28842f.f58669a;
        List list2 = m71091g().f58567b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((C28801h) it.next()).f58573d);
        }
        C28840e c28840eM69654a = AbstractC28842f.m69654a(arrayList, this.f65817s);
        C28801h c28801h = (C28801h) CollectionsKt.getOrNull(m71091g().f58567b, iM71089e);
        if (c28801h != null && (list = c28801h.f58573d) != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    z11 = true;
                    break;
                }
                AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) it2.next();
                if (!(abstractC28841e0 instanceof C28823Q)) {
                    LinkedHashSet linkedHashSet = c28840eM69654a.f58665b;
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it3 = linkedHashSet.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                zContains = false;
                                break;
                                break;
                            } else {
                                FieldId fieldId = (FieldId) it3.next();
                                if (Intrinsics.areEqual(fieldId.getSectionId(), abstractC28841e0.mo69643d()) && Intrinsics.areEqual(fieldId.getItemId(), abstractC28841e0.mo69642c().f59466a)) {
                                    zContains = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        zContains = false;
                        break;
                    }
                } else {
                    zContains = c28840eM69654a.f58664a.contains(((C28823Q) abstractC28841e0).f58626e);
                }
            } while (zContains);
        } else {
            z11 = true;
            break;
        }
        if (!z11) {
            C28799f c28799fM69615a = C28799f.m69615a(m71091g(), m71089e(), null, null, null, 14);
            C28936t c28936t = this.f65815q;
            KProperty kProperty = f65798w[5];
            c28936t.f58834a.set(c28936t.f58835b, c28799fM69615a);
            return;
        }
        C30316a.m70182a(this.f65799a, "SNSQuestionnaireViewModel", "Empty page: " + iM71089e);
        if (!z12) {
            m71092h();
        } else {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32325u(this, null, this), 2, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        String[] strArrM69321a;
        if (!(interfaceC28077Q instanceof InterfaceC32319o)) {
            super.intent(interfaceC28077Q);
            return;
        }
        InterfaceC32319o interfaceC32319o = (InterfaceC32319o) interfaceC28077Q;
        if (Intrinsics.areEqual(interfaceC32319o, C32315k.f65839a)) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32325u(this, null, this), 2, null);
            return;
        }
        if (interfaceC32319o instanceof C32318n) {
            FieldId fieldIdM69656a = AbstractC28843f0.m69656a(((C32318n) interfaceC28077Q).f65842a);
            C28936t c28936t = this.f65813o;
            KProperty[] kPropertyArr = f65798w;
            KProperty kProperty = kPropertyArr[4];
            c28936t.f58834a.set(c28936t.f58835b, fieldIdM69656a);
            C29070X c29070x = new C29070X(this.f65807i);
            C28936t c28936t2 = this.f65812n;
            KProperty kProperty2 = kPropertyArr[3];
            String str = (String) c28936t2.m69705a();
            String str2 = m71091g().f58568c;
            if (str2 == null || (strArrM69321a = AbstractC28441c.m69321a(str2)) == null) {
                strArrM69321a = new String[0];
            }
            fireEvent(new C32314j(new C30148s(c29070x, str, strArrM69321a)));
            return;
        }
        if (!(interfaceC32319o instanceof C32317m)) {
            if (!(interfaceC32319o instanceof C32316l)) {
                throw new NoWhenBranchMatchedException();
            }
            m71087a(((C32316l) interfaceC28077Q).f65840a);
            return;
        }
        FieldId fieldIdM69656a2 = AbstractC28843f0.m69656a(((C32317m) interfaceC28077Q).f65841a);
        C28936t c28936t3 = this.f65813o;
        KProperty[] kPropertyArr2 = f65798w;
        KProperty kProperty3 = kPropertyArr2[4];
        c28936t3.f58834a.set(c28936t3.f58835b, fieldIdM69656a2);
        Document document = new Document(new C29070X("TYPE_UNKNOWN"), null);
        List listEmptyList = CollectionsKt.emptyList();
        DocCapture$PreferredMode docCapture$PreferredMode = DocCapture$PreferredMode.MANUAL;
        C28936t c28936t4 = this.f65812n;
        KProperty kProperty4 = kPropertyArr2[3];
        fireEvent(new C32313i(new C30119M(false, document, listEmptyList, false, false, docCapture$PreferredMode, (String) c28936t4.m69705a(), false, 272)));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onErrorCancelled(AbstractC29149l0 abstractC29149l0) {
        if (abstractC29149l0 instanceof C29131i0) {
            AbstractC28052C.finish$default(this, null, null, null, null, 15, null);
        } else {
            super.onErrorCancelled(abstractC29149l0);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (!Intrinsics.areEqual(abstractC28503w, C28497u.f58029b)) {
            return super.onFinishCalled(abstractC28503w);
        }
        m71092h();
        return false;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69620a(C28850j c28850j) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final void mo69623b(AbstractC28841e0 abstractC28841e0, String str) {
        C29110e3 c29110e3;
        C29069W2 c29069w2M69741a = C29069W2.m69741a(m71090f(), null, 3);
        String strMo69643d = abstractC28841e0.mo69643d();
        String str2 = abstractC28841e0.mo69642c().f59466a;
        if (strMo69643d != null && c29069w2M69741a.f59013b.get(strMo69643d) == null) {
            c29069w2M69741a.f59013b.put(strMo69643d, new C29110e3());
        }
        if (strMo69643d != null && str2 != null && (c29110e3 = (C29110e3) c29069w2M69741a.f59013b.get(strMo69643d)) != null) {
            if (str == null) {
                c29110e3.f59060a.remove(str2);
            } else {
                c29110e3.f59060a.put(str2, new C29086a3(str, (List) null, 2));
            }
        }
        C28936t c28936t = this.f65811m;
        KProperty kProperty = f65798w[2];
        c28936t.f58834a.set(c28936t.f58835b, c29069w2M69741a);
    }

    /* JADX INFO: renamed from: h */
    public final void m71092h() {
        if (m71089e() <= 0) {
            AbstractC28052C.finish$default(this, C28491s.f58027b, null, null, null, 14, null);
            return;
        }
        int iM71089e = m71089e() - 1;
        C28936t c28936t = this.f65810l;
        KProperty[] kPropertyArr = f65798w;
        KProperty kProperty = kPropertyArr[1];
        c28936t.f58834a.set(c28936t.f58835b, Integer.valueOf(iM71089e));
        SNSQuestionnaireViewModel$Step sNSQuestionnaireViewModel$Step = SNSQuestionnaireViewModel$Step.CHANGE_PAGE;
        C28936t c28936t2 = this.f65808j;
        KProperty kProperty2 = kPropertyArr[0];
        c28936t2.f58834a.set(c28936t2.f58835b, sNSQuestionnaireViewModel$Step);
        C30316a.m70183b(this.f65799a, "SNSQuestionnaireViewModel", "Showing previous page: " + m71089e());
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final boolean mo69621a(String str) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m71088a(List list) {
        C28799f c28799fM69615a = C28799f.m69615a(m71091g(), 0, list, null, null, 13);
        C28936t c28936t = this.f65815q;
        KProperty kProperty = f65798w[5];
        c28936t.f58834a.set(c28936t.f58835b, c28799fM69615a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0243  */
    /* JADX WARN: Code duplicated, block: B:103:0x0252 A[LOOP:4: B:99:0x0241->B:103:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0259  */
    /* JADX WARN: Code duplicated, block: B:107:0x025b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0274  */
    /* JADX WARN: Code duplicated, block: B:115:0x027d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0297  */
    /* JADX WARN: Code duplicated, block: B:125:0x029a  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f4 A[LOOP:5: B:130:0x02ee->B:132:0x02f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0319  */
    /* JADX WARN: Code duplicated, block: B:137:0x0327  */
    /* JADX WARN: Code duplicated, block: B:140:0x033c A[LOOP:6: B:138:0x0336->B:140:0x033c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x034b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0362  */
    /* JADX WARN: Code duplicated, block: B:147:0x036a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0373  */
    /* JADX WARN: Code duplicated, block: B:153:0x0387  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:163:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:165:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:168:0x03df  */
    /* JADX WARN: Code duplicated, block: B:169:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:171:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0408  */
    /* JADX WARN: Code duplicated, block: B:176:0x0417  */
    /* JADX WARN: Code duplicated, block: B:178:0x041d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0426  */
    /* JADX WARN: Code duplicated, block: B:181:0x0437  */
    /* JADX WARN: Code duplicated, block: B:183:0x043d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0446  */
    /* JADX WARN: Code duplicated, block: B:188:0x044e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0455  */
    /* JADX WARN: Code duplicated, block: B:191:0x045c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0461  */
    /* JADX WARN: Code duplicated, block: B:195:0x0468  */
    /* JADX WARN: Code duplicated, block: B:196:0x046f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0474  */
    /* JADX WARN: Code duplicated, block: B:200:0x047a  */
    /* JADX WARN: Code duplicated, block: B:201:0x0483  */
    /* JADX WARN: Code duplicated, block: B:203:0x0494  */
    /* JADX WARN: Code duplicated, block: B:205:0x049c  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:211:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:212:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:214:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:216:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:218:0x04da  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:224:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:227:0x0503  */
    /* JADX WARN: Code duplicated, block: B:230:0x050d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0516  */
    /* JADX WARN: Code duplicated, block: B:234:0x052a  */
    /* JADX WARN: Code duplicated, block: B:236:0x052e  */
    /* JADX WARN: Code duplicated, block: B:237:0x0537  */
    /* JADX WARN: Code duplicated, block: B:239:0x054b  */
    /* JADX WARN: Code duplicated, block: B:241:0x0551  */
    /* JADX WARN: Code duplicated, block: B:242:0x0557  */
    /* JADX WARN: Code duplicated, block: B:244:0x055a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0579  */
    /* JADX WARN: Code duplicated, block: B:251:0x057e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0591  */
    /* JADX WARN: Code duplicated, block: B:259:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:265:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:268:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:270:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:274:0x0604  */
    /* JADX WARN: Code duplicated, block: B:280:0x0639 A[LOOP:9: B:278:0x0633->B:280:0x0639, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x067a  */
    /* JADX WARN: Code duplicated, block: B:286:0x0684  */
    /* JADX WARN: Code duplicated, block: B:292:0x0699  */
    /* JADX WARN: Code duplicated, block: B:293:0x069b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x017c A[EDGE_INSN: B:297:0x017c->B:67:0x017c BREAK  A[LOOP:0: B:60:0x015c->B:65:0x0176], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0573 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0565 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x05fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0693 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:? A[LOOP:10: B:284:0x067e->B:322:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0158  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x0176 A[LOOP:0: B:60:0x015c->B:65:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x017f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x019b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0208  */
    /* JADX WARN: Code duplicated, block: B:92:0x0214  */
    /* JADX WARN: Code duplicated, block: B:95:0x021e  */
    /* JADX WARN: Code duplicated, block: B:97:0x022a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Object m71085a(C30084S c30084s, C29983l c29983l, ContinuationImpl continuationImpl) {
        C32295D c32295d;
        C30084S c30084s2;
        C29983l c29983l2;
        C29983l c29983l3;
        C29124h c29124h;
        C29983l c29983l4;
        AbstractC29172p abstractC29172p;
        C29154m c29154mM69794a;
        boolean zM69789c;
        Object objM70120a;
        AbstractC29172p abstractC29172p2;
        Object value;
        C30084S c30084s3;
        C29124h c29124h2;
        C29983l c29983l5;
        Object obj;
        C30270n c30270n;
        String str;
        C29550g0 c29550g0;
        Map map;
        Function1 function1;
        ArrayList arrayList;
        List list;
        int i11;
        C29069W2 c29069w2;
        List list2;
        Object obj2;
        ArrayList arrayList2;
        Iterator it;
        Object next;
        Document document;
        ?? EmptyMap;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        List list3;
        C29069W2 c29069w3;
        char c11;
        C29027M result;
        Map map2;
        List list4;
        Iterator it2;
        int i12;
        int i13;
        C29602s0 c29602s0;
        boolean z11;
        String str2;
        List list5;
        Iterator it3;
        C29470F c29470f;
        String str3;
        Iterator it4;
        String str4;
        Iterator it5;
        FieldType[] fieldTypeArrValues;
        int length;
        int i14;
        FieldType fieldType;
        int i15;
        AbstractC28841e0 abstractC28841e0;
        AbstractC28841e0 c28835b0;
        String str5;
        AbstractC28841e0 c28831z;
        String strM70090a;
        Map mapEmptyMap;
        Map mapEmptyMap2;
        String strM70090a2;
        String strM70090a3;
        AbstractC28841e0 c28821o;
        Map mapEmptyMap3;
        Map mapEmptyMap4;
        String strM70090a4;
        String strM70090a5;
        AbstractC28841e0 abstractC28841e1;
        String strM70090a6;
        String strM70090a7;
        String strM70090a8;
        String strM70090a9;
        List listM70091b;
        Map mapEmptyMap5;
        String strM70090a10;
        Map mapEmptyMap6;
        List listM70091b2;
        String strM70090a11;
        String strM70090a12;
        AbstractC28841e0 abstractC28841e2;
        List<String> listM70091b3;
        C29470F c29470f2;
        C29470F c29470f3;
        LinkedHashMap linkedHashMap2;
        ?? EmptyList;
        LinkedHashMap linkedHashMap3;
        Iterator it6;
        String str6;
        int i16;
        Iterator it7;
        Object next2;
        Throwable thM103847exceptionOrNullimpl;
        Exception exc;
        Exception sNSGeneralException;
        if (continuationImpl instanceof C32295D) {
            c32295d = (C32295D) continuationImpl;
            int i17 = c32295d.f65783g;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                c32295d.f65783g = i17 - Integer.MIN_VALUE;
            } else {
                c32295d = new C32295D(this, continuationImpl);
            }
        } else {
            c32295d = new C32295D(this, continuationImpl);
        }
        Object objM70045b = c32295d.f65781e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i18 = c32295d.f65783g;
        int i19 = 0;
        boolean z12 = true;
        if (i18 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.f65806h;
            c30084s2 = c30084s;
            c32295d.f65777a = c30084s2;
            c29983l2 = c29983l;
            c32295d.f65778b = c29983l2;
            c32295d.f65783g = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c32295d);
            if (objM70045b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i18 == 1) {
            C29983l c29983l6 = c32295d.f65778b;
            C30084S c30084s4 = c32295d.f65777a;
            ResultKt.throwOnFailure(objM70045b);
            c29983l2 = c29983l6;
            c30084s2 = c30084s4;
        } else {
            if (i18 == 2) {
                C29124h c29124h3 = c32295d.f65779c;
                C29983l c29983l7 = c32295d.f65778b;
                C30084S c30084s5 = c32295d.f65777a;
                ResultKt.throwOnFailure(objM70045b);
                c29983l3 = c29983l7;
                c29124h = c29124h3;
                c30084s2 = c30084s5;
                c29983l4 = c29983l3;
                abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70045b).m70051c();
                if (abstractC29172p == null) {
                    AbstractC28052C.throwError$default(this, new IllegalStateException("failed to load applicant"), this.f65807i, null, 4, null);
                    return Unit.INSTANCE;
                }
                C29062V c29062v = C29070X.Companion;
                String str7 = this.f65807i;
                c29062v.getClass();
                c29154mM69794a = abstractC29172p.m69794a(C29062V.m69739a(str7));
                if (c29154mM69794a != null) {
                    zM69789c = c29154mM69794a.m69789c();
                } else {
                    zM69789c = false;
                }
                C30156e c30156e = this.f65800b;
                c32295d.f65777a = c30084s2;
                c32295d.f65778b = c29983l4;
                c32295d.f65779c = c29124h;
                c32295d.f65780d = abstractC29172p;
                c32295d.f65783g = 3;
                objM70120a = c30156e.m70120a(zM69789c, c32295d);
                if (objM70120a != coroutine_suspended) {
                    abstractC29172p2 = abstractC29172p;
                    value = objM70120a;
                    c30084s3 = c30084s2;
                    c29124h2 = c29124h;
                    c29983l5 = c29983l4;
                }
                return coroutine_suspended;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC29172p2 = c32295d.f65780d;
            c29124h2 = c32295d.f65779c;
            c29983l5 = c32295d.f65778b;
            c30084s3 = c32295d.f65777a;
            ResultKt.throwOnFailure(objM70045b);
            value = ((Result) objM70045b).getValue();
        }
        if (Result.m103850isFailureimpl(value)) {
            obj = null;
        } else {
            obj = value;
        }
        c30270n = (C30270n) obj;
        if (c30270n == null) {
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(value);
            if (thM103847exceptionOrNullimpl instanceof Exception) {
                exc = (Exception) thM103847exceptionOrNullimpl;
            } else {
                exc = null;
            }
            if (exc == null) {
                sNSGeneralException = new SNSGeneralException("countries missing", null, null, 6, null);
            } else {
                sNSGeneralException = exc;
            }
            AbstractC28052C.throwError$default(this, sNSGeneralException, this.f65807i, null, 4, null);
            return Unit.INSTANCE;
        }
        String str8 = c30270n.f60858e;
        C28936t c28936t = this.f65812n;
        KProperty kProperty = f65798w[3];
        c28936t.f58834a.set(c28936t.f58835b, str8);
        Map map3 = c29124h2.f59074g;
        str = c30084s3.f60459a;
        C29134i3 c29134i3 = c30084s3.f60461c;
        c29550g0 = c30084s3.f60460b;
        map = c29983l5.f60248a;
        function1 = this.f65819u;
        arrayList = new ArrayList();
        list = c29134i3.f59100b;
        if (list != null) {
            it7 = list.iterator();
            while (true) {
                if (it7.hasNext()) {
                    i11 = i19;
                    next2 = null;
                    break;
                }
                next2 = it7.next();
                i11 = i19;
                if (Intrinsics.areEqual(((C29069W2) next2).f59012a, c29550g0.f59572b)) {
                    break;
                }
                i19 = i11;
            }
            c29069w2 = (C29069W2) next2;
        } else {
            i11 = 0;
            c29069w2 = null;
        }
        list2 = c29550g0.f59578h;
        if (list2 != null) {
            it2 = list2.iterator();
            i12 = i11;
            while (true) {
                arrayList2 = null;
                while (true) {
                    if (it2.hasNext()) {
                        Object next3 = it2.next();
                        i13 = i12 + 1;
                        if (i12 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        c29602s0 = (C29602s0) next3;
                        z11 = z12;
                        if (Intrinsics.areEqual(c29602s0.f59655f, Boolean.TRUE)) {
                            if (arrayList2 != null) {
                                arrayList.add(new C28801h(arrayList.size(), c29550g0.f59576f, c29550g0.f59577g, new ArrayList(arrayList2)));
                            }
                            abstractC29172p2 = abstractC29172p2;
                            z12 = z11;
                            i12 = i13;
                        } else {
                            AbstractC29172p abstractC29172p3 = abstractC29172p2;
                            C29470F c29470f4 = new C29470F((String) null, c29602s0.f59652c, c29602s0.f59653d, "section", Boolean.FALSE, (String) null, (String) null, c29602s0.f59654e, (List) null, ViewUtils.EDGE_TO_EDGE_FLAGS);
                            str2 = c29602s0.f59650a;
                            if (str2 == null) {
                                str2 = "sectionId";
                            }
                            C28823Q c28823q = new C28823Q(c29470f4, str2);
                            c28823q.f58668b = c29602s0.f59654e;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c28823q);
                            list5 = c29602s0.f59656g;
                            if (list5 != null) {
                                it3 = list5.iterator();
                                while (it3.hasNext()) {
                                    c29470f = (C29470F) it3.next();
                                    str3 = c29602s0.f59650a;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    C29109e2 c29109e2 = FieldType.Companion;
                                    it4 = it3;
                                    str4 = c29470f.f59469d;
                                    c29109e2.getClass();
                                    it5 = it2;
                                    fieldTypeArrValues = FieldType.values();
                                    length = fieldTypeArrValues.length;
                                    i14 = i11;
                                    while (true) {
                                        if (i14 < length) {
                                            fieldType = fieldTypeArrValues[i14];
                                            i16 = i14;
                                            if (Intrinsics.areEqual(fieldType.name(), str4)) {
                                                i14 = i16 + 1;
                                            }
                                        } else {
                                            fieldType = null;
                                        }
                                    }
                                    if (fieldType == null) {
                                        i15 = -1;
                                    } else {
                                        i15 = AbstractC30063c.f60403a[fieldType.ordinal()];
                                    }
                                    switch (i15) {
                                        case -1:
                                            c29602s0 = c29602s0;
                                            abstractC28841e0 = null;
                                            c28835b0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 0:
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                        case 1:
                                            c29602s0 = c29602s0;
                                            abstractC28841e0 = null;
                                            C29705v0 c29705v0 = AbstractC29028M0.Companion;
                                            str5 = c29470f.f59471f;
                                            c29705v0.getClass();
                                            if (C29705v0.m69909a(str5) instanceof C29024L0) {
                                                mapEmptyMap = c30270n.f60856c;
                                                if (mapEmptyMap == null) {
                                                    mapEmptyMap = MapsKt.emptyMap();
                                                }
                                                Map map4 = mapEmptyMap;
                                                mapEmptyMap2 = c30270n.f60855b;
                                                if (mapEmptyMap2 == null) {
                                                    mapEmptyMap2 = MapsKt.emptyMap();
                                                }
                                                Map map5 = mapEmptyMap2;
                                                String str9 = c30270n.f60858e;
                                                if (c29069w2 != null) {
                                                    strM70090a2 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                } else {
                                                    strM70090a2 = null;
                                                }
                                                c28831z = new C28821O(str3, c29470f, map4, map5, str9, false, strM70090a2, null, true);
                                            } else {
                                                if (c29069w2 != null) {
                                                    strM70090a = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                } else {
                                                    strM70090a = null;
                                                }
                                                c28831z = new C28831Z(c29470f, str3, strM70090a, true, (CharSequence) null, (List) null, (String) null, 240);
                                            }
                                            c28835b0 = c28831z;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 2:
                                            c29602s0 = c29602s0;
                                            if (c29069w2 != null) {
                                                strM70090a3 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a3 = null;
                                            }
                                            abstractC28841e0 = null;
                                            c28835b0 = new C28835b0(c29470f, str3, strM70090a3, null);
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 3:
                                            mapEmptyMap3 = c30270n.f60856c;
                                            if (mapEmptyMap3 == null) {
                                                mapEmptyMap3 = MapsKt.emptyMap();
                                            }
                                            Map map6 = mapEmptyMap3;
                                            mapEmptyMap4 = c30270n.f60855b;
                                            if (mapEmptyMap4 == null) {
                                                mapEmptyMap4 = MapsKt.emptyMap();
                                            }
                                            Map map7 = mapEmptyMap4;
                                            String str10 = c30270n.f60858e;
                                            if (c29069w2 != null) {
                                                strM70090a4 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a4 = null;
                                            }
                                            c28821o = new C28821O(str3, c29470f, map6, map7, str10, false, strM70090a4, null, true);
                                            c28835b0 = c28821o;
                                            abstractC28841e0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 4:
                                            if (c29069w2 != null) {
                                                strM70090a5 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a5 = null;
                                            }
                                            c28821o = new C28861s(c29470f, str3, false, strM70090a5, null, true);
                                            c28835b0 = c28821o;
                                            abstractC28841e0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 5:
                                            abstractC28841e1 = null;
                                            if (c29069w2 != null) {
                                                strM70090a6 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a6 = null;
                                            }
                                            c28835b0 = new C28863u(c29470f, str3, strM70090a6, null);
                                            abstractC28841e0 = abstractC28841e1;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 6:
                                            abstractC28841e1 = null;
                                            if (c29069w2 != null) {
                                                strM70090a7 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a7 = null;
                                            }
                                            c28835b0 = new C28854l(c29470f, str3, strM70090a7, null);
                                            abstractC28841e0 = abstractC28841e1;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 7:
                                            if (c29069w2 != null) {
                                                strM70090a8 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a8 = null;
                                            }
                                            abstractC28841e1 = null;
                                            c28835b0 = new C28825T(c29470f, str3, strM70090a8, null);
                                            abstractC28841e0 = abstractC28841e1;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 8:
                                            if (c29069w2 != null) {
                                                strM70090a9 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a9 = null;
                                            }
                                            c28821o = new C28827V(c29470f, str3, strM70090a9, false, (CharSequence) null, 56);
                                            c28835b0 = c28821o;
                                            abstractC28841e0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 9:
                                            if (c29069w2 != null) {
                                                listM70091b = AbstractC30064d.m70091b(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                listM70091b = null;
                                            }
                                            c28821o = new C28819M(c29470f, str3, listM70091b, null, 248);
                                            c28835b0 = c28821o;
                                            abstractC28841e0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 10:
                                            mapEmptyMap5 = c30270n.f60856c;
                                            if (mapEmptyMap5 == null) {
                                                mapEmptyMap5 = MapsKt.emptyMap();
                                            }
                                            Map map8 = mapEmptyMap5;
                                            if (c29069w2 != null) {
                                                strM70090a10 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a10 = null;
                                            }
                                            c28821o = new C28859q(str3, c29470f, map8, strM70090a10, true, (CharSequence) null, 96);
                                            c28835b0 = c28821o;
                                            abstractC28841e0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 11:
                                            mapEmptyMap6 = c30270n.f60856c;
                                            if (mapEmptyMap6 == null) {
                                                mapEmptyMap6 = MapsKt.emptyMap();
                                            }
                                            Map map9 = mapEmptyMap6;
                                            if (c29069w2 != null) {
                                                listM70091b2 = AbstractC30064d.m70091b(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                listM70091b2 = null;
                                            }
                                            c28821o = new C28857o(c29470f, str3, map9, listM70091b2, true, null);
                                            c28835b0 = c28821o;
                                            abstractC28841e0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 12:
                                            if (c29069w2 != null) {
                                                strM70090a11 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                strM70090a11 = null;
                                            }
                                            String str11 = (String) map.get("sns_quiestionnaire_action_addFile");
                                            if (c29069w2 != null || (strM70090a12 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a)) == null) {
                                                strM70090a12 = "";
                                            }
                                            String str12 = (String) function1.invoke(strM70090a12);
                                            String str13 = (String) map.get("sns_quiestionnaire_attachment_label");
                                            FormItem$ItemState formItem$ItemState = FormItem$ItemState.DEFAULT;
                                            c28821o = new C28809C(c29470f, str3, strM70090a11, str11, null, formItem$ItemState, null, formItem$ItemState, str12, str13);
                                            c28835b0 = c28821o;
                                            abstractC28841e0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                        case 13:
                                            if (c29069w2 != null) {
                                                listM70091b3 = AbstractC30064d.m70091b(c29069w2, str3, c29470f.f59466a);
                                            } else {
                                                listM70091b3 = null;
                                            }
                                            String str14 = str3;
                                            if (Intrinsics.areEqual(c29470f.f59470e, Boolean.TRUE) || !((str6 = c29470f.f59471f) == null || str6.length() == 0)) {
                                                c29470f2 = c29470f;
                                            } else {
                                                c29470f2 = null;
                                            }
                                            if (c29470f2 == null) {
                                                c29470f3 = new C29470F(c29470f.f59466a, c29470f.f59467b, c29470f.f59468c, c29470f.f59469d, c29470f.f59470e, "min_value:1", c29470f.f59472g, c29470f.f59473h, c29470f.f59474i, c29470f.f59475j);
                                            } else {
                                                c29470f3 = c29470f2;
                                            }
                                            String str15 = (String) map.get("sns_quiestionnaire_action_addFile");
                                            if (listM70091b3 != null) {
                                                linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM70091b3, 10)), 16));
                                                for (it6 = listM70091b3.iterator(); it6.hasNext(); it6 = it6) {
                                                    String str16 = (String) it6.next();
                                                    Pair pairM90091to = TuplesKt.m90091to(str16, function1.invoke(str16));
                                                    linkedHashMap3.put(pairM90091to.getFirst(), pairM90091to.getSecond());
                                                }
                                                linkedHashMap2 = linkedHashMap3;
                                            } else {
                                                linkedHashMap2 = null;
                                            }
                                            String str17 = (String) map.get("sns_quiestionnaire_attachment_label");
                                            if (listM70091b3 != null) {
                                                EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM70091b3, 10));
                                                for (String str18 : listM70091b3) {
                                                    EmptyList.add(FormItem$ItemState.DEFAULT);
                                                }
                                            } else {
                                                EmptyList = CollectionsKt.emptyList();
                                            }
                                            c28821o = new C28817K(c29470f3, str14, listM70091b3, str15, null, true, EmptyList, null, FormItem$ItemState.DEFAULT, linkedHashMap2, str17);
                                            c28835b0 = c28821o;
                                            abstractC28841e0 = null;
                                            if (c28835b0 != null) {
                                                c28835b0.f58668b = c29470f.f59473h;
                                                abstractC28841e2 = c28835b0;
                                            } else {
                                                abstractC28841e2 = abstractC28841e0;
                                            }
                                            if (abstractC28841e2 != null) {
                                                arrayList2.add(abstractC28841e2);
                                            }
                                            it3 = it4;
                                            it2 = it5;
                                            c29602s0 = c29602s0;
                                            break;
                                    }
                                }
                            }
                            abstractC29172p2 = abstractC29172p3;
                            z12 = z11;
                            i12 = i13;
                            it2 = it2;
                        }
                    } else {
                        obj2 = null;
                    }
                }
            }
        } else {
            obj2 = null;
            arrayList2 = null;
        }
        AbstractC29172p abstractC29172p4 = abstractC29172p2;
        boolean z13 = z12;
        if (arrayList2 != null) {
            int size = arrayList.size();
            String str19 = c29550g0.f59576f;
            String str20 = c29550g0.f59577g;
            list4 = CollectionsKt.toList(arrayList2);
            if (list4 == null) {
                list4 = CollectionsKt.emptyList();
            }
            arrayList.add(new C28801h(size, str19, str20, new ArrayList(list4)));
        }
        C30316a.m70183b(this.f65799a, "SNSQuestionnaireViewModel", "Loaded pages: " + arrayList);
        it = abstractC29172p4.mo69761l().f59118b.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = obj2;
            }
            document = (Document) next;
            if (document != null || (result = document.getResult()) == null) {
                EmptyMap = obj2;
            } else {
                map2 = result.f58971e;
            }
            if (EmptyMap == 0) {
                EmptyMap = map2;
                EmptyMap = MapsKt.emptyMap();
            }
            EmptyMap = map2;
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : EmptyMap.entrySet()) {
                if (((C29164n3) entry.getValue()).f59161c == ReviewAnswerType.Red) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList3.add(new C28807A(String.valueOf(((Number) entry2.getKey()).intValue()), ((C29164n3) entry2.getValue()).f59159a));
            }
            m71088a(AbstractC28806m.m69635a(arrayList, arrayList3));
            C28936t c28936t2 = this.f65810l;
            KProperty kProperty2 = f65798w[z13 ? 1 : 0];
            c28936t2.f58834a.set(c28936t2.f58835b, Integer.valueOf(i11));
            list3 = c29134i3.f59100b;
            if (list3 != null) {
                for (Object obj3 : list3) {
                    if (Intrinsics.areEqual(((C29069W2) obj3).f59012a, str)) {
                        obj2 = obj3;
                        c29069w3 = (C29069W2) obj2;
                        if (c29069w3 == null) {
                            c11 = 2;
                            c29069w3 = new C29069W2(str, 2);
                        } else {
                            c11 = 2;
                        }
                    }
                }
                c29069w3 = (C29069W2) obj2;
                if (c29069w3 == null) {
                    c11 = 2;
                    c29069w3 = new C29069W2(str, 2);
                } else {
                    c11 = 2;
                }
            } else {
                c11 = 2;
                c29069w3 = new C29069W2(str, 2);
            }
            C28936t c28936t3 = this.f65811m;
            KProperty[] kPropertyArr = f65798w;
            KProperty kProperty3 = kPropertyArr[c11];
            c28936t3.f58834a.set(c28936t3.f58835b, c29069w3);
            SNSQuestionnaireViewModel$Step sNSQuestionnaireViewModel$Step = SNSQuestionnaireViewModel$Step.CHANGE_PAGE;
            C28936t c28936t4 = this.f65808j;
            KProperty kProperty4 = kPropertyArr[i11];
            c28936t4.f58834a.set(c28936t4.f58835b, sNSQuestionnaireViewModel$Step);
            return Unit.INSTANCE;
        } while (!Intrinsics.areEqual(((Document) next).getType().f59014a, this.f65807i));
        document = (Document) next;
        if (document != null) {
            EmptyMap = obj2;
        } else {
            EmptyMap = obj2;
        }
        if (EmptyMap == 0) {
            EmptyMap = map2;
            EmptyMap = MapsKt.emptyMap();
        }
        EmptyMap = map2;
        linkedHashMap = new LinkedHashMap();
        while (r3.hasNext()) {
            if (((C29164n3) entry.getValue()).f59161c == ReviewAnswerType.Red) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        arrayList3 = new ArrayList(linkedHashMap.size());
        while (r2.hasNext()) {
            arrayList3.add(new C28807A(String.valueOf(((Number) entry2.getKey()).intValue()), ((C29164n3) entry2.getValue()).f59159a));
        }
        m71088a(AbstractC28806m.m69635a(arrayList, arrayList3));
        C28936t c28936t5 = this.f65810l;
        KProperty kProperty5 = f65798w[z13 ? 1 : 0];
        c28936t5.f58834a.set(c28936t5.f58835b, Integer.valueOf(i11));
        list3 = c29134i3.f59100b;
        if (list3 != null) {
            while (r2.hasNext()) {
                if (Intrinsics.areEqual(((C29069W2) obj3).f59012a, str)) {
                    obj2 = obj3;
                    c29069w3 = (C29069W2) obj2;
                    if (c29069w3 == null) {
                        c11 = 2;
                        c29069w3 = new C29069W2(str, 2);
                    } else {
                        c11 = 2;
                    }
                }
            }
            c29069w3 = (C29069W2) obj2;
            if (c29069w3 == null) {
                c11 = 2;
                c29069w3 = new C29069W2(str, 2);
            } else {
                c11 = 2;
            }
        } else {
            c11 = 2;
            c29069w3 = new C29069W2(str, 2);
        }
        C28936t c28936t6 = this.f65811m;
        KProperty[] kPropertyArr2 = f65798w;
        KProperty kProperty6 = kPropertyArr2[c11];
        c28936t6.f58834a.set(c28936t6.f58835b, c29069w3);
        SNSQuestionnaireViewModel$Step sNSQuestionnaireViewModel$Step2 = SNSQuestionnaireViewModel$Step.CHANGE_PAGE;
        C28936t c28936t7 = this.f65808j;
        KProperty kProperty7 = kPropertyArr2[i11];
        c28936t7.f58834a.set(c28936t7.f58835b, sNSQuestionnaireViewModel$Step2);
        return Unit.INSTANCE;
        C29124h c29124h4 = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        if (c29124h4 == null) {
            AbstractC28052C.throwError$default(this, new IllegalStateException("failed to load config"), this.f65807i, null, 4, null);
            return Unit.INSTANCE;
        }
        InterfaceC29984m interfaceC29984m2 = this.f65806h;
        c32295d.f65777a = c30084s2;
        c32295d.f65778b = c29983l2;
        c32295d.f65779c = c29124h4;
        c32295d.f65783g = 2;
        Object objM70042a = ((C29967J) interfaceC29984m2).m70042a(true, (Continuation) c32295d);
        if (objM70042a != coroutine_suspended) {
            c29983l3 = c29983l2;
            c29124h = c29124h4;
            objM70045b = objM70042a;
            c29983l4 = c29983l3;
            abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70045b).m70051c();
            if (abstractC29172p == null) {
                AbstractC28052C.throwError$default(this, new IllegalStateException("failed to load applicant"), this.f65807i, null, 4, null);
                return Unit.INSTANCE;
            }
            C29062V c29062v2 = C29070X.Companion;
            String str21 = this.f65807i;
            c29062v2.getClass();
            c29154mM69794a = abstractC29172p.m69794a(C29062V.m69739a(str21));
            if (c29154mM69794a != null) {
                zM69789c = c29154mM69794a.m69789c();
            } else {
                zM69789c = false;
            }
            C30156e c30156e2 = this.f65800b;
            c32295d.f65777a = c30084s2;
            c32295d.f65778b = c29983l4;
            c32295d.f65779c = c29124h;
            c32295d.f65780d = abstractC29172p;
            c32295d.f65783g = 3;
            objM70120a = c30156e2.m70120a(zM69789c, c32295d);
            if (objM70120a != coroutine_suspended) {
                abstractC29172p2 = abstractC29172p;
                value = objM70120a;
                c30084s3 = c30084s2;
                c29124h2 = c29124h;
                c29983l5 = c29983l4;
                if (Result.m103850isFailureimpl(value)) {
                    obj = null;
                } else {
                    obj = value;
                }
                c30270n = (C30270n) obj;
                if (c30270n == null) {
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(value);
                    if (thM103847exceptionOrNullimpl instanceof Exception) {
                        exc = (Exception) thM103847exceptionOrNullimpl;
                    } else {
                        exc = null;
                    }
                    if (exc == null) {
                        sNSGeneralException = new SNSGeneralException("countries missing", null, null, 6, null);
                    } else {
                        sNSGeneralException = exc;
                    }
                    AbstractC28052C.throwError$default(this, sNSGeneralException, this.f65807i, null, 4, null);
                    return Unit.INSTANCE;
                }
                String str22 = c30270n.f60858e;
                C28936t c28936t8 = this.f65812n;
                KProperty kProperty8 = f65798w[3];
                c28936t8.f58834a.set(c28936t8.f58835b, str22);
                Map map10 = c29124h2.f59074g;
                str = c30084s3.f60459a;
                C29134i3 c29134i4 = c30084s3.f60461c;
                c29550g0 = c30084s3.f60460b;
                map = c29983l5.f60248a;
                function1 = this.f65819u;
                arrayList = new ArrayList();
                list = c29134i4.f59100b;
                if (list != null) {
                    it7 = list.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            i11 = i19;
                            next2 = null;
                            break;
                        }
                        next2 = it7.next();
                        i11 = i19;
                        if (Intrinsics.areEqual(((C29069W2) next2).f59012a, c29550g0.f59572b)) {
                            break;
                            break;
                        }
                        i19 = i11;
                    }
                    c29069w2 = (C29069W2) next2;
                } else {
                    i11 = 0;
                    c29069w2 = null;
                }
                list2 = c29550g0.f59578h;
                if (list2 != null) {
                    it2 = list2.iterator();
                    i12 = i11;
                    while (true) {
                        arrayList2 = null;
                        while (true) {
                            if (it2.hasNext()) {
                                Object next4 = it2.next();
                                i13 = i12 + 1;
                                if (i12 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                c29602s0 = (C29602s0) next4;
                                z11 = z12;
                                if (Intrinsics.areEqual(c29602s0.f59655f, Boolean.TRUE)) {
                                    if (arrayList2 != null) {
                                        arrayList.add(new C28801h(arrayList.size(), c29550g0.f59576f, c29550g0.f59577g, new ArrayList(arrayList2)));
                                    }
                                    abstractC29172p2 = abstractC29172p2;
                                    z12 = z11;
                                    i12 = i13;
                                } else {
                                    AbstractC29172p abstractC29172p5 = abstractC29172p2;
                                    C29470F c29470f5 = new C29470F((String) null, c29602s0.f59652c, c29602s0.f59653d, "section", Boolean.FALSE, (String) null, (String) null, c29602s0.f59654e, (List) null, ViewUtils.EDGE_TO_EDGE_FLAGS);
                                    str2 = c29602s0.f59650a;
                                    if (str2 == null) {
                                        str2 = "sectionId";
                                    }
                                    C28823Q c28823q2 = new C28823Q(c29470f5, str2);
                                    c28823q2.f58668b = c29602s0.f59654e;
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(c28823q2);
                                    list5 = c29602s0.f59656g;
                                    if (list5 != null) {
                                        it3 = list5.iterator();
                                        while (it3.hasNext()) {
                                            c29470f = (C29470F) it3.next();
                                            str3 = c29602s0.f59650a;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            C29109e2 c29109e3 = FieldType.Companion;
                                            it4 = it3;
                                            str4 = c29470f.f59469d;
                                            c29109e3.getClass();
                                            it5 = it2;
                                            fieldTypeArrValues = FieldType.values();
                                            length = fieldTypeArrValues.length;
                                            i14 = i11;
                                            while (true) {
                                                if (i14 < length) {
                                                    fieldType = fieldTypeArrValues[i14];
                                                    i16 = i14;
                                                    if (Intrinsics.areEqual(fieldType.name(), str4)) {
                                                        i14 = i16 + 1;
                                                    }
                                                } else {
                                                    fieldType = null;
                                                }
                                            }
                                            if (fieldType == null) {
                                                i15 = -1;
                                            } else {
                                                i15 = AbstractC30063c.f60403a[fieldType.ordinal()];
                                            }
                                            switch (i15) {
                                                case -1:
                                                    c29602s0 = c29602s0;
                                                    abstractC28841e0 = null;
                                                    c28835b0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 0:
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                                case 1:
                                                    c29602s0 = c29602s0;
                                                    abstractC28841e0 = null;
                                                    C29705v0 c29705v1 = AbstractC29028M0.Companion;
                                                    str5 = c29470f.f59471f;
                                                    c29705v1.getClass();
                                                    if (C29705v0.m69909a(str5) instanceof C29024L0) {
                                                        mapEmptyMap = c30270n.f60856c;
                                                        if (mapEmptyMap == null) {
                                                            mapEmptyMap = MapsKt.emptyMap();
                                                        }
                                                        Map map11 = mapEmptyMap;
                                                        mapEmptyMap2 = c30270n.f60855b;
                                                        if (mapEmptyMap2 == null) {
                                                            mapEmptyMap2 = MapsKt.emptyMap();
                                                        }
                                                        Map map12 = mapEmptyMap2;
                                                        String str23 = c30270n.f60858e;
                                                        if (c29069w2 != null) {
                                                            strM70090a2 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                        } else {
                                                            strM70090a2 = null;
                                                        }
                                                        c28831z = new C28821O(str3, c29470f, map11, map12, str23, false, strM70090a2, null, true);
                                                    } else {
                                                        if (c29069w2 != null) {
                                                            strM70090a = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                        } else {
                                                            strM70090a = null;
                                                        }
                                                        c28831z = new C28831Z(c29470f, str3, strM70090a, true, (CharSequence) null, (List) null, (String) null, 240);
                                                    }
                                                    c28835b0 = c28831z;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 2:
                                                    c29602s0 = c29602s0;
                                                    if (c29069w2 != null) {
                                                        strM70090a3 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a3 = null;
                                                    }
                                                    abstractC28841e0 = null;
                                                    c28835b0 = new C28835b0(c29470f, str3, strM70090a3, null);
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 3:
                                                    mapEmptyMap3 = c30270n.f60856c;
                                                    if (mapEmptyMap3 == null) {
                                                        mapEmptyMap3 = MapsKt.emptyMap();
                                                    }
                                                    Map map13 = mapEmptyMap3;
                                                    mapEmptyMap4 = c30270n.f60855b;
                                                    if (mapEmptyMap4 == null) {
                                                        mapEmptyMap4 = MapsKt.emptyMap();
                                                    }
                                                    Map map14 = mapEmptyMap4;
                                                    String str110 = c30270n.f60858e;
                                                    if (c29069w2 != null) {
                                                        strM70090a4 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a4 = null;
                                                    }
                                                    c28821o = new C28821O(str3, c29470f, map13, map14, str110, false, strM70090a4, null, true);
                                                    c28835b0 = c28821o;
                                                    abstractC28841e0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 4:
                                                    if (c29069w2 != null) {
                                                        strM70090a5 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a5 = null;
                                                    }
                                                    c28821o = new C28861s(c29470f, str3, false, strM70090a5, null, true);
                                                    c28835b0 = c28821o;
                                                    abstractC28841e0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 5:
                                                    abstractC28841e1 = null;
                                                    if (c29069w2 != null) {
                                                        strM70090a6 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a6 = null;
                                                    }
                                                    c28835b0 = new C28863u(c29470f, str3, strM70090a6, null);
                                                    abstractC28841e0 = abstractC28841e1;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 6:
                                                    abstractC28841e1 = null;
                                                    if (c29069w2 != null) {
                                                        strM70090a7 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a7 = null;
                                                    }
                                                    c28835b0 = new C28854l(c29470f, str3, strM70090a7, null);
                                                    abstractC28841e0 = abstractC28841e1;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 7:
                                                    if (c29069w2 != null) {
                                                        strM70090a8 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a8 = null;
                                                    }
                                                    abstractC28841e1 = null;
                                                    c28835b0 = new C28825T(c29470f, str3, strM70090a8, null);
                                                    abstractC28841e0 = abstractC28841e1;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 8:
                                                    if (c29069w2 != null) {
                                                        strM70090a9 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a9 = null;
                                                    }
                                                    c28821o = new C28827V(c29470f, str3, strM70090a9, false, (CharSequence) null, 56);
                                                    c28835b0 = c28821o;
                                                    abstractC28841e0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 9:
                                                    if (c29069w2 != null) {
                                                        listM70091b = AbstractC30064d.m70091b(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        listM70091b = null;
                                                    }
                                                    c28821o = new C28819M(c29470f, str3, listM70091b, null, 248);
                                                    c28835b0 = c28821o;
                                                    abstractC28841e0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 10:
                                                    mapEmptyMap5 = c30270n.f60856c;
                                                    if (mapEmptyMap5 == null) {
                                                        mapEmptyMap5 = MapsKt.emptyMap();
                                                    }
                                                    Map map15 = mapEmptyMap5;
                                                    if (c29069w2 != null) {
                                                        strM70090a10 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a10 = null;
                                                    }
                                                    c28821o = new C28859q(str3, c29470f, map15, strM70090a10, true, (CharSequence) null, 96);
                                                    c28835b0 = c28821o;
                                                    abstractC28841e0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 11:
                                                    mapEmptyMap6 = c30270n.f60856c;
                                                    if (mapEmptyMap6 == null) {
                                                        mapEmptyMap6 = MapsKt.emptyMap();
                                                    }
                                                    Map map16 = mapEmptyMap6;
                                                    if (c29069w2 != null) {
                                                        listM70091b2 = AbstractC30064d.m70091b(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        listM70091b2 = null;
                                                    }
                                                    c28821o = new C28857o(c29470f, str3, map16, listM70091b2, true, null);
                                                    c28835b0 = c28821o;
                                                    abstractC28841e0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 12:
                                                    if (c29069w2 != null) {
                                                        strM70090a11 = AbstractC30064d.m70090a(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        strM70090a11 = null;
                                                    }
                                                    String str111 = (String) map.get("sns_quiestionnaire_action_addFile");
                                                    if (c29069w2 != null) {
                                                        strM70090a12 = "";
                                                    } else {
                                                        strM70090a12 = "";
                                                    }
                                                    String str112 = (String) function1.invoke(strM70090a12);
                                                    String str113 = (String) map.get("sns_quiestionnaire_attachment_label");
                                                    FormItem$ItemState formItem$ItemState2 = FormItem$ItemState.DEFAULT;
                                                    c28821o = new C28809C(c29470f, str3, strM70090a11, str111, null, formItem$ItemState2, null, formItem$ItemState2, str112, str113);
                                                    c28835b0 = c28821o;
                                                    abstractC28841e0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                                case 13:
                                                    if (c29069w2 != null) {
                                                        listM70091b3 = AbstractC30064d.m70091b(c29069w2, str3, c29470f.f59466a);
                                                    } else {
                                                        listM70091b3 = null;
                                                    }
                                                    String str114 = str3;
                                                    if (Intrinsics.areEqual(c29470f.f59470e, Boolean.TRUE)) {
                                                        c29470f2 = c29470f;
                                                    } else {
                                                        c29470f2 = c29470f;
                                                    }
                                                    if (c29470f2 == null) {
                                                        c29470f3 = new C29470F(c29470f.f59466a, c29470f.f59467b, c29470f.f59468c, c29470f.f59469d, c29470f.f59470e, "min_value:1", c29470f.f59472g, c29470f.f59473h, c29470f.f59474i, c29470f.f59475j);
                                                    } else {
                                                        c29470f3 = c29470f2;
                                                    }
                                                    String str115 = (String) map.get("sns_quiestionnaire_action_addFile");
                                                    if (listM70091b3 != null) {
                                                        linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM70091b3, 10)), 16));
                                                        while (it6.hasNext()) {
                                                            String str116 = (String) it6.next();
                                                            Pair pairM90091to2 = TuplesKt.m90091to(str116, function1.invoke(str116));
                                                            linkedHashMap3.put(pairM90091to2.getFirst(), pairM90091to2.getSecond());
                                                        }
                                                        linkedHashMap2 = linkedHashMap3;
                                                    } else {
                                                        linkedHashMap2 = null;
                                                    }
                                                    String str117 = (String) map.get("sns_quiestionnaire_attachment_label");
                                                    if (listM70091b3 != null) {
                                                        EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM70091b3, 10));
                                                        while (r8.hasNext()) {
                                                            EmptyList.add(FormItem$ItemState.DEFAULT);
                                                        }
                                                    } else {
                                                        EmptyList = CollectionsKt.emptyList();
                                                    }
                                                    c28821o = new C28817K(c29470f3, str114, listM70091b3, str115, null, true, EmptyList, null, FormItem$ItemState.DEFAULT, linkedHashMap2, str117);
                                                    c28835b0 = c28821o;
                                                    abstractC28841e0 = null;
                                                    if (c28835b0 != null) {
                                                        c28835b0.f58668b = c29470f.f59473h;
                                                        abstractC28841e2 = c28835b0;
                                                    } else {
                                                        abstractC28841e2 = abstractC28841e0;
                                                    }
                                                    if (abstractC28841e2 != null) {
                                                        arrayList2.add(abstractC28841e2);
                                                    }
                                                    it3 = it4;
                                                    it2 = it5;
                                                    c29602s0 = c29602s0;
                                                    break;
                                            }
                                        }
                                    }
                                    abstractC29172p2 = abstractC29172p5;
                                    z12 = z11;
                                    i12 = i13;
                                    it2 = it2;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                    }
                } else {
                    obj2 = null;
                    arrayList2 = null;
                }
                AbstractC29172p abstractC29172p6 = abstractC29172p2;
                boolean z14 = z12;
                if (arrayList2 != null) {
                    int size2 = arrayList.size();
                    String str118 = c29550g0.f59576f;
                    String str24 = c29550g0.f59577g;
                    list4 = CollectionsKt.toList(arrayList2);
                    if (list4 == null) {
                        list4 = CollectionsKt.emptyList();
                    }
                    arrayList.add(new C28801h(size2, str118, str24, new ArrayList(list4)));
                }
                C30316a.m70183b(this.f65799a, "SNSQuestionnaireViewModel", "Loaded pages: " + arrayList);
                it = abstractC29172p6.mo69761l().f59118b.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = obj2;
                    }
                    document = (Document) next;
                    if (document != null) {
                        EmptyMap = obj2;
                    } else {
                        EmptyMap = obj2;
                    }
                    if (EmptyMap == 0) {
                        EmptyMap = map2;
                        EmptyMap = MapsKt.emptyMap();
                    }
                    EmptyMap = map2;
                    linkedHashMap = new LinkedHashMap();
                    while (r3.hasNext()) {
                        if (((C29164n3) entry.getValue()).f59161c == ReviewAnswerType.Red) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList3 = new ArrayList(linkedHashMap.size());
                    while (r2.hasNext()) {
                        arrayList3.add(new C28807A(String.valueOf(((Number) entry2.getKey()).intValue()), ((C29164n3) entry2.getValue()).f59159a));
                    }
                    m71088a(AbstractC28806m.m69635a(arrayList, arrayList3));
                    C28936t c28936t9 = this.f65810l;
                    KProperty kProperty9 = f65798w[z14 ? 1 : 0];
                    c28936t9.f58834a.set(c28936t9.f58835b, Integer.valueOf(i11));
                    list3 = c29134i4.f59100b;
                    if (list3 != null) {
                        while (r2.hasNext()) {
                            if (Intrinsics.areEqual(((C29069W2) obj3).f59012a, str)) {
                                obj2 = obj3;
                                c29069w3 = (C29069W2) obj2;
                                if (c29069w3 == null) {
                                    c11 = 2;
                                    c29069w3 = new C29069W2(str, 2);
                                } else {
                                    c11 = 2;
                                }
                            }
                        }
                        c29069w3 = (C29069W2) obj2;
                        if (c29069w3 == null) {
                            c11 = 2;
                            c29069w3 = new C29069W2(str, 2);
                        } else {
                            c11 = 2;
                        }
                    } else {
                        c11 = 2;
                        c29069w3 = new C29069W2(str, 2);
                    }
                    C28936t c28936t10 = this.f65811m;
                    KProperty[] kPropertyArr3 = f65798w;
                    KProperty kProperty10 = kPropertyArr3[c11];
                    c28936t10.f58834a.set(c28936t10.f58835b, c29069w3);
                    SNSQuestionnaireViewModel$Step sNSQuestionnaireViewModel$Step3 = SNSQuestionnaireViewModel$Step.CHANGE_PAGE;
                    C28936t c28936t11 = this.f65808j;
                    KProperty kProperty11 = kPropertyArr3[i11];
                    c28936t11.f58834a.set(c28936t11.f58835b, sNSQuestionnaireViewModel$Step3);
                    return Unit.INSTANCE;
                } while (!Intrinsics.areEqual(((Document) next).getType().f59014a, this.f65807i));
                document = (Document) next;
                if (document != null) {
                    EmptyMap = obj2;
                } else {
                    EmptyMap = obj2;
                }
                if (EmptyMap == 0) {
                    EmptyMap = map2;
                    EmptyMap = MapsKt.emptyMap();
                }
                EmptyMap = map2;
                linkedHashMap = new LinkedHashMap();
                while (r3.hasNext()) {
                    if (((C29164n3) entry.getValue()).f59161c == ReviewAnswerType.Red) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                arrayList3 = new ArrayList(linkedHashMap.size());
                while (r2.hasNext()) {
                    arrayList3.add(new C28807A(String.valueOf(((Number) entry2.getKey()).intValue()), ((C29164n3) entry2.getValue()).f59159a));
                }
                m71088a(AbstractC28806m.m69635a(arrayList, arrayList3));
                C28936t c28936t12 = this.f65810l;
                KProperty kProperty12 = f65798w[z14 ? 1 : 0];
                c28936t12.f58834a.set(c28936t12.f58835b, Integer.valueOf(i11));
                list3 = c29134i4.f59100b;
                if (list3 != null) {
                    while (r2.hasNext()) {
                        if (Intrinsics.areEqual(((C29069W2) obj3).f59012a, str)) {
                            obj2 = obj3;
                            c29069w3 = (C29069W2) obj2;
                            if (c29069w3 == null) {
                                c11 = 2;
                                c29069w3 = new C29069W2(str, 2);
                            } else {
                                c11 = 2;
                            }
                        }
                    }
                    c29069w3 = (C29069W2) obj2;
                    if (c29069w3 == null) {
                        c11 = 2;
                        c29069w3 = new C29069W2(str, 2);
                    } else {
                        c11 = 2;
                    }
                } else {
                    c11 = 2;
                    c29069w3 = new C29069W2(str, 2);
                }
                C28936t c28936t13 = this.f65811m;
                KProperty[] kPropertyArr4 = f65798w;
                KProperty kProperty13 = kPropertyArr4[c11];
                c28936t13.f58834a.set(c28936t13.f58835b, c29069w3);
                SNSQuestionnaireViewModel$Step sNSQuestionnaireViewModel$Step4 = SNSQuestionnaireViewModel$Step.CHANGE_PAGE;
                C28936t c28936t14 = this.f65808j;
                KProperty kProperty14 = kPropertyArr4[i11];
                c28936t14.f58834a.set(c28936t14.f58835b, sNSQuestionnaireViewModel$Step4);
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69619a(AbstractC28841e0 abstractC28841e0, List list) {
        C29110e3 c29110e3;
        C29069W2 c29069w2M69741a = C29069W2.m69741a(m71090f(), null, 3);
        String strMo69643d = abstractC28841e0.mo69643d();
        String str = abstractC28841e0.mo69642c().f59466a;
        if (strMo69643d != null && c29069w2M69741a.f59013b.get(strMo69643d) == null) {
            c29069w2M69741a.f59013b.put(strMo69643d, new C29110e3());
        }
        if (strMo69643d != null && str != null && (c29110e3 = (C29110e3) c29069w2M69741a.f59013b.get(strMo69643d)) != null) {
            if (list != null && !list.isEmpty()) {
                c29110e3.f59060a.put(str, new C29086a3((String) null, list, 1));
            } else {
                c29110e3.f59060a.remove(str);
            }
        }
        C28936t c28936t = this.f65811m;
        KProperty kProperty = f65798w[2];
        c28936t.f58834a.set(c28936t.f58835b, c29069w2M69741a);
    }

    /* JADX INFO: renamed from: a */
    public final void m71087a(C29054T c29054t) {
        Object obj;
        String str;
        C29470F c29470fMo69642c;
        C30316a c30316a = this.f65799a;
        C28936t c28936t = this.f65813o;
        KProperty[] kPropertyArr = f65798w;
        KProperty kProperty = kPropertyArr[4];
        C30316a.m70183b(c30316a, "SNSQuestionnaireViewModel", "Got result from camera: " + ((FieldId) c28936t.m69705a()) + ", result: " + c29054t);
        C28936t c28936t2 = this.f65813o;
        KProperty kProperty2 = kPropertyArr[4];
        FieldId fieldId = (FieldId) c28936t2.m69705a();
        if (fieldId == null) {
            return;
        }
        C28936t c28936t3 = this.f65813o;
        KProperty kProperty3 = kPropertyArr[4];
        c28936t3.f58834a.set(c28936t3.f58835b, null);
        List list = m71091g().f58567b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((C28801h) it.next()).f58573d);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            AbstractC28841e0 abstractC28841e0 = (AbstractC28841e0) obj;
            if (Intrinsics.areEqual(abstractC28841e0.mo69643d(), fieldId.getSectionId())) {
                String strM69333a = abstractC28841e0.mo69642c().f59466a;
                if (strM69333a == null) {
                    strM69333a = AbstractC28458h.m69333a(abstractC28841e0);
                }
                if (Intrinsics.areEqual(strM69333a, fieldId.getItemId())) {
                    break;
                }
            }
        }
        AbstractC28841e0 abstractC28841e1 = (AbstractC28841e0) obj;
        if (abstractC28841e1 == null || (c29470fMo69642c = abstractC28841e1.mo69642c()) == null) {
            str = null;
        } else {
            str = c29470fMo69642c.f59475j != null ? "ARBITRARY_DOC" : "FILE_ATTACHMENT";
        }
        if (str == null) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32299H(this, fieldId, new Document(new C29070X(this.f65807i), null), CollectionsKt.listOf(C29054T.m69738a(c29054t, null, str, null, 1015)), null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71086a(boolean z11, ContinuationImpl continuationImpl) {
        C32296E c32296e;
        if (continuationImpl instanceof C32296E) {
            c32296e = (C32296E) continuationImpl;
            int i11 = c32296e.f65787d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32296e.f65787d = i11 - Integer.MIN_VALUE;
            } else {
                c32296e = new C32296E(this, continuationImpl);
            }
        } else {
            c32296e = new C32296E(this, continuationImpl);
        }
        Object objM91049g = c32296e.f65785b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32296e.f65787d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            C29069W2 c29069w2M71090f = m71090f();
            C30316a.m70183b(this.f65799a, "SNSQuestionnaireViewModel", "Submitting questionnaire " + c29069w2M71090f);
            if (c29069w2M71090f.f59012a == null) {
                C30316a.m70182a(this.f65799a, "SNSQuestionnaireViewModel", "Nothing to send, questionnaire id == null.\n" + m71090f());
                return Boxing.boxBoolean(false);
            }
            AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
            C32297F c32297f = new C32297F(this, c29069w2M71090f, null);
            c32296e.f65784a = z11;
            c32296e.f65787d = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M91392b, c32297f, c32296e);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = c32296e.f65784a;
            ResultKt.throwOnFailure(objM91049g);
        }
        Object value = ((Result) objM91049g).getValue();
        if (((Unit) (Result.m103850isFailureimpl(value) ? null : value)) == null) {
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(value);
            if (thM103847exceptionOrNullimpl == null) {
                thM103847exceptionOrNullimpl = new Error("Failed to submit questionnaire");
            }
            Throwable th2 = thM103847exceptionOrNullimpl;
            this.f65799a.getClass();
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67816e.f67810a.mo68956e("SNSQuestionnaireViewModel", message, th2);
            if (z11) {
                AbstractC28052C.throwError$default(this, th2, this.f65807i, null, 4, null);
            }
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(true);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69618a(AbstractC28841e0 abstractC28841e0, String str) {
        FieldId fieldIdM69656a = AbstractC28843f0.m69656a(abstractC28841e0);
        m71088a(AbstractC28806m.m69637a(m71091g().f58567b, fieldIdM69656a, str, FormItem$ItemState.LOADING));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32324t(this, str, fieldIdM69656a, abstractC28841e0, null), 3, null);
    }
}
