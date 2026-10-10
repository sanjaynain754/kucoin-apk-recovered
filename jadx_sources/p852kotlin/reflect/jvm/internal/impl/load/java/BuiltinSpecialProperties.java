package p852kotlin.reflect.jvm.internal.impl.load.java;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: BuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,50:1\n1563#2:51\n1634#2,3:52\n1504#2:55\n1534#2,3:56\n1537#2,3:66\n1252#2,4:71\n1563#2:78\n1634#2,3:79\n382#3,7:59\n463#3:69\n413#3:70\n153#4,3:75\n*S KotlinDebug\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n*L\n31#1:51\n31#1:52,3\n32#1:55\n32#1:56,3\n32#1:66,3\n33#1:71,4\n42#1:78\n42#1:79,3\n32#1:59,7\n33#1:69\n33#1:70\n37#1:75,3\n*E\n"})
public final class BuiltinSpecialProperties {

    @NotNull
    private static final Set<FqName> GETTER_FQ_NAMES;

    @NotNull
    private static final Map<Name, List<Name>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;

    @NotNull
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    @NotNull
    private static final Map<FqName, Name> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;

    @NotNull
    private static final Set<FqName> SPECIAL_FQ_NAMES;

    @NotNull
    private static final Set<Name> SPECIAL_SHORT_NAMES;

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        Pair pairM90091to = TuplesKt.m90091to(BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, "name"), StandardNames.NAME);
        Pair pairM90091to2 = TuplesKt.m90091to(BuiltinSpecialPropertiesKt.childSafe(fqNameUnsafe, "ordinal"), Name.identifier("ordinal"));
        Pair pairM90091to3 = TuplesKt.m90091to(BuiltinSpecialPropertiesKt.child(StandardNames.FqNames.collection, "size"), Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        Map<FqName, Name> mapMapOf = MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to(BuiltinSpecialPropertiesKt.child(fqName, "size"), Name.identifier("size")), TuplesKt.m90091to(BuiltinSpecialPropertiesKt.childSafe(StandardNames.FqNames.charSequence, SessionDescription.ATTR_LENGTH), Name.identifier(SessionDescription.ATTR_LENGTH)), TuplesKt.m90091to(BuiltinSpecialPropertiesKt.child(fqName, "keys"), Name.identifier("keySet")), TuplesKt.m90091to(BuiltinSpecialPropertiesKt.child(fqName, "values"), Name.identifier("values")), TuplesKt.m90091to(BuiltinSpecialPropertiesKt.child(fqName, RemoteConfigConstants.ResponseFieldKey.ENTRIES), Name.identifier("entrySet")), TuplesKt.m90091to(BuiltinSpecialPropertiesKt.child(StandardNames.FqNames.atomicIntArray, "size"), Name.identifier(SessionDescription.ATTR_LENGTH)), TuplesKt.m90091to(BuiltinSpecialPropertiesKt.child(StandardNames.FqNames.atomicLongArray, "size"), Name.identifier(SessionDescription.ATTR_LENGTH)), TuplesKt.m90091to(BuiltinSpecialPropertiesKt.child(StandardNames.FqNames.atomicArray, "size"), Name.identifier(SessionDescription.ATTR_LENGTH)));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = mapMapOf;
        Set<Map.Entry<FqName, Name>> setEntrySet = mapMapOf.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.getSecond();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap2;
        Map<FqName, Name> map = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<FqName, Name> entry3 : map.entrySet()) {
            ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(entry3.getKey().parent().toUnsafe());
            Intrinsics.checkNotNull(classIdMapKotlinToJava);
            linkedHashSet.add(classIdMapKotlinToJava.asSingleFqName().child(entry3.getValue()));
        }
        GETTER_FQ_NAMES = linkedHashSet;
        Set<FqName> setKeySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
        SPECIAL_FQ_NAMES = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FqName) it2.next()).shortName());
        }
        SPECIAL_SHORT_NAMES = CollectionsKt.toSet(arrayList3);
    }

    @NotNull
    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    }

    @NotNull
    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List<Name> list = GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name1);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return SPECIAL_FQ_NAMES;
    }

    @NotNull
    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return SPECIAL_SHORT_NAMES;
    }

    private BuiltinSpecialProperties() {
    }
}
