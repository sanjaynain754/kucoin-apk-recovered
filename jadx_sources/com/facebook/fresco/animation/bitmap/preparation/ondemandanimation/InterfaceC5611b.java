package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import androidx.annotation.UiThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.library.MonitorCallback;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b */
/* JADX INFO: compiled from: FrameLoader.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH&¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "", "", "frameNumber", "width", "height", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "c", "(III)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "Lkotlin/Function0;", "", "onAnimationLoaded", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILkotlin/jvm/functions/Function0;)V", MonitorCallback.EVENT_FPS, "b", "(I)V", "onStop", "()V", "clear", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC5611b {
    @UiThread
    /* JADX INFO: renamed from: a */
    void mo8774a(int width, int height, @NotNull Function0<Unit> onAnimationLoaded);

    /* JADX INFO: renamed from: b */
    void mo8775b(int fps);

    @UiThread
    @NotNull
    /* JADX INFO: renamed from: c */
    FrameResult mo8776c(int frameNumber, int width, int height);

    void clear();

    void onStop();

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b$a */
    /* JADX INFO: compiled from: FrameLoader.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m8806a(@NotNull InterfaceC5611b interfaceC5611b) {
        }
    }
}
