package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AbstractC6341c;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.tencent.bugly.proguard.C33978va;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.g */
/* JADX INFO: compiled from: MinimalClassNameIdResolver.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6438g extends C6437f {

    /* JADX INFO: renamed from: d */
    public final String f10533d;

    /* JADX INFO: renamed from: e */
    public final String f10534e;

    /* JADX INFO: renamed from: j */
    public static C6438g m11706j(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new C6438g(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.C6437f
    /* JADX INFO: renamed from: h */
    public JavaType mo11705h(String str, AbstractC6341c abstractC6341c) throws IOException {
        if (str.startsWith(C33978va.f72339h)) {
            StringBuilder sb2 = new StringBuilder(str.length() + this.f10533d.length());
            if (this.f10533d.isEmpty()) {
                sb2.append(str.substring(1));
            } else {
                sb2.append(this.f10533d);
                sb2.append(str);
            }
            str = sb2.toString();
        }
        return super.mo11705h(str, abstractC6341c);
    }

    public C6438g(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        String name = javaType.getRawClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.f10533d = "";
            this.f10534e = C33978va.f72339h;
        } else {
            this.f10534e = name.substring(0, iLastIndexOf + 1);
            this.f10533d = name.substring(0, iLastIndexOf);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.C6437f, com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: a */
    public String mo11683a(Object obj) {
        String name = obj.getClass().getName();
        if (name.startsWith(this.f10534e)) {
            return name.substring(this.f10534e.length() - 1);
        }
        return name;
    }
}
