package com.kubi.quotefacade.favorites;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.ViewPager;
import bv.C4698v;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.LazySimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.favorites.all.FavAllFragment;
import com.kubi.quotefacade.favorites.alpha.FavAlphaFragment;
import com.kubi.quotefacade.favorites.alpha.FavAlphaPremiumFragment;
import com.kubi.quotefacade.favorites.edit.FavEditContainerFragment;
import com.kubi.quotefacade.favorites.eft.FavEtfFragment;
import com.kubi.quotefacade.favorites.futures.FavFuturesFragment;
import com.kubi.quotefacade.favorites.spot.FavSpotFragment;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.quotefacade.market.holdings.AllHoldingsFragment;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.flyco.RankSlidingTabLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p025av.C4391b;
import p208dr.InterfaceC36952a;
import p321hv.InterfaceC38356f;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: QuoteFavoriteFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010&\u001a\u00020\u001aH\u0014J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\fH\u0002J\u0017\u00101\u001a\u0004\u0018\u00010\u001a2\u0006\u00102\u001a\u00020#H\u0002¢\u0006\u0002\u00103J\b\u00104\u001a\u00020(H\u0002J\u001a\u00105\u001a\u00020#*\b\u0012\u0004\u0012\u00020#062\u0006\u00107\u001a\u00020\u001aH\u0002J\b\u00108\u001a\u00020\fH\u0002J\b\u00109\u001a\u00020(H\u0002J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u001cH\u0002J\b\u0010<\u001a\u00020\fH\u0002J\f\u0010=\u001a\u00020>*\u00020\u0006H\u0002J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u001cH\u0002J\n\u0010A\u001a\u0004\u0018\u00010\u001cH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\"j\n\u0012\u0004\u0012\u00020#\u0018\u0001`$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\"j\b\u0012\u0004\u0012\u00020\u001c`$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/QuoteFavoriteFragment;", "Lcom/kubi/mvi/state/LazySimpleStateFragment;", "Lcom/kubi/quotefacade/favorites/FavHoldingContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentQuoteFavoriteBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentQuoteFavoriteBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "value", "", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "adapter", "Lcom/kubi/utils/InnerPagerAdapter;", "tabSelectedPosition", "", "positionType", "", "getPositionType", "()Ljava/lang/String;", "positionType$delegate", "Lkotlin/Lazy;", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "tabKeyList", "getLayout", "doOnLazyInitView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "initGuide", "initViewForHomeRank", "updateHoldingTabRedDot", TIMPushProvider.f75062n, "indexOf", "name", "(Ljava/lang/CharSequence;)Ljava/lang/Integer;", "initViewPager", "getTabTitle", "", ViewProps.POSITION, "isFavHoldingTabShow", "setCurrentItem", "getTabName", "key", "isNeedCheckHoldingTabRedDot", "tabLayout", "", "toRnTabKey", "subTabKey", "resolveAlphaInitialTab", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteFavoriteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFavoriteFragment.kt\ncom/kubi/quotefacade/favorites/QuoteFavoriteFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 8 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,469:1\n147#2,16:470\n25#3,3:486\n1#4:489\n135#5,2:490\n1869#6,2:492\n35#7,4:494\n39#7:500\n44#8,2:498\n*S KotlinDebug\n*F\n+ 1 QuoteFavoriteFragment.kt\ncom/kubi/quotefacade/favorites/QuoteFavoriteFragment\n*L\n87#1:470,16\n171#1:486,3\n413#1:490,2\n446#1:492,2\n344#1:494,4\n344#1:500\n344#1:498,2\n*E\n"})
public final class QuoteFavoriteFragment extends LazySimpleStateFragment<FavHoldingContract$UIState> {

    /* JADX INFO: renamed from: a0 */
    public C27103z f41691a0;

