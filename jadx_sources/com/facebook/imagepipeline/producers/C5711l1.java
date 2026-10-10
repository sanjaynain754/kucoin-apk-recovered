package com.facebook.imagepipeline.producers;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.common.ResizeOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p749x5.C46075i;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l1 */
/* JADX INFO: compiled from: ThumbnailSizeChecker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/l1;", "", "<init>", "()V", "", "width", "height", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "", "b", "(IILcom/facebook/imagepipeline/common/ResizeOptions;)Z", "Lx5/i;", "encodedImage", "c", "(Lx5/i;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z", "size", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)I", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C5711l1 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5711l1 f9397a = new C5711l1();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m9736a(int size) {
        return (int) (size * 1.3333334f);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m9737b(int width, int height, @Nullable ResizeOptions resizeOptions) {
        if (resizeOptions == null) {
            return ((float) m9736a(width)) >= 2048.0f && m9736a(height) >= 2048;
        }
        return m9736a(width) >= resizeOptions.width && m9736a(height) >= resizeOptions.height;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m9738c(@Nullable C46075i encodedImage, @Nullable ResizeOptions resizeOptions) {
        if (encodedImage == null) {
            return false;
        }
        int iM101559F = encodedImage.m101559F();
        return (iM101559F == 90 || iM101559F == 270) ? m9737b(encodedImage.getHeight(), encodedImage.getWidth(), resizeOptions) : m9737b(encodedImage.getWidth(), encodedImage.getHeight(), resizeOptions);
    }
}
