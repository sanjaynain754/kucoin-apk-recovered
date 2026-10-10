package com.kubi.quotefacade.chain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.ViewPager;
import bv.C4662e;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.chain.favorite.ChainFavoriteFragment;
import com.kubi.quotefacade.chain.market.ChainMarketFragment;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.view.CanScrollQuoteViewPager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ChainContainerFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\r\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001eH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/ChainContainerFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment$OnActionClickListener;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentChainContainerBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentChainContainerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "timeChoose", "", "favoriteFragment", "Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteFragment;", "viewModel", "Lcom/kubi/quotefacade/chain/ChainContainerViewModel;", "getViewModel", "()Lcom/kubi/quotefacade/chain/ChainContainerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViewPager", "alertChooseTimeIndex", "getCurrentItem", "", "()Ljava/lang/Integer;", "onActionClick", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainContainerFragment.kt\ncom/kubi/quotefacade/chain/ChainContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n147#2,16:182\n76#3,7:198\n1#4:205\n*S KotlinDebug\n*F\n+ 1 ChainContainerFragment.kt\ncom/kubi/quotefacade/chain/ChainContainerFragment\n*L\n40#1:182,16\n115#1:198,7\n*E\n"})
public final class ChainContainerFragment extends BaseFragment implements ChainFavoriteFragment.InterfaceC21751a {

