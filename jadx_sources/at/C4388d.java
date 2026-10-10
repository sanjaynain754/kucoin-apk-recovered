package at;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.operation.lib.R$color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.RegexOption;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: at.d */
/* JADX INFO: compiled from: RealtimeUtils.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002\u001a\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0017\u001a\u00020\u000f*\u00020\u000fH\u0002\u001a\u0014\u0010\u0018\u001a\u00020\n*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u001a\u001a\u0010\u001b\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e\u001a\n\u0010\u001f\u001a\u00020\u0012*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"TAG", "", "REALTIME_TEXT_COLOR_TAG", "REALTIME_TEXT_COLOR_TAG_END", "REALTIME_TEXT_COLOR_LIGHT", "REALTIME_TEXT_COLOR_DARK", "REALTIME_TEXT_COUNT_DOWN_TAG1", "REALTIME_TEXT_COUNT_DOWN_TAG2", "REALTIME_TEXT_COUNT_DOWN_TAG3", "parseRealtimeTextColorTag", "", "Landroid/widget/TextView;", "defaultColorRes", "", "parseAllRealtimeColorTags", "Landroid/text/SpannableStringBuilder;", "", "isDayMode", "", "defaultColor", "extractAttr", "attrs", "name", "stripHtmlTags", "changeBackgroundColor", "Landroid/view/View;", "colorStr", "parseCountDownText", "template", "countDownSecond", "", "isCountDownFormat", "OperationLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealtimeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealtimeUtils.kt\ncom/kubi/operation/lib/realtimev2/RealtimeUtilsKt\n+ 2 RealtimeHelperV2.kt\ncom/kubi/operation/lib/realtimev2/RealtimeHelperV2\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n53#2,4:199\n53#2,4:204\n53#2,4:209\n470#3:203\n470#3:208\n1617#4,9:213\n1869#4:222\n1870#4:224\n1626#4:225\n2423#4,14:226\n1#5:223\n*S KotlinDebug\n*F\n+ 1 RealtimeUtils.kt\ncom/kubi/operation/lib/realtimev2/RealtimeUtilsKt\n*L\n50#1:199,4\n102#1:204,4\n150#1:209,4\n100#1:203\n148#1:208\n171#1:213,9\n171#1:222\n171#1:224\n171#1:225\n174#1:226,14\n171#1:223\n*E\n"})
public final class C4388d {
    /* JADX INFO: renamed from: a */
    public static final void m3992a(@NotNull View view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (str == null) {
            return;
        }
        try {
            Drawable drawableMutate = view.getBackground().mutate();
            GradientDrawable gradientDrawable = drawableMutate instanceof GradientDrawable ? (GradientDrawable) drawableMutate : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(Color.parseColor(str));
            }
        } catch (Exception unused) {
            C4387c c4387c = C4387c.f3817a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m3993b(String str, String str2) {
        List<String> groupValues;
        MatchResult matchResultFind$default = Regex.find$default(new Regex(str2 + "\\s*=\\s*[\"']([^\"']+)[\"']"), str, 0, 2, null);
        if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null) {
            return null;
        }
        return (String) CollectionsKt.getOrNull(groupValues, 1);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3994c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "%1$s", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "%2$s", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "%3$s", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public static final SpannableStringBuilder m3995d(CharSequence charSequence, boolean z11, int i11) {
        int color;
        Regex regex = new Regex("<span(\\s[^>]*)?>", RegexOption.IGNORE_CASE);
        String string = charSequence.toString();
        int i12 = 0;
        List<MatchResult> list = SequencesKt.toList(Regex.findAll$default(regex, string, 0, 2, null));
        if (list.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (MatchResult matchResult : list) {
            int first = matchResult.getRange().getFirst();
            int last = matchResult.getRange().getLast() + 1;
            String str = matchResult.getGroupValues().get(1);
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, "</span>", last, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                int i13 = iIndexOf$default + 7;
                String strM3993b = m3993b(str, "color");
                String strM3993b2 = m3993b(str, "darkColor");
                if (!z11 ? strM3993b2 != null : strM3993b == null) {
                    strM3993b = strM3993b2;
                }
                spannableStringBuilder.append(string.subSequence(i12, first));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(string.subSequence(last, iIndexOf$default));
                int length2 = spannableStringBuilder.length();
                if (strM3993b != null) {
                    try {
                        color = Color.parseColor(strM3993b);
                    } catch (Exception unused) {
                        C4387c c4387c = C4387c.f3817a;
                        color = i11;
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(color), length, length2, 33);
                }
                i12 = i13;
            }
        }
        spannableStringBuilder.append(string.subSequence(i12, string.length()));
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public static final void m3996e(@NotNull TextView textView, @NotNull String template, long j11) {
        Object next;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(template, "template");
        if (m3994c(template)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ENGLISH;
            long j12 = 3600;
            String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            long j13 = 60;
            String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf((j11 % j12) / j13)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            String str3 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11 % j13)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            int color = ContextCompat.getColor(textView.getContext(), R$color.c_text);
            List listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m90091to("%1$s", str), TuplesKt.m90091to("%2$s", str2), TuplesKt.m90091to("%3$s", str3)});
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String strSubstring = template;
            while (strSubstring.length() > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = listListOf.iterator();
                while (true) {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    String str4 = (String) pair.component1();
                    String str5 = (String) pair.component2();
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strSubstring, str4, 0, false, 6, (Object) null);
                    next = iIndexOf$default >= 0 ? new Triple(Integer.valueOf(iIndexOf$default), str4, str5) : null;
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int iIntValue = ((Number) ((Triple) next).getFirst()).intValue();
                        do {
                            Object next2 = it2.next();
                            int iIntValue2 = ((Number) ((Triple) next2).getFirst()).intValue();
                            if (iIntValue > iIntValue2) {
                                next = next2;
                                iIntValue = iIntValue2;
                            }
                        } while (it2.hasNext());
                    }
                }
                Triple triple = (Triple) next;
                if (triple == null) {
                    spannableStringBuilder.append((CharSequence) strSubstring);
                    break;
                }
                int iIntValue3 = ((Number) triple.component1()).intValue();
                String str6 = (String) triple.component2();
                String str7 = (String) triple.component3();
                spannableStringBuilder.append((CharSequence) StringsKt.take(strSubstring, iIntValue3));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str7);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(color), length, str7.length() + length, 33);
                strSubstring = strSubstring.substring(iIntValue3 + str6.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            textView.setText(spannableStringBuilder);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m3997f(@NotNull TextView textView, int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        try {
            CharSequence text = textView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (StringsKt.contains$default(text, (CharSequence) "</span>", false, 2, (Object) null)) {
                boolean zM33187l = DayNightThemeManager.f28592a.m33187l();
                int color = ContextCompat.getColor(textView.getContext(), i11);
                CharSequence text2 = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                SpannableStringBuilder spannableStringBuilderM3995d = m3995d(text2, zM33187l, color);
                if (spannableStringBuilderM3995d == null) {
                    return;
                }
                textView.setText(m3999h(spannableStringBuilderM3995d));
            }
        } catch (Exception unused) {
            C4387c c4387c = C4387c.f3817a;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m3998g(TextView textView, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = R$color.c_text;
        }
        m3997f(textView, i11);
    }

    /* JADX INFO: renamed from: h */
    public static final SpannableStringBuilder m3999h(SpannableStringBuilder spannableStringBuilder) {
        Regex regex = new Regex("<[^>]+>");
        String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        int i11 = 0;
        for (MatchResult matchResult : SequencesKt.toList(Regex.findAll$default(regex, string, 0, 2, null))) {
            int first = matchResult.getRange().getFirst() - i11;
            int last = (matchResult.getRange().getLast() + 1) - i11;
            if (first >= 0 && last <= spannableStringBuilder.length()) {
                spannableStringBuilder.delete(first, last);
                i11 += last - first;
            }
        }
        return spannableStringBuilder;
    }
}
