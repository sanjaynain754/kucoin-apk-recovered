package com.kubi.payment.third.quote;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.service.OtcDepend;
import com.kubi.otc.view.SelectLabelDialogView;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.payment.third.base.BaseThirdFragment;
import com.kubi.payment.third.common.kyc.PlatformVerifyFragment;
import com.kubi.payment.third.data.entities.FiatCurrencySelect;
import com.kubi.payment.third.data.entities.PayChannelSelect;
import com.kubi.payment.third.data.entities.PayMethodSelect;
import com.kubi.payment.third.data.entities.ThirdCurrencySelect;
import com.kubi.payment.third.data.entities.ThirdKycInfo;
import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.payment.third.data.entities.ThirdQuoteInfo;
import com.kubi.payment.third.kyc.KycAddInfoFragment;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.ThirdBuyTrackData;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37758j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mt.SelectLabel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p270ft.C37607d0;
import p413ku.C41984b;
import p419l2.C42032f;
import p569qq.C43841b;
import p569qq.C43852m;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ThirdQuoteFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0018\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u001dH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0014J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u00020\u001dH\u0002J\u0012\u00107\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u000109H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u000e\u00105\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdQuoteFragment;", "Lcom/kubi/payment/third/base/BaseThirdFragment;", "Lcom/kubi/payment/third/quote/ThirdQuoteViewModel;", "<init>", "()V", "isFirstTextChange", "", "loadingPayView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "kotlin.jvm.PlatformType", "getLoadingPayView", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "loadingPayView$delegate", "Lkotlin/Lazy;", "loadingChannelView", "getLoadingChannelView", "loadingChannelView$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentThirdQuoteBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentThirdQuoteBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "com/kubi/payment/third/quote/ThirdQuoteFragment$adapter$2$1", "getAdapter", "()Lcom/kubi/payment/third/quote/ThirdQuoteFragment$adapter$2$1;", "adapter$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "viewModelClass", "Lkotlin/reflect/KClass;", "getLayout", "", "initViews", "onSelected", "it", "Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "initData", "observeData", "showTRYUserDialog", "message", "", "updateCoin", "updateFiat", "updatePayType", "checkEnable", "startKycInfo", "kycInfo", "Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "showDetailDialog", "number", "trackCheckInput", "refreshBanner", "banner", "Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThirdQuoteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdQuoteFragment.kt\ncom/kubi/payment/third/quote/ThirdQuoteFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,586:1\n147#2,16:587\n1563#3:603\n1634#3,3:604\n1563#3:607\n1634#3,3:608\n1878#3,3:611\n*S KotlinDebug\n*F\n+ 1 ThirdQuoteFragment.kt\ncom/kubi/payment/third/quote/ThirdQuoteFragment\n*L\n70#1:587,16\n174#1:603\n174#1:604,3\n202#1:607\n202#1:608,3\n334#1:611,3\n*E\n"})
public final class ThirdQuoteFragment extends BaseThirdFragment<ThirdQuoteViewModel> {

