package com.kubi.payment.p2p;

import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.data.entities.TaxInfo;
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

/* JADX INFO: compiled from: P2PHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.P2PHelper$showTaxExplainDialog$1", m90122f = "P2PHelper.kt", m90123i = {}, m90124l = {140}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PHelper$showTaxExplainDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fragmentManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PHelper$showTaxExplainDialog$1(FragmentManager fragmentManager, Continuation<? super P2PHelper$showTaxExplainDialog$1> continuation) {
        super(2, continuation);
        this.$fragmentManager = fragmentManager;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m48425h(final TaxInfo taxInfo, BaseViewHolder baseViewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_title);
        if (textView != null) {
            textView.setText(C27041f.m66668h(taxInfo != null ? taxInfo.getAlertTitle() : null));
        }
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_content);
        if (textView2 != null) {
            textView2.setText(C27041f.m66668h(taxInfo != null ? taxInfo.getAlertMessage() : null));
        }
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_learn_more);
        if (textView3 != null) {
            textView3.getPaint().setFlags(8);
            textView3.getPaint().setAntiAlias(true);
            C27046k.m66711z(textView3, 0L, new Function0() { // from class: com.kubi.payment.p2p.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PHelper$showTaxExplainDialog$1.m48426i(taxInfo);
                }
            }, 1, null);
        }
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.tv_confirm);
        if (textView4 != null) {
            C27046k.m66711z(textView4, 0L, new Function0() { // from class: com.kubi.payment.p2p.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PHelper$showTaxExplainDialog$1.m48427j(dialogFragmentHelper);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m48426i(TaxInfo taxInfo) {
        String strM66668h = C27041f.m66668h(taxInfo != null ? taxInfo.getLinkUrl() : null);
        if (strM66668h.length() > 0) {
            Router.f46192a.m56184f(strM66668h).m4048k();
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PHelper$showTaxExplainDialog$1(this.$fragmentManager, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PHelper$showTaxExplainDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m48427j(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
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
            P2PHelper p2PHelper = P2PHelper.f39683a;
            this.label = 1;
            obj = p2PHelper.m48409a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        final TaxInfo taxInfo = (TaxInfo) obj;
        if (taxInfo != null) {
            hit = taxInfo.getHit();
        } else {
            hit = null;
        }
        if (C27025c.m66566d(hit)) {
            DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_tax_explain, true).m54237f4(new Function2() { // from class: com.kubi.payment.p2p.l
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return P2PHelper$showTaxExplainDialog$1.m48425h(taxInfo, (BaseViewHolder) obj2, (DialogFragmentHelper) obj3);
                }
            }).show(this.$fragmentManager, "payment_p2p_tax_dialog");
        }
        return Unit.INSTANCE;
    }
}
