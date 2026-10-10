package com.jumio.sdk.consent;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.URLSpan;
import androidx.core.text.HtmlCompat;
import com.jumio.core.util.ClickableSpan;
import com.jumio.sdk.enums.JumioConsentType;
import java.io.Serializable;
import java.util.Arrays;
import jumio.core.AbstractC40511C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m90084d2 = {"Lcom/jumio/sdk/consent/JumioConsentItem;", "Ljava/io/Serializable;", "id", "", "url", "text", "type", "Lcom/jumio/sdk/enums/JumioConsentType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/sdk/enums/JumioConsentType;)V", "getId", "()Ljava/lang/String;", "getUrl", "getText", "getType", "()Lcom/jumio/sdk/enums/JumioConsentType;", "spannedTextWithLinkColor", "Landroid/text/Spanned;", "linkColor", "", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioConsentItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioConsentItem.kt\ncom/jumio/sdk/consent/JumioConsentItem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n*L\n1#1,79:1\n13402#2,2:80\n28#3:82\n*S KotlinDebug\n*F\n+ 1 JumioConsentItem.kt\ncom/jumio/sdk/consent/JumioConsentItem\n*L\n50#1:80,2\n72#1:82\n*E\n"})
public final /* data */ class JumioConsentItem implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f14670a;

    /* JADX INFO: renamed from: b */
    public final String f14671b;

    /* JADX INFO: renamed from: c */
    public final String f14672c;

    /* JADX INFO: renamed from: d */
    public final JumioConsentType f14673d;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumioConsentItem)) {
            return false;
        }
        JumioConsentItem jumioConsentItem = (JumioConsentItem) other;
        return Intrinsics.areEqual(this.f14670a, jumioConsentItem.f14670a) && Intrinsics.areEqual(this.f14671b, jumioConsentItem.f14671b) && Intrinsics.areEqual(this.f14672c, jumioConsentItem.f14672c) && this.f14673d == jumioConsentItem.f14673d;
    }

    public JumioConsentItem(@NotNull String id2, @NotNull String url, @NotNull String text, @NotNull JumioConsentType type) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f14670a = id2;
        this.f14671b = url;
        this.f14672c = text;
        this.f14673d = type;
    }

    public static /* synthetic */ JumioConsentItem copy$default(JumioConsentItem jumioConsentItem, String str, String str2, String str3, JumioConsentType jumioConsentType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jumioConsentItem.f14670a;
        }
        if ((i11 & 2) != 0) {
            str2 = jumioConsentItem.f14671b;
        }
        if ((i11 & 4) != 0) {
            str3 = jumioConsentItem.f14672c;
        }
        if ((i11 & 8) != 0) {
            jumioConsentType = jumioConsentItem.f14673d;
        }
        return jumioConsentItem.copy(str, str2, str3, jumioConsentType);
    }

    public static /* synthetic */ Spanned spannedTextWithLinkColor$default(JumioConsentItem jumioConsentItem, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return jumioConsentItem.spannedTextWithLinkColor(i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14670a() {
        return this.f14670a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getF14671b() {
        return this.f14671b;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getF14672c() {
        return this.f14672c;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JumioConsentType getF14673d() {
        return this.f14673d;
    }

    @NotNull
    public final JumioConsentItem copy(@NotNull String id2, @NotNull String url, @NotNull String text, @NotNull JumioConsentType type) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        return new JumioConsentItem(id2, url, text, type);
    }

    @NotNull
    public final String getId() {
        return this.f14670a;
    }

    @NotNull
    public final String getText() {
        return this.f14672c;
    }

    @NotNull
    public final JumioConsentType getType() {
        return this.f14673d;
    }

    @NotNull
    public final String getUrl() {
        return this.f14671b;
    }

    public int hashCode() {
        return this.f14673d.hashCode() + AbstractC40511C.m89148a(this.f14672c, AbstractC40511C.m89148a(this.f14671b, this.f14670a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final Spanned spannedTextWithLinkColor(int linkColor) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Spanned spannedFromHtml = HtmlCompat.fromHtml(this.f14672c, 63);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        spannableStringBuilder.append((CharSequence) spannedFromHtml);
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            spannableStringBuilder.removeSpan(uRLSpan);
            String url = uRLSpan.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
            spannableStringBuilder.setSpan(new ClickableSpan(url, linkColor), spanStart, spanEnd, 33);
        }
        Regex regex = new Regex("\\[\\(\\{(.*)\\}\\)\\]");
        String string = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        MatchResult matchResultFind$default = Regex.find$default(regex, string, 0, 2, null);
        if (matchResultFind$default != null) {
            String str = matchResultFind$default.getGroupValues().get(1);
            spannableStringBuilder.replace(matchResultFind$default.getRange().getFirst(), matchResultFind$default.getRange().getLast() + 1, (CharSequence) str);
            spannableStringBuilder.setSpan(new ClickableSpan(this.f14671b, linkColor), matchResultFind$default.getRange().getFirst(), str.length() + matchResultFind$default.getRange().getFirst(), 33);
        }
        return SpannedString.valueOf(spannableStringBuilder);
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s", Arrays.copyOf(new Object[]{this.f14673d}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
