package p450m7;

import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: m7.c */
/* JADX INFO: compiled from: JsonDeserialize.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC42437c {
    /* JADX INFO: renamed from: as */
    Class<?> m93161as() default Void.class;

    Class<?> builder() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends InterfaceC6491h> contentConverter() default InterfaceC6491h.a.class;

    Class<? extends AbstractC6390e> contentUsing() default AbstractC6390e.a.class;

    Class<? extends InterfaceC6491h> converter() default InterfaceC6491h.a.class;

    Class<?> keyAs() default Void.class;

    Class<? extends AbstractC6394i> keyUsing() default AbstractC6394i.a.class;

    Class<? extends AbstractC6390e> using() default AbstractC6390e.a.class;
}
