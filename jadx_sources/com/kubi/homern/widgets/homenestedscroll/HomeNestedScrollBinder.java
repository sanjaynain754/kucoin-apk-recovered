package com.kubi.homern.widgets.homenestedscroll;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.C5771R;
import com.kubi.homern.widgets.homerefresh.KCHomeRefreshLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: HomeNestedScrollBinder.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u000e\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0003H\u0002J2\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130&H\u0002J\n\u0010'\u001a\u0004\u0018\u00010\u0015H\u0002J\n\u0010(\u001a\u0004\u0018\u00010\u0003H\u0002J\u001c\u0010)\u001a\u0004\u0018\u00010\u00032\b\u0010*\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020\u0005H\u0002J\u001a\u0010,\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0005H\u0002J$\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0017H\u0002J\u000e\u0010+\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u0016\u00102\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollBinder;", "", "coordinator", "Landroid/view/View;", "outerNativeId", "", "containerNativeId", "innerPrefix", "headerNativeId", "<init>", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "hostRef", "Ljava/lang/ref/WeakReference;", "outerRef", "headerRef", "currentFeedRef", "observers", "", "Lkotlin/Pair;", "Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;", "refreshLayoutRef", "Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout;", "refreshTouchObserver", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "bind", "", "unbind", "outer", "header", "setCurrentFeed", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "dispatchRefreshTouch", "event", "candidates", "", "deciders", "", "findRefreshLayout", "findHost", "findInSiblings", "node", "nativeId", "findByNativeId", "root", "walk", TUIConstants.TIMPush.NOTIFICATION.ACTION, "resolveVerticalScrollable", "isVerticalScrollContainer", "selectFallbackFeed", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeNestedScrollBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeNestedScrollBinder.kt\ncom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1285#2,2:195\n1299#2,4:197\n1869#2,2:201\n1869#2,2:204\n295#2,2:206\n1999#2,14:208\n2746#2,3:222\n1#3:203\n*S KotlinDebug\n*F\n+ 1 HomeNestedScrollBinder.kt\ncom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollBinder\n*L\n54#1:195,2\n54#1:197,4\n65#1:201,2\n78#1:204,2\n100#1:206,2\n179#1:208,14\n49#1:222,3\n*E\n"})
public final class HomeNestedScrollBinder {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f26994m = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final View f26995a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f26996b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f26997c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f26998d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f26999e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public WeakReference<View> f27000f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public WeakReference<View> f27001g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public WeakReference<View> f27002h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public WeakReference<View> f27003i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<Pair<WeakReference<View>, HomeNestedScrollGestureDecider>> f27004j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public WeakReference<KCHomeRefreshLayout> f27005k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Function1<? super MotionEvent, Unit> f27006l;

