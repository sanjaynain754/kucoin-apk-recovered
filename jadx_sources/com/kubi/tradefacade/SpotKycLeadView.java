package com.kubi.tradefacade;

import android.content.Context;
import android.content.res.Resources;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import w30.C45717d;

/* JADX INFO: compiled from: SpotKycLeadView.kt */
/* JADX INFO: loaded from: classes49.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradefacade/SpotKycLeadView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/tradefacade/databinding/SpotKycLeadViewBinding;", "setMessage", "", "text", "", "setBtnText", "resId", "setBtnClick", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setIcon", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotKycLeadView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C45717d f51853b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpotKycLeadView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBtnText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f51853b.f103096b.setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpotKycLeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBtnClick(@NotNull final View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        KcPrimaryButton btnVerify = this.f51853b.f103096b;
        Intrinsics.checkNotNullExpressionValue(btnVerify, "btnVerify");
        C27046k.m66711z(btnVerify, 0L, new Function0() { // from class: com.kubi.tradefacade.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotKycLeadView.m63462b(listener, this);
            }
        }, 1, null);
    }

    public final void setBtnText(int resId) {
        this.f51853b.f103096b.setText(resId);
    }

    public final void setIcon(int resId) {
        this.f51853b.f103097c.setImageResource(resId);
    }

    public final void setMessage(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f51853b.f103098d.setText(text);
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView tvMessage = this.f51853b.f103098d;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        Resources resources = getResources();
        int i11 = R$color.brandGreen;
        highlightTextHelper.m54120f(tvMessage, new Pair(textTagEnum, new ForegroundColorSpan(resources.getColor(i11))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new ForegroundColorSpan(getResources().getColor(i11))));
    }

    public /* synthetic */ SpotKycLeadView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m63462b(View.OnClickListener onClickListener, SpotKycLeadView spotKycLeadView) {
        onClickListener.onClick(spotKycLeadView);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpotKycLeadView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C45717d c45717dM100919c = C45717d.m100919c(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c45717dM100919c, "inflate(...)");
        this.f51853b = c45717dM100919c;
    }
}
