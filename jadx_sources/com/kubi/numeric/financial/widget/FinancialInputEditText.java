package com.kubi.numeric.financial.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.numeric.kit.R$attr;
import com.kubi.numeric.kit.R$styleable;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p571qs.C43869d;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: FinancialInputEditText.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00015\b\u0016\u0018\u0000 \\2\u00020\u0001:\u0004\\]^_B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0012\u0010$\u001a\u00020%2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u001d\u0010&\u001a\u00020%2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001eH\u0016¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020%H\u0002J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020%H\u0002J\b\u0010.\u001a\u00020%H\u0002J\b\u0010/\u001a\u00020(H\u0002J\u0010\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\rH\u0002J\u0010\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\rH\u0002J\u0010\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\rH\u0002J \u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\nH\u0002J(\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r2\u0006\u0010:\u001a\u00020\n2\u0006\u0010>\u001a\u00020\nH\u0002J\u0010\u0010?\u001a\u00020\r2\u0006\u00101\u001a\u00020\rH\u0002J\u0018\u0010@\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010A\u001a\u00020\u000fH\u0002J\u0018\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\nH\u0002J\u0018\u0010E\u001a\u00020%2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\nH\u0002J\u001a\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0006\u0010J\u001a\u00020\rJ\u0010\u0010K\u001a\u00020%2\b\u0010L\u001a\u0004\u0018\u00010MJ\u0010\u0010N\u001a\u00020%2\b\u0010L\u001a\u0004\u0018\u00010\rJ\u000e\u0010O\u001a\u00020%2\u0006\u0010P\u001a\u00020\nJ\u0006\u0010Q\u001a\u00020\nJ\u0006\u0010R\u001a\u00020%J\u0006\u0010S\u001a\u00020\u000fJ\b\u0010T\u001a\u0004\u0018\u00010MJ\u000e\u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0012\u0010W\u001a\u00020%2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0012\u0010Z\u001a\u00020%2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010[\u001a\u00020%H\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u001fR\u00020\u00000\u001eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 R\u0018\u0010!\u001a\f\u0012\b\u0012\u00060#R\u00020\u00000\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0004\n\u0002\u00106¨\u0006`"}, m90084d2 = {"Lcom/kubi/numeric/financial/widget/FinancialInputEditText;", "Lcom/kubi/resources/widget/FilterEmojiEditText;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rawInput", "", "isFormatting", "", "isFinancialInput", "isFinancialStyle", "decimalSeparator", "", "groupingSeparator", "maxDecimalPlaces", "lastValidCursorPosition", "cachedDecimalFormat", "Ljava/text/DecimalFormat;", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "tempBuilder", "externalFilters", "", "Lcom/kubi/numeric/financial/widget/FinancialInputEditText$FormattingAwareInputFilter;", "[Lcom/kubi/numeric/financial/widget/FinancialInputEditText$FormattingAwareInputFilter;", "externalTextWatchers", "", "Lcom/kubi/numeric/financial/widget/FinancialInputEditText$FormattingAwareTextWatcher;", "initFinancialInput", "", "setFilters", "filters", "Landroid/text/InputFilter;", "([Landroid/text/InputFilter;)V", "setupInputConfiguration", "setInputType", "type", "updateFilters", "updateLocaleSymbols", "createFinancialInputFilter", "isValidNumberFormatSimple", "text", "isValidNumberFormat", "isValidDecimalPlaces", "financialTextWatcher", "com/kubi/numeric/financial/widget/FinancialInputEditText$financialTextWatcher$1", "Lcom/kubi/numeric/financial/widget/FinancialInputEditText$financialTextWatcher$1;", "processTextChange", "currentText", "beforeText", "beforeCursor", "calculateNewCursorPosition", "beforeFormatted", "afterFormatted", "rawTextChangeLength", "extractRawNumber", "formatNumberOptimized", "showDecimalPoint", "applyFormattedTextOptimized", "formattedText", "cursorPosition", "revertToPreviousState", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "getRawInput", "setBigDecimal", "value", "Ljava/math/BigDecimal;", "setBigDecimalValue", "setMaxDecimalPlaces", "places", "getMaxDecimalPlaces", "updateLocale", "isValidInput", "getBigDecimalValue", "setFinancialStyle", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "addTextChangedListener", "watcher", "Landroid/text/TextWatcher;", "removeTextChangedListener", "onDetachedFromWindow", "Companion", "FormattingAwareInputFilter", "FormattingAwareTextWatcher", "CustomKeyListener", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinancialInputEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialInputEditText.kt\ncom/kubi/numeric/financial/widget/FinancialInputEditText\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,857:1\n52#2,9:858\n11228#3:867\n11563#3,3:868\n37#4:871\n36#4,3:872\n37#4:875\n36#4,3:876\n1104#5,3:879\n1104#5,3:883\n1#6:882\n*S KotlinDebug\n*F\n+ 1 FinancialInputEditText.kt\ncom/kubi/numeric/financial/widget/FinancialInputEditText\n*L\n145#1:858,9\n168#1:867\n168#1:868,3\n168#1:871\n168#1:872,3\n252#1:875\n252#1:876,3\n515#1:879,3\n349#1:883,3\n*E\n"})
public class FinancialInputEditText extends FilterEmojiEditText {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f36396r = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public String f36397d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f36398e;

    /* JADX INFO: renamed from: f */
    public boolean f36399f;

    /* JADX INFO: renamed from: g */
    public boolean f36400g;

    /* JADX INFO: renamed from: h */
    public char f36401h;

    /* JADX INFO: renamed from: i */
    public char f36402i;

    /* JADX INFO: renamed from: j */
    public int f36403j;

    /* JADX INFO: renamed from: k */
    public int f36404k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public DecimalFormat f36405l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final StringBuilder f36406m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final StringBuilder f36407n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public C19428a[] f36408o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public List<C19429b> f36409p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final C19430c f36410q;

    /* JADX INFO: compiled from: FinancialInputEditText.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/numeric/financial/widget/FinancialInputEditText$Companion;", "", "<init>", "()V", "DEFAULT_MAX_DECIMAL_PLACES", "", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: FinancialInputEditText.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/numeric/financial/widget/FinancialInputEditText$CustomKeyListener;", "Landroid/text/method/NumberKeyListener;", "type", "", "<init>", "(I)V", "getType", "()I", "getAcceptedChars", "", "getInputType", "Companion", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CustomKeyListener extends NumberKeyListener {

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final Companion f36411b = new Companion(null);

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final char[] f36412c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ',', 8239, Typography.nbsp, ' '};

        /* JADX INFO: renamed from: d */
        @NotNull
        public static final char[] f36413d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ',', 8239, Typography.nbsp, ' '};

        /* JADX INFO: renamed from: a */
        public final int f36414a;

        /* JADX INFO: compiled from: FinancialInputEditText.kt */
        @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/numeric/financial/widget/FinancialInputEditText$CustomKeyListener$Companion;", "", "<init>", "()V", "NUMBER_CHARS", "", "DECIMAL_CHARS", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        @Override // android.text.method.NumberKeyListener
        @NotNull
        public char[] getAcceptedChars() {
            return this.f36414a == 2 ? f36412c : f36413d;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f36414a;
        }

        public CustomKeyListener(int i11) {
            this.f36414a = i11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.numeric.financial.widget.FinancialInputEditText$a */
    /* JADX INFO: compiled from: FinancialInputEditText.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J>\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/numeric/financial/widget/FinancialInputEditText$FormattingAwareInputFilter;", "Landroid/text/InputFilter;", "delegate", "<init>", "(Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Landroid/text/InputFilter;)V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C19428a implements InputFilter {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final InputFilter f36415a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FinancialInputEditText f36416b;

        @Override // android.text.InputFilter
        @Nullable
        public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
            if (this.f36416b.f36398e) {
                return null;
            }
            return this.f36415a.filter(source, start, end, dest, dstart, dend);
        }

        public C19428a(@NotNull FinancialInputEditText financialInputEditText, InputFilter delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f36416b = financialInputEditText;
            this.f36415a = delegate;
        }
    }

    /* JADX INFO: renamed from: com.kubi.numeric.financial.widget.FinancialInputEditText$b */
    /* JADX INFO: compiled from: FinancialInputEditText.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J*\u0010\u000f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/numeric/financial/widget/FinancialInputEditText$FormattingAwareTextWatcher;", "Landroid/text/TextWatcher;", "delegate", "<init>", "(Lcom/kubi/numeric/financial/widget/FinancialInputEditText;Landroid/text/TextWatcher;)V", "getDelegate", "()Landroid/text/TextWatcher;", "beforeTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "Landroid/text/Editable;", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C19429b implements TextWatcher {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final TextWatcher f36417b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FinancialInputEditText f36418c;

        public C19429b(@NotNull FinancialInputEditText financialInputEditText, TextWatcher delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f36418c = financialInputEditText;
            this.f36417b = delegate;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextWatcher getF36417b() {
            return this.f36417b;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            if (this.f36418c.f36398e) {
                return;
            }
            this.f36417b.afterTextChanged(s11);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence s11, int start, int count, int after) {
            if (this.f36418c.f36398e) {
                return;
            }
            this.f36417b.beforeTextChanged(s11, start, count, after);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence s11, int start, int before, int count) {
            if (this.f36418c.f36398e) {
                return;
            }
            this.f36417b.onTextChanged(s11, start, before, count);
        }
    }

    /* JADX INFO: renamed from: com.kubi.numeric.financial.widget.FinancialInputEditText$c */
    /* JADX INFO: compiled from: FinancialInputEditText.kt */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016J*\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"com/kubi/numeric/financial/widget/FinancialInputEditText$financialTextWatcher$1", "Landroid/text/TextWatcher;", "beforeText", "", "beforeCursor", "", "beforeTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "Landroid/text/Editable;", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19430c implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public String f36419b = "";

        /* JADX INFO: renamed from: c */
        public int f36420c;

        public C19430c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            String string;
            if (!FinancialInputEditText.this.f36399f || FinancialInputEditText.this.f36398e) {
                return;
            }
            if (s11 == null || (string = s11.toString()) == null) {
                string = "";
            }
            if (Intrinsics.areEqual(string, this.f36419b)) {
                return;
            }
            if (string.length() == 0) {
                FinancialInputEditText.this.f36397d = "";
            } else {
                FinancialInputEditText.this.m43231v(string, this.f36419b, this.f36420c);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            String string;
            if (!FinancialInputEditText.this.f36399f || FinancialInputEditText.this.f36398e) {
                return;
            }
            if (s11 == null || (string = s11.toString()) == null) {
                string = "";
            }
            this.f36419b = string;
            int selectionStart = FinancialInputEditText.this.getSelectionStart();
            this.f36420c = selectionStart;
            FinancialInputEditText.this.f36404k = selectionStart;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinancialInputEditText(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o */
    public static final CharSequence m43221o(FinancialInputEditText financialInputEditText, CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        String string;
        int iIndexOf$default;
        if (!financialInputEditText.f36399f || financialInputEditText.f36398e) {
            return null;
        }
        try {
            if (Intrinsics.areEqual(spanned.toString(), "0") && i13 == 1 && i14 == 1 && i12 - i11 == 1) {
                char cCharAt = charSequence.charAt(i11);
                if (cCharAt != '.' && cCharAt != ',') {
                    if (Character.isDigit(cCharAt) && cCharAt != '0') {
                        return String.valueOf(cCharAt);
                    }
                    if (cCharAt == '0') {
                        return null;
                    }
                }
                return String.valueOf(financialInputEditText.f36401h);
            }
            int i15 = i12 - i11;
            if (i15 == 1) {
                char cCharAt2 = charSequence.charAt(i11);
                if (cCharAt2 == ',' || cCharAt2 == '.') {
                    return (financialInputEditText.f36403j > 0 && !StringsKt.contains$default((CharSequence) spanned.toString(), financialInputEditText.f36401h, false, 2, (Object) null)) ? String.valueOf(financialInputEditText.f36401h) : "";
                }
                if (Character.isDigit(cCharAt2) && (iIndexOf$default = StringsKt.indexOf$default((CharSequence) (string = spanned.toString()), financialInputEditText.f36401h, 0, false, 6, (Object) null)) != -1 && i13 > iIndexOf$default) {
                    String strSubstring = string.substring(iIndexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if ((strSubstring.length() >= financialInputEditText.f36403j && i13 == i14) || (strSubstring.length() + i15) - RangesKt.coerceAtLeast((i14 - i13) - 1, 0) > financialInputEditText.f36403j) {
                        return "";
                    }
                }
                return null;
            }
            financialInputEditText.f36407n.setLength(0);
            financialInputEditText.f36407n.append(spanned.subSequence(0, i13));
            financialInputEditText.f36407n.append(charSequence.subSequence(i11, i12));
            financialInputEditText.f36407n.append(spanned.subSequence(i14, spanned.length()));
            String string2 = financialInputEditText.f36407n.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            int i16 = 0;
            for (int i17 = 0; i17 < string2.length(); i17++) {
                if (string2.charAt(i17) == financialInputEditText.f36401h) {
                    i16++;
                }
            }
            if (i16 > 1 || !financialInputEditText.m43230u(string2)) {
                return "";
            }
            if ((i13 == 0 && i14 == spanned.length()) || financialInputEditText.m43228s(string2)) {
                return null;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m43222l(String str, int i11) {
        this.f36398e = true;
        Editable text = getText();
        if (text != null) {
            text.replace(0, text.length(), str);
        } else {
            setText(str);
        }
        Editable text2 = getText();
        setSelection(Math.min(i11, text2 != null ? text2.length() : 0));
        this.f36398e = false;
    }

    /* JADX INFO: renamed from: m */
    public final int m43223m(String str, String str2, int i11, int i12) {
        String strSubstring = str.substring(0, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int i13 = 0;
        for (int i14 = 0; i14 < strSubstring.length(); i14++) {
            if (strSubstring.charAt(i14) != this.f36402i) {
                i13++;
            }
        }
        int i15 = i13 + i12;
        int length = str2.length();
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            char cCharAt = str2.charAt(i18);
            if (i16 >= i15) {
                break;
            }
            if (cCharAt != this.f36402i) {
                i16++;
            }
            i17++;
        }
        return i17;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // android.widget.TextView
    public void setFilters(@Nullable InputFilter[] filters) {
        C19428a[] c19428aArr;
        if (filters != null) {
            ArrayList arrayList = new ArrayList(filters.length);
            for (InputFilter inputFilter : filters) {
                arrayList.add(new C19428a(this, inputFilter));
            }
            c19428aArr = (C19428a[]) arrayList.toArray(new C19428a[0]);
            if (c19428aArr == null) {
                c19428aArr = new C19428a[0];
            }
        } else {
            c19428aArr = new C19428a[0];
        }
        this.f36408o = c19428aArr;
        m43234y();
    }

    /* JADX INFO: renamed from: w */
    public final void m43232w(String str, int i11) {
        this.f36398e = true;
        setText(str);
        setSelection(Math.min(i11, str.length()));
        this.f36398e = false;
    }

    /* JADX INFO: renamed from: z */
    public final void m43235z() {
        NumberFormat numberFormatM92646k = C42180b.m92646k(null, 1, null);
        Intrinsics.checkNotNull(numberFormatM92646k, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) numberFormatM92646k;
        this.f36405l = decimalFormat;
        this.f36401h = decimalFormat.getDecimalFormatSymbols().getDecimalSeparator();
        this.f36402i = decimalFormat.getDecimalFormatSymbols().getGroupingSeparator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinancialInputEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextStyle);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMaxDecimalPlaces$lambda$7(FinancialInputEditText financialInputEditText) {
        if (financialInputEditText.f36397d.length() > 0) {
            String strM43226q = financialInputEditText.m43226q(financialInputEditText.f36397d, false);
            financialInputEditText.m43222l(strM43226q, strM43226q.length());
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(@Nullable TextWatcher watcher) {
        if (watcher == null) {
            return;
        }
        if (Intrinsics.areEqual(watcher, this.f36410q)) {
            super.addTextChangedListener(watcher);
            return;
        }
        if (this.f36409p == null) {
            this.f36409p = new ArrayList();
        }
        C19429b c19429b = new C19429b(this, watcher);
        this.f36409p.add(c19429b);
        super.addTextChangedListener(c19429b);
    }

    @Nullable
    public final BigDecimal getBigDecimalValue() {
        return this.f36399f ? DowngradeExKt.m66536f(StringsKt.replace$default(this.f36397d, this.f36401h, '.', false, 4, (Object) null)) : DowngradeExKt.m66536f(String.valueOf(getText()));
    }

    /* JADX INFO: renamed from: getMaxDecimalPlaces, reason: from getter */
    public final int getF36403j() {
        return this.f36403j;
    }

    @NotNull
    public final String getRawInput() {
        if (this.f36399f) {
            return StringsKt.endsWith$default((CharSequence) this.f36397d, this.f36401h, false, 2, (Object) null) ? StringsKt.dropLast(this.f36397d, 1) : StringsKt.replace$default(this.f36397d, this.f36401h, '.', false, 4, (Object) null);
        }
        return String.valueOf(getText());
    }

    /* JADX INFO: renamed from: n */
    public final InputFilter m43224n() {
        return new InputFilter() { // from class: qs.a
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return FinancialInputEditText.m43221o(this.f96951a, charSequence, i11, i12, spanned, i13, i14);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        String string;
        if (!this.f36399f) {
            return super.onKeyDown(keyCode, event);
        }
        if (keyCode == 67) {
            int selectionStart = getSelectionStart();
            Editable text = getText();
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            if (selectionStart > 0 && selectionStart <= string.length()) {
                int i11 = selectionStart - 1;
                if (string.charAt(i11) == this.f36402i) {
                    setSelection(i11);
                    return true;
                }
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    /* JADX INFO: renamed from: p */
    public final String m43225p(String str) {
        if (!StringsKt.contains$default((CharSequence) str, this.f36402i, false, 2, (Object) null)) {
            return str;
        }
        this.f36406m.setLength(0);
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != this.f36402i) {
                this.f36406m.append(cCharAt);
            }
        }
        String string = this.f36406m.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: q */
    public final String m43226q(String str, boolean z11) {
        String strM92640e;
        String strM92640e2;
        List listSplit$default;
        String str2;
        String strM92640e3;
        if (str.length() == 0) {
            return "";
        }
        try {
            if (z11) {
                String strRemoveSuffix = StringsKt.removeSuffix(str, (CharSequence) String.valueOf(this.f36401h));
                if (strRemoveSuffix.length() <= 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('0');
                    sb2.append(this.f36401h);
                    return sb2.toString();
                }
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(strRemoveSuffix);
                if (bigDecimalM66536f != null && (strM92640e3 = C42180b.m92640e(bigDecimalM66536f, null, this.f36403j, false, false, false, 0, null, 125, null)) != null) {
                    strRemoveSuffix = strM92640e3;
                }
                if (StringsKt.contains$default((CharSequence) strRemoveSuffix, this.f36401h, false, 2, (Object) null)) {
                    return strRemoveSuffix;
                }
                return strRemoveSuffix + this.f36401h;
            }
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, this.f36401h, 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(str);
                return (bigDecimalM66536f2 == null || (strM92640e = C42180b.m92640e(bigDecimalM66536f2, null, this.f36403j, false, false, false, 0, null, 125, null)) == null) ? str : strM92640e;
            }
            String strSubstring = str.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            int length = strSubstring2.length();
            int i11 = this.f36403j;
            if (length > i11) {
                strSubstring2 = strSubstring2.substring(0, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            }
            if (strSubstring.length() == 0 || Intrinsics.areEqual(strSubstring, "0")) {
                strSubstring = "0";
            } else {
                BigDecimal bigDecimalM66536f3 = DowngradeExKt.m66536f(strSubstring);
                if (bigDecimalM66536f3 != null && (strM92640e2 = C42180b.m92640e(bigDecimalM66536f3, null, 0, false, false, false, 0, null, 125, null)) != null && (listSplit$default = StringsKt.split$default((CharSequence) strM92640e2, new char[]{this.f36401h}, false, 0, 6, (Object) null)) != null && (str2 = (String) listSplit$default.get(0)) != null) {
                    strSubstring = str2;
                }
            }
            return strSubstring + this.f36401h + strSubstring2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m43227r(AttributeSet attributeSet) {
        boolean zM96643c = C43869d.f96953a.m96643c();
        this.f36399f = zM96643c;
        if (zM96643c) {
            if (attributeSet != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int[] FinancialInputEditText = R$styleable.FinancialInputEditText;
                Intrinsics.checkNotNullExpressionValue(FinancialInputEditText, "FinancialInputEditText");
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FinancialInputEditText, 0, 0);
                this.f36403j = typedArrayObtainStyledAttributes.getInteger(R$styleable.FinancialInputEditText_maxDecimal, 6);
                this.f36400g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FinancialInputEditText_financialStyle, true);
                typedArrayObtainStyledAttributes.recycle();
            }
            this.f36399f = this.f36399f && this.f36400g;
            m43233x();
            m43235z();
            addTextChangedListener(this.f36410q);
        }
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(@Nullable TextWatcher watcher) {
        Object next;
        if (watcher == null) {
            return;
        }
        if (Intrinsics.areEqual(watcher, this.f36410q)) {
            super.removeTextChangedListener(watcher);
            return;
        }
        Iterator<T> it = this.f36409p.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((C19429b) next).getF36417b(), watcher));
        C19429b c19429b = (C19429b) next;
        if (c19429b != null) {
            this.f36409p.remove(c19429b);
            super.removeTextChangedListener(c19429b);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m43228s(String str) {
        String strReplace$default = StringsKt.replace$default(str, String.valueOf(this.f36402i), "", false, 4, (Object) null);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strReplace$default, this.f36401h, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return true;
        }
        String strSubstring = strReplace$default.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring.length() <= this.f36403j;
    }

    public final void setBigDecimal(@Nullable BigDecimal value) {
        String string;
        String plainString;
        String str = "";
        if (!this.f36399f) {
            if (value != null && (plainString = value.toPlainString()) != null) {
                str = plainString;
            }
            setText(str);
            return;
        }
        if (value != null) {
            setText(C42180b.m92640e(value, null, this.f36403j, false, false, false, 0, null, 109, null));
            return;
        }
        Editable text = getText();
        if (text != null && (string = text.toString()) != null && string.length() > 0) {
            setText("");
        }
        this.f36397d = "";
    }

    public final void setBigDecimalValue(@Nullable String value) {
        String string;
        if (!this.f36399f) {
            setText(value);
            return;
        }
        if (value != null) {
            BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(value);
            setText(bigDecimalOrNull != null ? C42180b.m92640e(bigDecimalOrNull, null, this.f36403j, false, false, false, 0, null, 109, null) : null);
            return;
        }
        Editable text = getText();
        if (text != null && (string = text.toString()) != null && string.length() > 0) {
            setText("");
        }
        this.f36397d = "";
    }

    public final void setFinancialStyle(boolean enable) {
        boolean z11 = this.f36399f;
        this.f36400g = enable;
        boolean z12 = enable && C43869d.f96953a.m96643c();
        this.f36399f = z12;
        if (z11 != z12) {
            if (z12) {
                m43233x();
                m43235z();
                addTextChangedListener(this.f36410q);
            } else {
                super.setFilters(this.f36408o);
                this.f36397d = "";
                removeTextChangedListener(this.f36410q);
            }
        }
    }

    public final void setMaxDecimalPlaces(int places) {
        if (places < 0) {
            return;
        }
        this.f36403j = places;
        if (!this.f36399f || this.f36397d.length() <= 0) {
            return;
        }
        post(new Runnable() { // from class: qs.b
            @Override // java.lang.Runnable
            public final void run() {
                FinancialInputEditText.setMaxDecimalPlaces$lambda$7(this.f96952b);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m43233x() {
        setInputType(8194);
        setKeyListener(new CustomKeyListener(8194));
        m43234y();
    }

    /* JADX INFO: renamed from: y */
    public final void m43234y() {
        if (!this.f36399f) {
            super.setFilters(this.f36408o);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m43224n());
        CollectionsKt.addAll(arrayList, this.f36408o);
        super.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36405l = null;
        this.f36406m.setLength(0);
        this.f36407n.setLength(0);
        this.f36409p.clear();
    }

    @Override // android.widget.TextView
    public void setInputType(int type) {
        super.setInputType(type);
        setKeyListener(new CustomKeyListener(type));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m43229t(String str) {
        if (str.length() == 0) {
            return true;
        }
        String strReplace$default = StringsKt.replace$default(str, String.valueOf(this.f36402i), "", false, 4, (Object) null);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strReplace$default, this.f36401h, 0, false, 6, (Object) null);
        if (iIndexOf$default != -1) {
            String strSubstring = strReplace$default.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() == 0 || Intrinsics.areEqual(strSubstring, "0") || !StringsKt.startsWith$default(strSubstring, "0", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }
        if (Intrinsics.areEqual(strReplace$default, "0") || !StringsKt.startsWith$default(strReplace$default, "0", false, 2, (Object) null) || strReplace$default.length() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m43230u(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (!StringsKt.contains$default((CharSequence) str, this.f36402i, false, 2, (Object) null)) {
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, this.f36401h, 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                if (Intrinsics.areEqual(str, "0") || !StringsKt.startsWith$default(str, "0", false, 2, (Object) null) || str.length() == 1) {
                    return true;
                }
                return false;
            }
            String strSubstring = str.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() == 0 || Intrinsics.areEqual(strSubstring, "0") || !StringsKt.startsWith$default(strSubstring, "0", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }
        return m43229t(str);
    }

    /* JADX INFO: renamed from: v */
    public final void m43231v(String str, String str2, int i11) {
        try {
            String strM43225p = m43225p(str);
            boolean z11 = false;
            if (StringsKt.endsWith$default((CharSequence) str, this.f36401h, false, 2, (Object) null) && !StringsKt.endsWith$default((CharSequence) str2, this.f36401h, false, 2, (Object) null)) {
                z11 = true;
            }
            String str3 = this.f36397d;
            String strM43226q = m43226q(strM43225p, z11);
            this.f36397d = m43225p(strM43226q);
            m43222l(strM43226q, m43223m(str2, strM43226q, i11, strM43225p.length() - str3.length()));
        } catch (Exception unused) {
            m43232w(str2, i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialInputEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36397d = "";
        this.f36399f = true;
        this.f36400g = true;
        this.f36401h = '.';
        this.f36402i = ',';
        this.f36403j = 6;
        this.f36406m = new StringBuilder(32);
        this.f36407n = new StringBuilder(16);
        this.f36408o = new C19428a[0];
        this.f36409p = new ArrayList();
        this.f36410q = new C19430c();
        m43227r(attributeSet);
    }
}
