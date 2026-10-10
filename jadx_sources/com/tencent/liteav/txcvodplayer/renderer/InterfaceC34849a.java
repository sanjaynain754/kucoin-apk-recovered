package com.tencent.liteav.txcvodplayer.renderer;

import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.a */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC34849a {

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo76331a(b bVar);

        /* JADX INFO: renamed from: a */
        void mo76332a(b bVar, int i11, int i12);

        /* JADX INFO: renamed from: a */
        boolean mo76333a(MotionEvent motionEvent);

        /* JADX INFO: renamed from: b */
        void mo76334b(b bVar);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.renderer.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        InterfaceC34849a mo76327a();

        /* JADX INFO: renamed from: a */
        void mo76328a(ITXVCubePlayer iTXVCubePlayer);

        /* JADX INFO: renamed from: b */
        Surface mo76329b();

        /* JADX INFO: renamed from: c */
        Surface mo76330c();
    }

    /* JADX INFO: renamed from: a */
    void mo76430a(int i11, int i12);

    /* JADX INFO: renamed from: a */
    void mo76431a(a aVar);

    /* JADX INFO: renamed from: a */
    boolean mo76432a();

    /* JADX INFO: renamed from: b */
    void mo76433b(int i11, int i12);

    /* JADX INFO: renamed from: b */
    void mo76434b(a aVar);

    View getView();

    void setAspectRatio(int i11);

    void setVideoRotation(int i11);
}
