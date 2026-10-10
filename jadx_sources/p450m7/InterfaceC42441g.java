package p450m7;

import com.fasterxml.jackson.databind.jsontype.InterfaceC6430d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: m7.g */
/* JADX INFO: compiled from: JsonTypeResolver.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC42441g {
    Class<? extends InterfaceC6430d<?>> value();
}
