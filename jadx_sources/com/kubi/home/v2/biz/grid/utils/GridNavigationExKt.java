package com.kubi.home.v2.biz.grid.utils;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.entity.GridNavigationMarkEntity;
import com.kubi.home.utils.HomeCoroutineScope;
import com.kubi.monitor.utils.DeviceLevel;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import cr.C36522b;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p289gj.C37967a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNavigationEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0080\b\u001a\u001a\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0006*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0001\u001a\u001d\u0010\u0014\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b\u001a\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"MAX_COUNT_GRID_NAVI_HOME", "", "GRID_NAVI_ITEM_SPACING_HORIZONTAL", "getGRID_NAVI_ITEM_SPACING_HORIZONTAL", "()I", "loadIconCompat", "", "Landroid/widget/ImageView;", "iconUrl", "", "bindMarkStyle", "Lcom/kubi/home/entity/GridNavigationEntity;", "ivMark", "tvMark", "Landroid/widget/TextView;", "smoothScrollToTopOf", "Landroidx/recyclerview/widget/RecyclerView;", ViewProps.POSITION, "offsetPx", "SPAN_COUNT_HOME_GRID", "jump", "pageId", "GRID_CLICKED_VALID_DAY", "recordGridNaviClick", "Lkotlinx/coroutines/Job;", "gridNaviId", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNavigationEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,149:1\n47#1,6:157\n1#2:150\n75#3:151\n77#3:156\n47#4,4:152\n*S KotlinDebug\n*F\n+ 1 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt\n*L\n78#1:157,6\n134#1:151\n134#1:156\n134#1:152,4\n*E\n"})
public final class GridNavigationExKt {

    /* JADX INFO: renamed from: a */
    public static final int f26423a = C27040e.m66658b(8);

    /* JADX INFO: renamed from: com.kubi.home.v2.biz.grid.utils.GridNavigationExKt$a */
    /* JADX INFO: compiled from: GridNavigationEx.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0014J0\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/home/v2/biz/grid/utils/GridNavigationExKt$smoothScrollToTopOf$1$scroller$1", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "getVerticalSnapPreference", "", "getHorizontalSnapPreference", "calculateDtToFit", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14953a extends LinearSmoothScroller {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f26424a;

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getHorizontalSnapPreference() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14953a(int i11, Context context) {
            super(context);
            this.f26424a = i11;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
            return (boxStart + this.f26424a) - viewStart;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m30668c(@NotNull final GridNavigationEntity gridNavigationEntity, @NotNull final ImageView ivMark, @NotNull final TextView tvMark) {
        Intrinsics.checkNotNullParameter(gridNavigationEntity, "<this>");
        Intrinsics.checkNotNullParameter(ivMark, "ivMark");
        Intrinsics.checkNotNullParameter(tvMark, "tvMark");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.grid.utils.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationExKt.m30669d(gridNavigationEntity, ivMark, tvMark);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final int m30670e() {
        return f26423a;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC41775x1 m30671f(@NotNull String gridNaviId) {
        Intrinsics.checkNotNullParameter(gridNaviId, "gridNaviId");
        return C41696j.m91104d(new HomeCoroutineScope(C42911a.m94120b(), "gridNaviClick"), new C37967a(CoroutineExceptionHandler.INSTANCE), null, new GridNavigationExKt$recordGridNaviClick$1(gridNaviId, null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m30672g(@NotNull final RecyclerView recyclerView, final int i11, final int i12) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.grid.utils.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationExKt.m30674i(recyclerView, i11, i12);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m30673h(RecyclerView recyclerView, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        m30672g(recyclerView, i11, i12);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m30669d(GridNavigationEntity gridNavigationEntity, ImageView imageView, TextView textView) {
        GridNavigationMarkEntity displayMark = gridNavigationEntity.getDisplayMark();
        if (displayMark == null) {
            C27046k.m66703r(imageView);
            C27046k.m66703r(textView);
        } else {
            C27046k.m66703r(imageView);
            C27046k.m66703r(textView);
            Integer styleType = displayMark.getStyleType();
            if (styleType != null && styleType.intValue() == 1) {
                if (C27041f.m66668h(displayMark.getName()).length() > 0) {
                    textView.setText(C27041f.m66668h(displayMark.getName()));
                    ViewExtKt.m66594y(textView);
                }
            } else if (styleType != null && styleType.intValue() == 2 && C27041f.m66668h(displayMark.getIconUrl()).length() > 0) {
                C27100x0.m66923d(new C14965l(imageView, displayMark.getIconUrl()));
                ViewExtKt.m66594y(imageView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m30674i(RecyclerView recyclerView, int i11, int i12) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return Unit.INSTANCE;
        }
        if (C36522b.f79371a.m81777g().compareTo(DeviceLevel.HIGH) <= 0) {
            linearLayoutManager.scrollToPositionWithOffset(i11, 0);
            return Unit.INSTANCE;
        }
        C14953a c14953a = new C14953a(i12, recyclerView.getContext());
        c14953a.setTargetPosition(i11);
        linearLayoutManager.startSmoothScroll(c14953a);
        return Unit.INSTANCE;
    }
}
