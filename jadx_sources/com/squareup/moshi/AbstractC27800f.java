package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import ob0.C43011a;

/* JADX INFO: renamed from: com.squareup.moshi.f */
/* JADX INFO: compiled from: JsonAdapter.java */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27800f<T> {

    /* JADX INFO: renamed from: com.squareup.moshi.f$a */
    /* JADX INFO: compiled from: JsonAdapter.java */
    public class a extends AbstractC27800f<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC27800f f56595a;

        public a(AbstractC27800f abstractC27800f) {
            this.f56595a = abstractC27800f;
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: b */
        public T mo68666b(JsonReader jsonReader) throws IOException {
            return (T) this.f56595a.mo68666b(jsonReader);
        }

        public String toString() {
            return this.f56595a + ".serializeNulls()";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: f */
        public void mo68667f(AbstractC27807m abstractC27807m, T t11) throws IOException {
            boolean zM68724j = abstractC27807m.m68724j();
            abstractC27807m.m68731w(true);
            try {
                this.f56595a.mo68667f(abstractC27807m, t11);
            } finally {
                abstractC27807m.m68731w(zM68724j);
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.f$b */
    /* JADX INFO: compiled from: JsonAdapter.java */
    public class b extends AbstractC27800f<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC27800f f56597a;

        public b(AbstractC27800f abstractC27800f) {
            this.f56597a = abstractC27800f;
        }

        public String toString() {
            return this.f56597a + ".lenient()";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: b */
        public T mo68666b(JsonReader jsonReader) throws IOException {
            boolean zM68637k = jsonReader.m68637k();
            jsonReader.m68627J(true);
            try {
                return (T) this.f56597a.mo68666b(jsonReader);
            } finally {
                jsonReader.m68627J(zM68637k);
            }
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: f */
        public void mo68667f(AbstractC27807m abstractC27807m, T t11) throws IOException {
            boolean zM68725k = abstractC27807m.m68725k();
            abstractC27807m.m68730v(true);
            try {
                this.f56597a.mo68667f(abstractC27807m, t11);
            } finally {
                abstractC27807m.m68730v(zM68725k);
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.f$c */
    /* JADX INFO: compiled from: JsonAdapter.java */
    public class c extends AbstractC27800f<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC27800f f56599a;

        public c(AbstractC27800f abstractC27800f) {
            this.f56599a = abstractC27800f;
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: f */
        public void mo68667f(AbstractC27807m abstractC27807m, T t11) throws IOException {
            this.f56599a.mo68667f(abstractC27807m, t11);
        }

        public String toString() {
            return this.f56599a + ".failOnUnknown()";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: b */
        public T mo68666b(JsonReader jsonReader) throws IOException {
            boolean zM68635i = jsonReader.m68635i();
            jsonReader.m68626E(true);
            try {
                return (T) this.f56599a.mo68666b(jsonReader);
            } finally {
                jsonReader.m68626E(zM68635i);
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.f$d */
    /* JADX INFO: compiled from: JsonAdapter.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        AbstractC27800f<?> mo68668a(Type type, Set<? extends Annotation> set, C27809o c27809o);
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo68666b(JsonReader jsonReader) throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract void mo68667f(AbstractC27807m abstractC27807m, T t11) throws IOException;

    /* JADX INFO: renamed from: a */
    public final AbstractC27800f<T> m68682a() {
        return new c(this);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC27800f<T> m68683c() {
        return new b(this);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC27800f<T> m68684d() {
        return this instanceof C43011a ? this : new C43011a(this);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC27800f<T> m68685e() {
        return new a(this);
    }
}
