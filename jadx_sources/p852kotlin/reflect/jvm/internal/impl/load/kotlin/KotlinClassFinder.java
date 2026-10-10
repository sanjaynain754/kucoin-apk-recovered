package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    /* JADX INFO: compiled from: KotlinClassFinder.kt */
    public static abstract class Result {

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class ClassFileContent extends Result {

            @NotNull
            private final byte[] content;

            @NotNull
            public final byte[] getContent() {
                return this.content;
            }
        }

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class KotlinClass extends Result {

            @Nullable
            private final byte[] byteContent;

            @NotNull
            private final KotlinJvmBinaryClass kotlinJvmBinaryClass;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @Nullable byte[] bArr) {
                super(null);
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.kotlinJvmBinaryClass = kotlinJvmBinaryClass;
                this.byteContent = bArr;
            }

            public /* synthetic */ KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass, (i11 & 2) != 0 ? null : bArr);
            }

            @NotNull
            public final KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.kotlinJvmBinaryClass;
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }

        @Nullable
        public final KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            KotlinClass kotlinClass = this instanceof KotlinClass ? (KotlinClass) this : null;
            if (kotlinClass != null) {
                return kotlinClass.getKotlinJvmBinaryClass();
            }
            return null;
        }
    }

    @Nullable
    Result findKotlinClassOrContent(@NotNull JavaClass javaClass, @NotNull MetadataVersion metadataVersion);

    @Nullable
    Result findKotlinClassOrContent(@NotNull ClassId classId, @NotNull MetadataVersion metadataVersion);
}
