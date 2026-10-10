package p852kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FqName.kt */
/* JADX INFO: loaded from: classes23.dex */
@SourceDebugExtension({"SMAP\nFqName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqName.kt\norg/jetbrains/kotlin/name/FqName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
public final class FqName {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final FqName ROOT = new FqName("");

    @NotNull
    private final FqNameUnsafe fqName;

    @Nullable
    private transient FqName parent;

    /* JADX INFO: compiled from: FqName.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final FqName topLevel(@NotNull Name shortName) {
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            return new FqName(FqNameUnsafe.Companion.topLevel(shortName));
        }
    }

    public FqName(@NotNull String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = new FqNameUnsafe(fqName, this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && Intrinsics.areEqual(this.fqName, ((FqName) obj).fqName);
    }

    @NotNull
    public final String asString() {
        return this.fqName.asString();
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.isRoot();
    }

    @NotNull
    public final FqName parent() {
        FqName fqName = this.parent;
        if (fqName != null) {
            return fqName;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        FqName fqName2 = new FqName(this.fqName.parent());
        this.parent = fqName2;
        return fqName2;
    }

    @NotNull
    public final List<Name> pathSegments() {
        return this.fqName.pathSegments();
    }

    @NotNull
    public final Name shortName() {
        return this.fqName.shortName();
    }

    @NotNull
    public final Name shortNameOrSpecial() {
        return this.fqName.shortNameOrSpecial();
    }

    @NotNull
    public String toString() {
        return this.fqName.toString();
    }

    @NotNull
    public final FqNameUnsafe toUnsafe() {
        return this.fqName;
    }

    public FqName(@NotNull FqNameUnsafe fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = fqName;
    }

    @NotNull
    public final FqName child(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new FqName(this.fqName.child(name), this);
    }

    public final boolean startsWith(@NotNull Name segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        return this.fqName.startsWith(segment);
    }

    private FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.fqName = fqNameUnsafe;
        this.parent = fqName;
    }
}
