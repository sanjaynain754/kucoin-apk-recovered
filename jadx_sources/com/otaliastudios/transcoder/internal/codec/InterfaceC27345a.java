package com.otaliastudios.transcoder.internal.codec;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.codec.a */
/* JADX INFO: compiled from: Decoder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/codec/a;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "Landroid/media/MediaFormat;", "sourceFormat", "Landroid/view/Surface;", "e", "(Landroid/media/MediaFormat;)Landroid/view/Surface;", "rawFormat", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/media/MediaFormat;)V", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface InterfaceC27345a extends InterfaceC27356b {
    /* JADX INFO: renamed from: a */
    void mo67918a(@NotNull MediaFormat rawFormat);

    @Nullable
    /* JADX INFO: renamed from: e */
    Surface mo67919e(@NotNull MediaFormat sourceFormat);
}
