package p852kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public class JavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    @Nullable
    private final JavaAnnotationArgument firstArgument;

    @NotNull
    private final FqName fqName;
    private final boolean isIdeExternalAnnotation;

    @NotNull
    private final SourceElement source;

    @NotNull
    private final NotNullLazyValue type$delegate;

    public JavaAnnotationDescriptor(@NotNull final LazyJavaResolverContext c11, @Nullable JavaAnnotation javaAnnotation, @NotNull FqName fqName) {
        SourceElement NO_SOURCE;
        Collection<JavaAnnotationArgument> arguments;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = fqName;
        if (javaAnnotation == null || (NO_SOURCE = c11.getComponents().getSourceElementFactory().source(javaAnnotation)) == null) {
            NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        }
        this.source = NO_SOURCE;
        this.type$delegate = c11.getStorageManager().createLazyValue(new Function0(c11, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$$Lambda$0
            private final LazyJavaResolverContext arg$0;
            private final JavaAnnotationDescriptor arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JavaAnnotationDescriptor.type_delegate$lambda$1(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = c11;
                this.arg$1 = this;
            }
        });
        this.firstArgument = (javaAnnotation == null || (arguments = javaAnnotation.getArguments()) == null) ? null : (JavaAnnotationArgument) CollectionsKt.firstOrNull(arguments);
        boolean z11 = false;
        if (javaAnnotation != null && javaAnnotation.isIdeExternalAnnotation()) {
            z11 = true;
        }
        this.isIdeExternalAnnotation = z11;
    }

    @Nullable
    public final JavaAnnotationArgument getFirstArgument() {
        return this.firstArgument;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        return this.source;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType type_delegate$lambda$1(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        SimpleType defaultType = lazyJavaResolverContext.getModule().getBuiltIns().getBuiltInClassByFqName(javaAnnotationDescriptor.getFqName()).getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return MapsKt.emptyMap();
    }
}
