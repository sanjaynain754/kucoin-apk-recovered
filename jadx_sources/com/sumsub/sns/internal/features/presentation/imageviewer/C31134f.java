package com.sumsub.sns.internal.features.presentation.imageviewer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSImageButton;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28360y;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.presentation.util.C28971e;
import com.sumsub.sns.internal.features.presentation.imageviewer.pdf.C31145a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/imageviewer/f;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/y;", "Lcom/sumsub/sns/internal/features/presentation/imageviewer/i;", "Lcom/sumsub/sns/internal/features/presentation/imageviewer/m;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSImageViewerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSImageViewerFragment.kt\ncom/sumsub/sns/internal/features/presentation/imageviewer/SNSImageViewerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,170:1\n106#2,15:171\n1#3:186\n256#4,2:187\n256#4,2:189\n256#4,2:191\n256#4,2:193\n256#4,2:195\n256#4,2:197\n256#4,2:199\n256#4,2:201\n*S KotlinDebug\n*F\n+ 1 SNSImageViewerFragment.kt\ncom/sumsub/sns/internal/features/presentation/imageviewer/SNSImageViewerFragment\n*L\n30#1:171,15\n92#1:187,2\n93#1:189,2\n94#1:191,2\n95#1:193,2\n104#1:195,2\n105#1:197,2\n106#1:199,2\n107#1:201,2\n*E\n"})
public final class C31134f extends AbstractC28058F<C28360y, AbstractC31137i, C31141m> {

    /* JADX INFO: renamed from: a */
    public final Lazy f62956a;

    /* JADX INFO: renamed from: b */
    public final Lazy f62957b;

    /* JADX INFO: renamed from: a */
    public static final C28971e m70589a(C31134f c31134f) {
        return new C28971e(LifecycleOwnerKt.getLifecycleScope(c31134f.getViewLifecycleOwner()));
    }

    /* JADX INFO: renamed from: b */
    public static final ViewModelProvider.Factory m70591b(C31134f c31134f) {
        return new C31142n(c31134f, c31134f.getArguments(), c31134f.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease());
    }

