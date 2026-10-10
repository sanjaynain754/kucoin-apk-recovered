package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,207:1\n37#2:208\n36#2,3:209\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n*L\n127#1:208\n127#1:209,3\n*E\n"})
public final class IndexedParametersSubstitution extends TypeSubstitution {
    private final boolean approximateContravariantCapturedTypes;

    @NotNull
    private final TypeProjection[] arguments;

    @NotNull
    private final TypeParameterDescriptor[] parameters;

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i11 & 4) != 0 ? false : z11);
    }

    public IndexedParametersSubstitution(@NotNull TypeParameterDescriptor[] parameters, @NotNull TypeProjection[] arguments, boolean z11) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.parameters = parameters;
        this.arguments = arguments;
        this.approximateContravariantCapturedTypes = z11;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.approximateContravariantCapturedTypes;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: get */
    public TypeProjection mo105131get(@NotNull KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = key.getConstructor().mo105126getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo105126getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        TypeParameterDescriptor[] typeParameterDescriptorArr = this.parameters;
        if (index >= typeParameterDescriptorArr.length || !Intrinsics.areEqual(typeParameterDescriptorArr[index].getTypeConstructor(), typeParameterDescriptor.getTypeConstructor())) {
            return null;
        }
        return this.arguments[index];
    }

    @NotNull
    public final TypeProjection[] getArguments() {
        return this.arguments;
    }

    @NotNull
    public final TypeParameterDescriptor[] getParameters() {
        return this.parameters;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.arguments.length == 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexedParametersSubstitution(@NotNull List<? extends TypeParameterDescriptor> parameters, @NotNull List<? extends TypeProjection> argumentsList) {
        this((TypeParameterDescriptor[]) parameters.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) argumentsList.toArray(new TypeProjection[0]), false, 4, null);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
    }
}
