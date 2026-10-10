package com.kubi.kumex.market.p091v2.coinInfo;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.R$string;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfoParagraph;
import com.kubi.router.core.Router;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CoinInfoHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J0\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0013J&\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007J\u0016\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001c¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/CoinInfoHelper;", "", "<init>", "()V", "buildStyledText", "Landroid/text/SpannableStringBuilder;", "list", "", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfoParagraph;", SpellCheckPlugin.START_INDEX_KEY, "", "getRichTextSpan", "subText", "", "rotateView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "isReverse", "", "buildLink", "context", "Landroid/content/Context;", TtmlNode.TAG_LAYOUT, "Landroid/widget/LinearLayout;", "needBackgroundColor", "buildContract", "buildEmptyLink", "Landroid/view/ViewGroup;", "KumexLib_googleRelease", "objectAnimation", "Landroid/animation/ObjectAnimator;"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinInfoHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinInfoHelper.kt\ncom/kubi/kumex/market/v2/coinInfo/CoinInfoHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,273:1\n360#2,7:274\n1869#2,2:281\n1878#2,3:298\n1878#2,3:301\n34#3:283\n34#3:286\n34#3:289\n34#3:292\n34#3:295\n13472#4,2:284\n13472#4,2:287\n13472#4,2:290\n13472#4,2:293\n13472#4,2:296\n*S KotlinDebug\n*F\n+ 1 CoinInfoHelper.kt\ncom/kubi/kumex/market/v2/coinInfo/CoinInfoHelper\n*L\n63#1:274,7\n67#1:281,2\n175#1:298,3\n222#1:301,3\n98#1:283\n111#1:286\n133#1:289\n135#1:292\n139#1:295\n99#1:284,2\n112#1:287,2\n134#1:290,2\n136#1:293,2\n140#1:296,2\n*E\n"})
public final class CoinInfoHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CoinInfoHelper f29724a = new CoinInfoHelper();

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.c$a */
    /* JADX INFO: compiled from: CoinInfoHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/kumex/market/v2/coinInfo/CoinInfoHelper$buildStyledText$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MarketCoinInfoParagraph f29725b;

        public a(MarketCoinInfoParagraph marketCoinInfoParagraph) {
            this.f29725b = marketCoinInfoParagraph;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            String href = this.f29725b.getHref();
            if (href == null || href.length() == 0) {
                return;
            }
            InterfaceC37766r.a.m85190a(C37304a.f82764a, this.f29725b.getHref(), null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(C27017c.f54310a.m66512a(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.c$b */
    /* JADX INFO: compiled from: CoinInfoHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/kumex/market/v2/coinInfo/CoinInfoHelper$getRichTextSpan$2$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ URLSpan f29726b;

        public b(URLSpan uRLSpan) {
            this.f29726b = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            Router router = Router.f46192a;
            String url = this.f29726b.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
            router.m56184f(url).m4048k();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            C27017c c27017c = C27017c.f54310a;
            ds2.setTypeface(ResourcesCompat.getFont(c27017c.m66513b(), R$font.medium));
            ds2.setColor(c27017c.m66512a(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m35056g(CoinInfoHelper coinInfoHelper, Context context, LinearLayout linearLayout, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        coinInfoHelper.m35060f(context, linearLayout, list, z11);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m35057h(String str) {
        if (str != null && str.length() != 0) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m35058c(@NotNull Context context, @NotNull LinearLayout layout, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(list, "list");
        layout.removeAllViews();
        int iM66565c = (int) C27025c.m66565c(context, 4);
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            TextView textView = new TextView(context);
            textView.setText(C27041f.m66668h(str));
            textView.setTextSize(12.0f);
            C27017c c27017c = C27017c.f54310a;
            textView.setTextColor(c27017c.m66512a(R$color.c_text40));
            textView.setMaxLines(1);
            textView.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setTextDirection(3);
            textView.setPadding(iM66565c, iM66565c, iM66565c, iM66565c);
            textView.setBackgroundResource(R$drawable.shape_border8_emphasis2_4r);
            C27014a1.m66505e(textView, R$drawable.ic2_copy_12, GravityCompat.END, iM66565c / 2);
            C27046k.m66702q(textView, c27017c.m66512a(R$color.c_icon));
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinInfoHelper.m35055d(str);
                }
            }, 1, null);
            layout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
            if (i11 != 0) {
                C27046k.m66692g(textView, iM66565c);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m35059e(@NotNull Context context, @NotNull ViewGroup layout) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layout, "layout");
        layout.removeAllViews();
        TextView textView = new TextView(context);
        textView.setText("--");
        textView.setTextSize(12.0f);
        textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
        layout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: f */
    public final void m35060f(@NotNull Context context, @NotNull LinearLayout layout, @NotNull List<String> list, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(list, "list");
        layout.removeAllViews();
        int iM66565c = (int) C27025c.m66565c(context, 4);
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            TextView textView = new TextView(context);
            textView.setText(C27041f.m66668h(str));
            textView.setTextSize(12.0f);
            textView.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
            textView.setTextColor(C27017c.f54310a.m66512a(R$color.primary));
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextDirection(3);
            if (z11) {
                textView.setPadding(iM66565c, iM66565c, iM66565c, iM66565c);
                textView.setBackgroundResource(R$drawable.shape_border16_primary8_4r);
                C27014a1.m66505e(textView, R$mipmap.ic_link, GravityCompat.START, iM66565c / 2);
            }
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinInfoHelper.m35057h(str);
                }
            }, 1, null);
            layout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
            if (i11 != 0) {
                C27046k.m66692g(textView, z11 ? iM66565c : C27040e.m66658b(2));
            }
            i11 = i12;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SpannableStringBuilder m35061i(@Nullable List<MarketCoinInfoParagraph> list, int i11) {
        C27096v0 c27096v0 = new C27096v0();
        if (list != null && !list.isEmpty()) {
            if (i11 != -1) {
                MarketCoinInfoParagraph marketCoinInfoParagraph = list.get(i11);
                if (Intrinsics.areEqual(marketCoinInfoParagraph != null ? marketCoinInfoParagraph.getType() : null, "RICHTEXT")) {
                    MarketCoinInfoParagraph marketCoinInfoParagraph2 = list.get(i11);
                    C27096v0 c27096v0Append = c27096v0.append(m35062j(marketCoinInfoParagraph2 != null ? marketCoinInfoParagraph2.getSubText() : null));
                    Intrinsics.checkNotNullExpressionValue(c27096v0Append, "append(...)");
                    return c27096v0Append;
                }
            }
            int size = 0;
            int i12 = i11 == -1 ? 0 : i11 + 1;
            Iterator<MarketCoinInfoParagraph> it = list.subList(RangesKt.coerceAtMost(i12, list.size()), list.size()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    size = -1;
                    break;
                }
                MarketCoinInfoParagraph next = it.next();
                if (Intrinsics.areEqual(next != null ? next.getType() : null, "TITLE")) {
                    break;
                }
                if (Intrinsics.areEqual(next != null ? next.getType() : null, "RICHTEXT")) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = list.size();
            }
            for (MarketCoinInfoParagraph marketCoinInfoParagraph3 : list.subList(RangesKt.coerceAtMost(i12, size), size)) {
                String type = marketCoinInfoParagraph3 != null ? marketCoinInfoParagraph3.getType() : null;
                if (type != null) {
                    int iHashCode = type.hashCode();
                    if (iHashCode != 2336762) {
                        if (iHashCode != 2571565) {
                            if (iHashCode == 2672714 && type.equals("WRAP")) {
                                c27096v0.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                            }
                        } else if (type.equals("TEXT")) {
                            c27096v0.append(marketCoinInfoParagraph3.getText());
                        }
                    } else if (type.equals("LINK")) {
                        c27096v0.m66903c(marketCoinInfoParagraph3.getText(), new a(marketCoinInfoParagraph3));
                    }
                }
            }
        }
        return c27096v0;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m35055d(String str) {
        C27057k.m66746b(str);
        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.copy_success, new Object[0]), new Object[0]);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final SpannableStringBuilder m35062j(@Nullable String str) {
        Spanned spannedFromHtml = Html.fromHtml(C27041f.m66668h(str));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), ForegroundColorSpan.class)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text)), spannableStringBuilder.getSpanStart(foregroundColorSpan), spannableStringBuilder.getSpanEnd(foregroundColorSpan), spannableStringBuilder.getSpanFlags(foregroundColorSpan));
        }
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
            spannableStringBuilder.removeSpan(uRLSpan);
            spannableStringBuilder.setSpan(new b(uRLSpan), spanStart, spanEnd, spanFlags);
        }
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), RelativeSizeSpan.class)) {
            spannableStringBuilder.removeSpan(relativeSizeSpan);
        }
        for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), AbsoluteSizeSpan.class)) {
            spannableStringBuilder.removeSpan(absoluteSizeSpan);
        }
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), BackgroundColorSpan.class)) {
            spannableStringBuilder.removeSpan(backgroundColorSpan);
        }
        return spannableStringBuilder;
    }
}
