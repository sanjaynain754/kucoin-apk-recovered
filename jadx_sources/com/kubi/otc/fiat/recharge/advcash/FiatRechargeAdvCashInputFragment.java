package com.kubi.otc.fiat.recharge.advcash;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.entity.FiatAdvcashRechargeMode;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.fiat.FiatHistoryListFragment;
import com.kubi.otc.view.FiatEditTextView;
import com.kubi.payment.common.helper.DayLimitHelper;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.RechargeTrackData;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37240b;
import ht.C38346y;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37681s;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
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

/* JADX INFO: compiled from: FiatRechargeAdvCashInputFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0002J\u0019\u0010'\u001a\u00020 2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020 2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010,H\u0002J\b\u0010-\u001a\u00020 H\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u00062"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "recharge", "Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;", "getRecharge", "()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;", "recharge$delegate", "dayLimit", "Lcom/kubi/payment/common/helper/DayLimitHelper;", "getDayLimit", "()Lcom/kubi/payment/common/helper/DayLimitHelper;", "dayLimit$delegate", "isInputLimit", "", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashInputBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashInputBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "initView", "checkInput", "isCheck", "(Ljava/lang/Boolean;)V", "verifyDayLimit", "verifySuccess", "Lkotlin/Function0;", "trackCheckAdvcashLimit", "trackCheckAdvcashFee", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatRechargeAdvCashInputFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatRechargeAdvCashInputFragment.kt\ncom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,206:1\n147#2,16:207\n*S KotlinDebug\n*F\n+ 1 FiatRechargeAdvCashInputFragment.kt\ncom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment\n*L\n50#1:207,16\n*E\n"})
public final class FiatRechargeAdvCashInputFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: b0 */
    public static boolean f37315b0;

    /* JADX INFO: renamed from: X */
    public boolean f37319X;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f37314a0 = {Reflection.property1(new PropertyReference1Impl(FiatRechargeAdvCashInputFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashInputBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f37313Z = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37316U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeAdvCashInputFragment.m44141B3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37317V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeAdvCashInputFragment.m44149M3(this.f37335b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f37318W = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeAdvCashInputFragment.m44140A3();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f37320Y = C45681e.m100799e(this, new Function1<FiatRechargeAdvCashInputFragment, C37681s>() { // from class: com.kubi.otc.fiat.recharge.advcash.FiatRechargeAdvCashInputFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37681s invoke(@NotNull FiatRechargeAdvCashInputFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37681s.m84951a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37681s, Unit>() { // from class: com.kubi.otc.fiat.recharge.advcash.FiatRechargeAdvCashInputFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37681s it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37681s c37681s) {
            invoke(c37681s);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: FiatRechargeAdvCashInputFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$Companion;", "", "<init>", "()V", "isClear", "", "()Z", "setClear", "(Z)V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "recharge", "Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @Nullable FiatAdvcashRechargeMode recharge) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseFragmentActivity.m56574n0(context, "", FiatRechargeAdvCashInputFragment.class.getName(), new C27051h().m66721e("data", recharge).m66717a());
        }

        public final boolean isClear() {
            return FiatRechargeAdvCashInputFragment.f37315b0;
        }

        public final void setClear(boolean z11) {
            FiatRechargeAdvCashInputFragment.f37315b0 = z11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.recharge.advcash.FiatRechargeAdvCashInputFragment$a */
    /* JADX INFO: compiled from: FiatRechargeAdvCashInputFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashInputFragment$initView$3$1$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19690a extends C24223c1 {
        public C19690a() {
            super(FiatRechargeAdvCashInputFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            if (th2 instanceof ApiException) {
                FiatRechargeAdvCashInputFragment.this.m44170N3((ApiException) th2);
            }
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final DayLimitHelper m44140A3() {
        return new DayLimitHelper();
    }

    /* JADX INFO: renamed from: E3 */
    private final InterfaceC37240b m44142E3() {
        return (InterfaceC37240b) this.f37316U.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m44143G3(final FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment) {
        fiatRechargeAdvCashInputFragment.m44173y3(Boolean.TRUE);
        if (fiatRechargeAdvCashInputFragment.f37319X) {
            return Unit.INSTANCE;
        }
        fiatRechargeAdvCashInputFragment.m44172P3(new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeAdvCashInputFragment.m44144H3(this.f37336b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m44147K3(FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment, View view) {
        FiatHistoryListFragment.Companion companion = FiatHistoryListFragment.f37282Z;
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F3 = fiatRechargeAdvCashInputFragment.m44169F3();
        FiatHistoryListFragment.Companion.startFragment$default(companion, C27041f.m66668h(fiatAdvcashRechargeModeM44169F3 != null ? fiatAdvcashRechargeModeM44169F3.getFiatCurrency() : null), null, 2, null);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m44148L3(FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m44166z3(fiatRechargeAdvCashInputFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m44150Q3(FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment, String it) {
        FiatEditTextView fiatEditTextView;
        Intrinsics.checkNotNullParameter(it, "it");
        C37681s c37681sM44167C3 = fiatRechargeAdvCashInputFragment.m44167C3();
        if (c37681sM44167C3 != null && (fiatEditTextView = c37681sM44167C3.f84611g) != null) {
            fiatEditTextView.setInputText(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m44166z3(FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = Boolean.FALSE;
        }
        fiatRechargeAdvCashInputFragment.m44173y3(bool);
    }

    /* JADX INFO: renamed from: C3 */
    public final C37681s m44167C3() {
        return (C37681s) this.f37320Y.getValue(this, f37314a0[0]);
    }

    /* JADX INFO: renamed from: D3 */
    public final DayLimitHelper m44168D3() {
        return (DayLimitHelper) this.f37318W.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    public final FiatAdvcashRechargeMode m44169F3() {
        return (FiatAdvcashRechargeMode) this.f37317V.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m44170N3(ApiException apiException) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F3 = m44169F3();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(fiatAdvcashRechargeModeM44169F3 != null ? fiatAdvcashRechargeModeM44169F3.getChannelId() : null);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F4 = m44169F3();
        rechargeTrackData.setFiatCurrency(fiatAdvcashRechargeModeM44169F4 != null ? fiatAdvcashRechargeModeM44169F4.getFiatCurrency() : null);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49794e(track, "CHECK_ADVCASH_FEE", false, str, rechargeTrackData, 2, null);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m44171O3() {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F3 = m44169F3();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(fiatAdvcashRechargeModeM44169F3 != null ? fiatAdvcashRechargeModeM44169F3.getChannelId() : null);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F4 = m44169F3();
        rechargeTrackData.setFiatCurrency(fiatAdvcashRechargeModeM44169F4 != null ? fiatAdvcashRechargeModeM44169F4.getFiatCurrency() : null);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49794e(track, "CHECK_ADVCASH_LIMIT", false, "-10003:CHECK_ADVCASH_LIMIT", rechargeTrackData, 2, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_recharge_advcash_input;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final InterfaceC37240b m44141B3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m44144H3(final FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment) {
        String fiatCurrency;
        String inputText;
        FiatEditTextView fiatEditTextView;
        fiatRechargeAdvCashInputFragment.showDialogLoading();
        InterfaceC37240b interfaceC37240bM44142E3 = fiatRechargeAdvCashInputFragment.m44142E3();
        FiatFee.Companion companion = FiatFee.INSTANCE;
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F3 = fiatRechargeAdvCashInputFragment.m44169F3();
        String channelId = null;
        if (fiatAdvcashRechargeModeM44169F3 != null) {
            fiatCurrency = fiatAdvcashRechargeModeM44169F3.getFiatCurrency();
        } else {
            fiatCurrency = null;
        }
        String strM66668h = C27041f.m66668h(fiatCurrency);
        C37681s c37681sM44167C3 = fiatRechargeAdvCashInputFragment.m44167C3();
        if (c37681sM44167C3 != null && (fiatEditTextView = c37681sM44167C3.f84611g) != null) {
            inputText = fiatEditTextView.getInputText();
        } else {
            inputText = null;
        }
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F4 = fiatRechargeAdvCashInputFragment.m44169F3();
        if (fiatAdvcashRechargeModeM44169F4 != null) {
            channelId = fiatAdvcashRechargeModeM44169F4.getChannelId();
        }
        Observable<R> observableCompose = interfaceC37240bM44142E3.m83298k(FiatFee.Companion.getParams$default(companion, strM66668h, inputText, C27041f.m66668h(channelId), FastQuoteModel.PAY_RECHARGE, null, 16, null)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.recharge.advcash.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeAdvCashInputFragment.m44145I3(this.f37339b, (FiatFee) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.advcash.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeAdvCashInputFragment.m44146J3(function1, obj);
            }
        }, fiatRechargeAdvCashInputFragment.new C19690a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = fiatRechargeAdvCashInputFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m44145I3(FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment, FiatFee fiatFee) {
        FiatEditTextView fiatEditTextView;
        fiatRechargeAdvCashInputFragment.hideDialogLoading();
        FiatRechargeAdvCashConfirmFragment.Companion companion = FiatRechargeAdvCashConfirmFragment.f37306Y;
        Context mContext = fiatRechargeAdvCashInputFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F3 = fiatRechargeAdvCashInputFragment.m44169F3();
        String inputText = null;
        if (fiatAdvcashRechargeModeM44169F3 != null) {
            fiatAdvcashRechargeModeM44169F3.setFee(fiatFee);
            C37681s c37681sM44167C3 = fiatRechargeAdvCashInputFragment.m44167C3();
            if (c37681sM44167C3 != null && (fiatEditTextView = c37681sM44167C3.f84611g) != null) {
                inputText = fiatEditTextView.getInputText();
            }
            fiatAdvcashRechargeModeM44169F3.setAmount(inputText);
            Unit unit = Unit.INSTANCE;
        } else {
            fiatAdvcashRechargeModeM44169F3 = null;
        }
        companion.startFragment(mContext, fiatAdvcashRechargeModeM44169F3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m44146J3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static final FiatAdvcashRechargeMode m44149M3(FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment) {
        Bundle arguments = fiatRechargeAdvCashInputFragment.getArguments();
        if (arguments != null) {
            return (FiatAdvcashRechargeMode) RouteExKt.m56274t(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m44151R3(FiatRechargeAdvCashInputFragment fiatRechargeAdvCashInputFragment) {
        fiatRechargeAdvCashInputFragment.hideDialogLoading();
        return Unit.INSTANCE;
    }

    private final void initView() {
        ImageView imageView;
        BaseTextView baseTextView;
        String strM66668h;
        String paymentName;
        FiatEditTextView fiatEditTextView;
        String fiatCurrency;
        BaseTextView baseTextView2;
        FiatEditTextView fiatEditTextView2;
        String fiatCurrency2;
        NavigationBar navigationBar = getNavigationBar();
        String paymentIcon = null;
        if (navigationBar != null) {
            int i11 = R$string.legal_account_deposit_currency;
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F3 = m44169F3();
            if (fiatAdvcashRechargeModeM44169F3 != null) {
                fiatCurrency2 = fiatAdvcashRechargeModeM44169F3.getFiatCurrency();
            } else {
                fiatCurrency2 = null;
            }
            navigationBar.setMainTitle(getString(i11, C27041f.m66668h(fiatCurrency2)));
            navigationBar.m54696g(R$drawable.ic_history_24, new View.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.advcash.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FiatRechargeAdvCashInputFragment.m44147K3(this.f37331b, view);
                }
            });
        }
        C37681s c37681sM44167C3 = m44167C3();
        if (c37681sM44167C3 != null && (fiatEditTextView2 = c37681sM44167C3.f84611g) != null) {
            fiatEditTextView2.m45520o(this, new Function1() { // from class: com.kubi.otc.fiat.recharge.advcash.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FiatRechargeAdvCashInputFragment.m44148L3(this.f37333b, (BigDecimal) obj);
                }
            });
        }
        C37681s c37681sM44167C4 = m44167C3();
        if (c37681sM44167C4 != null && (baseTextView2 = c37681sM44167C4.f84607c) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeAdvCashInputFragment.m44143G3(this.f37334b);
                }
            }, 1, null);
        }
        C37681s c37681sM44167C5 = m44167C3();
        if (c37681sM44167C5 != null && (fiatEditTextView = c37681sM44167C5.f84611g) != null) {
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F4 = m44169F3();
            if (fiatAdvcashRechargeModeM44169F4 != null) {
                fiatCurrency = fiatAdvcashRechargeModeM44169F4.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            fiatEditTextView.setCurrency(C27041f.m66668h(fiatCurrency));
        }
        C37681s c37681sM44167C6 = m44167C3();
        if (c37681sM44167C6 != null && (baseTextView = c37681sM44167C6.f84610f) != null) {
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F5 = m44169F3();
            if (fiatAdvcashRechargeModeM44169F5 != null && (paymentName = fiatAdvcashRechargeModeM44169F5.getPaymentName()) != null) {
                strM66668h = C27041f.m66668h(paymentName);
            } else {
                strM66668h = null;
            }
            baseTextView.setText(strM66668h);
        }
        C37681s c37681sM44167C7 = m44167C3();
        if (c37681sM44167C7 != null && (imageView = c37681sM44167C7.f84606b) != null) {
            C46341d c46341dM102151a = C46338a.m102151a(this.mContext);
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F6 = m44169F3();
            if (fiatAdvcashRechargeModeM44169F6 != null) {
                paymentIcon = fiatAdvcashRechargeModeM44169F6.getPaymentIcon();
            }
            C46340c<Drawable> c46340cMo6634v = c46341dM102151a.mo6634v(C27041f.m66668h(paymentIcon));
            int i12 = R$mipmap.kucoin_icon_default_icon;
            c46340cMo6634v.mo92188b0(i12).mo92208m(i12).m6594E0(imageView);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m44172P3(Function0<Unit> function0) {
        String inputText;
        FiatEditTextView fiatEditTextView;
        showDialogLoading();
        DayLimitHelper dayLimitHelperM44168D3 = m44168D3();
        C37681s c37681sM44167C3 = m44167C3();
        String fiatCurrency = null;
        if (c37681sM44167C3 != null && (fiatEditTextView = c37681sM44167C3.f84611g) != null) {
            inputText = fiatEditTextView.getInputText();
        } else {
            inputText = null;
        }
        String strM66668h = C27041f.m66668h(inputText);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F3 = m44169F3();
        if (fiatAdvcashRechargeModeM44169F3 != null) {
            fiatCurrency = fiatAdvcashRechargeModeM44169F3.getFiatCurrency();
        }
        String strM66668h2 = C27041f.m66668h(fiatCurrency);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dayLimitHelperM44168D3.m46255n(strM66668h, strM66668h2, FastQuoteModel.PAY_RECHARGE, lifecycleScope, childFragmentManager, function0, new Function1() { // from class: com.kubi.otc.fiat.recharge.advcash.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeAdvCashInputFragment.m44150Q3(this.f37337b, (String) obj);
            }
        }, new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeAdvCashInputFragment.m44151R3(this.f37338b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C37681s c37681sM44167C3;
        FiatEditTextView fiatEditTextView;
        super.onResume();
        if (f37315b0 && (c37681sM44167C3 = m44167C3()) != null && (fiatEditTextView = c37681sM44167C3.f84611g) != null) {
            fiatEditTextView.setInputText("");
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m44173y3(Boolean bool) {
        String inputText;
        Boolean boolValueOf;
        FiatEditTextView fiatEditTextView;
        BaseTextView baseTextView;
        String minFiatAmount;
        String maxFiatAmount;
        BaseTextView baseTextView2;
        FiatEditTextView fiatEditTextView2;
        BaseTextView baseTextView3;
        FiatEditTextView fiatEditTextView3;
        C37681s c37681sM44167C3 = m44167C3();
        String fiatCurrency = null;
        if (c37681sM44167C3 != null && (fiatEditTextView3 = c37681sM44167C3.f84611g) != null) {
            inputText = fiatEditTextView3.getInputText();
        } else {
            inputText = null;
        }
        BigDecimal bigDecimalM86490A = C38346y.m86490A(inputText);
        if (C27025c.m66566d(bool) || BigDecimal.ZERO.compareTo(bigDecimalM86490A) != 0) {
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F3 = m44169F3();
            if (fiatAdvcashRechargeModeM44169F3 != null) {
                boolValueOf = Boolean.valueOf(fiatAdvcashRechargeModeM44169F3.isLimitFiat(bigDecimalM86490A));
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                C37681s c37681sM44167C4 = m44167C3();
                if (c37681sM44167C4 != null && (baseTextView2 = c37681sM44167C4.f84608d) != null) {
                    C27046k.m66685H(baseTextView2);
                }
                C37681s c37681sM44167C5 = m44167C3();
                if (c37681sM44167C5 != null && (baseTextView = c37681sM44167C5.f84608d) != null) {
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = R$string.pay_fast_sell_limit_tip;
                    FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F4 = m44169F3();
                    if (fiatAdvcashRechargeModeM44169F4 != null) {
                        minFiatAmount = fiatAdvcashRechargeModeM44169F4.getMinFiatAmount();
                    } else {
                        minFiatAmount = null;
                    }
                    String plainString = C6447a.m11724a(C38346y.m86490A(minFiatAmount)).toPlainString();
                    FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F5 = m44169F3();
                    if (fiatAdvcashRechargeModeM44169F5 != null) {
                        maxFiatAmount = fiatAdvcashRechargeModeM44169F5.getMaxFiatAmount();
                    } else {
                        maxFiatAmount = null;
                    }
                    sb2.append(getString(i11, plainString, C6447a.m11724a(C38346y.m86490A(maxFiatAmount)).toPlainString()));
                    sb2.append(' ');
                    FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44169F6 = m44169F3();
                    if (fiatAdvcashRechargeModeM44169F6 != null) {
                        fiatCurrency = fiatAdvcashRechargeModeM44169F6.getFiatCurrency();
                    }
                    sb2.append(C27041f.m66668h(fiatCurrency));
                    baseTextView.setText(sb2.toString());
                }
                C37681s c37681sM44167C6 = m44167C3();
                if (c37681sM44167C6 != null && (fiatEditTextView = c37681sM44167C6.f84611g) != null) {
                    fiatEditTextView.m45517A();
                }
                this.f37319X = true;
                m44171O3();
                return;
            }
        }
        C37681s c37681sM44167C7 = m44167C3();
        if (c37681sM44167C7 != null && (baseTextView3 = c37681sM44167C7.f84608d) != null) {
            C27046k.m66700o(baseTextView3);
        }
        C37681s c37681sM44167C8 = m44167C3();
        if (c37681sM44167C8 != null && (fiatEditTextView2 = c37681sM44167C8.f84611g) != null) {
            fiatEditTextView2.m45521z();
        }
        this.f37319X = false;
    }
}
