package com.kubi.resources;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.exception.UiKitException;
import com.tencent.bugly.proguard.C33616e0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: HighlightTextHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000b\u001a\u00020\n*\u00020\u00042*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n*\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006*\u00020\u00112\u0006\u0010\r\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d2\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010 \u001a\u00020\u00142*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b \u0010!¨\u0006#"}, m90084d2 = {"Lcom/kubi/resources/HighlightTextHelper;", "", "<init>", "()V", "Landroid/widget/TextView;", "", "Lkotlin/Pair;", "Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;", "Landroid/text/style/CharacterStyle;", C33616e0.f69644s, "", "f", "(Landroid/widget/TextView;[Lkotlin/Pair;)V", "tag", TtmlNode.TAG_SPAN, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/widget/TextView;Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;Landroid/text/style/CharacterStyle;)V", "", "text", "", "", "Lkotlin/ranges/IntRange;", "c", "(Ljava/lang/CharSequence;)Lkotlin/Pair;", "", "lastIndex", "d", "(Ljava/lang/CharSequence;Ljava/lang/String;I)Lkotlin/Pair;", TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, "", "g", "(Ljava/lang/CharSequence;)Ljava/util/List;", "b", "([Lkotlin/Pair;)Ljava/lang/String;", "TextTagEnum", "LUIKit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHighlightTextHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighlightTextHelper.kt\ncom/kubi/resources/HighlightTextHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 UiKitIssue.kt\ncom/kubi/resources/exception/UiKitIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,161:1\n13579#2,2:162\n13579#2,2:166\n44#3,2:164\n44#3,2:168\n1549#4:170\n1620#4,3:171\n766#4:174\n857#4,2:175\n1179#4,2:177\n1253#4,4:179\n766#4:185\n857#4,2:186\n1174#5,2:183\n*S KotlinDebug\n*F\n+ 1 HighlightTextHelper.kt\ncom/kubi/resources/HighlightTextHelper\n*L\n38#1:162,2\n59#1:166,2\n53#1:164,2\n87#1:168,2\n98#1:170\n98#1:171,3\n103#1:174\n103#1:175,2\n109#1:177,2\n109#1:179,4\n159#1:185\n159#1:186,2\n143#1:183,2\n*E\n"})
public final class HighlightTextHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HighlightTextHelper f43497a = new HighlightTextHelper();

    /* JADX INFO: compiled from: HighlightTextHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SPAN", "SPAN1", "SPAN2", "SPAN3", "LUIKit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum TextTagEnum {
        SPAN(TtmlNode.TAG_SPAN),
        SPAN1("span1"),
        SPAN2("span2"),
        SPAN3("span3");


        @NotNull
        private final String value;

        @NotNull
        public final String getValue() {
            return this.value;
        }

        TextTagEnum(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Pair m54115e(HighlightTextHelper highlightTextHelper, CharSequence charSequence, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return highlightTextHelper.m54119d(charSequence, str, i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m54116a(@NotNull TextView textView, @NotNull TextTagEnum tag, @NotNull CharacterStyle span) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(span, "span");
        try {
            CharSequence text = textView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "text");
            try {
                Pair pairM54115e = m54115e(this, text, tag.getValue(), 0, 2, null);
                if (pairM54115e != null) {
                    Object second = pairM54115e.getSecond();
                    Spannable spannableStringBuilder = second instanceof Spannable ? (Spannable) second : null;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder((CharSequence) pairM54115e.getSecond());
                    }
                    spannableStringBuilder.setSpan(span, ((IntRange) pairM54115e.getFirst()).getFirst(), ((IntRange) pairM54115e.getFirst()).getLast(), 18);
                    textView.setText(spannableStringBuilder);
                }
            } catch (Exception e11) {
                e = e11;
                Exception exc = e;
                C43840a.m96551e("HighlightTextHelper-registerTagStyle:" + m54117b(new Pair(tag, span)), null, 2, null);
                C43846g.m96568c(new UiKitException(exc, "HighlightTextHelper", false, null, 8, null), null, 2, null);
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m54117b(Pair<? extends TextTagEnum, ? extends CharacterStyle>... tags) {
        StringBuilder sb2 = new StringBuilder();
        for (Pair<? extends TextTagEnum, ? extends CharacterStyle> pair : tags) {
            sb2.append("Tag:");
            sb2.append(pair.getFirst().getValue());
            sb2.append("Style:");
            sb2.append(pair.getSecond().toString());
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Pair<CharSequence, Map<String, IntRange>> m54118c(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        List<String> listM54121g = m54121g(text);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM54121g, 10));
        Iterator<T> it = listM54121g.iterator();
        int last = 0;
        while (true) {
            Pair<IntRange, CharSequence> pair = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Pair<IntRange, CharSequence> pairM54119d = f43497a.m54119d(text, str, last);
            if (pairM54119d != null) {
                text = pairM54119d.getSecond();
                last = pairM54119d.getFirst().getLast();
                pair = pairM54119d;
            }
            arrayList.add(new Pair(str, pair));
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Pair pair2 = (Pair) ((Pair) obj).getSecond();
            if ((pair2 != null ? (CharSequence) pair2.getSecond() : null) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        Object second = ((Pair) CollectionsKt.last((List) arrayList2)).getSecond();
        Intrinsics.checkNotNull(second);
        Object second2 = ((Pair) second).getSecond();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Pair pair3 : arrayList2) {
            Object first = pair3.getFirst();
            Object second3 = pair3.getSecond();
            Intrinsics.checkNotNull(second3);
            Pair pair4 = new Pair(first, ((Pair) second3).getFirst());
            linkedHashMap.put(pair4.getFirst(), pair4.getSecond());
        }
        return new Pair<>(second2, linkedHashMap);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Pair<IntRange, CharSequence> m54119d(@NotNull CharSequence charSequence, @NotNull String tag, int i11) {
        int iIndexOf$default;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        String str = Typography.less + tag + Typography.greater;
        String str2 = "</" + tag + Typography.greater;
        int iIndexOf$default2 = StringsKt.indexOf$default(charSequence, str, i11, false, 4, (Object) null);
        if (iIndexOf$default2 == -1 || (iIndexOf$default = StringsKt.indexOf$default(charSequence, str2, iIndexOf$default2, false, 4, (Object) null)) == -1) {
            return null;
        }
        IntRange intRange = new IntRange(iIndexOf$default2, iIndexOf$default - str.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence.subSequence(0, iIndexOf$default2));
        spannableStringBuilder.append(charSequence.subSequence(iIndexOf$default2 + str.length(), iIndexOf$default));
        spannableStringBuilder.append(charSequence.subSequence(iIndexOf$default + str2.length(), charSequence.length()));
        return new Pair<>(intRange, spannableStringBuilder);
    }

    /* JADX INFO: renamed from: f */
    public final void m54120f(@NotNull TextView textView, @NotNull Pair<? extends TextTagEnum, ? extends CharacterStyle>... tags) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(tags, "tags");
        try {
            CharSequence text = textView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "text");
            Pair<CharSequence, Map<String, IntRange>> pairM54118c = m54118c(text);
            if (pairM54118c != null) {
                Map<String, IntRange> second = pairM54118c.getSecond();
                CharSequence first = pairM54118c.getFirst();
                Spannable spannableStringBuilder = first instanceof Spannable ? (Spannable) first : null;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(pairM54118c.getFirst());
                }
                for (Pair<? extends TextTagEnum, ? extends CharacterStyle> pair : tags) {
                    IntRange intRange = second.get(pair.getFirst().getValue());
                    if (intRange != null) {
                        spannableStringBuilder.setSpan(pair.getSecond(), intRange.getFirst(), intRange.getLast(), 18);
                    }
                }
                textView.setText(spannableStringBuilder);
            }
        } catch (Exception e11) {
            C43840a.m96551e("HighlightTextHelper-registerTagStyle:" + m54117b((Pair[]) Arrays.copyOf(tags, tags.length)), null, 2, null);
            C43846g.m96568c(new UiKitException(e11, "HighlightTextHelper", false, null, 8, null), null, 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<String> m54121g(@NotNull CharSequence src) {
        Intrinsics.checkNotNullParameter(src, "src");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < src.length(); i11++) {
            char cCharAt = src.charAt(i11);
            if (cCharAt == '<') {
                sb2 = new StringBuilder();
            } else if (cCharAt == '>') {
                if (sb2 != null) {
                    arrayList.add(sb2.toString());
                    sb2 = null;
                }
            } else if (sb2 != null) {
                sb2.append(cCharAt);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null) && !Intrinsics.areEqual(str, "")) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