    /* JADX INFO: renamed from: V */
    public boolean f40270V = true;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f40271W = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.third.quote.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThirdQuoteFragment.m49716w4(this.f40317b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f40272X = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.third.quote.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThirdQuoteFragment.m49714v4(this.f40339b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f40273Y = C45681e.m100799e(this, new Function1<ThirdQuoteFragment, C37607d0>() { // from class: com.kubi.payment.third.quote.ThirdQuoteFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37607d0 invoke(@NotNull ThirdQuoteFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37607d0.m84796a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37607d0, Unit>() { // from class: com.kubi.payment.third.quote.ThirdQuoteFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37607d0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37607d0 c37607d0) {
            invoke(c37607d0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f40274Z;

    /* JADX INFO: renamed from: a0 */
    public int f40275a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f40269c0 = {Reflection.property1(new PropertyReference1Impl(ThirdQuoteFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentThirdQuoteBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f40268b0 = new Companion(null);

    /* JADX INFO: compiled from: ThirdQuoteFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/payment/third/quote/ThirdQuoteFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", "legal", "", "coin", "amount", "paymentMethodCode", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void startFragment$default(Companion companion, Context context, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                str4 = null;
            }
            companion.startFragment(context, str, str2, str3, str4);
        }

        public final void startFragment(@NotNull Context context, @NotNull String legal, @NotNull String coin, @NotNull String amount, @Nullable String paymentMethodCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(legal, "legal");
            Intrinsics.checkNotNullParameter(coin, "coin");
            Intrinsics.checkNotNullParameter(amount, "amount");
            BaseFragmentActivity.m56574n0(context, context.getString(R$string.visa_deposit), ThirdQuoteFragment.class.getName(), new C27051h().m66719c("data", true).m66724h("data_1", legal).m66724h("data_2", coin).m66724h("data_3", amount).m66724h("data_4", paymentMethodCode).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.third.quote.ThirdQuoteFragment$a */
    /* JADX INFO: compiled from: ThirdQuoteFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21402a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f40276b;

        public C21402a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f40276b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f40276b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40276b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m49672K4(ThirdQuoteFragment thirdQuoteFragment, final OnGoingOrder onGoingOrder) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_error).m54156M4(onGoingOrder.getMessage()).m54157N4(true).m54161R4(0).m54159P4(R$string.cancel, null).m54162S4(R$string.payment_cj_estimated_amount_understand, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.third.quote.a0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ThirdQuoteFragment.m49674L4(onGoingOrder, dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = thirdQuoteFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "payment_third_ongoing_order");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m49674L4(OnGoingOrder onGoingOrder, DialogInterface dialogInterface, int i11) {
        InterfaceC37758j.a.m85165n(C37304a.f82764a, 2L, onGoingOrder.getChannelId(), null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: d4 */
    public static final ThirdQuoteFragment$adapter$2$1 m49698d4(ThirdQuoteFragment thirdQuoteFragment) {
        return new ThirdQuoteFragment$adapter$2$1(thirdQuoteFragment, R$layout.botc_view_channel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public static final Unit m49703m4(final ThirdQuoteFragment thirdQuoteFragment) {
        ThirdPaySelectDialogFragment.Companion companion = ThirdPaySelectDialogFragment.f40262u0;
        String f40282a0 = ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40282a0();
        ThirdQuoteInfo f40284c0 = ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40284c0();
        ThirdPaySelectDialogFragment thirdPaySelectDialogFragmentNewInstance = companion.newInstance(f40282a0, C27024b.m66560c(f40284c0 != null ? f40284c0.getMethodList() : null), new Function1() { // from class: com.kubi.payment.third.quote.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49704n4(this.f40306b, (PayMethodSelect) obj);
            }
        });
        FragmentManager childFragmentManager = thirdQuoteFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        thirdPaySelectDialogFragmentNewInstance.show(childFragmentManager, "viewPayTypeBg");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public static final Unit m49704n4(ThirdQuoteFragment thirdQuoteFragment, PayMethodSelect it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49788o0(C27041f.m66668h(it.getId()));
        thirdQuoteFragment.m49730Z4();
        ThirdQuoteViewModel.m49747h0((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3(), false, 1, null);
        C43852m.m96590b("B7ThirdParty", "paymentMethod", "1", TuplesKt.m90091to("PaymentMethod", C27041f.m66668h(it.getName())));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public static final Unit m49705o4(ThirdQuoteFragment thirdQuoteFragment, CharSequence charSequence) {
        if (thirdQuoteFragment.f40270V) {
            thirdQuoteFragment.f40270V = false;
            return Unit.INSTANCE;
        }
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49785l0(charSequence.toString());
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49758I();
        if (!C27025c.m66566d(((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49775Z().getValue())) {
            ThirdQuoteViewModel.m49747h0((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3(), false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public static final Unit m49707q4(ThirdQuoteFragment thirdQuoteFragment) {
        OtcDepend.m45451d(OtcDepend.f38138a, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.payment.third.quote.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdQuoteFragment.m49708r4();
            }
        }), 1, null);
        ThirdQuoteViewModel thirdQuoteViewModel = (ThirdQuoteViewModel) thirdQuoteFragment.m45631m3();
        FragmentManager childFragmentManager = thirdQuoteFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        thirdQuoteViewModel.m49757H(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m49708r4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m49709s4(View view) {
        InterfaceC37758j.a.m85165n(C37304a.f82764a, 2L, null, C43852m.m96602n("B7FastTrade", "orderButton", null, 4, null), null, null, 26, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P4 */
    public final void m49725P4() {
        ThirdDetailDialogFragment thirdDetailDialogFragmentNewInstance = ThirdDetailDialogFragment.f40248x0.newInstance(((ThirdQuoteViewModel) m45631m3()).getF40280Y(), ((ThirdQuoteViewModel) m45631m3()).getF40281Z(), ((ThirdQuoteViewModel) m45631m3()).getF40282a0(), ((ThirdQuoteViewModel) m45631m3()).getF40285d0(), new Function0() { // from class: com.kubi.payment.third.quote.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdQuoteFragment.m49681Q4(this.f40313b);
            }
        }, new Function0() { // from class: com.kubi.payment.third.quote.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdQuoteFragment.m49683R4(this.f40316b);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        thirdDetailDialogFragmentNewInstance.show(childFragmentManager, "thirdDetailDialog");
    }

    /* JADX INFO: renamed from: S4 */
    public final void m49726S4(String str) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.batch_transfer_tip_title).m54156M4(str).m54162S4(R$string.payment_cj_estimated_amount_understand, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.third.quote.c0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ThirdQuoteFragment.m49686T4(dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "payment_third_coinTR_not_try_user");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public final void m49727U4(ThirdKycInfo thirdKycInfo) {
        PayChannelSelect f40285d0 = ((ThirdQuoteViewModel) m45631m3()).getF40285d0();
        Pair pair = new Pair("client", C27041f.m66668h(f40285d0 != null ? f40285d0.getChannel() : null));
        Pair pair2 = new Pair("crypto", ((ThirdQuoteViewModel) m45631m3()).getF40281Z());
        String currencyAmount = null;
        PayChannelSelect f40285d1 = ((ThirdQuoteViewModel) m45631m3()).getF40285d0();
        if (f40285d1 != null) {
            currencyAmount = f40285d1.getCurrencyAmount();
        }
        thirdKycInfo.setExtraParams(MapsKt.mapOf(pair, pair2, new Pair("cryptoAmount", C27041f.m66668h(currencyAmount)), new Pair("fiat", ((ThirdQuoteViewModel) m45631m3()).getF40281Z()), new Pair("fiatAmount", ((ThirdQuoteViewModel) m45631m3()).getF40283b0()), new Pair("payMethodId", ((ThirdQuoteViewModel) m45631m3()).getF40282a0())));
        Intent intentPutExtra = new Intent(this.mContext, (Class<?>) BaseFragmentActivity.class).putExtra("data", thirdKycInfo).putExtra("fragment", KycAddInfoFragment.class.getName());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        startActivityWithResult(intentPutExtra, new Consumer() { // from class: com.kubi.payment.third.quote.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ThirdQuoteFragment.m49689V4(this.f40318b, (Intent) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W4 */
    public final void m49728W4() {
        int i11 = this.f40275a0 + 1;
        this.f40275a0 = i11;
        if (i11 < 3) {
            return;
        }
        this.f40275a0 = 0;
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        PayChannelSelect f40285d0 = ((ThirdQuoteViewModel) m45631m3()).getF40285d0();
        ThirdBuyTrackData thirdBuyTrackData = new ThirdBuyTrackData(f40285d0 != null ? f40285d0.getChannel() : null, ((ThirdQuoteViewModel) m45631m3()).getF40282a0());
        ((ThirdQuoteViewModel) m45631m3()).getF40280Y();
        ((ThirdQuoteViewModel) m45631m3()).getF40283b0();
        ((ThirdQuoteViewModel) m45631m3()).getF40281Z();
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49797i(track, "CHECK_INPUT", false, "-10000:CHECK_INPUT", thirdBuyTrackData, 2, null);
    }

    /* JADX INFO: renamed from: f4 */
    public final ThirdQuoteFragment$adapter$2$1 m49731f4() {
        return (ThirdQuoteFragment$adapter$2$1) this.f40274Z.getValue();
    }

    /* JADX INFO: renamed from: g4 */
    public final C37607d0 m49732g4() {
        return (C37607d0) this.f40273Y.getValue(this, f40269c0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_third_quote;
    }

    /* JADX INFO: renamed from: h4 */
    public final WrapperLoadingView m49733h4() {
        return (WrapperLoadingView) this.f40272X.getValue();
    }

    /* JADX INFO: renamed from: i4 */
    public final WrapperLoadingView m49734i4() {
        return (WrapperLoadingView) this.f40271W.getValue();
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<ThirdQuoteViewModel> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(ThirdQuoteViewModel.class);
    }

    public ThirdQuoteFragment() {
        setPageId("B7ThirdParty");
        this.f40274Z = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.third.quote.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdQuoteFragment.m49698d4(this.f40309b);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public static final Unit m49652A4(ThirdQuoteFragment thirdQuoteFragment, Boolean bool) {
        List<PayChannelSelect> channelList;
        thirdQuoteFragment.m49692X4();
        thirdQuoteFragment.m49729Y4();
        thirdQuoteFragment.m49730Z4();
        ThirdQuoteInfo f40284c0 = ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40284c0();
        BannerInfo.Banner bannerInfo = null;
        if (f40284c0 != null) {
            channelList = f40284c0.getChannelList();
        } else {
            channelList = null;
        }
        List listM66560c = C27024b.m66560c(channelList);
        int i11 = 0;
        for (Object obj : listM66560c) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PayChannelSelect payChannelSelect = (PayChannelSelect) obj;
            if (i11 == 0) {
                payChannelSelect.setChecked(true);
                thirdQuoteFragment.m49723M4(payChannelSelect);
            } else {
                payChannelSelect.setChecked(false);
            }
            i11 = i12;
        }
        thirdQuoteFragment.m49731f4().replaceData(listM66560c);
        thirdQuoteFragment.m49699e4();
        ThirdQuoteInfo f40284c1 = ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40284c0();
        if (f40284c1 != null) {
            bannerInfo = f40284c1.getBannerInfo();
        }
        thirdQuoteFragment.m49724N4(bannerInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m49654B4(ThirdQuoteFragment thirdQuoteFragment, Boolean bool) {
        thirdQuoteFragment.m49699e4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m49656C4(ThirdQuoteFragment thirdQuoteFragment, Boolean bool) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        if (bool.booleanValue()) {
            C37607d0 c37607d0M49732g4 = thirdQuoteFragment.m49732g4();
            if (c37607d0M49732g4 != null && (baseTextView2 = c37607d0M49732g4.f83774n) != null) {
                C27046k.m66685H(baseTextView2);
            }
            thirdQuoteFragment.m49728W4();
        } else {
            C37607d0 c37607d0M49732g5 = thirdQuoteFragment.m49732g4();
            if (c37607d0M49732g5 != null && (baseTextView = c37607d0M49732g5.f83774n) != null) {
                C27046k.m66700o(baseTextView);
            }
        }
        thirdQuoteFragment.m49699e4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m49658D4(ThirdQuoteFragment thirdQuoteFragment, String str) {
        BaseTextView baseTextView;
        C37607d0 c37607d0M49732g4 = thirdQuoteFragment.m49732g4();
        if (c37607d0M49732g4 != null && (baseTextView = c37607d0M49732g4.f83774n) != null) {
            baseTextView.setText(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m49660E4(ThirdQuoteFragment thirdQuoteFragment, Integer num) {
        FilterEmojiEditText filterEmojiEditText;
        C37607d0 c37607d0M49732g4 = thirdQuoteFragment.m49732g4();
        if (c37607d0M49732g4 != null && (filterEmojiEditText = c37607d0M49732g4.f83763c) != null) {
            Intrinsics.checkNotNull(num);
            filterEmojiEditText.setFilters(new C27056j0[]{new C27056j0(num.intValue())});
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m49662F4(ThirdQuoteFragment thirdQuoteFragment, ThirdKycInfo thirdKycInfo) {
        Intrinsics.checkNotNull(thirdKycInfo);
        thirdQuoteFragment.m49727U4(thirdKycInfo);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[PHI: r8
      0x0065: PHI (r8v1 com.kubi.payment.third.data.entities.ThirdOrder) = 
      (r8v0 com.kubi.payment.third.data.entities.ThirdOrder)
      (r8v2 com.kubi.payment.third.data.entities.ThirdOrder)
      (r8v3 com.kubi.payment.third.data.entities.ThirdOrder)
     binds: [B:10:0x001d, B:20:0x0059, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: G4 */
    public static final Unit m49664G4(ThirdQuoteFragment thirdQuoteFragment, ThirdOrder thirdOrder) {
        ThirdOrder thirdOrder2;
        String channel = thirdOrder.getChannel();
        if (channel != null) {
            int iHashCode = channel.hashCode();
            if (iHashCode != -82245516) {
                if (iHashCode != 1225229819) {
                    if (iHashCode != 2093876486 || !channel.equals(PayChannelSelect.SIMPLEX)) {
                        thirdOrder2 = thirdOrder;
                        C41984b c41984b = C41984b.f92193a;
                        Intrinsics.checkNotNull(thirdOrder2);
                        C41984b.m92051i(c41984b, thirdOrder2, null, 2, null);
                    } else {
                        C41984b c41984b2 = C41984b.f92193a;
                        Context mContext = thirdQuoteFragment.mContext;
                        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                        Intrinsics.checkNotNull(thirdOrder);
                        C41984b.m92052k(c41984b2, mContext, thirdOrder, null, 4, null);
                    }
                } else {
                    thirdOrder2 = thirdOrder;
                    if (channel.equals(PayChannelSelect.MOBILUM)) {
                        C41984b c41984b3 = C41984b.f92193a;
                        Context mContext2 = thirdQuoteFragment.mContext;
                        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                        Intrinsics.checkNotNull(thirdOrder2);
                        c41984b3.m92056g(mContext2, thirdOrder2);
                    } else {
                        C41984b c41984b4 = C41984b.f92193a;
                        Intrinsics.checkNotNull(thirdOrder2);
                        C41984b.m92051i(c41984b4, thirdOrder2, null, 2, null);
                    }
                }
            } else {
                thirdOrder2 = thirdOrder;
                if (channel.equals(PayChannelSelect.LEGEND_TRADE)) {
                    C41984b c41984b5 = C41984b.f92193a;
                    Intrinsics.checkNotNull(thirdOrder2);
                    C41984b.m92050f(c41984b5, thirdOrder2, null, 2, null);
                } else {
                    C41984b c41984b6 = C41984b.f92193a;
                    Intrinsics.checkNotNull(thirdOrder2);
                    C41984b.m92051i(c41984b6, thirdOrder2, null, 2, null);
                }
            }
        } else {
            thirdOrder2 = thirdOrder;
            C41984b c41984b7 = C41984b.f92193a;
            Intrinsics.checkNotNull(thirdOrder2);
            C41984b.m92051i(c41984b7, thirdOrder2, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m49666H4(ThirdQuoteFragment thirdQuoteFragment, Boolean bool) {
        if (bool.booleanValue()) {
            PlatformVerifyFragment.Companion companion = PlatformVerifyFragment.f40213W;
            Context mContext = thirdQuoteFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            companion.launch(mContext);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m49668I4(ThirdQuoteFragment thirdQuoteFragment, String str) {
        Intrinsics.checkNotNull(str);
        thirdQuoteFragment.m49726S4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m49670J4(ThirdQuoteFragment thirdQuoteFragment, Boolean bool) {
        if (bool.booleanValue()) {
            thirdQuoteFragment.m49725P4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m49678O4(BannerInfo.Banner banner) {
        String strM66668h = C27041f.m66668h(banner.getLinkUrl());
        if (strM66668h.length() > 0) {
            Router.f46192a.m56184f(strM66668h).m4048k();
        }
        C43852m.m96590b("B7ThirdParty", "p2pBanner", "1", TuplesKt.m90091to("bannerContent", C27041f.m66668h(banner.getId())));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public static final Unit m49681Q4(ThirdQuoteFragment thirdQuoteFragment) {
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49780e0();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public static final Unit m49683R4(ThirdQuoteFragment thirdQuoteFragment) {
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49781f0();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V4 */
    public static final void m49689V4(ThirdQuoteFragment thirdQuoteFragment, Intent intent) {
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49781f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X4 */
    private final void m49692X4() {
        ThirdCurrencySelect thirdCurrencySelect;
        String shortName;
        ImageView imageView;
        BaseTextView baseTextView;
        String name;
        BaseTextView baseTextView2;
        String shortName2;
        List<ThirdCurrencySelect> cryptoList;
        Object next;
        ThirdQuoteInfo f40284c0 = ((ThirdQuoteViewModel) m45631m3()).getF40284c0();
        String iconUrl = null;
        if (f40284c0 != null && (cryptoList = f40284c0.getCryptoList()) != null) {
            Iterator<T> it = cryptoList.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((ThirdCurrencySelect) next).getShortName(), ((ThirdQuoteViewModel) m45631m3()).getF40281Z()));
            thirdCurrencySelect = (ThirdCurrencySelect) next;
        } else {
            thirdCurrencySelect = null;
        }
        C37890n c37890n = C37890n.f85269a;
        if (thirdCurrencySelect != null) {
            shortName = thirdCurrencySelect.getShortName();
        } else {
            shortName = null;
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(C27041f.m66668h(shortName));
        C37607d0 c37607d0M49732g4 = m49732g4();
        if (c37607d0M49732g4 != null && (baseTextView2 = c37607d0M49732g4.f83771k) != null) {
            if (thirdCurrencySelect != null) {
                shortName2 = thirdCurrencySelect.getShortName();
            } else {
                shortName2 = null;
            }
            baseTextView2.setText(C27041f.m66668h(shortName2));
        }
        C37607d0 c37607d0M49732g5 = m49732g4();
        if (c37607d0M49732g5 != null && (baseTextView = c37607d0M49732g5.f83772l) != null) {
            if (coinInfoEntityM85613u != null) {
                name = coinInfoEntityM85613u.getName();
            } else {
                name = null;
            }
            baseTextView.setText(C27041f.m66668h(name));
        }
        C37607d0 c37607d0M49732g6 = m49732g4();
        if (c37607d0M49732g6 != null && (imageView = c37607d0M49732g6.f83765e) != null) {
            C46341d c46341dM102153c = C46338a.m102153c(this);
            if (coinInfoEntityM85613u != null) {
                iconUrl = coinInfoEntityM85613u.getIconUrl();
            }
            c46341dM102153c.mo6634v(C27041f.m66668h(iconUrl)).mo92188b0(R$mipmap.kucoin_icon_default_icon).m6594E0(imageView);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    private final void m49699e4() {
        BaseTextView baseTextView;
        boolean z11;
        String currencyAmount;
        C37607d0 c37607d0M49732g4 = m49732g4();
        if (c37607d0M49732g4 != null && (baseTextView = c37607d0M49732g4.f83770j) != null) {
            if (((ThirdQuoteViewModel) m45631m3()).getF40283b0().length() > 0 && !C27025c.m66566d(((ThirdQuoteViewModel) m45631m3()).m49775Z().getValue()) && ((ThirdQuoteViewModel) m45631m3()).getF40280Y().length() > 0 && ((ThirdQuoteViewModel) m45631m3()).getF40281Z().length() > 0 && ((ThirdQuoteViewModel) m45631m3()).getF40282a0().length() > 0) {
                PayChannelSelect f40285d0 = ((ThirdQuoteViewModel) m45631m3()).getF40285d0();
                if (f40285d0 != null) {
                    currencyAmount = f40285d0.getCurrencyAmount();
                } else {
                    currencyAmount = null;
                }
                if (currencyAmount != null && currencyAmount.length() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            baseTextView.setEnabled(z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    private final void m49700j4() {
        String string;
        String string2;
        String string3;
        FilterEmojiEditText filterEmojiEditText;
        ThirdQuoteViewModel thirdQuoteViewModel = (ThirdQuoteViewModel) m45631m3();
        Bundle arguments = getArguments();
        String string4 = null;
        if (arguments != null) {
            string = arguments.getString("data_1");
        } else {
            string = null;
        }
        thirdQuoteViewModel.m49786m0(C27041f.m66668h(string));
        ThirdQuoteViewModel thirdQuoteViewModel2 = (ThirdQuoteViewModel) m45631m3();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("data_2");
        } else {
            string2 = null;
        }
        thirdQuoteViewModel2.m49784j0(C27041f.m66668h(string2));
        ThirdQuoteViewModel thirdQuoteViewModel3 = (ThirdQuoteViewModel) m45631m3();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("data_3");
        } else {
            string3 = null;
        }
        thirdQuoteViewModel3.m49785l0(C27041f.m66668h(string3));
        ThirdQuoteViewModel thirdQuoteViewModel4 = (ThirdQuoteViewModel) m45631m3();
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("data_4");
        }
        thirdQuoteViewModel4.m49788o0(C27041f.m66668h(string4));
        C37607d0 c37607d0M49732g4 = m49732g4();
        if (c37607d0M49732g4 != null && (filterEmojiEditText = c37607d0M49732g4.f83763c) != null) {
            filterEmojiEditText.setText(((ThirdQuoteViewModel) m45631m3()).getF40283b0());
            filterEmojiEditText.setSelection(filterEmojiEditText.length());
        }
        ((ThirdQuoteViewModel) m45631m3()).m49782g0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static final Unit m49701k4(final ThirdQuoteFragment thirdQuoteFragment) {
        List<FiatCurrencySelect> fiatList;
        ThirdQuoteInfo f40284c0 = ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40284c0();
        if (f40284c0 != null && (fiatList = f40284c0.getFiatList()) != null) {
            SelectLabelDialogView.Companion companion = SelectLabelDialogView.f38176v0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fiatList, 10));
            for (FiatCurrencySelect fiatCurrencySelect : fiatList) {
                arrayList.add(new SelectLabel(C27041f.m66668h(fiatCurrencySelect.getName()), C27041f.m66668h(fiatCurrencySelect.getFiatSymbol()), Boolean.valueOf(Intrinsics.areEqual(fiatCurrencySelect.getName(), ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40280Y())), Boolean.TRUE));
            }
            DialogFragmentHelper dialogFragmentHelperNewInstance$default = SelectLabelDialogView.Companion.newInstance$default(companion, arrayList, new BiConsumer() { // from class: com.kubi.payment.third.quote.x
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ThirdQuoteFragment.m49702l4(this.f40344b, (BaseViewHolder) obj, (SelectLabel) obj2);
                }
            }, null, 4, null);
            FragmentManager childFragmentManager = thirdQuoteFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperNewInstance$default.show(childFragmentManager, "selectFiatDialog");
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public static final void m49702l4(ThirdQuoteFragment thirdQuoteFragment, BaseViewHolder baseViewHolder, SelectLabel selectLabel) {
        if (Intrinsics.areEqual(((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40280Y(), selectLabel.getValue())) {
            return;
        }
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49786m0(C27041f.m66668h(selectLabel.getValue()));
        thirdQuoteFragment.m49729Y4();
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49783i0();
        ThirdQuoteViewModel.m49747h0((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3(), false, 1, null);
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m49706p4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public static final Unit m49710t4(final ThirdQuoteFragment thirdQuoteFragment) {
        List<ThirdCurrencySelect> cryptoList;
        String iconUrl;
        ThirdQuoteInfo f40284c0 = ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40284c0();
        if (f40284c0 != null && (cryptoList = f40284c0.getCryptoList()) != null) {
            SelectLabelDialogView.Companion companion = SelectLabelDialogView.f38176v0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cryptoList, 10));
            for (ThirdCurrencySelect thirdCurrencySelect : cryptoList) {
                String strM66668h = C27041f.m66668h(thirdCurrencySelect.getShortName());
                CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(thirdCurrencySelect.getShortName()));
                if (coinInfoEntityM85613u != null) {
                    iconUrl = coinInfoEntityM85613u.getIconUrl();
                } else {
                    iconUrl = null;
                }
                arrayList.add(new SelectLabel(strM66668h, C27041f.m66668h(iconUrl), Boolean.valueOf(Intrinsics.areEqual(thirdCurrencySelect.getShortName(), ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40281Z())), null, 8, null));
            }
            DialogFragmentHelper dialogFragmentHelperNewInstance = companion.newInstance(arrayList, new BiConsumer() { // from class: com.kubi.payment.third.quote.e0
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ThirdQuoteFragment.m49712u4(this.f40311b, (BaseViewHolder) obj, (SelectLabel) obj2);
                }
            }, "coin");
            FragmentManager childFragmentManager = thirdQuoteFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperNewInstance.show(childFragmentManager, "coinDialog");
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public static final void m49712u4(ThirdQuoteFragment thirdQuoteFragment, BaseViewHolder baseViewHolder, SelectLabel selectLabel) {
        if (Intrinsics.areEqual(((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40281Z(), selectLabel.getValue())) {
            return;
        }
        ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).m49784j0(C27041f.m66668h(selectLabel.getValue()));
        thirdQuoteFragment.m49692X4();
        ThirdQuoteViewModel.m49747h0((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3(), false, 1, null);
        C43852m.m96590b("B7ThirdParty", "crypto", "1", TuplesKt.m90091to("coin", C27041f.m66668h(selectLabel.getValue())));
    }

    /* JADX INFO: renamed from: v4 */
    public static final WrapperLoadingView m49714v4(ThirdQuoteFragment thirdQuoteFragment) {
        RecyclerView recyclerView;
        C37607d0 c37607d0M49732g4 = thirdQuoteFragment.m49732g4();
        if (c37607d0M49732g4 != null) {
            recyclerView = c37607d0M49732g4.f83779s;
        } else {
            recyclerView = null;
        }
        return WrapperLoadingView.injectView(recyclerView);
    }

    /* JADX INFO: renamed from: w4 */
    public static final WrapperLoadingView m49716w4(ThirdQuoteFragment thirdQuoteFragment) {
        ConstraintLayout constraintLayout;
        C37607d0 c37607d0M49732g4 = thirdQuoteFragment.m49732g4();
        if (c37607d0M49732g4 != null) {
            constraintLayout = c37607d0M49732g4.f83781u;
        } else {
            constraintLayout = null;
        }
        return WrapperLoadingView.injectView(constraintLayout);
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m49718x4(ThirdQuoteFragment thirdQuoteFragment, Boolean bool) {
        if (bool.booleanValue()) {
            BaseFragment.showLoadingView$default(thirdQuoteFragment, 0, 0, 3, null);
        } else {
            thirdQuoteFragment.showContentView();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m49720y4(ThirdQuoteFragment thirdQuoteFragment, Boolean bool) {
        if (bool.booleanValue()) {
            thirdQuoteFragment.m49733h4().showLoading();
        } else {
            thirdQuoteFragment.m49733h4().showContent();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public static final Unit m49722z4(ThirdQuoteFragment thirdQuoteFragment, Boolean bool) {
        if (bool.booleanValue()) {
            thirdQuoteFragment.m49734i4().showEmpty(thirdQuoteFragment.getString(R$string.otc_credit_un_support_symbol, ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40280Y() + '/' + ((ThirdQuoteViewModel) thirdQuoteFragment.m45631m3()).getF40281Z()), R$drawable.ic2_common_empty, (View.OnClickListener) null);
        } else {
            thirdQuoteFragment.m49734i4().showContent();
        }
        thirdQuoteFragment.m49699e4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M4 */
    public final void m49723M4(PayChannelSelect payChannelSelect) {
        ((ThirdQuoteViewModel) m45631m3()).m49787n0(payChannelSelect);
        ((ThirdQuoteViewModel) m45631m3()).m49783i0();
        m49699e4();
    }

    /* JADX INFO: renamed from: N4 */
    public final void m49724N4(final BannerInfo.Banner banner) {
        String strM66668h;
        C37607d0 c37607d0M49732g4 = m49732g4();
        if (c37607d0M49732g4 == null) {
            return;
        }
        if (banner == null) {
            FrameLayout layoutBanner = c37607d0M49732g4.f83766f;
            Intrinsics.checkNotNullExpressionValue(layoutBanner, "layoutBanner");
            C27046k.m66700o(layoutBanner);
            return;
        }
        BaseTextView baseTextView = c37607d0M49732g4.f83762b.f83806e;
        String title = banner.getTitle();
        String strM66668h2 = null;
        if (title != null) {
            strM66668h = C27041f.m66668h(title);
        } else {
            strM66668h = null;
        }
        baseTextView.setText(strM66668h);
        BaseTextView baseTextView2 = c37607d0M49732g4.f83762b.f83805d;
        String subtitle = banner.getSubtitle();
        if (subtitle != null) {
            strM66668h2 = C27041f.m66668h(subtitle);
        }
        baseTextView2.setText(strM66668h2);
        C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(this.mContext).mo6634v(C27041f.m66668h(banner.getIconUrl()));
        C42032f c42032f = new C42032f();
        int i11 = R$mipmap.ic_placeholder;
        c46340cMo6634v.mo6606a(c42032f.mo92188b0(i11).mo92208m(i11)).m6594E0(c37607d0M49732g4.f83762b.f83804c);
        FrameLayout layoutBanner2 = c37607d0M49732g4.f83766f;
        Intrinsics.checkNotNullExpressionValue(layoutBanner2, "layoutBanner");
        C27046k.m66711z(layoutBanner2, 0L, new Function0() { // from class: com.kubi.payment.third.quote.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThirdQuoteFragment.m49678O4(banner);
            }
        }, 1, null);
        FrameLayout layoutBanner3 = c37607d0M49732g4.f83766f;
        Intrinsics.checkNotNullExpressionValue(layoutBanner3, "layoutBanner");
        C27046k.m66685H(layoutBanner3);
        C43852m.m96595g(C27041f.m66668h(getF34283V()), "p2pBanner", null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y4 */
    public final void m49729Y4() {
        FiatCurrencySelect fiatCurrencySelect;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String fiatSymbol;
        List<FiatCurrencySelect> fiatList;
        Object next;
        ThirdQuoteInfo f40284c0 = ((ThirdQuoteViewModel) m45631m3()).getF40284c0();
        String name = null;
        if (f40284c0 != null && (fiatList = f40284c0.getFiatList()) != null) {
            Iterator<T> it = fiatList.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((FiatCurrencySelect) next).getName(), ((ThirdQuoteViewModel) m45631m3()).getF40280Y()));
            fiatCurrencySelect = (FiatCurrencySelect) next;
        } else {
            fiatCurrencySelect = null;
        }
        C37607d0 c37607d0M49732g4 = m49732g4();
        if (c37607d0M49732g4 != null && (baseTextView2 = c37607d0M49732g4.f83777q) != null) {
            if (fiatCurrencySelect != null) {
                fiatSymbol = fiatCurrencySelect.getFiatSymbol();
            } else {
                fiatSymbol = null;
            }
            baseTextView2.setText(C27041f.m66668h(fiatSymbol));
        }
        C37607d0 c37607d0M49732g5 = m49732g4();
        if (c37607d0M49732g5 != null && (baseTextView = c37607d0M49732g5.f83773m) != null) {
            if (fiatCurrencySelect != null) {
                name = fiatCurrencySelect.getName();
            }
            baseTextView.setText(C27041f.m66668h(name));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public final void m49730Z4() {
        PayMethodSelect payMethodSelect;
        ImageView imageView;
        BaseTextView baseTextView;
        String name;
        List<PayMethodSelect> methodList;
        Object next;
        ThirdQuoteInfo f40284c0 = ((ThirdQuoteViewModel) m45631m3()).getF40284c0();
        String icon = null;
        if (f40284c0 != null && (methodList = f40284c0.getMethodList()) != null) {
            Iterator<T> it = methodList.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((PayMethodSelect) next).getId(), ((ThirdQuoteViewModel) m45631m3()).getF40282a0()));
            payMethodSelect = (PayMethodSelect) next;
        } else {
            payMethodSelect = null;
        }
        C37607d0 c37607d0M49732g4 = m49732g4();
        if (c37607d0M49732g4 != null && (baseTextView = c37607d0M49732g4.f83776p) != null) {
            if (payMethodSelect != null) {
                name = payMethodSelect.getName();
            } else {
                name = null;
            }
            baseTextView.setText(C27041f.m66668h(name));
        }
        C37607d0 c37607d0M49732g5 = m49732g4();
        if (c37607d0M49732g5 != null && (imageView = c37607d0M49732g5.f83764d) != null) {
            C46341d c46341dM102153c = C46338a.m102153c(this);
            if (payMethodSelect != null) {
                icon = payMethodSelect.getIcon();
            }
            c46341dM102153c.mo6634v(C27041f.m66668h(icon)).m6594E0(imageView);
        }
    }

    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        BaseTextView baseTextView;
        FilterEmojiEditText filterEmojiEditText;
        RecyclerView recyclerView;
        View view;
        BaseTextView baseTextView2;
        View view2;
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setMainTitle(getString(R$string.visa_deposit));
            navigationBar.m54696g(R$drawable.ic2_history_20, new View.OnClickListener() { // from class: com.kubi.payment.third.quote.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ThirdQuoteFragment.m49709s4(view3);
                }
            });
            ImageView rightOne = navigationBar.getRightOne();
            if (rightOne != null) {
                C27046k.m66701p(rightOne, ContextCompat.getColor(navigationBar.getContext(), R$color.c_text));
            }
        }
        C37607d0 c37607d0M49732g4 = m49732g4();
        if (c37607d0M49732g4 != null && (view2 = c37607d0M49732g4.f83780t) != null) {
            C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.payment.third.quote.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThirdQuoteFragment.m49710t4(this.f40334b);
                }
            }, 1, null);
        }
        C37607d0 c37607d0M49732g5 = m49732g4();
        if (c37607d0M49732g5 != null && (baseTextView2 = c37607d0M49732g5.f83773m) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.payment.third.quote.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThirdQuoteFragment.m49701k4(this.f40338b);
                }
            }, 1, null);
        }
        C37607d0 c37607d0M49732g6 = m49732g4();
        if (c37607d0M49732g6 != null && (view = c37607d0M49732g6.f83782v) != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.payment.third.quote.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThirdQuoteFragment.m49703m4(this.f40340b);
                }
            }, 1, null);
        }
        C37607d0 c37607d0M49732g7 = m49732g4();
        if (c37607d0M49732g7 != null && (recyclerView = c37607d0M49732g7.f83779s) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
            recyclerView.setAdapter(m49731f4());
        }
        C37607d0 c37607d0M49732g8 = m49732g4();
        if (c37607d0M49732g8 != null && (filterEmojiEditText = c37607d0M49732g8.f83763c) != null) {
            Observable<CharSequence> observableObserveOn = C0206f.m784d(filterEmojiEditText).debounce(500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.payment.third.quote.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ThirdQuoteFragment.m49705o4(this.f40341b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.payment.third.quote.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ThirdQuoteFragment.m49706p4(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            CompositeDisposable compositeDisposable = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        }
        C37607d0 c37607d0M49732g9 = m49732g4();
        if (c37607d0M49732g9 != null && (baseTextView = c37607d0M49732g9.f83770j) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.third.quote.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThirdQuoteFragment.m49707q4(this.f40343b);
                }
            }, 1, null);
        }
        m49700j4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((ThirdQuoteViewModel) m45631m3()).m49778c0().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49718x4(this.f40320b, (Boolean) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49777b0().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49720y4(this.f40330b, (Boolean) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49779d0().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49722z4(this.f40332b, (Boolean) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49776a0().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49652A4(this.f40319b, (Boolean) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49774Y().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49654B4(this.f40321b, (Boolean) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49775Z().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49656C4(this.f40323b, (Boolean) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49764O().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49658D4(this.f40325b, (String) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49762M().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49660E4(this.f40327b, (Integer) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49763N().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49662F4(this.f40329b, (ThirdKycInfo) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49765P().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49664G4(this.f40331b, (ThirdOrder) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49768S().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49666H4(this.f40322b, (Boolean) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49770U().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49668I4(this.f40324b, (String) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49773X().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49670J4(this.f40326b, (Boolean) obj);
            }
        }));
        ((ThirdQuoteViewModel) m45631m3()).m49769T().observe(getViewLifecycleOwner(), new C21402a(new Function1() { // from class: com.kubi.payment.third.quote.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThirdQuoteFragment.m49672K4(this.f40328b, (OnGoingOrder) obj);
            }
        }));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C43841b.m96557d("B7third_buy", "page_load_start", null, 4, null);
    }

    /* JADX INFO: renamed from: T4 */
    public static final void m49686T4(DialogInterface dialogInterface, int i11) {
    }
}
