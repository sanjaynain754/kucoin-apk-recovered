package p497oe;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.kubi.core.spot.business.holder.intercept.input.LimitPriceProtectVerifyIntercept;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import id.C38519a;
import io.chad.library.adapter.base.BaseViewHolder;
import ne.C42810c;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import ne.LimitTradeInputData;
import ne.LimitTradeInputInterceptResult;
import org.jetbrains.annotations.NotNull;
import p557qe.InterfaceC43722d;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import re.C43994a;
import y70.C46392a;

/* JADX INFO: renamed from: oe.e */
/* JADX INFO: compiled from: LimitPriceProtectTipDialog.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J,\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/dialog/LimitPriceProtectTipDialog;", "", "intercept", "Lcom/kubi/core/spot/business/holder/intercept/input/LimitPriceProtectVerifyIntercept;", "<init>", "(Lcom/kubi/core/spot/business/holder/intercept/input/LimitPriceProtectVerifyIntercept;)V", "showPriceRiskTipDialog", "", "data", "Lcom/kubi/core/spot/business/holder/intercept/data/LimitTradeInputData;", "dispatcher", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/TaskDispatcher;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "initRememberCheckbox", "rememberView", "Landroid/widget/CheckBox;", "fillTipContentRichText", "tipView", "Landroid/widget/TextView;", "confirmOrderAndContinue", "isRemember", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLimitPriceProtectTipDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitPriceProtectTipDialog.kt\ncom/kubi/core/spot/business/holder/intercept/dialog/LimitPriceProtectTipDialog\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,124:1\n75#2,2:125\n*S KotlinDebug\n*F\n+ 1 LimitPriceProtectTipDialog.kt\ncom/kubi/core/spot/business/holder/intercept/dialog/LimitPriceProtectTipDialog\n*L\n116#1:125,2\n*E\n"})
public final class C43029e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LimitPriceProtectVerifyIntercept f95211a;

    public C43029e(@NotNull LimitPriceProtectVerifyIntercept intercept) {
        Intrinsics.checkNotNullParameter(intercept, "intercept");
        this.f95211a = intercept;
    }

    /* JADX INFO: renamed from: i */
    public static final void m94509i(C43029e c43029e, LimitTradeInputData limitTradeInputData, final Ref.BooleanRef booleanRef, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_price_risk_tips);
        Intrinsics.checkNotNull(textView);
        c43029e.m94514f(textView, limitTradeInputData);
        final CheckBox checkBox = (CheckBox) viewHolder.getView(R$id.cb_remember_24_hour);
        Intrinsics.checkNotNull(checkBox);
        c43029e.m94515g(checkBox);
        C27046k.m66708w(checkBox, new Function2() { // from class: oe.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C43029e.m94510j(booleanRef, checkBox, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m94510j(Ref.BooleanRef booleanRef, CheckBox checkBox, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        booleanRef.element = checkBox.isChecked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m94511k(InterfaceC43722d interfaceC43722d, C43029e c43029e, LimitTradeInputData limitTradeInputData, DialogInterface dialogInterface, int i11) {
        interfaceC43722d.mo96275b(c43029e.f95211a, new LimitTradeInputInterceptResult(limitTradeInputData, null, 2, null));
        C43994a.f97233a.m96957b();
    }

    /* JADX INFO: renamed from: l */
    public static final void m94512l(C43029e c43029e, Ref.BooleanRef booleanRef, LimitTradeInputData limitTradeInputData, InterfaceC43722d interfaceC43722d, DialogInterface dialogInterface, int i11) {
        c43029e.m94513e(booleanRef.element, limitTradeInputData, interfaceC43722d);
        C43994a.f97233a.m96958c();
    }

    /* JADX INFO: renamed from: e */
    public final void m94513e(boolean z11, LimitTradeInputData limitTradeInputData, InterfaceC43722d<InterfaceC42808a, InterfaceC42809b> interfaceC43722d) {
        if (z11) {
            C46392a.m102330m(C38519a.f86479a.m87133h(), System.currentTimeMillis());
            C43994a.f97233a.m96956a();
        }
        interfaceC43722d.mo96274a(this.f95211a, limitTradeInputData);
    }

    /* JADX INFO: renamed from: h */
    public final void m94516h(@NotNull final LimitTradeInputData data, @NotNull final InterfaceC43722d<InterfaceC42808a, InterfaceC42809b> dispatcher) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        BaseFragment baseFragmentMo22357H = data.getParentBehavior().mo22357H();
        if (baseFragmentMo22357H.isDetached()) {
            dispatcher.mo96275b(this.f95211a, new LimitTradeInputInterceptResult(data, null, 2, null));
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kumex_order_confirm).m54161R4(0).m54148E4(R$layout.dialog_center_limit_price_rate_alert, new DialogFragmentHelper.InterfaceC22882b() { // from class: oe.a
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                C43029e.m94509i(this.f95199b, data, booleanRef, baseViewHolder, dialogFragmentHelper);
            }
        }).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: oe.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C43029e.m94511k(dispatcher, this, data, dialogInterface, i11);
            }
        }).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: oe.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C43029e.m94512l(this.f95205b, booleanRef, data, dispatcher, dialogInterface, i11);
            }
        }).m54151H4(false).m54172c5(baseFragmentMo22357H.getChildFragmentManager());
        C43994a.f97233a.m96959d(data.getIsBuy());
    }

    /* JADX INFO: renamed from: f */
    public final void m94514f(TextView textView, LimitTradeInputData limitTradeInputData) {
        String string = textView.getContext().getString(C42810c.m93840b(limitTradeInputData), limitTradeInputData.getInputLimitPrice().toPlainString(), limitTradeInputData.getQuoteCurrencyName(), C27039d.m66642b(limitTradeInputData.getPriceProtectionRate()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView.setText(new SpannableString(string));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        highlightTextHelper.m54120f(textView, new Pair(textTagEnum, new ForegroundColorSpan(C42810c.m93839a(limitTradeInputData, context))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text))));
    }

    /* JADX INFO: renamed from: g */
    public final void m94515g(CheckBox checkBox) {
        checkBox.setText(checkBox.getContext().getString(R$string.kc_trade_order_priceprotect_tip, TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_TRIGGER_EVALUATION));
        checkBox.setChecked(false);
    }
}
