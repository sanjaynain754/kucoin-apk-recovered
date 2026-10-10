package com.kubi.kumex.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$styleable;
import com.kubi.kumex.view.WeightListView;
import com.kubi.sdk.InnerViewHolder;
import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: WeightListView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014J0\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0014J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u0016\u0010\u001e\u001a\u00020\u00102\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bJ\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0015H\u0016J\u0014\u0010\"\u001a\u00020\u0010*\u00020#2\u0006\u0010!\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002J0\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u00020'2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u0002H&0)¢\u0006\u0002\b*H\u0002¢\u0006\u0002\u0010+R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/kumex/view/WeightListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "space", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "observer", "Lcom/kubi/kumex/view/WeightListView$AdapterObserver;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", ViewProps.ON_LAYOUT, "changed", "", CmcdData.Factory.STREAM_TYPE_LIVE, "t", "r", "b", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "getAdapter", "setAdapter", "_adapter", "setEnabled", "enabled", "setChildEnabled", "Landroid/view/ViewGroup;", "requestChange", "use", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/res/TypedArray;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "AdapterObserver", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWeightListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightListView.kt\ncom/kubi/kumex/view/WeightListView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class WeightListView extends LinearLayout {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f30926e = new Companion(null);

    /* JADX INFO: renamed from: b */
    public final int f30927b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public RecyclerView.Adapter<RecyclerView.ViewHolder> f30928c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final C17081a f30929d;

    /* JADX INFO: compiled from: WeightListView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/view/WeightListView$Companion;", "", "<init>", "()V", "getAdapterPosition", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int getAdapterPosition(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Object f47612i = ((InnerViewHolder) holder).getF47612i();
            Intrinsics.checkNotNull(f47612i, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) f47612i).intValue();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.view.WeightListView$a */
    /* JADX INFO: compiled from: WeightListView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/view/WeightListView$AdapterObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "<init>", "(Lcom/kubi/kumex/view/WeightListView;)V", "onChanged", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17081a extends RecyclerView.AdapterDataObserver {
        public C17081a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
            WeightListView.this.m36717c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightListView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.WeightListView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f30927b = ((Number) m36719f(typedArrayObtainStyledAttributes, new Function1() { // from class: xm.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(WeightListView.m36716e((TypedArray) obj));
            }
        })).intValue();
        this.f30929d = new C17081a();
    }

    /* JADX INFO: renamed from: e */
    public static final int m36716e(TypedArray use) {
        Intrinsics.checkNotNullParameter(use, "$this$use");
        return use.getDimensionPixelSize(R$styleable.WeightListView_space, 10);
    }

    @Nullable
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> getAdapter() {
        return this.f30928c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAdapter(@NotNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> _adapter) {
        Intrinsics.checkNotNullParameter(_adapter, "_adapter");
        RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.f30928c;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f30929d);
        }
        this.f30928c = _adapter;
        if (_adapter != 0) {
            _adapter.registerAdapterDataObserver(this.f30929d);
        }
        m36717c();
    }

    /* JADX INFO: renamed from: c */
    public final void m36717c() {
        removeAllViews();
        RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.f30928c;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i11 = 0; i11 < itemCount; i11++) {
                RecyclerView.ViewHolder viewHolderOnCreateViewHolder = adapter.onCreateViewHolder(this, adapter.getItemViewType(i11));
                adapter.onBindViewHolder(viewHolderOnCreateViewHolder, i11);
                View view = viewHolderOnCreateViewHolder.itemView;
                view.setTag(viewHolderOnCreateViewHolder);
                addView(view, viewHolderOnCreateViewHolder.itemView.getLayoutParams());
                Intrinsics.checkNotNull(viewHolderOnCreateViewHolder, "null cannot be cast to non-null type com.kubi.sdk.InnerViewHolder<*>");
                ((InnerViewHolder) viewHolderOnCreateViewHolder).m57942d(Integer.valueOf(i11));
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m36718d(ViewGroup viewGroup, boolean z11) {
        if (viewGroup.getChildCount() != 0) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof ViewGroup) {
                    m36718d((ViewGroup) childAt, z11);
                } else {
                    childAt.setEnabled(z11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final <T> T m36719f(TypedArray typedArray, Function1<? super TypedArray, ? extends T> function1) {
        T tInvoke = function1.invoke(typedArray);
        typedArray.recycle();
        return tInvoke;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev2) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(ev2);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        if (getChildCount() == 0) {
            super.onLayout(changed, l11, t11, r11, b11);
            return;
        }
        if (getOrientation() == 0) {
            int childCount = getChildCount();
            int measuredWidth = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                childAt.layout(measuredWidth, (getMeasuredHeight() - childAt.getMeasuredHeight()) / 2, childAt.getMeasuredWidth() + measuredWidth, (getMeasuredHeight() + childAt.getMeasuredHeight()) / 2);
                measuredWidth += childAt.getMeasuredWidth() + this.f30927b;
            }
            return;
        }
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            childAt2.layout((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2, 0, (getMeasuredWidth() + childAt2.getMeasuredWidth()) / 2, childAt2.getMeasuredHeight());
            setLeft(getLeft() + childAt2.getMeasuredHeight() + this.f30927b);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getChildCount() == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int i11 = 0;
        if (getOrientation() == 0) {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            int childCount = (size - ((getChildCount() - 1) * this.f30927b)) / getChildCount();
            int childCount2 = getChildCount();
            int iCoerceAtLeast = 0;
            while (i11 < childCount2) {
                View childAt = getChildAt(i11);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childCount, 1073741824), heightMeasureSpec);
                iCoerceAtLeast = RangesKt.coerceAtLeast(iCoerceAtLeast, childAt.getMeasuredHeight());
                i11++;
            }
            setMeasuredDimension(size, iCoerceAtLeast);
            return;
        }
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int childCount3 = (size2 - ((getChildCount() - 1) * this.f30927b)) / getChildCount();
        int childCount4 = getChildCount();
        int iCoerceAtLeast2 = 0;
        while (i11 < childCount4) {
            View childAt2 = getChildAt(i11);
            childAt2.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(childCount3, 1073741824));
            iCoerceAtLeast2 = RangesKt.coerceAtLeast(iCoerceAtLeast2, childAt2.getMeasuredWidth());
            i11++;
        }
        setMeasuredDimension(iCoerceAtLeast2, size2);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        m36718d(this, enabled);
    }
}
