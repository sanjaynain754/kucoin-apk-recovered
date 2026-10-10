package com.sumsub.sns.internal.features.presentation.utils;

import android.graphics.Bitmap;
import androidx.lifecycle.SavedStateHandle;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.common.AbstractC28385B0;
import com.sumsub.sns.internal.core.common.C28510y0;
import com.sumsub.sns.internal.core.common.InterfaceC28389D0;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29083a0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29074Y;
import com.sumsub.sns.internal.features.data.model.common.C29078Z;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.model.common.VideoRequiredType;
import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.AbstractC30223k0;
import com.sumsub.sns.internal.features.domain.AbstractC30225l0;
import com.sumsub.sns.internal.features.domain.C30067A;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30217h0;
import com.sumsub.sns.internal.features.domain.C30227m0;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.domain.C30311s0;
import com.sumsub.sns.internal.features.domain.C30312t;
import com.sumsub.sns.internal.features.domain.InterfaceC30271n0;
import com.sumsub.sns.internal.features.domain.documents.C30107A;
import com.sumsub.sns.internal.features.domain.documents.C30119M;
import com.sumsub.sns.internal.features.domain.documents.C30120N;
import com.sumsub.sns.internal.features.domain.documents.C30132c;
import com.sumsub.sns.internal.features.domain.documents.C30134e;
import com.sumsub.sns.internal.features.domain.documents.C30136g;
import com.sumsub.sns.internal.features.domain.documents.C30138i;
import com.sumsub.sns.internal.features.domain.documents.C30141l;
import com.sumsub.sns.internal.features.domain.documents.C30145p;
import com.sumsub.sns.internal.features.domain.documents.C30154y;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import com.sumsub.sns.internal.features.domain.mrtd.C30243e;
import com.sumsub.sns.internal.features.domain.mrtd.C30251i;
import com.sumsub.sns.internal.features.domain.mrtd.InterfaceC30231D;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.C30548f;
import com.sumsub.sns.internal.features.presentation.camera.photo.document.DocCapture$PreferredMode;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41726q1;
import kotlinx.coroutines.C41782z0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public class C32635M {

    /* JADX INFO: renamed from: a */
    public final Document f66609a;

    /* JADX INFO: renamed from: b */
    public final SavedStateHandle f66610b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29984m f66611c;

    /* JADX INFO: renamed from: d */
    public final C30312t f66612d;

    /* JADX INFO: renamed from: e */
    public final C30067A f66613e;

    /* JADX INFO: renamed from: f */
    public final C30311s0 f66614f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC28389D0 f66615g;

    /* JADX INFO: renamed from: h */
    public final C30156e f66616h;

    /* JADX INFO: renamed from: i */
    public final C30316a f66617i;

    /* JADX INFO: renamed from: j */
    public final C30243e f66618j;

    /* JADX INFO: renamed from: k */
    public final C30251i f66619k;

    /* JADX INFO: renamed from: l */
    public final C32662m f66620l;

    /* JADX INFO: renamed from: m */
    public AbstractC28052C f66621m;

    /* JADX INFO: renamed from: n */
    public final C28936t f66622n;

    /* JADX INFO: renamed from: o */
    public final C28936t f66623o;

    /* JADX INFO: renamed from: p */
    public final C28936t f66624p;

    /* JADX INFO: renamed from: q */
    public final C28936t f66625q;

    /* JADX INFO: renamed from: r */
    public final C28936t f66626r;

    /* JADX INFO: renamed from: s */
    public final C28936t f66627s;

    /* JADX INFO: renamed from: t */
    public final C28936t f66628t;

    /* JADX INFO: renamed from: u */
    public final C28936t f66629u;

    /* JADX INFO: renamed from: v */
    public C29124h f66630v;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ KProperty[] f66607x = {AbstractC28639a.m69485a(C32635M.class, "isSeamlessMode", "isSeamlessMode()Z", 0), AbstractC28639a.m69485a(C32635M.class, "acceptMultiplePages", "getAcceptMultiplePages()Z", 0), AbstractC28639a.m69485a(C32635M.class, "compositePickerResults", "getCompositePickerResults()Lcom/sumsub/sns/internal/features/data/model/common/CompositeDocumentPickerResult;", 0), AbstractC28639a.m69485a(C32635M.class, "pickerResults", "getPickerResults()Ljava/util/List;", 0), AbstractC28639a.m69485a(C32635M.class, "uploadPerformed", "getUploadPerformed()Z", 0), AbstractC28639a.m69485a(C32635M.class, "documentProperties", "getDocumentProperties$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Map;", 0), AbstractC28639a.m69485a(C32635M.class, "country", "getCountry()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C32635M.class, "idDocType", "getIdDocType()Ljava/lang/String;", 0)};

    /* JADX INFO: renamed from: w */
    public static final C32668s f66606w = new C32668s();

    /* JADX INFO: renamed from: y */
    public static final String[] f66608y = {"shouldBeDoubleSided", "sameSides", "inconsistentDocument"};

    /* JADX INFO: renamed from: a */
    public Object mo70878a(C29054T c29054t, ContinuationImpl continuationImpl) {
        return m71222a(this, c29054t, continuationImpl);
    }

    /* JADX INFO: renamed from: b */
    public final String m71247b() {
        C28936t c28936t = this.f66629u;
        KProperty kProperty = f66607x[7];
        return (String) c28936t.m69705a();
    }

    /* JADX INFO: renamed from: c */
    public final List m71250c() {
        C28936t c28936t = this.f66625q;
        KProperty kProperty = f66607x[3];
        return (List) c28936t.m69705a();
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m71227a(C29054T c29054t, int i11) {
        try {
            File file = c29054t.f58994a;
            if (file != null) {
                return AbstractC28385B0.m69274a(file, i11, 0);
            }
            return null;
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(this);
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, th2);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "decodePdf errro: " + th2.getMessage(), th2);
            C41696j.m91104d(C41726q1.f91773b, C41685g2.f91735b, null, new C32671v(th2, null), 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m71246b(ContinuationImpl continuationImpl) {
        C32623A c32623a;
        if (continuationImpl instanceof C32623A) {
            c32623a = (C32623A) continuationImpl;
            int i11 = c32623a.f66561c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32623a.f66561c = i11 - Integer.MIN_VALUE;
            } else {
                c32623a = new C32623A(this, continuationImpl);
            }
        } else {
            c32623a = new C32623A(this, continuationImpl);
        }
        Object objM70045b = c32623a.f66559a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32623a.f66561c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.f66611c;
            c32623a.f66561c = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c32623a);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70045b);
        }
        C29124h c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        if (c29124h != null) {
            this.f66630v = c29124h;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m71249c(ContinuationImpl continuationImpl) {
        C32628F c32628f;
        Set setKeySet;
        List list;
        Map map;
        if (continuationImpl instanceof C32628F) {
            c32628f = (C32628F) continuationImpl;
            int i11 = c32628f.f66583c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32628f.f66583c = i11 - Integer.MIN_VALUE;
            } else {
                c32628f = new C32628F(this, continuationImpl);
            }
        } else {
            c32628f = new C32628F(this, continuationImpl);
        }
        Object objM70042a = c32628f.f66581a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32628f.f66583c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f66611c;
            c32628f.f66583c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c32628f);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p == null) {
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), AbstractC33294e.m71624a(this), "applicant null!", null, 4, null);
            return CollectionsKt.emptyList();
        }
        List listM69796b = abstractC29172p.m69796b(this.f66609a.getType());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM69796b, 10));
        Iterator it = listM69796b.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC29180q2) it.next()).f59176a);
        }
        C29124h c29124h = this.f66630v;
        Object obj = (c29124h == null || (map = c29124h.f59072e) == null) ? null : map.get(m71236a());
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 != null && (setKeySet = map2.keySet()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : setKeySet) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
            Set setIntersect = CollectionsKt.intersect(arrayList2, CollectionsKt.toSet(arrayList));
            if (setIntersect != null && (list = CollectionsKt.toList(setIntersect)) != null) {
                return list;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m71251d() {
        C29124h c29124h = this.f66630v;
        return c29124h != null && AbstractC29130i.m69776b(c29124h, this.f66609a.getType().f59014a);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m71252e() {
        C28936t c28936t = this.f66622n;
        KProperty kProperty = f66607x[0];
        return ((Boolean) c28936t.m69705a()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX INFO: renamed from: i */
    public final void m71256i() {
        IdentitySide identitySide;
        C32662m c32662m = this.f66620l;
        List listM71250c = m71250c();
        if (listM71250c == null || !listM71250c.isEmpty()) {
            Iterator it = listM71250c.iterator();
            while (it.hasNext()) {
                if (((C29054T) it.next()).f58998e == IdentitySide.Front) {
                    if (listM71250c == null || !listM71250c.isEmpty()) {
                        Iterator it2 = listM71250c.iterator();
                        while (it2.hasNext()) {
                            if (((C29054T) it2.next()).f58998e == IdentitySide.Back) {
                                return;
                            }
                        }
                    }
                    IdentitySide identitySide2 = IdentitySide.Back;
                    if (identitySide2 == c32662m.m71283a()) {
                        return;
                    }
                    C28936t c28936t = c32662m.f66657c;
                    KProperty kProperty = C32662m.f66654e[0];
                    c28936t.f58834a.set(c28936t.f58835b, identitySide2);
                }
            }
            identitySide = IdentitySide.Front;
            if (identitySide == c32662m.m71283a()) {
                return;
            }
            C28936t c28936t2 = c32662m.f66657c;
            KProperty kProperty2 = C32662m.f66654e[0];
            c28936t2.f58834a.set(c28936t2.f58835b, identitySide);
        } else {
            identitySide = IdentitySide.Front;
            if (identitySide == c32662m.m71283a()) {
                return;
            }
            C28936t c28936t3 = c32662m.f66657c;
            KProperty kProperty3 = C32662m.f66654e[0];
            c28936t3.f58834a.set(c28936t3.f58835b, identitySide);
        }
        C29903a c29903a = C28366e.f57832a;
        C28366e.f57834c.put(GlobalStatePayload.IdDocSubType, this.f66620l.m71283a().getValue());
    }

    public C32635M(Document document, SavedStateHandle savedStateHandle, InterfaceC29984m interfaceC29984m, C30312t c30312t, C30067A c30067a, C30311s0 c30311s0, InterfaceC28389D0 interfaceC28389D0, C30156e c30156e, C30316a c30316a, C30243e c30243e, C30251i c30251i, C32662m c32662m) {
        this.f66609a = document;
        this.f66610b = savedStateHandle;
        this.f66611c = interfaceC29984m;
        this.f66612d = c30312t;
        this.f66613e = c30067a;
        this.f66614f = c30311s0;
        this.f66615g = interfaceC28389D0;
        this.f66616h = c30156e;
        this.f66617i = c30316a;
        this.f66618j = c30243e;
        this.f66619k = c30251i;
        this.f66620l = c32662m;
        Boolean bool = Boolean.FALSE;
        this.f66622n = new C28936t(savedStateHandle, "isSeamlessMode", bool, false);
        this.f66623o = new C28936t(savedStateHandle, "KEY_DOCUMENT_ACCEPT_MULTIPLE_PAGES", bool, false);
        this.f66624p = new C28936t(savedStateHandle, "KEY_COMPOSITE_RESULTS", null, false);
        this.f66625q = new C28936t(savedStateHandle, "KEY_RESULTS", CollectionsKt.emptyList(), false);
        this.f66626r = new C28936t(savedStateHandle, "KEY_UPLOAD_PERFORMED", bool, false);
        this.f66627s = new C28936t(savedStateHandle, "documentProperties", MapsKt.emptyMap(), false);
        this.f66628t = new C28936t(savedStateHandle, "KEY_COUNTRY", null, false);
        this.f66629u = new C28936t(savedStateHandle, "KEY_ID_DOC_TYPE", "OTHER", false);
    }

    /* JADX INFO: renamed from: f */
    public final List m71253f() {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "isSeamlessMode=" + m71252e(), null);
        C32662m c32662m = this.f66620l;
        boolean zM71252e = m71252e();
        C28936t c28936t = this.f66623o;
        KProperty kProperty = f66607x[1];
        boolean zBooleanValue = ((Boolean) c28936t.m69705a()).booleanValue();
        List listM71250c = m71250c();
        if (!zM71252e && !zBooleanValue) {
            return CollectionsKt.listOf(c32662m.m71283a());
        }
        C28936t c28936t2 = c32662m.f66658d;
        KProperty kProperty2 = C32662m.f66654e[1];
        int i11 = AbstractC32661l.f66652a[((DocumentSideness) c28936t2.m69705a()).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    if (zM71252e) {
                        return CollectionsKt.listOf((Object[]) new IdentitySide[]{IdentitySide.Front, IdentitySide.Back});
                    }
                    if (c32662m.f66655a.getHasNoSideness()) {
                        return CollectionsKt.listOf(IdentitySide.Front);
                    }
                    if (zBooleanValue) {
                        return CollectionsKt.listOf(c32662m.m71283a());
                    }
                    return CollectionsKt.listOf(IdentitySide.Front);
                }
                throw new NoWhenBranchMatchedException();
            }
            return CollectionsKt.listOf(IdentitySide.Front);
        }
        List listListOf = CollectionsKt.listOf((Object[]) new IdentitySide[]{IdentitySide.Front, IdentitySide.Back});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            IdentitySide identitySide = (IdentitySide) obj;
            if (listM71250c == null || !listM71250c.isEmpty()) {
                Iterator it = listM71250c.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (((C29054T) it.next()).f58998e != identitySide);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m71254g() {
        List listM71250c = m71250c();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM71250c.iterator();
        while (it.hasNext()) {
            File file = ((C29054T) it.next()).f58995b;
            if (file != null) {
                arrayList.add(file);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "deleting " + arrayList.size() + " files", null);
        C41696j.m91104d(C41726q1.f91773b, C41782z0.m91392b(), null, new C32630H(arrayList, this, null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final SecondSideStep m71255h() {
        List listM71250c = m71250c();
        if (listM71250c == null || !listM71250c.isEmpty()) {
            Iterator it = listM71250c.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((C29054T) it.next()).f59003j, Boolean.TRUE)) {
                    return SecondSideStep.Proceed;
                }
            }
        }
        List listM71250c2 = m71250c();
        if (listM71250c2 == null || !listM71250c2.isEmpty()) {
            Iterator it2 = listM71250c2.iterator();
            while (it2.hasNext()) {
                if (((C29054T) it2.next()).f58998e == IdentitySide.Back) {
                    return SecondSideStep.Proceed;
                }
            }
        }
        C28936t c28936t = this.f66620l.f66658d;
        KProperty kProperty = C32662m.f66654e[1];
        int i11 = AbstractC32661l.f66652a[((DocumentSideness) c28936t.m69705a()).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return SecondSideStep.Prompt;
                }
                throw new NoWhenBranchMatchedException();
            }
            return SecondSideStep.Proceed;
        }
        return SecondSideStep.RequestBackSide;
    }

    /* JADX INFO: renamed from: b */
    public final void m71248b(C29054T c29054t) {
        List mutableList = CollectionsKt.toMutableList((Collection) m71250c());
        mutableList.remove(c29054t);
        m71244a(mutableList);
        IdentitySide identitySide = c29054t.f58998e;
        if (identitySide != null) {
            m71239a(identitySide);
        }
        C28936t c28936t = this.f66627s;
        KProperty[] kPropertyArr = f66607x;
        KProperty kProperty = kPropertyArr[5];
        Map mutableMap = MapsKt.toMutableMap((Map) c28936t.m69705a());
        f66606w.getClass();
        File file = c29054t.f58995b;
        TypeIntrinsics.asMutableMap(mutableMap).remove(file != null ? file.getAbsolutePath() : null);
        C28936t c28936t2 = this.f66627s;
        KProperty kProperty2 = kPropertyArr[5];
        c28936t2.f58834a.set(c28936t2.f58835b, mutableMap);
        C41696j.m91104d(C41726q1.f91773b, C41782z0.m91392b(), null, new C32629G(c29054t, this, null), 2, null);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m71226a(C29054T c29054t, C29054T c29054t2) {
        IdentitySide identitySide = c29054t2.f58998e;
        IdentitySide identitySide2 = c29054t.f58998e;
        return identitySide == identitySide2 || identitySide == null || identitySide2 == null;
    }

    /* JADX INFO: renamed from: a */
    public final void m71244a(List list) {
        C28936t c28936t = this.f66625q;
        KProperty kProperty = f66607x[3];
        c28936t.f58834a.set(c28936t.f58835b, list);
    }

    /* JADX INFO: renamed from: a */
    public final String m71236a() {
        C28936t c28936t = this.f66628t;
        KProperty kProperty = f66607x[6];
        return (String) c28936t.m69705a();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (m71246b(r0) == r1) goto L36;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0098, please report this as an issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71234a(ContinuationImpl continuationImpl) {
        C32674y c32674y;
        String str;
        if (continuationImpl instanceof C32674y) {
            c32674y = (C32674y) continuationImpl;
            int i11 = c32674y.f66699c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32674y.f66699c = i11 - Integer.MIN_VALUE;
            } else {
                c32674y = new C32674y(this, continuationImpl);
            }
        } else {
            c32674y = new C32674y(this, continuationImpl);
        }
        Object objM70042a = c32674y.f66697a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32674y.f66699c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "init photo picker", null);
            InterfaceC29984m interfaceC29984m = this.f66611c;
            c32674y.f66699c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c32674y);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM70042a);
        } else if (i12 == 2) {
            ResultKt.throwOnFailure(objM70042a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "isSeamlessMode=" + m71252e(), null);
            c32674y.f66699c = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        return Unit.INSTANCE;
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p != null) {
            m71241a(abstractC29172p);
            if (!this.f66610b.contains("KEY_ID_DOC_TYPE")) {
                AbstractC29180q2 abstractC29180q2 = (AbstractC29180q2) CollectionsKt.firstOrNull(abstractC29172p.m69796b(this.f66609a.getType()));
                if (abstractC29180q2 == null || (str = abstractC29180q2.f59176a) == null) {
                    str = "OTHER";
                }
                mo70719a(str);
            }
            c32674y.f66699c = 2;
            if (m71223a(this, abstractC29172p, c32674y) != coroutine_suspended) {
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "isSeamlessMode=" + m71252e(), null);
                c32674y.f66699c = 3;
            }
        } else {
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "isSeamlessMode=" + m71252e(), null);
            c32674y.f66699c = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f6, code lost:
    
        if (m71246b(r0) == r1) goto L37;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71230a(String str, String str2, ContinuationImpl continuationImpl) {
        C32675z c32675z;
        C32635M c32635m;
        AbstractC29180q2 abstractC29180q2;
        if (continuationImpl instanceof C32675z) {
            c32675z = (C32675z) continuationImpl;
            int i11 = c32675z.f66704e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32675z.f66704e = i11 - Integer.MIN_VALUE;
            } else {
                c32675z = new C32675z(this, continuationImpl);
            }
        } else {
            c32675z = new C32675z(this, continuationImpl);
        }
        Object objM70042a = c32675z.f66702c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32675z.f66704e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "initForCamera: country=" + str + ", idDocType=" + str2, null);
            InterfaceC29984m interfaceC29984m = this.f66611c;
            c32675z.f66700a = str;
            c32675z.f66701b = str2;
            c32675z.f66704e = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c32675z);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str2 = c32675z.f66701b;
            str = (String) c32675z.f66700a;
            ResultKt.throwOnFailure(objM70042a);
        } else if (i12 == 2) {
            c32635m = (C32635M) c32675z.f66700a;
            ResultKt.throwOnFailure(objM70042a);
            C28936t c28936t = c32635m.f66620l.f66658d;
            KProperty kProperty = C32662m.f66654e[1];
            c28936t.f58834a.set(c28936t.f58835b, (DocumentSideness) objM70042a);
            c32675z.f66700a = null;
            c32675z.f66704e = 3;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        return Unit.INSTANCE;
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p != null) {
            m71241a(abstractC29172p);
            if (str2 == null && ((abstractC29180q2 = (AbstractC29180q2) CollectionsKt.firstOrNull(abstractC29172p.m69796b(this.f66609a.getType()))) == null || (str2 = abstractC29180q2.f59176a) == null)) {
                str2 = "OTHER";
            }
            C28936t c28936t2 = this.f66629u;
            KProperty kProperty2 = f66607x[7];
            c28936t2.f58834a.set(c28936t2.f58835b, str2);
        }
        C28936t c28936t3 = this.f66628t;
        KProperty kProperty3 = f66607x[6];
        c28936t3.f58834a.set(c28936t3.f58835b, str);
        C30312t c30312t = this.f66612d;
        Document document = this.f66609a;
        String strM71247b = m71247b();
        c32675z.f66700a = this;
        c32675z.f66701b = null;
        c32675z.f66704e = 2;
        objM70042a = c30312t.m70180a(document, str, strM71247b, c32675z);
        if (objM70042a != coroutine_suspended) {
            c32635m = this;
            C28936t c28936t4 = c32635m.f66620l.f66658d;
            KProperty kProperty4 = C32662m.f66654e[1];
            c28936t4.f58834a.set(c28936t4.f58835b, (DocumentSideness) objM70042a);
            c32675z.f66700a = null;
            c32675z.f66704e = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public final void m71241a(AbstractC29172p abstractC29172p) {
        Object next;
        Iterator it = abstractC29172p.mo69760k().f59151a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((C29154m) next).f59132a, this.f66609a.getType()));
        C29154m c29154m = (C29154m) next;
        if (c29154m != null) {
            boolean z11 = this.f66609a.getType().m69747d() && c29154m.m69790d() && !C33048a.f67485r.m71434a();
            C28936t c28936t = this.f66622n;
            KProperty kProperty = f66607x[0];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo70719a(String str) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "setIdDocTypeInfo, " + str, null);
        C28936t c28936t = this.f66629u;
        KProperty kProperty = f66607x[7];
        c28936t.f58834a.set(c28936t.f58835b, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m71223a(C32635M c32635m, AbstractC29172p abstractC29172p, ContinuationImpl continuationImpl) {
        C32631I c32631i;
        Object objM70120a;
        if (continuationImpl instanceof C32631I) {
            c32631i = (C32631I) continuationImpl;
            int i11 = c32631i.f66591d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32631i.f66591d = i11 - Integer.MIN_VALUE;
            } else {
                c32631i = new C32631I(c32635m, continuationImpl);
            }
        } else {
            c32631i = new C32631I(c32635m, continuationImpl);
        }
        Object obj = c32631i.f66589b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32631i.f66591d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C29154m c29154mM69794a = abstractC29172p.m69794a(c32635m.f66609a.getType());
            boolean z11 = c29154mM69794a != null && c29154mM69794a.m69789c();
            C30156e c30156e = c32635m.f66616h;
            c32631i.f66588a = c32635m;
            c32631i.f66591d = 1;
            objM70120a = c30156e.m70120a(z11, c32631i);
            if (objM70120a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32635m = c32631i.f66588a;
            ResultKt.throwOnFailure(obj);
            objM70120a = ((Result) obj).getValue();
        }
        if (Result.m103850isFailureimpl(objM70120a)) {
            objM70120a = null;
        }
        C30270n c30270n = (C30270n) objM70120a;
        String str = c30270n != null ? c30270n.f60858e : null;
        C28936t c28936t = c32635m.f66628t;
        KProperty kProperty = f66607x[6];
        c28936t.f58834a.set(c28936t.f58835b, str);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "resolve country, country = " + c32635m.m71236a(), null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m71225a(C32635M c32635m, boolean z11, ContinuationImpl continuationImpl) {
        C32673x c32673x;
        C29054T c29054t;
        IdentitySide identitySide;
        C32635M c32635m2;
        boolean z12;
        AbstractC29172p abstractC29172p;
        C29124h c29124h;
        C28936t c28936t;
        KProperty[] kPropertyArr;
        AbstractC29172p abstractC29172p2;
        C32635M c32635m3;
        C30119M c30119m;
        C29154m c29154mM69794a;
        String sceneName;
        if (continuationImpl instanceof C32673x) {
            c32673x = (C32673x) continuationImpl;
            int i11 = c32673x.f66696f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32673x.f66696f = i11 - Integer.MIN_VALUE;
            } else {
                c32673x = new C32673x(c32635m, continuationImpl);
            }
        } else {
            c32673x = new C32673x(c32635m, continuationImpl);
        }
        Object objM70042a = c32673x.f66694d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32673x.f66696f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            C30316a c30316a = c32635m.f66617i;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "showCamera, retake=" + z11, null);
            if (z11 && (c29054t = (C29054T) CollectionsKt.singleOrNull(c32635m.m71250c())) != null && (identitySide = c29054t.f58998e) != null) {
                c32635m.m71239a(identitySide);
            }
            InterfaceC29984m interfaceC29984m = c32635m.f66611c;
            c32673x.f66691a = c32635m;
            c32673x.f66693c = z11;
            c32673x.f66696f = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c32673x);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z11 = c32673x.f66693c;
            c32635m = c32673x.f66691a;
            ResultKt.throwOnFailure(objM70042a);
        } else {
            if (i12 == 2) {
                z12 = c32673x.f66693c;
                abstractC29172p = c32673x.f66692b;
                c32635m2 = c32673x.f66691a;
                ResultKt.throwOnFailure(objM70042a);
                c29124h = (C29124h) ((AbstractC29971N) objM70042a).m70051c();
                if (c29124h == null) {
                    C30316a c30316a2 = c32635m2.f66617i;
                    C33272c.f67816e.f67810a.mo68956e("DocCapture", "config is null", null);
                    return null;
                }
                c28936t = c32635m2.f66623o;
                kPropertyArr = f66607x;
                KProperty kProperty = kPropertyArr[1];
                if (!((Boolean) c28936t.m69705a()).booleanValue()) {
                    Map mapEmptyMap = MapsKt.emptyMap();
                    C28936t c28936t2 = c32635m2.f66627s;
                    KProperty kProperty2 = kPropertyArr[5];
                    c28936t2.f58834a.set(c28936t2.f58835b, mapEmptyMap);
                }
                c32673x.f66691a = c32635m2;
                c32673x.f66692b = abstractC29172p;
                c32673x.f66696f = 3;
                objM70042a = c32635m2.mo70877a(z12, abstractC29172p, c29124h);
                if (objM70042a != coroutine_suspended) {
                    abstractC29172p2 = abstractC29172p;
                    c32635m3 = c32635m2;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC29172p2 = c32673x.f66692b;
            c32635m3 = c32673x.f66691a;
            ResultKt.throwOnFailure(objM70042a);
        }
        c30119m = (C30119M) objM70042a;
        c29154mM69794a = abstractC29172p2.m69794a(c32635m3.f66609a.getType());
        if ((c29154mM69794a == null && c29154mM69794a.m69792f()) || (c29154mM69794a != null && c29154mM69794a.m69791e())) {
            if (c30119m.f60555f) {
                return new C30107A(c30119m);
            }
            return new C30120N(new C29697t2(c30119m.f60551b.getType().f59014a, IntroScene.PHOTOSELFIE.getSceneName(), c30119m.f60554e, c32635m3.m71236a(), (Map) null, 40), new C30107A(c30119m));
        }
        if (c30119m.f60555f) {
            return new C30154y(c30119m);
        }
        if (CollectionsKt.firstOrNull(c30119m.f60552c) == IdentitySide.Back) {
            sceneName = IntroScene.SCAN_BACKSIDE.getSceneName();
        } else {
            sceneName = IntroScene.SCAN_FRONTSIDE.getSceneName();
        }
        return new C30120N(new C29697t2(c30119m.f60551b.getType().f59014a, sceneName, c30119m.f60554e, c32635m3.m71236a(), (Map) null, 40), new C30154y(c30119m));
        AbstractC29172p abstractC29172p3 = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p3 == null) {
            C30316a c30316a3 = c32635m.f66617i;
            C33272c.f67816e.f67810a.mo68956e("DocCapture", "applicant is null", null);
            return null;
        }
        InterfaceC29984m interfaceC29984m2 = c32635m.f66611c;
        c32673x.f66691a = c32635m;
        c32673x.f66692b = abstractC29172p3;
        c32673x.f66693c = z11;
        c32673x.f66696f = 2;
        Object objM70045b = ((C29967J) interfaceC29984m2).m70045b(false, c32673x);
        if (objM70045b != coroutine_suspended) {
            c32635m2 = c32635m;
            z12 = z11;
            abstractC29172p = abstractC29172p3;
            objM70042a = objM70045b;
            c29124h = (C29124h) ((AbstractC29971N) objM70042a).m70051c();
            if (c29124h == null) {
                C30316a c30316a4 = c32635m2.f66617i;
                C33272c.f67816e.f67810a.mo68956e("DocCapture", "config is null", null);
                return null;
            }
            c28936t = c32635m2.f66623o;
            kPropertyArr = f66607x;
            KProperty kProperty3 = kPropertyArr[1];
            if (!((Boolean) c28936t.m69705a()).booleanValue()) {
                Map mapEmptyMap2 = MapsKt.emptyMap();
                C28936t c28936t3 = c32635m2.f66627s;
                KProperty kProperty4 = kPropertyArr[5];
                c28936t3.f58834a.set(c28936t3.f58835b, mapEmptyMap2);
            }
            c32673x.f66691a = c32635m2;
            c32673x.f66692b = abstractC29172p;
            c32673x.f66696f = 3;
            objM70042a = c32635m2.mo70877a(z12, abstractC29172p, c29124h);
            if (objM70042a != coroutine_suspended) {
                abstractC29172p2 = abstractC29172p;
                c32635m3 = c32635m2;
                c30119m = (C30119M) objM70042a;
                c29154mM69794a = abstractC29172p2.m69794a(c32635m3.f66609a.getType());
                if (c29154mM69794a == null) {
                    if (c30119m.f60555f) {
                        return new C30154y(c30119m);
                    }
                    if (CollectionsKt.firstOrNull(c30119m.f60552c) == IdentitySide.Back) {
                        sceneName = IntroScene.SCAN_BACKSIDE.getSceneName();
                    } else {
                        sceneName = IntroScene.SCAN_FRONTSIDE.getSceneName();
                    }
                    return new C30120N(new C29697t2(c30119m.f60551b.getType().f59014a, sceneName, c30119m.f60554e, c32635m3.m71236a(), (Map) null, 40), new C30154y(c30119m));
                }
                if (c30119m.f60555f) {
                    return new C30154y(c30119m);
                }
                if (CollectionsKt.firstOrNull(c30119m.f60552c) == IdentitySide.Back) {
                    sceneName = IntroScene.SCAN_BACKSIDE.getSceneName();
                } else {
                    sceneName = IntroScene.SCAN_FRONTSIDE.getSceneName();
                }
                return new C30120N(new C29697t2(c30119m.f60551b.getType().f59014a, sceneName, c30119m.f60554e, c32635m3.m71236a(), (Map) null, 40), new C30154y(c30119m));
                if (c30119m.f60555f) {
                    return new C30107A(c30119m);
                }
                return new C30120N(new C29697t2(c30119m.f60551b.getType().f59014a, IntroScene.PHOTOSELFIE.getSceneName(), c30119m.f60554e, c32635m3.m71236a(), (Map) null, 40), new C30107A(c30119m));
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0136, code lost:
    
        if (r2.mo70459a(r12, r11, r0) == r1) goto L54;
     */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.sumsub.sns.core.presentation.base.C, com.sumsub.sns.internal.features.presentation.utils.N] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71228a(C29015J c29015j, ContinuationImpl continuationImpl) {
        C32626D c32626d;
        String value;
        ArrayList arrayList;
        if (continuationImpl instanceof C32626D) {
            c32626d = (C32626D) continuationImpl;
            int i11 = c32626d.f66574d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32626d.f66574d = i11 - Integer.MIN_VALUE;
            } else {
                c32626d = new C32626D(this, continuationImpl);
            }
        } else {
            c32626d = new C32626D(this, continuationImpl);
        }
        Object obj = c32626d.f66572b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32626d.f66574d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "on picker results: " + c29015j, null);
            if (c29015j == null) {
                return Unit.INSTANCE;
            }
            C28936t c28936t = this.f66624p;
            KProperty kProperty = f66607x[2];
            c28936t.f58834a.set(c28936t.f58835b, c29015j);
            Iterator it = c29015j.f58957a.iterator();
            while (it.hasNext()) {
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "result: " + ((C29054T) it.next()), null);
            }
            List list = c29015j.f58957a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (true) {
                String str = "IDENTITY_VIDEO";
                if (!it2.hasNext()) {
                    break;
                }
                C29054T c29054t = (C29054T) it2.next();
                String strM71247b = m71247b();
                if (Intrinsics.areEqual(c29054t.f58997d, "IDENTITY_VIDEO")) {
                    strM71247b = null;
                }
                if (strM71247b != null) {
                    str = strM71247b;
                }
                arrayList2.add(C29054T.m69738a(c29054t, null, str, null, 1015));
            }
            m71244a(arrayList2);
            IdentitySide identitySide = IdentitySide.Front;
            C29903a c29903a = C28366e.f57832a;
            GlobalStatePayload globalStatePayload = GlobalStatePayload.IdDocSubType;
            if (identitySide == null || (value = identitySide.getValue()) == null) {
                value = this.f66620l.m71283a().getValue();
            }
            C28366e.f57834c.put(globalStatePayload, value);
            List listM71250c = m71250c();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listM71250c) {
                if (!Intrinsics.areEqual(((C29054T) obj2).f58997d, "IDENTITY_VIDEO")) {
                    arrayList3.add(obj2);
                }
            }
            c32626d.f66571a = arrayList3;
            c32626d.f66574d = 1;
            Object objM71224a = m71224a(this, arrayList3, c32626d, 2);
            if (objM71224a != coroutine_suspended) {
                obj = objM71224a;
                arrayList = arrayList3;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            arrayList = c32626d.f66571a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        C32666q c32666q = (C32666q) obj;
        ?? r11 = this.f66621m;
        if (r11 == 0) {
            return Unit.INSTANCE;
        }
        c32626d.f66571a = null;
        c32626d.f66574d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
    
        if (r8.mo70459a(r10, r9, r0) == r1) goto L40;
     */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.sumsub.sns.core.presentation.base.C, com.sumsub.sns.internal.features.presentation.utils.N] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.sumsub.sns.core.presentation.base.C, com.sumsub.sns.internal.features.presentation.utils.N] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m71222a(C32635M c32635m, C29054T c29054t, ContinuationImpl continuationImpl) {
        C32624B c32624b;
        List listM71250c;
        if (continuationImpl instanceof C32624B) {
            c32624b = (C32624B) continuationImpl;
            int i11 = c32624b.f66566e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32624b.f66566e = i11 - Integer.MIN_VALUE;
            } else {
                c32624b = new C32624B(c32635m, continuationImpl);
            }
        } else {
            c32624b = new C32624B(c32635m, continuationImpl);
        }
        Object objM71224a = c32624b.f66564c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32624b.f66566e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71224a);
            C30316a c30316a = c32635m.f66617i;
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "on picker result: " + c29054t, null);
            if (c29054t == null) {
                if (!c32635m.m71250c().isEmpty()) {
                    if (c32635m.f66620l.m71283a() == IdentitySide.Back) {
                        IdentitySide identitySide = IdentitySide.Front;
                        C28936t c28936t = c32635m.f66620l.f66657c;
                        KProperty kProperty = C32662m.f66654e[0];
                        c28936t.f58834a.set(c28936t.f58835b, identitySide);
                    }
                    C29903a c29903a = C28366e.f57832a;
                    C28366e.f57834c.put(GlobalStatePayload.IdDocSubType, c32635m.f66620l.m71283a().getValue());
                }
                ?? r11 = c32635m.f66621m;
                if (r11 != 0) {
                    r11.mo70467a(c32635m.m71250c().isEmpty());
                }
                return Unit.INSTANCE;
            }
            c32635m.m71240a(c29054t);
            C28936t c28936t2 = c32635m.f66623o;
            KProperty kProperty2 = f66607x[1];
            listM71250c = ((Boolean) c28936t2.m69705a()).booleanValue() ? c32635m.m71250c() : CollectionsKt.listOf(c29054t);
            c32624b.f66562a = c32635m;
            c32624b.f66563b = listM71250c;
            c32624b.f66566e = 1;
            objM71224a = m71224a(c32635m, listM71250c, c32624b, 2);
            if (objM71224a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            List list = c32624b.f66563b;
            C32635M c32635m2 = c32624b.f66562a;
            ResultKt.throwOnFailure(objM71224a);
            listM71250c = list;
            c32635m = c32635m2;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM71224a);
        }
        return Unit.INSTANCE;
        C32666q c32666q = (C32666q) objM71224a;
        ?? r12 = c32635m.f66621m;
        if (r12 == 0) {
            return Unit.INSTANCE;
        }
        c32624b.f66562a = null;
        c32624b.f66563b = null;
        c32624b.f66566e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r8.mo70459a((com.sumsub.sns.internal.features.presentation.utils.C32666q) r10, r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.sumsub.sns.internal.features.presentation.utils.N] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71232a(List list, DocumentSideness documentSideness, ContinuationImpl continuationImpl) {
        C32625C c32625c;
        AbstractC28052C abstractC28052C;
        ?? r11;
        if (continuationImpl instanceof C32625C) {
            c32625c = (C32625C) continuationImpl;
            int i11 = c32625c.f66570d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32625c.f66570d = i11 - Integer.MIN_VALUE;
            } else {
                c32625c = new C32625C(this, continuationImpl);
            }
        } else {
            c32625c = new C32625C(this, continuationImpl);
        }
        Object objM71224a = c32625c.f66568b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32625c.f66570d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71224a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "on forwarded results: " + list + ", sideness=" + documentSideness, null);
            C28936t c28936t = this.f66626r;
            KProperty kProperty = f66607x[4];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            if (documentSideness != null) {
                C28936t c28936t2 = this.f66620l.f66658d;
                KProperty kProperty2 = C32662m.f66654e[1];
                c28936t2.f58834a.set(c28936t2.f58835b, documentSideness);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m71240a((C29054T) it.next());
            }
            abstractC28052C = this.f66621m;
            if (abstractC28052C == null) {
                return Unit.INSTANCE;
            }
            c32625c.f66567a = abstractC28052C;
            c32625c.f66570d = 1;
            objM71224a = m71224a(this, (List) null, c32625c, 3);
            if (objM71224a != coroutine_suspended) {
            }
            r11 = abstractC28052C;
            return coroutine_suspended;
        }
        if (i12 == 1) {
            InterfaceC32636N interfaceC32636N = (InterfaceC32636N) c32625c.f66567a;
            ResultKt.throwOnFailure(objM71224a);
            r11 = interfaceC32636N;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM71224a);
        }
        return Unit.INSTANCE;
        r11 = abstractC28052C;
        List listM71250c = m71250c();
        c32625c.f66567a = null;
        c32625c.f66570d = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m71240a(final C29054T c29054t) {
        List mutableList = CollectionsKt.toMutableList((Collection) m71250c());
        if (!this.f66609a.getHasNoSideness()) {
            CollectionsKt.removeAll(mutableList, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.utils.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C32635M.m71226a(c29054t, (C29054T) obj));
                }
            });
        }
        if (c29054t.f58997d == null) {
            mutableList.add(C29054T.m69738a(c29054t, null, m71247b(), null, 1015));
        } else {
            mutableList.add(c29054t);
        }
        m71244a(mutableList);
    }

    /* JADX INFO: renamed from: a */
    public final void m71239a(IdentitySide identitySide) {
        C32662m c32662m = this.f66620l;
        if (identitySide == c32662m.m71283a()) {
            return;
        }
        C28936t c28936t = c32662m.f66657c;
        KProperty kProperty = C32662m.f66654e[0];
        c28936t.f58834a.set(c28936t.f58835b, identitySide);
        C29903a c29903a = C28366e.f57832a;
        C28366e.f57834c.put(GlobalStatePayload.IdDocSubType, this.f66620l.m71283a().getValue());
    }

    /* JADX INFO: renamed from: a */
    public final void m71237a(int i11) {
        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(C30548f.f61696a), "removeDocAt " + i11, null);
        C29054T c29054t = (C29054T) CollectionsKt.getOrNull(m71250c(), i11);
        if (c29054t == null) {
            return;
        }
        m71248b(c29054t);
    }

    /* JADX INFO: renamed from: a */
    public final void m71242a(File file) {
        Object obj = null;
        C33272c.f67816e.f67810a.mo68955d(AbstractC33294e.m71624a(C30548f.f61696a), "removeDoc " + file, null);
        for (Object obj2 : m71250c()) {
            C29054T c29054t = (C29054T) obj2;
            if (Intrinsics.areEqual(c29054t.f58995b, file) || Intrinsics.areEqual(c29054t.f58994a, file)) {
                obj = obj2;
                break;
            }
        }
        C29054T c29054t2 = (C29054T) obj;
        if (c29054t2 == null) {
            return;
        }
        m71248b(c29054t2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8 A[PHI: r1
      0x01e8: PHI (r1v29 java.lang.Object) = (r1v28 java.lang.Object), (r1v35 java.lang.Object) binds: [B:89:0x0204, B:84:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0209, code lost:
    
        if (r2 == r3) goto L93;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71235a(Function2 function2, Function3 function3, InterfaceC30271n0 interfaceC30271n0, ContinuationImpl continuationImpl) {
        C32632J c32632j;
        boolean z11;
        boolean z12;
        Function2 function4;
        Function3 function5;
        List listM71250c;
        List listM71250c2;
        Object obj;
        Object objInvokeSuspend;
        if (continuationImpl instanceof C32632J) {
            c32632j = (C32632J) continuationImpl;
            int i11 = c32632j.f66596e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32632j.f66596e = i11 - Integer.MIN_VALUE;
            } else {
                c32632j = new C32632J(this, continuationImpl);
            }
        } else {
            c32632j = new C32632J(this, continuationImpl);
        }
        Object objM70145a = c32632j.f66594c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32632j.f66596e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70145a);
            for (C29054T c29054t : m71250c()) {
                f66606w.getClass();
                String strM71291a = C32668s.m71291a(c29054t);
                C28936t c28936t = this.f66627s;
                KProperty kProperty = f66607x[5];
                C30132c c30132c = (C30132c) ((Map) c28936t.m69705a()).get(strM71291a);
                Integer numValueOf = c30132c != null ? Integer.valueOf(c30132c.f60571a) : null;
                File file = c29054t.f58995b;
                if (numValueOf != null && file != null) {
                    this.f66613e.m70094a(numValueOf.intValue(), file);
                }
            }
            List listM71250c3 = m71250c();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM71250c3) {
                if (!Intrinsics.areEqual(((C29054T) obj2).f58997d, "IDENTITY_VIDEO")) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() == 1 && ((listM71250c2 = m71250c()) == null || !listM71250c2.isEmpty())) {
                Iterator it = listM71250c2.iterator();
                while (it.hasNext()) {
                    if (((C29054T) it.next()).f58998e != null) {
                        List listM71250c4 = m71250c();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM71250c4, 10));
                        Iterator it2 = listM71250c4.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(C29054T.m69738a((C29054T) it2.next(), null, null, null, 1007));
                        }
                        m71244a(CollectionsKt.toMutableList((Collection) arrayList2));
                        break;
                    }
                }
            }
            if (!m71252e() || ((listM71250c = m71250c()) != null && listM71250c.isEmpty())) {
                z11 = true;
                break;
            }
            Iterator it3 = listM71250c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z11 = true;
                    break;
                }
                if (Intrinsics.areEqual(((C29054T) it3.next()).f58997d, "IDENTITY_VIDEO")) {
                    z11 = false;
                    break;
                }
            }
            List listM71250c5 = m71250c();
            if (listM71250c5 != null && listM71250c5.isEmpty()) {
                z12 = false;
                break;
            }
            Iterator it4 = listM71250c5.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z12 = false;
                    break;
                }
                C29054T c29054t2 = (C29054T) it4.next();
                if (c29054t2.f58999f && c29054t2.f58998e == IdentitySide.Front) {
                    z12 = true;
                    break;
                }
            }
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "uploading docs, parallel=" + z11 + ", hasUploadedFrontSiede=" + z12, null);
            C30311s0 c30311s0 = this.f66614f;
            c30311s0.f60936d = interfaceC30271n0;
            C30227m0 c30227m0 = new C30227m0(this.f66609a, m71236a(), m71250c(), z11, z12);
            function4 = function2;
            c32632j.f66592a = function4;
            function5 = function3;
            c32632j.f66593b = function5;
            c32632j.f66596e = 1;
            objM70145a = AbstractC30223k0.m70145a(c30311s0, c30227m0, c32632j);
            if (objM70145a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Function3 function6 = (Function3) c32632j.f66593b;
            Function2 function7 = (Function2) c32632j.f66592a;
            ResultKt.throwOnFailure(objM70145a);
            function5 = function6;
            function4 = function7;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70145a);
        }
        return Unit.INSTANCE;
        AbstractC29083a0 abstractC29083a0 = (AbstractC29083a0) objM70145a;
        C32633K c32633k = new C32633K(function5, this, null);
        C32634L c32634l = new C32634L(this, function4, function5, null);
        c32632j.f66592a = null;
        c32632j.f66593b = null;
        c32632j.f66596e = 2;
        abstractC29083a0.getClass();
        if (abstractC29083a0 instanceof C29078Z) {
            C32634L c32634l2 = (C32634L) c32634l.create((List) ((C29078Z) abstractC29083a0).f59019a, c32632j);
            obj = Unit.INSTANCE;
            objInvokeSuspend = c32634l2.invokeSuspend(obj);
            if (objInvokeSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                obj = objInvokeSuspend;
            }
        } else if (abstractC29083a0 instanceof C29074Y) {
            C32633K c32633k2 = (C32633K) c32633k.create((Exception) ((C29074Y) abstractC29083a0).f59016a, c32632j);
            obj = Unit.INSTANCE;
            objInvokeSuspend = c32633k2.invokeSuspend(obj);
            if (objInvokeSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                obj = objInvokeSuspend;
            }
        } else {
            obj = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public C30119M mo70877a(boolean z11, AbstractC29172p abstractC29172p, C29124h c29124h) {
        boolean z12;
        List listM71250c;
        C29070X type = this.f66609a.getType();
        if (type.m69748e()) {
            if (!m71250c().isEmpty() && ((listM71250c = m71250c()) == null || !listM71250c.isEmpty())) {
                Iterator it = listM71250c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C29054T) it.next()).f59002i) {
                            z12 = false;
                        }
                    }
                }
            }
            z12 = true;
        } else {
            if (!AbstractC29130i.m69773a(c29124h, type.f59014a)) {
                if (type.m69749f()) {
                    C29154m c29154mM69794a = abstractC29172p.m69794a(type);
                    if (Intrinsics.areEqual(c29154mM69794a != null ? c29154mM69794a.f59135d : null, VideoRequiredType.Disabled.getValue())) {
                    }
                }
                z12 = false;
            }
            z12 = true;
        }
        return new C30119M(m71252e(), this.f66609a, m71253f(), z12, z11, (DocCapture$PreferredMode) null, m71236a(), m71245a(abstractC29172p, z11), 16);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m71245a(AbstractC29172p abstractC29172p, boolean z11) {
        if (!m71250c().isEmpty() && (!z11 || m71250c().size() != 1)) {
            return false;
        }
        C28936t c28936t = this.f66626r;
        KProperty kProperty = f66607x[4];
        return (((Boolean) c28936t.m69705a()).booleanValue() || this.f66609a.isSubmitted() || abstractC29172p.m69800p()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.sumsub.sns.core.presentation.base.C, com.sumsub.sns.internal.features.presentation.utils.N] */
    /* JADX INFO: renamed from: a */
    public Object mo70879a(SuspendLambda suspendLambda) {
        IdentitySide identitySide = IdentitySide.Front;
        C28936t c28936t = this.f66620l.f66657c;
        KProperty kProperty = C32662m.f66654e[0];
        c28936t.f58834a.set(c28936t.f58835b, identitySide);
        List mutableList = CollectionsKt.toMutableList((Collection) m71250c());
        mutableList.clear();
        m71244a(mutableList);
        ?? r11 = this.f66621m;
        if (r11 != 0) {
            r11.mo70469b(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0269  */
    /* JADX WARN: Code duplicated, block: B:126:0x027c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0286  */
    /* JADX WARN: Code duplicated, block: B:130:0x028a  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:147:0x02da  */
    /* JADX WARN: Code duplicated, block: B:149:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x0324  */
    /* JADX WARN: Code duplicated, block: B:185:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0204 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x0165  */
    /* JADX WARN: Code duplicated, block: B:60:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0200  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f0, code lost:
    
        if (r2 == r4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
    
        if (r2 == r4) goto L155;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x012b, please report this as an issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71233a(List list, ContinuationImpl continuationImpl) {
        C32627E c32627e;
        String str;
        List list2;
        boolean z11;
        C29154m c29154m;
        InterfaceC30231D interfaceC30231D;
        ArrayList arrayList;
        Iterator it;
        Object objM70155a;
        C29307Y0 c29307y0;
        Throwable throwable;
        AbstractC28978A2 abstractC28978A2;
        Exception exc;
        C30217h0 c30217h0;
        String str2;
        String str3;
        C29307Y0 c29307y1;
        C29307Y0 c29307y2;
        boolean zM70150a;
        ArrayList arrayList2;
        Iterator it2;
        Object objM71249c;
        List list3;
        List list4;
        C29307Y0 c29307y3;
        List listEmptyList;
        Iterator it3;
        C29307Y0 c29307y4;
        List list5;
        C29307Y0 c29307y5;
        C29307Y0 c29307y6;
        C29307Y0 c29307y7;
        String str4;
        C29307Y0 c29307y8;
        String str5;
        C29307Y0 c29307y9;
        C29307Y0 c29307y10;
        C29307Y0 c29307y11;
        C29307Y0 c29307y12;
        List list6 = list;
        if (continuationImpl instanceof C32627E) {
            c32627e = (C32627E) continuationImpl;
            int i11 = c32627e.f66580f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32627e.f66580f = i11 - Integer.MIN_VALUE;
            } else {
                c32627e = new C32627E(this, continuationImpl);
            }
        } else {
            c32627e = new C32627E(this, continuationImpl);
        }
        Object objM70042a = c32627e.f66578d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32627e.f66580f;
        boolean z12 = false;
        str = null;
        String str6 = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "Data for document is uploaded. Document is " + this.f66609a.getType().f59014a + " idDocs: " + list6, null);
            C28936t c28936t = this.f66626r;
            KProperty kProperty = f66607x[4];
            c28936t.f58834a.set(c28936t.f58835b, Boolean.TRUE);
            InterfaceC29984m interfaceC29984m = this.f66611c;
            c32627e.f66575a = list6;
            c32627e.f66580f = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c32627e);
            if (objM70042a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                z11 = c32627e.f66577c;
                C29154m c29154m2 = (C29154m) c32627e.f66576b;
                List list7 = (List) c32627e.f66575a;
                ResultKt.throwOnFailure(objM70042a);
                c29154m = c29154m2;
                list2 = list7;
                interfaceC30231D = (InterfaceC30231D) objM70042a;
                if (interfaceC30231D != null) {
                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "Document requires NFC but it's unavailable, document type: " + this.f66609a.getType(), null);
                    throwable = interfaceC30231D.getThrowable();
                    if (throwable != null) {
                        exc = throwable instanceof Exception ? (Exception) throwable : null;
                        if (exc == null) {
                            exc = new Exception(throwable);
                        }
                        return new C30136g(exc);
                    }
                    abstractC28978A2 = null;
                    if (list2.size() == 1) {
                        c29307y7 = ((C30217h0) list2.get(0)).f60735b;
                        if (c29307y7 != null) {
                            str4 = c29307y7.f59316a;
                        } else {
                            str4 = null;
                        }
                        if (Intrinsics.areEqual(str4, m71247b())) {
                            c29307y8 = ((C30217h0) list2.get(0)).f60735b;
                            if (c29307y8 != null) {
                                str5 = c29307y8.f59317b;
                            } else {
                                str5 = null;
                            }
                            if (!Intrinsics.areEqual(str5, m71236a())) {
                                z12 = true;
                            }
                        } else {
                            z12 = true;
                        }
                    }
                    if (!list2.isEmpty()) {
                        it3 = list2.iterator();
                        loop0: while (it3.hasNext()) {
                            c29307y4 = ((C30217h0) it3.next()).f60735b;
                            if (c29307y4 == null) {
                            }
                        }
                    }
                    if (z11) {
                        zM70150a = AbstractC30225l0.m70150a(list2);
                        arrayList2 = new ArrayList();
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            c29307y3 = ((C30217h0) it2.next()).f60735b;
                            if (c29307y3 != null) {
                                listEmptyList = CollectionsKt.emptyList();
                            } else {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            CollectionsKt.addAll(arrayList2, listEmptyList);
                        }
                        c32627e.f66575a = list2;
                        c32627e.f66576b = arrayList2;
                        c32627e.f66577c = zM70150a;
                        c32627e.f66580f = 4;
                        objM71249c = m71249c(c32627e);
                        if (objM71249c != coroutine_suspended) {
                            list3 = arrayList2;
                            objM70042a = objM71249c;
                            list4 = list2;
                            return new C30145p(zM70150a, list3, (List) objM70042a, list4, m71247b());
                        }
                    } else {
                        if (abstractC28978A2 != null) {
                            C33272c.f67816e.f67810a.mo68955d("DocCapture", "Got MRTD seed", null);
                            return new C30138i(abstractC28978A2);
                        }
                        if (z12) {
                            c30217h0 = (C30217h0) CollectionsKt.firstOrNull(list2);
                            C30312t c30312t = this.f66612d;
                            Document document = this.f66609a;
                            if (c30217h0 != null) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            if (c30217h0 != null) {
                                str3 = null;
                            } else {
                                str3 = null;
                            }
                            c32627e.f66575a = c30217h0;
                            c32627e.f66576b = null;
                            c32627e.f66580f = 5;
                            objM70042a = c30312t.m70180a(document, str2, str3, c32627e);
                        } else {
                            return new C30141l(this.f66609a);
                        }
                    }
                } else {
                    C30251i c30251i = this.f66619k;
                    Document document2 = this.f66609a;
                    arrayList = new ArrayList();
                    it = list2.iterator();
                    while (it.hasNext()) {
                        c29307y0 = ((C30217h0) it.next()).f60735b;
                        if (c29307y0 != null) {
                            arrayList.add(c29307y0);
                        }
                    }
                    c32627e.f66575a = list2;
                    c32627e.f66576b = null;
                    c32627e.f66577c = z11;
                    c32627e.f66580f = 3;
                    objM70155a = c30251i.m70155a(document2, c29154m, arrayList, c32627e);
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    zM70150a = c32627e.f66577c;
                    List list8 = (List) c32627e.f66576b;
                    List list9 = (List) c32627e.f66575a;
                    ResultKt.throwOnFailure(objM70042a);
                    list4 = list9;
                    list3 = list8;
                    return new C30145p(zM70150a, list3, (List) objM70042a, list4, m71247b());
                }
                if (i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c30217h0 = (C30217h0) c32627e.f66575a;
                ResultKt.throwOnFailure(objM70042a);
                DocumentSideness documentSideness = (DocumentSideness) objM70042a;
                m71243a((c30217h0 == null || (c29307y12 = c30217h0.f60735b) == null) ? null : c29307y12.f59317b, (c30217h0 == null || (c29307y11 = c30217h0.f60735b) == null) ? null : c29307y11.f59316a, documentSideness);
                String str7 = (c30217h0 == null || (c29307y10 = c30217h0.f60735b) == null) ? null : c29307y10.f59317b;
                if (c30217h0 != null && (c29307y9 = c30217h0.f60735b) != null) {
                    str6 = c29307y9.f59316a;
                }
                return new C30134e(str7, str6, documentSideness);
            }
            z11 = c32627e.f66577c;
            list2 = (List) c32627e.f66575a;
            ResultKt.throwOnFailure(objM70042a);
            objM70155a = ((Result) objM70042a).getValue();
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70155a);
            if (thM103847exceptionOrNullimpl != null) {
                C33272c c33272c = C33272c.f67812a;
                C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e(AbstractC33294e.m71624a(this), "Error while extracting MRTD document", thM103847exceptionOrNullimpl);
            }
            if (Result.m103850isFailureimpl(objM70155a)) {
                objM70155a = null;
            }
            abstractC28978A2 = (AbstractC28978A2) objM70155a;
            if (list2.size() == 1) {
                c29307y7 = ((C30217h0) list2.get(0)).f60735b;
                if (c29307y7 != null) {
                    str4 = c29307y7.f59316a;
                } else {
                    str4 = null;
                }
                if (Intrinsics.areEqual(str4, m71247b())) {
                    z12 = true;
                } else {
                    c29307y8 = ((C30217h0) list2.get(0)).f60735b;
                    if (c29307y8 != null) {
                        str5 = c29307y8.f59317b;
                    } else {
                        str5 = null;
                    }
                    if (!Intrinsics.areEqual(str5, m71236a())) {
                        z12 = true;
                    }
                }
            }
            if (!list2.isEmpty()) {
                it3 = list2.iterator();
                loop0: while (it3.hasNext()) {
                    c29307y4 = ((C30217h0) it3.next()).f60735b;
                    if (c29307y4 == null && (list5 = c29307y4.f59319d) != null && !list5.isEmpty()) {
                        Iterator it4 = list5.iterator();
                        while (it4.hasNext()) {
                            if (ArraysKt.contains(f66608y, (String) it4.next())) {
                                if (!z12 || !m71251d()) {
                                    break loop0;
                                    break loop0;
                                }
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "Sideness fast fail", null);
                                C30217h0 c30217h1 = (C30217h0) CollectionsKt.firstOrNull(list2);
                                m71243a((c30217h1 == null || (c29307y6 = c30217h1.f60735b) == null) ? null : c29307y6.f59317b, (c30217h1 == null || (c29307y5 = c30217h1.f60735b) == null) ? null : c29307y5.f59316a, DocumentSideness.UNKNOWN);
                                break loop0;
                            }
                        }
                    }
                }
            }
            if (z11) {
                zM70150a = AbstractC30225l0.m70150a(list2);
                arrayList2 = new ArrayList();
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    c29307y3 = ((C30217h0) it2.next()).f60735b;
                    if (c29307y3 != null || (listEmptyList = c29307y3.f59319d) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    CollectionsKt.addAll(arrayList2, listEmptyList);
                }
                c32627e.f66575a = list2;
                c32627e.f66576b = arrayList2;
                c32627e.f66577c = zM70150a;
                c32627e.f66580f = 4;
                objM71249c = m71249c(c32627e);
                if (objM71249c != coroutine_suspended) {
                    list3 = arrayList2;
                    objM70042a = objM71249c;
                    list4 = list2;
                    return new C30145p(zM70150a, list3, (List) objM70042a, list4, m71247b());
                }
            } else {
                if (abstractC28978A2 != null) {
                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "Got MRTD seed", null);
                    return new C30138i(abstractC28978A2);
                }
                if (z12) {
                    c30217h0 = (C30217h0) CollectionsKt.firstOrNull(list2);
                    C30312t c30312t2 = this.f66612d;
                    Document document3 = this.f66609a;
                    if (c30217h0 != null || (c29307y2 = c30217h0.f60735b) == null) {
                        str2 = null;
                    } else {
                        str2 = c29307y2.f59317b;
                    }
                    if (c30217h0 != null || (c29307y1 = c30217h0.f60735b) == null) {
                        str3 = null;
                    } else {
                        str3 = c29307y1.f59316a;
                    }
                    c32627e.f66575a = c30217h0;
                    c32627e.f66576b = null;
                    c32627e.f66580f = 5;
                    objM70042a = c30312t2.m70180a(document3, str2, str3, c32627e);
                } else {
                    return new C30141l(this.f66609a);
                }
            }
            return coroutine_suspended;
        }
        list6 = (List) c32627e.f66575a;
        ResultKt.throwOnFailure(objM70042a);
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p != null) {
            C29154m c29154mM69794a = abstractC29172p.m69794a(this.f66609a.getType());
            if (c29154mM69794a != null) {
                boolean zM70150a2 = AbstractC30225l0.m70150a(list6);
                C30243e c30243e = this.f66618j;
                Document document4 = this.f66609a;
                Iterator it5 = list6.iterator();
                do {
                    if (!it5.hasNext()) {
                        str = null;
                        break;
                    }
                    C29307Y0 c29307y13 = ((C30217h0) it5.next()).f60735b;
                    str = c29307y13 != null ? c29307y13.f59320e : null;
                } while (str == null);
                c32627e.f66575a = list6;
                c32627e.f66576b = c29154mM69794a;
                c32627e.f66577c = zM70150a2;
                c32627e.f66580f = 2;
                Object objM70153a = c30243e.m70153a(document4, str, c32627e);
                if (objM70153a != coroutine_suspended) {
                    list2 = list6;
                    z11 = zM70150a2;
                    objM70042a = objM70153a;
                    c29154m = c29154mM69794a;
                    interfaceC30231D = (InterfaceC30231D) objM70042a;
                    if (interfaceC30231D != null) {
                        C33272c.f67816e.f67810a.mo68955d("DocCapture", "Document requires NFC but it's unavailable, document type: " + this.f66609a.getType(), null);
                        throwable = interfaceC30231D.getThrowable();
                        if (throwable != null) {
                            if (throwable instanceof Exception) {
                            }
                            if (exc == null) {
                                exc = new Exception(throwable);
                            }
                            return new C30136g(exc);
                        }
                        abstractC28978A2 = null;
                        if (list2.size() == 1) {
                            c29307y7 = ((C30217h0) list2.get(0)).f60735b;
                            if (c29307y7 != null) {
                                str4 = c29307y7.f59316a;
                            } else {
                                str4 = null;
                            }
                            if (Intrinsics.areEqual(str4, m71247b())) {
                                z12 = true;
                            } else {
                                c29307y8 = ((C30217h0) list2.get(0)).f60735b;
                                if (c29307y8 != null) {
                                    str5 = c29307y8.f59317b;
                                } else {
                                    str5 = null;
                                }
                                if (!Intrinsics.areEqual(str5, m71236a())) {
                                    z12 = true;
                                }
                            }
                        }
                        if (!list2.isEmpty()) {
                            it3 = list2.iterator();
                            loop0: while (it3.hasNext()) {
                                c29307y4 = ((C30217h0) it3.next()).f60735b;
                                if (c29307y4 == null) {
                                }
                            }
                        }
                        if (z11) {
                            zM70150a = AbstractC30225l0.m70150a(list2);
                            arrayList2 = new ArrayList();
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                c29307y3 = ((C30217h0) it2.next()).f60735b;
                                if (c29307y3 != null) {
                                    listEmptyList = CollectionsKt.emptyList();
                                } else {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                CollectionsKt.addAll(arrayList2, listEmptyList);
                            }
                            c32627e.f66575a = list2;
                            c32627e.f66576b = arrayList2;
                            c32627e.f66577c = zM70150a;
                            c32627e.f66580f = 4;
                            objM71249c = m71249c(c32627e);
                            if (objM71249c != coroutine_suspended) {
                                list3 = arrayList2;
                                objM70042a = objM71249c;
                                list4 = list2;
                                return new C30145p(zM70150a, list3, (List) objM70042a, list4, m71247b());
                            }
                        } else {
                            if (abstractC28978A2 != null) {
                                C33272c.f67816e.f67810a.mo68955d("DocCapture", "Got MRTD seed", null);
                                return new C30138i(abstractC28978A2);
                            }
                            if (z12) {
                                c30217h0 = (C30217h0) CollectionsKt.firstOrNull(list2);
                                C30312t c30312t3 = this.f66612d;
                                Document document5 = this.f66609a;
                                if (c30217h0 != null) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                }
                                if (c30217h0 != null) {
                                    str3 = null;
                                } else {
                                    str3 = null;
                                }
                                c32627e.f66575a = c30217h0;
                                c32627e.f66576b = null;
                                c32627e.f66580f = 5;
                                objM70042a = c30312t3.m70180a(document5, str2, str3, c32627e);
                            } else {
                                return new C30141l(this.f66609a);
                            }
                        }
                    } else {
                        C30251i c30251i2 = this.f66619k;
                        Document document6 = this.f66609a;
                        arrayList = new ArrayList();
                        it = list2.iterator();
                        while (it.hasNext()) {
                            c29307y0 = ((C30217h0) it.next()).f60735b;
                            if (c29307y0 != null) {
                                arrayList.add(c29307y0);
                            }
                        }
                        c32627e.f66575a = list2;
                        c32627e.f66576b = null;
                        c32627e.f66577c = z11;
                        c32627e.f66580f = 3;
                        objM70155a = c30251i2.m70155a(document6, c29154m, arrayList, c32627e);
                    }
                }
                return coroutine_suspended;
            }
            C33272c c33272c2 = C33272c.f67812a;
            Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), AbstractC33294e.m71624a(this), "docSetItem null!", null, 4, null);
            throw new IllegalStateException("docSetItem is null");
        }
        C33272c c33272c3 = C33272c.f67812a;
        Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), AbstractC33294e.m71624a(this), "applicant null!", null, 4, null);
        throw new IllegalStateException("Applicant is null");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:57:0x0169  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e6 -> B:17:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0145 -> B:53:0x0149). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m71231a(java.util.List r17, int r18, p852kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.utils.C32635M.m71231a(java.util.List, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m71224a(C32635M c32635m, List list, ContinuationImpl continuationImpl, int i11) {
        if ((i11 & 1) != 0) {
            list = c32635m.m71250c();
        }
        return c32635m.m71231a(list, (i11 & 2) != 0 ? 1920 : 200, continuationImpl);
    }

    /* JADX INFO: renamed from: a */
    public final void m71238a(int i11, File file) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "onPhotoRotationChanged: " + file.getName() + " -> " + i11, null);
        String absolutePath = file.getAbsolutePath();
        C28936t c28936t = this.f66627s;
        KProperty[] kPropertyArr = f66607x;
        KProperty kProperty = kPropertyArr[5];
        Map mutableMap = MapsKt.toMutableMap((Map) c28936t.m69705a());
        if (((C30132c) mutableMap.get(absolutePath)) != null) {
            mutableMap.put(absolutePath, new C30132c(i11));
        }
        C28936t c28936t2 = this.f66627s;
        KProperty kProperty2 = kPropertyArr[5];
        c28936t2.f58834a.set(c28936t2.f58835b, mutableMap);
    }

    /* JADX INFO: renamed from: a */
    public final void m71243a(String str, String str2, DocumentSideness documentSideness) {
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "Try apply new country=" + str + " and idDocType=" + str2, null);
        if (str != null) {
            C28936t c28936t = this.f66628t;
            KProperty kProperty = f66607x[6];
            c28936t.f58834a.set(c28936t.f58835b, str);
        }
        if (str2 != null) {
            C28936t c28936t2 = this.f66629u;
            KProperty kProperty2 = f66607x[7];
            c28936t2.f58834a.set(c28936t2.f58835b, str2);
        }
        C28936t c28936t3 = this.f66620l.f66658d;
        KProperty kProperty3 = C32662m.f66654e[1];
        c28936t3.f58834a.set(c28936t3.f58835b, documentSideness);
        List listM71250c = m71250c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM71250c, 10));
        Iterator it = listM71250c.iterator();
        while (it.hasNext()) {
            arrayList.add(C29054T.m69738a((C29054T) it.next(), m71236a(), m71247b(), null, 979));
        }
        m71244a(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71229a(C29054T c29054t, int i11, ContinuationImpl continuationImpl) {
        C32669t c32669t;
        if (continuationImpl instanceof C32669t) {
            c32669t = (C32669t) continuationImpl;
            int i12 = c32669t.f66676c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c32669t.f66676c = i12 - Integer.MIN_VALUE;
            } else {
                c32669t = new C32669t(this, continuationImpl);
            }
        } else {
            c32669t = new C32669t(this, continuationImpl);
        }
        Object objM91049g = c32669t.f66674a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c32669t.f66676c;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(objM91049g);
                File file = c29054t.f58994a;
                if (file == null) {
                    return null;
                }
                c32669t.f66676c = 1;
                objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28510y0(file, i11, null), c32669t);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM91049g);
            }
            return (Bitmap) objM91049g;
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(this);
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, th2);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "Can't decode image", th2);
            C41696j.m91104d(C41726q1.f91773b, C41685g2.f91735b, null, new C32670u(th2, null), 2, null);
            return null;
        }
    }
}
