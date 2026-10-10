package p852kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: JavaClassFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JavaClassFinder {

    /* JADX INFO: compiled from: JavaClassFinder.kt */
    public static final class Request {

        @NotNull
        private final ClassId classId;

        @Nullable
        private final JavaClass outerClass;

        @Nullable
        private final byte[] previouslyFoundClassFileContent;

        public Request(@NotNull ClassId classId, @Nullable byte[] bArr, @Nullable JavaClass javaClass) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.classId = classId;
            this.previouslyFoundClassFileContent = bArr;
            this.outerClass = javaClass;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.areEqual(this.classId, request.classId) && Intrinsics.areEqual(this.previouslyFoundClassFileContent, request.previouslyFoundClassFileContent) && Intrinsics.areEqual(this.outerClass, request.outerClass);
        }

        @NotNull
        public final ClassId getClassId() {
            return this.classId;
        }

        public int hashCode() {
            int iHashCode = this.classId.hashCode() * 31;
            byte[] bArr = this.previouslyFoundClassFileContent;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.outerClass;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(classId=" + this.classId + ", previouslyFoundClassFileContent=" + Arrays.toString(this.previouslyFoundClassFileContent) + ", outerClass=" + this.outerClass + ')';
        }

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i11 & 2) != 0 ? null : bArr, (i11 & 4) != 0 ? null : javaClass);
        }
    }

    @Nullable
    JavaClass findClass(@NotNull Request request);

    @Nullable
    JavaPackage findPackage(@NotNull FqName fqName, boolean z11);

    @Nullable
    Set<String> knownClassNamesInPackage(@NotNull FqName fqName);
}
