package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnumEntriesDeserializationSupport.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmEnumEntriesDeserializationSupport implements EnumEntriesDeserializationSupport {

    @NotNull
    public static final JvmEnumEntriesDeserializationSupport INSTANCE = new JvmEnumEntriesDeserializationSupport();

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
    @NotNull
    public Boolean canSynthesizeEnumEntries() {
        return Boolean.TRUE;
    }

    private JvmEnumEntriesDeserializationSupport() {
    }
}
