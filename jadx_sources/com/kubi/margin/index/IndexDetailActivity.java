package com.kubi.margin.index;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.IndexSampleData;
import com.kubi.margin.entity.IndexSymbolData;
import com.kubi.margin.kline.MarginKlineFragment;
import com.kubi.network.websocket.model.Message;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37766r;
import g10.C37787r;
import g10.InterfaceC37770a;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36937s;
import p402kf.C41014a;
import p429lf.C42180b;
import p768xo.InterfaceC46304e;
import p768xo.InterfaceC46306g;
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
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45678b;

/* JADX INFO: compiled from: IndexDetailActivity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\rH\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020 H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020(H\u0016J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020(H\u0017J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u0016H\u0002J\b\u00108\u001a\u00020 H\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u0010*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/kubi/margin/index/IndexDetailActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "Lcom/kubi/margin/kline/MarginKlineFragment$IKlineFragmentProvider;", "Lcom/kubi/sdk/websocket/IWsDataGetter;", "<init>", "()V", "bmarginFragmentIndexPriceDetailBinding", "Lcom/kubi/margin/databinding/BmarginFragmentIndexPriceDetailBinding;", "getBmarginFragmentIndexPriceDetailBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentIndexPriceDetailBinding;", "bmarginFragmentIndexPriceDetailBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "indexApi", "Lcom/kubi/margin/api/IndexApi;", "kotlin.jvm.PlatformType", "getIndexApi", "()Lcom/kubi/margin/api/IndexApi;", "indexApi$delegate", "Lkotlin/Lazy;", "indexSymbolData", "Lcom/kubi/margin/entity/IndexSymbolData;", "getIndexSymbolData", "()Lcom/kubi/margin/entity/IndexSymbolData;", "indexSymbolData$delegate", "footLoading", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getFootLoading", "()Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "footLoading$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bindPriceData", "getTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "getPrecision", "isIndex", "", "getIndexSampleList", "getSampleItemView", "Landroid/view/View;", "indexSampleData", "Lcom/kubi/margin/entity/IndexSampleData;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "onViewHideOrShow", TIMPushProvider.f75062n, "getRestfulData", "resetWs", "updateNewData", "it", "subscribe", "Lio/reactivex/disposables/Disposable;", "registerWsData", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIndexDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexDetailActivity.kt\ncom/kubi/margin/index/IndexDetailActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,245:1\n49#2,15:246\n160#3,4:261\n*S KotlinDebug\n*F\n+ 1 IndexDetailActivity.kt\ncom/kubi/margin/index/IndexDetailActivity\n*L\n58#1:246,15\n232#1:261,4\n*E\n"})
public final class IndexDetailActivity extends BaseUiActivity implements MarginKlineFragment.InterfaceC17697a, InterfaceC37770a {

    /* JADX INFO: renamed from: A */
    @Nullable
    public Disposable f33042A;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f33043v = C45678b.m100788b(this, new Function1<C36937s, Unit>() { // from class: com.kubi.margin.index.IndexDetailActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C36937s it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36937s c36937s) {
            invoke(c36937s);
            return Unit.INSTANCE;
        }
    }, new Function1<IndexDetailActivity, C36937s>() { // from class: com.kubi.margin.index.IndexDetailActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36937s invoke(@NotNull IndexDetailActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s468480978(...)");
            return C36937s.m82743a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Lazy f33044w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Lazy f33045x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Lazy f33046y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public final C37787r f33047z;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ KProperty<Object>[] f33041C = {Reflection.property1(new PropertyReference1Impl(IndexDetailActivity.class, "bmarginFragmentIndexPriceDetailBinding", "getBmarginFragmentIndexPriceDetailBinding()Lcom/kubi/margin/databinding/BmarginFragmentIndexPriceDetailBinding;", 0))};

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final Companion f33040B = new Companion(null);

    /* JADX INFO: compiled from: IndexDetailActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/margin/index/IndexDetailActivity$Companion;", "", "<init>", "()V", "toIndexDetailActivity", "", "context", "Landroid/content/Context;", "symbol", "Lcom/kubi/margin/entity/IndexSymbolData;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void toIndexDetailActivity(@NotNull Context context, @NotNull IndexSymbolData symbol) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", symbol);
            context.startActivity(new Intent(context, (Class<?>) IndexDetailActivity.class).putExtras(bundle));
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.index.IndexDetailActivity$a */
    /* JADX INFO: compiled from: IndexDetailActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/index/IndexDetailActivity$getIndexSampleList$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17643a extends C24223c1 {
        public C17643a() {
            super(IndexDetailActivity.this, false);
        }

        /* JADX INFO: renamed from: f */
        public static final void m38441f(IndexDetailActivity indexDetailActivity, View view) {
            indexDetailActivity.m38431I0().showLoading();
            indexDetailActivity.m38433K0();
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            WrapperLoadingView wrapperLoadingViewM38431I0 = IndexDetailActivity.this.m38431I0();
            int i11 = R$string.system_error;
            int i12 = R$drawable.ic2_common_system_maintain;
            final IndexDetailActivity indexDetailActivity = IndexDetailActivity.this;
            wrapperLoadingViewM38431I0.showEmpty(i11, i12, new View.OnClickListener() { // from class: com.kubi.margin.index.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IndexDetailActivity.C17643a.m38441f(indexDetailActivity, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.index.IndexDetailActivity$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C17644b extends TypeToken<IndexSymbolData> {
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m38399P0(IndexDetailActivity indexDetailActivity, ArrayList arrayList) {
        Object obj = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        indexDetailActivity.m38438e1((IndexSymbolData) obj);
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    /* JADX INFO: renamed from: M1 */
    public boolean mo38435M1() {
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public static final boolean m38397N0(ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }

    /* JADX INFO: renamed from: O0 */
    public static final boolean m38398O0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: T0 */
    public static final Unit m38402T0() {
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(InterfaceC46306g.f103884k);
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V0 */
    public static final void m38403V0(final IndexDetailActivity indexDetailActivity) {
        Disposable disposable = indexDetailActivity.f33042A;
        if (disposable != null) {
            disposable.dispose();
        }
        C37787r c37787r = indexDetailActivity.f33047z;
        IndexSymbolData indexSymbolDataM38434M0 = indexDetailActivity.m38434M0();
        PublishSubject<Message> publishSubjectM85233f = c37787r.m85233f("/index/tickers:%s", C27041f.m66668h(indexSymbolDataM38434M0 != null ? indexSymbolDataM38434M0.getSymbol() : null));
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.index.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(IndexDetailActivity.m38404W0(this.f33079b, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.margin.index.b
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return IndexDetailActivity.m38405X0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.index.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexDetailActivity.m38406Y0((Message) obj);
            }
        };
        Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.margin.index.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return IndexDetailActivity.m38407Z0(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.index.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexDetailActivity.m38408a1(this.f33065b, (IndexSymbolData) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.index.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IndexDetailActivity.m38409b1(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.index.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexDetailActivity.m38410c1((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.index.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IndexDetailActivity.m38411d1(function4, obj);
            }
        });
        indexDetailActivity.f33042A = disposableSubscribe;
        indexDetailActivity.m56593T(disposableSubscribe);
    }

    /* JADX INFO: renamed from: W0 */
    public static final boolean m38404W0(IndexDetailActivity indexDetailActivity, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String topic = it.getTopic();
        IndexSymbolData indexSymbolDataM38434M0 = indexDetailActivity.m38434M0();
        return Intrinsics.areEqual(topic, DowngradeExKt.m66551u("/index/tickers:%s", new Object[]{C27041f.m66668h(indexSymbolDataM38434M0 != null ? indexSymbolDataM38434M0.getSymbol() : null)}, null, 2, null));
    }

    /* JADX INFO: renamed from: X0 */
    public static final boolean m38405X0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Y0 */
    public static final IndexSymbolData m38406Y0(Message s11) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(s11, "s");
        String strM66668h = C27041f.m66668h(s11.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C17644b().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        IndexSymbolData indexSymbolData = (IndexSymbolData) objM66914d;
        return indexSymbolData == null ? new IndexSymbolData(null, null, null, null, null, null, 63, null) : indexSymbolData;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final IndexSymbolData m38407Z0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (IndexSymbolData) function1.invoke(p11);
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    @NotNull
    /* JADX INFO: renamed from: D0 */
    public TradeItemBean mo38428D0() {
        TradeItemBean tradeItemBean = new TradeItemBean();
        IndexSymbolData indexSymbolDataM38434M0 = m38434M0();
        tradeItemBean.setSymbol(C27041f.m66669i(indexSymbolDataM38434M0 != null ? indexSymbolDataM38434M0.getSymbol() : null, "BTC-USDT"));
        return tradeItemBean;
    }

    /* JADX INFO: renamed from: H0 */
    public final C36937s m38430H0() {
        return (C36937s) this.f33043v.getValue(this, f33041C[0]);
    }

    /* JADX INFO: renamed from: I0 */
    public final WrapperLoadingView m38431I0() {
        return (WrapperLoadingView) this.f33046y.getValue();
    }

    /* JADX INFO: renamed from: J0 */
    public final InterfaceC46304e m38432J0() {
        return (InterfaceC46304e) this.f33044w.getValue();
    }

    /* JADX INFO: renamed from: M0 */
    public final IndexSymbolData m38434M0() {
        return (IndexSymbolData) this.f33045x.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    public void m38437U0() throws Exception {
        this.f33047z.m85234g(new Action() { // from class: com.kubi.margin.index.o
            @Override // io.reactivex.functions.Action
            public final void run() {
                IndexDetailActivity.m38403V0(this.f33077b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.bmargin_fragment_index_price_detail;
    }

    public IndexDetailActivity() {
        setPageId("B4spotIndex");
        this.f33044w = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.index.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndexDetailActivity.m38400R0();
            }
        });
        this.f33045x = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.index.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndexDetailActivity.m38401S0(this.f33075b);
            }
        });
        this.f33046y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.index.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IndexDetailActivity.m38395G0(this.f33076b);
            }
        });
        this.f33047z = new C37787r(this);
    }

    /* JADX INFO: renamed from: G0 */
    public static final WrapperLoadingView m38395G0(IndexDetailActivity indexDetailActivity) {
        C36937s c36937sM38430H0 = indexDetailActivity.m38430H0();
        Intrinsics.checkNotNull(c36937sM38430H0);
        return WrapperLoadingView.injectView(c36937sM38430H0.f81964k);
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m38396L0(IndexDetailActivity indexDetailActivity, ArrayList arrayList) {
        C36937s c36937sM38430H0 = indexDetailActivity.m38430H0();
        if (c36937sM38430H0 != null) {
            c36937sM38430H0.f81964k.removeAllViews();
            Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                c36937sM38430H0.f81964k.addView(indexDetailActivity.m38436Q0((IndexSampleData) next));
            }
            indexDetailActivity.m38431I0().showContent();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static final InterfaceC46304e m38400R0() {
        return (InterfaceC46304e) C42597a.m93386b().create(InterfaceC46304e.class);
    }

    /* JADX INFO: renamed from: S0 */
    public static final IndexSymbolData m38401S0(IndexDetailActivity indexDetailActivity) {
        return (IndexSymbolData) indexDetailActivity.getIntent().getParcelableExtra("data");
    }

    /* JADX INFO: renamed from: a1 */
    public static final Unit m38408a1(IndexDetailActivity indexDetailActivity, IndexSymbolData indexSymbolData) {
        if (indexDetailActivity.isFinishing()) {
            return Unit.INSTANCE;
        }
        String symbol = indexSymbolData.getSymbol();
        if (symbol != null && symbol.length() != 0) {
            Intrinsics.checkNotNull(indexSymbolData);
            indexDetailActivity.m38438e1(indexSymbolData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m38409b1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m38410c1(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d1 */
    public static final void m38411d1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m38429F0() {
        String strM92640e;
        BigDecimal price;
        BigDecimal change;
        BigDecimal change2;
        String strM89950x;
        String formatChangeRate;
        BigDecimal change3;
        String strM92640e2;
        BigDecimal low;
        BigDecimal high;
        BigDecimal price2;
        String quoteCurrency;
        BigDecimal price3;
        C36937s c36937sM38430H0 = m38430H0();
        if (c36937sM38430H0 != null) {
            UpDownTextView upDownTextView = c36937sM38430H0.f81958e;
            IndexSymbolData indexSymbolDataM38434M0 = m38434M0();
            String strM92640e3 = null;
            if (indexSymbolDataM38434M0 != null && (price3 = indexSymbolDataM38434M0.getPrice()) != null) {
                strM92640e = C42180b.m92640e(price3, null, 30, false, false, false, 0, null, 125, null);
            } else {
                strM92640e = null;
            }
            String strM66669i = C27041f.m66669i(strM92640e, "--");
            IndexSymbolData indexSymbolDataM38434M1 = m38434M0();
            if (indexSymbolDataM38434M1 != null) {
                price = indexSymbolDataM38434M1.getPrice();
            } else {
                price = null;
            }
            Double dValueOf = Double.valueOf(C27039d.m66647g(price));
            IndexSymbolData indexSymbolDataM38434M2 = m38434M0();
            if (indexSymbolDataM38434M2 != null) {
                change = indexSymbolDataM38434M2.getChange();
            } else {
                change = null;
            }
            Double dValueOf2 = Double.valueOf(C27039d.m66647g(change));
            Context mContext = this.f46505q;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            IndexSymbolData indexSymbolDataM38434M3 = m38434M0();
            if (indexSymbolDataM38434M3 != null) {
                change2 = indexSymbolDataM38434M3.getChange();
            } else {
                change2 = null;
            }
            upDownTextView.m54920h(strM66669i, dValueOf, dValueOf2, C22890g.m54279d(mContext, C27039d.m66647g(change2), 0, 2, null));
            UpDownTextView upDownTextView2 = c36937sM38430H0.f81956c;
            IndexSymbolData indexSymbolDataM38434M4 = m38434M0();
            if (indexSymbolDataM38434M4 != null && (price2 = indexSymbolDataM38434M4.getPrice()) != null) {
                IndexSymbolData indexSymbolDataM38434M5 = m38434M0();
                if (indexSymbolDataM38434M5 != null) {
                    quoteCurrency = indexSymbolDataM38434M5.getQuoteCurrency();
                } else {
                    quoteCurrency = null;
                }
                strM89950x = C41014a.m89950x(C41014a.m89940n(price2, quoteCurrency), null, null, 0, false, false, false, false, 127, null);
            } else {
                strM89950x = null;
            }
            upDownTextView2.setText(C27041f.m66669i(strM89950x, "--"));
            UpDownTextView upDownTextView3 = c36937sM38430H0.f81955b;
            IndexSymbolData indexSymbolDataM38434M6 = m38434M0();
            if (indexSymbolDataM38434M6 != null) {
                formatChangeRate = indexSymbolDataM38434M6.getFormatChangeRate();
            } else {
                formatChangeRate = null;
            }
            upDownTextView3.setText(formatChangeRate);
            UpDownTextView upDownTextView4 = c36937sM38430H0.f81955b;
            IndexSymbolData indexSymbolDataM38434M7 = m38434M0();
            if (indexSymbolDataM38434M7 != null) {
                change3 = indexSymbolDataM38434M7.getChange();
            } else {
                change3 = null;
            }
            upDownTextView4.setTextColor(C22890g.m54279d(this, C27039d.m66647g(change3), 0, 2, null));
            ShowHideTextView showHideTextView = c36937sM38430H0.f81959f;
            IndexSymbolData indexSymbolDataM38434M8 = m38434M0();
            if (indexSymbolDataM38434M8 != null && (high = indexSymbolDataM38434M8.getHigh()) != null) {
                strM92640e2 = C42180b.m92640e(high, null, 30, false, false, false, 0, null, 125, null);
            } else {
                strM92640e2 = null;
            }
            showHideTextView.setText(C27041f.m66669i(strM92640e2, "--"));
            ShowHideTextView showHideTextView2 = c36937sM38430H0.f81957d;
            IndexSymbolData indexSymbolDataM38434M9 = m38434M0();
            if (indexSymbolDataM38434M9 != null && (low = indexSymbolDataM38434M9.getLow()) != null) {
                strM92640e3 = C42180b.m92640e(low, null, 30, false, false, false, 0, null, 125, null);
            }
            showHideTextView2.setText(C27041f.m66669i(strM92640e3, "--"));
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m38433K0() {
        String symbol;
        InterfaceC46304e interfaceC46304eM38432J0 = m38432J0();
        IndexSymbolData indexSymbolDataM38434M0 = m38434M0();
        String quoteCurrency = null;
        if (indexSymbolDataM38434M0 != null) {
            symbol = indexSymbolDataM38434M0.getSymbol();
        } else {
            symbol = null;
        }
        String strM66668h = C27041f.m66668h(symbol);
        IndexSymbolData indexSymbolDataM38434M1 = m38434M0();
        if (indexSymbolDataM38434M1 != null) {
            quoteCurrency = indexSymbolDataM38434M1.getQuoteCurrency();
        }
        Disposable disposableSubscribe = interfaceC46304eM38432J0.m102061b(strM66668h, C27041f.m66669i(quoteCurrency, "USDT")).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.margin.index.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IndexDetailActivity.m38396L0(this.f33078b, (ArrayList) obj);
            }
        }, new C17643a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: Q0 */
    public final View m38436Q0(IndexSampleData indexSampleData) {
        String strReplace$default;
        String strM92640e = null;
        View viewInflate = getLayoutInflater().inflate(R$layout.bmargin_view_item_sample_text, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R$id.tv_exchange)).setText(indexSampleData.getExchange());
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_contain);
        String symbol = indexSampleData.getSymbol();
        if (symbol != null) {
            strReplace$default = StringsKt.replace$default(symbol, C33820nf.f71144W, "/", false, 4, (Object) null);
        } else {
            strReplace$default = null;
        }
        textView.setText(C27041f.m66669i(strReplace$default, "--"));
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_price);
        BigDecimal price = indexSampleData.getPrice();
        if (price != null) {
            strM92640e = C42180b.m92640e(price, null, 30, false, false, false, 0, null, 125, null);
        }
        textView2.setText(C27041f.m66669i(strM92640e, "--"));
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m38438e1(IndexSymbolData indexSymbolData) {
        IndexSymbolData indexSymbolDataM38434M0 = m38434M0();
        if (indexSymbolDataM38434M0 != null) {
            indexSymbolDataM38434M0.setChange(indexSymbolData.getChange());
        }
        IndexSymbolData indexSymbolDataM38434M1 = m38434M0();
        if (indexSymbolDataM38434M1 != null) {
            indexSymbolDataM38434M1.setPrice(indexSymbolData.getPrice());
        }
        IndexSymbolData indexSymbolDataM38434M2 = m38434M0();
        if (indexSymbolDataM38434M2 != null) {
            indexSymbolDataM38434M2.setHigh(indexSymbolData.getHigh());
        }
        IndexSymbolData indexSymbolDataM38434M3 = m38434M0();
        if (indexSymbolDataM38434M3 != null) {
            indexSymbolDataM38434M3.setLow(indexSymbolData.getLow());
        }
        m38429F0();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: f0 */
    public void mo38439f0(boolean z11) throws Exception {
        super.mo38439f0(z11);
        if (z11) {
            mo22379g(true);
        } else {
            this.f33047z.m85236i(z11);
        }
    }

    @Override // g10.InterfaceC37770a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: g */
    public void mo22379g(boolean z11) throws Exception {
        String symbol;
        if (!isFinishing()) {
            InterfaceC46304e interfaceC46304eM38432J0 = m38432J0();
            IndexSymbolData indexSymbolDataM38434M0 = m38434M0();
            if (indexSymbolDataM38434M0 != null) {
                symbol = indexSymbolDataM38434M0.getSymbol();
            } else {
                symbol = null;
            }
            Observable<R> observableCompose = interfaceC46304eM38432J0.m102062c(C27041f.m66668h(symbol)).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.index.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(IndexDetailActivity.m38397N0((ArrayList) obj));
                }
            };
            observableCompose.filter(new Predicate() { // from class: com.kubi.margin.index.j
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return IndexDetailActivity.m38398O0(function1, obj);
                }
            }).subscribe(new Consumer() { // from class: com.kubi.margin.index.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    IndexDetailActivity.m38399P0(this.f33074b, (ArrayList) obj);
                }
            }, new C24223c1(this, false));
            if (z11) {
                m38437U0();
            }
        }
    }

    @Override // com.kubi.margin.kline.MarginKlineFragment.InterfaceC17697a
    public int getPrecision() {
        return C27039d.m66650j(Integer.valueOf(mo38428D0().getSymbolInfoEntity().getPriceIncrementPrecision()));
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        String quoteName;
        String name;
        super.onCreate(savedInstanceState);
        C36937s c36937sM38430H0 = m38430H0();
        if (c36937sM38430H0 != null) {
            BaseTextView baseTextView = c36937sM38430H0.f81969p;
            int i11 = R$string.price_order;
            IndexSymbolData indexSymbolDataM38434M0 = m38434M0();
            String strReplace$default = null;
            if (indexSymbolDataM38434M0 != null) {
                quoteName = indexSymbolDataM38434M0.getQuoteName();
            } else {
                quoteName = null;
            }
            baseTextView.setText(getString(i11, C27041f.m66669i(quoteName, "USDT")));
            c36937sM38430H0.f81968o.getPaint().setFlags(8);
            c36937sM38430H0.f81968o.getPaint().setAntiAlias(true);
            BaseTextView tvIndexWord = c36937sM38430H0.f81968o;
            Intrinsics.checkNotNullExpressionValue(tvIndexWord, "tvIndexWord");
            C27046k.m66711z(tvIndexWord, 0L, new Function0() { // from class: com.kubi.margin.index.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndexDetailActivity.m38402T0();
                }
            }, 1, null);
            NavigationBar navigationBar = getNavigationBar();
            IndexSymbolData indexSymbolDataM38434M1 = m38434M0();
            if (indexSymbolDataM38434M1 != null && (name = indexSymbolDataM38434M1.getName()) != null) {
                strReplace$default = StringsKt.replace$default(name, C33820nf.f71144W, "/", false, 4, (Object) null);
            }
            navigationBar.setMainTitle(C27041f.m66669i(strReplace$default, "--"));
            m38429F0();
            m38431I0().showLoading();
            m38433K0();
        }
    }
}
