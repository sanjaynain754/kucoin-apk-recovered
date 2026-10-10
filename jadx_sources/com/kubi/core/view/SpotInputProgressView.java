package com.kubi.core.view;

import af.C0296a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import t30.C44685e;

/* JADX INFO: compiled from: SpotInputProgressView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\b\u0010\r\u001a\u00020\u000bH\u0014J\u0006\u0010\u000e\u001a\u00020\u000bJ\b\u0010\u000f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\nR\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/core/view/SpotInputProgressView;", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "setOnPercentChangeListener", "onAttachedToWindow", "clearCheck", "onDetachedFromWindow", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "getPercent", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotInputProgressView extends KcSeekBar {

    /* JADX INFO: renamed from: x0 */
    @Nullable
    public Function1<? super BigDecimal, Unit> f21297x0;

    /* JADX INFO: renamed from: com.kubi.core.view.SpotInputProgressView$a */
    /* JADX INFO: compiled from: SpotInputProgressView.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/core/view/SpotInputProgressView$onAttachedToWindow$1", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12466a implements KcSeekBar.InterfaceC23002a {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23002a
        /* JADX INFO: renamed from: a */
        public String mo21944a(int i11, float f11, boolean z11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return C42180b.m92642g(C0296a.m1039a(bigDecimalValueOf, new BigDecimal(100), 2, RoundingMode.HALF_UP), null, null, 0, false, false, false, 27, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.view.SpotInputProgressView$b */
    /* JADX INFO: compiled from: SpotInputProgressView.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/core/view/SpotInputProgressView$onAttachedToWindow$2", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "onChanged", "", "progress", "", "progressFloat", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12467b extends KcSeekBar.AbstractC23005d {
        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d
        /* JADX INFO: renamed from: c */
        public void mo21945c(int i11, float f11) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal bigDecimalM1039a = C0296a.m1039a(bigDecimalValueOf, new BigDecimal(100), 2, RoundingMode.DOWN);
            Function1 function1 = SpotInputProgressView.this.f21297x0;
            if (function1 != null) {
                function1.invoke(bigDecimalM1039a);
            }
        }

        public C12467b() {
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m23419J() {
        setProgress(0.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotInputProgressView(@NotNull Context context, @NotNull AttributeSet attr) {
        super(context, attr);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }

    @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) throws Exception {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            C44685e.m98844c(this, null, 1, null);
        }
        return super.onTouchEvent(event);
    }

    public final void setOnPercentChangeListener(@NotNull Function1<? super BigDecimal, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f21297x0 = listener;
    }

    @NotNull
    public final BigDecimal getPercent() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(getProgress());
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return C0296a.m1039a(bigDecimalValueOf, new BigDecimal(100), 2, RoundingMode.DOWN);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setProgressFormatCallback(new C12466a());
        setOnSimpleProgressChangedListener(new C12467b());
    }

    @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
