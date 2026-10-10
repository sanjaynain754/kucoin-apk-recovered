package p852kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: BuiltInAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    @NotNull
    private final Map<Name, ConstantValue<?>> allValueArguments;

    @NotNull
    private final KotlinBuiltIns builtIns;
    private final boolean forcePropagationDeprecationToOverrides;

    @NotNull
    private final FqName fqName;

    @NotNull
    private final Lazy type$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(@NotNull KotlinBuiltIns builtIns, @NotNull FqName fqName, @NotNull Map<Name, ? extends ConstantValue<?>> allValueArguments, boolean z11) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.builtIns = builtIns;
        this.fqName = fqName;
        this.allValueArguments = allValueArguments;
        this.forcePropagationDeprecationToOverrides = z11;
        this.type$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor$$Lambda$0
            private final BuiltInAnnotationDescriptor arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return BuiltInAnnotationDescriptor.type_delegate$lambda$0(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType type_delegate$lambda$0(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        return builtInAnnotationDescriptor.builtIns.getBuiltInClassByFqName(builtInAnnotationDescriptor.getFqName()).getDefaultType();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return this.allValueArguments;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        Object value = this.type$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i11 & 8) != 0 ? false : z11);
    }
}
