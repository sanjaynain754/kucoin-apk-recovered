package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.C22912t;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ScrollTabIndicatorView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0007J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\fH\u0002J\u0014\u0010%\u001a\u00020\u0011*\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/resources/widget/ScrollTabIndicatorView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listAdapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "currentCheckedItem", "onTabChecked", "Lkotlin/Function1;", "", "itemTextSize", "", "Ljava/lang/Float;", "setTabs", "tabs", "", "checkTab", "item", "setTextSize", "textSize", "getItem", ViewProps.POSITION, "convertItem", "helper", "fontMedium", "Landroid/graphics/Typeface;", "fontRegular", "colorChecked", "colorNormal", "onCheck", "Landroid/widget/TextView;", "checked", "", "dispatchTouchEvent", "e", "Landroid/view/MotionEvent;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScrollTabIndicatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollTabIndicatorView.kt\ncom/kubi/resources/widget/ScrollTabIndicatorView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1#2:124\n360#3,7:125\n360#3,7:132\n*S KotlinDebug\n*F\n+ 1 ScrollTabIndicatorView.kt\ncom/kubi/resources/widget/ScrollTabIndicatorView\n*L\n64#1:125,7\n65#1:132,7\n*E\n"})
public final class ScrollTabIndicatorView extends RecyclerView {

    /* JADX INFO: renamed from: b */
    @Nullable
    public BaseQuickAdapter<String, BaseViewHolder> f44037b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f44038c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function1<? super String, Unit> f44039d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Float f44040e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Typeface f44041f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final Typeface f44042g;

    /* JADX INFO: renamed from: h */
    public final int f44043h;

    /* JADX INFO: renamed from: i */
    public final int f44044i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollTabIndicatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollTabIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m54766c(@NotNull String item) {
        int i11;
        BaseQuickAdapter<String, BaseViewHolder> baseQuickAdapter;
        List<String> data;
        List<String> data2;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.length() == 0 || Intrinsics.areEqual(this.f44038c, item)) {
            return;
        }
        BaseQuickAdapter<String, BaseViewHolder> baseQuickAdapter2 = this.f44037b;
        int i12 = 0;
        if (baseQuickAdapter2 != null && (data2 = baseQuickAdapter2.getData()) != null) {
            Iterator<String> it = data2.iterator();
            i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next(), this.f44038c)) {
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            i11 = -1;
            break;
        }
        BaseQuickAdapter<String, BaseViewHolder> baseQuickAdapter3 = this.f44037b;
        if (baseQuickAdapter3 != null && (data = baseQuickAdapter3.getData()) != null) {
            Iterator<String> it2 = data.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i12 = -1;
                    break;
                } else if (Intrinsics.areEqual(it2.next(), item)) {
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            i12 = -1;
            break;
        }
        this.f44038c = item;
        if (i11 != -1 && (baseQuickAdapter = this.f44037b) != null) {
            baseQuickAdapter.notifyItemChanged(i11);
        }
        if (i12 != -1) {
            BaseQuickAdapter<String, BaseViewHolder> baseQuickAdapter4 = this.f44037b;
            if (baseQuickAdapter4 != null) {
                baseQuickAdapter4.notifyItemChanged(i12);
            }
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if ((i12 > iFindFirstVisibleItemPosition || iFindFirstVisibleItemPosition == -1) && (i12 < iFindLastVisibleItemPosition || iFindLastVisibleItemPosition == -1)) {
                return;
            }
            smoothScrollToPosition(i12);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m54767d(BaseViewHolder baseViewHolder, final String str) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvName);
        if (textView != null) {
            Float f11 = this.f44040e;
            if (f11 != null) {
                textView.setTextSize(f11.floatValue());
            }
            textView.setText(str);
            m54768f(textView, Intrinsics.areEqual(this.f44038c, str));
            C27046k.m66710y(textView, 1000L, new Function0() { // from class: com.kubi.resources.widget.z1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ScrollTabIndicatorView.m54765e(this.f45355b, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m54768f(TextView textView, boolean z11) {
        if (z11) {
            textView.setTypeface(this.f44041f);
            textView.setTextColor(this.f44043h);
            textView.setBackgroundResource(R$drawable.shape_cover4_4r);
        } else {
            textView.setTypeface(this.f44042g);
            textView.setTextColor(this.f44044i);
            textView.setBackgroundColor(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m54769g(@NotNull List<String> tabs, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f44038c = (String) CollectionsKt.firstOrNull((List) tabs);
        this.f44039d = function1;
        BaseQuickAdapter<String, BaseViewHolder> baseQuickAdapter = this.f44037b;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.setNewData(tabs);
        }
    }

    public /* synthetic */ ScrollTabIndicatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m54765e(ScrollTabIndicatorView scrollTabIndicatorView, String str) {
        scrollTabIndicatorView.m54766c(str);
        Function1<? super String, Unit> function1 = scrollTabIndicatorView.f44039d;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent e11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(e11);
    }

    public final void setTextSize(float textSize) {
        this.f44040e = Float.valueOf(textSize);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollTabIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C22912t.m54409g(this, false);
        setPaddingRelative(0, C27040e.m66658b(10), 0, C27040e.m66658b(10));
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        BaseQuickAdapter<String, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<String, BaseViewHolder>(R$layout.common_item_scrolltab_indicator_view, new ArrayList()) { // from class: com.kubi.resources.widget.ScrollTabIndicatorView.1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, String str) {
                if (baseViewHolder == null || str == null) {
                    return;
                }
                ScrollTabIndicatorView.this.m54767d(baseViewHolder, str);
            }
        };
        this.f44037b = baseQuickAdapter;
        setAdapter(baseQuickAdapter);
        this.f44041f = ResourcesCompat.getFont(context, R$font.medium);
        this.f44042g = ResourcesCompat.getFont(context, R$font.regular);
        this.f44043h = C27046k.m66699n(context, R$color.c_text);
        this.f44044i = C27046k.m66699n(context, R$color.c_text40);
    }
}
