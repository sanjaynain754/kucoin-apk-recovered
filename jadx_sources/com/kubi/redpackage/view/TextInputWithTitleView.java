package com.kubi.redpackage.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.kubi.redpackage.R$color;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.R$layout;
import com.kubi.redpackage.R$styleable;
import com.kubi.resources.widget.FilterEmojiEditText;

/* JADX INFO: loaded from: classes38.dex */
public class TextInputWithTitleView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public final FilterEmojiEditText f43404b;

    public TextInputWithTitleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextInputWithTitleView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_TextInputWithTitleView);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_TextInputWithTitleView_kucoin_tt_title);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_TextInputWithTitleView_kucoin_tt_hint);
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_TextInputWithTitleView_kucoin_tt_content);
        String string4 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_TextInputWithTitleView_kucoin_tt_unit);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.kucoin_TextInputWithTitleView_kucoin_tt_max_length, 0);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.bredpackage_view_textview_title, (ViewGroup) null);
        FilterEmojiEditText filterEmojiEditText = (FilterEmojiEditText) viewInflate.findViewById(R$id.et_view_text_input);
        this.f43404b = filterEmojiEditText;
        if (!TextUtils.isEmpty(string)) {
            ((TextView) viewInflate.findViewById(R$id.tv_view_text_title)).setText(string);
        }
        if (!TextUtils.isEmpty(string2)) {
            filterEmojiEditText.setHint(string2);
        }
        if (!TextUtils.isEmpty(string3)) {
            filterEmojiEditText.setText(string3);
        }
        if (integer != 0) {
            filterEmojiEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
        }
        if (!TextUtils.isEmpty(string4)) {
            int i12 = R$id.tv_view_text_unit;
            ((TextView) viewInflate.findViewById(i12)).setText(string4);
            viewInflate.findViewById(i12).setVisibility(0);
        }
        addView(viewInflate);
    }

    public String getContent() {
        return this.f43404b.getText().toString();
    }

    public FilterEmojiEditText getEditText() {
        return this.f43404b;
    }

    public TextView getEndView() {
        return (TextView) findViewById(R$id.tv_view_text_unit);
    }

    public TextView getErrorTv() {
        return (TextView) findViewById(R$id.tv_error);
    }

    public String getHint() {
        return this.f43404b.getHint().toString();
    }

    public TextView getTitleView() {
        return (TextView) findViewById(R$id.tv_view_text_title);
    }

    public void setContent(String str) {
        this.f43404b.setText(str);
    }

    public void setHint(String str) {
        this.f43404b.setHint(str);
    }

    public void setTitle(CharSequence charSequence) {
        ((TextView) findViewById(R$id.tv_view_text_title)).setText(charSequence);
    }

    public void setUnit(String str) {
        int i11 = R$id.tv_view_text_unit;
        ((TextView) findViewById(i11)).setText(str);
        findViewById(i11).setVisibility(0);
    }

    @Override // android.view.View
    public void setActivated(boolean z11) {
        super.setActivated(z11);
        findViewById(R$id.rl_input).setActivated(z11);
        if (!z11) {
            getErrorTv().setVisibility(4);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f43404b.setEnabled(z11);
    }

    public void setError(String str) {
        getErrorTv().setVisibility(0);
        getErrorTv().setTextColor(getResources().getColor(R$color.secondary));
        getErrorTv().setText(str);
    }

    public void setPrice(String str) {
        getErrorTv().setVisibility(0);
        getErrorTv().setTextColor(getResources().getColor(R$color.c_text60));
        getErrorTv().setText(str);
    }
}
