package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33627eb;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: XCJustifyTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0001?B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0014J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0014J\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00112\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J.\u0010*\u001a\u00020\"2\u0014\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u00192\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019H\u0002J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u00101\u001a\u00020\u0012H\u0002J\u0018\u00102\u001a\u00020\"2\u0006\u0010&\u001a\u00020'2\u0006\u00103\u001a\u000204H\u0002J,\u00105\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'2\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u00103\u001a\u0004\u0018\u000104H\u0002J\b\u00107\u001a\u00020\u0007H\u0002J,\u00108\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0012J\u000e\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R2\u0010\u0018\u001a&\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00120\u0012 \u001a*\u0012\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00110\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006@"}, m90084d2 = {"Lcom/kubi/resources/widget/XCJustifyTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mLineY", "", "mViewWidth", "paragraphSpacing", "lineSpacing", "mParagraphLineList", "Ljava/util/ArrayList;", "", "", "mLineCount", "mParagraphWordList", "vowel", "", "[Ljava/lang/String;", "vowels", "", "kotlin.jvm.PlatformType", "mMeasuredWidth", "mPaddingStart", "mPaddingEnd", "mPaddingTop", "mPaddingBottom", "textGravity", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getLineList", "frontList", "addLines", "lineLists", "lineList", "paragraphList", "getParagraphList", "()Lkotlin/Unit;", "getWordList", "text", "adjust", "paint", "Landroid/text/TextPaint;", "drawScaledEndText", "lineWords", "getTextGravity", "drawScaledText", "line", "isCN", "", "str", "checkIsSymbol", CmcdData.Factory.STREAMING_FORMAT_SS, "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nXCJustifyTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XCJustifyTextView.kt\ncom/kubi/resources/widget/XCJustifyTextView\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,537:1\n106#2:538\n78#2,22:539\n37#3:561\n36#3,3:562\n*S KotlinDebug\n*F\n+ 1 XCJustifyTextView.kt\ncom/kubi/resources/widget/XCJustifyTextView\n*L\n286#1:538\n286#1:539,22\n288#1:561\n288#1:562,3\n*E\n"})
public final class XCJustifyTextView extends BaseTextView {

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Companion f44211q = new Companion(null);

    /* JADX INFO: renamed from: r */
    public static final String f44212r = XCJustifyTextView.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public float f44213b;

    /* JADX INFO: renamed from: c */
    public int f44214c;

    /* JADX INFO: renamed from: d */
    public final int f44215d;

    /* JADX INFO: renamed from: e */
    public final int f44216e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public ArrayList<List<List<String>>> f44217f;

    /* JADX INFO: renamed from: g */
    public int f44218g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public ArrayList<List<String>> f44219h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String[] f44220i;

    /* JADX INFO: renamed from: j */
    public final List<String> f44221j;

    /* JADX INFO: renamed from: k */
    public int f44222k;

    /* JADX INFO: renamed from: l */
    public int f44223l;

    /* JADX INFO: renamed from: m */
    public int f44224m;

    /* JADX INFO: renamed from: n */
    public int f44225n;

    /* JADX INFO: renamed from: o */
    public int f44226o;

    /* JADX INFO: renamed from: p */
    public int f44227p;

    /* JADX INFO: compiled from: XCJustifyTextView.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/XCJustifyTextView$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "GRAVITY_START", "", "GRAVITY_END", "GRAVITY_CENTER", "BLANK", "dipToPx", "var0", "Landroid/content/Context;", "var1", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int dipToPx(@NotNull Context var0, float var1) {
            Intrinsics.checkNotNullParameter(var0, "var0");
            return (int) ((var1 * var0.getResources().getDisplayMetrics().density) + 0.5f);
        }
    }

    @JvmOverloads
    public XCJustifyTextView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m54931c(Canvas canvas, TextPaint textPaint) {
        try {
            ArrayList<List<String>> arrayList = this.f44219h;
            Intrinsics.checkNotNull(arrayList);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ArrayList<List<List<String>>> arrayList2 = this.f44217f;
                Intrinsics.checkNotNull(arrayList2);
                List<List<String>> list = arrayList2.get(i11);
                Intrinsics.checkNotNullExpressionValue(list, "get(...)");
                List<List<String>> list2 = list;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    List<String> list3 = list2.get(i12);
                    if (i12 == list2.size() - 1) {
                        m54933e(canvas, list3, textPaint);
                    } else {
                        m54934f(canvas, list3, textPaint);
                    }
                    this.f44213b += getLineHeight() + this.f44216e;
                }
                this.f44213b += this.f44215d;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0145 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:3:0x0001, B:5:0x0021, B:7:0x002d, B:9:0x0039, B:13:0x0044, B:15:0x004a, B:23:0x0072, B:25:0x0088, B:27:0x009f, B:54:0x018f, B:28:0x00a4, B:30:0x00cd, B:33:0x00d5, B:35:0x00eb, B:37:0x00ef, B:40:0x010f, B:42:0x0113, B:43:0x013d, B:44:0x0141, B:45:0x0145, B:48:0x015a, B:50:0x015e, B:51:0x0186, B:52:0x018a, B:55:0x019b, B:57:0x01a1, B:59:0x01a9, B:60:0x01ac, B:16:0x004e, B:18:0x0056, B:20:0x0062, B:21:0x0066, B:22:0x006f, B:61:0x01b0, B:63:0x01b6, B:64:0x01bc), top: B:69:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0186 A[Catch: all -> 0x003f, EDGE_INSN: B:51:0x0186->B:54:0x018f BREAK  A[LOOP:1: B:32:0x00d3->B:52:0x018a], TryCatch #0 {all -> 0x003f, blocks: (B:3:0x0001, B:5:0x0021, B:7:0x002d, B:9:0x0039, B:13:0x0044, B:15:0x004a, B:23:0x0072, B:25:0x0088, B:27:0x009f, B:54:0x018f, B:28:0x00a4, B:30:0x00cd, B:33:0x00d5, B:35:0x00eb, B:37:0x00ef, B:40:0x010f, B:42:0x0113, B:43:0x013d, B:44:0x0141, B:45:0x0145, B:48:0x015a, B:50:0x015e, B:51:0x0186, B:52:0x018a, B:55:0x019b, B:57:0x01a1, B:59:0x01a9, B:60:0x01ac, B:16:0x004e, B:18:0x0056, B:20:0x0062, B:21:0x0066, B:22:0x006f, B:61:0x01b0, B:63:0x01b6, B:64:0x01bc), top: B:69:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x018a A[Catch: all -> 0x003f, LOOP:1: B:32:0x00d3->B:52:0x018a, LOOP_END, TryCatch #0 {all -> 0x003f, blocks: (B:3:0x0001, B:5:0x0021, B:7:0x002d, B:9:0x0039, B:13:0x0044, B:15:0x004a, B:23:0x0072, B:25:0x0088, B:27:0x009f, B:54:0x018f, B:28:0x00a4, B:30:0x00cd, B:33:0x00d5, B:35:0x00eb, B:37:0x00ef, B:40:0x010f, B:42:0x0113, B:43:0x013d, B:44:0x0141, B:45:0x0145, B:48:0x015a, B:50:0x015e, B:51:0x0186, B:52:0x018a, B:55:0x019b, B:57:0x01a1, B:59:0x01a9, B:60:0x01ac, B:16:0x004e, B:18:0x0056, B:20:0x0062, B:21:0x0066, B:22:0x006f, B:61:0x01b0, B:63:0x01b6, B:64:0x01bc), top: B:69:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0158 A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public final synchronized List<List<String>> m54935g(List<String> list) {
        ArrayList arrayList;
        int i11;
        try {
            Log.i(f44212r, "getLineList ");
            StringBuilder sb2 = new StringBuilder();
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str = "";
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                String str2 = list.get(i12);
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    arrayList2.add(str);
                    if (!m54937i(str)) {
                        sb2.append(C33627eb.f69716f);
                    }
                    str = "";
                }
                if (m54937i(str2) || (i11 = i12 + 1) >= list.size() || m54937i(list.get(i11))) {
                    sb2.append(str2);
                } else {
                    sb2.append(str2);
                    sb2.append(C33627eb.f69716f);
                }
                arrayList2.add(str2);
                if (Layout.getDesiredWidth(sb2.toString(), getPaint()) > this.f44214c) {
                    int size2 = arrayList2.size() - 1;
                    String strSubstring = arrayList2.get(size2);
                    arrayList2.remove(size2);
                    if (!m54937i(strSubstring)) {
                        String strSubstring2 = sb2.substring(0, (sb2.length() - strSubstring.length()) - 1);
                        sb2.delete(0, sb2.toString().length());
                        sb2.append(strSubstring2);
                        sb2.append(C33627eb.f69716f);
                        int length = strSubstring.length();
                        if (length > 3) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= length) {
                                    strSubstring = "";
                                    break;
                                }
                                String strValueOf = String.valueOf(strSubstring.charAt(i13));
                                sb2.append(strValueOf);
                                if (this.f44221j.contains(strValueOf)) {
                                    int i14 = i13 + 1;
                                    if (i14 >= length) {
                                        m54930b(arrayList, arrayList2);
                                        break;
                                    }
                                    sb2.append(String.valueOf(strSubstring.charAt(i14)));
                                    if (Layout.getDesiredWidth(sb2.toString(), getPaint()) > this.f44214c) {
                                        if (i13 > 2 && i13 <= length - 2) {
                                            StringBuilder sb3 = new StringBuilder();
                                            int i15 = i13 + 2;
                                            String strSubstring3 = strSubstring.substring(0, i15);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                            sb3.append(strSubstring3);
                                            sb3.append('-');
                                            arrayList2.add(sb3.toString());
                                            m54930b(arrayList, arrayList2);
                                            strSubstring = strSubstring.substring(i15, length);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                            break;
                                        }
                                        m54930b(arrayList, arrayList2);
                                        break;
                                    }
                                    if (Layout.getDesiredWidth(sb2.toString(), getPaint()) > this.f44214c) {
                                        if (i13 > 2) {
                                            m54930b(arrayList, arrayList2);
                                            break;
                                        }
                                        m54930b(arrayList, arrayList2);
                                        break;
                                    }
                                    i13++;
                                } else {
                                    if (Layout.getDesiredWidth(sb2.toString(), getPaint()) > this.f44214c) {
                                        if (i13 > 2 && i13 <= length - 2) {
                                            StringBuilder sb4 = new StringBuilder();
                                            String strSubstring4 = strSubstring.substring(0, i13);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                                            sb4.append(strSubstring4);
                                            sb4.append('-');
                                            arrayList2.add(sb4.toString());
                                            m54930b(arrayList, arrayList2);
                                            strSubstring = strSubstring.substring(i13, length);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                            break;
                                        }
                                        m54930b(arrayList, arrayList2);
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        } else {
                            m54930b(arrayList, arrayList2);
                        }
                    } else {
                        m54930b(arrayList, arrayList2);
                    }
                    sb2.delete(0, sb2.toString().length());
                    str = strSubstring;
                }
                if (arrayList2.size() > 0 && i12 == list.size() - 1) {
                    m54930b(arrayList, arrayList2);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(str);
                m54930b(arrayList, arrayList2);
            }
            this.f44218g += arrayList.size();
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized List<String> m54936h(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        Log.i(f44212r, "getWordList ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            String strValueOf = String.valueOf(str.charAt(i11));
            if (Intrinsics.areEqual(strValueOf, C33627eb.f69716f)) {
                if (!TextUtils.isEmpty(sb2.toString())) {
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    arrayList.add(new Regex(C33627eb.f69716f).replace(string, ""));
                    sb2.delete(0, sb2.length());
                }
            } else if (m54932d(strValueOf)) {
                boolean z11 = sb2.length() == 0;
                sb2.append(strValueOf);
                if (!z11) {
                    String string2 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    arrayList.add(string2);
                    sb2.delete(0, sb2.length());
                }
            } else {
                String string3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                if (m54937i(string3)) {
                    String string4 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                    arrayList.add(string4);
                    sb2.delete(0, sb2.length());
                }
                sb2.append(strValueOf);
            }
        }
        if (sb2.length() != 0) {
            String string5 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
            arrayList.add(string5);
            sb2.delete(0, sb2.length());
        }
        return arrayList;
    }

    @JvmOverloads
    public XCJustifyTextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m54930b(List<List<String>> list, List<String> list2) {
        if (list == null || list2 == null) {
            return;
        }
        list.add(new ArrayList(list2));
        list2.clear();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54932d(@NotNull String s11) {
        Intrinsics.checkNotNullParameter(s11, "s");
        return s11.length() != new Regex("\\p{P}").replace(s11, "").length();
    }

    /* JADX INFO: renamed from: e */
    public final void m54933e(Canvas canvas, List<String> list, TextPaint textPaint) {
        if (canvas == null || list == null || textPaint == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            if (m54937i(str)) {
                sb2.append(str);
            } else {
                sb2.append(str);
                sb2.append(C33627eb.f69716f);
            }
        }
        int i11 = this.f44227p;
        if (1001 == i11) {
            canvas.drawText(sb2.toString(), this.f44223l, this.f44213b, textPaint);
        } else if (1002 == i11) {
            canvas.drawText(sb2.toString(), (this.f44222k - Layout.getDesiredWidth(sb2.toString(), getPaint())) - this.f44223l, this.f44213b, textPaint);
        } else {
            canvas.drawText(sb2.toString(), (this.f44214c - Layout.getDesiredWidth(sb2.toString(), getPaint())) / 2, this.f44213b, textPaint);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m54934f(Canvas canvas, List<String> list, TextPaint textPaint) {
        if (canvas == null || list == null || textPaint == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        float desiredWidth = Layout.getDesiredWidth(sb2, getPaint());
        int i11 = this.f44227p;
        int i12 = (1001 != i11 && 1002 == i11) ? this.f44224m : this.f44223l;
        float desiredWidth2 = i12;
        float size = (this.f44214c - desiredWidth) / (list.size() - 1);
        for (String str : list) {
            canvas.drawText(str, desiredWidth2, this.f44213b, getPaint());
            desiredWidth2 += Layout.getDesiredWidth(str + "", textPaint) + size;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m54937i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes.length != str.length();
        } catch (UnsupportedEncodingException e11) {
            C44128b.m97264h(e11);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        this.f44213b = 0.0f;
        this.f44213b += getTextSize() + this.f44225n;
        if (getLayout() == null) {
            return;
        }
        this.f44227p = getTextGravity();
        Intrinsics.checkNotNull(paint);
        m54931c(canvas, paint);
    }

    public /* synthetic */ XCJustifyTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Unit getParagraphList() {
        int i11;
        boolean z11;
        String strReplace = new Regex("\\r").replace(new Regex("   ").replace(new Regex("  ").replace(getText().toString(), ""), ""), "");
        int length = strReplace.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (Intrinsics.compare((int) strReplace.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i12++;
                }
            } else {
                if (!z11) {
                    break;
                }
                length--;
            }
        }
        String string = strReplace.subSequence(i12, length + 1).toString();
        this.f44218g = 0;
        String[] strArr = (String[]) StringsKt.split$default((CharSequence) string, new String[]{"\\n"}, false, 0, 6, (Object) null).toArray(new String[0]);
        this.f44217f = new ArrayList<>();
        this.f44219h = new ArrayList<>();
        for (String str : strArr) {
            if (str.length() != 0) {
                ArrayList<List<String>> arrayList = this.f44219h;
                Intrinsics.checkNotNull(arrayList);
                arrayList.add(m54936h(str));
            }
        }
        return Unit.INSTANCE;
    }

    private final int getTextGravity() {
        int absoluteGravity = Gravity.getAbsoluteGravity(getGravity(), getLayoutDirection()) & 7;
        int textAlignment = getTextAlignment();
        if (2 != textAlignment && 5 != textAlignment && 3 != absoluteGravity) {
            if (3 != textAlignment && 6 != textAlignment && 5 != absoluteGravity) {
                return 1003;
            }
            return 1002;
        }
        return 1001;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.f44217f = null;
        this.f44219h = null;
        this.f44213b = 0.0f;
        this.f44222k = getMeasuredWidth();
        this.f44223l = getPaddingStart();
        this.f44224m = getPaddingEnd();
        this.f44225n = getPaddingTop();
        this.f44226o = getPaddingBottom();
        this.f44214c = (this.f44222k - this.f44223l) - this.f44224m;
        getParagraphList();
        ArrayList<List<String>> arrayList = this.f44219h;
        Intrinsics.checkNotNull(arrayList);
        Iterator<List<String>> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            List<String> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ArrayList<List<List<String>>> arrayList2 = this.f44217f;
            Intrinsics.checkNotNull(arrayList2);
            arrayList2.add(m54935g(next));
        }
        int i11 = this.f44222k;
        ArrayList<List<List<String>>> arrayList3 = this.f44217f;
        Intrinsics.checkNotNull(arrayList3);
        setMeasuredDimension(i11, ((arrayList3.size() - 1) * this.f44215d) + (this.f44218g * (getLineHeight() + this.f44216e)) + this.f44225n + this.f44226o);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XCJustifyTextView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNull(context);
        Companion companion = f44211q;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44215d = companion.dipToPx(context2, 15.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f44216e = companion.dipToPx(context3, 2.0f);
        String[] strArr = {CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "e", "i", "o", "u"};
        this.f44220i = strArr;
        this.f44221j = Arrays.asList(Arrays.copyOf(strArr, strArr.length));
    }
}
