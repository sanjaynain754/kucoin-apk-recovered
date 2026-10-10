package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.squareup.moshi.d */
/* JADX INFO: compiled from: CollectionJsonAdapter.java */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27798d<C extends Collection<T>, T> extends AbstractC27800f<C> {

    /* JADX INFO: renamed from: b */
    public static final AbstractC27800f.d f56593b = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC27800f<T> f56594a;

    /* JADX INFO: renamed from: com.squareup.moshi.d$b */
    /* JADX INFO: compiled from: CollectionJsonAdapter.java */
    public class b extends AbstractC27798d<Collection<T>, T> {
        public b(AbstractC27800f abstractC27800f) {
            super(abstractC27800f, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ void mo68667f(AbstractC27807m abstractC27807m, Object obj) throws IOException {
            super.m68680k(abstractC27807m, (Collection) obj);
        }

        @Override // com.squareup.moshi.AbstractC27798d
        /* JADX INFO: renamed from: i */
        public Collection<T> mo68679i() {
            return new ArrayList();
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ Object mo68666b(JsonReader jsonReader) throws IOException {
            return super.m68678g(jsonReader);
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.d$c */
    /* JADX INFO: compiled from: CollectionJsonAdapter.java */
    public class c extends AbstractC27798d<Set<T>, T> {
        public c(AbstractC27800f abstractC27800f) {
            super(abstractC27800f, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ void mo68667f(AbstractC27807m abstractC27807m, Object obj) throws IOException {
            super.m68680k(abstractC27807m, (Collection) obj);
        }

        @Override // com.squareup.moshi.AbstractC27798d
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Set<T> mo68679i() {
            return new LinkedHashSet();
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ Object mo68666b(JsonReader jsonReader) throws IOException {
            return super.m68678g(jsonReader);
        }
    }

    public /* synthetic */ AbstractC27798d(AbstractC27800f abstractC27800f, a aVar) {
        this(abstractC27800f);
    }

    /* JADX INFO: renamed from: i */
    public abstract C mo68679i();

    /* JADX INFO: renamed from: com.squareup.moshi.d$a */
    /* JADX INFO: compiled from: CollectionJsonAdapter.java */
    public class a implements AbstractC27800f.d {
        @Override // com.squareup.moshi.AbstractC27800f.d
        /* JADX INFO: renamed from: a */
        public AbstractC27800f<?> mo68668a(Type type, Set<? extends Annotation> set, C27809o c27809o) {
            Class<?> clsM68774g = C27811q.m68774g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsM68774g != List.class && clsM68774g != Collection.class) {
                if (clsM68774g != Set.class) {
                    return null;
                }
                return AbstractC27798d.m68677j(type, c27809o).m68684d();
            }
            return AbstractC27798d.m68676h(type, c27809o).m68684d();
        }
    }

    public AbstractC27798d(AbstractC27800f<T> abstractC27800f) {
        this.f56594a = abstractC27800f;
    }

    /* JADX INFO: renamed from: h */
    public static <T> AbstractC27800f<Collection<T>> m68676h(Type type, C27809o c27809o) {
        return new b(c27809o.m68737d(C27811q.m68770c(type, Collection.class)));
    }

    /* JADX INFO: renamed from: j */
    public static <T> AbstractC27800f<Set<T>> m68677j(Type type, C27809o c27809o) {
        return new c(c27809o.m68737d(C27811q.m68770c(type, Collection.class)));
    }

    public String toString() {
        return this.f56594a + ".collection()";
    }

    /* JADX INFO: renamed from: g */
    public C m68678g(JsonReader jsonReader) throws IOException {
        C c11 = (C) mo68679i();
        jsonReader.mo68631a();
        while (jsonReader.mo68636j()) {
            c11.add(this.f56594a.mo68666b(jsonReader));
        }
        jsonReader.mo68633g();
        return c11;
    }

    /* JADX INFO: renamed from: k */
    public void m68680k(AbstractC27807m abstractC27807m, C c11) throws IOException {
        abstractC27807m.mo68713a();
        Iterator it = c11.iterator();
        while (it.hasNext()) {
            this.f56594a.mo68667f(abstractC27807m, (T) it.next());
        }
        abstractC27807m.mo68715h();
    }
}
