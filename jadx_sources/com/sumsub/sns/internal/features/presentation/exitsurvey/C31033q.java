package com.sumsub.sns.internal.features.presentation.exitsurvey;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.core.presentation.form.C28799f;
import com.sumsub.sns.internal.core.presentation.form.C28801h;
import com.sumsub.sns.internal.core.presentation.form.C28803j;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.core.presentation.form.model.C28854l;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29470F;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30336z;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.exitsurvey.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31033q extends AbstractC28142p0 implements InterfaceC28804k {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty[] f62724g = {AbstractC28118g.m69077a(C31033q.class, "selectedOptions", "getSelectedOptions()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: a */
    public final C30336z f62725a;

    /* JADX INFO: renamed from: b */
    public final C28936t f62726b;

    /* JADX INFO: renamed from: c */
    public final C31031o f62727c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f62728d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f62729e;

    /* JADX INFO: renamed from: f */
    public InterfaceC41775x1 f62730f;

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69616a() {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final InterfaceC28805l mo69622b() {
        return this.f62727c;
    }

    public C31033q(SavedStateHandle savedStateHandle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C30336z c30336z) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f62725a = c30336z;
        this.f62726b = new C28936t(savedStateHandle, "KEY_OPTIONS", new LinkedHashSet(), false);
        this.f62727c = new C31031o(this);
        this.f62728d = C41679x.m91009a(new C28799f(0, CollectionsKt.emptyList(), null, new C28803j()));
        this.f62729e = C41679x.m91009a(C31024h.f62710a);
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final void mo69617a(AbstractC28841e0 abstractC28841e0) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: b */
    public final void mo69623b(AbstractC28841e0 abstractC28841e0, String str) {
        Object value;
        String str2 = abstractC28841e0.mo69642c().f59466a;
        if (str2 == null || str == null) {
            return;
        }
        if (Boolean.parseBoolean(str)) {
            m70565e().add(str2);
        } else {
            m70565e().remove(str2);
        }
        Object value2 = this.f62729e.getValue();
        C31025i c31025i = value2 instanceof C31025i ? (C31025i) value2 : null;
        if (c31025i != null) {
            C31025i c31025i2 = new C31025i(c31025i.f62711a, !m70565e().isEmpty(), c31025i.f62712b);
            Logger.DefaultImpls.v$default(C33272c.f67812a, "ExitSurvey", "Updated selected options: " + CollectionsKt.joinToString$default(m70565e(), null, null, null, 0, null, null, 63, null), null, 4, null);
            InterfaceC41669n interfaceC41669n = this.f62729e;
            do {
                value = interfaceC41669n.getValue();
            } while (!interfaceC41669n.compareAndSet(value, c31025i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        Object value;
        String strM70061a;
        ArrayList arrayList;
        Object value2;
        String strM70061a2;
        C29983l c29983l;
        Pair pairM90091to;
        List listEmptyList = (List) this.f62725a.f61000b.getValue();
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<String> list = listEmptyList;
        if (list.isEmpty()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Exit Survey is enabled but doesn't have any options.");
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(this);
            String message = illegalArgumentException.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, illegalArgumentException);
            AbstractC28052C.throwError$default(this, illegalArgumentException, "TYPE_UNKNOWN", null, 4, null);
            return C41636g.m90879C();
        }
        Logger.DefaultImpls.v$default(C33272c.f67812a, "ExitSurvey", "Loaded options: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null), null, 4, null);
        InterfaceC41669n interfaceC41669n = this.f62728d;
        do {
            value = interfaceC41669n.getValue();
            C30336z c30336z = this.f62725a;
            C29983l c29983l2 = c28075o.f57271c;
            strM70061a = c29983l2 != null ? c29983l2.m70061a("sns_exit_survey_title") : null;
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                C29983l c29983l3 = c28075o.f57271c;
                if (c29983l3 != null) {
                    String strM70061a3 = c29983l3.m70061a("sns_exit_survey_option_" + str);
                    if (strM70061a3 != null) {
                        pairM90091to = TuplesKt.m90091to(str, strM70061a3);
                    } else {
                        pairM90091to = null;
                    }
                } else {
                    pairM90091to = null;
                }
                if (pairM90091to != null) {
                    arrayList2.add(pairM90091to);
                }
            }
            c30336z.getClass();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                Pair pair = (Pair) obj;
                arrayList.add(new C28854l(new C29470F((String) pair.component1(), (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) pair.component2(), (String) null, (List) null, 958), "reasons", null, null));
            }
        } while (!interfaceC41669n.compareAndSet(value, new C28799f(0, CollectionsKt.listOf(new C28801h(0, strM70061a, null, arrayList)), null, new C28803j())));
        InterfaceC41669n interfaceC41669n2 = this.f62729e;
        do {
            value2 = interfaceC41669n2.getValue();
            Logger.DefaultImpls.v$default(C33272c.f67812a, "ExitSurvey", "Initial state, selected options: " + CollectionsKt.joinToString$default(m70565e(), null, null, null, 0, null, null, 63, null), null, 4, null);
            C29983l c29983l4 = c28075o.f57271c;
            strM70061a2 = c29983l4 != null ? c29983l4.m70061a("sns_exit_survey_action_continue") : null;
            c29983l = c28075o.f57271c;
        } while (!interfaceC41669n2.compareAndSet(value2, new C31025i(strM70061a2, !m70565e().isEmpty(), c29983l != null ? c29983l.m70061a("sns_exit_survey_action_skip") : null)));
        return this.f62729e;
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: d */
    public final InterfaceC41678w mo69624d() {
        return this.f62728d;
    }

    /* JADX INFO: renamed from: e */
    public final Set m70565e() {
        C28936t c28936t = this.f62726b;
        KProperty kProperty = f62724g[0];
        return (Set) c28936t.m69705a();
    }

    /* JADX INFO: renamed from: f */
    public final void m70566f() {
        Logger.DefaultImpls.v$default(C33272c.f67812a, "ExitSurvey", "Clicked continue, selected options: " + CollectionsKt.joinToString$default(m70565e(), null, null, null, 0, null, null, 63, null), null, 4, null);
        InterfaceC41775x1 interfaceC41775x1 = this.f62730f;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f62730f = C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31032p(this, null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        InterfaceC31030n interfaceC31030n = (InterfaceC31030n) interfaceC28077Q;
        if (Intrinsics.areEqual(interfaceC31030n, C31028l.f62716a)) {
            m70566f();
        } else {
            if (!Intrinsics.areEqual(interfaceC31030n, C31029m.f62717a)) {
                throw new NoWhenBranchMatchedException();
            }
            Logger.DefaultImpls.v$default(C33272c.f67812a, "ExitSurvey", "Clicked skip…", null, 4, null);
            AbstractC28052C.finish$default(this, new C28500v(), null, null, null, 14, null);
        }
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
    public final void mo69620a(C28850j c28850j) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k
    /* JADX INFO: renamed from: a */
    public final boolean mo69621a(String str) {
        return false;
    }
}
