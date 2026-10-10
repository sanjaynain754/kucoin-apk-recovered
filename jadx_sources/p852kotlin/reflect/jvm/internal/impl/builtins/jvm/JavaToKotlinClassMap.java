package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import p852kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p852kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: JavaToKotlinClassMap.kt */
/* JADX INFO: loaded from: classes23.dex */
@SourceDebugExtension({"SMAP\nJavaToKotlinClassMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n50#1,2:234\n50#1,2:236\n50#1,2:238\n50#1,2:240\n50#1,2:242\n50#1,2:244\n50#1,2:246\n50#1,2:248\n1634#2,3:230\n1#3:233\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n*L\n55#1:234,2\n56#1:236,2\n57#1:238,2\n58#1:240,2\n59#1:242,2\n60#1:244,2\n61#1:246,2\n62#1:248,2\n218#1:230,3\n*E\n"})
public final class JavaToKotlinClassMap {

    @NotNull
    private static final ClassId CLASS_CLASS_ID;

    @NotNull
    private static final ClassId FUNCTION_N_CLASS_ID;

    @NotNull
    private static final FqName FUNCTION_N_FQ_NAME;

    @NotNull
    public static final JavaToKotlinClassMap INSTANCE;

    @NotNull
    private static final ClassId K_CLASS_CLASS_ID;

    @NotNull
    private static final ClassId K_FUNCTION_CLASS_ID;

    @NotNull
    private static final String NUMBERED_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_K_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;

    @NotNull
    private static final String NUMBERED_SUSPEND_FUNCTION_PREFIX;

    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> javaToKotlin;

    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> kotlinToJava;

    @NotNull
    private static final List<PlatformMutabilityMapping> mutabilityMappings;

    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> mutableToReadOnly;

    @NotNull
    private static final HashMap<ClassId, ClassId> mutableToReadOnlyClassId;

    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> readOnlyToMutable;

    @NotNull
    private static final HashMap<ClassId, ClassId> readOnlyToMutableClassId;

    /* JADX INFO: compiled from: JavaToKotlinClassMap.kt */
    public static final class PlatformMutabilityMapping {

        @NotNull
        private final ClassId javaClass;

        @NotNull
        private final ClassId kotlinMutable;

        @NotNull
        private final ClassId kotlinReadOnly;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.areEqual(this.javaClass, platformMutabilityMapping.javaClass) && Intrinsics.areEqual(this.kotlinReadOnly, platformMutabilityMapping.kotlinReadOnly) && Intrinsics.areEqual(this.kotlinMutable, platformMutabilityMapping.kotlinMutable);
        }

        public PlatformMutabilityMapping(@NotNull ClassId javaClass, @NotNull ClassId kotlinReadOnly, @NotNull ClassId kotlinMutable) {
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
            this.javaClass = javaClass;
            this.kotlinReadOnly = kotlinReadOnly;
            this.kotlinMutable = kotlinMutable;
        }

        @NotNull
        public final ClassId component1() {
            return this.javaClass;
        }

        @NotNull
        public final ClassId component2() {
            return this.kotlinReadOnly;
        }

        @NotNull
        public final ClassId component3() {
            return this.kotlinMutable;
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.javaClass;
        }

