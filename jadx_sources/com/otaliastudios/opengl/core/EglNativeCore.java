package com.otaliastudios.opengl.core;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import l90.C42139a;
import n90.C42784d;
import n90.EglConfig;
import n90.EglContext;
import n90.EglDisplay;
import n90.EglSurface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EglNativeCore.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001$B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"¨\u0006%"}, m90084d2 = {"Lcom/otaliastudios/opengl/core/EglNativeCore;", "", "Ln90/b;", "sharedContext", "", "flags", "<init>", "(Ln90/b;I)V", "", "c", "()V", "Ln90/e;", "eglSurface", "d", "(Ln90/e;)V", "surface", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Ln90/e;", "b", "", "f", "(Ln90/e;)Z", "", "nsecs", "e", "(Ln90/e;J)V", "Ln90/c;", "Ln90/c;", "eglDisplay", "Ln90/b;", "eglContext", "Ln90/a;", "Ln90/a;", "eglConfig", "I", "glVersion", "Companion", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public class EglNativeCore {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public EglDisplay eglDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public EglContext eglContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public EglConfig eglConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int glVersion;

    /* JADX INFO: renamed from: b */
    public final void m67823b(@NotNull EglSurface eglSurface) {
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        if (this.eglDisplay == C42784d.m93743g()) {
            Log.v("EglCore", "NOTE: makeSurfaceCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.eglDisplay.getNative(), eglSurface.getNative(), eglSurface.getNative(), this.eglContext.getNative())) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m67824c() {
        if (this.eglDisplay != C42784d.m93743g()) {
            EGL14.eglMakeCurrent(this.eglDisplay.getNative(), C42784d.m93744h().getNative(), C42784d.m93744h().getNative(), C42784d.m93742f().getNative());
            EGL14.eglDestroyContext(this.eglDisplay.getNative(), this.eglContext.getNative());
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay.getNative());
        }
        this.eglDisplay = C42784d.m93743g();
        this.eglContext = C42784d.m93742f();
        this.eglConfig = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m67825d(@NotNull EglSurface eglSurface) {
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        EGL14.eglDestroySurface(this.eglDisplay.getNative(), eglSurface.getNative());
    }

    /* JADX INFO: renamed from: e */
    public final void m67826e(@NotNull EglSurface eglSurface, long nsecs) {
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        EGLExt.eglPresentationTimeANDROID(this.eglDisplay.getNative(), eglSurface.getNative(), nsecs);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m67827f(@NotNull EglSurface eglSurface) {
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        return EGL14.eglSwapBuffers(this.eglDisplay.getNative(), eglSurface.getNative());
    }

    public EglNativeCore(@NotNull EglContext sharedContext, int i11) {
        EglConfig eglConfigM67820a;
        Intrinsics.checkNotNullParameter(sharedContext, "sharedContext");
        this.eglDisplay = C42784d.m93743g();
        this.eglContext = C42784d.m93742f();
        this.glVersion = -1;
        EglDisplay eglDisplay = new EglDisplay(EGL14.eglGetDisplay(0));
        this.eglDisplay = eglDisplay;
        if (eglDisplay != C42784d.m93743g()) {
            if (EGL14.eglInitialize(this.eglDisplay.getNative(), new int[1], 0, new int[1], 0)) {
                EglNativeConfigChooser eglNativeConfigChooser = new EglNativeConfigChooser();
                boolean z11 = (i11 & 1) != 0;
                if ((i11 & 2) != 0 && (eglConfigM67820a = eglNativeConfigChooser.m67820a(this.eglDisplay, 3, z11)) != null) {
                    EglContext eglContext = new EglContext(EGL14.eglCreateContext(this.eglDisplay.getNative(), eglConfigM67820a.getNative(), sharedContext.getNative(), new int[]{C42784d.m93739c(), 3, C42784d.m93741e()}, 0));
                    try {
                        C42139a.m92477a("eglCreateContext (3)");
                        this.eglConfig = eglConfigM67820a;
                        this.eglContext = eglContext;
                        this.glVersion = 3;
                    } catch (Exception unused) {
                    }
                }
                if (this.eglContext == C42784d.m93742f()) {
                    EglConfig eglConfigM67820a2 = eglNativeConfigChooser.m67820a(this.eglDisplay, 2, z11);
                    if (eglConfigM67820a2 != null) {
                        EglContext eglContext2 = new EglContext(EGL14.eglCreateContext(this.eglDisplay.getNative(), eglConfigM67820a2.getNative(), sharedContext.getNative(), new int[]{C42784d.m93739c(), 2, C42784d.m93741e()}, 0));
                        C42139a.m92477a("eglCreateContext (2)");
                        this.eglConfig = eglConfigM67820a2;
                        this.eglContext = eglContext2;
                        this.glVersion = 2;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                return;
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final EglSurface m67822a(@NotNull Object surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        int[] iArr = {C42784d.m93741e()};
        EglDisplay eglDisplay = this.eglDisplay;
        EglConfig eglConfig = this.eglConfig;
        Intrinsics.checkNotNull(eglConfig);
        EglSurface eglSurface = new EglSurface(EGL14.eglCreateWindowSurface(eglDisplay.getNative(), eglConfig.getNative(), surface, iArr, 0));
        C42139a.m92477a("eglCreateWindowSurface");
        if (eglSurface != C42784d.m93744h()) {
            return eglSurface;
        }
        throw new RuntimeException("surface was null");
    }
}
