package p460n2;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: renamed from: n2.a */
/* JADX INFO: compiled from: NoTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class C42703a<R> implements InterfaceC42704b<R> {

    /* JADX INFO: renamed from: a */
    public static final C42703a<?> f94517a = new C42703a<>();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC42705c<?> f94518b = new a();

    /* JADX INFO: renamed from: n2.a$a */
    /* JADX INFO: compiled from: NoTransition.java */
    public static class a<R> implements InterfaceC42705c<R> {
        @Override // p460n2.InterfaceC42705c
        /* JADX INFO: renamed from: a */
        public InterfaceC42704b<R> mo93597a(DataSource dataSource, boolean z11) {
            return C42703a.f94517a;
        }
    }

    @Override // p460n2.InterfaceC42704b
    /* JADX INFO: renamed from: a */
    public boolean mo93596a(Object obj, InterfaceC42704b.a aVar) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static <R> InterfaceC42705c<R> m93595b() {
        return (InterfaceC42705c<R>) f94518b;
    }
}
