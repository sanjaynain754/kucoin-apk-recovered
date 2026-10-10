package coil.fetch;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import okhttp3.CacheControl;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;
import p679v0.InterfaceC45342d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpFetcher.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 \n*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcoil/fetch/HttpFetcher;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lv0/d;", "Lokhttp3/Call$Factory;", "callFactory", "<init>", "(Lokhttp3/Call$Factory;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lokhttp3/Call$Factory;", "b", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class HttpFetcher<T> implements InterfaceC45342d<T> {

    /* JADX INFO: renamed from: c */
    public static final CacheControl f5778c = new CacheControl.Builder().noCache().noStore().build();

    /* JADX INFO: renamed from: d */
    public static final CacheControl f5779d = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Call.Factory callFactory;

    public HttpFetcher(@NotNull Call.Factory callFactory) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        this.callFactory = callFactory;
    }
}
