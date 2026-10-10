package cf0;

import androidx.annotation.NonNull;
import df0.C36671a;
import lf0.AbstractC42182a;
import lf0.AbstractC42186e;
import lf0.C42187f;
import mf0.AbstractC42531a;
import pf0.C43463b;
import pf0.InterfaceC43462a;

/* JADX INFO: renamed from: cf0.g */
/* JADX INFO: compiled from: MarkwonConfiguration.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4952g {

    /* JADX INFO: renamed from: a */
    public final C36671a f5506a;

    /* JADX INFO: renamed from: b */
    public final AbstractC42182a f5507b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC43462a f5508c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4948c f5509d;

    /* JADX INFO: renamed from: e */
    public final AbstractC42531a f5510e;

    /* JADX INFO: renamed from: f */
    public final AbstractC42186e f5511f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4955j f5512g;

    /* JADX INFO: renamed from: cf0.g$b */
    /* JADX INFO: compiled from: MarkwonConfiguration.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C36671a f5513a;

        /* JADX INFO: renamed from: b */
        public AbstractC42182a f5514b;

        /* JADX INFO: renamed from: c */
        public InterfaceC43462a f5515c;

        /* JADX INFO: renamed from: d */
        public InterfaceC4948c f5516d;

        /* JADX INFO: renamed from: e */
        public AbstractC42531a f5517e;

        /* JADX INFO: renamed from: f */
        public AbstractC42186e f5518f;

        /* JADX INFO: renamed from: g */
        public InterfaceC4955j f5519g;

        @NonNull
        /* JADX INFO: renamed from: h */
        public C4952g m5190h(@NonNull C36671a c36671a, @NonNull InterfaceC4955j interfaceC4955j) {
            this.f5513a = c36671a;
            this.f5519g = interfaceC4955j;
            if (this.f5514b == null) {
                this.f5514b = AbstractC42182a.m92656a();
            }
            if (this.f5515c == null) {
                this.f5515c = new C43463b();
            }
            if (this.f5516d == null) {
                this.f5516d = new C4949d();
            }
            if (this.f5517e == null) {
                this.f5517e = AbstractC42531a.m93247a();
            }
            if (this.f5518f == null) {
                this.f5518f = new C42187f();
            }
            return new C4952g(this);
        }

        @NonNull
        /* JADX INFO: renamed from: i */
        public b m5191i(@NonNull InterfaceC4948c interfaceC4948c) {
            this.f5516d = interfaceC4948c;
            return this;
        }
    }

    public C4952g(@NonNull b bVar) {
        this.f5506a = bVar.f5513a;
        this.f5507b = bVar.f5514b;
        this.f5508c = bVar.f5515c;
        this.f5509d = bVar.f5516d;
        this.f5510e = bVar.f5517e;
        this.f5511f = bVar.f5518f;
        this.f5512g = bVar.f5519g;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public AbstractC42531a m5178a() {
        return this.f5510e;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC4948c m5179b() {
        return this.f5509d;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public InterfaceC4955j m5180c() {
        return this.f5512g;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public InterfaceC43462a m5181d() {
        return this.f5508c;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public C36671a m5182e() {
        return this.f5506a;
    }
}
