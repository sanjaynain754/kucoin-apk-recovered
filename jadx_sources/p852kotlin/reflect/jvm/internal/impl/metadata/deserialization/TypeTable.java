package p852kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: TypeTable.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nTypeTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1573#2:37\n1604#2,4:38\n*S KotlinDebug\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n*L\n26#1:37\n26#1:38,4\n*E\n"})
public final class TypeTable {

    @NotNull
    private final List<ProtoBuf.Type> types;

    @NotNull
    public final ProtoBuf.Type get(int i11) {
        return this.types.get(i11);
    }

    public TypeTable(@NotNull ProtoBuf.TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            Intrinsics.checkNotNullExpressionValue(typeList2, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(typeList2, 10));
            int i11 = 0;
            for (Object obj : typeList2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i11 >= firstNullable) {
                    typeBuild = typeBuild.toBuilder().setNullable(true).build();
                }
                arrayList.add(typeBuild);
                i11 = i12;
            }
            typeList = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(typeList, "run(...)");
        this.types = typeList;
    }
}
