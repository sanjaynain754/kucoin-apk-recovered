package com.kubi.quotefacade.market.futures;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.widget.ViewPager2;
import bv.C4673i0;
import bv.C4692s;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.entity.ContractOpenNotice;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.QuoteMarketBaseFragment;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.FutureLevel1;
import com.kubi.quotefacade.entity.FutureLevel2;
import com.kubi.quotefacade.entity.FutureMenu;
import com.kubi.quotefacade.entity.MarketMenuEntity;
import com.kubi.quotefacade.helper.NoticeHelper;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
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

/* JADX INFO: compiled from: QuoteFuturesFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0016J\u0010\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020%H\u0002J\b\u0010-\u001a\u00020%H\u0002J\b\u0010.\u001a\u00020%H\u0002J\b\u0010/\u001a\u00020%H\u0002J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0007J,\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\u00172\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u000209H\u0082@¢\u0006\u0002\u0010:R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;", "Lcom/kubi/quotefacade/QuoteMarketBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentFutureMarketBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentFutureMarketBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "noticeView", "Landroid/view/View;", "futureLevel1", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/quotefacade/entity/FutureLevel1;", "alertSheetItem", "", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "wsList", "", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "tabLayout", "Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;", "ALL_CONCEPT", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "setData", "marketMenuEntity", "Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "initViews", "tryShowNoticeView", "initViewPage", "alertChooseCryptoIndex", "updateTab", "selectItem", "Lcom/kubi/sdk/widget/dialog/BottomSheetDialogHelper$SelectItem;", "updateAdapter", "quoteCrypto", "list", "", "Lcom/kubi/quotefacade/entity/FutureLevel2;", "selectIndex", "", "(Ljava/lang/String;Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFuturesFragment.kt\ncom/kubi/quotefacade/market/futures/QuoteFuturesFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,321:1\n147#2,16:322\n84#3:338\n75#3,2:347\n1#4:339\n45#5,7:340\n*S KotlinDebug\n*F\n+ 1 QuoteFuturesFragment.kt\ncom/kubi/quotefacade/market/futures/QuoteFuturesFragment\n*L\n57#1:322,16\n158#1:338\n177#1:347,2\n318#1:340,7\n*E\n"})
public final class QuoteFuturesFragment extends QuoteMarketBaseFragment {

    /* JADX INFO: renamed from: V */
    @Nullable
    public View f42239V;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public ViewPager2 f42244a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public SlidingTabLayout f42245b0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f42237e0 = {Reflection.property1(new PropertyReference1Impl(QuoteFuturesFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentFutureMarketBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f42236d0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f42238U = C45681e.m100799e(this, new Function1<QuoteFuturesFragment, C4692s>() { // from class: com.kubi.quotefacade.market.futures.QuoteFuturesFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4692s invoke(@NotNull QuoteFuturesFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4692s.m4696a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4692s, Unit>() { // from class: com.kubi.quotefacade.market.futures.QuoteFuturesFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4692s it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4692s c4692s) {
            invoke(c4692s);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CopyOnWriteArrayList<FutureLevel1> f42240W = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final List<SelectEntity> f42241X = new ArrayList();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final ArrayList<CharSequence> f42242Y = new ArrayList<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final CopyOnWriteArrayList<String> f42243Z = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final String f42246c0 = "ALL";

    /* JADX INFO: compiled from: QuoteFuturesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/quotefacade/market/futures/QuoteFuturesFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final QuoteFuturesFragment newInstance() {
            return new QuoteFuturesFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.futures.QuoteFuturesFragment$a */
    /* JADX INFO: compiled from: QuoteFuturesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/market/futures/QuoteFuturesFragment$initViewPage$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22308a extends C45938b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4692s f42248b;

        public C22308a(C4692s c4692s) {
            this.f42248b = c4692s;
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) throws JSONException {
            super.mo18273b(i11);
            C44128b.m97266j(QuoteFuturesFragment.this.getTAG(), "onTabSelect position=" + i11);
            if (i11 >= 0 && i11 <= QuoteFuturesFragment.this.f42242Y.size() - 1) {
                JSONObject jSONObject = new JSONObject();
                C4692s c4692s = this.f42248b;
                QuoteFuturesFragment quoteFuturesFragment = QuoteFuturesFragment.this;
                jSONObject.put("postType", c4692s.f4525c.f4375c.getText());
                jSONObject.put("name", quoteFuturesFragment.f42242Y.get(i11));
                Unit unit = Unit.INSTANCE;
                C43852m.m96589a("B6FuturesMarkets", "Tab", "2", jSONObject);
            }
        }
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m52411G3(ContractOpenNotice contractOpenNotice, QuoteFuturesFragment quoteFuturesFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String link = contractOpenNotice.getLink();
        if (link != null && link.length() != 0) {
            Router router = Router.f46192a;
            String link2 = contractOpenNotice.getLink();
            Intrinsics.checkNotNull(link2);
            router.m56184f(link2).m4048k();
        }
        String pageId = quoteFuturesFragment.getPageId();
        if (pageId == null) {
            pageId = "B5Markets";
        }
        C43852m.m96591c(pageId, "ContractListAd", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m52412H3(View view, ContractOpenNotice contractOpenNotice, QuoteFuturesFragment quoteFuturesFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewExtKt.m66577h(view);
        C46392a.m102330m(QuoteKV.f42044a.m52046f(), C27039d.m66652l(contractOpenNotice.getStart()));
        String pageId = quoteFuturesFragment.getPageId();
        if (pageId == null) {
            pageId = "B5Markets";
        }
        C43852m.m96591c(pageId, "ContractListAd", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    private final void m52426x3() throws JSONException {
        C4673i0 c4673i0;
        BaseTextView baseTextView;
        JSONObject jSONObject = new JSONObject();
        C4692s c4692sM52431z3 = m52431z3();
        jSONObject.put("postType", (c4692sM52431z3 == null || (c4673i0 = c4692sM52431z3.f4525c) == null || (baseTextView = c4673i0.f4375c) == null) ? null : baseTextView.getText());
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B6FuturesMarkets", "Type", "1", jSONObject);
        DialogFragmentHelper dialogFragmentHelperM58955P = BottomSheetDialogHelper.m58955P(BottomSheetDialogHelper.f48599a, this.f42241X, new BiConsumer() { // from class: com.kubi.quotefacade.market.futures.h
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                QuoteFuturesFragment.m52427y3(this.f42262b, (Integer) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, null, false, 12, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58955P.show(childFragmentManager, "alertChooseCryptoIndex");
    }

    /* JADX INFO: renamed from: E3 */
    public final void m52428E3() {
        final ContractOpenNotice contractOpenNoticeMo33287p = BQuoteFacadeDepend.f42592a.m53023c().mo33287p();
        if (C27039d.m66652l(contractOpenNoticeMo33287p.getStart()) <= C46392a.m102324f(QuoteKV.f42044a.m52046f(), 0L) || NoticeHelper.f42099a.m52111a()) {
            return;
        }
        if (this.f42239V == null) {
            String pageId = getPageId();
            if (pageId == null) {
                pageId = "B5Markets";
            }
            C43852m.m96595g(pageId, "ContractListAd", null, null, 12, null);
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.market.futures.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFuturesFragment.m52410F3(this.f42256b);
            }
        });
        final View view = this.f42239V;
        if (view != null) {
            view.setVisibility(0);
            int i11 = R$id.notice;
            ((AppCompatTextView) view.findViewById(i11)).setText(contractOpenNoticeMo33287p.getContent());
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i11);
            if (appCompatTextView != null) {
                ViewExtKt.m66575f(appCompatTextView, new Function1() { // from class: com.kubi.quotefacade.market.futures.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuoteFuturesFragment.m52411G3(contractOpenNoticeMo33287p, this, (View) obj);
                    }
                });
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R$id.close);
            if (appCompatImageView != null) {
                ViewExtKt.m66575f(appCompatImageView, new Function1() { // from class: com.kubi.quotefacade.market.futures.g
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuoteFuturesFragment.m52412H3(view, contractOpenNoticeMo33287p, this, (View) obj);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: I3 */
    public final Object m52429I3(String str, List<FutureLevel2> list, int i11, Continuation<? super Unit> continuation) {
        QuoteFuturesFragment$updateAdapter$1 quoteFuturesFragment$updateAdapter$1;
        if (continuation instanceof QuoteFuturesFragment$updateAdapter$1) {
            quoteFuturesFragment$updateAdapter$1 = (QuoteFuturesFragment$updateAdapter$1) continuation;
            int i12 = quoteFuturesFragment$updateAdapter$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                quoteFuturesFragment$updateAdapter$1.label = i12 - Integer.MIN_VALUE;
            } else {
                quoteFuturesFragment$updateAdapter$1 = new QuoteFuturesFragment$updateAdapter$1(this, continuation);
            }
        } else {
            quoteFuturesFragment$updateAdapter$1 = new QuoteFuturesFragment$updateAdapter$1(this, continuation);
        }
        QuoteFuturesFragment$updateAdapter$1 quoteFuturesFragment$updateAdapter$2 = quoteFuturesFragment$updateAdapter$1;
        Object obj = quoteFuturesFragment$updateAdapter$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = quoteFuturesFragment$updateAdapter$2.label;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(obj);
                C44128b.m97266j(getTAG(), "updateAdapter start");
                ViewPager2 viewPager2 = this.f42244a0;
                if (viewPager2 == null) {
                    return Unit.INSTANCE;
                }
                SlidingTabLayout slidingTabLayout = this.f42245b0;
                if (slidingTabLayout == null) {
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                QuoteFuturesFragment$updateAdapter$2 quoteFuturesFragment$updateAdapter$3 = new QuoteFuturesFragment$updateAdapter$2(viewPager2, list, this, i11, slidingTabLayout, str, null);
                quoteFuturesFragment$updateAdapter$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteFuturesFragment$updateAdapter$2.L$1 = SpillingKt.nullOutSpilledVariable(list);
                quoteFuturesFragment$updateAdapter$2.L$2 = SpillingKt.nullOutSpilledVariable(viewPager2);
                quoteFuturesFragment$updateAdapter$2.L$3 = SpillingKt.nullOutSpilledVariable(slidingTabLayout);
                quoteFuturesFragment$updateAdapter$2.I$0 = i11;
                quoteFuturesFragment$updateAdapter$2.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, quoteFuturesFragment$updateAdapter$3, quoteFuturesFragment$updateAdapter$2) == coroutine_suspended) {
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
            C37266a.m83411b(e11, "QuoteFuturesFragmentUpdateAdapterException");
        }
        return Unit.INSTANCE;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: J3 */
    public final void m52430J3(@NotNull BottomSheetDialogHelper.InterfaceC24339a selectItem) {
        C4673i0 c4673i0;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(selectItem, "selectItem");
        C4692s c4692sM52431z3 = m52431z3();
        if (c4692sM52431z3 != null && (c4673i0 = c4692sM52431z3.f4525c) != null && (baseTextView = c4673i0.f4375c) != null) {
            baseTextView.setText(selectItem.getLabel());
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new QuoteFuturesFragment$updateTab$1(CollectionsKt.indexOf((List<? extends BottomSheetDialogHelper.InterfaceC24339a>) this.f42241X, selectItem), this, null), 2, null);
    }

    @Override // com.kubi.quotefacade.QuoteMarketBaseFragment
    /* JADX INFO: renamed from: j3 */
    public void mo50179j3(@NotNull MarketMenuEntity marketMenuEntity) {
        List<FutureLevel1> level1;
        Intrinsics.checkNotNullParameter(marketMenuEntity, "marketMenuEntity");
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setData = ");
        FutureMenu futureMenu = marketMenuEntity.getFutureMenu();
        sb2.append((futureMenu == null || (level1 = futureMenu.getLevel1()) == null) ? null : Integer.valueOf(level1.size()));
        C44128b.m97266j(tag, sb2.toString());
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new QuoteFuturesFragment$setData$1(marketMenuEntity, this, null), 2, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_future_market, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m52407B3();
        C44128b.m97266j(getTAG(), "onViewCreated");
    }

    /* JADX INFO: renamed from: z3 */
    public final C4692s m52431z3() {
        return (C4692s) this.f42238U.getValue(this, f42237e0[0]);
    }

    /* JADX INFO: renamed from: A3 */
    private final void m52406A3() {
        C4692s c4692sM52431z3 = m52431z3();
        if (c4692sM52431z3 == null) {
            return;
        }
        this.f42242Y.clear();
        this.f42244a0 = c4692sM52431z3.f4526d;
        SlidingTabLayout slidingTabLayout = c4692sM52431z3.f4525c.f4374b;
        this.f42245b0 = slidingTabLayout;
        if (slidingTabLayout != null) {
            slidingTabLayout.setNeedBold(true);
        }
        ViewPager2 viewPager2 = c4692sM52431z3.f4526d;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new C37727a(childFragmentManager, lifecycle));
        c4692sM52431z3.f4526d.setOffscreenPageLimit(1);
        c4692sM52431z3.f4525c.f4374b.m55601z(this.f42244a0, this.f42242Y);
        c4692sM52431z3.f4525c.f4374b.setOnTabSelectListener(new C22308a(c4692sM52431z3));
    }

    /* JADX INFO: renamed from: B3 */
    private final void m52407B3() {
        C4692s c4692sM52431z3 = m52431z3();
        if (c4692sM52431z3 == null) {
            return;
        }
        BaseTextView ivCrypto = c4692sM52431z3.f4525c.f4375c;
        Intrinsics.checkNotNullExpressionValue(ivCrypto, "ivCrypto");
        C27046k.m66711z(ivCrypto, 0L, new Function0() { // from class: com.kubi.quotefacade.market.futures.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFuturesFragment.m52408C3(this.f42254b);
            }
        }, 1, null);
        BQuoteFacadeDepend.f42592a.m53023c().mo33272W(this);
        m52406A3();
        C44128b.m97266j(getTAG(), "initViews done");
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m52408C3(QuoteFuturesFragment quoteFuturesFragment) throws JSONException {
        quoteFuturesFragment.m52426x3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m52409D3(QuoteFuturesFragment quoteFuturesFragment) {
        quoteFuturesFragment.m52428E3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m52410F3(QuoteFuturesFragment quoteFuturesFragment) {
        quoteFuturesFragment.f42239V = ((ViewStub) quoteFuturesFragment.requireView().findViewById(R$id.viewStub)).inflate();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m52427y3(QuoteFuturesFragment quoteFuturesFragment, Integer num, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws JSONException {
        Intrinsics.checkNotNull(interfaceC24339a);
        quoteFuturesFragment.m52430J3(interfaceC24339a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postType", interfaceC24339a.getLabel());
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B6FuturesMarkets", "Type", "1", jSONObject);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.quotefacade.market.futures.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFuturesFragment.m52409D3(this.f42255b);
            }
        });
        C44128b.m97266j(getTAG(), "onLoad");
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g("B6FuturesMarkets", "Tab", "1", null, 8, null);
    }
}
