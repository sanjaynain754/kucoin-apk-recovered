package com.otaliastudios.transcoder.internal.codec;

import android.view.Surface;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.f */
/* JADX INFO: compiled from: Encoder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/f;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "Lkotlin/Pair;", "Ljava/nio/ByteBuffer;", "", "buffer", "()Lkotlin/Pair;", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "surface", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface InterfaceC27350f extends InterfaceC27356b {
    @Nullable
    Pair<ByteBuffer, Integer> buffer();

    @Nullable
    Surface getSurface();
}
