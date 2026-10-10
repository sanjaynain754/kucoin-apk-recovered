package com.kubi.kumex.kline;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5286o;
import com.google.gson.reflect.TypeToken;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
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
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36814o2;
import gf.C37878b0;
import i30.InterfaceC38437b;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
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
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p236em.C37214b;
import p569qq.C43852m;
import p739ww.InterfaceC45937a;
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
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import qe0.C43724b;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: KuMexKlineFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 V2\u00020\u0001:\u0002UVB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00106\u001a\u00020\u0011H\u0014J\u001a\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u000208H\u0002J\b\u0010>\u001a\u000208H\u0002J\b\u0010?\u001a\u000208H\u0002J\b\u0010@\u001a\u000208H\u0002J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020:H\u0002J\u0010\u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020\u0011H\u0002J\u0010\u0010E\u001a\u0002082\u0006\u0010B\u001a\u00020:H\u0002J\b\u0010F\u001a\u000208H\u0016J\u0010\u0010G\u001a\u0002082\u0006\u0010H\u001a\u00020\u0011H\u0002J \u0010I\u001a\u0002082\b\b\u0001\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010L\u001a\u00020\u0011H\u0002J\b\u0010M\u001a\u00020\u0011H\u0002J \u0010N\u001a\u0002082\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u000205H\u0002J\b\u0010T\u001a\u00020\u0011H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b!\u0010\u001eR\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00110\u00110$X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010%\u001a\n \u001c*\u0004\u0018\u00010&0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, m90084d2 = {"Lcom/kubi/kumex/kline/KuMexKlineFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentKlineMainBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentKlineMainBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "precision", "", "getPrecision", "()I", "precision$delegate", "newInstance", "Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;", "getNewInstance", "()Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;", "newInstance$delegate", "mMinutePopup", "Lcom/zyyoona7/popup/EasyPopup;", "kotlin.jvm.PlatformType", "getMMinutePopup", "()Lcom/zyyoona7/popup/EasyPopup;", "mMinutePopup$delegate", "mQuotaPopup", "getMQuotaPopup", "mQuotaPopup$delegate", "filterSub", "Lio/reactivex/subjects/BehaviorSubject;", "api", "Lcom/kubi/tradebase/api/KlineApi;", "getApi", "()Lcom/kubi/tradebase/api/KlineApi;", "api$delegate", "klineSettingConfig", "Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "containerHeight", "timeCycle", "", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeEntity;", "kLineTimeCycleAdapter", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeCycleAdapter;", "kLineTimeAdapter", "Lcom/kubi/tradebase/business/klineSettings/KLineTimeAdapter;", "isCheckMore", "", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configDialogResultListener", "initKLineShowHistoryConfig", "fetchShowHistoryConfig", "updateOrdersVisible", "initQuotaView", "contentView", "updateFullScreenMargin", "currentNoMainChart", "initMinuteView", "onResume", "getKlinePosition", "i", "setPriceType", "priceType", "topic", "getMainIdByPosition", "getNoMainIdByPosition", "setColorAndIcon", "textView", "Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "isClick", "getMoreColor", "CommonTabEntity", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexKlineFragment.kt\ncom/kubi/kumex/kline/KuMexKlineFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,586:1\n147#2,16:587\n1#3:603\n160#4,4:604\n*S KotlinDebug\n*F\n+ 1 KuMexKlineFragment.kt\ncom/kubi/kumex/kline/KuMexKlineFragment\n*L\n82#1:587,16\n310#1:604,4\n*E\n"})
public final class KuMexKlineFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29311U = C45681e.m100799e(this, new Function1<KuMexKlineFragment, C36814o2>() { // from class: com.kubi.kumex.kline.KuMexKlineFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36814o2 invoke(@NotNull KuMexKlineFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36814o2.m82489a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36814o2, Unit>() { // from class: com.kubi.kumex.kline.KuMexKlineFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36814o2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36814o2 c36814o2) {
            invoke(c36814o2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29312V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineFragment.m34150W4(this.f29340b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29313W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(KuMexKlineFragment.m34146T4(this.f29363b));
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f29314X = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineFragment.m34126J4(this.f29386b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29315Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineFragment.m34118F4(this.f29389b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f29316Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineFragment.m34122H4(this.f29391b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final BehaviorSubject<Integer> f29317a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f29318b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public KLineSettingConfig f29319c0;

    /* JADX INFO: renamed from: d0 */
    public int f29320d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public List<KLineTimeEntity> f29321e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public KLineTimeCycleAdapter f29322f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public KLineTimeAdapter f29323g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f29324h0;

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f29310j0 = {Reflection.property1(new PropertyReference1Impl(KuMexKlineFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentKlineMainBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f29309i0 = new Companion(null);

    /* JADX INFO: compiled from: KuMexKlineFragment.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/kline/KuMexKlineFragment$CommonTabEntity;", "Lcom/kubi/resources/widget/flyco/listener/CustomTabEntity;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTabTitle", "getTabSelectedIcon", "", "getTabUnselectedIcon", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CommonTabEntity implements InterfaceC45937a {

        @NotNull
        private final String title;

        @Override // p739ww.InterfaceC45937a
        public int getTabSelectedIcon() {
            return 0;
        }

        @Override // p739ww.InterfaceC45937a
        public int getTabUnselectedIcon() {
            return 0;
        }

        public CommonTabEntity(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        @Override // p739ww.InterfaceC45937a
        @NotNull
        /* JADX INFO: renamed from: getTabTitle, reason: from getter */
        public String getTitle() {
            return this.title;
        }
    }

    /* JADX INFO: compiled from: KuMexKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/kline/KuMexKlineFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/kline/KuMexKlineFragment;", "symbol", "", "precision", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexKlineFragment newInstance(@NotNull String symbol, int precision) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            KuMexKlineFragment kuMexKlineFragment = new KuMexKlineFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putInt("data", precision);
            kuMexKlineFragment.setArguments(bundle);
            return kuMexKlineFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexKlineFragment$a */
    /* JADX INFO: compiled from: KuMexKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/kline/KuMexKlineFragment$configDialogResultListener$2", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16125a implements FragmentResultListener {
        public C16125a() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Intrinsics.checkNotNullParameter(result, "result");
            C44128b.m97266j(KuMexKlineFragment.this.getTAG(), "kline config update result:" + result);
            final KLineSettingConfig kLineSettingConfig = (KLineSettingConfig) result.getParcelable("result_config_update");
            if (kLineSettingConfig != null && IUserService.a.get().c()) {
                Observable<R> observableCompose = KuMexKlineFragment.this.m34189i4().m86698a(new KlineConfig("order_config", C27029c.m66606i(new OrderConfigValue(Boolean.valueOf(kLineSettingConfig.getShowHistoryOrder()), Boolean.valueOf(kLineSettingConfig.getShowActiveOrder()))), null, null, 12, null)).compose(C24217a1.m58389m());
                final KuMexKlineFragment kuMexKlineFragment = KuMexKlineFragment.this;
                Consumer consumer = new Consumer() { // from class: com.kubi.kumex.kline.f0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KuMexKlineFragment.C16125a.m34203e(kuMexKlineFragment, kLineSettingConfig, obj);
                    }
                };
                final Function1 function1 = new Function1() { // from class: com.kubi.kumex.kline.g0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KuMexKlineFragment.C16125a.m34204f((Throwable) obj);
                    }
                };
                Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.kline.h0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KuMexKlineFragment.C16125a.m34205g(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, KuMexKlineFragment.this.getDestroyDisposable());
            }
        }

        /* JADX INFO: renamed from: e */
        public static final void m34203e(KuMexKlineFragment kuMexKlineFragment, KLineSettingConfig kLineSettingConfig, Object obj) {
            kuMexKlineFragment.f29319c0 = kLineSettingConfig;
            kuMexKlineFragment.m34186Y4();
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m34204f(Throwable th2) {
            Intrinsics.checkNotNull(th2);
            C19331c.m42836c(th2, null, 2, null);
            C44128b.m97264h(th2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public static final void m34205g(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexKlineFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16126b extends TypeToken<OrderConfigValue> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexKlineFragment$onResume$1 */
    /* JADX INFO: compiled from: KuMexKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.kline.KuMexKlineFragment$onResume$1", m90122f = "KuMexKlineFragment.kt", m90123i = {}, m90124l = {431}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nKuMexKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexKlineFragment.kt\ncom/kubi/kumex/kline/KuMexKlineFragment$onResume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,586:1\n295#2,2:587\n*S KotlinDebug\n*F\n+ 1 KuMexKlineFragment.kt\ncom/kubi/kumex/kline/KuMexKlineFragment$onResume$1\n*L\n435#1:587,2\n*E\n"})
    public static final class C161281 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C161281(Continuation<? super C161281> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KuMexKlineFragment.this.new C161281(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C161281) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KuMexKlineFragment kuMexKlineFragment;
            Integer numBoxInt;
            Object next;
            BaseTextView baseTextView;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    kuMexKlineFragment = (KuMexKlineFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KuMexKlineFragment kuMexKlineFragment2 = KuMexKlineFragment.this;
                KLineSettingsManager kLineSettingsManager = KLineSettingsManager.f51515a;
                this.L$0 = kuMexKlineFragment2;
                this.label = 1;
                Object objM63124i = kLineSettingsManager.m63124i(this);
                if (objM63124i == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kuMexKlineFragment = kuMexKlineFragment2;
                obj = objM63124i;
            }
            KuMexKlineFragment kuMexKlineFragment3 = KuMexKlineFragment.this;
            List<KLineTimeEntity> list = (List) obj;
            KLineTimeAdapter kLineTimeAdapter = kuMexKlineFragment3.f29323g0;
            if (kLineTimeAdapter != null) {
                kLineTimeAdapter.replaceData(list);
            }
            if (kuMexKlineFragment3.f29324h0) {
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
                C36814o2 c36814o2M34190j4 = kuMexKlineFragment3.m34190j4();
                if (c36814o2M34190j4 != null && (baseTextView = c36814o2M34190j4.f80733l) != null) {
                    baseTextView.setText(KLineSettingsManager.f51515a.m63120e(numBoxInt));
                }
            }
            kuMexKlineFragment3.f29317a0.onNext(Boxing.boxInt(6));
            kuMexKlineFragment.f29321e0 = list;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m34156e4(KuMexKlineFragment kuMexKlineFragment, ArrayList arrayList) {
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
                    objM66914d = C27099x.m66914d(pri_data_value, new C16126b().getType());
                } catch (Throwable unused) {
                    objM66914d = null;
                }
                OrderConfigValue orderConfigValue = (OrderConfigValue) objM66914d;
                kLineSettingConfig = new KLineSettingConfig(C27025c.m66567e(orderConfigValue != null ? orderConfigValue.getHistory() : null, true), C27025c.m66567e(orderConfigValue != null ? orderConfigValue.getActive() : null, true));
            }
        } else {
            kLineSettingConfig = new KLineSettingConfig(false, false, 3, null);
        }
        kuMexKlineFragment.f29319c0 = kLineSettingConfig;
        kuMexKlineFragment.m34186Y4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final KuMexFlutterKlineFragment m34126J4(KuMexKlineFragment kuMexKlineFragment) {
        return KuMexFlutterKlineFragment.f29307Z.newInstance(kuMexKlineFragment.m34169r4(), kuMexKlineFragment.getPrecision());
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m34132M4(KuMexKlineFragment kuMexKlineFragment) {
        C43852m.m96591c("B6FuturesCandle", "klineSet", null, null, 12, null);
        KlineSettingsNewDialog klineSettingsNewDialogNewInstance = KlineSettingsNewDialog.f51522v0.newInstance(kuMexKlineFragment.f29319c0);
        FragmentManager childFragmentManager = kuMexKlineFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        klineSettingsNewDialogNewInstance.show(childFragmentManager, "kline_settings");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m34134N4(KuMexKlineFragment kuMexKlineFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c("B6FuturesCandle", "KlineFullScreen", null, null, 12, null);
        FragmentActivity activity = kuMexKlineFragment.getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) KuMexKlineLandscapeActivity.class);
            intent.putExtra("symbol", kuMexKlineFragment.m34169r4());
            intent.putExtra("data", kuMexKlineFragment.getPrecision());
            intent.putExtra("data_4", kuMexKlineFragment.f29319c0);
            activity.startActivity(intent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m34144S4(KuMexKlineFragment kuMexKlineFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        List<KLineTimeEntity> data;
        KLineTimeEntity kLineTimeEntity;
        KLineTimeAdapter kLineTimeAdapter = kuMexKlineFragment.f29323g0;
        if (kLineTimeAdapter == null || (data = kLineTimeAdapter.getData()) == null || (kLineTimeEntity = data.get(i11)) == null) {
            return;
        }
        C37878b0.f85252a.m85538s(kLineTimeEntity.getTag());
        KlineTrack.f51542a.m63176b(kLineTimeEntity.getTag(), "contract");
        kuMexKlineFragment.f29317a0.onNext(Integer.valueOf(kLineTimeEntity.getTag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPrecision() {
        return ((Number) this.f29313W.getValue()).intValue();
    }

    /* JADX INFO: renamed from: p4 */
    private final KuMexFlutterKlineFragment m34166p4() {
        return (KuMexFlutterKlineFragment) this.f29314X.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public final String m34169r4() {
        return (String) this.f29312V.getValue();
    }

    /* JADX INFO: renamed from: V4 */
    public final void m34184V4(@NotNull String priceType, @NotNull String topic, int i11) {
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Intrinsics.checkNotNullParameter(topic, "topic");
        m34166p4().m34096A3(priceType, topic, i11);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m34185X4(int i11) {
        double d11;
        double d12;
        ImageView imageView;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            d11 = this.f29320d0;
            d12 = 0.65d;
        } else {
            d11 = this.f29320d0;
            d12 = 0.8d;
        }
        int iM66603f = (((int) (d11 * d12)) - C27029c.m66603f(this, 20)) - C27029c.m66603f(this, 24);
        C36814o2 c36814o2M34190j4 = m34190j4();
        if (c36814o2M34190j4 == null || (imageView = c36814o2M34190j4.f80724c) == null) {
            return;
        }
        ViewExtKt.m66585p(imageView, 0, iM66603f, 0, 0, 13, null);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m34187c4() {
        setFragmentResultListener("result_draw_tools", new FragmentResultListener() { // from class: com.kubi.kumex.kline.KuMexKlineFragment$configDialogResultListener$1
            @Override // com.kubi.sdk.FragmentResultListener
            /* JADX INFO: renamed from: a */
            public void mo26171a(Bundle result) {
                Intrinsics.checkNotNullParameter(result, "result");
                C44128b.m97266j(this.f29326a.getTAG(), "draw tools result:" + result);
                LifecycleOwnerKt.getLifecycleScope(this.f29326a).launchWhenStarted(new C16127x7b949ca(this.f29326a, null));
            }
        });
        setFragmentResultListener("result_config_update", new C16125a());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bkumex_fragment_kline_main;
    }

    /* JADX INFO: renamed from: i4 */
    public final InterfaceC38437b m34189i4() {
        return (InterfaceC38437b) this.f29318b0.getValue();
    }

    /* JADX INFO: renamed from: j4 */
    public final C36814o2 m34190j4() {
        return (C36814o2) this.f29311U.getValue(this, f29310j0[0]);
    }

    /* JADX INFO: renamed from: l4 */
    public final C43724b m34192l4() {
        return (C43724b) this.f29315Y.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    public final C43724b m34193m4() {
        return (C43724b) this.f29316Z.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final int m34194n4() {
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

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C5286o.m6317a(getChildFragmentManager(), m34166p4(), R$id.fl_container);
        final C36814o2 c36814o2M34190j4 = m34190j4();
        if (c36814o2M34190j4 == null) {
            return;
        }
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
            C43852m.m96593e("B6FuturesTrade", "kline", "1", jSONObject);
        }
        this.f29320d0 = iCoerceAtLeast;
        c36814o2M34190j4.f80723b.getLayoutParams().height = this.f29320d0;
        C5286o.m6329m(m34166p4());
        LinearLayoutCompat llTabQuota = c36814o2M34190j4.f80729h;
        Intrinsics.checkNotNullExpressionValue(llTabQuota, "llTabQuota");
        C27046k.m66711z(llTabQuota, 0L, new Function0() { // from class: com.kubi.kumex.kline.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexKlineFragment.m34128K4(this.f29342b, c36814o2M34190j4);
            }
        }, 1, null);
        LinearLayoutCompat llTabTime = c36814o2M34190j4.f80730i;
        Intrinsics.checkNotNullExpressionValue(llTabTime, "llTabTime");
        C27046k.m66711z(llTabTime, 0L, new Function0() { // from class: com.kubi.kumex.kline.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexKlineFragment.m34130L4(this.f29346b, c36814o2M34190j4);
            }
        }, 1, null);
        ImageView ivKlineSettings = c36814o2M34190j4.f80725d;
        Intrinsics.checkNotNullExpressionValue(ivKlineSettings, "ivKlineSettings");
        C27046k.m66711z(ivKlineSettings, 0L, new Function0() { // from class: com.kubi.kumex.kline.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexKlineFragment.m34132M4(this.f29349b);
            }
        }, 1, null);
        m34187c4();
        m34185X4(C37878b0.f85252a.m85526g());
        ImageView ivFullScreen = c36814o2M34190j4.f80724c;
        Intrinsics.checkNotNullExpressionValue(ivFullScreen, "ivFullScreen");
        ViewExtKt.m66575f(ivFullScreen, new Function1() { // from class: com.kubi.kumex.kline.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineFragment.m34134N4(this.f29351b, (View) obj);
            }
        });
        Observable<Integer> observableObserveOn = this.f29317a0.debounce(200L, TimeUnit.MILLISECONDS).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.kline.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineFragment.m34136O4(this.f29341b, (Integer) obj);
            }
        };
        Consumer<? super Integer> consumer = new Consumer() { // from class: com.kubi.kumex.kline.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineFragment.m34138P4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.kline.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineFragment.m34140Q4((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.kline.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineFragment.m34142R4(function2, obj);
            }
        }));
        m34197s4();
        RecyclerView recyclerView = c36814o2M34190j4.f80731j;
        Context context = getContext();
        recyclerView.setLayoutManager(context != null ? new KLineLayoutManager(context) : null);
        KLineTimeAdapter kLineTimeAdapter = new KLineTimeAdapter();
        this.f29323g0 = kLineTimeAdapter;
        RecyclerView recyclerView2 = c36814o2M34190j4.f80731j;
        kLineTimeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.kumex.kline.f
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) throws JSONException {
                KuMexKlineFragment.m34144S4(this.f29352a, baseQuickAdapter, view2, i11);
            }
        });
        recyclerView2.setAdapter(kLineTimeAdapter);
    }

    /* JADX INFO: renamed from: q4 */
    public final int m34196q4() {
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

    /* JADX INFO: renamed from: s4 */
    public final void m34197s4() {
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.kline.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineFragment.m34172t4(this.f29358b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableE.subscribe(new Consumer() { // from class: com.kubi.kumex.kline.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineFragment.m34174u4(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        if (IUserService.a.get().c()) {
            m34188d4();
        } else {
            this.f29319c0 = new KLineSettingConfig(false, false, 3, null);
            m34186Y4();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m34198v4(View view) {
        BaseViewHolder baseViewHolder = new BaseViewHolder(view);
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 5));
        KLineTimeCycleAdapter kLineTimeCycleAdapter = new KLineTimeCycleAdapter();
        this.f29322f0 = kLineTimeCycleAdapter;
        kLineTimeCycleAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.kumex.kline.u
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) throws JSONException {
                KuMexKlineFragment.m34177w4(this.f29382a, baseQuickAdapter, view2, i11);
            }
        });
        recyclerView.setAdapter(kLineTimeCycleAdapter);
        baseViewHolder.setOnClickListener(R$id.maskView, new View.OnClickListener() { // from class: com.kubi.kumex.kline.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuMexKlineFragment.m34179x4(this.f29384b, view2);
            }
        }).setOnClickListener(R$id.llTimeSet, new View.OnClickListener() { // from class: com.kubi.kumex.kline.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuMexKlineFragment.m34181y4(this.f29388b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: z4 */
    public final void m34199z4(View view) {
        final BaseViewHolder baseViewHolder = new BaseViewHolder(view);
        ((RadioGroup) baseViewHolder.getView(R$id.rb_main)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.kumex.kline.p
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                KuMexKlineFragment.m34108A4(this.f29370b, radioGroup, i11);
            }
        });
        ((RadioGroup) baseViewHolder.getView(R$id.rb_no_main)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.kumex.kline.q
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                KuMexKlineFragment.m34110B4(this.f29372b, radioGroup, i11);
            }
        });
        baseViewHolder.setOnClickListener(R$id.tv_hide_main, new View.OnClickListener() { // from class: com.kubi.kumex.kline.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuMexKlineFragment.m34112C4(this.f29374b, baseViewHolder, view2);
            }
        });
        baseViewHolder.setOnClickListener(R$id.tv_hide_no_main, new View.OnClickListener() { // from class: com.kubi.kumex.kline.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuMexKlineFragment.m34114D4(this.f29377b, baseViewHolder, view2);
            }
        });
        baseViewHolder.setOnClickListener(R$id.maskView, new View.OnClickListener() { // from class: com.kubi.kumex.kline.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KuMexKlineFragment.m34116E4(this.f29380b, view2);
            }
        });
    }

    public KuMexKlineFragment() {
        BehaviorSubject<Integer> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f29317a0 = behaviorSubjectCreate;
        this.f29318b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexKlineFragment.m34155b4();
            }
        });
        this.f29319c0 = new KLineSettingConfig(false, true, 1, null);
        this.f29324h0 = true;
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m34108A4(KuMexKlineFragment kuMexKlineFragment, RadioGroup radioGroup, int i11) {
        int i12;
        kuMexKlineFragment.m34193m4().m96331y();
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
        kuMexKlineFragment.m34166p4().m34100s3(c37878b0.m85525f());
    }

    /* JADX INFO: renamed from: B4 */
    public static final void m34110B4(KuMexKlineFragment kuMexKlineFragment, RadioGroup radioGroup, int i11) {
        int i12;
        kuMexKlineFragment.m34193m4().m96331y();
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
        kuMexKlineFragment.m34166p4().m34101t3(c37878b0.m85526g());
        kuMexKlineFragment.m34185X4(c37878b0.m85526g());
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m34112C4(KuMexKlineFragment kuMexKlineFragment, BaseViewHolder baseViewHolder, View view) {
        kuMexKlineFragment.m34193m4().m96331y();
        ((RadioGroup) baseViewHolder.getView(R$id.rb_main)).clearCheck();
        kuMexKlineFragment.m34166p4().m34105x3(true);
        C37878b0.f85252a.m85540u(-1);
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m34114D4(KuMexKlineFragment kuMexKlineFragment, BaseViewHolder baseViewHolder, View view) {
        kuMexKlineFragment.m34193m4().m96331y();
        ((RadioGroup) baseViewHolder.getView(R$id.rb_no_main)).clearCheck();
        kuMexKlineFragment.m34166p4().m34105x3(false);
        C37878b0 c37878b0 = C37878b0.f85252a;
        c37878b0.m85541v(-1);
        kuMexKlineFragment.m34185X4(c37878b0.m85526g());
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m34116E4(KuMexKlineFragment kuMexKlineFragment, View view) {
        kuMexKlineFragment.m34193m4().m96331y();
    }

    /* JADX INFO: renamed from: F4 */
    public static final C43724b m34118F4(final KuMexKlineFragment kuMexKlineFragment) {
        C43724b c43724bM96322p = C43724b.m96333g0().m96308R(kuMexKlineFragment.mContext, R$layout.btradebase_popup_kline_time).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.kumex.kline.g
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                KuMexKlineFragment.m34120G4(this.f29355b);
            }
        }).m96316Z(true).m96322p();
        View viewM96292A = c43724bM96322p.m96292A();
        Intrinsics.checkNotNullExpressionValue(viewM96292A, "getContentView(...)");
        kuMexKlineFragment.m34198v4(viewM96292A);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m34120G4(KuMexKlineFragment kuMexKlineFragment) {
        Object objM103844constructorimpl;
        C36814o2 c36814o2M34190j4 = kuMexKlineFragment.m34190j4();
        if (c36814o2M34190j4 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                BaseTextView tvTabTime = c36814o2M34190j4.f80733l;
                Intrinsics.checkNotNullExpressionValue(tvTabTime, "tvTabTime");
                ImageView ivTabTime = c36814o2M34190j4.f80727f;
                Intrinsics.checkNotNullExpressionValue(ivTabTime, "ivTabTime");
                kuMexKlineFragment.m34183U4(tvTabTime, ivTabTime, false);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C37214b.m83255a(thM103847exceptionOrNullimpl, "KuMexKlineFragment---OnDismissListener");
            }
        }
    }

    /* JADX INFO: renamed from: H4 */
    public static final C43724b m34122H4(final KuMexKlineFragment kuMexKlineFragment) {
        C43724b c43724bM96322p = C43724b.m96333g0().m96308R(kuMexKlineFragment.getActivity(), R$layout.bkumex_popup_kline_quota).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.kumex.kline.h
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                KuMexKlineFragment.m34124I4(this.f29356b);
            }
        }).m96316Z(true).m96322p();
        View viewM96292A = c43724bM96322p.m96292A();
        Intrinsics.checkNotNullExpressionValue(viewM96292A, "getContentView(...)");
        kuMexKlineFragment.m34199z4(viewM96292A);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: I4 */
    public static final void m34124I4(KuMexKlineFragment kuMexKlineFragment) {
        Object objM103844constructorimpl;
        C36814o2 c36814o2M34190j4 = kuMexKlineFragment.m34190j4();
        if (c36814o2M34190j4 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                BaseTextView tvTabQuota = c36814o2M34190j4.f80732k;
                Intrinsics.checkNotNullExpressionValue(tvTabQuota, "tvTabQuota");
                ImageView ivTabQuota = c36814o2M34190j4.f80726e;
                Intrinsics.checkNotNullExpressionValue(ivTabQuota, "ivTabQuota");
                kuMexKlineFragment.m34183U4(tvTabQuota, ivTabQuota, false);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C37214b.m83255a(thM103847exceptionOrNullimpl, "KuMexKlineFragment---OnDismissListener");
            }
        }
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m34128K4(KuMexKlineFragment kuMexKlineFragment, C36814o2 c36814o2) {
        if (!kuMexKlineFragment.m34193m4().m96299I()) {
            BaseTextView tvTabQuota = c36814o2.f80732k;
            Intrinsics.checkNotNullExpressionValue(tvTabQuota, "tvTabQuota");
            ImageView ivTabQuota = c36814o2.f80726e;
            Intrinsics.checkNotNullExpressionValue(ivTabQuota, "ivTabQuota");
            kuMexKlineFragment.m34183U4(tvTabQuota, ivTabQuota, true);
            kuMexKlineFragment.m34193m4().mo54253b0(c36814o2.f80728g);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m34130L4(KuMexKlineFragment kuMexKlineFragment, C36814o2 c36814o2) {
        if (!kuMexKlineFragment.m34192l4().m96299I()) {
            List<KLineTimeEntity> list = kuMexKlineFragment.f29321e0;
            if (list != null) {
                List<KLineTimeEntity> listM63123h = KLineSettingsManager.f51515a.m63123h(list);
                KLineTimeCycleAdapter kLineTimeCycleAdapter = kuMexKlineFragment.f29322f0;
                if (kLineTimeCycleAdapter != null) {
                    kLineTimeCycleAdapter.replaceData(listM63123h);
                }
            }
            BaseTextView tvTabTime = c36814o2.f80733l;
            Intrinsics.checkNotNullExpressionValue(tvTabTime, "tvTabTime");
            ImageView ivTabTime = c36814o2.f80727f;
            Intrinsics.checkNotNullExpressionValue(ivTabTime, "ivTabTime");
            kuMexKlineFragment.m34183U4(tvTabTime, ivTabTime, true);
            kuMexKlineFragment.m34192l4().mo54253b0(c36814o2.f80728g);
            if (kuMexKlineFragment.f29324h0) {
                kuMexKlineFragment.f29324h0 = false;
                kuMexKlineFragment.f29317a0.onNext(-1);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m34136O4(KuMexKlineFragment kuMexKlineFragment, Integer num) {
        Intrinsics.checkNotNull(num);
        kuMexKlineFragment.m34191k4(num.intValue());
        kuMexKlineFragment.m34166p4().m34102u3(C37878b0.f85252a.m85523d());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m34138P4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m34140Q4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final void m34142R4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T4 */
    public static final int m34146T4(KuMexKlineFragment kuMexKlineFragment) {
        Integer numValueOf;
        Bundle arguments = kuMexKlineFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("data"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 4);
    }

    /* JADX INFO: renamed from: W4 */
    public static final String m34150W4(KuMexKlineFragment kuMexKlineFragment) {
        String string;
        Bundle arguments = kuMexKlineFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("symbol");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: b4 */
    public static final InterfaceC38437b m34155b4() {
        return (InterfaceC38437b) C42597a.m93386b().create(InterfaceC38437b.class);
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m34157f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m34158g4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m34159h4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m34172t4(KuMexKlineFragment kuMexKlineFragment, Boolean bool) {
        if (bool.booleanValue()) {
            kuMexKlineFragment.m34188d4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m34174u4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m34177w4(KuMexKlineFragment kuMexKlineFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        List<KLineTimeEntity> data;
        KLineTimeEntity kLineTimeEntity;
        kuMexKlineFragment.m34192l4().m96331y();
        KLineTimeCycleAdapter kLineTimeCycleAdapter = kuMexKlineFragment.f29322f0;
        if (kLineTimeCycleAdapter != null && (data = kLineTimeCycleAdapter.getData()) != null && (kLineTimeEntity = data.get(i11)) != null) {
            C37878b0.f85252a.m85538s(kLineTimeEntity.getTag());
            KlineTrack.f51542a.m63176b(kLineTimeEntity.getTag(), "contract");
            kuMexKlineFragment.f29317a0.onNext(Integer.valueOf(kLineTimeEntity.getTag()));
        }
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m34179x4(KuMexKlineFragment kuMexKlineFragment, View view) {
        kuMexKlineFragment.m34192l4().m96331y();
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m34181y4(KuMexKlineFragment kuMexKlineFragment, View view) {
        kuMexKlineFragment.m34192l4().m96331y();
        Context context = kuMexKlineFragment.getContext();
        if (context != null) {
            kuMexKlineFragment.f29324h0 = true;
            BaseActivity.INSTANCE.launch(context, KLineTimeSetFragment.class, new C27051h().m66724h("title", kuMexKlineFragment.getString(R$string.kc_kline_timecycle_title)).m66717a());
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final void m34183U4(TextView textView, ImageView imageView, boolean z11) {
        int color;
        Context context = getContext();
        if (context != null) {
            if (z11) {
                imageView.setImageResource(R$drawable.ic2_triangle_top_12);
                int i11 = R$color.c_text;
                C27046k.m66701p(imageView, getColorRes(i11));
                color = ContextCompat.getColor(context, i11);
            } else {
                imageView.setImageResource(R$drawable.ic2_triangle_bottom_12);
                int i12 = R$color.c_text40;
                C27046k.m66701p(imageView, getColorRes(i12));
                if (textView.getId() == R$id.tvTabTime) {
                    color = m34195o4();
                } else {
                    color = ContextCompat.getColor(context, i12);
                }
            }
            textView.setTextColor(color);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m34186Y4() {
        m34166p4().m34099r3(this.f29319c0.getShowHistoryOrder());
        m34166p4().m34097p3(this.f29319c0.getShowActiveOrder());
    }

    /* JADX INFO: renamed from: d4 */
    public final void m34188d4() {
        Observable observableCompose = InterfaceC38437b.m86697c(m34189i4(), null, null, 0, 7, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.kline.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineFragment.m34156e4(this.f29362b, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.kline.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineFragment.m34157f4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.kline.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineFragment.m34158g4((Throwable) obj);
            }
        };
        addSubscription(observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.kline.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineFragment.m34159h4(function2, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34191k4(int i11) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new KuMexKlineFragment$getKlinePosition$1(this, i11, null));
    }

    /* JADX INFO: renamed from: o4 */
    public final int m34195o4() {
        CharSequence text;
        BaseTextView baseTextView;
        C36814o2 c36814o2M34190j4 = m34190j4();
        if (c36814o2M34190j4 != null && (baseTextView = c36814o2M34190j4.f80733l) != null) {
            text = baseTextView.getText();
        } else {
            text = null;
        }
        if (!Intrinsics.areEqual(text, getString(R$string.more))) {
            return getColorRes(R$color.c_text);
        }
        return getColorRes(R$color.c_text40);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C161281(null));
        this.f29317a0.onNext(6);
        if (m34194n4() != -1) {
            ((RadioButton) m34193m4().m96292A().findViewById(m34194n4())).setChecked(true);
        } else {
            ((TextView) m34193m4().m96292A().findViewById(R$id.tv_hide_main)).performClick();
        }
        if (m34196q4() != -1) {
            ((RadioButton) m34193m4().m96292A().findViewById(m34196q4())).setChecked(true);
        } else {
            ((TextView) m34193m4().m96292A().findViewById(R$id.tv_hide_no_main)).performClick();
        }
        KuMexFlutterKlineFragment.m34095z3(m34166p4(), null, 1, null);
    }
}
