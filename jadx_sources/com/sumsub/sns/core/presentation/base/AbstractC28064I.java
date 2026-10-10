package com.sumsub.sns.core.presentation.base;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.exifinterface.media.ExifInterface;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Deprecated(message = "Use SNSFragment")
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/core/presentation/base/s;", ExifInterface.LATITUDE_SOUTH, "Lcom/sumsub/sns/core/presentation/base/C;", "VM", "Lcom/sumsub/sns/core/presentation/base/l;", "<init>", "()V", "", "onDestroyView", "state", "prevState", "Landroid/os/Bundle;", "savedInstanceState", "handleState", "(Lcom/sumsub/sns/core/presentation/base/s;Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "lastViewState", "Lcom/sumsub/sns/core/presentation/base/s;", "", "value", "isPrepared", "Z", "()Z", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC28064I<S extends InterfaceC28147s, VM extends AbstractC28052C> extends AbstractC28133l<S, VM> {
    private boolean isPrepared;

    @Nullable
    private S lastViewState;

    /* JADX INFO: renamed from: isPrepared, reason: from getter */
    public final boolean getIsPrepared() {
        return this.isPrepared;
    }

    @CallSuper
    public void onViewModelPrepared(@Nullable Bundle savedInstanceState) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Lifecycle " + this + " onViewModelPrepared", null, 4, null);
        AbstractC28421U.m69305b(C41636g.m90881E(getViewModel$idensic_mobile_sdk_aar_defaultRelease().getViewState()), getViewLifecycleOwner(), new C28062H(this, savedInstanceState, null));
    }

    public void handleState(@NotNull S state, @Nullable S prevState, @Nullable Bundle savedInstanceState) {
        handleState(state, savedInstanceState);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.isPrepared = false;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC28073M0 abstractC28073M0;
        InterfaceC41678w<C28150t0> viewModelInternalState;
        super.onViewCreated(view, bundle);
        AbstractC28052C viewModel$idensic_mobile_sdk_aar_defaultRelease = getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        if (viewModel$idensic_mobile_sdk_aar_defaultRelease instanceof AbstractC28073M0) {
            abstractC28073M0 = (AbstractC28073M0) viewModel$idensic_mobile_sdk_aar_defaultRelease;
        } else {
            abstractC28073M0 = null;
        }
        if (abstractC28073M0 != null && (viewModelInternalState = abstractC28073M0.getViewModelInternalState()) != null) {
            AbstractC28421U.m69305b(viewModelInternalState, getViewLifecycleOwner(), new C28060G(this, bundle, null));
        }
    }
}
