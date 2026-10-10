package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;

/* JADX INFO: compiled from: DeserializationConfiguration.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface DeserializationConfiguration {

    /* JADX INFO: compiled from: DeserializationConfiguration.kt */
    public static final class Default implements DeserializationConfiguration {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getAllowUnstableDependencies() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getPreserveDeclarationsOrdering() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getReportErrorsOnPreReleaseDependencies() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getSkipMetadataVersionCheck() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getSkipPrereleaseCheck() {
            return false;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getTypeAliasesAllowed() {
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        @NotNull
        public MetadataVersion getMetadataVersion() {
            return MetadataVersion.INSTANCE;
        }

        private Default() {
        }
    }

    boolean getAllowUnstableDependencies();

    @NotNull
    MetadataVersion getMetadataVersion();

    boolean getPreserveDeclarationsOrdering();

    boolean getReportErrorsOnPreReleaseDependencies();

    boolean getSkipMetadataVersionCheck();

    boolean getSkipPrereleaseCheck();

    boolean getTypeAliasesAllowed();
}
