package com.kubi.futures.trade.welfare.airdrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.FuturesAirdropProfitEntity;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36751e;
import fm.C37567b;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: AirdropPositionPnlDetailsDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0017\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0002J\u0014\u0010+\u001a\u00020**\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020,R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u00063"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "getEntity", "()Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "entity$delegate", "Lkotlin/Lazy;", "initType", "", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogAirdropPnlBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogAirdropPnlBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getPositionPeriodTime", "", "positionPeriod", "", "(Ljava/lang/Long;)Ljava/lang/String;", "getSideDesc", "side", "getSideTextColor", "getSideBackgroundColor", "getMarginDesc", "marginMode", "gotoShare", "bitmap", "Landroid/graphics/Bitmap;", "createBitmap", "Landroid/content/Context;", "param", "Lcom/kubi/futures/trade/welfare/airdrop/AirdropShareParam;", "formatReferralCode", "Lcom/kubi/utils/StyledText;", "context", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAirdropPositionPnlDetailsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirdropPositionPnlDetailsDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,311:1\n143#2,20:312\n*S KotlinDebug\n*F\n+ 1 AirdropPositionPnlDetailsDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog\n*L\n72#1:312,20\n*E\n"})
public final class AirdropPositionPnlDetailsDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f24571q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirdropPositionPnlDetailsDialog.m28379o4(this.f24646b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f24572r0 = C45681e.m100799e(this, new Function1<AirdropPositionPnlDetailsDialog, C36751e>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirdropPositionPnlDetailsDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36751e invoke(@NotNull AirdropPositionPnlDetailsDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36751e.m82353a(fragment.requireView());
        }
    }, new Function1<C36751e, Unit>() { // from class: com.kubi.futures.trade.welfare.airdrop.AirdropPositionPnlDetailsDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36751e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36751e c36751e) {
            invoke(c36751e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f24570t0 = {Reflection.property1(new PropertyReference1Impl(AirdropPositionPnlDetailsDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogAirdropPnlBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f24569s0 = new Companion(null);

    /* JADX INFO: compiled from: AirdropPositionPnlDetailsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "profitEntity", "Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @Nullable FuturesAirdropProfitEntity profitEntity) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            AirdropPositionPnlDetailsDialog airdropPositionPnlDetailsDialog = new AirdropPositionPnlDetailsDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", profitEntity);
            airdropPositionPnlDetailsDialog.setArguments(bundle);
            airdropPositionPnlDetailsDialog.show(manager, "AirdropPositionPnlDetailsDialog");
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m28374A4(AirdropPositionPnlDetailsDialog airdropPositionPnlDetailsDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        airdropPositionPnlDetailsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m28380y4(AirdropPositionPnlDetailsDialog airdropPositionPnlDetailsDialog, FuturesAirdropProfitEntity futuresAirdropProfitEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        airdropPositionPnlDetailsDialog.dismissAllowingStateLoss();
        AirdropShareParam airdropShareParam = new AirdropShareParam(str, str2, futuresAirdropProfitEntity.getSide(), str3, str4, airdropPositionPnlDetailsDialog.getString(R$string.kumex_airdrop_card_title), str5, str6, str7, futuresAirdropProfitEntity.getProfit(), str8, futuresAirdropProfitEntity.getProfitRate(), str9);
        Context contextRequireContext = airdropPositionPnlDetailsDialog.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        airdropPositionPnlDetailsDialog.m28391x4(airdropPositionPnlDetailsDialog.m28382n4(contextRequireContext, airdropShareParam));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m28381z4(AirdropPositionPnlDetailsDialog airdropPositionPnlDetailsDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        airdropPositionPnlDetailsDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return -11;
    }

    /* JADX INFO: renamed from: n4 */
    public final Bitmap m28382n4(Context context, AirdropShareParam airdropShareParam) {
        CharSequence charSequenceM24440e;
        C43852m.m96595g("B6futures", "AirDropPositionCloseShare", null, null, 12, null);
        int iM6180b = C5267e0.m6180b() - C27029c.m66599b(context, 48);
        int i11 = (int) ((iM6180b * 1686) / 1125.0f);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.bkumex_fragment_share_airdrop_pnl, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tvContract);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.side);
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.pnl_desc);
        TextView textView4 = (TextView) viewInflate.findViewById(R$id.marginMode);
        TextView textView5 = (TextView) viewInflate.findViewById(R$id.leverage);
        TextView textView6 = (TextView) viewInflate.findViewById(R$id.trialTag);
        TextView textView7 = (TextView) viewInflate.findViewById(R$id.airdropMarginValue);
        TextView textView8 = (TextView) viewInflate.findViewById(R$id.airdropTimeValue);
        TextView textView9 = (TextView) viewInflate.findViewById(R$id.airdropPnlValue);
        TextView textView10 = (TextView) viewInflate.findViewById(R$id.airdropPnlRateValue);
        TextView textView11 = (TextView) viewInflate.findViewById(R$id.referralCode);
        TextView textView12 = (TextView) viewInflate.findViewById(R$id.airdropWithDrawAmountValue);
        String symbol = airdropShareParam.getSymbol();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(symbol), false, 2, null);
        if (contractEntityM99529O == null || (charSequenceM24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) == null) {
            charSequenceM24440e = symbol;
        }
        textView3.setText(context.getString(R$string.airdrop_pnl_share_desc));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView3);
        highlightTextHelper.m54120f(textView3, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.illustrationGreen))));
        textView.setText(charSequenceM24440e);
        textView2.setText(airdropShareParam.getSideStr());
        FuturesAirdropProfitEntity futuresAirdropProfitEntityM28384q4 = m28384q4();
        textView2.setBackgroundResource(m28387t4(C27041f.m66668h(futuresAirdropProfitEntityM28384q4 != null ? futuresAirdropProfitEntityM28384q4.getSide() : null)));
        FuturesAirdropProfitEntity futuresAirdropProfitEntityM28384q5 = m28384q4();
        textView2.setTextColor(m28389v4(C27041f.m66668h(futuresAirdropProfitEntityM28384q5 != null ? futuresAirdropProfitEntityM28384q5.getSide() : null)));
        textView4.setText(airdropShareParam.getMarginModeStr());
        textView5.setText(airdropShareParam.getLeverageStr());
        textView6.setText(airdropShareParam.getTrialTagStr());
        textView7.setText(airdropShareParam.getAirdropMarginStr());
        textView8.setText(airdropShareParam.getAirdropTimeStr());
        textView9.setText(airdropShareParam.getAirdropPnlStr());
        textView10.setText(airdropShareParam.getAirdropPnlRateStr());
        textView11.setText(m28383p4(context));
        textView12.setText(airdropShareParam.getAirdropWithDrawAmountStr());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BigDecimal airdropPnl = airdropShareParam.getAirdropPnl();
        if (airdropPnl == null) {
            airdropPnl = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        textView9.setTextColor(C22890g.m54281f(contextRequireContext, airdropPnl.compareTo(bigDecimal) > 0));
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        BigDecimal airdropPnlRate = airdropShareParam.getAirdropPnlRate();
        if (airdropPnlRate == null) {
            airdropPnlRate = bigDecimal;
        }
        textView10.setTextColor(C22890g.m54281f(contextRequireContext2, airdropPnlRate.compareTo(bigDecimal) > 0));
        Intrinsics.checkNotNull(viewInflate);
        return ViewExKt.m36491q(viewInflate, iM6180b, i11);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_airdrop_pnl, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        CharSequence charSequenceM24440e;
        String str;
        String strM92640e;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36751e c36751eM28390w4 = m28390w4();
        if (c36751eM28390w4 == null) {
            return;
        }
        final FuturesAirdropProfitEntity futuresAirdropProfitEntityM28384q4 = m28384q4();
        if (futuresAirdropProfitEntityM28384q4 == null) {
            dismissAllowingStateLoss();
            return;
        }
        C43852m.m96595g("B6futures", "AirDropPositionClose", null, null, 12, null);
        final String symbol = futuresAirdropProfitEntityM28384q4.getSymbol();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(symbol), false, 2, null);
        String settleCurrency = contractEntityM99529O != null ? contractEntityM99529O.getSettleCurrency() : null;
        int iM84623m = contractEntityM99529O != null ? C37567b.m84623m(contractEntityM99529O) : 2;
        if (contractEntityM99529O == null || (charSequenceM24440e = FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O)) == null) {
            charSequenceM24440e = symbol;
        }
        final String strM28388u4 = m28388u4(C27041f.m66668h(futuresAirdropProfitEntityM28384q4.getSide()));
        final String strM28385r4 = m28385r4(C27041f.m66668h(futuresAirdropProfitEntityM28384q4.getMarginMode()));
        final String strM36529c = C17054k0.m36529c(futuresAirdropProfitEntityM28384q4.getLeverage(), false);
        BigDecimal airdropPositionMargin = futuresAirdropProfitEntityM28384q4.getAirdropPositionMargin();
        final String strM93906g = C42828b.m93906g(airdropPositionMargin != null ? C42180b.m92640e(airdropPositionMargin, null, iM84623m, false, false, false, 0, null, 121, null) : null, C27041f.m66668h(settleCurrency), true, false, 4, null);
        final String strM28386s4 = m28386s4(futuresAirdropProfitEntityM28384q4.getPositionPeriod());
        BigDecimal profit = futuresAirdropProfitEntityM28384q4.getProfit();
        String strM93906g2 = C42828b.m93906g(profit != null ? C42180b.m92640e(profit, null, iM84623m, true, false, false, 0, null, 121, null) : null, C27041f.m66668h(settleCurrency), true, false, 4, null);
        BigDecimal profitRate = futuresAirdropProfitEntityM28384q4.getProfitRate();
        if (profitRate == null) {
            profitRate = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = profitRate;
        String strM92642g = bigDecimal != null ? C42180b.m92642g(bigDecimal, null, null, 0, true, false, false, 55, null) : null;
        BigDecimal withdrawAmount = futuresAirdropProfitEntityM28384q4.getWithdrawAmount();
        if (withdrawAmount != null) {
            strM92642g = strM92642g;
            strM92640e = C42180b.m92640e(withdrawAmount, null, iM84623m, true, false, false, 0, null, 121, null);
            str = strM93906g2;
        } else {
            str = strM93906g2;
            strM92640e = null;
        }
        final String strM93906g3 = C42828b.m93906g(strM92640e, C27041f.m66668h(settleCurrency), true, false, 4, null);
        c36751eM28390w4.f79939r.setText(charSequenceM24440e);
        c36751eM28390w4.f79937p.setText(strM28388u4);
        c36751eM28390w4.f79937p.setBackgroundResource(m28387t4(C27041f.m66668h(futuresAirdropProfitEntityM28384q4.getSide())));
        c36751eM28390w4.f79937p.setTextColor(m28389v4(C27041f.m66668h(futuresAirdropProfitEntityM28384q4.getSide())));
        c36751eM28390w4.f79936o.setText(strM28385r4);
        c36751eM28390w4.f79935n.setText(strM36529c);
        c36751eM28390w4.f79938q.setText(getString(R$string.kumex_airdrop_card_title));
        c36751eM28390w4.f79924c.setText(strM93906g);
        c36751eM28390w4.f79930i.setText(strM28386s4);
        c36751eM28390w4.f79928g.setText(str);
        c36751eM28390w4.f79927f.setText(strM92642g);
        BaseTextView baseTextView = c36751eM28390w4.f79928g;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BigDecimal profit2 = futuresAirdropProfitEntityM28384q4.getProfit();
        if (profit2 == null) {
            profit2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        baseTextView.setTextColor(C22890g.m54281f(contextRequireContext, profit2.compareTo(bigDecimal2) > 0));
        BaseTextView baseTextView2 = c36751eM28390w4.f79927f;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        baseTextView2.setTextColor(C22890g.m54281f(contextRequireContext2, bigDecimal.compareTo(bigDecimal2) > 0));
        c36751eM28390w4.f79932k.setText(strM93906g3);
        KcPrimaryButton tvRightBtn = c36751eM28390w4.f79941t;
        Intrinsics.checkNotNullExpressionValue(tvRightBtn, "tvRightBtn");
        final String str2 = strM92642g;
        final String str3 = str;
        ViewExtKt.m66575f(tvRightBtn, new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirdropPositionPnlDetailsDialog.m28380y4(this.f24647b, futuresAirdropProfitEntityM28384q4, symbol, strM28388u4, strM28385r4, strM36529c, strM93906g, strM28386s4, str3, str2, strM93906g3, (View) obj);
            }
        });
        ImageView ivClose = c36751eM28390w4.f79934m;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtKt.m66575f(ivClose, new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirdropPositionPnlDetailsDialog.m28381z4(this.f24587b, (View) obj);
            }
        });
        KcSecondaryButton tvLeftBtn = c36751eM28390w4.f79940s;
        Intrinsics.checkNotNullExpressionValue(tvLeftBtn, "tvLeftBtn");
        ViewExtKt.m66575f(tvLeftBtn, new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirdropPositionPnlDetailsDialog.m28374A4(this.f24589b, (View) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public final C27096v0 m28383p4(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strMo39e = IShareService.f49268a.get().mo39e();
        String string = context.getString(R$string.share_rcode, strMo39e);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(string);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, strMo39e, 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            iIndexOf$default = 0;
        }
        c27096v0.setSpan(new ForegroundColorSpan(context.getResources().getColor(R$color.c_text_white)), iIndexOf$default, string.length(), 33);
        return c27096v0;
    }

    /* JADX INFO: renamed from: q4 */
    public final FuturesAirdropProfitEntity m28384q4() {
        return (FuturesAirdropProfitEntity) this.f24571q0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public final String m28385r4(String str) {
        if (Intrinsics.areEqual(str, "CROSS")) {
            String string = getString(R$string.kumex_cross_position);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = getString(R$string.kumex_isolate_position);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX INFO: renamed from: s4 */
    public final String m28386s4(Long l11) {
        long jCeil = (long) Math.ceil(C27039d.m66653m(l11, 1L) / 3600.0d);
        if (jCeil < 24) {
            String string = getString(R$string.kumex_distance_settlement_hour_stub, String.valueOf(jCeil));
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = getString(R$string.margin_coupons_period_days, String.valueOf((long) Math.ceil(jCeil / 24.0d)));
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX INFO: renamed from: t4 */
    public final int m28387t4(String str) {
        return Intrinsics.areEqual(str, "buy") ? R$color.primary8 : R$color.brandRed8;
    }

    /* JADX INFO: renamed from: u4 */
    public final String m28388u4(String str) {
        if (Intrinsics.areEqual(str, "buy")) {
            String string = getString(R$string.contract_long);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = getString(R$string.contract_short);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX INFO: renamed from: v4 */
    public final int m28389v4(String str) {
        return Intrinsics.areEqual(str, "buy") ? requireContext().getColor(R$color.primary) : requireContext().getColor(R$color.brandGreen);
    }

    /* JADX INFO: renamed from: w4 */
    public final C36751e m28390w4() {
        return (C36751e) this.f24572r0.getValue(this, f24570t0[0]);
    }

    /* JADX INFO: renamed from: x4 */
    public final void m28391x4(Bitmap bitmap) {
        IShareService.Companion companion = IShareService.f49268a;
        IShareService.m59640c(companion.get(), new ImageShareParam("f_p_share", bitmap, false, companion.get().mo38d("f_p_share"), false, null, null, null, null, null, 1008, null), null, 2, null);
    }

    /* JADX INFO: renamed from: o4 */
    public static final FuturesAirdropProfitEntity m28379o4(AirdropPositionPnlDetailsDialog airdropPositionPnlDetailsDialog) {
        Bundle arguments = airdropPositionPnlDetailsDialog.getArguments();
        if (arguments != null) {
            return (FuturesAirdropProfitEntity) arguments.getParcelable("data");
        }
        return null;
    }
}
