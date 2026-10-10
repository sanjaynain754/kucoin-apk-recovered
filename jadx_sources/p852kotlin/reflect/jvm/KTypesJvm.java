package p852kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KClassifier;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.KTypeParameter;
import p852kotlin.reflect.jvm.internal.KTypeImpl;
import p852kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;

/* JADX INFO: compiled from: KTypesJvm.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\t"}, m90084d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "getJvmErasure", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "KTypesJvm")
@SourceDebugExtension({"SMAP\nKTypesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypesJvm.kt\nkotlin/reflect/jvm/KTypesJvm\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n295#2,2:53\n*S KotlinDebug\n*F\n+ 1 KTypesJvm.kt\nkotlin/reflect/jvm/KTypesJvm\n*L\n44#1:53,2\n*E\n"})
public final class KTypesJvm {
    @NotNull
    public static final KClass<?> getJvmErasure(@NotNull KType kType) {
        KClass<?> jvmErasure;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier != null && (jvmErasure = getJvmErasure(classifier)) != null) {
            return jvmErasure;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kType);
    }

    @NotNull
    public static final KClass<?> getJvmErasure(@NotNull KClassifier kClassifier) {
        Object obj;
        KClass<?> jvmErasure;
        Intrinsics.checkNotNullParameter(kClassifier, "<this>");
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (!(kClassifier instanceof KTypeParameter)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kClassifier);
        }
        List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KType kType = (KType) next;
            Intrinsics.checkNotNull(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((KTypeImpl) kType).getType().getConstructor().mo105126getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.INTERFACE && classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        KType kType2 = (KType) obj;
        if (kType2 == null) {
            kType2 = (KType) CollectionsKt.firstOrNull((List) upperBounds);
        }
        return (kType2 == null || (jvmErasure = getJvmErasure(kType2)) == null) ? Reflection.getOrCreateKotlinClass(Object.class) : jvmErasure;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getJvmErasure$annotations(KType kType) {
    }
}
