package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class DefaultBaseTypeLimitingValidator extends PolymorphicTypeValidator implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator$a */
    public static final class C6426a {

        /* JADX INFO: renamed from: b */
        public static final C6426a f10524b = new C6426a();

        /* JADX INFO: renamed from: a */
        public final Set<String> f10525a;

        /* JADX INFO: renamed from: a */
        public boolean m11682a(Class<?> cls) {
            return this.f10525a.contains(cls.getName());
        }

        public C6426a() {
            HashSet hashSet = new HashSet();
            this.f10525a = hashSet;
            hashSet.add(Object.class.getName());
            hashSet.add(Closeable.class.getName());
            hashSet.add(Serializable.class.getName());
            hashSet.add(AutoCloseable.class.getName());
            hashSet.add(Cloneable.class.getName());
            hashSet.add("java.util.logging.Handler");
            hashSet.add("javax.naming.Referenceable");
            hashSet.add("javax.sql.DataSource");
        }
    }

    public boolean isSafeSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return true;
    }

    public boolean isUnsafeBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        return C6426a.f10524b.m11682a(javaType.getRawClass());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (isUnsafeBaseType(mapperConfig, javaType)) {
            return PolymorphicTypeValidator.Validity.DENIED;
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        if (isSafeSubType(mapperConfig, javaType, javaType2)) {
            return PolymorphicTypeValidator.Validity.ALLOWED;
        }
        return PolymorphicTypeValidator.Validity.DENIED;
    }
}
