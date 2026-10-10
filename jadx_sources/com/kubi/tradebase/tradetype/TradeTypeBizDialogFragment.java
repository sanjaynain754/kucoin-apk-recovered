package com.kubi.tradebase.tradetype;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.PagerAdapter;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import n30.C42729e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import s30.C44280b0;
import s30.C44283d;
import s30.C44286e0;
import s30.C44287f;
import s30.C44292h0;
import s30.C44296l;
import s30.C44298n;
import s30.C44301q;
import s30.C44303s;
import s30.C44305u;
import s30.C44308x;
import w00.C45681e;

/* JADX INFO: compiled from: TradeTypeBizDialogFragment.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u000bH\u0003R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001a\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001e\u0010\u001cR\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b!\u0010\u0018¨\u00063"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseDialogTradeTypeInfoBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseDialogTradeTypeInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "supportTradeTypeList", "", "Lcom/kubi/tradebase/tradetype/TradeType;", "getSupportTradeTypeList", "()Ljava/util/List;", "supportTradeTypeList$delegate", "Lkotlin/Lazy;", "initType", "getInitType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "initType$delegate", "parentPageId", "", "getParentPageId", "()Ljava/lang/String;", "parentPageId$delegate", "isFutures", "", "()Z", "isFutures$delegate", "isConditionalMarket", "isConditionalMarket$delegate", "quoteCurrencyArg", "getQuoteCurrencyArg", "quoteCurrencyArg$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "isBottomSheet", "onStart", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "buildTradeTypeByList", "Lcom/kubi/tradebase/tradetype/ITradeTypeBizInfo;", "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTypeBizDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypeBizDialogFragment.kt\ncom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,187:1\n143#2,20:188\n1563#3:208\n1634#3,3:209\n1878#3,3:216\n1563#3:219\n1634#3,3:220\n37#4:212\n36#4,3:213\n18#4:223\n11228#5:224\n11563#5,2:225\n1310#5,2:227\n11565#5:229\n*S KotlinDebug\n*F\n+ 1 TradeTypeBizDialogFragment.kt\ncom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment\n*L\n75#1:188,20\n140#1:208\n140#1:209,3\n145#1:216,3\n168#1:219\n168#1:220,3\n140#1:212\n140#1:213,3\n77#1:223\n78#1:224\n78#1:225,2\n78#1:227,2\n78#1:229\n*E\n"})
public final class TradeTypeBizDialogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f51637q0 = C45681e.m100799e(this, new Function1<TradeTypeBizDialogFragment, C42729e>() { // from class: com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42729e invoke(@NotNull TradeTypeBizDialogFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42729e.m93629a(fragment.requireView());
        }
    }, new Function1<C42729e, Unit>() { // from class: com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42729e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42729e c42729e) {
            invoke(c42729e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f51638r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeTypeBizDialogFragment.m63343I4(this.f51654b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f51639s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeTypeBizDialogFragment.m63336A4(this.f51655b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f51640t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeTypeBizDialogFragment.m63341G4(this.f51656b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f51641u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeTypeBizDialogFragment.m63339E4(this.f51657b));
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f51642v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(TradeTypeBizDialogFragment.m63337C4(this.f51658b));
        }
    });

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public final Lazy f51643w0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.tradetype.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeTypeBizDialogFragment.m63342H4(this.f51659b);
        }
    });

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ KProperty<Object>[] f51636y0 = {Reflection.property1(new PropertyReference1Impl(TradeTypeBizDialogFragment.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/BtradebaseDialogTradeTypeInfoBinding;", 0))};

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public static final Companion f51635x0 = new Companion(null);

    /* JADX INFO: compiled from: TradeTypeBizDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;", "supTradeTypeList", "", "", "initType", "Lcom/kubi/tradebase/tradetype/TradeType;", "pageId", "isFutures", "", "isConditionalMarket", "quoteCurrency", "([Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Ljava/lang/String;ZZLjava/lang/String;)Lcom/kubi/tradebase/tradetype/TradeTypeBizDialogFragment;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ TradeTypeBizDialogFragment newInstance$default(Companion companion, String[] strArr, TradeType tradeType, String str, boolean z11, boolean z12, String str2, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            if ((i11 & 16) != 0) {
                z12 = false;
            }
            if ((i11 & 32) != 0) {
                str2 = null;
            }
            return companion.newInstance(strArr, tradeType, str, z11, z12, str2);
        }

        @NotNull
        public final TradeTypeBizDialogFragment newInstance(@NotNull String[] supTradeTypeList, @NotNull TradeType initType, @NotNull String pageId, boolean isFutures, boolean isConditionalMarket, @Nullable String quoteCurrency) {
            Intrinsics.checkNotNullParameter(supTradeTypeList, "supTradeTypeList");
            Intrinsics.checkNotNullParameter(initType, "initType");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            Bundle bundle = new Bundle();
            bundle.putStringArray("supTradeTypeList", supTradeTypeList);
            bundle.putSerializable("initType", initType);
            bundle.putString("parentPageId", pageId);
            bundle.putBoolean("isFutures", isFutures);
            bundle.putBoolean("isConditionalMarket", isConditionalMarket);
            if (quoteCurrency != null && quoteCurrency.length() != 0) {
                bundle.putString("quoteCurrency", quoteCurrency);
            }
            TradeTypeBizDialogFragment tradeTypeBizDialogFragment = new TradeTypeBizDialogFragment();
            tradeTypeBizDialogFragment.setArguments(bundle);
            return tradeTypeBizDialogFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment$b */
    /* JADX INFO: compiled from: TradeTypeBizDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$buildTradeTypeByList$platform$1", "Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "isFutures", "", "isConditionalMarket", "pageId", "", "context", "Landroid/content/Context;", "quoteCurrency", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25924b implements ITradeTypePlatform {
        public C25924b() {
        }

        @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
        /* JADX INFO: renamed from: a */
        public String mo63362a() {
            return TradeTypeBizDialogFragment.this.m63360y4();
        }

        @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
        /* JADX INFO: renamed from: e */
        public Context mo63363e() {
            Context contextRequireContext = TradeTypeBizDialogFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return contextRequireContext;
        }

        @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
        /* JADX INFO: renamed from: f */
        public boolean mo63364f() {
            return TradeTypeBizDialogFragment.this.m63338D4();
        }

        @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
        /* JADX INFO: renamed from: g */
        public boolean mo63365g() {
            return TradeTypeBizDialogFragment.this.m63355B4();
        }

        @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
        public String pageId() {
            return TradeTypeBizDialogFragment.this.m63359x4();
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment$c */
    /* JADX INFO: compiled from: TradeTypeBizDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$onViewCreated$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25925c extends C45938b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<ITradeTypeBizInfo> f51645a;

        /* JADX WARN: Multi-variable type inference failed */
        public C25925c(List<? extends ITradeTypeBizInfo> list) {
            this.f51645a = list;
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m63367d(List list, int i11) {
            C43852m.m96591c(((ITradeTypeBizInfo) list.get(i11)).mo63387d().getFirst(), ((ITradeTypeBizInfo) list.get(i11)).mo63387d().getSecond(), null, null, 12, null);
            return Unit.INSTANCE;
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(final int i11) {
            super.mo18273b(i11);
            final List<ITradeTypeBizInfo> list = this.f51645a;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.tradebase.tradetype.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeTypeBizDialogFragment.C25925c.m63367d(list, i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment$d */
    /* JADX INFO: compiled from: TradeTypeBizDialogFragment.kt */
    @Metadata(m90083d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, m90084d2 = {"com/kubi/tradebase/tradetype/TradeTypeBizDialogFragment$onViewCreated$2", "Landroidx/viewpager/widget/PagerAdapter;", "getCount", "", "isViewFromObject", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "any", "", "destroyItem", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", ViewProps.POSITION, "object", "instantiateItem", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25926d extends PagerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<ITradeTypeBizInfo> f51646a;

        /* JADX WARN: Multi-variable type inference failed */
        public C25926d(List<? extends ITradeTypeBizInfo> list) {
            this.f51646a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int position, Object object) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(object, "object");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f51646a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            View viewMo63386c = this.f51646a.get(position).mo63386c();
            ViewParent parent = viewMo63386c.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(viewMo63386c);
            }
            container.addView(viewMo63386c);
            return viewMo63386c;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object any) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(any, "any");
            return Intrinsics.areEqual(any, view);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment$onViewCreated$6 */
    /* JADX INFO: compiled from: TradeTypeBizDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment$onViewCreated$6", m90122f = "TradeTypeBizDialogFragment.kt", m90123i = {}, m90124l = {151}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C259276 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.IntRef $initIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C259276(Ref.IntRef intRef, Continuation<? super C259276> continuation) {
            super(2, continuation);
            this.$initIndex = intRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeTypeBizDialogFragment.this.new C259276(this.$initIndex, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C259276) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SlidingTabLayout slidingTabLayout;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.m90350b(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C42729e c42729eM63357v4 = TradeTypeBizDialogFragment.this.m63357v4();
            if (c42729eM63357v4 != null && (slidingTabLayout = c42729eM63357v4.f94604b) != null) {
                slidingTabLayout.setCurrentTab(this.$initIndex.element);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment$a */
    /* JADX INFO: compiled from: TradeTypeBizDialogFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C25923a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.OCO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.ADVANCED_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.CONDITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.LIMIT_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TradeType.MARKET_STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TradeType.TSO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TradeType.TWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TradeType.HIDDEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TradeType.KLINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TradeType.SEGMENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public final boolean m63338D4() {
        return ((Boolean) this.f51641u0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: B4 */
    public final boolean m63355B4() {
        return ((Boolean) this.f51642v0.getValue()).booleanValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.btradebase_dialog_trade_type_info, container);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcSecondaryButton kcSecondaryButton;
        SlidingTabLayout slidingTabLayout;
        BottomSheetViewPager bottomSheetViewPager;
        BottomSheetViewPager bottomSheetViewPager2;
        SlidingTabLayout slidingTabLayout2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        List<ITradeTypeBizInfo> listM63356u4 = m63356u4();
        C42729e c42729eM63357v4 = m63357v4();
        if (c42729eM63357v4 != null && (slidingTabLayout2 = c42729eM63357v4.f94604b) != null) {
            slidingTabLayout2.setOnTabSelectListener(new C25925c(listM63356u4));
        }
        C42729e c42729eM63357v5 = m63357v4();
        if (c42729eM63357v5 != null && (bottomSheetViewPager2 = c42729eM63357v5.f94606d) != null) {
            bottomSheetViewPager2.setAdapter(new C25926d(listM63356u4));
        }
        C42729e c42729eM63357v6 = m63357v4();
        if (c42729eM63357v6 != null && (bottomSheetViewPager = c42729eM63357v6.f94606d) != null) {
            bottomSheetViewPager.setOffscreenPageLimit(listM63356u4.size());
        }
        C42729e c42729eM63357v7 = m63357v4();
        int i11 = 0;
        if (c42729eM63357v7 != null && (slidingTabLayout = c42729eM63357v7.f94604b) != null) {
            C42729e c42729eM63357v8 = m63357v4();
            BottomSheetViewPager bottomSheetViewPager3 = c42729eM63357v8 != null ? c42729eM63357v8.f94606d : null;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM63356u4, 10));
            Iterator<T> it = listM63356u4.iterator();
            while (it.hasNext()) {
                arrayList.add(((ITradeTypeBizInfo) it.next()).mo63385b());
            }
            slidingTabLayout.m55279E(bottomSheetViewPager3, (CharSequence[]) arrayList.toArray(new CharSequence[0]));
        }
        C42729e c42729eM63357v9 = m63357v4();
        if (c42729eM63357v9 != null && (kcSecondaryButton = c42729eM63357v9.f94605c) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.tradebase.tradetype.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeTypeBizDialogFragment.m63340F4(this.f51660b);
                }
            }, 1, null);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        for (Object obj : m63361z4()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((TradeType) obj) == m63358w4()) {
                intRef.element = i11;
            }
            i11 = i12;
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C259276(intRef, null));
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: u4 */
    public final List<ITradeTypeBizInfo> m63356u4() {
        Object c44301q;
        C25924b c25924b = new C25924b();
        List<TradeType> listM63361z4 = m63361z4();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM63361z4, 10));
        for (TradeType tradeType : listM63361z4) {
            switch (tradeType == null ? -1 : C25923a.$EnumSwitchMapping$0[tradeType.ordinal()]) {
                case -1:
                    c44301q = new C44301q(c25924b);
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    c44301q = new C44301q(c25924b);
                    break;
                case 2:
                    c44301q = new C44305u(c25924b);
                    break;
                case 3:
                    c44301q = new C44308x(c25924b);
                    break;
                case 4:
                    c44301q = new C44296l(c25924b);
                    break;
                case 5:
                    c44301q = new C44283d(c25924b);
                    break;
                case 6:
                    c44301q = new C44298n(c25924b);
                    break;
                case 7:
                    c44301q = new C44303s(c25924b);
                    break;
                case 8:
                    c44301q = new C44286e0(c25924b);
                    break;
                case 9:
                    c44301q = new C44292h0(c25924b);
                    break;
                case 10:
                    c44301q = new C44287f(c25924b);
                    break;
                case 11:
                    c44301q = new C44301q(c25924b);
                    break;
                case 12:
                    c44301q = new C44280b0(c25924b);
                    break;
            }
            arrayList.add(c44301q);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v4 */
    public final C42729e m63357v4() {
        return (C42729e) this.f51637q0.getValue(this, f51636y0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: w4 */
    public final TradeType m63358w4() {
        return (TradeType) this.f51639s0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: x4 */
    public final String m63359x4() {
        return (String) this.f51640t0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final String m63360y4() {
        return (String) this.f51643w0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z4 */
    public final List<TradeType> m63361z4() {
        return (List) this.f51638r0.getValue();
    }

    /* JADX INFO: renamed from: A4 */
    public static final TradeType m63336A4(TradeTypeBizDialogFragment tradeTypeBizDialogFragment) {
        TradeType tradeType;
        Bundle arguments = tradeTypeBizDialogFragment.getArguments();
        if (arguments != null && (tradeType = (TradeType) RouteExKt.m56278v(arguments, "initType")) != null) {
            return tradeType;
        }
        return TradeType.LIMIT;
    }

    /* JADX INFO: renamed from: C4 */
    public static final boolean m63337C4(TradeTypeBizDialogFragment tradeTypeBizDialogFragment) {
        Boolean boolValueOf;
        Bundle arguments = tradeTypeBizDialogFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56250h(arguments, "isConditionalMarket"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: E4 */
    public static final boolean m63339E4(TradeTypeBizDialogFragment tradeTypeBizDialogFragment) {
        Boolean boolValueOf;
        Bundle arguments = tradeTypeBizDialogFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56250h(arguments, "isFutures"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m63340F4(TradeTypeBizDialogFragment tradeTypeBizDialogFragment) {
        tradeTypeBizDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final String m63341G4(TradeTypeBizDialogFragment tradeTypeBizDialogFragment) {
        String strM56284y;
        Bundle arguments = tradeTypeBizDialogFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "parentPageId");
        } else {
            strM56284y = null;
        }
        if (strM56284y == null) {
            return "";
        }
        return strM56284y;
    }

    /* JADX INFO: renamed from: H4 */
    public static final String m63342H4(TradeTypeBizDialogFragment tradeTypeBizDialogFragment) {
        String strM56284y;
        Bundle arguments = tradeTypeBizDialogFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "quoteCurrency");
        } else {
            strM56284y = null;
        }
        if (strM56284y == null) {
            return "";
        }
        return strM56284y;
    }

    /* JADX INFO: renamed from: I4 */
    public static final List m63343I4(TradeTypeBizDialogFragment tradeTypeBizDialogFragment) {
        String[] stringArray;
        TradeType tradeType;
        Bundle arguments = tradeTypeBizDialogFragment.getArguments();
        if (arguments != null) {
            stringArray = arguments.getStringArray("supTradeTypeList");
        } else {
            stringArray = null;
        }
        if (stringArray == null) {
            stringArray = new String[0];
        }
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            TradeType[] tradeTypeArrValues = TradeType.values();
            int length = tradeTypeArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    tradeType = tradeTypeArrValues[i11];
                    if (Intrinsics.areEqual(tradeType.getValue(), str)) {
                        break;
                    }
                    i11++;
                } else {
                    tradeType = null;
                    break;
                }
            }
            arrayList.add(tradeType);
        }
        return arrayList;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        super.onStart();
        int iM6182d = C5267e0.m6182d();
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
        }
    }
}
