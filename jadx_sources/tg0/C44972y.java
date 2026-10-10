package tg0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.C41791a2;
import kotlinx.serialization.internal.C41861o2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import ug0.C45236a;
import yg0.AbstractC46494a;
import yg0.C46495b;

/* JADX INFO: renamed from: tg0.y */
/* JADX INFO: compiled from: SerializersJvm.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0010*\u00020\u0003*\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Ljava/lang/reflect/Type;", "type", "Ltg0/d;", "", "serializer", "(Ljava/lang/reflect/Type;)Ltg0/d;", "Lyg0/a;", "(Lyg0/a;Ljava/lang/reflect/Type;)Ltg0/d;", "f", "", "failOnMissingTypeArgSerializer", "d", "(Lyg0/a;Ljava/lang/reflect/Type;Z)Ltg0/d;", "Ljava/lang/Class;", "g", "(Lyg0/a;Ljava/lang/Class;Z)Ltg0/d;", ExifInterface.GPS_DIRECTION_TRUE, "jClass", "", "typeArgumentsSerializers", "c", "(Lyg0/a;Ljava/lang/Class;Ljava/util/List;)Ltg0/d;", "Ljava/lang/reflect/GenericArrayType;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lyg0/a;Ljava/lang/reflect/GenericArrayType;Z)Ltg0/d;", "b", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "kotlinx-serialization-core"}, m90085k = 5, m90086mv = {2, 0, 0}, m90088xi = 48, m90089xs = "kotlinx/serialization/SerializersKt")
@SourceDebugExtension({"SMAP\nSerializersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n11165#2:202\n11500#2,3:203\n1557#3:206\n1628#3,3:207\n37#4,2:210\n1#5:212\n*S KotlinDebug\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n*L\n113#1:202\n113#1:203,3\n140#1:206\n140#1:207,3\n169#1:210,2\n*E\n"})
public final /* synthetic */ class C44972y {
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC44951d<T> m99444c(AbstractC46494a abstractC46494a, Class<T> cls, List<? extends InterfaceC44951d<Object>> list) {
        InterfaceC44951d[] interfaceC44951dArr = (InterfaceC44951d[]) list.toArray(new InterfaceC44951d[0]);
        InterfaceC44951d<T> interfaceC44951dM91448c = C41791a2.m91448c(cls, (InterfaceC44951d[]) Arrays.copyOf(interfaceC44951dArr, interfaceC44951dArr.length));
        if (interfaceC44951dM91448c != null) {
            return interfaceC44951dM91448c;
        }
        KClass<T> kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
        InterfaceC44951d<T> interfaceC44951dM91672b = C41861o2.m91672b(kotlinClass);
        if (interfaceC44951dM91672b != null) {
            return interfaceC44951dM91672b;
        }
        InterfaceC44951d<T> interfaceC44951dMo92029b = abstractC46494a.mo92029b(kotlinClass, list);
        if (interfaceC44951dMo92029b != null) {
            return interfaceC44951dMo92029b;
        }
        if (cls.isInterface()) {
            return new C44955h(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return C44971x.serializer(C46495b.m102577a(), type);
    }

    /* JADX INFO: renamed from: b */
    public static final Class<?> m99443b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return m99443b(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object objFirst = ArraysKt.first(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
            return m99443b((Type) objFirst);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return m99443b(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC44951d<Object> m99445d(AbstractC46494a abstractC46494a, Type type, boolean z11) {
        ArrayList<InterfaceC44951d> arrayList;
        if (type instanceof GenericArrayType) {
            return m99442a(abstractC46494a, (GenericArrayType) type, z11);
        }
        if (type instanceof Class) {
            return m99448g(abstractC46494a, (Class) type, z11);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                Object objFirst = ArraysKt.first(upperBounds);
                Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
                return m99446e(abstractC46494a, (Type) objFirst, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNull(actualTypeArguments);
        if (z11) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                Intrinsics.checkNotNull(type2);
                arrayList.add(C44971x.serializer(abstractC46494a, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                Intrinsics.checkNotNull(type3);
                InterfaceC44951d<Object> interfaceC44951dM99439d = C44971x.m99439d(abstractC46494a, type3);
                if (interfaceC44951dM99439d == null) {
                    return null;
                }
                arrayList.add(interfaceC44951dM99439d);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            InterfaceC44951d<Object> interfaceC44951dM99962n = C45236a.m99962n((InterfaceC44951d) arrayList.get(0));
            Intrinsics.checkNotNull(interfaceC44951dM99962n, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return interfaceC44951dM99962n;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            InterfaceC44951d<Object> interfaceC44951dM99956h = C45236a.m99956h((InterfaceC44951d) arrayList.get(0));
            Intrinsics.checkNotNull(interfaceC44951dM99956h, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return interfaceC44951dM99956h;
        }
        if (Map.class.isAssignableFrom(cls)) {
            InterfaceC44951d<Object> interfaceC44951dM99959k = C45236a.m99959k((InterfaceC44951d) arrayList.get(0), (InterfaceC44951d) arrayList.get(1));
            Intrinsics.checkNotNull(interfaceC44951dM99959k, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return interfaceC44951dM99959k;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            InterfaceC44951d<Object> interfaceC44951dM99958j = C45236a.m99958j((InterfaceC44951d) arrayList.get(0), (InterfaceC44951d) arrayList.get(1));
            Intrinsics.checkNotNull(interfaceC44951dM99958j, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return interfaceC44951dM99958j;
        }
        if (Pair.class.isAssignableFrom(cls)) {
            InterfaceC44951d<Object> interfaceC44951dM99961m = C45236a.m99961m((InterfaceC44951d) arrayList.get(0), (InterfaceC44951d) arrayList.get(1));
            Intrinsics.checkNotNull(interfaceC44951dM99961m, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return interfaceC44951dM99961m;
        }
        if (Triple.class.isAssignableFrom(cls)) {
            InterfaceC44951d<Object> interfaceC44951dM99964p = C45236a.m99964p((InterfaceC44951d) arrayList.get(0), (InterfaceC44951d) arrayList.get(1), (InterfaceC44951d) arrayList.get(2));
            Intrinsics.checkNotNull(interfaceC44951dM99964p, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return interfaceC44951dM99964p;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (InterfaceC44951d interfaceC44951d : arrayList) {
            Intrinsics.checkNotNull(interfaceC44951d, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(interfaceC44951d);
        }
        return m99444c(abstractC46494a, cls, arrayList2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC44951d m99446e(AbstractC46494a abstractC46494a, Type type, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m99445d(abstractC46494a, type, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final InterfaceC44951d<Object> m99447f(@NotNull AbstractC46494a abstractC46494a, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return m99445d(abstractC46494a, type, false);
    }

    @NotNull
    public static final InterfaceC44951d<Object> serializer(@NotNull AbstractC46494a abstractC46494a, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(abstractC46494a, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        InterfaceC44951d<Object> interfaceC44951dM99445d = m99445d(abstractC46494a, type, true);
        if (interfaceC44951dM99445d != null) {
            return interfaceC44951dM99445d;
        }
        C41791a2.m91462q(m99443b(type));
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC44951d<Object> m99442a(AbstractC46494a abstractC46494a, GenericArrayType genericArrayType, boolean z11) {
        InterfaceC44951d<Object> interfaceC44951dM99439d;
        KClass kotlinClass;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) ArraysKt.first(upperBounds);
        }
        Intrinsics.checkNotNull(genericComponentType);
        if (z11) {
            interfaceC44951dM99439d = C44971x.serializer(abstractC46494a, genericComponentType);
        } else {
            interfaceC44951dM99439d = C44971x.m99439d(abstractC46494a, genericComponentType);
            if (interfaceC44951dM99439d == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kotlinClass = JvmClassMappingKt.getKotlinClass((Class) rawType);
        } else if (genericComponentType instanceof KClass) {
            kotlinClass = (KClass) genericComponentType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(genericComponentType.getClass()));
        }
        Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        InterfaceC44951d<Object> interfaceC44951dM99949a = C45236a.m99949a(kotlinClass, interfaceC44951dM99439d);
        Intrinsics.checkNotNull(interfaceC44951dM99949a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return interfaceC44951dM99949a;
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC44951d<Object> m99448g(AbstractC46494a abstractC46494a, Class<?> cls, boolean z11) {
        InterfaceC44951d<Object> interfaceC44951dM99439d;
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            Class<?> componentType = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            if (z11) {
                interfaceC44951dM99439d = C44971x.serializer(abstractC46494a, componentType);
            } else {
                interfaceC44951dM99439d = C44971x.m99439d(abstractC46494a, componentType);
                if (interfaceC44951dM99439d == null) {
                    return null;
                }
            }
            KClass kotlinClass = JvmClassMappingKt.getKotlinClass(componentType);
            Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            InterfaceC44951d<Object> interfaceC44951dM99949a = C45236a.m99949a(kotlinClass, interfaceC44951dM99439d);
            Intrinsics.checkNotNull(interfaceC44951dM99949a, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return interfaceC44951dM99949a;
        }
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
        return m99444c(abstractC46494a, cls, CollectionsKt.emptyList());
    }
}
