package com.kubi.otc.fiat.recharge.capitual;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.CompoundButton;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import ht.C38346y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37691u;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: FiatRechargeCapitualRemindFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualRemindFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatCurrency", "", "getFiatCurrency", "()Ljava/lang/String;", "fiatCurrency$delegate", "Lkotlin/Lazy;", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "getPaymentMethod", "()Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "paymentMethod$delegate", "isNextTimeChecked", "", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeCapitualRemindBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeCapitualRemindBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nFiatRechargeCapitualRemindFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatRechargeCapitualRemindFragment.kt\ncom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualRemindFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,121:1\n147#2,16:122\n*S KotlinDebug\n*F\n+ 1 FiatRechargeCapitualRemindFragment.kt\ncom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualRemindFragment\n*L\n55#1:122,16\n*E\n"})
public final class FiatRechargeCapitualRemindFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: W */
    public boolean f37356W;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f37353Z = {Reflection.property1(new PropertyReference1Impl(FiatRechargeCapitualRemindFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeCapitualRemindBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f37352Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37354U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeCapitualRemindFragment.m44266o3(this.f37369b);
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37355V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeCapitualRemindFragment.m44270t3(this.f37371b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f37357X = C45681e.m100799e(this, new Function1<FiatRechargeCapitualRemindFragment, C37691u>() { // from class: com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualRemindFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37691u invoke(@NotNull FiatRechargeCapitualRemindFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37691u.m84973a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37691u, Unit>() { // from class: com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualRemindFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37691u it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37691u c37691u) {
            invoke(c37691u);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: FiatRechargeCapitualRemindFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualRemindFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "fiatCurrency", "", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @Nullable String fiatCurrency, @Nullable PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseActivity.INSTANCE.launch(context, FiatRechargeCapitualRemindFragment.class, new C27051h().m66724h("title", context.getString(R$string.legal_account_deposit_currency, C27041f.m66668h(fiatCurrency))).m66724h("fiatCurrency", fiatCurrency).m66721e("paymentMethod", paymentMethod).m66717a());
        }
    }

    /* JADX INFO: renamed from: K2 */
    private final String m44261K2() {
        return (String) this.f37354U.getValue();
    }

    /* JADX INFO: renamed from: q3 */
    private final PaymentMethod m44267q3() {
        return (PaymentMethod) this.f37355V.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m44268r3(FiatRechargeCapitualRemindFragment fiatRechargeCapitualRemindFragment, CompoundButton compoundButton, boolean z11) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        fiatRechargeCapitualRemindFragment.f37356W = z11;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m44269s3(FiatRechargeCapitualRemindFragment fiatRechargeCapitualRemindFragment) {
        if (fiatRechargeCapitualRemindFragment.f37356W) {
            C46392a.m102328k(PaymentStorageId.f40364a.m49824b(), false);
        }
        FiatRechargeCapitualDetailFragment.Companion companion = FiatRechargeCapitualDetailFragment.f37341c0;
        Context mContext = fiatRechargeCapitualRemindFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        companion.launch(mContext, fiatRechargeCapitualRemindFragment.m44261K2(), fiatRechargeCapitualRemindFragment.m44267q3());
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_recharge_capitual_remind;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        AlignTopCheckBox alignTopCheckBox;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        PaymentMethod paymentMethodM44267q3 = m44267q3();
        String strM66668h = C27041f.m66668h(C42180b.m92640e(C38346y.m86490A(paymentMethodM44267q3 != null ? paymentMethodM44267q3.getMinAmount() : null), null, 0, false, false, false, 0, null, 127, null));
        PaymentMethod paymentMethodM44267q4 = m44267q3();
        String strM66668h2 = C27041f.m66668h(C42180b.m92640e(C38346y.m86490A(paymentMethodM44267q4 != null ? paymentMethodM44267q4.getMaxAmount() : null), null, 0, false, false, false, 0, null, 127, null));
        String strM44261K2 = m44261K2();
        C37691u c37691uM44271p3 = m44271p3();
        if (c37691uM44271p3 != null && (baseTextView2 = c37691uM44271p3.f84684e) != null) {
            SpannableString spannableString = new SpannableString(getString(R$string.pay_fiat_capitual_remind_info_three, strM66668h, strM66668h2, strM44261K2));
            spannableString.setSpan(new StyleSpan(1), StringsKt.indexOf$default((CharSequence) spannableString, strM66668h, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, strM66668h, 0, false, 6, (Object) null) + strM66668h.length(), 18);
            spannableString.setSpan(new StyleSpan(1), StringsKt.indexOf$default((CharSequence) spannableString, strM66668h2, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, strM66668h2, 0, false, 6, (Object) null) + strM66668h2.length(), 18);
            spannableString.setSpan(new StyleSpan(1), StringsKt.indexOf$default((CharSequence) spannableString, strM44261K2, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, strM44261K2, 0, false, 6, (Object) null) + strM44261K2.length(), 18);
            baseTextView2.setText(spannableString);
        }
        C37691u c37691uM44271p4 = m44271p3();
        if (c37691uM44271p4 != null && (alignTopCheckBox = c37691uM44271p4.f84690k) != null) {
            C27046k.m66708w(alignTopCheckBox, new Function2() { // from class: com.kubi.otc.fiat.recharge.capitual.h0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FiatRechargeCapitualRemindFragment.m44268r3(this.f37373b, (CompoundButton) obj, ((Boolean) obj2).booleanValue());
                }
            });
        }
        C37691u c37691uM44271p5 = m44271p3();
        if (c37691uM44271p5 == null || (baseTextView = c37691uM44271p5.f84685f) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeCapitualRemindFragment.m44269s3(this.f37376b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p3 */
    public final C37691u m44271p3() {
        return (C37691u) this.f37357X.getValue(this, f37353Z[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public static final String m44266o3(FiatRechargeCapitualRemindFragment fiatRechargeCapitualRemindFragment) {
        String strM56284y;
        Bundle arguments = fiatRechargeCapitualRemindFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "fiatCurrency");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: t3 */
    public static final PaymentMethod m44270t3(FiatRechargeCapitualRemindFragment fiatRechargeCapitualRemindFragment) {
        Bundle arguments = fiatRechargeCapitualRemindFragment.getArguments();
        if (arguments != null) {
            return (PaymentMethod) RouteExKt.m56274t(arguments, "paymentMethod");
        }
        return null;
    }
}
