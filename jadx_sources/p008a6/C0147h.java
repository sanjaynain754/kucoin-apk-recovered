package p008a6;

import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a6.h */
/* JADX INFO: compiled from: BitmapCounterProvider.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"La6/h;", "", "<init>", "()V", "La6/g;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()La6/g;", "", "b", "I", "MAX_BITMAP_TOTAL_SIZE", "c", "maxBitmapCount", "d", "La6/g;", "bitmapCounter", "()I", "maxSizeHardCap", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C0147h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0147h f510a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public static final int MAX_BITMAP_TOTAL_SIZE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static int maxBitmapCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static volatile C0145g bitmapCounter;

    static {
        C0147h c0147h = new C0147h();
        f510a = c0147h;
        MAX_BITMAP_TOTAL_SIZE = c0147h.m681b();
        maxBitmapCount = RendererCapabilities.DECODER_SUPPORT_MASK;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C0145g m680a() {
        if (bitmapCounter == null) {
            synchronized (C0147h.class) {
                try {
                    if (bitmapCounter == null) {
                        bitmapCounter = new C0145g(maxBitmapCount, MAX_BITMAP_TOTAL_SIZE);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C0145g c0145g = bitmapCounter;
        Intrinsics.checkNotNull(c0145g);
        return c0145g;
    }

    /* JADX INFO: renamed from: b */
    public final int m681b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin > 16777216) {
            return (iMin / 4) * 3;
        }
        return iMin / 2;
    }
}
