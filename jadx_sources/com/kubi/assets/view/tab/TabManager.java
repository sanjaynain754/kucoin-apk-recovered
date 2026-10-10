package com.kubi.assets.view.tab;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.kubi.assets.bot.BotAssetContainerFragment;
import com.kubi.assets.entity.TabItem;
import com.kubi.assets.sort.C10997l;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TabManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0014\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bJ2\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\b\b\u0002\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0015J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bJ\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/view/tab/TabManager;", "", "viewPager", "Lcom/kubi/resources/widget/CustomViewPager;", "tabLayout", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "<init>", "(Lcom/kubi/resources/widget/CustomViewPager;Lcom/kubi/resources/widget/flyco/SlidingTabLayout;Landroidx/fragment/app/FragmentManager;)V", "sourceAssetsTabList", "", "Lcom/kubi/assets/entity/TabItem;", "getSourceAssetsTabList", "()Ljava/util/List;", "sourceAssetsTabList$delegate", "Lkotlin/Lazy;", "tabItemProvider", "Lkotlin/Function0;", "fragmentCache", "", "", "Landroidx/fragment/app/Fragment;", "adapter", "Lcom/kubi/assets/view/tab/DynamicFragmentAdapter;", "setup", "", "refresh", "orders", "sortTabsByOrder", "", "oldTabItems", "isNewVersion", "", "switchTab", "key", "getCurrentFragments", "getBotAssetsFragment", "Lcom/kubi/assets/bot/BotAssetContainerFragment;", "getSortAssetsList", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTabManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabManager.kt\ncom/kubi/assets/view/tab/TabManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n774#2:166\n865#2,2:167\n774#2:169\n865#2,2:170\n1563#2:172\n1634#2,3:173\n1563#2:176\n1634#2,3:177\n1869#2,2:180\n1#3:182\n*S KotlinDebug\n*F\n+ 1 TabManager.kt\ncom/kubi/assets/view/tab/TabManager\n*L\n40#1:166\n40#1:167,2\n63#1:169\n63#1:170,2\n67#1:172\n67#1:173,3\n68#1:176\n68#1:177,3\n80#1:180,2\n*E\n"})
public final class TabManager {

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Companion f19165h = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static boolean f19166i;

    /* JADX INFO: renamed from: a */
    @Nullable
    public final CustomViewPager f19167a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final SlidingTabLayout f19168b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final FragmentManager f19169c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f19170d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public Function0<? extends List<TabItem>> f19171e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Map<String, Fragment> f19172f;

    /* JADX INFO: renamed from: g */
    public DynamicFragmentAdapter f19173g;

