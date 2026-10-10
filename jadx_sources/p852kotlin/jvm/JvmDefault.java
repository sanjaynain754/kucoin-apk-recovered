package p852kotlin.jvm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: JvmDefault.kt */
/* JADX INFO: loaded from: classes61.dex */
@Target({ElementType.METHOD})
@SinceKotlin(version = "1.2")
@Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Lkotlin/jvm/JvmDefault;", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "Switch to new -jvm-default modes: `enable` or `no-compatibility`")
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.RUNTIME)
public @interface JvmDefault {
}
