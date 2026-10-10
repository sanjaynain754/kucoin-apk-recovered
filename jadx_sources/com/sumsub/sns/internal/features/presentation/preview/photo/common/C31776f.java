package com.sumsub.sns.internal.features.presentation.preview.photo.common;

import android.os.Bundle;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.common.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/f;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/m;", "Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/m;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSPreviewCommonDocumentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPreviewCommonDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/common/SNSPreviewCommonDocumentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,39:1\n106#2,15:40\n*S KotlinDebug\n*F\n+ 1 SNSPreviewCommonDocumentFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/photo/common/SNSPreviewCommonDocumentFragment\n*L\n15#1:40,15\n*E\n"})
public final class C31776f extends AbstractC31826m<C31783m> {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f64568U = 0;

    /* JADX INFO: renamed from: u */
    public final Lazy f64569u;

    @Override // com.sumsub.sns.internal.features.presentation.preview.photo.AbstractC31826m
    /* JADX INFO: renamed from: l */
    public final void mo70873l() {
        AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70872a(C31776f c31776f) {
        Bundle arguments = c31776f.getArguments();
        return new C31784n(arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null, c31776f, c31776f.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31776f.getArguments());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31783m) this.f64569u.getValue();
    }

    public C31776f() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.common.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31776f.m70872a(this.f64567b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31772b(new C31771a(this)));
        this.f64569u = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31783m.class), new C31773c(lazy), new C31774d(lazy), function0);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getIdDocSetType() {
        Document document;
        C29070X type;
        String str;
        Bundle arguments = getArguments();
        Document document2 = null;
        if (arguments != null) {
            document = (Document) arguments.getParcelable("ARGS_DOCUMENT");
        } else {
            document = null;
        }
        if (document != null) {
            document2 = document;
        }
        if (document2 != null && (type = document2.getType()) != null && (str = type.f59014a) != null) {
            return str;
        }
        return "TYPE_UNKNOWN";
    }
}
