package com.kubi.resources.widget;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.resources.widget.e0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TradeInputLayoutEditor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\"\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0013H&J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0013H&J\b\u0010!\u001a\u00020\u001dH&J\u0012\u0010\"\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\u0012\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010%H&J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u000bH&J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0013H&J\u001a\u0010\u000e\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u0013H&J\u0012\u0010+\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010-H&J\n\u0010.\u001a\u0004\u0018\u00010/H&J\u0010\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u000bH\u0016J\n\u00102\u001a\u0004\u0018\u00010\u000bH&J\u0010\u00103\u001a\u00020\u00112\u0006\u0010$\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u00112\u0006\u0010$\u001a\u000206H\u0016J0\u00107\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020/2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010=\u001a\u00020>H&J\u001c\u0010?\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010-2\b\u0010;\u001a\u0004\u0018\u00010<H&J\u0010\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006CÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/ITradeInputLayoutOperations;", "", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "value", "Ljava/math/BigDecimal;", "getValue", "()Ljava/math/BigDecimal;", "setValue", "(Ljava/math/BigDecimal;)V", "setSupportStepSubAdd", "", "isSupportStepSubAdd", "", "setLowValue", "setHighValue", "setInitValue", "setInnerFocusChangeListener", CmcdData.Factory.STREAM_TYPE_LIVE, "Landroid/view/View$OnFocusChangeListener;", "setPrecision", "increment", "precision", "", "followStep", "ensurePrecisions", "hasFocus", "getPrecision", "setRealInnerFocusChanged", "setSubOrAddClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "setEnsureIncrement", "ensureIncrement", "setSupportFloatInputFilter", "support", "needAnimation", "setHint", "hint", "", "getInputNumberStr", "", "setPercent", "percent", "getPercent", "setOnPercentChangeListener", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentChangeListener;", "setOnPercentFormatter", "Lcom/kubi/resources/widget/TradeInputWithPercentLayoutEditor$OnPercentFormatter;", "showTipsAutoDismiss", "anchor", "Landroid/view/View;", "tips", "defaultTipsView", "Landroid/widget/TextView;", TypedValues.TransitionType.S_DURATION, "", "setTipsContent", "content", "setStatusEnabled", "enabled", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeInputLayoutOperations {
    /* JADX INFO: renamed from: b */
    void mo54627b(@NotNull BigDecimal bigDecimal, boolean z11);

    /* JADX INFO: renamed from: c */
    void mo54628c(@Nullable CharSequence charSequence, @Nullable TextView textView);

    /* JADX INFO: renamed from: f */
    void mo54629f(@NotNull BigDecimal bigDecimal, int i11, boolean z11);

    /* JADX INFO: renamed from: g */
    void mo54630g(boolean z11);

    @NotNull
    Context getCtx();

    @NotNull
    EditText getEditText();

    @Nullable
    String getInputNumberStr();

    @Nullable
    /* JADX INFO: renamed from: getPercent */
    BigDecimal getF44163q();

    /* JADX INFO: renamed from: getPrecision */
    int getF44154h();

    @NotNull
    BigDecimal getValue();

    /* JADX INFO: renamed from: h */
    void mo54631h(@Nullable View view, @NotNull String str, @Nullable TextView textView, long j11);

    void setEnsureIncrement(@NotNull BigDecimal ensureIncrement);

    void setHint(@Nullable CharSequence hint);

    void setInitValue(@NotNull BigDecimal value);

    void setInnerFocusChangeListener(@Nullable View.OnFocusChangeListener l11);

    void setLowValue(@NotNull BigDecimal value);

    void setRealInnerFocusChanged(@Nullable View.OnFocusChangeListener l11);

    void setStatusEnabled(boolean enabled);

    void setSubOrAddClickListener(@Nullable TradeInputLayoutEditor.InterfaceC22960b interfaceC22960b);

    void setSupportFloatInputFilter(boolean support2);

    void setSupportStepSubAdd(boolean isSupportStepSubAdd);

    void setValue(@NotNull BigDecimal bigDecimal);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m55171a(ITradeInputLayoutOperations iTradeInputLayoutOperations, BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValue");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        iTradeInputLayoutOperations.mo54627b(bigDecimal, z11);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m55172d(ITradeInputLayoutOperations iTradeInputLayoutOperations, BigDecimal bigDecimal, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPrecision");
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        iTradeInputLayoutOperations.mo54629f(bigDecimal, i11, z11);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m55173e(ITradeInputLayoutOperations iTradeInputLayoutOperations, View view, String str, TextView textView, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTipsAutoDismiss");
        }
        if ((i11 & 4) != 0) {
            textView = null;
        }
        TextView textView2 = textView;
        if ((i11 & 8) != 0) {
            j11 = 4000;
        }
        iTradeInputLayoutOperations.mo54631h(view, str, textView2, j11);
    }

    default void setHighValue(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    default void setOnPercentChangeListener(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22964a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    default void setOnPercentFormatter(@NotNull TradeInputWithPercentLayoutEditor.InterfaceC22965b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    default void setPercent(@NotNull BigDecimal percent) {
        Intrinsics.checkNotNullParameter(percent, "percent");
    }
}
