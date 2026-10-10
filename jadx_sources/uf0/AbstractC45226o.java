package uf0;

import vf0.AbstractC45525b;

/* JADX INFO: renamed from: uf0.o */
/* JADX INFO: compiled from: TraceComponent.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC45226o {

    /* JADX INFO: renamed from: uf0.o$b */
    /* JADX INFO: compiled from: TraceComponent.java */
    public static final class b extends AbstractC45226o {

        /* JADX INFO: renamed from: a */
        public final AbstractC45525b f101754a;

        public b() {
            this.f101754a = AbstractC45525b.m100512b();
        }

        @Override // uf0.AbstractC45226o
        /* JADX INFO: renamed from: a */
        public AbstractC45525b mo99923a() {
            return this.f101754a;
        }

        @Override // uf0.AbstractC45226o
        /* JADX INFO: renamed from: b */
        public AbstractC45229r mo99924b() {
            return AbstractC45229r.m99934a();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC45525b mo99923a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC45229r mo99924b();

    /* JADX INFO: renamed from: c */
    public static AbstractC45226o m99922c() {
        return new b();
    }
}
