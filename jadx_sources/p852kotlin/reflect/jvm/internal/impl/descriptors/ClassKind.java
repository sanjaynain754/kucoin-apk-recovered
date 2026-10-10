package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.Nullable;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ClassKind.kt */
/* JADX INFO: loaded from: classes61.dex */
public enum ClassKind {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @Nullable
    private final String codeRepresentation;

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }

    ClassKind(String str) {
        this.codeRepresentation = str;
    }
}
