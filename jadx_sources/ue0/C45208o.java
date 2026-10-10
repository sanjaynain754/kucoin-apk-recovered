package ue0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: ue0.o */
/* JADX INFO: compiled from: RenderScriptBlur.java */
/* JADX INFO: loaded from: classes60.dex */
@Deprecated
public class C45208o implements InterfaceC45194a {

    /* JADX INFO: renamed from: b */
    public final RenderScript f101721b;

    /* JADX INFO: renamed from: c */
    public final ScriptIntrinsicBlur f101722c;

    /* JADX INFO: renamed from: d */
    public Allocation f101723d;

    /* JADX INFO: renamed from: a */
    public final Paint f101720a = new Paint(2);

    /* JADX INFO: renamed from: e */
    public int f101724e = -1;

    /* JADX INFO: renamed from: f */
    public int f101725f = -1;

    @Override // ue0.InterfaceC45194a
    /* JADX INFO: renamed from: b */
    public boolean mo99858b() {
        return true;
    }

    @Override // ue0.InterfaceC45194a
    /* JADX INFO: renamed from: d */
    public void mo99860d(@NonNull Canvas canvas, @NonNull Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f101720a);
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
    public final void destroy() {
        this.f101722c.destroy();
        this.f101721b.destroy();
        Allocation allocation = this.f101723d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // ue0.InterfaceC45194a
    @RequiresApi(api = 17)
    /* JADX INFO: renamed from: e */
    public Bitmap mo99861e(@NonNull Bitmap bitmap, float f11) {
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f101721b, bitmap);
        if (!m99880f(bitmap)) {
            Allocation allocation = this.f101723d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f101723d = Allocation.createTyped(this.f101721b, allocationCreateFromBitmap.getType());
            this.f101724e = bitmap.getWidth();
            this.f101725f = bitmap.getHeight();
        }
        this.f101722c.setRadius(f11);
        this.f101722c.setInput(allocationCreateFromBitmap);
        this.f101722c.forEach(this.f101723d);
        this.f101723d.copyTo(bitmap);
        allocationCreateFromBitmap.destroy();
        return bitmap;
    }

    @RequiresApi(api = 17)
    public C45208o(@NonNull Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.f101721b = renderScriptCreate;
        this.f101722c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m99880f(@NonNull Bitmap bitmap) {
        if (bitmap.getHeight() == this.f101725f && bitmap.getWidth() == this.f101724e) {
            return true;
        }
        return false;
    }
}
