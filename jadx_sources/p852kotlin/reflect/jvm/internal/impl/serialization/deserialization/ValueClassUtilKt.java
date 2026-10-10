package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* JADX INFO: compiled from: ValueClassUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1563#2:56\n1634#2,3:57\n1563#2:60\n1634#2,3:61\n1563#2:64\n1634#2,3:65\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n26#1:56\n26#1:57,3\n44#1:60\n44#1:61,3\n48#1:64\n48#1:65,3\n*E\n"})
public final class ValueClassUtilKt {
    @NotNull
    public static final Pair<List<Name>, List<ProtoBuf.Type>> loadMultiFieldValueClassRepresentation(@NotNull ProtoBuf.Class r11, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        List<ProtoBuf.Type> multiFieldValueClassUnderlyingTypeList;
        Intrinsics.checkNotNullParameter(r11, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<Integer> multiFieldValueClassUnderlyingNameList = r11.getMultiFieldValueClassUnderlyingNameList();
        Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(multiFieldValueClassUnderlyingNameList, 10));
        for (Integer num : multiFieldValueClassUnderlyingNameList) {
            Intrinsics.checkNotNull(num);
            arrayList.add(NameResolverUtilKt.getName(nameResolver, num.intValue()));
        }
        Pair pairM90091to = TuplesKt.m90091to(Integer.valueOf(r11.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r11.getMultiFieldValueClassUnderlyingTypeCount()));
        if (Intrinsics.areEqual(pairM90091to, TuplesKt.m90091to(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r11.getMultiFieldValueClassUnderlyingTypeIdList();
            Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            multiFieldValueClassUnderlyingTypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(multiFieldValueClassUnderlyingTypeIdList, 10));
            for (Integer num2 : multiFieldValueClassUnderlyingTypeIdList) {
                Intrinsics.checkNotNull(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!Intrinsics.areEqual(pairM90091to, TuplesKt.m90091to(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r11.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r11.getMultiFieldValueClassUnderlyingTypeList();
        }
        return TuplesKt.m90091to(arrayList, multiFieldValueClassUnderlyingTypeList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T extends RigidTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(@NotNull ProtoBuf.Class r11, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull Function1<? super ProtoBuf.Type, ? extends T> typeDeserializer, @NotNull Function1<? super Name, ? extends T> typeOfPublicProperty) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(r11, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (r11.getMultiFieldValueClassUnderlyingNameCount() > 0) {
            Pair<List<Name>, List<ProtoBuf.Type>> pairLoadMultiFieldValueClassRepresentation = loadMultiFieldValueClassRepresentation(r11, nameResolver, typeTable);
            List<Name> listComponent1 = pairLoadMultiFieldValueClassRepresentation.component1();
            List<ProtoBuf.Type> listComponent2 = pairLoadMultiFieldValueClassRepresentation.component2();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listComponent2, 10));
            Iterator<T> it = listComponent2.iterator();
            while (it.hasNext()) {
                arrayList.add(typeDeserializer.invoke(it.next()));
            }
            return new MultiFieldValueClassRepresentation(CollectionsKt.zip(listComponent1, arrayList));
        }
        if (!r11.hasInlineClassUnderlyingPropertyName()) {
            return null;
        }
        Name name = NameResolverUtilKt.getName(nameResolver, r11.getInlineClassUnderlyingPropertyName());
        ProtoBuf.Type typeInlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r11, typeTable);
        if ((typeInlineClassUnderlyingType != null && (tInvoke = typeDeserializer.invoke(typeInlineClassUnderlyingType)) != null) || (tInvoke = typeOfPublicProperty.invoke(name)) != null) {
            return new InlineClassRepresentation(name, tInvoke);
        }
        throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r11.getFqName()) + " with property " + name).toString());
    }
}
