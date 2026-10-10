package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: ClassLiteralValue.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
public final class ClassLiteralValue {
    private final int arrayNestedness;

    @NotNull
    private final ClassId classId;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.areEqual(this.classId, classLiteralValue.classId) && this.arrayNestedness == classLiteralValue.arrayNestedness;
    }

    public ClassLiteralValue(@NotNull ClassId classId, int i11) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.classId = classId;
        this.arrayNestedness = i11;
    }

    @NotNull
    public final ClassId component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.classId;
    }

    public int hashCode() {
        return (this.classId.hashCode() * 31) + Integer.hashCode(this.arrayNestedness);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.arrayNestedness;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.classId);
        int i13 = this.arrayNestedness;
        for (int i14 = 0; i14 < i13; i14++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
