package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.bugly.proguard.C33978va;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KcPrecisionTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/resources/widget/KcPrecisionTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setText", "", "text", "", "type", "Landroid/widget/TextView$BufferType;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcPrecisionTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcPrecisionTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        CharSequence charSequence;
        List listSplit$default;
        if (text != null) {
            charSequence = text;
            listSplit$default = StringsKt.split$default(charSequence, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
        } else {
            charSequence = text;
            listSplit$default = null;
        }
        if (listSplit$default != null && listSplit$default.size() == 2) {
            int length = ((String) listSplit$default.get(1)).length();
            if (length <= 8) {
                setTextSize(2, 12.0f);
            } else if (9 > length || length >= 11) {
                setTextSize(2, 10.0f);
            } else {
                setTextSize(2, 11.0f);
            }
        }
        super.setText(charSequence, type);
    }
}
