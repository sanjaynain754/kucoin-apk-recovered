package p852kotlin.reflect.jvm.internal.impl.types.model;

import org.jetbrains.annotations.NotNull;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes61.dex */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String presentation;

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.presentation;
    }

    TypeVariance(String str) {
        this.presentation = str;
    }
}
