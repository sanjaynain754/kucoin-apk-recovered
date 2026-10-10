package p712w3;

/* JADX INFO: renamed from: w3.l */
/* JADX INFO: compiled from: Suppliers.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45712l {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC45711k<Boolean> f103051a = new b();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC45711k<Boolean> f103052b = new c();

    /* JADX INFO: renamed from: c */
    public static final InterfaceC45711k<String> f103053c = new d();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: w3.l$a */
    /* JADX INFO: compiled from: Suppliers.java */
    public class a<T> implements InterfaceC45711k<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f103054a;

        public a(Object obj) {
            this.f103054a = obj;
        }

        @Override // p712w3.InterfaceC45711k
        public T get() {
            return (T) this.f103054a;
        }
    }

    /* JADX INFO: renamed from: w3.l$b */
    /* JADX INFO: compiled from: Suppliers.java */
    public class b implements InterfaceC45711k<Boolean> {
        @Override // p712w3.InterfaceC45711k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: w3.l$c */
    /* JADX INFO: compiled from: Suppliers.java */
    public class c implements InterfaceC45711k<Boolean> {
        @Override // p712w3.InterfaceC45711k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: w3.l$d */
    /* JADX INFO: compiled from: Suppliers.java */
    public class d implements InterfaceC45711k<String> {
        @Override // p712w3.InterfaceC45711k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC45711k<T> m100904a(T t11) {
        return new a(t11);
    }
}