    /* JADX INFO: compiled from: HomeNestedScrollBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollBinder$Companion;", "", "<init>", "()V", "HOST_NATIVE_ID", "", "MAX_ANCESTOR_DEPTH", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: l */
    public final View m31311l(View view, String str) {
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View viewM31309j = m31309j(childAt, str);
            if (viewM31309j != null) {
                return viewM31309j;
            }
        }
        return null;
    }

    public HomeNestedScrollBinder(@NotNull View coordinator, @NotNull String outerNativeId, @NotNull String containerNativeId, @NotNull String innerPrefix, @NotNull String headerNativeId) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(outerNativeId, "outerNativeId");
        Intrinsics.checkNotNullParameter(containerNativeId, "containerNativeId");
        Intrinsics.checkNotNullParameter(innerPrefix, "innerPrefix");
        Intrinsics.checkNotNullParameter(headerNativeId, "headerNativeId");
        this.f26995a = coordinator;
        this.f26996b = outerNativeId;
        this.f26997c = containerNativeId;
        this.f26998d = innerPrefix;
        this.f26999e = headerNativeId;
        this.f27004j = new ArrayList();
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m31305g(HomeNestedScrollBinder homeNestedScrollBinder, View view, List list, View markedNode) {
        View viewM31317r;
        Intrinsics.checkNotNullParameter(markedNode, "markedNode");
        String strM31315p = homeNestedScrollBinder.m31315p(markedNode);
        if (strM31315p != null) {
            if (StringsKt.startsWith$default(strM31315p, homeNestedScrollBinder.f26998d + ':', false, 2, (Object) null) && (viewM31317r = homeNestedScrollBinder.m31317r(markedNode)) != null && viewM31317r != view && viewM31317r.isAttachedToWindow() && viewM31317r.getVisibility() == 0) {
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((View) it.next()) == viewM31317r) {
                        }
                    }
                    list.add(viewM31317r);
                } else {
                    list.add(viewM31317r);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m31306h(HomeNestedScrollBinder homeNestedScrollBinder, List list, Map map, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        homeNestedScrollBinder.m31308i(event, list, map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final View m31310k() {
        View view = this.f26995a;
        for (int i11 = 0; i11 < 8; i11++) {
            if (Intrinsics.areEqual(view != null ? m31315p(view) : null, "KCHomeNestedScrollHost")) {
                return view;
            }
            View viewM31311l = m31311l(view, "KCHomeNestedScrollHost");
            if (viewM31311l != null) {
                return viewM31311l;
            }
            Object parent = view != null ? view.getParent() : null;
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final KCHomeRefreshLayout m31312m() {
        View view = this.f26995a;
        for (int i11 = 0; i11 < 8; i11++) {
            if (view instanceof KCHomeRefreshLayout) {
                return (KCHomeRefreshLayout) view;
            }
            Object parent = view != null ? view.getParent() : null;
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final View m31313n() {
        View view;
        WeakReference<View> weakReference = this.f27002h;
        if (weakReference == null || (view = weakReference.get()) == null || !view.isAttachedToWindow()) {
            return null;
        }
        return view;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m31314o(View view) {
        if ((view instanceof ScrollView) || (view instanceof AbsListView) || (view instanceof RecyclerView)) {
            return true;
        }
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt.contains$default((CharSequence) name, (CharSequence) "ReactScrollView", false, 2, (Object) null)) {
            return true;
        }
        String name2 = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        return StringsKt.contains$default((CharSequence) name2, (CharSequence) "RecyclerView", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: p */
    public final String m31315p(View view) {
        Object tag = view.getTag(C5771R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final View m31316q() {
        View view;
        WeakReference<View> weakReference = this.f27001g;
        if (weakReference == null || (view = weakReference.get()) == null || !view.isAttachedToWindow()) {
            return null;
        }
        return view;
    }

    /* JADX INFO: renamed from: s */
    public final void m31318s(List<? extends View> list) {
        View view;
        Object obj;
        WeakReference<View> weakReference = this.f27000f;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[1];
        int height = view.getHeight() + i11;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                View view2 = (View) next;
                int[] iArr2 = new int[2];
                view2.getLocationOnScreen(iArr2);
                int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.min(height, iArr2[1] + view2.getHeight()) - Math.max(i11, iArr2[1]), 0);
                do {
                    Object next2 = it.next();
                    View view3 = (View) next2;
                    int[] iArr3 = new int[2];
                    view3.getLocationOnScreen(iArr3);
                    int iCoerceAtLeast2 = RangesKt.coerceAtLeast(Math.min(height, iArr3[1] + view3.getHeight()) - Math.max(i11, iArr3[1]), 0);
                    if (iCoerceAtLeast < iCoerceAtLeast2) {
                        next = next2;
                        iCoerceAtLeast = iCoerceAtLeast2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        View view4 = (View) obj;
        if (view4 != null) {
            m31319t(view4);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m31319t(View view) {
        this.f27003i = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: u */
    public final void m31320u() {
        WeakReference<KCHomeRefreshLayout> weakReference;
        KCHomeRefreshLayout kCHomeRefreshLayout;
        Function1<? super MotionEvent, Unit> function1 = this.f27006l;
        if (function1 != null && (weakReference = this.f27005k) != null && (kCHomeRefreshLayout = weakReference.get()) != null) {
            kCHomeRefreshLayout.m31372u(function1);
        }
        this.f27006l = null;
        this.f27005k = null;
        Iterator<T> it = this.f27004j.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            WeakReference weakReference2 = (WeakReference) pair.component1();
            View view = (View) weakReference2.get();
            if (view != null) {
                view.setOnTouchListener(null);
            }
        }
        this.f27004j.clear();
        this.f27000f = null;
        this.f27001g = null;
        this.f27002h = null;
        this.f27003i = null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m31307f() {
        View viewM31309j;
        View viewM31309j2;
        View viewM31309j3;
        final View viewM31317r;
        m31320u();
        View viewM31310k = m31310k();
        if (viewM31310k == null || (viewM31309j = m31309j(viewM31310k, this.f26996b)) == null || (viewM31309j2 = m31309j(viewM31310k, this.f26997c)) == null || (viewM31309j3 = m31309j(viewM31310k, this.f26999e)) == null || (viewM31317r = m31317r(viewM31309j)) == null || StringsKt.isBlank(this.f26998d)) {
            return false;
        }
        this.f27000f = new WeakReference<>(viewM31310k);
        this.f27001g = new WeakReference<>(viewM31317r);
        this.f27002h = new WeakReference<>(viewM31309j3);
        final ArrayList<View> arrayList = new ArrayList();
        m31321v(viewM31309j2, new Function1() { // from class: com.kubi.homern.widgets.homenestedscroll.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeNestedScrollBinder.m31305g(this.f27035b, viewM31317r, arrayList, (View) obj);
            }
        });
        final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, new HomeNestedScrollGestureDecider((View) obj, new HomeNestedScrollBinder$bind$deciders$1$1(this), new HomeNestedScrollBinder$bind$deciders$1$2(this), new HomeNestedScrollBinder$bind$deciders$1$3(this)));
        }
        KCHomeRefreshLayout kCHomeRefreshLayoutM31312m = m31312m();
        if (kCHomeRefreshLayoutM31312m != null) {
            Function1<? super MotionEvent, Unit> function1 = new Function1() { // from class: com.kubi.homern.widgets.homenestedscroll.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return HomeNestedScrollBinder.m31306h(this.f27038b, arrayList, linkedHashMap, (MotionEvent) obj2);
                }
            };
            kCHomeRefreshLayoutM31312m.m31364j(function1);
            this.f27005k = new WeakReference<>(kCHomeRefreshLayoutM31312m);
            this.f27006l = function1;
        } else {
            for (View view : arrayList) {
                HomeNestedScrollGestureDecider homeNestedScrollGestureDecider = new HomeNestedScrollGestureDecider(view, new HomeNestedScrollBinder$bind$2$observer$1(this), new HomeNestedScrollBinder$bind$2$observer$2(this), new HomeNestedScrollBinder$bind$2$observer$3(this));
                view.setOnTouchListener(homeNestedScrollGestureDecider);
                this.f27004j.add(TuplesKt.m90091to(new WeakReference(view), homeNestedScrollGestureDecider));
            }
        }
        m31318s(arrayList);
        return !arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: i */
    public final void m31308i(MotionEvent motionEvent, List<? extends View> list, Map<View, HomeNestedScrollGestureDecider> map) {
        View view;
        HomeNestedScrollGestureDecider homeNestedScrollGestureDecider;
        Object next;
        Rect rect;
        if (motionEvent.getActionMasked() == 0) {
            Iterator<T> it = list.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    rect = new Rect();
                    ((View) next).getGlobalVisibleRect(rect);
                } else {
                    next = null;
                    break;
                }
            } while (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
            View view2 = (View) next;
            if (view2 != null) {
                m31319t(view2);
            }
        }
        WeakReference<View> weakReference = this.f27003i;
        if (weakReference != null && (view = weakReference.get()) != null && (homeNestedScrollGestureDecider = map.get(view)) != null) {
            homeNestedScrollGestureDecider.m31328g(motionEvent);
        }
    }

    /* JADX INFO: renamed from: j */
    public final View m31309j(View view, String str) {
        if (!StringsKt.isBlank(str) && Intrinsics.areEqual(m31315p(view), str)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                View viewM31309j = m31309j(childAt, str);
                if (viewM31309j != null) {
                    return viewM31309j;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final View m31317r(View view) {
        if (m31314o(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                View viewM31317r = m31317r(childAt);
                if (viewM31317r != null) {
                    return viewM31317r;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m31321v(View view, Function1<? super View, Unit> function1) {
        function1.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                m31321v(childAt, function1);
            }
        }
    }
}
