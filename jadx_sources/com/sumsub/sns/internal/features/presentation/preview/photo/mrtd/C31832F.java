package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$raw;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.databinding.C28345j;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.presentation.nfc.C28907l;
import com.sumsub.sns.internal.core.presentation.nfc.C28908m;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.data.model.common.C28988C2;
import com.sumsub.sns.internal.features.data.model.common.C28998E2;
import com.sumsub.sns.internal.features.data.model.common.MRTDInstructionType;
import com.sumsub.sns.nfc.R;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;", "Lcom/sumsub/sns/core/presentation/base/F;", "Lcom/sumsub/sns/databinding/j;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/S;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSMRTDReadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSMRTDReadFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/SNSMRTDReadFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,94:1\n106#2,15:95\n27#3,4:110\n*S KotlinDebug\n*F\n+ 1 SNSMRTDReadFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/SNSMRTDReadFragment\n*L\n37#1:95,15\n26#1:110,4\n*E\n"})
public final class C31832F extends AbstractC28058F<C28345j, AbstractC31844S, C31868f0> {

    /* JADX INFO: renamed from: a */
    public final Lazy f64692a = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C31832F.m70911b(this.f64780b);
        }
    });

    /* JADX INFO: renamed from: b */
    public final Lazy f64693b;

    /* JADX INFO: renamed from: a */
    public static final C31879j m70910a(C31832F c31832f) {
        return ((C31868f0) c31832f.f64693b.getValue()).f64769i;
    }

    /* JADX INFO: renamed from: c */
    public static final C31862d0 m70912c(C31832F c31832f) {
        return ((C31868f0) c31832f.f64693b.getValue()).f64770j;
    }

    /* JADX INFO: renamed from: d */
    public static final C31899t m70913d(C31832F c31832f) {
        int i11;
        MRTDInstructionType mRTDInstructionTypeMo69723h = ((AbstractC28978A2) c31832f.f64692a.getValue()).mo69723h();
        int i12 = mRTDInstructionTypeMo69723h == null ? -1 : AbstractC31911z.f64871a[mRTDInstructionTypeMo69723h.ordinal()];
        if (i12 != 1) {
            i11 = i12 != 2 ? R.raw.sns_animation_nfc_passport_2 : R.raw.sns_animation_nfc_passport_1;
        } else {
            i11 = R$raw.sns_animation_nfc_id_card;
        }
        return new C31899t(i11, ((AbstractC28978A2) c31832f.f64692a.getValue()).mo69721f(), ((AbstractC28978A2) c31832f.f64692a.getValue()).mo69718c());
    }

    /* JADX INFO: renamed from: e */
    public static final C28907l m70914e(C31832F c31832f) {
        return ((C31868f0) c31832f.f64693b.getValue()).f64768h;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m70915f(C31832F c31832f) {
        ((C31868f0) c31832f.f64693b.getValue()).intent(C31837K.f64700a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final ViewModelProvider.Factory m70916g(C31832F c31832f) {
        return new C31871g0(c31832f, c31832f.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31832f.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF62316b() {
        return ((AbstractC28978A2) this.f64692a.getValue()).mo69719d().getType().f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getLogTag() {
        return "SNSMRTDReadFragment";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        String str;
        AbstractC28978A2 abstractC28978A2 = (AbstractC28978A2) this.f64692a.getValue();
        if (abstractC28978A2 instanceof C28988C2) {
            str = "basic";
        } else {
            if (!(abstractC28978A2 instanceof C28998E2)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "kinegram";
        }
        return MapsKt.mapOf(TuplesKt.m90091to("reader", str));
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31868f0) this.f64693b.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_mrtd_read, viewGroup, false);
        SNSBackgroundConstraintLayout sNSBackgroundConstraintLayout = (SNSBackgroundConstraintLayout) viewInflate;
        int i11 = R$id.sns_custom_view_container;
        if (((FrameLayout) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
            i11 = R$id.sns_guideline_end;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                i11 = R$id.sns_guideline_start;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                    i11 = R$id.sns_primary_button;
                    if (((SNSPrimaryButton) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                        i11 = R$id.sns_secondary_button;
                        if (((SNSSecondaryButton) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                            i11 = R$id.sns_toolbar;
                            if (((SNSToolbarView) ViewBindings.findChildViewById(viewInflate, i11)) != null) {
                                return new C28345j(sNSBackgroundConstraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public C31832F() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31832F.m70916g(this.f64783b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31829B(new C31828A(this)));
        this.f64693b = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31868f0.class), new C31830C(lazy), new C31831D(lazy), function0);
        new C28908m(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31832F.m70914e(this.f64790b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31832F.m70915f(this.f64793b);
            }
        });
        new C31881k(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31832F.m70910a(this.f64796b);
            }
        });
        new C31905w(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31832F.m70912c(this.f64806b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31832F.m70913d(this.f64808b);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC28978A2 m70911b(C31832F c31832f) {
        Bundle arguments = c31832f.getArguments();
        if (arguments == null) {
            return null;
        }
        return (AbstractC28978A2) AbstractC28437b.m69320a(arguments, "ARGS_MRTD_DOCUMENT", AbstractC28978A2.class, null);
    }
}