    /* JADX INFO: renamed from: a */
    public static final void m70590a(C31134f c31134f, View view) {
        C28360y viewBinding = c31134f.getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57819b.rotateCW();
        }
        C28360y viewBinding2 = c31134f.getViewBinding();
        Integer numValueOf = viewBinding2 != null ? Integer.valueOf(viewBinding2.f57819b.getRotation()) : null;
        if (numValueOf != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("rotation", numValueOf.intValue());
            bundle.putSerializable("file", ((C31141m) c31134f.f62956a.getValue()).f62973b);
            Unit unit = Unit.INSTANCE;
            AbstractC28133l.setResult$default(c31134f, 0, bundle, 1, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m70592b(C31134f c31134f, View view) {
        C28360y viewBinding = c31134f.getViewBinding();
        if (viewBinding != null) {
            viewBinding.f57819b.rotateCCW();
        }
        C28360y viewBinding2 = c31134f.getViewBinding();
        Integer numValueOf = viewBinding2 != null ? Integer.valueOf(viewBinding2.f57819b.getRotation()) : null;
        if (numValueOf != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("rotation", numValueOf.intValue());
            bundle.putSerializable("file", ((C31141m) c31134f.f62956a.getValue()).f62973b);
            Unit unit = Unit.INSTANCE;
            AbstractC28133l.setResult$default(c31134f, 0, bundle, 1, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final C28367f getAnalyticsDelegate() {
        String string;
        Screen f62175b = getF62065t();
        Bundle bundle = ((C31141m) this.f62956a.getValue()).f62972a;
        if (bundle == null || (string = bundle.getString("arg_iddocsettype")) == null) {
            string = "TYPE_UNKNOWN";
        }
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("analyticsPayload") : null;
        Map<String, Object> openPayload = serializable instanceof Map ? (Map) serializable : null;
        if (openPayload == null) {
            openPayload = getOpenPayload();
        }
        return new C28367f(f62175b, string, openPayload);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF64225b() {
        String string;
        Bundle bundle = ((C31141m) this.f62956a.getValue()).f62972a;
        return (bundle == null || (string = bundle.getString("arg_iddocsettype")) == null) ? "TYPE_UNKNOWN" : string;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31141m) this.f62956a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        C28360y viewBinding;
        AbstractC31137i abstractC31137i = (AbstractC31137i) abstractC28081V;
        if (abstractC31137i instanceof C31135g) {
            C31135g c31135g = (C31135g) abstractC31137i;
            C28360y viewBinding2 = getViewBinding();
            if (viewBinding2 != null) {
                viewBinding2.f57819b.setVisibility(0);
                viewBinding2.f57820c.setVisibility(8);
                viewBinding2.f57822e.setVisibility(0);
                viewBinding2.f57821d.setVisibility(0);
                viewBinding2.f57819b.setImageBitmapWithRotation(c31135g.f62958a, c31135g.f62960c);
                return;
            }
            return;
        }
        if (!(abstractC31137i instanceof C31136h)) {
            throw new NoWhenBranchMatchedException();
        }
        C31136h c31136h = (C31136h) abstractC31137i;
        if (c31136h.f62961a == null || (viewBinding = getViewBinding()) == null) {
            return;
        }
        viewBinding.f57819b.setVisibility(8);
        viewBinding.f57820c.setVisibility(0);
        viewBinding.f57822e.setVisibility(8);
        viewBinding.f57821d.setVisibility(8);
        viewBinding.f57820c.setAdapter(new C31145a(c31136h.f62961a, c31136h.f62962b, (C28971e) this.f62957b.getValue()));
        viewBinding.f57820c.setOrientation(1);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_layout_image_viewer, viewGroup, false);
        int i11 = R$id.sns_image_view;
        SNSRotationZoomableImageView sNSRotationZoomableImageView = (SNSRotationZoomableImageView) ViewBindings.findChildViewById(viewInflate, i11);
        if (sNSRotationZoomableImageView != null) {
            i11 = R$id.sns_pager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(viewInflate, i11);
            if (viewPager2 != null) {
                i11 = R$id.sns_rotate_ccw;
                SNSImageButton sNSImageButton = (SNSImageButton) ViewBindings.findChildViewById(viewInflate, i11);
                if (sNSImageButton != null) {
                    i11 = R$id.sns_rotate_cw;
                    SNSImageButton sNSImageButton2 = (SNSImageButton) ViewBindings.findChildViewById(viewInflate, i11);
                    if (sNSImageButton2 != null) {
                        i11 = R$id.sns_toolbar;
                        if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                            return new C28360y((ConstraintLayout) viewInflate, sNSRotationZoomableImageView, viewPager2, sNSImageButton, sNSImageButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C31134f() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.imageviewer.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31134f.m70591b(this.f62977b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31130b(new C31129a(this)));
        this.f62956a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31141m.class), new C31131c(lazy), new C31132d(lazy), function0);
        this.f62957b = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.imageviewer.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31134f.m70589a(this.f62985b);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF62065t() {
        Screen screen;
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("analyticsScreen")) != null) {
            Screen.Companion.getClass();
            Screen[] screenArrValues = Screen.values();
            int length = screenArrValues.length;
            for (int i11 = 0; i11 < length; i11++) {
                screen = screenArrValues[i11];
                if (!Intrinsics.areEqual(screen.getText(), string)) {
                }
            }
            screen = null;
        } else {
            screen = null;
        }
        if (screen == null) {
            return Screen.ImageViewer;
        }
        return screen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setStatusBarColor(getStatusBarColor());
            window.setNavigationBarColor(getNavigationBarColor());
        }
        C28971e c28971e = (C28971e) this.f62957b.getValue();
        Iterator it = c28971e.f58891b.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC41775x1.a.m91377a((InterfaceC41775x1) ((Map.Entry) it.next()).getValue(), null, 1, null);
        }
        c28971e.f58891b.clear();
        c28971e.f58893d.evictAll();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int color;
        int i11;
        SNSImageButton sNSImageButton;
        SNSImageButton sNSImageButton2;
        super.onViewCreated(view, bundle);
        Integer numM69174a = AbstractC28234b.m69174a(view, SNSColorElement.BACKGROUND_COMMON);
        if (numM69174a != null) {
            color = numM69174a.intValue();
        } else {
            color = ContextCompat.getColor(requireContext(), R$color.sns_backgroundCommon);
        }
        view.setBackgroundColor(color);
        C28360y viewBinding = getViewBinding();
        if (viewBinding != null && (sNSImageButton2 = viewBinding.f57822e) != null) {
            sNSImageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.imageviewer.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31134f.m70590a(this.f62955b, view2);
                }
            });
        }
        C28360y viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (sNSImageButton = viewBinding2.f57821d) != null) {
            sNSImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.imageviewer.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31134f.m70592b(this.f62976b, view2);
                }
            });
        }
        Bundle bundle2 = ((C31141m) this.f62956a.getValue()).f62972a;
        if (bundle2 != null) {
            i11 = bundle2.getInt("rotation");
        } else {
            i11 = 0;
        }
        AbstractC28133l.setResult$default(this, i11, null, 2, null);
    }
}
