package com.kubi.otc.fast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.kubi.chat.service.ChatClient;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.entity.NoticeLatestEntity;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.fasttrade.FastTradeFragment;
import com.kubi.payment.p2p.trade.P2PTradeMarketFragment;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.ViewExtKt;
import et.InterfaceC37241c;
import f00.C37304a;
import g00.InterfaceC37758j;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.ListIterator;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37672q0;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
import w00.C45678b;
import y70.C46392a;
import zw.InterfaceC46930a;

/* JADX INFO: compiled from: PayFiatActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001b\u001a\u00020\u000fH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0014J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\n\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u001c\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u000f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0014\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010)H\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020)H\u0016J\b\u00100\u001a\u00020\u001dH\u0014R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u00062"}, m90084d2 = {"Lcom/kubi/otc/fast/PayFiatActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;", "<init>", "()V", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "kotlin.jvm.PlatformType", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "Lkotlin/Lazy;", "onTitleBarClickListener", "Lcom/kubi/otc/fast/OnTitleBarClickListener;", "payType", "", "moreBadge", "Lcom/kubi/resources/widget/rorbin/badgeview/Badge;", "getMoreBadge", "()Lcom/kubi/resources/widget/rorbin/badgeview/Badge;", "moreBadge$delegate", "vb", "Lcom/kubi/otc/databinding/PaymentActivityPayFiatBinding;", "getVb", "()Lcom/kubi/otc/databinding/PaymentActivityPayFiatBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onNewIntent", "intent", "Landroid/content/Intent;", "initNavigationBar", "", "replaceFragment", "type", "preSpmId", "", "getFragment", "Lcom/kubi/sdk/BaseFragment;", "spmId", "updateView", "showPayTypeDialog", "url", "onDestroy", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayFiatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayFiatActivity.kt\ncom/kubi/otc/fast/PayFiatActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n49#2,15:266\n1#3:281\n*S KotlinDebug\n*F\n+ 1 PayFiatActivity.kt\ncom/kubi/otc/fast/PayFiatActivity\n*L\n70#1:266,15\n*E\n"})
public final class PayFiatActivity extends BaseUiActivity implements KCMiniAppBaseProtocol {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ KProperty<Object>[] f37252A = {Reflection.property1(new PropertyReference1Impl(PayFiatActivity.class, "vb", "getVb()Lcom/kubi/otc/databinding/PaymentActivityPayFiatBinding;", 0))};

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final Companion f37253z = new Companion(null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public final Lazy f37254v = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fast.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayFiatActivity.m43975L0();
        }
    });

    /* JADX INFO: renamed from: w */
    public int f37255w = -1;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Lazy f37256x = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fast.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayFiatActivity.m43967C0(this.f37268b);
        }
    });

    /* JADX INFO: renamed from: y */
    @NotNull
    public final InterfaceC24293a f37257y = C45678b.m100788b(this, new Function1<C37672q0, Unit>() { // from class: com.kubi.otc.fast.PayFiatActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C37672q0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37672q0 c37672q0) {
            invoke(c37672q0);
            return Unit.INSTANCE;
        }
    }, new Function1<PayFiatActivity, C37672q0>() { // from class: com.kubi.otc.fast.PayFiatActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37672q0 invoke(@NotNull PayFiatActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s-236603891(...)");
            return C37672q0.m84930a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: compiled from: PayFiatActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/fast/PayFiatActivity$Companion;", "", "<init>", "()V", "TYPE_NONE", "", "TYPE_P2P", "TYPE_FAST", "NOTICE_TYPE", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: B0 */
    public Void m43996B0() {
        return null;
    }

    /* JADX INFO: renamed from: x0 */
    public final BaseFragment m43999x0(String str) {
        String strM56280w;
        if (str == null) {
            str = null;
        } else if (StringsKt.isBlank(str)) {
            Intent intent = getIntent();
            str = C27041f.m66668h(intent != null ? RouteExKt.m56280w(intent, "spm") : null);
        }
        Intent intent2 = getIntent();
        if (intent2 == null || (strM56280w = RouteExKt.m56280w(intent2, "side")) == null) {
            strM56280w = "BUY";
        }
        if (this.f37255w == 0) {
            return P2PTradeMarketFragment.f39978k0.newInstance(str, strM56280w);
        }
        FastTradeFragment.Companion companion = FastTradeFragment.f38714c0;
        Intent intent3 = getIntent();
        String strM66668h = C27041f.m66668h(intent3 != null ? RouteExKt.m56280w(intent3, "fiatCurrency") : null);
        Intent intent4 = getIntent();
        return companion.newInstance(strM66668h, C27041f.m66668h(intent4 != null ? RouteExKt.m56280w(intent4, "cryptoCurrency") : null), strM56280w, str);
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m43969F0(boolean z11, boolean z12, PayFiatActivity payFiatActivity) {
        if (!z11 || !z12) {
            return Unit.INSTANCE;
        }
        payFiatActivity.m43998O0();
        C43852m.m96591c("B7FastTrade", "businessType", payFiatActivity.f37255w != 0 ? "1" : "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m43970G0(PayFiatActivity payFiatActivity) {
        InterfaceC37758j.a.m85165n(C37304a.f82764a, payFiatActivity.f37255w == 0 ? 1L : 0L, null, C43852m.m96602n("B7FastTrade", "orderButton", null, 4, null), null, null, 26, null);
        C43852m.m96590b("B7FastTrade", "clickHistory", "1", TuplesKt.m90091to("businessType", payFiatActivity.f37255w == 0 ? FastQuoteModel.PAY_P2P : "FastTrade"));
        if (payFiatActivity.f37255w == 2) {
            C43852m.m96591c("B7FastTrade", "clickHistory", "1", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m43972I0() {
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient != null) {
            chatClient.m20392g();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m43976N0(PayFiatActivity payFiatActivity, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        payFiatActivity.m43997M0(i11, str);
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m43977P0(final PayFiatActivity payFiatActivity, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = viewHolder.getView(R$id.view_fast);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.otc.fast.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayFiatActivity.m43978Q0(this.f37264b, helper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.view_p2p);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.otc.fast.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayFiatActivity.m43979R0(this.f37266b, helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m43978Q0(PayFiatActivity payFiatActivity, DialogFragmentHelper dialogFragmentHelper) {
        payFiatActivity.m43997M0(2, C43852m.m96601m("B7FastTrade", "choosePaymentType", "1"));
        dialogFragmentHelper.dismiss();
        C43852m.m96591c("B7FastTrade", "choosePaymentType", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m43979R0(PayFiatActivity payFiatActivity, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        payFiatActivity.m43997M0(0, C43852m.m96601m("B7FastTrade", "fastTradeAndP2P", FastQuoteModel.PAY_P2P));
        dialogFragmentHelper.dismiss();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B7FastTrade", "fastTradeAndP2P", FastQuoteModel.PAY_P2P, jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    private final void m43980S0() {
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        ImageView imageView;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView2;
        ImageView imageView2;
        if (this.f37255w == 0) {
            C37672q0 c37672q0M43995A0 = m43995A0();
            if (c37672q0M43995A0 != null && (imageView2 = c37672q0M43995A0.f84416d) != null) {
                C27046k.m66685H(imageView2);
            }
            C37672q0 c37672q0M43995A1 = m43995A0();
            if (c37672q0M43995A1 != null && (baseTextView2 = c37672q0M43995A1.f84420h) != null) {
                baseTextView2.setText(getString(R$string.otc));
            }
            C37672q0 c37672q0M43995A2 = m43995A0();
            if (c37672q0M43995A2 == null || (constraintLayout2 = c37672q0M43995A2.f84419g) == null) {
                return;
            }
            constraintLayout2.setBackgroundResource(R$color.c_background);
            return;
        }
        C37672q0 c37672q0M43995A3 = m43995A0();
        if (c37672q0M43995A3 != null && (imageView = c37672q0M43995A3.f84416d) != null) {
            C27046k.m66700o(imageView);
        }
        C37672q0 c37672q0M43995A4 = m43995A0();
        if (c37672q0M43995A4 != null && (baseTextView = c37672q0M43995A4.f84420h) != null) {
            baseTextView.setText(getString(R$string.otc_fast_trade));
        }
        C37672q0 c37672q0M43995A5 = m43995A0();
        if (c37672q0M43995A5 == null || (constraintLayout = c37672q0M43995A5.f84419g) == null) {
            return;
        }
        constraintLayout.setBackgroundResource(R$color.c_background);
    }

    /* JADX INFO: renamed from: z0 */
    private final InterfaceC37241c m43994z0() {
        return (InterfaceC37241c) this.f37254v.getValue();
    }

    /* JADX INFO: renamed from: A0 */
    public final C37672q0 m43995A0() {
        return (C37672q0) this.f37257y.getValue(this, f37252A[0]);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m43997M0(int i11, String str) {
        if (i11 == this.f37255w) {
            return;
        }
        this.f37255w = i11;
        C27032f.m66626q(this, R$id.fl_container, m43999x0(str), null, 4, null);
        C46392a.m102329l(PaymentStorageId.f40364a.m49826d(), this.f37255w);
        m43980S0();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m43998O0() {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.botc_view_pay_select_dialog, true).m54237f4(new Function2() { // from class: com.kubi.otc.fast.l
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PayFiatActivity.m43977P0(this.f37277b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "pay_dialog");
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.payment_activity_pay_fiat;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.otc.fast.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayFiatActivity.m43972I0();
            }
        });
        super.onDestroy();
    }

    @Override // com.kubi.sdk.applet.KCBaseProtocol
    @NotNull
    public String url() {
        return "otc?type=" + this.f37255w;
    }

    /* JADX INFO: renamed from: y0 */
    public final InterfaceC46930a m44000y0() {
        return (InterfaceC46930a) this.f37256x.getValue();
    }

    public PayFiatActivity() {
        setPageId("B7PaymentTrade");
    }

    /* JADX INFO: renamed from: C0 */
    public static final InterfaceC46930a m43967C0(PayFiatActivity payFiatActivity) {
        C37672q0 c37672q0M43995A0 = payFiatActivity.m43995A0();
        if (c37672q0M43995A0 != null) {
            return new QBadgeView(payFiatActivity.f46505q).m55419B(ContextCompat.getColor(payFiatActivity.f46505q, R$color.secondary)).mo55428e(3.0f, true).mo55426c(7.0f, 7.0f, true).mo55427d(false).mo55429f(c37672q0M43995A0.f84417e);
        }
        return null;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m43968E0(PayFiatActivity payFiatActivity) {
        payFiatActivity.onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m43971H0(PayFiatActivity payFiatActivity) {
        payFiatActivity.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m43973J0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m43974K0(PayFiatActivity payFiatActivity, ArrayList arrayList) {
        Integer unreadCount;
        Object objPrevious;
        int i11;
        InterfaceC46930a interfaceC46930aM44000y0 = payFiatActivity.m44000y0();
        if (interfaceC46930aM44000y0 != null) {
            Intrinsics.checkNotNull(arrayList);
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            do {
                unreadCount = null;
                if (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                } else {
                    objPrevious = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((NoticeLatestEntity) objPrevious).getSubject(), "notification.otc"));
            NoticeLatestEntity noticeLatestEntity = (NoticeLatestEntity) objPrevious;
            if (noticeLatestEntity != null) {
                unreadCount = noticeLatestEntity.getUnreadCount();
            }
            if (C27039d.m66650j(unreadCount) > 0) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            interfaceC46930aM44000y0.mo55425b(i11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final InterfaceC37241c m43975L0() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ View mo32393c0() {
        return (View) m43996B0();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        C37672q0 c37672q0M43995A0;
        AppCompatImageView appCompatImageView;
        Integer numValueOf;
        ImageView imageView;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView;
        ImageView imageView2;
        View view;
        super.onCreate(savedInstanceState);
        EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
        edgeToEdgeCompat.m58267e(this, ContextCompat.getColor(this, R$color.c_transparent));
        C37672q0 c37672q0M43995A1 = m43995A0();
        if (c37672q0M43995A1 != null && (view = c37672q0M43995A1.f84421i) != null) {
            ViewExtKt.m66584o(view, 0, edgeToEdgeCompat.m58272j(), 0, 0);
        }
        C37672q0 c37672q0M43995A2 = m43995A0();
        if (c37672q0M43995A2 != null && (imageView2 = c37672q0M43995A2.f84415c) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.otc.fast.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayFiatActivity.m43968E0(this.f37271b);
                }
            }, 1, null);
        }
        final boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.P2P);
        final boolean zM58030b2 = C24129b.m58030b(SiteVisibleConfigKey.FastTrade);
        if ((!zM58030b || !zM58030b2) && (c37672q0M43995A0 = m43995A0()) != null && (appCompatImageView = c37672q0M43995A0.f84418f) != null) {
            C27046k.m66700o(appCompatImageView);
        }
        C37672q0 c37672q0M43995A3 = m43995A0();
        if (c37672q0M43995A3 != null && (baseTextView = c37672q0M43995A3.f84420h) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fast.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayFiatActivity.m43969F0(zM58030b, zM58030b2, this);
                }
            }, 1, null);
        }
        C37672q0 c37672q0M43995A4 = m43995A0();
        if (c37672q0M43995A4 != null && (appCompatImageView2 = c37672q0M43995A4.f84417e) != null) {
            C27046k.m66711z(appCompatImageView2, 0L, new Function0() { // from class: com.kubi.otc.fast.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayFiatActivity.m43970G0(this.f37275b);
                }
            }, 1, null);
        }
        C37672q0 c37672q0M43995A5 = m43995A0();
        if (c37672q0M43995A5 != null && (imageView = c37672q0M43995A5.f84416d) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.otc.fast.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PayFiatActivity.m43971H0(this.f37276b);
                }
            }, 1, null);
        }
        Intent intent = getIntent();
        String strM56280w = null;
        if (intent != null) {
            numValueOf = Integer.valueOf(RouteExKt.m56258l(intent, "type", -1));
        } else {
            numValueOf = null;
        }
        int iM66651k = C27039d.m66651k(numValueOf, -1);
        this.f37255w = iM66651k;
        if (iM66651k == -1) {
            int iM102323e = C46392a.m102323e(PaymentStorageId.f40364a.m49826d(), -1);
            this.f37255w = iM102323e;
            if (iM102323e == -1) {
                this.f37255w = 2;
            }
        }
        int i11 = R$id.fl_container;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            strM56280w = RouteExKt.m56280w(intent2, "spm");
        }
        C27032f.m66626q(this, i11, m43999x0(strM56280w), null, 4, null);
        C46392a.m102329l(PaymentStorageId.f40364a.m49826d(), this.f37255w);
        m43980S0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        Integer numValueOf;
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent != null) {
            numValueOf = Integer.valueOf(RouteExKt.m56258l(intent, "type", -1));
        } else {
            numValueOf = null;
        }
        int iM66651k = C27039d.m66651k(numValueOf, -1);
        if (iM66651k != -1) {
            m43976N0(this, iM66651k, null, 2, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!OtcDepend.f38138a.m45466o()) {
            InterfaceC46930a interfaceC46930aM44000y0 = m44000y0();
            if (interfaceC46930aM44000y0 != null) {
                interfaceC46930aM44000y0.mo55425b(0);
                return;
            }
            return;
        }
        Observable<R> observableCompose = m43994z0().m83341t(CollectionsKt.arrayListOf("notification.otc")).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fast.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PayFiatActivity.m43974K0(this.f37269b, (ArrayList) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.fast.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PayFiatActivity.m43973J0(function1, obj);
            }
        }, new C24223c1(this, false));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }
}
