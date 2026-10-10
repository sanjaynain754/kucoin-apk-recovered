package tg0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p852kotlin.Metadata;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.annotation.MustBeDocumented;

/* JADX INFO: renamed from: tg0.o */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes61.dex */
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@MustBeDocumented
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, m90084d2 = {"Ltg0/o;", "", "Lkotlin/reflect/KClass;", "Ltg0/d;", "with", "<init>", "(Lkotlin/reflect/KClass;)V", "()Ljava/lang/Class;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC44962o {
    Class<? extends InterfaceC44951d<?>> with() default InterfaceC44951d.class;
}
