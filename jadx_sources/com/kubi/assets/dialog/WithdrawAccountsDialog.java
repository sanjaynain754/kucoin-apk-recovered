package com.kubi.assets.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.WithdrawAccountEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.LabelView;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SingleCurrencyBalance;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lb.C42153h;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p311hf.C38184b;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p637ta.C44761f0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: WithdrawAccountsDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u000eH\u0002J\u0018\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\rH\u0002J\u0010\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\rH\u0002J\b\u00101\u001a\u000202H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawAccountsDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "setMaxHeightRatio", "(F)V", "onConfirmSelected", "Lkotlin/Function1;", "", "", "", "getOnConfirmSelected", "()Lkotlin/jvm/functions/Function1;", "setOnConfirmSelected", "(Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/kubi/assets/databinding/AssetDialogWithdrawAccountsBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogWithdrawAccountsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "accountEntity", "Lcom/kubi/assets/entity/WithdrawAccountEntity;", "getAccountEntity", "()Lcom/kubi/assets/entity/WithdrawAccountEntity;", "accountEntity$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupViews", "updateTotalBalance", FirebaseAnalytics.Param.CURRENCY, "precision", "", "toTransfer", "code", "toConvert", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawAccountsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawAccountsDialog.kt\ncom/kubi/assets/dialog/WithdrawAccountsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,286:1\n143#2,20:287\n32#3:307\n23#3,2:321\n256#4,2:308\n256#4,2:310\n205#5,4:312\n188#5,3:316\n216#5,2:319\n*S KotlinDebug\n*F\n+ 1 WithdrawAccountsDialog.kt\ncom/kubi/assets/dialog/WithdrawAccountsDialog\n*L\n59#1:287,20\n159#1:307\n111#1:321,2\n174#1:308,2\n175#1:310,2\n207#1:312,4\n212#1:316,3\n219#1:319,2\n*E\n"})
public final class WithdrawAccountsDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public Function1<? super List<String>, Unit> f16962t0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f16960x0 = {Reflection.property1(new PropertyReference1Impl(WithdrawAccountsDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogWithdrawAccountsBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f16959w0 = new Companion(null);

    /* JADX INFO: renamed from: s0 */
    public float f16961s0 = 0.9f;

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final InterfaceC24293a f16963u0 = C45681e.m100799e(this, new Function1<WithdrawAccountsDialog, C44761f0>() { // from class: com.kubi.assets.dialog.WithdrawAccountsDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44761f0 invoke(@NotNull WithdrawAccountsDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44761f0.m99036a(fragment.requireView());
        }
    }, new Function1<C44761f0, Unit>() { // from class: com.kubi.assets.dialog.WithdrawAccountsDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44761f0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44761f0 c44761f0) {
            invoke(c44761f0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f16964v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawAccountsDialog.m16066w4(this.f17125b);
        }
    });

    /* JADX INFO: compiled from: WithdrawAccountsDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawAccountsDialog$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01a3 A[PHI: r11
      0x01a3: PHI (r11v18 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v21 int), (r11v21 int) binds: [B:99:0x0178, B:101:0x017e, B:103:0x0184, B:105:0x0196, B:107:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x01e9 A[PHI: r11
      0x01e9: PHI (r11v14 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v17 int), (r11v17 int) binds: [B:116:0x01be, B:118:0x01c4, B:120:0x01ca, B:122:0x01dc, B:124:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:176:0x02b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: A4 */
    private final void m16045A4() throws JSONException {
        int i11;
        final int i12;
        int i13;
        KuCheckBox kuCheckBox;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        KuCheckBox kuCheckBox2;
        KuCheckBox kuCheckBox3;
        KuCheckBox kuCheckBox4;
        SingleCurrencyBalance earnBalances;
        BigDecimal availableBalance;
        SingleCurrencyBalance tradeBalances;
        BigDecimal availableBalance2;
        KuCheckBox kuCheckBox5;
        KuCheckBox kuCheckBox6;
        KuCheckBox kuCheckBox7;
        BaseTextView baseTextView;
        String strM93906g;
        SingleCurrencyBalance earnBalances2;
        BigDecimal availableBalance3;
        BaseTextView baseTextView2;
        String strM93906g2;
        SingleCurrencyBalance tradeBalances2;
        BigDecimal availableBalance4;
        BaseTextView baseTextView3;
        SingleCurrencyBalance mainBalances;
        BigDecimal availableBalance5;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        View view;
        BaseTextView baseTextView6;
        KcPrimaryButton kcPrimaryButton;
        ConstraintLayout constraintLayout3;
        BaseTextView baseTextView7;
        ConstraintLayout constraintLayout4;
        ConstraintLayout constraintLayout5;
        CoinInfoEntity coinInfoEntity;
        CoinInfoEntity coinInfoEntity2;
        CoinInfoEntity coinInfoEntity3;
        WithdrawAccountEntity withdrawAccountEntityM16069x4 = m16069x4();
        final String code = (withdrawAccountEntityM16069x4 == null || (coinInfoEntity3 = withdrawAccountEntityM16069x4.getCoinInfoEntity()) == null) ? null : coinInfoEntity3.getCode();
        if (code == null) {
            code = "";
        }
        WithdrawAccountEntity withdrawAccountEntityM16069x5 = m16069x4();
        String currency = (withdrawAccountEntityM16069x5 == null || (coinInfoEntity2 = withdrawAccountEntityM16069x5.getCoinInfoEntity()) == null) ? null : coinInfoEntity2.getCurrency();
        final String str = currency == null ? "" : currency;
        WithdrawAccountEntity withdrawAccountEntityM16069x6 = m16069x4();
        final int iM66651k = C27039d.m66651k((withdrawAccountEntityM16069x6 == null || (coinInfoEntity = withdrawAccountEntityM16069x6.getCoinInfoEntity()) == null) ? null : Integer.valueOf(coinInfoEntity.getPrecision()), 8);
        WithdrawAccountEntity withdrawAccountEntityM16069x7 = m16069x4();
        boolean zM66566d = C27025c.m66566d(withdrawAccountEntityM16069x7 != null ? Boolean.valueOf(withdrawAccountEntityM16069x7.isShowFlashExchange()) : null);
        C44761f0 c44761f0M16070y4 = m16070y4();
        if (c44761f0M16070y4 != null && (constraintLayout5 = c44761f0M16070y4.f99864g) != null) {
            C27046k.m66711z(constraintLayout5, 0L, new Function0() { // from class: com.kubi.assets.dialog.b0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawAccountsDialog.m16046B4(this.f17019b, str, iM66651k);
                }
            }, 1, null);
        }
        C44761f0 c44761f0M16070y5 = m16070y4();
        if (c44761f0M16070y5 != null && (constraintLayout4 = c44761f0M16070y5.f99865h) != null) {
            C27046k.m66711z(constraintLayout4, 0L, new Function0() { // from class: com.kubi.assets.dialog.c0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawAccountsDialog.m16047C4(this.f17023b, str, iM66651k);
                }
            }, 1, null);
        }
        C44761f0 c44761f0M16070y6 = m16070y4();
        if (c44761f0M16070y6 != null && (baseTextView7 = c44761f0M16070y6.f99868k) != null) {
            baseTextView7.setText(C27017c.f54310a.m66516f(AccountType.FINANCE.getStrRes(), new Object[0]));
        }
        C44761f0 c44761f0M16070y7 = m16070y4();
        if (c44761f0M16070y7 != null && (constraintLayout3 = c44761f0M16070y7.f99863f) != null) {
            C27046k.m66711z(constraintLayout3, 0L, new Function0() { // from class: com.kubi.assets.dialog.d0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawAccountsDialog.m16048D4(this.f17027b, str, iM66651k);
                }
            }, 1, null);
        }
        C44761f0 c44761f0M16070y8 = m16070y4();
        if (c44761f0M16070y8 != null && (kcPrimaryButton = c44761f0M16070y8.f99859b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawAccountsDialog.m16049E4(this.f17032b);
                }
            }, 1, null);
        }
        C44761f0 c44761f0M16070y9 = m16070y4();
        if (c44761f0M16070y9 != null && (baseTextView6 = c44761f0M16070y9.f99878u) != null) {
            C27046k.m66711z(baseTextView6, 0L, new Function0() { // from class: com.kubi.assets.dialog.f0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawAccountsDialog.m16050F4(this.f17102b, code);
                }
            }, 1, null);
        }
        C44761f0 c44761f0M16070y10 = m16070y4();
        if (c44761f0M16070y10 != null && (view = c44761f0M16070y10.f99879v) != null) {
            AssetExKt.m15138z(view, zM66566d);
        }
        C44761f0 c44761f0M16070y11 = m16070y4();
        if (c44761f0M16070y11 != null && (baseTextView5 = c44761f0M16070y11.f99866i) != null) {
            AssetExKt.m15138z(baseTextView5, zM66566d);
        }
        C44761f0 c44761f0M16070y12 = m16070y4();
        if (c44761f0M16070y12 != null && (baseTextView4 = c44761f0M16070y12.f99866i) != null) {
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.assets.dialog.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawAccountsDialog.m16051G4(this.f17106b, code);
                }
            }, 1, null);
        }
        C44761f0 c44761f0M16070y13 = m16070y4();
        if (c44761f0M16070y13 == null || (baseTextView3 = c44761f0M16070y13.f99869l) == null) {
            i11 = 0;
            i12 = iM66651k;
        } else {
            WithdrawAccountEntity withdrawAccountEntityM16069x8 = m16069x4();
            if (withdrawAccountEntityM16069x8 == null || (mainBalances = withdrawAccountEntityM16069x8.getMainBalances()) == null || (availableBalance5 = mainBalances.getAvailableBalance()) == null) {
                i11 = 0;
                i12 = iM66651k;
            } else {
                i11 = 0;
                String strM92640e = C42180b.m92640e(availableBalance5, null, iM66651k, false, false, false, 0, null, 125, null);
                i12 = iM66651k;
                if (strM92640e == null || (strM93906g = C42828b.m93906g(strM92640e, str, true, false, 4, null)) == null) {
                }
                baseTextView3.setText(strM93906g);
            }
            String strM93906g3 = C42828b.m93906g("--", str, true, false, 4, null);
            baseTextView3.setText(strM93906g3);
        }
        C44761f0 c44761f0M16070y14 = m16070y4();
        if (c44761f0M16070y14 != null && (baseTextView2 = c44761f0M16070y14.f99876s) != null) {
            WithdrawAccountEntity withdrawAccountEntityM16069x9 = m16069x4();
            if (withdrawAccountEntityM16069x9 == null || (tradeBalances2 = withdrawAccountEntityM16069x9.getTradeBalances()) == null || (availableBalance4 = tradeBalances2.getAvailableBalance()) == null) {
                strM93906g2 = C42828b.m93906g("--", str, true, false, 4, null);
            } else {
                int i14 = i12;
                String strM92640e2 = C42180b.m92640e(availableBalance4, null, i14, false, false, false, 0, null, 125, null);
                i12 = i14;
                if (strM92640e2 == null || (strM93906g2 = C42828b.m93906g(strM92640e2, str, true, false, 4, null)) == null) {
                    strM93906g2 = C42828b.m93906g("--", str, true, false, 4, null);
                }
            }
            baseTextView2.setText(strM93906g2);
        }
        C44761f0 c44761f0M16070y15 = m16070y4();
        if (c44761f0M16070y15 != null && (baseTextView = c44761f0M16070y15.f99867j) != null) {
            WithdrawAccountEntity withdrawAccountEntityM16069x10 = m16069x4();
            if (withdrawAccountEntityM16069x10 == null || (earnBalances2 = withdrawAccountEntityM16069x10.getEarnBalances()) == null || (availableBalance3 = earnBalances2.getAvailableBalance()) == null) {
                strM93906g = C42828b.m93906g("--", str, true, false, 4, null);
            } else {
                int i15 = i12;
                String strM92640e3 = C42180b.m92640e(availableBalance3, null, i15, false, false, false, 0, null, 125, null);
                i12 = i15;
                if (strM92640e3 == null || (strM93906g = C42828b.m93906g(strM92640e3, str, true, false, 4, null)) == null) {
                    strM93906g = C42828b.m93906g("--", str, true, false, 4, null);
                }
            }
            baseTextView.setText(strM93906g);
        }
        m16068M4(str, i12);
        C44761f0 c44761f0M16070y16 = m16070y4();
        if (c44761f0M16070y16 != null && (kuCheckBox7 = c44761f0M16070y16.f99861d) != null) {
            kuCheckBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.dialog.h0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    WithdrawAccountsDialog.m16052H4(this.f17110b, str, i12, compoundButton, z11);
                }
            });
        }
        C44761f0 c44761f0M16070y17 = m16070y4();
        if (c44761f0M16070y17 != null && (kuCheckBox6 = c44761f0M16070y17.f99862e) != null) {
            kuCheckBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.dialog.i0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    WithdrawAccountsDialog.m16053I4(this.f17115b, str, i12, compoundButton, z11);
                }
            });
        }
        C44761f0 c44761f0M16070y18 = m16070y4();
        if (c44761f0M16070y18 != null && (kuCheckBox5 = c44761f0M16070y18.f99860c) != null) {
            kuCheckBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.assets.dialog.j0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    WithdrawAccountsDialog.m16054J4(this.f17120b, str, i12, compoundButton, z11);
                }
            });
        }
        List<String> listM15136x = AssetExKt.m15136x(C46392a.m102326h(C42153h.f93593a.m92508L(), "MAIN"));
        WithdrawAccountEntity withdrawAccountEntityM16069x11 = m16069x4();
        int i16 = (C27039d.m66650j((withdrawAccountEntityM16069x11 == null || (tradeBalances = withdrawAccountEntityM16069x11.getTradeBalances()) == null || (availableBalance2 = tradeBalances.getAvailableBalance()) == null) ? null : Integer.valueOf(availableBalance2.compareTo(BigDecimal.ZERO))) <= 0 || IUnifyAccountService.f53155a.get().mo64979C()) ? i11 : 1;
        WithdrawAccountEntity withdrawAccountEntityM16069x12 = m16069x4();
        if (C27039d.m66650j((withdrawAccountEntityM16069x12 == null || (earnBalances = withdrawAccountEntityM16069x12.getEarnBalances()) == null || (availableBalance = earnBalances.getAvailableBalance()) == null) ? null : Integer.valueOf(availableBalance.compareTo(BigDecimal.ZERO))) <= 0 || !AssetRemoteConfig.f18903a.m19582z()) {
            i13 = i11;
        } else {
            WithdrawAccountEntity withdrawAccountEntityM16069x13 = m16069x4();
            if (C27025c.m66566d(withdrawAccountEntityM16069x13 != null ? Boolean.valueOf(withdrawAccountEntityM16069x13.isInvoiceChain()) : null)) {
                i13 = i11;
            } else {
                i13 = 1;
            }
        }
        C44761f0 c44761f0M16070y19 = m16070y4();
        if (c44761f0M16070y19 != null && (kuCheckBox4 = c44761f0M16070y19.f99862e) != null) {
            kuCheckBox4.setChecked((!listM15136x.contains("TRADE") || i16 == 0) ? i11 : 1);
        }
        C44761f0 c44761f0M16070y20 = m16070y4();
        if (c44761f0M16070y20 != null && (kuCheckBox3 = c44761f0M16070y20.f99860c) != null) {
            kuCheckBox3.setChecked((!listM15136x.contains("SAVINGS") || i13 == 0) ? i11 : 1);
        }
        if (i16 == 0 && i13 == 0) {
            C44761f0 c44761f0M16070y21 = m16070y4();
            if (c44761f0M16070y21 != null && (kuCheckBox2 = c44761f0M16070y21.f99861d) != null) {
                kuCheckBox2.setChecked(true);
            }
        } else {
            C44761f0 c44761f0M16070y22 = m16070y4();
            if (c44761f0M16070y22 != null && (kuCheckBox = c44761f0M16070y22.f99861d) != null) {
                kuCheckBox.setChecked(listM15136x.contains("MAIN"));
            }
        }
        C44761f0 c44761f0M16070y23 = m16070y4();
        if (c44761f0M16070y23 != null && (constraintLayout2 = c44761f0M16070y23.f99865h) != null) {
            constraintLayout2.setVisibility(i16 != 0 ? i11 : 8);
        }
        C44761f0 c44761f0M16070y24 = m16070y4();
        if (c44761f0M16070y24 != null && (constraintLayout = c44761f0M16070y24.f99863f) != null) {
            constraintLayout.setVisibility(i13 != 0 ? i11 : 8);
        }
        if (i16 != 0) {
            WithdrawAccountEntity withdrawAccountEntityM16069x14 = m16069x4();
            String strM66668h = C27041f.m66668h(withdrawAccountEntityM16069x14 != null ? withdrawAccountEntityM16069x14.getPageId() : null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coin", str);
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e(strM66668h, "tradingAccount", "1", jSONObject);
        }
        if (i13 != 0) {
            WithdrawAccountEntity withdrawAccountEntityM16069x15 = m16069x4();
            String strM66668h2 = C27041f.m66668h(withdrawAccountEntityM16069x15 != null ? withdrawAccountEntityM16069x15.getPageId() : null);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("coin", str);
            Unit unit2 = Unit.INSTANCE;
            C43852m.m96593e(strM66668h2, "savingAccount", "1", jSONObject2);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m16049E4(WithdrawAccountsDialog withdrawAccountsDialog) {
        KuCheckBox kuCheckBox;
        KuCheckBox kuCheckBox2;
        KuCheckBox kuCheckBox3;
        ArrayList arrayList = new ArrayList();
        C44761f0 c44761f0M16070y4 = withdrawAccountsDialog.m16070y4();
        Boolean boolValueOf = null;
        if (C27025c.m66566d((c44761f0M16070y4 == null || (kuCheckBox3 = c44761f0M16070y4.f99861d) == null) ? null : Boolean.valueOf(kuCheckBox3.isChecked()))) {
            arrayList.add("MAIN");
        }
        C44761f0 c44761f0M16070y5 = withdrawAccountsDialog.m16070y4();
        if (C27025c.m66566d((c44761f0M16070y5 == null || (kuCheckBox2 = c44761f0M16070y5.f99862e) == null) ? null : Boolean.valueOf(kuCheckBox2.isChecked()))) {
            arrayList.add("TRADE");
        }
        C44761f0 c44761f0M16070y6 = withdrawAccountsDialog.m16070y4();
        if (c44761f0M16070y6 != null && (kuCheckBox = c44761f0M16070y6.f99860c) != null) {
            boolValueOf = Boolean.valueOf(kuCheckBox.isChecked());
        }
        if (C27025c.m66566d(boolValueOf)) {
            arrayList.add("SAVINGS");
        }
        if (arrayList.isEmpty()) {
            ToastCompat.m66441G(withdrawAccountsDialog.getString(R$string.assets_account_error1), new Object[0]);
            return Unit.INSTANCE;
        }
        C46392a.m102333p(C42153h.f93593a.m92508L(), AssetExKt.m15130r(arrayList));
        Function1<? super List<String>, Unit> function1 = withdrawAccountsDialog.f16962t0;
        if (function1 != null) {
            function1.invoke(arrayList);
        }
        withdrawAccountsDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    private final void m16055L4(String str) throws JSONException {
        if (IUnifyAccountService.f53155a.get().mo64979C()) {
            InterfaceC37749a.a.m85117l(C37304a.f82764a, str, "UNIFIED", "MAIN", null, null, null, null, 120, null);
        } else {
            InterfaceC37749a.a.m85117l(C37304a.f82764a, str, "TRADE", "MAIN", null, null, null, null, 120, null);
        }
        WithdrawAccountEntity withdrawAccountEntityM16069x4 = m16069x4();
        String strM66668h = C27041f.m66668h(withdrawAccountEntityM16069x4 != null ? withdrawAccountEntityM16069x4.getPageId() : null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM66668h, "addAmountWindow", "1", jSONObject);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m16067K4(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", str);
        C38184b c38184b = C38184b.f85884a;
        if (Intrinsics.areEqual(str, c38184b.m86146a())) {
            AssetsHelper.f18684a.m19149A("BTC", c38184b.m86146a(), true);
            WithdrawAccountEntity withdrawAccountEntityM16069x4 = m16069x4();
            C43852m.m96589a(C27041f.m66668h(withdrawAccountEntityM16069x4 != null ? withdrawAccountEntityM16069x4.getPageId() : null), "addAmountWindow", "2", jSONObject);
        } else {
            AssetsHelper.f18684a.m19149A(c38184b.m86146a(), str, true);
            WithdrawAccountEntity withdrawAccountEntityM16069x5 = m16069x4();
            C43852m.m96589a(C27041f.m66668h(withdrawAccountEntityM16069x5 != null ? withdrawAccountEntityM16069x5.getPageId() : null), "addAmountWindow", "2", jSONObject);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX INFO: renamed from: M4 */
    public final void m16068M4(String str, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        BigDecimal bigDecimal;
        TextView textView;
        KuCheckBox kuCheckBox;
        BigDecimal bigDecimal2;
        TextView textView2;
        LabelView labelView;
        KuCheckBox kuCheckBox2;
        SingleCurrencyBalance earnBalances;
        SingleCurrencyBalance tradeBalances;
        SingleCurrencyBalance mainBalances;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        C44761f0 c44761f0M16070y4 = m16070y4();
        Boolean boolValueOf = null;
        KuCheckBox kuCheckBox3 = c44761f0M16070y4 != null ? c44761f0M16070y4.f99861d : null;
        WithdrawAccountEntity withdrawAccountEntityM16069x4 = m16069x4();
        Pair pairM90091to = TuplesKt.m90091to(kuCheckBox3, C41014a.m89922G((withdrawAccountEntityM16069x4 == null || (mainBalances = withdrawAccountEntityM16069x4.getMainBalances()) == null) ? null : mainBalances.getAvailableBalance(), null, 1, null));
        C44761f0 c44761f0M16070y5 = m16070y4();
        KuCheckBox kuCheckBox4 = c44761f0M16070y5 != null ? c44761f0M16070y5.f99862e : null;
        WithdrawAccountEntity withdrawAccountEntityM16069x5 = m16069x4();
        Pair pairM90091to2 = TuplesKt.m90091to(kuCheckBox4, C41014a.m89922G((withdrawAccountEntityM16069x5 == null || (tradeBalances = withdrawAccountEntityM16069x5.getTradeBalances()) == null) ? null : tradeBalances.getAvailableBalance(), null, 1, null));
        C44761f0 c44761f0M16070y6 = m16070y4();
        KuCheckBox kuCheckBox5 = c44761f0M16070y6 != null ? c44761f0M16070y6.f99860c : null;
        WithdrawAccountEntity withdrawAccountEntityM16069x6 = m16069x4();
        Map mapMapOf = MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to(kuCheckBox5, C41014a.m89922G((withdrawAccountEntityM16069x6 == null || (earnBalances = withdrawAccountEntityM16069x6.getEarnBalances()) == null) ? null : earnBalances.getAvailableBalance(), null, 1, null)));
        if (mapMapOf.isEmpty()) {
            i12 = 0;
        } else {
            Iterator it = mapMapOf.entrySet().iterator();
            i12 = 0;
            while (it.hasNext()) {
                KuCheckBox kuCheckBox6 = (KuCheckBox) ((Map.Entry) it.next()).getKey();
                if (C27025c.m66566d(kuCheckBox6 != null ? Boolean.valueOf(kuCheckBox6.isChecked()) : null)) {
                    i12++;
                }
            }
        }
        if (i12 <= 1) {
            z11 = false;
        } else {
            C44761f0 c44761f0M16070y7 = m16070y4();
            if (c44761f0M16070y7 != null && (kuCheckBox2 = c44761f0M16070y7.f99861d) != null) {
                boolValueOf = Boolean.valueOf(kuCheckBox2.isChecked());
            }
            if (C27025c.m66566d(boolValueOf)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        C44761f0 c44761f0M16070y8 = m16070y4();
        if (c44761f0M16070y8 != null && (labelView = c44761f0M16070y8.f99871n) != null) {
            AssetExKt.m15138z(labelView, z11);
        }
        if (!mapMapOf.isEmpty()) {
            Iterator it2 = mapMapOf.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z12 = false;
                    break;
                } else {
                    if (((Map.Entry) it2.next()).getValue() == null) {
                        z12 = true;
                        break;
                    }
                }
            }
        } else {
            z12 = false;
            break;
        }
        if (z12) {
            C44761f0 c44761f0M16070y9 = m16070y4();
            if (c44761f0M16070y9 == null || (textView2 = c44761f0M16070y9.f99874q) == null) {
                return;
            }
            textView2.setText(C42828b.m93906g("-- ", str, true, false, 4, null));
            return;
        }
        Iterator it3 = mapMapOf.entrySet().iterator();
        loop0: while (true) {
            bigDecimal = ZERO;
            do {
                if (!it3.hasNext()) {
                    break loop0;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                kuCheckBox = (KuCheckBox) entry.getKey();
                bigDecimal2 = (BigDecimal) entry.getValue();
            } while (!(kuCheckBox != null && C27025c.m66566d(Boolean.valueOf(kuCheckBox.isChecked()))));
            ZERO = bigDecimal.add(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(ZERO, "add(...)");
        }
        String strM93906g = C42828b.m93906g(C42180b.m92640e(bigDecimal, null, i11, false, false, false, 0, null, 125, null), str, true, false, 4, null);
        C44761f0 c44761f0M16070y10 = m16070y4();
        if (c44761f0M16070y10 == null || (textView = c44761f0M16070y10.f99874q) == null) {
            return;
        }
        textView.setText(strM93906g);
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF16961s0() {
        return this.f16961s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_withdraw_accounts, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m16045A4();
    }

    /* JADX INFO: renamed from: x4 */
    public final WithdrawAccountEntity m16069x4() {
        return (WithdrawAccountEntity) this.f16964v0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final C44761f0 m16070y4() {
        return (C44761f0) this.f16963u0.getValue(this, f16960x0[0]);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m16071z4(@Nullable Function1<? super List<String>, Unit> function1) {
        this.f16962t0 = function1;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m16046B4(WithdrawAccountsDialog withdrawAccountsDialog, String str, int i11) {
        KuCheckBox kuCheckBox;
        Boolean boolValueOf;
        KuCheckBox kuCheckBox2;
        C44761f0 c44761f0M16070y4 = withdrawAccountsDialog.m16070y4();
        if (c44761f0M16070y4 != null && (kuCheckBox = c44761f0M16070y4.f99861d) != null) {
            C44761f0 c44761f0M16070y5 = withdrawAccountsDialog.m16070y4();
            if (c44761f0M16070y5 != null && (kuCheckBox2 = c44761f0M16070y5.f99861d) != null) {
                boolValueOf = Boolean.valueOf(kuCheckBox2.isChecked());
            } else {
                boolValueOf = null;
            }
            kuCheckBox.setChecked(!C27025c.m66566d(boolValueOf));
        }
        withdrawAccountsDialog.m16068M4(str, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m16047C4(WithdrawAccountsDialog withdrawAccountsDialog, String str, int i11) {
        KuCheckBox kuCheckBox;
        Boolean boolValueOf;
        KuCheckBox kuCheckBox2;
        C44761f0 c44761f0M16070y4 = withdrawAccountsDialog.m16070y4();
        if (c44761f0M16070y4 != null && (kuCheckBox = c44761f0M16070y4.f99862e) != null) {
            C44761f0 c44761f0M16070y5 = withdrawAccountsDialog.m16070y4();
            if (c44761f0M16070y5 != null && (kuCheckBox2 = c44761f0M16070y5.f99862e) != null) {
                boolValueOf = Boolean.valueOf(kuCheckBox2.isChecked());
            } else {
                boolValueOf = null;
            }
            kuCheckBox.setChecked(!C27025c.m66566d(boolValueOf));
        }
        withdrawAccountsDialog.m16068M4(str, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m16048D4(WithdrawAccountsDialog withdrawAccountsDialog, String str, int i11) {
        KuCheckBox kuCheckBox;
        Boolean boolValueOf;
        KuCheckBox kuCheckBox2;
        C44761f0 c44761f0M16070y4 = withdrawAccountsDialog.m16070y4();
        if (c44761f0M16070y4 != null && (kuCheckBox = c44761f0M16070y4.f99860c) != null) {
            C44761f0 c44761f0M16070y5 = withdrawAccountsDialog.m16070y4();
            if (c44761f0M16070y5 != null && (kuCheckBox2 = c44761f0M16070y5.f99860c) != null) {
                boolValueOf = Boolean.valueOf(kuCheckBox2.isChecked());
            } else {
                boolValueOf = null;
            }
            kuCheckBox.setChecked(!C27025c.m66566d(boolValueOf));
        }
        withdrawAccountsDialog.m16068M4(str, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m16050F4(WithdrawAccountsDialog withdrawAccountsDialog, String str) throws JSONException {
        withdrawAccountsDialog.m16055L4(str);
        withdrawAccountsDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m16051G4(WithdrawAccountsDialog withdrawAccountsDialog, String str) throws JSONException {
        withdrawAccountsDialog.m16067K4(str);
        withdrawAccountsDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m16052H4(WithdrawAccountsDialog withdrawAccountsDialog, String str, int i11, CompoundButton compoundButton, boolean z11) {
        withdrawAccountsDialog.m16068M4(str, i11);
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m16053I4(WithdrawAccountsDialog withdrawAccountsDialog, String str, int i11, CompoundButton compoundButton, boolean z11) {
        withdrawAccountsDialog.m16068M4(str, i11);
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m16054J4(WithdrawAccountsDialog withdrawAccountsDialog, String str, int i11, CompoundButton compoundButton, boolean z11) {
        withdrawAccountsDialog.m16068M4(str, i11);
    }

    /* JADX INFO: renamed from: w4 */
    public static final WithdrawAccountEntity m16066w4(WithdrawAccountsDialog withdrawAccountsDialog) {
        Bundle arguments = withdrawAccountsDialog.getArguments();
        if (arguments != null) {
            return (WithdrawAccountEntity) RouteExKt.m56274t(arguments, "data");
        }
        return null;
    }
}
