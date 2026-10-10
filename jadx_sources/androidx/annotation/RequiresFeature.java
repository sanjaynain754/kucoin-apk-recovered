package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: RequiresFeature.kt */
/* JADX INFO: loaded from: classes23.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Landroidx/annotation/RequiresFeature;", "", "name", "", "enforcement", "()Ljava/lang/String;", "annotation"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
@p852kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface RequiresFeature {
    String enforcement();

    String name();
}
