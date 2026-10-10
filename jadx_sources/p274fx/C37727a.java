package p274fx;

import androidx.collection.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.blankj.utilcode.util.ReflectUtils;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.exception.ComponentException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: fx.a */
/* JADX INFO: compiled from: ViewPager2Adapter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u001e\u0010\u0015\u001a\u00020\u00002\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000fJ$\u0010\u0017\u001a\u00020\u00002\u001c\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f0\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\rJ\u0012\u0010\"\u001a\u00020\u001b2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0019J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/resources/widget/viewpager2/ViewPager2Adapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "manager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V", "tag", "", "lists", "", "Lkotlin/Function1;", "", "Landroidx/fragment/app/Fragment;", "Lcom/kubi/resources/widget/viewpager2/InstanceFragment;", "datas", "", "getItemCount", "createFragment", ViewProps.POSITION, "add", "fragment", "addAll", "list", "", "onDetachedFromRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "clear", "getItemId", "", "getFragment", "notifyDataSetChanged", "data", "getFragments", "getFragmentSparseArray", "Landroidx/collection/LongSparseArray;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nViewPager2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewPager2Adapter.kt\ncom/kubi/resources/widget/viewpager2/ViewPager2Adapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 4 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n*L\n1#1,134:1\n1869#2,2:135\n588#3,4:137\n44#4,2:141\n*S KotlinDebug\n*F\n+ 1 ViewPager2Adapter.kt\ncom/kubi/resources/widget/viewpager2/ViewPager2Adapter\n*L\n96#1:135,2\n110#1:137,4\n125#1:141,2\n*E\n"})
public final class C37727a extends FragmentStateAdapter {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final FragmentManager f85002i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final String f85003j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<Function1<Integer, Fragment>> f85004k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final List<Object> f85005l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37727a(@NotNull FragmentManager manager, @NotNull Lifecycle lifecycle) {
        super(manager, lifecycle);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f85002i = manager;
        this.f85003j = "ViewPager2Adapter";
        this.f85004k = new ArrayList();
        this.f85005l = new ArrayList();
    }

    public final void clear() {
        this.f85004k.clear();
        this.f85005l.clear();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        C44128b.m97259c(this.f85003j, "createFragment:" + position);
        return this.f85004k.get(position).invoke(Integer.valueOf(position));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C37727a m85027g(@NotNull Function1<? super Integer, ? extends Fragment> fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f85004k.add(fragment);
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f85004k.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position >= this.f85005l.size() ? super.getItemId(position) : this.f85005l.get(position).hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final List<Fragment> m85030j() {
        ArrayList arrayList = new ArrayList();
        LongSparseArray<Fragment> longSparseArrayM85029i = m85029i();
        int size = longSparseArrayM85029i.size();
        for (int i11 = 0; i11 < size; i11++) {
            longSparseArrayM85029i.keyAt(i11);
            arrayList.add(longSparseArrayM85029i.valueAt(i11));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final void m85031k(@NotNull List<?> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f85005l.clear();
        for (Object obj : data) {
            if (obj != null) {
                this.f85005l.add(obj);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        clear();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Fragment m85028h(int i11) {
        long itemId = getItemId(i11);
        FragmentManager fragmentManager = this.f85002i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('f');
        sb2.append(itemId);
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(sb2.toString());
        if (fragmentFindFragmentByTag == null) {
            return m85029i().get(itemId);
        }
        return fragmentFindFragmentByTag;
    }

    /* JADX INFO: renamed from: i */
    public final LongSparseArray<Fragment> m85029i() {
        try {
            Object objM6079f = ReflectUtils.m6074o(this).m6077d("mFragments").m6079f();
            Intrinsics.checkNotNull(objM6079f);
            return (LongSparseArray) objM6079f;
        } catch (Throwable th2) {
            C43846g.m96568c(new ComponentException(th2, this.f85003j, false, null, 8, null), null, 2, null);
            return new LongSparseArray<>(0, 1, null);
        }
    }
}
