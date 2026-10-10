package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC27800f;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.ByteString;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes61.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final ByteString UTF8_BOM = ByteString.decodeHex("EFBBBF");
    private final AbstractC27800f<T> adapter;

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        BufferedSource source = responseBody.getSource();
        try {
            ByteString byteString = UTF8_BOM;
            if (source.rangeEquals(0L, byteString)) {
                source.skip(byteString.size());
            }
            JsonReader jsonReaderM68624u = JsonReader.m68624u(source);
            T tMo68666b = this.adapter.mo68666b(jsonReaderM68624u);
            if (jsonReaderM68624u.mo68644v() != JsonReader.Token.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return tMo68666b;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }

    public MoshiResponseBodyConverter(AbstractC27800f<T> abstractC27800f) {
        this.adapter = abstractC27800f;
    }
}
