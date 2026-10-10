package com.kubi.payment.fasttrade.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.util.TypedValueCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.R$color;
import com.kubi.payment.fasttrade.widget.FastTradeTextView;
import com.kubi.payment.widget.NumberKeyboardView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33978va;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: FastTradeTextView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0010\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0002>?B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\b\u0010!\u001a\u00020\u0015H\u0002J\u0006\u0010\"\u001a\u00020\u001aJ\u000e\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001aJ\u000e\u0010$\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010'\u001a\u00020\u0015J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u001aH\u0003J\b\u0010*\u001a\u00020\u001aH\u0002J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u001aH\u0017J\b\u0010-\u001a\u00020\u0015H\u0016J\b\u0010.\u001a\u00020\u000bH\u0002J\u001c\u0010/\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J*\u00104\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001cH\u0014J(\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u001cH\u0014J\b\u0010=\u001a\u00020\u0015H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "Lcom/kubi/payment/widget/NumberKeyboardView$OnNumberChangeListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isFinancialEnabled", "", "()Z", "isFinancialEnabled$delegate", "Lkotlin/Lazy;", "maxTextSizePx", "", "minTextSizePx", "stepSizePx", "maxAllowedWidthPx", "setMaxAllowedWidth", "", "newMaxAllowedWidth", "measurePaint", "Landroid/graphics/Paint;", "rawInput", "", "precision", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/payment/fasttrade/widget/FastTradeTextView$OnTextChangeListener;", "decimalSeparator", "", "updateLocaleSymbols", "amount", "setAmount", "registerListener", "unregisterListener", "setPrecision", "reset", "updateText", "numberString", "formatText", "onNumberChange", "number", "onDelete", "isValidPrecision", "setText", "text", "", "type", "Landroid/widget/TextView$BufferType;", "onTextChanged", "start", "lengthBefore", "lengthAfter", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "adjustTextSize", "OnTextChangeListener", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastTradeTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeTextView.kt\ncom/kubi/payment/fasttrade/widget/FastTradeTextView\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,316:1\n35#2,4:317\n39#2:323\n44#3,2:321\n*S KotlinDebug\n*F\n+ 1 FastTradeTextView.kt\ncom/kubi/payment/fasttrade/widget/FastTradeTextView\n*L\n38#1:317,4\n38#1:323\n38#1:321,2\n*E\n"})
public final class FastTradeTextView extends BaseTextView implements NumberKeyboardView.InterfaceC21458a {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f38955l = new Companion(null);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final BigDecimal f38956m = new BigDecimal(1000000000);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f38957b;

    /* JADX INFO: renamed from: c */
    public float f38958c;

    /* JADX INFO: renamed from: d */
    public float f38959d;

    /* JADX INFO: renamed from: e */
    public float f38960e;

    /* JADX INFO: renamed from: f */
    public float f38961f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Paint f38962g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public String f38963h;

    /* JADX INFO: renamed from: i */
    public int f38964i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InterfaceC20680a f38965j;

    /* JADX INFO: renamed from: k */
    public char f38966k;

