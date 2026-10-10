package p852kotlin.experimental;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.RequiresOptIn;
import p852kotlin.SinceKotlin;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.annotation.MustBeDocumented;

/* JADX INFO: compiled from: ExperimentalObjCName.kt */
/* JADX INFO: loaded from: classes61.dex */
@Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin(version = "1.8")
@RequiresOptIn
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@p852kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Lkotlin/experimental/ExperimentalObjCName;", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Documented
public @interface ExperimentalObjCName {
}
