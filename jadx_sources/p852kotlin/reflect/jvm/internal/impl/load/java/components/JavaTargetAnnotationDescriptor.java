package p852kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaTargetAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JavaTargetAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    @NotNull
    private final NotNullLazyValue allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(@NotNull JavaAnnotation annotation, @NotNull LazyJavaResolverContext c11) {
        super(c11, annotation, StandardNames.FqNames.target);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c11, "c");
        this.allValueArguments$delegate = c11.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$$Lambda$0
            private final JavaTargetAnnotationDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JavaTargetAnnotationDescriptor.allValueArguments_delegate$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<Object>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$1(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        ConstantValue<?> constantValueMapJavaTargetArguments$descriptors_jvm;
        JavaAnnotationArgument firstArgument = javaTargetAnnotationDescriptor.getFirstArgument();
        Map mapMapOf = null;
        if (firstArgument instanceof JavaArrayAnnotationArgument) {
            constantValueMapJavaTargetArguments$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) javaTargetAnnotationDescriptor.getFirstArgument()).getElements());
        } else if (firstArgument instanceof JavaEnumValueAnnotationArgument) {
            constantValueMapJavaTargetArguments$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(CollectionsKt.listOf(javaTargetAnnotationDescriptor.getFirstArgument()));
        } else {
            constantValueMapJavaTargetArguments$descriptors_jvm = null;
        }
        if (constantValueMapJavaTargetArguments$descriptors_jvm != null) {
            mapMapOf = MapsKt.mapOf(TuplesKt.m90091to(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), constantValueMapJavaTargetArguments$descriptors_jvm));
        }
        if (mapMapOf == null) {
            return MapsKt.emptyMap();
        }
        return mapMapOf;
    }
}
