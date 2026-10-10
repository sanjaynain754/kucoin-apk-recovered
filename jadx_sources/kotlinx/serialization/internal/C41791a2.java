package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.UByte;
import p852kotlin.UByteArray;
import p852kotlin.UInt;
import p852kotlin.UIntArray;
import p852kotlin.ULong;
import p852kotlin.ULongArray;
import p852kotlin.UShort;
import p852kotlin.UShortArray;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.internal.BooleanCompanionObject;
import p852kotlin.jvm.internal.ByteCompanionObject;
import p852kotlin.jvm.internal.CharCompanionObject;
import p852kotlin.jvm.internal.DoubleCompanionObject;
import p852kotlin.jvm.internal.FloatCompanionObject;
import p852kotlin.jvm.internal.IntCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.LongCompanionObject;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.ShortCompanionObject;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KClass;
import p852kotlin.text.StringsKt;
import p852kotlin.time.Duration;
import p852kotlin.uuid.Uuid;
import tg0.C44955h;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44952e;
import tg0.InterfaceC44962o;
import ug0.C45236a;

/* JADX INFO: renamed from: kotlinx.serialization.internal.a2 */
/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\t*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aO\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a%\u0010\u001c\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010 \u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b \u0010\u001f\u001aQ\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u00132\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b\"\u0010\u001a\u001aM\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\"\u0010\u0016\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00060\r\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\u0002¢\u0006\u0004\b$\u0010%\u001a!\u0010(\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a)\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b*\u0010+\u001a+\u0010,\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b,\u0010+\u001a\u001d\u0010.\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¢\u0006\u0004\b.\u0010\u0005\u001a#\u00100\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060/H\u0000¢\u0006\u0004\b0\u00101¨\u00062"}, m90084d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlin/reflect/KClass;)Z", "Ltg0/d;", "b", "(Lkotlin/reflect/KClass;)Ltg0/d;", ExifInterface.LONGITUDE_EAST, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "", "r", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "", "p", "(Lkotlin/reflect/KClass;)Ljava/lang/Void;", "Ljava/lang/Class;", "q", "(Ljava/lang/Class;)Ljava/lang/Void;", "args", "d", "(Lkotlin/reflect/KClass;[Ltg0/d;)Ltg0/d;", "c", "(Ljava/lang/Class;[Ltg0/d;)Ltg0/d;", "f", "g", "(Ljava/lang/Class;)Ljava/lang/Object;", "m", "(Ljava/lang/Class;)Z", "n", "jClass", "k", "companion", "j", "(Ljava/lang/Object;[Ltg0/d;)Ltg0/d;", "", "companionName", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Ljava/lang/Class;)Ltg0/d;", CmcdData.Factory.STREAMING_FORMAT_HLS, "rootClass", "o", "", "i", "()Ljava/util/Map;", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,214:1\n208#1,6:251\n208#1,6:257\n208#1,6:263\n208#1,6:269\n208#1,6:275\n208#1,6:281\n1#2:215\n3170#3,11:216\n1310#3,2:227\n3170#3,11:229\n3170#3,11:240\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n*L\n193#1:251,6\n197#1:257,6\n198#1:263,6\n199#1:269,6\n200#1:275,6\n203#1:281,6\n73#1:216,11\n81#1:227,2\n151#1:229,11\n156#1:240,11\n*E\n"})
public final class C41791a2 {
    /* JADX INFO: renamed from: a */
    public static final Object m91446a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final <T> InterfaceC44951d<T> m91455j(Object obj, InterfaceC44951d<Object>... interfaceC44951dArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC44951dArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC44951dArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i11 = 0; i11 < length; i11++) {
                    clsArr2[i11] = InterfaceC44951d.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC44951dArr, interfaceC44951dArr.length));
            if (objInvoke instanceof InterfaceC44951d) {
                return (InterfaceC44951d) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause == null) {
                throw e11;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e11.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC44951d<T> m91447b(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return m91449d(kClass, new InterfaceC44951d[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC44951d<T> m91448c(@NotNull Class<T> cls, @NotNull InterfaceC44951d<Object>... args) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && m91458m(cls)) {
            return m91450e(cls);
        }
        InterfaceC44951d<T> interfaceC44951dM91456k = m91456k(cls, (InterfaceC44951d[]) Arrays.copyOf(args, args.length));
        if (interfaceC44951dM91456k != null) {
            return interfaceC44951dM91456k;
        }
        InterfaceC44951d<T> interfaceC44951dM91453h = m91453h(cls);
        if (interfaceC44951dM91453h != null) {
            return interfaceC44951dM91453h;
        }
        InterfaceC44951d<T> interfaceC44951dM91451f = m91451f(cls, (InterfaceC44951d[]) Arrays.copyOf(args, args.length));
        if (interfaceC44951dM91451f != null) {
            return interfaceC44951dM91451f;
        }
        if (m91459n(cls)) {
            return new C44955h(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC44951d<T> m91449d(@NotNull KClass<T> kClass, @NotNull InterfaceC44951d<Object>... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return m91448c(JvmClassMappingKt.getJavaClass((KClass) kClass), (InterfaceC44951d[]) Arrays.copyOf(args, args.length));
    }

    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC44951d<T> m91456k(Class<?> cls, InterfaceC44951d<Object>... interfaceC44951dArr) {
        Object objM91446a = m91446a(cls, "Companion");
        if (objM91446a == null) {
            return null;
        }
        return m91455j(objM91446a, (InterfaceC44951d[]) Arrays.copyOf(interfaceC44951dArr, interfaceC44951dArr.length));
    }

    /* JADX INFO: renamed from: l */
    public static final <T> boolean m91457l(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return JvmClassMappingKt.getJavaClass((KClass) kClass).isInterface();
    }

    /* JADX INFO: renamed from: m */
    public static final <T> boolean m91458m(Class<T> cls) {
        return cls.getAnnotation(InterfaceC44962o.class) == null && cls.getAnnotation(InterfaceC44952e.class) == null;
    }

    /* JADX INFO: renamed from: n */
    public static final <T> boolean m91459n(Class<T> cls) {
        if (cls.getAnnotation(InterfaceC44952e.class) != null) {
            return true;
        }
        InterfaceC44962o interfaceC44962o = (InterfaceC44962o) cls.getAnnotation(InterfaceC44962o.class);
        return interfaceC44962o != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(interfaceC44962o.with()), Reflection.getOrCreateKotlinClass(C44955h.class));
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m91460o(@NotNull KClass<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass((KClass) rootClass).isArray();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final Void m91461p(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        C41796b2.m91501f(kClass);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final Void m91462q(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        throw new SerializationException(C41796b2.m91500e(JvmClassMappingKt.getKotlinClass(cls)));
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final <T, E extends T> E[] m91463r(@NotNull ArrayList<E> arrayList, @NotNull KClass<T> eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass((KClass) eClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(eArr, "toArray(...)");
        return eArr;
    }

    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC44951d<T> m91450e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C41824h0(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC44951d<T> m91451f(Class<T> cls, InterfaceC44951d<Object>... interfaceC44951dArr) throws IllegalAccessException {
        Object obj;
        Field field;
        InterfaceC44951d<T> interfaceC44951dM91455j;
        Object objM91452g = m91452g(cls);
        if (objM91452g != null && (interfaceC44951dM91455j = m91455j(objM91452g, (InterfaceC44951d[]) Arrays.copyOf(interfaceC44951dArr, interfaceC44951dArr.length))) != null) {
            return interfaceC44951dM91455j;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i11 = 0;
            Class<?> cls2 = null;
            boolean z11 = false;
            while (true) {
                if (i11 < length) {
                    Class<?> cls3 = declaredClasses[i11];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (!z11) {
                            z11 = true;
                            cls2 = cls3;
                        }
                    }
                    i11++;
                } else if (z11) {
                    break;
                }
                cls2 = null;
                break;
            }
            if (cls2 != null && (field = cls2.getField("INSTANCE")) != null) {
                obj = field.get(null);
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC44951d) {
                return (InterfaceC44951d) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final <T> Object m91452g(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                cls2 = declaredClasses[i11];
                if (cls2.getAnnotation(InterfaceC41850m1.class) != null) {
                    break;
                }
                i11++;
            } else {
                cls2 = null;
                break;
            }
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return m91446a(cls, simpleName);
    }

    /* JADX INFO: renamed from: h */
    public static final <T> InterfaceC44951d<T> m91453h(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null && !StringsKt.startsWith$default(canonicalName, "java.", false, 2, (Object) null) && !StringsKt.startsWith$default(canonicalName, "kotlin.", false, 2, (Object) null)) {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            Field field = null;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i11 < length) {
                    Field field2 = declaredFields[i11];
                    if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (!z11) {
                            z11 = true;
                            field = field2;
                        }
                    }
                    i11++;
                } else {
                    if (!z11) {
                        break;
                    }
                    break;
                }
                field = null;
                break;
            }
            if (field == null) {
                return null;
            }
            Object obj = field.get(null);
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            int length2 = methods.length;
            Method method = null;
            int i12 = 0;
            boolean z12 = false;
            while (true) {
                if (i12 < length2) {
                    Method method2 = methods[i12];
                    if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), InterfaceC44951d.class)) {
                            if (!z12) {
                                z12 = true;
                                method = method2;
                            }
                        }
                    }
                    i12++;
                } else {
                    if (!z12) {
                        break;
                    }
                    break;
                }
                method = null;
                break;
            }
            if (method == null) {
                return null;
            }
            Object objInvoke = method.invoke(obj, new Object[0]);
            if (objInvoke instanceof InterfaceC44951d) {
                return (InterfaceC44951d) objInvoke;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Map<KClass<?>, InterfaceC44951d<?>> m91454i() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(String.class), C45236a.serializer(StringCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Character.TYPE), C45236a.serializer(CharCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(char[].class), C45236a.m99952d());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Double.TYPE), C45236a.serializer(DoubleCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(double[].class), C45236a.m99953e());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Float.TYPE), C45236a.serializer(FloatCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(float[].class), C45236a.m99954f());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Long.TYPE), C45236a.serializer(LongCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(long[].class), C45236a.m99957i());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(ULong.class), C45236a.serializer(ULong.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Integer.TYPE), C45236a.serializer(IntCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(int[].class), C45236a.m99955g());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UInt.class), C45236a.serializer(UInt.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Short.TYPE), C45236a.serializer(ShortCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(short[].class), C45236a.m99963o());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UShort.class), C45236a.serializer(UShort.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Byte.TYPE), C45236a.serializer(ByteCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(byte[].class), C45236a.m99951c());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UByte.class), C45236a.serializer(UByte.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Boolean.TYPE), C45236a.serializer(BooleanCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(boolean[].class), C45236a.m99950b());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Unit.class), C45236a.serializer(Unit.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Void.class), C45236a.m99960l());
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Duration.class), C45236a.serializer(Duration.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(ULongArray.class), C45236a.m99967s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UIntArray.class), C45236a.m99966r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UShortArray.class), C45236a.m99968t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UByteArray.class), C45236a.m99965q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Uuid.class), C45236a.serializer(Uuid.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
