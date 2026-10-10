package p852kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JavaDeprecatedAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    @NotNull
    private final NotNullLazyValue allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(@Nullable JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext c11) {
        super(c11, javaAnnotation, StandardNames.FqNames.deprecated);
        Intrinsics.checkNotNullParameter(c11, "c");
        this.allValueArguments$delegate = c11.getStorageManager().createLazyValue(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JavaDeprecatedAnnotationDescriptor.allValueArguments_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$0() {
        return MapsKt.mapOf(TuplesKt.m90091to(JavaAnnotationMapper.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm(), new StringValue("Deprecated in Java")));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }
}
