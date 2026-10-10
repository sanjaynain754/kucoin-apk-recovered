package com.otaliastudios.opengl.core;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import n90.C42784d;
import n90.EglConfig;
import n90.EglDisplay;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EglNativeConfigChooser.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/otaliastudios/opengl/core/EglNativeConfigChooser;", "", "<init>", "()V", "Ln90/c;", "display", "", "version", "", "recordable", "Ln90/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ln90/c;IZ)Ln90/a;", "", "b", "(IZ)[I", "Companion", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public class EglNativeConfigChooser {
    @NotNull
    /* JADX INFO: renamed from: b */
    public final int[] m67821b(int version, boolean recordable) {
        return new int[]{C42784d.m93748l(), 8, C42784d.m93740d(), 8, C42784d.m93738b(), 8, C42784d.m93737a(), 8, C42784d.m93751o(), C42784d.m93752p() | C42784d.m93747k(), C42784d.m93749m(), version >= 3 ? C42784d.m93745i() | C42784d.m93746j() : C42784d.m93745i(), recordable ? 12610 : C42784d.m93741e(), recordable ? 1 : 0, C42784d.m93741e()};
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final EglConfig m67820a(@NotNull EglDisplay display, int version, boolean recordable) {
        Intrinsics.checkNotNullParameter(display, "display");
        EglConfig[] eglConfigArr = new EglConfig[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(display.getNative(), m67821b(version, recordable), 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (zEglChooseConfig) {
            Iterator<Integer> it = ArraysKt.getIndices(eglConfigArr).iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                EGLConfig eGLConfig = eGLConfigArr[iNextInt];
                eglConfigArr[iNextInt] = eGLConfig == null ? null : new EglConfig(eGLConfig);
            }
        }
        if (zEglChooseConfig) {
            return eglConfigArr[0];
        }
        Log.w("EglConfigChooser", "Unable to find RGB8888 / " + version + " EGLConfig");
        return null;
    }
}
