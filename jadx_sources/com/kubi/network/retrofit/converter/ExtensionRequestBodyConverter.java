package com.kubi.network.retrofit.converter;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.google.api.client.json.Json;
import com.kubi.utils.C27099x;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.Converter;

/* JADX INFO: compiled from: ExtensionRequestBodyConverter.kt */
/* JADX INFO: loaded from: classes64.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\bB\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/network/retrofit/converter/ExtensionRequestBodyConverter;", ExifInterface.GPS_DIRECTION_TRUE, "Lretrofit2/Converter;", "Lokhttp3/RequestBody;", "()V", "convert", "value", "(Ljava/lang/Object;)Lokhttp3/RequestBody;", "Companion", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ExtensionRequestBodyConverter<T> implements Converter<T, RequestBody> {

    @NotNull
    private static final MediaType MEDIA_TYPE = MediaType.INSTANCE.get(Json.MEDIA_TYPE);

    @Override // retrofit2.Converter
    @NotNull
    public RequestBody convert(T value) {
        return RequestBody.INSTANCE.create(C27099x.m66918h(value, false), MEDIA_TYPE);
    }
}
