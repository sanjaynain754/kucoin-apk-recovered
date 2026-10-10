package p717w8;

import androidx.media3.exoplayer.upstream.CmcdData;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import tg0.InterfaceC44950c0;

/* JADX INFO: renamed from: w8.c */
/* JADX INFO: compiled from: Factory.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Ltg0/c0;", "Lokhttp3/MediaType;", "contentType", "Lretrofit2/Converter$Factory;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ltg0/c0;Lokhttp3/MediaType;)Lretrofit2/Converter$Factory;", "retrofit2-kotlinx-serialization-converter"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmName(name = "KotlinSerializationConverterFactory")
public final class C45753c {
    @JvmName(name = "create")
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Converter.Factory m101007a(@NotNull InterfaceC44950c0 interfaceC44950c0, @NotNull MediaType contentType) {
        Intrinsics.checkNotNullParameter(interfaceC44950c0, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new C45752b(contentType, new AbstractC45755e.a(interfaceC44950c0));
    }
}
