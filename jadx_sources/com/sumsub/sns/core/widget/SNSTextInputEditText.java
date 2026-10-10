package com.sumsub.sns.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.messaging.Constants;
import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u00010\u0018\u0000 e2\u00020\u0001:\u0007_`abcdeB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016H\u0007¢\u0006\u0002\b5J\u0016\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016J\u0017\u00106\u001a\u0002032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u00108J\u000e\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020\u0007J\u0012\u0010;\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u00010=H\u0002J\u0018\u0010>\u001a\u000203*\u0004\u0018\u00010=2\b\b\u0002\u0010?\u001a\u00020#H\u0002J'\u0010@\u001a\u000203*\u00060\u001dj\u0002`\u001e2\b\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020#H\u0002¢\u0006\u0002\u0010DJ\b\u0010E\u001a\u000203H\u0002J\n\u0010F\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u0007H\u0002J\b\u0010I\u001a\u00020\u0007H\u0002J\u0012\u0010J\u001a\u0002032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010K\u001a\u000203H\u0002J\b\u0010L\u001a\u000203H\u0002J\u001c\u0010M\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010N\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010O\u001a\u00020\u0007H\u0002J\u001a\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0018\u0010T\u001a\u0002032\u0006\u0010U\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u0007H\u0014J\u0012\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020#H\u0016J\n\u0010\\\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010]\u001a\u0002032\b\u0010^\u001a\u0004\u0018\u00010SH\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R6\u0010\u0014\u001a*\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015j\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R6\u0010\u0019\u001a*\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015j\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dj\u0002`\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00060\u001dj\u0002`\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00162\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0010\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0004\n\u0002\u00101¨\u0006f"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maskListener", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;", "getMaskListener", "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;", "setMaskListener", "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;)V", "rawText", "", "getRawText", "()Ljava/lang/String;", "masksCleared", "Ljava/util/HashMap;", "", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;", "Lkotlin/collections/HashMap;", "maskSymbolPositions", "mask", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "raw", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "lastRaw", "buffer", "maxRawLength", "isTextChangingBefore", "", "isTextChangingAfter", "isSelectionChanging", "benchmark", "", "value", "masksInternal", "setMasksInternal", "(Ljava/util/List;)V", "masksEnabled", "getMasksEnabled", "()Z", "textWatcher", "com/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;", "setMasks", "", "masks", "setMasksString", "updateInputType", "defaultInputType", "(Ljava/lang/Integer;)V", "setMaxLength", "maxLength", "applyMask", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "removeHintSpans", "clear", "appendMaskChar", "char", "", "escaped", "(Ljava/lang/StringBuilder;Ljava/lang/Character;Z)V", "cleanRaw", "findNewMask", "prevValidCharPosition", "start", "getStartingPosition", "prepareMask", "prepareMasks", "setDefaultMask", "getMaskSymbolsCount", "getSpecialSymbolsInMaskedTextCount", "getRemovedSymbolsCount", "maskMatches", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;", "text", "", "onSelectionChanged", "selStart", "selEnd", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "isSuggestionsEnabled", "getText", "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "MaskMatchResult", "EditableProxy", "MyInputConnectionWrapper", "CharHolder", "Mask", "MaskListener", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSTextInputEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTextInputEditText.kt\ncom/sumsub/sns/core/widget/SNSTextInputEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,610:1\n1563#2:611\n1634#2,3:612\n1869#2,2:615\n360#2,7:617\n1563#2:633\n1634#2,3:634\n774#2:637\n865#2,2:638\n1740#2,3:640\n1999#2,14:643\n360#2,7:657\n1878#2,2:665\n1880#2:670\n2423#2,14:671\n34#3:624\n13472#4,2:625\n425#5:627\n507#5,5:628\n1188#5,3:667\n1188#5,3:685\n1#6:664\n*S KotlinDebug\n*F\n+ 1 SNSTextInputEditText.kt\ncom/sumsub/sns/core/widget/SNSTextInputEditText\n*L\n233#1:611\n233#1:612,3\n270#1:615,2\n291#1:617,7\n342#1:633\n342#1:634,3\n343#1:637\n343#1:638,2\n344#1:640,3\n351#1:643,14\n375#1:657,7\n389#1:665,2\n389#1:670\n418#1:671,14\n300#1:624\n300#1:625,2\n325#1:627\n325#1:628,5\n398#1:667,3\n468#1:685,3\n*E\n"})
public final class SNSTextInputEditText extends TextInputEditText {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Character[] maskSymbols = {'#', '?', '*'};
    private long benchmark;

    @NotNull
    private StringBuilder buffer;
    private boolean isSelectionChanging;
    private boolean isTextChangingAfter;
    private boolean isTextChangingBefore;

    @NotNull
    private String lastRaw;

    @Nullable
    private Mask mask;

    @Nullable
    private MaskListener maskListener;

    @NotNull
    private HashMap<String, List<CharHolder>> maskSymbolPositions;

    @NotNull
    private HashMap<String, List<CharHolder>> masksCleared;

    @Nullable
    private List<Mask> masksInternal;
    private int maxRawLength;

    @NotNull
    private StringBuilder raw;

    @NotNull
    private final SNSTextInputEditText$textWatcher$1 textWatcher;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;", "", "", "char", "", "pos", "", "escaped", "<init>", "(CIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "C", "getChar", "()C", "I", "getPos", "Z", "getEscaped", "()Z", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class CharHolder {
        private final char char;
        private final boolean escaped;
        private final int pos;

        public CharHolder(char c11, int i11, boolean z11) {
            this.char = c11;
            this.pos = i11;
            this.escaped = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CharHolder)) {
                return false;
            }
            CharHolder charHolder = (CharHolder) other;
            return this.char == charHolder.char && this.pos == charHolder.pos && this.escaped == charHolder.escaped;
        }

