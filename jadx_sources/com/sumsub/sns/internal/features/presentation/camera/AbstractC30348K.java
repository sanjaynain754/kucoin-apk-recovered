package com.sumsub.sns.internal.features.presentation.camera;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$string;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28137n;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.presentation.intro.C28236b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.core.common.AbstractC28441c;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.InterfaceC28407M0;
import com.sumsub.sns.internal.core.presentation.android.C28626A;
import com.sumsub.sns.internal.core.presentation.android.C28651g;
import com.sumsub.sns.internal.core.presentation.android.C28707v;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.C28746l;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.core.presentation.common.C28769e;
import com.sumsub.sns.internal.core.presentation.common.C28788u;
import com.sumsub.sns.internal.core.presentation.helper.camera.AbstractC28885f;
import com.sumsub.sns.internal.core.presentation.helper.camera.C28882c;
import com.sumsub.sns.internal.core.presentation.helper.camera.C28883d;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.documents.C30148s;
import com.sumsub.sns.internal.features.presentation.camera.AbstractC30359W;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.io.File;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/camera/K;", "Lcom/sumsub/sns/internal/features/presentation/camera/W;", "VM", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/camera/N;", "Lcom/sumsub/sns/internal/core/common/M0;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSCameraFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCameraFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/SNSCameraFragment\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,576:1\n37#2:577\n37#2:587\n256#3,2:578\n256#3,2:580\n254#3:582\n277#3,2:583\n256#3,2:585\n81#3:588\n256#3,2:589\n*S KotlinDebug\n*F\n+ 1 SNSCameraFragment.kt\ncom/sumsub/sns/internal/features/presentation/camera/SNSCameraFragment\n*L\n122#1:577\n294#1:587\n204#1:578,2\n217#1:580,2\n219#1:582\n225#1:583,2\n252#1:585,2\n473#1:588\n222#1:589,2\n*E\n"})
public abstract class AbstractC30348K<VM extends AbstractC30359W> extends AbstractC28064I<C30351N, VM> implements InterfaceC28407M0 {

    /* JADX INFO: renamed from: a */
    public final C30340C f61024a;

    /* JADX INFO: renamed from: b */
    public BottomSheetBehavior f61025b;

    /* JADX INFO: renamed from: c */
    public final C28707v f61026c;

    /* JADX INFO: renamed from: d */
    public final int f61027d;

    /* JADX INFO: renamed from: e */
    public C28746l f61028e;

    /* JADX INFO: renamed from: f */
    public AbstractC28885f f61029f;

    /* JADX INFO: renamed from: g */
    public final C28769e f61030g;

    /* JADX INFO: renamed from: h */
    public final CameraX$Mode f61031h;

    /* JADX INFO: renamed from: c */
    public static final C28651g m70210c(AbstractC30348K abstractC30348K) {
        return ((AbstractC30359W) abstractC30348K.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).f61063i;
    }

    /* JADX INFO: renamed from: a */
    public void mo70214a(C28740f c28740f) {
    }

    /* JADX INFO: renamed from: b */
    public void mo70221b(File file) {
    }

    /* JADX INFO: renamed from: f */
    public View mo70222f() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public abstract View mo70224h();

    /* JADX INFO: renamed from: i */
    public abstract TextView mo70225i();

    /* JADX INFO: renamed from: j */
    public abstract TextView mo70226j();

    /* JADX INFO: renamed from: k */
    public abstract TextView mo70227k();

    /* JADX INFO: renamed from: l */
    public abstract ViewGroup mo70228l();

    /* JADX INFO: renamed from: m */
    public abstract PreviewView mo70229m();

    /* JADX INFO: renamed from: n */
    public abstract boolean getF61467H();

    /* JADX INFO: renamed from: o */
    public abstract View mo70231o();

    /* JADX INFO: renamed from: p */
    public abstract View mo70232p();

    /* JADX INFO: renamed from: q */
    public abstract View mo70233q();

    /* JADX INFO: renamed from: r */
    public abstract View mo70234r();

    /* JADX INFO: renamed from: s */
    public abstract SNSToolbarView mo70235s();

    /* JADX INFO: renamed from: v */
    public abstract boolean getF62066u();

