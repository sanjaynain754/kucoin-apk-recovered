package com.sumsub.sns.internal.features.presentation.preview.photo.poa;

import android.os.Bundle;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.poa.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/i;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSProofOfAddressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSProofOfAddressFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/poa/SNSProofOfAddressFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,47:1\n106#2,15:48\n27#3,4:63\n*S KotlinDebug\n*F\n+ 1 SNSProofOfAddressFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/poa/SNSProofOfAddressFragment\n*L\n24#1:48,15\n15#1:63,4\n*E\n"})
public final class C31922f extends AbstractC31826m<C31925i> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f64890U = 0;

    /* JADX INFO: renamed from: u */
    public final Lazy f64891u;

    /* JADX INFO: renamed from: v */
    public final Screen f64892v;

    /* JADX INFO: renamed from: w */
    public final Lazy f64893w;

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m
    /* JADX INFO: renamed from: l */
    public final void mo70873l() {
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: b */
    public static final ViewModelProvider.Factory m70948b(C31922f c31922f) {
        return new C31926j((Document) c31922f.f64891u.getValue(), c31922f, c31922f.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31922f.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getIdDocSetType() {
        return ((Document) this.f64891u.getValue()).getType().f59014a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Screen getScreen() {
        return this.f64892v;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31925i) this.f64893w.getValue();
    }

    public C31922f() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f64891u = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.poa.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31922f.m70947a(this.f64889b);
            }
        });
        this.f64892v = Screen.ProofOfAddressFormScreen;
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.poa.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31922f.m70948b(this.f64906b);
            }
        };
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C31918b(new C31917a(this)));
        this.f64893w = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31925i.class), new C31919c(lazy), new C31920d(lazy), function0);
    }

    /* JADX INFO: renamed from: a */
    public static final Document m70947a(C31922f c31922f) {
        Bundle arguments = c31922f.getArguments();
        if (arguments == null) {
            return null;
        }
        return (Document) AbstractC28437b.m69320a(arguments, "ARGS_DOCUMENT", Document.class, null);
    }
}
