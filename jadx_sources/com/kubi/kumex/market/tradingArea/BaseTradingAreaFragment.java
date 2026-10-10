package com.kubi.kumex.market.tradingArea;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.platform.model.ContractNotice;
import com.kubi.kumex.data.platform.model.NoticeConfig;
import com.kubi.kumex.helper.NoticeHelper;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.Log;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p274fx.C37727a;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: BaseTradingAreaFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 D*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u0007:\u0001DB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010'\u001a\u00020(H&J(\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0011H&J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0004J\u001e\u00102\u001a\u0002012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0018042\u0006\u00105\u001a\u00020\u0011H\u0004J\u001c\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011072\u0006\u0010,\u001a\u00020\u0018H\u0002J\u0016\u00108\u001a\u0002012\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u0011J\u000e\u0010;\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u000bJ.\u0010<\u001a\u0002012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>2\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u000201\u0018\u00010AH\u0014J\n\u0010B\u001a\u0004\u0018\u00010(H\u0004J\u0018\u0010C\u001a\u0002012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0017j\b\u0012\u0004\u0012\u00020\u001d`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010$\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00110%j\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0011`&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/BaseTradingAreaFragment;", "I", "Lcom/kubi/mvi/state/IIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "VM", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/mvi/state/BaseStateFragment;", "<init>", "()V", "sortName", "", "getSortName", "()Ljava/lang/String;", "setSortName", "(Ljava/lang/String;)V", "sortType", "", "getSortType", "()I", "setSortType", "(I)V", "tradingAreas", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "Lkotlin/collections/ArrayList;", "getTradingAreas", "()Ljava/util/ArrayList;", "titleList", "", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "tabLayout", "Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;", "noticeView", "Landroid/view/View;", "sectionMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getFavoriteFragment", "Landroidx/fragment/app/Fragment;", "getChildFragment", "type", "tradingArea", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "sectionPosition", "needCatchUIException", "", "setAdapter", "", "notifyDataChanged", "list", "", "index", "getInitTradingAreaId", "Lkotlin/Pair;", "updateSectionMap", "id", ViewProps.POSITION, "getSectionPosition", "tryShowNoticeView", "persistenceKey", "Lcom/kubi/utils/storage/StorageId;", "", ViewProps.MARGIN, "Lkotlin/Function1;", "getCurrentFragment", "resetSortType", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseTradingAreaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTradingAreaFragment.kt\ncom/kubi/kumex/market/tradingArea/BaseTradingAreaFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NoticeConfig.kt\ncom/kubi/kumex/data/platform/model/NoticeConfig\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,266:1\n1573#2:267\n1604#2,4:268\n1573#2:272\n1604#2,4:273\n774#2:279\n865#2:280\n866#2:282\n1563#2:284\n1634#2,2:285\n1636#2:289\n29#3:277\n21#3:278\n22#3:281\n23#3:283\n24#3:287\n30#3:290\n149#4:288\n84#5:291\n75#5,2:292\n*S KotlinDebug\n*F\n+ 1 BaseTradingAreaFragment.kt\ncom/kubi/kumex/market/tradingArea/BaseTradingAreaFragment\n*L\n151#1:267\n151#1:268,4\n169#1:272\n169#1:273,4\n230#1:279\n230#1:280\n230#1:282\n230#1:284\n230#1:285,2\n230#1:289\n230#1:277\n230#1:278\n230#1:281\n230#1:283\n230#1:287\n230#1:290\n230#1:288\n231#1:291\n251#1:292,2\n*E\n"})
public abstract class BaseTradingAreaFragment<I extends InterfaceC19282d, S extends InterfaceC19284f, VM extends BaseStateVM<I, S>> extends BaseStateFragment<I, S, VM> {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f29464c0 = new Companion(null);

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public static String f29465d0 = "null";

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public static String f29466e0 = "null";

    /* JADX INFO: renamed from: U */
    @Nullable
    public volatile String f29467U;

