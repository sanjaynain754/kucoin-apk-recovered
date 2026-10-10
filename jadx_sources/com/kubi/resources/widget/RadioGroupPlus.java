package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.IdRes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RadioGroupPlus.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00043456B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0014J \u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00172\b\b\u0001\u0010#\u001a\u00020\nJ\u001c\u0010$\u001a\u00020\u00172\b\b\u0001\u0010#\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\u0011H\u0002J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0011H\u0002J\u0006\u0010)\u001a\u00020\u0017J\u0010\u0010*\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020!H\u0014J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u000202H\u0016R \u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0018\u00010\u0015R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, m90084d2 = {"Lcom/kubi/resources/widget/RadioGroupPlus;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "checkedRadioButtonId", "getCheckedRadioButtonId", "()I", "mChildOnCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mProtectFromCheckedChange", "", "mOnCheckedChangeListener", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "mPassThroughListener", "Lcom/kubi/resources/widget/RadioGroupPlus$PassThroughHierarchyChangeListener;", "init", "", "setOnHierarchyChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "onFinishInflate", "addView", "child", "Landroid/view/View;", "index", ReportDataTable.COLUMN_PARAMS, "Landroid/view/ViewGroup$LayoutParams;", "check", "id", "setCheckedId", "isChecked", "setCheckedStateForView", "viewId", "checked", "clearCheck", "setOnCheckedChangeListener", "generateLayoutParams", "Lcom/kubi/resources/widget/RadioGroupPlus$LayoutParams;", "checkLayoutParams", "p", "generateDefaultLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "getAccessibilityClassName", "", "LayoutParams", "OnCheckedChangeListener", "CheckedStateTracker", "PassThroughHierarchyChangeListener", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RadioGroupPlus extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public int f44016b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f44017c;

    /* JADX INFO: renamed from: d */
    public boolean f44018d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC22946c f44019e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public ViewGroupOnHierarchyChangeListenerC22947d f44020f;

    /* JADX INFO: renamed from: com.kubi.resources.widget.RadioGroupPlus$a */
    /* JADX INFO: compiled from: RadioGroupPlus.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/resources/widget/RadioGroupPlus$CheckedStateTracker;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "(Lcom/kubi/resources/widget/RadioGroupPlus;)V", "onCheckedChanged", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C22944a implements CompoundButton.OnCheckedChangeListener {
        public C22944a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(@NotNull CompoundButton buttonView, boolean isChecked) {
            Intrinsics.checkNotNullParameter(buttonView, "buttonView");
            if (RadioGroupPlus.this.f44018d) {
                return;
            }
            RadioGroupPlus.this.f44018d = true;
            if (RadioGroupPlus.this.getF44016b() != -1) {
                RadioGroupPlus radioGroupPlus = RadioGroupPlus.this;
                radioGroupPlus.m54748l(radioGroupPlus.getF44016b(), false);
            }
            RadioGroupPlus.this.f44018d = false;
            RadioGroupPlus.this.m54747j(buttonView.getId(), isChecked);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.RadioGroupPlus$b */
    /* JADX INFO: compiled from: RadioGroupPlus.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eB\u0013\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0011B\u0013\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0014J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0014¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/resources/widget/RadioGroupPlus$LayoutParams;", "Landroid/widget/LinearLayout$LayoutParams;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "w", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(II)V", "initWeight", "", "(IIF)V", "p", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "source", "Landroid/view/ViewGroup$MarginLayoutParams;", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "setBaseAttributes", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/res/TypedArray;", "widthAttr", "heightAttr", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22945b extends LinearLayout.LayoutParams {
        public C22945b(@Nullable Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C22945b(int i11, int i12) {
            super(i11, i12);
        }

        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(@NotNull TypedArray a11, int widthAttr, int heightAttr) {
            Intrinsics.checkNotNullParameter(a11, "a");
            ((LinearLayout.LayoutParams) this).width = a11.hasValue(widthAttr) ? a11.getLayoutDimension(widthAttr, "layout_width") : -2;
            ((LinearLayout.LayoutParams) this).height = a11.hasValue(heightAttr) ? a11.getLayoutDimension(heightAttr, "layout_height") : -2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.RadioGroupPlus$c */
    /* JADX INFO: compiled from: RadioGroupPlus.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC22946c {
        /* JADX INFO: renamed from: a */
        void mo16018a(@Nullable RadioGroupPlus radioGroupPlus, @IdRes int i11, boolean z11);
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.RadioGroupPlus$d */
    /* JADX INFO: compiled from: RadioGroupPlus.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/RadioGroupPlus$PassThroughHierarchyChangeListener;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "<init>", "(Lcom/kubi/resources/widget/RadioGroupPlus;)V", "mOnHierarchyChangeListener", "getMOnHierarchyChangeListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "setMOnHierarchyChangeListener", "(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V", "traverseTree", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onChildViewAdded", "parent", "child", "onChildViewRemoved", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class ViewGroupOnHierarchyChangeListenerC22947d implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: b */
        @Nullable
        public ViewGroup.OnHierarchyChangeListener f44022b;

        public ViewGroupOnHierarchyChangeListenerC22947d() {
        }

        /* JADX INFO: renamed from: a */
        public final void m54749a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (view instanceof RadioButton) {
                if (view.getId() == -1) {
                    view.setId(View.generateViewId());
                }
                ((RadioButton) view).setOnCheckedChangeListener(RadioGroupPlus.this.f44017c);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() == 0) {
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                    m54749a(childAt);
                }
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(@NotNull View parent, @NotNull View child) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            m54749a(child);
            if (parent == RadioGroupPlus.this && (child instanceof RadioButton)) {
                if (child.getId() == -1) {
                    child.setId(View.generateViewId());
                }
                ((RadioButton) child).setOnCheckedChangeListener(RadioGroupPlus.this.f44017c);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f44022b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(@NotNull View parent, @NotNull View child) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            if (parent == RadioGroupPlus.this && (child instanceof RadioButton)) {
                ((RadioButton) child).setOnCheckedChangeListener(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f44022b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }

        public final void setMOnHierarchyChangeListener(@Nullable ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            this.f44022b = onHierarchyChangeListener;
        }
    }

    public RadioGroupPlus(@Nullable Context context) {
        super(context);
        this.f44016b = -1;
        setOrientation(1);
        m54746i();
    }

    /* JADX INFO: renamed from: f */
    public final void m54743f(@IdRes int i11) {
        if (i11 == -1 || i11 != this.f44016b) {
            int i12 = this.f44016b;
            if (i12 != -1) {
                m54748l(i12, false);
            }
            if (i11 != -1) {
                m54748l(i11, true);
            }
            this.f44016b = i11;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m54744g() {
        m54743f(-1);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m54742k(RadioGroupPlus radioGroupPlus, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        radioGroupPlus.m54747j(i11, z11);
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        if (child instanceof RadioButton) {
            RadioButton radioButton = (RadioButton) child;
            if (radioButton.isChecked()) {
                this.f44018d = true;
                int i11 = this.f44016b;
                if (i11 != -1) {
                    m54748l(i11, false);
                }
                this.f44018d = false;
                m54742k(this, radioButton.getId(), false, 2, null);
            }
        }
        super.addView(child, index, params);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(@NotNull ViewGroup.LayoutParams p11) {
        Intrinsics.checkNotNullParameter(p11, "p");
        return p11 instanceof LinearLayout.LayoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @NotNull
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C22945b(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = RadioGroup.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @IdRes
    /* JADX INFO: renamed from: getCheckedRadioButtonId, reason: from getter */
    public final int getF44016b() {
        return this.f44016b;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C22945b generateLayoutParams(@NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return new C22945b(getContext(), attrs);
    }

    /* JADX INFO: renamed from: i */
    public final void m54746i() {
        this.f44017c = new C22944a();
        ViewGroupOnHierarchyChangeListenerC22947d viewGroupOnHierarchyChangeListenerC22947d = new ViewGroupOnHierarchyChangeListenerC22947d();
        this.f44020f = viewGroupOnHierarchyChangeListenerC22947d;
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC22947d);
    }

    /* JADX INFO: renamed from: j */
    public final void m54747j(@IdRes int i11, boolean z11) {
        this.f44016b = i11;
        InterfaceC22946c interfaceC22946c = this.f44019e;
        if (interfaceC22946c == null || interfaceC22946c == null) {
            return;
        }
        interfaceC22946c.mo16018a(this, i11, z11);
    }

    public final void setOnCheckedChangeListener(@Nullable InterfaceC22946c interfaceC22946c) {
        this.f44019e = interfaceC22946c;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(@NotNull ViewGroup.OnHierarchyChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ViewGroupOnHierarchyChangeListenerC22947d viewGroupOnHierarchyChangeListenerC22947d = this.f44020f;
        if (viewGroupOnHierarchyChangeListenerC22947d != null) {
            viewGroupOnHierarchyChangeListenerC22947d.setMOnHierarchyChangeListener(listener);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m54748l(int i11, boolean z11) {
        View viewFindViewById = findViewById(i11);
        if (viewFindViewById != null && (viewFindViewById instanceof RadioButton)) {
            ((RadioButton) viewFindViewById).setChecked(z11);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f44016b;
        if (i11 != -1) {
            this.f44018d = true;
            m54748l(i11, true);
            this.f44018d = false;
            m54742k(this, this.f44016b, false, 2, null);
        }
    }

    public RadioGroupPlus(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44016b = -1;
        m54746i();
    }
}