    /* JADX INFO: compiled from: TabManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/view/tab/TabManager$Companion;", "", "<init>", "()V", "containsMiningFragment", "", "getContainsMiningFragment", "()Z", "setContainsMiningFragment", "(Z)V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean getContainsMiningFragment() {
            return TabManager.f19166i;
        }

        public final void setContainsMiningFragment(boolean z11) {
            TabManager.f19166i = z11;
        }
    }

    public TabManager(@Nullable CustomViewPager customViewPager, @Nullable SlidingTabLayout slidingTabLayout, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f19167a = customViewPager;
        this.f19168b = slidingTabLayout;
        this.f19169c = fragmentManager;
        this.f19170d = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.view.tab.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TabManager.m20084l();
            }
        });
        this.f19171e = new Function0() { // from class: com.kubi.assets.view.tab.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TabManager.m20085n(this.f19180b);
            }
        };
        this.f19172f = new LinkedHashMap();
        m20091j();
        AssetTabSortHelper.f19161a.m20074q(this);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final BotAssetContainerFragment m20086e() {
        Fragment fragment = this.f19172f.get("bots");
        if (fragment instanceof BotAssetContainerFragment) {
            return (BotAssetContainerFragment) fragment;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<Fragment> m20087f() {
        return CollectionsKt.toList(this.f19172f.values());
    }

    /* JADX INFO: renamed from: h */
    public final List<TabItem> m20089h() {
        return (List) this.f19170d.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m20090i(@NotNull List<String> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        List<TabItem> listInvoke = this.f19171e.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listInvoke) {
            if (((TabItem) obj).getShouldShow().invoke().booleanValue()) {
                arrayList.add(obj);
            }
        }
        List<TabItem> listM20092k = m20092k(arrayList, orders, C10997l.m19368a());
        DynamicFragmentAdapter dynamicFragmentAdapter = this.f19173g;
        Object obj2 = null;
        DynamicFragmentAdapter dynamicFragmentAdapter2 = null;
        if (dynamicFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dynamicFragmentAdapter = null;
        }
        List<TabItem> listM20098a = dynamicFragmentAdapter.m20098a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM20098a, 10));
        Iterator<T> it = listM20098a.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TabItem) it.next()).getKey());
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM20092k, 10));
        Iterator<T> it2 = listM20092k.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((TabItem) it2.next()).getKey());
        }
        if (Intrinsics.areEqual(arrayList2, arrayList3)) {
            DynamicFragmentAdapter dynamicFragmentAdapter3 = this.f19173g;
            if (dynamicFragmentAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                dynamicFragmentAdapter2 = dynamicFragmentAdapter3;
            }
            dynamicFragmentAdapter2.m20100c(listM20092k);
        } else {
            CustomViewPager customViewPager = this.f19167a;
            if (customViewPager != null) {
                customViewPager.setAdapter(null);
            }
            try {
                FragmentTransaction fragmentTransactionBeginTransaction = this.f19169c.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
                for (Fragment fragment : this.f19172f.values()) {
                    if (fragment.isAdded()) {
                        fragmentTransactionBeginTransaction.remove(fragment);
                    }
                }
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            } catch (Exception unused) {
            }
            this.f19172f.clear();
            DynamicFragmentAdapter dynamicFragmentAdapter4 = new DynamicFragmentAdapter(this.f19169c, listM20092k, this.f19172f);
            this.f19173g = dynamicFragmentAdapter4;
            CustomViewPager customViewPager2 = this.f19167a;
            if (customViewPager2 != null) {
                customViewPager2.setAdapter(dynamicFragmentAdapter4);
            }
            CustomViewPager customViewPager3 = this.f19167a;
            if (customViewPager3 != null) {
                customViewPager3.setCurrentItem(0);
            }
            SlidingTabLayout slidingTabLayout = this.f19168b;
            if (slidingTabLayout != null) {
                slidingTabLayout.setCurrentTab(0);
            }
            for (Object obj3 : listM20092k) {
                if (Intrinsics.areEqual(((TabItem) obj3).getKey(), "mining")) {
                    obj2 = obj3;
                    break;
                }
            }
            f19166i = obj2 != null;
        }
        SlidingTabLayout slidingTabLayout2 = this.f19168b;
        if (slidingTabLayout2 != null) {
            slidingTabLayout2.setViewPager(this.f19167a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m20091j() {
        List<TabItem> listInvoke = this.f19171e.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listInvoke) {
            if (((TabItem) obj).getShouldShow().invoke().booleanValue()) {
                arrayList.add(obj);
            }
        }
        AssetTabSortHelper assetTabSortHelper = AssetTabSortHelper.f19161a;
        List<String> listM20072o = assetTabSortHelper.m20072o();
        List<TabItem> listM20092k = C10997l.m19368a() ? m20092k(arrayList, listM20072o, true) : m20092k(arrayList, listM20072o, false);
        this.f19173g = new DynamicFragmentAdapter(this.f19169c, listM20092k, this.f19172f);
        CustomViewPager customViewPager = this.f19167a;
        if (customViewPager != null) {
            customViewPager.setOffscreenPageLimit(listM20092k.size());
        }
        CustomViewPager customViewPager2 = this.f19167a;
        if (customViewPager2 != null) {
            DynamicFragmentAdapter dynamicFragmentAdapter = this.f19173g;
            if (dynamicFragmentAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                dynamicFragmentAdapter = null;
            }
            customViewPager2.setAdapter(dynamicFragmentAdapter);
        }
        SlidingTabLayout slidingTabLayout = this.f19168b;
        if (slidingTabLayout != null) {
            slidingTabLayout.setViewPager(this.f19167a);
        }
        assetTabSortHelper.m20073p();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<TabItem> m20092k(@NotNull List<TabItem> oldTabItems, @NotNull List<String> orders, boolean z11) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(oldTabItems, "oldTabItems");
        Intrinsics.checkNotNullParameter(orders, "orders");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = oldTabItems.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((TabItem) next).getKey(), "overview"));
        TabItem tabItem = (TabItem) next;
        if (tabItem != null) {
            arrayList.add(tabItem);
        }
        for (String str : orders) {
            Iterator<T> it2 = oldTabItems.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.areEqual(((TabItem) next2).getKey(), str));
            TabItem tabItem2 = (TabItem) next2;
            if (tabItem2 != null) {
                arrayList.add(tabItem2);
            }
        }
        if (!z11) {
            for (TabItem tabItem3 : oldTabItems) {
                if (!arrayList.contains(tabItem3)) {
                    arrayList.add(tabItem3);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final void m20093m(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DynamicFragmentAdapter dynamicFragmentAdapter = this.f19173g;
        if (dynamicFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dynamicFragmentAdapter = null;
        }
        Integer numM20099b = dynamicFragmentAdapter.m20099b(key);
        if (numM20099b != null) {
            int iIntValue = numM20099b.intValue();
            CustomViewPager customViewPager = this.f19167a;
            if (customViewPager != null) {
                customViewPager.setCurrentItem(iIntValue, false);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final List m20084l() {
        return C11325s0.m20111K();
    }

    /* JADX INFO: renamed from: n */
    public static final List m20085n(TabManager tabManager) {
        return tabManager.m20088g();
    }

    /* JADX INFO: renamed from: g */
    public final List<TabItem> m20088g() {
        return C11325s0.m20176y0(m20089h());
    }
}
