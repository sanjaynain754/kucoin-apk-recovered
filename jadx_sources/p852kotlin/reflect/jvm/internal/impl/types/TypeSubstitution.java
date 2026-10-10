package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final TypeSubstitution EMPTY = new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$Companion$EMPTY$1
        public Void get(KotlinType key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        public boolean isEmpty() {
            return true;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* JADX INFO: renamed from: get, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ TypeProjection mo105131get(KotlinType kotlinType) {
            return (TypeProjection) get(kotlinType);
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    };

    /* JADX INFO: compiled from: TypeSubstitution.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: get */
    public abstract TypeProjection mo105131get(@NotNull KotlinType kotlinType);

    public boolean isEmpty() {
        return false;
    }

    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }

    @NotNull
    public final TypeSubstitution replaceWithNonApproximating() {
        return new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.replaceWithNonApproximating.1
            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateCapturedTypes() {
                return false;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return false;
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public Annotations filterAnnotations(Annotations annotations) {
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                return TypeSubstitution.this.filterAnnotations(annotations);
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: get */
            public TypeProjection mo105131get(KotlinType key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return TypeSubstitution.this.mo105131get(key);
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean isEmpty() {
                return TypeSubstitution.this.isEmpty();
            }

            @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public KotlinType prepareTopLevelType(KotlinType topLevelType, Variance position) {
                Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
                Intrinsics.checkNotNullParameter(position, "position");
                return TypeSubstitution.this.prepareTopLevelType(topLevelType, position);
            }
        };
    }

    @NotNull
    public final TypeSubstitutor buildSubstitutor() {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(this);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(...)");
        return typeSubstitutorCreate;
    }

    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType topLevelType, @NotNull Variance position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }
}
