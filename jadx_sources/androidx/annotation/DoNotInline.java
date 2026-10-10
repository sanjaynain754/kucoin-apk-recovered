package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: DoNotInline.jvm.kt */
/* JADX INFO: loaded from: classes23.dex */
@Target({ElementType.METHOD})
@Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Landroidx/annotation/DoNotInline;", "", "annotation"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
@Retention(RetentionPolicy.CLASS)
@p852kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface DoNotInline {
}
