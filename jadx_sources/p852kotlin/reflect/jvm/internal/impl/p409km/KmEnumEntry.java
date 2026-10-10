package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmEnumEntryExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmEnumEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,830:1\n1617#2,9:831\n1869#2:840\n1870#2:842\n1626#2:843\n1#3:841\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmEnumEntry\n*L\n521#1:831,9\n521#1:840\n521#1:842\n521#1:843\n521#1:841\n*E\n"})
public final class KmEnumEntry {

    @NotNull
    private final List<KmAnnotation> annotations;

    @NotNull
    private final List<KmEnumEntryExtension> extensions;

    @NotNull
    private String name;

    public KmEnumEntry(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.annotations = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            KmEnumEntryExtension kmEnumEntryExtensionCreateEnumEntryExtension = ((MetadataExtensions) it.next()).createEnumEntryExtension();
            if (kmEnumEntryExtensionCreateEnumEntryExtension != null) {
                arrayList.add(kmEnumEntryExtensionCreateEnumEntryExtension);
            }
        }
        this.extensions = arrayList;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public String toString() {
        return this.name;
    }
}
