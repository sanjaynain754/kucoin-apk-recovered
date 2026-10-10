package com.sumsub.sns.internal.features.presentation.error;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.data.model.SNSNeedRestartSDKException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.databinding.C28341f;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.screen.base.ErrorClosure$Outcome;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29095c0;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29119g0;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/error/n;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/f;", "Lcom/sumsub/sns/internal/features/presentation/error/r;", "Lcom/sumsub/sns/internal/features/presentation/error/t;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/error/f", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSErrorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSErrorFragment.kt\ncom/sumsub/sns/internal/features/presentation/error/SNSErrorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n106#2,15:237\n1#3:252\n*S KotlinDebug\n*F\n+ 1 SNSErrorFragment.kt\ncom/sumsub/sns/internal/features/presentation/error/SNSErrorFragment\n*L\n50#1:237,15\n*E\n"})
public final class C30935n extends AbstractC28058F<C28341f, AbstractC30939r, C30941t> {

    /* JADX INFO: renamed from: a */
    public final Lazy f62478a;

    /* JADX INFO: renamed from: b */
    public final C28404L f62479b;

    /* JADX INFO: renamed from: c */
    public final C28404L f62480c;

    /* JADX INFO: renamed from: d */
    public final C28404L f62481d;

    /* JADX INFO: renamed from: e */
    public final C28404L f62482e;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty[] f62477g = {AbstractC28118g.m69077a(C30935n.class, "ivIcon", "getIvIcon()Lcom/sumsub/sns/core/widget/SNSImageView;", 0), AbstractC28118g.m69077a(C30935n.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30935n.class, "tvSubTitle", "getTvSubTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C30935n.class, "btn", "getBtn()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: f */
    public static final C30927f f62476f = new C30927f();

    /* JADX INFO: renamed from: a */
    public final void m70525a(AbstractC30939r abstractC30939r) {
        TextView textView;
        AbstractC29149l0 abstractC29149l0 = ((C30941t) this.f62478a.getValue()).f62492a;
        C28341f viewBinding = getViewBinding();
        if ((viewBinding != null ? viewBinding.f57722b.getChildCount() : 0) <= 0 && !Intrinsics.areEqual(abstractC30939r, C30936o.f62483a)) {
            if (Intrinsics.areEqual(abstractC30939r, C30938q.f62487a)) {
                m70524a(R$layout.sns_fragment_init_error, SNSIconHandler.SNSCommonIcons.ICON_WORDLESS_FAILURE.getImageName(), null, Control.CancelButton);
            } else if (abstractC29149l0 instanceof C29119g0) {
                m70524a(R$layout.sns_fragment_common_error, SNSIconHandler.SNSResultIcons.FAILURE.getImageName(), SNSStepState.REJECTED, Control.RetryButton);
            } else if (abstractC29149l0 instanceof C29131i0) {
                m70524a(R$layout.sns_fragment_network_error, SNSIconHandler.SNSResultIcons.WARNING.getImageName(), SNSStepState.PENDING, Control.RetryButton);
            } else {
                boolean z11 = abstractC29149l0 instanceof C29107e0;
                if (z11 && (((C29107e0) abstractC29149l0).f59055a instanceof SNSNeedRestartSDKException)) {
                    m70524a(R$layout.sns_fragment_common_error, SNSIconHandler.SNSResultIcons.FAILURE.getImageName(), SNSStepState.PROCESSING, Control.GoBackButton);
                } else if (z11) {
                    m70524a(R$layout.sns_fragment_common_error, SNSIconHandler.SNSResultIcons.FAILURE.getImageName(), SNSStepState.REJECTED, Control.GoBackButton);
                }
            }
        }
        if (abstractC30939r instanceof C30937p) {
            C28404L c28404l = this.f62480c;
            KProperty[] kPropertyArr = f62477g;
            TextView textView2 = (TextView) c28404l.getValue(this, kPropertyArr[1]);
            if (textView2 != null) {
                AbstractC28458h.m69341a(textView2, ((C30937p) abstractC30939r).f62484a);
            }
            TextView textView3 = (TextView) this.f62481d.getValue(this, kPropertyArr[2]);
            if (textView3 != null) {
                AbstractC28458h.m69341a(textView3, ((C30937p) abstractC30939r).f62485b);
            }
            View view = (View) this.f62482e.getValue(this, kPropertyArr[3]);
            TextView textView4 = view instanceof TextView ? (TextView) view : null;
            if (textView4 != null) {
                textView4.setText(((C30937p) abstractC30939r).f62486c);
            }
            if (!(((C30941t) this.f62478a.getValue()).f62492a instanceof C29107e0) || (textView = (TextView) this.f62481d.getValue(this, kPropertyArr[2])) == null) {
                return;
            }
            AbstractC28485q.m69381a(textView, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.error.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C30935n.m70522a(this.f62503b, (String) obj);
                }
            });
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getIdDocSetType() {
        return ((C30941t) this.f62478a.getValue()).f62493b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C30941t) this.f62478a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final /* bridge */ /* synthetic */ void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
        m70525a((AbstractC30939r) abstractC28081V);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final SNSCompletionResult onCancelResult() {
        return new SNSCompletionResult.AbnormalTermination(((C30941t) this.f62478a.getValue()).f62492a.mo69765c());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_error, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        return new C28341f(frameLayout, frameLayout);
    }

    public C30935n() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.error.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C30935n.m70521a(this.f62502b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C30931j(new C30930i(this)));
        this.f62478a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C30941t.class), new C30932k(lazy), new C30933l(lazy), function0);
        this.f62479b = new C28404L(R$id.sns_error_icon);
        this.f62480c = new C28404L(R$id.sns_error_title);
        this.f62481d = new C28404L(R$id.sns_error_subtitle);
        this.f62482e = new C28404L(R$id.sns_primary_button);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String message;
        super.onViewCreated(view, bundle);
        AbstractC29149l0 abstractC29149l0 = ((C30941t) this.f62478a.getValue()).f62492a;
        Throwable thMo69765c = abstractC29149l0.mo69765c();
        if (thMo69765c == null || (message = thMo69765c.getMessage()) == null) {
            message = "unknown";
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m90091to(Constants.IPC_BUNDLE_KEY_SEND_ERROR, message));
        Throwable thMo69765c2 = abstractC29149l0.mo69765c();
        if (thMo69765c2 instanceof SNSGeneralException) {
            SNSGeneralException sNSGeneralException = (SNSGeneralException) thMo69765c2;
            if (sNSGeneralException.getReason() != null) {
                mapMutableMapOf.put("reason", sNSGeneralException.getReason());
            }
        }
        C28367f.m69259a(getAnalyticsDelegate(), ((C30941t) this.f62478a.getValue()).f62497f, ((C30941t) this.f62478a.getValue()).f62493b, mapMutableMapOf, 8);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70522a(C30935n c30935n, String str) {
        AbstractC28052C.onLinkClicked$default((C30941t) c30935n.f62478a.getValue(), str, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70521a(C30935n c30935n) {
        return new C30942u(c30935n, c30935n.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c30935n.getAppListener$idensic_mobile_sdk_aar_defaultRelease(), c30935n.getArguments());
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[PHI: r5
      0x00d0: PHI (r5v15 java.lang.Integer) = (r5v14 java.lang.Integer), (r5v19 java.lang.Integer) binds: [B:43:0x00b7, B:48:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public final void m70524a(int i11, String str, SNSStepState sNSStepState, final Control control) {
        SNSColorElement sNSColorElement;
        SNSImageView sNSImageView;
        Integer numValueOf;
        String str2;
        SNSImageView sNSImageView2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        C28341f viewBinding = getViewBinding();
        layoutInflaterFrom.inflate(i11, viewBinding != null ? viewBinding.f57722b : null);
        C29095c0 c29095c0Mo69764b = ((C30941t) this.f62478a.getValue()).f62492a.mo69764b();
        if (sNSStepState != null && (sNSImageView2 = (SNSImageView) this.f62479b.getValue(this, f62477g[0])) != null) {
            SNSStepViewExtensionsKt.setSnsStepState(sNSImageView2, sNSStepState);
        }
        if (c29095c0Mo69764b != null && (str2 = c29095c0Mo69764b.f59047d) != null) {
            str = str2;
        }
        if (str != null) {
            Drawable drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), str);
            SNSImageView sNSImageView3 = (SNSImageView) this.f62479b.getValue(this, f62477g[0]);
            if (sNSImageView3 != null) {
                sNSImageView3.setImageDrawable(drawableOnResolveIcon);
            }
        }
        if (c29095c0Mo69764b != null && (sNSColorElement = c29095c0Mo69764b.f59048e) != null && (sNSImageView = (SNSImageView) this.f62479b.getValue(this, f62477g[0])) != null) {
            int i12 = AbstractC30928g.f62468a[sNSColorElement.ordinal()];
            if (i12 == 1) {
                numValueOf = Integer.valueOf(R$color.sns_backgroundNeutral);
            } else if (i12 == 2) {
                numValueOf = Integer.valueOf(R$color.sns_backgroundSuccess);
            } else if (i12 == 3) {
                numValueOf = Integer.valueOf(R$color.sns_backgroundWarning);
            } else if (i12 != 4) {
                numValueOf = i12 != 5 ? null : Integer.valueOf(R$color.sns_backgroundInfo);
            } else {
                numValueOf = Integer.valueOf(R$color.sns_backgroundCritical);
            }
            Integer numM69174a = AbstractC28234b.m69174a(sNSImageView, sNSColorElement);
            if (numM69174a == null) {
                numM69174a = numValueOf != null ? Integer.valueOf(ContextCompat.getColor(requireContext(), numValueOf.intValue())) : null;
                if (numM69174a != null) {
                    ViewCompat.setBackgroundTintList(sNSImageView, ColorStateList.valueOf(numM69174a.intValue()));
                }
            } else {
                ViewCompat.setBackgroundTintList(sNSImageView, ColorStateList.valueOf(numM69174a.intValue()));
            }
        }
        View view = (View) this.f62482e.getValue(this, f62477g[3]);
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.error.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C30935n.m70523a(control, this, view2);
                }
            });
        }
        initCommonUI();
        AbstractC28421U.m69305b(((C30941t) this.f62478a.getValue()).getCommonUiViewState$idensic_mobile_sdk_aar_defaultRelease(), getViewLifecycleOwner(), new C30929h(this, null));
    }

    /* JADX INFO: renamed from: a */
    public static final void m70523a(Control control, C30935n c30935n, View view) {
        if (control != null) {
            C28367f.m69257a(c30935n.getAnalyticsDelegate(), ((C30941t) c30935n.f62478a.getValue()).f62497f, ((C30941t) c30935n.f62478a.getValue()).f62493b, control, null, 24);
        }
        C30941t c30941t = (C30941t) c30935n.f62478a.getValue();
        c30941t.getClass();
        c30941t.f62498g = ErrorClosure$Outcome.ACTION;
        AbstractC28052C.finish$default(c30941t, null, null, null, null, 15, null);
    }
}
