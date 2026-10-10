package p852kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinVersion;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJavaNullabilityAnnotationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaNullabilityAnnotationSettings.kt\norg/jetbrains/kotlin/load/java/JavaNullabilityAnnotationSettingsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
public final class JavaNullabilityAnnotationSettingsKt {

    @NotNull
    private static final FqName CHECKER_FRAMEWORK_COMPATQUAL_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final FqName JSPECIFY_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final FqName JSPECIFY_OLD_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final JavaNullabilityAnnotationsStatus JSR_305_DEFAULT_SETTINGS;

    @NotNull
    private static final NullabilityAnnotationStates<JavaNullabilityAnnotationsStatus> NULLABILITY_ANNOTATION_SETTINGS;

    @NotNull
    private static final FqName[] RXJAVA3_ANNOTATIONS;

    @NotNull
    private static final FqName RXJAVA3_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final String RXJAVA3_ANNOTATIONS_PACKAGE_NAME;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        JSPECIFY_OLD_ANNOTATIONS_PACKAGE = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        JSPECIFY_ANNOTATIONS_PACKAGE = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        RXJAVA3_ANNOTATIONS_PACKAGE = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        CHECKER_FRAMEWORK_COMPATQUAL_ANNOTATIONS_PACKAGE = fqName4;
        String strAsString = fqName3.asString();
        RXJAVA3_ANNOTATIONS_PACKAGE_NAME = strAsString;
        RXJAVA3_ANNOTATIONS = new FqName[]{new FqName(strAsString + ".Nullable"), new FqName(strAsString + ".NonNull")};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair pairM90091to = TuplesKt.m90091to(fqName5, companion.getDEFAULT());
        Pair pairM90091to2 = TuplesKt.m90091to(new FqName("androidx.annotation"), companion.getDEFAULT());
        Pair pairM90091to3 = TuplesKt.m90091to(new FqName("android.support.annotation"), companion.getDEFAULT());
        Pair pairM90091to4 = TuplesKt.m90091to(new FqName("android.annotation"), companion.getDEFAULT());
        Pair pairM90091to5 = TuplesKt.m90091to(new FqName("com.android.annotations"), companion.getDEFAULT());
        Pair pairM90091to6 = TuplesKt.m90091to(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        Pair pairM90091to7 = TuplesKt.m90091to(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        Pair pairM90091to8 = TuplesKt.m90091to(fqName4, companion.getDEFAULT());
        Pair pairM90091to9 = TuplesKt.m90091to(new FqName("javax.annotation"), companion.getDEFAULT());
        Pair pairM90091to10 = TuplesKt.m90091to(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        Pair pairM90091to11 = TuplesKt.m90091to(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pairM90091to12 = TuplesKt.m90091to(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairM90091to13 = TuplesKt.m90091to(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairM90091to14 = TuplesKt.m90091to(new FqName("lombok"), companion.getDEFAULT());
        KotlinVersion kotlinVersion = new KotlinVersion(2, 1);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        NULLABILITY_ANNOTATION_SETTINGS = new NullabilityAnnotationStatesImpl(MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, pairM90091to6, pairM90091to7, pairM90091to8, pairM90091to9, pairM90091to10, pairM90091to11, pairM90091to12, pairM90091to13, pairM90091to14, TuplesKt.m90091to(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), TuplesKt.m90091to(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 1), reportLevel2)), TuplesKt.m90091to(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8), reportLevel2)), TuplesKt.m90091to(new FqName("jakarta.annotation"), new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 4), reportLevel2))));
        JSR_305_DEFAULT_SETTINGS = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    @NotNull
    public static final Jsr305Settings getDefaultJsr305Settings(@NotNull KotlinVersion configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = JSR_305_DEFAULT_SETTINGS;
        ReportLevel reportLevelBefore = (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(configuredKotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
        return new Jsr305Settings(reportLevelBefore, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevelBefore), null, 4, null);
    }

    @Nullable
    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(@NotNull ReportLevel globalReportLevel) {
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    @NotNull
    public static final ReportLevel getDefaultReportLevelForAnnotation(@NotNull FqName annotationFqName, @NotNull KotlinVersion configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(annotationFqName, "annotationFqName");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        return getReportLevelForAnnotation(annotationFqName, NullabilityAnnotationStates.Companion.getEMPTY(), configuredKotlinVersion);
    }

    @NotNull
    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return JSPECIFY_ANNOTATIONS_PACKAGE;
    }

    @NotNull
    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return RXJAVA3_ANNOTATIONS;
    }

    @NotNull
    public static final ReportLevel getReportLevelForAnnotation(@NotNull FqName annotation, @NotNull NullabilityAnnotationStates<? extends ReportLevel> configuredReportLevels, @NotNull KotlinVersion configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevel = configuredReportLevels.get(annotation);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = NULLABILITY_ANNOTATION_SETTINGS.get(annotation);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        return (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(configuredKotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
    }
}
