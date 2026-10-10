package com.kubi.sdk.startup;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: StartupOption.kt */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.TYPE})
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000f\u0010\n\u001a\u00020\u000b¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\rR\u000f\u0010\b\u001a\u00020\t¢\u0006\u0006\u001a\u0004\b\b\u0010\u000eR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000fR\u000f\u0010\u0006\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupOption;", "", "name", "", "stepType", "Lcom/kubi/sdk/startup/StartupStepType;", "threadType", "Lcom/kubi/sdk/startup/StartupThreadType;", "priority", "", "crossProcess", "", "()Z", "()Ljava/lang/String;", "()I", "()Lcom/kubi/sdk/startup/StartupStepType;", "()Lcom/kubi/sdk/startup/StartupThreadType;", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@p852kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface StartupOption {
    boolean crossProcess() default false;

    String name();

    int priority() default 999;

    StartupStepType stepType();

    StartupThreadType threadType();
}
