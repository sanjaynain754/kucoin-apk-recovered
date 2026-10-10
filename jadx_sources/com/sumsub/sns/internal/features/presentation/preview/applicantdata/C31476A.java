package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28432Z0;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.C28803j;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28843f0;
import com.sumsub.sns.internal.core.presentation.form.model.C28823Q;
import com.sumsub.sns.internal.core.presentation.form.model.C28831Z;
import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.core.presentation.form.model.C28867y;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28985C;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28990D;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29013I1;
import com.sumsub.sns.internal.features.data.model.common.C29021K1;
import com.sumsub.sns.internal.features.data.model.common.C29045Q1;
import com.sumsub.sns.internal.features.data.model.common.C29051S0;
import com.sumsub.sns.internal.features.data.model.common.C29059U0;
import com.sumsub.sns.internal.features.data.model.common.C29060U1;
import com.sumsub.sns.internal.features.data.model.common.C29067W0;
import com.sumsub.sns.internal.features.data.model.common.C29068W1;
import com.sumsub.sns.internal.features.data.model.common.C29076Y1;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.data.model.common.C29699u;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.C29275R3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29305X3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29310Y3;
import com.sumsub.sns.internal.features.data.model.common.remote.C29420n;
import com.sumsub.sns.internal.features.data.model.common.remote.C29427o;
import com.sumsub.sns.internal.features.data.model.common.remote.C29661w;
import com.sumsub.sns.internal.features.data.model.common.remote.C29675y;
import com.sumsub.sns.internal.features.data.model.common.remote.InterfaceC29434p;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30226m;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.domain.appdata.C30094a;
import com.sumsub.sns.internal.features.domain.appdata.C30095b;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h;
import com.sumsub.sns.internal.features.presentation.utils.AbstractC32651f;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31476A extends AbstractC31739h implements InterfaceC28804k {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ KProperty[] f63854s = {AbstractC28639a.m69485a(C31476A.class, "bestGuessCountry", "getBestGuessCountry()Ljava/lang/String;", 0), AbstractC28639a.m69485a(C31476A.class, "fieldValueCache", "getFieldValueCache()Ljava/util/Map;", 0), AbstractC28639a.m69485a(C31476A.class, "initialFieldValueCache", "getInitialFieldValueCache()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: g */
    public final C28432Z0 f63855g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC29921d f63856h;

    /* JADX INFO: renamed from: i */
    public C30095b f63857i;

    /* JADX INFO: renamed from: j */
    public final boolean f63858j;

    /* JADX INFO: renamed from: k */
    public final C28936t f63859k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41669n f63860l;

    /* JADX INFO: renamed from: m */
    public final C31495m f63861m;

    /* JADX INFO: renamed from: n */
    public List f63862n;

    /* JADX INFO: renamed from: o */
    public List f63863o;

    /* JADX INFO: renamed from: p */
    public final C28936t f63864p;

    /* JADX INFO: renamed from: q */
    public final C28936t f63865q;

    /* JADX INFO: renamed from: r */
    public final C31481F f63866r;

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69616a() {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final InterfaceC28805l mo69622b() {
        return this.f63861m;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69617a(AbstractC28841e0 abstractC28841e0) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final void mo69623b(AbstractC28841e0 abstractC28841e0, String str) {
        AbstractC29103d2 abstractC29103d2M69736a;
        C31482a.m70753a("onFieldValueChanged: " + abstractC28841e0.m69653j() + " -> " + (str != null ? Integer.valueOf(str.length()) : null));
        Map mapM70747e = m70747e();
        String str2 = abstractC28841e0.mo69642c().f59466a;
        if (str2 == null) {
            str2 = "";
        }
        m70744a(AbstractC28458h.m69338a(mapM70747e, str2, str));
        String str3 = abstractC28841e0.mo69642c().f59466a;
        if (str3 != null) {
            AbstractC29103d2.Companion.getClass();
            abstractC29103d2M69736a = C29051S0.m69736a(str3);
        } else {
            abstractC29103d2M69736a = null;
        }
        if (Intrinsics.areEqual(abstractC29103d2M69736a, C29067W0.f59009b)) {
            m70744a(AbstractC28458h.m69338a(m70747e(), "stateOfBirth", (String) null));
        } else {
            C29059U0 c29059u0 = C29059U0.f59007b;
            if (Intrinsics.areEqual(abstractC29103d2M69736a, c29059u0)) {
                m70744a(AbstractC28458h.m69338a(m70747e(), "state", (String) null));
            } else if (!Intrinsics.areEqual(abstractC29103d2M69736a, c29059u0) && !Intrinsics.areEqual(abstractC29103d2M69736a, C29045Q1.f58981b) && !(abstractC29103d2M69736a instanceof C29060U1)) {
                m70745b(abstractC28841e0);
                return;
            }
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31499q(this, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: c */
    public final void mo70746c(boolean z11) {
        AbstractC28073M0.updateState$default(this, false, new C31507y(z11, null), 1, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w mo69624d() {
        return this.f63860l;
    }

    /* JADX INFO: renamed from: e */
    public final Map m70747e() {
        C28936t c28936t = this.f63864p;
        KProperty kProperty = f63854s[1];
        return (Map) c28936t.m69705a();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return new C31494l(CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null, false);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onHandleError(AbstractC29149l0 abstractC29149l0) {
        if (!(abstractC29149l0 instanceof C29131i0) || !(((C29131i0) abstractC29149l0).f59094b instanceof C31493k)) {
            super.onHandleError(abstractC29149l0);
        } else {
            C31482a.m70753a("submitApplicantData");
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31503u(this, null), 3, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final Object onPrepare(Continuation continuation) {
        AbstractC28073M0.updateState$default(this, false, new C31500r(this, null), 1, null);
        onLoad();
        return Unit.INSTANCE;
    }

    public C31476A(Document document, SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C30156e c30156e, C28432Z0 c28432z0, InterfaceC29921d interfaceC29921d) {
        super(document, savedStateHandle, interfaceC29953a, interfaceC29984m, c30156e);
        this.f63855g = c28432z0;
        this.f63856h = interfaceC29921d;
        this.f63858j = C33048a.f67481n.m71434a();
        this.f63859k = new C28936t(savedStateHandle, "KEY_COUNTRY", null, false);
        this.f63860l = C41679x.m91009a(new C28799f(0, CollectionsKt.emptyList(), null, new C28803j()));
        this.f63861m = new C31495m(this);
        this.f63864p = new C28936t(savedStateHandle, "KEY_FIELD_CACHE", MapsKt.emptyMap(), false);
        this.f63865q = new C28936t(savedStateHandle, "KEY_INITIAL_FIELD_CACHE", MapsKt.emptyMap(), false);
        this.f63866r = new C31481F();
        AbstractC28421U.m69306b(getViewState(), ViewModelKt.getViewModelScope(this), new C31491i(this, null));
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69618a(AbstractC28841e0 abstractC28841e0, String str) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69619a(AbstractC28841e0 abstractC28841e0, List list) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final boolean mo69621a(String str) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m70744a(Map map) {
        C28936t c28936t = this.f63864p;
        KProperty kProperty = f63854s[1];
        c28936t.f58834a.set(c28936t.f58835b, map);
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    public final void mo70743a(C30270n c30270n) {
        this.f64480e = c30270n.f60854a;
        this.f64481f = c30270n.f60856c;
        C30226m c30226m = c30270n.f60859f;
        String str = c30226m.f60757b;
        if (str == null && (str = c30226m.f60756a) == null) {
            str = c30226m.f60758c;
        }
        C28936t c28936t = this.f63859k;
        KProperty kProperty = f63854s[0];
        c28936t.f58834a.set(c28936t.f58835b, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h
    /* JADX INFO: renamed from: a */
    public final Object mo70740a(AbstractC29172p abstractC29172p, C29124h c29124h, Continuation continuation) {
        C31497o c31497o;
        Object objM70023d;
        AbstractC29172p abstractC29172p2;
        C29124h c29124h2;
        int i11;
        Map mapEmptyMap;
        Map mapEmptyMap2;
        Map map;
        Object next;
        List list;
        String str;
        String str2;
        List list2;
        Integer numValueOf;
        if (continuation instanceof C31497o) {
            c31497o = (C31497o) continuation;
            int i12 = c31497o.f63906e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c31497o.f63906e = i12 - Integer.MIN_VALUE;
            } else {
                c31497o = new C31497o(this, (ContinuationImpl) continuation);
            }
        } else {
            c31497o = new C31497o(this, (ContinuationImpl) continuation);
        }
        Object obj = c31497o.f63904c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c31497o.f63906e;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC29921d interfaceC29921d = this.f63856h;
            c31497o.f63902a = abstractC29172p;
            c31497o.f63903b = c29124h;
            c31497o.f63906e = 1;
            objM70023d = ((C29950z) interfaceC29921d).m70023d(c31497o);
            if (objM70023d == coroutine_suspended) {
                return coroutine_suspended;
            }
            abstractC29172p2 = abstractC29172p;
            c29124h2 = c29124h;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C29124h c29124h3 = c31497o.f63903b;
            AbstractC29172p abstractC29172p3 = c31497o.f63902a;
            ResultKt.throwOnFailure(obj);
            objM70023d = ((Result) obj).getValue();
            abstractC29172p2 = abstractC29172p3;
            c29124h2 = c29124h3;
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70023d);
        if (thM103847exceptionOrNullimpl == null) {
            C31482a.m70753a("ApplicantData form loaded");
            List<C29661w> list3 = ((C29675y) objM70023d).f59729a;
            ArrayList arrayList = new ArrayList();
            Iterator it = list3.iterator();
            while (true) {
                i11 = 0;
                if (!it.hasNext()) {
                    break;
                }
                C29661w c29661w = (C29661w) it.next();
                if (!StringsKt.startsWith$default(c29661w.f59718b, "custom.", false, 2, (Object) null)) {
                    C29051S0 c29051s0 = AbstractC29103d2.Companion;
                    String str3 = c29661w.f59718b;
                    c29051s0.getClass();
                    arrayList.add(new C29719y(C29051S0.m69736a(str3), c29661w.f59719c, null, Boxing.boxBoolean(c29661w.f59720d), 380));
                    C31481F c31481f = this.f63866r;
                    Map mapM70747e = m70747e();
                    c31481f.getClass();
                    if (Intrinsics.areEqual(C29051S0.m69736a(c29661w.f59718b), C29068W1.f59010b)) {
                        Set setKeySet = mapM70747e.keySet();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
                        Iterator it2 = setKeySet.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(C29051S0.m69736a((String) it2.next()));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            AbstractC29103d2 abstractC29103d2 = (AbstractC29103d2) obj2;
                            if (abstractC29103d2 instanceof C29076Y1) {
                                numValueOf = Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b);
                            } else {
                                numValueOf = abstractC29103d2 instanceof C29060U1 ? Integer.valueOf(((C29060U1) abstractC29103d2).f59008b) : null;
                            }
                            if (numValueOf != null) {
                                arrayList3.add(numValueOf);
                            }
                        }
                        List listDistinct = CollectionsKt.distinct(CollectionsKt.sorted(arrayList3));
                        if (listDistinct.isEmpty()) {
                            InterfaceC29434p interfaceC29434p = c29661w.f59721e;
                            C29427o c29427o = interfaceC29434p instanceof C29427o ? (C29427o) interfaceC29434p : null;
                            int iMax = Math.max((c29427o == null || (list2 = c29427o.f59426a) == null) ? 0 : list2.size(), 1);
                            while (i11 < iMax) {
                                C31481F.m70752a(arrayList, i11, null);
                                i11++;
                            }
                        } else {
                            Iterator it3 = listDistinct.iterator();
                            while (it3.hasNext()) {
                                C31481F.m70752a(arrayList, ((Number) it3.next()).intValue(), null);
                            }
                        }
                    }
                } else {
                    String str4 = c29661w.f59718b;
                    String str5 = c29661w.f59717a;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    Boxing.boxBoolean(arrayList.add(new C29699u(str4, str5, Boxing.boxBoolean(c29661w.f59719c))));
                }
            }
            this.f63862n = list3;
            this.f63863o = arrayList;
            if (m70747e().isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C29661w c29661w2 : list3) {
                    InterfaceC29434p interfaceC29434p2 = c29661w2.f59721e;
                    if (interfaceC29434p2 instanceof C29420n) {
                        str2 = ((C29420n) interfaceC29434p2).f59418a;
                    } else {
                        if (!(interfaceC29434p2 instanceof C29427o) && interfaceC29434p2 != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = null;
                    }
                    if (str2 != null) {
                        linkedHashMap.put(c29661w2.f59718b, str2);
                    }
                }
                this.f63866r.getClass();
                Iterator it4 = list3.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    C29051S0 c29051s1 = AbstractC29103d2.Companion;
                    str = ((C29661w) next).f59718b;
                    c29051s1.getClass();
                } while (!Intrinsics.areEqual(C29051S0.m69736a(str), C29068W1.f59010b));
                C29661w c29661w3 = (C29661w) next;
                if (c29661w3 != null) {
                    InterfaceC29434p interfaceC29434p3 = c29661w3.f59721e;
                    C29427o c29427o2 = interfaceC29434p3 instanceof C29427o ? (C29427o) interfaceC29434p3 : null;
                    if (c29427o2 != null && (list = c29427o2.f59426a) != null) {
                        for (Object obj3 : list) {
                            int i15 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            C29275R3 c29275r3 = (C29275R3) obj3;
                            String str6 = new C29060U1(i11).f59051a;
                            String str7 = new C29076Y1(i11).f59051a;
                            String str8 = c29275r3.f59264a;
                            if (str8 != null) {
                                linkedHashMap.put(str6, str8);
                            }
                            String str9 = c29275r3.f59265b;
                            if (str9 != null) {
                                linkedHashMap.put(str7, str9);
                            }
                            i11 = i15;
                        }
                    }
                }
                m70744a(linkedHashMap);
                C28936t c28936t = this.f63865q;
                KProperty kProperty = f63854s[2];
                c28936t.f58834a.set(c28936t.f58835b, linkedHashMap);
            }
            if (c29124h2 != null && (map = c29124h2.f59076i) != null) {
                this.f63855g.m69316a(map);
            }
            Map mapEmptyMap3 = this.f64481f;
            if (mapEmptyMap3 == null) {
                mapEmptyMap3 = MapsKt.emptyMap();
            }
            Map map2 = mapEmptyMap3;
            Map mapEmptyMap4 = this.f64480e;
            if (mapEmptyMap4 == null) {
                mapEmptyMap4 = MapsKt.emptyMap();
            }
            Map map3 = mapEmptyMap4;
            if (c29124h2 == null || (mapEmptyMap = AbstractC29130i.m69781g(c29124h2)) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Map map4 = mapEmptyMap;
            if (c29124h2 == null || (mapEmptyMap2 = c29124h2.f59077j) == null) {
                mapEmptyMap2 = MapsKt.emptyMap();
            }
            this.f63857i = new C30095b(abstractC29172p2, c29124h2, map4, map2, map3, mapEmptyMap2);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31498p(this, null), 3, null);
            return Unit.INSTANCE;
        }
        C33272c.f67816e.f67810a.mo68956e("AppData", "Error loading ApplicantData form: " + thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
        AbstractC31739h.m70853a(this, thM103847exceptionOrNullimpl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final void m70745b(AbstractC28841e0 abstractC28841e0) {
        CharSequence charSequenceMo69641b;
        C28799f c28799f = (C28799f) this.f63860l.getValue();
        C28801h c28801h = (C28801h) CollectionsKt.getOrNull(c28799f.f58567b, c28799f.f58566a);
        if (c28801h == null) {
            return;
        }
        List<AbstractC28841e0> list = c28801h.f58573d;
        if (list == null || !list.isEmpty()) {
            for (AbstractC28841e0 abstractC28841e1 : list) {
                if (Intrinsics.areEqual(AbstractC28843f0.m69656a(abstractC28841e1), AbstractC28843f0.m69656a(abstractC28841e0)) && (charSequenceMo69641b = abstractC28841e1.mo69641b()) != null && charSequenceMo69641b.length() != 0) {
                    C31482a.m70753a("resetting field error: " + AbstractC28843f0.m69656a(abstractC28841e0));
                    AbstractC28073M0.updateState$default(this, false, new C31506x(abstractC28841e0, null), 1, null);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x021b  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:169:0x030f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0316  */
    /* JADX WARN: Code duplicated, block: B:175:0x0319 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x033a  */
    /* JADX WARN: Code duplicated, block: B:182:0x036e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0370  */
    /* JADX WARN: Code duplicated, block: B:193:0x038b  */
    /* JADX WARN: Code duplicated, block: B:208:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:210:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:227:0x0439  */
    /* JADX WARN: Code duplicated, block: B:264:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Object m70742a(List list, ContinuationImpl continuationImpl) {
        C31504v c31504v;
        List list2;
        Object strings;
        Map map;
        int i11;
        Object obj;
        int i12;
        C31479D c31479d;
        List list3;
        List list4;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i13;
        String strM70748a;
        CharSequence charSequence;
        Object next;
        CharSequence charSequence2;
        int i14;
        int i15;
        Boolean boolValueOf;
        C29719y c29719y;
        C29983l c29983l;
        AbstractC29103d2 abstractC29103d2;
        boolean zContains;
        boolean z11;
        AbstractC29103d2 abstractC29103d3;
        int i16;
        Object next2;
        LinkedHashMap linkedHashMap;
        Pair pairM90091to;
        if (continuationImpl instanceof C31504v) {
            c31504v = (C31504v) continuationImpl;
            int i17 = c31504v.f63924d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                c31504v.f63924d = i17 - Integer.MIN_VALUE;
            } else {
                c31504v = new C31504v(this, continuationImpl);
            }
        } else {
            c31504v = new C31504v(this, continuationImpl);
        }
        Object obj2 = c31504v.f63922b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i18 = c31504v.f63924d;
        if (i18 == 0) {
            ResultKt.throwOnFailure(obj2);
            list2 = list;
            c31504v.f63921a = list2;
            c31504v.f63924d = 1;
            strings = getStrings(c31504v);
            if (strings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i18 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list5 = c31504v.f63921a;
            ResultKt.throwOnFailure(obj2);
            strings = obj2;
            list2 = list5;
        }
        C29983l c29983l2 = (C29983l) strings;
        C29124h config = getConfig();
        if (config == null) {
            map = null;
        } else {
            Map map2 = config.f59071d;
            Object obj3 = map2 != null ? map2.get("customFields") : null;
            Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
            if (map3 != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map3.entrySet()) {
                    if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap == null || !(!linkedHashMap.isEmpty())) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str = (String) key;
                    if (str == null) {
                        pairM90091to = null;
                    } else {
                        Object value = entry2.getValue();
                        if (!(value instanceof String)) {
                            value = null;
                        }
                        String str2 = (String) value;
                        if (str2 == null) {
                            pairM90091to = null;
                        } else {
                            pairM90091to = TuplesKt.m90091to(str, str2);
                        }
                    }
                    if (pairM90091to != null) {
                        arrayList3.add(pairM90091to);
                    }
                }
                map = MapsKt.toMap(arrayList3);
            } else {
                map = null;
            }
        }
        List list6 = this.f63863o;
        C30095b c30095b = this.f63857i;
        if (list6 != null && c30095b != null) {
            Map mapM70747e = m70747e();
            C28936t c28936t = this.f63859k;
            int i19 = 0;
            KProperty kProperty = f63854s[0];
            m70744a(AbstractC32651f.m71274a(list6, mapM70747e, (String) c28936t.m69705a(), c30095b));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list6) {
                if (obj4 instanceof C29719y) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            C31481F c31481f = this.f63866r;
            List listEmptyList = this.f63862n;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            c31481f.getClass();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : list6) {
                if (obj5 instanceof C29719y) {
                    arrayList6.add(obj5);
                }
            }
            int size = arrayList6.size();
            int i21 = 0;
            while (true) {
                if (i21 >= size) {
                    i11 = i19;
                    obj = null;
                    break;
                }
                obj = arrayList6.get(i21);
                i21++;
                i11 = i19;
                if (Intrinsics.areEqual(((C29719y) obj).f59781b, C29068W1.f59010b)) {
                    break;
                }
                i19 = i11;
            }
            C29719y c29719y2 = (C29719y) obj;
            if (c29719y2 == null) {
                c31479d = null;
            } else {
                if (arrayList6.isEmpty()) {
                    i12 = i11;
                } else {
                    int size2 = arrayList6.size();
                    int i22 = i11;
                    i12 = i22;
                    while (i22 < size2) {
                        Object obj6 = arrayList6.get(i22);
                        i22++;
                        if ((((C29719y) obj6).f59781b instanceof C29076Y1) && (i12 = i12 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                c31479d = new C31479D(c29983l2, c29719y2, i12, C31481F.m70751a(listEmptyList));
            }
            int i23 = i11;
            for (Object obj7 : list6) {
                int i24 = i23 + 1;
                if (i23 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AbstractC28990D abstractC28990D = (AbstractC28990D) obj7;
                AbstractC28990D abstractC28990D2 = (AbstractC28990D) CollectionsKt.getOrNull(list6, i24);
                if (abstractC28990D instanceof C29719y) {
                    C29719y c29719y3 = (C29719y) abstractC28990D;
                    C28936t c28936t2 = this.f63859k;
                    KProperty kProperty2 = f63854s[i11];
                    String str3 = (String) c28936t2.m69705a();
                    C29124h config2 = getConfig();
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                        } while (!Intrinsics.areEqual(((C30094a) next2).f60488a, abstractC28990D));
                        C30094a c30094a = (C30094a) next2;
                        if (c30094a != null) {
                            charSequence2 = c30094a.f60489b;
                        } else {
                            charSequence2 = null;
                        }
                    } else {
                        charSequence2 = null;
                    }
                    Map mapM70747e2 = m70747e();
                    list3 = list2;
                    C28936t c28936t3 = this.f63865q;
                    KProperty kProperty3 = f63854s[2];
                    Map map4 = (Map) c28936t3.m69705a();
                    if (this.f63858j) {
                        AbstractC29103d2 abstractC29103d4 = c29719y3.f59781b;
                        list4 = list6;
                        if (Intrinsics.areEqual(abstractC29103d4, C29021K1.f58964b)) {
                            if (!arrayList4.isEmpty()) {
                                int size3 = arrayList4.size();
                                int i25 = i11;
                                while (true) {
                                    if (i25 < size3) {
                                        Object obj8 = arrayList4.get(i25);
                                        int i26 = i25 + 1;
                                        int i27 = size3;
                                        if (Intrinsics.areEqual(((C29719y) obj8).f59781b, C29067W0.f59009b)) {
                                            i14 = 1;
                                        } else {
                                            i25 = i26;
                                            size3 = i27;
                                        }
                                    }
                                }
                            }
                        } else if (Intrinsics.areEqual(abstractC29103d4, C29013I1.f58955b) && !arrayList4.isEmpty()) {
                            int size4 = arrayList4.size();
                            int i28 = i11;
                            while (true) {
                                if (i28 < size4) {
                                    Object obj9 = arrayList4.get(i28);
                                    int i29 = i28 + 1;
                                    int i31 = size4;
                                    if (Intrinsics.areEqual(((C29719y) obj9).f59781b, C29059U0.f59007b)) {
                                        i14 = 1;
                                    } else {
                                        i28 = i29;
                                        size4 = i31;
                                    }
                                }
                            }
                        }
                        if (c31479d != null) {
                            abstractC29103d3 = c29719y3.f59781b;
                            i15 = i14;
                            if (abstractC29103d3 instanceof C29060U1) {
                                i16 = ((C29060U1) abstractC29103d3).f59008b;
                            } else {
                                if (abstractC29103d3 instanceof C29076Y1) {
                                    i16 = ((C29076Y1) abstractC29103d3).f59018b;
                                }
                                Boolean bool = boolValueOf;
                                arrayList2 = arrayList5;
                                CharSequence charSequence3 = charSequence2;
                                arrayList = arrayList4;
                                boolean z12 = i15;
                                i13 = i24;
                                arrayList2.add(AbstractC32651f.m71269a(c29719y3, str3, config2, c30095b, c29983l2, null, charSequence3, z12, bool, mapM70747e2, map4));
                                if (c31479d != null) {
                                    c29719y = c31479d.f63870b;
                                    c29983l = c31479d.f63869a;
                                    abstractC29103d2 = c29719y3.f59781b;
                                    if (abstractC29103d2 instanceof C29076Y1) {
                                        zContains = c31479d.f63872d.contains(Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b));
                                        if (c31479d.f63871c <= 1 || !c29719y.f59782c) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (!zContains && z11) {
                                            arrayList2.add(C31479D.m70749a(((C29076Y1) c29719y3.f59781b).f59018b, c29719y3.mo69727c(), c29983l));
                                            arrayList2.add(new C28867y("appdata"));
                                        }
                                    }
                                    if (c29719y3.f59781b instanceof C29068W1) {
                                        c31479d.f63873e = true;
                                        arrayList2.add(new C28823Q(new C29470F((String) null, c29983l.m70061a("sns_data_tax_information_title"), c29983l.m70061a("sns_data_tax_information_subtitle"), (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1017), "appdata"));
                                    }
                                    if (!c31479d.f63873e) {
                                        if (abstractC28990D2 == null && (abstractC28990D2 instanceof C29719y)) {
                                            AbstractC29103d2 abstractC29103d5 = ((C29719y) abstractC28990D2).f59781b;
                                            if (!Intrinsics.areEqual(abstractC29103d5, C29068W1.f59010b) && !(abstractC29103d5 instanceof C29076Y1) && !(abstractC29103d5 instanceof C29060U1)) {
                                                arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                                c31479d.f63873e = false;
                                            }
                                        } else {
                                            arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                            c31479d.f63873e = false;
                                        }
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(c31479d.f63872d.contains(Integer.valueOf(i16)));
                            Boolean bool2 = boolValueOf;
                            arrayList2 = arrayList5;
                            CharSequence charSequence4 = charSequence2;
                            arrayList = arrayList4;
                            boolean z13 = i15;
                            i13 = i24;
                            arrayList2.add(AbstractC32651f.m71269a(c29719y3, str3, config2, c30095b, c29983l2, null, charSequence4, z13, bool2, mapM70747e2, map4));
                            if (c31479d != null) {
                                c29719y = c31479d.f63870b;
                                c29983l = c31479d.f63869a;
                                abstractC29103d2 = c29719y3.f59781b;
                                if (abstractC29103d2 instanceof C29076Y1) {
                                    zContains = c31479d.f63872d.contains(Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b));
                                    if (c31479d.f63871c <= 1) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    if (!zContains) {
                                        arrayList2.add(C31479D.m70749a(((C29076Y1) c29719y3.f59781b).f59018b, c29719y3.mo69727c(), c29983l));
                                        arrayList2.add(new C28867y("appdata"));
                                    }
                                }
                                if (c29719y3.f59781b instanceof C29068W1) {
                                    c31479d.f63873e = true;
                                    arrayList2.add(new C28823Q(new C29470F((String) null, c29983l.m70061a("sns_data_tax_information_title"), c29983l.m70061a("sns_data_tax_information_subtitle"), (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1017), "appdata"));
                                }
                                if (!c31479d.f63873e) {
                                    if (abstractC28990D2 == null) {
                                        arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                        c31479d.f63873e = false;
                                    } else {
                                        arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                        c31479d.f63873e = false;
                                    }
                                }
                            }
                        } else {
                            i15 = i14;
                        }
                        boolValueOf = null;
                        Boolean bool3 = boolValueOf;
                        arrayList2 = arrayList5;
                        CharSequence charSequence5 = charSequence2;
                        arrayList = arrayList4;
                        boolean z14 = i15;
                        i13 = i24;
                        arrayList2.add(AbstractC32651f.m71269a(c29719y3, str3, config2, c30095b, c29983l2, null, charSequence5, z14, bool3, mapM70747e2, map4));
                        if (c31479d != null) {
                            c29719y = c31479d.f63870b;
                            c29983l = c31479d.f63869a;
                            abstractC29103d2 = c29719y3.f59781b;
                            if (abstractC29103d2 instanceof C29076Y1) {
                                zContains = c31479d.f63872d.contains(Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b));
                                if (c31479d.f63871c <= 1) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                if (!zContains) {
                                    arrayList2.add(C31479D.m70749a(((C29076Y1) c29719y3.f59781b).f59018b, c29719y3.mo69727c(), c29983l));
                                    arrayList2.add(new C28867y("appdata"));
                                }
                            }
                            if (c29719y3.f59781b instanceof C29068W1) {
                                c31479d.f63873e = true;
                                arrayList2.add(new C28823Q(new C29470F((String) null, c29983l.m70061a("sns_data_tax_information_title"), c29983l.m70061a("sns_data_tax_information_subtitle"), (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1017), "appdata"));
                            }
                            if (!c31479d.f63873e) {
                                if (abstractC28990D2 == null) {
                                    arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                    c31479d.f63873e = false;
                                } else {
                                    arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                    c31479d.f63873e = false;
                                }
                            }
                        }
                    } else {
                        list4 = list6;
                    }
                    i14 = i11;
                    if (c31479d != null) {
                        abstractC29103d3 = c29719y3.f59781b;
                        i15 = i14;
                        if (abstractC29103d3 instanceof C29060U1) {
                            i16 = ((C29060U1) abstractC29103d3).f59008b;
                        } else {
                            if (abstractC29103d3 instanceof C29076Y1) {
                                i16 = ((C29076Y1) abstractC29103d3).f59018b;
                            }
                            Boolean bool4 = boolValueOf;
                            arrayList2 = arrayList5;
                            CharSequence charSequence6 = charSequence2;
                            arrayList = arrayList4;
                            boolean z15 = i15;
                            i13 = i24;
                            arrayList2.add(AbstractC32651f.m71269a(c29719y3, str3, config2, c30095b, c29983l2, null, charSequence6, z15, bool4, mapM70747e2, map4));
                            if (c31479d != null) {
                                c29719y = c31479d.f63870b;
                                c29983l = c31479d.f63869a;
                                abstractC29103d2 = c29719y3.f59781b;
                                if (abstractC29103d2 instanceof C29076Y1) {
                                    zContains = c31479d.f63872d.contains(Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b));
                                    if (c31479d.f63871c <= 1) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    if (!zContains) {
                                        arrayList2.add(C31479D.m70749a(((C29076Y1) c29719y3.f59781b).f59018b, c29719y3.mo69727c(), c29983l));
                                        arrayList2.add(new C28867y("appdata"));
                                    }
                                }
                                if (c29719y3.f59781b instanceof C29068W1) {
                                    c31479d.f63873e = true;
                                    arrayList2.add(new C28823Q(new C29470F((String) null, c29983l.m70061a("sns_data_tax_information_title"), c29983l.m70061a("sns_data_tax_information_subtitle"), (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1017), "appdata"));
                                }
                                if (!c31479d.f63873e) {
                                    if (abstractC28990D2 == null) {
                                        arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                        c31479d.f63873e = false;
                                    } else {
                                        arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                        c31479d.f63873e = false;
                                    }
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(c31479d.f63872d.contains(Integer.valueOf(i16)));
                        Boolean bool5 = boolValueOf;
                        arrayList2 = arrayList5;
                        CharSequence charSequence7 = charSequence2;
                        arrayList = arrayList4;
                        boolean z16 = i15;
                        i13 = i24;
                        arrayList2.add(AbstractC32651f.m71269a(c29719y3, str3, config2, c30095b, c29983l2, null, charSequence7, z16, bool5, mapM70747e2, map4));
                        if (c31479d != null) {
                            c29719y = c31479d.f63870b;
                            c29983l = c31479d.f63869a;
                            abstractC29103d2 = c29719y3.f59781b;
                            if (abstractC29103d2 instanceof C29076Y1) {
                                zContains = c31479d.f63872d.contains(Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b));
                                if (c31479d.f63871c <= 1) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                if (!zContains) {
                                    arrayList2.add(C31479D.m70749a(((C29076Y1) c29719y3.f59781b).f59018b, c29719y3.mo69727c(), c29983l));
                                    arrayList2.add(new C28867y("appdata"));
                                }
                            }
                            if (c29719y3.f59781b instanceof C29068W1) {
                                c31479d.f63873e = true;
                                arrayList2.add(new C28823Q(new C29470F((String) null, c29983l.m70061a("sns_data_tax_information_title"), c29983l.m70061a("sns_data_tax_information_subtitle"), (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1017), "appdata"));
                            }
                            if (!c31479d.f63873e) {
                                if (abstractC28990D2 == null) {
                                    arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                    c31479d.f63873e = false;
                                } else {
                                    arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                    c31479d.f63873e = false;
                                }
                            }
                        }
                    } else {
                        i15 = i14;
                    }
                    boolValueOf = null;
                    Boolean bool6 = boolValueOf;
                    arrayList2 = arrayList5;
                    CharSequence charSequence8 = charSequence2;
                    arrayList = arrayList4;
                    boolean z17 = i15;
                    i13 = i24;
                    arrayList2.add(AbstractC32651f.m71269a(c29719y3, str3, config2, c30095b, c29983l2, null, charSequence8, z17, bool6, mapM70747e2, map4));
                    if (c31479d != null) {
                        c29719y = c31479d.f63870b;
                        c29983l = c31479d.f63869a;
                        abstractC29103d2 = c29719y3.f59781b;
                        if (abstractC29103d2 instanceof C29076Y1) {
                            zContains = c31479d.f63872d.contains(Integer.valueOf(((C29076Y1) abstractC29103d2).f59018b));
                            if (c31479d.f63871c <= 1) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (!zContains) {
                                arrayList2.add(C31479D.m70749a(((C29076Y1) c29719y3.f59781b).f59018b, c29719y3.mo69727c(), c29983l));
                                arrayList2.add(new C28867y("appdata"));
                            }
                        }
                        if (c29719y3.f59781b instanceof C29068W1) {
                            c31479d.f63873e = true;
                            arrayList2.add(new C28823Q(new C29470F((String) null, c29983l.m70061a("sns_data_tax_information_title"), c29983l.m70061a("sns_data_tax_information_subtitle"), (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 1017), "appdata"));
                        }
                        if (!c31479d.f63873e) {
                            if (abstractC28990D2 == null) {
                                arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                c31479d.f63873e = false;
                            } else {
                                arrayList2.add(C31479D.m70750a(c29983l, c29719y.mo69727c()));
                                c31479d.f63873e = false;
                            }
                        }
                    }
                } else {
                    list3 = list2;
                    list4 = list6;
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    i13 = i24;
                    if (abstractC28990D instanceof C29699u) {
                        C29699u c29699u = (C29699u) abstractC28990D;
                        String str4 = c29699u.f59761b;
                        String str5 = str4 == null ? "" : str4;
                        if (map != null) {
                            strM70748a = (String) map.get(str4 != null ? StringsKt.replaceFirst$default(str4, "custom.", "", false, 4, (Object) null) : null);
                            if (strM70748a == null) {
                                strM70748a = AbstractC31478C.m70748a(c29699u, "sns_data_custom_field_%s", c29983l2);
                                if (strM70748a == null) {
                                    strM70748a = c29699u.f59762c;
                                }
                            }
                        } else {
                            strM70748a = AbstractC31478C.m70748a(c29699u, "sns_data_custom_field_%s", c29983l2);
                            if (strM70748a == null) {
                                strM70748a = c29699u.f59762c;
                            }
                        }
                        C29470F c29470f = new C29470F(str5, strM70748a, AbstractC31478C.m70748a(c29699u, "sns_data_custom_hint_%s", c29983l2), (String) null, c29699u.f59763d, (String) null, c29983l2.m70061a(Intrinsics.areEqual(c29699u.f59763d, Boolean.TRUE) ? "sns_data_placeholder_required" : "sns_data_placeholder_optional"), (String) null, (List) null, 904);
                        if (list3 != null) {
                            Iterator it2 = list3.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!Intrinsics.areEqual(((C30094a) next).f60488a, abstractC28990D));
                            C30094a c30094a2 = (C30094a) next;
                            if (c30094a2 != null) {
                                charSequence = c30094a2.f60489b;
                            } else {
                                charSequence = null;
                            }
                        } else {
                            charSequence = null;
                        }
                        Boxing.boxBoolean(arrayList2.add(new C28831Z(c29470f, "appdata", (String) null, false, charSequence, (List) null, (String) null, 232)));
                    } else if (!(abstractC28990D instanceof AbstractC28985C)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList5 = arrayList2;
                arrayList4 = arrayList;
                list2 = list3;
                list6 = list4;
                i23 = i13;
                i11 = 0;
            }
            AbstractC28073M0.updateState$default(this, false, new C31505w(arrayList5, null), 1, null);
            return Unit.INSTANCE;
        }
        AbstractC28052C.finish$default(this, new C28494t(), null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69620a(C28850j c28850j) {
        C31482a.m70753a("onAction: " + c28850j);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31496n(c28850j, this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m70741a(List list, List list2, ContinuationImpl continuationImpl) {
        C31508z c31508z;
        Object objM70009a;
        ArrayList arrayList;
        C29305X3 c29305x3;
        Object next;
        Object next2;
        Integer numValueOf;
        if (continuationImpl instanceof C31508z) {
            c31508z = (C31508z) continuationImpl;
            int i11 = c31508z.f63934d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c31508z.f63934d = i11 - Integer.MIN_VALUE;
            } else {
                c31508z = new C31508z(this, continuationImpl);
            }
        } else {
            c31508z = new C31508z(this, continuationImpl);
        }
        Object obj = c31508z.f63932b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c31508z.f63934d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29661w c29661w = (C29661w) it.next();
                C29051S0 c29051s0 = AbstractC29103d2.Companion;
                String str = c29661w.f59718b;
                c29051s0.getClass();
                AbstractC29103d2 abstractC29103d2M69736a = C29051S0.m69736a(str);
                String strMo69715b = abstractC29103d2M69736a.mo69715b();
                if (abstractC29103d2M69736a instanceof C29068W1) {
                    C31481F c31481f = this.f63866r;
                    Map mapM70747e = m70747e();
                    c31481f.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (obj2 instanceof C29719y) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        AbstractC29103d2 abstractC29103d2 = ((C29719y) obj3).f59781b;
                        if ((abstractC29103d2 instanceof C29060U1) || (abstractC29103d2 instanceof C29076Y1)) {
                            arrayList4.add(obj3);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size2 = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj4 = arrayList4.get(i14);
                        i14++;
                        AbstractC29103d2 abstractC29103d3 = ((C29719y) obj4).f59781b;
                        if (abstractC29103d3 instanceof C29060U1) {
                            numValueOf = Integer.valueOf(((C29060U1) abstractC29103d3).f59008b);
                        } else {
                            numValueOf = abstractC29103d3 instanceof C29076Y1 ? Integer.valueOf(((C29076Y1) abstractC29103d3).f59018b) : null;
                        }
                        Object arrayList5 = linkedHashMap.get(numValueOf);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList5);
                        }
                        ((List) arrayList5).add(obj4);
                    }
                    ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        List list3 = (List) ((Map.Entry) it2.next()).getValue();
                        Iterator it3 = list3.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!(((C29719y) next).f59781b instanceof C29060U1));
                        C29719y c29719y = (C29719y) next;
                        AbstractC29103d2 abstractC29103d4 = c29719y != null ? c29719y.f59781b : null;
                        Iterator it4 = list3.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it4.next();
                        } while (!(((C29719y) next2).f59781b instanceof C29076Y1));
                        C29719y c29719y2 = (C29719y) next2;
                        AbstractC29103d2 abstractC29103d5 = c29719y2 != null ? c29719y2.f59781b : null;
                        arrayList6.add(new C29275R3((String) mapM70747e.get(abstractC29103d4 != null ? abstractC29103d4.mo69715b() : null), (String) mapM70747e.get(abstractC29103d5 != null ? abstractC29103d5.mo69715b() : null)));
                    }
                    c29305x3 = new C29305X3(strMo69715b, new C29427o(arrayList6));
                } else {
                    String str2 = (String) m70747e().get(strMo69715b);
                    c29305x3 = new C29305X3(strMo69715b, str2 != null ? new C29420n(str2) : null);
                }
                arrayList2.add(c29305x3);
            }
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            int size3 = arrayList2.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj5 = arrayList2.get(i15);
                i15++;
                arrayList7.add(((C29305X3) obj5).f59312a);
            }
            C29310Y3 c29310y3 = new C29310Y3(arrayList2);
            InterfaceC29921d interfaceC29921d = this.f63856h;
            c31508z.f63931a = arrayList7;
            c31508z.f63934d = 1;
            objM70009a = ((C29950z) interfaceC29921d).m70009a(c29310y3, c31508z);
            if (objM70009a == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayList7;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = c31508z.f63931a;
            ResultKt.throwOnFailure(obj);
            objM70009a = ((Result) obj).getValue();
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM70009a);
        if (thM103847exceptionOrNullimpl == null) {
            C31482a.m70753a("Applicant data uploaded successfully");
            SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(new SNSEvent.ApplicantDataUpdated(arrayList));
            }
            AbstractC28052C.finish$default(this, new C28494t(), null, null, null, 14, null);
        } else {
            C33272c.f67816e.f67810a.mo68956e("AppData", "Error uploading applicant data: " + thM103847exceptionOrNullimpl.getMessage(), thM103847exceptionOrNullimpl);
            throwError(thM103847exceptionOrNullimpl, this.f64476a.getType().f59014a, C31493k.f63891a);
        }
        return Unit.INSTANCE;
    }
}
