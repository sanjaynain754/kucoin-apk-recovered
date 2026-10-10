package com.kubi.margin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.margin.view.TradeSettingOptionItemView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36942u0;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeSettingOptionItemView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/margin/view/TradeSettingOptionItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/margin/databinding/BmarginSettingSelectOptionBinding;", "itemId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/margin/view/TradeSettingOptionItemView$OnItemSelectedListener;", "init", "", "getItemId", "setItemId", "id", "setImageResource", "resId", "setText", "text", "", "setOnItemSelectedListener", "setSelected", "selected", "", "OnItemSelectedListener", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeSettingOptionItemView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public C36942u0 f34267b;

    /* JADX INFO: renamed from: c */
    public int f34268c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public InterfaceC18596a f34269d;

    /* JADX INFO: renamed from: com.kubi.margin.view.TradeSettingOptionItemView$a */
    /* JADX INFO: compiled from: TradeSettingOptionItemView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/view/TradeSettingOptionItemView$OnItemSelectedListener;", "", "onItemSelected", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/margin/view/TradeSettingOptionItemView;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC18596a {
        /* JADX INFO: renamed from: a */
        void mo40720a(@NotNull TradeSettingOptionItemView tradeSettingOptionItemView);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeSettingOptionItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public static final void m40718c(TradeSettingOptionItemView tradeSettingOptionItemView, View view) {
        tradeSettingOptionItemView.setSelected(true);
        InterfaceC18596a interfaceC18596a = tradeSettingOptionItemView.f34269d;
        if (interfaceC18596a != null) {
            interfaceC18596a.mo40720a(tradeSettingOptionItemView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeSettingOptionItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: getItemId, reason: from getter */
    public final int getF34268c() {
        return this.f34268c;
    }

    public final void setImageResource(int resId) {
        C36942u0 c36942u0 = this.f34267b;
        if (c36942u0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36942u0 = null;
        }
        c36942u0.f81997b.setImageResource(resId);
    }

    public final void setItemId(int id2) {
        this.f34268c = id2;
    }

    public final void setOnItemSelectedListener(@NotNull InterfaceC18596a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f34269d = listener;
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        C36942u0 c36942u0 = this.f34267b;
        if (c36942u0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36942u0 = null;
        }
        c36942u0.f81998c.setText(text);
    }

    public /* synthetic */ TradeSettingOptionItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    public final void m40719b(Context context) {
        C36942u0 c36942u0M82754c = C36942u0.m82754c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c36942u0M82754c, "inflate(...)");
        this.f34267b = c36942u0M82754c;
        setOrientation(1);
        setOnClickListener(new View.OnClickListener() { // from class: xp.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeSettingOptionItemView.m40718c(this.f103901b, view);
            }
        });
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeSettingOptionItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        m40719b(context);
    }
}
