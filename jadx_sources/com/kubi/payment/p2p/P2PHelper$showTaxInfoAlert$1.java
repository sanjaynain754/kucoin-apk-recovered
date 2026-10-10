package com.kubi.payment.p2p;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import y70.C46392a;

/* JADX INFO: compiled from: P2PHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.P2PHelper$showTaxInfoAlert$1", m90122f = "P2PHelper.kt", m90123i = {0}, m90124l = {97}, m90125m = "invokeSuspend", m90126n = {"needAlert"}, m90127s = {"Z$0"})
public final class P2PHelper$showTaxInfoAlert$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ FragmentManager $fragmentManager;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PHelper$showTaxInfoAlert$1(Function0<Unit> function0, FragmentManager fragmentManager, Continuation<? super P2PHelper$showTaxInfoAlert$1> continuation) {
        super(2, continuation);
        this.$callback = function0;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX INFO: renamed from: i */
    public static final void m48432i(final TaxInfo taxInfo, BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_message);
        if (textView != null) {
            textView.setText(C27041f.m66668h(taxInfo != null ? taxInfo.getAlertMessage() : null));
        }
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_learn_more);
        if (textView2 != null) {
            textView2.getPaint().setFlags(8);
            textView2.getPaint().setAntiAlias(true);
            C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.payment.p2p.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PHelper$showTaxInfoAlert$1.m48433j(taxInfo);
                }
            }, 1, null);
        }
        final ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_check);
        View view = baseViewHolder.getView(R$id.ll_check);
        if (view != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.p2p.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PHelper$showTaxInfoAlert$1.m48434k(imageView);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m48433j(TaxInfo taxInfo) {
        String strM66668h = C27041f.m66668h(taxInfo != null ? taxInfo.getLinkUrl() : null);
        if (strM66668h.length() > 0) {
            Router.f46192a.m56184f(strM66668h).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m48434k(ImageView imageView) {
        imageView.setImageResource(R$drawable.ic2_success_filled_20);
        C46392a.m102328k(PaymentStorageId.f40364a.m49844v(), false);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PHelper$showTaxInfoAlert$1(this.$callback, this.$fragmentManager, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PHelper$showTaxInfoAlert$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: l */
    public static final void m48435l(Function0 function0, DialogInterface dialogInterface, int i11) {
        function0.invoke();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean hit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            boolean zM102322d = C46392a.m102322d(PaymentStorageId.f40364a.m49844v(), true);
            if (!zM102322d) {
                this.$callback.invoke();
                return Unit.INSTANCE;
            }
            P2PHelper p2PHelper = P2PHelper.f39683a;
            this.Z$0 = zM102322d;
            this.label = 1;
            obj = p2PHelper.m48409a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        final TaxInfo taxInfo = (TaxInfo) obj;
        String alertTitle = null;
        if (taxInfo != null) {
            hit = taxInfo.getHit();
        } else {
            hit = null;
        }
        if (!C27025c.m66566d(hit)) {
            this.$callback.invoke();
            return Unit.INSTANCE;
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
        if (taxInfo != null) {
            alertTitle = taxInfo.getAlertTitle();
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54148E4 = alertDialogFragmentHelperNewInstanceAlert.m54168Y4(C27041f.m66668h(alertTitle)).m54148E4(R$layout.payment_dialog_revenue, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.p2p.o
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                P2PHelper$showTaxInfoAlert$1.m48432i(taxInfo, baseViewHolder, dialogFragmentHelper);
            }
        });
        int i12 = R$string.payment_i_understand;
        final Function0<Unit> function0 = this.$callback;
        alertDialogFragmentHelperM54148E4.m54162S4(i12, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                P2PHelper$showTaxInfoAlert$1.m48435l(function0, dialogInterface, i13);
            }
        }).show(this.$fragmentManager, "payment_p2p_revenue");
        return Unit.INSTANCE;
    }
}
