package p392k4;

import android.content.res.Resources;
import com.facebook.common.internal.ImmutableList;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import java.util.concurrent.Executor;
import p462n4.AbstractC42743a;
import p547q3.InterfaceC43595a;
import p712w3.InterfaceC45711k;
import p714w5.InterfaceC45739a;
import p749x5.InterfaceC46071e;

/* JADX INFO: renamed from: k4.h */
/* JADX INFO: compiled from: PipelineDraweeControllerFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40893h {

    /* JADX INFO: renamed from: a */
    public Resources f90953a;

    /* JADX INFO: renamed from: b */
    public AbstractC42743a f90954b;

    /* JADX INFO: renamed from: c */
    public InterfaceC45739a f90955c;

    /* JADX INFO: renamed from: d */
    public Executor f90956d;

    /* JADX INFO: renamed from: e */
    public InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> f90957e;

    /* JADX INFO: renamed from: f */
    public ImmutableList<InterfaceC45739a> f90958f;

    /* JADX INFO: renamed from: g */
    public InterfaceC45711k<Boolean> f90959g;

    /* JADX INFO: renamed from: a */
    public void m89571a(Resources resources, AbstractC42743a abstractC42743a, InterfaceC45739a interfaceC45739a, Executor executor, InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f, ImmutableList<InterfaceC45739a> immutableList, InterfaceC45711k<Boolean> interfaceC45711k) {
        this.f90953a = resources;
        this.f90954b = abstractC42743a;
        this.f90955c = interfaceC45739a;
        this.f90956d = executor;
        this.f90957e = interfaceC5648f;
        this.f90958f = immutableList;
        this.f90959g = interfaceC45711k;
    }

    /* JADX INFO: renamed from: b */
    public C40890e m89572b(Resources resources, AbstractC42743a abstractC42743a, InterfaceC45739a interfaceC45739a, Executor executor, InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f, ImmutableList<InterfaceC45739a> immutableList) {
        return new C40890e(resources, abstractC42743a, interfaceC45739a, executor, interfaceC5648f, immutableList);
    }

    /* JADX INFO: renamed from: c */
    public C40890e m89573c() {
        C40890e c40890eM89572b = m89572b(this.f90953a, this.f90954b, this.f90955c, this.f90956d, this.f90957e, this.f90958f);
        InterfaceC45711k<Boolean> interfaceC45711k = this.f90959g;
        if (interfaceC45711k != null) {
            c40890eM89572b.m89532A0(interfaceC45711k.get().booleanValue());
        }
        return c40890eM89572b;
    }
}
