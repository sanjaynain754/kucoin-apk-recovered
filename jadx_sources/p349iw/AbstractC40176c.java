package p349iw;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.kubi.resources.widget.bingoogolapple.bgabanner.transformer.TransitionEffect;

/* JADX INFO: renamed from: iw.c */
/* JADX INFO: compiled from: BGAPageTransformer.java */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC40176c implements ViewPager.PageTransformer {
    /* JADX INFO: renamed from: b */
    public abstract void mo88533b(View view, float f11);

    /* JADX INFO: renamed from: c */
    public abstract void mo88534c(View view, float f11);

    /* JADX INFO: renamed from: d */
    public abstract void mo88535d(View view, float f11);

    /* JADX INFO: renamed from: iw.c$a */
    /* JADX INFO: compiled from: BGAPageTransformer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f89314a;

        static {
            int[] iArr = new int[TransitionEffect.values().length];
            f89314a = iArr;
            try {
                iArr[TransitionEffect.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89314a[TransitionEffect.Alpha.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89314a[TransitionEffect.Rotate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89314a[TransitionEffect.Cube.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89314a[TransitionEffect.Flip.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f89314a[TransitionEffect.Accordion.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f89314a[TransitionEffect.ZoomFade.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f89314a[TransitionEffect.Fade.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f89314a[TransitionEffect.ZoomCenter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f89314a[TransitionEffect.ZoomStack.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f89314a[TransitionEffect.Stack.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f89314a[TransitionEffect.Depth.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f89314a[TransitionEffect.Zoom.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC40176c m88536a(TransitionEffect transitionEffect) {
        switch (a.f89314a[transitionEffect.ordinal()]) {
            case 1:
                return new C40178e();
            case 2:
                return new C40175b();
            case 3:
                return new C40182i();
            case 4:
                return new C40177d();
            case 5:
                return new C40181h();
            case 6:
                return new C40174a();
            case 7:
                return new C40185l();
            case 8:
                return new C40180g();
            case 9:
                return new C40184k();
            case 10:
                return new C40187n();
            case 11:
                return new C40183j();
            case 12:
                return new C40179f();
            case 13:
                return new C40186m();
            default:
                return new C40178e();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f11) {
        if (f11 < -1.0f) {
            mo88533b(view, f11);
            return;
        }
        if (f11 <= 0.0f) {
            mo88534c(view, f11);
        } else if (f11 <= 1.0f) {
            mo88535d(view, f11);
        } else {
            mo88533b(view, f11);
        }
    }
}
