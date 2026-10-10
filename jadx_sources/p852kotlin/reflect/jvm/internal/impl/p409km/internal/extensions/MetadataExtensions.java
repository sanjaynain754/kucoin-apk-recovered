package p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions;

import java.util.List;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmClass;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmConstructor;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmEnumEntry;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmFunction;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmProperty;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmType;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeAlias;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmValueParameter;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.ReadContext;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.WriteContext;

/* JADX INFO: compiled from: MetadataExtensions.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface MetadataExtensions {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: MetadataExtensions.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Lazy<List<MetadataExtensions>> INSTANCES$delegate = LazyKt.lazy(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions$Companion$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return MetadataExtensions.Companion.INSTANCES_delegate$lambda$1();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final List INSTANCES_delegate$lambda$1() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(MetadataExtensions.class, MetadataExtensions.class.getClassLoader());
            Intrinsics.checkNotNullExpressionValue(serviceLoaderLoad, "load(...)");
            List list = CollectionsKt.toList(serviceLoaderLoad);
            if (list.isEmpty()) {
                throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
            return list;
        }

        @NotNull
        public final List<MetadataExtensions> getINSTANCES$kotlin_metadata() {
            return INSTANCES$delegate.getValue();
        }

        private Companion() {
        }
    }

    @NotNull
    KmClassExtension createClassExtension();

    @NotNull
    KmConstructorExtension createConstructorExtension();

    @Nullable
    KmEnumEntryExtension createEnumEntryExtension();

    @NotNull
    KmFunctionExtension createFunctionExtension();

    @NotNull
    KmPropertyExtension createPropertyExtension();

    @Nullable
    KmTypeAliasExtension createTypeAliasExtension();

    @NotNull
    KmTypeExtension createTypeExtension();

    @NotNull
    KmTypeParameterExtension createTypeParameterExtension();

    @Nullable
    KmValueParameterExtension createValueParameterExtension();

    void readClassExtensions(@NotNull KmClass kmClass, @NotNull ProtoBuf.Class r11, @NotNull ReadContext readContext);

    void readConstructorExtensions(@NotNull KmConstructor kmConstructor, @NotNull ProtoBuf.Constructor constructor, @NotNull ReadContext readContext);

    void readEnumEntryExtensions(@NotNull KmEnumEntry kmEnumEntry, @NotNull ProtoBuf.EnumEntry enumEntry, @NotNull ReadContext readContext);

    void readFunctionExtensions(@NotNull KmFunction kmFunction, @NotNull ProtoBuf.Function function, @NotNull ReadContext readContext);

    void readPropertyExtensions(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property property, @NotNull ReadContext readContext);

    void readTypeAliasExtensions(@NotNull KmTypeAlias kmTypeAlias, @NotNull ProtoBuf.TypeAlias typeAlias, @NotNull ReadContext readContext);

    void readTypeExtensions(@NotNull KmType kmType, @NotNull ProtoBuf.Type type, @NotNull ReadContext readContext);

    void readTypeParameterExtensions(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter typeParameter, @NotNull ReadContext readContext);

    void readValueParameterExtensions(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter valueParameter, @NotNull ReadContext readContext);

    void writePropertyExtensions(@NotNull KmProperty kmProperty, @NotNull ProtoBuf.Property.Builder builder, @NotNull WriteContext writeContext);

    void writeTypeExtensions(@NotNull KmType kmType, @NotNull ProtoBuf.Type.Builder builder, @NotNull WriteContext writeContext);

    void writeTypeParameterExtensions(@NotNull KmTypeParameter kmTypeParameter, @NotNull ProtoBuf.TypeParameter.Builder builder, @NotNull WriteContext writeContext);

    void writeValueParameterExtensions(@NotNull KmValueParameter kmValueParameter, @NotNull ProtoBuf.ValueParameter.Builder builder, @NotNull WriteContext writeContext);
}
