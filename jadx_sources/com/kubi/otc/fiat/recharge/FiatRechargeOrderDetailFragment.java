package com.kubi.otc.fiat.recharge;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import au.InterfaceC4389a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.helpcenter.api.local.IHelpCenterService;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$font;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.entity.FiatRechargeInfo;
import com.kubi.otc.entity.RechargeErrorInfo;
import com.kubi.otc.entity.RechargeInfoErrorData;
import com.kubi.payment.channel.data.entities.ErrorInfoEntity;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27096v0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import et.C37242d;
import et.InterfaceC37240b;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37758j;
import g00.InterfaceC37766r;
import i10.Menu;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p270ft.C37701w;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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
import w00.C45681e;

/* JADX INFO: compiled from: FiatRechargeOrderDetailFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010!H\u0002J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\fH\u0002J\b\u0010,\u001a\u00020-H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006/"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/FiatRechargeOrderDetailFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "orderId", "", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "vb", "Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeOrderDetailBinding;", "getVb", "()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeOrderDetailBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "rechargeOrderDetails", "initView", "it", "Lcom/kubi/otc/entity/FiatRechargeInfo;", "handleRefundFailed", "showFee", "showTax", "handleEdd", "data", "showRefundDialog", FirebaseAnalytics.Event.REFUND, "getErrorTip", "routeQuestion", "fqaUrl", "onBackPressed", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatRechargeOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatRechargeOrderDetailFragment.kt\ncom/kubi/otc/fiat/recharge/FiatRechargeOrderDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,333:1\n147#2,16:334\n17#3,2:350\n*S KotlinDebug\n*F\n+ 1 FiatRechargeOrderDetailFragment.kt\ncom/kubi/otc/fiat/recharge/FiatRechargeOrderDetailFragment\n*L\n74#1:334,16\n311#1:350,2\n*E\n"})
public final class FiatRechargeOrderDetailFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37303U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeOrderDetailFragment.m44058E3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37304V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeOrderDetailFragment.m44069V3(this.f37415b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f37305W = C45681e.m100799e(this, new Function1<FiatRechargeOrderDetailFragment, C37701w>() { // from class: com.kubi.otc.fiat.recharge.FiatRechargeOrderDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37701w invoke(@NotNull FiatRechargeOrderDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37701w.m84990a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37701w, Unit>() { // from class: com.kubi.otc.fiat.recharge.FiatRechargeOrderDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37701w it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37701w c37701w) {
            invoke(c37701w);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f37302Y = {Reflection.property1(new PropertyReference1Impl(FiatRechargeOrderDetailFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeOrderDetailBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f37301X = new Companion(null);

    /* JADX INFO: compiled from: FiatRechargeOrderDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/FiatRechargeOrderDetailFragment$Companion;", "", "<init>", "()V", "EXTRA_ORDER_ID", "", "startFragment", "", "orderId", "isBackHome", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void startFragment$default(Companion companion, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bool = Boolean.FALSE;
            }
            companion.startFragment(str, bool);
        }

        public final void startFragment(@Nullable String orderId, @Nullable Boolean isBackHome) {
            InterfaceC37758j.a.m85158g(C37304a.f82764a, C27041f.m66668h(orderId), Long.valueOf(C27025c.m66566d(isBackHome) ? 1L : 0L), null, null, null, 28, null);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m44070X3(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, Disposable disposable) {
        BaseFragment.showLoadingView$default(fiatRechargeOrderDetailFragment, 0, 0, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public final void m44097J3(final FiatRechargeInfo fiatRechargeInfo) {
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        ConstraintLayout constraintLayout2;
        RechargeErrorInfo errorReason = fiatRechargeInfo != null ? fiatRechargeInfo.getErrorReason() : null;
        if (!Intrinsics.areEqual(errorReason != null ? errorReason.getCode() : null, ErrorInfoEntity.NEED_EDD)) {
            C37701w c37701wM44096I3 = m44096I3();
            if (c37701wM44096I3 == null || (constraintLayout = c37701wM44096I3.f84776D) == null) {
                return;
            }
            C27046k.m66700o(constraintLayout);
            return;
        }
        C37701w c37701wM44096I4 = m44096I3();
        if (c37701wM44096I4 != null && (constraintLayout2 = c37701wM44096I4.f84776D) != null) {
            C27046k.m66685H(constraintLayout2);
        }
        C37701w c37701wM44096I5 = m44096I3();
        if (c37701wM44096I5 != null && (baseTextView5 = c37701wM44096I5.f84792l) != null) {
            baseTextView5.setText(C27041f.m66668h(errorReason.getMsg()));
        }
        C37701w c37701wM44096I6 = m44096I3();
        if (c37701wM44096I6 != null && (baseTextView4 = c37701wM44096I6.f84802v) != null) {
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeOrderDetailFragment.m44060K3(fiatRechargeInfo, this);
                }
            }, 1, null);
        }
        if (!C27025c.m66566d(fiatRechargeInfo.getCustomerRefundEntrance())) {
            C37701w c37701wM44096I7 = m44096I3();
            if (c37701wM44096I7 == null || (baseTextView = c37701wM44096I7.f84800t) == null) {
                return;
            }
            C27046k.m66700o(baseTextView);
            return;
        }
        C37701w c37701wM44096I8 = m44096I3();
        if (c37701wM44096I8 != null && (baseTextView3 = c37701wM44096I8.f84800t) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeOrderDetailFragment.m44061L3(this.f37406b, fiatRechargeInfo);
                }
            }, 1, null);
        }
        C37701w c37701wM44096I9 = m44096I3();
        if (c37701wM44096I9 == null || (baseTextView2 = c37701wM44096I9.f84800t) == null) {
            return;
        }
        C27046k.m66685H(baseTextView2);
    }

    /* JADX INFO: renamed from: H3 */
    private final InterfaceC37240b m44059H3() {
        return (InterfaceC37240b) this.f37303U.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m44060K3(FiatRechargeInfo fiatRechargeInfo, FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment) {
        FlutterNavigationHelper.f39477a.m48163b(FastQuoteModel.PAY_RECHARGE, C27041f.m66668h(fiatRechargeInfo.getPaymentMethodCode()), C27041f.m66668h(fiatRechargeInfo.getChannelId()));
        C43852m.m96591c(C27041f.m66668h(fiatRechargeOrderDetailFragment.getF43191w()), "EddSubmission", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m44062N3(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(fiatRechargeOrderDetailFragment.mContext, R$font.medium));
        ds2.setColor(ContextCompat.getColor(fiatRechargeOrderDetailFragment.mContext, R$color.c_text));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m44063O3(View view) {
        C37304a c37304a = C37304a.f82764a;
        Uri uri = Uri.parse(C37242d.f82569a.m83355h());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        InterfaceC37766r.a.m85190a(c37304a, new C4400a(uri, null, 2, null).m4038a("appNeedLang", Boolean.TRUE).m4045h(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m44064P3(FiatRechargeInfo fiatRechargeInfo) {
        InterfaceC37758j.a.m85159h(C37304a.f82764a, fiatRechargeInfo.getFiatCurrency(), null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m44065Q3() {
        IHelpCenterService.f25326a.get().mo1472a("900000600846");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m44074f4(final FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, final String str, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = viewHolder.getView(R$id.ivClose);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeOrderDetailFragment.m44075g4(helper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.cancel);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeOrderDetailFragment.m44076h4(helper);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.confirm);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeOrderDetailFragment.m44077i4(this.f37412b, str, helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    private final String getOrderId() {
        return (String) this.f37304V.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    public final String m44094F3() {
        String strM4001b;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC4389a.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h == null || (strM4001b = ((InterfaceC4389a) objM56186h).m4001b()) == null) ? C37242d.f82569a.m83354g() : strM4001b;
    }

    /* JADX INFO: renamed from: I3 */
    public final C37701w m44096I3() {
        return (C37701w) this.f37305W.getValue(this, f37302Y[0]);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m44099R3(FiatRechargeInfo fiatRechargeInfo) {
        FiatRechargeInfo fiatRechargeInfo2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        ConstraintLayout constraintLayout3;
        if (Intrinsics.areEqual(fiatRechargeInfo.getPaymentMethodCode(), "bank_transfer_ziraat")) {
            NavigationBar navigationBar = getNavigationBar();
            if (navigationBar != null) {
                navigationBar.m54696g(R$drawable.ic_question_20, new View.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FiatRechargeOrderDetailFragment.m44068U3(this.f37420b, view);
                    }
                });
            } else {
                getTitleBar().setMenu(new Menu(0, Integer.valueOf(R$drawable.ic_question_20), Integer.valueOf(R$color.c_text), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FiatRechargeOrderDetailFragment.m44066S3(this.f37421b, view);
                    }
                }, 0, 377, null));
            }
            RechargeErrorInfo errorReason = fiatRechargeInfo.getErrorReason();
            String code = errorReason != null ? errorReason.getCode() : null;
            if (code == null || code.length() == 0) {
                C37701w c37701wM44096I3 = m44096I3();
                if (c37701wM44096I3 != null && (constraintLayout = c37701wM44096I3.f84775C) != null) {
                    C27046k.m66700o(constraintLayout);
                }
            } else {
                C37701w c37701wM44096I4 = m44096I3();
                if (c37701wM44096I4 != null && (constraintLayout3 = c37701wM44096I4.f84775C) != null) {
                    C27046k.m66685H(constraintLayout3);
                }
                C37701w c37701wM44096I5 = m44096I3();
                if (c37701wM44096I5 != null && (baseTextView10 = c37701wM44096I5.f84774B) != null) {
                    baseTextView10.setText(m44095G3(fiatRechargeInfo));
                }
                C37701w c37701wM44096I6 = m44096I3();
                if (c37701wM44096I6 != null && (baseTextView9 = c37701wM44096I6.f84795o) != null) {
                    baseTextView9.setText(new C27096v0().m66908h(getString(R$string.payment_recharge_order_any_other_questions)));
                }
                C37701w c37701wM44096I7 = m44096I3();
                if (c37701wM44096I7 != null && (baseTextView8 = c37701wM44096I7.f84795o) != null) {
                    C27046k.m66711z(baseTextView8, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.r
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FiatRechargeOrderDetailFragment.m44067T3(this.f37422b);
                        }
                    }, 1, null);
                }
            }
            C37701w c37701wM44096I8 = m44096I3();
            if (c37701wM44096I8 != null && (constraintLayout2 = c37701wM44096I8.f84778F) != null) {
                C27046k.m66700o(constraintLayout2);
            }
        }
        C37701w c37701wM44096I9 = m44096I3();
        if (c37701wM44096I9 != null && (baseTextView7 = c37701wM44096I9.f84787g) != null) {
            StringBuilder sb2 = new StringBuilder();
            String payinAmount = fiatRechargeInfo.getPayinAmount();
            sb2.append(C27041f.m66669i(payinAmount != null ? C41014a.m89945s(payinAmount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null) : null, "--"));
            sb2.append(' ');
            sb2.append(fiatRechargeInfo.getPayinCurrency());
            baseTextView7.setText(sb2.toString());
        }
        C37701w c37701wM44096I10 = m44096I3();
        if (c37701wM44096I10 == null || (baseTextView6 = c37701wM44096I10.f84801u) == null) {
            fiatRechargeInfo2 = fiatRechargeInfo;
        } else {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            fiatRechargeInfo2 = fiatRechargeInfo;
            baseTextView6.setText(fiatRechargeInfo2.getStatusString(mContext));
        }
        C37701w c37701wM44096I11 = m44096I3();
        if (c37701wM44096I11 != null && (baseTextView5 = c37701wM44096I11.f84801u) != null) {
            baseTextView5.setTextColor(getColorRes(fiatRechargeInfo2.getStatusColor()));
        }
        C37701w c37701wM44096I12 = m44096I3();
        if (c37701wM44096I12 != null && (baseTextView4 = c37701wM44096I12.f84793m) != null) {
            baseTextView4.setText(C27041f.m66668h(fiatRechargeInfo2.getOrderId()));
        }
        C37701w c37701wM44096I13 = m44096I3();
        if (c37701wM44096I13 != null && (baseTextView3 = c37701wM44096I13.f84805y) != null) {
            baseTextView3.setText(TimeUtils.m66424k(C27039d.m66652l(fiatRechargeInfo2.getCreatedAt())));
        }
        C37701w c37701wM44096I14 = m44096I3();
        if (c37701wM44096I14 != null && (baseTextView2 = c37701wM44096I14.f84798r) != null) {
            baseTextView2.setText(C27041f.m66668h(fiatRechargeInfo2.getChannelType()));
        }
        C37701w c37701wM44096I15 = m44096I3();
        if (c37701wM44096I15 != null && (baseTextView = c37701wM44096I15.f84790j) != null) {
            C27096v0 c27096v0 = new C27096v0();
            String feeAmount = fiatRechargeInfo2.getFeeAmount();
            baseTextView.setText(c27096v0.append(C27041f.m66669i(feeAmount != null ? C41014a.m89945s(feeAmount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null) : null, "--")).m66905e(' ' + C27041f.m66668h(fiatRechargeInfo2.getFeeCurrency()), getColorRes(R$color.c_text40)));
        }
        m44103d4(fiatRechargeInfo);
        m44105j4(fiatRechargeInfo);
        m44097J3(fiatRechargeInfo);
        m44098M3(fiatRechargeInfo);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m44102c4() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, m44094F3(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m44104e4(final String str) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_ee_refund, true).m54237f4(new Function2() { // from class: com.kubi.otc.fiat.recharge.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FiatRechargeOrderDetailFragment.m44074f4(this.f37408b, str, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "payment_recharge_refund_dialog");
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_recharge_order_detail;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setMainTitle(getString(R$string.otc_text_order_detail));
        } else {
            getTitleBar().setTitle(getString(R$string.otc_text_order_detail));
        }
        m44100W3();
    }

    public FiatRechargeOrderDetailFragment() {
        setPageId("B7DepositOrderDetail");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public static final InterfaceC37240b m44058E3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m44061L3(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, FiatRechargeInfo fiatRechargeInfo) {
        fiatRechargeOrderDetailFragment.m44104e4(fiatRechargeInfo.getOrderId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m44066S3(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, View view) {
        fiatRechargeOrderDetailFragment.m44102c4();
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m44067T3(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment) {
        fiatRechargeOrderDetailFragment.m44102c4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m44068U3(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, View view) {
        fiatRechargeOrderDetailFragment.m44102c4();
    }

    /* JADX INFO: renamed from: V3 */
    public static final String m44069V3(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment) {
        String strM56284y;
        Bundle arguments = fiatRechargeOrderDetailFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "orderId");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m44071Y3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m44072Z3(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, FiatRechargeInfo fiatRechargeInfo) {
        fiatRechargeOrderDetailFragment.showContent();
        Intrinsics.checkNotNull(fiatRechargeInfo);
        fiatRechargeOrderDetailFragment.m44099R3(fiatRechargeInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m44073a4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m44075g4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m44076h4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m44077i4(FiatRechargeOrderDetailFragment fiatRechargeOrderDetailFragment, String str, DialogFragmentHelper dialogFragmentHelper) {
        fiatRechargeOrderDetailFragment.m44101b4(str);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public final String m44095G3(FiatRechargeInfo fiatRechargeInfo) {
        String strM89945s;
        String currency;
        RechargeInfoErrorData data;
        RechargeInfoErrorData data2;
        String amount;
        RechargeErrorInfo errorReason = fiatRechargeInfo.getErrorReason();
        String code = null;
        if (errorReason != null && (data2 = errorReason.getData()) != null && (amount = data2.getAmount()) != null) {
            strM89945s = C41014a.m89945s(amount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
        } else {
            strM89945s = null;
        }
        String strM66669i = C27041f.m66669i(strM89945s, "--");
        RechargeErrorInfo errorReason2 = fiatRechargeInfo.getErrorReason();
        if (errorReason2 != null && (data = errorReason2.getData()) != null) {
            currency = data.getCurrency();
        } else {
            currency = null;
        }
        String strM66669i2 = C27041f.m66669i(currency, "--");
        RechargeErrorInfo errorReason3 = fiatRechargeInfo.getErrorReason();
        if (errorReason3 != null) {
            code = errorReason3.getCode();
        }
        if (code != null) {
            switch (code) {
                case "HIGH_THAN_MONTH_LIMIT_REFUND":
                    String string = getString(R$string.payment_recharge_monthly_limit, strM66669i, strM66669i2);
                    Intrinsics.checkNotNull(string);
                    return string;
                case "HIGH_THAN_DAY_LIMIT_REFUND":
                    String string2 = getString(R$string.payment_recharge_daily_limit, strM66669i, strM66669i2);
                    Intrinsics.checkNotNull(string2);
                    return string2;
                case "RISK_REJECT":
                    String string3 = getString(R$string.payment_recharge_risk_control_refunded);
                    Intrinsics.checkNotNull(string3);
                    return string3;
                case "HIGH_THAN_DAY_LIMIT_BATCH":
                    String string4 = getString(R$string.payment_recharge_greater_than_daily_limit_delayed, strM66669i, strM66669i2);
                    Intrinsics.checkNotNull(string4);
                    return string4;
                case "HIGH_THAN_LIMIT":
                    String string5 = getString(R$string.payment_recharge_greater_than_single_limit, strM66669i, strM66669i2);
                    Intrinsics.checkNotNull(string5);
                    return string5;
                case "LOWER_THAN_LIMIT":
                    String string6 = getString(R$string.payment_recharge_less_than_single_limit, strM66669i, strM66669i2);
                    Intrinsics.checkNotNull(string6);
                    return string6;
                default:
                    return "";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: M3 */
    public final void m44098M3(final FiatRechargeInfo fiatRechargeInfo) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        if (C27025c.m66566d(fiatRechargeInfo.getCustomerRefundFail())) {
            C37701w c37701wM44096I3 = m44096I3();
            if (c37701wM44096I3 != null && (baseTextView4 = c37701wM44096I3.f84786f) != null) {
                baseTextView4.setMovementMethod(LinkMovementMethod.getInstance());
            }
            C37701w c37701wM44096I4 = m44096I3();
            if (c37701wM44096I4 != null && (baseTextView3 = c37701wM44096I4.f84786f) != null) {
                HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
                HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
                highlightTextHelper.m54120f(baseTextView3, new Pair(textTagEnum, new UnderlineSpan()), new Pair(textTagEnum, new ColorClickSpan(new Function1() { // from class: com.kubi.otc.fiat.recharge.s
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FiatRechargeOrderDetailFragment.m44062N3(this.f37423b, (TextPaint) obj);
                    }
                }, new View.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FiatRechargeOrderDetailFragment.m44063O3(view);
                    }
                })));
            }
            C37701w c37701wM44096I5 = m44096I3();
            if (c37701wM44096I5 != null && (baseTextView2 = c37701wM44096I5.f84785e) != null) {
                C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FiatRechargeOrderDetailFragment.m44064P3(fiatRechargeInfo);
                    }
                }, 1, null);
            }
            C37701w c37701wM44096I6 = m44096I3();
            if (c37701wM44096I6 != null && (baseTextView = c37701wM44096I6.f84788h) != null) {
                C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FiatRechargeOrderDetailFragment.m44065Q3();
                    }
                }, 1, null);
            }
            C37701w c37701wM44096I7 = m44096I3();
            if (c37701wM44096I7 != null && (constraintLayout2 = c37701wM44096I7.f84779G) != null) {
                C27046k.m66685H(constraintLayout2);
                return;
            }
            return;
        }
        C37701w c37701wM44096I8 = m44096I3();
        if (c37701wM44096I8 != null && (constraintLayout = c37701wM44096I8.f84779G) != null) {
            C27046k.m66700o(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m44100W3() {
        Observable<R> observableCompose = m44059H3().m83302o(getOrderId()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.recharge.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeOrderDetailFragment.m44070X3(this.f37416b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeOrderDetailFragment.m44071Y3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.recharge.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeOrderDetailFragment.m44072Z3(this.f37418b, (FiatRechargeInfo) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeOrderDetailFragment.m44073a4(function2, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m44101b4(String str) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new FiatRechargeOrderDetailFragment$refund$1(this, str, null));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m44103d4(FiatRechargeInfo fiatRechargeInfo) {
        BaseTextView baseTextView;
        String strM92640e;
        BigDecimal bigDecimalM66536f;
        C37701w c37701wM44096I3 = m44096I3();
        if (c37701wM44096I3 != null && (baseTextView = c37701wM44096I3.f84790j) != null) {
            int i11 = R$string.payment_price;
            String feeAmount = fiatRechargeInfo.getFeeAmount();
            if (feeAmount != null && (bigDecimalM66536f = DowngradeExKt.m66536f(feeAmount)) != null) {
                strM92640e = C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, false, 0, null, 127, null);
            } else {
                strM92640e = null;
            }
            baseTextView.setText(getStringRes(i11, C27041f.m66669i(strM92640e, "--"), C27041f.m66668h(fiatRechargeInfo.getFeeCurrency())));
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m44105j4(FiatRechargeInfo fiatRechargeInfo) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        String strM66668h = C27041f.m66668h(fiatRechargeInfo.getTaxAmount());
        String strM66668h2 = C27041f.m66668h(fiatRechargeInfo.getTaxCurrency());
        if (strM66668h.length() == 0 || strM66668h2.length() == 0) {
            C37701w c37701wM44096I3 = m44096I3();
            if (c37701wM44096I3 != null && (baseTextView2 = c37701wM44096I3.f84804x) != null) {
                C27046k.m66700o(baseTextView2);
            }
            C37701w c37701wM44096I4 = m44096I3();
            if (c37701wM44096I4 != null && (baseTextView = c37701wM44096I4.f84803w) != null) {
                C27046k.m66700o(baseTextView);
                return;
            }
            return;
        }
        C37701w c37701wM44096I5 = m44096I3();
        if (c37701wM44096I5 != null && (baseTextView5 = c37701wM44096I5.f84803w) != null) {
            baseTextView5.setText(getStringRes(R$string.payment_price, strM66668h, strM66668h2));
        }
        C37701w c37701wM44096I6 = m44096I3();
        if (c37701wM44096I6 != null && (baseTextView4 = c37701wM44096I6.f84804x) != null) {
            C27046k.m66685H(baseTextView4);
        }
        C37701w c37701wM44096I7 = m44096I3();
        if (c37701wM44096I7 != null && (baseTextView3 = c37701wM44096I7.f84803w) != null) {
            C27046k.m66685H(baseTextView3);
        }
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        Bundle arguments = getArguments();
        if (arguments != null && RouteExKt.m56260m(arguments, "backHome") == 1) {
            InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        }
        return super.onBackPressed();
    }
}
