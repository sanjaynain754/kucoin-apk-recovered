package p852kotlin.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.annotation.Repeatable;
import p852kotlin.jvm.internal.RepeatableContainer;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes61.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@SinceKotlin(version = "1.2")
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@p852kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\u0002\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\u00020\u0003B\u0004\b\b(\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\u00020\u0007B\u0006\b\n0\u00078\b\u0012\u0010\b\u0002\u0010\t\u001a\u00020\nB\u0006\b\n0\n8\u000b\u0012\u000e\b\u0002\u0010\f\u001a\u00020\rB\u0004\b\u0003\u0010\u0001R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u000eR\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000eR\u000f\u0010\u0006\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000fR\u000f\u0010\t\u001a\u00020\n¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010R\u000f\u0010\f\u001a\u00020\r¢\u0006\u0006\u001a\u0004\b\f\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lkotlin/internal/RequireKotlin;", "", "version", "", "message", "", FirebaseAnalytics.Param.LEVEL, "Lkotlin/DeprecationLevel;", "ERROR", "versionKind", "Lkotlin/internal/RequireKotlinVersionKind;", "LANGUAGE_VERSION", "errorCode", "", "()Ljava/lang/String;", "()Lkotlin/DeprecationLevel;", "()Lkotlin/internal/RequireKotlinVersionKind;", "()I", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
public @interface RequireKotlin {

    /* JADX INFO: compiled from: Annotations.kt */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
    @Retention(RetentionPolicy.SOURCE)
    @p852kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @RepeatableContainer
    public @interface Container {
        RequireKotlin[] value();
    }

    int errorCode() default -1;

    DeprecationLevel level() default DeprecationLevel.ERROR;

    String message() default "";

    String version();

    RequireKotlinVersionKind versionKind() default RequireKotlinVersionKind.LANGUAGE_VERSION;
}
