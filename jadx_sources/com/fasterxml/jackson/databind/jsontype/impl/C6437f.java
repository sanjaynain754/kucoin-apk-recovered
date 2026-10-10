package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AbstractC6341c;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.f */
/* JADX INFO: compiled from: ClassNameIdResolver.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6437f extends AbstractC6441j {

    /* JADX INFO: renamed from: c */
    public final PolymorphicTypeValidator f10532c;

    /* JADX INFO: renamed from: i */
    public static C6437f m11703i(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new C6437f(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: b */
    public String mo11684b() {
        return "class name used as type id";
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: e */
    public String mo11687e(Object obj, Class<?> cls) {
        return m11704g(obj, cls, this.f10540a);
    }

    /* JADX INFO: renamed from: h */
    public JavaType mo11705h(String str, AbstractC6341c abstractC6341c) throws IOException {
        JavaType javaTypeResolveAndValidateSubType = abstractC6341c.resolveAndValidateSubType(this.f10541b, str, this.f10532c);
        return (javaTypeResolveAndValidateSubType == null && (abstractC6341c instanceof DeserializationContext)) ? ((DeserializationContext) abstractC6341c).handleUnknownTypeId(this.f10541b, str, this, "no such class found") : javaTypeResolveAndValidateSubType;
    }

    public C6437f(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory);
        this.f10532c = polymorphicTypeValidator;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: a */
    public String mo11683a(Object obj) {
        return m11704g(obj, obj.getClass(), this.f10540a);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: c */
    public JavaType mo11685c(AbstractC6341c abstractC6341c, String str) throws IOException {
        return mo11705h(str, abstractC6341c);
    }

    /* JADX INFO: renamed from: g */
    public String m11704g(Object obj, Class<?> cls, TypeFactory typeFactory) {
        if (C6490g.m11909L(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                return typeFactory.constructCollectionType(EnumSet.class, C6490g.m11959u((EnumSet) obj)).toCanonical();
            }
            if (obj instanceof EnumMap) {
                return typeFactory.constructMapType(EnumMap.class, C6490g.m11958t((EnumMap) obj), Object.class).toCanonical();
            }
        } else if (name.indexOf(36) >= 0 && C6490g.m11902E(cls) != null && C6490g.m11902E(this.f10541b.getRawClass()) == null) {
            return this.f10541b.getRawClass().getName();
        }
        return name;
    }
}
