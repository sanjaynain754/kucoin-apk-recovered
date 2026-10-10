package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: compiled from: JavaTypeAttributes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {

    @Nullable
    private final SimpleType defaultType;

    @NotNull
    private final JavaTypeFlexibility flexibility;

    @NotNull
    private final TypeUsage howThisTypeIsUsed;
    private final boolean isForAnnotationParameter;
    private final boolean isRaw;

    @Nullable
    private final Set<TypeParameterDescriptor> visitedTypeParameters;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z11, boolean z12, Set set, SimpleType simpleType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i11 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? null : set, (i11 & 32) != 0 ? null : simpleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z11, boolean z12, Set set, SimpleType simpleType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            typeUsage = javaTypeAttributes.howThisTypeIsUsed;
        }
        if ((i11 & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.flexibility;
        }
        if ((i11 & 4) != 0) {
            z11 = javaTypeAttributes.isRaw;
        }
        if ((i11 & 8) != 0) {
            z12 = javaTypeAttributes.isForAnnotationParameter;
        }
        if ((i11 & 16) != 0) {
            set = javaTypeAttributes.visitedTypeParameters;
        }
        if ((i11 & 32) != 0) {
            simpleType = javaTypeAttributes.defaultType;
        }
        Set set2 = set;
        SimpleType simpleType2 = simpleType;
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility, z11, z12, set2, simpleType2);
    }

    @NotNull
    public final JavaTypeAttributes copy(@NotNull TypeUsage howThisTypeIsUsed, @NotNull JavaTypeFlexibility flexibility, boolean z11, boolean z12, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new JavaTypeAttributes(howThisTypeIsUsed, flexibility, z11, z12, set, simpleType);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return Intrinsics.areEqual(javaTypeAttributes.getDefaultType(), getDefaultType()) && javaTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed() && javaTypeAttributes.flexibility == this.flexibility && javaTypeAttributes.isRaw == this.isRaw && javaTypeAttributes.isForAnnotationParameter == this.isForAnnotationParameter;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    public SimpleType getDefaultType() {
        return this.defaultType;
    }

    @NotNull
    public final JavaTypeFlexibility getFlexibility() {
        return this.flexibility;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    public TypeUsage getHowThisTypeIsUsed() {
        return this.howThisTypeIsUsed;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.visitedTypeParameters;
    }

    public final boolean isForAnnotationParameter() {
        return this.isForAnnotationParameter;
    }

    public final boolean isRaw() {
        return this.isRaw;
    }

    @NotNull
    public final JavaTypeAttributes markIsRaw(boolean z11) {
        return copy$default(this, null, null, z11, false, null, null, 59, null);
    }

    @NotNull
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.howThisTypeIsUsed + ", flexibility=" + this.flexibility + ", isRaw=" + this.isRaw + ", isForAnnotationParameter=" + this.isForAnnotationParameter + ", visitedTypeParameters=" + this.visitedTypeParameters + ", defaultType=" + this.defaultType + ')';
    }

    @NotNull
    public JavaTypeAttributes withDefaultType(@Nullable SimpleType simpleType) {
        return copy$default(this, null, null, false, false, null, simpleType, 31, null);
    }

    @NotNull
    public final JavaTypeAttributes withFlexibility(@NotNull JavaTypeFlexibility flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return copy$default(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    public JavaTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return copy$default(this, null, null, false, false, getVisitedTypeParameters() != null ? SetsKt.plus(getVisitedTypeParameters(), typeParameter) : SetsKt.setOf(typeParameter), null, 47, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeAttributes(@NotNull TypeUsage howThisTypeIsUsed, @NotNull JavaTypeFlexibility flexibility, boolean z11, boolean z12, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        super(howThisTypeIsUsed, set, simpleType);
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        this.howThisTypeIsUsed = howThisTypeIsUsed;
        this.flexibility = flexibility;
        this.isRaw = z11;
        this.isForAnnotationParameter = z12;
        this.visitedTypeParameters = set;
        this.defaultType = simpleType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        int iHashCode;
        SimpleType defaultType = getDefaultType();
        if (defaultType != null) {
            iHashCode = defaultType.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode2 = iHashCode + (iHashCode * 31) + getHowThisTypeIsUsed().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.flexibility.hashCode();
        int i11 = iHashCode3 + (iHashCode3 * 31) + (this.isRaw ? 1 : 0);
        return i11 + (i11 * 31) + (this.isForAnnotationParameter ? 1 : 0);
    }
}
