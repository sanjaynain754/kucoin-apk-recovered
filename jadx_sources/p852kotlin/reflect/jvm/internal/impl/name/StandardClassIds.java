package p852kotlin.reflect.jvm.internal.impl.name;

import com.facebook.imagepipeline.memory.BitmapPoolType$Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: StandardClassIds.kt */
/* JADX INFO: loaded from: classes23.dex */
@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1285#2,2:342\n1299#2,4:344\n1285#2,2:348\n1299#2,4:350\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIds\n*L\n103#1:342,2\n103#1:344,4\n107#1:348,2\n107#1:350,4\n*E\n"})
public final class StandardClassIds {

    @NotNull
    private static final ClassId AbstractMap;

    @NotNull
    private static final ClassId Annotation;

    @NotNull
    private static final ClassId AnnotationRetention;

    @NotNull
    private static final ClassId AnnotationTarget;

    @NotNull
    private static final ClassId Any;

    @NotNull
    private static final ClassId Array;

    @NotNull
    private static final ClassId AtomicArray;

    @NotNull
    private static final ClassId AtomicBoolean;

    @NotNull
    private static final ClassId AtomicInt;

    @NotNull
    private static final ClassId AtomicIntArray;

    @NotNull
    private static final ClassId AtomicLong;

    @NotNull
    private static final ClassId AtomicLongArray;

    @NotNull
    private static final ClassId AtomicReference;

    @NotNull
    private static final FqName BASE_ANNOTATIONS_JVM_PACKAGE;

    @NotNull
    private static final FqName BASE_ANNOTATION_PACKAGE;

    @NotNull
    private static final FqName BASE_COLLECTIONS_PACKAGE;

    @NotNull
    private static final FqName BASE_CONCURRENT_ATOMICS_PACKAGE;

    @NotNull
    private static final FqName BASE_CONCURRENT_PACKAGE;

    @NotNull
    private static final FqName BASE_CONTRACTS_PACKAGE;

    @NotNull
    private static final FqName BASE_COROUTINES_INTRINSICS_PACKAGE;

    @NotNull
    private static final FqName BASE_COROUTINES_PACKAGE;

    @NotNull
    private static final FqName BASE_ENUMS_PACKAGE;

    @NotNull
    private static final FqName BASE_EXPERIMENTAL_PACKAGE;

    @NotNull
    private static final FqName BASE_INTERNAL_IR_PACKAGE;

    @NotNull
    private static final FqName BASE_INTERNAL_PACKAGE;

    @NotNull
    private static final FqName BASE_JS_PACKAGE;

    @NotNull
    private static final FqName BASE_JVM_FUNCTIONS_PACKAGE;

    @NotNull
    private static final FqName BASE_JVM_INTERNAL_PACKAGE;

    @NotNull
    private static final FqName BASE_JVM_PACKAGE;

    @NotNull
    private static final FqName BASE_KOTLIN_PACKAGE;

    @NotNull
    private static final FqName BASE_RANGES_PACKAGE;

    @NotNull
    private static final FqName BASE_REFLECT_PACKAGE;

    @NotNull
    private static final FqName BASE_SEQUENCES_PACKAGE;

    @NotNull
    private static final FqName BASE_TEST_PACKAGE;

    @NotNull
    private static final FqName BASE_TEXT_PACKAGE;

    @NotNull
    private static final ClassId Boolean;

    @NotNull
    private static final ClassId Byte;

    @NotNull
    private static final ClassId Char;

    @NotNull
    private static final ClassId CharIterator;

    @NotNull
    private static final ClassId CharRange;

    @NotNull
    private static final ClassId CharSequence;

    @NotNull
    private static final ClassId Cloneable;

    @NotNull
    private static final ClassId Collection;

    @NotNull
    private static final ClassId Comparable;

    @NotNull
    private static final ClassId Continuation;

    @NotNull
    private static final ClassId DeprecationLevel;

    @NotNull
    private static final ClassId Double;

    @NotNull
    private static final ClassId Enum;

    @NotNull
    private static final ClassId EnumEntries;

    @NotNull
    private static final ClassId Float;

    @NotNull
    private static final ClassId Function;

    @NotNull
    public static final StandardClassIds INSTANCE = new StandardClassIds();

    @NotNull
    private static final ClassId Int;

    @NotNull
    private static final ClassId IntRange;

    @NotNull
    private static final ClassId Iterable;

    @NotNull
    private static final ClassId Iterator;

    @NotNull
    private static final ClassId KCallable;

