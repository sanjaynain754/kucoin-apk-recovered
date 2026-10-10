package com.kubi.spot.kline;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5286o;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$array;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.kline.lite.LiteFlutterKlineFragment;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37878b0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import t20.C44636e;
import t20.C44660q;
import w00.C45681e;
import w20.C45700a;

/* JADX INFO: compiled from: KuCoinKlineLiteFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000108H\u0017J\u0012\u0010>\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\b\u0010A\u001a\u00020<H\u0002J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010C\u001a\u00020\u0014H\u0002J\u0010\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020\u0018H\u0002J\b\u0010F\u001a\u00020\u000bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0013\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR?\u0010\u001c\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u000b0\u000b \u001e*\u0012\u0012\u000e\b\u0001\u0012\n \u001e*\u0004\u0018\u00010\u000b0\u000b0\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\u001f\u0010 R?\u0010\"\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u000b0\u000b \u001e*\u0012\u0012\u000e\b\u0001\u0012\n \u001e*\u0004\u0018\u00010\u000b0\u000b0\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b#\u0010 R!\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b(\u0010)R!\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b,\u0010)R\u001c\u0010.\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00180\u00180/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00180\u00180/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000¨\u0006H"}, m90084d2 = {"Lcom/kubi/spot/kline/KuCoinKlineLiteFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentKlineMainLiteBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentKlineMainLiteBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "coinName", "getCoinName", "coinName$delegate", "isKuCoin", "", "()Z", "isKuCoin$delegate", "precision", "", "getPrecision", "()I", "precision$delegate", "lineStrArray", "", "kotlin.jvm.PlatformType", "getLineStrArray", "()[Ljava/lang/String;", "lineStrArray$delegate", "candleStrArray", "getCandleStrArray", "candleStrArray$delegate", "lineTypeViews", "", "Landroid/widget/RadioButton;", "getLineTypeViews", "()Ljava/util/List;", "lineTypeViews$delegate", "candleTypeViews", "getCandleTypeViews", "candleTypeViews$delegate", "filterTime", "Lio/reactivex/subjects/BehaviorSubject;", "filterType", "klineChatFragment", "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updatePrice", "priceItem", "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$PriceItem;", "initTypeList", "initTypeViews", "isLine", "setKlinePosition", "checkedId", "getLiteTimeStr", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinKlineLiteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinKlineLiteFragment.kt\ncom/kubi/spot/kline/KuCoinKlineLiteFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,251:1\n147#2,16:252\n17#3:268\n19#3:272\n46#4:269\n51#4:271\n105#5:270\n1869#6,2:273\n13537#7,3:275\n*S KotlinDebug\n*F\n+ 1 KuCoinKlineLiteFragment.kt\ncom/kubi/spot/kline/KuCoinKlineLiteFragment\n*L\n44#1:252,16\n94#1:268\n94#1:272\n94#1:269\n94#1:271\n94#1:270\n145#1:273,2\n195#1:275,3\n*E\n"})
public final class KuCoinKlineLiteFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50638U = C45681e.m100799e(this, new Function1<KuCoinKlineLiteFragment, C44636e>() { // from class: com.kubi.spot.kline.KuCoinKlineLiteFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44636e invoke(@NotNull KuCoinKlineLiteFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44636e.m98749a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44636e, Unit>() { // from class: com.kubi.spot.kline.KuCoinKlineLiteFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44636e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44636e c44636e) {
            invoke(c44636e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f50639V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.w0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinKlineLiteFragment.m61990e4(this.f50767b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f50640W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinKlineLiteFragment.m61976F3(this.f50770b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f50641X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(KuCoinKlineLiteFragment.m61978R3(this.f50706b));
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f50642Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(KuCoinKlineLiteFragment.m61989c4(this.f50708b));
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f50643Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinKlineLiteFragment.m61979S3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f50644a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinKlineLiteFragment.m61974D3();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f50645b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinKlineLiteFragment.m61980T3(this.f50749b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f50646c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuCoinKlineLiteFragment.m61975E3(this.f50751b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final BehaviorSubject<Integer> f50647d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final BehaviorSubject<Integer> f50648e0;

    /* JADX INFO: renamed from: f0 */
    public LiteFlutterKlineFragment f50649f0;

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f50637h0 = {Reflection.property1(new PropertyReference1Impl(KuCoinKlineLiteFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentKlineMainLiteBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f50636g0 = new Companion(null);

    /* JADX INFO: compiled from: KuCoinKlineLiteFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/spot/kline/KuCoinKlineLiteFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/kline/KuCoinKlineLiteFragment;", "symbol", "", "coinName", "isKuCoin", "", "precision", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Lcom/kubi/spot/kline/KuCoinKlineLiteFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuCoinKlineLiteFragment newInstance(@Nullable String symbol, @Nullable String coinName, boolean isKuCoin, @Nullable Integer precision) {
            KuCoinKlineLiteFragment kuCoinKlineLiteFragment = new KuCoinKlineLiteFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putString("coinName", coinName);
            bundle.putBoolean("isKuCoin", isKuCoin);
            bundle.putInt("precision", C27039d.m66651k(precision, 2));
            kuCoinKlineLiteFragment.setArguments(bundle);
            return kuCoinKlineLiteFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineLiteFragment$a */
    /* JADX INFO: compiled from: KuCoinKlineLiteFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/spot/kline/KuCoinKlineLiteFragment$initTypeList$2$1", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25358a implements RadioGroupPlus.InterfaceC22946c {
        public C25358a() {
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            C44660q c44660q;
            UpDownTextView upDownTextView;
            C44636e c44636eM62008G3 = KuCoinKlineLiteFragment.this.m62008G3();
            if (c44636eM62008G3 != null && (c44660q = c44636eM62008G3.f99041b) != null && (upDownTextView = c44660q.f99285b) != null) {
                upDownTextView.m54919g(null, C22890g.m54279d(C27017c.f54310a.m66513b(), 0.0d, 0, 2, null));
            }
            KuCoinKlineLiteFragment.this.f50647d0.onNext(Integer.valueOf(i11));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineLiteFragment$b */
    /* JADX INFO: compiled from: KuCoinKlineLiteFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/spot/kline/KuCoinKlineLiteFragment$onViewCreated$8", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25359b implements RadioGroupPlus.InterfaceC22946c {
        public C25359b() {
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            KuCoinKlineLiteFragment.this.f50648e0.onNext(Integer.valueOf(i11));
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineLiteFragment$onViewCreated$2 */
    /* JADX INFO: compiled from: KuCoinKlineLiteFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$PriceItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.kline.KuCoinKlineLiteFragment$onViewCreated$2", m90122f = "KuCoinKlineLiteFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C253612 extends SuspendLambda implements Function2<LiteFlutterKlineFragment.C25427a, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(LiteFlutterKlineFragment.C25427a c25427a, Continuation<? super Unit> continuation) {
            return ((C253612) create(c25427a, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C253612(Continuation<? super C253612> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253612 c253612 = KuCoinKlineLiteFragment.this.new C253612(continuation);
            c253612.L$0 = obj;
            return c253612;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiteFlutterKlineFragment.C25427a c25427a = (LiteFlutterKlineFragment.C25427a) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            KuCoinKlineLiteFragment.this.m62019f4(c25427a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineLiteFragment$onViewCreated$3 */
    /* JADX INFO: compiled from: KuCoinKlineLiteFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$PriceItem;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.kline.KuCoinKlineLiteFragment$onViewCreated$3", m90122f = "KuCoinKlineLiteFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nKuCoinKlineLiteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinKlineLiteFragment.kt\ncom/kubi/spot/kline/KuCoinKlineLiteFragment$onViewCreated$3\n+ 2 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,251:1\n43#2,7:252\n*S KotlinDebug\n*F\n+ 1 KuCoinKlineLiteFragment.kt\ncom/kubi/spot/kline/KuCoinKlineLiteFragment$onViewCreated$3\n*L\n98#1:252,7\n*E\n"})
    public static final class C253623 extends SuspendLambda implements Function3<InterfaceC41635f<? super LiteFlutterKlineFragment.C25427a>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C253623(Continuation<? super C253623> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super LiteFlutterKlineFragment.C25427a> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C253623 c253623 = new C253623(continuation);
            c253623.L$0 = th2;
            return c253623.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C45700a.m100877c(th2, "lite-kline");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static final List m61975E3(KuCoinKlineLiteFragment kuCoinKlineLiteFragment) {
        return kuCoinKlineLiteFragment.m62016P3(false);
    }

    /* JADX INFO: renamed from: T3 */
    public static final List m61980T3(KuCoinKlineLiteFragment kuCoinKlineLiteFragment) {
        return kuCoinKlineLiteFragment.m62016P3(true);
    }

    /* JADX INFO: renamed from: D3 */
    public static final String[] m61974D3() {
        return C27017c.f54310a.m66513b().getResources().getStringArray(R$array.kucoin_kline_lite_candle_titles);
    }

    /* JADX INFO: renamed from: N3 */
    private final String m61977N3() {
        return (String) this.f50639V.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public static final String[] m61979S3() {
        return C27017c.f54310a.m66513b().getResources().getStringArray(R$array.kucoin_kline_lite_line_titles);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m61985Y3(KuCoinKlineLiteFragment kuCoinKlineLiteFragment, Integer num) {
        C37878b0.f85252a.m85542w(num != null && num.intValue() == R$id.rb_line);
        kuCoinKlineLiteFragment.m62015O3();
        return Unit.INSTANCE;
    }

    private final int getPrecision() {
        return ((Number) this.f50642Y.getValue()).intValue();
    }

    /* JADX INFO: renamed from: G3 */
    public final C44636e m62008G3() {
        return (C44636e) this.f50638U.getValue(this, f50637h0[0]);
    }

    /* JADX INFO: renamed from: H3 */
    public final String[] m62009H3() {
        return (String[]) this.f50644a0.getValue();
    }

    /* JADX INFO: renamed from: I3 */
    public final List<RadioButton> m62010I3() {
        return (List) this.f50646c0.getValue();
    }

    /* JADX INFO: renamed from: J3 */
    public final String m62011J3() {
        return (String) this.f50640W.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public final String[] m62012K3() {
        return (String[]) this.f50643Z.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public final List<RadioButton> m62013L3() {
        return (List) this.f50645b0.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    public final String m62014M3() {
        C37878b0 c37878b0 = C37878b0.f85252a;
        if (c37878b0.m85528i()) {
            int length = m62012K3().length;
            int iM85524e = c37878b0.m85524e();
            if (iM85524e >= 0 && iM85524e < length) {
                String str = m62012K3()[c37878b0.m85524e()];
                Intrinsics.checkNotNull(str);
                return str;
            }
        }
        if (c37878b0.m85528i()) {
            return "--";
        }
        int length2 = m62009H3().length;
        int iM85522c = c37878b0.m85522c();
        if (iM85522c < 0 || iM85522c >= length2) {
            return "--";
        }
        String str2 = m62009H3()[c37878b0.m85522c()];
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    /* JADX INFO: renamed from: P3 */
    public final List<RadioButton> m62016P3(boolean z11) {
        ArrayList arrayList = new ArrayList();
        TypedArray typedArrayObtainTypedArray = z11 ? getResources().obtainTypedArray(R$array.kucoin_kline_lite_line_ids) : getResources().obtainTypedArray(R$array.kucoin_kline_lite_candle_ids);
        Intrinsics.checkNotNull(typedArrayObtainTypedArray);
        String[] strArrM62012K3 = z11 ? m62012K3() : m62009H3();
        int length = strArrM62012K3.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = strArrM62012K3[i11];
            int i13 = i12 + 1;
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setId(typedArrayObtainTypedArray.getResourceId(i12, 0));
            radioButton.setButtonDrawable((Drawable) null);
            radioButton.setTextSize(14.0f);
            radioButton.setTextColor(getResources().getColorStateList(R$color.selector_color_tab));
            radioButton.setPaddingRelative(i12 == 0 ? 0 : C27029c.m66603f(this, 8), 0, C27029c.m66603f(this, 8), 0);
            radioButton.setChecked(false);
            radioButton.setText(str);
            arrayList.add(radioButton);
            i11++;
            i12 = i13;
        }
        typedArrayObtainTypedArray.recycle();
        return arrayList;
    }

    /* JADX INFO: renamed from: Q3 */
    public final boolean m62017Q3() {
        return ((Boolean) this.f50641X.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m62018d4(int i11) {
        C37878b0 c37878b0 = C37878b0.f85252a;
        Integer num = null;
        if (c37878b0.m85528i()) {
            if (i11 == R$id.one_hour_id) {
                num = 0;
            } else if (i11 == R$id.one_day_id) {
                num = 1;
            } else if (i11 == R$id.one_week_id) {
                num = 2;
            } else if (i11 == R$id.one_month_id) {
                num = 3;
            } else if (i11 == R$id.one_year_id) {
                num = 4;
            } else if (i11 == R$id.three_year_id) {
                num = 5;
            }
            if (num != null) {
                c37878b0.m85539t(num.intValue());
                return;
            }
            return;
        }
        if (i11 == R$id.one_min_id) {
            num = 0;
        } else if (i11 == R$id.five_min_id) {
            num = 1;
        } else if (i11 == R$id.fifteen_min_id) {
            num = 2;
        } else if (i11 == R$id.one_hour_id) {
            num = 3;
        } else if (i11 == R$id.eight_hour_id) {
            num = 4;
        } else if (i11 == R$id.one_day_id) {
            num = 5;
        } else if (i11 == R$id.one_week_id) {
            num = 6;
        }
        if (num != null) {
            c37878b0.m85533n(num.intValue());
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_kline_main_lite, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        C44660q c44660q;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        RadioButton radioButton;
        View view2;
        RadioButton radioButton2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!m62017Q3()) {
            C37878b0.f85252a.m85542w(true);
            C44636e c44636eM62008G3 = m62008G3();
            if (c44636eM62008G3 != null && (radioButton2 = c44636eM62008G3.f99047h) != null) {
                ViewExtKt.m66577h(radioButton2);
            }
            C44636e c44636eM62008G4 = m62008G3();
            if (c44636eM62008G4 != null && (view2 = c44636eM62008G4.f99046g) != null) {
                ViewExtKt.m66577h(view2);
            }
            C44636e c44636eM62008G5 = m62008G3();
            if (c44636eM62008G5 != null && (radioButton = c44636eM62008G5.f99045f) != null) {
                ViewExtKt.m66577h(radioButton);
            }
            C44636e c44636eM62008G6 = m62008G3();
            if (c44636eM62008G6 != null && (baseTextView2 = c44636eM62008G6.f99050k) != null) {
                ViewExtKt.m66594y(baseTextView2);
            }
        }
        this.f50649f0 = LiteFlutterKlineFragment.Companion.newInstance$default(LiteFlutterKlineFragment.f50710e0, m61977N3(), m62017Q3(), false, 0, 0, getPrecision(), 28, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        LiteFlutterKlineFragment liteFlutterKlineFragment = this.f50649f0;
        if (liteFlutterKlineFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("klineChatFragment");
            liteFlutterKlineFragment = null;
        }
        C5286o.m6317a(childFragmentManager, liteFlutterKlineFragment, R$id.fl_container);
        LiteFlutterKlineFragment liteFlutterKlineFragment2 = this.f50649f0;
        if (liteFlutterKlineFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("klineChatFragment");
            liteFlutterKlineFragment2 = null;
        }
        C5286o.m6329m(liteFlutterKlineFragment2);
        LiteFlutterKlineFragment liteFlutterKlineFragment3 = this.f50649f0;
        if (liteFlutterKlineFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("klineChatFragment");
            liteFlutterKlineFragment3 = null;
        }
        final InterfaceC41634e<LiteFlutterKlineFragment.C25427a> interfaceC41634eM62118D3 = liteFlutterKlineFragment3.m62118D3();
        C41636g.m90891O(C41636g.m90917h(C41636g.m90896T(C41636g.m90890N(C41636g.m90937t(new InterfaceC41634e<LiteFlutterKlineFragment.C25427a>() { // from class: com.kubi.spot.kline.KuCoinKlineLiteFragment$onViewCreated$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineLiteFragment$onViewCreated$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 KuCoinKlineLiteFragment.kt\ncom/kubi/spot/kline/KuCoinKlineLiteFragment\n*L\n1#1,49:1\n18#2:50\n19#2:52\n94#3:51\n*E\n"})
            public static final class C253602<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f50653b;

                /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineLiteFragment$onViewCreated$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.spot.kline.KuCoinKlineLiteFragment$onViewCreated$$inlined$filter$1$2", m90122f = "KuCoinKlineLiteFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C253602.this.emit(null, this);
                    }
                }

                public C253602(InterfaceC41635f interfaceC41635f) {
                    this.f50653b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f50653b;
                        if (((LiteFlutterKlineFragment.C25427a) obj) != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super LiteFlutterKlineFragment.C25427a> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM62118D3.collect(new C253602(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, 50L), C42911a.m94121c()), new C253612(null)), new C253623(null)), LifecycleOwnerKt.getLifecycleScope(this));
        C44636e c44636eM62008G7 = m62008G3();
        if (c44636eM62008G7 != null && (c44660q = c44636eM62008G7.f99041b) != null && (baseTextView = c44660q.f99286c) != null) {
            baseTextView.setText(m62011J3());
        }
        BehaviorSubject<Integer> behaviorSubject = this.f50647d0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable<Integer> observableObserveOn = behaviorSubject.debounce(200L, timeUnit).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.kline.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinKlineLiteFragment.m61981U3(this.f50705b, (Integer) obj);
            }
        };
        Consumer<? super Integer> consumer = new Consumer() { // from class: com.kubi.spot.kline.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinKlineLiteFragment.m61982V3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.kline.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinKlineLiteFragment.m61983W3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.kline.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinKlineLiteFragment.m61984X3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        Observable<Integer> observableObserveOn2 = this.f50648e0.debounce(200L, timeUnit).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.kline.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinKlineLiteFragment.m61985Y3(this.f50758b, (Integer) obj);
            }
        };
        Consumer<? super Integer> consumer2 = new Consumer() { // from class: com.kubi.spot.kline.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinKlineLiteFragment.m61986Z3(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.spot.kline.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinKlineLiteFragment.m61987a4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.spot.kline.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinKlineLiteFragment.m61988b4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, getDestroyDisposable());
        C44636e c44636eM62008G8 = m62008G3();
        if (c44636eM62008G8 != null && (radioGroupPlus2 = c44636eM62008G8.f99049j) != null) {
            radioGroupPlus2.setOnCheckedChangeListener(new C25359b());
        }
        C44636e c44636eM62008G9 = m62008G3();
        if (c44636eM62008G9 == null || (radioGroupPlus = c44636eM62008G9.f99049j) == null) {
            return;
        }
        radioGroupPlus.m54743f(C37878b0.f85252a.m85528i() ? R$id.rb_line : R$id.rb_candle);
    }

    public KuCoinKlineLiteFragment() {
        BehaviorSubject<Integer> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f50647d0 = behaviorSubjectCreate;
        BehaviorSubject<Integer> behaviorSubjectCreate2 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate2, "create(...)");
        this.f50648e0 = behaviorSubjectCreate2;
    }

    /* JADX INFO: renamed from: F3 */
    public static final String m61976F3(KuCoinKlineLiteFragment kuCoinKlineLiteFragment) {
        String string;
        Bundle arguments = kuCoinKlineLiteFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("coinName");
        } else {
            string = null;
        }
        return C27041f.m66669i(string, "--");
    }

    /* JADX INFO: renamed from: R3 */
    public static final boolean m61978R3(KuCoinKlineLiteFragment kuCoinKlineLiteFragment) {
        Boolean boolValueOf;
        Bundle arguments = kuCoinKlineLiteFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isKuCoin"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m61981U3(KuCoinKlineLiteFragment kuCoinKlineLiteFragment, Integer num) {
        int iM85522c;
        C44660q c44660q;
        BaseTextView baseTextView;
        Intrinsics.checkNotNull(num);
        kuCoinKlineLiteFragment.m62018d4(num.intValue());
        C44636e c44636eM62008G3 = kuCoinKlineLiteFragment.m62008G3();
        if (c44636eM62008G3 != null && (c44660q = c44636eM62008G3.f99041b) != null && (baseTextView = c44660q.f99288e) != null) {
            baseTextView.setText('(' + kuCoinKlineLiteFragment.m62014M3() + ')');
        }
        C37878b0 c37878b0 = C37878b0.f85252a;
        boolean zM85528i = c37878b0.m85528i();
        LiteFlutterKlineFragment liteFlutterKlineFragment = kuCoinKlineLiteFragment.f50649f0;
        if (liteFlutterKlineFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("klineChatFragment");
            liteFlutterKlineFragment = null;
        }
        if (zM85528i) {
            iM85522c = c37878b0.m85524e();
        } else {
            iM85522c = c37878b0.m85522c();
        }
        liteFlutterKlineFragment.m62120x3(zM85528i, iM85522c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public static final void m61982V3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public static final Unit m61983W3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public static final void m61984X3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public static final void m61986Z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m61987a4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m61988b4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static final int m61989c4(KuCoinKlineLiteFragment kuCoinKlineLiteFragment) {
        Integer numValueOf;
        Bundle arguments = kuCoinKlineLiteFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("precision"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }

    /* JADX INFO: renamed from: e4 */
    public static final String m61990e4(KuCoinKlineLiteFragment kuCoinKlineLiteFragment) {
        String string;
        Bundle arguments = kuCoinKlineLiteFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m62015O3() {
        List<RadioButton> listM62010I3;
        int i11;
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        RadioGroupPlus radioGroupPlus3;
        RadioGroupPlus radioGroupPlus4;
        C44636e c44636eM62008G3 = m62008G3();
        if (c44636eM62008G3 != null && (radioGroupPlus4 = c44636eM62008G3.f99048i) != null) {
            radioGroupPlus4.removeAllViews();
        }
        if (C37878b0.f85252a.m85528i()) {
            listM62010I3 = m62013L3();
        } else {
            listM62010I3 = m62010I3();
        }
        for (RadioButton radioButton : listM62010I3) {
            C44636e c44636eM62008G4 = m62008G3();
            if (c44636eM62008G4 != null && (radioGroupPlus3 = c44636eM62008G4.f99048i) != null) {
                radioGroupPlus3.addView(radioButton);
            }
        }
        C37878b0 c37878b0 = C37878b0.f85252a;
        if (c37878b0.m85528i()) {
            int iM85524e = c37878b0.m85524e();
            if (iM85524e != 1) {
                if (iM85524e != 2) {
                    if (iM85524e != 3) {
                        if (iM85524e != 4) {
                            if (iM85524e != 5) {
                                i11 = R$id.one_hour_id;
                            } else {
                                i11 = R$id.three_year_id;
                            }
                        } else {
                            i11 = R$id.one_year_id;
                        }
                    } else {
                        i11 = R$id.one_month_id;
                    }
                } else {
                    i11 = R$id.one_week_id;
                }
            } else {
                i11 = R$id.one_day_id;
            }
        } else {
            switch (c37878b0.m85522c()) {
                case 1:
                    i11 = R$id.five_min_id;
                    break;
                case 2:
                    i11 = R$id.fifteen_min_id;
                    break;
                case 3:
                    i11 = R$id.one_hour_id;
                    break;
                case 4:
                    i11 = R$id.eight_hour_id;
                    break;
                case 5:
                    i11 = R$id.one_day_id;
                    break;
                case 6:
                    i11 = R$id.one_week_id;
                    break;
                default:
                    i11 = R$id.one_min_id;
                    break;
            }
        }
        C44636e c44636eM62008G5 = m62008G3();
        if (c44636eM62008G5 != null && (radioGroupPlus2 = c44636eM62008G5.f99048i) != null) {
            radioGroupPlus2.setOnCheckedChangeListener(new C25358a());
        }
        C44636e c44636eM62008G6 = m62008G3();
        if (c44636eM62008G6 != null && (radioGroupPlus = c44636eM62008G6.f99048i) != null) {
            radioGroupPlus.m54743f(i11);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m62019f4(LiteFlutterKlineFragment.C25427a c25427a) {
        C44660q c44660q;
        UpDownTextView upDownTextView;
        C44660q c44660q2;
        BaseTextView baseTextView;
        if (isAdded() && !isDetached() && c25427a != null) {
            C44636e c44636eM62008G3 = m62008G3();
            if (c44636eM62008G3 != null && (c44660q2 = c44636eM62008G3.f99041b) != null && (baseTextView = c44660q2.f99287d) != null) {
                baseTextView.setText(c25427a.getF50717a());
            }
            C44636e c44636eM62008G4 = m62008G3();
            if (c44636eM62008G4 != null && (c44660q = c44636eM62008G4.f99041b) != null && (upDownTextView = c44660q.f99285b) != null) {
                upDownTextView.m54919g(c25427a.getF50718b(), C22890g.m54279d(C27017c.f54310a.m66513b(), C27039d.m66646f(c25427a.getF50718b()), 0, 2, null));
            }
        }
    }
}
