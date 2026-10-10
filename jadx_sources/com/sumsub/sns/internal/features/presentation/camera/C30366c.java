package com.sumsub.sns.internal.features.presentation.camera;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$string;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28441c;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AnimationAnimationListenerC28445d;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28407M0;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28769e;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.domain.documents.C30148s;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30366c extends AbstractC28787t implements InterfaceC28407M0 {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty[] f61075p = {AbstractC28118g.m69077a(C30366c.class, "takePictureViewContainer", "getTakePictureViewContainer()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30366c.class, "takePictureProgressView", "getTakePictureProgressView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30366c.class, "takeGalleryView", "getTakeGalleryView()Landroid/view/View;", 0), AbstractC28118g.m69077a(C30366c.class, "toggleHelperView", "getToggleHelperView()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: e */
    public final Function0 f61076e;

    /* JADX INFO: renamed from: f */
    public final Function0 f61077f;

    /* JADX INFO: renamed from: g */
    public final Function0 f61078g;

    /* JADX INFO: renamed from: h */
    public final C30363b f61079h;

    /* JADX INFO: renamed from: i */
    public final String f61080i;

    /* JADX INFO: renamed from: j */
    public final C28769e f61081j;

    /* JADX INFO: renamed from: k */
    public final C28778k f61082k;

    /* JADX INFO: renamed from: l */
    public final C28778k f61083l;

    /* JADX INFO: renamed from: m */
    public final C28778k f61084m;

    /* JADX INFO: renamed from: n */
    public final C28778k f61085n;

    /* JADX INFO: renamed from: o */
    public final Lazy f61086o;

    /* JADX INFO: renamed from: a */
    public static final int m70252a(C30366c c30366c) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            boolean zM69346a = AbstractC28458h.m69346a(c30366c.f58549a.requireContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return ContextCompat.getColor(c30366c.f58549a.requireContext(), R$color.sns_cameraContent);
    }

    public C30366c(C30751t c30751t, Function0 function0, Function1 function1, Function0 function2, Function0 function3, C30363b c30363b) {
        super(c30751t.f58549a, c30751t);
        this.f61076e = function0;
        this.f61077f = function2;
        this.f61078g = function3;
        this.f61079h = c30363b;
        this.f61080i = "CameraButtons";
        this.f61081j = new C28769e(this, function1);
        this.f61082k = m69602a(c30363b.f61068a);
        this.f61083l = m69602a(c30363b.f61070c);
        this.f61084m = m69602a(c30363b.f61071d);
        this.f61085n = m69602a(c30363b.f61072e);
        this.f61086o = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C30366c.m70252a(this.f61155b));
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m70255b(C30366c c30366c) {
        c30366c.f61077f.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m70256c(C30366c c30366c) {
        View view = (View) c30366c.f61082k.getValue(c30366c, f61075p[0]);
        if (view != null) {
            view.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f61080i;
    }

    /* JADX INFO: renamed from: n */
    public final void m70258n() {
        final View view = (View) this.f61084m.getValue(this, f61075p[2]);
        if (view != null) {
            view.setVisibility(((C30360a) this.f61076e.invoke()).f61064a ? 0 : 8);
            Drawable drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(view.getContext(), SNSIconHandler.SNSCommonIcons.GALLERY.getImageName());
            if (drawableOnResolveIcon != null) {
                drawableOnResolveIcon.setColorFilter(new PorterDuffColorFilter(((Number) this.f61086o.getValue()).intValue(), PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                imageView.setImageDrawable(drawableOnResolveIcon);
            }
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30366c.m70253a(view, this);
                }
            }, view);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m70259o() {
        View view = (View) this.f61085n.getValue(this, f61075p[3]);
        if (view != null) {
            Drawable drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(view.getContext(), SNSIconHandler.SNSCommonIcons.INFO.getImageName());
            if (drawableOnResolveIcon == null) {
                drawableOnResolveIcon = ContextCompat.getDrawable(view.getContext(), R$drawable.sns_ic_info);
            }
            if (drawableOnResolveIcon != null) {
                drawableOnResolveIcon.setColorFilter(new PorterDuffColorFilter(((Number) this.f61086o.getValue()).intValue(), PorterDuff.Mode.SRC_IN));
            }
            if (drawableOnResolveIcon != null) {
                ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                if (imageView != null) {
                    imageView.setImageDrawable(drawableOnResolveIcon);
                }
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C30366c.m70254a(this.f62120b, view2);
                }
            });
        }
    }

    @Override // com.sumsub.sns.internal.core.common.InterfaceC28407M0
    public final Boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 != 24 && i11 != 25) {
            return null;
        }
        this.f61077f.invoke();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: p */
    public final void m70260p() {
        View view = (View) this.f61082k.getValue(this, f61075p[0]);
        View viewFindViewById = view != null ? view.findViewById(this.f61079h.f61069b) : null;
        if (viewFindViewById != null) {
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.s0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30366c.m70255b(this.f62121b);
                }
            }, viewFindViewById);
            ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
            if (imageView != null) {
                imageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(((ImageView) viewFindViewById).getContext(), SNSIconHandler.SNSCommonIcons.TAKE_PHOTO.getImageName()));
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m70260p();
        m70258n();
        m70259o();
    }

    /* JADX INFO: renamed from: a */
    public final void m70257a(boolean z11) {
        View view;
        C28778k c28778k = this.f61082k;
        KProperty[] kPropertyArr = f61075p;
        View view2 = (View) c28778k.getValue(this, kPropertyArr[0]);
        View viewFindViewById = view2 != null ? view2.findViewById(this.f61079h.f61069b) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(true);
        }
        View view3 = (View) this.f61083l.getValue(this, kPropertyArr[1]);
        if (view3 != null) {
            view3.setVisibility(z11 ? 0 : 8);
        }
        View view4 = (View) this.f61082k.getValue(this, kPropertyArr[0]);
        if ((view4 == null || view4.getVisibility() != 0) && (view = (View) this.f61082k.getValue(this, kPropertyArr[0])) != null) {
            Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.q0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30366c.m70256c(this.f62116b);
                }
            };
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(view.getResources().getInteger(R.integer.config_mediumAnimTime));
            alphaAnimation.setAnimationListener(new AnimationAnimationListenerC28445d(function0));
            view.startAnimation(alphaAnimation);
        }
        View view5 = (View) this.f61084m.getValue(this, kPropertyArr[2]);
        if (view5 != null) {
            view5.setVisibility(((C30360a) this.f61076e.invoke()).f61064a ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70253a(View view, C30366c c30366c) {
        c30366c.f61081j.m69592a(new C30148s(((C30360a) c30366c.f61076e.invoke()).f61065b, null, AbstractC28441c.m69321a(view.getResources().getString(R$string.sns_gallery_type))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70254a(C30366c c30366c, View view) {
        c30366c.f61078g.invoke();
    }
}
