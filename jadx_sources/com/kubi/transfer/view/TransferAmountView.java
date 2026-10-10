package com.kubi.transfer.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import c60.C4853g;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.transfer.C26268b;
import com.kubi.transfer.entity.AccountInfos;
import com.kubi.transfer.helper.C26320a;
import com.kubi.transfer.lib.R$color;
import com.kubi.transfer.lib.R$drawable;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$string;
import com.kubi.transfer.view.TransferAmountView;
import com.kubi.user.api.p;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27056j0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37890n;
import h60.C38126k;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45682f;

/* JADX INFO: compiled from: TransferAmountView.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 B2\u00020\u0001:\u0001BB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fJ\b\u0010%\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010\u000fJ>\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u000f2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0007J\u0015\u0010\u001c\u001a\u00020\"2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u00010\u000fJ\b\u00104\u001a\u0004\u0018\u000105J\b\u00106\u001a\u0004\u0018\u00010\u000fJ\u0006\u00107\u001a\u00020\"J\u0012\u00108\u001a\u00020\u00192\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0010\u0010;\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010<\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010=\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010>\u001a\u00020/J\u0016\u0010?\u001a\u00020\"2\u0006\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020/J\u0014\u0010@\u001a\u00020\"2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0!R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/kubi/transfer/view/TransferAmountView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferViewTransferAmountBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferAmountBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "displayBalance", "", "amount", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "inputAmount", "getInputAmount", "setInputAmount", "precision", "", "getPrecision", "()I", "setPrecision", "(I)V", "fragment", "Lcom/kubi/sdk/BaseFragment;", "onMultiAccountAvailableClick", "Lkotlin/Function0;", "", "bindFragment", "transferFragment", "initListener", "updateInfo", FirebaseAnalytics.Param.CURRENCY, "setAvailableBalance", "balance", "accountInfo", "Lcom/kubi/transfer/entity/AccountInfos;", "contractBalance", "Lcom/kubi/kumex/entity/BalanceEntity;", "isMultiAccountMode", "", "isShow", "(Ljava/lang/Integer;)V", "setLegalPrice", FirebaseAnalytics.Param.PRICE, "getEditText", "Landroid/widget/EditText;", "getEditTextValue", "clearText", "getPrecisionValue", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "incrementZero", "setContractExperience", "showContractExperienceTip", "checkTransferAmount", "showAvailableBalance", "setOnMultiAccountAvailableClick", TUIConstants.TUIChat.CALL_BACK, "Companion", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferAmountView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferAmountView.kt\ncom/kubi/transfer/view/TransferAmountView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,315:1\n41#2:316\n65#2:317\n80#2,7:318\n*S KotlinDebug\n*F\n+ 1 TransferAmountView.kt\ncom/kubi/transfer/view/TransferAmountView\n*L\n74#1:316\n74#1:317\n74#1:318,7\n*E\n"})
public final class TransferAmountView extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f52958n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public String f52959o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public String f52960p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public String f52961q;

    /* JADX INFO: renamed from: r */
    public int f52962r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public BaseFragment f52963s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public Function0<Unit> f52964t;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ KProperty<Object>[] f52957v = {Reflection.property1(new PropertyReference1Impl(TransferAmountView.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferViewTransferAmountBinding;", 0))};

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Companion f52956u = new Companion(null);

    /* JADX INFO: compiled from: TransferAmountView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/transfer/view/TransferAmountView$Companion;", "", "<init>", "()V", "TAG", "", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m64801k() {
        final C4853g binding = getBinding();
        if (binding != null) {
            BaseTextView tvAvailableAmount = binding.f4987f;
            Intrinsics.checkNotNullExpressionValue(tvAvailableAmount, "tvAvailableAmount");
            BaseTextView tvChooseAll = binding.f4989h;
            Intrinsics.checkNotNullExpressionValue(tvChooseAll, "tvChooseAll");
            C27046k.m66681D(new View[]{tvAvailableAmount, tvChooseAll}, new Function0() { // from class: h60.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAmountView.m64802l(this.f85787b, binding);
                }
            });
            LinearLayoutCompat llMultiAccountAvailableAmount = binding.f4986e;
            Intrinsics.checkNotNullExpressionValue(llMultiAccountAvailableAmount, "llMultiAccountAvailableAmount");
            C27046k.m66681D(new View[]{llMultiAccountAvailableAmount}, new Function0() { // from class: h60.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAmountView.m64803m(this.f85789b);
                }
            });
        }
    }

    public final void setPrecision(int i11) {
        this.f52962r = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferAmountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        FinancialInputEditText financialInputEditText;
        FilterEmojiEditText filterEmojiEditText;
        ShowHideTextView showHideTextView;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52958n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C4853g>() { // from class: com.kubi.transfer.view.TransferAmountView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C4853g invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C4853g.m4983a(C45682f.m100801b(viewGroup));
            }
        });
        this.f52959o = "";
        this.f52960p = "";
        this.f52961q = "0";
        this.f52962r = 8;
        LayoutInflater.from(context).inflate(R$layout.btransfer_view_transfer_amount, this);
        m64801k();
        C4853g binding = getBinding();
        if (binding != null && (showHideTextView = binding.f4991j) != null) {
            C24256n1.m58513c(showHideTextView);
        }
        C4853g binding2 = getBinding();
        if (binding2 != null && (filterEmojiEditText = binding2.f4983b) != null) {
            C26268b.m64515d(filterEmojiEditText, !C38126k.m86051a());
        }
        C4853g binding3 = getBinding();
        if (binding3 == null || (financialInputEditText = binding3.f4984c) == null) {
            return;
        }
        C26268b.m64515d(financialInputEditText, C38126k.m86051a());
    }

    private final C4853g getBinding() {
        return (C4853g) this.f52958n.getValue(this, f52957v[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m64802l(TransferAmountView transferAmountView, C4853g c4853g) {
        C44128b.m97259c("TransferAmountView", "设置availableAmount: " + transferAmountView.f52960p);
        c4853g.f4983b.setText(transferAmountView.f52960p);
        c4853g.f4984c.setBigDecimalValue(transferAmountView.f52960p);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m64803m(TransferAmountView transferAmountView) {
        Function0<Unit> function0 = transferAmountView.f52964t;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m64806w(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, p.a.d(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m64807f(@NotNull BaseFragment transferFragment) {
        Intrinsics.checkNotNullParameter(transferFragment, "transferFragment");
        this.f52963s = transferFragment;
    }

    @NotNull
    /* JADX INFO: renamed from: getAmount, reason: from getter */
    public final String getF52960p() {
        return this.f52960p;
    }

    @NotNull
    /* JADX INFO: renamed from: getInputAmount, reason: from getter */
    public final String getF52961q() {
        return this.f52961q;
    }

    /* JADX INFO: renamed from: getPrecision, reason: from getter */
    public final int getF52962r() {
        return this.f52962r;
    }

    /* JADX INFO: renamed from: i */
    public final int m64810i(CoinInfoEntity coinInfoEntity) {
        return C27039d.m66650j(coinInfoEntity != null ? Integer.valueOf(coinInfoEntity.getPrecision()) : null);
    }

    /* JADX INFO: renamed from: j */
    public final String m64811j(int i11) {
        if (i11 <= 0) {
            return "0";
        }
        BigDecimal bigDecimalMovePointLeft = BigDecimal.ONE.movePointLeft(i11);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMovePointLeft, "movePointLeft(...)");
        return C42180b.m92640e(bigDecimalMovePointLeft, null, i11, false, false, false, 0, null, 125, null);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n */
    public final void m64812n(@Nullable String str, @NotNull AccountInfos accountInfo, @Nullable BalanceEntity balanceEntity, @Nullable String str2, boolean z11, boolean z12) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        this.f52960p = C27041f.m66668h(str);
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
        this.f52959o = C27041f.m66669i(bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, this.f52962r, false, false, false, 0, null, 125, null) : null, "--");
        m64814t(z12, z11);
        C4853g binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f4992k) != null) {
            String str3 = String.format(C27017c.f54310a.m66516f(R$string.kc_transferpro_multi_amount, new Object[0]), Arrays.copyOf(new Object[]{this.f52959o}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            baseTextView2.setText(str3);
        }
        C4853g binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f4987f) != null) {
            baseTextView.setText(C27017c.f54310a.m66516f(R$string.avaliable_tips, new Object[0]) + ' ' + this.f52959o);
        }
        m64813o(accountInfo, balanceEntity, str2);
    }

    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f52960p = str;
    }

    public final void setInputAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f52961q = str;
    }

    public final void setLegalPrice(@Nullable String price) {
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        ShowHideTextView showHideTextView3;
        if (price == null || price.length() == 0) {
            C4853g binding = getBinding();
            if (binding == null || (showHideTextView = binding.f4991j) == null) {
                return;
            }
            ViewExtKt.m66577h(showHideTextView);
            return;
        }
        C4853g binding2 = getBinding();
        if (binding2 != null && (showHideTextView3 = binding2.f4991j) != null) {
            ViewExtKt.m66594y(showHideTextView3);
        }
        C4853g binding3 = getBinding();
        if (binding3 == null || (showHideTextView2 = binding3.f4991j) == null) {
            return;
        }
        showHideTextView2.setText(C27041f.m66668h(price));
    }

    public final void setOnMultiAccountAvailableClick(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f52964t = callback;
    }

    public final void setPrecision(@Nullable Integer precision) {
        FinancialInputEditText financialInputEditText;
        FilterEmojiEditText filterEmojiEditText;
        this.f52962r = C27039d.m66651k(precision, 8);
        C4853g binding = getBinding();
        if (binding != null && (filterEmojiEditText = binding.f4983b) != null) {
            filterEmojiEditText.setText("");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, C27017c.f54310a.m66516f(R$string.transfer_amount_min, new Object[0]), Arrays.copyOf(new Object[]{m64811j(C27039d.m66650j(precision))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            filterEmojiEditText.setHint(str);
            filterEmojiEditText.setFilters(new InputFilter[]{new C27056j0(C27039d.m66650j(precision))});
        }
        C4853g binding2 = getBinding();
        if (binding2 == null || (financialInputEditText = binding2.f4984c) == null) {
            return;
        }
        financialInputEditText.setBigDecimalValue("");
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.ENGLISH, C27017c.f54310a.m66516f(R$string.transfer_amount_min, new Object[0]), Arrays.copyOf(new Object[]{m64811j(C27039d.m66650j(precision))}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        financialInputEditText.setHint(str2);
        financialInputEditText.setMaxDecimalPlaces(C27039d.m66650j(precision));
    }

    /* JADX INFO: renamed from: u */
    public final void m64815u(BalanceEntity balanceEntity, String str) {
        FragmentManager childFragmentManager;
        BigDecimal trialLimit;
        BigDecimal trialBalance;
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.kumex_trial_takeout_tips;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((balanceEntity == null || (trialBalance = balanceEntity.getTrialBalance()) == null) ? null : C41014a.m89946t(trialBalance, null, IKuMexService.f28731a.get().mo33293w(str), false, false, false, true, false, null, 0, 413, null));
        sb2.append(' ');
        sb2.append(C27041f.m66668h(C27041f.m66677q(balanceEntity != null ? balanceEntity.getCurrency() : null)));
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((balanceEntity == null || (trialLimit = balanceEntity.getTrialLimit()) == null) ? null : C41014a.m89946t(trialLimit, null, IKuMexService.f28731a.get().mo33293w(str), false, false, false, true, false, null, 0, 413, null));
        sb3.append(' ');
        sb3.append(C27041f.m66668h(C27041f.m66677q(balanceEntity != null ? balanceEntity.getCurrency() : null)));
        String strM66516f = c27017c.m66516f(i11, string, sb3.toString());
        String strM66516f2 = c27017c.m66516f(R$string.note, new Object[0]);
        SpannableString spannableString = new SpannableString(strM66516f + strM66516f2);
        spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: h60.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferAmountView.m64806w(view);
            }
        }), StringsKt.indexOf$default((CharSequence) spannableString, strM66516f2, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, strM66516f2, 0, false, 6, (Object) null) + strM66516f2.length(), 18);
        BaseFragment baseFragment = this.f52963s;
        if (baseFragment == null || (childFragmentManager = baseFragment.getChildFragmentManager()) == null) {
            return;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54154K4(spannableString).m54162S4(R$string.already_know, null).m54172c5(childFragmentManager);
    }

    /* JADX INFO: renamed from: x */
    public final void m64816x(@Nullable String str) {
        BaseTextView baseTextView;
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(str));
        setPrecision(Integer.valueOf(m64810i(coinInfoEntityM85613u)));
        C4853g binding = getBinding();
        if (binding == null || (baseTextView = binding.f4990i) == null) {
            return;
        }
        baseTextView.setText(C27041f.m66677q(C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null)));
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m64804p(TransferAmountView transferAmountView, BalanceEntity balanceEntity, String str) {
        transferAmountView.m64815u(balanceEntity, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m64805r(TransferAmountView transferAmountView) {
        FilterEmojiEditText filterEmojiEditText;
        C4853g binding = transferAmountView.getBinding();
        if (binding != null && (filterEmojiEditText = binding.f4983b) != null) {
            filterEmojiEditText.setText(transferAmountView.f52960p);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m64808g() {
        String editTextValue = getEditTextValue();
        if (editTextValue == null) {
            editTextValue = "--";
        }
        this.f52961q = editTextValue;
        if (StringsKt.contains$default((CharSequence) editTextValue, (CharSequence) "--", false, 2, (Object) null)) {
            this.f52961q = "0";
        }
        double dM66538h = DowngradeExKt.m66538h(this.f52961q, 0.0d, 1, null);
        if (dM66538h == 0.0d) {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.amount_not_zero, new Object[0]), new Object[0]);
            return false;
        }
        if (this.f52960p.length() != 0 && dM66538h <= DowngradeExKt.m66538h(this.f52960p, 0.0d, 1, null)) {
            return true;
        }
        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.assets_amount_error2, new Object[0]), new Object[0]);
        return false;
    }

    @Nullable
    public final EditText getEditText() {
        if (C38126k.m86051a()) {
            C4853g binding = getBinding();
            if (binding == null) {
                return null;
            }
            return binding.f4984c;
        }
        C4853g binding2 = getBinding();
        if (binding2 == null) {
            return null;
        }
        return binding2.f4983b;
    }

    @Nullable
    public final String getEditTextValue() {
        FilterEmojiEditText filterEmojiEditText;
        Editable text;
        FinancialInputEditText financialInputEditText;
        BigDecimal bigDecimalValue;
        if (C38126k.m86051a()) {
            C4853g binding = getBinding();
            if (binding == null || (financialInputEditText = binding.f4984c) == null || (bigDecimalValue = financialInputEditText.getBigDecimalValue()) == null) {
                return null;
            }
            return bigDecimalValue.toString();
        }
        C4853g binding2 = getBinding();
        if (binding2 == null || (filterEmojiEditText = binding2.f4983b) == null || (text = filterEmojiEditText.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    /* JADX INFO: renamed from: h */
    public final void m64809h() {
        FinancialInputEditText financialInputEditText;
        FilterEmojiEditText filterEmojiEditText;
        C4853g binding = getBinding();
        if (binding != null && (filterEmojiEditText = binding.f4983b) != null) {
            filterEmojiEditText.setText("");
        }
        C4853g binding2 = getBinding();
        if (binding2 != null && (financialInputEditText = binding2.f4984c) != null) {
            financialInputEditText.setBigDecimalValue("");
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m64813o(AccountInfos accountInfos, final BalanceEntity balanceEntity, final String str) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Double dValueOf;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BigDecimal trialBalance;
        if (C26320a.m64604a() && accountInfos.getFromType() == AccountType.CONTRACT) {
            if (balanceEntity != null && (trialBalance = balanceEntity.getTrialBalance()) != null) {
                dValueOf = Double.valueOf(trialBalance.doubleValue());
            } else {
                dValueOf = null;
            }
            if (C27039d.m66646f(dValueOf) != 0.0d) {
                C4853g binding = getBinding();
                if (binding != null && (baseTextView4 = binding.f4987f) != null) {
                    C27046k.m66694i(baseTextView4, R$drawable.ic_info_contain_16, 0, 0, 6, null);
                    C27046k.m66702q(baseTextView4, ContextCompat.getColor(baseTextView4.getContext(), R$color.c_icon40));
                }
                C4853g binding2 = getBinding();
                if (binding2 != null && (baseTextView3 = binding2.f4987f) != null) {
                    C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: h60.h
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TransferAmountView.m64804p(this.f85790b, balanceEntity, str);
                        }
                    }, 1, null);
                    return;
                }
                return;
            }
        }
        C4853g binding3 = getBinding();
        if (binding3 != null && (baseTextView2 = binding3.f4987f) != null) {
            C27046k.m66694i(baseTextView2, 0, 0, 0, 6, null);
        }
        C4853g binding4 = getBinding();
        if (binding4 != null && (baseTextView = binding4.f4987f) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: h60.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferAmountView.m64805r(this.f85793b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m64814t(boolean z11, boolean z12) {
        LinearLayoutCompat linearLayoutCompat;
        BaseTextView baseTextView;
        boolean z13;
        C4853g binding = getBinding();
        if (binding != null && (baseTextView = binding.f4987f) != null) {
            if (z11 && !z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            C26268b.m64515d(baseTextView, z13);
        }
        C4853g binding2 = getBinding();
        if (binding2 != null && (linearLayoutCompat = binding2.f4986e) != null) {
            C26268b.m64515d(linearLayoutCompat, z12);
        }
    }
}
