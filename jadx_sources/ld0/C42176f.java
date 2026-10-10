package ld0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.gift.GiftCategory;
import java.util.List;
import md0.C42510a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ld0.f */
/* JADX INFO: compiled from: GiftTabLayoutManager.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007J$\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/GiftTabLayoutManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "giftClickListener", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager$GiftClickListener;", "tabManager", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryTabManager;", "categoryViewManager", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "contentContainer", "Landroid/widget/FrameLayout;", "giftCategories", "", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "dividerView", "Landroid/view/View;", "pagerAdapter", "Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftCategoryPagerAdapter;", "setGiftClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "createLayout", "categories", "columns", "", "rows", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42176f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f93633a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C42175e.a f93634b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C42174d f93635c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C42175e f93636d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ViewPager2 f93637e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public FrameLayout f93638f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public List<GiftCategory> f93639g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public View f93640h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public C42510a f93641i;

    /* JADX INFO: renamed from: ld0.f$a */
    /* JADX INFO: compiled from: GiftTabLayoutManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/GiftTabLayoutManager$createLayout$1$1", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager$GiftClickListener;", "onClick", "", ViewProps.POSITION, "", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements C42175e.a {
        public a() {
        }

        @Override // ld0.C42175e.a
        /* JADX INFO: renamed from: a */
        public void mo79633a(int i11, Gift gift) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            C42175e.a aVar = C42176f.this.f93634b;
            if (aVar != null) {
                aVar.mo79633a(i11, gift);
            }
        }
    }

    /* JADX INFO: renamed from: ld0.f$b */
    /* JADX INFO: compiled from: GiftTabLayoutManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/GiftTabLayoutManager$createLayout$3", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryTabManager$OnCategorySelectedListener;", "onCategorySelected", "", "categoryIndex", "", "category", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements C42174d.a {
        public b() {
        }

        @Override // ld0.C42174d.a
        /* JADX INFO: renamed from: a */
        public void mo92602a(int i11, GiftCategory giftCategory) {
            ViewPager2 viewPager2 = C42176f.this.f93637e;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(i11, true);
            }
        }
    }

    /* JADX INFO: renamed from: ld0.f$c */
    /* JADX INFO: compiled from: GiftTabLayoutManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/GiftTabLayoutManager$createLayout$4", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", ViewProps.POSITION, "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends ViewPager2.OnPageChangeCallback {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            C42174d c42174d = C42176f.this.f93635c;
            if (c42174d != null) {
                c42174d.m92601e(position);
            }
        }
    }

    public C42176f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f93633a = context;
        this.f93639g = CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m92610d(@NotNull List<GiftCategory> categories, int i11, int i12) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f93639g = categories;
        View viewInflate = LayoutInflater.from(this.f93633a).inflate(R$layout.gift_layout_main_layout, (ViewGroup) null);
        this.f93635c = new C42174d(this.f93633a);
        C42175e c42175e = new C42175e();
        c42175e.m92605c(new a());
        this.f93636d = c42175e;
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R$id.ll_tab_container);
        this.f93640h = viewInflate.findViewById(R$id.view_divider);
        this.f93638f = (FrameLayout) viewInflate.findViewById(R$id.fl_content_container);
        ViewPager2 viewPager2 = new ViewPager2(this.f93633a);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f93637e = viewPager2;
        FrameLayout frameLayout = this.f93638f;
        if (frameLayout != null) {
            frameLayout.addView(viewPager2);
        }
        Context context = this.f93633a;
        C42175e c42175e2 = this.f93636d;
        Intrinsics.checkNotNull(c42175e2);
        C42510a c42510a = new C42510a(context, categories, i11, c42175e2);
        this.f93641i = c42510a;
        ViewPager2 viewPager3 = this.f93637e;
        if (viewPager3 != null) {
            viewPager3.setAdapter(c42510a);
        }
        C42174d c42174d = this.f93635c;
        linearLayout.addView(c42174d != null ? c42174d.m92599b(categories) : null);
        C42174d c42174d2 = this.f93635c;
        if (c42174d2 != null) {
            c42174d2.setOnCategorySelectedListener(new b());
        }
        ViewPager2 viewPager4 = this.f93637e;
        if (viewPager4 != null) {
            viewPager4.registerOnPageChangeCallback(new c());
        }
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public final void m92611e(@NotNull C42175e.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f93634b = listener;
    }
}
