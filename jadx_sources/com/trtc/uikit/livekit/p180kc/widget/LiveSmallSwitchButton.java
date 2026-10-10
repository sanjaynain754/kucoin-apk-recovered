package com.trtc.uikit.livekit.p180kc.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.kubi.resources.widget.BaseSwitchButton;
import com.trtc.uikit.livekit.R$drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LiveSmallSwitchButton.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/LiveSmallSwitchButton;", "Lcom/kubi/resources/widget/BaseSwitchButton;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getSwitchWidth", "", "getTrackResource", "getThumbResource", "getShowTrackOnColor", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ResourceType"})
@SourceDebugExtension({"SMAP\nLiveSmallSwitchButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveSmallSwitchButton.kt\ncom/trtc/uikit/livekit/kc/widget/LiveSmallSwitchButton\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,25:1\n470#2:26\n*S KotlinDebug\n*F\n+ 1 LiveSmallSwitchButton.kt\ncom/trtc/uikit/livekit/kc/widget/LiveSmallSwitchButton\n*L\n23#1:26\n*E\n"})
public final class LiveSmallSwitchButton extends BaseSwitchButton {
    public /* synthetic */ LiveSmallSwitchButton(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSmallSwitchButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.resources.widget.BaseSwitchButton
    public int getShowTrackOnColor() {
        return Color.parseColor("#F3F3F3");
    }

    @Override // com.kubi.resources.widget.BaseSwitchButton
    public int getSwitchWidth() {
        return 28;
    }

    @Override // com.kubi.resources.widget.BaseSwitchButton
    public int getThumbResource() {
        return R$drawable.live_selector_small_switch_button_thumb;
    }

    @Override // com.kubi.resources.widget.BaseSwitchButton
    public int getTrackResource() {
        return R$drawable.live_selector_small_switch_button_track;
    }
}
