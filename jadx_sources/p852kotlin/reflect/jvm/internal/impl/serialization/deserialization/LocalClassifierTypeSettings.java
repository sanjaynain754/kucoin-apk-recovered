package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: LocalClassifierTypeSettings.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface LocalClassifierTypeSettings {
    @Nullable
    SimpleType getReplacementTypeForLocalClassifiers();

    /* JADX INFO: compiled from: LocalClassifierTypeSettings.kt */
    public static final class Default implements LocalClassifierTypeSettings {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        @Nullable
        public SimpleType getReplacementTypeForLocalClassifiers() {
            return null;
        }

        private Default() {
        }
    }
}
