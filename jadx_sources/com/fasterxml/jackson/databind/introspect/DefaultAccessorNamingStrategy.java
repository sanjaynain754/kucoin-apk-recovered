package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import p450m7.InterfaceC42439e;
import p490o7.C42986a;

/* JADX INFO: loaded from: classes45.dex */
public class DefaultAccessorNamingStrategy extends AccessorNamingStrategy {

    /* JADX INFO: renamed from: a */
    public final MapperConfig<?> f10377a;

    /* JADX INFO: renamed from: b */
    public final C6406c f10378b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6398a f10379c;

    /* JADX INFO: renamed from: d */
    public final boolean f10380d;

    /* JADX INFO: renamed from: e */
    public final String f10381e;

    /* JADX INFO: renamed from: f */
    public final String f10382f;

    /* JADX INFO: renamed from: g */
    public final String f10383g;

    public static class Provider extends AccessorNamingStrategy.Provider implements Serializable {
        private static final long serialVersionUID = 1;
        protected final InterfaceC6398a _baseNameValidator;
        protected final String _getterPrefix;
        protected final String _isGetterPrefix;
        protected final String _setterPrefix;
        protected final String _withPrefix;

        public Provider() {
            this("set", "with", "get", "is", (InterfaceC6398a) null);
        }

        public Provider(Provider provider, String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, provider._baseNameValidator);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, C6406c c6406c) {
            return new DefaultAccessorNamingStrategy(mapperConfig, c6406c, this._setterPrefix, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, C6406c c6406c) {
            return new C6400c(mapperConfig, c6406c);
        }

        public Provider withBaseNameValidator(InterfaceC6398a interfaceC6398a) {
            return new Provider(this, interfaceC6398a);
        }

        public Provider withBuilderPrefix(String str) {
            return new Provider(this, this._setterPrefix, str, this._getterPrefix, this._isGetterPrefix);
        }

        public Provider withGetterPrefix(String str) {
            return new Provider(this, this._setterPrefix, this._withPrefix, str, this._isGetterPrefix);
        }

        public Provider withIsGetterPrefix(String str) {
            return new Provider(this, this._setterPrefix, this._withPrefix, this._getterPrefix, str);
        }

        public Provider withSetterPrefix(String str) {
            return new Provider(this, str, this._withPrefix, this._getterPrefix, this._isGetterPrefix);
        }

        public Provider(Provider provider, InterfaceC6398a interfaceC6398a) {
            this(provider._setterPrefix, provider._withPrefix, provider._getterPrefix, provider._isGetterPrefix, interfaceC6398a);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, C6406c c6406c, AbstractC6340b abstractC6340b) {
            AnnotationIntrospector annotationIntrospector;
            String str;
            InterfaceC42439e.a aVarFindPOJOBuilderConfig = null;
            if (mapperConfig.isAnnotationProcessingEnabled()) {
                annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            } else {
                annotationIntrospector = null;
            }
            if (annotationIntrospector != null) {
                aVarFindPOJOBuilderConfig = annotationIntrospector.findPOJOBuilderConfig(c6406c);
            }
            if (aVarFindPOJOBuilderConfig == null) {
                str = this._withPrefix;
            } else {
                str = aVarFindPOJOBuilderConfig.f94064b;
            }
            return new DefaultAccessorNamingStrategy(mapperConfig, c6406c, str, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        public Provider withFirstCharAcceptance(boolean z11, boolean z12) {
            return withBaseNameValidator(C6399b.m11448b(z11, z12));
        }

        public Provider(String str, String str2, String str3, String str4, InterfaceC6398a interfaceC6398a) {
            this._setterPrefix = str;
            this._withPrefix = str2;
            this._getterPrefix = str3;
            this._isGetterPrefix = str4;
            this._baseNameValidator = interfaceC6398a;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$a */
    public interface InterfaceC6398a {
        /* JADX INFO: renamed from: a */
        boolean mo11447a(char c11, String str, int i11);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$b */
    public static class C6399b implements InterfaceC6398a {

        /* JADX INFO: renamed from: a */
        public final boolean f10384a;

        /* JADX INFO: renamed from: b */
        public final boolean f10385b;

        /* JADX INFO: renamed from: b */
        public static InterfaceC6398a m11448b(boolean z11, boolean z12) {
            if (z11 || z12) {
                return new C6399b(z11, z12);
            }
            return null;
        }

        public C6399b(boolean z11, boolean z12) {
            this.f10384a = z11;
            this.f10385b = z12;
        }

        @Override // com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.InterfaceC6398a
        /* JADX INFO: renamed from: a */
        public boolean mo11447a(char c11, String str, int i11) {
            if (Character.isLetter(c11)) {
                if (!this.f10384a && Character.isLowerCase(c11)) {
                    return false;
                }
                return true;
            }
            return this.f10385b;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$c */
    public static class C6400c extends DefaultAccessorNamingStrategy {

        /* JADX INFO: renamed from: h */
        public final Set<String> f10386h;

        public C6400c(MapperConfig<?> mapperConfig, C6406c c6406c) {
            super(mapperConfig, c6406c, null, "get", "is", null);
            this.f10386h = new HashSet();
            for (String str : C42986a.m94409b(c6406c.getRawType())) {
                this.f10386h.add(str);
            }
        }

        @Override // com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy, com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        /* JADX INFO: renamed from: c */
        public String mo11435c(AnnotatedMethod annotatedMethod, String str) {
            return this.f10386h.contains(str) ? str : super.mo11435c(annotatedMethod, str);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    /* JADX INFO: renamed from: a */
    public String mo11433a(AnnotatedMethod annotatedMethod, String str) {
        if (this.f10382f == null) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if ((rawType == Boolean.class || rawType == Boolean.TYPE) && str.startsWith(this.f10382f)) {
            return this.f10380d ? m11446h(str, 2) : m11445g(str, 2);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    /* JADX INFO: renamed from: b */
    public String mo11434b(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.f10383g;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.f10380d ? m11446h(str, this.f10383g.length()) : m11445g(str, this.f10383g.length());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    /* JADX INFO: renamed from: c */
    public String mo11435c(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this.f10381e;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (m11443e(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && m11444f(annotatedMethod)) {
            return null;
        }
        return this.f10380d ? m11446h(str, this.f10381e.length()) : m11445g(str, this.f10381e.length());
    }

    public DefaultAccessorNamingStrategy(MapperConfig<?> mapperConfig, C6406c c6406c, String str, String str2, String str3, InterfaceC6398a interfaceC6398a) {
        this.f10377a = mapperConfig;
        this.f10378b = c6406c;
        this.f10380d = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this.f10383g = str;
        this.f10381e = str2;
        this.f10382f = str3;
        this.f10379c = interfaceC6398a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m11443e(AnnotatedMethod annotatedMethod) {
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType.isArray()) {
            String name = rawType.getComponentType().getName();
            if (name.contains(".cglib")) {
                if (!name.startsWith("net.sf.cglib") && !name.startsWith("org.hibernate.repackage.cglib") && !name.startsWith("org.springframework.cglib")) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m11444f(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.getRawType().getName().startsWith("groovy.lang");
    }

    /* JADX INFO: renamed from: g */
    public String m11445g(String str, int i11) {
        int length = str.length();
        if (length == i11) {
            return null;
        }
        char cCharAt = str.charAt(i11);
        InterfaceC6398a interfaceC6398a = this.f10379c;
        if (interfaceC6398a != null && !interfaceC6398a.mo11447a(cCharAt, str, i11)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i11);
        }
        StringBuilder sb2 = new StringBuilder(length - i11);
        sb2.append(lowerCase);
        while (true) {
            i11++;
            if (i11 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i11);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb2.append((CharSequence) str, i11, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public String m11446h(String str, int i11) {
        int length = str.length();
        if (length == i11) {
            return null;
        }
        char cCharAt = str.charAt(i11);
        InterfaceC6398a interfaceC6398a = this.f10379c;
        if (interfaceC6398a != null && !interfaceC6398a.mo11447a(cCharAt, str, i11)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i11);
        }
        int i12 = i11 + 1;
        if (i12 < length && Character.isUpperCase(str.charAt(i12))) {
            return str.substring(i11);
        }
        StringBuilder sb2 = new StringBuilder(length - i11);
        sb2.append(lowerCase);
        sb2.append((CharSequence) str, i12, length);
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    /* JADX INFO: renamed from: d */
    public String mo11436d(AnnotatedField annotatedField, String str) {
        return str;
    }
}
