package com.otaliastudios.opengl.core;

import android.opengl.EGLContext;
import n90.EglContext;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;

/* JADX INFO: compiled from: EglCore.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0004¢\u0006\u0004\b\u000b\u0010\n¨\u0006\u000e"}, m90084d2 = {"Lcom/otaliastudios/opengl/core/EglCore;", "Lcom/otaliastudios/opengl/core/EglNativeCore;", "Landroid/opengl/EGLContext;", "sharedContext", "", "flags", "<init>", "(Landroid/opengl/EGLContext;I)V", "", "g", "()V", "finalize", "f", "Companion", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class EglCore extends EglNativeCore {
    @JvmOverloads
    public EglCore(@Nullable EGLContext eGLContext, int i11) {
        super(new EglContext(eGLContext), i11);
    }

    public final void finalize() {
        m67819g();
    }

    /* JADX INFO: renamed from: g */
    public void m67819g() {
        super.m67824c();
    }
}
