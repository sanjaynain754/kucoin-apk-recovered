package com.kubi.resources.widget.flyco;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.resources.widget.flyco.SimpleScrollBarLayout;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.reactivex.functions.BiConsumer;
import java.util.List;
import k00.C40854r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: SimpleScrollBarLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fJ\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006$"}, m90084d2 = {"Lcom/kubi/resources/widget/flyco/SimpleScrollBarLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewSimpleScrollBarLayoutBinding", "Lcom/kubi/sdk/res/databinding/ViewSimpleScrollBarLayoutBinding;", "getViewSimpleScrollBarLayoutBinding", "()Lcom/kubi/sdk/res/databinding/ViewSimpleScrollBarLayoutBinding;", "viewSimpleScrollBarLayoutBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "positionChanged", "Lio/reactivex/functions/BiConsumer;", "", "getPositionChanged", "()Lio/reactivex/functions/BiConsumer;", "setPositionChanged", "(Lio/reactivex/functions/BiConsumer;)V", "setTabData", "", "list", "", "autoScroll", "setCurrentIndex", "index", "getTabCount", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSimpleScrollBarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleScrollBarLayout.kt\ncom/kubi/resources/widget/flyco/SimpleScrollBarLayout\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,125:1\n52#2:126\n80#2,7:127\n1878#3,2:134\n1880#3:153\n1#4:136\n157#5,8:137\n157#5,8:145\n*S KotlinDebug\n*F\n+ 1 SimpleScrollBarLayout.kt\ncom/kubi/resources/widget/flyco/SimpleScrollBarLayout\n*L\n28#1:126\n28#1:127,7\n50#1:134,2\n50#1:153\n62#1:137,8\n64#1:145,8\n*E\n"})
public final class SimpleScrollBarLayout extends FrameLayout {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f44761e = {Reflection.property1(new PropertyReference1Impl(SimpleScrollBarLayout.class, "viewSimpleScrollBarLayoutBinding", "getViewSimpleScrollBarLayoutBinding()Lcom/kubi/sdk/res/databinding/ViewSimpleScrollBarLayoutBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f44762b;

    /* JADX INFO: renamed from: c */
    public int f44763c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BiConsumer<String, Integer> f44764d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleScrollBarLayout(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleScrollBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44762b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C40854r>() { // from class: com.kubi.resources.widget.flyco.SimpleScrollBarLayout$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C40854r invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C40854r.m89409a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.view_simple_scroll_bar_layout, this);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m55250e(SimpleScrollBarLayout simpleScrollBarLayout, int i11, String str) throws Exception {
        simpleScrollBarLayout.f44763c = i11;
        BiConsumer<String, Integer> biConsumer = simpleScrollBarLayout.f44764d;
        if (biConsumer != null) {
            biConsumer.accept(str, Integer.valueOf(i11));
        }
        simpleScrollBarLayout.setCurrentIndex(simpleScrollBarLayout.f44763c);
        return Unit.INSTANCE;
    }

    private final C40854r getViewSimpleScrollBarLayoutBinding() {
        return (C40854r) this.f44762b.getValue(this, f44761e[0]);
    }

    /* JADX INFO: renamed from: getCurrent, reason: from getter */
    public final int getF44763c() {
        return this.f44763c;
    }

    @Nullable
    public final BiConsumer<String, Integer> getPositionChanged() {
        return this.f44764d;
    }

    public final void setCurrent(int i11) {
        this.f44763c = i11;
    }

    public final void setCurrentIndex(int index) {
        this.f44763c = index;
        C40854r viewSimpleScrollBarLayoutBinding = getViewSimpleScrollBarLayoutBinding();
        if (viewSimpleScrollBarLayoutBinding != null) {
            int childCount = viewSimpleScrollBarLayoutBinding.f90815c.getChildCount();
            int i11 = 0;
            while (i11 < childCount) {
                ((CheckedTextView) viewSimpleScrollBarLayoutBinding.f90815c.getChildAt(i11).findViewById(R$id.tvLabel)).setChecked(i11 == this.f44763c);
                View viewFindViewById = viewSimpleScrollBarLayoutBinding.f90815c.getChildAt(i11).findViewById(R$id.viewIndicator);
                if (i11 == this.f44763c) {
                    Intrinsics.checkNotNull(viewFindViewById);
                    ViewExtKt.m66594y(viewFindViewById);
                } else {
                    Intrinsics.checkNotNull(viewFindViewById);
                    C27046k.m66703r(viewFindViewById);
                }
                i11++;
            }
        }
        m55251c(this.f44763c);
    }

    public final void setPositionChanged(@Nullable BiConsumer<String, Integer> biConsumer) {
        this.f44764d = biConsumer;
    }

    public final void setTabData(@NotNull List<String> list) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Intrinsics.checkNotNullParameter(list, "list");
        C40854r viewSimpleScrollBarLayoutBinding = getViewSimpleScrollBarLayoutBinding();
        if (viewSimpleScrollBarLayoutBinding != null && (linearLayout2 = viewSimpleScrollBarLayoutBinding.f90815c) != null) {
            linearLayout2.removeAllViews();
        }
        final int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.item_simple_scoll_bar, (ViewGroup) null);
            Intrinsics.checkNotNull(viewInflate);
            C27046k.m66711z(viewInflate, 0L, new Function0() { // from class: vw.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SimpleScrollBarLayout.m55250e(this.f102974b, i11, str);
                }
            }, 1, null);
            ((TextView) viewInflate.findViewById(R$id.tvLabel)).setText(str);
            View viewFindViewById = viewInflate.findViewById(R$id.viewIndicator);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66703r(viewFindViewById);
            C40854r viewSimpleScrollBarLayoutBinding2 = getViewSimpleScrollBarLayoutBinding();
            if (viewSimpleScrollBarLayoutBinding2 != null && (linearLayout = viewSimpleScrollBarLayoutBinding2.f90815c) != null) {
                linearLayout.addView(viewInflate);
            }
            if (i11 == CollectionsKt.getLastIndex(list)) {
                if (viewInflate.getLayoutDirection() == 1) {
                    viewInflate.setPadding(0, viewInflate.getPaddingTop(), viewInflate.getPaddingRight(), viewInflate.getPaddingBottom());
                } else {
                    viewInflate.setPadding(viewInflate.getPaddingLeft(), viewInflate.getPaddingTop(), 0, viewInflate.getPaddingBottom());
                }
            }
            i11 = i12;
        }
        setCurrentIndex(this.f44763c);
    }

