package p852kotlin.reflect.jvm.internal.impl.p409km;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class KmClassifier {

    /* JADX INFO: compiled from: Nodes.kt */
    public static final class Class extends KmClassifier {

        @NotNull
        private final String name;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Class) && Intrinsics.areEqual(this.name, ((Class) obj).name);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Class(name=" + this.name + ')';
        }
    }

    /* JADX INFO: compiled from: Nodes.kt */
    public static final class TypeAlias extends KmClassifier {

        @NotNull
        private final String name;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypeAlias) && Intrinsics.areEqual(this.name, ((TypeAlias) obj).name);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeAlias(@NotNull String name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "TypeAlias(name=" + this.name + ')';
        }
    }

    /* JADX INFO: compiled from: Nodes.kt */
    public static final class TypeParameter extends KmClassifier {

        /* JADX INFO: renamed from: id */
        private final int f91360id;

        public TypeParameter(int i11) {
            super(null);
            this.f91360id = i11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypeParameter) && this.f91360id == ((TypeParameter) obj).f91360id;
        }

        public final int getId() {
            return this.f91360id;
        }

        public int hashCode() {
            return Integer.hashCode(this.f91360id);
        }

        @NotNull
        public String toString() {
            return "TypeParameter(id=" + this.f91360id + ')';
        }
    }

    public /* synthetic */ KmClassifier(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KmClassifier() {
    }
}
