package com.sumsub.sns.internal.core.presentation.common;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28787t {

    /* JADX INFO: renamed from: a */
    public final AbstractC28133l f58549a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f58550b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C28784q f58551c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f58552d;

    /* JADX INFO: renamed from: a */
    public static final View m69600a(AbstractC28787t abstractC28787t) {
        return abstractC28787t.f58549a.getView();
    }

    /* JADX INFO: renamed from: b */
    public final void m69607b() {
        ArrayList arrayList = this.f58550b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC28787t) obj).m69607b();
        }
        m69608b("onDestroy");
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo69480h();

    /* JADX INFO: renamed from: c */
    public final void m69609c() {
        ArrayList arrayList = this.f58550b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC28787t) obj).m69609c();
        }
        m69608b("onResume");
        mo69481j();
    }

    /* JADX INFO: renamed from: d */
    public final void m69610d() {
        ArrayList arrayList = this.f58550b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC28787t) obj).m69610d();
        }
        m69608b("onStart");
    }

    /* JADX INFO: renamed from: e */
    public final void m69611e() {
        ArrayList arrayList = this.f58550b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC28787t) obj).m69611e();
        }
        m69608b("onStop");
        mo69532k();
    }

    /* JADX INFO: renamed from: f */
    public final void m69612f() {
        ArrayList arrayList = this.f58550b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC28787t) obj).m69612f();
        }
        m69608b("onCreateView");
        mo69495l();
    }

    /* JADX INFO: renamed from: g */
    public final void m69613g() {
        ArrayList arrayList = this.f58550b;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((AbstractC28787t) obj).m69613g();
        }
        m69608b("onDestroyView");
        mo69522m();
        ArrayList arrayList2 = this.f58552d;
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            ((InterfaceC28779l) obj2).clear();
        }
    }

    public AbstractC28787t(AbstractC28133l abstractC28133l, AbstractC28787t abstractC28787t) {
        this.f58549a = abstractC28133l;
        C28782o c28782o = new C28782o(this);
        this.f58551c = new C28784q(this);
        if (abstractC28787t == null) {
            abstractC28133l.getLifecycle().addObserver(c28782o);
            abstractC28133l.getViewLifecycleOwnerLiveData().observe(abstractC28133l, new C28783p(new Function1() { // from class: com.sumsub.sns.internal.core.presentation.common.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC28787t.m69601a(this.f58523b, (LifecycleOwner) obj);
                }
            }));
        } else {
            abstractC28787t.f58550b.add(this);
        }
        this.f58552d = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m69606a(String str, Throwable th2) {
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68956e(this.f58549a.getF62857a(), mo69480h() + C33627eb.f69716f + str, th2);
    }

    /* JADX INFO: renamed from: b */
    public final void m69608b(String str) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, this.f58549a.getF62857a(), mo69480h() + C33627eb.f69716f + str, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69601a(AbstractC28787t abstractC28787t, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(abstractC28787t.f58551c);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m69604a() {
        ArrayList arrayList = this.f58550b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC28787t) obj).m69604a();
        }
        m69608b("onCreate");
        mo69531i();
    }

    /* JADX INFO: renamed from: a */
    public final C28778k m69602a(int i11) {
        C28778k c28778k = new C28778k(i11, new Function0() { // from class: com.sumsub.sns.internal.core.presentation.common.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC28787t.m69600a(this.f58524b);
            }
        });
        this.f58552d.add(c28778k);
        return c28778k;
    }

    /* JADX INFO: renamed from: i */
    public void mo69531i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo69481j() {
    }

    /* JADX INFO: renamed from: k */
    public void mo69532k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo69495l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo69522m() {
    }

    /* JADX INFO: renamed from: a */
    public final void m69605a(InterfaceC28773g interfaceC28773g, Function1 function1) {
        AbstractC28421U.m69304a(interfaceC28773g.getState(), this.f58549a.getViewLifecycleOwner(), new C28781n(function1, null));
    }

    /* JADX INFO: renamed from: a */
    public final String m69603a(String str) {
        return str + "_" + this.f58549a.getUniqueId();
    }
}
