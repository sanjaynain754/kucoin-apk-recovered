package com.kubi.otc.fiat.withdraw;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import au.InterfaceC4389a;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.coin.TransferJumper;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatCurrency;
import com.kubi.otc.entity.FiatCurrencyParams;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.entity.FiatWithdrawAccountInfo;
import com.kubi.otc.entity.FiatWithdrawAccountsParams;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.otc.fiat.FiatHistoryListFragment;
import com.kubi.otc.service.OtcDepend;
import com.kubi.otc.view.FiatEditTextView;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.common.helper.DayLimitHelper;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.WithdrawTrackData;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import defpackage.displayAccountStatus;
import et.InterfaceC37240b;
import ht.C38346y;
import i10.Menu;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p270ft.C37705x;
import p402kf.C41014a;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AbsFiatWithdrawInputFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00100\u001a\u000201H\u0014J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000203H\u0016J\b\u00109\u001a\u000203H\u0002J\b\u0010:\u001a\u000203H\u0016J\b\u0010;\u001a\u000203H\u0016J\b\u0010<\u001a\u00020)H\u0002J\u0010\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020?H\u0002J\u001c\u0010@\u001a\u0002032\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u0002030BH\u0002J\b\u0010D\u001a\u000203H\u0002J\u0010\u0010E\u001a\u0002032\u0006\u0010F\u001a\u00020GH\u0002J \u0010H\u001a\u0002032\u0018\b\u0002\u0010A\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u000203\u0018\u00010BJ\u0014\u0010I\u001a\u0002032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010K\u001a\u000203H\u0002J\b\u0010L\u001a\u000203H&J\b\u0010M\u001a\u00020)H\u0014J\u0014\u0010N\u001a\u0002032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010CH&J\b\u0010Q\u001a\u000203H\u0002J\u0018\u0010R\u001a\u0002032\u000e\u0010S\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010TH\u0002J\u0010\u0010U\u001a\u0002032\u0006\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u0002032\u0006\u0010V\u001a\u00020WH\u0002J\u0010\u0010Y\u001a\u0002032\u0006\u0010V\u001a\u00020WH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0016X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u0004\u0018\u00010+8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u000e\u0010P\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006["}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "dayLimit", "Lcom/kubi/payment/common/helper/DayLimitHelper;", "getDayLimit", "()Lcom/kubi/payment/common/helper/DayLimitHelper;", "dayLimit$delegate", "accountDialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "fiatAccounts", "", "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "transferCurrency", "", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "fiatBalance", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "getPaymentMethod", "()Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "setPaymentMethod", "(Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V", "accountCurrent", "getAccountCurrent", "()Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "setAccountCurrent", "(Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;)V", "isFirst", "", "vb", "Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawInputBinding;", "getVb", "()Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawInputBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initData", "initView", "onResume", "onStop", "checkInputLimit", "isLimit", "input", "Ljava/math/BigDecimal;", "getWithdrawFee", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lcom/kubi/otc/entity/FiatFee;", "getFiatBalance", "handleBalanceWarning", "balanceInfo", "Lcom/kubi/otc/entity/FiatCurrency;", "getWithdrawAccounts", "initAccountInfo", JAnalysisConstants.Account.KEY_ACCOUNT, "showAddAccountDialog", "startAddAccount", "needLoadFee", "startOrderConfirm", "fee", "number", "trackCheckLimit", "verifyDayLimit", "verifySuccess", "Lkotlin/Function0;", "trackCheckBalance", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "trackCheckAccounts", "trackCheckFee", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbsFiatWithdrawInputFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsFiatWithdrawInputFragment.kt\ncom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,509:1\n147#2,16:510\n17#3,2:526\n48#4,2:528\n*S KotlinDebug\n*F\n+ 1 AbsFiatWithdrawInputFragment.kt\ncom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment\n*L\n75#1:510,16\n389#1:526,2\n298#1:528,2\n*E\n"})
public abstract class AbsFiatWithdrawInputFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: W */
    @Nullable
    public BaseDialogFragment f37433W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public List<FiatWithdrawAccountInfo> f37434X;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public PaymentMethod f37438b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public FiatWithdrawAccountInfo f37439c0;

    /* JADX INFO: renamed from: f0 */
    public int f37442f0;

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f37430h0 = {Reflection.property1(new PropertyReference1Impl(AbsFiatWithdrawInputFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawInputBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f37429g0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37431U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsFiatWithdrawInputFragment.m44350R3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37432V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsFiatWithdrawInputFragment.m44348Q3();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f37435Y = "";

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f37436Z = "";

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f37437a0 = "";

    /* JADX INFO: renamed from: d0 */
    public boolean f37440d0 = true;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC24293a f37441e0 = C45681e.m100799e(this, new Function1<AbsFiatWithdrawInputFragment, C37705x>() { // from class: com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37705x invoke(@NotNull AbsFiatWithdrawInputFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37705x.m84997a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37705x, Unit>() { // from class: com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37705x it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37705x c37705x) {
            invoke(c37705x);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: AbsFiatWithdrawInputFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.CURRENCY, "", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "fragmentName", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@NotNull Context context, @Nullable String currency, @Nullable PaymentMethod paymentMethod, @NotNull String fragmentName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
            BaseFragmentActivity.m56574n0(context, "", fragmentName, new C27051h().m66724h("data", currency).m66721e("data_2", paymentMethod).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment$a */
    /* JADX INFO: compiled from: AbsFiatWithdrawInputFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$getFiatBalance$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19788a extends C24223c1 {
        public C19788a() {
            super(AbsFiatWithdrawInputFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            if (th2 instanceof ApiException) {
                AbsFiatWithdrawInputFragment.this.m44400M4((ApiException) th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment$b */
    /* JADX INFO: compiled from: AbsFiatWithdrawInputFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$getWithdrawAccounts$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19789b extends C24223c1 {
        public C19789b() {
            super(AbsFiatWithdrawInputFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            if (th2 instanceof ApiException) {
                AbsFiatWithdrawInputFragment.this.m44399L4((ApiException) th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment$c */
    /* JADX INFO: compiled from: AbsFiatWithdrawInputFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment$getWithdrawFee$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19790c extends C24223c1 {
        public C19790c() {
            super(AbsFiatWithdrawInputFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            if (th2 instanceof ApiException) {
                AbsFiatWithdrawInputFragment.this.m44401N4((ApiException) th2);
            }
        }
    }

    /* JADX INFO: renamed from: E4 */
    public boolean mo44393E4() {
        return true;
    }

    /* JADX INFO: renamed from: J4 */
    public abstract void mo44397J4();

    /* JADX INFO: renamed from: K4 */
    public abstract void mo44398K4(@Nullable FiatFee fiatFee);

    /* JADX INFO: renamed from: A4 */
    public static final void m44329A4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, View view) {
        FiatHistoryListFragment.f37282Z.startFragment(absFiatWithdrawInputFragment.f37436Z, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m44331B4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, BigDecimal it) {
        FiatEditTextView fiatEditTextView;
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(it, "it");
        if (BigDecimal.ZERO.compareTo(it) != 0) {
            if (absFiatWithdrawInputFragment.m44403P3()) {
                absFiatWithdrawInputFragment.m44402O4();
            }
            return Unit.INSTANCE;
        }
        C37705x c37705xM44408d4 = absFiatWithdrawInputFragment.m44408d4();
        if (c37705xM44408d4 != null && (baseTextView = c37705xM44408d4.f84843m) != null) {
            C27046k.m66700o(baseTextView);
        }
        C37705x c37705xM44408d5 = absFiatWithdrawInputFragment.m44408d4();
        if (c37705xM44408d5 != null && (linearLayout = c37705xM44408d5.f84848r) != null) {
            C27046k.m66685H(linearLayout);
        }
        C37705x c37705xM44408d6 = absFiatWithdrawInputFragment.m44408d4();
        if (c37705xM44408d6 != null && (fiatEditTextView = c37705xM44408d6.f84849s) != null) {
            fiatEditTextView.m45521z();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final DayLimitHelper m44348Q3() {
        return new DayLimitHelper();
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m44349Q4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, String it) {
        FiatEditTextView fiatEditTextView;
        Intrinsics.checkNotNullParameter(it, "it");
        C37705x c37705xM44408d4 = absFiatWithdrawInputFragment.m44408d4();
        if (c37705xM44408d4 != null && (fiatEditTextView = c37705xM44408d4.f84849s) != null) {
            fiatEditTextView.setInputText(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    private final DayLimitHelper m44352U3() {
        return (DayLimitHelper) this.f37432V.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    private final InterfaceC37240b m44353V3() {
        return (InterfaceC37240b) this.f37431U.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m44359f4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWithdrawAccounts");
        }
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        absFiatWithdrawInputFragment.m44409e4(function1);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m44360g4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, Function1 function1, List list) {
        absFiatWithdrawInputFragment.f37434X = list;
        absFiatWithdrawInputFragment.hideDialogLoading();
        Object obj = null;
        if (list == null || list.isEmpty()) {
            m44372p4(absFiatWithdrawInputFragment, null, 1, null);
            if (function1 != null) {
                function1.invoke(absFiatWithdrawInputFragment.f37439c0);
            }
            return Unit.INSTANCE;
        }
        for (Object obj2 : list) {
            String payoutAccountId = ((FiatWithdrawAccountInfo) obj2).getPayoutAccountId();
            FiatWithdrawAccountInfo fiatWithdrawAccountInfo = absFiatWithdrawInputFragment.f37439c0;
            if (Intrinsics.areEqual(payoutAccountId, fiatWithdrawAccountInfo != null ? fiatWithdrawAccountInfo.getPayoutAccountId() : null)) {
                obj = obj2;
                break;
            }
        }
        FiatWithdrawAccountInfo fiatWithdrawAccountInfo2 = (FiatWithdrawAccountInfo) obj;
        if (fiatWithdrawAccountInfo2 == null) {
            fiatWithdrawAccountInfo2 = (FiatWithdrawAccountInfo) CollectionsKt.firstOrNull(list);
        }
        absFiatWithdrawInputFragment.m44412o4(fiatWithdrawAccountInfo2);
        if (function1 != null) {
            function1.invoke(absFiatWithdrawInputFragment.f37439c0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m44372p4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, FiatWithdrawAccountInfo fiatWithdrawAccountInfo, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initAccountInfo");
        }
        if ((i11 & 1) != 0) {
            fiatWithdrawAccountInfo = null;
        }
        absFiatWithdrawInputFragment.m44412o4(fiatWithdrawAccountInfo);
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m44375r4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment) {
        OtcDepend otcDepend = OtcDepend.f38138a;
        OtcDepend.m45451d(otcDepend, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.otc.fiat.withdraw.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsFiatWithdrawInputFragment.m44377s4();
            }
        }), 1, null);
        if (!otcDepend.m45466o()) {
            return Unit.INSTANCE;
        }
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, absFiatWithdrawInputFragment.f37435Y, null, null, "TRADE", "MAIN", false, null, 102, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m44377s4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m44383v4(final AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment) {
        PaymentMethod paymentMethod = absFiatWithdrawInputFragment.f37438b0;
        Pair pairM90091to = TuplesKt.m90091to("paymentMethodCode", C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null));
        PaymentMethod paymentMethod2 = absFiatWithdrawInputFragment.f37438b0;
        C43852m.m96590b("B7WithdrawAmount", "button", "1", pairM90091to, TuplesKt.m90091to("channelId", C27041f.m66668h(paymentMethod2 != null ? paymentMethod2.getChannelId() : null)));
        if (absFiatWithdrawInputFragment.f37439c0 == null) {
            absFiatWithdrawInputFragment.mo44397J4();
            return Unit.INSTANCE;
        }
        if (absFiatWithdrawInputFragment.m44403P3()) {
            return Unit.INSTANCE;
        }
        absFiatWithdrawInputFragment.m44347P4(new Function0() { // from class: com.kubi.otc.fiat.withdraw.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsFiatWithdrawInputFragment.m44385w4(this.f37611b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m44387x4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, FiatFee it) {
        Intrinsics.checkNotNullParameter(it, "it");
        absFiatWithdrawInputFragment.mo44398K4(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m44389y4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, Ref.BooleanRef booleanRef, FiatWithdrawAccountInfo fiatWithdrawAccountInfo) {
        C37705x c37705xM44408d4;
        FiatEditTextView fiatEditTextView;
        if (fiatWithdrawAccountInfo == null) {
            absFiatWithdrawInputFragment.m44396H4();
        } else if (!booleanRef.element && (c37705xM44408d4 = absFiatWithdrawInputFragment.m44408d4()) != null && (fiatEditTextView = c37705xM44408d4.f84849s) != null) {
            fiatEditTextView.m45518B();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m44391z4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, View view) {
        FiatHistoryListFragment.f37282Z.startFragment(absFiatWithdrawInputFragment.f37436Z, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: D4 */
    public final boolean m44392D4(BigDecimal bigDecimal) {
        PaymentMethod paymentMethod = this.f37438b0;
        if (bigDecimal.compareTo(C38346y.m86490A(paymentMethod != null ? paymentMethod.getMinAmount() : null)) != -1) {
            PaymentMethod paymentMethod2 = this.f37438b0;
            if (bigDecimal.compareTo(C38346y.m86490A(paymentMethod2 != null ? paymentMethod2.getMaxAmount() : null)) != 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: F4 */
    public final void m44394F4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f37436Z = str;
    }

    /* JADX INFO: renamed from: G4 */
    public final void m44395G4(@Nullable PaymentMethod paymentMethod) {
        this.f37438b0 = paymentMethod;
    }

    /* JADX INFO: renamed from: H4 */
    public final void m44396H4() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.fiat_withdraw_add_title).m54156M4(getStringRes(R$string.fiat_withdraw_add_msg, new Object[0])).m54162S4(R$string.pay_account_empty_add, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.fiat.withdraw.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AbsFiatWithdrawInputFragment.m44340I4(this.f37614b, dialogInterface, i11);
            }
        }).m54159P4(R$string.pay_fiat_capitual_i_will_do_it_later, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: L4 */
    public final void m44399L4(ApiException apiException) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        PaymentMethod paymentMethod = this.f37438b0;
        WithdrawTrackData withdrawTrackData = new WithdrawTrackData(paymentMethod != null ? paymentMethod.getChannelId() : null);
        withdrawTrackData.setFiatCurrency(this.f37436Z);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49795f(track, "CHECK_ACCOUNTS", false, str, withdrawTrackData, 2, null);
    }

    /* JADX INFO: renamed from: M4 */
    public final void m44400M4(ApiException apiException) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        PaymentMethod paymentMethod = this.f37438b0;
        WithdrawTrackData withdrawTrackData = new WithdrawTrackData(paymentMethod != null ? paymentMethod.getChannelId() : null);
        withdrawTrackData.setFiatCurrency(this.f37436Z);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49795f(track, "CHECK_BALANCE", false, str, withdrawTrackData, 2, null);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m44401N4(ApiException apiException) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        PaymentMethod paymentMethod = this.f37438b0;
        WithdrawTrackData withdrawTrackData = new WithdrawTrackData(paymentMethod != null ? paymentMethod.getChannelId() : null);
        withdrawTrackData.setFiatCurrency(this.f37436Z);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49795f(track, "CHECK_FEE", false, str, withdrawTrackData, 2, null);
    }

    /* JADX INFO: renamed from: O4 */
    public final void m44402O4() {
        int i11 = this.f37442f0 + 1;
        this.f37442f0 = i11;
        if (i11 < 3) {
            return;
        }
        this.f37442f0 = 0;
        PaymentMethod paymentMethod = this.f37438b0;
        String channelId = paymentMethod != null ? paymentMethod.getChannelId() : null;
        if (Intrinsics.areEqual(channelId, "capitual")) {
            IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
            PaymentMethod paymentMethod2 = this.f37438b0;
            WithdrawTrackData withdrawTrackData = new WithdrawTrackData(paymentMethod2 != null ? paymentMethod2.getChannelId() : null);
            withdrawTrackData.setFiatCurrency(this.f37436Z);
            Unit unit = Unit.INSTANCE;
            IPaymentTrack.m49795f(track, "CHECK_CAPITUAL_LIMIT", false, "-10003:CHECK_CAPITUAL_LIMIT", withdrawTrackData, 2, null);
            return;
        }
        if (Intrinsics.areEqual(channelId, "advcash")) {
            IPaymentTrack track2 = IPaymentTrack.f40346a.getTrack();
            PaymentMethod paymentMethod3 = this.f37438b0;
            WithdrawTrackData withdrawTrackData2 = new WithdrawTrackData(paymentMethod3 != null ? paymentMethod3.getChannelId() : null);
            withdrawTrackData2.setFiatCurrency(this.f37436Z);
            Unit unit2 = Unit.INSTANCE;
            IPaymentTrack.m49795f(track2, "CHECK_ADVCASH_LIMIT", false, "-10005:CHECK_ADVCASH_LIMIT", withdrawTrackData2, 2, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: S3, reason: from getter */
    public final FiatWithdrawAccountInfo getF37439c0() {
        return this.f37439c0;
    }

    @NotNull
    /* JADX INFO: renamed from: T3, reason: from getter */
    public final String getF37436Z() {
        return this.f37436Z;
    }

    @Nullable
    /* JADX INFO: renamed from: c4, reason: from getter */
    public final PaymentMethod getF37438b0() {
        return this.f37438b0;
    }

    @Nullable
    /* JADX INFO: renamed from: d4 */
    public final C37705x m44408d4() {
        return (C37705x) this.f37441e0.getValue(this, f37430h0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_withdraw_input;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m44412o4(FiatWithdrawAccountInfo fiatWithdrawAccountInfo) {
        String subName;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        String name;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        this.f37439c0 = fiatWithdrawAccountInfo;
        if (fiatWithdrawAccountInfo == null) {
            C37705x c37705xM44408d4 = m44408d4();
            if (c37705xM44408d4 != null && (baseTextView12 = c37705xM44408d4.f84842l) != null) {
                C27046k.m66700o(baseTextView12);
            }
            C37705x c37705xM44408d5 = m44408d4();
            if (c37705xM44408d5 != null && (baseTextView11 = c37705xM44408d5.f84844n) != null) {
                C27046k.m66700o(baseTextView11);
            }
            C37705x c37705xM44408d6 = m44408d4();
            if (c37705xM44408d6 != null && (baseTextView10 = c37705xM44408d6.f84836f) != null) {
                C27046k.m66700o(baseTextView10);
            }
            C37705x c37705xM44408d7 = m44408d4();
            if (c37705xM44408d7 == null || (baseTextView9 = c37705xM44408d7.f84837g) == null) {
                return;
            }
            C27046k.m66685H(baseTextView9);
            return;
        }
        C37705x c37705xM44408d8 = m44408d4();
        if (c37705xM44408d8 != null && (baseTextView8 = c37705xM44408d8.f84842l) != null) {
            C27046k.m66685H(baseTextView8);
        }
        C37705x c37705xM44408d9 = m44408d4();
        if (c37705xM44408d9 != null && (baseTextView7 = c37705xM44408d9.f84837g) != null) {
            C27046k.m66700o(baseTextView7);
        }
        C37705x c37705xM44408d10 = m44408d4();
        if (c37705xM44408d10 != null && (baseTextView6 = c37705xM44408d10.f84842l) != null) {
            FiatWithdrawAccountInfo fiatWithdrawAccountInfo2 = this.f37439c0;
            if (fiatWithdrawAccountInfo2 != null) {
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                PaymentMethod paymentMethod = this.f37438b0;
                name = fiatWithdrawAccountInfo2.getName(mContext, paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null);
            } else {
                name = null;
            }
            baseTextView6.setText(name);
        }
        FiatWithdrawAccountInfo fiatWithdrawAccountInfo3 = this.f37439c0;
        if (fiatWithdrawAccountInfo3 != null) {
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            PaymentMethod paymentMethod2 = this.f37438b0;
            subName = fiatWithdrawAccountInfo3.getSubName(mContext2, paymentMethod2 != null ? paymentMethod2.getPaymentMethodCode() : null);
        } else {
            subName = null;
        }
        if (subName == null || subName.length() == 0) {
            C37705x c37705xM44408d11 = m44408d4();
            if (c37705xM44408d11 != null && (baseTextView = c37705xM44408d11.f84836f) != null) {
                C27046k.m66700o(baseTextView);
            }
        } else {
            C37705x c37705xM44408d12 = m44408d4();
            if (c37705xM44408d12 != null && (baseTextView5 = c37705xM44408d12.f84836f) != null) {
                C27046k.m66685H(baseTextView5);
            }
            C37705x c37705xM44408d13 = m44408d4();
            if (c37705xM44408d13 != null && (baseTextView4 = c37705xM44408d13.f84836f) != null) {
                baseTextView4.setText(subName);
            }
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC4389a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC4389a) objM56186h).m4000a() : false) {
            C37705x c37705xM44408d14 = m44408d4();
            if (c37705xM44408d14 == null || (baseTextView3 = c37705xM44408d14.f84844n) == null) {
                return;
            }
            C27046k.m66700o(baseTextView3);
            return;
        }
        C37705x c37705xM44408d15 = m44408d4();
        if (c37705xM44408d15 == null || (baseTextView2 = c37705xM44408d15.f84844n) == null) {
            return;
        }
        FiatWithdrawAccountInfo fiatWithdrawAccountInfo4 = this.f37439c0;
        displayAccountStatus.m4788a(baseTextView2, fiatWithdrawAccountInfo4 != null ? fiatWithdrawAccountInfo4.getStatus() : null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        mo44413q4();
        initView();
        JSONObject jSONObject = new JSONObject();
        PaymentMethod paymentMethod = this.f37438b0;
        jSONObject.put("paymentMethodCode", C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null));
        PaymentMethod paymentMethod2 = this.f37438b0;
        jSONObject.put("channelId", C27041f.m66668h(paymentMethod2 != null ? paymentMethod2.getChannelId() : null));
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g("B7WithdrawAmount", "withdrawInput", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m44333C4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment) {
        FiatEditTextView fiatEditTextView;
        C37705x c37705xM44408d4 = absFiatWithdrawInputFragment.m44408d4();
        if (c37705xM44408d4 != null && (fiatEditTextView = c37705xM44408d4.f84849s) != null) {
            fiatEditTextView.setInputText(absFiatWithdrawInputFragment.f37437a0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m44340I4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, DialogInterface dialogInterface, int i11) {
        absFiatWithdrawInputFragment.mo44397J4();
    }

    /* JADX INFO: renamed from: P4 */
    private final void m44347P4(Function0<Unit> function0) {
        String inputText;
        FiatEditTextView fiatEditTextView;
        showDialogLoading();
        DayLimitHelper dayLimitHelperM44352U3 = m44352U3();
        C37705x c37705xM44408d4 = m44408d4();
        if (c37705xM44408d4 != null && (fiatEditTextView = c37705xM44408d4.f84849s) != null) {
            inputText = fiatEditTextView.getInputText();
        } else {
            inputText = null;
        }
        String strM66668h = C27041f.m66668h(inputText);
        String str = this.f37436Z;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dayLimitHelperM44352U3.m46255n(strM66668h, str, "WITHDRAW", lifecycleScope, childFragmentManager, function0, new Function1() { // from class: com.kubi.otc.fiat.withdraw.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFiatWithdrawInputFragment.m44349Q4(this.f37630b, (String) obj);
            }
        }, new Function0() { // from class: com.kubi.otc.fiat.withdraw.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsFiatWithdrawInputFragment.m44351R4(this.f37636b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final InterfaceC37240b m44350R3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m44351R4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment) {
        absFiatWithdrawInputFragment.hideDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m44354X3(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, Disposable disposable) {
        absFiatWithdrawInputFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m44355Y3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m44356Z3(final AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, FiatCurrency fiatCurrency) {
        String strM89945s;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout2;
        String strM89945s2;
        BaseTextView baseTextView2;
        ImageView imageView;
        ConstraintLayout constraintLayout3;
        absFiatWithdrawInputFragment.hideDialogLoading();
        String strM89945s3 = null;
        if (C27025c.m66566d(fiatCurrency.getTransfer())) {
            absFiatWithdrawInputFragment.f37435Y = C27041f.m66668h(fiatCurrency.getCurrency());
            C37705x c37705xM44408d4 = absFiatWithdrawInputFragment.m44408d4();
            if (c37705xM44408d4 != null && (constraintLayout3 = c37705xM44408d4.f84850t) != null) {
                C27046k.m66685H(constraintLayout3);
            }
            C37705x c37705xM44408d5 = absFiatWithdrawInputFragment.m44408d4();
            if (c37705xM44408d5 != null && (imageView = c37705xM44408d5.f84833c) != null) {
                C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.s
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbsFiatWithdrawInputFragment.m44357a4(this.f37622b);
                    }
                }, 1, null);
            }
            try {
                C37705x c37705xM44408d6 = absFiatWithdrawInputFragment.m44408d4();
                if (c37705xM44408d6 != null && (baseTextView2 = c37705xM44408d6.f84846p) != null) {
                    baseTextView2.setText(absFiatWithdrawInputFragment.getString(R$string.payment_withdraw_input_deduction_tips, absFiatWithdrawInputFragment.f37436Z, "1:" + fiatCurrency.getFiat2CryptoRate(), absFiatWithdrawInputFragment.f37435Y));
                }
            } catch (Exception unused) {
                C43846g.m96568c(new OtcMessage("warning text language transfer error", "getFiatBalance", false, 4, null), null, 2, null);
                C37705x c37705xM44408d7 = absFiatWithdrawInputFragment.m44408d4();
                if (c37705xM44408d7 != null && (constraintLayout2 = c37705xM44408d7.f84850t) != null) {
                    C27046k.m66700o(constraintLayout2);
                }
            }
            String transferAvailableBalance = fiatCurrency.getTransferAvailableBalance();
            if (transferAvailableBalance != null) {
                strM89945s2 = C41014a.m89945s(transferAvailableBalance, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
            } else {
                strM89945s2 = null;
            }
            absFiatWithdrawInputFragment.f37437a0 = C27041f.m66668h(strM89945s2);
        } else {
            absFiatWithdrawInputFragment.f37435Y = C27041f.m66668h(absFiatWithdrawInputFragment.f37436Z);
            C37705x c37705xM44408d8 = absFiatWithdrawInputFragment.m44408d4();
            if (c37705xM44408d8 != null && (constraintLayout = c37705xM44408d8.f84850t) != null) {
                C27046k.m66700o(constraintLayout);
            }
            String availableBalance = fiatCurrency.getAvailableBalance();
            if (availableBalance != null) {
                strM89945s = C41014a.m89945s(availableBalance, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
            } else {
                strM89945s = null;
            }
            absFiatWithdrawInputFragment.f37437a0 = C27041f.m66668h(strM89945s);
        }
        C37705x c37705xM44408d9 = absFiatWithdrawInputFragment.m44408d4();
        if (c37705xM44408d9 != null && (baseTextView = c37705xM44408d9.f84839i) != null) {
            int i11 = R$string.fiat_withdraw_input_balance;
            String availableBalance2 = fiatCurrency.getAvailableBalance();
            if (availableBalance2 != null) {
                strM89945s3 = C41014a.m89945s(availableBalance2, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
            }
            baseTextView.setText(absFiatWithdrawInputFragment.getString(i11, C27041f.m66669i(strM89945s3, "--"), C27041f.m66668h(fiatCurrency.getCurrency())));
        }
        Intrinsics.checkNotNull(fiatCurrency);
        absFiatWithdrawInputFragment.m44411n4(fiatCurrency);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m44357a4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment) {
        ConstraintLayout constraintLayout;
        C37705x c37705xM44408d4 = absFiatWithdrawInputFragment.m44408d4();
        if (c37705xM44408d4 != null && (constraintLayout = c37705xM44408d4.f84850t) != null) {
            C27046k.m66700o(constraintLayout);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m44358b4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m44361h4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void initView() {
        FiatEditTextView fiatEditTextView;
        KcPrimaryButton kcPrimaryButton;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        FiatEditTextView fiatEditTextView2;
        FiatEditTextView fiatEditTextView3;
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setMainTitle(getString(R$string.fiat_withdraw_title, this.f37436Z));
            navigationBar.m54696g(R$drawable.ic2_history_20, new View.OnClickListener() { // from class: com.kubi.otc.fiat.withdraw.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbsFiatWithdrawInputFragment.m44391z4(this.f37502b, view);
                }
            });
            ImageView rightOne = navigationBar.getRightOne();
            if (rightOne != null) {
                rightOne.setColorFilter(ContextCompat.getColor(this.mContext, R$color.c_text));
            }
        } else {
            TitleBar titleBar = getTitleBar();
            titleBar.setTitle(getString(R$string.fiat_withdraw_title, this.f37436Z));
            titleBar.setMenu(new Menu(0, Integer.valueOf(R$drawable.ic2_history_20), Integer.valueOf(R$color.c_text), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.otc.fiat.withdraw.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbsFiatWithdrawInputFragment.m44329A4(this.f37578b, view);
                }
            }, 0, 377, null));
        }
        C37705x c37705xM44408d4 = m44408d4();
        if (c37705xM44408d4 != null && (fiatEditTextView3 = c37705xM44408d4.f84849s) != null) {
            fiatEditTextView3.setCurrency(C27041f.m66668h(this.f37436Z));
        }
        C37705x c37705xM44408d5 = m44408d4();
        if (c37705xM44408d5 != null && (fiatEditTextView2 = c37705xM44408d5.f84849s) != null) {
            fiatEditTextView2.m45520o(this, new Function1() { // from class: com.kubi.otc.fiat.withdraw.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsFiatWithdrawInputFragment.m44331B4(this.f37581b, (BigDecimal) obj);
                }
            });
        }
        C37705x c37705xM44408d6 = m44408d4();
        if (c37705xM44408d6 != null && (baseTextView2 = c37705xM44408d6.f84838h) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.f0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsFiatWithdrawInputFragment.m44333C4(this.f37584b);
                }
            }, 1, null);
        }
        C37705x c37705xM44408d7 = m44408d4();
        if (c37705xM44408d7 != null && (baseTextView = c37705xM44408d7.f84845o) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsFiatWithdrawInputFragment.m44375r4(this.f37587b);
                }
            }, 1, null);
        }
        C37705x c37705xM44408d8 = m44408d4();
        if (c37705xM44408d8 != null && (constraintLayout = c37705xM44408d8.f84847q) != null) {
            C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.h0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsFiatWithdrawInputFragment.m44379t4(this.f37591b);
                }
            }, 1, null);
        }
        C37705x c37705xM44408d9 = m44408d4();
        if (c37705xM44408d9 != null && (kcPrimaryButton = c37705xM44408d9.f84841k) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsFiatWithdrawInputFragment.m44383v4(this.f37595b);
                }
            }, 1, null);
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        FiatWithdrawAccountInfo fiatWithdrawAccountInfo = this.f37439c0;
        if (fiatWithdrawAccountInfo != null) {
            m44412o4(fiatWithdrawAccountInfo);
            C37705x c37705xM44408d10 = m44408d4();
            if (c37705xM44408d10 != null && (fiatEditTextView = c37705xM44408d10.f84849s) != null) {
                fiatEditTextView.m45518B();
            }
            booleanRef.element = true;
        } else {
            showDialogLoading();
        }
        m44409e4(new Function1() { // from class: com.kubi.otc.fiat.withdraw.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFiatWithdrawInputFragment.m44389y4(this.f37597b, booleanRef, (FiatWithdrawAccountInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m44362j4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, Disposable disposable) {
        absFiatWithdrawInputFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m44364k4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m44366l4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, Function1 function1, FiatFee fiatFee) {
        absFiatWithdrawInputFragment.hideDialogLoading();
        Intrinsics.checkNotNull(fiatFee);
        function1.invoke(fiatFee);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m44368m4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m44379t4(final AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment) {
        String paymentMethodCode;
        FiatEditTextView fiatEditTextView;
        C37705x c37705xM44408d4 = absFiatWithdrawInputFragment.m44408d4();
        if (c37705xM44408d4 != null && (fiatEditTextView = c37705xM44408d4.f84849s) != null) {
            fiatEditTextView.m45519n();
        }
        if (absFiatWithdrawInputFragment.f37439c0 == null) {
            absFiatWithdrawInputFragment.mo44397J4();
            return Unit.INSTANCE;
        }
        List<FiatWithdrawAccountInfo> list = absFiatWithdrawInputFragment.f37434X;
        if (list != null && !list.isEmpty()) {
            FiatWithdrawAccountsDialogFragment.Companion companion = FiatWithdrawAccountsDialogFragment.f37446y0;
            FragmentManager childFragmentManager = absFiatWithdrawInputFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            PaymentMethod paymentMethod = absFiatWithdrawInputFragment.f37438b0;
            String payoutAccountId = null;
            if (paymentMethod != null) {
                paymentMethodCode = paymentMethod.getPaymentMethodCode();
            } else {
                paymentMethodCode = null;
            }
            String strM66668h = C27041f.m66668h(paymentMethodCode);
            String str = absFiatWithdrawInputFragment.f37436Z;
            FiatWithdrawAccountInfo fiatWithdrawAccountInfo = absFiatWithdrawInputFragment.f37439c0;
            if (fiatWithdrawAccountInfo != null) {
                payoutAccountId = fiatWithdrawAccountInfo.getPayoutAccountId();
            }
            absFiatWithdrawInputFragment.f37433W = companion.showDialog(childFragmentManager, new FiatWithdrawAccountsParams(strM66668h, str, payoutAccountId, absFiatWithdrawInputFragment.f37434X), new Consumer() { // from class: com.kubi.otc.fiat.withdraw.r
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsFiatWithdrawInputFragment.m44381u4(this.f37617b, (FiatWithdrawAccountInfo) obj);
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m44381u4(AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment, FiatWithdrawAccountInfo fiatWithdrawAccountInfo) {
        absFiatWithdrawInputFragment.m44412o4(fiatWithdrawAccountInfo);
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m44385w4(final AbsFiatWithdrawInputFragment absFiatWithdrawInputFragment) {
        if (absFiatWithdrawInputFragment.mo44393E4()) {
            absFiatWithdrawInputFragment.m44410i4(new Function1() { // from class: com.kubi.otc.fiat.withdraw.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsFiatWithdrawInputFragment.m44387x4(this.f37641b, (FiatFee) obj);
                }
            });
        } else {
            absFiatWithdrawInputFragment.mo44398K4(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public final boolean m44403P3() {
        String inputText;
        FiatEditTextView fiatEditTextView;
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        FiatEditTextView fiatEditTextView2;
        LinearLayout linearLayout2;
        BaseTextView baseTextView2;
        String minAmount;
        BaseTextView baseTextView3;
        FiatEditTextView fiatEditTextView3;
        LinearLayout linearLayout3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        FiatEditTextView fiatEditTextView4;
        C37705x c37705xM44408d4 = m44408d4();
        String maxAmount = null;
        if (c37705xM44408d4 != null && (fiatEditTextView4 = c37705xM44408d4.f84849s) != null) {
            inputText = fiatEditTextView4.getInputText();
        } else {
            inputText = null;
        }
        BigDecimal bigDecimalM86490A = C38346y.m86490A(inputText);
        if (bigDecimalM86490A.compareTo(C38346y.m86490A(this.f37437a0)) == 1) {
            C37705x c37705xM44408d5 = m44408d4();
            if (c37705xM44408d5 != null && (baseTextView5 = c37705xM44408d5.f84843m) != null) {
                C27046k.m66685H(baseTextView5);
            }
            C37705x c37705xM44408d6 = m44408d4();
            if (c37705xM44408d6 != null && (baseTextView4 = c37705xM44408d6.f84843m) != null) {
                baseTextView4.setText(getString(R$string.balance_insufficient));
            }
            C37705x c37705xM44408d7 = m44408d4();
            if (c37705xM44408d7 != null && (linearLayout3 = c37705xM44408d7.f84848r) != null) {
                C27046k.m66700o(linearLayout3);
            }
            C37705x c37705xM44408d8 = m44408d4();
            if (c37705xM44408d8 != null && (fiatEditTextView3 = c37705xM44408d8.f84849s) != null) {
                fiatEditTextView3.m45517A();
            }
            return true;
        }
        if (C27025c.m66566d(Boolean.valueOf(m44392D4(bigDecimalM86490A)))) {
            C37705x c37705xM44408d9 = m44408d4();
            if (c37705xM44408d9 != null && (baseTextView3 = c37705xM44408d9.f84843m) != null) {
                C27046k.m66685H(baseTextView3);
            }
            C37705x c37705xM44408d10 = m44408d4();
            if (c37705xM44408d10 != null && (baseTextView2 = c37705xM44408d10.f84843m) != null) {
                int i11 = R$string.fiat_withdraw_input_limit;
                PaymentMethod paymentMethod = this.f37438b0;
                if (paymentMethod != null) {
                    minAmount = paymentMethod.getMinAmount();
                } else {
                    minAmount = null;
                }
                String plainString = C6447a.m11724a(C38346y.m86490A(minAmount)).toPlainString();
                PaymentMethod paymentMethod2 = this.f37438b0;
                if (paymentMethod2 != null) {
                    maxAmount = paymentMethod2.getMaxAmount();
                }
                baseTextView2.setText(getString(i11, plainString, C6447a.m11724a(C38346y.m86490A(maxAmount)).toPlainString(), this.f37436Z));
            }
            C37705x c37705xM44408d11 = m44408d4();
            if (c37705xM44408d11 != null && (linearLayout2 = c37705xM44408d11.f84848r) != null) {
                C27046k.m66700o(linearLayout2);
            }
            C37705x c37705xM44408d12 = m44408d4();
            if (c37705xM44408d12 != null && (fiatEditTextView2 = c37705xM44408d12.f84849s) != null) {
                fiatEditTextView2.m45517A();
            }
            return true;
        }
        C37705x c37705xM44408d13 = m44408d4();
        if (c37705xM44408d13 != null && (baseTextView = c37705xM44408d13.f84843m) != null) {
            C27046k.m66700o(baseTextView);
        }
        C37705x c37705xM44408d14 = m44408d4();
        if (c37705xM44408d14 != null && (linearLayout = c37705xM44408d14.f84848r) != null) {
            C27046k.m66685H(linearLayout);
        }
        C37705x c37705xM44408d15 = m44408d4();
        if (c37705xM44408d15 != null && (fiatEditTextView = c37705xM44408d15.f84849s) != null) {
            fiatEditTextView.m45521z();
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: W3 */
    public final void m44406W3() {
        String channelId;
        InterfaceC37240b interfaceC37240bM44353V3 = m44353V3();
        PaymentMethod paymentMethod = this.f37438b0;
        String paymentMethodCode = null;
        if (paymentMethod != null) {
            channelId = paymentMethod.getChannelId();
        } else {
            channelId = null;
        }
        String strM66668h = C27041f.m66668h(channelId);
        PaymentMethod paymentMethod2 = this.f37438b0;
        if (paymentMethod2 != null) {
            paymentMethodCode = paymentMethod2.getPaymentMethodCode();
        }
        Observable<R> observableCompose = interfaceC37240bM44353V3.m83305r(new FiatCurrencyParams(strM66668h, C27041f.m66668h(paymentMethodCode), C27041f.m66668h(this.f37436Z), null, null, 24, null)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFiatWithdrawInputFragment.m44354X3(this.f37603b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsFiatWithdrawInputFragment.m44355Y3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFiatWithdrawInputFragment.m44356Z3(this.f37608b, (FiatCurrency) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsFiatWithdrawInputFragment.m44358b4(function2, obj);
            }
        }, new C19788a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m44409e4(@Nullable final Function1<? super FiatWithdrawAccountInfo, Unit> function1) {
        String channelId;
        InterfaceC37240b interfaceC37240bM44353V3 = m44353V3();
        PaymentMethod paymentMethod = this.f37438b0;
        String paymentMethodCode = null;
        if (paymentMethod != null) {
            channelId = paymentMethod.getChannelId();
        } else {
            channelId = null;
        }
        String strM66668h = C27041f.m66668h(channelId);
        PaymentMethod paymentMethod2 = this.f37438b0;
        if (paymentMethod2 != null) {
            paymentMethodCode = paymentMethod2.getPaymentMethodCode();
        }
        Observable<R> observableCompose = interfaceC37240bM44353V3.m83308u(strM66668h, C27041f.m66668h(paymentMethodCode), this.f37436Z).compose(C24217a1.m58389m());
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFiatWithdrawInputFragment.m44360g4(this.f37593b, function1, (List) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsFiatWithdrawInputFragment.m44361h4(function2, obj);
            }
        }, new C19789b());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m44410i4(final Function1<? super FiatFee, Unit> function1) {
        String inputText;
        FiatEditTextView fiatEditTextView;
        InterfaceC37240b interfaceC37240bM44353V3 = m44353V3();
        FiatFee.Companion companion = FiatFee.INSTANCE;
        String str = this.f37436Z;
        C37705x c37705xM44408d4 = m44408d4();
        String paymentMethodCode = null;
        if (c37705xM44408d4 != null && (fiatEditTextView = c37705xM44408d4.f84849s) != null) {
            inputText = fiatEditTextView.getInputText();
        } else {
            inputText = null;
        }
        PaymentMethod paymentMethod = this.f37438b0;
        if (paymentMethod != null) {
            paymentMethodCode = paymentMethod.getPaymentMethodCode();
        }
        Observable<R> observableCompose = interfaceC37240bM44353V3.m83298k(FiatFee.Companion.getParams$default(companion, str, inputText, paymentMethodCode, "WITHDRAW", null, 16, null)).compose(C24217a1.m58389m());
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFiatWithdrawInputFragment.m44362j4(this.f37645b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsFiatWithdrawInputFragment.m44364k4(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFiatWithdrawInputFragment.m44366l4(this.f37467b, function1, (FiatFee) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsFiatWithdrawInputFragment.m44368m4(function3, obj);
            }
        }, new C19790c());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m44411n4(FiatCurrency fiatCurrency) {
        AlertTipsTextView alertTipsTextView;
        AlertTipsTextView alertTipsTextView2;
        AlertTipsTextView alertTipsTextView3;
        if (DowngradeExKt.m66535e(fiatCurrency.getInTransitBalance(), null, 1, null).compareTo(BigDecimal.ZERO) <= 0) {
            C37705x c37705xM44408d4 = m44408d4();
            if (c37705xM44408d4 != null && (alertTipsTextView3 = c37705xM44408d4.f84840j) != null) {
                C27046k.m66700o(alertTipsTextView3);
                return;
            }
            return;
        }
        C37705x c37705xM44408d5 = m44408d4();
        if (c37705xM44408d5 != null && (alertTipsTextView2 = c37705xM44408d5.f84840j) != null) {
            alertTipsTextView2.setText(getStringRes(R$string.payment_balance_warning, C27041f.m66668h(fiatCurrency.getInTransitBalance()), C27041f.m66668h(fiatCurrency.getCurrency())));
        }
        C37705x c37705xM44408d6 = m44408d4();
        if (c37705xM44408d6 != null && (alertTipsTextView = c37705xM44408d6.f84840j) != null) {
            C27046k.m66685H(alertTipsTextView);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m44406W3();
        if (this.f37440d0) {
            this.f37440d0 = false;
        } else {
            m44359f4(this, null, 1, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        BaseDialogFragment baseDialogFragment = this.f37433W;
        if (baseDialogFragment != null) {
            baseDialogFragment.dismiss();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public void mo44413q4() {
        String string;
        Bundle arguments = getArguments();
        PaymentMethod paymentMethod = null;
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        this.f37436Z = C27041f.m66668h(string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            paymentMethod = (PaymentMethod) RouteExKt.m56274t(arguments2, "data_2");
        }
        this.f37438b0 = paymentMethod;
    }
}
