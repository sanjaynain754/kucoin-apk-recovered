package com.kubi.restful;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;

/* JADX INFO: renamed from: com.kubi.restful.j */
/* JADX INFO: compiled from: RQuery.kt */
/* JADX INFO: loaded from: classes12.dex */
@Target({ElementType.METHOD})
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/restful/j;", "", "", "key", "default", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.RUNTIME)
@p852kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface InterfaceC23194j {
    /* JADX INFO: renamed from: default, reason: not valid java name */
    String m103799default() default "";

    String key();
}
