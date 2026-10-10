package p717w8;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: w8.b */
/* JADX INFO: compiled from: Factory.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0016\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lw8/b;", "Lretrofit2/Converter$Factory;", "Lokhttp3/MediaType;", "contentType", "Lw8/e;", "serializer", "<init>", "(Lokhttp3/MediaType;Lw8/e;)V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lretrofit2/Retrofit;", "retrofit", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "responseBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "parameterAnnotations", "methodAnnotations", "Lokhttp3/RequestBody;", "requestBodyConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lokhttp3/MediaType;", "b", "Lw8/e;", "retrofit2-kotlinx-serialization-converter"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45752b extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MediaType contentType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC45755e serializer;

    public C45752b(@NotNull MediaType contentType, @NotNull AbstractC45755e serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.contentType = contentType;
        this.serializer = serializer;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, RequestBody> requestBodyConverter(@NotNull Type type, @NotNull Annotation[] parameterAnnotations, @NotNull Annotation[] methodAnnotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new C45754d(this.contentType, this.serializer.serializer(type), this.serializer);
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(@NotNull Type type, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new C45751a(this.serializer.serializer(type), this.serializer);
    }
}
