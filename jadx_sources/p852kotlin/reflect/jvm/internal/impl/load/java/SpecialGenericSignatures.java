package p852kotlin.reflect.jvm.internal.impl.load.java;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: SpecialGenericSignatures.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nSpecialGenericSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,194:1\n1563#2:195\n1634#2,3:196\n1563#2:199\n1634#2,3:200\n1563#2:203\n1634#2,3:204\n1252#2,4:210\n1563#2:214\n1634#2,3:215\n1563#2:218\n1634#2,3:219\n1252#2,4:225\n1634#2,3:232\n1563#2:235\n1634#2,3:236\n1222#2,2:239\n1252#2,4:241\n13#3:207\n13#3:222\n478#4:208\n424#4:209\n478#4:223\n424#4:224\n153#5,3:229\n*S KotlinDebug\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n*L\n57#1:195\n57#1:196,3\n59#1:199\n59#1:200,3\n60#1:203\n60#1:204,3\n98#1:210,4\n104#1:214\n104#1:215,3\n105#1:218\n105#1:219,3\n168#1:225,4\n176#1:232,3\n180#1:235\n180#1:236,3\n181#1:239,2\n181#1:241,4\n63#1:207\n114#1:222\n98#1:208\n98#1:209\n168#1:223\n168#1:224\n172#1:229,3\n*E\n"})
public class SpecialGenericSignatures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> ERASED_COLLECTION_PARAMETER_NAMES;

    @NotNull
    private static final List<Companion.NameAndSignature> ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;

    @NotNull
    private static final List<String> ERASED_COLLECTION_PARAMETER_SIGNATURES;

    @NotNull
    private static final Set<Name> ERASED_VALUE_PARAMETERS_SHORT_NAMES;

    @NotNull
    private static final Set<String> ERASED_VALUE_PARAMETERS_SIGNATURES;

    @NotNull
    private static final Map<Companion.NameAndSignature, TypeSafeBarrierDescription> GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;

    @NotNull
    private static final Map<Name, Name> JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;

    @NotNull
    private static final Set<String> JVM_SIGNATURES_FOR_RENAMED_BUILT_INS;

    @NotNull
    private static final Map<Companion.NameAndSignature, Name> NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;

    @NotNull
    private static final Set<Name> ORIGINAL_SHORT_NAMES;

    @NotNull
    private static final Companion.NameAndSignature REMOVE_AT_NAME_AND_SIGNATURE;

    @NotNull
    private static final Map<String, TypeSafeBarrierDescription> SIGNATURE_TO_DEFAULT_VALUES_MAP;

    @NotNull
    private static final Map<String, Name> SIGNATURE_TO_JVM_REPRESENTATION_NAME;

    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
        public static final class NameAndSignature {

            @NotNull
            private final String classInternalName;

            @NotNull
            private final Name name;

            @NotNull
            private final String parameters;

            @NotNull
            private final String returnType;

            @NotNull
            private final String signature;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.areEqual(this.classInternalName, nameAndSignature.classInternalName) && Intrinsics.areEqual(this.name, nameAndSignature.name) && Intrinsics.areEqual(this.parameters, nameAndSignature.parameters) && Intrinsics.areEqual(this.returnType, nameAndSignature.returnType);
            }

            public NameAndSignature(@NotNull String classInternalName, @NotNull Name name, @NotNull String parameters, @NotNull String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                this.classInternalName = classInternalName;
                this.name = name;
                this.parameters = parameters;
                this.returnType = returnType;
                this.signature = SignatureBuildingComponents.INSTANCE.signature(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ NameAndSignature copy$default(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = nameAndSignature.classInternalName;
                }
                if ((i11 & 2) != 0) {
                    name = nameAndSignature.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = nameAndSignature.parameters;
                }
                if ((i11 & 8) != 0) {
                    str3 = nameAndSignature.returnType;
                }
                return nameAndSignature.copy(str, name, str2, str3);
            }

            @NotNull
            public final NameAndSignature copy(@NotNull String classInternalName, @NotNull Name name, @NotNull String parameters, @NotNull String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                return new NameAndSignature(classInternalName, name, parameters, returnType);
            }

            @NotNull
            public final Name getName() {
                return this.name;
            }

            @NotNull
            public final String getSignature() {
                return this.signature;
            }

            public int hashCode() {
                return (((((this.classInternalName.hashCode() * 31) + this.name.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.returnType.hashCode();
            }

            @NotNull
            public String toString() {
                return "NameAndSignature(classInternalName=" + this.classInternalName + ", name=" + this.name + ", parameters=" + this.parameters + ", returnType=" + this.returnType + ')';
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NameAndSignature method(String str, String str2, String str3, String str4) {
            Name nameIdentifier = Name.identifier(str2);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return new NameAndSignature(str, nameIdentifier, str3, str4);
        }

        @Nullable
        public final Name getBuiltinFunctionNamesByJvmName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
        }

        public final boolean getSameAsRenamedInJvmBuiltin(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "<this>");
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        @NotNull
        public final SpecialSignatureInfo getSpecialSignatureInfo(@NotNull String builtinSignature) {
            Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
            if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(builtinSignature)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) MapsKt.getValue(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), builtinSignature)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        @NotNull
        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.ERASED_COLLECTION_PARAMETER_SIGNATURES;
        }

        @NotNull
        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.ERASED_VALUE_PARAMETERS_SHORT_NAMES;
        }

        @NotNull
        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.ERASED_VALUE_PARAMETERS_SIGNATURES;
        }

        @NotNull
        public final Map<Name, Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
        }

        @NotNull
        public final Set<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.ORIGINAL_SHORT_NAMES;
        }

        @NotNull
        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.REMOVE_AT_NAME_AND_SIGNATURE;
        }

        @NotNull
        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.SIGNATURE_TO_DEFAULT_VALUES_MAP;
        }

        @NotNull
        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.SIGNATURE_TO_JVM_REPRESENTATION_NAME;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static final class TypeSafeBarrierDescription {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;

        @Nullable
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription("NULL", 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);

        /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            public MAP_GET_OR_DEFAULT(String str, int i11) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i11, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, obj);
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] $values() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        static {
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr$values = $values();
            $VALUES = typeSafeBarrierDescriptionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeSafeBarrierDescriptionArr$values);
        }

        private TypeSafeBarrierDescription(String str, int i11, Object obj) {
            super(str, i11);
            this.defaultValue = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }
    }

    static {
        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(of2, 10));
        for (String str : of2) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
            arrayList.add(companion.method("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it.next()).getSignature());
        }
        ERASED_COLLECTION_PARAMETER_SIGNATURES = arrayList2;
        List<Companion.NameAndSignature> list = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Companion.NameAndSignature) it2.next()).getName().asString());
        }
        ERASED_COLLECTION_PARAMETER_NAMES = arrayList3;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String strJavaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc2, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureMethod = companion2.method(strJavaUtil, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair pairM90091to = TuplesKt.m90091to(nameAndSignatureMethod, typeSafeBarrierDescription);
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc3, "getDesc(...)");
        Pair pairM90091to2 = TuplesKt.m90091to(companion2.method(strJavaUtil2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String strJavaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc4, "getDesc(...)");
        Pair pairM90091to3 = TuplesKt.m90091to(companion2.method(strJavaUtil3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String strJavaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc5, "getDesc(...)");
        Pair pairM90091to4 = TuplesKt.m90091to(companion2.method(strJavaUtil4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String strJavaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc6, "getDesc(...)");
        Pair pairM90091to5 = TuplesKt.m90091to(companion2.method(strJavaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair pairM90091to6 = TuplesKt.m90091to(companion2.method(signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature nameAndSignatureMethod2 = companion2.method(signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair pairM90091to7 = TuplesKt.m90091to(nameAndSignatureMethod2, typeSafeBarrierDescription2);
        Pair pairM90091to8 = TuplesKt.m90091to(companion2.method(signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strJavaUtil6 = signatureBuildingComponents.javaUtil("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc7, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureMethod3 = companion2.method(strJavaUtil6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair pairM90091to9 = TuplesKt.m90091to(nameAndSignatureMethod3, typeSafeBarrierDescription3);
        String strJavaUtil7 = signatureBuildingComponents.javaUtil("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc8, "getDesc(...)");
        Map<Companion.NameAndSignature, TypeSafeBarrierDescription> mapMapOf = MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, pairM90091to6, pairM90091to7, pairM90091to8, pairM90091to9, TuplesKt.m90091to(companion2.method(strJavaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP = mapMapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapMapOf.size()));
        Iterator<T> it3 = mapMapOf.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_DEFAULT_VALUES_MAP = linkedHashMap;
        Set setPlus = SetsKt.plus((Set) GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP.keySet(), (Iterable) ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it4 = setPlus.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it4.next()).getName());
        }
        ERASED_VALUE_PARAMETERS_SHORT_NAMES = CollectionsKt.toSet(arrayList4);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it5 = setPlus.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it5.next()).getSignature());
        }
        ERASED_VALUE_PARAMETERS_SIGNATURES = CollectionsKt.toSet(arrayList5);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc9, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureMethod4 = companion3.method("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        REMOVE_AT_NAME_AND_SIGNATURE = nameAndSignatureMethod4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents2.javaLang("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc10, "getDesc(...)");
        Pair pairM90091to10 = TuplesKt.m90091to(companion3.method(strJavaLang, "toByte", "", desc10), Name.identifier("byteValue"));
        String strJavaLang2 = signatureBuildingComponents2.javaLang("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc11, "getDesc(...)");
        Pair pairM90091to11 = TuplesKt.m90091to(companion3.method(strJavaLang2, "toShort", "", desc11), Name.identifier("shortValue"));
        String strJavaLang3 = signatureBuildingComponents2.javaLang("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc12, "getDesc(...)");
        Pair pairM90091to12 = TuplesKt.m90091to(companion3.method(strJavaLang3, "toInt", "", desc12), Name.identifier("intValue"));
        String strJavaLang4 = signatureBuildingComponents2.javaLang("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc13, "getDesc(...)");
        Pair pairM90091to13 = TuplesKt.m90091to(companion3.method(strJavaLang4, "toLong", "", desc13), Name.identifier("longValue"));
        String strJavaLang5 = signatureBuildingComponents2.javaLang("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc14, "getDesc(...)");
        Pair pairM90091to14 = TuplesKt.m90091to(companion3.method(strJavaLang5, "toFloat", "", desc14), Name.identifier("floatValue"));
        String strJavaLang6 = signatureBuildingComponents2.javaLang("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc15, "getDesc(...)");
        Pair pairM90091to15 = TuplesKt.m90091to(companion3.method(strJavaLang6, "toDouble", "", desc15), Name.identifier("doubleValue"));
        Pair pairM90091to16 = TuplesKt.m90091to(nameAndSignatureMethod4, Name.identifier("remove"));
        String strJavaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc16, "getDesc(...)");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc17, "getDesc(...)");
        Map<Companion.NameAndSignature, Name> mapMapOf2 = MapsKt.mapOf(pairM90091to10, pairM90091to11, pairM90091to12, pairM90091to13, pairM90091to14, pairM90091to15, pairM90091to16, TuplesKt.m90091to(companion3.method(strJavaLang7, "get", desc16, desc17), Name.identifier("charAt")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "load", "", "I"), Name.identifier("get")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "store", "I", ExifInterface.GPS_MEASUREMENT_INTERRUPTED), Name.identifier("set")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "exchange", "I", "I"), Name.identifier("getAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "fetchAndAdd", "I", "I"), Name.identifier("getAndAdd")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "addAndFetch", "I", "I"), Name.identifier("addAndGet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "load", "", "J"), Name.identifier("get")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "store", "J", ExifInterface.GPS_MEASUREMENT_INTERRUPTED), Name.identifier("set")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "exchange", "J", "J"), Name.identifier("getAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "fetchAndAdd", "J", "J"), Name.identifier("getAndAdd")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "addAndFetch", "J", "J"), Name.identifier("addAndGet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "load", "", "Z"), Name.identifier("get")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "store", "Z", ExifInterface.GPS_MEASUREMENT_INTERRUPTED), Name.identifier("set")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "exchange", "Z", "Z"), Name.identifier("getAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "load", "", "Ljava/lang/Object;"), Name.identifier("get")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "store", "Ljava/lang/Object;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED), Name.identifier("set")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), Name.identifier("getAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "loadAt", "I", "I"), Name.identifier("get")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "storeAt", "II", ExifInterface.GPS_MEASUREMENT_INTERRUPTED), Name.identifier("set")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "exchangeAt", "II", "I"), Name.identifier("getAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), Name.identifier("compareAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), Name.identifier("getAndAdd")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), Name.identifier("addAndGet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "loadAt", "I", "J"), Name.identifier("get")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "storeAt", "IJ", ExifInterface.GPS_MEASUREMENT_INTERRUPTED), Name.identifier("set")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "exchangeAt", "IJ", "J"), Name.identifier("getAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), Name.identifier("compareAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), Name.identifier("getAndAdd")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), Name.identifier("addAndGet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), Name.identifier("get")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED), Name.identifier("set")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), Name.identifier("getAndSet")), TuplesKt.m90091to(companion3.method(signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), Name.identifier("compareAndSet")));
        NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP = mapMapOf2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(mapMapOf2.size()));
        Iterator<T> it6 = mapMapOf2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        SIGNATURE_TO_JVM_REPRESENTATION_NAME = linkedHashMap2;
        Map<Companion.NameAndSignature, Name> map = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Companion.NameAndSignature, Name> entry3 : map.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.copy$default(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).getSignature());
        }
        JVM_SIGNATURES_FOR_RENAMED_BUILT_INS = linkedHashSet;
        Set<Companion.NameAndSignature> setKeySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it7.next()).getName());
        }
        ORIGINAL_SHORT_NAMES = hashSet;
        Set<Map.Entry<Companion.NameAndSignature, Name>> setEntrySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet();
        ArrayList<Pair> arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList6.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).getName(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList6, 10)), 16));
        for (Pair pair : arrayList6) {
            linkedHashMap3.put((Name) pair.getSecond(), (Name) pair.getFirst());
        }
        JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP = linkedHashMap3;
    }

    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final boolean isObjectReplacedWithTypeParameter;

        @Nullable
        private final String valueParametersSignature;

        SpecialSignatureInfo(String str, boolean z11) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z11;
        }
    }
}
