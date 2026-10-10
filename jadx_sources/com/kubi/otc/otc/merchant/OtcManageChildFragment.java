package com.kubi.otc.otc.merchant;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.R$style;
import com.kubi.otc.entity.AdRule;
import com.kubi.otc.entity.OtcAd;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27051h;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37241c;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import lt.C42304i;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37612e0;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
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

/* JADX INFO: compiled from: OtcManageChildFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J\u001a\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0014J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0002H\u0002J\u001a\u0010-\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u001dH\u0016J\b\u00101\u001a\u00020\u001dH\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0002H\u0002J\u0018\u00104\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00022\u0006\u00105\u001a\u00020/H\u0002J\u0018\u00106\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00022\u0006\u00105\u001a\u00020/H\u0002J\u0018\u00107\u001a\u00020\u001d2\u0006\u00105\u001a\u00020/2\u0006\u0010+\u001a\u00020\u0002H\u0002J$\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020:092\u0006\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u001fH\u0014J\u001e\u0010=\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00022\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001d0?H\u0002J\b\u0010@\u001a\u00020\u001dH\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010A\u001a\u00020/X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006G"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/OtcManageChildFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/otc/entity/OtcAd;", "<init>", "()V", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "kotlin.jvm.PlatformType", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "Lkotlin/Lazy;", "status", "", "getStatus", "()Ljava/lang/String;", "status$delegate", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getLoadingView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingView$delegate", "vb", "Lcom/kubi/otc/databinding/BotcMerchantAdsListBinding;", "getVb", "()Lcom/kubi/otc/databinding/BotcMerchantAdsListBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onReBack", "", "getLayout", "", "getItemLayout", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "buildPostNewAdButton", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "onEditClick", "preEdit", "hasNewUserTag", "", "showEmpty", "showLoading", "showContent", "showHideAd", "onPutUpOrDownClick", "up", "putUpDownAd", "realPutUpOrDownAd", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "getOtcAdInfo", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "addAd", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcManageChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcManageChildFragment.kt\ncom/kubi/otc/otc/merchant/OtcManageChildFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,379:1\n147#2,16:380\n*S KotlinDebug\n*F\n+ 1 OtcManageChildFragment.kt\ncom/kubi/otc/otc/merchant/OtcManageChildFragment\n*L\n69#1:380,16\n*E\n"})
public final class OtcManageChildFragment extends BasePagingFragment<OtcAd> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37687Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.q2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcManageChildFragment.m44884A4();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f37688a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.v2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcManageChildFragment.m44908R4(this.f37812b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f37689b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.w2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcManageChildFragment.m44931v4(this.f37816b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f37690c0 = C45681e.m100799e(this, new Function1<OtcManageChildFragment, C37612e0>() { // from class: com.kubi.otc.otc.merchant.OtcManageChildFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37612e0 invoke(@NotNull OtcManageChildFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37612e0.m84805a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37612e0, Unit>() { // from class: com.kubi.otc.otc.merchant.OtcManageChildFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37612e0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37612e0 c37612e0) {
            invoke(c37612e0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    public boolean f37691d0;

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f37686f0 = {Reflection.property1(new PropertyReference1Impl(OtcManageChildFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/BotcMerchantAdsListBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f37685e0 = new Companion(null);

    /* JADX INFO: compiled from: OtcManageChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/OtcManageChildFragment$Companion;", "", "<init>", "()V", "PUT_UP", "", "PUT_DOWN", "newInstance", "Lcom/kubi/otc/otc/merchant/OtcManageChildFragment;", "status", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final OtcManageChildFragment newInstance(@NotNull String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            OtcManageChildFragment otcManageChildFragment = new OtcManageChildFragment();
            otcManageChildFragment.setArguments(new C27051h().m66724h("status", status).m66717a());
            return otcManageChildFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.merchant.OtcManageChildFragment$a */
    /* JADX INFO: compiled from: OtcManageChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/merchant/OtcManageChildFragment$realPutUpOrDownAd$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nOtcManageChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcManageChildFragment.kt\ncom/kubi/otc/otc/merchant/OtcManageChildFragment$realPutUpOrDownAd$3\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,379:1\n48#2,2:380\n*S KotlinDebug\n*F\n+ 1 OtcManageChildFragment.kt\ncom/kubi/otc/otc/merchant/OtcManageChildFragment$realPutUpOrDownAd$3\n*L\n308#1:380,2\n*E\n"})
    public static final class C19961a extends C24223c1 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f37693e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ OtcAd f37694f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19961a(boolean z11, OtcAd otcAd) {
            super(OtcManageChildFragment.this, false);
            this.f37693e = z11;
            this.f37694f = otcAd;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            String message = null;
            if (this.f37693e) {
                if (th2 instanceof ApiException) {
                    ApiException apiException = (ApiException) th2;
                    String str = apiException.code;
                    if (Intrinsics.areEqual(str, "618203")) {
                        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.payment_ad_risk_refused).m54162S4(R$string.i_already_know, null).m54172c5(OtcManageChildFragment.this.getChildFragmentManager());
                        return;
                    }
                    if (Intrinsics.areEqual(str, "600000")) {
                        if (this.f37693e && !this.f37694f.isBuy()) {
                            C43846g.m96568c(new OtcMessage("error 600000", "payment_p2p", false, 4, null), null, 2, null);
                            return;
                        } else {
                            ToastCompat.m66441G(apiException.getMessage(), new Object[0]);
                            return;
                        }
                    }
                    ToastCompat.m66441G(apiException.getMessage(), new Object[0]);
                    return;
                }
                if (th2 != null) {
                    message = th2.getMessage();
                }
                ToastCompat.m66441G(message, new Object[0]);
                return;
            }
            if (th2 != null) {
                message = th2.getMessage();
            }
            ToastCompat.m66441G(message, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m44932x4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, DialogInterface dialogInterface, int i11) {
        otcManageChildFragment.m44934B4(otcAd, true);
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m44933z4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, DialogInterface dialogInterface, int i11) {
        otcManageChildFragment.m44935H4(otcAd, false);
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m44885C4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        otcManageChildFragment.m44934B4(otcAd, z11);
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m44887E4(final OtcManageChildFragment otcManageChildFragment, final OtcAd otcAd, final ArrayList arrayList, final boolean z11, final ArrayList arrayList2) {
        otcManageChildFragment.m44942p4(otcAd, new Function0() { // from class: com.kubi.otc.otc.merchant.s2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtcManageChildFragment.m44888F4(this.f37794b, otcAd, arrayList, arrayList2, z11);
            }
        });
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m44888F4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        BaseFragmentActivity.m56574n0(otcManageChildFragment.mContext, otcManageChildFragment.getString(R$string.otc_ad_editing), (Intrinsics.areEqual(otcManageChildFragment.m44943t4(), "PUTUP") ? OtcAdEditUpFragment.class : OtcAdEditDownFragment.class).getName(), new C27051h().m66721e("item", otcAd).m66725i("legals", arrayList).m66722f("symbols", arrayList2).m66719c("hasNewUserTag", z11).m66717a());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m44922g4(final OtcManageChildFragment otcManageChildFragment, final ArrayList arrayList) throws Exception {
        if (arrayList == null || arrayList.isEmpty()) {
            ToastCompat.m66437C(R$string.pay_otc_un_available_market);
            return;
        }
        Object obj = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C38346y.m86538y(otcManageChildFragment, (String) obj, new Consumer() { // from class: com.kubi.otc.otc.merchant.i2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                OtcManageChildFragment.m44923h4(this.f37741b, arrayList, (ArrayList) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m44923h4(OtcManageChildFragment otcManageChildFragment, ArrayList arrayList, ArrayList arrayList2) {
        BaseFragmentActivity.m56574n0(otcManageChildFragment.mContext, otcManageChildFragment.getString(R$string.publish_ad), OtcAdPublishFragment.class.getName(), new C27051h().m66725i("legals", arrayList).m66722f("symbols", arrayList2).m66717a());
    }

    /* JADX INFO: renamed from: s4 */
    private final InterfaceC37241c m44930s4() {
        return (InterfaceC37241c) this.f37687Z.getValue();
    }

    /* JADX INFO: renamed from: H4 */
    public final void m44935H4(final OtcAd otcAd, final boolean z11) {
        if (!z11 || otcAd.isBuy()) {
            m44936J4(z11, otcAd);
            return;
        }
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48410b(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(this), new Function0() { // from class: com.kubi.otc.otc.merchant.k2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtcManageChildFragment.m44892I4(this.f37753b, z11, otcAd);
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public final void m44936J4(boolean z11, OtcAd otcAd) {
        Observable observableCompose;
        if (z11) {
            observableCompose = otcAd.isBuy() ? m44930s4().m83312B(C27041f.m66668h(otcAd.getId())).compose(C24217a1.m58389m()) : m44930s4().m83340s(C27041f.m66668h(otcAd.getId())).compose(C24217a1.m58389m());
        } else {
            observableCompose = m44930s4().m83333k(C27041f.m66668h(otcAd.getId())).compose(C24217a1.m58389m());
        }
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.o2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcManageChildFragment.m44895K4(this.f37777b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.p2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcManageChildFragment.m44897L4(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.r2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcManageChildFragment.m44899M4(this.f37788b, obj);
            }
        }, new C19961a(z11, otcAd));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_merchant_ads_list;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF37691d0() {
        return this.f37691d0;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final OtcAd item) {
        int iM54289n;
        String string;
        BigDecimal bigDecimalSubtract;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(R$id.tv_new_user_tag);
        if (textView != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            C42304i.m92850g(textView, childFragmentManager, item.getNewUserTag(), item.getNewUserTagTip());
        }
        TextView textView2 = (TextView) helper.getView(R$id.tvTopPicks);
        if (textView2 != null) {
            textView2.setText(C27041f.m66668h(item.getTopTagTip()));
            if (Intrinsics.areEqual(item.getTopTag(), "1")) {
                C27046k.m66685H(textView2);
            } else {
                C27046k.m66700o(textView2);
            }
        }
        int i11 = R$id.tv_side;
        TextView textView3 = (TextView) helper.getView(i11);
        if (item.isBuy()) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            iM54289n = C22890g.m54291p(mContext);
        } else {
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            iM54289n = C22890g.m54289n(mContext2);
        }
        textView3.setTextColor(iM54289n);
        String priceType = item.getPriceType();
        if (Intrinsics.areEqual(priceType, "REGULAR")) {
            StringBuilder sb2 = new StringBuilder();
            BigDecimal floatPrice = item.getFloatPrice();
            sb2.append(floatPrice != null ? floatPrice.toPlainString() : null);
            sb2.append(' ');
            sb2.append(item.getLegal());
            sb2.append(" / ~");
            string = sb2.toString();
        } else if (Intrinsics.areEqual(priceType, "FLOAT")) {
            StringBuilder sb3 = new StringBuilder();
            BigDecimal floatPrice2 = item.getFloatPrice();
            sb3.append(floatPrice2 != null ? floatPrice2.toPlainString() : null);
            sb3.append(' ');
            sb3.append(item.getLegal());
            sb3.append(" / ");
            sb3.append(new BigDecimal(100).add(item.getPremium()).toPlainString());
            sb3.append('%');
            string = sb3.toString();
        } else {
            string = "";
        }
        BaseViewHolder text = helper.setText(i11, item.isBuy() ? R$string.buy : R$string.sell).setText(R$id.tv_currency, item.getCurrency()).setText(R$id.tv_id, C27041f.m66668h(item.getId()));
        int i12 = R$id.tv_amount;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal currencyQuantity = item.getCurrencyQuantity();
        sb4.append((currencyQuantity == null || (bigDecimalSubtract = currencyQuantity.subtract(item.getCurrencyBalanceQuantity())) == null) ? null : bigDecimalSubtract.toPlainString());
        sb4.append('/');
        BigDecimal currencyQuantity2 = item.getCurrencyQuantity();
        sb4.append(currencyQuantity2 != null ? currencyQuantity2.toPlainString() : null);
        BaseViewHolder gone = text.setText(i12, sb4.toString()).setText(R$id.tv_price, string).setText(R$id.tv_time, TimeUtils.m66422i(C27039d.m66652l(item.getUpdatedAt()))).setGone(R$id.iv_hide, Intrinsics.areEqual(m44943t4(), "PUTUP") && !item.isShow());
        int i13 = R$id.tv_show_hide;
        BaseViewHolder text2 = gone.setGone(i13, Intrinsics.areEqual(m44943t4(), "PUTUP")).setText(i13, item.isShow() ? R$string.hide : R$string.show);
        int i14 = R$id.tv_open_close;
        text2.setText(i14, Intrinsics.areEqual(m44943t4(), "PUTUP") ? R$string.sold_out : R$string.put_away).setOnClickListener(i13, new View.OnClickListener() { // from class: com.kubi.otc.otc.merchant.y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtcManageChildFragment.m44924j4(this.f37826b, item, view);
            }
        }).setOnClickListener(i14, new View.OnClickListener() { // from class: com.kubi.otc.otc.merchant.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtcManageChildFragment.m44925k4(this.f37831b, item, view);
            }
        }).setOnClickListener(R$id.tv_ad_edit, new View.OnClickListener() { // from class: com.kubi.otc.otc.merchant.a3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtcManageChildFragment.m44926l4(this.f37705b, item, view);
            }
        });
    }

    /* JADX INFO: renamed from: m4 */
    public final KcPrimaryButton m44940m4() {
        KcPrimaryButton kcPrimaryButton = new KcPrimaryButton(new ContextThemeWrapper(this.mContext, R$style.styleButton40));
        kcPrimaryButton.setPaddingRelative(C27040e.m66658b(24), 0, C27040e.m66658b(24), 0);
        kcPrimaryButton.setText(getStringRes(R$string.payment_p2p_post_new_ad, new Object[0]));
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.f2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtcManageChildFragment.m44927n4(this.f37728b);
            }
        }, 1, null);
        return kcPrimaryButton;
    }

    /* JADX INFO: renamed from: o4 */
    public final WrapperLoadingView m44941o4() {
        return (WrapperLoadingView) this.f37689b0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View emptyView = m44941o4().getEmptyView();
        View viewFindViewById = emptyView.findViewById(R$id.empty_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66690e(viewFindViewById, C27040e.m66658b(24));
        if (emptyView instanceof ViewGroup) {
            ((ViewGroup) emptyView).addView(m44940m4(), new ViewGroup.LayoutParams(-2, C27040e.m66658b(40)));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<OtcAd>> mo16440r3(int i11, int i12) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("status", m44943t4());
        map.put("page", Integer.valueOf(i11));
        map.put("size", Integer.valueOf(i12));
        Observable observableCompose = m44930s4().m83335m(map).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f37691d0 = z11;
    }

    /* JADX INFO: renamed from: t4 */
    public final String m44943t4() {
        return (String) this.f37688a0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final C37612e0 m44944u4() {
        return (C37612e0) this.f37690c0.getValue(this, f37686f0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.botc_item_ad;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m44946y4(final OtcAd otcAd, boolean z11) {
        if (z11 || !Intrinsics.areEqual(m44943t4(), "PUTUP") || (!Intrinsics.areEqual(otcAd.getNewUserTag(), "1") && !Intrinsics.areEqual(otcAd.getTopTag(), "1"))) {
            m44935H4(otcAd, z11);
            return;
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54159P4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_ad_special_remove_title).m54153J4(R$string.payment_ad_special_removed_des).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.otc.merchant.b3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                OtcManageChildFragment.m44933z4(this.f37711b, otcAd, dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_ad_special_thinking, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54159P4.show(childFragmentManager, "payment_p2p_put_down_ad");
    }

    public OtcManageChildFragment() {
        setPageId("B7P2PMyAdvertisements");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public static final InterfaceC37241c m44884A4() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m44886D4(final OtcManageChildFragment otcManageChildFragment, final OtcAd otcAd, final boolean z11, final ArrayList arrayList) throws Exception {
        C38346y.m86538y(otcManageChildFragment, C27041f.m66668h(otcAd.getLegal()), new Consumer() { // from class: com.kubi.otc.otc.merchant.n2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcManageChildFragment.m44887E4(this.f37770b, otcAd, arrayList, z11, (ArrayList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m44889G4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m44892I4(OtcManageChildFragment otcManageChildFragment, boolean z11, OtcAd otcAd) {
        otcManageChildFragment.m44936J4(z11, otcAd);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m44895K4(OtcManageChildFragment otcManageChildFragment, Disposable disposable) {
        otcManageChildFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m44897L4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m44899M4(OtcManageChildFragment otcManageChildFragment, Object obj) {
        otcManageChildFragment.hideDialogLoading();
        otcManageChildFragment.mo15906F3();
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m44902O4(OtcManageChildFragment otcManageChildFragment, Disposable disposable) {
        otcManageChildFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m44904P4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m44906Q4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, Object obj) {
        int i11;
        otcManageChildFragment.hideDialogLoading();
        if (otcAd.isShow()) {
            i11 = R$string.hide_ad_toast;
        } else {
            i11 = R$string.show_ad_toast;
        }
        ToastCompat.m66437C(i11);
        otcManageChildFragment.mo15906F3();
    }

    /* JADX INFO: renamed from: R4 */
    public static final String m44908R4(OtcManageChildFragment otcManageChildFragment) {
        String strM56285z;
        Bundle arguments = otcManageChildFragment.getArguments();
        if (arguments != null) {
            strM56285z = RouteExKt.m56285z(arguments, "status", "PUTUP");
        } else {
            strM56285z = null;
        }
        return C27041f.m66668h(strM56285z);
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m44924j4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, View view) {
        otcManageChildFragment.m44937N4(otcAd);
        C43852m.m96590b("B7P2PMyAdvertisements", "operation", "3", TuplesKt.m90091to("status", C27041f.m66668h(otcAd.getDisplayStatus())));
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m44925k4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, View view) {
        otcManageChildFragment.m44946y4(otcAd, !Intrinsics.areEqual(otcManageChildFragment.m44943t4(), "PUTUP"));
        C43852m.m96590b("B7P2PMyAdvertisements", "operation", "2", TuplesKt.m90091to("status", C27041f.m66668h(otcAd.getDisplayStatus())));
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m44926l4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, View view) {
        otcManageChildFragment.m44945w4(otcAd);
        C43852m.m96590b("B7P2PMyAdvertisements", "operation", "1", TuplesKt.m90091to("status", C27041f.m66668h(otcAd.getDisplayStatus())));
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m44927n4(OtcManageChildFragment otcManageChildFragment) {
        otcManageChildFragment.m44938f4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m44928q4(OtcManageChildFragment otcManageChildFragment, OtcAd otcAd, Function0 function0, OtcInfoEntity otcInfoEntity) {
        String tradeTimeLimit;
        String onlineType;
        String onlineTimeZone;
        String onlineStartDate;
        String onlineEndDate;
        String legalTradeTimesLimitType;
        otcManageChildFragment.hideDialogLoading();
        AdRule adRule = otcInfoEntity.getAdRule();
        String legalTradeTimesLimit = null;
        if (adRule != null) {
            tradeTimeLimit = adRule.getTradeTimeLimit();
        } else {
            tradeTimeLimit = null;
        }
        otcAd.setTradeTimeLimit(tradeTimeLimit);
        AdRule adRule2 = otcInfoEntity.getAdRule();
        if (adRule2 != null) {
            onlineType = adRule2.getOnlineType();
        } else {
            onlineType = null;
        }
        otcAd.setOnlineType(onlineType);
        AdRule adRule3 = otcInfoEntity.getAdRule();
        if (adRule3 != null) {
            onlineTimeZone = adRule3.getOnlineTimeZone();
        } else {
            onlineTimeZone = null;
        }
        otcAd.setOnlineTimeZone(onlineTimeZone);
        AdRule adRule4 = otcInfoEntity.getAdRule();
        if (adRule4 != null) {
            onlineStartDate = adRule4.getOnlineStartDate();
        } else {
            onlineStartDate = null;
        }
        otcAd.setOnlineStartDate(onlineStartDate);
        AdRule adRule5 = otcInfoEntity.getAdRule();
        if (adRule5 != null) {
            onlineEndDate = adRule5.getOnlineEndDate();
        } else {
            onlineEndDate = null;
        }
        otcAd.setOnlineEndDate(onlineEndDate);
        AdRule adRule6 = otcInfoEntity.getAdRule();
        if (adRule6 != null) {
            legalTradeTimesLimitType = adRule6.getLegalTradeTimesLimitType();
        } else {
            legalTradeTimesLimitType = null;
        }
        otcAd.setLegalTradeTimesLimitType(legalTradeTimesLimitType);
        AdRule adRule7 = otcInfoEntity.getAdRule();
        if (adRule7 != null) {
            legalTradeTimesLimit = adRule7.getLegalTradeTimesLimit();
        }
        otcAd.setLegalTradeTimesLimit(legalTradeTimesLimit);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m44929r4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v4 */
    public static final WrapperLoadingView m44931v4(OtcManageChildFragment otcManageChildFragment) {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        C37612e0 c37612e0M44944u4 = otcManageChildFragment.m44944u4();
        if (c37612e0M44944u4 != null) {
            swipeRefreshRecyclerView = c37612e0M44944u4.f83828b;
        } else {
            swipeRefreshRecyclerView = null;
        }
        return WrapperLoadingView.injectView(swipeRefreshRecyclerView);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m44934B4(final OtcAd otcAd, final boolean z11) {
        Observable<R> observableCompose = m44930s4().m83338q().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.l2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcManageChildFragment.m44886D4(this.f37760b, otcAd, z11, (ArrayList) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.m2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcManageChildFragment.m44889G4(function1, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m44937N4(final OtcAd otcAd) {
        Observable<R> observableCompose = m44930s4().m83326d(C27041f.m66668h(otcAd.getId()), otcAd.isShow()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.c3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcManageChildFragment.m44902O4(this.f37717b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.g2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcManageChildFragment.m44904P4(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.h2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcManageChildFragment.m44906Q4(this.f37736b, otcAd, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m44938f4() {
        Disposable disposableSubscribe = m44930s4().m83338q().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.x2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OtcManageChildFragment.m44922g4(this.f37822b, (ArrayList) obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        super.onReBack();
        mo15906F3();
    }

    /* JADX INFO: renamed from: p4 */
    public final void m44942p4(final OtcAd otcAd, final Function0<Unit> function0) {
        showDialogLoading();
        Observable<R> observableCompose = m44930s4().m83330h(C27041f.m66668h(otcAd.getId())).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.t2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcManageChildFragment.m44928q4(this.f37802b, otcAd, function0, (OtcInfoEntity) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.u2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcManageChildFragment.m44929r4(function1, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        WrapperLoadingView wrapperLoadingViewM44941o4;
        if (getView() != null && (wrapperLoadingViewM44941o4 = m44941o4()) != null) {
            wrapperLoadingViewM44941o4.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        WrapperLoadingView wrapperLoadingViewM44941o4;
        if (getView() != null && (wrapperLoadingViewM44941o4 = m44941o4()) != null) {
            wrapperLoadingViewM44941o4.showEmpty(com.kubi.sdk.R$string.common_no_data, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        WrapperLoadingView wrapperLoadingViewM44941o4;
        if (getView() != null && (wrapperLoadingViewM44941o4 = m44941o4()) != null) {
            wrapperLoadingViewM44941o4.showLoading();
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m44945w4(final OtcAd otcAd) {
        if (Intrinsics.areEqual(m44943t4(), "PUTUP") && Intrinsics.areEqual(otcAd.getNewUserTag(), "1")) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54159P4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.payment_ad_special_edit_des).m54162S4(R$string.payment_ad_special_edit_continue, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.otc.merchant.j2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    OtcManageChildFragment.m44932x4(this.f37746b, otcAd, dialogInterface, i11);
                }
            }).m54159P4(R$string.cancel, null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alertDialogFragmentHelperM54159P4.show(childFragmentManager, "payment_p2p_edit_listed_ad");
            return;
        }
        m44885C4(this, otcAd, false, 2, null);
    }
}
