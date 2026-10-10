package com.sumsub.sns.core.presentation.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.flow.C41636g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\b\u0002\u0010\u0007*\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\nJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020$2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020'2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b(\u0010)R(\u0010+\u001a\u0004\u0018\u00018\u00002\b\u0010*\u001a\u0004\u0018\u00018\u00008\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m90084d2 = {"Lcom/sumsub/sns/core/presentation/base/F;", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/sumsub/sns/core/presentation/base/V;", ExifInterface.LATITUDE_SOUTH, "Lcom/sumsub/sns/core/presentation/base/C;", "Lcom/sumsub/sns/core/presentation/base/s;", "VM", "Lcom/sumsub/sns/core/presentation/base/l;", "<init>", "()V", "", "getLayoutId", "()Ljava/lang/Integer;", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "state", "handleState", "(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/internal/core/common/w;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/w;)Z", "Lcom/sumsub/sns/core/presentation/base/U;", "handleLoadingState", "(Lcom/sumsub/sns/core/presentation/base/U;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/S;", "handleErrorState", "(Lcom/sumsub/sns/core/presentation/base/S;Landroid/os/Bundle;)V", "value", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "getViewBinding", "()Landroidx/viewbinding/ViewBinding;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC28058F<V extends ViewBinding, S extends AbstractC28081V, VM extends AbstractC28052C> extends AbstractC28133l<InterfaceC28147s, VM> {

    @Nullable
    private V viewBinding;

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    @Nullable
    public final Integer getLayoutId() {
        return null;
    }

    public abstract ViewBinding provideViewBinding(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Nullable
    public final V getViewBinding() {
        return this.viewBinding;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleState(@NotNull InterfaceC28147s state, @Nullable Bundle savedInstanceState) {
        if (!(state instanceof AbstractC28081V)) {
            if (state instanceof C28080U) {
                handleLoadingState((C28080U) state, savedInstanceState);
            }
        } else {
            InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
            if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
                ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70632e(false);
            }
            handleSuccessState((AbstractC28081V) state, savedInstanceState);
        }
    }

    public void handleLoadingState(@NotNull C28080U state, @Nullable Bundle savedInstanceState) {
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70632e(true);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        V v11 = (V) provideViewBinding(inflater, container);
        this.viewBinding = v11;
        if (v11 != null) {
            return v11.getRoot();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.viewBinding = null;
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((AbstractC31275i2) ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).f63147e.getValue()).mo70632e(false);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public boolean onFinishCalled(@NotNull AbstractC28503w finishReason) {
        AbstractC28142p0 abstractC28142p0;
        AbstractC28052C viewModel$idensic_mobile_sdk_aar_defaultRelease = getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        if (viewModel$idensic_mobile_sdk_aar_defaultRelease instanceof AbstractC28142p0) {
            abstractC28142p0 = (AbstractC28142p0) viewModel$idensic_mobile_sdk_aar_defaultRelease;
        } else {
            abstractC28142p0 = null;
        }
        if (abstractC28142p0 != null && !abstractC28142p0.onFinishCalled(finishReason)) {
            return false;
        }
        m69084e();
        return true;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AbstractC28421U.m69305b(C41636g.m90881E(getViewModel$idensic_mobile_sdk_aar_defaultRelease().getViewState()), getViewLifecycleOwner(), new C28054D(this, savedInstanceState, null));
        AbstractC28421U.m69305b(C41636g.m90881E(((AbstractC28142p0) getViewModel$idensic_mobile_sdk_aar_defaultRelease()).getCommonUiViewState$idensic_mobile_sdk_aar_defaultRelease()), getViewLifecycleOwner(), new C28056E(this, null));
    }

    public void handleErrorState(@NotNull AbstractC28078S state, @Nullable Bundle savedInstanceState) {
    }

    public void handleSuccessState(AbstractC28081V abstractC28081V, Bundle bundle) {
    }
}
