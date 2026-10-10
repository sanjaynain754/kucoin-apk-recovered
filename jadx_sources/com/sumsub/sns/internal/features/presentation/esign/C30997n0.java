package com.sumsub.sns.internal.features.presentation.esign;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.presentation.form.model.AbstractC28178b;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.C28803j;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28845g0;
import com.sumsub.sns.internal.core.presentation.form.model.C28819M;
import com.sumsub.sns.internal.core.presentation.form.model.C28823Q;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.model.esign.C29729A;
import com.sumsub.sns.internal.features.data.model.esign.C29732D;
import com.sumsub.sns.internal.features.data.model.esign.C29733E;
import com.sumsub.sns.internal.features.data.model.esign.C29745Q;
import com.sumsub.sns.internal.features.data.model.esign.C29748U;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.model.esign.C29757c;
import com.sumsub.sns.internal.features.data.model.esign.C29763f;
import com.sumsub.sns.internal.features.data.model.esign.C29769i;
import com.sumsub.sns.internal.features.data.model.esign.C29775l;
import com.sumsub.sns.internal.features.data.model.esign.C29779o;
import com.sumsub.sns.internal.features.data.model.esign.C29783s;
import com.sumsub.sns.internal.features.data.model.esign.C29787w;
import com.sumsub.sns.internal.features.data.model.esign.ESignSubmissionResponse$Status;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.appdata.C30095b;
import com.sumsub.sns.internal.features.domain.esign.C30165b;
import com.sumsub.sns.internal.features.domain.esign.C30168e;
import com.sumsub.sns.internal.features.domain.esign.C30170g;
import com.sumsub.sns.internal.features.domain.esign.C30172i;
import com.sumsub.sns.internal.features.domain.esign.C30174k;
import com.sumsub.sns.internal.features.presentation.result.C32363c;
import com.sumsub.sns.internal.features.presentation.result.SNSFinishResultType;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32651f;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32657i;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30997n0 extends AbstractC28073M0 implements InterfaceC28804k {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ KProperty[] f62640t = {AbstractC28639a.m69485a(C30997n0.class, "fieldValueCache", "getFieldValueCache()Ljava/util/Map;", 0), AbstractC28639a.m69485a(C30997n0.class, "initialFieldValueCache", "getInitialFieldValueCache()Ljava/util/Map;", 0), AbstractC28639a.m69485a(C30997n0.class, "eOtpSentAtMs", "getEOtpSentAtMs()J", 0), AbstractC28639a.m69485a(C30997n0.class, "agreementsAccepted", "getAgreementsAccepted()Z", 0), AbstractC28639a.m69485a(C30997n0.class, "acceptedAgreementIds", "getAcceptedAgreementIds()Ljava/util/Set;", 0), AbstractC28639a.m69485a(C30997n0.class, "isLastAgreementItemVisible", "isLastAgreementItemVisible()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final Bundle f62641a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29921d f62642b;

    /* JADX INFO: renamed from: c */
    public final File f62643c;

    /* JADX INFO: renamed from: d */
    public final C30170g f62644d;

    /* JADX INFO: renamed from: e */
    public final C30172i f62645e;

    /* JADX INFO: renamed from: f */
    public final C30174k f62646f;

    /* JADX INFO: renamed from: g */
    public final C30168e f62647g;

    /* JADX INFO: renamed from: h */
    public final C30165b f62648h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41669n f62649i;

    /* JADX INFO: renamed from: j */
    public final C30968X f62650j;

    /* JADX INFO: renamed from: k */
    public final C28936t f62651k;

    /* JADX INFO: renamed from: l */
    public final C28936t f62652l;

    /* JADX INFO: renamed from: m */
    public C29752Y f62653m;

    /* JADX INFO: renamed from: n */
    public final C28936t f62654n;

    /* JADX INFO: renamed from: o */
    public final C28936t f62655o;

    /* JADX INFO: renamed from: p */
    public final C28936t f62656p;

    /* JADX INFO: renamed from: q */
    public final LinkedHashMap f62657q;

    /* JADX INFO: renamed from: r */
    public final C28936t f62658r;

    /* JADX INFO: renamed from: s */
    public InterfaceC41775x1 f62659s;

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69618a(AbstractC28841e0 abstractC28841e0, String str) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final InterfaceC28805l mo69622b() {
        return this.f62650j;
    }

    /* JADX INFO: renamed from: d */
    public final Object m70555d(C29752Y c29752y, ContinuationImpl continuationImpl) {
        Object objM70553b;
        C29757c c29757c;
        C29769i c29769i;
        C29745Q c29745q;
        C29779o c29779o = null;
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "initStatus: " + c29752y.f59826b, null);
        this.f62653m = c29752y;
        ESignSubmissionResponse$Status eSignSubmissionResponse$Status = c29752y.f59826b;
        int i11 = eSignSubmissionResponse$Status == null ? -1 : AbstractC31015y.f62683a[eSignSubmissionResponse$Status.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                AbstractC28052C.finish$default(this, new C28494t(true), null, null, new C32363c(SNSFinishResultType.SUBMITTED, Screen.ESignFinishScreen, "esign", null), 6, null);
            } else if (i11 != 3) {
                AbstractC28073M0.updateState$default(this, false, new C30963S(null), 1, null);
                AbstractC28052C.throwError$default(this, new C29107e0(new SNSGeneralException("Unknown submission status", null, null, 6, null), null, null, 6), getIdDocSetType(), false, null, 12, null);
            } else {
                AbstractC28052C.finish$default(this, null, null, null, null, 15, null);
            }
            return Unit.INSTANCE;
        }
        C29757c c29757c2 = c29752y.f59829e;
        if (c29757c2 != null && (c29745q = c29757c2.f59833c) != null) {
            c29779o = c29745q.f59815a;
        }
        if (c29779o != null) {
            objM70553b = m70552b(c29757c2.f59833c.f59815a, continuationImpl);
            if (objM70553b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM70553b = Unit.INSTANCE;
            }
        } else {
            C28936t c28936t = this.f62655o;
            KProperty kProperty = f62640t[3];
            if (((Boolean) c28936t.m69705a()).booleanValue() || !((c29757c = c29752y.f59829e) == null || (c29769i = c29757c.f59831a) == null || !c29769i.f59843a)) {
                objM70553b = m70553b(continuationImpl);
                if (objM70553b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70553b = Unit.INSTANCE;
                }
            } else {
                objM70553b = m70554c(c29752y, continuationImpl);
                if (objM70553b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70553b = Unit.INSTANCE;
                }
            }
        }
        return objM70553b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70553b : Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69620a(C28850j c28850j) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final void mo69623b(AbstractC28841e0 abstractC28841e0, String str) {
        String str2 = abstractC28841e0.mo69642c().f59466a;
        if (str2 != null) {
            Map mapM69338a = AbstractC28458h.m69338a(m70557f(), str2, str);
            C28936t c28936t = this.f62651k;
            KProperty kProperty = f62640t[0];
            c28936t.f58834a.set(c28936t.f58835b, mapM69338a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m70554c(C29752Y c29752y, ContinuationImpl continuationImpl) {
        C30951F c30951f;
        InterfaceC41669n interfaceC41669n;
        C29769i c29769i;
        List list;
        if (continuationImpl instanceof C30951F) {
            c30951f = (C30951F) continuationImpl;
            int i11 = c30951f.f62536d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30951f.f62536d = i11 - Integer.MIN_VALUE;
            } else {
                c30951f = new C30951F(this, continuationImpl);
            }
        } else {
            c30951f = new C30951F(this, continuationImpl);
        }
        Object obj = c30951f.f62534b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30951f.f62536d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C29757c c29757c = c29752y.f59829e;
            if (c29757c != null && (c29769i = c29757c.f59831a) != null && (list = c29769i.f59844b) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = ((C29763f) it.next()).f59837b;
                }
            }
            AbstractC28073M0.updateState$default(this, false, new C30952G(this, null), 1, null);
            this.f62657q.clear();
            InterfaceC41669n interfaceC41669n2 = this.f62649i;
            c30951f.f62533a = interfaceC41669n2;
            c30951f.f62536d = 1;
            Object objM70541a = m70541a(c29752y, c30951f);
            if (objM70541a == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM70541a;
            interfaceC41669n = interfaceC41669n2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41669n = c30951f.f62533a;
            ResultKt.throwOnFailure(obj);
        }
        interfaceC41669n.setValue(new C28799f(0, CollectionsKt.listOf(obj), null, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final Map m70557f() {
        C28936t c28936t = this.f62651k;
        KProperty kProperty = f62640t[0];
        return (Map) c28936t.m69705a();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C31014x(C31006s.f62667b, null, false, null, false);
    }

    public final String getIdDocSetType() {
        C29070X type;
        String str;
        Bundle bundle = this.f62641a;
        Document document = bundle != null ? (Document) AbstractC28437b.m69320a(bundle, "ARG_DOCUMENT", Document.class, null) : null;
        return (document == null || (type = document.getType()) == null || (str = type.f59014a) == null) ? "TYPE_UNKNOWN" : str;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onLoad() {
        AbstractC28073M0.updateState$default(this, false, new C30983g0(null), 1, null);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30985h0(this, null), 3, null);
    }

    public C30997n0(Bundle bundle, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, InterfaceC29921d interfaceC29921d, File file, C30170g c30170g, C30172i c30172i, C30174k c30174k, C30168e c30168e, C30165b c30165b) {
        super(interfaceC29953a, interfaceC29984m);
        this.f62641a = bundle;
        this.f62642b = interfaceC29921d;
        this.f62643c = file;
        this.f62644d = c30170g;
        this.f62645e = c30172i;
        this.f62646f = c30174k;
        this.f62647g = c30168e;
        this.f62648h = c30165b;
        this.f62649i = C41679x.m91009a(new C28799f(0, CollectionsKt.emptyList(), null, new C28803j()));
        this.f62650j = new C30968X(this);
        this.f62651k = new C28936t(savedStateHandle, "KEY_FIELD_CACHE", MapsKt.emptyMap(), false);
        this.f62652l = new C28936t(savedStateHandle, "KEY_INITIAL_FIELD_CACHE", MapsKt.emptyMap(), false);
        this.f62654n = new C28936t(savedStateHandle, "eOtpSentAtMs", 0L, false);
        Boolean bool = Boolean.FALSE;
        this.f62655o = new C28936t(savedStateHandle, "agreementsAccepted", bool, false);
        this.f62656p = new C28936t(savedStateHandle, "acceptedAgreementIds", new LinkedHashSet(), false);
        this.f62657q = new LinkedHashMap();
        this.f62658r = new C28936t(savedStateHandle, "isLastAgreementItemVisible", bool, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m70539a(ArrayList arrayList, C29752Y c29752y) {
        C29769i c29769i;
        List list;
        String str;
        String strReplace$default;
        C29757c c29757c = c29752y.f59829e;
        if (c29757c == null || (c29769i = c29757c.f59831a) == null || (list = c29769i.f59844b) == null) {
            return;
        }
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C29763f c29763f = (C29763f) obj;
            arrayList.add(new C28823Q(new C29470F(c29763f.f59836a, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1022), "agreement_" + i11));
            if (c29763f.f59837b != null) {
                String str2 = c29763f.f59837b;
                if (str2 == null || (strReplace$default = StringsKt.replace$default(str2, "<br>", "", false, 4, (Object) null)) == null) {
                    strReplace$default = "";
                }
                arrayList.add(new C28831Z(new C29470F((String) null, (String) null, strReplace$default, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1018), "text_agreement_" + i11, (String) null, false, (CharSequence) null, (List) null, (String) null, 184));
            }
            List list2 = c29763f.f59839d;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    C29775l c29775l = (C29775l) obj2;
                    String str3 = c29775l.f59847b;
                    if (str3 != null && str3.length() != 0 && (str = c29775l.f59846a) != null && str.length() != 0) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    String str4 = "links_agreement_" + i11;
                    arrayList.add(new C28823Q(new C29470F((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1022), str4));
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        C29775l c29775l2 = (C29775l) obj3;
                        arrayList.add(new C28831Z(new C29470F((String) null, (String) null, "- [" + c29775l2.f59847b + "](" + c29775l2.f59846a + ")", (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1018), str4, (String) null, false, (CharSequence) null, (List) null, (String) null, 184));
                    }
                }
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Screen m70556e() {
        AbstractC31000p abstractC31000p = ((C31014x) currentState()).f62678a;
        if (abstractC31000p instanceof C31010u) {
            return Screen.ESignOtpConfirmationScreen;
        }
        if (abstractC31000p instanceof C30998o) {
            return Screen.ESignDocumentsScreen;
        }
        return Screen.ESignAgreementScreen;
    }

    /* JADX INFO: renamed from: g */
    public final void m70558g() {
        int iIntValue;
        C29757c c29757c;
        C29783s c29783s;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C28936t c28936t = this.f62654n;
        KProperty kProperty = f62640t[2];
        long jCoerceAtLeast = RangesKt.coerceAtLeast(jCurrentTimeMillis - ((Number) c28936t.m69705a()).longValue(), 0L);
        C29752Y c29752y = this.f62653m;
        if (c29752y != null && (c29757c = c29752y.f59829e) != null && (c29783s = c29757c.f59832b) != null && (num = c29783s.f59854c) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        AbstractC28073M0.updateState$default(this, false, new C30964T((int) RangesKt.coerceAtLeast(((long) iIntValue) - TimeUnit.MILLISECONDS.toSeconds(jCoerceAtLeast), 0L), this, null), 1, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m70559h() {
        AbstractC31000p abstractC31000p = ((C31014x) currentState()).f62678a;
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "onButtonClick: " + abstractC31000p, null);
        if (abstractC31000p instanceof C30994m) {
            m70550a(((C30994m) abstractC31000p).f62633b);
            return;
        }
        if (abstractC31000p instanceof C30986i) {
            C28936t c28936t = this.f62655o;
            KProperty kProperty = f62640t[3];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            AbstractC28073M0.updateState$default(this, false, new C30953H(null), 1, null);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30954I(this, null), 3, null);
            return;
        }
        if (abstractC31000p instanceof C30998o) {
            m70558g();
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        InterfaceC41775x1 interfaceC41775x1 = this.f62659s;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f62659s = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onErrorCancelled(AbstractC29149l0 abstractC29149l0) {
        if (Intrinsics.areEqual(abstractC29149l0.mo69766d(), C31004r.f62665a)) {
            C33272c.f67816e.f67810a.mo68956e("SNSESignViewModel", "onErrorCancelled: error", abstractC29149l0.mo69765c());
            AbstractC28052C.finish$default(this, null, null, null, null, 15, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        Parcelable parcelableMo69766d = abstractC29149l0.mo69766d();
        if (Intrinsics.areEqual(parcelableMo69766d, C31013w.f62677a)) {
            C28936t c28936t = this.f62655o;
            KProperty kProperty = f62640t[3];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            AbstractC28073M0.updateState$default(this, false, new C30953H(null), 1, null);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30954I(this, null), 3, null);
            return;
        }
        if (parcelableMo69766d instanceof C30992l) {
            String str = ((C30992l) parcelableMo69766d).f62629a;
            C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "onCheckCode", null);
            AbstractC28073M0.updateState$default(this, false, new C30974b0(null), 1, null);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30976c0(this, str, null), 3, null);
            return;
        }
        if ((parcelableMo69766d instanceof C31004r) && !(abstractC29149l0 instanceof C29131i0)) {
            AbstractC28052C.finish$default(this, null, null, null, null, 15, null);
        } else {
            super.onHandleError(abstractC29149l0);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        onLoad();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70553b(ContinuationImpl continuationImpl) {
        C30959N c30959n;
        InterfaceC41669n interfaceC41669n;
        if (continuationImpl instanceof C30959N) {
            c30959n = (C30959N) continuationImpl;
            int i11 = c30959n.f62561d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30959n.f62561d = i11 - Integer.MIN_VALUE;
            } else {
                c30959n = new C30959N(this, continuationImpl);
            }
        } else {
            c30959n = new C30959N(this, continuationImpl);
        }
        Object objM70551b = c30959n.f62559b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30959n.f62561d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70551b);
            C29752Y c29752y = this.f62653m;
            if (c29752y == null) {
                return Unit.INSTANCE;
            }
            AbstractC28073M0.updateState$default(this, false, new C30993l0(this, null), 1, null);
            InterfaceC41669n interfaceC41669n2 = this.f62649i;
            c30959n.f62558a = interfaceC41669n2;
            c30959n.f62561d = 1;
            objM70551b = m70551b(c29752y, c30959n);
            if (objM70551b == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41669n = interfaceC41669n2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41669n = c30959n.f62558a;
            ResultKt.throwOnFailure(objM70551b);
        }
        interfaceC41669n.setValue(new C28799f(0, CollectionsKt.listOf(objM70551b), null, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70552b(C29779o c29779o, ContinuationImpl continuationImpl) {
        C30957L c30957l;
        InterfaceC41669n interfaceC41669n;
        if (continuationImpl instanceof C30957L) {
            c30957l = (C30957L) continuationImpl;
            int i11 = c30957l.f62553d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30957l.f62553d = i11 - Integer.MIN_VALUE;
            } else {
                c30957l = new C30957L(this, continuationImpl);
            }
        } else {
            c30957l = new C30957L(this, continuationImpl);
        }
        Object obj = c30957l.f62551b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30957l.f62553d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC28073M0.updateState$default(this, false, new C30958M(c29779o, this, null), 1, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<C29719y> list = c29779o.f59850a;
            if (list != null) {
                for (C29719y c29719y : list) {
                    String str = c29719y.f59787h;
                    if (str != null) {
                        AbstractC29103d2 abstractC29103d2 = c29719y.f59781b;
                        String strMo69715b = abstractC29103d2 != null ? abstractC29103d2.mo69715b() : null;
                        if (strMo69715b != null) {
                            linkedHashMap.put(strMo69715b, str);
                        }
                    }
                }
            }
            C28936t c28936t = this.f62651k;
            KProperty[] kPropertyArr = f62640t;
            KProperty kProperty = kPropertyArr[0];
            c28936t.f58834a.set(c28936t.f58835b, linkedHashMap);
            C28936t c28936t2 = this.f62652l;
            KProperty kProperty2 = kPropertyArr[1];
            c28936t2.f58834a.set(c28936t2.f58835b, linkedHashMap);
            InterfaceC41669n interfaceC41669n2 = this.f62649i;
            c30957l.f62550a = interfaceC41669n2;
            c30957l.f62553d = 1;
            Object objM70542a = m70542a(c29779o, c30957l);
            if (objM70542a == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM70542a;
            interfaceC41669n = interfaceC41669n2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41669n = c30957l.f62550a;
            ResultKt.throwOnFailure(obj);
        }
        interfaceC41669n.setValue(new C28799f(0, CollectionsKt.listOf(obj), null, null));
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w mo69624d() {
        return this.f62649i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70551b(C29752Y c29752y, ContinuationImpl continuationImpl) {
        C30947B c30947b;
        List list;
        List list2;
        int i11;
        String str;
        Object string;
        String str2;
        List list3;
        if (continuationImpl instanceof C30947B) {
            c30947b = (C30947B) continuationImpl;
            int i12 = c30947b.f62517f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30947b.f62517f = i12 - Integer.MIN_VALUE;
            } else {
                c30947b = new C30947B(this, continuationImpl);
            }
        } else {
            c30947b = new C30947B(this, continuationImpl);
        }
        Object obj = c30947b.f62515d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30947b.f62517f;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            c30947b.f62512a = arrayList;
            c30947b.f62517f = 1;
            if (m70544a(arrayList, c29752y, c30947b) != coroutine_suspended) {
                list = arrayList;
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            list = c30947b.f62512a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i13 == 2) {
                i11 = c30947b.f62514c;
                list2 = c30947b.f62512a;
                ResultKt.throwOnFailure(obj);
                str = (String) obj;
                c30947b.f62512a = list2;
                c30947b.f62513b = str;
                c30947b.f62514c = i11;
                c30947b.f62517f = 3;
                string = getString("sns_esign_documents_subtitle", c30947b);
                if (string != coroutine_suspended) {
                    str2 = str;
                    obj = string;
                    list3 = list2;
                }
                return coroutine_suspended;
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = c30947b.f62514c;
            str2 = c30947b.f62513b;
            list3 = c30947b.f62512a;
            ResultKt.throwOnFailure(obj);
        }
        return new C28801h(i11, str2, (String) obj, list3);
        c30947b.f62512a = list;
        c30947b.f62514c = 0;
        c30947b.f62517f = 2;
        Object string2 = getString("sns_esign_documents_title", c30947b);
        if (string2 != coroutine_suspended) {
            list2 = list;
            i11 = 0;
            obj = string2;
            str = (String) obj;
            c30947b.f62512a = list2;
            c30947b.f62513b = str;
            c30947b.f62514c = i11;
            c30947b.f62517f = 3;
            string = getString("sns_esign_documents_subtitle", c30947b);
            if (string != coroutine_suspended) {
                str2 = str;
                obj = string;
                list3 = list2;
                return new C28801h(i11, str2, (String) obj, list3);
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final void m70549a(C29752Y c29752y) {
        C29783s c29783s;
        C29757c c29757c = c29752y.f59829e;
        boolean zAreEqual = (c29757c == null || (c29783s = c29757c.f59832b) == null) ? false : Intrinsics.areEqual(c29783s.f59855d, Boolean.TRUE);
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "confirmOtp: confirmed=" + zAreEqual, null);
        this.f62653m = c29752y;
        if (zAreEqual) {
            AbstractC28052C.finish$default(this, new C28494t(true), null, null, new C32363c(SNSFinishResultType.SUBMITTED, Screen.ESignFinishScreen, "esign", null), 6, null);
        } else {
            AbstractC28073M0.updateState$default(this, false, new C30956K(this, null), 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m70550a(List list) {
        Object next;
        AbstractC29103d2 abstractC29103d2;
        final C28801h c28801h = (C28801h) CollectionsKt.firstOrNull(((C28799f) this.f62649i.getValue()).f58567b);
        if (c28801h == null) {
            return;
        }
        List<AbstractC28841e0> list2 = c28801h.f58573d;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        boolean z11 = false;
        for (AbstractC28841e0 abstractC28841e0M69657a : list2) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    abstractC29103d2 = ((C29719y) next).f59781b;
                }
            } while (!Intrinsics.areEqual(abstractC29103d2 != null ? abstractC29103d2.mo69715b() : null, abstractC28841e0M69657a.mo69642c().f59466a));
            C29719y c29719y = (C29719y) next;
            if (c29719y != null) {
                Map mapM70557f = m70557f();
                AbstractC29103d2 abstractC29103d3 = c29719y.f59781b;
                String str = (String) mapM70557f.get(abstractC29103d3 != null ? abstractC29103d3.mo69715b() : null);
                if (str == null) {
                    str = "";
                }
                String strM71280a = AbstractC32657i.m71280a(c29719y, str, getStrings(), null);
                if (strM71280a != null && strM71280a.length() != 0) {
                    z11 = true;
                }
                abstractC28841e0M69657a = AbstractC28845g0.m69657a(abstractC28841e0M69657a, strM71280a);
            }
            arrayList.add(abstractC28841e0M69657a);
        }
        if (z11) {
            InterfaceC41669n interfaceC41669n = this.f62649i;
            interfaceC41669n.setValue(new Function1() { // from class: com.sumsub.sns.internal.features.presentation.esign.t0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30997n0.m70537a(c28801h, arrayList, (C28799f) obj);
                }
            }.invoke(interfaceC41669n.getValue()));
        } else {
            AbstractC28073M0.updateState$default(this, false, new C30965U(null), 1, null);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30966V(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m70540a(C30997n0 c30997n0) {
        boolean z11;
        List list;
        List list2;
        Object next;
        List list3;
        C29752Y c29752y = c30997n0.f62653m;
        boolean z12 = (c29752y == null || (list3 = c29752y.f59828d) == null || !list3.isEmpty()) ? false : true;
        C29752Y c29752y2 = c30997n0.f62653m;
        if (c29752y2 == null || (list = c29752y2.f59828d) == null) {
            z11 = false;
        } else {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C29748U c29748u = (C29748U) it.next();
                        List list4 = c29748u.f59822e;
                        if (list4 != null) {
                            if (!list4.isEmpty()) {
                                Iterator it2 = list4.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C29763f c29763f = (C29763f) it2.next();
                                        LinkedHashMap linkedHashMap = c30997n0.f62657q;
                                        String str = c29748u.f59818a;
                                        if (str == null) {
                                            str = "";
                                        }
                                        C29729A c29729a = (C29729A) linkedHashMap.get(str);
                                        if (c29729a != null && (list2 = c29729a.f59799b) != null) {
                                            Iterator it3 = list2.iterator();
                                            do {
                                                if (!it3.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it3.next();
                                            } while (!Intrinsics.areEqual(((C29787w) next).f59858a, c29763f.f59836a));
                                            C29787w c29787w = (C29787w) next;
                                            if (c29787w == null || !c29787w.f59859b) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        z11 = false;
                    }
                }
            }
            z11 = true;
        }
        return z12 || z11;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69616a() {
        C28936t c28936t = this.f62658r;
        KProperty kProperty = f62640t[5];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
        AbstractC28073M0.updateState$default(this, false, new C30982f0(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (m70555d((com.sumsub.sns.internal.features.data.model.esign.C29752Y) r14, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70545a(ContinuationImpl continuationImpl) {
        C30950E c30950e;
        Object objM70128a;
        Object obj;
        Throwable thM103847exceptionOrNullimpl;
        if (continuationImpl instanceof C30950E) {
            c30950e = (C30950E) continuationImpl;
            int i11 = c30950e.f62532e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30950e.f62532e = i11 - Integer.MIN_VALUE;
            } else {
                c30950e = new C30950E(this, continuationImpl);
            }
        } else {
            c30950e = new C30950E(this, continuationImpl);
        }
        Object obj2 = c30950e.f62530c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30950e.f62532e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "loading ...", null);
            C30170g c30170g = this.f62644d;
            InterfaceC29921d interfaceC29921d = this.f62642b;
            c30950e.f62532e = 1;
            objM70128a = c30170g.m70128a(interfaceC29921d, c30950e);
            if (objM70128a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj2);
            objM70128a = ((Result) obj2).getValue();
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c30950e.f62528a;
            ResultKt.throwOnFailure(obj2);
        }
        if (Result.m103847exceptionOrNullimpl(obj) != null) {
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
            AbstractC28073M0.updateState$default(this, false, new C30962Q(null), 1, null);
            if (thM103847exceptionOrNullimpl == null) {
                thM103847exceptionOrNullimpl = new SNSGeneralException("Init failure", null, null, 6, null);
            }
            throwError(thM103847exceptionOrNullimpl, getIdDocSetType(), C31004r.f62665a);
        }
        return Unit.INSTANCE;
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "init esign: ok=" + Result.m103851isSuccessimpl(objM70128a), null);
        if (Result.m103851isSuccessimpl(objM70128a)) {
            c30950e.f62528a = objM70128a;
            c30950e.f62529b = objM70128a;
            c30950e.f62532e = 2;
        }
        obj = objM70128a;
        if (Result.m103847exceptionOrNullimpl(obj) != null) {
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
            AbstractC28073M0.updateState$default(this, false, new C30962Q(null), 1, null);
            if (thM103847exceptionOrNullimpl == null) {
                thM103847exceptionOrNullimpl = new SNSGeneralException("Init failure", null, null, 6, null);
            }
            throwError(thM103847exceptionOrNullimpl, getIdDocSetType(), C31004r.f62665a);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69619a(AbstractC28841e0 abstractC28841e0, List list) {
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "onFieldValuesChanged: state=" + ((C31014x) currentState()).f62678a + ", " + AbstractC28178b.m69118a(abstractC28841e0) + " -> " + list, null);
        if (((C31014x) currentState()).f62678a instanceof C30994m) {
            return;
        }
        String str = abstractC28841e0.mo69642c().f59466a;
        String strReplace$default = str != null ? StringsKt.replace$default(str, "sns_doc_", "", false, 4, (Object) null) : null;
        if (strReplace$default == null) {
            strReplace$default = "";
        }
        C29729A c29729a = (C29729A) this.f62657q.get(strReplace$default);
        if (c29729a == null) {
            return;
        }
        List list2 = c29729a.f59799b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                break;
            }
            C29787w c29787w = (C29787w) it.next();
            if (list != null) {
                if (list.contains("sns_agr_" + c29787w.f59858a)) {
                    z11 = true;
                }
            }
            arrayList.add(new C29787w(c29787w.f59858a, z11));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((C29787w) obj).f59859b) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list3 = (List) pair.component1();
        List list4 = (List) pair.component2();
        C28936t c28936t = this.f62656p;
        KProperty kProperty = f62640t[4];
        Set mutableSet = CollectionsKt.toMutableSet((Set) c28936t.m69705a());
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C29787w) it2.next()).f59858a);
        }
        mutableSet.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C29787w) it3.next()).f59858a);
        }
        mutableSet.removeAll(arrayList5);
        C28936t c28936t2 = this.f62656p;
        KProperty kProperty2 = f62640t[4];
        c28936t2.f58834a.set(c28936t2.f58835b, mutableSet);
        this.f62657q.put(strReplace$default, new C29729A(c29729a.f59798a, arrayList));
        AbstractC28073M0.updateState$default(this, false, new C30995m0(this, null), 1, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69617a(AbstractC28841e0 abstractC28841e0) {
        C29748U c29748u;
        Integer num;
        String str;
        List list;
        Object next;
        if ((((C31014x) currentState()).f62678a instanceof C30994m) || !(abstractC28841e0 instanceof C28819M)) {
            return;
        }
        String str2 = ((C28819M) abstractC28841e0).f58608d.f59466a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        if (StringsKt.startsWith$default(str3, "sns_doc_", false, 2, (Object) null)) {
            String strReplace$default = StringsKt.replace$default(str3, "sns_doc_", "", false, 4, (Object) null);
            if (strReplace$default.length() == 0) {
                return;
            }
            C29752Y c29752y = this.f62653m;
            if (c29752y == null || (list = c29752y.f59828d) == null) {
                c29748u = null;
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((C29748U) next).f59818a, strReplace$default));
                c29748u = (C29748U) next;
            }
            C28367f c28367f = new C28367f(m70556e(), getIdDocSetType(), MapsKt.emptyMap());
            Screen screenM70556e = m70556e();
            String idDocSetType = getIdDocSetType();
            Control control = Control.ListItem;
            if (c29748u != null && (str = c29748u.f59820c) != null) {
                strReplace$default = str;
            }
            C28367f.m69257a(c28367f, screenM70556e, idDocSetType, control, MapsKt.mapOf(TuplesKt.m90091to("docName", strReplace$default)), 16);
            if (c29748u == null || (num = c29748u.f59819b) == null) {
                return;
            }
            int iIntValue = num.intValue();
            InterfaceC41775x1 interfaceC41775x1 = this.f62659s;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            this.f62659s = null;
            AbstractC28073M0.updateState$default(this, false, new C30978d0(this, null), 1, null);
            this.f62659s = C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30980e0(iIntValue, this, null), 3, null);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final boolean mo69621a(String str) {
        Integer numValueOf;
        if (!StringsKt.startsWith$default(str, "esign_doc_section_", false, 2, (Object) null)) {
            return false;
        }
        try {
            numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.replace$default(str, "esign_doc_section_", "", false, 4, (Object) null)));
        } catch (NumberFormatException e11) {
            C33272c.f67814c.mo68959w("String.toIntSafe", "invalid number", e11);
            numValueOf = null;
        }
        if (numValueOf == null) {
            return false;
        }
        int iIntValue = numValueOf.intValue();
        InterfaceC41775x1 interfaceC41775x1 = this.f62659s;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f62659s = null;
        AbstractC28073M0.updateState$default(this, false, new C30978d0(this, null), 1, null);
        this.f62659s = C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30980e0(iIntValue, this, null), 3, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m70543a(String str, ContinuationImpl continuationImpl) {
        C30949D c30949d;
        Object objM70126a;
        String str2 = str;
        if (continuationImpl instanceof C30949D) {
            c30949d = (C30949D) continuationImpl;
            int i11 = c30949d.f62527d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30949d.f62527d = i11 - Integer.MIN_VALUE;
            } else {
                c30949d = new C30949D(this, continuationImpl);
            }
        } else {
            c30949d = new C30949D(this, continuationImpl);
        }
        Object obj = c30949d.f62525b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30949d.f62527d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "confirmOtp", null);
            C30165b c30165b = this.f62648h;
            InterfaceC29921d interfaceC29921d = this.f62642b;
            C29732D c29732d = new C29732D(str2);
            Collection<C29729A> collectionValues = this.f62657q.values();
            int i13 = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            for (C29729A c29729a : collectionValues) {
                String str3 = c29729a.f59798a;
                List<C29787w> list = c29729a.f59799b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, i13));
                for (C29787w c29787w : list) {
                    arrayList2.add(new C29787w(c29787w.f59858a, c29787w.f59859b));
                }
                arrayList.add(new C29729A(str3, arrayList2));
                i13 = 10;
            }
            C29733E c29733e = new C29733E(c29732d, arrayList);
            c30949d.f62524a = str2;
            c30949d.f62527d = 1;
            objM70126a = c30165b.m70126a(interfaceC29921d, c29733e, c30949d);
            if (objM70126a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c30949d.f62524a;
            ResultKt.throwOnFailure(obj);
            objM70126a = ((Result) obj).getValue();
        }
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "confirmOtp: success=" + Result.m103851isSuccessimpl(objM70126a), null);
        if (Result.m103851isSuccessimpl(objM70126a)) {
            m70549a((C29752Y) objM70126a);
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70126a);
        if (thM103847exceptionOrNullimpl != null) {
            throwError(thM103847exceptionOrNullimpl, getIdDocSetType(), new C30992l(str2));
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30955J(this, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70548a(int i11, Throwable th2) {
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "handleFileDownloadFailed: " + i11, th2);
        AbstractC28073M0.updateState$default(this, false, new C30960O(this, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX INFO: renamed from: a */
    public final void m70547a(int i11, File file) {
        C30996n c30996n;
        String name;
        List list;
        Object obj = null;
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "handleFileDownloadSuccess: " + i11 + " to " + file, null);
        AbstractC31000p abstractC31000p = ((C31014x) currentState()).f62678a;
        if ((abstractC31000p instanceof C30998o) && (c30996n = ((C30998o) abstractC31000p).f62660b) != null && c30996n.f62638c) {
            AbstractC28073M0.updateState$default(this, false, new C30961P(null), 1, null);
            if (file == null) {
                return;
            }
            C29752Y c29752y = this.f62653m;
            if (c29752y != null && (list = c29752y.f59828d) != null) {
                for (Object obj2 : list) {
                    Integer num = ((C29748U) obj2).f59819b;
                    if (num != null && num.intValue() == i11) {
                        obj = obj2;
                        break;
                    }
                }
                C29748U c29748u = (C29748U) obj;
                if (c29748u == null || (name = c29748u.f59820c) == null) {
                    name = file.getName();
                }
            } else {
                name = file.getName();
            }
            fireEvent(new C31008t(file, name));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C28799f m70537a(C28801h c28801h, List list, C28799f c28799f) {
        return C28799f.m69615a(c28799f, 0, CollectionsKt.listOf(new C28801h(c28801h.f58570a, c28801h.f58571b, c28801h.f58572c, list)), null, null, 13);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (m70553b(r0) == r1) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70546a(boolean z11, ContinuationImpl continuationImpl) {
        C30991k0 c30991k0;
        Object objM70130a;
        Object obj;
        Throwable thM103847exceptionOrNullimpl;
        if (continuationImpl instanceof C30991k0) {
            c30991k0 = (C30991k0) continuationImpl;
            int i11 = c30991k0.f62628f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30991k0.f62628f = i11 - Integer.MIN_VALUE;
            } else {
                c30991k0 = new C30991k0(this, continuationImpl);
            }
        } else {
            c30991k0 = new C30991k0(this, continuationImpl);
        }
        Object obj2 = c30991k0.f62626d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30991k0.f62628f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            C30174k c30174k = this.f62646f;
            InterfaceC29921d interfaceC29921d = this.f62642b;
            c30991k0.f62623a = z11;
            c30991k0.f62628f = 1;
            objM70130a = c30174k.m70130a(interfaceC29921d, c30991k0);
            if (objM70130a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z11 = c30991k0.f62623a;
            ResultKt.throwOnFailure(obj2);
            objM70130a = ((Result) obj2).getValue();
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c30991k0.f62624b;
            ResultKt.throwOnFailure(obj2);
        }
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
        if (thM103847exceptionOrNullimpl != null) {
            AbstractC28073M0.updateState$default(this, false, new C30967W(null), 1, null);
            throwError(thM103847exceptionOrNullimpl, getIdDocSetType(), C31013w.f62677a);
        }
        return Unit.INSTANCE;
        Object obj3 = objM70130a;
        boolean z12 = z11;
        obj = obj3;
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "requestOtp: ok=" + Result.m103851isSuccessimpl(obj), null);
        if (Result.m103851isSuccessimpl(obj)) {
            this.f62653m = (C29752Y) obj;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C28936t c28936t = this.f62654n;
            KProperty kProperty = f62640t[2];
            c28936t.f58834a.set(c28936t.f58835b, Long.valueOf(jCurrentTimeMillis));
            if (z12) {
                m70558g();
            } else {
                c30991k0.f62624b = obj;
                c30991k0.f62625c = obj;
                c30991k0.f62628f = 2;
            }
        }
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj);
        if (thM103847exceptionOrNullimpl != null) {
            AbstractC28073M0.updateState$default(this, false, new C30967W(null), 1, null);
            throwError(thM103847exceptionOrNullimpl, getIdDocSetType(), C31013w.f62677a);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70541a(C29752Y c29752y, ContinuationImpl continuationImpl) {
        C30946A c30946a;
        int i11;
        List list;
        String str;
        List list2;
        if (continuationImpl instanceof C30946A) {
            c30946a = (C30946A) continuationImpl;
            int i12 = c30946a.f62511f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30946a.f62511f = i12 - Integer.MIN_VALUE;
            } else {
                c30946a = new C30946A(this, continuationImpl);
            }
        } else {
            c30946a = new C30946A(this, continuationImpl);
        }
        Object obj = c30946a.f62509d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30946a.f62511f;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            m70539a(arrayList, c29752y);
            c30946a.f62506a = arrayList;
            i11 = 0;
            c30946a.f62508c = 0;
            c30946a.f62511f = 1;
            Object string = getString("sns_esign_agreement_title", c30946a);
            if (string != coroutine_suspended) {
                list = arrayList;
                obj = string;
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            i11 = c30946a.f62508c;
            list = c30946a.f62506a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = c30946a.f62508c;
            str = c30946a.f62507b;
            list2 = c30946a.f62506a;
            ResultKt.throwOnFailure(obj);
        }
        return new C28801h(i11, str, (String) obj, list2);
        String str2 = (String) obj;
        c30946a.f62506a = list;
        c30946a.f62507b = str2;
        c30946a.f62508c = i11;
        c30946a.f62511f = 2;
        Object string2 = getString("sns_esign_agreement_subtitle", c30946a);
        if (string2 != coroutine_suspended) {
            str = str2;
            obj = string2;
            list2 = list;
            return new C28801h(i11, str, (String) obj, list2);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m70542a(C29779o c29779o, ContinuationImpl continuationImpl) {
        C30948C c30948c;
        int i11;
        List listEmptyList;
        List list;
        int i12;
        String str;
        List list2;
        if (continuationImpl instanceof C30948C) {
            c30948c = (C30948C) continuationImpl;
            int i13 = c30948c.f62523f;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c30948c.f62523f = i13 - Integer.MIN_VALUE;
            } else {
                c30948c = new C30948C(this, continuationImpl);
            }
        } else {
            c30948c = new C30948C(this, continuationImpl);
        }
        Object string = c30948c.f62521d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = c30948c.f62523f;
        if (i14 == 0) {
            ResultKt.throwOnFailure(string);
            C30095b c30095b = new C30095b(null, null, null, null, 63);
            List<C29719y> list3 = c29779o.f59850a;
            i11 = 0;
            if (list3 != null) {
                LinkedHashMap linkedHashMapM71274a = AbstractC32651f.m71274a(list3, m70557f(), (String) null, c30095b);
                C28936t c28936t = this.f62651k;
                KProperty kProperty = f62640t[0];
                c28936t.f58834a.set(c28936t.f58835b, linkedHashMapM71274a);
            }
            if (list3 != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                ArrayList arrayList2 = arrayList;
                for (C29719y c29719y : list3) {
                    C30095b c30095b2 = c30095b;
                    C29124h config = getConfig();
                    C29983l strings = getStrings();
                    Map mapM70557f = m70557f();
                    C28936t c28936t2 = this.f62652l;
                    KProperty kProperty2 = f62640t[1];
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(AbstractC32651f.m71269a(c29719y, null, config, c30095b2, strings, new Function2() { // from class: com.sumsub.sns.internal.features.presentation.esign.u0
                        @Override // p852kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C30997n0.m70538a(this.f62676b, (String) obj, (String) obj2);
                        }
                    }, (192 & 32) != 0 ? null : null, false, null, mapM70557f, (Map) c28936t2.m69705a()));
                    arrayList2 = arrayList3;
                    c30095b = c30095b2;
                }
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            c30948c.f62518a = listEmptyList;
            c30948c.f62520c = 0;
            c30948c.f62523f = 1;
            string = getString("sns_esign_provided_data_title", c30948c);
            if (string != coroutine_suspended) {
                list = listEmptyList;
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            i11 = c30948c.f62520c;
            List list4 = c30948c.f62518a;
            ResultKt.throwOnFailure(string);
            list = list4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = c30948c.f62520c;
            str = c30948c.f62519b;
            List list5 = c30948c.f62518a;
            ResultKt.throwOnFailure(string);
            list2 = list5;
        }
        return new C28801h(i12, str, (String) string, list2);
        String str2 = (String) string;
        c30948c.f62518a = list;
        c30948c.f62519b = str2;
        c30948c.f62520c = i11;
        c30948c.f62523f = 2;
        Object string2 = getString("sns_esign_provided_data_subtitle", c30948c);
        if (string2 != coroutine_suspended) {
            i12 = i11;
            str = str2;
            string = string2;
            list2 = list;
            return new C28801h(i12, str, (String) string, list2);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public static final String m70538a(C30997n0 c30997n0, String str, String str2) {
        String strM70061a = c30997n0.getStrings().m70061a("sns_esign_" + str + "_" + str2);
        if (strM70061a != null) {
            return strM70061a;
        }
        C29983l strings = c30997n0.getStrings();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return AbstractC28892d.m69671a(new Object[]{str, str2}, 2, "sns_data_%s_%s", strings);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0194  */
    /* JADX WARN: Code duplicated, block: B:54:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0216  */
    /* JADX WARN: Code duplicated, block: B:65:0x021f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.sumsub.sns.core.presentation.base.M0, com.sumsub.sns.internal.features.presentation.esign.n0] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bd -> B:27:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0139 -> B:12:0x0047). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0194 -> B:52:0x0199). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70544a(java.util.ArrayList r30, com.sumsub.sns.internal.features.data.model.esign.C29752Y r31, p852kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.esign.C30997n0.m70544a(java.util.ArrayList, com.sumsub.sns.internal.features.data.model.esign.Y, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
