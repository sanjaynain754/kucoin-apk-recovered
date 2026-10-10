package com.sumsub.sns.internal.core.presentation.bottomsheet;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.C7090R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28777j;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.C31905w;
import java.util.ArrayList;
import java.util.Map;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.bottomsheet.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28725i extends AbstractC28787t {

    /* JADX INFO: renamed from: j */
    public static final RectF f58411j = new RectF();

    /* JADX INFO: renamed from: e */
    public C28720d f58412e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f58413f;

    /* JADX INFO: renamed from: g */
    public final C28722f f58414g;

    /* JADX INFO: renamed from: h */
    public final C28723g f58415h;

    /* JADX INFO: renamed from: i */
    public final C28721e f58416i;

    public AbstractC28725i(AbstractC28133l abstractC28133l) {
        super(abstractC28133l, null);
        this.f58413f = new ArrayList();
        this.f58414g = new C28722f(this);
        this.f58415h = new C28723g(this);
        this.f58416i = new C28721e(this);
    }

    /* JADX INFO: renamed from: b */
    public static final View m69542b(AbstractC28725i abstractC28725i) {
        C28720d c28720d = abstractC28725i.f58412e;
        if (c28720d != null) {
            return c28720d.getView();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract View mo69543a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: a */
    public void mo69546a(BottomSheetBehavior bottomSheetBehavior) {
    }

    /* JADX INFO: renamed from: n */
    public abstract String mo69549n();

    /* JADX INFO: renamed from: o */
    public abstract InterfaceC28719c mo69550o();

    /* JADX INFO: renamed from: p */
    public abstract void mo69551p();

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX INFO: renamed from: a */
    public final void m69545a(FrameLayout frameLayout) {
        Integer num;
        Float fValueOf;
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.BOTTOM_SHEET_BACKGROUND;
            boolean zM69346a = AbstractC28458h.m69346a(frameLayout.getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map == null || (c28955c = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
        } else {
            num = null;
        }
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.BOTTOM_SHEET_CORNER_RADIUS;
            Map map2 = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map2 != null ? (AbstractC28962j) map2.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            if (c28956d != null) {
                fValueOf = c28956d.f58860a;
            } else {
                fValueOf = null;
            }
        } else {
            fValueOf = null;
        }
        Drawable background = frameLayout.getBackground();
        MaterialShapeDrawable materialShapeDrawable = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
        if (materialShapeDrawable == null) {
            if (num != null) {
                frameLayout.setBackgroundColor(0);
                return;
            }
            return;
        }
        if (fValueOf == null) {
            TypedValue typedValue = new TypedValue();
            fValueOf = !this.f58549a.requireContext().getTheme().resolveAttribute(C7090R.attr.shapeAppearanceMediumComponent, typedValue, true) ? null : Float.valueOf(ShapeAppearanceModel.builder(this.f58549a.requireContext(), typedValue.resourceId, 0).build().getTopLeftCornerSize().getCornerSize(f58411j));
        }
        if (fValueOf != null) {
            materialShapeDrawable.setShapeAppearanceModel(materialShapeDrawable.getShapeAppearanceModel().toBuilder().setTopLeftCorner(0, fValueOf.floatValue()).setTopRightCorner(0, fValueOf.floatValue()).setBottomLeftCorner(0, 0.0f).setBottomRightCorner(0, 0.0f).build());
        }
        if (num != null) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(num.intValue()));
            C28720d c28720d = this.f58412e;
            View view = c28720d != null ? c28720d.getView() : null;
            if (view != null) {
                view.setBackground(null);
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: i */
    public final void mo69531i() {
        FragmentManager childFragmentManager = this.f58549a.getChildFragmentManager();
        childFragmentManager.executePendingTransactions();
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(mo69549n());
        C28720d c28720d = fragmentFindFragmentByTag instanceof C28720d ? (C28720d) fragmentFindFragmentByTag : null;
        if (c28720d != null) {
            m69547a(c28720d);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m69553r() {
        FragmentManager childFragmentManager = this.f58549a.getChildFragmentManager();
        childFragmentManager.executePendingTransactions();
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(mo69549n());
        if ((fragmentFindFragmentByTag instanceof C28720d ? (C28720d) fragmentFindFragmentByTag : null) != null) {
            m69608b("Bottom sheet already visible");
            return;
        }
        C28720d c28720d = new C28720d();
        m69547a(c28720d);
        c28720d.show(this.f58549a.getChildFragmentManager(), mo69549n());
        m69608b("Showing bottom sheet");
    }

    /* JADX INFO: renamed from: b */
    public final C28778k m69548b(int i11) {
        C28778k c28778k = new C28778k(i11, new Function0() { // from class: com.sumsub.sns.internal.core.presentation.bottomsheet.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC28725i.m69542b(this.f58419b);
            }
        });
        this.f58413f.add(c28778k);
        return c28778k;
    }

    public AbstractC28725i(C31905w c31905w) {
        super(c31905w.f58549a, c31905w);
        this.f58413f = new ArrayList();
        this.f58414g = new C28722f(this);
        this.f58415h = new C28723g(this);
        this.f58416i = new C28721e(this);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
    }

    /* JADX INFO: renamed from: q */
    public void mo69552q() {
    }

    /* JADX INFO: renamed from: a */
    public static final View m69538a(AbstractC28725i abstractC28725i) {
        C28720d c28720d = abstractC28725i.f58412e;
        if (c28720d != null) {
            return c28720d.getView();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m69540a(BottomSheetDialog bottomSheetDialog) {
        Window window = bottomSheetDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.1f);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m69541a(AbstractC28725i abstractC28725i, Control control) {
        Map mapEmptyMap = MapsKt.emptyMap();
        InterfaceC28719c interfaceC28719cMo69550o = abstractC28725i.mo69550o();
        if (interfaceC28719cMo69550o instanceof C28718b) {
            C28367f.m69257a(abstractC28725i.f58549a.getAnalyticsDelegate(), ((C28718b) interfaceC28719cMo69550o).f58405a, abstractC28725i.f58549a.getAnalyticsDelegate().f57841b, control, mapEmptyMap, 16);
        } else {
            if (interfaceC28719cMo69550o instanceof C28717a) {
                C28367f analyticsDelegate = abstractC28725i.f58549a.getAnalyticsDelegate();
                C28367f.m69253a(analyticsDelegate.f57840a, analyticsDelegate.f57841b, control, mapEmptyMap, ((C28717a) interfaceC28719cMo69550o).f58404a);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C28777j m69544a(Function1 function1) {
        C28777j c28777j = new C28777j(function1, new Function0() { // from class: com.sumsub.sns.internal.core.presentation.bottomsheet.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC28725i.m69538a(this.f58420b);
            }
        });
        this.f58413f.add(c28777j);
        return c28777j;
    }

    /* JADX INFO: renamed from: a */
    public final void m69547a(C28720d c28720d) {
        C28720d c28720d2 = this.f58412e;
        if (c28720d2 == c28720d) {
            return;
        }
        if (c28720d2 != null) {
            c28720d2.f58406a = null;
            c28720d2.getLifecycle().removeObserver(this.f58414g);
            if (c28720d2.getView() != null) {
                c28720d2.getViewLifecycleOwner().getLifecycle().removeObserver(this.f58415h);
            }
        }
        this.f58412e = c28720d;
        c28720d.f58406a = this.f58416i;
        c28720d.getLifecycle().addObserver(this.f58414g);
        c28720d.getViewLifecycleOwnerLiveData().observe(c28720d, new C28724h(new Function1() { // from class: com.sumsub.sns.internal.core.presentation.bottomsheet.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC28725i.m69539a(this.f58418b, (LifecycleOwner) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69539a(AbstractC28725i abstractC28725i, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(abstractC28725i.f58415h);
        }
        return Unit.INSTANCE;
    }
}
