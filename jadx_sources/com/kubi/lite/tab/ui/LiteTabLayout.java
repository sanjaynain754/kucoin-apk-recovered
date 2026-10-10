package com.kubi.lite.tab.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import ao.C4368a;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.lite.R$color;
import com.kubi.lite.R$id;
import com.kubi.lite.R$layout;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.bean.TabScrollEvent;
import com.kubi.lite.tab.config.TabConfigManager;
import com.kubi.lite.tab.util.LiteCommonUtils;
import com.kubi.lite.tab.util.LiteTabLottieUtil;
import com.kubi.lite.tab.util.TabScrollUtil;
import fo.C37576b;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p291go.C37976a;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: LiteTabLayout.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020'H\u0002J(\u0010(\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0007H\u0002J \u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020'H\u0002J\u0006\u0010/\u001a\u00020\u001dJ\u000e\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u000202J\b\u00103\u001a\u00020\u001dH\u0002J\u0010\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0002J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0002J\u0010\u00107\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0002J\u0010\u00108\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/lite/tab/ui/LiteTabLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "mTabItemLayout", "", "Landroid/widget/RelativeLayout;", "mImageViewList", "Landroid/widget/ImageView;", "mLottieAnimationViewList", "Lcom/airbnb/lottie/LottieAnimationView;", "mTextViewList", "Landroid/widget/TextView;", "mIconUtil", "Lcom/kubi/lite/tab/LiteTabIconUtil;", "mLottieUtil", "Lcom/kubi/lite/tab/util/LiteTabLottieUtil;", "mViewModel", "Lcom/kubi/lite/tab/viewmodel/LiteTabViewModel;", "mLastSelectedPosition", "observeViewModel", "", "setupTabs", "configs", "", "Lcom/kubi/lite/tab/bean/TabConfig;", "refreshTabStates", "selectedPos", "updateTabText", "index", "isSelected", "", "updateTabMedia", "config", "tabCount", "updateTabVisibility", "imageView", "lottieView", "showLottieView", "updateTitleByLanguageChange", "scrollTab", "tabScrollEvent", "Lcom/kubi/lite/tab/bean/TabScrollEvent;", "cleanupLists", "getItemResId", "i", "getIconResId", "getLottieResId", "getTextResId", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiteTabLayout extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f32117b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<RelativeLayout> f32118c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<ImageView> f32119d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<LottieAnimationView> f32120e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<TextView> f32121f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final C4368a f32122g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final LiteTabLottieUtil f32123h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public C37976a f32124i;

    /* JADX INFO: renamed from: j */
    public int f32125j;

    /* JADX INFO: renamed from: com.kubi.lite.tab.ui.LiteTabLayout$a */
    /* JADX INFO: compiled from: LiteTabLayout.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17401a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f32126b;

        public C17401a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f32126b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f32126b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32126b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiteTabLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m37617u(LiteTabLayout liteTabLayout, ImageView imageView, LottieAnimationView lottieAnimationView) {
        liteTabLayout.m37621A(imageView, lottieAnimationView, true);
        C44128b.m97266j(liteTabLayout.f32117b, "Lottie loaded in scrollTab");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m37620y(LiteTabLayout liteTabLayout, ImageView imageView, LottieAnimationView lottieAnimationView) {
        liteTabLayout.m37621A(imageView, lottieAnimationView, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m37621A(ImageView imageView, LottieAnimationView lottieAnimationView, boolean z11) {
        if (z11) {
            imageView.setVisibility(4);
            lottieAnimationView.setVisibility(0);
        } else {
            lottieAnimationView.setVisibility(4);
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m37631w(int i11, final TabConfig tabConfig, final boolean z11, final int i12) {
        String tabId;
        int i13;
        boolean zM84705d;
        try {
            final ImageView imageView = (ImageView) CollectionsKt.getOrNull(this.f32119d, i11);
            final LottieAnimationView lottieAnimationView = (LottieAnimationView) CollectionsKt.getOrNull(this.f32120e, i11);
            if (imageView != null && lottieAnimationView != null && (tabId = tabConfig.getTabId()) != null && tabId.length() != 0) {
                if (z11) {
                    i13 = i12;
                    zM84705d = C37576b.m84705d(C37576b.f83540a, tabConfig, true, i13, null, 8, null);
                } else {
                    i13 = i12;
                    boolean z12 = LiteCommonUtils.f32173a.m37656j(tabConfig, i13) && i11 == this.f32125j;
                    TabScrollUtil companion = TabScrollUtil.f32166f.getInstance();
                    String tabId2 = tabConfig.getTabId();
                    if (tabId2 == null) {
                        tabId2 = "";
                    }
                    zM84705d = (z12 || (companion.m37643g(tabId2) && i11 == this.f32125j)) && C37576b.m84705d(C37576b.f83540a, tabConfig, false, i13, null, 8, null);
                }
                m37621A(imageView, lottieAnimationView, false);
                this.f32122g.m3894a(imageView, tabConfig, z11, i13);
                if (zM84705d) {
                    m37621A(imageView, lottieAnimationView, false);
                    LiteTabLottieUtil.m37664i(this.f32123h, lottieAnimationView, tabConfig, z11, i13, null, 16, null);
                    this.f32123h.m37665d(lottieAnimationView, new Function0() { // from class: com.kubi.lite.tab.ui.m
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiteTabLayout.m37619x(this.f32145b, imageView, lottieAnimationView, tabConfig, z11, i12);
                        }
                    }, new Function0() { // from class: com.kubi.lite.tab.ui.n
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiteTabLayout.m37620y(this.f32151b, imageView, lottieAnimationView);
                        }
                    });
                    return;
                }
                return;
            }
            C44128b.m97261e(this.f32117b, "updateTabMedia: null view or empty tabId for index " + i11 + ", skipping");
        } catch (Exception e11) {
            C44128b.m97261e(this.f32117b, "updateTabMedia: " + e11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiteTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m37613o(LiteTabLayout liteTabLayout, List list) {
        if (list != null) {
            liteTabLayout.setupTabs(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m37616t(LiteTabLayout liteTabLayout, ImageView imageView, LottieAnimationView lottieAnimationView, TabConfig tabConfig, int i11) {
        C44128b.m97266j(liteTabLayout.f32117b, "Lottie play failed in scrollTab, back to icon");
        liteTabLayout.m37621A(imageView, lottieAnimationView, false);
        liteTabLayout.f32122g.m3894a(imageView, tabConfig, true, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m37618v(LiteTabLayout liteTabLayout, int i11, View view) throws JSONException {
        C37976a c37976a = liteTabLayout.f32124i;
        if (c37976a != null) {
            C37976a.m85821v(c37976a, i11, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m37619x(LiteTabLayout liteTabLayout, ImageView imageView, LottieAnimationView lottieAnimationView, TabConfig tabConfig, boolean z11, int i11) {
        C44128b.m97266j(liteTabLayout.f32117b, "Lottie play failed in updateTabMedia, back to icon");
        liteTabLayout.m37621A(imageView, lottieAnimationView, false);
        liteTabLayout.f32122g.m3894a(imageView, tabConfig, z11, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m37622B() {
        LiveData<List<TabConfig>> liveDataM85825q;
        C44128b.m97266j(this.f32117b, "updateTitleByLanguageChange");
        List<TabConfig> listM37554p = TabConfigManager.f32084a.m37554p();
        C37976a c37976a = this.f32124i;
        List<TabConfig> value = (c37976a == null || (liveDataM85825q = c37976a.m85825q()) == null) ? null : liveDataM85825q.getValue();
        if (value == null || listM37554p == null || value.size() != listM37554p.size()) {
            return;
        }
        int size = value.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!Intrinsics.areEqual(value.get(i11).getTabId(), listM37554p.get(i11).getTabId())) {
                return;
            }
        }
        int size2 = value.size();
        for (int i12 = 0; i12 < size2; i12++) {
            TabConfig tabConfig = listM37554p.get(i12);
            TextView textView = this.f32121f.get(i12);
            if (textView != null) {
                textView.setText(tabConfig.getTitle());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m37623i() {
        this.f32118c.clear();
        this.f32119d.clear();
        this.f32120e.clear();
        this.f32121f.clear();
    }

    /* JADX INFO: renamed from: j */
    public final int m37624j(int i11) {
        return ((Number) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$id.static_icon_1), Integer.valueOf(R$id.static_icon_2), Integer.valueOf(R$id.static_icon_3), Integer.valueOf(R$id.static_icon_4), Integer.valueOf(R$id.static_icon_5)}).get(i11)).intValue();
    }

    /* JADX INFO: renamed from: k */
    public final int m37625k(int i11) {
        return ((Number) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$id.tab_item_1), Integer.valueOf(R$id.tab_item_2), Integer.valueOf(R$id.tab_item_3), Integer.valueOf(R$id.tab_item_4), Integer.valueOf(R$id.tab_item_5)}).get(i11)).intValue();
    }

    /* JADX INFO: renamed from: l */
    public final int m37626l(int i11) {
        return ((Number) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$id.lottie_icon_1), Integer.valueOf(R$id.lottie_icon_2), Integer.valueOf(R$id.lottie_icon_3), Integer.valueOf(R$id.lottie_icon_4), Integer.valueOf(R$id.lottie_icon_5)}).get(i11)).intValue();
    }

    /* JADX INFO: renamed from: m */
    public final int m37627m(int i11) {
        return ((Number) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$id.tab_text_1), Integer.valueOf(R$id.tab_text_2), Integer.valueOf(R$id.tab_text_3), Integer.valueOf(R$id.tab_text_4), Integer.valueOf(R$id.tab_text_5)}).get(i11)).intValue();
    }

    /* JADX INFO: renamed from: r */
    public final void m37629r(int i11) {
        LiveData<List<TabConfig>> liveDataM85825q;
        List<TabConfig> value;
        C37976a c37976a = this.f32124i;
        if (c37976a == null || (liveDataM85825q = c37976a.m85825q()) == null || (value = liveDataM85825q.getValue()) == null) {
            return;
        }
        C44128b.m97266j(this.f32117b, "refreshTabStates - selectedPos:" + i11);
        int size = value.size();
        int i12 = 0;
        while (i12 < size) {
            boolean z11 = i12 == i11;
            TabConfig tabConfig = value.get(i12);
            m37632z(i12, z11);
            m37631w(i12, tabConfig, z11, value.size());
            i12++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    public final void m37630s(@NotNull TabScrollEvent tabScrollEvent) {
        final LottieAnimationView lottieAnimationView;
        Exception exc;
        LiteTabLayout liteTabLayout;
        List<TabConfig> value;
        int size;
        String tabId;
        Intrinsics.checkNotNullParameter(tabScrollEvent, "tabScrollEvent");
        try {
            int position = tabScrollEvent.getPosition();
            final TabConfig config = tabScrollEvent.getConfig();
            String scrollState = tabScrollEvent.getScrollState();
            final ImageView imageView = (ImageView) CollectionsKt.getOrNull(this.f32119d, position);
            lottieAnimationView = (LottieAnimationView) CollectionsKt.getOrNull(this.f32120e, position);
            C37976a c37976a = this.f32124i;
            if (c37976a != null) {
                try {
                    LiveData<List<TabConfig>> liveDataM85825q = c37976a.m85825q();
                    if (liveDataM85825q == null || (value = liveDataM85825q.getValue()) == null) {
                        size = 0;
                    } else {
                        size = value.size();
                    }
                } catch (Exception e11) {
                    exc = e11;
                    liteTabLayout = this;
                }
            } else {
                size = 0;
            }
            C44128b.m97266j(this.f32117b, "scrollTab - pos:" + position + ", state:" + scrollState + ", tabId:" + config.getTabId() + ", url:" + config.getUrl());
            try {
                if (scrollState != null && scrollState.length() != 0 && imageView != null && lottieAnimationView != null && (tabId = config.getTabId()) != null && tabId.length() != 0) {
                    boolean zM84708c = C37576b.f83540a.m84708c(config, true, size, scrollState);
                    C44128b.m97266j(this.f32117b, "scrollTab - hasLottie:" + zM84708c + " for state:" + scrollState);
                    if (!zM84708c) {
                        this.f32122g.m3894a(imageView, config, true, size);
                        return;
                    }
                    m37621A(imageView, lottieAnimationView, false);
                    this.f32123h.m37666h(lottieAnimationView, config, true, size, scrollState);
                    final int i11 = size;
                    this.f32123h.m37665d(lottieAnimationView, new Function0() { // from class: com.kubi.lite.tab.ui.o
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiteTabLayout.m37616t(this.f32154b, imageView, lottieAnimationView, config, i11);
                        }
                    }, new Function0() { // from class: com.kubi.lite.tab.ui.p
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiteTabLayout.m37617u(this.f32159b, imageView, lottieAnimationView);
                        }
                    });
                    return;
                    exc = e;
                    liteTabLayout = lottieAnimationView;
                    C44128b.m97261e(liteTabLayout.f32117b, "scrollTab: " + exc);
                    return;
                }
                C44128b.m97261e(this.f32117b, "scrollTab: null object or empty tabId/scrollState, returning...");
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            lottieAnimationView = this;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m37632z(int i11, boolean z11) {
        TextView textView = (TextView) CollectionsKt.getOrNull(this.f32121f, i11);
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), z11 ? R$color.lite_tab_text_selected : R$color.lite_tab_dynamic_items_bg));
            textView.setTypeface(null, z11 ? 1 : 0);
        }
    }

    public /* synthetic */ LiteTabLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m37614p(LiteTabLayout liteTabLayout, Integer num) {
        Intrinsics.checkNotNull(num);
        liteTabLayout.m37629r(num.intValue());
        liteTabLayout.f32125j = num.intValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m37615q(LiteTabLayout liteTabLayout, TabScrollEvent tabScrollEvent) {
        Intrinsics.checkNotNull(tabScrollEvent);
        liteTabLayout.m37630s(tabScrollEvent);
        return Unit.INSTANCE;
    }

    private final void setupTabs(List<TabConfig> configs) {
        int i11;
        LiveData<Integer> liveDataM85823o;
        Integer value;
        removeAllViews();
        m37623i();
        int size = configs.size();
        LiteCommonUtils liteCommonUtils = LiteCommonUtils.f32173a;
        if (size < liteCommonUtils.m37652f()) {
            i11 = R$layout.tab_layout_dynamic_items;
        } else {
            i11 = R$layout.tab_layout_five_items;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) this, true);
        int iM37652f = liteCommonUtils.m37652f();
        int iIntValue = 0;
        for (final int i12 = 0; i12 < iM37652f; i12++) {
            this.f32118c.add((RelativeLayout) viewInflate.findViewById(m37625k(i12)));
            this.f32119d.add((ImageView) viewInflate.findViewById(m37624j(i12)));
            this.f32120e.add((LottieAnimationView) viewInflate.findViewById(m37626l(i12)));
            this.f32121f.add((TextView) viewInflate.findViewById(m37627m(i12)));
            if (i12 < configs.size()) {
                TabConfig tabConfig = configs.get(i12);
                String tabId = tabConfig.getTabId();
                if (tabId != null && tabId.length() != 0) {
                    RelativeLayout relativeLayout = this.f32118c.get(i12);
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(0);
                    }
                    TextView textView = this.f32121f.get(i12);
                    if (textView != null) {
                        textView.setText(tabConfig.getTitle());
                    }
                    RelativeLayout relativeLayout2 = this.f32118c.get(i12);
                    if (relativeLayout2 != null) {
                        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.lite.tab.ui.i
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) throws JSONException {
                                LiteTabLayout.m37618v(this.f32140b, i12, view);
                            }
                        });
                    }
                    LiteTabLottieUtil.m37664i(this.f32123h, this.f32120e.get(i12), tabConfig, true, configs.size(), null, 16, null);
                } else {
                    C44128b.m97266j(this.f32117b, "setupTabs: config with empty tabId at index " + i12 + ", skipping");
                }
            } else {
                RelativeLayout relativeLayout3 = this.f32118c.get(i12);
                if (relativeLayout3 != null) {
                    relativeLayout3.setVisibility(8);
                }
            }
        }
        C37976a c37976a = this.f32124i;
        if (c37976a != null && (liveDataM85823o = c37976a.m85823o()) != null && (value = liveDataM85823o.getValue()) != null) {
            iIntValue = value.intValue();
        }
        m37629r(iIntValue);
    }

    /* JADX INFO: renamed from: n */
    public final void m37628n() {
        FragmentActivity fragmentActivity;
        LiveData<TabScrollEvent> liveDataM85826r;
        LiveData<Integer> liveDataM85823o;
        LiveData<List<TabConfig>> liveDataM85825q;
        Context context = getContext();
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            C37976a c37976a = this.f32124i;
            if (c37976a != null && (liveDataM85825q = c37976a.m85825q()) != null) {
                liveDataM85825q.observe(fragmentActivity, new C17401a(new Function1() { // from class: com.kubi.lite.tab.ui.j
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiteTabLayout.m37613o(this.f32142b, (List) obj);
                    }
                }));
            }
            C37976a c37976a2 = this.f32124i;
            if (c37976a2 != null && (liveDataM85823o = c37976a2.m85823o()) != null) {
                liveDataM85823o.observe(fragmentActivity, new C17401a(new Function1() { // from class: com.kubi.lite.tab.ui.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiteTabLayout.m37614p(this.f32143b, (Integer) obj);
                    }
                }));
            }
            C37976a c37976a3 = this.f32124i;
            if (c37976a3 != null && (liveDataM85826r = c37976a3.m85826r()) != null) {
                liveDataM85826r.observe(fragmentActivity, new C17401a(new Function1() { // from class: com.kubi.lite.tab.ui.l
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiteTabLayout.m37615q(this.f32144b, (TabScrollEvent) obj);
                    }
                }));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LiteTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32117b = "LiteV2-LiteTabLayout";
        this.f32118c = new ArrayList();
        this.f32119d = new ArrayList();
        this.f32120e = new ArrayList();
        this.f32121f = new ArrayList();
        this.f32122g = new C4368a(context);
        this.f32123h = new LiteTabLottieUtil();
        this.f32125j = -1;
        setOrientation(0);
        if (context instanceof FragmentActivity) {
            this.f32124i = (C37976a) new ViewModelProvider((ViewModelStoreOwner) context).get(C37976a.class);
            m37628n();
        }
    }
}
