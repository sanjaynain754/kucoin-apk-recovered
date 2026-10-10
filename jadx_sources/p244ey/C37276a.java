package p244ey;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ey.a */
/* JADX INFO: compiled from: KcPrimaryButtonLoadingHost.kt */
/* JADX INFO: loaded from: classes40.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/safe/api/tradesecurity/KcPrimaryButtonLoadingHost;", "Lcom/kubi/safe/api/tradesecurity/TradeLoadingHost;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "findButton", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "findIn", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "showLoading", "", "hideLoading", "force", "", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKcPrimaryButtonLoadingHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KcPrimaryButtonLoadingHost.kt\ncom/kubi/safe/api/tradesecurity/KcPrimaryButtonLoadingHost\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class C37276a implements InterfaceC37277b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Fragment f82656a;

    public C37276a(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f82656a = fragment;
    }

    /* JADX INFO: renamed from: c */
    public final KcPrimaryButton m83447c() {
        View view = this.f82656a.getView();
        if (view != null) {
            return m83448d(view);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final KcPrimaryButton m83448d(View view) {
        if (view instanceof KcPrimaryButton) {
            return (KcPrimaryButton) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            KcPrimaryButton kcPrimaryButtonM83448d = m83448d(childAt);
            if (kcPrimaryButtonM83448d != null) {
                return kcPrimaryButtonM83448d;
            }
        }
        return null;
    }

    @Override // p244ey.InterfaceC37277b
    /* JADX INFO: renamed from: a */
    public void mo83446a(boolean z11) {
        KcPrimaryButton kcPrimaryButtonM83447c = m83447c();
        if (kcPrimaryButtonM83447c != null) {
            kcPrimaryButtonM83447c.mo28851l();
        }
    }

    @Override // p244ey.InterfaceC37277b
    public void showLoading() {
        KcPrimaryButton kcPrimaryButtonM83447c = m83447c();
        if (kcPrimaryButtonM83447c != null) {
            kcPrimaryButtonM83447c.m55043o();
        }
    }
}
