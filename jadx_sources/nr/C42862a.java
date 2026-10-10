package nr;

import androidx.annotation.NonNull;
import com.kubi.network.retrofit.converter.ExtensionRequestBodyConverter;
import com.kubi.network.retrofit.converter.ExtensionResponseBodyConverter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: nr.a */
/* JADX INFO: compiled from: ExtensionConverterFactory.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C42862a extends Converter.Factory {
    /* JADX INFO: renamed from: a */
    public static C42862a m94007a() {
        return new C42862a();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(@NonNull Type type, @NonNull Annotation[] annotationArr, @NonNull Annotation[] annotationArr2, @NonNull Retrofit retrofit) {
        return new ExtensionRequestBodyConverter();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(@NonNull Type type, @NonNull Annotation[] annotationArr, @NonNull Retrofit retrofit) {
        return new ExtensionResponseBodyConverter(type);
    }
}
