package com.kubi.otc.fiat.withdraw.birapi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.entity.FiatWithdrawConfrimBundle;
import com.kubi.otc.fiat.withdraw.AbsFiatWithdrawConfirmFragment;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import ht.C38346y;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37603c1;
import p402kf.C41014a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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

/* JADX INFO: compiled from: BirApiWithdrawConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0014R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment;", "Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentBirapiWithdrawConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentBirapiWithdrawConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "securityWidgetOpen", "", "getSecurityWidgetOpen", "()Z", "securityWidgetOpen$delegate", "Lkotlin/Lazy;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getLayout", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBirApiWithdrawConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirApiWithdrawConfirmFragment.kt\ncom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,74:1\n147#2,16:75\n35#3,4:91\n39#3:97\n44#4,2:95\n*S KotlinDebug\n*F\n+ 1 BirApiWithdrawConfirmFragment.kt\ncom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment\n*L\n24#1:75,16\n34#1:91,4\n34#1:97\n34#1:95,2\n*E\n"})
public final class BirApiWithdrawConfirmFragment extends AbsFiatWithdrawConfirmFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f37496Y = C45681e.m100799e(this, new Function1<BirApiWithdrawConfirmFragment, C37603c1>() { // from class: com.kubi.otc.fiat.withdraw.birapi.BirApiWithdrawConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37603c1 invoke(@NotNull BirApiWithdrawConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37603c1.m84789a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37603c1, Unit>() { // from class: com.kubi.otc.fiat.withdraw.birapi.BirApiWithdrawConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37603c1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37603c1 c37603c1) {
            invoke(c37603c1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37497Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.birapi.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(BirApiWithdrawConfirmFragment.m44559X3());
        }
    });

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f37495b0 = {Reflection.property1(new PropertyReference1Impl(BirApiWithdrawConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentBirapiWithdrawConfirmBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f37494a0 = new Companion(null);

    /* JADX INFO: compiled from: BirApiWithdrawConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "data", "Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @NotNull FiatWithdrawConfrimBundle data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            AbsFiatWithdrawConfirmFragment.Companion companion = AbsFiatWithdrawConfirmFragment.f37424X;
            String name = BirApiWithdrawConfirmFragment.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            companion.startFragment(context, data, name);
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.birapi.BirApiWithdrawConfirmFragment$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C19822a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m44557V3(BirApiWithdrawConfirmFragment birApiWithdrawConfirmFragment) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_cj_estimated_amount_title).m54153J4(R$string.payment_cj_estimated_amount_tip).m54162S4(R$string.payment_cj_estimated_amount_understand, null).m54172c5(birApiWithdrawConfirmFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final boolean m44559X3() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C19822a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_ee_withdraw", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: T3 */
    public final C37603c1 m44560T3() {
        return (C37603c1) this.f37496Y.getValue(this, f37495b0[0]);
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m44561U3() {
        return ((Boolean) this.f37497Z.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.payment_fragment_birapi_withdraw_confirm;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        FiatFee fiatFee;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        FiatFee fiatFee2;
        BaseTextView baseTextView7;
        String amount;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37603c1 c37603c1M44560T3 = m44560T3();
        BaseTextView baseTextView8 = c37603c1M44560T3 != null ? c37603c1M44560T3.f83741b : null;
        C37603c1 c37603c1M44560T4 = m44560T3();
        m44320E3(baseTextView8, c37603c1M44560T4 != null ? c37603c1M44560T4.f83742c : null);
        C37603c1 c37603c1M44560T5 = m44560T3();
        if (c37603c1M44560T5 != null && (baseTextView7 = c37603c1M44560T5.f83751l) != null) {
            StringBuilder sb2 = new StringBuilder();
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
            sb2.append((fiatWithdrawConfrimBundleM44319C3 == null || (amount = fiatWithdrawConfrimBundleM44319C3.getAmount()) == null) ? null : C41014a.m89945s(amount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null));
            sb2.append(' ');
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
            sb2.append(fiatWithdrawConfrimBundleM44319C4 != null ? fiatWithdrawConfrimBundleM44319C4.getCurrency() : null);
            baseTextView7.setText(sb2.toString());
        }
        C37603c1 c37603c1M44560T6 = m44560T3();
        if (c37603c1M44560T6 != null && (baseTextView6 = c37603c1M44560T6.f83744e) != null) {
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C5 = m44319C3();
            baseTextView6.setText(C27041f.m66669i((fiatWithdrawConfrimBundleM44319C5 == null || (fiatFee2 = fiatWithdrawConfrimBundleM44319C5.getFiatFee()) == null) ? null : fiatFee2.getFeeAmount(), "--"));
        }
        C37603c1 c37603c1M44560T7 = m44560T3();
        if (c37603c1M44560T7 != null && (baseTextView5 = c37603c1M44560T7.f83746g) != null) {
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C6 = m44319C3();
            baseTextView5.setText(C27041f.m66669i(fiatWithdrawConfrimBundleM44319C6 != null ? fiatWithdrawConfrimBundleM44319C6.getCurrency() : null, "--"));
        }
        C37603c1 c37603c1M44560T8 = m44560T3();
        if (c37603c1M44560T8 != null && (baseTextView4 = c37603c1M44560T8.f83748i) != null) {
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C7 = m44319C3();
            BigDecimal bigDecimalM86490A = C38346y.m86490A(fiatWithdrawConfrimBundleM44319C7 != null ? fiatWithdrawConfrimBundleM44319C7.getAmount() : null);
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C8 = m44319C3();
            baseTextView4.setText(bigDecimalM86490A.subtract(C38346y.m86490A((fiatWithdrawConfrimBundleM44319C8 == null || (fiatFee = fiatWithdrawConfrimBundleM44319C8.getFiatFee()) == null) ? null : fiatFee.getFeeAmount())).toPlainString());
        }
        C37603c1 c37603c1M44560T9 = m44560T3();
        if (c37603c1M44560T9 != null && (baseTextView3 = c37603c1M44560T9.f83750k) != null) {
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C9 = m44319C3();
            baseTextView3.setText(C27041f.m66669i(fiatWithdrawConfrimBundleM44319C9 != null ? fiatWithdrawConfrimBundleM44319C9.getCurrency() : null, "--"));
        }
        C37603c1 c37603c1M44560T10 = m44560T3();
        if (c37603c1M44560T10 != null && (baseTextView2 = c37603c1M44560T10.f83749j) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.birapi.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BirApiWithdrawConfirmFragment.m44557V3(this.f37499b);
                }
            }, 1, null);
        }
        C37603c1 c37603c1M44560T11 = m44560T3();
        if (c37603c1M44560T11 == null || (baseTextView = c37603c1M44560T11.f83743d) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.birapi.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BirApiWithdrawConfirmFragment.m44558W3(this.f37500b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m44558W3(BirApiWithdrawConfirmFragment birApiWithdrawConfirmFragment) {
        if (birApiWithdrawConfirmFragment.m44561U3()) {
            birApiWithdrawConfirmFragment.m44327y3();
        } else {
            birApiWithdrawConfirmFragment.m44326v3();
        }
        return Unit.INSTANCE;
    }
}
