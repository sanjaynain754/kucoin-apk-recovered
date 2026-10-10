package repayment.ext;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.unify.R$color;
import com.kubi.unify.R$string;
import com.kubi.utils.extensions.C27046k;
import l60.C42110e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import repayment.C44044f;
import repayment.UnifiedRepayFragment;
import repayment.UnifyLiabilityData;
import repayment.dialog.LiabilitySelectedDialog;

/* JADX INFO: renamed from: repayment.ext.h */
/* JADX INFO: compiled from: RepayLialityUIExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007"}, m90084d2 = {"initLiabilityUI", "", "Lrepayment/UnifiedRepayFragment;", "emptyLiabilityUI", "fillLiabilityData", "selectedLiability", "Lrepayment/UnifyLiabilityData;", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44042h {
    /* JADX INFO: renamed from: b */
    public static final void m97117b(@NotNull UnifiedRepayFragment unifiedRepayFragment) {
        Intrinsics.checkNotNullParameter(unifiedRepayFragment, "<this>");
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null) {
            BaseTextView tvLiabilityTitle = c42110eM97005r3.f93505w;
            Intrinsics.checkNotNullExpressionValue(tvLiabilityTitle, "tvLiabilityTitle");
            C22912t.m54411i(tvLiabilityTitle, R$color.c_icon);
            c42110eM97005r3.f93503u.setText(R$string.stub);
            C24277v.m58542g(c42110eM97005r3.f93492j, "");
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m97118c(@NotNull UnifiedRepayFragment unifiedRepayFragment, @Nullable UnifyLiabilityData unifyLiabilityData) {
        C42110e c42110eM97005r3;
        Intrinsics.checkNotNullParameter(unifiedRepayFragment, "<this>");
        if (unifyLiabilityData == null || (c42110eM97005r3 = unifiedRepayFragment.m97005r3()) == null) {
            return;
        }
        c42110eM97005r3.f93503u.setText(C44044f.m97127e(unifyLiabilityData, false));
        c42110eM97005r3.f93504v.setText(C44044f.m97125c(unifyLiabilityData));
        C24277v.m58542g(c42110eM97005r3.f93492j, unifyLiabilityData.getIconUrl());
    }

    /* JADX INFO: renamed from: d */
    public static final void m97119d(@NotNull final UnifiedRepayFragment unifiedRepayFragment) {
        Intrinsics.checkNotNullParameter(unifiedRepayFragment, "<this>");
        C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
        if (c42110eM97005r3 != null) {
            BaseTextView tvLiabilityTitle = c42110eM97005r3.f93505w;
            Intrinsics.checkNotNullExpressionValue(tvLiabilityTitle, "tvLiabilityTitle");
            C22912t.m54411i(tvLiabilityTitle, R$color.c_icon);
            View liabilityClickRectView = c42110eM97005r3.f93494l;
            Intrinsics.checkNotNullExpressionValue(liabilityClickRectView, "liabilityClickRectView");
            C27046k.m66711z(liabilityClickRectView, 0L, new Function0() { // from class: repayment.ext.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44042h.m97120e(unifiedRepayFragment);
                }
            }, 1, null);
            m97117b(unifiedRepayFragment);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m97120e(UnifiedRepayFragment unifiedRepayFragment) {
        LiabilitySelectedDialog.Companion companion = LiabilitySelectedDialog.f97280w0;
        UnifyLiabilityData value = unifiedRepayFragment.m97008u3().m96987w().getValue();
        FragmentManager childFragmentManager = unifiedRepayFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(value, childFragmentManager);
        return Unit.INSTANCE;
    }
}
