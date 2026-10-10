package ga0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.reactnativepagerview.C27519a;
import com.reactnativepagerview.NestedScrollableHost;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ga0.g */
/* JADX INFO: compiled from: PagerViewViewManagerImpl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010#\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b)\u0010 J\u001d\u0010*\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010#\u001a\u00020&¢\u0006\u0004\b*\u0010(J\u001d\u0010+\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b+\u0010 J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010#\u001a\u00020&¢\u0006\u0004\b,\u0010(J\u001d\u0010.\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b.\u0010 J\u0017\u0010/\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u00100¨\u00061"}, m90084d2 = {"Lga0/g;", "", "<init>", "()V", "Lcom/reactnativepagerview/NestedScrollableHost;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroidx/viewpager2/widget/ViewPager2;", "g", "(Lcom/reactnativepagerview/NestedScrollableHost;)Landroidx/viewpager2/widget/ViewPager2;", "", "selectedTab", "", "scrollSmooth", "", "n", "(Landroidx/viewpager2/widget/ViewPager2;IZ)V", "host", "Landroid/view/View;", "child", "index", "d", "(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;I)V", "parent", "f", "(Lcom/reactnativepagerview/NestedScrollableHost;)I", "e", "(Lcom/reactnativepagerview/NestedScrollableHost;I)Landroid/view/View;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;)V", "k", "(Lcom/reactnativepagerview/NestedScrollableHost;)V", "m", "(Lcom/reactnativepagerview/NestedScrollableHost;I)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "value", "w", "(Lcom/reactnativepagerview/NestedScrollableHost;Z)V", "", "q", "(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V", "o", CmcdData.Factory.STREAMING_FORMAT_SS, "r", "t", ViewProps.MARGIN, "u", "i", "(Landroid/view/View;)V", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37857g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37857g f85235a = new C37857g();

    /* JADX INFO: renamed from: p */
    public static final void m85415p(NestedScrollableHost nestedScrollableHost) {
        nestedScrollableHost.setDidSetInitialIndex(true);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m85421h() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m85417d(@NotNull NestedScrollableHost host, @Nullable View child, int index) throws ClassNotFoundException {
        Integer initialIndex;
        Intrinsics.checkNotNullParameter(host, "host");
        if (child == null) {
            return;
        }
        ViewPager2 viewPager2M85420g = m85420g(host);
        C27519a c27519a = (C27519a) viewPager2M85420g.getAdapter();
        if (c27519a != null) {
            c27519a.m68165g(child, index);
        }
        if (viewPager2M85420g.getCurrentItem() == index) {
            m85422i(viewPager2M85420g);
        }
        if (host.getDidSetInitialIndex() || (initialIndex = host.getInitialIndex()) == null || initialIndex.intValue() != index) {
            return;
        }
        host.setDidSetInitialIndex(true);
        m85426n(viewPager2M85420g, index, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m85422i(final View view) {
        view.post(new Runnable() { // from class: ga0.e
            @Override // java.lang.Runnable
            public final void run() {
                C37857g.m85414j(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m85427o(@NotNull final NestedScrollableHost host, int value) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(host, "host");
        ViewPager2 viewPager2M85420g = m85420g(host);
        if (host.getInitialIndex() == null) {
            host.setInitialIndex(Integer.valueOf(value));
            viewPager2M85420g.post(new Runnable() { // from class: ga0.f
                @Override // java.lang.Runnable
                public final void run() {
                    C37857g.m85415p(host);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m85428q(@NotNull NestedScrollableHost host, @NotNull String value) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        ViewPager2 viewPager2M85420g = m85420g(host);
        if (Intrinsics.areEqual(value, "rtl")) {
            viewPager2M85420g.setLayoutDirection(1);
        } else {
            viewPager2M85420g.setLayoutDirection(0);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m85429r(@NotNull NestedScrollableHost host, int value) {
        Intrinsics.checkNotNullParameter(host, "host");
        m85420g(host).setOffscreenPageLimit(value);
    }

    /* JADX INFO: renamed from: s */
    public final void m85430s(@NotNull NestedScrollableHost host, @NotNull String value) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        m85420g(host).setOrientation(Intrinsics.areEqual(value, "vertical") ? 1 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final void m85431t(@NotNull NestedScrollableHost host, @NotNull String value) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        View childAt = m85420g(host).getChildAt(0);
        if (Intrinsics.areEqual(value, ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
            childAt.setOverScrollMode(2);
        } else if (Intrinsics.areEqual(value, ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m85432u(@NotNull NestedScrollableHost host, int margin) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(host, "host");
        final ViewPager2 viewPager2M85420g = m85420g(host);
        final int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(margin);
        viewPager2M85420g.setPageTransformer(new ViewPager2.PageTransformer() { // from class: ga0.d
            @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
            public final void transformPage(View view, float f11) {
                C37857g.m85416v(pixelFromDIP, viewPager2M85420g, view, f11);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m85433w(@NotNull NestedScrollableHost host, boolean value) {
        Intrinsics.checkNotNullParameter(host, "host");
        m85420g(host).setUserInputEnabled(value);
    }

    /* JADX INFO: renamed from: j */
    public static final void m85414j(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: renamed from: v */
    public static final void m85416v(int i11, ViewPager2 viewPager2, View page, float f11) {
        Intrinsics.checkNotNullParameter(page, "page");
        float f12 = i11 * f11;
        if (viewPager2.getOrientation() == 0) {
            if (viewPager2.getLayoutDirection() == 1) {
                f12 = -f12;
            }
            page.setTranslationX(f12);
            return;
        }
        page.setTranslationY(f12);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m85418e(@NotNull NestedScrollableHost parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C27519a c27519a = (C27519a) m85420g(parent).getAdapter();
        Intrinsics.checkNotNull(c27519a);
        return c27519a.m68166h(index);
    }

    /* JADX INFO: renamed from: f */
    public final int m85419f(@NotNull NestedScrollableHost parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView.Adapter adapter = m85420g(parent).getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ViewPager2 m85420g(@NotNull NestedScrollableHost view) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getChildAt(0) instanceof ViewPager2) {
            View childAt = view.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            return (ViewPager2) childAt;
        }
        throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
    }

    /* JADX INFO: renamed from: k */
    public final void m85423k(@NotNull NestedScrollableHost parent) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ViewPager2 viewPager2M85420g = m85420g(parent);
        viewPager2M85420g.setUserInputEnabled(false);
        C27519a c27519a = (C27519a) viewPager2M85420g.getAdapter();
        if (c27519a != null) {
            c27519a.m68169k();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m85424l(@NotNull NestedScrollableHost parent, @NotNull View view) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewPager2 viewPager2M85420g = m85420g(parent);
        C27519a c27519a = (C27519a) viewPager2M85420g.getAdapter();
        if (c27519a != null) {
            c27519a.m68170l(view);
        }
        m85422i(viewPager2M85420g);
    }

    /* JADX INFO: renamed from: m */
    public final void m85425m(@NotNull NestedScrollableHost parent, int index) throws ClassNotFoundException {
        View viewM68166h;
        Intrinsics.checkNotNullParameter(parent, "parent");
        ViewPager2 viewPager2M85420g = m85420g(parent);
        C27519a c27519a = (C27519a) viewPager2M85420g.getAdapter();
        ViewGroup viewGroup = null;
        if (c27519a != null) {
            viewM68166h = c27519a.m68166h(index);
        } else {
            viewM68166h = null;
        }
        if (viewM68166h != null && viewM68166h.getParent() != null) {
            ViewParent parent2 = viewM68166h.getParent();
            if (parent2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent2;
            }
            if (viewGroup != null) {
                viewGroup.removeView(viewM68166h);
            }
        }
        if (c27519a != null) {
            c27519a.m68171m(index);
        }
        m85422i(viewPager2M85420g);
    }

    /* JADX INFO: renamed from: n */
    public final void m85426n(@NotNull ViewPager2 view, int selectedTab, boolean scrollSmooth) {
        Intrinsics.checkNotNullParameter(view, "view");
        m85422i(view);
        view.setCurrentItem(selectedTab, scrollSmooth);
    }
}
