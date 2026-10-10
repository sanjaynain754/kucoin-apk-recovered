package com.sumsub.sns.internal.features.presentation.poa;

import android.graphics.Bitmap;
import androidx.lifecycle.ViewModelKt;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import com.sumsub.sns.internal.features.data.model.common.C29053S2;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29106e;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30073G;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30125T;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30139j;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import com.sumsub.sns.internal.features.domain.documents.C30121O;
import com.sumsub.sns.internal.features.domain.documents.C30132c;
import com.sumsub.sns.internal.features.domain.documents.C30134e;
import com.sumsub.sns.internal.features.domain.documents.C30141l;
import com.sumsub.sns.internal.features.domain.documents.C30143n;
import com.sumsub.sns.internal.features.domain.documents.C30145p;
import com.sumsub.sns.internal.features.domain.documents.C30151v;
import com.sumsub.sns.internal.features.domain.documents.C30152w;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.common.AbstractC30808G;
import com.sumsub.sns.internal.features.presentation.common.C30807F;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32666q;
import com.sumsub.sns.internal.features.presentation.utils.C32668s;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31472x extends AbstractC30808G {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ int f63837W = 0;

    /* JADX INFO: renamed from: f */
    public final Document f63838f;

    /* JADX INFO: renamed from: g */
    public final C30073G f63839g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC29984m f63840h;

    /* JADX INFO: renamed from: i */
    public final C30151v f63841i;

    /* JADX INFO: renamed from: j */
    public final C30316a f63842j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC30000a f63843k;

    /* JADX INFO: renamed from: l */
    public boolean f63844l;

    /* JADX INFO: renamed from: m */
    public Map f63845m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC41678w f63846n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41669n f63847o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC41669n f63848p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC41669n f63849q;

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final Object mo70458a(AbstractC30146q abstractC30146q, Continuation continuation) {
        Object value;
        C30316a.m70183b(this.f63842j, "SNSPoaViewModelV2", "onDocumentsUploadFinished, " + abstractC30146q);
        InterfaceC41669n interfaceC41669n = this.f63849q;
        do {
            value = interfaceC41669n.getValue();
            ((Boolean) value).getClass();
        } while (!interfaceC41669n.compareAndSet(value, Boxing.boxBoolean(false)));
        if (abstractC30146q instanceof C30141l) {
            this.f62236a.m71254g();
            fireEvent(new C31456h(this.f63838f));
        } else {
            if (abstractC30146q instanceof C30145p) {
                Object objM70737a = m70737a((C30145p) abstractC30146q, continuation);
                return objM70737a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM70737a : Unit.INSTANCE;
            }
            if (!(abstractC30146q instanceof C30134e) && !(abstractC30146q instanceof AbstractC30139j) && !(abstractC30146q instanceof C30143n)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90930n0(this.f63847o, new C31467s(c28075o, this, null));
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: e */
    public final void mo70470e() {
        C30152w c30152w;
        Object next;
        C30316a.m70183b(this.f63842j, "SNSPoaViewModelV2", "uploadDocuments");
        List list = (List) this.f63848p.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CharSequence charSequence = ((C30152w) next).f60594f;
                if (charSequence != null && charSequence.length() != 0) {
                    break;
                }
            }
            c30152w = (C30152w) next;
        } else {
            c30152w = null;
        }
        if (c30152w != null) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31471w(this, c30152w, null), 3, null);
            return;
        }
        this.f63845m = null;
        C30316a.m70183b(this.f62237b, "SNSImageDocumentsAwareViewModel", "uploadDocuments");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C30807F(this, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return this.f63838f.getType().f59014a;
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G, com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        Object value;
        List mutableList;
        if (interfaceC28077Q instanceof C31463o) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31468t(this, (C31463o) interfaceC28077Q, null), 3, null);
            return;
        }
        if (!(interfaceC28077Q instanceof C31457i)) {
            super.intent(interfaceC28077Q);
            return;
        }
        C31457i c31457i = (C31457i) interfaceC28077Q;
        this.f62236a.m71237a(c31457i.f63764a);
        InterfaceC41669n interfaceC41669n = this.f63848p;
        do {
            value = interfaceC41669n.getValue();
            List list = (List) value;
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                mutableList = null;
            } else {
                mutableList.remove(c31457i.f63764a);
            }
        } while (!interfaceC41669n.compareAndSet(value, mutableList));
    }

    public C31472x(Document document, InterfaceC29953a interfaceC29953a, C30073G c30073g, InterfaceC29984m interfaceC29984m, C30151v c30151v, C32635M c32635m, C30316a c30316a, C28547d c28547d) {
        super(interfaceC29953a, interfaceC29984m, c32635m, c30316a);
        this.f63838f = document;
        this.f63839g = c30073g;
        this.f63840h = interfaceC29984m;
        this.f63841i = c30151v;
        this.f63842j = c30316a;
        this.f63843k = c28547d;
        this.f63844l = true;
        this.f63846n = C41636g.m90916g0(C41636g.m90887K(new C31469u(this, c32635m, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), null);
        this.f63847o = C41679x.m91009a(SNSProofOfAddressViewModelV2$Step.DOC_UPLOAD);
        this.f63848p = C41679x.m91009a(null);
        this.f63849q = C41679x.m91009a(Boolean.FALSE);
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final void mo70466a(String str, Throwable th2) {
        Object value;
        this.f63842j.getClass();
        C33272c.f67816e.f67810a.mo68956e("SNSPoaViewModelV2", "onDocumentsUploadError", th2);
        InterfaceC41669n interfaceC41669n = this.f63849q;
        do {
            value = interfaceC41669n.getValue();
            ((Boolean) value).getClass();
        } while (!interfaceC41669n.compareAndSet(value, Boolean.FALSE));
        AbstractC28052C.throwError$default(this, th2, str, null, 4, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final void mo70463a(C29054T c29054t, AbstractC30125T abstractC30125T, int i11) {
        Object value;
        Object value2;
        ArrayList arrayList;
        C33272c c33272c = C33272c.f67812a;
        C32635M.f66606w.getClass();
        Logger.DefaultImpls.i$default(c33272c, "SNSPoaViewModelV2", "Upload progress " + C32668s.m71291a(c29054t) + C33844oi.f71346o + abstractC30125T + ", total:" + i11, null, 4, null);
        InterfaceC41669n interfaceC41669n = this.f63849q;
        do {
            value = interfaceC41669n.getValue();
            ((Boolean) value).getClass();
        } while (!interfaceC41669n.compareAndSet(value, Boolean.TRUE));
        InterfaceC41669n interfaceC41669n2 = this.f63848p;
        do {
            value2 = interfaceC41669n2.getValue();
            List<C30152w> list = (List) value2;
            arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (C30152w c30152wM70118a : list) {
                    String str = c30152wM70118a.f60593e;
                    C32635M.f66606w.getClass();
                    File file = c29054t.f58995b;
                    if (Intrinsics.areEqual(str, file != null ? file.getAbsolutePath() : null)) {
                        c30152wM70118a = C30152w.m70118a(c30152wM70118a, 0, null, abstractC30125T, 63);
                    }
                    arrayList2.add(c30152wM70118a);
                }
                arrayList = arrayList2;
            }
        } while (!interfaceC41669n2.compareAndSet(value2, arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70737a(C30145p c30145p, Continuation continuation) {
        C31470v c31470v;
        C30151v c30151v;
        C29124h c29124h;
        Object value;
        ArrayList arrayList;
        if (continuation instanceof C31470v) {
            c31470v = (C31470v) continuation;
            int i11 = c31470v.f63831f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31470v.f63831f = i11 - Integer.MIN_VALUE;
            } else {
                c31470v = new C31470v(this, continuation);
            }
        } else {
            c31470v = new C31470v(this, continuation);
        }
        Object obj = c31470v.f63829d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31470v.f63831f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C30316a.m70183b(this.f63842j, "SNSPoaViewModelV2", "Show warnings");
            C30151v c30151v2 = this.f63841i;
            C29124h c29124h2 = this.f62236a.f66630v;
            c31470v.f63826a = c30151v2;
            c31470v.f63827b = c29124h2;
            c31470v.f63828c = c30145p;
            c31470v.f63831f = 1;
            Object strings = getStrings(c31470v);
            if (strings == coroutine_suspended) {
                return coroutine_suspended;
            }
            c30151v = c30151v2;
            obj = strings;
            c29124h = c29124h2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30145p = c31470v.f63828c;
            c29124h = c31470v.f63827b;
            c30151v = c31470v.f63826a;
            ResultKt.throwOnFailure(obj);
        }
        Object objM70116a = c30151v.m70116a(c29124h, c30145p, (C29983l) obj);
        if (Result.m103850isFailureimpl(objM70116a)) {
            objM70116a = null;
        }
        Map map = (Map) objM70116a;
        this.f63845m = map;
        InterfaceC41669n interfaceC41669n = this.f63848p;
        do {
            value = interfaceC41669n.getValue();
            List<C30152w> list = (List) value;
            if (list != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (C30152w c30152w : list) {
                    arrayList.add(C30152w.m70118a(c30152w, 0, map != null ? (CharSequence) map.get(c30152w.f60593e) : null, C30121O.f60561a, 31));
                }
            } else {
                arrayList = null;
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m70738a(C29124h c29124h, C29046Q2 c29046q2, C29983l c29983l) {
        List<C29106e> listTake;
        String strReplace$default;
        String string;
        String strM69770a;
        if (c29046q2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C29053S2 c29053s2 = c29046q2.f58982a;
        if ((c29053s2 != null ? Intrinsics.areEqual(c29053s2.f58990a, Boolean.TRUE) : false) && (strM69770a = AbstractC29130i.m69770a("POA.documentTypes.poiAsPoa.title", c29124h.f59071d)) != null) {
            m70739a(strM69770a, arrayList);
        }
        String strM70061a = c29983l.m70061a("sns_poa_instructions_validMonthShort");
        List list = c29046q2.f58983b;
        if (list != null && (listTake = CollectionsKt.take(list, 3)) != null) {
            for (C29106e c29106e : listTake) {
                boolean z11 = true;
                String str = String.format("POA.documentTypes.%s.title", Arrays.copyOf(new Object[]{c29106e.f59052a}, 1));
                if (strM70061a != null) {
                    Double d11 = c29106e.f59053b;
                    if (d11 == null || (string = Integer.valueOf((int) d11.doubleValue()).toString()) == null) {
                        string = "";
                    }
                    strReplace$default = StringsKt.replace$default(strM70061a, "{poaValidMonths}", string, false, 4, (Object) null);
                } else {
                    strReplace$default = null;
                }
                String strM69770a2 = AbstractC29130i.m69770a(str, c29124h.f59071d);
                if (strM69770a2 != null) {
                    if (strReplace$default != null && !StringsKt.isBlank(strReplace$default)) {
                        z11 = false;
                    }
                    if (!z11) {
                        strM69770a2 = strM69770a2 + " (" + strReplace$default + ")";
                    }
                    m70739a(strM69770a2, arrayList);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m70739a(String str, ArrayList arrayList) {
        arrayList.add(AbstractC28462i0.m69364a("* " + str, ((C28547d) this.f63843k).f58099a.f58163a));
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m70735a(C29106e c29106e, C29124h c29124h) {
        ArrayList arrayList = new ArrayList();
        List list = c29106e.f59054c;
        if (list != null && (!list.isEmpty())) {
            for (String str : c29106e.f59054c) {
                String strM69770a = AbstractC29130i.m69770a("POA.documentTypes." + c29106e.f59052a + ".subType." + str, c29124h.f59071d);
                if (strM69770a != null) {
                    arrayList.add(strM69770a);
                }
            }
        } else {
            String strM69770a2 = AbstractC29130i.m69770a("POA.documentTypes." + c29106e.f59052a + ".label", c29124h.f59071d);
            if (strM69770a2 == null) {
                strM69770a2 = AbstractC29130i.m69770a("POA.documentTypes." + c29106e.f59052a + ".title", c29124h.f59071d);
            }
            if (strM69770a2 != null) {
                arrayList.add(strM69770a2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:35:0x010b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x0131  */
    /* JADX WARN: Code duplicated, block: B:45:0x013b  */
    /* JADX WARN: Code duplicated, block: B:47:0x015b  */
    /* JADX WARN: Code duplicated, block: B:49:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x016e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8 A[PHI: r1 r2 r5
      0x01b8: PHI (r1v8 java.util.ArrayList) = (r1v5 java.util.ArrayList), (r1v10 java.util.ArrayList) binds: [B:56:0x01b4, B:17:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r2v22 java.lang.Object) = (r2v16 java.lang.Object), (r2v1 java.lang.Object) binds: [B:56:0x01b4, B:17:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r5v7 java.util.ArrayList) = (r5v22 java.util.ArrayList), (r5v23 java.util.ArrayList) binds: [B:56:0x01b4, B:17:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7 A[LOOP:0: B:63:0x01d1->B:65:0x01d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f7 A[PHI: r1 r2 r5
      0x01f7: PHI (r1v11 java.util.ArrayList) = (r1v8 java.util.ArrayList), (r1v13 java.util.ArrayList) binds: [B:67:0x01f4, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r2v29 java.lang.Object) = (r2v25 java.lang.Object), (r2v1 java.lang.Object) binds: [B:67:0x01f4, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r5v10 java.util.ArrayList) = (r5v20 java.util.ArrayList), (r5v21 java.util.ArrayList) binds: [B:67:0x01f4, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0214  */
    /* JADX WARN: Code duplicated, block: B:76:0x023b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m70736a(C29046Q2 c29046q2, ContinuationImpl continuationImpl) {
        C31466r c31466r;
        C29124h c29124h;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object string;
        C29046Q2 c29046q3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        C29053S2 c29053s2;
        List<C29106e> list;
        String strM69770a;
        String str2;
        String strReplace$default;
        Double d11;
        String string2;
        String strM69770a2;
        ArrayList arrayList5;
        String str3;
        List listSplit$default;
        Iterator it;
        ArrayList arrayList6;
        CharSequence charSequence;
        String imageName;
        Object string3;
        String str4;
        CharSequence charSequence2;
        List list2;
        String str5;
        CharSequence charSequence3;
        String imageName2;
        Object string4;
        CharSequence charSequence4;
        List list3;
        CharSequence charSequence5;
        String str6;
        C29046Q2 c29046q4 = c29046q2;
        if (continuationImpl instanceof C31466r) {
            c31466r = (C31466r) continuationImpl;
            int i11 = c31466r.f63813i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31466r.f63813i = i11 - Integer.MIN_VALUE;
            } else {
                c31466r = new C31466r(this, continuationImpl);
            }
        } else {
            c31466r = new C31466r(this, continuationImpl);
        }
        Object objM70045b = c31466r.f63811g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = 1;
        switch (c31466r.f63813i) {
            case 0:
                ResultKt.throwOnFailure(objM70045b);
                C30316a.m70183b(this.f63842j, "SNSPoaViewModelV2", "buildMoreExamplesEvent, preset = " + c29046q4);
                if (c29046q4 == null) {
                    return null;
                }
                InterfaceC29984m interfaceC29984m = this.f63840h;
                c31466r.f63805a = c29046q4;
                c31466r.f63813i = 1;
                objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c31466r);
                if (objM70045b != coroutine_suspended) {
                    c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
                    if (c29124h == null) {
                        return null;
                    }
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    c31466r.f63805a = c29046q4;
                    c31466r.f63806b = c29124h;
                    c31466r.f63807c = arrayList;
                    c31466r.f63808d = arrayList2;
                    c31466r.f63813i = 2;
                    string = getString("sns_poa_instructions_validMonth", c31466r);
                    if (string != coroutine_suspended) {
                        c29046q3 = c29046q4;
                        arrayList3 = arrayList2;
                        objM70045b = string;
                        arrayList4 = arrayList;
                        str = (String) objM70045b;
                        c29053s2 = c29046q3.f58982a;
                        if ((c29053s2 != null ? Intrinsics.areEqual(c29053s2.f58990a, Boxing.boxBoolean(true)) : false) && (strM69770a2 = AbstractC29130i.m69770a("POA.documentTypes.poiAsPoa.title", c29124h.f59071d)) != null) {
                            Boxing.boxBoolean(arrayList4.add(new C31461m(strM69770a2)));
                        }
                        list = c29046q3.f58983b;
                        if (list != null) {
                            for (C29106e c29106e : list) {
                                strM69770a = AbstractC29130i.m69770a(String.format("POA.documentTypes.%s.title", Arrays.copyOf(new Object[]{c29106e.f59052a}, i12)), c29124h.f59071d);
                                if (str != null) {
                                    d11 = c29106e.f59053b;
                                    if (d11 != null || (string2 = Boxing.boxInt((int) d11.doubleValue()).toString()) == null) {
                                        string2 = "";
                                    }
                                    str2 = strM69770a;
                                    strReplace$default = StringsKt.replace$default(str, "{poaValidMonths}", string2, false, 4, (Object) null);
                                } else {
                                    str2 = strM69770a;
                                    strReplace$default = null;
                                }
                                arrayList4.add(new C31461m(str2, strReplace$default, CollectionsKt.joinToString$default(m70735a(c29106e, c29124h), ", ", null, null, 0, null, null, 62, null)));
                                i12 = 1;
                            }
                        }
                        c31466r.f63805a = arrayList4;
                        c31466r.f63806b = arrayList3;
                        c31466r.f63807c = null;
                        c31466r.f63808d = null;
                        c31466r.f63813i = 3;
                        objM70045b = getString("sns_poa_instructions_weDontAcceptList", c31466r);
                        arrayList5 = arrayList4;
                        if (objM70045b != coroutine_suspended) {
                            str3 = (String) objM70045b;
                            if (str3 != null && (listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, (Object) null)) != null) {
                                it = listSplit$default.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(new C31461m((String) it.next()));
                                }
                            }
                            c31466r.f63805a = arrayList5;
                            c31466r.f63806b = arrayList3;
                            c31466r.f63813i = 4;
                            objM70045b = getString("sns_poa_instructions_weAccept", c31466r);
                            arrayList6 = arrayList5;
                            if (objM70045b != coroutine_suspended) {
                                charSequence = (CharSequence) objM70045b;
                                imageName = SNSIconHandler.SNSCommonIcons.SUCCESS_FILLED.getImageName();
                                c31466r.f63805a = arrayList3;
                                c31466r.f63806b = charSequence;
                                c31466r.f63807c = imageName;
                                c31466r.f63808d = arrayList6;
                                c31466r.f63813i = 5;
                                string3 = getString("sns_poa_instructions_weDontAccept", c31466r);
                                if (string3 != coroutine_suspended) {
                                    str4 = imageName;
                                    charSequence2 = charSequence;
                                    objM70045b = string3;
                                    list2 = arrayList6;
                                    str5 = str4;
                                    charSequence3 = (CharSequence) objM70045b;
                                    imageName2 = SNSIconHandler.SNSCommonIcons.FAILURE_FILLED.getImageName();
                                    c31466r.f63805a = charSequence2;
                                    c31466r.f63806b = str5;
                                    c31466r.f63807c = list2;
                                    c31466r.f63808d = charSequence3;
                                    c31466r.f63809e = imageName2;
                                    c31466r.f63810f = arrayList3;
                                    c31466r.f63813i = 6;
                                    string4 = getString("sns_alert_action_dismiss", c31466r);
                                    if (string4 != coroutine_suspended) {
                                        charSequence4 = charSequence3;
                                        objM70045b = string4;
                                        list3 = list2;
                                        charSequence5 = charSequence2;
                                        str6 = imageName2;
                                        return new C31462n(charSequence5, str5, list3, charSequence4, str6, arrayList3, (CharSequence) objM70045b);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                c29046q4 = (C29046Q2) c31466r.f63805a;
                ResultKt.throwOnFailure(objM70045b);
                c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
                if (c29124h == null) {
                    return null;
                }
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                c31466r.f63805a = c29046q4;
                c31466r.f63806b = c29124h;
                c31466r.f63807c = arrayList;
                c31466r.f63808d = arrayList2;
                c31466r.f63813i = 2;
                string = getString("sns_poa_instructions_validMonth", c31466r);
                if (string != coroutine_suspended) {
                    c29046q3 = c29046q4;
                    arrayList3 = arrayList2;
                    objM70045b = string;
                    arrayList4 = arrayList;
                    str = (String) objM70045b;
                    c29053s2 = c29046q3.f58982a;
                    if (c29053s2 != null ? Intrinsics.areEqual(c29053s2.f58990a, Boxing.boxBoolean(true)) : false) {
                        Boxing.boxBoolean(arrayList4.add(new C31461m(strM69770a2)));
                    }
                    list = c29046q3.f58983b;
                    if (list != null) {
                        while (r2.hasNext()) {
                            strM69770a = AbstractC29130i.m69770a(String.format("POA.documentTypes.%s.title", Arrays.copyOf(new Object[]{c29106e.f59052a}, i12)), c29124h.f59071d);
                            if (str != null) {
                                d11 = c29106e.f59053b;
                                if (d11 != null) {
                                    string2 = "";
                                } else {
                                    string2 = "";
                                }
                                str2 = strM69770a;
                                strReplace$default = StringsKt.replace$default(str, "{poaValidMonths}", string2, false, 4, (Object) null);
                            } else {
                                str2 = strM69770a;
                                strReplace$default = null;
                            }
                            arrayList4.add(new C31461m(str2, strReplace$default, CollectionsKt.joinToString$default(m70735a(c29106e, c29124h), ", ", null, null, 0, null, null, 62, null)));
                            i12 = 1;
                        }
                    }
                    c31466r.f63805a = arrayList4;
                    c31466r.f63806b = arrayList3;
                    c31466r.f63807c = null;
                    c31466r.f63808d = null;
                    c31466r.f63813i = 3;
                    objM70045b = getString("sns_poa_instructions_weDontAcceptList", c31466r);
                    arrayList5 = arrayList4;
                    if (objM70045b != coroutine_suspended) {
                        str3 = (String) objM70045b;
                        if (str3 != null) {
                            it = listSplit$default.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(new C31461m((String) it.next()));
                            }
                        }
                        c31466r.f63805a = arrayList5;
                        c31466r.f63806b = arrayList3;
                        c31466r.f63813i = 4;
                        objM70045b = getString("sns_poa_instructions_weAccept", c31466r);
                        arrayList6 = arrayList5;
                        if (objM70045b != coroutine_suspended) {
                            charSequence = (CharSequence) objM70045b;
                            imageName = SNSIconHandler.SNSCommonIcons.SUCCESS_FILLED.getImageName();
                            c31466r.f63805a = arrayList3;
                            c31466r.f63806b = charSequence;
                            c31466r.f63807c = imageName;
                            c31466r.f63808d = arrayList6;
                            c31466r.f63813i = 5;
                            string3 = getString("sns_poa_instructions_weDontAccept", c31466r);
                            if (string3 != coroutine_suspended) {
                                str4 = imageName;
                                charSequence2 = charSequence;
                                objM70045b = string3;
                                list2 = arrayList6;
                                str5 = str4;
                                charSequence3 = (CharSequence) objM70045b;
                                imageName2 = SNSIconHandler.SNSCommonIcons.FAILURE_FILLED.getImageName();
                                c31466r.f63805a = charSequence2;
                                c31466r.f63806b = str5;
                                c31466r.f63807c = list2;
                                c31466r.f63808d = charSequence3;
                                c31466r.f63809e = imageName2;
                                c31466r.f63810f = arrayList3;
                                c31466r.f63813i = 6;
                                string4 = getString("sns_alert_action_dismiss", c31466r);
                                if (string4 != coroutine_suspended) {
                                    charSequence4 = charSequence3;
                                    objM70045b = string4;
                                    list3 = list2;
                                    charSequence5 = charSequence2;
                                    str6 = imageName2;
                                    return new C31462n(charSequence5, str5, list3, charSequence4, str6, arrayList3, (CharSequence) objM70045b);
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 2:
                arrayList3 = (ArrayList) c31466r.f63808d;
                ArrayList arrayList7 = (ArrayList) c31466r.f63807c;
                c29124h = (C29124h) c31466r.f63806b;
                c29046q3 = (C29046Q2) c31466r.f63805a;
                ResultKt.throwOnFailure(objM70045b);
                arrayList4 = arrayList7;
                str = (String) objM70045b;
                c29053s2 = c29046q3.f58982a;
                if (c29053s2 != null ? Intrinsics.areEqual(c29053s2.f58990a, Boxing.boxBoolean(true)) : false) {
                    Boxing.boxBoolean(arrayList4.add(new C31461m(strM69770a2)));
                }
                list = c29046q3.f58983b;
                if (list != null) {
                    while (r2.hasNext()) {
                        strM69770a = AbstractC29130i.m69770a(String.format("POA.documentTypes.%s.title", Arrays.copyOf(new Object[]{c29106e.f59052a}, i12)), c29124h.f59071d);
                        if (str != null) {
                            d11 = c29106e.f59053b;
                            if (d11 != null) {
                                string2 = "";
                            } else {
                                string2 = "";
                            }
                            str2 = strM69770a;
                            strReplace$default = StringsKt.replace$default(str, "{poaValidMonths}", string2, false, 4, (Object) null);
                        } else {
                            str2 = strM69770a;
                            strReplace$default = null;
                        }
                        arrayList4.add(new C31461m(str2, strReplace$default, CollectionsKt.joinToString$default(m70735a(c29106e, c29124h), ", ", null, null, 0, null, null, 62, null)));
                        i12 = 1;
                    }
                }
                c31466r.f63805a = arrayList4;
                c31466r.f63806b = arrayList3;
                c31466r.f63807c = null;
                c31466r.f63808d = null;
                c31466r.f63813i = 3;
                objM70045b = getString("sns_poa_instructions_weDontAcceptList", c31466r);
                arrayList5 = arrayList4;
                if (objM70045b != coroutine_suspended) {
                    str3 = (String) objM70045b;
                    if (str3 != null) {
                        it = listSplit$default.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(new C31461m((String) it.next()));
                        }
                    }
                    c31466r.f63805a = arrayList5;
                    c31466r.f63806b = arrayList3;
                    c31466r.f63813i = 4;
                    objM70045b = getString("sns_poa_instructions_weAccept", c31466r);
                    arrayList6 = arrayList5;
                    if (objM70045b != coroutine_suspended) {
                        charSequence = (CharSequence) objM70045b;
                        imageName = SNSIconHandler.SNSCommonIcons.SUCCESS_FILLED.getImageName();
                        c31466r.f63805a = arrayList3;
                        c31466r.f63806b = charSequence;
                        c31466r.f63807c = imageName;
                        c31466r.f63808d = arrayList6;
                        c31466r.f63813i = 5;
                        string3 = getString("sns_poa_instructions_weDontAccept", c31466r);
                        if (string3 != coroutine_suspended) {
                            str4 = imageName;
                            charSequence2 = charSequence;
                            objM70045b = string3;
                            list2 = arrayList6;
                            str5 = str4;
                            charSequence3 = (CharSequence) objM70045b;
                            imageName2 = SNSIconHandler.SNSCommonIcons.FAILURE_FILLED.getImageName();
                            c31466r.f63805a = charSequence2;
                            c31466r.f63806b = str5;
                            c31466r.f63807c = list2;
                            c31466r.f63808d = charSequence3;
                            c31466r.f63809e = imageName2;
                            c31466r.f63810f = arrayList3;
                            c31466r.f63813i = 6;
                            string4 = getString("sns_alert_action_dismiss", c31466r);
                            if (string4 != coroutine_suspended) {
                                charSequence4 = charSequence3;
                                objM70045b = string4;
                                list3 = list2;
                                charSequence5 = charSequence2;
                                str6 = imageName2;
                                return new C31462n(charSequence5, str5, list3, charSequence4, str6, arrayList3, (CharSequence) objM70045b);
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 3:
                arrayList3 = (ArrayList) c31466r.f63806b;
                ArrayList arrayList8 = (ArrayList) c31466r.f63805a;
                ResultKt.throwOnFailure(objM70045b);
                arrayList5 = arrayList8;
                str3 = (String) objM70045b;
                if (str3 != null) {
                    it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new C31461m((String) it.next()));
                    }
                }
                c31466r.f63805a = arrayList5;
                c31466r.f63806b = arrayList3;
                c31466r.f63813i = 4;
                objM70045b = getString("sns_poa_instructions_weAccept", c31466r);
                arrayList6 = arrayList5;
                if (objM70045b != coroutine_suspended) {
                    charSequence = (CharSequence) objM70045b;
                    imageName = SNSIconHandler.SNSCommonIcons.SUCCESS_FILLED.getImageName();
                    c31466r.f63805a = arrayList3;
                    c31466r.f63806b = charSequence;
                    c31466r.f63807c = imageName;
                    c31466r.f63808d = arrayList6;
                    c31466r.f63813i = 5;
                    string3 = getString("sns_poa_instructions_weDontAccept", c31466r);
                    if (string3 != coroutine_suspended) {
                        str4 = imageName;
                        charSequence2 = charSequence;
                        objM70045b = string3;
                        list2 = arrayList6;
                        str5 = str4;
                        charSequence3 = (CharSequence) objM70045b;
                        imageName2 = SNSIconHandler.SNSCommonIcons.FAILURE_FILLED.getImageName();
                        c31466r.f63805a = charSequence2;
                        c31466r.f63806b = str5;
                        c31466r.f63807c = list2;
                        c31466r.f63808d = charSequence3;
                        c31466r.f63809e = imageName2;
                        c31466r.f63810f = arrayList3;
                        c31466r.f63813i = 6;
                        string4 = getString("sns_alert_action_dismiss", c31466r);
                        if (string4 != coroutine_suspended) {
                            charSequence4 = charSequence3;
                            objM70045b = string4;
                            list3 = list2;
                            charSequence5 = charSequence2;
                            str6 = imageName2;
                            return new C31462n(charSequence5, str5, list3, charSequence4, str6, arrayList3, (CharSequence) objM70045b);
                        }
                    }
                }
                return coroutine_suspended;
            case 4:
                arrayList3 = (ArrayList) c31466r.f63806b;
                ArrayList arrayList9 = (ArrayList) c31466r.f63805a;
                ResultKt.throwOnFailure(objM70045b);
                arrayList6 = arrayList9;
                charSequence = (CharSequence) objM70045b;
                imageName = SNSIconHandler.SNSCommonIcons.SUCCESS_FILLED.getImageName();
                c31466r.f63805a = arrayList3;
                c31466r.f63806b = charSequence;
                c31466r.f63807c = imageName;
                c31466r.f63808d = arrayList6;
                c31466r.f63813i = 5;
                string3 = getString("sns_poa_instructions_weDontAccept", c31466r);
                if (string3 != coroutine_suspended) {
                    str4 = imageName;
                    charSequence2 = charSequence;
                    objM70045b = string3;
                    list2 = arrayList6;
                    str5 = str4;
                    charSequence3 = (CharSequence) objM70045b;
                    imageName2 = SNSIconHandler.SNSCommonIcons.FAILURE_FILLED.getImageName();
                    c31466r.f63805a = charSequence2;
                    c31466r.f63806b = str5;
                    c31466r.f63807c = list2;
                    c31466r.f63808d = charSequence3;
                    c31466r.f63809e = imageName2;
                    c31466r.f63810f = arrayList3;
                    c31466r.f63813i = 6;
                    string4 = getString("sns_alert_action_dismiss", c31466r);
                    if (string4 != coroutine_suspended) {
                        charSequence4 = charSequence3;
                        objM70045b = string4;
                        list3 = list2;
                        charSequence5 = charSequence2;
                        str6 = imageName2;
                        return new C31462n(charSequence5, str5, list3, charSequence4, str6, arrayList3, (CharSequence) objM70045b);
                    }
                }
                return coroutine_suspended;
            case 5:
                List list4 = (List) c31466r.f63808d;
                String str7 = (String) c31466r.f63807c;
                charSequence2 = (CharSequence) c31466r.f63806b;
                ArrayList arrayList10 = (ArrayList) c31466r.f63805a;
                ResultKt.throwOnFailure(objM70045b);
                str4 = str7;
                list2 = list4;
                arrayList3 = arrayList10;
                str5 = str4;
                charSequence3 = (CharSequence) objM70045b;
                imageName2 = SNSIconHandler.SNSCommonIcons.FAILURE_FILLED.getImageName();
                c31466r.f63805a = charSequence2;
                c31466r.f63806b = str5;
                c31466r.f63807c = list2;
                c31466r.f63808d = charSequence3;
                c31466r.f63809e = imageName2;
                c31466r.f63810f = arrayList3;
                c31466r.f63813i = 6;
                string4 = getString("sns_alert_action_dismiss", c31466r);
                if (string4 != coroutine_suspended) {
                    charSequence4 = charSequence3;
                    objM70045b = string4;
                    list3 = list2;
                    charSequence5 = charSequence2;
                    str6 = imageName2;
                    return new C31462n(charSequence5, str5, list3, charSequence4, str6, arrayList3, (CharSequence) objM70045b);
                }
                return coroutine_suspended;
            case 6:
                arrayList3 = c31466r.f63810f;
                String str8 = c31466r.f63809e;
                CharSequence charSequence6 = (CharSequence) c31466r.f63808d;
                List list5 = (List) c31466r.f63807c;
                str5 = (String) c31466r.f63806b;
                CharSequence charSequence7 = (CharSequence) c31466r.f63805a;
                ResultKt.throwOnFailure(objM70045b);
                charSequence5 = charSequence7;
                str6 = str8;
                charSequence4 = charSequence6;
                list3 = list5;
                return new C31462n(charSequence5, str5, list3, charSequence4, str6, arrayList3, (CharSequence) objM70045b);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final Unit mo70460a(C32666q c32666q, List list) {
        C30152w c30152w;
        C30316a.m70183b(this.f63842j, "SNSPoaViewModelV2", "onDocumentsSelected, " + list);
        Map map = c32666q.f66669a;
        Map map2 = c32666q.f66670b;
        if (map.isEmpty()) {
            this.f63848p.setValue(null);
            this.f62236a.m71239a(IdentitySide.Front);
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29054T c29054t = (C29054T) it.next();
            C32635M.f66606w.getClass();
            String strM71291a = C32668s.m71291a(c29054t);
            if (strM71291a == null) {
                c30152w = null;
            } else {
                Bitmap bitmap = (Bitmap) map.get(strM71291a);
                File file = c29054t.f58995b;
                C30132c c30132c = (C30132c) map2.get(strM71291a);
                int i11 = c30132c != null ? c30132c.f60571a : 0;
                boolean zContainsKey = map2.containsKey(strM71291a);
                Map map3 = this.f63845m;
                c30152w = new C30152w(bitmap, file, i11, zContainsKey, strM71291a, map3 != null ? (CharSequence) map3.get(strM71291a) : null, 64);
            }
            if (c30152w != null) {
                arrayList.add(c30152w);
            }
        }
        this.f63848p.setValue(arrayList);
        if (this.f63844l) {
            this.f62236a.m71256i();
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30808G
    /* JADX INFO: renamed from: a */
    public final void mo70461a(int i11, File file) {
        Object value;
        ArrayList arrayList;
        C30316a.m70183b(this.f63842j, "SNSPoaViewModelV2", "onImageRotationChanged, " + i11 + ", " + file);
        InterfaceC41669n interfaceC41669n = this.f63848p;
        do {
            value = interfaceC41669n.getValue();
            List<C30152w> list = (List) value;
            arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (C30152w c30152wM70118a : list) {
                    if (Intrinsics.areEqual(c30152wM70118a.f60590b, file)) {
                        c30152wM70118a = C30152w.m70118a(c30152wM70118a, i11, null, null, 123);
                    }
                    arrayList2.add(c30152wM70118a);
                }
                arrayList = arrayList2;
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }
}
