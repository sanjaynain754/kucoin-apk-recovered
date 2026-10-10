package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import ob0.C43012b;

/* JADX INFO: renamed from: com.squareup.moshi.c */
/* JADX INFO: compiled from: ClassJsonAdapter.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27797c<T> extends AbstractC27800f<T> {

    /* JADX INFO: renamed from: d */
    public static final AbstractC27800f.d f56586d = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC27796b<T> f56587a;

    /* JADX INFO: renamed from: b */
    public final b<?>[] f56588b;

    /* JADX INFO: renamed from: c */
    public final JsonReader.C27787a f56589c;

    /* JADX INFO: renamed from: com.squareup.moshi.c$a */
    /* JADX INFO: compiled from: ClassJsonAdapter.java */
    public class a implements AbstractC27800f.d {
        @Override // com.squareup.moshi.AbstractC27800f.d
        /* JADX INFO: renamed from: a */
        public AbstractC27800f<?> mo68668a(Type type, Set<? extends Annotation> set, C27809o c27809o) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsM68774g = C27811q.m68774g(type);
            if (clsM68774g.isInterface() || clsM68774g.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C43012b.m94469i(clsM68774g)) {
                m68673d(type, List.class);
                m68673d(type, Set.class);
                m68673d(type, Map.class);
                m68673d(type, Collection.class);
                String str = "Platform " + clsM68774g;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsM68774g.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsM68774g.getName());
            }
            if (clsM68774g.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsM68774g.getName());
            }
            if (clsM68774g.getEnclosingClass() != null && !Modifier.isStatic(clsM68774g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsM68774g.getName());
            }
            if (Modifier.isAbstract(clsM68774g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsM68774g.getName());
            }
            if (C43012b.m94468h(clsM68774g)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsM68774g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            AbstractC27796b abstractC27796bM68669a = AbstractC27796b.m68669a(clsM68774g);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                m68671b(c27809o, type, treeMap);
                type = C27811q.m68773f(type);
            }
            return new C27797c(abstractC27796bM68669a, treeMap).m68684d();
        }

        /* JADX INFO: renamed from: b */
        public final void m68671b(C27809o c27809o, Type type, Map<String, b<?>> map) {
            Class<?> clsM68774g = C27811q.m68774g(type);
            boolean zM94469i = C43012b.m94469i(clsM68774g);
            for (Field field : clsM68774g.getDeclaredFields()) {
                if (m68672c(zM94469i, field.getModifiers())) {
                    Type typeM94473m = C43012b.m94473m(type, clsM68774g, field.getGenericType());
                    Set<? extends Annotation> setM94470j = C43012b.m94470j(field);
                    String name = field.getName();
                    AbstractC27800f<T> abstractC27800fM68739f = c27809o.m68739f(typeM94473m, setM94470j, name);
                    field.setAccessible(true);
                    InterfaceC27799e interfaceC27799e = (InterfaceC27799e) field.getAnnotation(InterfaceC27799e.class);
                    if (interfaceC27799e != null) {
                        name = interfaceC27799e.name();
                    }
                    b<?> bVar = new b<>(name, field, abstractC27800fM68739f);
                    b<?> bVarPut = map.put(name, bVar);
                    if (bVarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVarPut.f56591b + "\n    " + bVar.f56591b);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m68672c(boolean z11, int i11) {
            if (Modifier.isStatic(i11) || Modifier.isTransient(i11)) {
                return false;
            }
            if (!Modifier.isPublic(i11) && !Modifier.isProtected(i11) && z11) {
                return false;
            }
            return true;
        }

        /* JADX INFO: renamed from: d */
        public final void m68673d(Type type, Class<?> cls) {
            Class<?> clsM68774g = C27811q.m68774g(type);
            if (!cls.isAssignableFrom(clsM68774g)) {
                return;
            }
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsM68774g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.c$b */
    /* JADX INFO: compiled from: ClassJsonAdapter.java */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        public final String f56590a;

        /* JADX INFO: renamed from: b */
        public final Field f56591b;

        /* JADX INFO: renamed from: c */
        public final AbstractC27800f<T> f56592c;

        /* JADX INFO: renamed from: a */
        public void m68674a(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
            this.f56591b.set(obj, this.f56592c.mo68666b(jsonReader));
        }

        /* JADX INFO: renamed from: b */
        public void m68675b(AbstractC27807m abstractC27807m, Object obj) throws IllegalAccessException, IOException {
            this.f56592c.mo68667f(abstractC27807m, (T) this.f56591b.get(obj));
        }

        public b(String str, Field field, AbstractC27800f<T> abstractC27800f) {
            this.f56590a = str;
            this.f56591b = field;
            this.f56592c = abstractC27800f;
        }
    }

    @Override // com.squareup.moshi.AbstractC27800f
    /* JADX INFO: renamed from: b */
    public T mo68666b(JsonReader jsonReader) throws IOException {
        try {
            T tMo68670b = this.f56587a.mo68670b();
            try {
                jsonReader.mo68632b();
                while (jsonReader.mo68636j()) {
                    int iMo68647z = jsonReader.mo68647z(this.f56589c);
                    if (iMo68647z == -1) {
                        jsonReader.mo68628L();
                        jsonReader.mo68629M();
                    } else {
                        this.f56588b[iMo68647z].m68674a(jsonReader, tMo68670b);
                    }
                }
                jsonReader.mo68634h();
                return tMo68670b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw C43012b.m94476p(e12);
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f56587a + ")";
    }

    public C27797c(AbstractC27796b<T> abstractC27796b, Map<String, b<?>> map) {
        this.f56587a = abstractC27796b;
        this.f56588b = (b[]) map.values().toArray(new b[map.size()]);
        this.f56589c = JsonReader.C27787a.m68648a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.AbstractC27800f
    /* JADX INFO: renamed from: f */
    public void mo68667f(AbstractC27807m abstractC27807m, T t11) throws IOException {
        try {
            abstractC27807m.mo68714b();
            for (b<?> bVar : this.f56588b) {
                abstractC27807m.mo68717l(bVar.f56590a);
                bVar.m68675b(abstractC27807m, t11);
            }
            abstractC27807m.mo68716i();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
