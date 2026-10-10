package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeInputLayoutProxy.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u00012\u00020\u0002:\u0001uB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J \u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\bH\u0016J\u0012\u0010,\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010-\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0011H\u0016J\u0010\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020(H\u0016J\u0018\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00104\u001a\u00020(H\u0016J\u0012\u00105\u001a\u00020\u001f2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\n\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020\u001f2\b\u0010;\u001a\u0004\u0018\u00010\rJ\u0006\u0010<\u001a\u00020\u0011J\u0018\u0010=\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u00104\u001a\u00020(J\u0006\u0010>\u001a\u00020\u001fJ\u0006\u0010?\u001a\u00020(J\u000e\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020(J\u000e\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u000207J\u0010\u0010D\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010EJ,\u0010F\u001a\u00020\u001f2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u0002092\b\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010L\u001a\u00020MH\u0016J\u001c\u0010N\u001a\u00020\u001f2\b\u0010O\u001a\u0004\u0018\u0001072\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\n\u0010P\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010Q\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020(H\u0016J\u0010\u0010S\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020(H\u0016J\u0010\u0010U\u001a\u00020\u001f2\u0006\u0010V\u001a\u00020\bH\u0016J\u0012\u0010W\u001a\u00020\u001f2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010Z\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\bH\u0016J\u0010\u0010\\\u001a\u00020\u001f2\u0006\u0010]\u001a\u00020\bH\u0016J\u0010\u0010^\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020(H\u0016J\u0010\u0010_\u001a\u00020\u001f2\u0006\u0010`\u001a\u00020(H\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020(H\u0016J\u0010\u0010c\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020(H\u0016J(\u0010e\u001a\u00020\u001f2\u0006\u0010f\u001a\u00020\b2\u0006\u0010g\u001a\u00020\b2\u0006\u0010h\u001a\u00020\b2\u0006\u0010i\u001a\u00020\bH\u0016J(\u0010j\u001a\u00020\u001f2\u0006\u0010k\u001a\u00020\b2\u0006\u0010g\u001a\u00020\b2\u0006\u0010l\u001a\u00020\b2\u0006\u0010i\u001a\u00020\bH\u0016J\u0010\u0010m\u001a\u00020\u001f2\u0006\u0010n\u001a\u00020\bH\u0016J\u0012\u0010o\u001a\u00020\u001f2\b\u0010p\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010q\u001a\u00020\u001f2\u0006\u0010r\u001a\u00020\bH\u0016J\u0018\u0010s\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00104\u001a\u00020(H\u0002J\u0010\u0010t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006v"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputLayoutProxy;", "Landroid/widget/FrameLayout;", "Lcom/kubi/resources/widget/ITradeInputLayoutOperations;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "realView", "valueAdapter", "Lcom/kubi/resources/widget/TradeInputValueAdapter;", "lastAdaptedValueRead", "Lcom/kubi/resources/widget/TradeInputLayoutProxy$AdaptedValueRead;", "v", "Ljava/math/BigDecimal;", "value", "getValue", "()Ljava/math/BigDecimal;", "setValue", "(Ljava/math/BigDecimal;)V", "ctx", "getCtx", "()Landroid/content/Context;", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setLowValue", "", "setInitValue", "setInnerFocusChangeListener", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/view/View$OnFocusChangeListener;", "setPrecision", "increment", "precision", "followStep", "", "ensurePrecisions", "hasFocus", "getPrecision", "setRealInnerFocusChanged", "setSubOrAddClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "setEnsureIncrement", "ensureIncrement", "setSupportFloatInputFilter", "support", "needAnimation", "setHint", "hint", "", "getInputNumberStr", "", "setValueAdapter", "adapter", "getDisplayValue", "setDisplayValue", "clearInput", "ensureTypeSelectorEnabled", "setTypeSelectorVisible", ViewProps.VISIBLE, "setTypeSelectorText", "text", "setTypeSelectorClickListener", "Landroid/view/View$OnClickListener;", "showTipsAutoDismiss", "anchor", "Landroid/view/View;", "tips", "defaultTipsView", "Landroid/widget/TextView;", TypedValues.TransitionType.S_DURATION, "", "setTipsContent", "content", "getPercent", "setStatusEnabled", "enabled", "setSupportStepSubAdd", "isSupportStepSubAdd", "setVisibility", "visibility", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "setBackgroundColor", "color", "setBackgroundResource", "resId", "setEnabled", "setClickable", "clickable", "setFocusable", "focusable", "setFocusableInTouchMode", "focusableInTouchMode", "setPadding", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "setPaddingRelative", "start", "end", "setLayoutDirection", ViewProps.LAYOUT_DIRECTION, "setContentDescription", "contentDescription", "setTextAlignment", "textAlignment", "setBusinessValue", "displayValueOrZero", "AdaptedValueRead", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeInputLayoutProxy extends FrameLayout implements ITradeInputLayoutOperations {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ITradeInputLayoutOperations f44138b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public TradeInputValueAdapter f44139c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public AdaptedValueRead f44140d;

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputLayoutProxy$a, reason: from toString */
    /* JADX INFO: compiled from: TradeInputLayoutProxy.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeInputLayoutProxy$AdaptedValueRead;", "", "displayValue", "Ljava/math/BigDecimal;", "businessValue", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getDisplayValue", "()Ljava/math/BigDecimal;", "getBusinessValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class AdaptedValueRead {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final BigDecimal displayValue;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final BigDecimal businessValue;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdaptedValueRead)) {
                return false;
            }
            AdaptedValueRead adaptedValueRead = (AdaptedValueRead) other;
            return Intrinsics.areEqual(this.displayValue, adaptedValueRead.displayValue) && Intrinsics.areEqual(this.businessValue, adaptedValueRead.businessValue);
        }

        public AdaptedValueRead(@NotNull BigDecimal displayValue, @NotNull BigDecimal businessValue) {
            Intrinsics.checkNotNullParameter(displayValue, "displayValue");
            Intrinsics.checkNotNullParameter(businessValue, "businessValue");
            this.displayValue = displayValue;
            this.businessValue = businessValue;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getBusinessValue() {
            return this.businessValue;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getDisplayValue() {
            return this.displayValue;
        }

        public int hashCode() {
            return (this.displayValue.hashCode() * 31) + this.businessValue.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdaptedValueRead(displayValue=" + this.displayValue + ", businessValue=" + this.businessValue + ')';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeInputLayoutProxy(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: i */
    public final void m54855i() {
        this.f44140d = null;
        Editable text = this.f44138b.getEditText().getText();
        if (text != null) {
            text.clear();
        }
    }

    public final void setValueAdapter(@Nullable TradeInputValueAdapter tradeInputValueAdapter) {
        this.f44140d = null;
        this.f44139c = tradeInputValueAdapter;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeInputLayoutProxy(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m54854n(TradeInputLayoutProxy tradeInputLayoutProxy, BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        tradeInputLayoutProxy.m54859m(bigDecimal, z11);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: b */
    public void mo54627b(@NotNull BigDecimal value, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        m54858l(value, z11);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: c */
    public void mo54628c(@Nullable CharSequence charSequence, @Nullable TextView textView) {
        this.f44138b.mo54628c(charSequence, textView);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: f */
    public void mo54629f(@NotNull BigDecimal increment, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(increment, "increment");
        this.f44138b.mo54629f(increment, i11, z11);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: g */
    public void mo54630g(boolean z11) {
        this.f44138b.mo54630g(z11);
    }

    @NotNull
    public final BigDecimal getDisplayValue() {
        return this.f44138b.getValue();
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public EditText getEditText() {
        return this.f44138b.getEditText();
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @Nullable
    public String getInputNumberStr() {
        return this.f44138b.getInputNumberStr();
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @Nullable
    /* JADX INFO: renamed from: getPercent */
    public BigDecimal getF44163q() {
        return this.f44138b.getF44163q();
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: getPrecision */
    public int getF44154h() {
        TradeInputValueAdapter tradeInputValueAdapter = this.f44139c;
        return tradeInputValueAdapter != null ? tradeInputValueAdapter.mo55050b() : this.f44138b.getF44154h();
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public BigDecimal getValue() {
        TradeInputValueAdapter tradeInputValueAdapter = this.f44139c;
        if (tradeInputValueAdapter == null) {
            this.f44140d = null;
            return this.f44138b.getValue();
        }
        BigDecimal value = this.f44138b.getValue();
        BigDecimal bigDecimalMo55051c = tradeInputValueAdapter.mo55051c(value);
        this.f44140d = bigDecimalMo55051c != null ? new AdaptedValueRead(value, bigDecimalMo55051c) : null;
        if (bigDecimalMo55051c != null) {
            return bigDecimalMo55051c;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    /* JADX INFO: renamed from: h */
    public void mo54631h(@Nullable View view, @NotNull String tips, @Nullable TextView textView, long j11) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.f44138b.mo54631h(view, tips, textView, j11);
    }

    /* JADX INFO: renamed from: j */
    public final BigDecimal m54856j(BigDecimal bigDecimal) {
        TradeInputValueAdapter tradeInputValueAdapter = this.f44139c;
        if (tradeInputValueAdapter != null) {
            BigDecimal bigDecimalMo55049a = tradeInputValueAdapter.mo55049a(bigDecimal);
            if (bigDecimalMo55049a == null) {
                bigDecimalMo55049a = BigDecimal.ZERO;
            }
            if (bigDecimalMo55049a != null) {
                return bigDecimalMo55049a;
            }
        }
        return bigDecimal;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m54857k() {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f44138b;
        KcTradeNumAbInputView kcTradeNumAbInputView = iTradeInputLayoutOperations instanceof KcTradeNumAbInputView ? (KcTradeNumAbInputView) iTradeInputLayoutOperations : null;
        return kcTradeNumAbInputView != null && kcTradeNumAbInputView.m54634w();
    }

    /* JADX INFO: renamed from: l */
    public final void m54858l(BigDecimal bigDecimal, boolean z11) {
        BigDecimal bigDecimalMo55051c;
        TradeInputValueAdapter tradeInputValueAdapter = this.f44139c;
        if (tradeInputValueAdapter == null) {
            this.f44140d = null;
            this.f44138b.mo54627b(bigDecimal, z11);
            return;
        }
        AdaptedValueRead adaptedValueRead = this.f44140d;
        this.f44140d = null;
        BigDecimal value = this.f44138b.getValue();
        if (adaptedValueRead != null && adaptedValueRead.getBusinessValue().compareTo(bigDecimal) == 0 && adaptedValueRead.getDisplayValue().compareTo(value) == 0 && (bigDecimalMo55051c = tradeInputValueAdapter.mo55051c(value)) != null && bigDecimalMo55051c.compareTo(bigDecimal) == 0) {
            return;
        }
        BigDecimal bigDecimalMo55049a = tradeInputValueAdapter.mo55049a(bigDecimal);
        if (bigDecimalMo55049a != null) {
            this.f44138b.mo54627b(bigDecimalMo55049a, z11);
        } else {
            m54855i();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m54859m(@NotNull BigDecimal value, boolean z11) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44140d = null;
        this.f44138b.mo54627b(value, z11);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setEnsureIncrement(@NotNull BigDecimal ensureIncrement) {
        Intrinsics.checkNotNullParameter(ensureIncrement, "ensureIncrement");
        this.f44138b.setEnsureIncrement(ensureIncrement);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setHint(@Nullable CharSequence hint) {
        this.f44138b.setHint(hint);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setInitValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44138b.setInitValue(m54856j(value));
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setInnerFocusChangeListener(@Nullable View.OnFocusChangeListener l11) {
        this.f44138b.setInnerFocusChangeListener(l11);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setLowValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f44138b.setLowValue(m54856j(value));
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setRealInnerFocusChanged(@Nullable View.OnFocusChangeListener l11) {
        this.f44138b.setRealInnerFocusChanged(l11);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setStatusEnabled(boolean enabled) {
        this.f44138b.setStatusEnabled(enabled);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSubOrAddClickListener(@Nullable TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b) {
        this.f44138b.setSubOrAddClickListener(interfaceC22960b);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSupportFloatInputFilter(boolean support2) {
        this.f44138b.setSupportFloatInputFilter(support2);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setSupportStepSubAdd(boolean isSupportStepSubAdd) {
        this.f44138b.setSupportStepSubAdd(isSupportStepSubAdd);
    }

    public final void setTypeSelectorClickListener(@Nullable View.OnClickListener listener) {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f44138b;
        KcTradeNumAbInputView kcTradeNumAbInputView = iTradeInputLayoutOperations instanceof KcTradeNumAbInputView ? (KcTradeNumAbInputView) iTradeInputLayoutOperations : null;
        if (kcTradeNumAbInputView != null) {
            kcTradeNumAbInputView.setTypeSelectorClickListener(listener);
        }
    }

    public final void setTypeSelectorText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f44138b;
        KcTradeNumAbInputView kcTradeNumAbInputView = iTradeInputLayoutOperations instanceof KcTradeNumAbInputView ? (KcTradeNumAbInputView) iTradeInputLayoutOperations : null;
        if (kcTradeNumAbInputView != null) {
            kcTradeNumAbInputView.setTypeSelectorText(text);
        }
    }

    public final void setTypeSelectorVisible(boolean visible) {
        ITradeInputLayoutOperations iTradeInputLayoutOperations = this.f44138b;
        KcTradeNumAbInputView kcTradeNumAbInputView = iTradeInputLayoutOperations instanceof KcTradeNumAbInputView ? (KcTradeNumAbInputView) iTradeInputLayoutOperations : null;
        if (kcTradeNumAbInputView != null) {
            kcTradeNumAbInputView.setTypeSelectorVisible(visible);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public void setValue(@NotNull BigDecimal v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        m54858l(v11, false);
    }

    public /* synthetic */ TradeInputLayoutProxy(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    @NotNull
    public Context getCtx() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        View view;
        super.setBackground(background);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setBackground(background);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        View view;
        super.setBackgroundColor(color);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setBackgroundColor(color);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        View view;
        super.setBackgroundResource(resId);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setBackgroundResource(resId);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        View view;
        super.setClickable(clickable);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setClickable(clickable);
        }
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence contentDescription) {
        View view;
        super.setContentDescription(contentDescription);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setContentDescription(contentDescription);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        View view;
        super.setEnabled(enabled);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setEnabled(enabled);
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean focusable) {
        View view;
        super.setFocusable(focusable);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setFocusable(focusable);
        }
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean focusableInTouchMode) {
        View view;
        super.setFocusableInTouchMode(focusableInTouchMode);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setFocusableInTouchMode(focusableInTouchMode);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setHighValue(@NotNull BigDecimal bigDecimal) {
        super.setHighValue(bigDecimal);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
        View view;
        super.setLayoutDirection(layoutDirection);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setLayoutDirection(layoutDirection);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setOnPercentChangeListener(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22964a interfaceC22964a) {
        super.setOnPercentChangeListener(interfaceC22964a);
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setOnPercentFormatter(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22965b interfaceC22965b) {
        super.setOnPercentFormatter(interfaceC22965b);
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        View view;
        super.setPadding(left, top, right, bottom);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setPadding(left, top, right, bottom);
        }
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end, int bottom) {
        View view;
        super.setPaddingRelative(start, top, end, bottom);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setPaddingRelative(start, top, end, bottom);
        }
    }

    @Override // com.kubi.resources.widget.ITradeInputLayoutOperations
    public /* bridge */ /* synthetic */ void setPercent(@NotNull BigDecimal bigDecimal) {
        super.setPercent(bigDecimal);
    }

    @Override // android.view.View
    public void setTextAlignment(int textAlignment) {
        View view;
        super.setTextAlignment(textAlignment);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setTextAlignment(textAlignment);
        }
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        View view;
        super.setVisibility(visibility);
        Object obj = this.f44138b;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            view.setVisibility(visibility);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public TradeInputLayoutProxy(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        ITradeInputLayoutOperations tradeInputLayoutEditor;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        if (TradeInputProxyLayoutConfig.f44243a.m54946b()) {
            tradeInputLayoutEditor = new KcTradeNumAbInputView(context, attributeSet, i11, 0, 8, null);
        } else {
            tradeInputLayoutEditor = new TradeInputLayoutEditor(context, attributeSet, i11);
        }
        this.f44138b = tradeInputLayoutEditor;
        Intrinsics.checkNotNull(tradeInputLayoutEditor, "null cannot be cast to non-null type android.view.View");
        addView((View) tradeInputLayoutEditor, -1, -2);
    }
}
