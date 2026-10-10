package p450m7;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: m7.d */
/* JADX INFO: compiled from: JsonNaming.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC42438d {
    Class<? extends PropertyNamingStrategy> value() default PropertyNamingStrategy.class;
}
