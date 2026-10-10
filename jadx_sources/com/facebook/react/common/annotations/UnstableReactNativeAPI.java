package com.facebook.react.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.RequiresOptIn;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: UnstableReactNativeAPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Lcom/facebook/react/common/annotations/UnstableReactNativeAPI;", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@RequiresOptIn(level = RequiresOptIn.Level.ERROR, message = "This API is experimental and is likely to change or to be removed in the future")
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.RUNTIME)
@p852kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface UnstableReactNativeAPI {
}