    /* JADX INFO: renamed from: b */
    public static final void m70209b(AbstractC30348K abstractC30348K, View view) {
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(abstractC30348K, null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a */
    public void mo70216a(Exception exc) {
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public CameraX$Mode getF61031h() {
        return this.f61031h;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public Map getClosePayload() {
        return this.f61026c.m69525u();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public Map getOpenPayload() {
        return this.f61026c.m69525u();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C30349L) {
            C28746l c28746l = this.f61028e;
            if (c28746l != null) {
                c28746l.m69574g();
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C28137n) {
            this.f61024a.m70201a((C28137n) interfaceC28145r);
        } else {
            super.handleEvent(interfaceC28145r);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m70215a((C30351N) interfaceC28147s);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        BottomSheetBehavior bottomSheetBehavior = this.f61025b;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
            m69084e();
            return true;
        }
        bottomSheetBehavior.setState(4);
        return false;
    }

    @Override // com.sumsub.sns.internal.core.common.InterfaceC28407M0
    public final Boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 != 24 && i11 != 25) {
            return null;
        }
        ((AbstractC30359W) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).mo70251g();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u */
    public final void m70237u() {
        C28746l c28746l;
        Logger.DefaultImpls.v$default(C33272c.f67812a, getLogTag(), "initCamera, cameraX mode = " + getF61031h(), null, 4, null);
        this.f61028e = new C28746l(getF61031h(), ((AbstractC30359W) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).mo70249e(), this.f61027d, ((AbstractC30359W) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).mo70250f(), getF62066u() ? CameraSelector.DEFAULT_FRONT_CAMERA : CameraSelector.DEFAULT_BACK_CAMERA, null, new C30346I(this));
        ((AbstractC30359W) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).getClass();
        if (C33048a.f67453P.m71434a() || (c28746l = this.f61028e) == null) {
            return;
        }
        c28746l.m69566a(getViewLifecycleOwner(), mo70229m(), (Function0) null);
    }

    public AbstractC30348K() {
        new C28788u(this);
        this.f61024a = new C30340C(this);
        this.f61026c = new C28707v(this, SetsKt.setOf(C28626A.f58259e), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC30348K.m70210c(this.f61120b);
            }
        }, (Function0) null, new C30347J(this), 24);
        this.f61027d = 1;
        this.f61030g = new C28769e(this, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC30348K.m70204a(this.f61123b, (C29054T) obj);
            }
        });
        this.f61031h = CameraX$Mode.PHOTO;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70204a(AbstractC30348K abstractC30348K, C29054T c29054t) {
        ((AbstractC30359W) abstractC30348K.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).mo70247a(c29054t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m70207b(AbstractC30348K abstractC30348K) {
        ((AbstractC30359W) abstractC30348K.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).mo70251g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final void m70211c(AbstractC30348K abstractC30348K, View view) {
        AbstractC30359W abstractC30359W = (AbstractC30359W) abstractC30348K.getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        abstractC30359W.getClass();
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "On Toggle Flash is clicked", null);
        AbstractC28073M0.updateState$default(abstractC30359W, false, new C30356T(null), 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f61025b = null;
        C28746l c28746l = this.f61028e;
        if (c28746l != null) {
            c28746l.m69572e();
        }
        this.f61028e = null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        Unit unit;
        Integer num;
        C28955c c28955c;
        super.onViewCreated(view, bundle);
        SNSToolbarView sNSToolbarViewMo70235s = mo70235s();
        ImageView imageView = null;
        if (sNSToolbarViewMo70235s != null) {
            sNSToolbarViewMo70235s.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC30348K.m70209b(this.f61104b, view2);
                }
            });
            sNSToolbarViewMo70235s.setOnOptionButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC30348K.m70211c(this.f61106b, view2);
                }
            });
            C28468k0 c28468k0 = C28468k0.f57983a;
            sNSToolbarViewMo70235s.setOptionButtonDrawable(c28468k0.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.TORCH_OFF.getImageName()));
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            SNSJsonCustomization customization = c28468k0.getCustomization();
            if (customization != null) {
                theme = customization.getTheme();
            } else {
                theme = null;
            }
            if (theme instanceof C28966p) {
                c28966p = (C28966p) theme;
            } else {
                c28966p = null;
            }
            if (c28966p != null) {
                boolean zM69346a = AbstractC28458h.m69346a(sNSToolbarViewMo70235s.getResources().getConfiguration());
                Map map = c28966p.f58877c;
                if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                    if (zM69346a) {
                        num = c28955c.f58858a;
                    } else {
                        num = c28955c.f58859b;
                    }
                } else {
                    num = null;
                }
                if (num != null) {
                    sNSToolbarViewMo70235s.setIconTintList(ColorStateList.valueOf(num.intValue()));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                sNSToolbarViewMo70235s.setIconTintList(ColorStateList.valueOf(ContextCompat.getColor(sNSToolbarViewMo70235s.getContext(), R$color.sns_cameraContent)));
            }
        }
        View viewMo70233q = mo70233q();
        if (viewMo70233q != null) {
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.h0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC30348K.m70207b(this.f61117b);
                }
            }, viewMo70233q);
            if (viewMo70233q instanceof ImageView) {
                imageView = (ImageView) viewMo70233q;
            }
            if (imageView != null) {
                imageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.TAKE_PHOTO.getImageName()));
            }
        }
        m70241y();
        m70236t();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I
    public final void onViewModelPrepared(Bundle bundle) {
        super.onViewModelPrepared(bundle);
        m70237u();
        SNSToolbarView sNSToolbarViewMo70235s = mo70235s();
        if (sNSToolbarViewMo70235s != null) {
            sNSToolbarViewMo70235s.setOptionButtonVisible(getF61467H());
        }
        this.f61026c.m69523s();
    }

    /* JADX INFO: renamed from: t */
    public final void m70236t() {
        BottomSheetBehavior bottomSheetBehaviorFrom;
        ViewGroup viewGroupMo70228l = mo70228l();
        if (viewGroupMo70228l != null) {
            bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewGroupMo70228l);
            bottomSheetBehaviorFrom.setHideable(false);
            bottomSheetBehaviorFrom.setPeekHeight(getResources().getDimensionPixelSize(R$dimen.sns_collapsed_intro_height));
        } else {
            bottomSheetBehaviorFrom = null;
        }
        this.f61025b = bottomSheetBehaviorFrom;
        View viewMo70224h = mo70224h();
        if (viewMo70224h != null) {
            viewMo70224h.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.camera.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC30348K.m70206a(this.f61131b, view);
                }
            });
            viewMo70224h.setAlpha(0.0f);
        }
        BottomSheetBehavior bottomSheetBehavior = this.f61025b;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new C30343F(this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX INFO: renamed from: y */
    public final void m70241y() {
        int i11;
        SNSCustomizationTheme theme;
        C28966p c28966p;
        Unit unit;
        Integer num;
        C28955c c28955c;
        final View viewMo70231o = mo70231o();
        if (viewMo70231o != null) {
            if (((AbstractC30359W) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).f61058d) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            viewMo70231o.setVisibility(i11);
            C28468k0 c28468k0 = C28468k0.f57983a;
            Drawable drawableOnResolveIcon = c28468k0.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.GALLERY.getImageName());
            SNSColorElement sNSColorElement = SNSColorElement.CAMERA_CONTENT;
            SNSJsonCustomization customization = c28468k0.getCustomization();
            ImageView imageView = null;
            if (customization != null) {
                theme = customization.getTheme();
            } else {
                theme = null;
            }
            if (theme instanceof C28966p) {
                c28966p = (C28966p) theme;
            } else {
                c28966p = null;
            }
            if (c28966p != null) {
                boolean zM69346a = AbstractC28458h.m69346a(viewMo70231o.getResources().getConfiguration());
                Map map = c28966p.f58877c;
                if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                    if (zM69346a) {
                        num = c28955c.f58858a;
                    } else {
                        num = c28955c.f58859b;
                    }
                } else {
                    num = null;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (drawableOnResolveIcon != null) {
                        drawableOnResolveIcon.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                int color = ContextCompat.getColor(viewMo70231o.getContext(), R$color.sns_cameraContent);
                if (drawableOnResolveIcon != null) {
                    drawableOnResolveIcon.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
            }
            if (viewMo70231o instanceof ImageView) {
                imageView = (ImageView) viewMo70231o;
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawableOnResolveIcon);
            }
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.m0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC30348K.m70202a(viewMo70231o, this);
                }
            }, viewMo70231o);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo70220b(C30351N c30351n) {
        View viewMo70231o = mo70231o();
        if (viewMo70231o != null) {
            c30351n.getClass();
            viewMo70231o.setVisibility(((AbstractC30359W) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).f61058d ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70215a(C30351N c30351n) {
        String imageName;
        View viewFindViewById;
        CameraControl cameraControl;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("DocCapture", "handleState: " + c30351n, null);
        boolean z11 = c30351n.f61035d;
        PreviewView previewViewMo70229m = mo70229m();
        if (previewViewMo70229m != null) {
            previewViewMo70229m.setVisibility(0);
        }
        C28746l c28746l = this.f61028e;
        if (c28746l != null) {
            boolean z12 = c30351n.f61035d;
            c33270a.f67810a.mo68955d("CameraX", "Enable flash", null);
            Camera camera = c28746l.f58469n;
            if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
                cameraControl.enableTorch(z12);
            }
            ImageCapture imageCapture = c28746l.f58466k;
            if (imageCapture != null) {
                imageCapture.setFlashMode(z12 ? 1 : 2);
            }
        }
        SNSIconHandler iconHandler = C28468k0.f57983a.getIconHandler();
        Context contextRequireContext = requireContext();
        if (!z11) {
            imageName = SNSIconHandler.SNSCommonIcons.TORCH_OFF.getImageName();
        } else {
            imageName = SNSIconHandler.SNSCommonIcons.TORCH_ON.getImageName();
        }
        Drawable drawableOnResolveIcon = iconHandler.onResolveIcon(contextRequireContext, imageName);
        SNSToolbarView sNSToolbarViewMo70235s = mo70235s();
        if (sNSToolbarViewMo70235s != null) {
            sNSToolbarViewMo70235s.setOptionButtonDrawable(drawableOnResolveIcon);
        }
        View viewMo70233q = mo70233q();
        if (viewMo70233q != null) {
            viewMo70233q.setEnabled(c30351n.f61032a);
        }
        View viewMo70232p = mo70232p();
        if (viewMo70232p != null) {
            viewMo70232p.setVisibility(c30351n.f61034c ? 0 : 8);
        }
        View viewMo70234r = mo70234r();
        if ((viewMo70234r == null || viewMo70234r.getVisibility() != 0) && c30351n.f61033b) {
            m70218a(true, mo70234r(), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.camera.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC30348K.m70203a(this.f61126b);
                }
            });
        } else {
            View viewMo70234r2 = mo70234r();
            if (viewMo70234r2 != null) {
                viewMo70234r2.setVisibility(c30351n.f61033b ? 0 : 4);
            }
        }
        AbstractC28885f abstractC28885f = c30351n.f61036e;
        if (!Intrinsics.areEqual(this.f61029f, abstractC28885f)) {
            if (abstractC28885f instanceof C28883d) {
                C28883d c28883d = (C28883d) abstractC28885f;
                C28895g c28895g = c28883d.f58729a;
                Map map = c28883d.f58730b;
                View view = getView();
                if (view != null && (viewFindViewById = view.findViewById(R$id.sns_brief_details)) != null) {
                    viewFindViewById.setVisibility(8);
                }
                View view2 = getView();
                if (view2 != null) {
                    if (!m70219a(c28895g)) {
                        int i11 = R$id.sns_intro_content;
                        ViewGroup viewGroup = (ViewGroup) view2.findViewById(i11);
                        if (viewGroup != null) {
                            viewGroup.removeAllViews();
                        }
                        C28236b.m69184a(new C28236b(getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58179q, getAppListener$idensic_mobile_sdk_aar_defaultRelease()), view2, map, i11, -1);
                    }
                    ViewGroup viewGroupMo70228l = mo70228l();
                    if (viewGroupMo70228l != null) {
                        OneShotPreDrawListener.add(viewGroupMo70228l, new RunnableC30341D(viewGroupMo70228l, this));
                    }
                }
            } else if (abstractC28885f instanceof C28882c) {
                C28882c c28882c = (C28882c) abstractC28885f;
                m70217a(c28882c.f58725a, c28882c.f58726b, c28882c.f58727c, c28882c.f58728d);
            }
            this.f61029f = abstractC28885f;
        }
        mo70220b(c30351n);
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m70208b(AbstractC30348K abstractC30348K, String str) {
        AbstractC28052C.onLinkClicked$default(abstractC30348K.getViewModel$idensic_mobile_sdk_aar_defaultRelease(), str, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public void mo70239w() {
    }

    /* JADX INFO: renamed from: x */
    public void mo70240x() {
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70203a(AbstractC30348K abstractC30348K) {
        View viewMo70234r = abstractC30348K.mo70234r();
        if (viewMo70234r != null) {
            viewMo70234r.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public Object mo70213a(ImageProxy imageProxy, C28758x c28758x, C30345H c30345h) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public Object mo70212a(Bitmap bitmap, Continuation continuation) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70202a(View view, AbstractC30348K abstractC30348K) {
        abstractC30348K.f61030g.m69592a(new C30148s(((AbstractC30359W) abstractC30348K.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).f61055a, null, AbstractC28441c.m69321a(view.getResources().getString(R$string.sns_gallery_type))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70206a(AbstractC30348K abstractC30348K, View view) {
        BottomSheetBehavior bottomSheetBehavior = abstractC30348K.f61025b;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3) {
            return;
        }
        bottomSheetBehavior.setState(4);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70219a(C28895g c28895g) {
        View viewFindViewById;
        SNSInstructionsViewHandler instructionsViewHandler = C28468k0.f57983a.getInstructionsViewHandler();
        View viewOnVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), c28895g.f58752a, c28895g.f58754c, c28895g.f58753b, SNSInstructionsViewHandler.Position.BOTTOMSHEET.getValue(), c28895g.f58755d) : null;
        if (viewOnVerificationStep == null) {
            return false;
        }
        View view = getView();
        if (view != null && (viewFindViewById = view.findViewById(R$id.sns_brief_details)) != null) {
            viewFindViewById.setVisibility(8);
        }
        View view2 = getView();
        ViewGroup viewGroup = view2 != null ? (ViewGroup) view2.findViewById(R$id.sns_intro_content) : null;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (viewGroup == null) {
            return true;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.setMarginEnd(dimensionPixelSize);
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        Unit unit = Unit.INSTANCE;
        viewGroup.addView(viewOnVerificationStep, marginLayoutParams);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m70217a(String str, String str2, String str3, C28895g c28895g) {
        View viewFindViewById;
        View viewFindViewById2;
        if (mo70228l() == null) {
            return;
        }
        if (!m70219a(c28895g)) {
            View view = getView();
            if (view != null && (viewFindViewById2 = view.findViewById(R$id.sns_brief_details)) != null) {
                viewFindViewById2.setVisibility(0);
            }
            View view2 = getView();
            if (view2 != null && (viewFindViewById = view2.findViewById(R$id.sns_intro_content)) != null) {
                viewFindViewById.setVisibility(8);
            }
            TextView textViewMo70227k = mo70227k();
            if (textViewMo70227k != null) {
                textViewMo70227k.setText(str);
            }
            TextView textViewMo70225i = mo70225i();
            if (textViewMo70225i != null) {
                textViewMo70225i.setText(AbstractC28462i0.m69364a(str2, requireContext()));
            }
            TextView textViewMo70225i2 = mo70225i();
            if (textViewMo70225i2 != null) {
                AbstractC28485q.m69381a(textViewMo70225i2, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.n0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC30348K.m70205a(this.f61145b, (String) obj);
                    }
                });
            }
            TextView textViewMo70226j = mo70226j();
            if (textViewMo70226j != null) {
                textViewMo70226j.setText(AbstractC28462i0.m69364a(str3, requireContext()));
            }
            TextView textViewMo70226j2 = mo70226j();
            if (textViewMo70226j2 != null) {
                AbstractC28485q.m69381a(textViewMo70226j2, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.camera.o0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC30348K.m70208b(this.f61147b, (String) obj);
                    }
                });
            }
            BottomSheetBehavior bottomSheetBehavior = this.f61025b;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(false);
                bottomSheetBehavior.addBottomSheetCallback(new C30344G(this));
            }
        }
        ViewGroup viewGroupMo70228l = mo70228l();
        if (viewGroupMo70228l != null) {
            OneShotPreDrawListener.add(viewGroupMo70228l, new RunnableC30341D(viewGroupMo70228l, this));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70205a(AbstractC30348K abstractC30348K, String str) {
        AbstractC28052C.onLinkClicked$default(abstractC30348K.getViewModel$idensic_mobile_sdk_aar_defaultRelease(), str, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70218a(boolean z11, View view, Function0 function0) {
        Resources resources;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        if (!z11) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        Context context = getContext();
        alphaAnimation.setDuration((context == null || (resources = context.getResources()) == null) ? 0 : resources.getInteger(R.integer.config_mediumAnimTime));
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC30342E(function0));
        if (view != null) {
            view.startAnimation(alphaAnimation);
        }
    }
}
