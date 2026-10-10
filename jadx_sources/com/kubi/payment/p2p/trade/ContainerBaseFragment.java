package com.kubi.payment.p2p.trade;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import ht.C38301b1;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContainerBaseFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/ContainerBaseFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "onCreateView", "Landroid/widget/FrameLayout;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "isFirst", "", "sendEvent", DbParams.KEY_CHANNEL_RESULT, "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ContainerBaseFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f39970V = new Companion(null);

    /* JADX INFO: renamed from: U */
    public boolean f39971U = true;

    /* JADX INFO: compiled from: ContainerBaseFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/ContainerBaseFragment$Companion;", "", "<init>", "()V", "CMD", "", "CHECK_TRADE_PWD", "SHOW_TRADE_NOTICE", "RESULT", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static final void m49038n3(ContainerBaseFragment containerBaseFragment, Object obj) {
        BaseFragment.hideLoadingDialog$default(containerBaseFragment, false, 1, null);
        containerBaseFragment.m49042q3(true);
    }

    /* JADX INFO: renamed from: o3 */
    public static final void m49039o3(ContainerBaseFragment containerBaseFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(containerBaseFragment, false, 1, null);
        if (th2 instanceof ApiException) {
            C38301b1.m86442O(containerBaseFragment, (ApiException) th2, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public static final void m49040p3(ContainerBaseFragment containerBaseFragment, DialogInterface dialogInterface) {
        containerBaseFragment.m49042q3(false);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public FrameLayout onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle bundle, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new FrameLayout(requireContext());
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "CMD") : null;
        if (Intrinsics.areEqual(strM56284y, "CHECK_TRADE_PWD")) {
            C38301b1.m86435H(this, ValidationBizEnum.OTC_SELL, null, new Consumer() { // from class: com.kubi.payment.p2p.trade.a
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ContainerBaseFragment.m49038n3(this.f40040b, obj);
                }
            }, new Consumer() { // from class: com.kubi.payment.p2p.trade.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ContainerBaseFragment.m49039o3(this.f40043b, (Throwable) obj);
                }
            }, new DialogInterface.OnDismissListener() { // from class: com.kubi.payment.p2p.trade.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ContainerBaseFragment.m49040p3(this.f40047b, dialogInterface);
                }
            }, 4, null);
        } else if (Intrinsics.areEqual(strM56284y, "SHOW_TRADE_NOTICE")) {
            Bundle arguments2 = getArguments();
            String strM56284y2 = arguments2 != null ? RouteExKt.m56284y(arguments2, "code") : null;
            Bundle arguments3 = getArguments();
            C38301b1.m86442O(this, new ApiException(strM56284y2, arguments3 != null ? RouteExKt.m56284y(arguments3, "msg") : null, null), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m49042q3(boolean z11) {
        if (this.f39971U) {
            this.f39971U = false;
            C12572a.m23695d("RESULT", Boolean.valueOf(z11), 0L, 4, null);
        }
    }
}