    @NotNull
    private static final ClassId KClass;

    @NotNull
    private static final ClassId KFunction;

    @NotNull
    private static final ClassId KMutableProperty;

    @NotNull
    private static final ClassId KMutableProperty0;

    @NotNull
    private static final ClassId KMutableProperty1;

    @NotNull
    private static final ClassId KMutableProperty2;

    @NotNull
    private static final ClassId KProperty;

    @NotNull
    private static final ClassId KProperty0;

    @NotNull
    private static final ClassId KProperty1;

    @NotNull
    private static final ClassId KProperty2;

    @NotNull
    private static final ClassId KType;

    @NotNull
    private static final ClassId List;

    @NotNull
    private static final ClassId ListIterator;

    @NotNull
    private static final ClassId Long;

    @NotNull
    private static final ClassId LongRange;

    @NotNull
    private static final ClassId Map;

    @NotNull
    private static final ClassId MapEntry;

    @NotNull
    private static final ClassId MutableCollection;

    @NotNull
    private static final ClassId MutableIterable;

    @NotNull
    private static final ClassId MutableIterator;

    @NotNull
    private static final ClassId MutableList;

    @NotNull
    private static final ClassId MutableListIterator;

    @NotNull
    private static final ClassId MutableMap;

    @NotNull
    private static final ClassId MutableMapEntry;

    @NotNull
    private static final ClassId MutableSet;

    @NotNull
    private static final ClassId Nothing;

    @NotNull
    private static final ClassId Number;

    @NotNull
    private static final ClassId Result;

    @NotNull
    private static final ClassId Set;

    @NotNull
    private static final ClassId Short;

    @NotNull
    private static final ClassId String;

    @NotNull
    private static final ClassId Throwable;

    @NotNull
    private static final ClassId UByte;

    @NotNull
    private static final ClassId UInt;

    @NotNull
    private static final ClassId ULong;

    @NotNull
    private static final ClassId UShort;

    @NotNull
    private static final ClassId Unit;

    @NotNull
    private static final Set<ClassId> allBuiltinTypes;

    @NotNull
    private static final Map<ClassId, ClassId> atomicArrayByPrimitive;

    @NotNull
    private static final Map<ClassId, ClassId> atomicByPrimitive;

    @NotNull
    private static final Set<FqName> builtInsPackages;

    @NotNull
    private static final Set<FqName> builtInsPackagesWithDefaultNamedImport;

    @NotNull
    private static final Set<ClassId> constantAllowedTypes;

    @NotNull
    private static final Map<ClassId, ClassId> elementTypeByPrimitiveArrayType;

    @NotNull
    private static final Map<ClassId, ClassId> elementTypeByUnsignedArrayType;

    @NotNull
    private static final Map<ClassId, ClassId> primitiveArrayTypeByElementType;

    @NotNull
    private static final Set<ClassId> primitiveTypes;

    @NotNull
    private static final Set<ClassId> signedIntegerTypes;

    @NotNull
    private static final Map<ClassId, ClassId> unsignedArrayTypeByElementType;

    @NotNull
    private static final Set<ClassId> unsignedTypes;