    /* JADX INFO: renamed from: W */
    @Nullable
    public ChainFavoriteFragment f41468W;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f41465Z = {Reflection.property1(new PropertyReference1Impl(ChainContainerFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentChainContainerBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f41464Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41466U = C45681e.m100799e(this, new Function1<ChainContainerFragment, C4662e>() { // from class: com.kubi.quotefacade.chain.ChainContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4662e invoke(@NotNull ChainContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4662e.m4636a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4662e, Unit>() { // from class: com.kubi.quotefacade.chain.ChainContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4662e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4662e c4662e) {
            invoke(c4662e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public String f41467V = TimeSelectedEnum.TIME_24_HOURS.getConstTimeTag();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f41469X = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.chain.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChainContainerFragment.m50731v3(this.f41484b);
        }
    });

    /* JADX INFO: compiled from: ChainContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/ChainContainerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/chain/ChainContainerFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final ChainContainerFragment newInstance() {
            return new ChainContainerFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.ChainContainerFragment$a */
    /* JADX INFO: compiled from: ChainContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/chain/ChainContainerFragment$initViewPager$2$1$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21740a extends ViewPager.SimpleOnPageChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4662e f41470b;

        public C21740a(C4662e c4662e) {
            this.f41470b = c4662e;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            if (position == 1) {
                C27023a.m66555b("B8FavoritesCoins", "Tab", null, null, 12, null);
                this.f41470b.f4287b.setVisibility(0);
            } else {
                C27023a.m66555b("B8LineCoins", "Tab", null, null, 12, null);
                this.f41470b.f4287b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: r3 */
    private final ChainContainerViewModel m50727r3() {
        return (ChainContainerViewModel) this.f41469X.getValue();
    }

    /* JADX INFO: renamed from: s3 */
    private final void m50728s3() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(ChainMarketFragment.f41544c0.newInstance());
        arrayList2.add(getString(R$string.quote_chain_market));
        ChainFavoriteFragment chainFavoriteFragmentNewInstance = ChainFavoriteFragment.f41489f0.newInstance();
        this.f41468W = chainFavoriteFragmentNewInstance;
        if (chainFavoriteFragmentNewInstance != null) {
            arrayList.add(chainFavoriteFragmentNewInstance);
            arrayList2.add(getString(R$string.quote_chain_fav));
        }
        C4662e c4662eM50734p3 = m50734p3();
        if (c4662eM50734p3 != null) {
            c4662eM50734p3.f4290e.setUnderlineIgnorePadding(true);
            c4662eM50734p3.f4290e.setNeedBold(true);
            CanScrollQuoteViewPager canScrollQuoteViewPager = c4662eM50734p3.f4291f;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            canScrollQuoteViewPager.setAdapter(new C27103z(childFragmentManager, arrayList, arrayList2));
            canScrollQuoteViewPager.setOffscreenPageLimit(arrayList.size());
            c4662eM50734p3.f4290e.setViewPager(canScrollQuoteViewPager);
            canScrollQuoteViewPager.addOnPageChangeListener(new C21740a(c4662eM50734p3));
            BaseTextView ivTime = c4662eM50734p3.f4289d;
            Intrinsics.checkNotNullExpressionValue(ivTime, "ivTime");
            C27046k.m66711z(ivTime, 0L, new Function0() { // from class: com.kubi.quotefacade.chain.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChainContainerFragment.m50729t3(this.f41482b);
                }
            }, 1, null);
            AppCompatImageView ivFilter = c4662eM50734p3.f4288c;
            Intrinsics.checkNotNullExpressionValue(ivFilter, "ivFilter");
            C27046k.m66711z(ivFilter, 0L, new Function0() { // from class: com.kubi.quotefacade.chain.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChainContainerFragment.m50730u3(this.f41483b);
                }
            }, 1, null);
            if (C12573b.f21598a.m23696a()) {
                "chain_filter_data_back_favorite".length();
            }
            C12572a.m23692a(this, false, new C21741x72aa867b("chain_filter_data_back_favorite", null, this, c4662eM50734p3));
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m50730u3(ChainContainerFragment chainContainerFragment) {
        ChainFilterData chainFilterData = new ChainFilterData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524287, null);
        ChainFavoriteFragment chainFavoriteFragment = chainContainerFragment.f41468W;
        chainFilterData.setChainSortType(chainFavoriteFragment != null ? chainFavoriteFragment.getF41499c0() : null);
        C27023a.m66555b("B8FavoritesCoins", "Setting", null, null, 12, null);
        QuoteExKt.m51869t("favorite", chainFilterData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final ChainContainerViewModel m50731v3(ChainContainerFragment chainContainerFragment) {
        return (ChainContainerViewModel) new ViewModelProvider(chainContainerFragment).get(ChainContainerViewModel.class);
    }

    /* JADX INFO: renamed from: n3 */
    public final void m50733n3() {
        Object next;
        ArrayList arrayList = new ArrayList();
        TimeSelectedEnum timeSelectedEnum = TimeSelectedEnum.TIME_5_MINUTES;
        String constTimeTag = timeSelectedEnum.getConstTimeTag();
        String string = getString(timeSelectedEnum.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new SelectEntity(constTimeTag, string, null, null, null, null, null, null, null, false, false, null, 4092, null));
        TimeSelectedEnum timeSelectedEnum2 = TimeSelectedEnum.TIME_1_HOUR;
        String constTimeTag2 = timeSelectedEnum2.getConstTimeTag();
        String string2 = getString(timeSelectedEnum2.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new SelectEntity(constTimeTag2, string2, null, null, null, null, null, null, null, false, false, null, 4092, null));
        TimeSelectedEnum timeSelectedEnum3 = TimeSelectedEnum.TIME_4_HOURS;
        String constTimeTag3 = timeSelectedEnum3.getConstTimeTag();
        String string3 = getString(timeSelectedEnum3.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new SelectEntity(constTimeTag3, string3, null, null, null, null, null, null, null, false, false, null, 4092, null));
        TimeSelectedEnum timeSelectedEnum4 = TimeSelectedEnum.TIME_24_HOURS;
        String constTimeTag4 = timeSelectedEnum4.getConstTimeTag();
        String string4 = getString(timeSelectedEnum4.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(new SelectEntity(constTimeTag4, string4, null, null, null, null, null, null, null, false, false, null, 4092, null));
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SelectEntity) next).getId(), this.f41467V));
        SelectEntity selectEntity = (SelectEntity) next;
        if (selectEntity != null) {
            selectEntity.setChecked(true);
        }
        DialogFragmentHelper dialogFragmentHelperM58955P = BottomSheetDialogHelper.m58955P(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.quotefacade.chain.d
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws JSONException {
                ChainContainerFragment.m50726o3(this.f41485b, (Integer) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, null, false, 12, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58955P.show(childFragmentManager, "alertChooseCryptoIndex");
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_chain_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m50727r3().m50753p(this.f41467V);
        m50728s3();
    }

    /* JADX INFO: renamed from: p3 */
    public final C4662e m50734p3() {
        return (C4662e) this.f41466U.getValue(this, f41465Z[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public static final void m50726o3(ChainContainerFragment chainContainerFragment, Integer num, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws JSONException {
        String constTimeTag;
        BaseTextView baseTextView;
        chainContainerFragment.f41467V = interfaceC24339a.getId();
        C4662e c4662eM50734p3 = chainContainerFragment.m50734p3();
        if (c4662eM50734p3 != null && (baseTextView = c4662eM50734p3.f4289d) != null) {
            baseTextView.setText(interfaceC24339a.getLabel());
        }
        TimeSelectedEnum timeSelectedEnumFindEnumByConstTag = TimeSelectedEnum.INSTANCE.findEnumByConstTag(interfaceC24339a.getId());
        if (timeSelectedEnumFindEnumByConstTag == null || (constTimeTag = timeSelectedEnumFindEnumByConstTag.getConstTimeTag()) == null) {
            constTimeTag = "";
        }
        String str = constTimeTag;
        chainContainerFragment.f41467V = str;
        C12572a.m23695d("refresh_chain_favor_page", str, 0L, 4, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", interfaceC24339a.getId());
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B8FavoritesCoins", "Time", "1", jSONObject);
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m50729t3(ChainContainerFragment chainContainerFragment) {
        chainContainerFragment.m50733n3();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.quotefacade.chain.favorite.ChainFavoriteFragment.InterfaceC21751a
    /* JADX INFO: renamed from: H1 */
    public void mo50732H1() {
        CanScrollQuoteViewPager canScrollQuoteViewPager;
        C4662e c4662eM50734p3 = m50734p3();
        if (c4662eM50734p3 != null && (canScrollQuoteViewPager = c4662eM50734p3.f4291f) != null) {
            canScrollQuoteViewPager.setCurrentItem(0);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q3 */
    public final Integer m50735q3() {
        CanScrollQuoteViewPager canScrollQuoteViewPager;
        C4662e c4662eM50734p3 = m50734p3();
        if (c4662eM50734p3 != null && (canScrollQuoteViewPager = c4662eM50734p3.f4291f) != null) {
            return Integer.valueOf(canScrollQuoteViewPager.getCurrentItem());
        }
        return null;
    }
}
