package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementInfo\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n463#2:348\n413#2:349\n1252#3,4:350\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementInfo\n*L\n28#1:348\n28#1:349\n28#1:350,4\n*E\n"})
public final class TypeEnhancementInfo {

    @NotNull
    private final Map<Integer, JavaTypeQualifiers> map;

    public TypeEnhancementInfo(@NotNull Map<Integer, JavaTypeQualifiers> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    @NotNull
    public final TypeEnhancementInfo copyForWarnings() {
        Map<Integer, JavaTypeQualifiers> map = this.map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), JavaTypeQualifiers.copy$default((JavaTypeQualifiers) entry.getValue(), null, null, false, true, 7, null));
        }
        return new TypeEnhancementInfo(linkedHashMap);
    }

    @NotNull
    public final Map<Integer, JavaTypeQualifiers> getMap() {
        return this.map;
    }
}
