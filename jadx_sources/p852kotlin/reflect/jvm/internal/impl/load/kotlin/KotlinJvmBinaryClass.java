package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface KotlinJvmBinaryClass {

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface AnnotationArgumentVisitor {
        void visit(@Nullable Name name, @Nullable Object obj);

        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@Nullable Name name, @NotNull ClassId classId);

        @Nullable
        AnnotationArrayArgumentVisitor visitArray(@Nullable Name name);

        void visitClassLiteral(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue);

        void visitEnd();

        void visitEnum(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2);
    }

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface AnnotationArrayArgumentVisitor {
        void visit(@Nullable Object obj);

        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId);

        void visitClassLiteral(@NotNull ClassLiteralValue classLiteralValue);

        void visitEnd();

        void visitEnum(@NotNull ClassId classId, @NotNull Name name);
    }

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface AnnotationVisitor {
        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement);

        void visitEnd();
    }

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface MemberVisitor {
        @Nullable
        AnnotationVisitor visitField(@NotNull Name name, @NotNull String str, @Nullable Object obj);

        @Nullable
        MethodAnnotationVisitor visitMethod(@NotNull Name name, @NotNull String str);
    }

    /* JADX INFO: compiled from: KotlinJvmBinaryClass.kt */
    public interface MethodAnnotationVisitor extends AnnotationVisitor {
        @Nullable
        AnnotationArgumentVisitor visitParameterAnnotation(int i11, @NotNull ClassId classId, @NotNull SourceElement sourceElement);
    }

    @NotNull
    KotlinClassHeader getClassHeader();

    @NotNull
    ClassId getClassId();

    @NotNull
    String getLocation();

    void loadClassAnnotations(@NotNull AnnotationVisitor annotationVisitor, @Nullable byte[] bArr);

    void visitMembers(@NotNull MemberVisitor memberVisitor, @Nullable byte[] bArr);
}
