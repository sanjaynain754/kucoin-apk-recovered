package com.jumio.core.model;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\b\u0002\u0010\u0002\u001a\u00020\u0003B\u0004\b\u0007\u0010\u0002R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/jumio/core/model/InvokeOnUiThread;", "", "value", "", "()Z", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@p852kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface InvokeOnUiThread {
    boolean value() default true;
}
