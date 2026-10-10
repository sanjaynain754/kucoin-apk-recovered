package hr;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;

/* JADX INFO: renamed from: hr.b */
/* JADX INFO: compiled from: KCPeriod.kt */
/* JADX INFO: loaded from: classes12.dex */
@Target({ElementType.PARAMETER})
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\r"}, m90084d2 = {"Lhr/b;", "", "", "supportBackground", "promptlyRequest", "waitPeriodResult", "", "connectedPeriod", "disconnectPeriod", "<init>", "(ZZZII)V", "()Z", "()I", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@p852kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface InterfaceC38289b {
    int connectedPeriod() default Integer.MAX_VALUE;

    int disconnectPeriod() default 10;

    boolean promptlyRequest() default true;

    boolean supportBackground() default false;

    boolean waitPeriodResult() default false;
}
