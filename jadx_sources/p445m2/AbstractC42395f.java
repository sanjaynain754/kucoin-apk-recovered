package p445m2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p460n2.InterfaceC42704b;

/* JADX INFO: renamed from: m2.f */
/* JADX INFO: compiled from: ImageViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC42395f<Z> extends AbstractC42400k<ImageView, Z> implements InterfaceC42704b.a {

    /* JADX INFO: renamed from: j */
    @Nullable
    public Animatable f94001j;

    /* JADX INFO: renamed from: o */
    public abstract void mo93063o(@Nullable Z z11);

    @Override // p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: e */
    public void mo6639e(@NonNull Z z11, @Nullable InterfaceC42704b<? super Z> interfaceC42704b) {
        if (interfaceC42704b == null || !interfaceC42704b.mo93596a(z11, this)) {
            m93084p(z11);
        } else {
            m93082m(z11);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m93082m(@Nullable Z z11) {
        if (!(z11 instanceof Animatable)) {
            this.f94001j = null;
            return;
        }
        Animatable animatable = (Animatable) z11;
        this.f94001j = animatable;
        animatable.start();
    }

    /* JADX INFO: renamed from: n */
    public void m93083n(Drawable drawable) {
        ((ImageView) this.f94006c).setImageDrawable(drawable);
    }

    @Override // p445m2.AbstractC42390a, p329i2.InterfaceC38421m
    public void onStart() {
        Animatable animatable = this.f94001j;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p445m2.AbstractC42390a, p329i2.InterfaceC38421m
    public void onStop() {
        Animatable animatable = this.f94001j;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public AbstractC42395f(ImageView imageView) {
        super(imageView);
    }

    @Override // p445m2.AbstractC42400k, p445m2.AbstractC42390a, p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: c */
    public void mo59882c(@Nullable Drawable drawable) {
        super.mo59882c(drawable);
        Animatable animatable = this.f94001j;
        if (animatable != null) {
            animatable.stop();
        }
        m93084p(null);
        m93083n(drawable);
    }

    @Override // p445m2.AbstractC42400k, p445m2.AbstractC42390a, p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: h */
    public void mo92231h(@Nullable Drawable drawable) {
        super.mo92231h(drawable);
        m93084p(null);
        m93083n(drawable);
    }

    @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
    /* JADX INFO: renamed from: i */
    public void mo6640i(@Nullable Drawable drawable) {
        super.mo6640i(drawable);
        m93084p(null);
        m93083n(drawable);
    }

    /* JADX INFO: renamed from: p */
    public final void m93084p(@Nullable Z z11) {
        mo93063o(z11);
        m93082m(z11);
    }
}
