package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.AbstractC6344b;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s */
/* JADX INFO: compiled from: POJOPropertyBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6422s extends AbstractC6414k implements Comparable<C6422s> {

    /* JADX INFO: renamed from: n */
    public static final AnnotationIntrospector.ReferenceProperty f10485n = AnnotationIntrospector.ReferenceProperty.m11127e("");

    /* JADX INFO: renamed from: c */
    public final boolean f10486c;

    /* JADX INFO: renamed from: d */
    public final MapperConfig<?> f10487d;

    /* JADX INFO: renamed from: e */
    public final AnnotationIntrospector f10488e;

    /* JADX INFO: renamed from: f */
    public final PropertyName f10489f;

    /* JADX INFO: renamed from: g */
    public final PropertyName f10490g;

    /* JADX INFO: renamed from: h */
    public g<AnnotatedField> f10491h;

    /* JADX INFO: renamed from: i */
    public g<AnnotatedParameter> f10492i;

    /* JADX INFO: renamed from: j */
    public g<AnnotatedMethod> f10493j;

    /* JADX INFO: renamed from: k */
    public g<AnnotatedMethod> f10494k;

    /* JADX INFO: renamed from: l */
    public transient PropertyMetadata f10495l;

    /* JADX INFO: renamed from: m */
    public transient AnnotationIntrospector.ReferenceProperty f10496m;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$a */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public class a implements i<Class<?>[]> {
        public a() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.C6422s.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Class<?>[] mo11662a(AnnotatedMember annotatedMember) {
            return C6422s.this.f10488e.findViews(annotatedMember);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$b */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public class b implements i<AnnotationIntrospector.ReferenceProperty> {
        public b() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.C6422s.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnnotationIntrospector.ReferenceProperty mo11662a(AnnotatedMember annotatedMember) {
            return C6422s.this.f10488e.findReferenceType(annotatedMember);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$c */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public class c implements i<Boolean> {
        public c() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.C6422s.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo11662a(AnnotatedMember annotatedMember) {
            return C6422s.this.f10488e.isTypeId(annotatedMember);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$d */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public class d implements i<C6419p> {
        public d() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.C6422s.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6419p mo11662a(AnnotatedMember annotatedMember) {
            C6419p c6419pFindObjectIdInfo = C6422s.this.f10488e.findObjectIdInfo(annotatedMember);
            return c6419pFindObjectIdInfo != null ? C6422s.this.f10488e.findObjectReferenceInfo(annotatedMember, c6419pFindObjectIdInfo) : c6419pFindObjectIdInfo;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$e */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public class e implements i<JsonProperty.Access> {
        public e() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.C6422s.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonProperty.Access mo11662a(AnnotatedMember annotatedMember) {
            return C6422s.this.f10488e.findPropertyAccess(annotatedMember);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$g */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public static final class g<T> {

        /* JADX INFO: renamed from: a */
        public final T f10503a;

        /* JADX INFO: renamed from: b */
        public final g<T> f10504b;

        /* JADX INFO: renamed from: c */
        public final PropertyName f10505c;

        /* JADX INFO: renamed from: d */
        public final boolean f10506d;

        /* JADX INFO: renamed from: e */
        public final boolean f10507e;

        /* JADX INFO: renamed from: f */
        public final boolean f10508f;

        /* JADX INFO: renamed from: a */
        public g<T> m11668a(g<T> gVar) {
            g<T> gVar2 = this.f10504b;
            return gVar2 == null ? m11670c(gVar) : m11670c(gVar2.m11668a(gVar));
        }

        /* JADX INFO: renamed from: b */
        public g<T> m11669b() {
            g<T> gVar = this.f10504b;
            if (gVar == null) {
                return this;
            }
            g<T> gVarM11669b = gVar.m11669b();
            if (this.f10505c != null) {
                return gVarM11669b.f10505c == null ? m11670c(null) : m11670c(gVarM11669b);
            }
            if (gVarM11669b.f10505c != null) {
                return gVarM11669b;
            }
            boolean z11 = this.f10507e;
            if (z11 == gVarM11669b.f10507e) {
                return m11670c(gVarM11669b);
            }
            return z11 ? m11670c(null) : gVarM11669b;
        }

        /* JADX INFO: renamed from: c */
        public g<T> m11670c(g<T> gVar) {
            return gVar == this.f10504b ? this : new g<>(this.f10503a, gVar, this.f10505c, this.f10506d, this.f10507e, this.f10508f);
        }

        /* JADX INFO: renamed from: d */
        public g<T> m11671d(T t11) {
            return t11 == this.f10503a ? this : new g<>(t11, this.f10504b, this.f10505c, this.f10506d, this.f10507e, this.f10508f);
        }

        /* JADX INFO: renamed from: e */
        public g<T> m11672e() {
            g<T> gVarM11672e;
            if (!this.f10508f) {
                g<T> gVar = this.f10504b;
                return (gVar == null || (gVarM11672e = gVar.m11672e()) == this.f10504b) ? this : m11670c(gVarM11672e);
            }
            g<T> gVar2 = this.f10504b;
            if (gVar2 == null) {
                return null;
            }
            return gVar2.m11672e();
        }

        /* JADX INFO: renamed from: f */
        public g<T> m11673f() {
            return this.f10504b == null ? this : new g<>(this.f10503a, null, this.f10505c, this.f10506d, this.f10507e, this.f10508f);
        }

        /* JADX INFO: renamed from: g */
        public g<T> m11674g() {
            g<T> gVar = this.f10504b;
            g<T> gVarM11674g = gVar == null ? null : gVar.m11674g();
            return this.f10507e ? m11670c(gVarM11674g) : gVarM11674g;
        }

        public String toString() {
            String str = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.f10503a.toString(), Boolean.valueOf(this.f10507e), Boolean.valueOf(this.f10508f), Boolean.valueOf(this.f10506d));
            if (this.f10504b == null) {
                return str;
            }
            return str + ", " + this.f10504b.toString();
        }

        public g(T t11, g<T> gVar, PropertyName propertyName, boolean z11, boolean z12, boolean z13) {
            PropertyName propertyName2;
            this.f10503a = t11;
            this.f10504b = gVar;
            if (propertyName != null && !propertyName.isEmpty()) {
                propertyName2 = propertyName;
            } else {
                propertyName2 = null;
            }
            this.f10505c = propertyName2;
            if (z11) {
                if (propertyName2 != null) {
                    if (!propertyName.hasSimpleName()) {
                        z11 = false;
                    }
                } else {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
            }
            this.f10506d = z11;
            this.f10507e = z12;
            this.f10508f = z13;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$h */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public static class h<T extends AnnotatedMember> implements Iterator<T> {

        /* JADX INFO: renamed from: b */
        public g<T> f10509b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public T next() {
            g<T> gVar = this.f10509b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            T t11 = gVar.f10503a;
            this.f10509b = gVar.f10504b;
            return t11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10509b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public h(g<T> gVar) {
            this.f10509b = gVar;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$i */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public interface i<T> {
        /* JADX INFO: renamed from: a */
        T mo11662a(AnnotatedMember annotatedMember);
    }

    public C6422s(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z11, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z11, propertyName, propertyName);
    }

    /* JADX INFO: renamed from: F */
    public final void m11622F(Collection<PropertyName> collection, Map<PropertyName, C6422s> map, g<?> gVar) {
        for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.f10504b) {
            PropertyName propertyName = gVar2.f10505c;
            if (gVar2.f10506d && propertyName != null) {
                C6422s c6422s = map.get(propertyName);
                if (c6422s == null) {
                    c6422s = new C6422s(this.f10487d, this.f10488e, this.f10486c, this.f10490g, propertyName);
                    map.put(propertyName, c6422s);
                }
                if (gVar == this.f10491h) {
                    c6422s.f10491h = gVar2.m11670c(c6422s.f10491h);
                } else if (gVar == this.f10493j) {
                    c6422s.f10493j = gVar2.m11670c(c6422s.f10493j);
                } else if (gVar == this.f10494k) {
                    c6422s.f10494k = gVar2.m11670c(c6422s.f10494k);
                } else {
                    if (gVar != this.f10492i) {
                        throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                    }
                    c6422s.f10492i = gVar2.m11670c(c6422s.f10492i);
                }
            } else if (gVar2.f10507e) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name " + C6490g.m11918U(this.f10489f) + "): found multiple explicit names: " + collection + ", but also implicit accessor: " + gVar2);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public Set<PropertyName> m11645c0() {
        Set<PropertyName> setM11623G = m11623G(this.f10492i, m11623G(this.f10494k, m11623G(this.f10493j, m11623G(this.f10491h, null))));
        return setM11623G == null ? Collections.EMPTY_SET : setM11623G;
    }

    /* JADX INFO: renamed from: m0 */
    public void m11654m0(boolean z11) {
        if (z11) {
            g<AnnotatedMethod> gVar = this.f10493j;
            if (gVar != null) {
                this.f10493j = m11621E(this.f10493j, m11627K(0, gVar, this.f10491h, this.f10492i, this.f10494k));
                return;
            }
            g<AnnotatedField> gVar2 = this.f10491h;
            if (gVar2 != null) {
                this.f10491h = m11621E(this.f10491h, m11627K(0, gVar2, this.f10492i, this.f10494k));
                return;
            }
            return;
        }
        g<AnnotatedParameter> gVar3 = this.f10492i;
        if (gVar3 != null) {
            this.f10492i = m11621E(this.f10492i, m11627K(0, gVar3, this.f10494k, this.f10491h, this.f10493j));
            return;
        }
        g<AnnotatedMethod> gVar4 = this.f10494k;
        if (gVar4 != null) {
            this.f10494k = m11621E(this.f10494k, m11627K(0, gVar4, this.f10491h, this.f10493j));
            return;
        }
        g<AnnotatedField> gVar5 = this.f10491h;
        if (gVar5 != null) {
            this.f10491h = m11621E(this.f10491h, m11627K(0, gVar5, this.f10493j));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m11655n0() {
        this.f10492i = null;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.s$f */
    /* JADX INFO: compiled from: POJOPropertyBuilder.java */
    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10502a;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            f10502a = iArr;
            try {
                iArr[JsonProperty.Access.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10502a[JsonProperty.Access.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10502a[JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10502a[JsonProperty.Access.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C6422s(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z11, PropertyName propertyName, PropertyName propertyName2) {
        this.f10487d = mapperConfig;
        this.f10488e = annotationIntrospector;
        this.f10490g = propertyName;
        this.f10489f = propertyName2;
        this.f10486c = z11;
    }

    /* JADX INFO: renamed from: l0 */
    public static <T> g<T> m11617l0(g<T> gVar, g<T> gVar2) {
        if (gVar == null) {
            return gVar2;
        }
        return gVar2 == null ? gVar : gVar.m11668a(gVar2);
    }

    /* JADX INFO: renamed from: A */
    public final <T> boolean m11618A(g<T> gVar) {
        while (gVar != null) {
            PropertyName propertyName = gVar.f10505c;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            gVar = gVar.f10504b;
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final <T> boolean m11619C(g<T> gVar) {
        while (gVar != null) {
            if (gVar.f10508f) {
                return true;
            }
            gVar = gVar.f10504b;
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final <T> boolean m11620D(g<T> gVar) {
        while (gVar != null) {
            if (gVar.f10507e) {
                return true;
            }
            gVar = gVar.f10504b;
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final <T extends AnnotatedMember> g<T> m11621E(g<T> gVar, C6412i c6412i) {
        AnnotatedMember annotatedMember = (AnnotatedMember) gVar.f10503a.withAnnotations(c6412i);
        g<T> gVar2 = gVar.f10504b;
        g gVarM11670c = gVar;
        if (gVar2 != null) {
            gVarM11670c = gVar.m11670c(m11621E(gVar2, c6412i));
        }
        return gVarM11670c.m11671d(annotatedMember);
    }

    /* JADX INFO: renamed from: G */
    public final Set<PropertyName> m11623G(g<? extends AnnotatedMember> gVar, Set<PropertyName> set) {
        for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.f10504b) {
            if (gVar2.f10506d && gVar2.f10505c != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(gVar2.f10505c);
            }
        }
        return set;
    }

    /* JADX INFO: renamed from: H */
    public final <T extends AnnotatedMember> C6412i m11624H(g<T> gVar) {
        C6412i allAnnotations = gVar.f10503a.getAllAnnotations();
        g<T> gVar2 = gVar.f10504b;
        return gVar2 != null ? C6412i.m11512d(allAnnotations, m11624H(gVar2)) : allAnnotations;
    }

    /* JADX INFO: renamed from: K */
    public final C6412i m11627K(int i11, g<? extends AnnotatedMember>... gVarArr) {
        C6412i c6412iM11624H = m11624H(gVarArr[i11]);
        do {
            i11++;
            if (i11 >= gVarArr.length) {
                return c6412iM11624H;
            }
        } while (gVarArr[i11] == null);
        return C6412i.m11512d(c6412iM11624H, m11627K(i11, gVarArr));
    }

    /* JADX INFO: renamed from: L */
    public Class<?> m11628L(AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() > 0) {
                return annotatedMethod.getParameterType(0).getRawClass();
            }
        }
        return annotatedMember.getType().getRawClass();
    }

    /* JADX INFO: renamed from: M */
    public final <T> g<T> m11629M(g<T> gVar) {
        return gVar == null ? gVar : gVar.m11672e();
    }

    /* JADX INFO: renamed from: N */
    public final <T> g<T> m11630N(g<T> gVar) {
        return gVar == null ? gVar : gVar.m11674g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public AnnotatedMethod m11632P(g<AnnotatedMethod> gVar, g<AnnotatedMethod> gVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(gVar.f10503a);
        arrayList.add(gVar2.f10503a);
        g gVar3 = gVar2.f10504b;
        g gVar4 = gVar;
        while (gVar3 != null) {
            AnnotatedMethod annotatedMethodM11631O = m11631O((AnnotatedMethod) gVar4.f10503a, (AnnotatedMethod) gVar3.f10503a);
            if (annotatedMethodM11631O != gVar4.f10503a) {
                T t11 = gVar3.f10503a;
                if (annotatedMethodM11631O == t11) {
                    arrayList.clear();
                    gVar4 = gVar3;
                } else {
                    arrayList.add(t11);
                }
            }
            gVar3 = gVar3.f10504b;
            gVar4 = gVar4;
        }
        if (arrayList.isEmpty()) {
            this.f10494k = gVar4.m11673f();
            return (AnnotatedMethod) gVar4.f10503a;
        }
        throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s", getName(), (String) arrayList.stream().map(new Function() { // from class: com.fasterxml.jackson.databind.introspect.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((AnnotatedMethod) obj).getFullName();
            }
        }).collect(Collectors.joining(" vs "))));
    }

    /* JADX INFO: renamed from: R */
    public final <T> g<T> m11634R(g<T> gVar) {
        return gVar == null ? gVar : gVar.m11669b();
    }

    /* JADX INFO: renamed from: S */
    public void m11635S(C6422s c6422s) {
        this.f10491h = m11617l0(this.f10491h, c6422s.f10491h);
        this.f10492i = m11617l0(this.f10492i, c6422s.f10492i);
        this.f10493j = m11617l0(this.f10493j, c6422s.f10493j);
        this.f10494k = m11617l0(this.f10494k, c6422s.f10494k);
    }

    /* JADX INFO: renamed from: T */
    public void m11636T(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z11, boolean z12, boolean z13) {
        this.f10492i = new g<>(annotatedParameter, this.f10492i, propertyName, z11, z12, z13);
    }

    /* JADX INFO: renamed from: U */
    public void m11637U(AnnotatedField annotatedField, PropertyName propertyName, boolean z11, boolean z12, boolean z13) {
        this.f10491h = new g<>(annotatedField, this.f10491h, propertyName, z11, z12, z13);
    }

    /* JADX INFO: renamed from: V */
    public void m11638V(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z11, boolean z12, boolean z13) {
        this.f10493j = new g<>(annotatedMethod, this.f10493j, propertyName, z11, z12, z13);
    }

    /* JADX INFO: renamed from: W */
    public void m11639W(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z11, boolean z12, boolean z13) {
        this.f10494k = new g<>(annotatedMethod, this.f10494k, propertyName, z11, z12, z13);
    }

    /* JADX INFO: renamed from: X */
    public boolean m11640X() {
        return m11619C(this.f10491h) || m11619C(this.f10493j) || m11619C(this.f10494k) || m11619C(this.f10492i);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m11641Y() {
        return m11620D(this.f10491h) || m11620D(this.f10493j) || m11620D(this.f10494k) || m11620D(this.f10492i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6422s c6422s) {
        if (this.f10492i != null) {
            if (c6422s.f10492i == null) {
                return -1;
            }
        } else if (c6422s.f10492i != null) {
            return 1;
        }
        return getName().compareTo(c6422s.getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: a */
    public boolean mo11528a() {
        return (this.f10492i == null && this.f10494k == null && this.f10491h == null) ? false : true;
    }

    /* JADX INFO: renamed from: a0 */
    public Collection<C6422s> m11643a0(Collection<PropertyName> collection) {
        HashMap map = new HashMap();
        m11622F(collection, map, this.f10491h);
        m11622F(collection, map, this.f10493j);
        m11622F(collection, map, this.f10494k);
        m11622F(collection, map, this.f10492i);
        return map.values();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: b */
    public boolean mo11529b() {
        return (this.f10493j == null && this.f10491h == null) ? false : true;
    }

    /* JADX INFO: renamed from: b0 */
    public JsonProperty.Access m11644b0() {
        return (JsonProperty.Access) m11647e0(new e(), JsonProperty.Access.AUTO);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: d */
    public C6419p mo11531d() {
        return (C6419p) m11646d0(new d());
    }

    /* JADX INFO: renamed from: d0 */
    public <T> T m11646d0(i<T> iVar) {
        g<AnnotatedMethod> gVar;
        g<AnnotatedField> gVar2;
        T tMo11662a = null;
        if (this.f10488e != null) {
            if (this.f10486c) {
                g<AnnotatedMethod> gVar3 = this.f10493j;
                if (gVar3 != null) {
                    tMo11662a = iVar.mo11662a(gVar3.f10503a);
                }
            } else {
                g<AnnotatedParameter> gVar4 = this.f10492i;
                tMo11662a = gVar4 != null ? iVar.mo11662a(gVar4.f10503a) : null;
                if (tMo11662a == null && (gVar = this.f10494k) != null) {
                    tMo11662a = iVar.mo11662a(gVar.f10503a);
                }
            }
            if (tMo11662a == null && (gVar2 = this.f10491h) != null) {
                return iVar.mo11662a(gVar2.f10503a);
            }
        }
        return tMo11662a;
    }

    /* JADX INFO: renamed from: e0 */
    public <T> T m11647e0(i<T> iVar, T t11) {
        T tMo11662a;
        T tMo11662a2;
        T tMo11662a3;
        T tMo11662a4;
        T tMo11662a5;
        T tMo11662a6;
        T tMo11662a7;
        T tMo11662a8;
        if (this.f10488e == null) {
            return null;
        }
        if (this.f10486c) {
            g<AnnotatedMethod> gVar = this.f10493j;
            if (gVar != null && (tMo11662a8 = iVar.mo11662a(gVar.f10503a)) != null && tMo11662a8 != t11) {
                return tMo11662a8;
            }
            g<AnnotatedField> gVar2 = this.f10491h;
            if (gVar2 != null && (tMo11662a7 = iVar.mo11662a(gVar2.f10503a)) != null && tMo11662a7 != t11) {
                return tMo11662a7;
            }
            g<AnnotatedParameter> gVar3 = this.f10492i;
            if (gVar3 != null && (tMo11662a6 = iVar.mo11662a(gVar3.f10503a)) != null && tMo11662a6 != t11) {
                return tMo11662a6;
            }
            g<AnnotatedMethod> gVar4 = this.f10494k;
            if (gVar4 == null || (tMo11662a5 = iVar.mo11662a(gVar4.f10503a)) == null || tMo11662a5 == t11) {
                return null;
            }
            return tMo11662a5;
        }
        g<AnnotatedParameter> gVar5 = this.f10492i;
        if (gVar5 != null && (tMo11662a4 = iVar.mo11662a(gVar5.f10503a)) != null && tMo11662a4 != t11) {
            return tMo11662a4;
        }
        g<AnnotatedMethod> gVar6 = this.f10494k;
        if (gVar6 != null && (tMo11662a3 = iVar.mo11662a(gVar6.f10503a)) != null && tMo11662a3 != t11) {
            return tMo11662a3;
        }
        g<AnnotatedField> gVar7 = this.f10491h;
        if (gVar7 != null && (tMo11662a2 = iVar.mo11662a(gVar7.f10503a)) != null && tMo11662a2 != t11) {
            return tMo11662a2;
        }
        g<AnnotatedMethod> gVar8 = this.f10493j;
        if (gVar8 == null || (tMo11662a = iVar.mo11662a(gVar8.f10503a)) == null || tMo11662a == t11) {
            return null;
        }
        return tMo11662a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: f */
    public AnnotationIntrospector.ReferenceProperty mo11533f() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this.f10496m;
        if (referenceProperty != null) {
            if (referenceProperty == f10485n) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) m11646d0(new b());
        this.f10496m = referenceProperty2 == null ? f10485n : referenceProperty2;
        return referenceProperty2;
    }

    /* JADX INFO: renamed from: f0 */
    public AnnotatedField m11648f0() {
        g<AnnotatedField> gVar = this.f10491h;
        if (gVar == null) {
            return null;
        }
        return gVar.f10503a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: g */
    public Class<?>[] mo11534g() {
        return (Class[]) m11646d0(new a());
    }

    /* JADX INFO: renamed from: g0 */
    public AnnotatedMethod m11649g0() {
        g<AnnotatedMethod> gVar = this.f10493j;
        if (gVar == null) {
            return null;
        }
        return gVar.f10503a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    public PropertyName getFullName() {
        return this.f10489f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    public PropertyMetadata getMetadata() {
        if (this.f10495l == null) {
            AnnotatedMember annotatedMemberM11651i0 = m11651i0();
            if (annotatedMemberM11651i0 == null) {
                this.f10495l = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            } else {
                Boolean boolHasRequiredMarker = this.f10488e.hasRequiredMarker(annotatedMemberM11651i0);
                String strFindPropertyDescription = this.f10488e.findPropertyDescription(annotatedMemberM11651i0);
                Integer numFindPropertyIndex = this.f10488e.findPropertyIndex(annotatedMemberM11651i0);
                String strFindPropertyDefaultValue = this.f10488e.findPropertyDefaultValue(annotatedMemberM11651i0);
                if (boolHasRequiredMarker == null && numFindPropertyIndex == null && strFindPropertyDefaultValue == null) {
                    PropertyMetadata propertyMetadataWithDescription = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                    if (strFindPropertyDescription != null) {
                        propertyMetadataWithDescription = propertyMetadataWithDescription.withDescription(strFindPropertyDescription);
                    }
                    this.f10495l = propertyMetadataWithDescription;
                } else {
                    this.f10495l = PropertyMetadata.construct(boolHasRequiredMarker, strFindPropertyDescription, numFindPropertyIndex, strFindPropertyDefaultValue);
                }
                if (!this.f10486c) {
                    this.f10495l = m11625I(this.f10495l, annotatedMemberM11651i0);
                }
            }
        }
        return this.f10495l;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k, com.fasterxml.jackson.databind.util.InterfaceC6494k
    public String getName() {
        PropertyName propertyName = this.f10489f;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    /* JADX INFO: renamed from: h0 */
    public String m11650h0() {
        return this.f10490g.getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: i */
    public AnnotatedParameter mo11536i() {
        g gVar = this.f10492i;
        if (gVar == null) {
            return null;
        }
        while (!(((AnnotatedParameter) gVar.f10503a).getOwner() instanceof AnnotatedConstructor)) {
            gVar = gVar.f10504b;
            if (gVar == null) {
                return this.f10492i.f10503a;
            }
        }
        return (AnnotatedParameter) gVar.f10503a;
    }

    /* JADX INFO: renamed from: i0 */
    public AnnotatedMember m11651i0() {
        if (this.f10486c) {
            g<AnnotatedMethod> gVar = this.f10493j;
            if (gVar != null) {
                return gVar.f10503a;
            }
            g<AnnotatedField> gVar2 = this.f10491h;
            if (gVar2 != null) {
                return gVar2.f10503a;
            }
            return null;
        }
        g<AnnotatedParameter> gVar3 = this.f10492i;
        if (gVar3 != null) {
            return gVar3.f10503a;
        }
        g<AnnotatedMethod> gVar4 = this.f10494k;
        if (gVar4 != null) {
            return gVar4.f10503a;
        }
        g<AnnotatedField> gVar5 = this.f10491h;
        if (gVar5 != null) {
            return gVar5.f10503a;
        }
        g<AnnotatedMethod> gVar6 = this.f10493j;
        if (gVar6 != null) {
            return gVar6.f10503a;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: j */
    public Iterator<AnnotatedParameter> mo11537j() {
        g<AnnotatedParameter> gVar = this.f10492i;
        return gVar == null ? C6490g.m11950n() : new h(gVar);
    }

    /* JADX INFO: renamed from: j0 */
    public AnnotatedMethod m11652j0() {
        g<AnnotatedMethod> gVar = this.f10494k;
        if (gVar == null) {
            return null;
        }
        return gVar.f10503a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: k */
    public AnnotatedField mo11538k() {
        g<AnnotatedField> gVar = this.f10491h;
        if (gVar == null) {
            return null;
        }
        AnnotatedField annotatedField = gVar.f10503a;
        for (g gVar2 = gVar.f10504b; gVar2 != null; gVar2 = gVar2.f10504b) {
            AnnotatedField annotatedField2 = (AnnotatedField) gVar2.f10503a;
            Class<?> declaringClass = annotatedField.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.getFullName() + " vs " + annotatedField2.getFullName());
        }
        return annotatedField;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m11653k0() {
        return this.f10493j != null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: l */
    public AnnotatedMethod mo11539l() {
        int iM11626J;
        int iM11626J2;
        g gVar = this.f10493j;
        if (gVar == null) {
            return null;
        }
        g gVar2 = gVar.f10504b;
        if (gVar2 == null) {
            return (AnnotatedMethod) gVar.f10503a;
        }
        while (gVar2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) gVar.f10503a).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) gVar2.f10503a).getDeclaringClass();
            if (declaringClass == declaringClass2) {
                iM11626J = m11626J((AnnotatedMethod) gVar2.f10503a);
                iM11626J2 = m11626J((AnnotatedMethod) gVar.f10503a);
                if (iM11626J != iM11626J2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) gVar.f10503a).getFullName() + " vs " + ((AnnotatedMethod) gVar2.f10503a).getFullName());
                }
                if (iM11626J < iM11626J2) {
                    gVar = gVar2;
                }
            } else if (declaringClass.isAssignableFrom(declaringClass2)) {
                gVar = gVar2;
            } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                continue;
            } else {
                iM11626J = m11626J((AnnotatedMethod) gVar2.f10503a);
                iM11626J2 = m11626J((AnnotatedMethod) gVar.f10503a);
                if (iM11626J != iM11626J2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) gVar.f10503a).getFullName() + " vs " + ((AnnotatedMethod) gVar2.f10503a).getFullName());
                }
                if (iM11626J < iM11626J2) {
                    gVar = gVar2;
                }
            }
            gVar2 = gVar2.f10504b;
        }
        this.f10493j = gVar.m11673f();
        return (AnnotatedMethod) gVar.f10503a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: o */
    public AnnotatedMember mo11542o() {
        if (this.f10486c) {
            return m11535h();
        }
        AnnotatedMember annotatedMemberM11540m = m11540m();
        return annotatedMemberM11540m == null ? m11535h() : annotatedMemberM11540m;
    }

    /* JADX INFO: renamed from: o0 */
    public void m11656o0() {
        this.f10491h = m11629M(this.f10491h);
        this.f10493j = m11629M(this.f10493j);
        this.f10494k = m11629M(this.f10494k);
        this.f10492i = m11629M(this.f10492i);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: p */
    public JavaType mo11543p() {
        if (this.f10486c) {
            AbstractC6404a abstractC6404aMo11539l = mo11539l();
            return (abstractC6404aMo11539l == null && (abstractC6404aMo11539l = mo11538k()) == null) ? TypeFactory.unknownType() : abstractC6404aMo11539l.getType();
        }
        AbstractC6404a abstractC6404aMo11536i = mo11536i();
        if (abstractC6404aMo11536i == null) {
            AnnotatedMethod annotatedMethodMo11545r = mo11545r();
            if (annotatedMethodMo11545r != null) {
                return annotatedMethodMo11545r.getParameterType(0);
            }
            abstractC6404aMo11536i = mo11538k();
        }
        return (abstractC6404aMo11536i == null && (abstractC6404aMo11536i = mo11539l()) == null) ? TypeFactory.unknownType() : abstractC6404aMo11536i.getType();
    }

    /* JADX INFO: renamed from: q0 */
    public void m11658q0() {
        this.f10491h = m11634R(this.f10491h);
        this.f10493j = m11634R(this.f10493j);
        this.f10494k = m11634R(this.f10494k);
        this.f10492i = m11634R(this.f10492i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: r */
    public AnnotatedMethod mo11545r() {
        g gVar = this.f10494k;
        if (gVar == null) {
            return null;
        }
        g gVar2 = gVar.f10504b;
        if (gVar2 == null) {
            return (AnnotatedMethod) gVar.f10503a;
        }
        while (gVar2 != null) {
            AnnotatedMethod annotatedMethodM11631O = m11631O((AnnotatedMethod) gVar.f10503a, (AnnotatedMethod) gVar2.f10503a);
            if (annotatedMethodM11631O != gVar.f10503a) {
                if (annotatedMethodM11631O != gVar2.f10503a) {
                    return m11632P(gVar, gVar2);
                }
                gVar = gVar2;
            }
            gVar2 = gVar2.f10504b;
        }
        this.f10494k = gVar.m11673f();
        return (AnnotatedMethod) gVar.f10503a;
    }

    /* JADX INFO: renamed from: r0 */
    public C6422s m11659r0(PropertyName propertyName) {
        return new C6422s(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: s */
    public boolean mo11546s() {
        return this.f10492i != null;
    }

    /* JADX INFO: renamed from: s0 */
    public C6422s m11660s0(String str) {
        PropertyName propertyNameWithSimpleName = this.f10489f.withSimpleName(str);
        return propertyNameWithSimpleName == this.f10489f ? this : new C6422s(this, propertyNameWithSimpleName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: t */
    public boolean mo11547t() {
        return this.f10491h != null;
    }

    public String toString() {
        return "[Property '" + this.f10489f + "'; ctors: " + this.f10492i + ", field(s): " + this.f10491h + ", getter(s): " + this.f10493j + ", setter(s): " + this.f10494k + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: u */
    public boolean mo11548u(PropertyName propertyName) {
        return this.f10489f.equals(propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: v */
    public boolean mo11549v() {
        return this.f10494k != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: w */
    public boolean mo11550w() {
        return m11618A(this.f10491h) || m11618A(this.f10493j) || m11618A(this.f10494k) || m11661z(this.f10492i);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: x */
    public boolean mo11551x() {
        return m11661z(this.f10491h) || m11661z(this.f10493j) || m11661z(this.f10494k) || m11661z(this.f10492i);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: y */
    public boolean mo11552y() {
        Boolean bool = (Boolean) m11646d0(new c());
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public final <T> boolean m11661z(g<T> gVar) {
        while (gVar != null) {
            if (gVar.f10505c != null && gVar.f10506d) {
                return true;
            }
            gVar = gVar.f10504b;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[PHI: r1 r7
      0x0035: PHI (r1v3 boolean) = (r1v0 boolean), (r1v6 boolean) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r7v5 com.fasterxml.jackson.databind.PropertyMetadata) = (r7v0 com.fasterxml.jackson.databind.PropertyMetadata), (r7v9 com.fasterxml.jackson.databind.PropertyMetadata) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: I */
    public PropertyMetadata m11625I(PropertyMetadata propertyMetadata, AnnotatedMember annotatedMember) {
        Nulls nullsNonDefaultContentNulls;
        Boolean mergeable;
        Boolean boolFindMergeInfo;
        AnnotatedMember annotatedMemberM11535h = m11535h();
        boolean z11 = true;
        Nulls nullsNonDefaultValueNulls = null;
        if (annotatedMember != null) {
            AnnotationIntrospector annotationIntrospector = this.f10488e;
            if (annotationIntrospector != null) {
                if (annotatedMemberM11535h != null && (boolFindMergeInfo = annotationIntrospector.findMergeInfo(annotatedMember)) != null) {
                    if (boolFindMergeInfo.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.C6338a.m11144b(annotatedMemberM11535h));
                    }
                    z11 = false;
                }
                JsonSetter.Value valueFindSetterInfo = this.f10488e.findSetterInfo(annotatedMember);
                if (valueFindSetterInfo != null) {
                    nullsNonDefaultValueNulls = valueFindSetterInfo.nonDefaultValueNulls();
                    nullsNonDefaultContentNulls = valueFindSetterInfo.nonDefaultContentNulls();
                } else {
                    nullsNonDefaultContentNulls = null;
                }
            } else {
                nullsNonDefaultContentNulls = null;
            }
            if (z11 || nullsNonDefaultValueNulls == null || nullsNonDefaultContentNulls == null) {
                AbstractC6344b configOverride = this.f10487d.getConfigOverride(m11628L(annotatedMember));
                JsonSetter.Value setterInfo = configOverride.getSetterInfo();
                if (setterInfo != null) {
                    if (nullsNonDefaultValueNulls == null) {
                        nullsNonDefaultValueNulls = setterInfo.nonDefaultValueNulls();
                    }
                    if (nullsNonDefaultContentNulls == null) {
                        nullsNonDefaultContentNulls = setterInfo.nonDefaultContentNulls();
                    }
                }
                if (z11 && annotatedMemberM11535h != null && (mergeable = configOverride.getMergeable()) != null) {
                    if (mergeable.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.C6338a.m11145c(annotatedMemberM11535h));
                    }
                    z11 = false;
                }
            }
        } else {
            nullsNonDefaultContentNulls = null;
        }
        if (z11 || nullsNonDefaultValueNulls == null || nullsNonDefaultContentNulls == null) {
            JsonSetter.Value defaultSetterInfo = this.f10487d.getDefaultSetterInfo();
            if (nullsNonDefaultValueNulls == null) {
                nullsNonDefaultValueNulls = defaultSetterInfo.nonDefaultValueNulls();
            }
            if (nullsNonDefaultContentNulls == null) {
                nullsNonDefaultContentNulls = defaultSetterInfo.nonDefaultContentNulls();
            }
            if (z11) {
                if (Boolean.TRUE.equals(this.f10487d.getDefaultMergeable()) && annotatedMemberM11535h != null) {
                    propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.C6338a.m11143a(annotatedMemberM11535h));
                }
            }
        }
        if (nullsNonDefaultValueNulls == null && nullsNonDefaultContentNulls == null) {
            return propertyMetadata;
        }
        return propertyMetadata.withNulls(nullsNonDefaultValueNulls, nullsNonDefaultContentNulls);
    }

    /* JADX INFO: renamed from: J */
    public int m11626J(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (name.startsWith("get") && name.length() > 3) {
            return 1;
        }
        if (!name.startsWith("is") || name.length() <= 2) {
            return 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: O */
    public AnnotatedMethod m11631O(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> declaringClass = annotatedMethod.getDeclaringClass();
        Class<?> declaringClass2 = annotatedMethod2.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (!declaringClass.isAssignableFrom(declaringClass2)) {
                if (!declaringClass2.isAssignableFrom(declaringClass)) {
                }
                return annotatedMethod;
            }
            return annotatedMethod2;
        }
        int iM11633Q = m11633Q(annotatedMethod2);
        int iM11633Q2 = m11633Q(annotatedMethod);
        if (iM11633Q != iM11633Q2) {
            if (iM11633Q < iM11633Q2) {
                return annotatedMethod2;
            }
            return annotatedMethod;
        }
        AnnotationIntrospector annotationIntrospector = this.f10488e;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.resolveSetterConflict(this.f10487d, annotatedMethod, annotatedMethod2);
    }

    /* JADX INFO: renamed from: Q */
    public int m11633Q(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (name.startsWith("set") && name.length() > 3) {
            return 1;
        }
        return 2;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: c */
    public JsonInclude.Value mo11530c() {
        JsonInclude.Value valueFindPropertyInclusion;
        AnnotatedMember annotatedMemberM11535h = m11535h();
        AnnotationIntrospector annotationIntrospector = this.f10488e;
        if (annotationIntrospector == null) {
            valueFindPropertyInclusion = null;
        } else {
            valueFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(annotatedMemberM11535h);
        }
        if (valueFindPropertyInclusion == null) {
            return JsonInclude.Value.empty();
        }
        return valueFindPropertyInclusion;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember annotatedMemberMo11542o = mo11542o();
        if (annotatedMemberMo11542o != null && (annotationIntrospector = this.f10488e) != null) {
            return annotationIntrospector.findWrapperName(annotatedMemberMo11542o);
        }
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public JsonProperty.Access m11657p0(boolean z11, C6420q c6420q) {
        JsonProperty.Access accessM11644b0 = m11644b0();
        if (accessM11644b0 == null) {
            accessM11644b0 = JsonProperty.Access.AUTO;
        }
        int i11 = f.f10502a[accessM11644b0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    this.f10493j = m11630N(this.f10493j);
                    this.f10492i = m11630N(this.f10492i);
                    if (!z11 || this.f10493j == null) {
                        this.f10491h = m11630N(this.f10491h);
                        this.f10494k = m11630N(this.f10494k);
                        return accessM11644b0;
                    }
                } else {
                    this.f10493j = null;
                    if (this.f10486c) {
                        this.f10491h = null;
                        return accessM11644b0;
                    }
                }
            }
        } else {
            if (c6420q != null) {
                c6420q.m11601k(getName());
                Iterator<PropertyName> it = m11645c0().iterator();
                while (it.hasNext()) {
                    c6420q.m11601k(it.next().getSimpleName());
                }
            }
            this.f10494k = null;
            this.f10492i = null;
            if (!this.f10486c) {
                this.f10491h = null;
            }
        }
        return accessM11644b0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: q */
    public Class<?> mo11544q() {
        return mo11543p().getRawClass();
    }

    public C6422s(C6422s c6422s, PropertyName propertyName) {
        this.f10487d = c6422s.f10487d;
        this.f10488e = c6422s.f10488e;
        this.f10490g = c6422s.f10490g;
        this.f10489f = propertyName;
        this.f10491h = c6422s.f10491h;
        this.f10492i = c6422s.f10492i;
        this.f10493j = c6422s.f10493j;
        this.f10494k = c6422s.f10494k;
        this.f10486c = c6422s.f10486c;
    }
}
