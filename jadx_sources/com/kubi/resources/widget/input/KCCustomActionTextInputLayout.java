package com.kubi.resources.widget.input;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.textfield.TextInputLayout;
import com.kubi.resources.widget.input.KCCustomActionTextInputLayout;
import com.kubi.sdk.res.R$id;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KCCustomActionTextInputLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020 H\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u000bH\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020 H\u0002J&\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001000H\u0002J\b\u00101\u001a\u0004\u0018\u00010\u000bJ\b\u00102\u001a\u0004\u0018\u000103J\u000e\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u0010J\u000e\u00106\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u0010J\u0006\u00107\u001a\u00020 J\u0010\u00108\u001a\u00020 2\u0006\u00105\u001a\u00020\u0010H\u0002J1\u00109\u001a\u00020 \"\b\b\u0000\u0010:*\u00020\u00142\u0006\u00105\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u0002H:H\u0000¢\u0006\u0004\b=\u0010>J\u0006\u0010?\u001a\u00020 R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "customActionsContainer", "Landroid/widget/LinearLayout;", "actionItems", "", "Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;", "actionItemDataMap", "", "Landroid/util/SparseArray;", "", "lastActionWith", "value", "actionSize", "getActionSize", "()I", "setActionSize", "(I)V", "maxActions", "actionsContainerInitialized", "", "onFinishInflate", "", "findAndSetupTextInputLayout", "findTextInputLayoutRecursive", "viewGroup", "Landroid/view/ViewGroup;", "setupActionsContainer", "adjustContainerHeight", TtmlNode.TAG_LAYOUT, "updateTextInputLayoutPadding", "calculateActionsWidth", "updateActionContainerVisuals", "setupActionViewLayout", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "currentIndex", "allItems", "", "getTextInputLayout", "getKCEditText", "Landroid/widget/EditText;", "addAction", TUIConstants.TIMPush.NOTIFICATION.ACTION, "removeAction", "clearActions", "cleanupActionData", "storeDataForAction", ExifInterface.GPS_DIRECTION_TRUE, "key", "data", "storeDataForAction$LComponent_googleRelease", "(Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;ILjava/lang/Object;)V", "refreshLayoutAndPadding", "ActionItem", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCCustomActionTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCCustomActionTextInputLayout.kt\ncom/kubi/resources/widget/input/KCCustomActionTextInputLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,430:1\n1869#2,2:431\n1878#2,2:435\n1880#2:438\n1869#2,2:439\n1#3:433\n254#4:434\n254#4:437\n*S KotlinDebug\n*F\n+ 1 KCCustomActionTextInputLayout.kt\ncom/kubi/resources/widget/input/KCCustomActionTextInputLayout\n*L\n65#1:431,2\n202#1:435,2\n202#1:438\n260#1:439,2\n174#1:434\n212#1:437\n*E\n"})
public final class KCCustomActionTextInputLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public TextInputLayout f44861b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public LinearLayout f44862c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<ActionItem> f44863d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<ActionItem, SparseArray<Object>> f44864e;

    /* JADX INFO: renamed from: f */
    public int f44865f;

    /* JADX INFO: renamed from: g */
    public int f44866g;

    /* JADX INFO: renamed from: h */
    public final int f44867h;

    /* JADX INFO: renamed from: i */
    public boolean f44868i;

    /* JADX INFO: compiled from: KCCustomActionTextInputLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;", "", "<init>", "()V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "getView", "()Landroid/view/View;", "DefaultAction", "Companion", "Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$DefaultAction;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class ActionItem {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final Companion f44869a = new Companion(null);

        /* JADX INFO: compiled from: KCCustomActionTextInputLayout.kt */
        @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ*\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$Companion;", "", "<init>", "()V", "createIconAction", "Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$DefaultAction;", "context", "Landroid/content/Context;", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Drawable;", "iconTint", "Landroid/content/res/ColorStateList;", "contentDescription", "", "createTextAction", "text", "textColor", "", "textSizeSp", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public static /* synthetic */ DefaultAction createIconAction$default(Companion companion, Context context, Drawable drawable, ColorStateList colorStateList, String str, int i11, Object obj) {
                if ((i11 & 4) != 0) {
                    colorStateList = null;
                }
                if ((i11 & 8) != 0) {
                    str = null;
                }
                return companion.createIconAction(context, drawable, colorStateList, str);
            }

            public static /* synthetic */ DefaultAction createTextAction$default(Companion companion, Context context, String str, int i11, float f11, int i12, Object obj) {
                if ((i12 & 4) != 0) {
                    i11 = ViewCompat.MEASURED_STATE_MASK;
                }
                if ((i12 & 8) != 0) {
                    f11 = 14.0f;
                }
                return companion.createTextAction(context, str, i11, f11);
            }

            @NotNull
            public final DefaultAction createIconAction(@NotNull Context context, @NotNull Drawable icon, @Nullable ColorStateList colorStateList, @Nullable String str) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(icon, "icon");
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
                appCompatImageButton.setImageDrawable(icon);
                int iM96650a = C43881b.m96650a(8);
                appCompatImageButton.setPadding(iM96650a, iM96650a, iM96650a, iM96650a);
                appCompatImageButton.setBackground(C23075a.m55373a());
                appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                appCompatImageButton.setImageTintList(colorStateList);
                appCompatImageButton.setContentDescription(str);
                return new DefaultAction(appCompatImageButton);
            }

            @NotNull
            public final DefaultAction createTextAction(@NotNull Context context, @NotNull String text, int i11, float f11) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                appCompatTextView.setText(text);
                appCompatTextView.setTextColor(i11);
                appCompatTextView.setTextSize(2, f11);
                appCompatTextView.setBackground(C23075a.m55373a());
                appCompatTextView.setGravity(17);
                int iM96650a = C43881b.m96650a(8);
                appCompatTextView.setPaddingRelative(iM96650a, 0, iM96650a, 0);
                return new DefaultAction(appCompatTextView);
            }
        }

        /* JADX INFO: renamed from: com.kubi.resources.widget.input.KCCustomActionTextInputLayout$ActionItem$a, reason: from toString */
        /* JADX INFO: compiled from: KCCustomActionTextInputLayout.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem$DefaultAction;", "Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class DefaultAction extends ActionItem {

            /* JADX INFO: renamed from: b, reason: from toString */
            @NotNull
            public final View view;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DefaultAction) && Intrinsics.areEqual(this.view, ((DefaultAction) other).view);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DefaultAction(@NotNull View view) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @Override // com.kubi.resources.widget.input.KCCustomActionTextInputLayout.ActionItem
            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public View getView() {
                return this.view;
            }

            public int hashCode() {
                return this.view.hashCode();
            }

            @NotNull
            public String toString() {
                return "DefaultAction(view=" + this.view + ')';
            }
        }

        public /* synthetic */ ActionItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract View getView();

        public ActionItem() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCCustomActionTextInputLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCCustomActionTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m55305e(@NotNull ActionItem action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f44863d.size() >= this.f44867h || this.f44863d.contains(action)) {
            return false;
        }
        this.f44863d.add(action);
        this.f44864e.put(action, new SparseArray<>());
        if (!this.f44868i) {
            return true;
        }
        m55314o();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m55306f(TextInputLayout textInputLayout) {
        LinearLayout linearLayout = this.f44862c;
        if (linearLayout != null) {
            Integer numValueOf = Integer.valueOf(textInputLayout.getMeasuredHeight());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : this.f44866g;
            if (linearLayout.getLayoutParams().height != iIntValue) {
                linearLayout.getLayoutParams().height = iIntValue;
                linearLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m55307g() {
        LinearLayout linearLayout = this.f44862c;
        if (linearLayout == null) {
            return 0;
        }
        if (this.f44863d.isEmpty() && linearLayout.getPaddingStart() + linearLayout.getPaddingEnd() == 0) {
            return 0;
        }
        int childCount = linearLayout.getChildCount();
        int measuredWidth = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = linearLayout.getChildAt(i12);
            Intrinsics.checkNotNull(childAt);
            if (childAt.getVisibility() == 0) {
                if (i11 == -1) {
                    i11 = i12;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f44866g, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f44866g, 1073741824));
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
        return measuredWidth + linearLayout.getPaddingStart() + linearLayout.getPaddingEnd() + C43881b.m96650a(8);
    }

    /* JADX INFO: renamed from: getActionSize, reason: from getter */
    public final int getF44866g() {
        return this.f44866g;
    }

    @Nullable
    public final EditText getKCEditText() {
        TextInputLayout textInputLayout = this.f44861b;
        if (textInputLayout != null) {
            return textInputLayout.getEditText();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getTextInputLayout, reason: from getter */
    public final TextInputLayout getF44861b() {
        return this.f44861b;
    }

    /* JADX INFO: renamed from: h */
    public final void m55308h(ActionItem actionItem) {
        SparseArray<Object> sparseArrayRemove = this.f44864e.remove(actionItem);
        if (sparseArrayRemove == null) {
            return;
        }
        EditText kCEditText = getKCEditText();
        Object obj = sparseArrayRemove.get(R$id.tag_text_watcher);
        TextWatcher textWatcher = obj instanceof TextWatcher ? (TextWatcher) obj : null;
        if (textWatcher == null || kCEditText == null) {
            return;
        }
        kCEditText.removeTextChangedListener(textWatcher);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m55311l(@NotNull ActionItem action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m55308h(action);
        if (!this.f44863d.remove(action)) {
            return false;
        }
        if (!this.f44868i) {
            return true;
        }
        m55314o();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m55312m(View view, int i11, List<? extends ActionItem> list) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-2, this.f44866g));
    }

    /* JADX INFO: renamed from: n */
    public final void m55313n() {
        LinearLayout linearLayout = this.f44862c;
        if (linearLayout != null) {
            ViewParent parent = linearLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(linearLayout);
            }
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, this.f44866g, 8388629));
        linearLayout2.setMinimumHeight(this.f44866g);
        linearLayout2.setVisibility(8);
        linearLayout2.setClickable(false);
        linearLayout2.setFocusable(false);
        this.f44862c = linearLayout2;
        super.addView(linearLayout2);
    }

    /* JADX INFO: renamed from: o */
    public final void m55314o() {
        LinearLayout linearLayout;
        if (this.f44868i && (linearLayout = this.f44862c) != null) {
            linearLayout.removeAllViews();
            if (this.f44863d.isEmpty()) {
                linearLayout.setVisibility(8);
                m55315q();
                return;
            }
            boolean z11 = false;
            int i11 = 0;
            for (Object obj : this.f44863d) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                View view = ((ActionItem) obj).getView();
                m55312m(view, i11, this.f44863d);
                if (view.getBackground() == null && !(view instanceof ViewGroup)) {
                    view.setBackground(C23075a.m55373a());
                }
                linearLayout.addView(view);
                if (view.getVisibility() == 0) {
                    z11 = true;
                }
                i11 = i12;
            }
            linearLayout.setVisibility(z11 ? 0 : 8);
            linearLayout.requestLayout();
            m55315q();
            final TextInputLayout textInputLayout = this.f44861b;
            if (textInputLayout != null) {
                post(new Runnable() { // from class: yw.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        KCCustomActionTextInputLayout.m55304p(this.f104359b, textInputLayout);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m55315q() {
        TextInputLayout textInputLayout;
        if (this.f44868i && (textInputLayout = this.f44861b) != null) {
            int iM55307g = m55307g();
            EditText editText = textInputLayout.getEditText();
            if (editText == null) {
                return;
            }
            editText.setPaddingRelative(editText.getPaddingStart(), editText.getPaddingTop(), iM55307g > 0 ? editText.getPaddingEnd() + iM55307g : editText.getPaddingEnd() - this.f44865f, editText.getPaddingBottom());
            this.f44865f = iM55307g;
        }
    }

    public final void setActionSize(int i11) {
        ViewGroup.LayoutParams layoutParams;
        if (this.f44866g == i11) {
            return;
        }
        this.f44866g = RangesKt.coerceAtLeast(i11, 0);
        if (this.f44868i) {
            LinearLayout linearLayout = this.f44862c;
            if (linearLayout != null && (layoutParams = linearLayout.getLayoutParams()) != null) {
                layoutParams.height = this.f44866g;
            }
            LinearLayout linearLayout2 = this.f44862c;
            if (linearLayout2 != null) {
                linearLayout2.setMinimumHeight(this.f44866g);
            }
            for (ActionItem actionItem : this.f44863d) {
                ViewGroup.LayoutParams layoutParams2 = actionItem.getView().getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = this.f44866g;
                }
                ViewGroup.LayoutParams layoutParams3 = actionItem.getView().getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = this.f44866g;
                }
            }
            LinearLayout linearLayout3 = this.f44862c;
            if (linearLayout3 != null) {
                linearLayout3.requestLayout();
            }
            m55314o();
            final TextInputLayout textInputLayout = this.f44861b;
            if (textInputLayout != null) {
                post(new Runnable() { // from class: yw.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        KCCustomActionTextInputLayout.m55302d(this.f104355b, textInputLayout);
                    }
                });
            }
        }
    }

    public /* synthetic */ KCCustomActionTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final void m55302d(KCCustomActionTextInputLayout kCCustomActionTextInputLayout, TextInputLayout textInputLayout) {
        kCCustomActionTextInputLayout.m55306f(textInputLayout);
    }

    /* JADX INFO: renamed from: k */
    public static final void m55303k(KCCustomActionTextInputLayout kCCustomActionTextInputLayout, TextInputLayout textInputLayout) {
        kCCustomActionTextInputLayout.m55306f(textInputLayout);
    }

    /* JADX INFO: renamed from: p */
    public static final void m55304p(KCCustomActionTextInputLayout kCCustomActionTextInputLayout, TextInputLayout textInputLayout) {
        kCCustomActionTextInputLayout.m55306f(textInputLayout);
    }

    /* JADX INFO: renamed from: i */
    public final void m55309i() {
        this.f44861b = m55310j(this);
    }

    /* JADX INFO: renamed from: j */
    public final TextInputLayout m55310j(ViewGroup viewGroup) {
        TextInputLayout textInputLayoutM55310j;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof TextInputLayout) && !Intrinsics.areEqual(childAt, this.f44862c)) {
                return (TextInputLayout) childAt;
            }
            if ((childAt instanceof ViewGroup) && (textInputLayoutM55310j = m55310j((ViewGroup) childAt)) != null) {
                return textInputLayoutM55310j;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55309i();
        if (!this.f44868i) {
            m55313n();
            this.f44868i = true;
        } else {
            LinearLayout linearLayout = this.f44862c;
            if (linearLayout != null) {
                bringChildToFront(linearLayout);
            }
        }
        m55315q();
        if (!this.f44863d.isEmpty()) {
            m55314o();
        }
        final TextInputLayout textInputLayout = this.f44861b;
        if (textInputLayout != null) {
            post(new Runnable() { // from class: yw.c
                @Override // java.lang.Runnable
                public final void run() {
                    KCCustomActionTextInputLayout.m55303k(this.f104357b, textInputLayout);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCCustomActionTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44863d = new ArrayList();
        this.f44864e = new LinkedHashMap();
        this.f44866g = C43881b.m96650a(48);
        this.f44867h = 2;
    }
}
