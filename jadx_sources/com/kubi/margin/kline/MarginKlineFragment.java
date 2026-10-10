package com.kubi.margin.kline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5286o;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$font;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.exception.MarginException;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.entity.OtcAd;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.FragmentResultListener;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
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
import com.kubi.utils.extensions.C27039d;
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
import p206dp.C36941u;
import p569qq.C43846g;
import p569qq.C43852m;
import p569qq.InterfaceC43850k;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import qe0.C43724b;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginKlineFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\fH\u0014J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0017J\b\u00104\u001a\u00020/H\u0002J\b\u00105\u001a\u00020/H\u0002J\b\u00106\u001a\u00020/H\u0002J\u0010\u00107\u001a\u00020/2\u0006\u00108\u001a\u000201H\u0002J\u0010\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020\fH\u0002J\u0010\u0010;\u001a\u00020/2\u0006\u00108\u001a\u000201H\u0002J\b\u0010<\u001a\u00020/H\u0016J\u0010\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020\fH\u0002J\b\u0010?\u001a\u00020\fH\u0002J\b\u0010@\u001a\u00020\fH\u0002J \u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020-H\u0002J\b\u0010G\u001a\u00020\fH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\n \r*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \r*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0018R#\u0010\u001d\u001a\n \r*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, m90084d2 = {"Lcom/kubi/margin/kline/MarginKlineFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "bmarginFragmentKlineMainBinding", "Lcom/kubi/margin/databinding/BmarginFragmentKlineMainBinding;", "getBmarginFragmentKlineMainBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentKlineMainBinding;", "bmarginFragmentKlineMainBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "filterSub", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "getLayout", "newInstance", "Lcom/kubi/margin/kline/MarginFlutterKlineFragment;", "getNewInstance", "()Lcom/kubi/margin/kline/MarginFlutterKlineFragment;", "newInstance$delegate", "Lkotlin/Lazy;", "mMinutePopup", "Lcom/zyyoona7/popup/EasyPopup;", "getMMinutePopup", "()Lcom/zyyoona7/popup/EasyPopup;", "mMinutePopup$delegate", "mQuotaPopup", "getMQuotaPopup", "mQuotaPopup$delegate", "api", "Lcom/kubi/tradebase/api/KlineApi;", "getApi", "()Lcom/kubi/tradebase/api/KlineApi;", "api$delegate", "klineSettingConfig", "Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "containerHeight", "timeCycle", "", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;", "kLineTimeCycleAdapter", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeCycleAdapter;", "kLineTimeAdapter", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeAdapter;", "isCheckMore", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "fetchKlineConfig", "updateOrdersVisible", "configDialogResultListener", "initQuotaView", "contentView", "updateFullScreenMargin", "currentNoMainChart", "initMinuteView", "onResume", "getKlinePosition", "i", "getMainIdByPosition", "getNoMainIdByPosition", "setColorAndIcon", "textView", "Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "isClick", "getMoreColor", "IKlineFragmentProvider", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginKlineFragment.kt\ncom/kubi/margin/kline/MarginKlineFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MarginIssue.kt\ncom/kubi/margin/exception/MarginIssueKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,575:1\n147#2,16:576\n1#3:592\n44#4,2:593\n44#4,2:595\n160#5,4:597\n*S KotlinDebug\n*F\n+ 1 MarginKlineFragment.kt\ncom/kubi/margin/kline/MarginKlineFragment\n*L\n81#1:576,16\n134#1:593,2\n152#1:595,2\n291#1:597,4\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_k_lever")
public final class MarginKlineFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f33103g0 = {Reflection.property1(new PropertyReference1Impl(MarginKlineFragment.class, "bmarginFragmentKlineMainBinding", "getBmarginFragmentKlineMainBinding()Lcom/kubi/margin/databinding/BmarginFragmentKlineMainBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33104U = C45681e.m100799e(this, new Function1<MarginKlineFragment, C36941u>() { // from class: com.kubi.margin.kline.MarginKlineFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36941u invoke(@NotNull MarginKlineFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36941u.m82751a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36941u, Unit>() { // from class: com.kubi.margin.kline.MarginKlineFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36941u it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36941u c36941u) {
            invoke(c36941u);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final BehaviorSubject<Integer> f33105V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33106W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f33107X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33108Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f33109Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public KLineSettingConfig f33110a0;

    /* JADX INFO: renamed from: b0 */
    public int f33111b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public List<KLineTimeEntity> f33112c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public KLineTimeCycleAdapter f33113d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public KLineTimeAdapter f33114e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f33115f0;

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginKlineFragment$a */
    /* JADX INFO: compiled from: MarginKlineFragment.kt */
    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/kline/MarginKlineFragment$IKlineFragmentProvider;", "", "getTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getPrecision", "", "isIndex", "", "marginTradeType", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC17697a {
        @NotNull
        /* JADX INFO: renamed from: D0 */
        TradeItemBean mo38428D0();

        /* JADX INFO: renamed from: M1 */
        boolean mo38435M1();

        int getPrecision();

        /* JADX INFO: renamed from: z1 */
        default int mo38603z1() {
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginKlineFragment$b */
    /* JADX INFO: compiled from: MarginKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/kline/MarginKlineFragment$configDialogResultListener$2", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17698b implements FragmentResultListener {
        public C17698b() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            C44128b.m97266j(MarginKlineFragment.this.getTAG(), "kline config update result:" + result);
            final KLineSettingConfig kLineSettingConfig = (KLineSettingConfig) result.getParcelable("result_config_update");
            if (kLineSettingConfig != null && IUserService.a.get().c()) {
                Observable<R> observableCompose = MarginKlineFragment.this.m38645c4().m86698a(new KlineConfig("order_config", C27029c.m66606i(new OrderConfigValue(Boolean.valueOf(kLineSettingConfig.getShowHistoryOrder()), Boolean.valueOf(kLineSettingConfig.getShowActiveOrder()))), null, null, 12, null)).compose(C24217a1.m58389m());
                final MarginKlineFragment marginKlineFragment = MarginKlineFragment.this;
                Consumer consumer = new Consumer() { // from class: com.kubi.margin.kline.q1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        MarginKlineFragment.C17698b.m38689e(marginKlineFragment, kLineSettingConfig, obj);
                    }
                };
                final Function1 function1 = new Function1() { // from class: com.kubi.margin.kline.r1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginKlineFragment.C17698b.m38690f((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.kline.s1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        MarginKlineFragment.C17698b.m38691g(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, MarginKlineFragment.this.getDestroyDisposable());
            }
        }

        /* JADX INFO: renamed from: e */
        public static final void m38689e(MarginKlineFragment marginKlineFragment, KLineSettingConfig kLineSettingConfig, Object obj) {
            marginKlineFragment.f33110a0 = kLineSettingConfig;
            marginKlineFragment.m38629L4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m38690f(Throwable th2) {
            Intrinsics.checkNotNull(th2);
            C19331c.m42836c(th2, null, 2, null);
            C44128b.m97264h(th2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final void m38691g(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginKlineFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C17699c extends TypeToken<OrderConfigValue> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginKlineFragment$onResume$1 */
    /* JADX INFO: compiled from: MarginKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.kline.MarginKlineFragment$onResume$1", m90122f = "MarginKlineFragment.kt", m90123i = {}, m90124l = {453}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nMarginKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginKlineFragment.kt\ncom/kubi/margin/kline/MarginKlineFragment$onResume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,575:1\n295#2,2:576\n*S KotlinDebug\n*F\n+ 1 MarginKlineFragment.kt\ncom/kubi/margin/kline/MarginKlineFragment$onResume$1\n*L\n457#1:576,2\n*E\n"})
    public static final class C177011 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C177011(Continuation<? super C177011> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginKlineFragment.this.new C177011(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C177011) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MarginKlineFragment marginKlineFragment;
            Integer numBoxInt;
            Object next;
            BaseTextView baseTextView;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    marginKlineFragment = (MarginKlineFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                MarginKlineFragment marginKlineFragment2 = MarginKlineFragment.this;
                KLineSettingsManager kLineSettingsManager = KLineSettingsManager.f51515a;
                this.L$0 = marginKlineFragment2;
                this.label = 1;
                Object objM63124i = kLineSettingsManager.m63124i(this);
                if (objM63124i == coroutine_suspended) {
                    return coroutine_suspended;
                }
                marginKlineFragment = marginKlineFragment2;
                obj = objM63124i;
            }
            MarginKlineFragment marginKlineFragment3 = MarginKlineFragment.this;
            List<KLineTimeEntity> list = (List) obj;
            KLineTimeAdapter kLineTimeAdapter = marginKlineFragment3.f33114e0;
            if (kLineTimeAdapter != null) {
                kLineTimeAdapter.replaceData(list);
            }
            if (marginKlineFragment3.f33115f0) {
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
                C36941u c36941uM38684d4 = marginKlineFragment3.m38684d4();
                if (c36941uM38684d4 != null && (baseTextView = c36941uM38684d4.f81995l) != null) {
                    baseTextView.setText(KLineSettingsManager.f51515a.m63120e(numBoxInt));
                }
            }
            marginKlineFragment3.f33105V.onNext(Boxing.boxInt(6));
            marginKlineFragment.f33112c0 = list;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m38641Y3(MarginKlineFragment marginKlineFragment, ArrayList arrayList) {
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
                    objM66914d = C27099x.m66914d(pri_data_value, new C17699c().getType());
                } catch (Throwable unused) {
                    objM66914d = null;
                }
                OrderConfigValue orderConfigValue = (OrderConfigValue) objM66914d;
                kLineSettingConfig = new KLineSettingConfig(C27025c.m66567e(orderConfigValue != null ? orderConfigValue.getHistory() : null, true), C27025c.m66567e(orderConfigValue != null ? orderConfigValue.getActive() : null, true));
            }
        } else {
            kLineSettingConfig = new KLineSettingConfig(false, false, 3, null);
        }
        marginKlineFragment.f33110a0 = kLineSettingConfig;
        marginKlineFragment.m38629L4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m38611C4(MarginKlineFragment marginKlineFragment) {
        C43852m.m96591c("B5candle", "klineSet", null, null, 12, null);
        KlineSettingsNewDialog klineSettingsNewDialogNewInstance = KlineSettingsNewDialog.f51522v0.newInstance(marginKlineFragment.f33110a0);
        FragmentManager childFragmentManager = marginKlineFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        klineSettingsNewDialogNewInstance.show(childFragmentManager, "kline_settings");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m38613D4(MarginKlineFragment marginKlineFragment) {
        C43852m.m96591c("B4candle", "fullScreen", null, null, 12, null);
        Intent intent = new Intent(marginKlineFragment.mContext, (Class<?>) MarginFlutterKlineLandscapeActivity.class);
        KeyEventDispatcher.Component activity = marginKlineFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.kubi.margin.kline.MarginKlineFragment.IKlineFragmentProvider");
        Intent intentPutExtra = intent.putExtra("data_1", ((InterfaceC17697a) activity).mo38435M1());
        KeyEventDispatcher.Component activity2 = marginKlineFragment.getActivity();
        Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.kubi.margin.kline.MarginKlineFragment.IKlineFragmentProvider");
        Intent intentPutExtra2 = intentPutExtra.putExtra("data", ((InterfaceC17697a) activity2).mo38428D0());
        KeyEventDispatcher.Component activity3 = marginKlineFragment.getActivity();
        Intrinsics.checkNotNull(activity3, "null cannot be cast to non-null type com.kubi.margin.kline.MarginKlineFragment.IKlineFragmentProvider");
        marginKlineFragment.startActivity(intentPutExtra2.putExtra("tradeType", ((InterfaceC17697a) activity3).mo38603z1()).putExtra("data_4", marginKlineFragment.f33110a0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m38623I4(MarginKlineFragment marginKlineFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<KLineTimeEntity> data;
        KLineTimeEntity kLineTimeEntity;
        KLineTimeAdapter kLineTimeAdapter = marginKlineFragment.f33114e0;
        if (kLineTimeAdapter == null || (data = kLineTimeAdapter.getData()) == null || (kLineTimeEntity = data.get(i11)) == null) {
            return;
        }
        C37878b0.f85252a.m85538s(kLineTimeEntity.getTag());
        marginKlineFragment.f33105V.onNext(Integer.valueOf(kLineTimeEntity.getTag()));
    }

    /* JADX INFO: renamed from: K4 */
    private final void m38627K4(int i11) {
        double d11;
        double d12;
        ImageView imageView;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            d11 = this.f33111b0;
            d12 = 0.65d;
        } else {
            d11 = this.f33111b0;
            d12 = 0.8d;
        }
        int iM66603f = (((int) (d11 * d12)) - C27029c.m66603f(this, 20)) - C27029c.m66603f(this, 24);
        C36941u c36941uM38684d4 = m38684d4();
        if (c36941uM38684d4 == null || (imageView = c36941uM38684d4.f81986c) == null) {
            return;
        }
        ViewExtKt.m66585p(imageView, 0, iM66603f, 0, 0, 13, null);
    }

    /* JADX INFO: renamed from: W3 */
    private final void m38640W3() {
        setFragmentResultListener("result_draw_tools", new FragmentResultListener() { // from class: com.kubi.margin.kline.MarginKlineFragment$configDialogResultListener$1
            @Override // com.kubi.sdk.FragmentResultListener
            /* JADX INFO: renamed from: a */
            public void mo26171a(Bundle result) {
                Intrinsics.checkNotNullParameter(result, "result");
                C44128b.m97266j(this.f33117a.getTAG(), "draw tools result:" + result);
                LifecycleOwnerKt.getLifecycleScope(this.f33117a).launchWhenStarted(new C17700x316ae6f2(this.f33117a, null));
            }
        });
        setFragmentResultListener("result_config_update", new C17698b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public final InterfaceC38437b m38645c4() {
        return (InterfaceC38437b) this.f33109Z.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    private final C43724b m38647f4() {
        return (C43724b) this.f33107X.getValue();
    }

    /* JADX INFO: renamed from: g4 */
    private final C43724b m38648g4() {
        return (C43724b) this.f33108Y.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    private final int m38649h4() {
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

    /* JADX INFO: renamed from: k4 */
    private final int m38652k4() {
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

    /* JADX INFO: renamed from: l4 */
    private final void m38654l4(View view) {
        BaseViewHolder baseViewHolder = new BaseViewHolder(view);
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 5));
        KLineTimeCycleAdapter kLineTimeCycleAdapter = new KLineTimeCycleAdapter();
        this.f33113d0 = kLineTimeCycleAdapter;
        kLineTimeCycleAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.margin.kline.f1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) throws JSONException {
                MarginKlineFragment.m38656m4(this.f33137a, baseQuickAdapter, view2, i11);
            }
        });
        recyclerView.setAdapter(kLineTimeCycleAdapter);
        baseViewHolder.setOnClickListener(R$id.maskView, new View.OnClickListener() { // from class: com.kubi.margin.kline.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginKlineFragment.m38658n4(this.f33140b, view2);
            }
        }).setOnClickListener(R$id.llTimeSet, new View.OnClickListener() { // from class: com.kubi.margin.kline.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginKlineFragment.m38660o4(this.f33143b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    private final void m38662p4(View view) {
        final BaseViewHolder baseViewHolder = new BaseViewHolder(view);
        ((RadioGroup) baseViewHolder.getView(R$id.rb_main)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.margin.kline.z0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                MarginKlineFragment.m38664q4(this.f33181b, radioGroup, i11);
            }
        });
        ((RadioGroup) baseViewHolder.getView(R$id.rb_no_main)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.margin.kline.b1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                MarginKlineFragment.m38666r4(this.f33125b, radioGroup, i11);
            }
        });
        baseViewHolder.setOnClickListener(R$id.tv_hide_main, new View.OnClickListener() { // from class: com.kubi.margin.kline.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginKlineFragment.m38668s4(this.f33128b, baseViewHolder, view2);
            }
        });
        baseViewHolder.setOnClickListener(R$id.tv_hide_no_main, new View.OnClickListener() { // from class: com.kubi.margin.kline.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginKlineFragment.m38670t4(this.f33132b, baseViewHolder, view2);
            }
        });
        baseViewHolder.setOnClickListener(R$id.maskView, new View.OnClickListener() { // from class: com.kubi.margin.kline.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginKlineFragment.m38672u4(this.f33134b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m38676w4(MarginKlineFragment marginKlineFragment) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C36941u c36941uM38684d4 = marginKlineFragment.m38684d4();
            Intrinsics.checkNotNull(c36941uM38684d4);
            BaseTextView tvTabTime = c36941uM38684d4.f81995l;
            Intrinsics.checkNotNullExpressionValue(tvTabTime, "tvTabTime");
            C36941u c36941uM38684d5 = marginKlineFragment.m38684d4();
            Intrinsics.checkNotNull(c36941uM38684d5);
            ImageView ivTabTime = c36941uM38684d5.f81989f;
            Intrinsics.checkNotNullExpressionValue(ivTabTime, "ivTabTime");
            marginKlineFragment.m38625J4(tvTabTime, ivTabTime, false);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new MarginException(thM103847exceptionOrNullimpl, "MarginKlineFragment---OnDismissListener", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m38680y4(MarginKlineFragment marginKlineFragment) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C36941u c36941uM38684d4 = marginKlineFragment.m38684d4();
            Intrinsics.checkNotNull(c36941uM38684d4);
            BaseTextView tvTabQuota = c36941uM38684d4.f81994k;
            Intrinsics.checkNotNullExpressionValue(tvTabQuota, "tvTabQuota");
            C36941u c36941uM38684d5 = marginKlineFragment.m38684d4();
            Intrinsics.checkNotNull(c36941uM38684d5);
            ImageView ivTabQuota = c36941uM38684d5.f81988e;
            Intrinsics.checkNotNullExpressionValue(ivTabQuota, "ivTabQuota");
            marginKlineFragment.m38625J4(tvTabQuota, ivTabQuota, false);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new MarginException(thM103847exceptionOrNullimpl, "MarginKlineFragment---OnDismissListener", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m38683X3() {
        if (!IUserService.a.get().c()) {
            this.f33110a0 = new KLineSettingConfig(false, false, 3, null);
            m38629L4();
            return;
        }
        Observable observableCompose = InterfaceC38437b.m86697c(m38645c4(), null, null, 0, 7, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.kline.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginKlineFragment.m38641Y3(this.f33174b, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.kline.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginKlineFragment.m38642Z3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.kline.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginKlineFragment.m38643a4((Throwable) obj);
            }
        };
        addSubscription(observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.kline.x0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginKlineFragment.m38644b4(function2, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final C36941u m38684d4() {
        return (C36941u) this.f33104U.getValue(this, f33103g0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_kline_main;
    }

    /* JADX INFO: renamed from: j4 */
    public final MarginFlutterKlineFragment m38685j4() {
        return (MarginFlutterKlineFragment) this.f33106W.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCLongMethodCheck", "KCCyclomaticComplexityCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36941u c36941uM38684d4 = m38684d4();
        if (c36941uM38684d4 != null) {
            C5286o.m6317a(getChildFragmentManager(), m38685j4(), R$id.fl_container);
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
                C43852m.m96593e("B4candle", "kline", "1", jSONObject);
            }
            this.f33111b0 = iCoerceAtLeast;
            c36941uM38684d4.f81985b.getLayoutParams().height = this.f33111b0;
            C5286o.m6329m(m38685j4());
            LinearLayoutCompat llTabQuota = c36941uM38684d4.f81991h;
            Intrinsics.checkNotNullExpressionValue(llTabQuota, "llTabQuota");
            C27046k.m66711z(llTabQuota, 0L, new Function0() { // from class: com.kubi.margin.kline.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginKlineFragment.m38607A4(this.f33161b, c36941uM38684d4);
                }
            }, 1, null);
            LinearLayoutCompat llTabTime = c36941uM38684d4.f81992i;
            Intrinsics.checkNotNullExpressionValue(llTabTime, "llTabTime");
            C27046k.m66711z(llTabTime, 0L, new Function0() { // from class: com.kubi.margin.kline.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginKlineFragment.m38609B4(this.f33121b, c36941uM38684d4);
                }
            }, 1, null);
            ImageView ivKlineSettings = c36941uM38684d4.f81987d;
            Intrinsics.checkNotNullExpressionValue(ivKlineSettings, "ivKlineSettings");
            C27046k.m66711z(ivKlineSettings, 0L, new Function0() { // from class: com.kubi.margin.kline.i1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginKlineFragment.m38611C4(this.f33144b);
                }
            }, 1, null);
            m38640W3();
            ImageView imageView = c36941uM38684d4.f81986c;
            m38627K4(C37878b0.f85252a.m85526g());
            Intrinsics.checkNotNull(imageView);
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.margin.kline.j1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginKlineFragment.m38613D4(this.f33147b);
                }
            }, 1, null);
            Observable<Integer> observableObserveOn = this.f33105V.debounce(200L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.kline.k1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginKlineFragment.m38615E4(this.f33150b, (Integer) obj);
                }
            };
            Consumer<? super Integer> consumer = new Consumer() { // from class: com.kubi.margin.kline.l1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginKlineFragment.m38617F4(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.kline.m1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginKlineFragment.m38619G4((Throwable) obj);
                }
            };
            addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.kline.n1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginKlineFragment.m38621H4(function2, obj);
                }
            }));
            m38683X3();
            RecyclerView recyclerView = c36941uM38684d4.f81993j;
            Context context = getContext();
            recyclerView.setLayoutManager(context != null ? new KLineLayoutManager(context) : null);
            KLineTimeAdapter kLineTimeAdapter = new KLineTimeAdapter();
            this.f33114e0 = kLineTimeAdapter;
            RecyclerView recyclerView2 = c36941uM38684d4.f81993j;
            kLineTimeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.margin.kline.o1
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    MarginKlineFragment.m38623I4(this.f33159a, baseQuickAdapter, view2, i11);
                }
            });
            recyclerView2.setAdapter(kLineTimeAdapter);
        }
    }

    public MarginKlineFragment() {
        BehaviorSubject<Integer> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f33105V = behaviorSubjectCreate;
        this.f33106W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.p1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginKlineFragment.m38682z4(this.f33163b);
            }
        });
        this.f33107X = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginKlineFragment.m38674v4(this.f33165b);
            }
        });
        this.f33108Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginKlineFragment.m38678x4(this.f33169b);
            }
        });
        this.f33109Z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginKlineFragment.m38639V3();
            }
        });
        this.f33110a0 = new KLineSettingConfig(false, true, 1, null);
        this.f33115f0 = true;
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m38607A4(MarginKlineFragment marginKlineFragment, C36941u c36941u) {
        if (!marginKlineFragment.m38648g4().m96299I()) {
            BaseTextView tvTabQuota = c36941u.f81994k;
            Intrinsics.checkNotNullExpressionValue(tvTabQuota, "tvTabQuota");
            ImageView ivTabQuota = c36941u.f81988e;
            Intrinsics.checkNotNullExpressionValue(ivTabQuota, "ivTabQuota");
            marginKlineFragment.m38625J4(tvTabQuota, ivTabQuota, true);
            marginKlineFragment.m38648g4().mo54253b0(c36941u.f81990g);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m38609B4(MarginKlineFragment marginKlineFragment, C36941u c36941u) {
        if (!marginKlineFragment.m38647f4().m96299I()) {
            List<KLineTimeEntity> list = marginKlineFragment.f33112c0;
            if (list != null) {
                List<KLineTimeEntity> listM63123h = KLineSettingsManager.f51515a.m63123h(list);
                KLineTimeCycleAdapter kLineTimeCycleAdapter = marginKlineFragment.f33113d0;
                if (kLineTimeCycleAdapter != null) {
                    kLineTimeCycleAdapter.replaceData(listM63123h);
                }
            }
            BaseTextView tvTabTime = c36941u.f81995l;
            Intrinsics.checkNotNullExpressionValue(tvTabTime, "tvTabTime");
            ImageView ivTabTime = c36941u.f81989f;
            Intrinsics.checkNotNullExpressionValue(ivTabTime, "ivTabTime");
            marginKlineFragment.m38625J4(tvTabTime, ivTabTime, true);
            marginKlineFragment.m38647f4().mo54253b0(c36941u.f81990g);
            if (marginKlineFragment.f33115f0) {
                marginKlineFragment.f33115f0 = false;
                marginKlineFragment.f33105V.onNext(-1);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m38615E4(MarginKlineFragment marginKlineFragment, Integer num) {
        Intrinsics.checkNotNull(num);
        marginKlineFragment.m38646e4(num.intValue());
        marginKlineFragment.m38685j4().m38497v3(C37878b0.f85252a.m85523d());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m38617F4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m38619G4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m38621H4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J4 */
    private final void m38625J4(TextView textView, ImageView imageView, boolean z11) {
        int color;
        Context context = getContext();
        if (context != null) {
            if (z11) {
                imageView.setImageResource(R$drawable.ic2_triangle_top_12);
                int i11 = R$color.c_text;
                C27046k.m66701p(imageView, getColorRes(i11));
                textView.setTypeface(ResourcesCompat.getFont(this.mContext, R$font.medium));
                color = ContextCompat.getColor(context, i11);
            } else {
                imageView.setImageResource(R$drawable.ic2_triangle_bottom_12);
                int i12 = R$color.c_text40;
                C27046k.m66701p(imageView, getColorRes(i12));
                textView.setTypeface(ResourcesCompat.getFont(this.mContext, R$font.regular));
                if (textView.getId() == R$id.tvTabTime) {
                    color = m38650i4();
                } else {
                    color = ContextCompat.getColor(context, i12);
                }
            }
            textView.setTextColor(color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public final void m38629L4() {
        m38685j4().m38494s3(this.f33110a0.getShowHistoryOrder());
        m38685j4().m38492q3(this.f33110a0.getShowActiveOrder());
    }

    /* JADX INFO: renamed from: V3 */
    public static final InterfaceC38437b m38639V3() {
        return (InterfaceC38437b) C42597a.m93386b().create(InterfaceC38437b.class);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m38642Z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m38643a4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m38644b4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    private final void m38646e4(int i11) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new MarginKlineFragment$getKlinePosition$1(this, i11, null));
    }

    /* JADX INFO: renamed from: i4 */
    private final int m38650i4() {
        CharSequence text;
        BaseTextView baseTextView;
        C36941u c36941uM38684d4 = m38684d4();
        if (c36941uM38684d4 != null && (baseTextView = c36941uM38684d4.f81995l) != null) {
            text = baseTextView.getText();
        } else {
            text = null;
        }
        if (!Intrinsics.areEqual(text, getString(R$string.more))) {
            return getColorRes(R$color.c_text);
        }
        return getColorRes(R$color.c_text40);
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m38656m4(MarginKlineFragment marginKlineFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        List<KLineTimeEntity> data;
        KLineTimeEntity kLineTimeEntity;
        marginKlineFragment.m38647f4().m96331y();
        KLineTimeCycleAdapter kLineTimeCycleAdapter = marginKlineFragment.f33113d0;
        if (kLineTimeCycleAdapter != null && (data = kLineTimeCycleAdapter.getData()) != null && (kLineTimeEntity = data.get(i11)) != null) {
            C37878b0.f85252a.m85538s(kLineTimeEntity.getTag());
            KlineTrack.f51542a.m63176b(kLineTimeEntity.getTag(), "lever");
            marginKlineFragment.f33105V.onNext(Integer.valueOf(kLineTimeEntity.getTag()));
        }
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m38658n4(MarginKlineFragment marginKlineFragment, View view) {
        marginKlineFragment.m38647f4().m96331y();
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m38660o4(MarginKlineFragment marginKlineFragment, View view) {
        marginKlineFragment.m38647f4().m96331y();
        Context context = marginKlineFragment.getContext();
        if (context != null) {
            marginKlineFragment.f33115f0 = true;
            BaseActivity.INSTANCE.launch(context, KLineTimeSetFragment.class, new C27051h().m66724h("title", marginKlineFragment.getString(R$string.kc_kline_timecycle_title)).m66717a());
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m38664q4(MarginKlineFragment marginKlineFragment, RadioGroup radioGroup, int i11) {
        int i12;
        marginKlineFragment.m38648g4().m96331y();
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
        marginKlineFragment.m38685j4().m38495t3(c37878b0.m85525f());
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m38666r4(MarginKlineFragment marginKlineFragment, RadioGroup radioGroup, int i11) {
        int i12;
        marginKlineFragment.m38648g4().m96331y();
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
        marginKlineFragment.m38685j4().m38496u3(c37878b0.m85526g());
        marginKlineFragment.m38627K4(c37878b0.m85526g());
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m38668s4(MarginKlineFragment marginKlineFragment, BaseViewHolder baseViewHolder, View view) {
        marginKlineFragment.m38648g4().m96331y();
        ((RadioGroup) baseViewHolder.getView(R$id.rb_main)).clearCheck();
        marginKlineFragment.m38685j4().m38499x3(true);
        C37878b0.f85252a.m85540u(-1);
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m38670t4(MarginKlineFragment marginKlineFragment, BaseViewHolder baseViewHolder, View view) {
        marginKlineFragment.m38648g4().m96331y();
        ((RadioGroup) baseViewHolder.getView(R$id.rb_no_main)).clearCheck();
        marginKlineFragment.m38685j4().m38499x3(false);
        C37878b0 c37878b0 = C37878b0.f85252a;
        c37878b0.m85541v(-1);
        marginKlineFragment.m38627K4(c37878b0.m85526g());
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m38672u4(MarginKlineFragment marginKlineFragment, View view) {
        marginKlineFragment.m38648g4().m96331y();
    }

    /* JADX INFO: renamed from: v4 */
    public static final C43724b m38674v4(final MarginKlineFragment marginKlineFragment) {
        C43724b c43724bM96322p = C43724b.m96333g0().m96308R(marginKlineFragment.mContext, R$layout.btradebase_popup_kline_time).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.margin.kline.t0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                MarginKlineFragment.m38676w4(this.f33172b);
            }
        }).m96316Z(true).m96322p();
        View viewM96292A = c43724bM96322p.m96292A();
        Intrinsics.checkNotNullExpressionValue(viewM96292A, "getContentView(...)");
        marginKlineFragment.m38654l4(viewM96292A);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: x4 */
    public static final C43724b m38678x4(final MarginKlineFragment marginKlineFragment) {
        C43724b c43724bM96322p = C43724b.m96333g0().m96308R(marginKlineFragment.getActivity(), R$layout.bmargin_popup_kline_quota).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.margin.kline.y0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                MarginKlineFragment.m38680y4(this.f33179b);
            }
        }).m96316Z(true).m96322p();
        View viewM96292A = c43724bM96322p.m96292A();
        Intrinsics.checkNotNullExpressionValue(viewM96292A, "getContentView(...)");
        marginKlineFragment.m38662p4(viewM96292A);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: z4 */
    public static final MarginFlutterKlineFragment m38682z4(MarginKlineFragment marginKlineFragment) {
        InterfaceC17697a interfaceC17697a;
        String symbol;
        Integer numValueOf;
        Boolean boolValueOf;
        TradeItemBean tradeItemBeanMo38428D0;
        KeyEventDispatcher.Component activity = marginKlineFragment.getActivity();
        Integer numValueOf2 = null;
        if (activity instanceof InterfaceC17697a) {
            interfaceC17697a = (InterfaceC17697a) activity;
        } else {
            interfaceC17697a = null;
        }
        if (interfaceC17697a != null && (tradeItemBeanMo38428D0 = interfaceC17697a.mo38428D0()) != null) {
            symbol = tradeItemBeanMo38428D0.getSymbol();
        } else {
            symbol = null;
        }
        if (symbol == null) {
            symbol = "";
        }
        if (interfaceC17697a != null) {
            numValueOf = Integer.valueOf(interfaceC17697a.getPrecision());
        } else {
            numValueOf = null;
        }
        int iM66650j = C27039d.m66650j(numValueOf);
        if (interfaceC17697a != null) {
            boolValueOf = Boolean.valueOf(interfaceC17697a.mo38435M1());
        } else {
            boolValueOf = null;
        }
        boolean zM66566d = C27025c.m66566d(boolValueOf);
        if (interfaceC17697a != null) {
            numValueOf2 = Integer.valueOf(interfaceC17697a.mo38603z1());
        }
        return MarginFlutterKlineFragment.f33086Z.newInstance(symbol, iM66650j, zM66566d, C27039d.m66650j(numValueOf2));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TracePageHelper.m42470e("open_k_lever", "load_k_lever", "加载：杠杆k线");
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C177011(null));
        this.f33105V.onNext(6);
        if (m38649h4() != -1) {
            ((RadioButton) m38648g4().m96292A().findViewById(m38649h4())).setChecked(true);
        } else {
            ((TextView) m38648g4().m96292A().findViewById(R$id.tv_hide_main)).performClick();
        }
        if (m38652k4() != -1) {
            ((RadioButton) m38648g4().m96292A().findViewById(m38652k4())).setChecked(true);
        } else {
            ((TextView) m38648g4().m96292A().findViewById(R$id.tv_hide_no_main)).performClick();
        }
        MarginFlutterKlineFragment.m38491z3(m38685j4(), null, 1, null);
    }
}
