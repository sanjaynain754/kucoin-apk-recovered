package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnumEntriesDeserializationSupport.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface EnumEntriesDeserializationSupport {
    @Nullable
    Boolean canSynthesizeEnumEntries();

    /* JADX INFO: compiled from: EnumEntriesDeserializationSupport.kt */
    public static final class Default implements EnumEntriesDeserializationSupport {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
        @Nullable
        public Boolean canSynthesizeEnumEntries() {
            return null;
        }

        private Default() {
        }
    }
}
