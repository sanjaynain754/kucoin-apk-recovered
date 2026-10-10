package p852kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.jvm.JvmName;

/* JADX INFO: compiled from: SerializedIr.kt */
/* JADX INFO: loaded from: classes61.dex */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.6")
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0002\b\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lkotlin/jvm/internal/SerializedIr;", "", "bytes", "", "", "b", "()[Ljava/lang/String;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@p852kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface SerializedIr {
    @JvmName(name = "b")
    /* JADX INFO: renamed from: b */
    String[] m90230b() default {};
}
