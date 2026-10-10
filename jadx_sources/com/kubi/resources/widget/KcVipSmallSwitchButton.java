package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcVipSmallSwitchButton.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\tH\u0014J\b\u0010\u0012\u001a\u00020\tH\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0010J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/resources/widget/KcVipSmallSwitchButton;", "Lcom/kubi/resources/widget/KcSmallSwitchButton;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "vipTrackOnColor", "", "getVipTrackOnColor", "()I", "vipTrackOnColor$delegate", "Lkotlin/Lazy;", "vipLevel", "siteVipShow", "", "getSwitchWidth", "getTrackResource", "refreshTrackTint", "", "updateVipLevel", FirebaseAnalytics.Param.LEVEL, "siteVip", "getShowTrackOnColor", "showVip", "isSiteVipShow", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcVipSmallSwitchButton extends KcSmallSwitchButton {
    private boolean siteVipShow;
    private int vipLevel;

    /* JADX INFO: renamed from: vipTrackOnColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vipTrackOnColor;

    public /* synthetic */ KcVipSmallSwitchButton(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcVipSmallSwitchButton(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.vipTrackOnColor = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.d1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(KcVipSmallSwitchButton.vipTrackOnColor_delegate$lambda$0(context));
            }
        });
    }

    private final int getVipTrackOnColor() {
        return ((Number) this.vipTrackOnColor.getValue()).intValue();
    }

    /* JADX INFO: renamed from: isSiteVipShow, reason: from getter */
    private final boolean getSiteVipShow() {
        return this.siteVipShow;
    }

    private final boolean showVip() {
        return this.vipLevel > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vipTrackOnColor_delegate$lambda$0(Context context) {
        return ContextCompat.getColor(context, R$color.c_C39838_55D186);
    }

    @Override // com.kubi.resources.widget.KcSmallSwitchButton, com.kubi.resources.widget.BaseSwitchButton
    public int getSwitchWidth() {
        return 28;
    }

    public final void updateVipLevel(int level, boolean siteVip) {
        this.vipLevel = level;
        this.siteVipShow = siteVip;
        setTrackResource(getTrackResource());
        refreshTrackTint();
    }

    private final void refreshTrackTint() {
        if (getIsInitialized() && isAttachedToWindow()) {
            post(new Runnable() { // from class: com.kubi.resources.widget.c1
                @Override // java.lang.Runnable
                public final void run() {
                    KcVipSmallSwitchButton.refreshTrackTint$lambda$1(this.f44423b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshTrackTint$lambda$1(KcVipSmallSwitchButton kcVipSmallSwitchButton) {
        int trackOffColor;
        if (kcVipSmallSwitchButton.getIsInitialized() && kcVipSmallSwitchButton.isAttachedToWindow()) {
            if (kcVipSmallSwitchButton.isChecked()) {
                trackOffColor = kcVipSmallSwitchButton.getShowTrackOnColor();
            } else {
                trackOffColor = kcVipSmallSwitchButton.getTrackOffColor();
            }
            kcVipSmallSwitchButton.applyTrackTint(trackOffColor);
        }
    }

    @Override // com.kubi.resources.widget.BaseSwitchButton
    public int getShowTrackOnColor() {
        if (showVip() && getSiteVipShow()) {
            return getVipTrackOnColor();
        }
        return super.getShowTrackOnColor();
    }

    @Override // com.kubi.resources.widget.KcSmallSwitchButton, com.kubi.resources.widget.BaseSwitchButton
    public int getTrackResource() {
        if (showVip()) {
            return R$drawable.selector_vip_small_switch_button_track;
        }
        return R$drawable.selector_small_switch_button_track;
    }
}