        public int hashCode() {
            return (((this.javaClass.hashCode() * 31) + this.kotlinReadOnly.hashCode()) * 31) + this.kotlinMutable.hashCode();
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.javaClass + ", kotlinReadOnly=" + this.kotlinReadOnly + ", kotlinMutable=" + this.kotlinMutable + ')';
        }
    }

    private final void addTopLevel(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        addTopLevel(cls, fqNameUnsafe.toSafe());
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb2.append(function.getPackageFqName());
        sb2.append('.');
        sb2.append(function.getClassNamePrefix());
        NUMBERED_FUNCTION_PREFIX = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb3.append(kFunction.getPackageFqName());
        sb3.append('.');
        sb3.append(kFunction.getClassNamePrefix());
        NUMBERED_K_FUNCTION_PREFIX = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb4.append(suspendFunction.getPackageFqName());
        sb4.append('.');
        sb4.append(suspendFunction.getClassNamePrefix());
        NUMBERED_SUSPEND_FUNCTION_PREFIX = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb5.append(kSuspendFunction.getPackageFqName());
        sb5.append('.');
        sb5.append(kSuspendFunction.getClassNamePrefix());
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = sb5.toString();
        ClassId.Companion companion = ClassId.Companion;
        ClassId classId = companion.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        FUNCTION_N_CLASS_ID = classId;
        FUNCTION_N_FQ_NAME = classId.asSingleFqName();
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        K_FUNCTION_CLASS_ID = standardClassIds.getKFunction();
        K_CLASS_CLASS_ID = standardClassIds.getKClass();
        CLASS_CLASS_ID = javaToKotlinClassMap.classId(Class.class);
        javaToKotlin = new HashMap<>();
        kotlinToJava = new HashMap<>();
        mutableToReadOnly = new HashMap<>();
        readOnlyToMutable = new HashMap<>();
        mutableToReadOnlyClassId = new HashMap<>();
        readOnlyToMutableClassId = new HashMap<>();
        ClassId classId2 = companion.topLevel(StandardNames.FqNames.iterable);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterable.class), classId2, new ClassId(classId2.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterable, classId2.getPackageFqName()), false));
        ClassId classId3 = companion.topLevel(StandardNames.FqNames.iterator);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterator.class), classId3, new ClassId(classId3.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterator, classId3.getPackageFqName()), false));
        ClassId classId4 = companion.topLevel(StandardNames.FqNames.collection);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Collection.class), classId4, new ClassId(classId4.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableCollection, classId4.getPackageFqName()), false));
        ClassId classId5 = companion.topLevel(StandardNames.FqNames.list);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(List.class), classId5, new ClassId(classId5.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableList, classId5.getPackageFqName()), false));
        ClassId classId6 = companion.topLevel(StandardNames.FqNames.set);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Set.class), classId6, new ClassId(classId6.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableSet, classId6.getPackageFqName()), false));
        ClassId classId7 = companion.topLevel(StandardNames.FqNames.listIterator);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(ListIterator.class), classId7, new ClassId(classId7.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableListIterator, classId7.getPackageFqName()), false));
        FqName fqName = StandardNames.FqNames.map;
        ClassId classId8 = companion.topLevel(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.class), classId8, new ClassId(classId8.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMap, classId8.getPackageFqName()), false));
        ClassId classIdCreateNestedClassId = companion.topLevel(fqName).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        List<PlatformMutabilityMapping> listListOf = CollectionsKt.listOf((Object[]) new PlatformMutabilityMapping[]{platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.Entry.class), classIdCreateNestedClassId, new ClassId(classIdCreateNestedClassId.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMapEntry, classIdCreateNestedClassId.getPackageFqName()), false))});
        mutabilityMappings = listListOf;
        javaToKotlinClassMap.addTopLevel(Object.class, StandardNames.FqNames.any);
        javaToKotlinClassMap.addTopLevel(String.class, StandardNames.FqNames.string);
        javaToKotlinClassMap.addTopLevel(CharSequence.class, StandardNames.FqNames.charSequence);
        javaToKotlinClassMap.addTopLevel(Throwable.class, StandardNames.FqNames.throwable);
        javaToKotlinClassMap.addTopLevel(Cloneable.class, StandardNames.FqNames.cloneable);
        javaToKotlinClassMap.addTopLevel(Number.class, StandardNames.FqNames.number);
        javaToKotlinClassMap.addTopLevel(Comparable.class, StandardNames.FqNames.comparable);
        javaToKotlinClassMap.addTopLevel(Enum.class, StandardNames.FqNames._enum);
        javaToKotlinClassMap.addTopLevel(Annotation.class, StandardNames.FqNames.annotation);
        Iterator<PlatformMutabilityMapping> it = listListOf.iterator();
        while (it.hasNext()) {
            INSTANCE.addMapping(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId.Companion companion2 = ClassId.Companion;
            FqName wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            Intrinsics.checkNotNullExpressionValue(wrapperFqName, "getWrapperFqName(...)");
            ClassId classId9 = companion2.topLevel(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            javaToKotlinClassMap2.add(classId9, companion2.topLevel(StandardNames.getPrimitiveFqName(primitiveType)));
        }
        for (ClassId classId10 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            INSTANCE.add(ClassId.Companion.topLevel(new FqName("kotlin.jvm.internal." + classId10.getShortClassName().asString() + "CompanionObject")), classId10.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT));
        }
        for (int i11 = 0; i11 < 23; i11++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            javaToKotlinClassMap3.add(ClassId.Companion.topLevel(new FqName("kotlin.jvm.functions.Function" + i11)), StandardNames.getFunctionClassId(i11));
            javaToKotlinClassMap3.addKotlinToJava(new FqName(NUMBERED_K_FUNCTION_PREFIX + i11), K_FUNCTION_CLASS_ID);
        }
        for (int i12 = 0; i12 < 22; i12++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.INSTANCE;
            INSTANCE.addKotlinToJava(new FqName((kSuspendFunction2.getPackageFqName() + '.' + kSuspendFunction2.getClassNamePrefix()) + i12), K_FUNCTION_CLASS_ID);
        }
        JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
        javaToKotlinClassMap4.addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicInt"), javaToKotlinClassMap4.classId(AtomicInteger.class));
        javaToKotlinClassMap4.addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicLong"), javaToKotlinClassMap4.classId(AtomicLong.class));
        javaToKotlinClassMap4.addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicBoolean"), javaToKotlinClassMap4.classId(AtomicBoolean.class));
        javaToKotlinClassMap4.addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicReference"), javaToKotlinClassMap4.classId(AtomicReference.class));
        javaToKotlinClassMap4.addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicIntArray"), javaToKotlinClassMap4.classId(AtomicIntegerArray.class));
        javaToKotlinClassMap4.addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicLongArray"), javaToKotlinClassMap4.classId(AtomicLongArray.class));
        javaToKotlinClassMap4.addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicArray"), javaToKotlinClassMap4.classId(AtomicReferenceArray.class));
        javaToKotlinClassMap4.addKotlinToJava(StandardNames.FqNames.nothing.toSafe(), javaToKotlinClassMap4.classId(Void.class));
    }

    private final void addJavaToKotlin(ClassId classId, ClassId classId2) {
        javaToKotlin.put(classId.asSingleFqName().toUnsafe(), classId2);
    }

    private final void addKotlinToJava(FqName fqName, ClassId classId) {
        kotlinToJava.put(fqName.toUnsafe(), classId);
    }

    private final void addTopLevel(Class<?> cls, FqName fqName) {
        add(classId(cls), ClassId.Companion.topLevel(fqName));
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    public final boolean isMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.containsKey(fqNameUnsafe);
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return javaToKotlin.get(fqName.toUnsafe());
    }

    @Nullable
    public final FqName mutableToReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName readOnlyToMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.get(fqNameUnsafe);
    }

    private JavaToKotlinClassMap() {
    }

    private final void add(ClassId classId, ClassId classId2) {
        addJavaToKotlin(classId, classId2);
        addKotlinToJava(classId2.asSingleFqName(), classId);
    }

    private final void addMapping(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId classIdComponent1 = platformMutabilityMapping.component1();
        ClassId classIdComponent2 = platformMutabilityMapping.component2();
        ClassId classIdComponent3 = platformMutabilityMapping.component3();
        add(classIdComponent1, classIdComponent2);
        addKotlinToJava(classIdComponent3.asSingleFqName(), classIdComponent1);
        mutableToReadOnlyClassId.put(classIdComponent3, classIdComponent2);
        readOnlyToMutableClassId.put(classIdComponent2, classIdComponent3);
        FqName fqNameAsSingleFqName = classIdComponent2.asSingleFqName();
        FqName fqNameAsSingleFqName2 = classIdComponent3.asSingleFqName();
        mutableToReadOnly.put(classIdComponent3.asSingleFqName().toUnsafe(), fqNameAsSingleFqName);
        readOnlyToMutable.put(fqNameAsSingleFqName.toUnsafe(), fqNameAsSingleFqName2);
    }

    private final ClassId classId(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId.Companion companion = ClassId.Companion;
            String canonicalName = cls.getCanonicalName();
            Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
            return companion.topLevel(new FqName(canonicalName));
        }
        ClassId classId = classId(declaringClass);
        Name nameIdentifier = Name.identifier(cls.getSimpleName());
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return classId.createNestedClassId(nameIdentifier);
    }

    private final boolean isKotlinFunctionWithBigArity(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String strAsString = fqNameUnsafe.asString();
        if (!StringsKt.startsWith$default(strAsString, str, false, 2, (Object) null)) {
            return false;
        }
        String strSubstring = strAsString.substring(str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (StringsKt.startsWith$default((CharSequence) strSubstring, '0', false, 2, (Object) null) || (intOrNull = StringsKt.toIntOrNull(strSubstring)) == null || intOrNull.intValue() < 23) {
            return false;
        }
        return true;
    }

    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        if (isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_FUNCTION_PREFIX)) {
            return FUNCTION_N_CLASS_ID;
        }
        if (isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_SUSPEND_FUNCTION_PREFIX)) {
            return FUNCTION_N_CLASS_ID;
        }
        if (isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_K_FUNCTION_PREFIX)) {
            return K_FUNCTION_CLASS_ID;
        }
        if (isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_K_SUSPEND_FUNCTION_PREFIX)) {
            return K_FUNCTION_CLASS_ID;
        }
        return kotlinToJava.get(kotlinFqName);
    }
}
