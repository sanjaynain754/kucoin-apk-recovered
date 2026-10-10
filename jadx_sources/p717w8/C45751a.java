package p717w8;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import tg0.InterfaceC44949c;

/* JADX INFO: renamed from: w8.a */
/* JADX INFO: compiled from: DeserializationStrategyConverter.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lw8/a;", ExifInterface.GPS_DIRECTION_TRUE, "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "Ltg0/c;", "loader", "Lw8/e;", "serializer", "<init>", "(Ltg0/c;Lw8/e;)V", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Ltg0/c;", "b", "Lw8/e;", "retrofit2-kotlinx-serialization-converter"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45751a<T> implements Converter<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44949c<T> loader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC45755e serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public C45751a(@NotNull InterfaceC44949c<? extends T> loader, @NotNull AbstractC45755e serializer) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.loader = loader;
        this.serializer = serializer;
    }

    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(@NotNull ResponseBody value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (T) this.serializer.mo101009a(this.loader, value);
    }
}
