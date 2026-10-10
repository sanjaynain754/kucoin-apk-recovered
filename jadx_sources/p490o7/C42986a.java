package p490o7;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.util.C6490g;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o7.a */
/* JADX INFO: compiled from: JDK14Util.java */
/* JADX INFO: loaded from: classes45.dex */
public class C42986a {

    /* JADX INFO: renamed from: o7.a$a */
    /* JADX INFO: compiled from: JDK14Util.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC6340b f95118a;

        /* JADX INFO: renamed from: b */
        public final DeserializationConfig f95119b;

        /* JADX INFO: renamed from: c */
        public final AnnotationIntrospector f95120c;

        /* JADX INFO: renamed from: d */
        public final List<AnnotatedConstructor> f95121d;

        /* JADX INFO: renamed from: e */
        public final AnnotatedConstructor f95122e;

        /* JADX INFO: renamed from: f */
        public final b[] f95123f;

        /* JADX INFO: renamed from: a */
        public AnnotatedConstructor m94410a(List<String> list) {
            for (AnnotatedConstructor annotatedConstructor : this.f95121d) {
                JsonCreator.Mode modeFindCreatorAnnotation = this.f95120c.findCreatorAnnotation(this.f95119b, annotatedConstructor);
                if (modeFindCreatorAnnotation != null && JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation && (JsonCreator.Mode.DELEGATING == modeFindCreatorAnnotation || annotatedConstructor != this.f95122e)) {
                    return null;
                }
            }
            for (b bVar : this.f95123f) {
                list.add(bVar.f95125b);
            }
            return this.f95122e;
        }

        public a(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b) {
            AnnotatedConstructor annotatedConstructorMo11158d;
            this.f95118a = abstractC6340b;
            this.f95120c = deserializationContext.getAnnotationIntrospector();
            this.f95119b = deserializationContext.getConfig();
            b[] bVarArrM94413b = c.m94411c().m94413b(abstractC6340b.m11172r());
            this.f95123f = bVarArrM94413b;
            int length = bVarArrM94413b.length;
            if (length == 0) {
                annotatedConstructorMo11158d = abstractC6340b.mo11158d();
                this.f95121d = Collections.singletonList(annotatedConstructorMo11158d);
            } else {
                List<AnnotatedConstructor> listMo11175u = abstractC6340b.mo11175u();
                this.f95121d = listMo11175u;
                Iterator<AnnotatedConstructor> it = listMo11175u.iterator();
                loop0: while (true) {
                    if (it.hasNext()) {
                        AnnotatedConstructor next = it.next();
                        if (next.getParameterCount() == length) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    if (!next.getRawParameterType(i11).equals(this.f95123f[i11].f95124a)) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    annotatedConstructorMo11158d = next;
                                    break loop0;
                                }
                            }
                        }
                    } else {
                        annotatedConstructorMo11158d = null;
                        break;
                    }
                }
            }
            if (annotatedConstructorMo11158d != null) {
                this.f95122e = annotatedConstructorMo11158d;
                return;
            }
            throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + C6490g.m11904G(this.f95118a.m11151A()));
        }
    }

    /* JADX INFO: renamed from: o7.a$c */
    /* JADX INFO: compiled from: JDK14Util.java */
    public static class c {

        /* JADX INFO: renamed from: d */
        public static final c f95126d;

        /* JADX INFO: renamed from: e */
        public static final RuntimeException f95127e;

        /* JADX INFO: renamed from: a */
        public final Method f95128a;

        /* JADX INFO: renamed from: b */
        public final Method f95129b;

        /* JADX INFO: renamed from: c */
        public final Method f95130c;

        static {
            c cVar = null;
            try {
                e = null;
                cVar = new c();
            } catch (RuntimeException e11) {
                e = e11;
            }
            f95126d = cVar;
            f95127e = e;
        }

        /* JADX INFO: renamed from: c */
        public static c m94411c() {
            RuntimeException runtimeException = f95127e;
            if (runtimeException == null) {
                return f95126d;
            }
            throw runtimeException;
        }

        /* JADX INFO: renamed from: d */
        public Object[] m94414d(Class<?> cls) throws IllegalArgumentException {
            try {
                return (Object[]) this.f95128a.invoke(cls, new Object[0]);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to access RecordComponents of type " + C6490g.m11921X(cls));
            }
        }

        public c() throws RuntimeException {
            try {
                this.f95128a = Class.class.getMethod("getRecordComponents", new Class[0]);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.f95129b = cls.getMethod("getName", new Class[0]);
                this.f95130c = cls.getMethod("getType", new Class[0]);
            } catch (Exception e11) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e11.getClass().getName(), e11.getMessage()), e11);
            }
        }

        /* JADX INFO: renamed from: a */
        public String[] m94412a(Class<?> cls) throws IllegalArgumentException {
            Object[] objArrM94414d = m94414d(cls);
            String[] strArr = new String[objArrM94414d.length];
            for (int i11 = 0; i11 < objArrM94414d.length; i11++) {
                try {
                    strArr[i11] = (String) this.f95129b.invoke(objArrM94414d[i11], new Object[0]);
                } catch (Exception e11) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i11), Integer.valueOf(objArrM94414d.length), C6490g.m11921X(cls)), e11);
                }
            }
            return strArr;
        }

        /* JADX INFO: renamed from: b */
        public b[] m94413b(Class<?> cls) throws IllegalArgumentException {
            Object[] objArrM94414d = m94414d(cls);
            b[] bVarArr = new b[objArrM94414d.length];
            for (int i11 = 0; i11 < objArrM94414d.length; i11++) {
                try {
                    try {
                        bVarArr[i11] = new b((Class) this.f95130c.invoke(objArrM94414d[i11], new Object[0]), (String) this.f95129b.invoke(objArrM94414d[i11], new Object[0]));
                    } catch (Exception e11) {
                        throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i11), Integer.valueOf(objArrM94414d.length), C6490g.m11921X(cls)), e11);
                    }
                } catch (Exception e12) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i11), Integer.valueOf(objArrM94414d.length), C6490g.m11921X(cls)), e12);
                }
            }
            return bVarArr;
        }
    }

    /* JADX INFO: renamed from: o7.a$b */
    /* JADX INFO: compiled from: JDK14Util.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Class<?> f95124a;

        /* JADX INFO: renamed from: b */
        public final String f95125b;

        public b(Class<?> cls, String str) {
            this.f95124a = cls;
            this.f95125b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AnnotatedConstructor m94408a(DeserializationContext deserializationContext, AbstractC6340b abstractC6340b, List<String> list) {
        return new a(deserializationContext, abstractC6340b).m94410a(list);
    }

    /* JADX INFO: renamed from: b */
    public static String[] m94409b(Class<?> cls) {
        return c.m94411c().m94412a(cls);
    }
}
