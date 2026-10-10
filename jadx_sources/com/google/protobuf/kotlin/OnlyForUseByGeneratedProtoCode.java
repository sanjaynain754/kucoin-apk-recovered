package com.google.protobuf.kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.RequiresOptIn;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;

/* JADX INFO: compiled from: OnlyForUseByGeneratedProtoCode.kt */
/* JADX INFO: loaded from: classes56.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Lcom/google/protobuf/kotlin/OnlyForUseByGeneratedProtoCode;", "", "protobuf-kotlin-lite"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@RequiresOptIn(level = RequiresOptIn.Level.ERROR, message = "\n    This API is only intended for use by generated protobuf code, the code generator, and their own\n    tests.  If this does not describe your code, you should not be using this API.\n  ")
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CONSTRUCTOR, AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@p852kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface OnlyForUseByGeneratedProtoCode {
}
