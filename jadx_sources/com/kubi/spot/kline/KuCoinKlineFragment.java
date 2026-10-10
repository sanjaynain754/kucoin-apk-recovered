package com.kubi.spot.kline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.FragmentResultListener;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$font;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.kline.flutter.SpotFlutterKlineFragment;
import com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity;
import com.kubi.tradebase.business.klineSettings.KLineLayoutManager;
import com.kubi.tradebase.business.klineSettings.KLineSettingConfig;
import com.kubi.tradebase.business.klineSettings.KLineSettingsManager;
import com.kubi.tradebase.business.klineSettings.KLineTimeAdapter;
import com.kubi.tradebase.business.klineSettings.KLineTimeCycleAdapter;
import com.kubi.tradebase.business.klineSettings.KLineTimeEntity;
import com.kubi.tradebase.business.klineSettings.KLineTimeSetFragment;
import com.kubi.tradebase.business.klineSettings.KlineConfig;
import com.kubi.tradebase.business.klineSettings.KlineSettingsNewDialog;
import com.kubi.tradebase.business.klineSettings.KlineTrack;
import com.kubi.tradebase.business.klineSettings.OrderConfigValue;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37878b0;
import i30.InterfaceC38437b;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p569qq.InterfaceC43850k;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import qe0.C43724b;
import ro.C44128b;
import t20.C44651l0;
import w00.C45681e;
import w20.C45700a;

