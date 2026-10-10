package p450m7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: m7.e */
/* JADX INFO: compiled from: JsonPOJOBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC42439e {

    /* JADX INFO: renamed from: m7.e$a */
    /* JADX INFO: compiled from: JsonPOJOBuilder.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final String f94063a;

        /* JADX INFO: renamed from: b */
        public final String f94064b;

        public a(InterfaceC42439e interfaceC42439e) {
            this(interfaceC42439e.buildMethodName(), interfaceC42439e.withPrefix());
        }

        public a(String str, String str2) {
            this.f94063a = str;
            this.f94064b = str2;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
