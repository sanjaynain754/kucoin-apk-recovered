package com.kubi.spot.business.callAuction.callAuctionProcessDialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import w20.C45700a;

/* JADX INFO: compiled from: CallAuctionProcessContainerDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessContainerDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "isBottomSheet", "", "callAuctionProcessFragment", "Lcom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessFragment;", "getCallAuctionProcessFragment", "()Lcom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessFragment;", "callAuctionProcessFragment$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionProcessContainerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionProcessContainerDialog.kt\ncom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessContainerDialog\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,54:1\n43#2,7:55\n*S KotlinDebug\n*F\n+ 1 CallAuctionProcessContainerDialog.kt\ncom/kubi/spot/business/callAuction/callAuctionProcessDialog/CallAuctionProcessContainerDialog\n*L\n48#1:55,7\n*E\n"})
public final class CallAuctionProcessContainerDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f49832q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallAuctionProcessContainerDialog.m60496o4(this.f49843b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f49833r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.callAuction.callAuctionProcessDialog.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CallAuctionProcessContainerDialog.m60495l4(this.f49844b);
        }
    });

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: l4 */
    public static final CallAuctionProcessFragment m60495l4(CallAuctionProcessContainerDialog callAuctionProcessContainerDialog) {
        CallAuctionProcessFragment callAuctionProcessFragment = new CallAuctionProcessFragment();
        Bundle bundle = new Bundle();
        bundle.putString("symbol", callAuctionProcessContainerDialog.m60498n4());
        bundle.putString("from_page", "CallAuctionProcessContainerDialog");
        callAuctionProcessFragment.setArguments(bundle);
        return callAuctionProcessFragment;
    }

    /* JADX INFO: renamed from: m4 */
    public final CallAuctionProcessFragment m60497m4() {
        return (CallAuctionProcessFragment) this.f49833r0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n4 */
    public final String m60498n4() {
        return (String) this.f49832q0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.call_auction_process_container_layout, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getChildFragmentManager().isDestroyed() || getChildFragmentManager().isStateSaved() || m60497m4().isAdded()) {
            return;
        }
        try {
            getChildFragmentManager().beginTransaction().add(R$id.fragment_container_view, m60497m4()).commitNowAllowingStateLoss();
        } catch (Exception e11) {
            C45700a.m100877c(e11, "CallAuctionProcessContainerDialog");
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static final String m60496o4(CallAuctionProcessContainerDialog callAuctionProcessContainerDialog) {
        String string;
        Bundle arguments = callAuctionProcessContainerDialog.getArguments();
        if (arguments != null && (string = arguments.getString("symbol")) != null) {
            return string;
        }
        return "BTC-USDT";
    }
}
