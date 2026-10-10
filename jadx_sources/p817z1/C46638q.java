package p817z1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p523p2.C43363j;
import p628t1.C44613e;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: z1.q */
/* JADX INFO: compiled from: MultiModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46638q<Model, Data> implements InterfaceC46635n<Model, Data> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC46635n<Model, Data>> f104434a;

    /* JADX INFO: renamed from: b */
    public final Pools.Pool<List<Throwable>> f104435b;

    /* JADX INFO: renamed from: z1.q$a */
    /* JADX INFO: compiled from: MultiModelLoader.java */
    public static class a<Data> implements InterfaceC5323d<Data>, InterfaceC5323d.a<Data> {

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC5323d<Data>> f104436b;

        /* JADX INFO: renamed from: c */
        public final Pools.Pool<List<Throwable>> f104437c;

        /* JADX INFO: renamed from: d */
        public int f104438d;

        /* JADX INFO: renamed from: e */
        public Priority f104439e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5323d.a<? super Data> f104440f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public List<Throwable> f104441g;

        /* JADX INFO: renamed from: h */
        public boolean f104442h;

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        public void cancel() {
            this.f104442h = true;
            Iterator<InterfaceC5323d<Data>> it = this.f104436b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo23a() {
            return this.f104436b.get(0).mo23a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: b */
        public void mo24b() {
            List<Throwable> list = this.f104441g;
            if (list != null) {
                this.f104437c.release(list);
            }
            this.f104441g = null;
            Iterator<InterfaceC5323d<Data>> it = this.f104436b.iterator();
            while (it.hasNext()) {
                it.next().mo24b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: c */
        public DataSource mo25c() {
            return this.f104436b.get(0).mo25c();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: d */
        public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super Data> aVar) {
            this.f104439e = priority;
            this.f104440f = aVar;
            this.f104441g = this.f104437c.acquire();
            this.f104436b.get(this.f104438d).mo26d(priority, this);
            if (this.f104442h) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d.a
        /* JADX INFO: renamed from: e */
        public void mo6674e(@Nullable Data data) {
            if (data != null) {
                this.f104440f.mo6674e(data);
            } else {
                m102858g();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d.a
        /* JADX INFO: renamed from: f */
        public void mo6675f(@NonNull Exception exc) {
            ((List) C43363j.m95506d(this.f104441g)).add(exc);
            m102858g();
        }

        /* JADX INFO: renamed from: g */
        public final void m102858g() {
            if (this.f104442h) {
                return;
            }
            if (this.f104438d < this.f104436b.size() - 1) {
                this.f104438d++;
                mo26d(this.f104439e, this.f104440f);
            } else {
                C43363j.m95506d(this.f104441g);
                this.f104440f.mo6675f(new GlideException("Fetch failed", new ArrayList(this.f104441g)));
            }
        }

        public a(@NonNull List<InterfaceC5323d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f104437c = pool;
            C43363j.m95505c(list);
            this.f104436b = list;
            this.f104438d = 0;
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: a */
    public InterfaceC46635n.a<Data> mo10a(@NonNull Model model, int i11, int i12, @NonNull C44613e c44613e) {
        InterfaceC46635n.a<Data> aVarMo10a;
        int size = this.f104434a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC44610b interfaceC44610b = null;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC46635n<Model, Data> interfaceC46635n = this.f104434a.get(i13);
            if (interfaceC46635n.mo11b(model) && (aVarMo10a = interfaceC46635n.mo10a(model, i11, i12, c44613e)) != null) {
                interfaceC44610b = aVarMo10a.f104427a;
                arrayList.add(aVarMo10a.f104429c);
            }
        }
        if (arrayList.isEmpty() || interfaceC44610b == null) {
            return null;
        }
        return new InterfaceC46635n.a<>(interfaceC44610b, new a(arrayList, this.f104435b));
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: b */
    public boolean mo11b(@NonNull Model model) {
        Iterator<InterfaceC46635n<Model, Data>> it = this.f104434a.iterator();
        while (it.hasNext()) {
            if (it.next().mo11b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f104434a.toArray()) + '}';
    }

    public C46638q(@NonNull List<InterfaceC46635n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.f104434a = list;
        this.f104435b = pool;
    }
}
