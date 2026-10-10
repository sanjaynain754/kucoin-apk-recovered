package com.sumsub.sns.internal.features.presentation.common;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentResultListener;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Deprecated(message = "Use SNSInstructionsAwareFragment")
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/common/H;", "Lcom/sumsub/sns/core/presentation/base/s;", ExifInterface.LATITUDE_SOUTH, "Lcom/sumsub/sns/core/presentation/base/M0;", "VM", "Lcom/sumsub/sns/core/presentation/base/I;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC30809H<S extends InterfaceC28147s, VM extends AbstractC28073M0> extends AbstractC28064I<S, VM> {
    /* JADX INFO: renamed from: a */
    public void mo70472a(boolean z11, Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: a */
    public static final void m70471a(AbstractC30809H abstractC30809H, String str, Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("payload");
        AbstractC28133l.Companion.getClass();
        abstractC30809H.mo70472a(bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY) == -1, parcelable);
    }

    /* JADX INFO: renamed from: f */
    public final String m70473f() {
        return "instructions_request_key_" + getF65006c() + "_" + Reflection.getOrCreateKotlinClass(getClass()).getQualifiedName();
    }

    /* JADX INFO: renamed from: g */
    public final void m70474g() {
        requireActivity().getSupportFragmentManager().setFragmentResultListener(m70473f(), this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.common.a0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                AbstractC30809H.m70471a(this.f62245a, str, bundle);
            }
        });
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I
    public void onViewModelPrepared(Bundle bundle) {
        super.onViewModelPrepared(bundle);
        m70474g();
    }
}
