package p617s5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: s5.b */
/* JADX INFO: compiled from: DiskCachesStore.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Ls5/b;", "", "Lcom/facebook/imagepipeline/cache/BufferedDiskCache;", "b", "()Lcom/facebook/imagepipeline/cache/BufferedDiskCache;", "mainBufferedDiskCache", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "smallImageBufferedDiskCache", "Lcom/facebook/common/internal/ImmutableMap;", "", "c", "()Lcom/facebook/common/internal/ImmutableMap;", "dynamicBufferedDiskCaches", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC44317b {
    @NotNull
    /* JADX INFO: renamed from: a */
    BufferedDiskCache mo97778a();

    @NotNull
    /* JADX INFO: renamed from: b */
    BufferedDiskCache mo97779b();

    @NotNull
    /* JADX INFO: renamed from: c */
    ImmutableMap<String, BufferedDiskCache> mo97780c();
}
