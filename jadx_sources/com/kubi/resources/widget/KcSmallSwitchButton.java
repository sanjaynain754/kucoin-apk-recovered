package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.kubi.sdk.res.R$drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcSmallSwitchButton.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\tH\u0014¨\u0006\f"}, m90084d2 = {"Lcom/kubi/resources/widget/KcSmallSwitchButton;", "Lcom/kubi/resources/widget/BaseSwitchButton;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getSwitchWidth", "", "getTrackResource", "getThumbResource", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class KcSmallSwitchButton extends BaseSwitchButton {
    public /* synthetic */ KcSmallSwitchButton(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcSmallSwitchButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.resources.widget.BaseSwitchButton
    public int getSwitchWidth() {
        return 28;
    }

    @Override // com.kubi.resources.widget.BaseSwitchButton
    public int getThumbResource() {
        return R$drawable.selector_small_switch_button_thumb;
    }

    @Override // com.kubi.resources.widget.BaseSwitchButton
    public int getTrackResource() {
        return R$drawable.selector_small_switch_button_track;
    }
}
