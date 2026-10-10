package com.facebook.imagepipeline.cache;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p547q3.InterfaceC43595a;
import p549q5.C43628q;
import p712w3.InterfaceC45711k;
import p749x5.InterfaceC46071e;
import p819z3.InterfaceC46675d;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.imagepipeline.cache.a */
/* JADX INFO: compiled from: BitmapMemoryCacheFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001JY\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/imagepipeline/cache/a;", "", "Lw3/k;", "Lq5/q;", "bitmapMemoryCacheParamsSupplier", "Lz3/d;", "memoryTrimmableRegistry", "Lcom/facebook/imagepipeline/cache/f$a;", "trimStrategy", "", "storeEntrySize", "ignoreSizeMismatch", "Lcom/facebook/imagepipeline/cache/c$b;", "Lq3/a;", "observer", "Lcom/facebook/imagepipeline/cache/c;", "Lx5/e;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lw3/k;Lz3/d;Lcom/facebook/imagepipeline/cache/f$a;ZZLcom/facebook/imagepipeline/cache/c$b;)Lcom/facebook/imagepipeline/cache/c;", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC5643a {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> mo9141a(@NotNull InterfaceC45711k<C43628q> bitmapMemoryCacheParamsSupplier, @NotNull InterfaceC46675d memoryTrimmableRegistry, @NotNull InterfaceC5648f.a trimStrategy, boolean storeEntrySize, boolean ignoreSizeMismatch, @Nullable InterfaceC5645c.b<InterfaceC43595a> observer);
}
