package p852kotlin.reflect.jvm.internal.impl.metadata.serialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringTable.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface StringTable {
    int getQualifiedClassNameIndex(@NotNull String str, boolean z11);

    int getStringIndex(@NotNull String str);
}
