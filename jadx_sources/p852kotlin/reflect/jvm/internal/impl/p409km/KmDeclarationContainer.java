package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface KmDeclarationContainer {
    @NotNull
    List<KmFunction> getFunctions();

    @NotNull
    List<KmProperty> getProperties();

    @NotNull
    List<KmTypeAlias> getTypeAliases();
}