    /* JADX INFO: renamed from: V */
    public volatile int f29468V;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public ViewPager2 f29471Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public SlidingTabLayout f29472Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public View f29473a0;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ArrayList<AvailableTradeAreaEntity> f29469W = new ArrayList<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ArrayList<CharSequence> f29470X = new ArrayList<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public HashMap<String, Integer> f29474b0 = new HashMap<>();

    /* JADX INFO: compiled from: BaseTradingAreaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/BaseTradingAreaFragment$Companion;", "", "<init>", "()V", "level1Name", "", "getLevel1Name", "()Ljava/lang/String;", "setLevel1Name", "(Ljava/lang/String;)V", "level2Name", "getLevel2Name", "setLevel2Name", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final String getLevel1Name() {
            return BaseTradingAreaFragment.f29465d0;
        }

        @Nullable
        public final String getLevel2Name() {
            return BaseTradingAreaFragment.f29466e0;
        }

        public final void setLevel1Name(@Nullable String str) {
            BaseTradingAreaFragment.f29465d0 = str;
        }

        public final void setLevel2Name(@Nullable String str) {
            BaseTradingAreaFragment.f29466e0 = str;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment$a */
    /* JADX INFO: compiled from: BaseTradingAreaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/market/tradingArea/BaseTradingAreaFragment$setAdapter$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16232a extends C45938b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseTradingAreaFragment<I, S, VM> f29475a;

        public C16232a(BaseTradingAreaFragment<I, S, VM> baseTradingAreaFragment) {
            this.f29475a = baseTradingAreaFragment;
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) throws JSONException {
            if (i11 < 0 || i11 > this.f29475a.m34420A3().size() - 1) {
                return;
            }
            Companion companion = BaseTradingAreaFragment.f29464c0;
            companion.setLevel1Name(this.f29475a.m34420A3().get(i11).getTradingName());
            companion.setLevel2Name("null");
            String f16323v = this.f29475a.getF18762X();
            if (f16323v == null) {
                f16323v = C17060n0.m36552b();
            }
            C43852m.m96590b(f16323v, "ContractList", "3", TuplesKt.m90091to("tradingArea", C27041f.m66668h(companion.getLevel1Name())));
            String strValueOf = String.valueOf(i11 + 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Name", companion.getLevel1Name());
            jSONObject.put("NavigationName", "Futures");
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B6FuturesMarkets", "Tab", strValueOf, jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/kumex/data/platform/model/NoticeConfig$body$lambda$1$$inlined$fromJson$1", "com/kubi/kumex/data/platform/model/NoticeConfig$first$$inlined$body$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C16233b extends TypeToken<ContractNotice> {
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.mvi.state.InterfaceC19285g
    public boolean needCatchUIException() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: v3 */
    public abstract Fragment mo33755v3(int i11, @NotNull String str, @NotNull AvailableTradeAreaEntity availableTradeAreaEntity, int i12);

    @NotNull
    /* JADX INFO: renamed from: w3 */
    public abstract Fragment mo33756w3();