/* JADX INFO: compiled from: KuCoinKlineFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 W2\u00020\u0001:\u0002VWB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\fH\u0014J\u001a\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0017J\b\u0010A\u001a\u00020<H\u0002J\b\u0010B\u001a\u00020<H\u0002J\b\u0010C\u001a\u00020<H\u0002J\u0010\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020>H\u0002J\u0010\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020\fH\u0002J\u0010\u0010H\u001a\u00020<2\u0006\u0010E\u001a\u00020>H\u0002J\b\u0010I\u001a\u00020<H\u0016J\u0010\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020\fH\u0002J\b\u0010L\u001a\u00020\fH\u0002J\b\u0010M\u001a\u00020\fH\u0002J\b\u0010N\u001a\u00020<H\u0016J$\u0010O\u001a\u00020<2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010T\u001a\u00020:H\u0002J\b\u0010U\u001a\u00020\fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010 0 0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010 0 0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\"\u001a\n \r*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b%\u0010&*\u0004\b#\u0010$R#\u0010'\u001a\n \r*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b)\u0010&*\u0004\b(\u0010$R#\u0010*\u001a\n \r*\u0004\u0018\u00010+0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0014\u001a\u0004\b,\u0010-R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, m90084d2 = {"Lcom/kubi/spot/kline/KuCoinKlineFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/KucoinFragmentKlineMainBinding;", "getBinding", "()Lcom/kubi/spot/databinding/KucoinFragmentKlineMainBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "filterSub", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "getLayout", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "precision", "getPrecision", "()I", "precision$delegate", "spotFlutterKlineFragmentDelegate", "Lkotlin/Lazy;", "Lcom/kubi/spot/kline/flutter/SpotFlutterKlineFragment;", "newInstance", "getNewInstance", "()Lcom/kubi/spot/kline/flutter/SpotFlutterKlineFragment;", "mMinutePopupDelagate", "Lcom/zyyoona7/popup/EasyPopup;", "mQuotaPopupDelagate", "mMinutePopup", "getMMinutePopup$delegate", "(Lcom/kubi/spot/kline/KuCoinKlineFragment;)Ljava/lang/Object;", "getMMinutePopup", "()Lcom/zyyoona7/popup/EasyPopup;", "mQuotaPopup", "getMQuotaPopup$delegate", "getMQuotaPopup", "api", "Lcom/kubi/tradebase/api/KlineApi;", "getApi", "()Lcom/kubi/tradebase/api/KlineApi;", "api$delegate", "klineSettingConfig", "Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "containerHeight", "timeCycle", "", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;", "kLineTimeCycleAdapter", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeCycleAdapter;", "kLineTimeAdapter", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeAdapter;", "isCheckMore", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "fetchKlineConfig", "updateOrdersVisible", "configDialogResultListener", "initQuotaView", "contentView", "updateFullScreenMargin", "currentNoMainChart", "initMinuteView", "onResume", "getKlinePosition", "i", "getMainIdByPosition", "getNoMainIdByPosition", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "setColorAndIcon", "textView", "Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "isClick", "getMoreColor", "IKlineFragmentProvider", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinKlineFragment.kt\ncom/kubi/spot/kline/KuCoinKlineFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,584:1\n147#2,16:585\n158#3,2:601\n1#4:603\n43#5,7:604\n43#5,7:611\n160#6,4:618\n*S KotlinDebug\n*F\n+ 1 KuCoinKlineFragment.kt\ncom/kubi/spot/kline/KuCoinKlineFragment\n*L\n82#1:585,16\n233#1:601,2\n125#1:604,7\n140#1:611,7\n287#1:618,4\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_k_spot")
public final class KuCoinKlineFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50619U = C45681e.m100799e(this, new Function1<KuCoinKlineFragment, C44651l0>() { // from class: com.kubi.spot.kline.KuCoinKlineFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44651l0 invoke(@NotNull KuCoinKlineFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44651l0.m98778a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44651l0, Unit>() { // from class: com.kubi.spot.kline.KuCoinKlineFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44651l0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44651l0 c44651l0) {
            invoke(c44651l0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final BehaviorSubject<Integer> f50620V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f50621W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f50622X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy<SpotFlutterKlineFragment> f50623Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy<C43724b> f50624Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy<C43724b> f50625a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f50626b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public KLineSettingConfig f50627c0;

    /* JADX INFO: renamed from: d0 */
    public int f50628d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public List<KLineTimeEntity> f50629e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public KLineTimeCycleAdapter f50630f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public KLineTimeAdapter f50631g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f50632h0;

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f50618j0 = {Reflection.property1(new PropertyReference1Impl(KuCoinKlineFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/KucoinFragmentKlineMainBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f50617i0 = new Companion(null);

    /* JADX INFO: compiled from: KuCoinKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/kline/KuCoinKlineFragment$Companion;", "", "<init>", "()V", "RELOAD_KLINE_DATA", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineFragment$a */
    /* JADX INFO: compiled from: KuCoinKlineFragment.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/kline/KuCoinKlineFragment$IKlineFragmentProvider;", "", "getTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getPrecision", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC25353a {
        @NotNull
        /* JADX INFO: renamed from: D0 */
        TradeItemBean getF49727V();

        int getPrecision();
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineFragment$b */
    /* JADX INFO: compiled from: KuCoinKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/kline/KuCoinKlineFragment$configDialogResultListener$2", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25354b implements FragmentResultListener {
        public C25354b() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            C44128b.m97266j(KuCoinKlineFragment.this.getTAG(), "kline config update result:" + result);
            final KLineSettingConfig kLineSettingConfig = (KLineSettingConfig) result.getParcelable("result_config_update");
            if (kLineSettingConfig != null && IUserService.a.get().c()) {
                Observable<R> observableCompose = KuCoinKlineFragment.this.m61930h4().m86698a(new KlineConfig("order_config", C27029c.m66606i(new OrderConfigValue(Boolean.valueOf(kLineSettingConfig.getShowHistoryOrder()), Boolean.valueOf(kLineSettingConfig.getShowActiveOrder()))), null, null, 12, null)).compose(C24217a1.m58389m());
                final KuCoinKlineFragment kuCoinKlineFragment = KuCoinKlineFragment.this;
                Consumer consumer = new Consumer() { // from class: com.kubi.spot.kline.e0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KuCoinKlineFragment.C25354b.m61968e(kuCoinKlineFragment, kLineSettingConfig, obj);
                    }
                };
                final Function1 function1 = new Function1() { // from class: com.kubi.spot.kline.f0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KuCoinKlineFragment.C25354b.m61969f((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.kline.g0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KuCoinKlineFragment.C25354b.m61970g(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, KuCoinKlineFragment.this.getDestroyDisposable());
            }
        }

        /* JADX INFO: renamed from: e */
        public static final void m61968e(KuCoinKlineFragment kuCoinKlineFragment, KLineSettingConfig kLineSettingConfig, Object obj) {
            kuCoinKlineFragment.f50627c0 = kLineSettingConfig;
            kuCoinKlineFragment.m61916T4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m61969f(Throwable th2) {
            Intrinsics.checkNotNull(th2);
            C19331c.m42836c(th2, null, 2, null);
            C44128b.m97264h(th2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final void m61970g(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C25355c extends TypeToken<OrderConfigValue> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.KuCoinKlineFragment$onResume$1 */
    /* JADX INFO: compiled from: KuCoinKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.kline.KuCoinKlineFragment$onResume$1", m90122f = "KuCoinKlineFragment.kt", m90123i = {}, m90124l = {458}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nKuCoinKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinKlineFragment.kt\ncom/kubi/spot/kline/KuCoinKlineFragment$onResume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,584:1\n295#2,2:585\n*S KotlinDebug\n*F\n+ 1 KuCoinKlineFragment.kt\ncom/kubi/spot/kline/KuCoinKlineFragment$onResume$1\n*L\n462#1:585,2\n*E\n"})
    public static final class C253571 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C253571(Continuation<? super C253571> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KuCoinKlineFragment.this.new C253571(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C253571) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KuCoinKlineFragment kuCoinKlineFragment;
            Integer numBoxInt;
            Object next;
            BaseTextView baseTextView;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    kuCoinKlineFragment = (KuCoinKlineFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KuCoinKlineFragment kuCoinKlineFragment2 = KuCoinKlineFragment.this;
                KLineSettingsManager kLineSettingsManager = KLineSettingsManager.f51515a;
                this.L$0 = kuCoinKlineFragment2;
                this.label = 1;
                Object objM63124i = kLineSettingsManager.m63124i(this);
                if (objM63124i == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kuCoinKlineFragment = kuCoinKlineFragment2;
                obj = objM63124i;
            }
            KuCoinKlineFragment kuCoinKlineFragment3 = KuCoinKlineFragment.this;
            List<KLineTimeEntity> list = (List) obj;
            KLineTimeAdapter kLineTimeAdapter = kuCoinKlineFragment3.f50631g0;
            if (kLineTimeAdapter != null) {
                kLineTimeAdapter.replaceData(list);
            }
            if (kuCoinKlineFragment3.f50632h0) {
                Iterator<T> it = KLineSettingsManager.f51515a.m63123h(list).iterator();
                do {
                    numBoxInt = null;
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                        break;
                    }
                } while (((KLineTimeEntity) next).getTag() != C37878b0.f85252a.m85523d());
                KLineTimeEntity kLineTimeEntity = (KLineTimeEntity) next;
                if (kLineTimeEntity != null) {
                    numBoxInt = Boxing.boxInt(kLineTimeEntity.getTag());
                }
                C44651l0 c44651l0M61963i4 = kuCoinKlineFragment3.m61963i4();
                if (c44651l0M61963i4 != null && (baseTextView = c44651l0M61963i4.f99198l) != null) {
                    baseTextView.setText(KLineSettingsManager.f51515a.m63120e(numBoxInt));
                }
            }
            kuCoinKlineFragment3.f50620V.onNext(Boxing.boxInt(6));
            kuCoinKlineFragment.f50629e0 = list;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m61926d4(KuCoinKlineFragment kuCoinKlineFragment, ArrayList arrayList) {
        KLineSettingConfig kLineSettingConfig;
        Object objM66914d;
        KlineConfig klineConfig = arrayList != null ? (KlineConfig) CollectionsKt.getOrNull(arrayList, 0) : null;
        if (klineConfig == null) {
            kLineSettingConfig = new KLineSettingConfig(true, true);
        } else if (Intrinsics.areEqual("order_config", klineConfig.getPri_dict_value())) {
            String pri_data_value = klineConfig.getPri_data_value();
            if (pri_data_value == null || pri_data_value.length() == 0) {
                kLineSettingConfig = new KLineSettingConfig(true, true);
            } else {
                try {
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(pri_data_value, new C25355c().getType());
                } catch (Throwable unused) {
                    objM66914d = null;
                }
                OrderConfigValue orderConfigValue = (OrderConfigValue) objM66914d;
                kLineSettingConfig = new KLineSettingConfig(C27025c.m66567e(orderConfigValue != null ? orderConfigValue.getHistory() : null, true), C27025c.m66567e(orderConfigValue != null ? orderConfigValue.getActive() : null, true));
            }
        } else {
            kLineSettingConfig = new KLineSettingConfig(false, false, 3, null);
        }
        kuCoinKlineFragment.f50627c0 = kLineSettingConfig;
        kuCoinKlineFragment.m61916T4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m61882C4(KuCoinKlineFragment kuCoinKlineFragment) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C44651l0 c44651l0M61963i4 = kuCoinKlineFragment.m61963i4();
            BaseTextView baseTextView = c44651l0M61963i4 != null ? c44651l0M61963i4.f99198l : null;
            C44651l0 c44651l0M61963i5 = kuCoinKlineFragment.m61963i4();
            kuCoinKlineFragment.m61908P4(baseTextView, c44651l0M61963i5 != null ? c44651l0M61963i5.f99192f : null, false);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C45700a.m100877c(thM103847exceptionOrNullimpl, "KuCoinKlineFragment---OnDismissListener");
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m61886E4(KuCoinKlineFragment kuCoinKlineFragment) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C44651l0 c44651l0M61963i4 = kuCoinKlineFragment.m61963i4();
            BaseTextView baseTextView = c44651l0M61963i4 != null ? c44651l0M61963i4.f99197k : null;
            C44651l0 c44651l0M61963i5 = kuCoinKlineFragment.m61963i4();
            kuCoinKlineFragment.m61908P4(baseTextView, c44651l0M61963i5 != null ? c44651l0M61963i5.f99191e : null, false);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C45700a.m100877c(thM103847exceptionOrNullimpl, "KuCoinKlineFragment---OnDismissListener");
        }
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m61892H4(KuCoinKlineFragment kuCoinKlineFragment) {
        C43852m.m96591c("B5candle", "klineSet", null, null, 12, null);
        KlineSettingsNewDialog klineSettingsNewDialogNewInstance = KlineSettingsNewDialog.f51522v0.newInstance(kuCoinKlineFragment.f50627c0);
        FragmentManager childFragmentManager = kuCoinKlineFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        klineSettingsNewDialogNewInstance.show(childFragmentManager, "kline_settings");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m61894I4(KuCoinKlineFragment kuCoinKlineFragment, ImageView imageView) {
        C43852m.m96591c("B5candle", "fullScreen", null, null, 12, null);
        Intent intent = new Intent(imageView.getContext(), (Class<?>) SpotFlutterKlineLandscapeActivity.class);
        KeyEventDispatcher.Component activity = kuCoinKlineFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.kubi.spot.kline.KuCoinKlineFragment.IKlineFragmentProvider");
        kuCoinKlineFragment.startActivity(intent.putExtra("data", ((InterfaceC25353a) activity).getF49727V()).putExtra("data_4", kuCoinKlineFragment.f50627c0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m61900L4(Throwable th2) {
        C44128b.m97263g("KuCoinKlineFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m61904N4(KuCoinKlineFragment kuCoinKlineFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        List<KLineTimeEntity> data;
        KLineTimeEntity kLineTimeEntity;
        KLineTimeAdapter kLineTimeAdapter = kuCoinKlineFragment.f50631g0;
        if (kLineTimeAdapter == null || (data = kLineTimeAdapter.getData()) == null || (kLineTimeEntity = data.get(i11)) == null) {
            return;
        }
        C37878b0.f85252a.m85538s(kLineTimeEntity.getTag());
        KlineTrack.m63174c(KlineTrack.f51542a, kLineTimeEntity.getTag(), null, 2, null);
        kuCoinKlineFragment.f50620V.onNext(Integer.valueOf(kLineTimeEntity.getTag()));
    }

    /* JADX INFO: renamed from: Q4 */
    public static final SpotFlutterKlineFragment m61910Q4(KuCoinKlineFragment kuCoinKlineFragment) {
        SpotFlutterKlineFragment.Companion companion = SpotFlutterKlineFragment.f50664Y;
        String strM61944q4 = kuCoinKlineFragment.m61944q4();
        Intrinsics.checkNotNullExpressionValue(strM61944q4, "<get-symbol>(...)");
        return companion.newInstance(strM61944q4, C37878b0.f85252a.m85523d(), kuCoinKlineFragment.getPrecision());
    }

    /* JADX INFO: renamed from: S4 */
    private final void m61914S4(int i11) {
        double d11;
        double d12;
        ImageView imageView;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            d11 = this.f50628d0;
            d12 = 0.65d;
        } else {
            d11 = this.f50628d0;
            d12 = 0.8d;
        }
        int iM66603f = (((int) (d11 * d12)) - C27029c.m66603f(this, 20)) - C27029c.m66603f(this, 24);
        C44651l0 c44651l0M61963i4 = m61963i4();
        if (c44651l0M61963i4 == null || (imageView = c44651l0M61963i4.f99189c) == null) {
            return;
        }
        ViewExtKt.m66585p(imageView, 0, iM66603f, 0, 0, 13, null);
    }

    /* JADX INFO: renamed from: b4 */
    private final void m61924b4() {
        setFragmentResultListener("result_draw_tools", new FragmentResultListener() { // from class: com.kubi.spot.kline.KuCoinKlineFragment$configDialogResultListener$1
            @Override // com.kubi.sdk.FragmentResultListener
            /* JADX INFO: renamed from: a */
            public void mo26171a(Bundle result) {
                Intrinsics.checkNotNullParameter(result, "result");
                C44128b.m97266j(this.f50634a.getTAG(), "draw tools result:" + result);
                LifecycleOwnerKt.getLifecycleScope(this.f50634a).launchWhenStarted(new C25356x727fa8a5(this.f50634a, null));
            }
        });
        setFragmentResultListener("result_config_update", new C25354b());
    }

    /* JADX INFO: renamed from: c4 */
    private final void m61925c4() {
        if (!IUserService.a.get().c()) {
            this.f50627c0 = new KLineSettingConfig(false, false, 3, null);
            m61916T4();
            return;
        }
        Observable observableCompose = InterfaceC38437b.m86697c(m61930h4(), null, null, 0, 7, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.kline.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinKlineFragment.m61926d4(this.f50703b, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.kline.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinKlineFragment.m61927e4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.kline.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinKlineFragment.m61928f4((Throwable) obj);
            }
        };
        addSubscription(observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.kline.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinKlineFragment.m61929g4(function2, obj);
            }
        }));
    }

    private final int getPrecision() {
        return ((Number) this.f50622X.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public final InterfaceC38437b m61930h4() {
        return (InterfaceC38437b) this.f50626b0.getValue();
    }

    /* JADX INFO: renamed from: k4 */
    private final C43724b m61933k4() {
        return this.f50624Z.getValue();
    }

    /* JADX INFO: renamed from: l4 */
    private final C43724b m61935l4() {
        return this.f50625a0.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    private final int m61937m4() {
        int iM85525f = C37878b0.f85252a.m85525f();
        if (iM85525f == 0) {
            return R$id.tv_kline_ma;
        }
        if (iM85525f == 1) {
            return R$id.tv_kline_ema;
        }
        if (iM85525f != 2) {
            return -1;
        }
        return R$id.tv_kline_boll;
    }

    /* JADX INFO: renamed from: p4 */
    private final int m61942p4() {
        int iM85526g = C37878b0.f85252a.m85526g();
        if (iM85526g == 0) {
            return R$id.tv_kline_macd;
        }
        if (iM85526g == 1) {
            return R$id.tv_kline_kdj;
        }
        if (iM85526g != 2) {
            return -1;
        }
        return R$id.tv_kline_rsi;
    }

    /* JADX INFO: renamed from: q4 */
    private final String m61944q4() {
        return (String) this.f50621W.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    private final void m61946r4(View view) {
        BaseViewHolder baseViewHolder = new BaseViewHolder(view);
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 5));
        KLineTimeCycleAdapter kLineTimeCycleAdapter = new KLineTimeCycleAdapter();
        this.f50630f0 = kLineTimeCycleAdapter;
        kLineTimeCycleAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.spot.kline.o
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) throws JSONException {
                KuCoinKlineFragment.m61948s4(this.f50750a, baseQuickAdapter, view2, i11);
            }
        });
        recyclerView.setAdapter(kLineTimeCycleAdapter);
        baseViewHolder.setOnClickListener(R$id.maskView, new View.OnClickListener() { // from class: com.kubi.spot.kline.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuCoinKlineFragment.m61950t4(this.f50752b, view2);
            }
        }).setOnClickListener(R$id.llTimeSet, new View.OnClickListener() { // from class: com.kubi.spot.kline.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuCoinKlineFragment.m61952u4(this.f50754b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    private final void m61954v4(View view) {
        final BaseViewHolder baseViewHolder = new BaseViewHolder(view);
        ((RadioGroup) baseViewHolder.getView(R$id.rb_main)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.spot.kline.r
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                KuCoinKlineFragment.m61956w4(this.f50755b, radioGroup, i11);
            }
        });
        ((RadioGroup) baseViewHolder.getView(R$id.rb_no_main)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.spot.kline.s
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                KuCoinKlineFragment.m61958x4(this.f50757b, radioGroup, i11);
            }
        });
        baseViewHolder.setOnClickListener(R$id.tv_hide_main, new View.OnClickListener() { // from class: com.kubi.spot.kline.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuCoinKlineFragment.m61960y4(this.f50759b, baseViewHolder, view2);
            }
        });
        baseViewHolder.setOnClickListener(R$id.tv_hide_no_main, new View.OnClickListener() { // from class: com.kubi.spot.kline.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuCoinKlineFragment.m61962z4(this.f50762b, baseViewHolder, view2);
            }
        });
        baseViewHolder.setOnClickListener(R$id.maskView, new View.OnClickListener() { // from class: com.kubi.spot.kline.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuCoinKlineFragment.m61878A4(this.f50764b, view2);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_kline_main;
    }

    /* JADX INFO: renamed from: i4 */
    public final C44651l0 m61963i4() {
        return (C44651l0) this.f50619U.getValue(this, f50618j0[0]);
    }

    /* JADX INFO: renamed from: o4 */
    public final SpotFlutterKlineFragment m61964o4() {
        if (this.f50623Y.isInitialized()) {
            return this.f50623Y.getValue();
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCCyclomaticComplexityCheck", "KCLongMethodCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        final ImageView imageView;
        ImageView imageView2;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m61944q4() == null) {
            preformBackPressed();
            return;
        }
        ILoadKlineAction iLoadKlineActionM62107a = C25418h0.m62107a(this);
        Lazy<SpotFlutterKlineFragment> lazy = this.f50623Y;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iLoadKlineActionM62107a.mo60491a(lazy, childFragmentManager);
        int iMo31927f = IKuFacadeService.f27711a.get().mo31927f();
        int iM6182d = C5267e0.m6182d();
        int iM6236a = (iM6182d - C5275i0.m6236a(350.0f)) - iMo31927f;
        int iM6236a2 = C5275i0.m6236a(300.0f);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(iM6236a, iM6236a2);
        if (iCoerceAtLeast == iM6236a2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("remark", String.valueOf(iM6236a));
            jSONObject.put(DbParams.KEY_CHANNEL_RESULT, String.valueOf(iMo31927f));
            jSONObject.put("message", String.valueOf(iM6182d));
            jSONObject.put("type", C5267e0.m6184f() ? "1" : OtcAd.KYC_NOT_PASS);
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e("B5trading", "kline", "1", jSONObject);
        }
        this.f50628d0 = iCoerceAtLeast;
        C44651l0 c44651l0M61963i4 = m61963i4();
        if (c44651l0M61963i4 != null && (frameLayout = c44651l0M61963i4.f99188b) != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = this.f50628d0;
        }
        C44651l0 c44651l0M61963i5 = m61963i4();
        if (c44651l0M61963i5 != null && (linearLayoutCompat2 = c44651l0M61963i5.f99194h) != null) {
            C27046k.m66711z(linearLayoutCompat2, 0L, new Function0() { // from class: com.kubi.spot.kline.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinKlineFragment.m61888F4(this.f50654b);
                }
            }, 1, null);
        }
        C44651l0 c44651l0M61963i6 = m61963i4();
        if (c44651l0M61963i6 != null && (linearLayoutCompat = c44651l0M61963i6.f99195i) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.spot.kline.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinKlineFragment.m61890G4(this.f50747b);
                }
            }, 1, null);
        }
        C44651l0 c44651l0M61963i7 = m61963i4();
        if (c44651l0M61963i7 != null && (imageView2 = c44651l0M61963i7.f99190d) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.spot.kline.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinKlineFragment.m61892H4(this.f50766b);
                }
            }, 1, null);
        }
        m61924b4();
        C44651l0 c44651l0M61963i8 = m61963i4();
        if (c44651l0M61963i8 != null && (imageView = c44651l0M61963i8.f99189c) != null) {
            m61914S4(C37878b0.f85252a.m85526g());
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.spot.kline.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuCoinKlineFragment.m61894I4(this.f50768b, imageView);
                }
            }, 1, null);
        }
        Observable<Integer> observableObserveOn = this.f50620V.debounce(200L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.kline.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinKlineFragment.m61896J4(this.f50771b, (Integer) obj);
            }
        };
        Consumer<? super Integer> consumer = new Consumer() { // from class: com.kubi.spot.kline.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinKlineFragment.m61898K4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.kline.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuCoinKlineFragment.m61900L4((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.kline.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuCoinKlineFragment.m61902M4(function2, obj);
            }
        }));
        if (C12573b.f21598a.m23696a()) {
            "reload_kline_data".length();
        }
        KLineTimeAdapter kLineTimeAdapter = null;
        C12572a.m23692a(this, false, new KuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1("reload_kline_data", null, this));
        m61925c4();
        C44651l0 c44651l0M61963i9 = m61963i4();
        if (c44651l0M61963i9 != null && (recyclerView2 = c44651l0M61963i9.f99196j) != null) {
            Context context = getContext();
            recyclerView2.setLayoutManager(context != null ? new KLineLayoutManager(context) : null);
        }
        this.f50631g0 = new KLineTimeAdapter();
        C44651l0 c44651l0M61963i10 = m61963i4();
        if (c44651l0M61963i10 == null || (recyclerView = c44651l0M61963i10.f99196j) == null) {
            return;
        }
        KLineTimeAdapter kLineTimeAdapter2 = this.f50631g0;
        if (kLineTimeAdapter2 != null) {
            kLineTimeAdapter2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.spot.kline.c0
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) throws JSONException {
                    KuCoinKlineFragment.m61904N4(this.f50657a, baseQuickAdapter, view2, i11);
                }
            });
            kLineTimeAdapter = kLineTimeAdapter2;
        }
        recyclerView.setAdapter(kLineTimeAdapter);
    }

    public KuCoinKlineFragment() {
        BehaviorSubject<Integer> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f50620V = behaviorSubjectCreate;
        this.f50621W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinKlineFragment.m61912R4(this.f50659b);
            }
        });
        this.f50622X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(KuCoinKlineFragment.m61906O4(this.f50656b));
            }
        });
        this.f50623Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinKlineFragment.m61910Q4(this.f50658b);
            }
        });
        this.f50624Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinKlineFragment.m61880B4(this.f50660b);
            }
        });
        this.f50625a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinKlineFragment.m61884D4(this.f50663b);
            }
        });
        this.f50626b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuCoinKlineFragment.m61923a4();
            }
        });
        this.f50627c0 = new KLineSettingConfig(false, true, 1, null);
        this.f50632h0 = true;
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m61878A4(KuCoinKlineFragment kuCoinKlineFragment, View view) {
        kuCoinKlineFragment.m61935l4().m96331y();
    }

    /* JADX INFO: renamed from: B4 */
    public static final C43724b m61880B4(final KuCoinKlineFragment kuCoinKlineFragment) {
        C43724b c43724bM96322p = C43724b.m96333g0().m96308R(kuCoinKlineFragment.mContext, R$layout.btradebase_popup_kline_time).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.spot.kline.l
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                KuCoinKlineFragment.m61882C4(this.f50709b);
            }
        }).m96316Z(true).m96322p();
        View viewM96292A = c43724bM96322p.m96292A();
        Intrinsics.checkNotNullExpressionValue(viewM96292A, "getContentView(...)");
        kuCoinKlineFragment.m61946r4(viewM96292A);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: D4 */
    public static final C43724b m61884D4(final KuCoinKlineFragment kuCoinKlineFragment) {
        C43724b c43724bM96322p = C43724b.m96333g0().m96308R(kuCoinKlineFragment.getActivity(), R$layout.kucoin_popup_kline_quota).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.spot.kline.n
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                KuCoinKlineFragment.m61886E4(this.f50748b);
            }
        }).m96316Z(true).m96322p();
        View viewM96292A = c43724bM96322p.m96292A();
        Intrinsics.checkNotNullExpressionValue(viewM96292A, "getContentView(...)");
        kuCoinKlineFragment.m61954v4(viewM96292A);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m61888F4(KuCoinKlineFragment kuCoinKlineFragment) {
        BaseTextView baseTextView;
        ImageView imageView;
        if (!kuCoinKlineFragment.m61935l4().m96299I()) {
            C44651l0 c44651l0M61963i4 = kuCoinKlineFragment.m61963i4();
            LinearLayout linearLayout = null;
            if (c44651l0M61963i4 != null) {
                baseTextView = c44651l0M61963i4.f99197k;
            } else {
                baseTextView = null;
            }
            C44651l0 c44651l0M61963i5 = kuCoinKlineFragment.m61963i4();
            if (c44651l0M61963i5 != null) {
                imageView = c44651l0M61963i5.f99191e;
            } else {
                imageView = null;
            }
            kuCoinKlineFragment.m61908P4(baseTextView, imageView, true);
            C43724b c43724bM61935l4 = kuCoinKlineFragment.m61935l4();
            C44651l0 c44651l0M61963i6 = kuCoinKlineFragment.m61963i4();
            if (c44651l0M61963i6 != null) {
                linearLayout = c44651l0M61963i6.f99193g;
            }
            c43724bM61935l4.mo54253b0(linearLayout);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m61890G4(KuCoinKlineFragment kuCoinKlineFragment) {
        BaseTextView baseTextView;
        ImageView imageView;
        if (!kuCoinKlineFragment.m61933k4().m96299I()) {
            List<KLineTimeEntity> list = kuCoinKlineFragment.f50629e0;
            if (list != null) {
                List<KLineTimeEntity> listM63123h = KLineSettingsManager.f51515a.m63123h(list);
                KLineTimeCycleAdapter kLineTimeCycleAdapter = kuCoinKlineFragment.f50630f0;
                if (kLineTimeCycleAdapter != null) {
                    kLineTimeCycleAdapter.replaceData(listM63123h);
                }
            }
            C44651l0 c44651l0M61963i4 = kuCoinKlineFragment.m61963i4();
            LinearLayout linearLayout = null;
            if (c44651l0M61963i4 != null) {
                baseTextView = c44651l0M61963i4.f99198l;
            } else {
                baseTextView = null;
            }
            C44651l0 c44651l0M61963i5 = kuCoinKlineFragment.m61963i4();
            if (c44651l0M61963i5 != null) {
                imageView = c44651l0M61963i5.f99192f;
            } else {
                imageView = null;
            }
            kuCoinKlineFragment.m61908P4(baseTextView, imageView, true);
            C43724b c43724bM61933k4 = kuCoinKlineFragment.m61933k4();
            C44651l0 c44651l0M61963i6 = kuCoinKlineFragment.m61963i4();
            if (c44651l0M61963i6 != null) {
                linearLayout = c44651l0M61963i6.f99193g;
            }
            c43724bM61933k4.mo54253b0(linearLayout);
            if (kuCoinKlineFragment.f50632h0) {
                kuCoinKlineFragment.f50632h0 = false;
                kuCoinKlineFragment.f50620V.onNext(-1);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m61896J4(KuCoinKlineFragment kuCoinKlineFragment, Integer num) {
        Intrinsics.checkNotNull(num);
        kuCoinKlineFragment.m61931j4(num.intValue());
        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o4 = kuCoinKlineFragment.m61964o4();
        if (spotFlutterKlineFragmentM61964o4 != null) {
            spotFlutterKlineFragmentM61964o4.m62028v3(C37878b0.f85252a.m85523d());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m61898K4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m61902M4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O4 */
    public static final int m61906O4(KuCoinKlineFragment kuCoinKlineFragment) {
        KeyEventDispatcher.Component activity = kuCoinKlineFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.kubi.spot.kline.KuCoinKlineFragment.IKlineFragmentProvider");
        return ((InterfaceC25353a) activity).getPrecision();
    }

    /* JADX INFO: renamed from: P4 */
    private final void m61908P4(TextView textView, ImageView imageView, boolean z11) {
        Typeface typeface;
        int colorRes;
        if (getContext() != null) {
            if (z11) {
                if (imageView != null) {
                    imageView.setImageResource(R$drawable.ic2_triangle_top_12);
                }
                if (imageView != null) {
                    C27046k.m66701p(imageView, getColorRes(R$color.c_text));
                }
                if (textView != null) {
                    textView.setTypeface(ResourcesCompat.getFont(this.mContext, R$font.medium));
                }
                colorRes = getColorRes(R$color.c_text);
            } else {
                if (imageView != null) {
                    imageView.setImageResource(R$drawable.ic2_triangle_bottom_12);
                }
                if (imageView != null) {
                    C27046k.m66701p(imageView, getColorRes(R$color.c_text40));
                }
                if (textView != null) {
                    typeface = textView.getTypeface();
                } else {
                    typeface = null;
                }
                Intrinsics.areEqual(typeface, ResourcesCompat.getFont(this.mContext, R$font.regular));
                if (textView != null && textView.getId() == R$id.tvTabTime) {
                    colorRes = m61939n4();
                } else {
                    colorRes = getColorRes(R$color.c_text40);
                }
            }
            if (textView != null) {
                textView.setTextColor(colorRes);
            }
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static final String m61912R4(KuCoinKlineFragment kuCoinKlineFragment) {
        KeyEventDispatcher.Component activity = kuCoinKlineFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.kubi.spot.kline.KuCoinKlineFragment.IKlineFragmentProvider");
        return ((InterfaceC25353a) activity).getF49727V().getSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public final void m61916T4() {
        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o4 = m61964o4();
        if (spotFlutterKlineFragmentM61964o4 != null) {
            spotFlutterKlineFragmentM61964o4.m62025s3(this.f50627c0.getShowHistoryOrder());
        }
        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o5 = m61964o4();
        if (spotFlutterKlineFragmentM61964o5 != null) {
            spotFlutterKlineFragmentM61964o5.m62023q3(this.f50627c0.getShowActiveOrder());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public static final InterfaceC38437b m61923a4() {
        return (InterfaceC38437b) C42597a.m93386b().create(InterfaceC38437b.class);
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m61927e4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m61928f4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m61929g4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j4 */
    private final void m61931j4(int i11) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new KuCoinKlineFragment$getKlinePosition$1(this, i11, null));
    }

    /* JADX INFO: renamed from: n4 */
    private final int m61939n4() {
        CharSequence text;
        BaseTextView baseTextView;
        C44651l0 c44651l0M61963i4 = m61963i4();
        if (c44651l0M61963i4 != null && (baseTextView = c44651l0M61963i4.f99198l) != null) {
            text = baseTextView.getText();
        } else {
            text = null;
        }
        if (!Intrinsics.areEqual(text, getString(R$string.more))) {
            return getColorRes(R$color.c_text);
        }
        return getColorRes(R$color.c_text40);
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m61948s4(KuCoinKlineFragment kuCoinKlineFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        List<KLineTimeEntity> data;
        KLineTimeEntity kLineTimeEntity;
        kuCoinKlineFragment.m61933k4().m96331y();
        KLineTimeCycleAdapter kLineTimeCycleAdapter = kuCoinKlineFragment.f50630f0;
        if (kLineTimeCycleAdapter != null && (data = kLineTimeCycleAdapter.getData()) != null && (kLineTimeEntity = data.get(i11)) != null) {
            C37878b0.f85252a.m85538s(kLineTimeEntity.getTag());
            KlineTrack.m63174c(KlineTrack.f51542a, kLineTimeEntity.getTag(), null, 2, null);
            kuCoinKlineFragment.f50620V.onNext(Integer.valueOf(kLineTimeEntity.getTag()));
        }
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m61950t4(KuCoinKlineFragment kuCoinKlineFragment, View view) {
        kuCoinKlineFragment.m61933k4().m96331y();
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m61952u4(KuCoinKlineFragment kuCoinKlineFragment, View view) {
        kuCoinKlineFragment.m61933k4().m96331y();
        Context context = kuCoinKlineFragment.getContext();
        if (context != null) {
            kuCoinKlineFragment.f50632h0 = true;
            BaseActivity.INSTANCE.launch(context, KLineTimeSetFragment.class, new C27051h().m66724h("title", kuCoinKlineFragment.getString(R$string.kc_kline_timecycle_title)).m66717a());
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m61956w4(KuCoinKlineFragment kuCoinKlineFragment, RadioGroup radioGroup, int i11) {
        int i12;
        kuCoinKlineFragment.m61935l4().m96331y();
        C37878b0 c37878b0 = C37878b0.f85252a;
        if (i11 == R$id.tv_kline_ma) {
            i12 = 0;
        } else if (i11 == R$id.tv_kline_ema) {
            i12 = 1;
        } else if (i11 == R$id.tv_kline_boll) {
            i12 = 2;
        } else {
            i12 = -1;
        }
        c37878b0.m85540u(i12);
        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o4 = kuCoinKlineFragment.m61964o4();
        if (spotFlutterKlineFragmentM61964o4 != null) {
            spotFlutterKlineFragmentM61964o4.m62026t3(c37878b0.m85525f());
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m61958x4(KuCoinKlineFragment kuCoinKlineFragment, RadioGroup radioGroup, int i11) {
        int i12;
        kuCoinKlineFragment.m61935l4().m96331y();
        C37878b0 c37878b0 = C37878b0.f85252a;
        if (i11 == R$id.tv_kline_macd) {
            i12 = 0;
        } else if (i11 == R$id.tv_kline_kdj) {
            i12 = 1;
        } else if (i11 == R$id.tv_kline_rsi) {
            i12 = 2;
        } else {
            i12 = -1;
        }
        c37878b0.m85541v(i12);
        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o4 = kuCoinKlineFragment.m61964o4();
        if (spotFlutterKlineFragmentM61964o4 != null) {
            spotFlutterKlineFragmentM61964o4.m62027u3(c37878b0.m85526g());
        }
        kuCoinKlineFragment.m61914S4(c37878b0.m85526g());
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m61960y4(KuCoinKlineFragment kuCoinKlineFragment, BaseViewHolder baseViewHolder, View view) {
        kuCoinKlineFragment.m61935l4().m96331y();
        ((RadioGroup) baseViewHolder.getView(R$id.rb_main)).clearCheck();
        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o4 = kuCoinKlineFragment.m61964o4();
        if (spotFlutterKlineFragmentM61964o4 != null) {
            spotFlutterKlineFragmentM61964o4.m62030x3(true);
        }
        C37878b0.f85252a.m85540u(-1);
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m61962z4(KuCoinKlineFragment kuCoinKlineFragment, BaseViewHolder baseViewHolder, View view) {
        kuCoinKlineFragment.m61935l4().m96331y();
        ((RadioGroup) baseViewHolder.getView(R$id.rb_no_main)).clearCheck();
        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o4 = kuCoinKlineFragment.m61964o4();
        if (spotFlutterKlineFragmentM61964o4 != null) {
            spotFlutterKlineFragmentM61964o4.m62030x3(false);
        }
        C37878b0 c37878b0 = C37878b0.f85252a;
        c37878b0.m85541v(-1);
        kuCoinKlineFragment.m61914S4(c37878b0.m85526g());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        if (this.f50624Z.isInitialized() && m61933k4().m96299I()) {
            m61933k4().m96331y();
        }
        if (this.f50625a0.isInitialized() && m61935l4().m96299I()) {
            m61935l4().m96331y();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TracePageHelper.m42470e("open_k_spot", "load_k_spot", "加载：现货k线");
        C43852m.m96594f("B5candle", "klineZone", "1", TuplesKt.m90091to("symbol", m61944q4()), TuplesKt.m90091to("yesOrNo", Boolean.TRUE));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C253571(null));
        this.f50620V.onNext(6);
        if (m61937m4() != -1) {
            ((RadioButton) m61935l4().m96292A().findViewById(m61937m4())).setChecked(true);
        } else {
            ((TextView) m61935l4().m96292A().findViewById(R$id.tv_hide_main)).performClick();
        }
        if (m61942p4() != -1) {
            ((RadioButton) m61935l4().m96292A().findViewById(m61942p4())).setChecked(true);
        } else {
            ((TextView) m61935l4().m96292A().findViewById(R$id.tv_hide_no_main)).performClick();
        }
        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o4 = m61964o4();
        if (spotFlutterKlineFragmentM61964o4 != null) {
            SpotFlutterKlineFragment.m62021z3(spotFlutterKlineFragmentM61964o4, null, 1, null);
        }
    }
}
