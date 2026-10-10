package com.kubi.home.v2.card;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$string;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.cardsconfig.SimpleAdapterDataObserver;
import com.kubi.home.config.HomeFeedTab;
import com.kubi.home.v2.WidgetsMapping;
import com.kubi.home.v2.container.p088ui.CustomGridLayoutManager;
import com.kubi.home.v2.container.p088ui.GridItemTouchHelper;
import com.kubi.home.v2.container.p088ui.description.CardDetailBottomSheet;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.CardStyle;
import com.kubi.sdk.DiffCallBack;
import com.kubi.sdk.RefreshCallBack;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.StartupTrace;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.wallet.api.IWalletService;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38058b;
import p294gz.InterfaceC38061e;
import p502oj.C43097b;
import p502oj.C43101f;
import p562qj.C43745a;
import p569qq.C43846g;
import p598rj.C44101e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import sj.C44510a;
import y70.C46392a;

/* JADX INFO: compiled from: CardsViewModelV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u0014J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0014J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011J\u0010\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u0006J\b\u0010'\u001a\u00020\u000bH\u0002J\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010+J\u000e\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020\u000bH\u0016J\b\u00101\u001a\u00020\u000bH\u0016J\b\u00102\u001a\u00020\u000bH\u0016J\b\u00103\u001a\u00020\u000bH\u0016J\u0010\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000fH\u0016J\u0018\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000fH\u0002J\b\u00109\u001a\u00020\u000bH\u0016J\u0010\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u00020\u000bJ\u0010\u0010>\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000fH\u0002J\u000e\u0010?\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010+J\b\u0010@\u001a\u00020\u000bH\u0002J\u0016\u0010A\u001a\u00020\u000b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u0016\u0010C\u001a\u00020\u000b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u0016\u0010E\u001a\u00020\u000b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u0006\u0010F\u001a\u00020\u0006J\u0006\u0010G\u001a\u00020\u000bJ\u0010\u0010Q\u001a\u00020\u000b2\b\u0010R\u001a\u0004\u0018\u00010SR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0012\u0010H\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0004\n\u0002\u0010IR\u000e\u0010J\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010L\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010P\u001a\u0004\bU\u0010VR\u001b\u0010X\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010P\u001a\u0004\bY\u0010VR\u001b\u0010[\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010P\u001a\u0004\b\\\u0010VR\u001b\u0010^\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010P\u001a\u0004\b_\u0010VR\u001b\u0010a\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010P\u001a\u0004\bb\u0010V¨\u0006e"}, m90084d2 = {"Lcom/kubi/home/v2/card/CardsViewModelV2;", "Landroidx/lifecycle/ViewModel;", "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$WidgetActionHandler;", "<init>", "()V", "isInEdit", "", "firstReq", "isChanged", "shimmerFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getShimmerFlow$annotations", "touchHelper", "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "cardsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getCardsLiveData", "Landroidx/lifecycle/LiveData;", "_homeFeedTitles", "", "Lcom/kubi/home/config/HomeFeedTab;", "getHomeFeedTabTitlesLiveData", "cardRegisLiveData", "getCardRegisLiveData", "dragLiveData", "getDragLiveData", "builder", "Lcom/kubi/home/v2/container/ui/GridAdapter$Builder;", "getBuilder", "()Lcom/kubi/home/v2/container/ui/GridAdapter$Builder;", "adapter", "Lcom/kubi/home/v2/container/ui/GridAdapter;", "getAdapter", "()Lcom/kubi/home/v2/container/ui/GridAdapter;", "loadCards", "loginStateChange", "setLiveDataCacheData", "pullRefresh", "Lkotlinx/coroutines/Job;", "checkBizControl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCardsDetails", "setupRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onEnterDragMode", "onExitDragMode", "onEnterEditMode", "onExitEditMode", "showCardDetail", "cardData", "changeCard", "oldData", "newData", "showAddList", "removeCard", ViewProps.POSITION, "", "removeTradingRobotCard", "addCard", "saveUserChanges", "updateUI", "appendFooterCard", "list", "appendSearchCard", "cardList", "appendFeedCard", "onBackPressed", "onLoginStateChange", "beforeShowLevel", "Ljava/lang/Integer;", "isNeedShowVipDilogChecking", "isVipDialogShow", "homeVipDialogEnable", "getHomeVipDialogEnable", "()Z", "homeVipDialogEnable$delegate", "Lkotlin/Lazy;", "checkShowVipLevelUpDialog", "activity", "Landroidx/fragment/app/FragmentActivity;", "emptyCardData", "getEmptyCardData", "()Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "emptyCardData$delegate", "searchCardData", "getSearchCardData", "searchCardData$delegate", "feedCardData", "getFeedCardData", "feedCardData$delegate", "bottomGapData", "getBottomGapData", "bottomGapData$delegate", "footerCardData", "getFooterCardData", "footerCardData$delegate", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardsViewModelV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,651:1\n1#2:652\n126#3,2:653\n360#4,7:655\n360#4,7:662\n111#5:669\n99#5:670\n35#6,4:671\n39#6:677\n35#6,4:678\n39#6:684\n44#7,2:675\n44#7,2:682\n*S KotlinDebug\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2\n*L\n327#1:653,2\n379#1:655,7\n410#1:662,7\n517#1:669\n517#1:670\n525#1:671,4\n525#1:677\n558#1:678,4\n558#1:684\n525#1:675,2\n558#1:682,2\n*E\n"})
public final class CardsViewModelV2 extends ViewModel implements GridItemTouchHelper.InterfaceC15003b {

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public static final Companion f26469p0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    public volatile boolean f26470V;

    /* JADX INFO: renamed from: W */
    public volatile boolean f26471W = true;

    /* JADX INFO: renamed from: X */
    public volatile boolean f26472X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41668m<Unit> f26473Y;

    /* JADX INFO: renamed from: Z */
    public GridItemTouchHelper<BaseCardDataV2> f26474Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<List<BaseCardDataV2>> f26475a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<List<HomeFeedTab>> f26476b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<BaseCardDataV2> f26477c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Boolean> f26478d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final C43745a.a<BaseCardDataV2> f26479e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final C43745a<BaseCardDataV2> f26480f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public volatile Integer f26481g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f26482h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f26483i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f26484j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f26485k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Lazy f26486l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final Lazy f26487m0;

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public final Lazy f26488n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final Lazy f26489o0;

    /* JADX INFO: compiled from: CardsViewModelV2.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/home/v2/card/CardsViewModelV2$Companion;", "", "<init>", "()V", "PRE_FIX", "", "EVENT_FINISH_REFRESH_LOAD", "EVENT_ADD_WIDGET", "EVENT_UPDATE_WIDGET_UI", "LIST_SPAN_COUNT", "", "ROUTER_FLUTTER_VIP_DIALOG_ANIN", "REMOTE_CONFIG_HOME_FEED", "TAG", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.CardsViewModelV2$a */
    /* JADX INFO: compiled from: CardsViewModelV2.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/v2/card/CardsViewModelV2$adapter$1$1", "Lcom/kubi/home/cardsconfig/SimpleAdapterDataObserver;", "onItemModified", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14976a extends SimpleAdapterDataObserver {
        public C14976a() {
        }

        @Override // com.kubi.home.cardsconfig.SimpleAdapterDataObserver
        /* JADX INFO: renamed from: a */
        public void mo29040a() {
            CardsViewModelV2.this.f26472X = true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.CardsViewModelV2$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C14977b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.CardsViewModelV2$c */
    /* JADX INFO: compiled from: CardsViewModelV2.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016J2\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, m90084d2 = {"com/kubi/home/v2/card/CardsViewModelV2$builder$1", "Lcom/kubi/sdk/DiffCallBack;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "areItemsTheSame", "", "oldPos", "", "oldItem", "newPos", "newItem", "areContentsTheSame", "getChangePayload", "", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14978c implements DiffCallBack<BaseCardDataV2> {
        @Override // com.kubi.sdk.DiffCallBack
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo29353a(int i11, BaseCardDataV2 oldItem, int i12, BaseCardDataV2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem == newItem;
        }

        @Override // com.kubi.sdk.DiffCallBack
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo29354c(int i11, BaseCardDataV2 oldItem, int i12, BaseCardDataV2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return newItem.getF27926j() == oldItem.getF27926j();
        }

        @Override // com.kubi.sdk.DiffCallBack
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List<Object> mo30773b(int i11, BaseCardDataV2 oldItem, int i12, BaseCardDataV2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return CollectionsKt.listOf(newItem);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.CardsViewModelV2$d */
    /* JADX INFO: compiled from: CardsViewModelV2.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/home/v2/card/CardsViewModelV2$builder$2", "Lcom/kubi/sdk/RefreshCallBack;", "onBefore", "", "onAfter", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14979d implements RefreshCallBack {
        public C14979d() {
        }

        @Override // com.kubi.sdk.RefreshCallBack
        /* JADX INFO: renamed from: b */
        public void mo30780b() {
            CardsViewModelV2.this.f26472X = true;
        }

        @Override // com.kubi.sdk.RefreshCallBack
        /* JADX INFO: renamed from: a */
        public void mo30779a() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.CardsViewModelV2$e */
    /* JADX INFO: compiled from: CardsViewModelV2.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/home/v2/card/CardsViewModelV2$checkBizControl$iStateListener$1", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/IStateListener;", "onStateUpdated", "", "state", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14980e implements InterfaceC38061e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41769w<Boolean> f26492b;

        public C14980e(InterfaceC41769w<Boolean> interfaceC41769w) {
            this.f26492b = interfaceC41769w;
        }

        @Override // p294gz.InterfaceC38061e
        /* JADX INFO: renamed from: r */
        public void mo14990r(BizControlConfigState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state == BizControlConfigState.SUCCESS) {
                this.f26492b.mo91370n(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.CardsViewModelV2$f */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C14981f extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.card.CardsViewModelV2$g */
    /* JADX INFO: compiled from: CardsViewModelV2.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/home/v2/card/CardsViewModelV2$setupRecyclerView$2", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "onChildViewAttachedToWindow", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onChildViewDetachedFromWindow", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14982g implements RecyclerView.OnChildAttachStateChangeListener {
        public C14982g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            CardsViewModelV2.this.f26473Y.mo90855d(Unit.INSTANCE);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Override // com.kubi.home.v2.container.p088ui.GridItemTouchHelper.InterfaceC15003b
    /* JADX INFO: renamed from: k0 */
    public void mo30759k0() {
        this.f26470V = false;
        List<T> data = this.f26480f0.getData();
        if (data != 0 && this.f26472X && Intrinsics.areEqual(((BaseCardDataV2) CollectionsKt.last((List) data)).getCode(), "footer")) {
            int lastIndex = CollectionsKt.getLastIndex(data);
            data.remove(lastIndex);
            this.f26480f0.notifyItemChanged(lastIndex);
        }
        this.f26478d0.postValue(Boolean.FALSE);
        ExtensionKt.m32184j(this, new CardsViewModelV2$onExitDragMode$2(this, null));
    }

    @Override // com.kubi.home.v2.container.p088ui.GridItemTouchHelper.InterfaceC15003b
    /* JADX INFO: renamed from: r0 */
    public void mo30765r0() {
        this.f26470V = true;
        this.f26472X = false;
        this.f26478d0.setValue(Boolean.TRUE);
        C46392a.m102328k(C44510a.f98560a.m98480f(), true);
    }

    @Override // com.kubi.home.v2.container.p088ui.GridItemTouchHelper.InterfaceC15003b
    /* JADX INFO: renamed from: s0 */
    public void mo30766s0() {
        this.f26470V = false;
        ExtensionKt.m32184j(this, new CardsViewModelV2$onExitEditMode$1(this, null));
    }

    @Override // com.kubi.home.v2.container.p088ui.GridItemTouchHelper.InterfaceC15003b
    /* JADX INFO: renamed from: u0 */
    public void mo30768u0() {
        this.f26470V = true;
        this.f26472X = false;
    }

    /* JADX INFO: renamed from: A0 */
    private final void m30699A0() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.card.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardsViewModelV2.m30701B0(this.f26498b);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m30701B0(CardsViewModelV2 cardsViewModelV2) {
        List<BaseCardDataV2> listM30794k = HomeCardsRepositoryV2.f26494a.m30794k();
        if (listM30794k == null) {
            return Unit.INSTANCE;
        }
        List<BaseCardDataV2> mutableList = CollectionsKt.toMutableList((Collection) listM30794k);
        cardsViewModelV2.m30744P(mutableList);
        cardsViewModelV2.m30742N(mutableList);
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            cardsViewModelV2.f26475a0.setValue(mutableList);
        } else {
            cardsViewModelV2.f26475a0.postValue(mutableList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m30704D0(CardsViewModelV2 cardsViewModelV2, BaseCardDataV2 oldData, BaseCardDataV2 newData) {
        Intrinsics.checkNotNullParameter(oldData, "oldData");
        Intrinsics.checkNotNullParameter(newData, "newData");
        C44128b.m97259c("CardsViewModelV2", "[setupRecyclerView] quick change: " + oldData.getStyle() + " -> " + newData.getStyle());
        cardsViewModelV2.m30745R(oldData, newData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m30706E0(CardsViewModelV2 cardsViewModelV2, BaseCardDataV2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cardsViewModelV2.m30741M(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m30708F0(BaseCardDataV2 baseCardDataV2, CardsViewModelV2 cardsViewModelV2, BaseCardDataV2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(baseCardDataV2.getStyle(), it.getStyle())) {
            cardsViewModelV2.m30745R(baseCardDataV2, it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final BaseCardDataV2 m30715Q(CardsViewModelV2 cardsViewModelV2) {
        BaseCardDataV2 baseCardDataV2 = new BaseCardDataV2("bottomGap", new CardStyle("style_1", WidgetsMapping.f26617a.m30994Q(), 0), null, null, null, false, false, null, null, 476, null);
        C43745a.a.m96372c(cardsViewModelV2.f26479e0, baseCardDataV2.getF27926j(), baseCardDataV2.getStyle().getMapping().m32263a(), null, null, 12, null);
        return baseCardDataV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: S */
    public final Object m30716S(Continuation<? super Unit> continuation) {
        CardsViewModelV2$checkBizControl$1 cardsViewModelV2$checkBizControl$1;
        C14980e c14980e;
        C14980e c14980e2;
        if (continuation instanceof CardsViewModelV2$checkBizControl$1) {
            cardsViewModelV2$checkBizControl$1 = (CardsViewModelV2$checkBizControl$1) continuation;
            int i11 = cardsViewModelV2$checkBizControl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardsViewModelV2$checkBizControl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                cardsViewModelV2$checkBizControl$1 = new CardsViewModelV2$checkBizControl$1(this, continuation);
            }
        } else {
            cardsViewModelV2$checkBizControl$1 = new CardsViewModelV2$checkBizControl$1(this, continuation);
        }
        Object obj = cardsViewModelV2$checkBizControl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cardsViewModelV2$checkBizControl$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C38058b c38058b = C38058b.f85672a;
            BizControlConfigState bizControlConfigStateM85935g = c38058b.m85935g();
            BizControlConfigState bizControlConfigState = BizControlConfigState.SUCCESS;
            if (bizControlConfigStateM85935g == bizControlConfigState) {
                return Unit.INSTANCE;
            }
            InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            c14980e = new C14980e(interfaceC41769wM91388c);
            c38058b.m85929a(c14980e);
            if (c38058b.m85935g() != bizControlConfigState) {
                cardsViewModelV2$checkBizControl$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM91388c);
                cardsViewModelV2$checkBizControl$1.L$1 = c14980e;
                cardsViewModelV2$checkBizControl$1.label = 1;
                if (interfaceC41769wM91388c.mo91198h(cardsViewModelV2$checkBizControl$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c14980e2 = c14980e;
            }
            C38058b.f85672a.m85939k(c14980e);
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c14980e2 = (C14980e) cardsViewModelV2$checkBizControl$1.L$1;
        ResultKt.throwOnFailure(obj);
        c14980e = c14980e2;
        C38058b.f85672a.m85939k(c14980e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final BaseCardDataV2 m30717U(CardsViewModelV2 cardsViewModelV2) {
        BaseCardDataV2 baseCardDataV2 = new BaseCardDataV2("empty", new CardStyle("style_1", WidgetsMapping.f26617a.m31001X(), 0), null, null, null, false, false, null, null, 476, null);
        C43745a.a.m96372c(cardsViewModelV2.f26479e0, baseCardDataV2.getF27926j(), baseCardDataV2.getStyle().getMapping().m32263a(), null, null, 12, null);
        return baseCardDataV2;
    }

    /* JADX INFO: renamed from: V */
    public static final BaseCardDataV2 m30718V(CardsViewModelV2 cardsViewModelV2) {
        BaseCardDataV2 baseCardDataV2 = new BaseCardDataV2(HomeWidgetCode.HomeFeed.getCode(), new CardStyle("style_1", WidgetsMapping.f26617a.m31006c0(), 0), null, null, null, false, false, null, null, 476, null);
        C43745a.a.m96372c(cardsViewModelV2.f26479e0, baseCardDataV2.getF27926j(), baseCardDataV2.getStyle().getMapping().m32263a(), null, null, 12, null);
        return baseCardDataV2;
    }

    /* JADX INFO: renamed from: W */
    public static final BaseCardDataV2 m30719W(CardsViewModelV2 cardsViewModelV2) {
        BaseCardDataV2 baseCardDataV2 = new BaseCardDataV2("footer", new CardStyle("style_1", WidgetsMapping.f26617a.m31004a0(), 0), null, null, null, false, false, null, null, 476, null);
        C43745a.a.m96372c(cardsViewModelV2.f26479e0, baseCardDataV2.getF27926j(), baseCardDataV2.getStyle().getMapping().m32263a(), null, null, 12, null);
        return baseCardDataV2;
    }

    /* JADX INFO: renamed from: j0 */
    public static final boolean m30723j0() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C14981f().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("home_vip_dialog", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true) && C24129b.m58030b(SiteVisibleConfigKey.Vip);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m30724m0(CardsViewModelV2 cardsViewModelV2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        cardsViewModelV2.m30760l0(z11);
    }

    /* JADX INFO: renamed from: z0 */
    public static final BaseCardDataV2 m30738z0(CardsViewModelV2 cardsViewModelV2) {
        BaseCardDataV2 baseCardDataV2 = new BaseCardDataV2(HomeWidgetCode.Search.getCode(), new CardStyle("style_1", WidgetsMapping.f26617a.m31016m0(), 1), null, null, null, false, false, null, null, 476, null);
        C43745a.a.m96372c(cardsViewModelV2.f26479e0, baseCardDataV2.getF27926j(), baseCardDataV2.getStyle().getMapping().m32263a(), null, null, 12, null);
        return baseCardDataV2;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m30739C0(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(new CustomGridLayoutManager(context, 2, this.f26480f0));
        GridItemTouchHelper<BaseCardDataV2> gridItemTouchHelper = new GridItemTouchHelper<>(this.f26480f0, this);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(gridItemTouchHelper);
        itemTouchHelper.attachToRecyclerView(recyclerView);
        gridItemTouchHelper.m30848F(itemTouchHelper);
        gridItemTouchHelper.m30849G(new Function2() { // from class: com.kubi.home.v2.card.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CardsViewModelV2.m30704D0(this.f26505b, (BaseCardDataV2) obj, (BaseCardDataV2) obj2);
            }
        });
        this.f26474Z = gridItemTouchHelper;
        this.f26480f0.m96371w(gridItemTouchHelper);
        recyclerView.setAdapter(this.f26480f0);
        recyclerView.addOnChildAttachStateChangeListener(new C14982g());
    }

    /* JADX INFO: renamed from: G0 */
    public final void m30740G0() {
        HomeCardsRepositoryV2 homeCardsRepositoryV2 = HomeCardsRepositoryV2.f26494a;
        homeCardsRepositoryV2.m30787c();
        List<BaseCardDataV2> listM30794k = homeCardsRepositoryV2.m30794k();
        List<BaseCardDataV2> mutableList = listM30794k != null ? CollectionsKt.toMutableList((Collection) listM30794k) : null;
        if (mutableList == null || mutableList.isEmpty()) {
            C43101f.f95302a.m94714h();
            this.f26475a0.postValue(CollectionsKt.mutableListOf(m30753d0()));
        } else {
            m30744P(mutableList);
            m30743O(mutableList);
            m30742N(mutableList);
            this.f26475a0.postValue(mutableList);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m30742N(List<BaseCardDataV2> list) {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C14977b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("home_feed", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        boolean zM66567e = C27025c.m66567e((Boolean) objM20457a, true);
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.HOME_FEED);
        C44128b.m97259c("CardsViewModelV2", "[appendFeedCard] config:" + zM66567e + ", site:" + zM58030b);
        if (zM66567e && zM58030b && HomeCardsRepositoryV2.f26494a.m30795l()) {
            list.add(m30754e0());
        } else {
            list.add(m30748Y());
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m30744P(List<BaseCardDataV2> list) {
        Object next;
        if (IWalletService.f54542a.get().mo66941a()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((BaseCardDataV2) next).getCode(), HomeWidgetCode.Search.getCode()));
            if (next != null) {
                return;
            }
            list.add(0, m30758i0());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m30745R(BaseCardDataV2 baseCardDataV2, BaseCardDataV2 baseCardDataV3) {
        List<T> data = this.f26480f0.getData();
        if (data != 0) {
            Iterator it = data.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (((BaseCardDataV2) it.next()) == baseCardDataV2) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                ToastCompat.m66437C(R$string.homepage_feature_save_failed);
                return;
            }
            this.f26477c0.setValue(baseCardDataV3);
            data.set(i11, baseCardDataV3);
            this.f26480f0.notifyItemChanged(i11);
            if (this.f26470V) {
                return;
            }
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CardsViewModelV2$changeCard$1$1(this, null), 3, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final C43745a<BaseCardDataV2> m30747X() {
        return this.f26480f0;
    }

    /* JADX INFO: renamed from: Y */
    public final BaseCardDataV2 m30748Y() {
        return (BaseCardDataV2) this.f26488n0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final C43745a.a<BaseCardDataV2> m30749Z() {
        return this.f26479e0;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final LiveData<BaseCardDataV2> m30750a0() {
        return this.f26477c0;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final LiveData<List<BaseCardDataV2>> m30751b0() {
        return this.f26475a0;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final MutableLiveData<Boolean> m30752c0() {
        return this.f26478d0;
    }

    /* JADX INFO: renamed from: d0 */
    public final BaseCardDataV2 m30753d0() {
        return (BaseCardDataV2) this.f26485k0.getValue();
    }

    /* JADX INFO: renamed from: e0 */
    public final BaseCardDataV2 m30754e0() {
        return (BaseCardDataV2) this.f26487m0.getValue();
    }

    /* JADX INFO: renamed from: f0 */
    public final BaseCardDataV2 m30755f0() {
        return (BaseCardDataV2) this.f26489o0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final LiveData<List<HomeFeedTab>> m30756g0() {
        return this.f26476b0;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m30757h0() {
        return ((Boolean) this.f26484j0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i0 */
    public final BaseCardDataV2 m30758i0() {
        return (BaseCardDataV2) this.f26486l0.getValue();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m30760l0(boolean z11) {
        StartupTrace startupTrace = StartupTrace.f48194a;
        startupTrace.m58450j("duration8");
        C43101f c43101f = C43101f.f95302a;
        c43101f.m94709b("home_page_start_load_data");
        C38058b c38058b = C38058b.f85672a;
        boolean zM85937i = c38058b.m85937i();
        boolean z12 = zM85937i && c38058b.m85935g() != BizControlConfigState.SUCCESS;
        boolean z13 = HomeCardsRepositoryV2.f26494a.m30792i() != null;
        if (!z13 || z12 || z11) {
            C12572a.m23695d("com.kubi.home.event.HomeEvent:shimmer_show", Boolean.TRUE, 0L, 4, null);
        }
        if (z13 && !z12 && (this.f26471W || z11)) {
            c43101f.m94709b("home_page_widget_use_cache");
            startupTrace.m58450j("duration9");
            m30699A0();
        }
        ExtensionKt.m32184j(this, new CardsViewModelV2$loadCards$1(this, zM85937i, null));
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m30762o0() {
        GridItemTouchHelper<BaseCardDataV2> gridItemTouchHelper = this.f26474Z;
        if (gridItemTouchHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("touchHelper");
            gridItemTouchHelper = null;
        }
        return gridItemTouchHelper.m30846D();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m30763p0() {
        GridItemTouchHelper<BaseCardDataV2> gridItemTouchHelper = this.f26474Z;
        if (gridItemTouchHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("touchHelper");
            gridItemTouchHelper = null;
        }
        HomeCardsRepositoryV2 homeCardsRepositoryV2 = HomeCardsRepositoryV2.f26494a;
        gridItemTouchHelper.m30854Q(homeCardsRepositoryV2.m30800r());
        homeCardsRepositoryV2.m30788d();
        homeCardsRepositoryV2.m30787c();
        m30760l0(true);
    }

    @Override // com.kubi.home.v2.container.p088ui.GridItemTouchHelper.InterfaceC15003b
    /* JADX INFO: renamed from: t0 */
    public void mo30767t0(int i11) {
        List<T> data = this.f26480f0.getData();
        if (data != 0) {
        }
        this.f26480f0.notifyItemRemoved(i11);
    }

    @Override // com.kubi.home.v2.container.p088ui.GridItemTouchHelper.InterfaceC15003b
    /* JADX INFO: renamed from: v0 */
    public void mo30769v0() {
        C44101e.f97359a.m97176e(this.f26480f0, new Function1() { // from class: com.kubi.home.v2.card.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardsViewModelV2.m30706E0(this.f26499b, (BaseCardDataV2) obj);
            }
        });
    }

    @Override // com.kubi.home.v2.container.p088ui.GridItemTouchHelper.InterfaceC15003b
    /* JADX INFO: renamed from: w0 */
    public void mo30770w0(@NotNull final BaseCardDataV2 cardData) {
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        CardDetailBottomSheet cardDetailBottomSheet = CardDetailBottomSheet.f26550a;
        RecyclerView f96711w = this.f26480f0.getF96711w();
        cardDetailBottomSheet.m30887m(cardData, f96711w != null ? f96711w.getContext() : null, new Function1() { // from class: com.kubi.home.v2.card.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardsViewModelV2.m30708F0(cardData, this, (BaseCardDataV2) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final void m30771x0() {
        List<T> data = this.f26480f0.getData();
        int i11 = -1;
        if (data != 0) {
            Iterator it = data.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((BaseCardDataV2) it.next()).getCode(), HomeWidgetCode.TradingRobot.getCode())) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 < 0) {
            return;
        }
        List<T> data2 = this.f26480f0.getData();
        if (data2 != 0) {
        }
        this.f26480f0.notifyItemRemoved(i11);
    }

    public CardsViewModelV2() {
        InterfaceC41668m<Unit> interfaceC41668mM91001b = C41674s.m91001b(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        C41636g.m90891O(C41636g.m90896T(C41636g.m90937t(interfaceC41668mM91001b, 1000L), new CardsViewModelV2$shimmerFlow$1$1(this, null)), ViewModelKt.getViewModelScope(this));
        this.f26473Y = interfaceC41668mM91001b;
        this.f26475a0 = new MutableLiveData<>();
        this.f26476b0 = new MutableLiveData<>();
        this.f26477c0 = new MutableLiveData<>();
        this.f26478d0 = new MutableLiveData<>();
        C43745a.a<BaseCardDataV2> aVarM96376e = new C43745a.a().m96375d(new C14978c()).m96376e(new C14979d());
        this.f26479e0 = aVarM96376e;
        C43745a<T> c43745aM96373a = aVarM96376e.m96373a();
        c43745aM96373a.registerAdapterDataObserver(new C14976a());
        this.f26480f0 = c43745aM96373a;
        this.f26484j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.card.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CardsViewModelV2.m30723j0());
            }
        });
        this.f26485k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.card.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardsViewModelV2.m30717U(this.f26500b);
            }
        });
        this.f26486l0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.card.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardsViewModelV2.m30738z0(this.f26501b);
            }
        });
        this.f26487m0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.card.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardsViewModelV2.m30718V(this.f26502b);
            }
        });
        this.f26488n0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.card.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardsViewModelV2.m30715Q(this.f26503b);
            }
        });
        this.f26489o0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.card.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardsViewModelV2.m30719W(this.f26504b);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m30741M(BaseCardDataV2 baseCardDataV2) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94121c(), null, new CardsViewModelV2$addCard$1(baseCardDataV2, this, null), 2, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m30743O(List<BaseCardDataV2> list) {
        if (list.size() - C15000n.m30812b(list) <= 2) {
            if (HomeCardsRepositoryV2.f26494a.m30800r() && !Intrinsics.areEqual(CollectionsKt.last((List) list), m30755f0())) {
                list.add(m30755f0());
                return;
            }
            return;
        }
        list.remove(m30755f0());
    }

    /* JADX INFO: renamed from: T */
    public final void m30746T(@Nullable FragmentActivity fragmentActivity) {
        if (m30757h0() && IUserService.a.get().c()) {
            if (!this.f26482h0 && !this.f26483i0) {
                this.f26482h0 = true;
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CardsViewModelV2$checkShowVipLevelUpDialog$1(fragmentActivity, this, null), 3, null);
                return;
            }
            return;
        }
        C43097b c43097b = C43097b.f95298a;
        c43097b.m94701d(fragmentActivity);
        c43097b.m94702e(fragmentActivity);
    }

    /* JADX INFO: renamed from: n0 */
    public final Object m30761n0(Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new CardsViewModelV2$loadCardsDetails$2(this, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC41775x1 m30764q0() {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CardsViewModelV2$pullRefresh$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m30772y0(Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new CardsViewModelV2$saveUserChanges$2(this, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
