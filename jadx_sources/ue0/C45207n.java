package ue0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: ue0.n */
/* JADX INFO: compiled from: RenderEffectBlur.java */
/* JADX INFO: loaded from: classes60.dex */
@RequiresApi(31)
public class C45207n implements InterfaceC45194a {

    /* JADX INFO: renamed from: b */
    public int f101715b;

    /* JADX INFO: renamed from: c */
    public int f101716c;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC45194a f101718e;

    /* JADX INFO: renamed from: f */
    public Context f101719f;

    /* JADX INFO: renamed from: a */
    public final RenderNode f101714a = C45206m.m99878a("BlurViewNode");

    /* JADX INFO: renamed from: d */
    public float f101717d = 1.0f;

    @Override // ue0.InterfaceC45194a
    /* JADX INFO: renamed from: b */
    public boolean mo99858b() {
        return true;
    }

    @Override // ue0.InterfaceC45194a
    @NonNull
    /* JADX INFO: renamed from: a */
    public Bitmap.Config mo99857a() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // ue0.InterfaceC45194a
    /* JADX INFO: renamed from: c */
    public float mo99859c() {
        return 6.0f;
    }

    @Override // ue0.InterfaceC45194a
    public void destroy() {
        this.f101714a.discardDisplayList();
        InterfaceC45194a interfaceC45194a = this.f101718e;
        if (interfaceC45194a != null) {
            interfaceC45194a.destroy();
        }
    }

    @Override // ue0.InterfaceC45194a
    /* JADX INFO: renamed from: e */
    public Bitmap mo99861e(@NonNull Bitmap bitmap, float f11) {
        this.f101717d = f11;
        if (bitmap.getHeight() != this.f101715b || bitmap.getWidth() != this.f101716c) {
            this.f101715b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f101716c = width;
            this.f101714a.setPosition(0, 0, width, this.f101715b);
        }
        this.f101714a.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f101714a.endRecording();
        this.f101714a.setRenderEffect(RenderEffect.createBlurEffect(f11, f11, Shader.TileMode.MIRROR));
        return bitmap;
    }

    /* JADX INFO: renamed from: f */
    public void m99879f(@NonNull Context context) {
        this.f101719f = context;
    }

    @Override // ue0.InterfaceC45194a
    /* JADX INFO: renamed from: d */
    public void mo99860d(@NonNull Canvas canvas, @NonNull Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f101714a);
            return;
        }
        if (this.f101718e == null) {
            this.f101718e = new C45208o(this.f101719f);
        }
        this.f101718e.mo99861e(bitmap, this.f101717d);
        this.f101718e.mo99860d(canvas, bitmap);
    }
}
