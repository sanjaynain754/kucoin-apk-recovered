package com.facebook.react.views.text.internal.span;

import android.text.SpannableStringBuilder;
import org.jetbrains.annotations.NotNull;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SetSpanOperation.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/react/views/text/internal/span/SetSpanOperation;", "", "start", "", "end", "what", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "<init>", "(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V", "execute", "", "builder", "Landroid/text/SpannableStringBuilder;", "priorityIndex", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SetSpanOperation {
    public static final int SPAN_MAX_PRIORITY = 255;

    @NotNull
    private static final String TAG = "SetSpanOperation";
    private final int end;
    private final int start;

    @JvmField
    @NotNull
    public final ReactSpan what;

    public final void execute(@NotNull SpannableStringBuilder builder, int priorityIndex) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (priorityIndex < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i11 = this.start == 0 ? 18 : 34;
        int i12 = 255 - priorityIndex;
        if (i12 < 0) {
            C45999a.m101488I(TAG, "Text tree size exceeded the limit, styling may become unpredictable");
        }
        builder.setSpan(this.what, this.start, this.end, ((Math.max(i12, 0) << 16) & 16711680) | (i11 & (-16711681)));
    }

    public SetSpanOperation(int i11, int i12, @NotNull ReactSpan what) {
        Intrinsics.checkNotNullParameter(what, "what");
        this.start = i11;
        this.end = i12;
        this.what = what;
    }
}
