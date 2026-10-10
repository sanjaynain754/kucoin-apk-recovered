package com.facebook.imagepipeline.cache;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p712w3.InterfaceC45709i;
import p819z3.InterfaceC46674c;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.imagepipeline.cache.f */
/* JADX INFO: compiled from: MemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u00020\u0004:\u0001\rJ-\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH¦\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/imagepipeline/cache/f;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lz3/c;", "", "key", "La4/a;", "value", "e", "(Ljava/lang/Object;La4/a;)La4/a;", "get", "(Ljava/lang/Object;)La4/a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", "Lw3/i;", "predicate", "", "c", "(Lw3/i;)I", "", "f", "(Lw3/i;)Z", "contains", "(Ljava/lang/Object;)Z", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC5648f<K, V> extends InterfaceC46674c {

    /* JADX INFO: renamed from: com.facebook.imagepipeline.cache.f$a */
    /* JADX INFO: compiled from: MemoryCache.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"Lcom/facebook/imagepipeline/cache/f$a;", "", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface a {
    }

    /* JADX INFO: renamed from: a */
    void mo9156a(K key);

    /* JADX INFO: renamed from: c */
    int mo9157c(@NotNull InterfaceC45709i<K> predicate);

    boolean contains(K key);

    @Nullable
    /* JADX INFO: renamed from: e */
    AbstractC0110a<V> mo9158e(K key, @NotNull AbstractC0110a<V> value);

    /* JADX INFO: renamed from: f */
    boolean mo9159f(@NotNull InterfaceC45709i<K> predicate);

    @Nullable
    AbstractC0110a<V> get(K key);
}
