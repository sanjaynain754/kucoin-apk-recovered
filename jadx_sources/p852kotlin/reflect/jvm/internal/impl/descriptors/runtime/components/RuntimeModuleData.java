package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;

/* JADX INFO: compiled from: RuntimeModuleData.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class RuntimeModuleData {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final DeserializationComponents deserialization;

    @NotNull
    private final PackagePartScopeCache packagePartScopeCache;

    /* JADX INFO: compiled from: RuntimeModuleData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final RuntimeModuleData create(@NotNull ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(classLoader, "classLoader");
            ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoader);
            DeserializationComponentsForJava.Companion companion = DeserializationComponentsForJava.Companion;
            ClassLoader classLoader2 = Unit.class.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader2, "getClassLoader(...)");
            DeserializationComponentsForJava.Companion.ModuleData moduleDataCreateModuleData = companion.createModuleData(reflectKotlinClassFinder, new ReflectKotlinClassFinder(classLoader2), new ReflectJavaClassFinder(classLoader), "runtime module for " + classLoader, RuntimeErrorReporter.INSTANCE, RuntimeSourceElementFactory.INSTANCE);
            return new RuntimeModuleData(moduleDataCreateModuleData.getDeserializationComponentsForJava().getComponents(), new PackagePartScopeCache(moduleDataCreateModuleData.getDeserializedDescriptorResolver(), reflectKotlinClassFinder), null);
        }
    }

    public /* synthetic */ RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache, DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationComponents, packagePartScopeCache);
    }

    private RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache) {
        this.deserialization = deserializationComponents;
        this.packagePartScopeCache = packagePartScopeCache;
    }

    @NotNull
    public final DeserializationComponents getDeserialization() {
        return this.deserialization;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.deserialization.getModuleDescriptor();
    }

    @NotNull
    public final PackagePartScopeCache getPackagePartScopeCache() {
        return this.packagePartScopeCache;
    }
}
