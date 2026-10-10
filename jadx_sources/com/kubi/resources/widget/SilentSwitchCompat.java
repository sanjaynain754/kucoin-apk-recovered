package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SilentSwitchCompat.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/SilentSwitchCompat;", "Lcom/kubi/resources/widget/KcSmallSwitchButton;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setOnCheckedChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCheckedSilently", "checked", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SilentSwitchCompat extends KcSmallSwitchButton {

    @Nullable
    private CompoundButton.OnCheckedChangeListener mListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentSwitchCompat(@NotNull Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setCheckedSilently(boolean checked) {
        setOnCheckedChangeListener(null);
        setChecked(checked);
        setOnCheckedChangeListener(this.mListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentSwitchCompat(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener listener) {
        if (listener != null && !Intrinsics.areEqual(this.mListener, listener)) {
            this.mListener = listener;
        }
        super.setOnCheckedChangeListener(listener);
    }
}