        public /* synthetic */ CharHolder(char c11, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(c11, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? false : z11);
        }

        public final char getChar() {
            return this.char;
        }

        public final boolean getEscaped() {
            return this.escaped;
        }

        public final int getPos() {
            return this.pos;
        }

        public int hashCode() {
            return Boolean.hashCode(this.escaped) + AbstractC28250a.m69223a(this.pos, Character.hashCode(this.char) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "CharHolder(char=" + this.char + ", pos=" + this.pos + ", escaped=" + this.escaped + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\f\u0010\u000e\u001a\u00020\u000b*\u00020\bH\u0002J\u001f\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;", "", "<init>", "()V", "LOG_TAG", "", "maskSymbols", "", "", "[Ljava/lang/Character;", "isCharMaskPart", "", "symbol", "maskCharToPlaceholder", "isUpperCaseMaskChar", "modifyCharRegister", "maskChar", "char", "(Ljava/lang/Character;C)C", "symbolMatches", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;", "softMatch", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final boolean isUpperCaseMaskChar(char c11) {
            return c11 == '?' || c11 == '*' || Character.isUpperCase(c11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char maskCharToPlaceholder(char symbol) {
            if (symbol == '#') {
                return '0';
            }
            if (symbol == '*' || symbol == '?') {
                return 'A';
            }
            return symbol;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char modifyCharRegister(Character maskChar, char c11) {
            return (maskChar == null || !isUpperCaseMaskChar(maskChar.charValue())) ? c11 : Character.toUpperCase(c11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isCharMaskPart(char symbol) {
            if (!ArraysKt.contains(SNSTextInputEditText.maskSymbols, Character.valueOf(symbol)) && !Character.isLetterOrDigit(symbol)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean symbolMatches(char c11, CharHolder maskChar, boolean softMatch) {
            boolean zIsLetter;
            if (maskChar.getEscaped()) {
                return CharsKt.equals(c11, maskChar.getChar(), true);
            }
            if (maskChar.getChar() == '#') {
                return Character.isDigit(c11);
            }
            if (maskChar.getChar() == '?') {
                return Character.isLetter(c11);
            }
            if (maskChar.getChar() == '*') {
                if (Character.isDigit(c11) || Character.isLetter(c11)) {
                    return true;
                }
                return false;
            }
            if (softMatch) {
                if (!CharsKt.equals(c11, maskChar.getChar(), true)) {
                    if (Character.isDigit(c11)) {
                        zIsLetter = Character.isDigit(maskChar.getChar());
                    } else if (Character.isLetter(c11)) {
                        zIsLetter = Character.isLetter(maskChar.getChar());
                    } else {
                        zIsLetter = true;
                    }
                    if (!zIsLetter) {
                        return false;
                    }
                }
                return true;
            }
            return CharsKt.equals(c11, maskChar.getChar(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J!\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012H\u0096\u0001J\u0019\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0013H\u0096\u0001J1\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u0096\u0001J!\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\nH\u0096\u0003J1\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u001b0\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0096\u0001J4\u0010\u001d\u001a(\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001f0\u001f \u0010*\u0014\u0012\u000e\b\u0001\u0012\n \u0010*\u0004\u0018\u00010\u001f0\u001f\u0018\u00010\u001e0\u001eH\u0096\u0001¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\n2\u000e\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000e0\u000eH\u0096\u0001J\u0019\u0010\"\u001a\u00020\n2\u000e\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000e0\u000eH\u0096\u0001J\u0019\u0010#\u001a\u00020\n2\u000e\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000e0\u000eH\u0096\u0001J\u0082\u0001\u0010$\u001a(\u0012\f\u0012\n \u0010*\u0004\u0018\u0001H%H% \u0010*\u0014\u0012\u000e\b\u0001\u0012\n \u0010*\u0004\u0018\u0001H%H%\u0018\u00010\u001e0\u001e\"\u0010\b\u0000\u0010%*\n \u0010*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2*\u0010\u0015\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u0001H%H% \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u0001H%H%\u0018\u00010&0&H\u0096\u0001¢\u0006\u0002\u0010'J)\u0010(\u001a\n \u0010*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0014\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012H\u0096\u0001J9\u0010(\u001a\n \u0010*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0014\u001a\n \u0010*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0096\u0001JA\u0010)\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2&\u0010\u0015\u001a\"\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000e0\u000e \u0010*\u000b\u0012\u0002\b\u0003\u0018\u00010&¨\u0006\u00010&¨\u0006\u0001H\u0096\u0001J\u0019\u0010*\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000e0\u000eH\u0096\u0001J1\u0010+\u001a\n \u0010*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012H\u0096\u0001JA\u0010+\u001a\n \u0010*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0015\u001a\n \u0010*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0096\u0001J<\u0010-\u001a\u00020\u00062,\u0010\u0011\u001a(\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001f0\u001f \u0010*\u0014\u0012\u000e\b\u0001\u0012\n \u0010*\u0004\u0018\u00010\u001f0\u001f\u0018\u00010\u001e0\u001eH\u0096\u0001¢\u0006\u0002\u0010.J1\u0010/\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0096\u0001J\u0019\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00066"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$EditableProxy;", "Landroid/text/Editable;", "editable", "<init>", "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;)V", "clear", "", "toString", "", "hashCode", "", "equals", "", "other", "", "append", "kotlin.jvm.PlatformType", "p0", "", "", "p1", "p2", "clearSpans", "delete", "get", "index", "getChars", "", "p3", "getFilters", "", "Landroid/text/InputFilter;", "()[Landroid/text/InputFilter;", "getSpanEnd", "getSpanFlags", "getSpanStart", "getSpans", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "(IILjava/lang/Class;)[Ljava/lang/Object;", "insert", "nextSpanTransition", "removeSpan", "replace", "p4", "setFilters", "([Landroid/text/InputFilter;)V", "setSpan", "subSequence", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, SessionDescription.ATTR_LENGTH, "getLength", "()I", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public final class EditableProxy implements Editable {

        @NotNull
        private final Editable editable;

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(char p11) {
            return this.editable.append(p11);
        }

        @Override // android.text.Editable
        public Editable insert(int p11, CharSequence p12) {
            return this.editable.insert(p11, p12);
        }

        @Override // android.text.Editable
        public Editable replace(int p11, int p12, CharSequence p13) {
            return this.editable.replace(p11, p12, p13);
        }

        public EditableProxy(Editable editable) {
            this.editable = editable;
        }

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(CharSequence p11) {
            return this.editable.append(p11);
        }

        @Override // android.text.Editable
        public void clear() {
            this.editable.clear();
            StringsKt.clear(SNSTextInputEditText.this.raw);
            SNSTextInputEditText.this.setText("");
        }

        @Override // android.text.Editable
        public void clearSpans() {
            this.editable.clearSpans();
        }

        @Override // android.text.Editable
        public Editable delete(int p11, int p12) {
            return this.editable.delete(p11, p12);
        }

        public boolean equals(@Nullable Object other) {
            return this.editable.equals(other);
        }

        public char get(int index) {
            return this.editable.charAt(index);
        }

        @Override // android.text.GetChars
        public void getChars(int p11, int p12, char[] p13, int p14) {
            this.editable.getChars(p11, p12, p13, p14);
        }

        @Override // android.text.Editable
        public InputFilter[] getFilters() {
            return this.editable.getFilters();
        }

        public int getLength() {
            return this.editable.length();
        }

        @Override // android.text.Spanned
        public int getSpanEnd(Object p11) {
            return this.editable.getSpanEnd(p11);
        }

        @Override // android.text.Spanned
        public int getSpanFlags(Object p11) {
            return this.editable.getSpanFlags(p11);
        }

        @Override // android.text.Spanned
        public int getSpanStart(Object p11) {
            return this.editable.getSpanStart(p11);
        }

        @Override // android.text.Spanned
        public <T> T[] getSpans(int p11, int p12, Class<T> p13) {
            return (T[]) this.editable.getSpans(p11, p12, p13);
        }

        public int hashCode() {
            return this.editable.hashCode();
        }

        @Override // android.text.Editable
        public Editable insert(int p11, CharSequence p12, int p13, int p14) {
            return this.editable.insert(p11, p12, p13, p14);
        }

        @Override // android.text.Spanned
        public int nextSpanTransition(int p11, int p12, Class p13) {
            return this.editable.nextSpanTransition(p11, p12, p13);
        }

        @Override // android.text.Spannable
        public void removeSpan(Object p11) {
            this.editable.removeSpan(p11);
        }

        @Override // android.text.Editable
        public Editable replace(int p11, int p12, CharSequence p13, int p14, int p15) {
            return this.editable.replace(p11, p12, p13, p14, p15);
        }

        @Override // android.text.Editable
        public void setFilters(InputFilter[] p11) {
            this.editable.setFilters(p11);
        }

        @Override // android.text.Spannable
        public void setSpan(Object p11, int p12, int p13, int p14) {
            this.editable.setSpan(p11, p12, p13, p14);
        }

        @Override // java.lang.CharSequence
        @NotNull
        public CharSequence subSequence(int startIndex, int endIndex) {
            return this.editable.subSequence(startIndex, endIndex);
        }

        @Override // java.lang.CharSequence
        @NotNull
        public String toString() {
            return this.editable.toString();
        }

        @Override // android.text.Editable, java.lang.Appendable
        public Editable append(CharSequence p11, int p12, int p13) {
            return this.editable.append(p11, p12, p13);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i11) {
            return get(i11);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return getLength();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "", "", "mask", "", "limitInputByLength", "maskValidIfOverflow", "softMatch", "payload", "<init>", "(Ljava/lang/String;ZZZLjava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMask", "Z", "getLimitInputByLength", "()Z", "getMaskValidIfOverflow", "getSoftMatch", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class Mask {
        private final boolean limitInputByLength;

        @NotNull
        private final String mask;
        private final boolean maskValidIfOverflow;

        @Nullable
        private final Object payload;
        private final boolean softMatch;

        public Mask(@NotNull String str, boolean z11, boolean z12, boolean z13, @Nullable Object obj) {
            this.mask = str;
            this.limitInputByLength = z11;
            this.maskValidIfOverflow = z12;
            this.softMatch = z13;
            this.payload = obj;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mask)) {
                return false;
            }
            Mask mask = (Mask) other;
            return Intrinsics.areEqual(this.mask, mask.mask) && this.limitInputByLength == mask.limitInputByLength && this.maskValidIfOverflow == mask.maskValidIfOverflow && this.softMatch == mask.softMatch && Intrinsics.areEqual(this.payload, mask.payload);
        }

        @NotNull
        public final String getMask() {
            return this.mask;
        }

        public final boolean getMaskValidIfOverflow() {
            return this.maskValidIfOverflow;
        }

        @Nullable
        public final Object getPayload() {
            return this.payload;
        }

        public final boolean getSoftMatch() {
            return this.softMatch;
        }

        public int hashCode() {
            int iM69001a = AbstractC27920h.m69001a(this.softMatch, AbstractC27920h.m69001a(this.maskValidIfOverflow, AbstractC27920h.m69001a(this.limitInputByLength, this.mask.hashCode() * 31, 31), 31), 31);
            Object obj = this.payload;
            return iM69001a + (obj == null ? 0 : obj.hashCode());
        }

        @NotNull
        public String toString() {
            return "Mask(mask=" + this.mask + ", limitInputByLength=" + this.limitInputByLength + ", maskValidIfOverflow=" + this.maskValidIfOverflow + ", softMatch=" + this.softMatch + ", payload=" + this.payload + ")";
        }

        public /* synthetic */ Mask(String str, boolean z11, boolean z12, boolean z13, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? true : z13, (i11 & 16) != 0 ? null : obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;", "", "onMaskChanged", "", "newMask", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "preFilterMasks", "", "raw", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public interface MaskListener {
        void onMaskChanged(@Nullable Mask newMask);

        @Nullable
        List<Mask> preFilterMasks(@NotNull CharSequence raw);
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;", "", "", "matches", "", "weight", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "mask", "<init>", "(ZILcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getMatches", "()Z", "I", "getWeight", "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "getMask", "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class MaskMatchResult {

        @Nullable
        private final Mask mask;
        private final boolean matches;
        private final int weight;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MaskMatchResult)) {
                return false;
            }
            MaskMatchResult maskMatchResult = (MaskMatchResult) other;
            return this.matches == maskMatchResult.matches && this.weight == maskMatchResult.weight && Intrinsics.areEqual(this.mask, maskMatchResult.mask);
        }

        @Nullable
        public final Mask getMask() {
            return this.mask;
        }

        public final boolean getMatches() {
            return this.matches;
        }

        public final int getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iM69223a = AbstractC28250a.m69223a(this.weight, Boolean.hashCode(this.matches) * 31, 31);
            Mask mask = this.mask;
            return iM69223a + (mask == null ? 0 : mask.hashCode());
        }

        @NotNull
        public String toString() {
            return "MaskMatchResult(matches=" + this.matches + ", weight=" + this.weight + ", mask=" + this.mask + ")";
        }

        public MaskMatchResult(boolean z11, int i11, @Nullable Mask mask) {
            this.matches = z11;
            this.weight = i11;
            this.mask = mask;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MyInputConnectionWrapper;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "<init>", "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/view/inputmethod/InputConnection;Z)V", "deleteSurroundingText", "beforeLength", "", "afterLength", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public final class MyInputConnectionWrapper extends InputConnectionWrapper {
        public MyInputConnectionWrapper(InputConnection inputConnection, boolean z11) {
            super(inputConnection, z11);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int beforeLength, int afterLength) {
            if (SNSTextInputEditText.this.raw.length() != 0) {
                return super.deleteSurroundingText(beforeLength, afterLength);
            }
            Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSInputEditText", "Delete event return", null, 4, null);
            SNSTextInputEditText.this.setText((CharSequence) null);
            return true;
        }
    }

    @JvmOverloads
    public SNSTextInputEditText(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    private final int getSpecialSymbolsInMaskedTextCount(int maxLength, String mask) {
        List<CharHolder> list;
        if (maxLength <= 0 || (list = this.maskSymbolPositions.get(mask)) == null) {
            return 0;
        }
        int length = this.raw.length();
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size && i13 != maxLength && i11 != length; i13++) {
            if (list.get(i13).getPos() < 0) {
                i12++;
            } else {
                i11++;
            }
        }
        return i12;
    }

    private final MaskMatchResult maskMatches(CharSequence text, Mask mask) {
        if (mask == null) {
            return new MaskMatchResult(false, 0, mask);
        }
        List<CharHolder> list = this.masksCleared.get(mask.getMask());
        if (list == null) {
            return new MaskMatchResult(false, 0, mask);
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i11 >= text.length()) {
                return new MaskMatchResult(true, i12, mask);
            }
            char cCharAt = text.charAt(i11);
            int i15 = i13 + 1;
            if (i13 >= list.size()) {
                return new MaskMatchResult(mask.getMaskValidIfOverflow(), i12, mask);
            }
            if (!INSTANCE.symbolMatches(cCharAt, list.get(i13), mask.getSoftMatch())) {
                return new MaskMatchResult(false, i12, mask);
            }
            if (CharsKt.equals(cCharAt, list.get(i13).getChar(), true)) {
                i14 = 4;
            } else if ((list.get(i13).getChar() == '#' && Character.isDigit(cCharAt)) || (list.get(i13).getChar() == '?' && Character.isLetter(cCharAt))) {
                i14 = 2;
            }
            i12 += i14;
            i11++;
            i13 = i15;
        }
    }

    public static /* synthetic */ void removeHintSpans$default(SNSTextInputEditText sNSTextInputEditText, Editable editable, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        sNSTextInputEditText.removeHintSpans(editable, z11);
    }

    @JvmOverloads
    public SNSTextInputEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void appendMaskChar(StringBuilder sb2, Character ch2, boolean z11) {
        if (ch2 == null) {
            return;
        }
        if (z11) {
            sb2.append(ch2.charValue());
        } else {
            sb2.append(INSTANCE.maskCharToPlaceholder(ch2.charValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanRaw() throws IOException {
        if (this.mask == null) {
            return;
        }
        StringBuilder sb2 = this.raw;
        StringBuilder sb3 = new StringBuilder();
        int length = sb2.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = sb2.charAt(i11);
            if (INSTANCE.isCharMaskPart(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        CharSequence charSequenceTake = StringsKt.take(sb3, this.maxRawLength);
        if (charSequenceTake.length() != this.raw.length()) {
            StringsKt.clear(this.raw);
            this.raw.append(charSequenceTake);
        }
        if (this.raw.length() == 0) {
            setDefaultMask();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Mask findNewMask() {
        List<Mask> listPreFilterMasks;
        ArrayList arrayList;
        ArrayList arrayList2;
        MaskMatchResult maskMatchResult;
        Object next;
        MaskMatchResult maskMatchResultMaskMatches;
        Mask mask = this.mask;
        StringBuilder sb2 = this.raw;
        MaskListener maskListener = this.maskListener;
        if (maskListener == null || (listPreFilterMasks = maskListener.preFilterMasks(sb2)) == null) {
            listPreFilterMasks = this.masksInternal;
        }
        if (listPreFilterMasks != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPreFilterMasks, 10));
            Iterator<T> it = listPreFilterMasks.iterator();
            while (it.hasNext()) {
                arrayList.add(maskMatches(sb2, (Mask) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (((MaskMatchResult) obj).getMatches()) {
                    arrayList2.add(obj);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            if (arrayList2.isEmpty()) {
                maskMatchResultMaskMatches = maskMatches(sb2, mask);
                if (maskMatchResultMaskMatches.getMatches() && maskMatchResultMaskMatches.getWeight() >= ((MaskMatchResult) arrayList2.get(0)).getWeight()) {
                    return mask;
                }
            } else {
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        if (((MaskMatchResult) obj2).getWeight() == ((MaskMatchResult) arrayList2.get(0)).getWeight()) {
                        }
                    } else {
                        maskMatchResultMaskMatches = maskMatches(sb2, mask);
                        if (maskMatchResultMaskMatches.getMatches()) {
                            return mask;
                        }
                    }
                }
            }
        }
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int weight = ((MaskMatchResult) next).getWeight();
                    do {
                        Object next2 = it2.next();
                        int weight2 = ((MaskMatchResult) next2).getWeight();
                        if (weight < weight2) {
                            next = next2;
                            weight = weight2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            maskMatchResult = (MaskMatchResult) next;
        } else {
            maskMatchResult = null;
        }
        if (maskMatchResult != null) {
            return maskMatchResult.getMask();
        }
        return null;
    }

    private final int getMaskSymbolsCount(int maxLength, String mask) {
        List<CharHolder> list = this.maskSymbolPositions.get(mask);
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size && i12 != maxLength; i12++) {
            if (list.get(i12).getPos() >= 0) {
                i11++;
            }
        }
        return maxLength > i11 ? maxLength - getSpecialSymbolsInMaskedTextCount(maxLength, mask) : i11;
    }

    public static /* synthetic */ int getMaskSymbolsCount$default(SNSTextInputEditText sNSTextInputEditText, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            Mask mask = sNSTextInputEditText.mask;
            str = mask != null ? mask.getMask() : null;
        }
        return sNSTextInputEditText.getMaskSymbolsCount(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRemovedSymbolsCount() {
        return this.lastRaw.length() - this.raw.length();
    }

    public static /* synthetic */ int getSpecialSymbolsInMaskedTextCount$default(SNSTextInputEditText sNSTextInputEditText, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            Mask mask = sNSTextInputEditText.mask;
            str = mask != null ? mask.getMask() : null;
        }
        return sNSTextInputEditText.getSpecialSymbolsInMaskedTextCount(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getStartingPosition() {
        HashMap<String, List<CharHolder>> map = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = map.get(mask != null ? mask.getMask() : null);
        if (list != null) {
            Iterator<CharHolder> it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (it.next().getPos() >= 0) {
                    break;
                }
                i11++;
            }
            Integer numValueOf = i11 >= 0 ? Integer.valueOf(i11) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareMask(Mask mask) {
        if (Intrinsics.areEqual(this.mask, mask)) {
            return;
        }
        Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSInputEditText", "prepareMask " + mask, null, 4, null);
        this.mask = mask;
        MaskListener maskListener = this.maskListener;
        if (maskListener != null) {
            maskListener.onMaskChanged(mask);
        }
    }

    private final void prepareMasks() {
        List<Mask> list = this.masksInternal;
        if (list != null) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Mask mask = (Mask) obj;
                ArrayList arrayList = new ArrayList();
                this.maskSymbolPositions.put(mask.getMask(), arrayList);
                ArrayList arrayList2 = new ArrayList();
                this.masksCleared.put(mask.getMask(), arrayList2);
                String mask2 = mask.getMask();
                boolean z11 = false;
                int i13 = 0;
                for (int i14 = 0; i14 < mask2.length(); i14++) {
                    char cCharAt = mask2.charAt(i14);
                    if (cCharAt != '\\' || z11) {
                        if (!INSTANCE.isCharMaskPart(cCharAt) || z11) {
                            arrayList.add(new CharHolder(cCharAt, -1, z11));
                        } else {
                            arrayList2.add(new CharHolder(cCharAt, 0, z11, 2, null));
                            arrayList.add(new CharHolder(cCharAt, i13, z11));
                            i13++;
                        }
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                }
                Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Mask " + mask + " cleared " + arrayList2, null, 4, null);
                i11 = i12;
            }
        }
        setDefaultMask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int prevValidCharPosition(int start) {
        CharHolder charHolder;
        if (start < 0) {
            return 0;
        }
        HashMap<String, List<CharHolder>> map = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = map.get(mask != null ? mask.getMask() : null);
        if (list == null || (charHolder = (CharHolder) CollectionsKt.getOrNull(list, start)) == null) {
            return start - getSpecialSymbolsInMaskedTextCount$default(this, start, null, 2, null);
        }
        return charHolder.getPos() < 0 ? prevValidCharPosition(start - 1) : charHolder.getPos();
    }

    private final void removeHintSpans(Editable editable, boolean z11) {
        if (editable == null) {
            return;
        }
        if (z11) {
            editable.clear();
        }
        for (Object obj : editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
            editable.removeSpan((ForegroundColorSpan) obj);
        }
    }

    private final void setDefaultMask() {
        List<Mask> list = this.masksInternal;
        Mask mask = null;
        Object next = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int length = ((Mask) next).getMask().length();
                    do {
                        Object next2 = it.next();
                        int length2 = ((Mask) next2).getMask().length();
                        if (length > length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it.hasNext());
                }
            }
            mask = (Mask) next;
        }
        prepareMask(mask);
    }

    private final void setMasksInternal(List<Mask> list) {
        this.masksInternal = list;
        if (list != null && (!list.isEmpty())) {
            updateInputType$default(this, null, 1, null);
        }
        prepareMasks();
    }

    public static /* synthetic */ void updateInputType$default(SNSTextInputEditText sNSTextInputEditText, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        sNSTextInputEditText.updateInputType(num);
    }

    @Nullable
    public final MaskListener getMaskListener() {
        return this.maskListener;
    }

    public final boolean getMasksEnabled() {
        List<Mask> list = this.masksInternal;
        return list != null && (list.isEmpty() ^ true);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        Editable text = super.getText();
        return (!getMasksEnabled() || text == null) ? text : new EditableProxy(text);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        if (this.isTextChangingAfter || this.isTextChangingBefore || this.isSelectionChanging || !getMasksEnabled()) {
            return;
        }
        super.onSelectionChanged(selStart, selEnd);
        HashMap<String, List<CharHolder>> map = this.maskSymbolPositions;
        Mask mask = this.mask;
        List<CharHolder> list = map.get(mask != null ? mask.getMask() : null);
        if (list == null) {
            return;
        }
        int specialSymbolsInMaskedTextCount$default = getSpecialSymbolsInMaskedTextCount$default(this, selStart, null, 2, null) + this.raw.length();
        int specialSymbolsInMaskedTextCount$default2 = getSpecialSymbolsInMaskedTextCount$default(this, selEnd, null, 2, null) + this.raw.length();
        int startingPosition = getStartingPosition();
        int iMax = Math.max(startingPosition, Math.min(specialSymbolsInMaskedTextCount$default, selStart));
        int iMax2 = Math.max(startingPosition, Math.min(specialSymbolsInMaskedTextCount$default2, selEnd));
        while (iMax < list.size() && list.get(iMax).getPos() < 0) {
            iMax++;
        }
        while (iMax2 < list.size() && list.get(iMax2).getPos() < 0) {
            iMax2++;
        }
        this.isSelectionChanging = true;
        setSelection(iMax, iMax2);
        Logger.DefaultImpls.i$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "onSelectionChanged, selStart=" + selStart + ", selEnd=" + selEnd + ", start=" + iMax + ", end=" + iMax2, null, 4, null);
        this.isSelectionChanging = false;
    }

    public final void setMaskListener(@Nullable MaskListener maskListener) {
        this.maskListener = maskListener;
    }

    @JvmName(name = "setMasksString")
    public final void setMasksString(@Nullable List<String> masks) {
        ArrayList arrayList;
        if (masks != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(masks, 10));
            Iterator<T> it = masks.iterator();
            while (it.hasNext()) {
                arrayList.add(new Mask((String) it.next(), false, false, false, null, 30, null));
            }
        } else {
            arrayList = null;
        }
        setMasksInternal(arrayList);
    }

    public final void setMaxLength(int maxLength) {
        this.maxRawLength = maxLength;
    }

    public /* synthetic */ SNSTextInputEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R$attr.sns_TextInputEditTextStyle : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMask(Editable s11) {
        int i11;
        int i12;
        if (getMasksEnabled()) {
            if (this.mask == null) {
                if (s11 != null) {
                    removeHintSpans(s11, false);
                    return;
                }
                return;
            }
            StringsKt.clear(this.buffer);
            String mask = null;
            if (s11 != null) {
                removeHintSpans$default(this, s11, false, 1, null);
            }
            HashMap<String, List<CharHolder>> map = this.maskSymbolPositions;
            Mask mask2 = this.mask;
            if (mask2 != null) {
                mask = mask2.getMask();
            }
            List<CharHolder> list = map.get(mask);
            if (list != null) {
                i11 = 0;
                for (CharHolder charHolder : list) {
                    char c11 = charHolder.getChar();
                    if (charHolder.getPos() < 0) {
                        appendMaskChar(this.buffer, Character.valueOf(c11), charHolder.getEscaped());
                    } else if (charHolder.getPos() < this.raw.length()) {
                        this.buffer.append(INSTANCE.modifyCharRegister(Character.valueOf(c11), this.raw.charAt(charHolder.getPos())));
                        i11++;
                    } else {
                        appendMaskChar(this.buffer, Character.valueOf(c11), charHolder.getEscaped());
                    }
                }
            } else {
                i11 = 0;
            }
            int length = this.raw.length();
            for (int i13 = i11; i13 < length; i13++) {
                this.buffer.append(this.raw.charAt(i13));
            }
            if (s11 != null) {
                s11.append((CharSequence) this.buffer);
            }
            if (list != null) {
                Iterator<CharHolder> it = list.iterator();
                i12 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getPos() == i11) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        i12 = -1;
                        break;
                    }
                }
            } else {
                i12 = -1;
                break;
            }
            if (i12 >= 0 && s11 != null) {
                s11.setSpan(new ForegroundColorSpan(getCurrentHintTextColor()), i12, s11.length(), 0);
            }
        }
    }

    @NotNull
    public final String getRawText() {
        if (getMasksEnabled() && this.mask != null) {
            return this.raw.toString();
        }
        return String.valueOf(getText());
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        if (getMasksEnabled()) {
            return false;
        }
        return super.isSuggestionsEnabled();
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        if (!getMasksEnabled()) {
            return super.onCreateInputConnection(outAttrs);
        }
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new MyInputConnectionWrapper(inputConnectionOnCreateInputConnection, true);
    }

    @Override // android.widget.TextView
    public void setError(@Nullable CharSequence error) {
        super.setError(error);
    }

    public final void setMasks(@Nullable List<Mask> masks) {
        setMasksInternal(masks);
    }

    public final void updateInputType(@Nullable Integer defaultInputType) {
        Typeface typeface = getTypeface();
        int iIntValue = 524432;
        if (defaultInputType != null) {
            iIntValue = 524432 | defaultInputType.intValue();
        }
        setInputType(iIntValue);
        setFilters(new InputFilter[0]);
        setTypeface(typeface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.text.TextWatcher, com.sumsub.sns.core.widget.SNSTextInputEditText$textWatcher$1] */
    @JvmOverloads
    public SNSTextInputEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.masksCleared = new HashMap<>();
        this.maskSymbolPositions = new HashMap<>();
        this.raw = new StringBuilder();
        this.lastRaw = "";
        this.buffer = new StringBuilder();
        this.maxRawLength = Integer.MAX_VALUE;
        ?? r11 = new TextWatcher() { // from class: com.sumsub.sns.core.widget.SNSTextInputEditText$textWatcher$1
            /* JADX WARN: Code duplicated, block: B:72:0x016d  */
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) throws IOException {
                int i12;
                int specialSymbolsInMaskedTextCount$default;
                if (this.this$0.getMasksEnabled() && this.this$0.isTextChangingBefore && !this.this$0.isTextChangingAfter) {
                    int selectionStart = this.this$0.getSelectionStart();
                    Logger.DefaultImpls.v$default(C33272c.f67812a, "SNSInputEditText", "afterTextChanged, original s=" + ((Object) s11) + ", selection=" + selectionStart, null, 4, null);
                    this.this$0.isTextChangingAfter = true;
                    this.this$0.isTextChangingBefore = false;
                    this.this$0.cleanRaw();
                    SNSTextInputEditText.Mask mask = this.this$0.mask;
                    SNSTextInputEditText.Mask maskFindNewMask = this.this$0.findNewMask();
                    if (maskFindNewMask != null) {
                        this.this$0.prepareMask(maskFindNewMask);
                    } else {
                        SNSTextInputEditText sNSTextInputEditText = this.this$0;
                        selectionStart -= SNSTextInputEditText.getSpecialSymbolsInMaskedTextCount$default(sNSTextInputEditText, sNSTextInputEditText.getRemovedSymbolsCount() + selectionStart, null, 2, null);
                        this.this$0.prepareMask(null);
                    }
                    int removedSymbolsCount = this.this$0.getRemovedSymbolsCount();
                    HashMap map = this.this$0.maskSymbolPositions;
                    SNSTextInputEditText.Mask mask2 = this.this$0.mask;
                    List list = (List) map.get(mask2 != null ? mask2.getMask() : null);
                    if (!Intrinsics.areEqual(mask, this.this$0.mask) && this.this$0.mask == null) {
                        if (s11 != null) {
                            SNSTextInputEditText.removeHintSpans$default(this.this$0, s11, false, 1, null);
                        }
                        if (s11 != null) {
                            s11.append((CharSequence) this.this$0.raw);
                        }
                    } else if (Intrinsics.areEqual(mask, this.this$0.mask)) {
                        if (removedSymbolsCount > 0 && list != null) {
                            int startingPosition = this.this$0.getStartingPosition();
                            int i13 = SNSTextInputEditText.getSpecialSymbolsInMaskedTextCount$default(this.this$0, selectionStart, null, 2, null) + this.this$0.raw.length() >= selectionStart ? 0 : 1;
                            while (selectionStart > startingPosition && selectionStart + 1 < list.size() && ((SNSTextInputEditText.CharHolder) list.get(selectionStart + i13)).getPos() < 0) {
                                selectionStart--;
                            }
                        }
                        this.this$0.applyMask(s11);
                    } else {
                        this.this$0.applyMask(s11);
                        List list2 = (List) this.this$0.maskSymbolPositions.get(mask != null ? mask.getMask() : null);
                        if (list2 != null) {
                            int i14 = (removedSymbolsCount > 0 ? removedSymbolsCount : 0) + selectionStart;
                            int size = list2.size();
                            i12 = selectionStart;
                            for (int i15 = 0; i15 < size && i15 != i14; i15++) {
                                if (((SNSTextInputEditText.CharHolder) list2.get(i15)).getPos() < 0) {
                                    i12--;
                                }
                            }
                        } else {
                            i12 = selectionStart;
                        }
                        if (list != null) {
                            SNSTextInputEditText sNSTextInputEditText2 = this.this$0;
                            Iterator it = list.iterator();
                            int i16 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i16 = -1;
                                    break;
                                } else if (((SNSTextInputEditText.CharHolder) it.next()).getPos() == i12) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            if (removedSymbolsCount > 0 || mask == null) {
                                int iMax = Math.max(0, i16) - removedSymbolsCount;
                                if (i16 == 0) {
                                    selectionStart = i16;
                                } else {
                                    if (iMax < 0 || iMax >= list.size()) {
                                        specialSymbolsInMaskedTextCount$default = SNSTextInputEditText.getSpecialSymbolsInMaskedTextCount$default(sNSTextInputEditText2, selectionStart, null, 2, null) + selectionStart;
                                    } else {
                                        if (((SNSTextInputEditText.CharHolder) list.get(iMax)).getPos() < 0) {
                                            while (true) {
                                                if (-1 < iMax) {
                                                    if (((SNSTextInputEditText.CharHolder) list.get(iMax)).getPos() > 0) {
                                                        specialSymbolsInMaskedTextCount$default = iMax + 1;
                                                    } else {
                                                        iMax--;
                                                    }
                                                }
                                            }
                                        } else if (i16 < 0) {
                                            selectionStart = list.size();
                                        }
                                        selectionStart = i16;
                                    }
                                    selectionStart = specialSymbolsInMaskedTextCount$default;
                                }
                            } else {
                                selectionStart = i16;
                            }
                        } else {
                            selectionStart = i12;
                        }
                    }
                    C33272c c33272c = C33272c.f67812a;
                    Logger.DefaultImpls.v$default(c33272c, "SNSInputEditText", "afterTextChanged, new s=" + ((Object) s11), null, 4, null);
                    this.this$0.isTextChangingAfter = false;
                    if (selectionStart > this.this$0.length()) {
                        selectionStart = this.this$0.length();
                    }
                    if (selectionStart < 0) {
                        selectionStart = this.this$0.length();
                    }
                    this.this$0.setSelection(selectionStart);
                    Logger.DefaultImpls.i$default(c33272c, "SNSInputEditText", "Text changed in " + (System.currentTimeMillis() - this.this$0.benchmark) + "ms", null, 4, null);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
                if (!this.this$0.getMasksEnabled() || this.this$0.isTextChangingAfter) {
                    return;
                }
                this.this$0.benchmark = System.currentTimeMillis();
                Logger.DefaultImpls.v$default(C33272c.f67812a, "SNSInputEditText", "beforeTextChanged, start=" + start + ", count=" + count + ", after=" + after + ", s=" + ((Object) s11), null, 4, null);
                this.this$0.isTextChangingBefore = true;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s11, int start, int before, int count) {
                CharSequence charSequenceSubSequence;
                if (this.this$0.getMasksEnabled() && this.this$0.isTextChangingBefore && !this.this$0.isTextChangingAfter) {
                    C33272c c33272c = C33272c.f67812a;
                    Logger.DefaultImpls.v$default(c33272c, "SNSInputEditText", "onTextChanged, start=" + start + ", before=" + before + ", count=" + count + ", s=" + ((Object) s11), null, 4, null);
                    if (this.this$0.mask != null) {
                        SNSTextInputEditText sNSTextInputEditText = this.this$0;
                        sNSTextInputEditText.lastRaw = sNSTextInputEditText.raw.toString();
                        if (count <= 0) {
                            if (start >= this.this$0.getStartingPosition()) {
                                int iPrevValidCharPosition = this.this$0.prevValidCharPosition(start);
                                this.this$0.raw.delete(iPrevValidCharPosition, Math.min(before + iPrevValidCharPosition, this.this$0.raw.length()));
                            }
                            Unit unit = Unit.INSTANCE;
                        } else {
                            if (s11 == null || (charSequenceSubSequence = s11.subSequence(start, start + count)) == null) {
                                return;
                            }
                            int maskSymbolsCount$default = SNSTextInputEditText.getMaskSymbolsCount$default(this.this$0, start, null, 2, null);
                            Logger.DefaultImpls.v$default(c33272c, "SNSInputEditText", "onTextChanged, start=" + start + ", rawStart=" + maskSymbolsCount$default + ", addedText=" + ((Object) charSequenceSubSequence), null, 4, null);
                            if (maskSymbolsCount$default > this.this$0.raw.length()) {
                                this.this$0.raw.append(charSequenceSubSequence);
                            } else {
                                int i12 = count + maskSymbolsCount$default;
                                if (this.this$0.raw.length() >= i12) {
                                    this.this$0.raw.insert(maskSymbolsCount$default, charSequenceSubSequence);
                                } else {
                                    this.this$0.raw.replace(maskSymbolsCount$default, i12, charSequenceSubSequence.toString());
                                }
                            }
                        }
                    } else {
                        StringsKt.clear(this.this$0.raw);
                        this.this$0.raw.append(s11);
                    }
                    Logger.DefaultImpls.v$default(c33272c, "SNSInputEditText", "onTextChanged, RawText = " + ((Object) this.this$0.raw), null, 4, null);
                }
            }
        };
        this.textWatcher = r11;
        addTextChangedListener(r11);
    }
}
