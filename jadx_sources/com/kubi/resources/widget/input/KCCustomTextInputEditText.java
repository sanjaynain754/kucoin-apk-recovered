package com.kubi.resources.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p811yw.C46603a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCCustomTextInputEditText.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/input/KCCustomTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "filterEmoji", "", "filterEmojiToast", "initEmojiWatcher", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class KCCustomTextInputEditText extends TextInputEditText {

    /* JADX INFO: renamed from: b */
    public boolean f44871b;

    /* JADX INFO: renamed from: c */
    public boolean f44872c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KCCustomTextInputEditText(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        m55317d();
    }

    /* JADX INFO: renamed from: d */
    public final void m55317d() {
        addTextChangedListener(new C46603a(this.f44871b, this.f44872c));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KCCustomTextInputEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        m55317d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCCustomTextInputEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        m55317d();
    }
}
