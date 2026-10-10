package com.kubi.otc.fiat.recharge.capitual;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5290q;
import com.blankj.utilcode.util.C5302w;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatCapitualChannel;
import com.kubi.otc.entity.FiatEmail;
import com.kubi.otc.entity.FiatSepaPayInfo;
import com.kubi.otc.entity.FiatSepaPayItem;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.common.data.entities.DayLimit;
import com.kubi.payment.common.helper.DayLimitHelper;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.RechargeTrackData;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27060l0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.C37242d;
import et.InterfaceC37240b;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37766r;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37686t;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
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
import xb0.C46126b;

/* JADX INFO: compiled from: FiatRechargeCapitualDetailFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010+\u001a\u00020$H\u0014J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020-H\u0002J\b\u00103\u001a\u00020-H\u0002J\b\u00104\u001a\u00020-H\u0002J\b\u00105\u001a\u00020-H\u0002J\b\u00106\u001a\u00020-H\u0002J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020\fH\u0002J\b\u0010 \u001a\u00020-H\u0002J\u0012\u0010<\u001a\u00020=2\b\u0010\u001e\u001a\u0004\u0018\u00010>H\u0002J\b\u0010?\u001a\u00020=H\u0002J\u001e\u0010@\u001a\u00020-*\u00020=2\u0006\u0010;\u001a\u00020\f2\b\b\u0002\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020-H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006H"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "fiatCurrency", "", "getFiatCurrency", "()Ljava/lang/String;", "fiatCurrency$delegate", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "getPaymentMethod", "()Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "paymentMethod$delegate", "paymentDetails", "", "Lcom/kubi/otc/entity/FiatSepaPayItem;", "getPaymentDetails", "()Ljava/util/List;", "paymentDetails$delegate", "bankDetails", "getBankDetails", "bankDetails$delegate", "dayLimit", "Lcom/kubi/payment/common/helper/DayLimitHelper;", "getDayLimit", "()Lcom/kubi/payment/common/helper/DayLimitHelper;", "dayLimit$delegate", "selectTab", "", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeCapitualDetailBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeCapitualDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initTab", "getRechargeCapitualDetail", "initPixData", "initTedData", "saveBitmap", "bitmap", "Landroid/graphics/Bitmap;", "showDialogQrCode", "value", "getDailyLimitContent", "Landroid/text/SpannableString;", "Lcom/kubi/payment/common/data/entities/DayLimit;", "getDepositLimitContent", "setStringSpan", "isLast", "", "trackCheckCapitualInfo", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "trackCheckRechargeSuccess", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatRechargeCapitualDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatRechargeCapitualDetailFragment.kt\ncom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,435:1\n147#2,16:436\n1056#3:452\n1869#3,2:453\n1056#3:455\n1869#3,2:456\n1869#3,2:458\n*S KotlinDebug\n*F\n+ 1 FiatRechargeCapitualDetailFragment.kt\ncom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment\n*L\n97#1:436,16\n220#1:452\n220#1:453,2\n270#1:455\n270#1:456,2\n194#1:458,2\n*E\n"})
public final class FiatRechargeCapitualDetailFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37343U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeCapitualDetailFragment.m44211W3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37344V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeCapitualDetailFragment.m44212X3(this.f37364b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f37345W = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeCapitualDetailFragment.m44185F4(this.f37366b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f37346X = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeCapitualDetailFragment.m44183E4();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f37347Y = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeCapitualDetailFragment.m44209U3();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f37348Z = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeCapitualDetailFragment.m44210V3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    public int f37349a0 = 1;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC24293a f37350b0 = C45681e.m100799e(this, new Function1<FiatRechargeCapitualDetailFragment, C37686t>() { // from class: com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37686t invoke(@NotNull FiatRechargeCapitualDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37686t.m84963a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37686t, Unit>() { // from class: com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37686t it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37686t c37686t) {
            invoke(c37686t);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f37342d0 = {Reflection.property1(new PropertyReference1Impl(FiatRechargeCapitualDetailFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeCapitualDetailBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f37341c0 = new Companion(null);

    /* JADX INFO: compiled from: FiatRechargeCapitualDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment$Companion;", "", "<init>", "()V", "TAB_PIX", "", "TAB_TED", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "fiatCurrency", "", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @Nullable String fiatCurrency, @Nullable PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseActivity.INSTANCE.launch(context, FiatRechargeCapitualDetailFragment.class, new C27051h().m66724h("title", context.getString(R$string.legal_account_deposit_currency, C27041f.m66668h(fiatCurrency))).m66724h("fiatCurrency", fiatCurrency).m66721e("paymentMethod", paymentMethod).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualDetailFragment$a */
    /* JADX INFO: compiled from: FiatRechargeCapitualDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment$getRechargeCapitualDetail$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "onNetError", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19716a extends C24223c1 {
        public C19716a() {
            super(FiatRechargeCapitualDetailFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            if (th2 instanceof ApiException) {
                FiatRechargeCapitualDetailFragment.this.m44250Q4((ApiException) th2);
            }
        }

        @Override // com.kubi.sdk.util.C24223c1
        /* JADX INFO: renamed from: c */
        public void mo32077c() {
            super.mo32077c();
            FiatRechargeCapitualDetailFragment.this.showNetWorkError();
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualDetailFragment$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FiatRechargeCapitualDetailFragment.kt\ncom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment\n*L\n1#1,328:1\n220#2:329\n*E\n"})
    public static final class C19717b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((FiatSepaPayItem) t11).getSort(), ((FiatSepaPayItem) t12).getSort());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualDetailFragment$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FiatRechargeCapitualDetailFragment.kt\ncom/kubi/otc/fiat/recharge/capitual/FiatRechargeCapitualDetailFragment\n*L\n1#1,328:1\n270#2:329\n*E\n"})
    public static final class C19718c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((FiatSepaPayItem) t11).getSort(), ((FiatSepaPayItem) t12).getSort());
        }
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m44217j4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, Disposable disposable) {
        BaseFragment.showLoadingView$default(fiatRechargeCapitualDetailFragment, 0, 0, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m44175A4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, DialogInterface dialogInterface, int i11) {
        OtcDepend otcDepend = OtcDepend.f38138a;
        Context mContext = fiatRechargeCapitualDetailFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        otcDepend.m45454b(mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public static final Unit m44177B4() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m44179C4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment) {
        if (fiatRechargeCapitualDetailFragment.f37349a0 == 1) {
            return Unit.INSTANCE;
        }
        fiatRechargeCapitualDetailFragment.f37349a0 = 1;
        fiatRechargeCapitualDetailFragment.m44259r4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m44181D4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment) {
        if (fiatRechargeCapitualDetailFragment.f37349a0 == 2) {
            return Unit.INSTANCE;
        }
        fiatRechargeCapitualDetailFragment.f37349a0 = 2;
        fiatRechargeCapitualDetailFragment.m44259r4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final List m44183E4() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m44188H4(Bitmap bitmap, final FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, Boolean bool) {
        final String str = C5302w.m6508c() + "/capitual" + System.currentTimeMillis() + ".jpg";
        if (C5290q.m6359j(bitmap, str, Bitmap.CompressFormat.JPEG)) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeCapitualDetailFragment.m44190I4(str, fiatRechargeCapitualDetailFragment);
                }
            });
            ToastCompat.m66441G(fiatRechargeCapitualDetailFragment.getString(R$string.pay_fiat_capitual_qrcode_dowload_tip), str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public final String m44193K2() {
        return (String) this.f37344V.getValue();
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m44198M4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, SpannableString spannableString, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        fiatRechargeCapitualDetailFragment.m44248L4(spannableString, str, z11);
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m44201O4(String str, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        viewHolder.setImageBitmap(R$id.iv_qr_code_big, C27060l0.m66759b(str, C27029c.m66604g(viewHolder, 300)));
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeCapitualDetailFragment.m44203P4(helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    private final void m44206R4() {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        PaymentMethod paymentMethodM44216h4 = m44216h4();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(paymentMethodM44216h4 != null ? paymentMethodM44216h4.getChannelId() : null);
        rechargeTrackData.setFiatCurrency(m44193K2());
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49794e(track, "CHECK_RECHAGE_SUCCESS", true, null, rechargeTrackData, 4, null);
    }

    /* JADX INFO: renamed from: U3 */
    public static final List m44209U3() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: V3 */
    public static final DayLimitHelper m44210V3() {
        return new DayLimitHelper();
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m44213b4(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83349b(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public final DayLimitHelper m44214c4() {
        return (DayLimitHelper) this.f37348Z.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    private final InterfaceC37240b m44215f4() {
        return (InterfaceC37240b) this.f37343U.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    private final PaymentMethod m44216h4() {
        return (PaymentMethod) this.f37345W.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m44236u4(final FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment) {
        OtcDepend otcDepend = OtcDepend.f38138a;
        if (otcDepend.m45461j().isEmailValidate()) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.pay_fiat_capitual_email_title).m54156M4(fiatRechargeCapitualDetailFragment.getString(R$string.pay_fiat_capitual_email_content, otcDepend.m45461j().email)).m54162S4(R$string.pay_fiat_capitual_email_send, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.capitual.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    FiatRechargeCapitualDetailFragment.m44238v4(this.f37370b, dialogInterface, i11);
                }
            }).m54159P4(R$string.cancel, null).m54172c5(fiatRechargeCapitualDetailFragment.getChildFragmentManager());
        } else {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.pay_fiat_capitual_email_title).m54156M4(fiatRechargeCapitualDetailFragment.getString(R$string.pay_fiat_capitual_email_un_bind)).m54162S4(R$string.pay_fiat_capitual_email_bind, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.capitual.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    FiatRechargeCapitualDetailFragment.m44175A4(this.f37372b, dialogInterface, i11);
                }
            }).m54159P4(R$string.cancel, null).m54172c5(fiatRechargeCapitualDetailFragment.getChildFragmentManager());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public final void m44247G4(final Bitmap bitmap) {
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.recharge.capitual.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeCapitualDetailFragment.m44188H4(bitmap, this, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.capitual.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeCapitualDetailFragment.m44195K4(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: L4 */
    public final void m44248L4(SpannableString spannableString, String str, boolean z11) {
        SpannableString spannableString2;
        String str2;
        int iIndexOf$default;
        if (z11) {
            spannableString2 = spannableString;
            str2 = str;
            iIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) spannableString2, str2, 0, false, 6, (Object) null);
        } else {
            spannableString2 = spannableString;
            str2 = str;
            iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableString2, str2, 0, false, 6, (Object) null);
        }
        spannableString2.setSpan(new ForegroundColorSpan(getColorRes(R$color.c_text)), iIndexOf$default, str2.length() + iIndexOf$default, 18);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m44249N4(final String str) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.botc_dialog_capitual_qrcode, 3, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.otc.fiat.recharge.capitual.n
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FiatRechargeCapitualDetailFragment.m44201O4(str, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "payment_channel_recharge_capitual_qr_code");
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m44250Q4(ApiException apiException) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        PaymentMethod paymentMethodM44216h4 = m44216h4();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(paymentMethodM44216h4 != null ? paymentMethodM44216h4.getChannelId() : null);
        rechargeTrackData.setFiatCurrency(m44193K2());
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49794e(track, "CHECK_CAPITUAL_INFO", false, str, rechargeTrackData, 2, null);
    }

    /* JADX INFO: renamed from: Y3 */
    public final List<FiatSepaPayItem> m44251Y3() {
        return (List) this.f37347Y.getValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public final C37686t m44252Z3() {
        return (C37686t) this.f37350b0.getValue(this, f37342d0[0]);
    }

    /* JADX INFO: renamed from: a4 */
    public final SpannableString m44253a4(DayLimit dayLimit) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(' ');
        sb2.append(C27041f.m66669i(dayLimit != null ? dayLimit.getCurrency() : null, m44193K2()));
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C27041f.m66669i(dayLimit != null ? dayLimit.getDayLimitUsd() : null, "--"));
        sb3.append(" USD");
        String string2 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C27041f.m66669i(dayLimit != null ? dayLimit.getDayLimitCurrency() : null, "--"));
        sb4.append(string);
        String string3 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C27041f.m66669i(dayLimit != null ? dayLimit.getLeftAmountUsd() : null, "--"));
        sb5.append(" USD");
        String string4 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(C27041f.m66669i(dayLimit != null ? dayLimit.getLeftAmountCurrency() : null, "--"));
        sb6.append(string);
        String string5 = sb6.toString();
        String string6 = getString(R$string.payment_deposit_daily_limit_view_more);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        SpannableString spannableString = new SpannableString(getString(R$string.payment_deposit_daily_limit_tip, string2, string3, string4, string5, string6));
        m44198M4(this, spannableString, string2, false, 2, null);
        m44198M4(this, spannableString, string3, false, 2, null);
        m44248L4(spannableString, string4, true);
        m44248L4(spannableString, string5, true);
        spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.capitual.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FiatRechargeCapitualDetailFragment.m44213b4(view);
            }
        }), StringsKt.indexOf$default((CharSequence) spannableString, string6, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, string6, 0, false, 6, (Object) null) + string6.length(), 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: g4 */
    public final List<FiatSepaPayItem> m44256g4() {
        return (List) this.f37346X.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_recharge_capitual_detail;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m44258n4() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        C37686t c37686tM44252Z3 = m44252Z3();
        if (c37686tM44252Z3 != null && (linearLayout3 = c37686tM44252Z3.f84650v) != null) {
            linearLayout3.removeAllViews();
        }
        for (final FiatSepaPayItem fiatSepaPayItem : CollectionsKt.sortedWith(m44256g4(), new C19717b())) {
            if (Intrinsics.areEqual(fiatSepaPayItem.getProcessType(), "2")) {
                C37686t c37686tM44252Z4 = m44252Z3();
                if (c37686tM44252Z4 != null && (linearLayout = c37686tM44252Z4.f84650v) != null) {
                    View viewInflate = View.inflate(this.mContext, R$layout.botc_item_fiat_recharge_qrcode_view, null);
                    BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
                    baseViewHolder.setText(R$id.tv_title, C27041f.m66668h(fiatSepaPayItem.getTitle()));
                    String value = fiatSepaPayItem.getValue();
                    boolean z11 = value == null || value.length() == 0;
                    boolean z12 = !z11;
                    int i11 = R$id.iv_qr_code;
                    baseViewHolder.setGone(i11, z12);
                    int i12 = R$id.iv_dowload;
                    baseViewHolder.setGone(i12, z12);
                    if (!z11) {
                        final Bitmap bitmapM66759b = C27060l0.m66759b(C27041f.m66668h(fiatSepaPayItem.getValue()), C27029c.m66604g(baseViewHolder, 140));
                        baseViewHolder.setImageBitmap(i11, bitmapM66759b);
                        View view = baseViewHolder.getView(i12);
                        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.i
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FiatRechargeCapitualDetailFragment.m44226o4(this.f37374b, bitmapM66759b);
                            }
                        }, 1, null);
                        View view2 = baseViewHolder.getView(i11);
                        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.j
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FiatRechargeCapitualDetailFragment.m44228p4(this.f37377b, fiatSepaPayItem);
                            }
                        }, 1, null);
                    }
                    linearLayout.addView(viewInflate);
                }
            } else {
                C37686t c37686tM44252Z5 = m44252Z3();
                if (c37686tM44252Z5 != null && (linearLayout2 = c37686tM44252Z5.f84650v) != null) {
                    View viewInflate2 = View.inflate(this.mContext, R$layout.botc_item_fiat_sepa_info_view, null);
                    BaseViewHolder baseViewHolder2 = new BaseViewHolder(viewInflate2);
                    baseViewHolder2.setText(R$id.tv_title, C27041f.m66668h(fiatSepaPayItem.getTitle()));
                    baseViewHolder2.setText(R$id.tv_content, C27041f.m66668h(fiatSepaPayItem.getValue()));
                    View view3 = baseViewHolder2.getView(R$id.iv_copy);
                    Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
                    C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.k
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FiatRechargeCapitualDetailFragment.m44230q4(fiatSepaPayItem, this);
                        }
                    }, 1, null);
                    linearLayout2.addView(viewInflate2);
                }
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m44257i4();
        m44254d4();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m44259r4() {
        BaseTextView baseTextView;
        View view;
        View view2;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        View view3;
        View view4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (this.f37349a0 == 1) {
            C37686t c37686tM44252Z3 = m44252Z3();
            if (c37686tM44252Z3 != null && (baseTextView6 = c37686tM44252Z3.f84641m) != null) {
                baseTextView6.setSelected(true);
            }
            C37686t c37686tM44252Z4 = m44252Z3();
            if (c37686tM44252Z4 != null && (baseTextView5 = c37686tM44252Z4.f84642n) != null) {
                baseTextView5.setSelected(false);
            }
            C37686t c37686tM44252Z5 = m44252Z3();
            if (c37686tM44252Z5 != null && (view4 = c37686tM44252Z5.f84647s) != null) {
                C27046k.m66685H(view4);
            }
            C37686t c37686tM44252Z6 = m44252Z3();
            if (c37686tM44252Z6 != null && (view3 = c37686tM44252Z6.f84648t) != null) {
                C27046k.m66700o(view3);
            }
            m44258n4();
            C37686t c37686tM44252Z7 = m44252Z3();
            if (c37686tM44252Z7 == null || (baseTextView4 = c37686tM44252Z7.f84636h) == null) {
                return;
            }
            baseTextView4.setText(R$string.pay_fiat_deposit_pix_detail_tip);
            return;
        }
        C37686t c37686tM44252Z8 = m44252Z3();
        if (c37686tM44252Z8 != null && (baseTextView3 = c37686tM44252Z8.f84641m) != null) {
            baseTextView3.setSelected(false);
        }
        C37686t c37686tM44252Z9 = m44252Z3();
        if (c37686tM44252Z9 != null && (baseTextView2 = c37686tM44252Z9.f84642n) != null) {
            baseTextView2.setSelected(true);
        }
        C37686t c37686tM44252Z10 = m44252Z3();
        if (c37686tM44252Z10 != null && (view2 = c37686tM44252Z10.f84647s) != null) {
            C27046k.m66700o(view2);
        }
        C37686t c37686tM44252Z11 = m44252Z3();
        if (c37686tM44252Z11 != null && (view = c37686tM44252Z11.f84648t) != null) {
            C27046k.m66685H(view);
        }
        m44260s4();
        C37686t c37686tM44252Z12 = m44252Z3();
        if (c37686tM44252Z12 == null || (baseTextView = c37686tM44252Z12.f84636h) == null) {
            return;
        }
        baseTextView.setText(R$string.pay_fiat_deposit_ted_detail_tip);
    }

    /* JADX INFO: renamed from: F4 */
    public static final PaymentMethod m44185F4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment) {
        Bundle arguments = fiatRechargeCapitualDetailFragment.getArguments();
        if (arguments != null) {
            return (PaymentMethod) RouteExKt.m56274t(arguments, "paymentMethod");
        }
        return null;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m44190I4(String str, FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment) {
        if (TextUtils.isEmpty(str)) {
            return Unit.INSTANCE;
        }
        MediaScannerConnection.scanFile(fiatRechargeCapitualDetailFragment.getContext(), new String[]{str}, new String[]{"image/jpeg"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.kubi.otc.fiat.recharge.capitual.x
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str2, Uri uri) {
                FiatRechargeCapitualDetailFragment.m44192J4(str2, uri);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m44195K4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m44203P4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public static final InterfaceC37240b m44211W3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: X3 */
    public static final String m44212X3(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment) {
        String strM56284y;
        Bundle arguments = fiatRechargeCapitualDetailFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "fiatCurrency");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    private final void initView() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        FrameLayout frameLayout;
        BaseTextView baseTextView4;
        CharSequence charSequenceM44255e4;
        C37686t c37686tM44252Z3 = m44252Z3();
        if (c37686tM44252Z3 != null && (baseTextView4 = c37686tM44252Z3.f84634f) != null) {
            try {
                charSequenceM44255e4 = m44255e4();
            } catch (Exception unused) {
                charSequenceM44255e4 = "--";
            }
            baseTextView4.setText(charSequenceM44255e4);
        }
        C37686t c37686tM44252Z4 = m44252Z3();
        if (c37686tM44252Z4 != null && (frameLayout = c37686tM44252Z4.f84651w) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeCapitualDetailFragment.m44236u4(this.f37365b);
                }
            }, 1, null);
        }
        C37686t c37686tM44252Z5 = m44252Z3();
        if (c37686tM44252Z5 != null && (baseTextView3 = c37686tM44252Z5.f84631c) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeCapitualDetailFragment.m44177B4();
                }
            }, 1, null);
        }
        C37686t c37686tM44252Z6 = m44252Z3();
        if (c37686tM44252Z6 != null && (baseTextView2 = c37686tM44252Z6.f84641m) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeCapitualDetailFragment.m44179C4(this.f37367b);
                }
            }, 1, null);
        }
        C37686t c37686tM44252Z7 = m44252Z3();
        if (c37686tM44252Z7 != null && (baseTextView = c37686tM44252Z7.f84642n) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeCapitualDetailFragment.m44181D4(this.f37368b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m44219k4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m44221l4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, FiatSepaPayInfo fiatSepaPayInfo) {
        ConstraintLayout constraintLayout;
        fiatRechargeCapitualDetailFragment.showContent();
        List<FiatSepaPayItem> items = fiatSepaPayInfo.getItems();
        if (items != null && !items.isEmpty()) {
            List<FiatSepaPayItem> items2 = fiatSepaPayInfo.getItems();
            if (items2 != null) {
                for (FiatSepaPayItem fiatSepaPayItem : items2) {
                    String businessType = fiatSepaPayItem.getBusinessType();
                    if (Intrinsics.areEqual(businessType, "1")) {
                        fiatRechargeCapitualDetailFragment.m44256g4().add(fiatSepaPayItem);
                    } else if (Intrinsics.areEqual(businessType, "2")) {
                        fiatRechargeCapitualDetailFragment.m44251Y3().add(fiatSepaPayItem);
                    }
                }
            }
            fiatRechargeCapitualDetailFragment.m44259r4();
            fiatRechargeCapitualDetailFragment.m44206R4();
            return Unit.INSTANCE;
        }
        C37686t c37686tM44252Z3 = fiatRechargeCapitualDetailFragment.m44252Z3();
        if (c37686tM44252Z3 != null && (constraintLayout = c37686tM44252Z3.f84649u) != null) {
            C27046k.m66685H(constraintLayout);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m44223m4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m44226o4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, Bitmap bitmap) {
        Intrinsics.checkNotNull(bitmap);
        fiatRechargeCapitualDetailFragment.m44247G4(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m44228p4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, FiatSepaPayItem fiatSepaPayItem) {
        fiatRechargeCapitualDetailFragment.m44249N4(C27041f.m66668h(fiatSepaPayItem.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m44230q4(FiatSepaPayItem fiatSepaPayItem, FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment) {
        String value;
        String strM66668h = null;
        if (fiatSepaPayItem.isDelCopySpace()) {
            String value2 = fiatSepaPayItem.getValue();
            if (value2 != null) {
                value = StringsKt.replace$default(value2, C33627eb.f69716f, "", false, 4, (Object) null);
            } else {
                value = null;
            }
        } else {
            value = fiatSepaPayItem.getValue();
        }
        C27057k.m66746b(C27041f.m66668h(value));
        StringBuilder sb2 = new StringBuilder();
        String title = fiatSepaPayItem.getTitle();
        if (title != null) {
            strM66668h = C27041f.m66668h(title);
        }
        sb2.append(strM66668h);
        sb2.append(' ');
        sb2.append(fiatRechargeCapitualDetailFragment.getString(R$string.copy_success));
        ToastCompat.m66441G(sb2.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m44234t4(FiatSepaPayItem fiatSepaPayItem, FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment) {
        String value;
        String strM66668h = null;
        if (fiatSepaPayItem.isDelCopySpace()) {
            String value2 = fiatSepaPayItem.getValue();
            if (value2 != null) {
                value = StringsKt.replace$default(value2, C33627eb.f69716f, "", false, 4, (Object) null);
            } else {
                value = null;
            }
        } else {
            value = fiatSepaPayItem.getValue();
        }
        C27057k.m66746b(C27041f.m66668h(value));
        StringBuilder sb2 = new StringBuilder();
        String title = fiatSepaPayItem.getTitle();
        if (title != null) {
            strM66668h = C27041f.m66668h(title);
        }
        sb2.append(strM66668h);
        sb2.append(' ');
        sb2.append(fiatRechargeCapitualDetailFragment.getString(R$string.copy_success));
        ToastCompat.m66441G(sb2.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m44238v4(final FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, DialogInterface dialogInterface, int i11) {
        Observable<R> observableCompose = fiatRechargeCapitualDetailFragment.m44215f4().m83296i(new FiatEmail(FiatEmail.CAPITUAL_TRANSFER_TYPE, fiatRechargeCapitualDetailFragment.m44193K2())).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.recharge.capitual.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeCapitualDetailFragment.m44242x4(this.f37394b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.capitual.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeCapitualDetailFragment.m44244y4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.recharge.capitual.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeCapitualDetailFragment.m44246z4(this.f37397b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.capitual.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeCapitualDetailFragment.m44240w4(function2, obj);
            }
        }, new C24223c1(fiatRechargeCapitualDetailFragment));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = fiatRechargeCapitualDetailFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m44240w4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m44242x4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, Disposable disposable) {
        fiatRechargeCapitualDetailFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m44244y4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m44246z4(FiatRechargeCapitualDetailFragment fiatRechargeCapitualDetailFragment, Boolean bool) {
        fiatRechargeCapitualDetailFragment.hideDialogLoading();
        if (bool.booleanValue()) {
            ToastCompat.m66441G(fiatRechargeCapitualDetailFragment.getString(R$string.pay_fiat_capitual_email_send_success), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public final void m44254d4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FiatRechargeCapitualDetailFragment$getDayLimit$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: e4 */
    public final SpannableString m44255e4() {
        String minAmount;
        PaymentMethod paymentMethodM44216h4 = m44216h4();
        String maxAmount = null;
        if (paymentMethodM44216h4 != null) {
            minAmount = paymentMethodM44216h4.getMinAmount();
        } else {
            minAmount = null;
        }
        String strM66668h = C27041f.m66668h(C42180b.m92640e(C38346y.m86490A(minAmount), null, 0, false, false, false, 0, null, 127, null));
        PaymentMethod paymentMethodM44216h5 = m44216h4();
        if (paymentMethodM44216h5 != null) {
            maxAmount = paymentMethodM44216h5.getMaxAmount();
        }
        String strM66668h2 = C27041f.m66668h(C42180b.m92640e(C38346y.m86490A(maxAmount), null, 0, false, false, false, 0, null, 127, null));
        String strM44193K2 = m44193K2();
        SpannableString spannableString = new SpannableString(getString(R$string.pay_fiat_capitual_remind_info_three, strM66668h, strM66668h2, strM44193K2));
        m44198M4(this, spannableString, strM66668h, false, 2, null);
        m44198M4(this, spannableString, strM66668h2, false, 2, null);
        m44198M4(this, spannableString, strM44193K2, false, 2, null);
        return spannableString;
    }

    /* JADX INFO: renamed from: i4 */
    public final void m44257i4() {
        String channelId;
        InterfaceC37240b interfaceC37240bM44215f4 = m44215f4();
        PaymentMethod paymentMethodM44216h4 = m44216h4();
        if (paymentMethodM44216h4 != null) {
            channelId = paymentMethodM44216h4.getChannelId();
        } else {
            channelId = null;
        }
        Observable<R> observableCompose = interfaceC37240bM44215f4.m83295h(new FiatCapitualChannel(C27041f.m66668h(channelId), m44193K2())).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.recharge.capitual.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeCapitualDetailFragment.m44217j4(this.f37363b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.capitual.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeCapitualDetailFragment.m44219k4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.recharge.capitual.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeCapitualDetailFragment.m44221l4(this.f37402b, (FiatSepaPayInfo) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.capitual.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeCapitualDetailFragment.m44223m4(function2, obj);
            }
        }, new C19716a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m44260s4() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C37686t c37686tM44252Z3 = m44252Z3();
        if (c37686tM44252Z3 != null && (linearLayout2 = c37686tM44252Z3.f84650v) != null) {
            linearLayout2.removeAllViews();
        }
        for (final FiatSepaPayItem fiatSepaPayItem : CollectionsKt.sortedWith(m44251Y3(), new C19718c())) {
            C37686t c37686tM44252Z4 = m44252Z3();
            if (c37686tM44252Z4 != null && (linearLayout = c37686tM44252Z4.f84650v) != null) {
                View viewInflate = View.inflate(this.mContext, R$layout.botc_item_fiat_sepa_info_view, null);
                BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
                baseViewHolder.setText(R$id.tv_title, C27041f.m66668h(fiatSepaPayItem.getTitle()));
                baseViewHolder.setText(R$id.tv_content, C27041f.m66668h(fiatSepaPayItem.getValue()));
                View view = baseViewHolder.getView(R$id.iv_copy);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.m
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FiatRechargeCapitualDetailFragment.m44234t4(fiatSepaPayItem, this);
                    }
                }, 1, null);
                linearLayout.addView(viewInflate);
            }
        }
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m44192J4(String str, Uri uri) {
    }
}