    /* JADX INFO: compiled from: FastTradeTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/widget/FastTradeTextView$Companion;", "", "<init>", "()V", "maxInput", "Ljava/math/BigDecimal;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.widget.FastTradeTextView$a */
    /* JADX INFO: compiled from: FastTradeTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/widget/FastTradeTextView$OnTextChangeListener;", "", "onTextChange", "", "text", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC20680a {
        /* JADX INFO: renamed from: a */
        void mo46797a(@NotNull String str);
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.widget.FastTradeTextView$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20681b extends TypeToken<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38957b = LazyKt.lazy(new Function0() { // from class: xt.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FastTradeTextView.m47157g());
            }
        });
        this.f38958c = getTextSize();
        this.f38959d = TypedValueCompat.spToPx(12.0f, getResources().getDisplayMetrics());
        this.f38960e = TypedValueCompat.spToPx(1.0f, getResources().getDisplayMetrics());
        this.f38961f = TypedValueCompat.dpToPx(180.0f, getResources().getDisplayMetrics());
        this.f38962g = new Paint();
        this.f38963h = "0";
        this.f38964i = 8;
        this.f38966k = '.';
        m47158j();
    }

    /* JADX INFO: renamed from: j */
    private final void m47158j() {
        NumberFormat numberFormatM92646k = C42180b.m92646k(null, 1, null);
        Intrinsics.checkNotNull(numberFormatM92646k, "null cannot be cast to non-null type java.text.DecimalFormat");
        this.f38966k = ((DecimalFormat) numberFormatM92646k).getDecimalFormatSymbols().getDecimalSeparator();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m47157g() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20681b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_input_financial_enable", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @Override // com.kubi.payment.widget.NumberKeyboardView.InterfaceC21458a
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: a */
    public void mo47159a(@NotNull String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        C44128b.m97266j("payment", "onNumberChange number:" + number);
        String str = this.f38963h;
        if (Intrinsics.areEqual(number, C33978va.f72339h)) {
            if (StringsKt.contains$default((CharSequence) this.f38963h, (CharSequence) C33978va.f72339h, false, 2, (Object) null)) {
                return;
            }
            number = str + number;
            m47166k(number);
        } else if (Intrinsics.areEqual(number, "0")) {
            if (!m47164h()) {
                return;
            }
            if (!Intrinsics.areEqual(this.f38963h, "0")) {
                number = str + number;
            }
            m47166k(number);
        } else {
            if (!m47164h()) {
                return;
            }
            if (!Intrinsics.areEqual(this.f38963h, "0")) {
                number = str + number;
            }
            m47166k(number);
        }
        C44128b.m97266j("payment", "onNumberChange content:" + number);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF38963h() {
        return this.f38963h;
    }

    /* JADX INFO: renamed from: e */
    public final String m47162e() {
        String strM92640e;
        if (!m47163f()) {
            return this.f38963h;
        }
        if (StringsKt.endsWith$default(this.f38963h, C33978va.f72339h, false, 2, (Object) null)) {
            String strRemoveSuffix = StringsKt.removeSuffix(this.f38963h, (CharSequence) C33978va.f72339h);
            if (strRemoveSuffix.length() <= 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('0');
                sb2.append(this.f38966k);
                return sb2.toString();
            }
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(strRemoveSuffix);
            if (bigDecimalM66536f != null && (strM92640e = C42180b.m92640e(bigDecimalM66536f, null, this.f38964i, false, false, false, 0, null, 125, null)) != null) {
                strRemoveSuffix = strM92640e;
            }
            if (StringsKt.contains$default((CharSequence) strRemoveSuffix, this.f38966k, false, 2, (Object) null)) {
                return strRemoveSuffix;
            }
            return strRemoveSuffix + this.f38966k;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f38963h, C33978va.f72339h, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return C42180b.m92640e(DowngradeExKt.m66535e(this.f38963h, null, 1, null), null, this.f38964i, false, false, false, 0, null, 125, null);
        }
        String strSubstring = this.f38963h.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = this.f38963h.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String str = "0";
        if (strSubstring.length() != 0 && !Intrinsics.areEqual(strSubstring, "0")) {
            str = (String) StringsKt.split$default((CharSequence) C42180b.m92640e(DowngradeExKt.m66535e(strSubstring, null, 1, null), null, 0, false, false, false, 0, null, 125, null), new char[]{this.f38966k}, false, 0, 6, (Object) null).get(0);
        }
        return str + this.f38966k + strSubstring2;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m47163f() {
        return ((Boolean) this.f38957b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m47164h() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f38963h, C33978va.f72339h, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return true;
        }
        String strSubstring = this.f38963h.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring.length() < this.f38964i;
    }

    /* JADX INFO: renamed from: i */
    public final void m47165i() {
        this.f38963h = "0";
        setText("0");
        setTextColor(ContextCompat.getColor(getContext(), R$color.c_text30));
        InterfaceC20680a interfaceC20680a = this.f38965j;
        if (interfaceC20680a != null) {
            interfaceC20680a.mo46797a(this.f38963h);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public final void m47166k(String str) {
        BigDecimal bigDecimal = f38956m;
        if (bigDecimal.compareTo(DowngradeExKt.m66535e(str, null, 1, null)) <= 0) {
            str = bigDecimal.toPlainString();
            Intrinsics.checkNotNull(str);
        }
        this.f38963h = str;
        setText(m47162e());
        setTextColor(ContextCompat.getColor(getContext(), R$color.c_text));
        InterfaceC20680a interfaceC20680a = this.f38965j;
        if (interfaceC20680a != null) {
            interfaceC20680a.mo46797a(this.f38963h);
        }
    }

    @Override // com.kubi.payment.widget.NumberKeyboardView.InterfaceC21458a
    public void onDelete() {
        C44128b.m97266j("payment", "onClear realText:" + this.f38963h);
        if (this.f38963h.length() <= 1) {
            m47165i();
        } else {
            m47166k(StringsKt.dropLast(this.f38963h, 1));
        }
    }

    public final void registerListener(@NotNull InterfaceC20680a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38965j = listener;
    }

    public final void setAmount(@NotNull String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        m47166k(amount);
    }

    public final void setMaxAllowedWidth(float newMaxAllowedWidth) {
        if (this.f38961f == newMaxAllowedWidth) {
            return;
        }
        this.f38961f = newMaxAllowedWidth;
        m47160c();
    }

    public final void setPrecision(int precision) {
        this.f38964i = precision;
    }

    /* JADX INFO: renamed from: c */
    public final void m47160c() {
        Number numberValueOf;
        if (getWidth() > 0) {
            CharSequence text = getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() == 0) {
                return;
            }
            float f11 = this.f38961f;
            if (f11 > 0.0f) {
                numberValueOf = Float.valueOf((f11 - getPaddingStart()) - getPaddingEnd());
            } else {
                numberValueOf = Integer.valueOf((getWidth() - getPaddingStart()) - getPaddingEnd());
            }
            float fFloatValue = numberValueOf.floatValue();
            float f12 = this.f38958c;
            this.f38962g.set(getPaint());
            while (f12 > this.f38959d) {
                this.f38962g.setTextSize(f12);
                if (this.f38962g.measureText(getText().toString()) <= fFloatValue) {
                    break;
                } else {
                    f12 -= this.f38960e;
                }
            }
            setTextSize(0, Math.max(f12, this.f38959d));
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (w11 != oldw) {
            m47160c();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(@Nullable CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        m47160c();
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        super.setText(text, type);
        m47160c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38957b = LazyKt.lazy(new Function0() { // from class: xt.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FastTradeTextView.m47157g());
            }
        });
        this.f38958c = getTextSize();
        this.f38959d = TypedValueCompat.spToPx(12.0f, getResources().getDisplayMetrics());
        this.f38960e = TypedValueCompat.spToPx(1.0f, getResources().getDisplayMetrics());
        this.f38961f = TypedValueCompat.dpToPx(180.0f, getResources().getDisplayMetrics());
        this.f38962g = new Paint();
        this.f38963h = "0";
        this.f38964i = 8;
        this.f38966k = '.';
        m47158j();
    }
}
