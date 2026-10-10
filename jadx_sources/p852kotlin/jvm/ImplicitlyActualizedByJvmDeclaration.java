package p852kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Deprecated;
import p852kotlin.DeprecatedSinceKotlin;
import p852kotlin.ExperimentalMultiplatform;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.annotation.MustBeDocumented;

/* JADX INFO: compiled from: JvmPlatformAnnotations.kt */
/* JADX INFO: loaded from: classes61.dex */
@Target({ElementType.TYPE})
@ExperimentalMultiplatform
@SinceKotlin(version = "1.9")
@Deprecated(message = "Please migrate to kotlin.jvm.KotlinActual in kotlin-annotations-jvm. ImplicitlyActualizedByJvmDeclaration will be dropped in future versions of Kotlin. See https://youtrack.jetbrains.com/issue/KT-67202")
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@p852kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Lkotlin/jvm/ImplicitlyActualizedByJvmDeclaration;", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Documented
@DeprecatedSinceKotlin(errorSince = "2.1")
public @interface ImplicitlyActualizedByJvmDeclaration {
}
