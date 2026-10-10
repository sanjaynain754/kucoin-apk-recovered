package com.kubi.quotefacade.market.spot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.widget.ViewPager2;
import bv.C4651a0;
import bv.C4673i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.QuoteMarketBaseFragment;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.MarketMenuEntity;
import com.kubi.quotefacade.entity.SpotLevel1;
import com.kubi.quotefacade.entity.SpotLevel2;
import com.kubi.quotefacade.entity.SpotMenu;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p241ev.C37266a;
import p274fx.C37727a;
import p321hv.InterfaceC38357g;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: QuoteSpotFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0007J,\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u00112\f\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u00109R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m90084d2 = {"Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;", "Lcom/kubi/quotefacade/QuoteMarketBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentSpotMarketBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentSpotMarketBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "spotLevel1", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/quotefacade/entity/SpotLevel1;", "alertSheetItem", "", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "currentAlertSheetItemName", "", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "wsList", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "tabLayout", "Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "setData", "marketMenuEntity", "Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "initViews", "initGuide", "initViewPage", "alertChooseCryptoIndex", "updateTab", "selectItem", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "updateAdapter", "quoteCryptoAliasName", "list", "", "Lcom/kubi/quotefacade/entity/SpotLevel2;", "selectIndex", "", "(Ljava/lang/String;Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteSpotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,305:1\n147#2,16:306\n25#3,3:322\n1#4:325\n45#5,7:326\n*S KotlinDebug\n*F\n+ 1 QuoteSpotFragment.kt\ncom/kubi/quotefacade/market/spot/QuoteSpotFragment\n*L\n54#1:306,16\n159#1:322,3\n302#1:326,7\n*E\n"})
public final class QuoteSpotFragment extends QuoteMarketBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f42350U = C45681e.m100799e(this, new Function1<QuoteSpotFragment, C4651a0>() { // from class: com.kubi.quotefacade.market.spot.QuoteSpotFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4651a0 invoke(@NotNull QuoteSpotFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4651a0.m4614a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4651a0, Unit>() { // from class: com.kubi.quotefacade.market.spot.QuoteSpotFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4651a0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4651a0 c4651a0) {
            invoke(c4651a0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final CopyOnWriteArrayList<SpotLevel1> f42351V = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: W */
    @NotNull
    public final List<SelectEntity> f42352W = new ArrayList();

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f42353X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ArrayList<CharSequence> f42354Y = new ArrayList<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final CopyOnWriteArrayList<String> f42355Z = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public ViewPager2 f42356a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public SlidingTabLayout f42357b0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f42349d0 = {Reflection.property1(new PropertyReference1Impl(QuoteSpotFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentSpotMarketBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f42348c0 = new Companion(null);

    /* JADX INFO: compiled from: QuoteSpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "ALL_CONCEPT", "newInstance", "Lcom/kubi/quotefacade/market/spot/QuoteSpotFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final QuoteSpotFragment newInstance() {
            return new QuoteSpotFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.spot.QuoteSpotFragment$a */
    /* JADX INFO: compiled from: QuoteSpotFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/market/spot/QuoteSpotFragment$initViewPage$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22407a extends C45938b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4651a0 f42359b;

        public C22407a(C4651a0 c4651a0) {
            this.f42359b = c4651a0;
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) throws JSONException {
            super.mo18273b(i11);
            C44128b.m97266j(QuoteSpotFragment.this.getTAG(), "onTabSelect position=" + i11);
            if (i11 >= 0 && i11 <= QuoteSpotFragment.this.f42354Y.size() - 1) {
                JSONObject jSONObject = new JSONObject();
                C4651a0 c4651a0 = this.f42359b;
                QuoteSpotFragment quoteSpotFragment = QuoteSpotFragment.this;
                jSONObject.put("postType", c4651a0.f4198d.f4375c.getText());
                jSONObject.put("name", quoteSpotFragment.f42354Y.get(i11));
                Unit unit = Unit.INSTANCE;
                C43852m.m96589a("B5SpotsMarkets", "Tab", "2", jSONObject);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: D3 */
    public final Object m52606D3(String str, List<SpotLevel2> list, int i11, Continuation<? super Unit> continuation) {
        QuoteSpotFragment$updateAdapter$1 quoteSpotFragment$updateAdapter$1;
        if (continuation instanceof QuoteSpotFragment$updateAdapter$1) {
            quoteSpotFragment$updateAdapter$1 = (QuoteSpotFragment$updateAdapter$1) continuation;
            int i12 = quoteSpotFragment$updateAdapter$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                quoteSpotFragment$updateAdapter$1.label = i12 - Integer.MIN_VALUE;
            } else {
                quoteSpotFragment$updateAdapter$1 = new QuoteSpotFragment$updateAdapter$1(this, continuation);
            }
        } else {
            quoteSpotFragment$updateAdapter$1 = new QuoteSpotFragment$updateAdapter$1(this, continuation);
        }
        QuoteSpotFragment$updateAdapter$1 quoteSpotFragment$updateAdapter$2 = quoteSpotFragment$updateAdapter$1;
        Object obj = quoteSpotFragment$updateAdapter$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = quoteSpotFragment$updateAdapter$2.label;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(obj);
                C44128b.m97266j(getTAG(), "updateAdapter start");
                ViewPager2 viewPager2 = this.f42356a0;
                if (viewPager2 == null) {
                    return Unit.INSTANCE;
                }
                SlidingTabLayout slidingTabLayout = this.f42357b0;
                if (slidingTabLayout == null) {
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                QuoteSpotFragment$updateAdapter$2 quoteSpotFragment$updateAdapter$3 = new QuoteSpotFragment$updateAdapter$2(viewPager2, list, this, i11, slidingTabLayout, str, null);
                quoteSpotFragment$updateAdapter$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteSpotFragment$updateAdapter$2.L$1 = SpillingKt.nullOutSpilledVariable(list);
                quoteSpotFragment$updateAdapter$2.L$2 = SpillingKt.nullOutSpilledVariable(viewPager2);
                quoteSpotFragment$updateAdapter$2.L$3 = SpillingKt.nullOutSpilledVariable(slidingTabLayout);
                quoteSpotFragment$updateAdapter$2.I$0 = i11;
                quoteSpotFragment$updateAdapter$2.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, quoteSpotFragment$updateAdapter$3, quoteSpotFragment$updateAdapter$2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e11) {
            if (e11 instanceof CancellationException) {
                return Unit.INSTANCE;
            }
            C37266a.m83411b(e11, "QuoteSpotFragmentUpdateAdapterException");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    private final void m52619x3() {
        ImageView imageView;
        BaseTextView baseTextView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38357g.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC38357g) objM56186h).m86551b(m52623w3());
            return;
        }
        if (C46392a.m102322d(new StorageId("mmkv.default", "ll_float_guide", null, false, 12, null), false)) {
            C4651a0 c4651a0M52623w3 = m52623w3();
            if (c4651a0M52623w3 == null || (linearLayout2 = c4651a0M52623w3.f4197c) == null) {
                return;
            }
            ViewExtKt.m66577h(linearLayout2);
            return;
        }
        C4651a0 c4651a0M52623w4 = m52623w3();
        if (c4651a0M52623w4 != null && (linearLayout = c4651a0M52623w4.f4197c) != null) {
            ViewExtKt.m66594y(linearLayout);
        }
        C4651a0 c4651a0M52623w5 = m52623w3();
        if (c4651a0M52623w5 != null && (baseTextView = c4651a0M52623w5.f4199e) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.quotefacade.market.spot.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteSpotFragment.m52620y3(this.f42363b);
                }
            }, 1, null);
        }
        C4651a0 c4651a0M52623w6 = m52623w3();
        if (c4651a0M52623w6 == null || (imageView = c4651a0M52623w6.f4196b) == null) {
            return;
        }
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.quotefacade.market.spot.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteSpotFragment.m52621z3(this.f42364b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m52620y3(QuoteSpotFragment quoteSpotFragment) {
        Router.f46192a.m56184f("widget/setting").m4038a("title", quoteSpotFragment.getString(R$string.time_tracking)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m52621z3(QuoteSpotFragment quoteSpotFragment) {
        LinearLayout linearLayout;
        C46392a.m102328k(new StorageId("mmkv.default", "ll_float_guide", null, false, 12, null), true);
        C4651a0 c4651a0M52623w3 = quoteSpotFragment.m52623w3();
        if (c4651a0M52623w3 != null && (linearLayout = c4651a0M52623w3.f4197c) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
        return Unit.INSTANCE;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: E3 */
    public final void m52622E3(@NotNull BottomSheetDialogHelper.InterfaceC24339a selectItem) {
        C4673i0 c4673i0;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(selectItem, "selectItem");
        C4651a0 c4651a0M52623w3 = m52623w3();
        if (c4651a0M52623w3 != null && (c4673i0 = c4651a0M52623w3.f4198d) != null && (baseTextView = c4673i0.f4375c) != null) {
            baseTextView.setText(selectItem.getLabel());
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new QuoteSpotFragment$updateTab$1(CollectionsKt.indexOf((List<? extends BottomSheetDialogHelper.InterfaceC24339a>) this.f42352W, selectItem), this, null), 2, null);
    }

    @Override // com.kubi.quotefacade.QuoteMarketBaseFragment
    /* JADX INFO: renamed from: j3 */
    public void mo50179j3(@NotNull MarketMenuEntity marketMenuEntity) {
        List<SpotLevel1> level1;
        Intrinsics.checkNotNullParameter(marketMenuEntity, "marketMenuEntity");
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setData = ");
        SpotMenu spotMenu = marketMenuEntity.getSpotMenu();
        sb2.append((spotMenu == null || (level1 = spotMenu.getLevel1()) == null) ? null : Integer.valueOf(level1.size()));
        C44128b.m97266j(tag, sb2.toString());
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new QuoteSpotFragment$setData$1(marketMenuEntity, this, null), 2, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_spot_market, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m52604B3();
        C44128b.m97266j(getTAG(), "onViewCreated");
    }

    /* JADX INFO: renamed from: w3 */
    public final C4651a0 m52623w3() {
        return (C4651a0) this.f42350U.getValue(this, f42349d0[0]);
    }

    /* JADX INFO: renamed from: A3 */
    private final void m52603A3() {
        C4651a0 c4651a0M52623w3 = m52623w3();
        if (c4651a0M52623w3 == null) {
            return;
        }
        this.f42354Y.clear();
        this.f42356a0 = c4651a0M52623w3.f4200f;
        SlidingTabLayout slidingTabLayout = c4651a0M52623w3.f4198d.f4374b;
        this.f42357b0 = slidingTabLayout;
        if (slidingTabLayout != null) {
            slidingTabLayout.setNeedBold(true);
        }
        ViewPager2 viewPager2 = c4651a0M52623w3.f4200f;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new C37727a(childFragmentManager, lifecycle));
        c4651a0M52623w3.f4200f.setOffscreenPageLimit(1);
        c4651a0M52623w3.f4198d.f4374b.m55601z(this.f42356a0, this.f42354Y);
        c4651a0M52623w3.f4198d.f4374b.setOnTabSelectListener(new C22407a(c4651a0M52623w3));
    }

    /* JADX INFO: renamed from: B3 */
    private final void m52604B3() {
        C4651a0 c4651a0M52623w3 = m52623w3();
        if (c4651a0M52623w3 == null) {
            return;
        }
        BaseTextView ivCrypto = c4651a0M52623w3.f4198d.f4375c;
        Intrinsics.checkNotNullExpressionValue(ivCrypto, "ivCrypto");
        C27046k.m66711z(ivCrypto, 0L, new Function0() { // from class: com.kubi.quotefacade.market.spot.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteSpotFragment.m52605C3(this.f42361b);
            }
        }, 1, null);
        m52619x3();
        m52603A3();
        C44128b.m97266j(getTAG(), "initViews done");
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m52605C3(QuoteSpotFragment quoteSpotFragment) throws JSONException {
        quoteSpotFragment.m52617u3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    private final void m52617u3() throws JSONException {
        CharSequence text;
        C4673i0 c4673i0;
        BaseTextView baseTextView;
        C44128b.m97266j(getTAG(), "onclick");
        JSONObject jSONObject = new JSONObject();
        C4651a0 c4651a0M52623w3 = m52623w3();
        if (c4651a0M52623w3 != null && (c4673i0 = c4651a0M52623w3.f4198d) != null && (baseTextView = c4673i0.f4375c) != null) {
            text = baseTextView.getText();
        } else {
            text = null;
        }
        jSONObject.put("postType", text);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B5SpotsMarkets", "Type", "1", jSONObject);
        DialogFragmentHelper dialogFragmentHelperM58955P = BottomSheetDialogHelper.m58955P(BottomSheetDialogHelper.f48599a, this.f42352W, new BiConsumer() { // from class: com.kubi.quotefacade.market.spot.b
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                QuoteSpotFragment.m52618v3(this.f42362b, (Integer) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, null, false, 12, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58955P.show(childFragmentManager, "alertChooseCryptoIndex");
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m52618v3(QuoteSpotFragment quoteSpotFragment, Integer num, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws JSONException {
        Intrinsics.checkNotNull(interfaceC24339a);
        quoteSpotFragment.m52622E3(interfaceC24339a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postType", interfaceC24339a.getLabel());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5SpotsMarkets", "Type", "1", jSONObject);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        C44128b.m97266j(getTAG(), "onLoad");
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g("B5SpotsMarkets", "Tab", "1", null, 8, null);
    }
}
