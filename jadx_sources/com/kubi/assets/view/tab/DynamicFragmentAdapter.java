package com.kubi.assets.view.tab;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.TabItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.view.tab.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DynamicFragmentAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J \u0010&\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/view/tab/DynamicFragmentAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/assets/entity/TabItem;", "fragmentCache", "", "", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "keyIndexMap", "", "updateItems", "", "newItems", "getTabIndex", "key", "(Ljava/lang/String;)Ljava/lang/Integer;", "getCount", "getItem", ViewProps.POSITION, "getPageTitle", "", "getItemPosition", "object", "", "destroyItem", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "saveState", "Landroid/os/Parcelable;", "setPrimaryItem", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDynamicFragmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicFragmentAdapter.kt\ncom/kubi/assets/view/tab/DynamicFragmentAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,102:1\n1878#2,3:103\n1563#2:106\n1634#2,3:107\n1563#2:110\n1634#2,3:111\n1869#2,2:114\n1878#2,3:116\n360#2,7:126\n1761#2,3:133\n382#3,7:119\n*S KotlinDebug\n*F\n+ 1 DynamicFragmentAdapter.kt\ncom/kubi/assets/view/tab/DynamicFragmentAdapter\n*L\n23#1:103,3\n32#1:106\n32#1:107,3\n33#1:110\n33#1:111,3\n38#1:114,2\n47#1:116,3\n69#1:126,7\n80#1:133,3\n60#1:119,7\n*E\n"})
public final class DynamicFragmentAdapter extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FragmentManager f19176a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public List<TabItem> f19177b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<String, Fragment> f19178c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<String, Integer> f19179d;

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    @Nullable
    public Parcelable saveState() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFragmentAdapter(@NotNull FragmentManager fm2, @NotNull List<TabItem> items, @NotNull Map<String, Fragment> fragmentCache) {
        super(fm2, 1);
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(fragmentCache, "fragmentCache");
        this.f19176a = fm2;
        this.f19177b = items;
        this.f19178c = fragmentCache;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : this.f19177b) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            linkedHashMap.put(((TabItem) obj).getKey(), Integer.valueOf(i11));
            i11 = i12;
        }
        this.f19179d = linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<TabItem> m20098a() {
        return this.f19177b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Integer m20099b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f19179d.get(key);
    }

    /* JADX INFO: renamed from: c */
    public final void m20100c(@NotNull List<TabItem> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        List<TabItem> list = this.f19177b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TabItem) it.next()).getKey());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(newItems, 10));
        Iterator<T> it2 = newItems.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((TabItem) it2.next()).getKey());
        }
        if (Intrinsics.areEqual(arrayList, arrayList2)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TabItem tabItem : newItems) {
            Fragment fragmentInvoke = this.f19178c.get(tabItem.getKey());
            if (fragmentInvoke == null) {
                fragmentInvoke = tabItem.getFragmentProvider().invoke();
            }
            linkedHashMap.put(tabItem.getKey(), fragmentInvoke);
        }
        this.f19178c.clear();
        this.f19178c.putAll(linkedHashMap);
        this.f19177b = newItems;
        this.f19179d.clear();
        int i11 = 0;
        for (Object obj : this.f19177b) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            this.f19179d.put(((TabItem) obj).getKey(), Integer.valueOf(i11));
            i11 = i12;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        Fragment fragment = object instanceof Fragment ? (Fragment) object : null;
        List<TabItem> list = this.f19177b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f19178c.get(((TabItem) it.next()).getKey()) == fragment) {
                    return;
                }
            }
        }
        if (fragment != null) {
            this.f19178c.values().remove(fragment);
            this.f19176a.beginTransaction().remove(fragment).commitNowAllowingStateLoss();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f19177b.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @NotNull
    public Fragment getItem(int position) {
        TabItem tabItem = this.f19177b.get(position);
        Map<String, Fragment> map = this.f19178c;
        String key = tabItem.getKey();
        Fragment fragmentInvoke = map.get(key);
        if (fragmentInvoke == null) {
            fragmentInvoke = tabItem.getFragmentProvider().invoke();
            map.put(key, fragmentInvoke);
        }
        return fragmentInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e A[RETURN] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        Iterator<TabItem> it = this.f19177b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (this.f19178c.get(it.next().getKey()) == object) {
                if (i11 == -1) {
                    return -2;
                }
                return i11;
            }
            i11++;
        }
        i11 = -1;
        if (i11 == -1) {
            return -2;
        }
        return i11;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public CharSequence getPageTitle(int position) {
        return this.f19177b.get(position).getTitleProvider().invoke();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        Fragment fragment = object instanceof Fragment ? (Fragment) object : null;
        if (fragment == null || fragment.isAdded()) {
            super.setPrimaryItem(container, position, object);
        }
    }
}