    /* JADX INFO: renamed from: I3 */
    public static final Unit m34409I3(ContractNotice contractNotice, BaseTradingAreaFragment baseTradingAreaFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String link = contractNotice.getLink();
        if (link != null && link.length() != 0) {
            Router.f46192a.m56184f(contractNotice.getLink()).m4048k();
        }
        String f16323v = baseTradingAreaFragment.getF18762X();
        if (f16323v == null) {
            f16323v = "B6FuturesMarkets";
        }
        C43852m.m96591c(f16323v, "ContractListAd", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m34410J3(View view, StorageId storageId, ContractNotice contractNotice, BaseTradingAreaFragment baseTradingAreaFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewExtKt.m66577h(view);
        C46392a.m102330m(storageId, C27039d.m66652l(contractNotice.getStart()));
        String f16323v = baseTradingAreaFragment.getF18762X();
        if (f16323v == null) {
            f16323v = "B6FuturesMarkets";
        }
        C43852m.m96591c(f16323v, "ContractListAd", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A3 */
    public final ArrayList<AvailableTradeAreaEntity> m34420A3() {
        return this.f29469W;
    }

    /* JADX INFO: renamed from: B3 */
    public final void m34421B3(@NotNull List<AvailableTradeAreaEntity> list, int i11) {
        SlidingTabLayout slidingTabLayout;
        TextView textView;
        Intrinsics.checkNotNullParameter(list, "list");
        Log log = Log.f30813a;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        log.m36617c(tag, "notifyDataChanged:list-size:" + list.size() + ",index:" + i11);
        ViewPager2 viewPager2 = this.f29471Y;
        if (viewPager2 == null || (slidingTabLayout = this.f29472Z) == null) {
            return;
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.resources.widget.viewpager2.ViewPager2Adapter");
        C37727a c37727a = (C37727a) adapter;
        List<?> mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, new AvailableTradeAreaEntity("favor", getStringRes(R$string.favorites, new Object[0]), null, null, null, "favorite", null, 92, null));
        c37727a.clear();
        this.f29470X.clear();
        this.f29469W.clear();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
        final int i12 = 0;
        for (Object obj : mutableList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final AvailableTradeAreaEntity availableTradeAreaEntity = (AvailableTradeAreaEntity) obj;
            this.f29469W.add(availableTradeAreaEntity);
            this.f29470X.add(C27041f.m66668h(availableTradeAreaEntity.getDisplayName()));
            arrayList.add(i12 == 0 ? c37727a.m85027g(new Function1() { // from class: com.kubi.kumex.market.tradingArea.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BaseTradingAreaFragment.m34406C3(this.f29495b, ((Integer) obj2).intValue());
                }
            }) : c37727a.m85027g(new Function1() { // from class: com.kubi.kumex.market.tradingArea.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BaseTradingAreaFragment.m34407D3(this.f29497b, availableTradeAreaEntity, i12, ((Integer) obj2).intValue());
                }
            }));
            i12 = i13;
        }
        viewPager2.setCurrentItem(i11, false);
        slidingTabLayout.setCurrentTab(i11);
        c37727a.m85031k(mutableList);
        slidingTabLayout.m55597u();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
        int i14 = 0;
        for (Object obj2 : mutableList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AvailableTradeAreaEntity availableTradeAreaEntity2 = (AvailableTradeAreaEntity) obj2;
            View viewM55593q = slidingTabLayout.m55593q(i14);
            TextView textView2 = null;
            if (viewM55593q != null && (textView = (TextView) viewM55593q.findViewById(R$id.tv_tab_title)) != null) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(C27025c.m66566d(availableTradeAreaEntity2.getHotMark()) ? textView.getContext().getDrawable(R$mipmap.icon_fire) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView2 = textView;
            }
            arrayList2.add(textView2);
            i14 = i15;
        }
    }

    /* JADX INFO: renamed from: E3 */
    public void mo34422E3(@NotNull String sortName, int i11) {
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        this.f29467U = sortName;
        this.f29468V = i11;
    }

    /* JADX INFO: renamed from: F3 */
    public final void m34423F3(@NotNull ViewPager2 viewPager, @NotNull SlidingTabLayout tabLayout) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager.setAdapter(new C37727a(childFragmentManager, lifecycle));
        viewPager.setOffscreenPageLimit(1);
        tabLayout.m55601z(viewPager, this.f29470X);
        tabLayout.setOnTabSelectListener(new C16232a(this));
        this.f29471Y = viewPager;
        this.f29472Z = tabLayout;
    }

    /* JADX INFO: renamed from: G3 */
    public void mo33752G3(@NotNull final StorageId<Long> persistenceKey, @Nullable Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(persistenceKey, "persistenceKey");
        NoticeConfig noticeConfigMo25019n = RepositoryServiceLocator.f19236a.m20288g().mo25019n();
        ArrayList arrayList = new ArrayList();
        for (Map<String, ? extends Object> map : noticeConfigMo25019n) {
            if (Intrinsics.areEqual(map.get("type"), "quote_notice")) {
                arrayList.add(map);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strM66606i = C27029c.m66606i((Map) it.next());
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C27099x c27099x = C27099x.f54458a;
            arrayList2.add(C27099x.m66914d(strM66606i, new C16233b().getType()));
        }
        final ContractNotice contractNotice = (ContractNotice) (arrayList2.isEmpty() ? null : arrayList2.get(0));
        if (contractNotice == null || C27039d.m66652l(contractNotice.getStart()) <= C46392a.m102324f(persistenceKey, 0L) || NoticeHelper.f29301a.m34043F()) {
            return;
        }
        if (this.f29473a0 == null) {
            String f16323v = getF18762X();
            if (f16323v == null) {
                f16323v = "B6FuturesMarkets";
            }
            C43852m.m96595g(f16323v, "ContractListAd", null, null, 12, null);
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kumex.market.tradingArea.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseTradingAreaFragment.m34408H3(this.f29501b);
            }
        });
        final View view = this.f29473a0;
        if (view != null) {
            view.setVisibility(0);
            if (function1 != null) {
                function1.invoke(view);
            }
            int i11 = R$id.notice;
            ((AppCompatTextView) view.findViewById(i11)).setText(contractNotice.getContent());
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i11);
            if (appCompatTextView != null) {
                ViewExtKt.m66575f(appCompatTextView, new Function1() { // from class: com.kubi.kumex.market.tradingArea.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseTradingAreaFragment.m34409I3(contractNotice, this, (View) obj);
                    }
                });
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R$id.close);
            if (appCompatImageView != null) {
                ViewExtKt.m66575f(appCompatImageView, new Function1() { // from class: com.kubi.kumex.market.tradingArea.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseTradingAreaFragment.m34410J3(view, persistenceKey, contractNotice, this, (View) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: K3 */
    public final void m34424K3(@NotNull String id2, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f29474b0.put(id2, Integer.valueOf(i11));
    }

    @Nullable
    /* JADX INFO: renamed from: y3, reason: from getter */
    public final String getF29467U() {
        return this.f29467U;
    }

    /* JADX INFO: renamed from: z3, reason: from getter */
    public final int getF29468V() {
        return this.f29468V;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Fragment m34406C3(BaseTradingAreaFragment baseTradingAreaFragment, int i11) {
        return baseTradingAreaFragment.mo33756w3();
    }

    /* JADX INFO: renamed from: D3 */
    public static final Fragment m34407D3(BaseTradingAreaFragment baseTradingAreaFragment, AvailableTradeAreaEntity availableTradeAreaEntity, int i11, int i12) {
        Pair<String, Integer> pairM34425x3 = baseTradingAreaFragment.m34425x3(availableTradeAreaEntity);
        return baseTradingAreaFragment.mo33755v3(i11, pairM34425x3.getFirst(), availableTradeAreaEntity, pairM34425x3.getSecond().intValue());
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m34408H3(BaseTradingAreaFragment baseTradingAreaFragment) {
        baseTradingAreaFragment.f29473a0 = ((ViewStub) baseTradingAreaFragment.requireView().findViewById(R$id.viewStub)).inflate();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public final Pair<String, Integer> m34425x3(AvailableTradeAreaEntity availableTradeAreaEntity) {
        int iIntValue;
        ArrayList<AvailableTradeAreaEntity> children = availableTradeAreaEntity.getChildren();
        if (children != null && !children.isEmpty()) {
            Integer num = this.f29474b0.get(C27041f.m66668h(availableTradeAreaEntity.getId()));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            List children2 = availableTradeAreaEntity.getChildren();
            if (children2 == null) {
                children2 = CollectionsKt.emptyList();
            }
            if (children2.size() > iIntValue && iIntValue >= 0) {
                return new Pair<>(C27041f.m66668h(((AvailableTradeAreaEntity) children2.get(iIntValue)).getId()), Integer.valueOf(iIntValue));
            }
            if (children2.isEmpty()) {
                return new Pair<>(C27041f.m66668h(availableTradeAreaEntity.getId()), -1);
            }
            return new Pair<>(C27041f.m66668h(((AvailableTradeAreaEntity) children2.get(0)).getId()), 0);
        }
        return new Pair<>(C27041f.m66668h(availableTradeAreaEntity.getId()), -1);
    }
}
