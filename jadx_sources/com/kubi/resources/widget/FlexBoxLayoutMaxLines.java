package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.flexbox.FlexLine;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.sdk.res.R$styleable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlexBoxLayoutMaxLines.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/FlexBoxLayoutMaxLines;", "Lcom/google/android/flexbox/FlexboxLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxLines", "", "getMaxLines", "()I", "setMaxLines", "(I)V", "getFlexLinesInternal", "", "Lcom/google/android/flexbox/FlexLine;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlexBoxLayoutMaxLines extends FlexboxLayout {

    /* JADX INFO: renamed from: b */
    public int f43810b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public FlexBoxLayoutMaxLines(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexBoxLayoutMaxLines(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: getMaxLines, reason: from getter */
    public final int getF43810b() {
        return this.f43810b;
    }

    public final void setMaxLines(int i11) {
        this.f43810b = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexBoxLayoutMaxLines(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43810b = 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_FlexBoxLayoutMaxLines);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f43810b = typedArrayObtainStyledAttributes.getInt(R$styleable.kucoin_FlexBoxLayoutMaxLines_kucoin_maxLines, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.flexbox.FlexboxLayout, com.google.android.flexbox.FlexContainer
    @NotNull
    public List<FlexLine> getFlexLinesInternal() {
        List<FlexLine> flexLinesInternal = super.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        int i11 = this.f43810b;
        if (1 <= i11 && i11 < size) {
            flexLinesInternal.subList(i11, size).clear();
        }
        Intrinsics.checkNotNull(flexLinesInternal);
        return flexLinesInternal;
    }
}