    /* JADX INFO: renamed from: d */
    public static final void m55249d(SimpleScrollBarLayout simpleScrollBarLayout, int i11) {
        HorizontalScrollView horizontalScrollView;
        HorizontalScrollView horizontalScrollView2;
        HorizontalScrollView horizontalScrollView3;
        if (simpleScrollBarLayout.getViewSimpleScrollBarLayoutBinding() != null) {
            C40854r viewSimpleScrollBarLayoutBinding = simpleScrollBarLayout.getViewSimpleScrollBarLayoutBinding();
            if (viewSimpleScrollBarLayoutBinding != null) {
                horizontalScrollView = viewSimpleScrollBarLayoutBinding.f90814b;
            } else {
                horizontalScrollView = null;
            }
            if (horizontalScrollView != null) {
                int i12 = 66;
                if (i11 <= 2) {
                    C40854r viewSimpleScrollBarLayoutBinding2 = simpleScrollBarLayout.getViewSimpleScrollBarLayoutBinding();
                    if (viewSimpleScrollBarLayoutBinding2 != null && (horizontalScrollView3 = viewSimpleScrollBarLayoutBinding2.f90814b) != null) {
                        if (!C5303w0.m6511a()) {
                            i12 = 17;
                        }
                        horizontalScrollView3.fullScroll(i12);
                        return;
                    }
                    return;
                }
                C40854r viewSimpleScrollBarLayoutBinding3 = simpleScrollBarLayout.getViewSimpleScrollBarLayoutBinding();
                if (viewSimpleScrollBarLayoutBinding3 != null && (horizontalScrollView2 = viewSimpleScrollBarLayoutBinding3.f90814b) != null) {
                    if (C5303w0.m6511a()) {
                        i12 = 17;
                    }
                    horizontalScrollView2.fullScroll(i12);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m55251c(final int i11) {
        HorizontalScrollView horizontalScrollView;
        C40854r viewSimpleScrollBarLayoutBinding = getViewSimpleScrollBarLayoutBinding();
        if (viewSimpleScrollBarLayoutBinding != null && (horizontalScrollView = viewSimpleScrollBarLayoutBinding.f90814b) != null) {
            horizontalScrollView.post(new Runnable() { // from class: vw.b
                @Override // java.lang.Runnable
                public final void run() {
                    SimpleScrollBarLayout.m55249d(this.f102972b, i11);
                }
            });
        }
    }

    public final int getTabCount() {
        Integer numValueOf;
        LinearLayout linearLayout;
        C40854r viewSimpleScrollBarLayoutBinding = getViewSimpleScrollBarLayoutBinding();
        if (viewSimpleScrollBarLayoutBinding != null && (linearLayout = viewSimpleScrollBarLayoutBinding.f90815c) != null) {
            numValueOf = Integer.valueOf(linearLayout.getChildCount());
        } else {
            numValueOf = null;
        }
        return C27039d.m66650j(numValueOf);
    }
}
