package p852kotlin.reflect.jvm.internal.impl.metadata.serialization;

import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: MutableTable.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class MutableTable<Element extends GeneratedMessageLite.Builder<?, Element>, Table extends GeneratedMessageLite, TableBuilder extends GeneratedMessageLite.Builder<Table, TableBuilder>> {

    @NotNull
    private final Interner<TableElementWrapper<Element>> interner;

    public final int get(@NotNull Element type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.interner.intern(new TableElementWrapper<>(type));
    }
}
