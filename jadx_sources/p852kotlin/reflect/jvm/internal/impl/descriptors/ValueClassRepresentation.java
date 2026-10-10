package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: compiled from: ValueClassRepresentation.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1563#2:52\n1634#2,3:53\n*S KotlinDebug\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n*L\n23#1:52\n23#1:53,3\n*E\n"})
public abstract class ValueClassRepresentation<Type extends RigidTypeMarker> {
    public /* synthetic */ ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean containsPropertyWithName(@NotNull Name name);

    private ValueClassRepresentation() {
    }

    @NotNull
    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> mapUnderlyingType(@NotNull Function1<? super Type, ? extends Other> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.getUnderlyingPropertyName(), transform.invoke(inlineClassRepresentation.getUnderlyingType()));
        }
        if (this instanceof MultiFieldValueClassRepresentation) {
            List<Pair<Name, Type>> underlyingPropertyNamesToTypes = ((MultiFieldValueClassRepresentation) this).getUnderlyingPropertyNamesToTypes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(underlyingPropertyNamesToTypes, 10));
            Iterator<T> it = underlyingPropertyNamesToTypes.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(TuplesKt.m90091to((Name) pair.component1(), transform.invoke((RigidTypeMarker) pair.component2())));
            }
            return new MultiFieldValueClassRepresentation(arrayList);
        }
        throw new NoWhenBranchMatchedException();
    }
}
