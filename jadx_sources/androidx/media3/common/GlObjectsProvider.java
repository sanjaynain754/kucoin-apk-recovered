package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface GlObjectsProvider {
    GlTextureInfo createBuffersForTexture(int i11, int i12, int i13) throws GlUtil.GlException;

    EGLContext createEglContext(EGLDisplay eGLDisplay, @IntRange(from = 2, m1553to = 3) int i11, int[] iArr) throws GlUtil.GlException;

    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i11, boolean z11) throws GlUtil.GlException;

    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil.GlException;

    void release(EGLDisplay eGLDisplay) throws GlUtil.GlException;
}
