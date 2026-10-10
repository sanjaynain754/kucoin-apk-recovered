package p788y7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: y7.a */
/* JADX INFO: compiled from: FrameAnimationDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC46391a<Decoder extends FrameSeqDecoder<?, ?>> extends Drawable implements Animatable2Compat, FrameSeqDecoder.InterfaceC6948j {

    /* JADX INFO: renamed from: m */
    public static final String f104029m = "a";

    /* JADX INFO: renamed from: b */
    public final Paint f104030b;

    /* JADX INFO: renamed from: c */
    public final Decoder f104031c;

    /* JADX INFO: renamed from: d */
    public final DrawFilter f104032d;

    /* JADX INFO: renamed from: e */
    public final Matrix f104033e;

    /* JADX INFO: renamed from: f */
    public final Set<Animatable2Compat.AnimationCallback> f104034f;

    /* JADX INFO: renamed from: g */
    public Bitmap f104035g;

    /* JADX INFO: renamed from: h */
    public final Handler f104036h;

    /* JADX INFO: renamed from: i */
    public final Runnable f104037i;

    /* JADX INFO: renamed from: j */
    public boolean f104038j;

    /* JADX INFO: renamed from: k */
    public final Set<WeakReference<Drawable.Callback>> f104039k;

    /* JADX INFO: renamed from: l */
    public boolean f104040l;

    /* JADX INFO: renamed from: y7.a$a */
    /* JADX INFO: compiled from: FrameAnimationDrawable.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                Iterator it = new ArrayList(AbstractC46391a.this.f104034f).iterator();
                while (it.hasNext()) {
                    ((Animatable2Compat.AnimationCallback) it.next()).onAnimationStart(AbstractC46391a.this);
                }
            } else {
                if (i11 != 2) {
                    return;
                }
                Iterator it2 = new ArrayList(AbstractC46391a.this.f104034f).iterator();
                while (it2.hasNext()) {
                    ((Animatable2Compat.AnimationCallback) it2.next()).onAnimationEnd(AbstractC46391a.this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y7.a$b */
    /* JADX INFO: compiled from: FrameAnimationDrawable.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC46391a.this.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder.InterfaceC6948j
    /* JADX INFO: renamed from: b */
    public void mo12790b() {
        Message.obtain(this.f104036h, 2).sendToTarget();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.f104034f.clear();
    }

    /* JADX INFO: renamed from: d */
    public int m102313d() {
        int iM12786y = this.f104031c.m12786y();
        Bitmap bitmap = this.f104035g;
        if (bitmap != null && !bitmap.isRecycled()) {
            iM12786y += this.f104035g.getAllocationByteCount();
        }
        return Math.max(1, iM12786y);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f104035g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.f104032d);
        canvas.drawBitmap(this.f104035g, this.f104033e, this.f104030b);
    }

    /* JADX INFO: renamed from: e */
    public final void m102314e() {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        boolean z11 = false;
        for (WeakReference weakReference : new HashSet(this.f104039k)) {
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z11 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f104039k.remove((WeakReference) it.next());
        }
        if (z11) {
            return;
        }
        this.f104039k.add(new WeakReference<>(callback));
    }

    /* JADX INFO: renamed from: f */
    public final void m102315f() {
        this.f104031c.m12778p(this);
        if (this.f104038j) {
            this.f104031c.m12774P();
        } else {
            if (this.f104031c.m12768G()) {
                return;
            }
            this.f104031c.m12774P();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m102316g() {
        this.f104031c.m12771L(this);
        if (this.f104038j) {
            this.f104031c.m12776R();
        } else {
            this.f104031c.m12777S();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f104040l) {
            return -1;
        }
        try {
            return this.f104031c.m12781s().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f104040l) {
            return -1;
        }
        try {
            return this.f104031c.m12781s().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m102317h(boolean z11) {
        this.f104038j = z11;
    }

    /* JADX INFO: renamed from: i */
    public void m102318i(boolean z11) {
        this.f104040l = z11;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f104031c.m12768G();
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder.InterfaceC6948j
    public void onStart() {
        Message.obtain(this.f104036h, 1).sendToTarget();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f104034f.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f104030b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f104030b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f104031c.m12768G()) {
            this.f104031c.m12776R();
        }
        this.f104031c.m12772N();
        m102315f();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return this.f104034f.remove(animationCallback);
    }

    public AbstractC46391a(Decoder decoder) {
        Paint paint = new Paint();
        this.f104030b = paint;
        this.f104032d = new PaintFlagsDrawFilter(0, 3);
        this.f104033e = new Matrix();
        this.f104034f = new HashSet();
        this.f104036h = new a(Looper.getMainLooper());
        this.f104037i = new b();
        this.f104038j = true;
        this.f104039k = new HashSet();
        this.f104040l = false;
        paint.setAntiAlias(true);
        this.f104031c = decoder;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder.InterfaceC6948j
    /* JADX INFO: renamed from: a */
    public void mo12789a(ByteBuffer byteBuffer) {
        if (!isRunning()) {
            return;
        }
        Bitmap bitmap = this.f104035g;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f104035g = Bitmap.createBitmap(this.f104031c.m12781s().width() / this.f104031c.mo12764B(), this.f104031c.m12781s().height() / this.f104031c.mo12764B(), Bitmap.Config.ARGB_8888);
        }
        byteBuffer.rewind();
        if (byteBuffer.remaining() < this.f104035g.getByteCount()) {
            Log.e(f104029m, "onRender:Buffer not large enough for pixels");
        } else {
            this.f104035g.copyPixelsFromBuffer(byteBuffer);
            this.f104036h.post(this.f104037i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        Iterator it = new HashSet(this.f104039k).iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = (Drawable.Callback) ((WeakReference) it.next()).get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        int iMo12764B = this.f104031c.mo12764B();
        int iM12773O = this.f104031c.m12773O(getBounds().width(), getBounds().height());
        float f11 = iM12773O;
        this.f104033e.setScale(((getBounds().width() * 1.0f) * f11) / this.f104031c.m12781s().width(), ((getBounds().height() * 1.0f) * f11) / this.f104031c.m12781s().height());
        if (iM12773O != iMo12764B) {
            this.f104035g = Bitmap.createBitmap(this.f104031c.m12781s().width() / iM12773O, this.f104031c.m12781s().height() / iM12773O, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        m102314e();
        if (this.f104038j) {
            if (z11) {
                if (!isRunning()) {
                    m102315f();
                }
            } else if (isRunning()) {
                m102316g();
            }
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m102316g();
    }
}
