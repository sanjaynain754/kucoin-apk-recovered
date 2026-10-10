package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: typeQualifiers.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaTypeQualifiers {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final JavaTypeQualifiers NONE = new JavaTypeQualifiers(null, null, false, false, 8, null);
    private final boolean definitelyNotNull;
    private final boolean isNullabilityQualifierForWarning;

    @Nullable
    private final MutabilityQualifier mutability;

    @Nullable
    private final NullabilityQualifier nullability;

    /* JADX INFO: compiled from: typeQualifiers.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.NONE;
        }
    }

    public JavaTypeQualifiers(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12) {
        this.nullability = nullabilityQualifier;
        this.mutability = mutabilityQualifier;
        this.definitelyNotNull = z11;
        this.isNullabilityQualifierForWarning = z12;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj;
        return this.nullability == javaTypeQualifiers.nullability && this.mutability == javaTypeQualifiers.mutability && this.definitelyNotNull == javaTypeQualifiers.definitelyNotNull && this.isNullabilityQualifierForWarning == javaTypeQualifiers.isNullabilityQualifierForWarning;
    }

    public static /* synthetic */ JavaTypeQualifiers copy$default(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.nullability;
        }
        if ((i11 & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.mutability;
        }
        if ((i11 & 4) != 0) {
            z11 = javaTypeQualifiers.definitelyNotNull;
        }
        if ((i11 & 8) != 0) {
            z12 = javaTypeQualifiers.isNullabilityQualifierForWarning;
        }
        return javaTypeQualifiers.copy(nullabilityQualifier, mutabilityQualifier, z11, z12);
    }

    @NotNull
    public final JavaTypeQualifiers copy(@Nullable NullabilityQualifier nullabilityQualifier, @Nullable MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12) {
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z11, z12);
    }

    public final boolean getDefinitelyNotNull() {
        return this.definitelyNotNull;
    }

    @Nullable
    public final MutabilityQualifier getMutability() {
        return this.mutability;
    }

    @Nullable
    public final NullabilityQualifier getNullability() {
        return this.nullability;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.nullability;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.mutability;
        return ((((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + Boolean.hashCode(this.definitelyNotNull)) * 31) + Boolean.hashCode(this.isNullabilityQualifierForWarning);
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.isNullabilityQualifierForWarning;
    }

    @NotNull
    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.nullability + ", mutability=" + this.mutability + ", definitelyNotNull=" + this.definitelyNotNull + ", isNullabilityQualifierForWarning=" + this.isNullabilityQualifierForWarning + ')';
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z11, (i11 & 8) != 0 ? false : z12);
    }
}
