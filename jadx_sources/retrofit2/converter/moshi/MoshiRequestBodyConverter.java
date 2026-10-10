package retrofit2.converter.moshi;

import com.google.api.client.json.Json;
import com.squareup.moshi.AbstractC27800f;
import com.squareup.moshi.AbstractC27807m;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes61.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get(Json.MEDIA_TYPE);
    private final AbstractC27800f<T> adapter;

    @Override // retrofit2.Converter
    public RequestBody convert(T t11) throws IOException {
        Buffer buffer = new Buffer();
        this.adapter.mo68667f(AbstractC27807m.m68722n(buffer), t11);
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString());
    }

    public MoshiRequestBodyConverter(AbstractC27800f<T> abstractC27800f) {
        this.adapter = abstractC27800f;
    }
}
