package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.InterfaceC6364i;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.C6405b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes45.dex */
public class StdKeyDeserializers implements InterfaceC6364i, Serializable {
    private static final long serialVersionUID = 1;

    public static AbstractC6394i constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new StdKeyDeserializer.EnumKD(enumResolver, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m11409a(C6405b c6405b) {
        return (((AnnotatedMethod) c6405b.f10392a).getParameterCount() == 1 && ((AnnotatedMethod) c6405b.f10392a).getRawParameterType(0) == String.class && c6405b.f10393b != JsonCreator.Mode.PROPERTIES) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC6394i m11410b(DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedConstructor) {
            Constructor<?> annotated = ((AnnotatedConstructor) annotatedMember).getAnnotated();
            if (deserializationConfig.canOverrideAccessModifiers()) {
                C6490g.m11936g(annotated, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(annotated);
        }
        Method annotated2 = ((AnnotatedMethod) annotatedMember).getAnnotated();
        if (deserializationConfig.canOverrideAccessModifiers()) {
            C6490g.m11936g(annotated2, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.StringFactoryKeyDeserializer(annotated2);
    }

    public static AbstractC6394i constructDelegatingKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC6390e<?> abstractC6390e) {
        return new StdKeyDeserializer.DelegatingKD(javaType.getRawClass(), abstractC6390e);
    }

    public static AbstractC6394i constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);
    }

    /* JADX INFO: renamed from: c */
    public static AnnotatedMethod m11411c(List<C6405b<AnnotatedMethod, JsonCreator.Mode>> list) throws JsonMappingException {
        AnnotatedMethod annotatedMethod = null;
        for (C6405b<AnnotatedMethod, JsonCreator.Mode> c6405b : list) {
            if (c6405b.f10393b != null) {
                if (annotatedMethod == null) {
                    annotatedMethod = (AnnotatedMethod) c6405b.f10392a;
                } else {
                    throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + C6490g.m11921X(((AnnotatedMethod) c6405b.f10392a).getDeclaringClass()));
                }
            }
        }
        return annotatedMethod;
    }

    /* JADX INFO: renamed from: d */
    public static C6405b<AnnotatedConstructor, JsonCreator.Mode> m11412d(AbstractC6340b abstractC6340b) {
        for (C6405b<AnnotatedConstructor, JsonCreator.Mode> c6405b : abstractC6340b.mo11176v()) {
            AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) c6405b.f10392a;
            if (annotatedConstructor.getParameterCount() == 1 && String.class == annotatedConstructor.getRawParameterType(0)) {
                return c6405b;
            }
        }
        return null;
    }

    public static AbstractC6394i findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        AbstractC6340b abstractC6340bIntrospectForCreation = deserializationConfig.introspectForCreation(javaType);
        C6405b<AnnotatedConstructor, JsonCreator.Mode> c6405bM11412d = m11412d(abstractC6340bIntrospectForCreation);
        if (c6405bM11412d != null && c6405bM11412d.f10393b != null) {
            return m11410b(deserializationConfig, (AnnotatedMember) c6405bM11412d.f10392a);
        }
        List<C6405b<AnnotatedMethod, JsonCreator.Mode>> listMo11178x = abstractC6340bIntrospectForCreation.mo11178x();
        listMo11178x.removeIf(new Predicate() { // from class: com.fasterxml.jackson.databind.deser.std.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return StdKeyDeserializers.m11409a((C6405b) obj);
            }
        });
        AnnotatedMethod annotatedMethodM11411c = m11411c(listMo11178x);
        if (annotatedMethodM11411c != null) {
            return m11410b(deserializationConfig, annotatedMethodM11411c);
        }
        if (c6405bM11412d != null) {
            return m11410b(deserializationConfig, (AnnotatedMember) c6405bM11412d.f10392a);
        }
        if (!listMo11178x.isEmpty()) {
            return m11410b(deserializationConfig, (AnnotatedMember) listMo11178x.get(0).f10392a);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6364i
    public AbstractC6394i findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC6340b abstractC6340b) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = C6490g.m11953o0(rawClass);
        }
        return StdKeyDeserializer.forType(rawClass);
    }
}
