package com.kubi.otc.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$styleable;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TitleChooseView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/otc/view/TitleChooseView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setText", "", "value", "", "getText", "getTextView", "Landroid/widget/TextView;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TitleChooseView extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TitleChooseView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleChooseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R$layout.botc_view_title_choose, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_TitleChooseView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_TitleChooseView_kucoin_tc_title);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_TitleChooseView_kucoin_tc_hint);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.kucoin_TitleChooseView_kucoin_tc_require_star, false);
        typedArrayObtainStyledAttributes.recycle();
        if (string != null && string.length() != 0) {
            ((TextView) findViewById(R$id.tv_title)).setText(string);
        }
        if (string2 != null && string2.length() != 0) {
            ((TextView) findViewById(R$id.tv_content)).setHint(string2);
        }
        if (C27025c.m66566d(Boolean.valueOf(z11))) {
            View viewFindViewById = findViewById(R$id.tv_star);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66685H(viewFindViewById);
        } else {
            View viewFindViewById2 = findViewById(R$id.tv_star);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66700o(viewFindViewById2);
        }
    }

    @NotNull
    public final String getText() {
        String string;
        CharSequence text = ((TextView) findViewById(R$id.tv_content)).getText();
        return C27041f.m66668h((text == null || (string = text.toString()) == null) ? null : StringsKt.trim((CharSequence) string).toString());
    }

    @NotNull
    public final TextView getTextView() {
        View viewFindViewById = findViewById(R$id.tv_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (TextView) viewFindViewById;
    }

    public final void setText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((TextView) findViewById(R$id.tv_content)).setText(value);
    }
}
