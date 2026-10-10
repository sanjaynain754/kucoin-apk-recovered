package p852kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinVersion;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaTypeEnhancementState {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean disabledDefaultAnnotations;

    @NotNull
    private final Function1<FqName, ReportLevel> getReportLevelForAnnotation;

    @NotNull
    private final Jsr305Settings jsr305;

    /* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReportLevel getDefault$lambda$0(KotlinVersion kotlinVersion, FqName it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(it, kotlinVersion);
        }

        @NotNull
        public final JavaTypeEnhancementState getDefault(@NotNull final KotlinVersion kotlinVersion) {
            Intrinsics.checkNotNullParameter(kotlinVersion, "kotlinVersion");
            return new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings(kotlinVersion), new Function1(kotlinVersion) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState$Companion$$Lambda$0
                private final KotlinVersion arg$0;

                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return JavaTypeEnhancementState.Companion.getDefault$lambda$0(this.arg$0, (FqName) obj);
                }

                {
                    this.arg$0 = kotlinVersion;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(@NotNull Jsr305Settings jsr305, @NotNull Function1<? super FqName, ? extends ReportLevel> getReportLevelForAnnotation) {
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.jsr305 = jsr305;
        this.getReportLevelForAnnotation = getReportLevelForAnnotation;
        this.disabledDefaultAnnotations = jsr305.isDisabled() || getReportLevelForAnnotation.invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.IGNORE;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.disabledDefaultAnnotations;
    }

    @NotNull
    public final Function1<FqName, ReportLevel> getGetReportLevelForAnnotation() {
        return this.getReportLevelForAnnotation;
    }

    @NotNull
    public final Jsr305Settings getJsr305() {
        return this.jsr305;
    }

    @NotNull
    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.jsr305 + ", getReportLevelForAnnotation=" + this.getReportLevelForAnnotation + ')';
    }
}
