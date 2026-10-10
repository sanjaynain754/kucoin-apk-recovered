package p497oe;

import android.content.DialogInterface;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$string;
import ne.SegmentTradeInputData;
import ne.SegmentTradeInputInterceptResult;
import org.jetbrains.annotations.NotNull;
import p557qe.InterfaceC43722d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import pe.C43449e;

/* JADX INFO: renamed from: oe.h */
/* JADX INFO: compiled from: SegmentImmediateFillTipDialog.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/dialog/SegmentImmediateFillTipDialog;", "", "intercept", "Lcom/kubi/core/spot/business/holder/intercept/input/SegmentImmediateFillIntercept;", "<init>", "(Lcom/kubi/core/spot/business/holder/intercept/input/SegmentImmediateFillIntercept;)V", "showImmediateFillTipDialog", "", "data", "Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputData;", "dispatcher", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;", "Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputInterceptResult;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43032h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C43449e f95218a;

    public C43032h(@NotNull C43449e intercept) {
        Intrinsics.checkNotNullParameter(intercept, "intercept");
        this.f95218a = intercept;
    }

    /* JADX INFO: renamed from: d */
    public static final void m94519d(InterfaceC43722d interfaceC43722d, C43032h c43032h, SegmentTradeInputData segmentTradeInputData, DialogInterface dialogInterface, int i11) {
        interfaceC43722d.mo96275b(c43032h.f95218a, new SegmentTradeInputInterceptResult(segmentTradeInputData, null, 2, null));
    }

    /* JADX INFO: renamed from: e */
    public static final void m94520e(InterfaceC43722d interfaceC43722d, C43032h c43032h, SegmentTradeInputData segmentTradeInputData, DialogInterface dialogInterface, int i11) {
        interfaceC43722d.mo96274a(c43032h.f95218a, segmentTradeInputData);
    }

    /* JADX INFO: renamed from: c */
    public final void m94521c(@NotNull final SegmentTradeInputData data, @NotNull final InterfaceC43722d<SegmentTradeInputData, SegmentTradeInputInterceptResult> dispatcher) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        BaseFragment baseFragmentMo22357H = data.getParentBehavior().mo22357H();
        if (baseFragmentMo22357H.isDetached()) {
            dispatcher.mo96275b(this.f95218a, new SegmentTradeInputInterceptResult(data, null, 2, null));
        } else {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kumex_notification).m54161R4(0).m54153J4(data.getIsBuy() ? R$string.kumex_segmented_immediate_fill_confirm_desc_buy : R$string.kumex_segmented_immediate_fill_confirm_desc_sell).m54159P4(R$string.modify, new DialogInterface.OnClickListener() { // from class: oe.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C43032h.m94519d(dispatcher, this, data, dialogInterface, i11);
                }
            }).m54162S4(R$string.bkumex_continue_make_order, new DialogInterface.OnClickListener() { // from class: oe.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C43032h.m94520e(dispatcher, this, data, dialogInterface, i11);
                }
            }).m54151H4(false).m54172c5(baseFragmentMo22357H.getChildFragmentManager());
        }
    }
}
