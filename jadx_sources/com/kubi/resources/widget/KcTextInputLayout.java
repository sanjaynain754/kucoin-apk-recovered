package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.StringRes;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.kubi.resources.C22912t;
import com.kubi.resources.exception.ComponentException;
import com.kubi.sdk.res.R$font;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KcTextInputLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onAttachedToWindow", "", "hideError", TIMPushProvider.f75063o, "", "showError", "errorRes", TIMPushProvider.f75062n, "errorMsg", "", "showKeyboard", "showChildren", "hidenChildren", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKcTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KcTextInputLayout.kt\ncom/kubi/resources/widget/KcTextInputLayout\n+ 2 ComponentIssue.kt\ncom/kubi/resources/exception/ComponentIssueKt\n+ 3 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n44#2,2:93\n372#3:95\n372#3:100\n1549#4:96\n1620#4,3:97\n1549#4:101\n1620#4,3:102\n*S KotlinDebug\n*F\n+ 1 KcTextInputLayout.kt\ncom/kubi/resources/widget/KcTextInputLayout\n*L\n38#1:93,2\n78#1:95\n86#1:100\n78#1:96\n78#1:97,3\n86#1:101\n86#1:102,3\n*E\n"})
public final class KcTextInputLayout extends TextInputLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcTextInputLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m54596f(KcTextInputLayout kcTextInputLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        kcTextInputLayout.m54600e(z11);
    }

    /* JADX INFO: renamed from: g */
    public final void m54601g() {
        IntRange intRangeUntil = RangesKt.until(0, getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            EditText editText = getEditText();
            if (!Intrinsics.areEqual(view, editText != null ? editText.getParent() : null)) {
                Intrinsics.checkNotNull(view);
                C27046k.m66700o(view);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m54602h() {
        IntRange intRangeUntil = RangesKt.until(0, getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            EditText editText = getEditText();
            if (!Intrinsics.areEqual(view, editText != null ? editText.getParent() : null)) {
                Intrinsics.checkNotNull(view);
                C27046k.m66685H(view);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m54597k(KcTextInputLayout kcTextInputLayout, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        kcTextInputLayout.m54603i(i11, z11);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m54598l(KcTextInputLayout kcTextInputLayout, CharSequence charSequence, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        kcTextInputLayout.m54604j(charSequence, z11);
    }

    /* JADX INFO: renamed from: e */
    public final void m54600e(boolean z11) {
        if (z11) {
            m54601g();
        }
        setError(null);
    }

    /* JADX INFO: renamed from: j */
    public final void m54604j(@NotNull CharSequence errorMsg, boolean z11) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (z11) {
            m54602h();
        }
        setError(errorMsg);
        setErrorIconDrawable((Drawable) null);
    }

    public /* synthetic */ KcTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: n */
    public static final void m54599n(KcTextInputLayout kcTextInputLayout) {
        EditText editText = kcTextInputLayout.getEditText();
        if (editText != null && editText.isAttachedToWindow()) {
            KeyboardUtils.m6041m(editText);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m54603i(@StringRes int i11, boolean z11) {
        String string = getContext().getResources().getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m54604j(string, z11);
    }

    /* JADX INFO: renamed from: m */
    public final void m54605m() {
        EditText editText = getEditText();
        if (editText != null) {
            editText.postDelayed(new Runnable() { // from class: com.kubi.resources.widget.t0
                @Override // java.lang.Runnable
                public final void run() {
                    KcTextInputLayout.m54599n(this.f45216b);
                }
            }, 300L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m54596f(this, false, 1, null);
        try {
            setTypeface(ResourcesCompat.getFont(getContext(), R$font.regular));
        } catch (Throwable th2) {
            C43846g.m96568c(new ComponentException(th2, "KcTextInputLayout", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getEndIconMode() == 1) {
            C22912t.m54418p(this);
        }
    }
}
