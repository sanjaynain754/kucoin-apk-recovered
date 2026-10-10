package com.kubi.otc.fiat.withdraw.capitual;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.entity.FiatWithdrawConfrimBundle;
import com.kubi.otc.fiat.withdraw.AbsFiatWithdrawConfirmFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37671q;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FiatCapitualWithdrawConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawConfirmFragment;", "Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualWithdrawConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualWithdrawConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatCapitualWithdrawConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatCapitualWithdrawConfirmFragment.kt\ncom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,53:1\n147#2,16:54\n*S KotlinDebug\n*F\n+ 1 FiatCapitualWithdrawConfirmFragment.kt\ncom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawConfirmFragment\n*L\n22#1:54,16\n*E\n"})
public final class FiatCapitualWithdrawConfirmFragment extends AbsFiatWithdrawConfirmFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f37515Y = C45681e.m100799e(this, new Function1<FiatCapitualWithdrawConfirmFragment, C37671q>() { // from class: com.kubi.otc.fiat.withdraw.capitual.FiatCapitualWithdrawConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37671q invoke(@NotNull FiatCapitualWithdrawConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37671q.m84928a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37671q, Unit>() { // from class: com.kubi.otc.fiat.withdraw.capitual.FiatCapitualWithdrawConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37671q it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37671q c37671q) {
            invoke(c37671q);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f37514a0 = {Reflection.property1(new PropertyReference1Impl(FiatCapitualWithdrawConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualWithdrawConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f37513Z = new Companion(null);

    /* JADX INFO: compiled from: FiatCapitualWithdrawConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/FiatCapitualWithdrawConfirmFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", "data", "Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@NotNull Context context, @NotNull FiatWithdrawConfrimBundle data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            AbsFiatWithdrawConfirmFragment.Companion companion = AbsFiatWithdrawConfirmFragment.f37424X;
            String name = FiatCapitualWithdrawConfirmFragment.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            companion.startFragment(context, data, name);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final C37671q m44617S3() {
        return (C37671q) this.f37515Y.getValue(this, f37514a0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_capitual_withdraw_confirm;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        FiatFee fiatFee;
        BaseTextView baseTextView4;
        String amount;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37671q c37671qM44617S3 = m44617S3();
        BaseTextView baseTextView5 = c37671qM44617S3 != null ? c37671qM44617S3.f84405b : null;
        C37671q c37671qM44617S4 = m44617S3();
        m44320E3(baseTextView5, c37671qM44617S4 != null ? c37671qM44617S4.f84406c : null);
        C37671q c37671qM44617S5 = m44617S3();
        if (c37671qM44617S5 != null && (baseTextView4 = c37671qM44617S5.f84412i) != null) {
            StringBuilder sb2 = new StringBuilder();
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
            sb2.append((fiatWithdrawConfrimBundleM44319C3 == null || (amount = fiatWithdrawConfrimBundleM44319C3.getAmount()) == null) ? null : C41014a.m89945s(amount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null));
            sb2.append(' ');
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
            sb2.append(fiatWithdrawConfrimBundleM44319C4 != null ? fiatWithdrawConfrimBundleM44319C4.getCurrency() : null);
            baseTextView4.setText(sb2.toString());
        }
        C37671q c37671qM44617S6 = m44617S3();
        if (c37671qM44617S6 != null && (baseTextView3 = c37671qM44617S6.f84408e) != null) {
            C27096v0 c27096v0 = new C27096v0();
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C5 = m44319C3();
            C27096v0 c27096v0M66905e = c27096v0.m66905e(C27041f.m66669i((fiatWithdrawConfrimBundleM44319C5 == null || (fiatFee = fiatWithdrawConfrimBundleM44319C5.getFiatFee()) == null) ? null : fiatFee.getFeeAmount(), "--"), getColorRes(R$color.emphasis));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C6 = m44319C3();
            sb3.append(fiatWithdrawConfrimBundleM44319C6 != null ? fiatWithdrawConfrimBundleM44319C6.getCurrency() : null);
            baseTextView3.setText(c27096v0M66905e.append(sb3.toString()));
        }
        C37671q c37671qM44617S7 = m44617S3();
        if (c37671qM44617S7 != null && (baseTextView2 = c37671qM44617S7.f84409f) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatCapitualWithdrawConfirmFragment.m44615T3(this.f37573b);
                }
            }, 1, null);
        }
        C37671q c37671qM44617S8 = m44617S3();
        if (c37671qM44617S8 == null || (baseTextView = c37671qM44617S8.f84407d) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatCapitualWithdrawConfirmFragment.m44616U3(this.f37574b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m44615T3(FiatCapitualWithdrawConfirmFragment fiatCapitualWithdrawConfirmFragment) {
        fiatCapitualWithdrawConfirmFragment.m44321F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m44616U3(FiatCapitualWithdrawConfirmFragment fiatCapitualWithdrawConfirmFragment) {
        fiatCapitualWithdrawConfirmFragment.m44326v3();
        return Unit.INSTANCE;
    }
}
