package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.res.R$styleable;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27025c;
import k00.C40843g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: FrameEditText.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0014J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0018H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/resources/widget/FrameEditText;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "kucoinLayoutFrameEditBinding", "Lcom/kubi/sdk/res/databinding/KucoinLayoutFrameEditBinding;", "getKucoinLayoutFrameEditBinding", "()Lcom/kubi/sdk/res/databinding/KucoinLayoutFrameEditBinding;", "kucoinLayoutFrameEditBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getEditText", "Landroid/widget/EditText;", "showError", "", "hideError", "setErrorText", "strId", "", "hasFocus", "", "onFinishInflate", "setActivated", "activated", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFrameEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameEditText.kt\ncom/kubi/resources/widget/FrameEditText\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,118:1\n52#2:119\n80#2,7:120\n*S KotlinDebug\n*F\n+ 1 FrameEditText.kt\ncom/kubi/resources/widget/FrameEditText\n*L\n24#1:119\n24#1:120,7\n*E\n"})
public final class FrameEditText extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f43815d = {Reflection.property1(new PropertyReference1Impl(FrameEditText.class, "kucoinLayoutFrameEditBinding", "getKucoinLayoutFrameEditBinding()Lcom/kubi/sdk/res/databinding/KucoinLayoutFrameEditBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f43816b;

    /* JADX INFO: renamed from: c */
    public boolean f43817c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameEditText(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43816b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C40843g>() { // from class: com.kubi.resources.widget.FrameEditText$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C40843g invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C40843g.m89383a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.kucoin_layout_frame_edit, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_FrameEditText);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_FrameEditText_kucoin_fet_hint);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_FrameEditText_kucoin_fet_hint_color, ContextCompat.getColor(context, R$color.emphasis20));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.kucoin_FrameEditText_kucoin_fet_text_size, (int) C27025c.m66568f(context, 14));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_FrameEditText_kucoin_fet_text_color, ContextCompat.getColor(context, R$color.emphasis));
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_FrameEditText_kucoin_fet_error_text);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.kucoin_FrameEditText_kucoin_fet_error_text_size, (int) C27025c.m66568f(context, 12));
        typedArrayObtainStyledAttributes.recycle();
        C40843g kucoinLayoutFrameEditBinding = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding != null) {
            kucoinLayoutFrameEditBinding.f90755b.setHint(string);
            kucoinLayoutFrameEditBinding.f90755b.setHintTextColor(color);
            kucoinLayoutFrameEditBinding.f90755b.setTextSize(0, dimensionPixelSize);
            kucoinLayoutFrameEditBinding.f90755b.setTextColor(color2);
            kucoinLayoutFrameEditBinding.f90756c.setText(string2);
            kucoinLayoutFrameEditBinding.f90756c.setTextSize(0, dimensionPixelSize2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m54514c(FrameEditText frameEditText, View view, boolean z11) {
        frameEditText.f43817c = z11;
        frameEditText.setActivated(frameEditText.isActivated());
    }

    private final C40843g getKucoinLayoutFrameEditBinding() {
        return (C40843g) this.f43816b.getValue(this, f43815d[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m54515b() {
        TextView textView;
        FilterEmojiEditText filterEmojiEditText;
        C40843g kucoinLayoutFrameEditBinding = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding != null && (filterEmojiEditText = kucoinLayoutFrameEditBinding.f90755b) != null) {
            filterEmojiEditText.setActivated(false);
        }
        C40843g kucoinLayoutFrameEditBinding2 = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding2 != null && (textView = kucoinLayoutFrameEditBinding2.f90756c) != null) {
            textView.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m54516d() {
        TextView textView;
        FilterEmojiEditText filterEmojiEditText;
        C40843g kucoinLayoutFrameEditBinding = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding != null && (filterEmojiEditText = kucoinLayoutFrameEditBinding.f90755b) != null) {
            filterEmojiEditText.setActivated(true);
        }
        C40843g kucoinLayoutFrameEditBinding2 = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding2 != null && (textView = kucoinLayoutFrameEditBinding2.f90756c) != null) {
            textView.setVisibility(0);
        }
    }

    @Nullable
    public final EditText getEditText() {
        C40843g kucoinLayoutFrameEditBinding = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding != null) {
            return kucoinLayoutFrameEditBinding.f90755b;
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        FilterEmojiEditText filterEmojiEditText;
        super.onFinishInflate();
        C40843g kucoinLayoutFrameEditBinding = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding != null && (filterEmojiEditText = kucoinLayoutFrameEditBinding.f90755b) != null) {
            filterEmojiEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.resources.widget.z
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    FrameEditText.m54514c(this.f45353b, view, z11);
                }
            });
        }
    }

    @Override // android.view.View
    public void setActivated(boolean activated) {
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        FilterEmojiEditText filterEmojiEditText3;
        super.setActivated(activated);
        if (activated) {
            C40843g kucoinLayoutFrameEditBinding = getKucoinLayoutFrameEditBinding();
            if (kucoinLayoutFrameEditBinding != null && (filterEmojiEditText3 = kucoinLayoutFrameEditBinding.f90755b) != null) {
                filterEmojiEditText3.setBackgroundResource(R$drawable.shape_edittext_border_background_with_error);
                return;
            }
            return;
        }
        if (this.f43817c) {
            C40843g kucoinLayoutFrameEditBinding2 = getKucoinLayoutFrameEditBinding();
            if (kucoinLayoutFrameEditBinding2 != null && (filterEmojiEditText2 = kucoinLayoutFrameEditBinding2.f90755b) != null) {
                filterEmojiEditText2.setBackgroundResource(R$drawable.shape_edittext_border_primary);
                return;
            }
            return;
        }
        C40843g kucoinLayoutFrameEditBinding3 = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding3 != null && (filterEmojiEditText = kucoinLayoutFrameEditBinding3.f90755b) != null) {
            filterEmojiEditText.setBackgroundResource(R$drawable.shape_edittext_border_background_with_error);
        }
    }

    public final void setErrorText(int strId) {
        TextView textView;
        C40843g kucoinLayoutFrameEditBinding = getKucoinLayoutFrameEditBinding();
        if (kucoinLayoutFrameEditBinding != null && (textView = kucoinLayoutFrameEditBinding.f90756c) != null) {
            textView.setText(getContext().getString(strId));
        }
    }
}
