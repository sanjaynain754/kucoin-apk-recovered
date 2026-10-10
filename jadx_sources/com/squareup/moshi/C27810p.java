package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ob0.C43012b;

/* JADX INFO: renamed from: com.squareup.moshi.p */
/* JADX INFO: compiled from: StandardJsonAdapters.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27810p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC27800f.d f56645a = new c();

    /* JADX INFO: renamed from: b */
    public static final AbstractC27800f<Boolean> f56646b = new d();

    /* JADX INFO: renamed from: c */
    public static final AbstractC27800f<Byte> f56647c = new e();

    /* JADX INFO: renamed from: d */
    public static final AbstractC27800f<Character> f56648d = new f();

    /* JADX INFO: renamed from: e */
    public static final AbstractC27800f<Double> f56649e = new g();

    /* JADX INFO: renamed from: f */
    public static final AbstractC27800f<Float> f56650f = new h();

    /* JADX INFO: renamed from: g */
    public static final AbstractC27800f<Integer> f56651g = new i();

    /* JADX INFO: renamed from: h */
    public static final AbstractC27800f<Long> f56652h = new j();

    /* JADX INFO: renamed from: i */
    public static final AbstractC27800f<Short> f56653i = new k();

    /* JADX INFO: renamed from: j */
    public static final AbstractC27800f<String> f56654j = new a();

    /* JADX INFO: renamed from: com.squareup.moshi.p$a */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class a extends AbstractC27800f<String> {
        public String toString() {
            return "JsonAdapter(String)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public String mo68666b(JsonReader jsonReader) throws IOException {
            return jsonReader.mo68643q();
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, String str) throws IOException {
            abstractC27807m.mo68705E(str);
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$d */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class d extends AbstractC27800f<Boolean> {
        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean mo68666b(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.mo68638l());
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, Boolean bool) throws IOException {
            abstractC27807m.mo68706J(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$e */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class e extends AbstractC27800f<Byte> {
        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Byte mo68666b(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) C27810p.m68746a(jsonReader, "a byte", -128, 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, Byte b11) throws IOException {
            abstractC27807m.mo68720z(b11.intValue() & 255);
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$f */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class f extends AbstractC27800f<Character> {
        public String toString() {
            return "JsonAdapter(Character)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Character mo68666b(JsonReader jsonReader) throws IOException {
            String strMo68643q = jsonReader.mo68643q();
            if (strMo68643q.length() <= 1) {
                return Character.valueOf(strMo68643q.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + strMo68643q + '\"', jsonReader.getPath()));
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, Character ch2) throws IOException {
            abstractC27807m.mo68705E(ch2.toString());
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$g */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class g extends AbstractC27800f<Double> {
        public String toString() {
            return "JsonAdapter(Double)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Double mo68666b(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.mo68639m());
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, Double d11) throws IOException {
            abstractC27807m.mo68719x(d11.doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$h */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class h extends AbstractC27800f<Float> {
        public String toString() {
            return "JsonAdapter(Float)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Float mo68666b(JsonReader jsonReader) throws IOException {
            float fMo68639m = (float) jsonReader.mo68639m();
            if (!jsonReader.m68637k() && Float.isInfinite(fMo68639m)) {
                throw new JsonDataException("JSON forbids NaN and infinities: " + fMo68639m + " at path " + jsonReader.getPath());
            }
            return Float.valueOf(fMo68639m);
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, Float f11) throws IOException {
            f11.getClass();
            abstractC27807m.mo68704C(f11);
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$i */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class i extends AbstractC27800f<Integer> {
        public String toString() {
            return "JsonAdapter(Integer)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer mo68666b(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.mo68640n());
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, Integer num) throws IOException {
            abstractC27807m.mo68720z(num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$j */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class j extends AbstractC27800f<Long> {
        public String toString() {
            return "JsonAdapter(Long)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long mo68666b(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.mo68641o());
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, Long l11) throws IOException {
            abstractC27807m.mo68720z(l11.longValue());
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$k */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class k extends AbstractC27800f<Short> {
        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Short mo68666b(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) C27810p.m68746a(jsonReader, "a short", -32768, 32767));
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, Short sh2) throws IOException {
            abstractC27807m.mo68720z(sh2.intValue());
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$l */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public static final class l<T extends Enum<T>> extends AbstractC27800f<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f56656a;

        /* JADX INFO: renamed from: b */
        public final String[] f56657b;

        /* JADX INFO: renamed from: c */
        public final T[] f56658c;

        /* JADX INFO: renamed from: d */
        public final JsonReader.C27787a f56659d;

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo68666b(JsonReader jsonReader) throws IOException {
            int iMo68625C = jsonReader.mo68625C(this.f56659d);
            if (iMo68625C != -1) {
                return this.f56658c[iMo68625C];
            }
            String path = jsonReader.getPath();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f56657b) + " but was " + jsonReader.mo68643q() + " at path " + path);
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo68667f(AbstractC27807m abstractC27807m, T t11) throws IOException {
            abstractC27807m.mo68705E(this.f56657b[t11.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f56656a.getName() + ")";
        }

        public l(Class<T> cls) {
            String strName;
            this.f56656a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f56658c = enumConstants;
                this.f56657b = new String[enumConstants.length];
                int i11 = 0;
                while (true) {
                    T[] tArr = this.f56658c;
                    if (i11 < tArr.length) {
                        T t11 = tArr[i11];
                        InterfaceC27799e interfaceC27799e = (InterfaceC27799e) cls.getField(t11.name()).getAnnotation(InterfaceC27799e.class);
                        if (interfaceC27799e != null) {
                            strName = interfaceC27799e.name();
                        } else {
                            strName = t11.name();
                        }
                        this.f56657b[i11] = strName;
                        i11++;
                    } else {
                        this.f56659d = JsonReader.C27787a.m68648a(this.f56657b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e11) {
                throw new AssertionError("Missing field in " + cls.getName(), e11);
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$m */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public static final class m extends AbstractC27800f<Object> {

        /* JADX INFO: renamed from: a */
        public final C27809o f56660a;

        /* JADX INFO: renamed from: b */
        public final AbstractC27800f<List> f56661b;

        /* JADX INFO: renamed from: c */
        public final AbstractC27800f<Map> f56662c;

        /* JADX INFO: renamed from: d */
        public final AbstractC27800f<String> f56663d;

        /* JADX INFO: renamed from: e */
        public final AbstractC27800f<Double> f56664e;

        /* JADX INFO: renamed from: f */
        public final AbstractC27800f<Boolean> f56665f;

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: b */
        public Object mo68666b(JsonReader jsonReader) throws IOException {
            switch (b.f56655a[jsonReader.mo68644v().ordinal()]) {
                case 1:
                    return this.f56661b.mo68666b(jsonReader);
                case 2:
                    return this.f56662c.mo68666b(jsonReader);
                case 3:
                    return this.f56663d.mo68666b(jsonReader);
                case 4:
                    return this.f56664e.mo68666b(jsonReader);
                case 5:
                    return this.f56665f.mo68666b(jsonReader);
                case 6:
                    return jsonReader.mo68642p();
                default:
                    throw new IllegalStateException("Expected a value but was " + jsonReader.mo68644v() + " at path " + jsonReader.getPath());
            }
        }

        /* JADX INFO: renamed from: g */
        public final Class<?> m68767g(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }

        public m(C27809o c27809o) {
            this.f56660a = c27809o;
            this.f56661b = c27809o.m68736c(List.class);
            this.f56662c = c27809o.m68736c(Map.class);
            this.f56663d = c27809o.m68736c(String.class);
            this.f56664e = c27809o.m68736c(Double.class);
            this.f56665f = c27809o.m68736c(Boolean.class);
        }

        @Override // com.squareup.moshi.AbstractC27800f
        /* JADX INFO: renamed from: f */
        public void mo68667f(AbstractC27807m abstractC27807m, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                abstractC27807m.mo68714b();
                abstractC27807m.mo68716i();
            } else {
                this.f56660a.m68738e(m68767g(cls), C43012b.f95182a).mo68667f(abstractC27807m, obj);
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$b */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56655a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f56655a = iArr;
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56655a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56655a[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56655a[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56655a[JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56655a[JsonReader.Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.p$c */
    /* JADX INFO: compiled from: StandardJsonAdapters.java */
    public class c implements AbstractC27800f.d {
        @Override // com.squareup.moshi.AbstractC27800f.d
        /* JADX INFO: renamed from: a */
        public AbstractC27800f<?> mo68668a(Type type, Set<? extends Annotation> set, C27809o c27809o) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C27810p.f56646b;
            }
            if (type == Byte.TYPE) {
                return C27810p.f56647c;
            }
            if (type == Character.TYPE) {
                return C27810p.f56648d;
            }
            if (type == Double.TYPE) {
                return C27810p.f56649e;
            }
            if (type == Float.TYPE) {
                return C27810p.f56650f;
            }
            if (type == Integer.TYPE) {
                return C27810p.f56651g;
            }
            if (type == Long.TYPE) {
                return C27810p.f56652h;
            }
            if (type == Short.TYPE) {
                return C27810p.f56653i;
            }
            if (type == Boolean.class) {
                return C27810p.f56646b.m68684d();
            }
            if (type == Byte.class) {
                return C27810p.f56647c.m68684d();
            }
            if (type == Character.class) {
                return C27810p.f56648d.m68684d();
            }
            if (type == Double.class) {
                return C27810p.f56649e.m68684d();
            }
            if (type == Float.class) {
                return C27810p.f56650f.m68684d();
            }
            if (type == Integer.class) {
                return C27810p.f56651g.m68684d();
            }
            if (type == Long.class) {
                return C27810p.f56652h.m68684d();
            }
            if (type == Short.class) {
                return C27810p.f56653i.m68684d();
            }
            if (type == String.class) {
                return C27810p.f56654j.m68684d();
            }
            if (type == Object.class) {
                return new m(c27809o).m68684d();
            }
            Class<?> clsM68774g = C27811q.m68774g(type);
            AbstractC27800f<?> abstractC27800fM94464d = C43012b.m94464d(c27809o, type, clsM68774g);
            if (abstractC27800fM94464d != null) {
                return abstractC27800fM94464d;
            }
            if (!clsM68774g.isEnum()) {
                return null;
            }
            return new l(clsM68774g).m68684d();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m68746a(JsonReader jsonReader, String str, int i11, int i12) throws IOException {
        int iMo68640n = jsonReader.mo68640n();
        if (iMo68640n >= i11 && iMo68640n <= i12) {
            return iMo68640n;
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iMo68640n), jsonReader.getPath()));
    }
}