    /* JADX INFO: renamed from: b0 */
    public int f41692b0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f41689g0 = {Reflection.property1(new PropertyReference1Impl(QuoteFavoriteFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentQuoteFavoriteBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f41688f0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f41690Z = C45681e.m100799e(this, new Function1<QuoteFavoriteFragment, C4698v>() { // from class: com.kubi.quotefacade.favorites.QuoteFavoriteFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4698v invoke(@NotNull QuoteFavoriteFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM42558q3 = this.this$0.m42558q3();
            Intrinsics.checkNotNullExpressionValue(viewM42558q3, "access$getLazyFragContentView(...)");
            return C4698v.m4708a(viewM42558q3);
        }

        {
            super(1);
        }
    }, new Function1<C4698v, Unit>() { // from class: com.kubi.quotefacade.favorites.QuoteFavoriteFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4698v it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4698v c4698v) {
            invoke(c4698v);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f41693c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuoteFavoriteFragment.m51359a4(this.f41905b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public ArrayList<CharSequence> f41694d0 = new ArrayList<>();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public ArrayList<String> f41695e0 = new ArrayList<>();

    /* JADX INFO: compiled from: QuoteFavoriteFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/QuoteFavoriteFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "REFRESH_FAVOR_PAGE", "FAV_PAGE_CURRENT_POSITION", "REPORT_PAGE_TYPE_HOME", "REPORT_PAGE_TYPE_MARKET", "REPORT_PAGE_TYPE", "REPORT_SYMBOL", "EVENT_FLOAT_GUILD_CHANGE", "newInstance", "Lcom/kubi/quotefacade/favorites/QuoteFavoriteFragment;", "positionType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ QuoteFavoriteFragment newInstance$default(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return companion.newInstance(str);
        }

        @JvmStatic
        @NotNull
        public final QuoteFavoriteFragment newInstance(@Nullable String positionType) {
            QuoteFavoriteFragment quoteFavoriteFragment = new QuoteFavoriteFragment();
            Bundle bundle = new Bundle();
            bundle.putString("positionType", positionType);
            quoteFavoriteFragment.setArguments(bundle);
            return quoteFavoriteFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.QuoteFavoriteFragment$a */
    /* JADX INFO: compiled from: QuoteFavoriteFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/favorites/QuoteFavoriteFragment$initViewPager$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21933a extends ViewPager.SimpleOnPageChangeListener {
        public C21933a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            QuoteFavoriteFragment.this.f41692b0 = position;
            C44128b.m97266j(QuoteFavoriteFragment.this.getTAG(), "onPageSelected=" + position);
            QuoteFavoriteFragment quoteFavoriteFragment = QuoteFavoriteFragment.this;
            Integer numM51371P3 = quoteFavoriteFragment.m51371P3(quoteFavoriteFragment.m51369N3("holdings"));
            if (numM51371P3 != null && position == numM51371P3.intValue() && QuoteFavoriteFragment.this.m51376Z3()) {
                QuoteFavoriteFragment.this.sendIntent(new FavHoldingContract$UIIntent.CleanHoldingTabRedDot());
                QuoteFavoriteFragment.this.m51381f4(false);
            }
            QuoteFavoriteFragment quoteFavoriteFragment2 = QuoteFavoriteFragment.this;
            Integer numM51371P4 = quoteFavoriteFragment2.m51371P3(quoteFavoriteFragment2.m51369N3("alpha"));
            if (numM51371P4 != null && position == numM51371P4.intValue()) {
                C27023a.m66555b("B5MarketFavoritesAlpha", "tab", "1", null, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.QuoteFavoriteFragment$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C21934b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.QuoteFavoriteFragment$dispatchSingleEvent$1 */
    /* JADX INFO: compiled from: QuoteFavoriteFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.QuoteFavoriteFragment$dispatchSingleEvent$1", m90122f = "QuoteFavoriteFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219351 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC36952a $singleEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C219351(InterfaceC36952a interfaceC36952a, Continuation<? super C219351> continuation) {
            super(2, continuation);
            this.$singleEvent = interfaceC36952a;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuoteFavoriteFragment.this.new C219351(this.$singleEvent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C219351) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                QuoteFavoriteFragment.this.m51381f4(((C22059q0) this.$singleEvent).getF41849a());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView */
    public boolean getF18190d0() {
        return false;
    }

    /* JADX INFO: renamed from: M3 */
    private final String m51353M3() {
        return (String) this.f41693c0.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m51354R3(QuoteFavoriteFragment quoteFavoriteFragment) {
        Router.f46192a.m56184f("widget/setting").m4038a("title", quoteFavoriteFragment.getString(R$string.time_tracking)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m51355S3(QuoteFavoriteFragment quoteFavoriteFragment) {
        LinearLayout linearLayout;
        C46392a.m102328k(new StorageId("mmkv.default", "ll_float_guide", null, false, 12, null), true);
        C4698v c4698vM51368L3 = quoteFavoriteFragment.m51368L3();
        if (c4698vM51368L3 != null && (linearLayout = c4698vM51368L3.f4563e) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
        C12572a.m23695d("quote_fav_float_guild_change", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m51357W3(final QuoteFavoriteFragment quoteFavoriteFragment) {
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.quotefacade.favorites.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFavoriteFragment.m51358X3(this.f41909b);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m51360g4(QuoteFavoriteFragment quoteFavoriteFragment, boolean z11) {
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        Integer numM51371P3 = quoteFavoriteFragment.m51371P3(quoteFavoriteFragment.m51369N3("holdings"));
        if (numM51371P3 != null) {
            int iIntValue = numM51371P3.intValue();
            C44128b.m97266j(quoteFavoriteFragment.getTAG(), "[updateHoldingTabRedDot] index:" + iIntValue);
            C4698v c4698vM51368L3 = quoteFavoriteFragment.m51368L3();
            boolean z12 = false;
            if (c4698vM51368L3 != null && (noScrollQuoteViewPager = c4698vM51368L3.f4567i) != null && noScrollQuoteViewPager.getCurrentItem() == iIntValue) {
                z12 = true;
            }
            if (!z11 || z12) {
                if (C22218w1.m52123c(quoteFavoriteFragment.getArguments())) {
                    C4698v c4698vM51368L4 = quoteFavoriteFragment.m51368L3();
                    Object objM51379d4 = c4698vM51368L4 != null ? quoteFavoriteFragment.m51379d4(c4698vM51368L4) : null;
                    RankSlidingTabLayout rankSlidingTabLayout = objM51379d4 instanceof RankSlidingTabLayout ? (RankSlidingTabLayout) objM51379d4 : null;
                    if (rankSlidingTabLayout != null) {
                        rankSlidingTabLayout.m55226r(iIntValue);
                    }
                } else {
                    C4698v c4698vM51368L5 = quoteFavoriteFragment.m51368L3();
                    Object objM51379d5 = c4698vM51368L5 != null ? quoteFavoriteFragment.m51379d4(c4698vM51368L5) : null;
                    SlidingTabLayout slidingTabLayout = objM51379d5 instanceof SlidingTabLayout ? (SlidingTabLayout) objM51379d5 : null;
                    if (slidingTabLayout != null) {
                        slidingTabLayout.m55290u(iIntValue);
                    }
                }
            } else if (C22218w1.m52123c(quoteFavoriteFragment.getArguments())) {
                C4698v c4698vM51368L6 = quoteFavoriteFragment.m51368L3();
                Object objM51379d6 = c4698vM51368L6 != null ? quoteFavoriteFragment.m51379d4(c4698vM51368L6) : null;
                RankSlidingTabLayout rankSlidingTabLayout2 = objM51379d6 instanceof RankSlidingTabLayout ? (RankSlidingTabLayout) objM51379d6 : null;
                if (rankSlidingTabLayout2 != null) {
                    rankSlidingTabLayout2.m55233y(iIntValue);
                }
            } else {
                C4698v c4698vM51368L7 = quoteFavoriteFragment.m51368L3();
                Object objM51379d7 = c4698vM51368L7 != null ? quoteFavoriteFragment.m51379d4(c4698vM51368L7) : null;
                SlidingTabLayout slidingTabLayout2 = objM51379d7 instanceof SlidingTabLayout ? (SlidingTabLayout) objM51379d7 : null;
                if (slidingTabLayout2 != null) {
                    slidingTabLayout2.m55281G(iIntValue);
                }
            }
            if (z12) {
                quoteFavoriteFragment.sendIntent(new FavHoldingContract$UIIntent.CleanHoldingTabRedDot());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public final C4698v m51368L3() {
        return (C4698v) this.f41690Z.getValue(this, f41689g0[0]);
    }

    /* JADX INFO: renamed from: P3 */
    public final Integer m51371P3(CharSequence charSequence) {
        ArrayList<CharSequence> arrayList = this.f41694d0;
        if (arrayList != null) {
            return Integer.valueOf(arrayList.indexOf(charSequence));
        }
        return null;
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m51372Q3() {
        LinearLayout linearLayout;
        ImageView imageView;
        BaseTextView baseTextView;
        LinearLayout linearLayout2;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38356f.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC38356f) objM56186h).m86548b(m51368L3());
            return;
        }
        if (!C22098s0.m51729b(getArguments())) {
            C4698v c4698vM51368L3 = m51368L3();
            if (c4698vM51368L3 == null || (linearLayout = c4698vM51368L3.f4563e) == null) {
                return;
            }
            ViewExtKt.m66577h(linearLayout);
            return;
        }
        C4698v c4698vM51368L4 = m51368L3();
        if (c4698vM51368L4 != null && (linearLayout2 = c4698vM51368L4.f4563e) != null) {
            ViewExtKt.m66594y(linearLayout2);
        }
        C4698v c4698vM51368L5 = m51368L3();
        if (c4698vM51368L5 != null && (baseTextView = c4698vM51368L5.f4566h) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteFavoriteFragment.m51354R3(this.f41897b);
                }
            }, 1, null);
        }
        C4698v c4698vM51368L6 = m51368L3();
        if (c4698vM51368L6 == null || (imageView = c4698vM51368L6.f4562d) == null) {
            return;
        }
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFavoriteFragment.m51355S3(this.f41899b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m51374V3() {
        ImageView imageView;
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        NoScrollQuoteViewPager noScrollQuoteViewPager2;
        NoScrollQuoteViewPager noScrollQuoteViewPager3;
        C4698v c4698vM51368L3;
        ImageView imageView2;
        if (!IUserService.a.get().c() && (c4698vM51368L3 = m51368L3()) != null && (imageView2 = c4698vM51368L3.f4561c) != null) {
            C27046k.m66700o(imageView2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<CharSequence> arrayList2 = this.f41694d0;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f41695e0.clear();
        QuoteConfigHelper quoteConfigHelper = QuoteConfigHelper.f41987a;
        if (quoteConfigHelper.m51930j()) {
            if (quoteConfigHelper.m51929i() || quoteConfigHelper.m51927g() || quoteConfigHelper.m51926f()) {
                arrayList.add(FavAllFragment.f41705m0.newInstance(0, m51353M3()));
                ArrayList<CharSequence> arrayList3 = this.f41694d0;
                if (arrayList3 != null) {
                    arrayList3.add(m51369N3(TtmlNode.COMBINE_ALL));
                }
                this.f41695e0.add(TtmlNode.COMBINE_ALL);
            }
            if (m51375Y3()) {
                arrayList.add(AllHoldingsFragment.f42268k0.newInstance(m51353M3()));
                ArrayList<CharSequence> arrayList4 = this.f41694d0;
                if (arrayList4 != null) {
                    arrayList4.add(m51369N3("holdings"));
                }
                this.f41695e0.add("holdings");
            }
            if (quoteConfigHelper.m51929i()) {
                arrayList.add(FavSpotFragment.f41894o0.newInstance(0, m51353M3()));
                ArrayList<CharSequence> arrayList5 = this.f41694d0;
                if (arrayList5 != null) {
                    arrayList5.add(m51369N3(SearchCategory$Companion.SPOT));
                }
                this.f41695e0.add(SearchCategory$Companion.SPOT);
            }
            if (quoteConfigHelper.m51927g()) {
                arrayList.add(FavFuturesFragment.f41826o0.newInstance(0, m51353M3()));
                ArrayList<CharSequence> arrayList6 = this.f41694d0;
                if (arrayList6 != null) {
                    arrayList6.add(m51369N3(SearchCategory$Companion.FUTURES));
                }
                this.f41695e0.add(SearchCategory$Companion.FUTURES);
            }
            if (quoteConfigHelper.m51937q()) {
                if (C22218w1.m52123c(getArguments())) {
                    arrayList.add(FavAlphaPremiumFragment.f41779o0.newInstance(m51353M3()));
                } else {
                    arrayList.add(FavAlphaFragment.f41772X.newInstance(m51353M3()));
                }
                ArrayList<CharSequence> arrayList7 = this.f41694d0;
                if (arrayList7 != null) {
                    arrayList7.add(m51369N3("alpha"));
                }
                this.f41695e0.add("alpha");
            }
            if (quoteConfigHelper.m51926f()) {
                arrayList.add(FavEtfFragment.f41824o0.newInstance(0, m51353M3()));
                ArrayList<CharSequence> arrayList8 = this.f41694d0;
                if (arrayList8 != null) {
                    arrayList8.add(m51369N3("etf"));
                }
                this.f41695e0.add("etf");
            }
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        List listEmptyList = this.f41694d0;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.f41691a0 = new C27103z(childFragmentManager, arrayList, listEmptyList);
        C4698v c4698vM51368L4 = m51368L3();
        if (c4698vM51368L4 != null && (noScrollQuoteViewPager3 = c4698vM51368L4.f4567i) != null) {
            C27103z c27103z = this.f41691a0;
            if (c27103z == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                c27103z = null;
            }
            noScrollQuoteViewPager3.setAdapter(c27103z);
        }
        if (C22218w1.m52123c(getArguments())) {
            C4698v c4698vM51368L5 = m51368L3();
            Object objM51379d4 = c4698vM51368L5 != null ? m51379d4(c4698vM51368L5) : null;
            RankSlidingTabLayout rankSlidingTabLayout = objM51379d4 instanceof RankSlidingTabLayout ? (RankSlidingTabLayout) objM51379d4 : null;
            if (rankSlidingTabLayout != null) {
                rankSlidingTabLayout.setNeedBold(true);
            }
            if (rankSlidingTabLayout != null) {
                rankSlidingTabLayout.setUnderlineIgnorePadding(true);
            }
            if (rankSlidingTabLayout != null) {
                C4698v c4698vM51368L6 = m51368L3();
                rankSlidingTabLayout.setViewPager(c4698vM51368L6 != null ? c4698vM51368L6.f4567i : null);
            }
        } else {
            C4698v c4698vM51368L7 = m51368L3();
            Object objM51379d5 = c4698vM51368L7 != null ? m51379d4(c4698vM51368L7) : null;
            SlidingTabLayout slidingTabLayout = objM51379d5 instanceof SlidingTabLayout ? (SlidingTabLayout) objM51379d5 : null;
            if (slidingTabLayout != null) {
                slidingTabLayout.setNeedBold(true);
            }
            if (slidingTabLayout != null) {
                slidingTabLayout.setUnderlineIgnorePadding(true);
            }
            if (slidingTabLayout != null) {
                C4698v c4698vM51368L8 = m51368L3();
                slidingTabLayout.setViewPager(c4698vM51368L8 != null ? c4698vM51368L8.f4567i : null);
            }
        }
        C4698v c4698vM51368L9 = m51368L3();
        if (c4698vM51368L9 != null && (noScrollQuoteViewPager2 = c4698vM51368L9.f4567i) != null) {
            noScrollQuoteViewPager2.setOffscreenPageLimit(arrayList.size());
        }
        m51378c4();
        C4698v c4698vM51368L10 = m51368L3();
        if (c4698vM51368L10 != null && (noScrollQuoteViewPager = c4698vM51368L10.f4567i) != null) {
            noScrollQuoteViewPager.addOnPageChangeListener(new C21933a());
        }
        C4698v c4698vM51368L11 = m51368L3();
        if (c4698vM51368L11 == null || (imageView = c4698vM51368L11.f4561c) == null) {
            return;
        }
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFavoriteFragment.m51357W3(this.f41907b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m51375Y3() {
        return QuoteConfigHelper.f41987a.m51934n() && !C22218w1.m52123c(getArguments());
    }

    /* JADX INFO: renamed from: c4 */
    public final void m51378c4() {
        C4698v c4698vM51368L3;
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        C4391b c4391b = C4391b.f3820a;
        Integer numM51371P3 = m51371P3(m51369N3(c4391b.m4004b()));
        int iIntValue = numM51371P3 != null ? numM51371P3.intValue() : -1;
        if (iIntValue >= 0 && (c4698vM51368L3 = m51368L3()) != null && (noScrollQuoteViewPager = c4698vM51368L3.f4567i) != null) {
            noScrollQuoteViewPager.setCurrentItem(iIntValue);
        }
        c4391b.m4009g("");
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C22059q0) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C219351(singleEvent, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final String m51380e4(String str) {
        return Intrinsics.areEqual(str, "etf") ? TtmlNode.COMBINE_ALL : str;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m51381f4(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFavoriteFragment.m51360g4(this.f41902b, z11);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_quote_favorite;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<FavHoldingContract$UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FavHoldingsViewModel.class);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m51356U3() {
        C21938a1.m51383b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m51358X3(QuoteFavoriteFragment quoteFavoriteFragment) {
        Object objM20457a;
        Context context = quoteFavoriteFragment.getContext();
        if (context != null) {
            CharSequence charSequenceM51370O3 = null;
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C21934b().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("market_fav_edit_rn_enable", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            if (C27025c.m66567e((Boolean) objM20457a, false)) {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(quoteFavoriteFragment), null, null, new QuoteFavoriteFragment$initViewPager$2$1$1$1(quoteFavoriteFragment, null), 3, null);
            } else {
                BaseActivity.Companion companion = BaseActivity.INSTANCE;
                Bundle bundle = new Bundle();
                bundle.putString("title", quoteFavoriteFragment.getString(R$string.market_favorites_edit_title));
                ArrayList<CharSequence> arrayList = quoteFavoriteFragment.f41694d0;
                if (arrayList != null) {
                    charSequenceM51370O3 = quoteFavoriteFragment.m51370O3(arrayList, quoteFavoriteFragment.f41692b0);
                }
                bundle.putString("favPageTabPosition", String.valueOf(charSequenceM51370O3));
                Unit unit = Unit.INSTANCE;
                companion.launch(context, FavEditContainerFragment.class, bundle);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final String m51359a4(QuoteFavoriteFragment quoteFavoriteFragment) {
        Bundle arguments = quoteFavoriteFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("positionType");
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: N3 */
    public final String m51369N3(String str) {
        switch (str.hashCode()) {
            case -515120624:
                if (!str.equals("holdings")) {
                    return "";
                }
                String string = getString(R$string.quote_holding_tab);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case -503567600:
                if (str.equals(SearchCategory$Companion.FUTURES)) {
                    String string2 = getString(R$string.futures);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                }
                return "";
            case 96673:
                if (str.equals(TtmlNode.COMBINE_ALL)) {
                    String string3 = getString(R$string.market_alpha_tab_all);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return string3;
                }
                return "";
            case 100759:
                if (str.equals("etf")) {
                    String string4 = getString(R$string.market_tab_etf);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    return string4;
                }
                return "";
            case 3537154:
                if (str.equals(SearchCategory$Companion.SPOT)) {
                    String string5 = getString(R$string.spot);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    return string5;
                }
                return "";
            case 92909918:
                if (!str.equals("alpha")) {
                    return "";
                }
                break;
            case 357304895:
                if (!str.equals("highlights")) {
                    return "";
                }
                break;
            default:
                return "";
        }
        String string6 = getString(R$string.market_alpha);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        return string6;
    }

    /* JADX INFO: renamed from: O3 */
    public final CharSequence m51370O3(List<? extends CharSequence> list, int i11) {
        CharSequence charSequence;
        if (!list.isEmpty()) {
            if (i11 >= 0 && i11 < list.size()) {
                charSequence = list.get(i11);
            } else {
                charSequence = (CharSequence) CollectionsKt.first((List) list);
            }
            return charSequence;
        }
        return "";
    }

    /* JADX INFO: renamed from: T3 */
    public final void m51373T3() {
        C4698v c4698vM51368L3 = m51368L3();
        if (c4698vM51368L3 == null || !C22218w1.m52123c(getArguments())) {
            return;
        }
        ImageView ivEdit = c4698vM51368L3.f4561c;
        Intrinsics.checkNotNullExpressionValue(ivEdit, "ivEdit");
        C27046k.m66700o(ivEdit);
        int i11 = 0;
        c4698vM51368L3.f4567i.setScroll(false);
        c4698vM51368L3.f4567i.setUseAnim(false);
        NoScrollQuoteViewPager viewPager = c4698vM51368L3.f4567i;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        ViewExtKt.m66578i(viewPager, C27040e.m66658b(386));
        SlidingTabLayout slidingTabLayout = null;
        RankSlidingTabLayout rankSlidingTabLayout = null;
        if (C22218w1.m52123c(getArguments())) {
            Object objM51379d4 = m51379d4(c4698vM51368L3);
            if (objM51379d4 instanceof RankSlidingTabLayout) {
                rankSlidingTabLayout = (RankSlidingTabLayout) objM51379d4;
            }
            if (rankSlidingTabLayout != null) {
                rankSlidingTabLayout.setUnderlineHeight(0.0f);
            }
            if (rankSlidingTabLayout != null) {
                rankSlidingTabLayout.setDisallowParentInterceptWhenScrollable(true);
            }
        } else {
            Object objM51379d5 = m51379d4(c4698vM51368L3);
            if (objM51379d5 instanceof SlidingTabLayout) {
                slidingTabLayout = (SlidingTabLayout) objM51379d5;
            }
            if (slidingTabLayout != null) {
                slidingTabLayout.setUnderlineHeight(0.0f);
            }
        }
        LinearLayout linearLayout = c4698vM51368L3.f4560b;
        if (linearLayout != null) {
            if (!C21938a1.m51382a()) {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        LinearLayout btnHomeRankAction = c4698vM51368L3.f4560b;
        Intrinsics.checkNotNullExpressionValue(btnHomeRankAction, "btnHomeRankAction");
        C27046k.m66711z(btnHomeRankAction, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteFavoriteFragment.m51356U3();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: Z3 */
    public final boolean m51376Z3() {
        if (!m51375Y3() || C46392a.m102322d(QuoteKV.f42044a.m52050j(), false)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b4 */
    public final String m51377b4() {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : fragments) {
            if (fragment instanceof FavAlphaFragment) {
                return ((FavAlphaFragment) fragment).m51542m3();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d4 */
    public final Object m51379d4(C4698v c4698v) {
        if (C22218w1.m52123c(getArguments())) {
            SlidingTabLayout tabLayoutQuote = c4698v.f4565g;
            Intrinsics.checkNotNullExpressionValue(tabLayoutQuote, "tabLayoutQuote");
            C27046k.m66700o(tabLayoutQuote);
            RankSlidingTabLayout rankSlidingTabLayout = c4698v.f4564f;
            Intrinsics.checkNotNull(rankSlidingTabLayout);
            return rankSlidingTabLayout;
        }
        RankSlidingTabLayout tabLayoutHome = c4698v.f4564f;
        Intrinsics.checkNotNullExpressionValue(tabLayoutHome, "tabLayoutHome");
        C27046k.m66700o(tabLayoutHome);
        SlidingTabLayout slidingTabLayout = c4698v.f4565g;
        Intrinsics.checkNotNull(slidingTabLayout);
        return slidingTabLayout;
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment
    /* JADX INFO: renamed from: o3 */
    public void mo42556o3() {
        m51374V3();
        m51373T3();
        m51372Q3();
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws JSONException {
        super.onShow();
        m51378c4();
        if (m51376Z3()) {
            sendIntent(new FavHoldingContract$UIIntent.CheckHoldingRedDot());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "v2");
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B5Markets", "TopNav", "1", jSONObject);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
    }
}
