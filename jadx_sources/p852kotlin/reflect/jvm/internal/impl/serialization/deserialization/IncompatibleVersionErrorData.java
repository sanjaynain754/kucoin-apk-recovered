package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IncompatibleVersionErrorData.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;
    private final T compilerVersion;
    private final T expectedVersion;

    @NotNull
    private final String filePath;
    private final T languageVersion;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual(this.actualVersion, incompatibleVersionErrorData.actualVersion) && Intrinsics.areEqual(this.compilerVersion, incompatibleVersionErrorData.compilerVersion) && Intrinsics.areEqual(this.languageVersion, incompatibleVersionErrorData.languageVersion) && Intrinsics.areEqual(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && Intrinsics.areEqual(this.filePath, incompatibleVersionErrorData.filePath);
    }

    public IncompatibleVersionErrorData(T t11, T t12, T t13, T t14, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.actualVersion = t11;
        this.compilerVersion = t12;
        this.languageVersion = t13;
        this.expectedVersion = t14;
        this.filePath = filePath;
    }

    public int hashCode() {
        T t11 = this.actualVersion;
        int iHashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.compilerVersion;
        int iHashCode2 = (iHashCode + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.languageVersion;
        int iHashCode3 = (iHashCode2 + (t13 == null ? 0 : t13.hashCode())) * 31;
        T t14 = this.expectedVersion;
        return ((iHashCode3 + (t14 != null ? t14.hashCode() : 0)) * 31) + this.filePath.hashCode();
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.actualVersion + ", compilerVersion=" + this.compilerVersion + ", languageVersion=" + this.languageVersion + ", expectedVersion=" + this.expectedVersion + ", filePath=" + this.filePath + ')';
    }
}
