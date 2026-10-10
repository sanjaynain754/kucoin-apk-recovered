package p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: compiled from: JvmNameResolver.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJvmNameResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolver.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class JvmNameResolver extends JvmNameResolverBase {

    @NotNull
    private final JvmProtoBuf.StringTableTypes types;

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmNameResolver(@NotNull JvmProtoBuf.StringTableTypes types, @NotNull String[] strings) {
        Set set;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(strings, "strings");
        List<Integer> localNameList = types.getLocalNameList();
        if (localNameList.isEmpty()) {
            set = SetsKt.emptySet();
        } else {
            Intrinsics.checkNotNull(localNameList);
            set = CollectionsKt.toSet(localNameList);
        }
        List<JvmProtoBuf.StringTableTypes.Record> recordList = types.getRecordList();
        Intrinsics.checkNotNullExpressionValue(recordList, "getRecordList(...)");
        super(strings, set, JvmNameResolverKt.toExpandedRecordsList(recordList));
        this.types = types;
    }
}
