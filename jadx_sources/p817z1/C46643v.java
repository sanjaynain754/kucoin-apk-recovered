package p817z1;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import p485o2.C42950d;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.v */
/* JADX INFO: compiled from: UnitModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46643v<Model> implements InterfaceC46635n<Model, Model> {

    /* JADX INFO: renamed from: a */
    public static final C46643v<?> f104460a = new C46643v<>();

    /* JADX INFO: renamed from: z1.v$a */
    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class a<Model> implements InterfaceC46636o<Model, Model> {

        /* JADX INFO: renamed from: a */
        public static final a<?> f104461a = new a<>();

        /* JADX INFO: renamed from: b */
        public static <T> a<T> m102881b() {
            return (a<T>) f104461a;
        }

        @Deprecated
        public a() {
        }

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Model, Model> mo14a(C46639r c46639r) {
            return C46643v.m102880c();
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.v$b */
    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class b<Model> implements InterfaceC5323d<Model> {

        /* JADX INFO: renamed from: b */
        public final Model f104462b;

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Model> mo23a() {
            return (Class<Model>) this.f104462b.getClass();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: c */
        public DataSource mo25c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: d */
        public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super Model> aVar) {
            aVar.mo6674e(this.f104462b);
        }

        public b(Model model) {
            this.f104462b = model;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: b */
        public void mo24b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        public void cancel() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: b */
    public boolean mo11b(@NonNull Model model) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static <T> C46643v<T> m102880c() {
        return (C46643v<T>) f104460a;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: a */
    public InterfaceC46635n.a<Model> mo10a(@NonNull Model model, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(model), new b(model));
    }

    @Deprecated
    public C46643v() {
    }
}
