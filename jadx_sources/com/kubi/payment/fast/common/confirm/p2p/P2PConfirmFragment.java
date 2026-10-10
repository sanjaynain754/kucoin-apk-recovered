package com.kubi.payment.fast.common.confirm.p2p;

import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.firebase.messaging.Constants;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.common.confirm.p2p.P2PConfirmVM;
import com.kubi.payment.util.P2PUtils;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import ht.C38301b1;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\b\u0010\u000f\u001a\u00020\u0007H\u0004¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/p2p/P2PConfirmFragment;", "VM", "Lcom/kubi/payment/fast/common/confirm/p2p/P2PConfirmVM;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "<init>", "()V", "onLimitTipReady", "", "needShow", "", "onPriceError", "trackOrderError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/network/retrofit/exception/ApiException;", "observeData", "showLimitAlertTip", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class P2PConfirmFragment<VM extends P2PConfirmVM> extends BaseFastFragment<VM> {

    /* JADX INFO: renamed from: com.kubi.payment.fast.common.confirm.p2p.P2PConfirmFragment$a */
    /* JADX INFO: compiled from: P2PConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20487a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38562b;

        public C20487a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38562b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f38562b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38562b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: K3 */
    public abstract void mo46356K3(boolean z11);

    /* JADX INFO: renamed from: L3 */
    public abstract void mo46357L3();

    /* JADX INFO: renamed from: O3 */
    public abstract void mo46359O3(@Nullable ApiException apiException);

    /* JADX INFO: renamed from: H3 */
    public static final Unit m46352H3(final P2PConfirmFragment p2PConfirmFragment, final Exception exc) {
        P2PUtils p2PUtils = P2PUtils.f40363a;
        if (!p2PUtils.m49820k(exc)) {
            if (exc instanceof ApiException) {
                C38301b1.m86441N(p2PConfirmFragment, (ApiException) exc, new Function0() { // from class: com.kubi.payment.fast.common.confirm.p2p.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return P2PConfirmFragment.m46354J3(this.f38571b, exc);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        FragmentManager childFragmentManager = p2PConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PUtils.m49818f(exc, childFragmentManager, new Function0() { // from class: com.kubi.payment.fast.common.confirm.p2p.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PConfirmFragment.m46353I3(this.f38570b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m46354J3(P2PConfirmFragment p2PConfirmFragment, Exception exc) {
        p2PConfirmFragment.mo46359O3((ApiException) exc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m46355N3(P2PConfirmFragment p2PConfirmFragment, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        View view = viewHolder.getView(R$id.tv_content);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        highlightTextHelper.m54120f((TextView) view, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(p2PConfirmFragment.getColorRes(R$color.primary))));
    }

    /* JADX INFO: renamed from: M3 */
    public final void m46358M3() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_c2c_advertisement_dialog_title).m54153J4(R$string.payment_c2c_deal_restrict_dialog_title).m54162S4(R$string.i_know, null).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.fast.common.confirm.p2p.e
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                P2PConfirmFragment.m46355N3(this.f38573b, baseViewHolder, dialogFragmentHelper);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m46351G3(P2PConfirmFragment p2PConfirmFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        p2PConfirmFragment.mo46356K3(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m46353I3(P2PConfirmFragment p2PConfirmFragment) {
        p2PConfirmFragment.mo46357L3();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        m45647o3().m46363A().observe(getViewLifecycleOwner(), new C20487a(new Function1() { // from class: com.kubi.payment.fast.common.confirm.p2p.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PConfirmFragment.m46351G3(this.f38568b, (Boolean) obj);
            }
        }));
        m45647o3().m46366x().observe(getViewLifecycleOwner(), new C20487a(new Function1() { // from class: com.kubi.payment.fast.common.confirm.p2p.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PConfirmFragment.m46352H3(this.f38569b, (Exception) obj);
            }
        }));
    }
}
