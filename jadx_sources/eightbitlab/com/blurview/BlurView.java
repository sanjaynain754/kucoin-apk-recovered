package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import ue0.C45198e;
import ue0.C45199f;
import ue0.C45207n;
import ue0.C45208o;
import ue0.InterfaceC45194a;
import ue0.InterfaceC45195b;
import ue0.InterfaceC45197d;

/* JADX INFO: loaded from: classes60.dex */
public class BlurView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final String f82491d = "BlurView";

    /* JADX INFO: renamed from: b */
    public InterfaceC45195b f82492b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f82493c;

    public BlurView(Context context) {
        super(context);
        this.f82492b = new C45198e();
        m83187a(null, 0);
    }

    @NonNull
    @RequiresApi(api = 17)
    private InterfaceC45194a getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new C45207n() : new C45208o(getContext());
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC45197d m83188b(boolean z11) {
        return this.f82492b.mo99866e(z11);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC45197d m83189c(boolean z11) {
        return this.f82492b.mo99863a(z11);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC45197d m83190d(float f11) {
        return this.f82492b.mo99864c(f11);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f82492b.draw(canvas)) {
            super.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC45197d m83191e(@ColorInt int i11) {
        this.f82493c = i11;
        return this.f82492b.mo99865d(i11);
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC45197d m83193g(@NonNull ViewGroup viewGroup, InterfaceC45194a interfaceC45194a) {
        this.f82492b.destroy();
        C45199f c45199f = new C45199f(this, viewGroup, this.f82493c, interfaceC45194a);
        this.f82492b = c45199f;
        return c45199f;
    }

    /* JADX INFO: renamed from: a */
    public final void m83187a(AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BlurView, i11, 0);
        this.f82493c = typedArrayObtainStyledAttributes.getColor(R$styleable.BlurView_blurOverlayColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @RequiresApi(api = 17)
    /* JADX INFO: renamed from: f */
    public InterfaceC45197d m83192f(@NonNull ViewGroup viewGroup) {
        return m83193g(viewGroup, getBlurAlgorithm());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            Log.e(f82491d, "BlurView can't be used in not hardware-accelerated window!");
        } else {
            this.f82492b.mo99866e(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f82492b.mo99866e(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f82492b.mo99862b();
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82492b = new C45198e();
        m83187a(attributeSet, 0);
    }

    public BlurView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f82492b = new C45198e();
        m83187a(attributeSet, i11);
    }
}
