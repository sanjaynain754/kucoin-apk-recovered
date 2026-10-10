package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.RNCViewPagerManagerDelegate;
import com.facebook.react.viewmanagers.RNCViewPagerManagerInterface;
import com.facebook.soloader.SoLoader;
import com.reactnativepagerview.PagerViewViewManager;
import com.reactnativepagerview.event.PageScrollEvent;
import com.reactnativepagerview.event.PageScrollStateChangedEvent;
import com.reactnativepagerview.event.PageSelectedEvent;
import com.tencent.qcloud.tuicore.TUIConstants;
import ga0.C37851a;
import ga0.C37857g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p302h6.C38115a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PagerViewViewManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = "RNCViewPager")
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0002\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\"H\u0017J\u001c\u0010%\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010&\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\u0019H\u0017J\u001c\u0010'\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010(\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\u0019H\u0017J\u001a\u0010)\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\u0019H\u0017J\u001c\u0010*\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010+\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\"H\u0017J\u001c\u0010,\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010\nH\u0017J \u0010-\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\"J\u001a\u00100\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u0019H\u0016J\u001a\u00101\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u0019H\u0016J\u001a\u00102\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u00103\u001a\u00020\"H\u0016J \u00104\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0605H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m90084d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/NestedScrollableHost;", "Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface;", "<init>", "()V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "getName", "", "receiveCommand", "", "root", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "addView", "host", "child", "Landroid/view/View;", "index", "", "getChildCount", "parent", "getChildAt", "removeView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "removeAllViews", "removeViewAt", "needsCustomLayoutForChildren", "", "setScrollEnabled", "value", "setLayoutDirection", "setInitialPage", "setOrientation", "setOffscreenPageLimit", "setPageMargin", "setOverScrollMode", "setOverdrag", "setKeyboardDismissMode", "goTo", "selectedPage", "scrollWithAnimation", "setPage", "setPageWithoutAnimation", "setScrollEnabledImperatively", "scrollEnabled", "getExportedCustomDirectEventTypeConstants", "", "", "Companion", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class PagerViewViewManager extends ViewGroupManager<NestedScrollableHost> implements RNCViewPagerManagerInterface<NestedScrollableHost> {

    @NotNull
    private final ViewManagerDelegate<NestedScrollableHost> mDelegate = new RNCViewPagerManagerDelegate(this);

    /* JADX INFO: renamed from: com.reactnativepagerview.PagerViewViewManager$a */
    /* JADX INFO: compiled from: PagerViewViewManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"com/reactnativepagerview/PagerViewViewManager$a", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "", ViewProps.POSITION, "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C27518a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ThemedReactContext f55910b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ NestedScrollableHost f55911c;

        public C27518a(ThemedReactContext themedReactContext, NestedScrollableHost nestedScrollableHost) {
            this.f55910b = themedReactContext;
            this.f55911c = nestedScrollableHost;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int state) {
            String str;
            super.onPageScrollStateChanged(state);
            if (state != 0) {
                if (state != 1) {
                    if (state == 2) {
                        str = "settling";
                    } else {
                        throw new IllegalStateException("Unsupported pageScrollState");
                    }
                } else {
                    str = "dragging";
                }
            } else {
                str = "idle";
            }
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f55910b, this.f55911c.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new PageScrollStateChangedEvent(this.f55911c.getId(), str));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f55910b, this.f55911c.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new PageScrollEvent(this.f55911c.getId(), position, positionOffset));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f55910b, this.f55911c.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new PageSelectedEvent(this.f55911c.getId(), position));
            }
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(@Nullable NestedScrollableHost view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "overdrag")
    public void setOverdrag(@Nullable NestedScrollableHost view, boolean value) {
    }

    static {
        String str = C37851a.f85227a;
        if (str != null) {
            SoLoader.loadLibrary(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(ViewPager2 viewPager2, ThemedReactContext themedReactContext, NestedScrollableHost nestedScrollableHost) {
        viewPager2.registerOnPageChangeCallback(new C27518a(themedReactContext, nestedScrollableHost));
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, nestedScrollableHost.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new PageSelectedEvent(nestedScrollableHost.getId(), viewPager2.getCurrentItem()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public NestedScrollableHost createViewInstance(@NotNull final ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(reactContext);
        nestedScrollableHost.setId(View.generateViewId());
        nestedScrollableHost.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nestedScrollableHost.setSaveEnabled(false);
        final ViewPager2 viewPager2 = new ViewPager2(reactContext);
        viewPager2.setAdapter(new C27519a());
        viewPager2.setSaveEnabled(false);
        viewPager2.post(new Runnable() { // from class: ga0.c
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.createViewInstance$lambda$0(viewPager2, reactContext, nestedScrollableHost);
            }
        });
        nestedScrollableHost.addView(viewPager2);
        return nestedScrollableHost;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<NestedScrollableHost> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNCViewPager";
    }

    public final void goTo(@Nullable NestedScrollableHost root, int selectedPage, boolean scrollWithAnimation) throws ClassNotFoundException {
        if (root == null) {
            return;
        }
        C37857g c37857g = C37857g.f85235a;
        ViewPager2 viewPager2M85420g = c37857g.m85420g(root);
        C38115a.m86047c(viewPager2M85420g);
        RecyclerView.Adapter adapter = viewPager2M85420g.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0 || selectedPage < 0 || selectedPage >= numValueOf.intValue()) {
            return;
        }
        c37857g.m85426n(viewPager2M85420g, selectedPage, scrollWithAnimation);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return C37857g.f85235a.m85421h();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull NestedScrollableHost root, @NotNull String commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        this.mDelegate.receiveCommand(root, commandId, args);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(@NotNull NestedScrollableHost parent) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C37857g.f85235a.m85423k(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull NestedScrollableHost parent, @NotNull View view) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        C37857g.f85235a.m85424l(parent, view);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = 0, name = "initialPage")
    public void setInitialPage(@Nullable NestedScrollableHost view, int value) throws ClassNotFoundException {
        if (view != null) {
            C37857g.f85235a.m85427o(view, value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = ViewProps.LAYOUT_DIRECTION)
    public void setLayoutDirection(@Nullable NestedScrollableHost view, @Nullable String value) throws ClassNotFoundException {
        if (view == null || value == null) {
            return;
        }
        C37857g.f85235a.m85428q(view, value);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = -1, name = "offscreenPageLimit")
    public void setOffscreenPageLimit(@Nullable NestedScrollableHost view, int value) {
        if (view != null) {
            C37857g.f85235a.m85429r(view, value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "orientation")
    public void setOrientation(@Nullable NestedScrollableHost view, @Nullable String value) {
        if (view == null || value == null) {
            return;
        }
        C37857g.f85235a.m85430s(view, value);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(@Nullable NestedScrollableHost view, @Nullable String value) {
        if (view == null || value == null) {
            return;
        }
        C37857g.f85235a.m85431t(view, value);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setPage(@Nullable NestedScrollableHost view, int selectedPage) throws ClassNotFoundException {
        goTo(view, selectedPage, true);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = 0, name = "pageMargin")
    public void setPageMargin(@Nullable NestedScrollableHost view, int value) throws ClassNotFoundException {
        if (view != null) {
            C37857g.f85235a.m85432u(view, value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setPageWithoutAnimation(@Nullable NestedScrollableHost view, int selectedPage) throws ClassNotFoundException {
        goTo(view, selectedPage, false);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(@Nullable NestedScrollableHost view, boolean value) {
        if (view != null) {
            C37857g.f85235a.m85433w(view, value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setScrollEnabledImperatively(@Nullable NestedScrollableHost view, boolean scrollEnabled) {
        if (view != null) {
            C37857g.f85235a.m85433w(view, scrollEnabled);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull NestedScrollableHost host, @NotNull View child, int index) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(child, "child");
        C37857g.f85235a.m85417d(host, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull NestedScrollableHost parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return C37857g.f85235a.m85418e(parent, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull NestedScrollableHost parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return C37857g.f85235a.m85419f(parent);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> mapM10224of = MapBuilder.m10224of("topPageScroll", MapBuilder.m10222of("registrationName", "onPageScroll"), "topPageScrollStateChanged", MapBuilder.m10222of("registrationName", "onPageScrollStateChanged"), "topPageSelected", MapBuilder.m10222of("registrationName", "onPageSelected"));
        Intrinsics.checkNotNullExpressionValue(mapM10224of, "of(...)");
        return mapM10224of;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull NestedScrollableHost parent, int index) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C37857g.f85235a.m85425m(parent, index);
    }
}
