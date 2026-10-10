package repayment.ext;

import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.resources.widget.button.KcPrimaryButton;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import l60.C42110e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import repayment.UnifiedRepayFragment;

/* JADX INFO: compiled from: RepayFragmentExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a\f\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, m90084d2 = {"collectDataChange", "", "Lrepayment/UnifiedRepayFragment;", "updateConfirmEnable", "collectPageStateChange", "Lkotlinx/coroutines/Job;", "collectSelectedLiabilityData", "collectSelectedAssetListData", "collectEstimateRepayData", "collectEvent", "fillEstimateRepayListUI", "estimateRepayAmount", "", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RepayFragmentExtKt {
    /* JADX INFO: renamed from: c */
    public static final void m97090c(@NotNull UnifiedRepayFragment unifiedRepayFragment) {
        Intrinsics.checkNotNullParameter(unifiedRepayFragment, "<this>");
        m97093f(unifiedRepayFragment);
        m97095h(unifiedRepayFragment);
        m97094g(unifiedRepayFragment);
        m97091d(unifiedRepayFragment);
        m97092e(unifiedRepayFragment);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC41775x1 m97091d(UnifiedRepayFragment unifiedRepayFragment) {
        return C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(unifiedRepayFragment), C42911a.m94121c(), null, new RepayFragmentExtKt$collectEstimateRepayData$1(unifiedRepayFragment, null), 2, null);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC41775x1 m97092e(UnifiedRepayFragment unifiedRepayFragment) {
        return C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(unifiedRepayFragment), C42911a.m94121c(), null, new RepayFragmentExtKt$collectEvent$1(unifiedRepayFragment, null), 2, null);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC41775x1 m97093f(UnifiedRepayFragment unifiedRepayFragment) {
        return C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(unifiedRepayFragment), C42911a.m94121c(), null, new RepayFragmentExtKt$collectPageStateChange$1(unifiedRepayFragment, null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC41775x1 m97094g(UnifiedRepayFragment unifiedRepayFragment) {
        return C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(unifiedRepayFragment), C42911a.m94121c(), null, new RepayFragmentExtKt$collectSelectedAssetListData$1(unifiedRepayFragment, null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC41775x1 m97095h(UnifiedRepayFragment unifiedRepayFragment) {
        return C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(unifiedRepayFragment), C42911a.m94121c(), null, new RepayFragmentExtKt$collectSelectedLiabilityData$1(unifiedRepayFragment, null), 2, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m97096i(UnifiedRepayFragment unifiedRepayFragment, String str) {
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null) {
            c42110eM97005r3.f93502t.setText(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m97097j(UnifiedRepayFragment unifiedRepayFragment) {
        KcPrimaryButton kcPrimaryButton;
        boolean z11;
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null && (kcPrimaryButton = c42110eM97005r3.f93487e) != null) {
            if (unifiedRepayFragment.m97008u3().m96987w().getValue() != null && !unifiedRepayFragment.m97008u3().m96986v().getValue().isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            kcPrimaryButton.setEnabled(z11);
        }
    }
}
