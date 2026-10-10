package p549q5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import org.jetbrains.annotations.NotNull;
import p547q3.InterfaceC43595a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: q5.n */
/* JADX INFO: compiled from: ImageCacheStatsTracker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00042\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0012H&¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lq5/n;", "", "Lq3/a;", "cacheKey", "", "i", "(Lq3/a;)V", "j", "b", "n", "e", "f", "g", "c", "d", "m", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/facebook/imagepipeline/cache/f;", "bitmapMemoryCache", "k", "(Lcom/facebook/imagepipeline/cache/f;)V", "encodedMemoryCache", CmcdData.Factory.STREAMING_FORMAT_HLS, "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC43625n {
    /* JADX INFO: renamed from: a */
    void mo96002a(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: b */
    void mo96003b(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: c */
    void mo96004c(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: d */
    void mo96005d(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: e */
    void mo96006e(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: f */
    void mo96007f(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: g */
    void mo96008g(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: h */
    void mo96009h(@NotNull InterfaceC5648f<?, ?> encodedMemoryCache);

    /* JADX INFO: renamed from: i */
    void mo96010i(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: j */
    void mo96011j(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: k */
    void mo96012k(@NotNull InterfaceC5648f<?, ?> bitmapMemoryCache);

    /* JADX INFO: renamed from: l */
    void mo96013l(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: m */
    void mo96014m(@NotNull InterfaceC43595a cacheKey);

    /* JADX INFO: renamed from: n */
    void mo96015n(@NotNull InterfaceC43595a cacheKey);
}
