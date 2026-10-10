package p717w8;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import tg0.InterfaceC44963p;

/* JADX INFO: renamed from: w8.d */
/* JADX INFO: compiled from: SerializationStrategyConverter.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lw8/d;", ExifInterface.GPS_DIRECTION_TRUE, "Lretrofit2/Converter;", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "contentType", "Ltg0/p;", "saver", "Lw8/e;", "serializer", "<init>", "(Lokhttp3/MediaType;Ltg0/p;Lw8/e;)V", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", "b", "Ltg0/p;", "c", "Lw8/e;", "retrofit2-kotlinx-serialization-converter"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45754d<T> implements Converter<T, RequestBody> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MediaType contentType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44963p<T> saver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC45755e serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public C45754d(@NotNull MediaType contentType, @NotNull InterfaceC44963p<? super T> saver, @NotNull AbstractC45755e serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.contentType = contentType;
        this.saver = saver;
        this.serializer = serializer;
    }

    @Override // retrofit2.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T value) {
        return this.serializer.mo101011c(this.contentType, this.saver, value);
    }
}
