package com.kubi.utils.extensions.core;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.sequences.Sequence;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: com.kubi.utils.extensions.core.i */
/* JADX INFO: compiled from: SpanExt.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"", "Lkotlin/ranges/IntRange;", SessionDescription.ATTR_RANGE, "", "color", "Landroid/text/SpannableString;", "c", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;I)Landroid/text/SpannableString;", "", "highLightText", "", "b", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/util/List;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/CharSequence;Ljava/lang/String;I)Landroid/text/SpannableString;", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpanExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanExt.kt\ncom/kubi/utils/extensions/core/SpanExtKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,214:1\n1295#2,2:215\n*S KotlinDebug\n*F\n+ 1 SpanExt.kt\ncom/kubi/utils/extensions/core/SpanExtKt\n*L\n66#1:215,2\n*E\n"})
public final class C27035i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SpannableString m66638a(@NotNull CharSequence charSequence, @NotNull String highLightText, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(highLightText, "highLightText");
        if (TextUtils.isEmpty(highLightText)) {
            return new SpannableString(charSequence);
        }
        List<IntRange> listM66639b = m66639b(charSequence, highLightText);
        return !listM66639b.isEmpty() ? m66640c(charSequence, listM66639b.get(0), i11) : new SpannableString(charSequence);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<IntRange> m66639b(@NotNull CharSequence charSequence, @NotNull String highLightText) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(highLightText, "highLightText");
        try {
            Sequence sequenceFindAll$default = Regex.findAll$default(new Regex(highLightText), charSequence, 0, 2, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = sequenceFindAll$default.iterator();
            while (it.hasNext()) {
                arrayList.add(((MatchResult) it.next()).getRange());
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final SpannableString m66640c(@NotNull CharSequence charSequence, @NotNull IntRange range, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        SpannableString spannableString = new SpannableString(charSequence);
        if (range.getFirst() >= 0 && range.getLast() + 1 <= spannableString.length()) {
            spannableString.setSpan(new ForegroundColorSpan(i11), range.getFirst(), range.getLast() + 1, 17);
        }
        return spannableString;
    }
}
