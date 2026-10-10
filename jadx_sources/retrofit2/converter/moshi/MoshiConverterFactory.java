package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC27800f;
import com.squareup.moshi.C27809o;
import com.squareup.moshi.InterfaceC27802h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes61.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final C27809o moshi;
    private final boolean serializeNulls;

    public static MoshiConverterFactory create() {
        return create(new C27809o.a().m68741a());
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC27802h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    public static MoshiConverterFactory create(C27809o c27809o) {
        if (c27809o != null) {
            return new MoshiConverterFactory(c27809o, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        AbstractC27800f abstractC27800fM68738e = this.moshi.m68738e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            abstractC27800fM68738e = abstractC27800fM68738e.m68683c();
        }
        if (this.failOnUnknown) {
            abstractC27800fM68738e = abstractC27800fM68738e.m68682a();
        }
        if (this.serializeNulls) {
            abstractC27800fM68738e = abstractC27800fM68738e.m68685e();
        }
        return new MoshiRequestBodyConverter(abstractC27800fM68738e);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        AbstractC27800f abstractC27800fM68738e = this.moshi.m68738e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            abstractC27800fM68738e = abstractC27800fM68738e.m68683c();
        }
        if (this.failOnUnknown) {
            abstractC27800fM68738e = abstractC27800fM68738e.m68682a();
        }
        if (this.serializeNulls) {
            abstractC27800fM68738e = abstractC27800fM68738e.m68685e();
        }
        return new MoshiResponseBodyConverter(abstractC27800fM68738e);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    private MoshiConverterFactory(C27809o c27809o, boolean z11, boolean z12, boolean z13) {
        this.moshi = c27809o;
        this.lenient = z11;
        this.failOnUnknown = z12;
        this.serializeNulls = z13;
    }
}
