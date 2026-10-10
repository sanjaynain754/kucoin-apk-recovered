package p392k4;

import com.facebook.common.internal.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import p283g5.InterfaceC37809b;
import p712w3.C45712l;
import p712w3.InterfaceC45711k;
import p714w5.InterfaceC45739a;

/* JADX INFO: renamed from: k4.b */
/* JADX INFO: compiled from: DraweeConfig.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40887b {

    /* JADX INFO: renamed from: a */
    public final ImmutableList<InterfaceC45739a> f90917a;

    /* JADX INFO: renamed from: b */
    public final C40893h f90918b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC45711k<Boolean> f90919c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC37809b f90920d;

    /* JADX INFO: renamed from: k4.b$a */
    /* JADX INFO: compiled from: DraweeConfig.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public List<InterfaceC45739a> f90921a;

        /* JADX INFO: renamed from: b */
        public InterfaceC45711k<Boolean> f90922b;

        /* JADX INFO: renamed from: c */
        public C40893h f90923c;

        /* JADX INFO: renamed from: d */
        public InterfaceC37809b f90924d;

        /* JADX INFO: renamed from: e */
        public a m89523e(InterfaceC45739a interfaceC45739a) {
            if (this.f90921a == null) {
                this.f90921a = new ArrayList();
            }
            this.f90921a.add(interfaceC45739a);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C40887b m89524f() {
            return new C40887b(this);
        }
    }

    public C40887b(a aVar) {
        this.f90917a = aVar.f90921a != null ? ImmutableList.copyOf(aVar.f90921a) : null;
        this.f90919c = aVar.f90922b != null ? aVar.f90922b : C45712l.m100904a(Boolean.FALSE);
        this.f90918b = aVar.f90923c;
        this.f90920d = aVar.f90924d;
    }

    /* JADX INFO: renamed from: e */
    public static a m89514e() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public ImmutableList<InterfaceC45739a> m89515a() {
        return this.f90917a;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC45711k<Boolean> m89516b() {
        return this.f90919c;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC37809b m89517c() {
        return this.f90920d;
    }

    /* JADX INFO: renamed from: d */
    public C40893h m89518d() {
        return this.f90918b;
    }
}
