package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* JADX INFO: compiled from: MultiFieldValueClassRepresentation.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class MultiFieldValueClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    @NotNull
    private final Map<Name, Type> map;

    @NotNull
    private final List<Pair<Name, Type>> underlyingPropertyNamesToTypes;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.map.containsKey(name);
    }

    @NotNull
    public List<Pair<Name, Type>> getUnderlyingPropertyNamesToTypes() {
        return this.underlyingPropertyNamesToTypes;
    }

    @NotNull
    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + getUnderlyingPropertyNamesToTypes() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiFieldValueClassRepresentation(@NotNull List<? extends Pair<Name, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        Intrinsics.checkNotNullParameter(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.underlyingPropertyNamesToTypes = underlyingPropertyNamesToTypes;
        this.map = MapsKt.toMap(getUnderlyingPropertyNamesToTypes());
    }
}
