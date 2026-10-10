package p852kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: CompanionObjectMapping.kt */
/* JADX INFO: loaded from: classes23.dex */
@SourceDebugExtension({"SMAP\nCompanionObjectMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1563#2:21\n1634#2,3:22\n1634#2,3:25\n*S KotlinDebug\n*F\n+ 1 CompanionObjectMapping.kt\norg/jetbrains/kotlin/builtins/CompanionObjectMapping\n*L\n12#1:21\n12#1:22,3\n16#1:25,3\n*E\n"})
public final class CompanionObjectMapping {

    @NotNull
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();

    @NotNull
    private static final Set<ClassId> classIds;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.getPrimitiveFqName((PrimitiveType) it.next()));
        }
        List listPlus = CollectionsKt.plus((Collection<? extends FqName>) CollectionsKt.plus((Collection<? extends FqName>) CollectionsKt.plus((Collection<? extends FqName>) arrayList, StandardNames.FqNames.string.toSafe()), StandardNames.FqNames._boolean.toSafe()), StandardNames.FqNames._enum.toSafe());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it2 = listPlus.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(companion.topLevel((FqName) it2.next()));
        }
        classIds = linkedHashSet;
    }

    @NotNull
    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        return classIds;
    }

    @NotNull
    public final Set<ClassId> getClassIds() {
        return classIds;
    }

    private CompanionObjectMapping() {
    }
}
