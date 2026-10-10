package com.kubi.otc.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.Constants;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$styleable;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: EditTextWithTitleView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\fJ\u0010\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0014J\u0010\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#J\u001c\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'J\u0006\u0010(\u001a\u00020\nJ\b\u0010)\u001a\u00020\fH\u0016¨\u0006*"}, m90084d2 = {"Lcom/kubi/otc/view/EditTextWithTitleView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setEnabled", "", "enabled", "", "setActivated", "activated", "setSelected", "selected", "getEditText", "Landroid/widget/EditText;", "getContent", "", "getNumber", "Ljava/math/BigDecimal;", "isContentEmpty", "setContent", "content", "setTitle", "title", "setHint", "hint", "Landroid/text/SpannableString;", "setUnit", "unit", "showError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "showSubText", "subtext", "textDirection", "Landroid/text/TextDirectionHeuristic;", "hideError", "isActivated", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EditTextWithTitleView extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditTextWithTitleView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setHint(@Nullable String hint) {
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_view_text_input);
        if (filterEmojiEditText != null) {
            filterEmojiEditText.setHint(hint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextWithTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        View viewFindViewById;
        TextView textView;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R$layout.botc_view_edittext_title, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_EditTextWithTitleView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_title);
        int i11 = R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_title_color;
        int color = typedArrayObtainStyledAttributes.getColor(i11, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i11);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_hint);
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_content);
        String string4 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_unit);
        int i12 = R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_unit_color;
        Resources resources = getResources();
        int i13 = R$color.emphasis60;
        int color2 = typedArrayObtainStyledAttributes.getColor(i12, resources.getColor(i13));
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_max_length, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_title_drawable, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_input_drawable);
        String string5 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_right_text);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.kucoin_EditTextWithTitleView_kucoin_tt_text_size, (int) C27025c.m66568f(context, 14));
        int i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.kucoin_DropEditText_android_inputType, 1);
        typedArrayObtainStyledAttributes.recycle();
        TextView textView2 = (TextView) findViewById(R$id.tv_view_text_title);
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_view_text_input);
        if (string != null && string.length() != 0 && textView2 != null) {
            textView2.setText(string);
        }
        if (colorStateList != null) {
            if (textView2 != null) {
                textView2.setTextColor(colorStateList);
            }
        } else if (color != 0) {
            if (textView2 != null) {
                textView2.setTextColor(color);
            }
        } else if (textView2 != null) {
            textView2.setTextColor(ContextCompat.getColor(context, i13));
        }
        if (string2 != null && string2.length() != 0 && filterEmojiEditText != null) {
            filterEmojiEditText.setHint(string2);
        }
        if (string3 != null && string3.length() != 0 && filterEmojiEditText != null) {
            filterEmojiEditText.setText(string3);
        }
        if (filterEmojiEditText != null) {
            filterEmojiEditText.setInputType(i14);
        }
        if (integer != 0 && filterEmojiEditText != null) {
            filterEmojiEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
        }
        if (string4 != null && string4.length() != 0 && (textView = (TextView) findViewById(R$id.tv_view_text_unit)) != null) {
            textView.setText(string4);
            textView.setVisibility(0);
        }
        TextView textView3 = (TextView) findViewById(R$id.tv_view_text_unit);
        if (textView3 != null) {
            textView3.setTextColor(color2);
        }
        if (resourceId != 0 && textView2 != null) {
            C27046k.m66694i(textView2, resourceId, 0, 0, 6, null);
        }
        if (drawable != null && (viewFindViewById = findViewById(R$id.rl_input)) != null) {
            viewFindViewById.setBackgroundDrawable(drawable);
        }
        if (r16 != 0 && r16.length() != 0) {
            View viewFindViewById2 = findViewById(R$id.view_right);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66685H(viewFindViewById2);
            TextView textView4 = (TextView) findViewById(R$id.tv_view_right);
            if (textView4 != null) {
                textView4.setText(string5);
            }
        }
        if (filterEmojiEditText != 0) {
            filterEmojiEditText.setTextSize(0, dimensionPixelSize);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m45497a() {
        findViewById(R$id.rl_input).setActivated(false);
        ((TextView) findViewById(R$id.tv_error)).setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m45498b() {
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_view_text_input);
        return String.valueOf(filterEmojiEditText != null ? filterEmojiEditText.getText() : null).length() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m45499c(@Nullable CharSequence charSequence) {
        findViewById(R$id.rl_input).setActivated(true);
        TextView textView = (TextView) findViewById(R$id.tv_error);
        if (textView != null) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @NotNull
    public final String getContent() {
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_view_text_input);
        return StringsKt.trim((CharSequence) String.valueOf(filterEmojiEditText != null ? filterEmojiEditText.getText() : null)).toString();
    }

    @NotNull
    public final EditText getEditText() {
        View viewFindViewById = findViewById(R$id.et_view_text_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (EditText) viewFindViewById;
    }

    @NotNull
    public final BigDecimal getNumber() {
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_view_text_input);
        String string = StringsKt.trim((CharSequence) String.valueOf(filterEmojiEditText != null ? filterEmojiEditText.getText() : null)).toString();
        if (string.length() != 0) {
            return DowngradeExKt.m66535e(string, null, 1, null);
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNull(bigDecimal);
        return bigDecimal;
    }

    @Override // android.view.View
    public boolean isActivated() {
        return findViewById(R$id.rl_input).isActivated();
    }

    public final void setHint(@Nullable SpannableString hint) {
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_view_text_input);
        if (filterEmojiEditText != null) {
            filterEmojiEditText.setHint(hint);
        }
    }

    public final void setTitle(@Nullable String title) {
        TextView textView = (TextView) findViewById(R$id.tv_view_text_title);
        if (textView != null) {
            textView.setText(title);
        }
    }

    public final void setUnit(@Nullable String unit) {
        TextView textView = (TextView) findViewById(R$id.tv_view_text_unit);
        if (textView != null) {
            textView.setText(unit);
            textView.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setActivated(boolean activated) {
        TextView textView;
        super.setActivated(activated);
        findViewById(R$id.rl_input).setActivated(activated);
        if (!activated && (textView = (TextView) findViewById(R$id.tv_error)) != null) {
            textView.setVisibility(4);
        }
    }

    public final void setContent(@Nullable String content) {
        FilterEmojiEditText filterEmojiEditText;
        if ((!m45498b() || (content != null && content.length() != 0)) && (filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_view_text_input)) != null) {
            filterEmojiEditText.setText(content);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) findViewById(R$id.et_view_text_input);
        if (filterEmojiEditText != null) {
            filterEmojiEditText.setEnabled(enabled);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        findViewById(R$id.rl_input).setSelected(isSelected());
    }
}
