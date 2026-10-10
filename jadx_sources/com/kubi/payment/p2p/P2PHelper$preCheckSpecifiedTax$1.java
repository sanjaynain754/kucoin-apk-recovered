package com.kubi.payment.p2p;

import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: P2PHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.P2PHelper$preCheckSpecifiedTax$1", m90122f = "P2PHelper.kt", m90123i = {}, m90124l = {181}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PHelper$preCheckSpecifiedTax$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ Function0<Unit> $onContinue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PHelper$preCheckSpecifiedTax$1(Function0<Unit> function0, FragmentManager fragmentManager, Continuation<? super P2PHelper$preCheckSpecifiedTax$1> continuation) {
        super(2, continuation);
        this.$onContinue = function0;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX INFO: renamed from: h */
    public static final void m48417h(String str, final TaxInfo taxInfo, BaseViewHolder baseViewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.text_view);
        textView.setText(C27017c.f54310a.m66516f(R$string.payment_high_tax_content, str));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        highlightTextHelper.m54120f(textView, new Pair(textTagEnum, new UnderlineSpan()), new Pair(textTagEnum, new C27018c0(R$color.c_text, new View.OnClickListener() { // from class: com.kubi.payment.p2p.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                P2PHelper$preCheckSpecifiedTax$1.m48418i(taxInfo, dialogFragmentHelper, view);
            }
        })));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: i */
    public static final void m48418i(TaxInfo taxInfo, DialogFragmentHelper dialogFragmentHelper, View view) {
        Router.f46192a.m56184f(C27041f.m66669i(taxInfo != null ? taxInfo.getTradeProductUrl() : null, "kumex/trade")).m4048k();
        dialogFragmentHelper.dismiss();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PHelper$preCheckSpecifiedTax$1(this.$onContinue, this.$fragmentManager, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PHelper$preCheckSpecifiedTax$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: j */
    public static final void m48419j(Function0 function0, DialogInterface dialogInterface, int i11) {
        function0.invoke();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean hit;
        Boolean boolIsSpecified;
        String taxRate;
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
            if (taxInfo != null) {
                boolIsSpecified = taxInfo.isSpecified();
            } else {
                boolIsSpecified = null;
            }
            if (C27025c.m66566d(boolIsSpecified)) {
                if (taxInfo != null) {
                    taxRate = taxInfo.getTaxRate();
                } else {
                    taxRate = null;
                }
                final String strReplace$default = StringsKt.replace$default(C27039d.m66642b(DowngradeExKt.m66536f(C27041f.m66668h(taxRate))), "%", "", false, 4, (Object) null);
                AlertDialogFragmentHelper alertDialogFragmentHelperM54148E4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54169Z4(true).m54157N4(true).m54167X4(R$string.payment_high_tax_title).m54148E4(R$layout.payment_text_view, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.p2p.h
                    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                    /* JADX INFO: renamed from: b3 */
                    public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                        P2PHelper$preCheckSpecifiedTax$1.m48417h(strReplace$default, taxInfo, baseViewHolder, dialogFragmentHelper);
                    }
                });
                int i12 = R$string.payment_contiune;
                final Function0<Unit> function0 = this.$onContinue;
                alertDialogFragmentHelperM54148E4.m54162S4(i12, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.p2p.i
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i13) {
                        P2PHelper$preCheckSpecifiedTax$1.m48419j(function0, dialogInterface, i13);
                    }
                }).m54159P4(R$string.payment_cancel, null).show(this.$fragmentManager, "payment_p2p_tax_specified_dialog");
                return Unit.INSTANCE;
            }
        }
        this.$onContinue.invoke();
        return Unit.INSTANCE;
    }
}
