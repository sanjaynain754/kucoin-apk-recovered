package kotlinx.serialization.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KClassifier;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.KTypeParameter;
import p852kotlin.reflect.KTypeProjection;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.internal.b2 */
/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lvg0/f;", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lvg0/f;)Ljava/util/Set;", "", "", "b", "(Ljava/util/List;)[Lvg0/f;", "Lkotlin/reflect/KClass;", "", "f", "(Lkotlin/reflect/KClass;)Ljava/lang/Void;", "e", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "className", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/reflect/KType;", "", "c", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KTypeProjection;", "g", "(Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;", "[Lvg0/f;", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n37#3,2:192\n1797#4,3:194\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n74#1:192,2\n160#1:194,3\n*E\n"})
public final class C41796b2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC45533f[] f91899a = new InterfaceC45533f[0];

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Set<String> m91496a(@NotNull InterfaceC45533f interfaceC45533f) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        if (interfaceC45533f instanceof InterfaceC41853n) {
            return ((InterfaceC41853n) interfaceC45533f).mo91580a();
        }
        HashSet hashSet = new HashSet(interfaceC45533f.getElementsCount());
        int elementsCount = interfaceC45533f.getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            hashSet.add(interfaceC45533f.mo91527f(i11));
        }
        return hashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC45533f[] m91497b(@Nullable List<? extends InterfaceC45533f> list) {
        InterfaceC45533f[] interfaceC45533fArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC45533fArr = (InterfaceC45533f[]) list.toArray(new InterfaceC45533f[0])) == null) ? f91899a : interfaceC45533fArr;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final KClass<Object> m91498c(@NotNull KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m91499d(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m91500e(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return m91499d(simpleName);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Void m91501f(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new SerializationException(m91500e(kClass));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final KType m91502g(@NotNull KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
        KType type = kTypeProjection.getType();
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.getType()).toString());
    }
}
