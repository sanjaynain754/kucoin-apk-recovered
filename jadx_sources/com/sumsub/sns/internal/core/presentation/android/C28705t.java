package com.sumsub.sns.internal.core.presentation.android;

import com.sumsub.sns.internal.features.domain.utils.C30317b;
import com.sumsub.sns.internal.features.presentation.geo.C31047F;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28705t {

    /* JADX INFO: renamed from: k */
    public static final long f58357k;

    /* JADX INFO: renamed from: a */
    public final Set f58358a;

    /* JADX INFO: renamed from: b */
    public final C30317b f58359b;

    /* JADX INFO: renamed from: c */
    public final Set f58360c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f58361d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41678w f58362e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f58363f;

    /* JADX INFO: renamed from: g */
    public Set f58364g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41565d f58365h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41634e f58366i;

    /* JADX INFO: renamed from: j */
    public InterfaceC41769w f58367j;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69506a(ContinuationImpl continuationImpl) {
        C28699q c28699q;
        if (continuationImpl instanceof C28699q) {
            c28699q = (C28699q) continuationImpl;
            int i11 = c28699q.f58348c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28699q.f58348c = i11 - Integer.MIN_VALUE;
            } else {
                c28699q = new C28699q(this, continuationImpl);
            }
        } else {
            c28699q = new C28699q(this, continuationImpl);
        }
        Object objM90882F = c28699q.f58346a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28699q.f58348c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90882F);
            InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(this.f58363f);
            c28699q.f58348c = 1;
            objM90882F = C41636g.m90882F(interfaceC41634eM90881E, c28699q);
            if (objM90882F == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90882F);
        }
        Iterable iterable = (Iterable) objM90882F;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC28637L) it.next()).f58265a);
        }
        Set set = this.f58358a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String value = ((AbstractC28637L) obj).f58267c.getValue();
            Object arrayList2 = linkedHashMap.get(value);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(value, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((AbstractC28637L) it2.next()).f58265a);
            }
            linkedHashMap2.put(key, Boxing.boxBoolean(!arrayList.containsAll(arrayList3)));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m69509b(ContinuationImpl continuationImpl) {
        C28701r c28701r;
        if (continuationImpl instanceof C28701r) {
            c28701r = (C28701r) continuationImpl;
            int i11 = c28701r.f58352c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28701r.f58352c = i11 - Integer.MIN_VALUE;
            } else {
                c28701r = new C28701r(this, continuationImpl);
            }
        } else {
            c28701r = new C28701r(this, continuationImpl);
        }
        Object objM90470e = c28701r.f58350a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28701r.f58352c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90470e);
            long j11 = f58357k;
            C28703s c28703s = new C28703s(this, null);
            c28701r.f58352c = 1;
            objM90470e = TimeoutKt.m90470e(j11, c28703s, c28701r);
            if (objM90470e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90470e);
        }
        Set set = (Set) objM90470e;
        if (set == null) {
            m69508a("peekPermissions: timed out -> Denied");
            return C28653h.f58285a;
        }
        Object obj = m69504a(set) == null ? C28655i.f58286a : C28653h.f58285a;
        m69508a("peekPermissions: " + obj);
        return obj;
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f58357k = DurationKt.toDuration(5, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: c */
    public final void m69511c(Set set) {
        this.f58363f.setValue(set);
        Set set2 = this.f58364g;
        this.f58364g = set;
        if (set2 != null && !Intrinsics.areEqual(set2, set)) {
            this.f58365h.mo90594e(Boolean.valueOf(set.isEmpty()));
        }
        if (this.f58367j == null || !Intrinsics.areEqual(this.f58361d.getValue(), C28659k.f58288a)) {
            return;
        }
        AbstractC28636K abstractC28636KM69504a = m69504a(set);
        if (abstractC28636KM69504a == null) {
            m69508a("runtime result: granted");
            m69507a(C28655i.f58286a);
            return;
        }
        m69508a("runtime result: denied, missing " + abstractC28636KM69504a.f58266b + " -> settings dialog");
        this.f58361d.setValue(new C28695o(abstractC28636KM69504a));
    }

    public C28705t(C30317b c30317b, Set set) {
        this.f58358a = set;
        this.f58359b = c30317b;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = ((AbstractC28637L) it.next()).f58266b;
            if (str != null) {
                arrayList.add(str);
            }
        }
        this.f58360c = CollectionsKt.toSet(arrayList);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(C28691m.f58340a);
        this.f58361d = interfaceC41669nM91009a;
        this.f58362e = C41636g.m90907c(interfaceC41669nM91009a);
        this.f58363f = C41679x.m91009a(null);
        InterfaceC41565d interfaceC41565dM90691b = C41568g.m90691b(-2, null, null, 6, null);
        this.f58365h = interfaceC41565dM90691b;
        this.f58366i = C41636g.m90900X(interfaceC41565dM90691b);
    }

    /* JADX INFO: renamed from: b */
    public final void m69510b(Set set) {
        this.f58363f.setValue(set);
        Set set2 = this.f58364g;
        this.f58364g = set;
        if (set2 != null && !Intrinsics.areEqual(set2, set)) {
            this.f58365h.mo90594e(Boolean.valueOf(set.isEmpty()));
        }
        if (this.f58367j == null || !Intrinsics.areEqual(this.f58361d.getValue(), C28661l.f58291a)) {
            return;
        }
        AbstractC28636K abstractC28636KM69504a = m69504a(set);
        if (abstractC28636KM69504a == null) {
            m69508a("settings return: all required granted");
            m69507a(C28655i.f58286a);
            return;
        }
        m69508a("settings return: still missing " + abstractC28636KM69504a.f58266b + ", re-requesting");
        this.f58361d.setValue(new C28693n(this.f58360c));
    }

    /* JADX INFO: renamed from: a */
    public final Object m69505a(C31047F c31047f) {
        InterfaceC41769w interfaceC41769w = this.f58367j;
        if (interfaceC41769w != null) {
            m69508a("requestPermission: awaiting in-flight request");
            return interfaceC41769w.mo91198h(c31047f);
        }
        Set set = (Set) this.f58363f.getValue();
        if (set != null && m69504a(set) == null) {
            m69508a("requestPermission: already granted (cached)");
            return C28655i.f58286a;
        }
        if (this.f58360c.isEmpty()) {
            m69508a("requestPermission: no runtime permissions required");
            return C28655i.f58286a;
        }
        m69508a("requestPermission: requesting " + this.f58360c);
        InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        this.f58367j = interfaceC41769wM91388c;
        this.f58361d.setValue(new C28693n(this.f58360c));
        return interfaceC41769wM91388c.mo91198h(c31047f);
    }

    /* JADX INFO: renamed from: a */
    public final void m69507a(InterfaceC28657j interfaceC28657j) {
        InterfaceC41769w interfaceC41769w = this.f58367j;
        if (interfaceC41769w == null) {
            return;
        }
        this.f58367j = null;
        this.f58361d.setValue(C28691m.f58340a);
        m69508a("resolved: " + interfaceC28657j);
        interfaceC41769w.mo91370n(interfaceC28657j);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC28636K m69504a(Set set) {
        Object next;
        Set set2 = this.f58358a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (obj instanceof AbstractC28636K) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            AbstractC28636K abstractC28636K = (AbstractC28636K) obj2;
            if (!(abstractC28636K instanceof C28628C) && !(abstractC28636K instanceof C28630E)) {
                arrayList3.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list = (List) pair.component1();
        Iterator it = ((List) pair.component2()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!set.contains((AbstractC28636K) next));
        AbstractC28636K abstractC28636K2 = (AbstractC28636K) next;
        if (list.isEmpty()) {
            list = null;
            break;
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!set.contains((AbstractC28636K) it2.next())) {
                    list = null;
                    break;
                }
            }
        }
        return abstractC28636K2 == null ? list != null ? (AbstractC28636K) CollectionsKt.first(list) : null : abstractC28636K2;
    }

    /* JADX INFO: renamed from: a */
    public final void m69508a(String str) {
        C30317b.m70184a(this.f58359b, "PermissionController" + C33627eb.f69716f + str);
    }
}