    static {
        FqName fqName = new FqName("kotlin");
        BASE_KOTLIN_PACKAGE = fqName;
        Name nameIdentifier = Name.identifier("reflect");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        FqName fqNameChild = fqName.child(nameIdentifier);
        BASE_REFLECT_PACKAGE = fqNameChild;
        Name nameIdentifier2 = Name.identifier(BitmapPoolType$Companion.EXPERIMENTAL);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        BASE_EXPERIMENTAL_PACKAGE = fqName.child(nameIdentifier2);
        Name nameIdentifier3 = Name.identifier("collections");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        FqName fqNameChild2 = fqName.child(nameIdentifier3);
        BASE_COLLECTIONS_PACKAGE = fqNameChild2;
        Name nameIdentifier4 = Name.identifier("sequences");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        BASE_SEQUENCES_PACKAGE = fqName.child(nameIdentifier4);
        Name nameIdentifier5 = Name.identifier("ranges");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        FqName fqNameChild3 = fqName.child(nameIdentifier5);
        BASE_RANGES_PACKAGE = fqNameChild3;
        Name nameIdentifier6 = Name.identifier("jvm");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(...)");
        FqName fqNameChild4 = fqName.child(nameIdentifier6);
        BASE_JVM_PACKAGE = fqNameChild4;
        Name nameIdentifier7 = Name.identifier("js");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(...)");
        BASE_JS_PACKAGE = fqName.child(nameIdentifier7);
        Name nameIdentifier8 = Name.identifier("annotations");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(...)");
        FqName fqNameChild5 = fqName.child(nameIdentifier8);
        Name nameIdentifier9 = Name.identifier("jvm");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(...)");
        BASE_ANNOTATIONS_JVM_PACKAGE = fqNameChild5.child(nameIdentifier9);
        Name nameIdentifier10 = Name.identifier("internal");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(...)");
        BASE_JVM_INTERNAL_PACKAGE = fqNameChild4.child(nameIdentifier10);
        Name nameIdentifier11 = Name.identifier("functions");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(...)");
        BASE_JVM_FUNCTIONS_PACKAGE = fqNameChild4.child(nameIdentifier11);
        Name nameIdentifier12 = Name.identifier("annotation");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(...)");
        FqName fqNameChild6 = fqName.child(nameIdentifier12);
        BASE_ANNOTATION_PACKAGE = fqNameChild6;
        Name nameIdentifier13 = Name.identifier("internal");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(...)");
        FqName fqNameChild7 = fqName.child(nameIdentifier13);
        BASE_INTERNAL_PACKAGE = fqNameChild7;
        Name nameIdentifier14 = Name.identifier("ir");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier14, "identifier(...)");
        BASE_INTERNAL_IR_PACKAGE = fqNameChild7.child(nameIdentifier14);
        Name nameIdentifier15 = Name.identifier("coroutines");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier15, "identifier(...)");
        FqName fqNameChild8 = fqName.child(nameIdentifier15);
        BASE_COROUTINES_PACKAGE = fqNameChild8;
        Name nameIdentifier16 = Name.identifier("intrinsics");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier16, "identifier(...)");
        BASE_COROUTINES_INTRINSICS_PACKAGE = fqNameChild8.child(nameIdentifier16);
        Name nameIdentifier17 = Name.identifier("enums");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier17, "identifier(...)");
        BASE_ENUMS_PACKAGE = fqName.child(nameIdentifier17);
        Name nameIdentifier18 = Name.identifier("contracts");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier18, "identifier(...)");
        BASE_CONTRACTS_PACKAGE = fqName.child(nameIdentifier18);
        Name nameIdentifier19 = Name.identifier("concurrent");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier19, "identifier(...)");
        FqName fqNameChild9 = fqName.child(nameIdentifier19);
        BASE_CONCURRENT_PACKAGE = fqNameChild9;
        Name nameIdentifier20 = Name.identifier("atomics");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier20, "identifier(...)");
        FqName fqNameChild10 = fqNameChild9.child(nameIdentifier20);
        BASE_CONCURRENT_ATOMICS_PACKAGE = fqNameChild10;
        Name nameIdentifier21 = Name.identifier("test");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier21, "identifier(...)");
        BASE_TEST_PACKAGE = fqName.child(nameIdentifier21);
        Name nameIdentifier22 = Name.identifier("text");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier22, "identifier(...)");
        BASE_TEXT_PACKAGE = fqName.child(nameIdentifier22);
        builtInsPackagesWithDefaultNamedImport = SetsKt.setOf((Object[]) new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild6});
        builtInsPackages = SetsKt.setOf((Object[]) new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild6, fqNameChild, fqNameChild7, fqNameChild8, fqNameChild10});
        Nothing = StandardClassIdsKt.baseId("Nothing");
        Unit = StandardClassIdsKt.baseId("Unit");
        Any = StandardClassIdsKt.baseId("Any");
        Enum = StandardClassIdsKt.baseId("Enum");
        Annotation = StandardClassIdsKt.baseId("Annotation");
        Array = StandardClassIdsKt.baseId("Array");
        ClassId classIdBaseId = StandardClassIdsKt.baseId("Boolean");
        Boolean = classIdBaseId;
        ClassId classIdBaseId2 = StandardClassIdsKt.baseId("Char");
        Char = classIdBaseId2;
        ClassId classIdBaseId3 = StandardClassIdsKt.baseId("Byte");
        Byte = classIdBaseId3;
        ClassId classIdBaseId4 = StandardClassIdsKt.baseId("Short");
        Short = classIdBaseId4;
        ClassId classIdBaseId5 = StandardClassIdsKt.baseId("Int");
        Int = classIdBaseId5;
        ClassId classIdBaseId6 = StandardClassIdsKt.baseId("Long");
        Long = classIdBaseId6;
        ClassId classIdBaseId7 = StandardClassIdsKt.baseId("Float");
        Float = classIdBaseId7;
        ClassId classIdBaseId8 = StandardClassIdsKt.baseId("Double");
        Double = classIdBaseId8;
        UByte = StandardClassIdsKt.unsignedId(classIdBaseId3);
        UShort = StandardClassIdsKt.unsignedId(classIdBaseId4);
        UInt = StandardClassIdsKt.unsignedId(classIdBaseId5);
        ULong = StandardClassIdsKt.unsignedId(classIdBaseId6);
        CharSequence = StandardClassIdsKt.baseId("CharSequence");
        String = StandardClassIdsKt.baseId("String");
        Throwable = StandardClassIdsKt.baseId("Throwable");
        Cloneable = StandardClassIdsKt.baseId("Cloneable");
        KProperty = StandardClassIdsKt.reflectId("KProperty");
        KMutableProperty = StandardClassIdsKt.reflectId("KMutableProperty");
        KProperty0 = StandardClassIdsKt.reflectId("KProperty0");
        KMutableProperty0 = StandardClassIdsKt.reflectId("KMutableProperty0");
        KProperty1 = StandardClassIdsKt.reflectId("KProperty1");
        KMutableProperty1 = StandardClassIdsKt.reflectId("KMutableProperty1");
        KProperty2 = StandardClassIdsKt.reflectId("KProperty2");
        KMutableProperty2 = StandardClassIdsKt.reflectId("KMutableProperty2");
        KFunction = StandardClassIdsKt.reflectId("KFunction");
        KClass = StandardClassIdsKt.reflectId("KClass");
        KCallable = StandardClassIdsKt.reflectId("KCallable");
        KType = StandardClassIdsKt.reflectId("KType");
        Comparable = StandardClassIdsKt.baseId("Comparable");
        Number = StandardClassIdsKt.baseId("Number");
        Function = StandardClassIdsKt.baseId("Function");
        Set<ClassId> of2 = SetsKt.setOf((Object[]) new ClassId[]{classIdBaseId, classIdBaseId2, classIdBaseId3, classIdBaseId4, classIdBaseId5, classIdBaseId6, classIdBaseId7, classIdBaseId8});
        primitiveTypes = of2;
        signedIntegerTypes = SetsKt.setOf((Object[]) new ClassId[]{classIdBaseId3, classIdBaseId4, classIdBaseId5, classIdBaseId6});
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(of2, 10)), 16));
        for (Object obj : of2) {
            linkedHashMap.put(obj, StandardClassIdsKt.primitiveArrayId(((ClassId) obj).getShortClassName()));
        }
        primitiveArrayTypeByElementType = linkedHashMap;
        elementTypeByPrimitiveArrayType = StandardClassIdsKt.inverseMap(linkedHashMap);
        Set<ClassId> of3 = SetsKt.setOf((Object[]) new ClassId[]{UByte, UShort, UInt, ULong});
        unsignedTypes = of3;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(of3, 10)), 16));
        for (Object obj2 : of3) {
            linkedHashMap2.put(obj2, StandardClassIdsKt.primitiveArrayId(((ClassId) obj2).getShortClassName()));
        }
        unsignedArrayTypeByElementType = linkedHashMap2;
        elementTypeByUnsignedArrayType = StandardClassIdsKt.inverseMap(linkedHashMap2);
        Set<ClassId> set = primitiveTypes;
        Set<ClassId> set2 = unsignedTypes;
        Set setPlus = SetsKt.plus((Set) set, (Iterable) set2);
        ClassId classId = String;
        constantAllowedTypes = SetsKt.plus((Set<? extends ClassId>) setPlus, classId);
        Continuation = StandardClassIdsKt.coroutinesId("Continuation");
        Iterator = StandardClassIdsKt.collectionsId("Iterator");
        Iterable = StandardClassIdsKt.collectionsId("Iterable");
        Collection = StandardClassIdsKt.collectionsId("Collection");
        List = StandardClassIdsKt.collectionsId("List");
        ListIterator = StandardClassIdsKt.collectionsId("ListIterator");
        Set = StandardClassIdsKt.collectionsId("Set");
        ClassId classIdCollectionsId = StandardClassIdsKt.collectionsId("Map");
        Map = classIdCollectionsId;
        AbstractMap = StandardClassIdsKt.collectionsId("AbstractMap");
        MutableIterator = StandardClassIdsKt.collectionsId("MutableIterator");
        CharIterator = StandardClassIdsKt.collectionsId("CharIterator");
        MutableIterable = StandardClassIdsKt.collectionsId("MutableIterable");
        MutableCollection = StandardClassIdsKt.collectionsId("MutableCollection");
        MutableList = StandardClassIdsKt.collectionsId("MutableList");
        MutableListIterator = StandardClassIdsKt.collectionsId("MutableListIterator");
        MutableSet = StandardClassIdsKt.collectionsId("MutableSet");
        ClassId classIdCollectionsId2 = StandardClassIdsKt.collectionsId("MutableMap");
        MutableMap = classIdCollectionsId2;
        Name nameIdentifier23 = Name.identifier("Entry");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier23, "identifier(...)");
        MapEntry = classIdCollectionsId.createNestedClassId(nameIdentifier23);
        Name nameIdentifier24 = Name.identifier("MutableEntry");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier24, "identifier(...)");
        MutableMapEntry = classIdCollectionsId2.createNestedClassId(nameIdentifier24);
        Result = StandardClassIdsKt.baseId("Result");
        IntRange = StandardClassIdsKt.rangesId("IntRange");
        LongRange = StandardClassIdsKt.rangesId("LongRange");
        CharRange = StandardClassIdsKt.rangesId("CharRange");
        AnnotationRetention = StandardClassIdsKt.annotationId("AnnotationRetention");
        AnnotationTarget = StandardClassIdsKt.annotationId("AnnotationTarget");
        DeprecationLevel = StandardClassIdsKt.baseId("DeprecationLevel");
        EnumEntries = StandardClassIdsKt.enumsId("EnumEntries");
        ClassId classIdAtomicsId = StandardClassIdsKt.atomicsId("AtomicBoolean");
        AtomicBoolean = classIdAtomicsId;
        ClassId classIdAtomicsId2 = StandardClassIdsKt.atomicsId("AtomicInt");
        AtomicInt = classIdAtomicsId2;
        ClassId classIdAtomicsId3 = StandardClassIdsKt.atomicsId("AtomicLong");
        AtomicLong = classIdAtomicsId3;
        AtomicReference = StandardClassIdsKt.atomicsId("AtomicReference");
        Pair pairM90091to = TuplesKt.m90091to(Boolean, classIdAtomicsId);
        ClassId classId2 = Int;
        Pair pairM90091to2 = TuplesKt.m90091to(classId2, classIdAtomicsId2);
        ClassId classId3 = Long;
        atomicByPrimitive = MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to(classId3, classIdAtomicsId3));
        AtomicArray = StandardClassIdsKt.atomicsId("AtomicArray");
        ClassId classIdAtomicsId4 = StandardClassIdsKt.atomicsId("AtomicIntArray");
        AtomicIntArray = classIdAtomicsId4;
        ClassId classIdAtomicsId5 = StandardClassIdsKt.atomicsId("AtomicLongArray");
        AtomicLongArray = classIdAtomicsId5;
        atomicArrayByPrimitive = MapsKt.mapOf(TuplesKt.m90091to(classId2, classIdAtomicsId4), TuplesKt.m90091to(classId3, classIdAtomicsId5));
        allBuiltinTypes = SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set) set, (Iterable) set2), classId), Unit), Any), Enum);
    }

    @NotNull
    public final ClassId getArray() {
        return Array;
    }

    @NotNull
    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return BASE_ANNOTATION_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return BASE_COLLECTIONS_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_CONCURRENT_ATOMICS_PACKAGE() {
        return BASE_CONCURRENT_ATOMICS_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_COROUTINES_PACKAGE() {
        return BASE_COROUTINES_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_ENUMS_PACKAGE() {
        return BASE_ENUMS_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_KOTLIN_PACKAGE() {
        return BASE_KOTLIN_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_RANGES_PACKAGE() {
        return BASE_RANGES_PACKAGE;
    }

    @NotNull
    public final FqName getBASE_REFLECT_PACKAGE() {
        return BASE_REFLECT_PACKAGE;
    }

    @NotNull
    public final ClassId getEnumEntries() {
        return EnumEntries;
    }

    @NotNull
    public final ClassId getKClass() {
        return KClass;
    }

    @NotNull
    public final ClassId getKFunction() {
        return KFunction;
    }

    @NotNull
    public final ClassId getMutableList() {
        return MutableList;
    }

    @NotNull
    public final ClassId getMutableMap() {
        return MutableMap;
    }

    @NotNull
    public final ClassId getMutableSet() {
        return MutableSet;
    }

    private StandardClassIds() {
    }
}
