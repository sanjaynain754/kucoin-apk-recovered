package com.opensource.svgaplayer;

import android.media.SoundPool;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.FileDescriptor;
import java.util.LinkedHashMap;
import java.util.Map;
import k90.C40965c;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.opensource.svgaplayer.h */
/* JADX INFO: compiled from: SVGASoundManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u0010\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001d\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010%¨\u0006'"}, m90084d2 = {"Lcom/opensource/svgaplayer/h;", "", "<init>", "()V", "", "b", "()Z", "Lcom/opensource/svgaplayer/h$a;", "callBack", "Ljava/io/FileDescriptor;", "fd", "", TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "", "priority", "c", "(Lcom/opensource/svgaplayer/h$a;Ljava/io/FileDescriptor;JJI)I", "soundId", "", "f", "(I)V", "d", "(I)I", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Landroid/media/SoundPool;", "Landroid/media/SoundPool;", "soundPool", "", "Ljava/util/Map;", "soundCallBackMap", "", "F", "volume", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C27326h {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static SoundPool soundPool;

    /* JADX INFO: renamed from: e */
    public static final C27326h f55530e = new C27326h();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C27326h.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Map<Integer, a> soundCallBackMap = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static float volume = 1.0f;

    /* JADX INFO: renamed from: com.opensource.svgaplayer.h$a */
    /* JADX INFO: compiled from: SVGASoundManager.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m90084d2 = {"Lcom/opensource/svgaplayer/h$a;", "", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
    public interface a {
    }

    /* JADX INFO: renamed from: b */
    public final boolean m67797b() {
        return soundPool != null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m67796a() {
        boolean zM67797b = m67797b();
        if (!zM67797b) {
            C40965c c40965c = C40965c.f91057a;
            String TAG2 = TAG;
            Intrinsics.checkExpressionValueIsNotNull(TAG2, "TAG");
            c40965c.m89714b(TAG2, "soundPool is null, you need call init() !!!");
        }
        return zM67797b;
    }

    /* JADX INFO: renamed from: c */
    public final int m67798c(@Nullable a callBack, @Nullable FileDescriptor fd2, long offset, long length, int priority) {
        if (!m67796a()) {
            return -1;
        }
        SoundPool soundPool2 = soundPool;
        if (soundPool2 == null) {
            Intrinsics.throwNpe();
        }
        int iLoad = soundPool2.load(fd2, offset, length, priority);
        C40965c c40965c = C40965c.f91057a;
        String TAG2 = TAG;
        Intrinsics.checkExpressionValueIsNotNull(TAG2, "TAG");
        c40965c.m89713a(TAG2, "load soundId=" + iLoad + " callBack=" + callBack);
        if (callBack != null) {
            Map<Integer, a> map = soundCallBackMap;
            if (!map.containsKey(Integer.valueOf(iLoad))) {
                map.put(Integer.valueOf(iLoad), callBack);
            }
        }
        return iLoad;
    }

    /* JADX INFO: renamed from: d */
    public final int m67799d(int soundId) {
        if (!m67796a()) {
            return -1;
        }
        C40965c c40965c = C40965c.f91057a;
        String TAG2 = TAG;
        Intrinsics.checkExpressionValueIsNotNull(TAG2, "TAG");
        c40965c.m89713a(TAG2, "play soundId=" + soundId);
        SoundPool soundPool2 = soundPool;
        if (soundPool2 == null) {
            Intrinsics.throwNpe();
        }
        float f11 = volume;
        return soundPool2.play(soundId, f11, f11, 1, 0, 1.0f);
    }

    /* JADX INFO: renamed from: e */
    public final void m67800e(int soundId) {
        if (!m67796a()) {
            return;
        }
        C40965c c40965c = C40965c.f91057a;
        String TAG2 = TAG;
        Intrinsics.checkExpressionValueIsNotNull(TAG2, "TAG");
        c40965c.m89713a(TAG2, "stop soundId=" + soundId);
        SoundPool soundPool2 = soundPool;
        if (soundPool2 == null) {
            Intrinsics.throwNpe();
        }
        soundPool2.stop(soundId);
    }

    /* JADX INFO: renamed from: f */
    public final void m67801f(int soundId) {
        if (!m67796a()) {
            return;
        }
        C40965c c40965c = C40965c.f91057a;
        String TAG2 = TAG;
        Intrinsics.checkExpressionValueIsNotNull(TAG2, "TAG");
        c40965c.m89713a(TAG2, "unload soundId=" + soundId);
        SoundPool soundPool2 = soundPool;
        if (soundPool2 == null) {
            Intrinsics.throwNpe();
        }
        soundPool2.unload(soundId);
        soundCallBackMap.remove(Integer.valueOf(soundId));
    }
}
