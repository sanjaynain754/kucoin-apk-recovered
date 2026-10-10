package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.t */
/* JADX INFO: compiled from: TypeResolutionContext.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6423t {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.t$a */
    /* JADX INFO: compiled from: TypeResolutionContext.java */
    public static class a implements InterfaceC6423t {

        /* JADX INFO: renamed from: b */
        public final TypeFactory f10510b;

        /* JADX INFO: renamed from: c */
        public final TypeBindings f10511c;

        @Override // com.fasterxml.jackson.databind.introspect.InterfaceC6423t
        /* JADX INFO: renamed from: a */
        public JavaType mo11457a(Type type) {
            return this.f10510b.resolveMemberType(type, this.f10511c);
        }

        public a(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.f10510b = typeFactory;
            this.f10511c = typeBindings;
        }
    }

    /* JADX INFO: renamed from: a */
    JavaType mo11457a(Type type);
}
