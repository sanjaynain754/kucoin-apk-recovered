package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.e */
/* JADX INFO: compiled from: JavaUtilCollectionsDeserializers.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6370e {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.e$a */
    /* JADX INFO: compiled from: JavaUtilCollectionsDeserializers.java */
    public static class a implements InterfaceC6491h<Object, Object> {

        /* JADX INFO: renamed from: a */
        public final JavaType f10309a;

        /* JADX INFO: renamed from: b */
        public final int f10310b;

        /* JADX INFO: renamed from: c */
        public final void m11362c(int i11) {
            if (i11 == 1) {
                return;
            }
            throw new IllegalArgumentException("Can not deserialize Singleton container from " + i11 + " entries");
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6491h
        /* JADX INFO: renamed from: a */
        public JavaType mo11360a(TypeFactory typeFactory) {
            return this.f10309a;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6491h
        /* JADX INFO: renamed from: b */
        public JavaType mo11361b(TypeFactory typeFactory) {
            return this.f10309a;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6491h
        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f10310b) {
                case 1:
                    Set set = (Set) obj;
                    m11362c(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    m11362c(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    m11362c(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }

        public a(int i11, JavaType javaType) {
            this.f10309a = javaType;
            this.f10310b = i11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m11351a(String str) {
        if (str.startsWith("Singleton")) {
            return str.substring(9);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m11352b(String str) {
        if (str.startsWith("Synchronized")) {
            return str.substring(12);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m11353c(String str) {
        if (str.startsWith("Unmodifiable")) {
            return str.substring(12);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m11354d(String str) {
        if (str.startsWith("java.util.Arrays$")) {
            return str.substring(17);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m11355e(String str) {
        if (str.startsWith("java.util.ImmutableCollections$")) {
            return str.substring(31);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m11356f(String str) {
        if (str.startsWith("java.util.Collections$")) {
            return str.substring(22);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static a m11357g(int i11, JavaType javaType, Class<?> cls) {
        return new a(i11, javaType.findSuperType(cls));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX INFO: renamed from: h */
    public static AbstractC6390e<?> m11358h(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        a aVarM11357g;
        String name = javaType.getRawClass().getName();
        if (!name.startsWith("java.util.")) {
            return null;
        }
        String strM11356f = m11356f(name);
        if (strM11356f != null) {
            String strM11353c = m11353c(strM11356f);
            if (strM11353c != null) {
                if (strM11353c.endsWith("Set")) {
                    aVarM11357g = m11357g(4, javaType, Set.class);
                } else if (strM11353c.endsWith("List")) {
                    aVarM11357g = m11357g(5, javaType, List.class);
                } else {
                    aVarM11357g = null;
                }
            } else {
                String strM11351a = m11351a(strM11356f);
                if (strM11351a != null) {
                    if (strM11351a.endsWith("Set")) {
                        aVarM11357g = m11357g(1, javaType, Set.class);
                    } else if (strM11351a.endsWith("List")) {
                        aVarM11357g = m11357g(2, javaType, List.class);
                    } else {
                        aVarM11357g = null;
                    }
                } else {
                    String strM11352b = m11352b(strM11356f);
                    if (strM11352b != null) {
                        if (strM11352b.endsWith("Set")) {
                            aVarM11357g = m11357g(7, javaType, Set.class);
                        } else if (strM11352b.endsWith("List")) {
                            aVarM11357g = m11357g(9, javaType, List.class);
                        } else if (strM11352b.endsWith("Collection")) {
                            aVarM11357g = m11357g(8, javaType, Collection.class);
                        } else {
                            aVarM11357g = null;
                        }
                    } else {
                        aVarM11357g = null;
                    }
                }
            }
            if (aVarM11357g == null) {
                return null;
            }
            return new StdDelegatingDeserializer(aVarM11357g);
        }
        String strM11354d = m11354d(name);
        if (strM11354d != null) {
            if (!strM11354d.contains("List")) {
                return null;
            }
            return new StdDelegatingDeserializer(m11357g(11, javaType, List.class));
        }
        String strM11355e = m11355e(name);
        if (strM11355e != null) {
            if (strM11355e.contains("List")) {
                return new StdDelegatingDeserializer(m11357g(11, javaType, List.class));
            }
            if (strM11355e.contains("Set")) {
                return new StdDelegatingDeserializer(m11357g(4, javaType, Set.class));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX INFO: renamed from: i */
    public static AbstractC6390e<?> m11359i(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        a aVarM11357g;
        String name = javaType.getRawClass().getName();
        String strM11356f = m11356f(name);
        if (strM11356f != null) {
            String strM11353c = m11353c(strM11356f);
            if (strM11353c != null) {
                if (strM11353c.contains("Map")) {
                    aVarM11357g = m11357g(6, javaType, Map.class);
                } else {
                    aVarM11357g = null;
                }
            } else {
                String strM11351a = m11351a(strM11356f);
                if (strM11351a != null) {
                    if (strM11351a.contains("Map")) {
                        aVarM11357g = m11357g(3, javaType, Map.class);
                    } else {
                        aVarM11357g = null;
                    }
                } else {
                    String strM11352b = m11352b(strM11356f);
                    if (strM11352b != null && strM11352b.contains("Map")) {
                        aVarM11357g = m11357g(10, javaType, Map.class);
                    } else {
                        aVarM11357g = null;
                    }
                }
            }
        } else {
            String strM11355e = m11355e(name);
            if (strM11355e != null && strM11355e.contains("Map")) {
                aVarM11357g = m11357g(6, javaType, Map.class);
            } else {
                aVarM11357g = null;
            }
        }
        if (aVarM11357g == null) {
            return null;
        }
        return new StdDelegatingDeserializer(aVarM11357g);
    }
}
