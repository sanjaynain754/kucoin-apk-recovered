package com.sumsub.sns.internal.features.presentation.verification2.host;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.databinding.C28353r;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.screen.base.AbstractC28928l;
import com.sumsub.sns.internal.core.presentation.screen.base.C28929m;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;", "Lcom/sumsub/sns/internal/core/presentation/screen/base/l;", "Lcom/sumsub/sns/databinding/r;", "Lcom/sumsub/sns/internal/core/presentation/screen/base/m;", "Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/verification2/host/s", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nVerificationStepHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationStepHostFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/host/VerificationStepHostFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,102:1\n106#2,15:103\n27#3,4:118\n*S KotlinDebug\n*F\n+ 1 VerificationStepHostFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/host/VerificationStepHostFragment\n*L\n38#1:103,15\n26#1:118,4\n*E\n"})
public final class C32840y extends AbstractC28928l<C28353r, C28929m, C32814J> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f67186U = 0;

    /* JADX INFO: renamed from: a */
    public final Lazy f67187a;

    /* JADX INFO: renamed from: b */
    public final int f67188b;

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71351a(C32840y c32840y) {
        Bundle arguments = c32840y.getArguments();
        ValidationIdentifierType validationIdentifierType = arguments != null ? (ValidationIdentifierType) AbstractC28437b.m69320a(arguments, "VerificationType", ValidationIdentifierType.class, null) : null;
        if (validationIdentifierType == null) {
            throw new IllegalArgumentException("VerificationStepHostFragment requires ValidationIdentifierType in arguments");
        }
        Bundle arguments2 = c32840y.getArguments();
        boolean z11 = arguments2 != null ? arguments2.getBoolean("VerificationEmbedded", false) : false;
        Bundle arguments3 = c32840y.getArguments();
        return new C32815K(c32840y, validationIdentifierType, z11, arguments3 != null ? arguments3.getBoolean("SendPhoneCodeImmediately", false) : false);
    }

    @Override // com.sumsub.sns.internal.core.presentation.screen.base.AbstractC28928l
    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF67188b() {
        return this.f67188b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF63626a() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32814J) this.f67187a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (!(interfaceC28145r instanceof AbstractC32810F)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        AbstractC32810F abstractC32810F = (AbstractC32810F) interfaceC28145r;
        if (abstractC32810F instanceof C32808D) {
            if (isForResult()) {
                AbstractC28133l.setResult$default(this, 1, null, 2, null);
                return;
            } else {
                AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, new C28494t(), null, null, 6, null);
                return;
            }
        }
        if (abstractC32810F instanceof C32807C) {
            AbstractC28133l.setResult$default(this, 2, null, 2, null);
        } else if (abstractC32810F instanceof C32809E) {
            AbstractC28133l.setResult$default(this, 4, null, 2, null);
        } else {
            if (!(abstractC32810F instanceof C32806B)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC28133l.setResult$default(this, 5, null, 2, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28058F
    public final ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R$layout.sns_fragment_verification_host2, viewGroup, false);
        if (viewInflate != null) {
            return new C28353r((FrameLayout) viewInflate);
        }
        throw new NullPointerException("rootView");
    }

    public C32840y() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.host.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32840y.m71351a(this.f67181b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32837u(new C32836t(this)));
        this.f67187a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32814J.class), new C32838v(lazy), new C32839w(lazy), function0);
        this.f67188b = R$id.sns_verification_container;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66519e() {
        Bundle arguments = getArguments();
        ValidationIdentifierType validationIdentifierType = null;
        if (arguments != null) {
            validationIdentifierType = (ValidationIdentifierType) AbstractC28437b.m69320a(arguments, "VerificationType", ValidationIdentifierType.class, null);
        }
        if (validationIdentifierType != null) {
            int i11 = AbstractC32816L.f67159a[validationIdentifierType.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return "PHONE_VERIFICATION";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "EMAIL_VERIFICATION";
        }
        throw new IllegalArgumentException("VerificationStepHostFragment requires ValidationIdentifierType in arguments");
    }
}
