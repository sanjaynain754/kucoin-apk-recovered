package com.kubi.margin.market.info;

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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$font;
import com.kubi.margin.R$id;
import com.kubi.margin.R$mipmap;
import com.kubi.margin.R$string;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.router.core.Router;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import zw.InterfaceC46930a;

/* JADX INFO: renamed from: com.kubi.margin.market.info.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarginCoinInfoHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J.\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00072\u0006\u0010\u0019\u001a\u00020\nJ&\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0007J\u0016\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001cJ0\u0010!\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u001d\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m90084d2 = {"Lcom/kubi/margin/market/info/MarginCoinInfoHelper;", "", "<init>", "()V", "buildStyledText", "Landroid/text/SpannableStringBuilder;", "list", "", "Lcom/kubi/margin/market/info/MarketCoinInfoParagraph;", SpellCheckPlugin.START_INDEX_KEY, "", "getRichTextSpan", "subText", "", "rotateView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "isReverse", "", "buildLink", "context", "Landroid/content/Context;", TtmlNode.TAG_LAYOUT, "Landroid/widget/LinearLayout;", "type", "buildContract", "buildEmptyLink", "Landroid/view/ViewGroup;", "BANNER_ACTIVITY", "BANNER_ACTIVITY_BADGE", "BANNER_TOPIC", "BANNER_TOPIC_BADGE", "bindBanner", "Lcom/kubi/margin/market/info/MarketBannerEntity;", "MarginLib_googleRelease", "objectAnimation", "Landroid/animation/ObjectAnimator;"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginCoinInfoHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginCoinInfoHelper.kt\ncom/kubi/margin/market/info/MarginCoinInfoHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n360#2,7:335\n1869#2,2:342\n1878#2,3:359\n1878#2,3:362\n34#3:344\n34#3:347\n34#3:350\n34#3:353\n34#3:356\n13472#4,2:345\n13472#4,2:348\n13472#4,2:351\n13472#4,2:354\n13472#4,2:357\n1#5:365\n*S KotlinDebug\n*F\n+ 1 MarginCoinInfoHelper.kt\ncom/kubi/margin/market/info/MarginCoinInfoHelper\n*L\n70#1:335,7\n74#1:342,2\n178#1:359,3\n223#1:362,3\n105#1:344\n118#1:347\n141#1:350\n143#1:353\n147#1:356\n106#1:345,2\n119#1:348,2\n142#1:351,2\n144#1:354,2\n148#1:357,2\n*E\n"})
public final class MarginCoinInfoHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MarginCoinInfoHelper f33327a = new MarginCoinInfoHelper();

    /* JADX INFO: renamed from: com.kubi.margin.market.info.e$a */
    /* JADX INFO: compiled from: MarginCoinInfoHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/margin/market/info/MarginCoinInfoHelper$buildStyledText$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MarketCoinInfoParagraph f33328b;

        public a(MarketCoinInfoParagraph marketCoinInfoParagraph) {
            this.f33328b = marketCoinInfoParagraph;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            String href = this.f33328b.getHref();
            if (href == null || href.length() == 0) {
                return;
            }
            InterfaceC37766r.a.m85190a(C37304a.f82764a, this.f33328b.getHref(), null, null, null, null, null, null, 126, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(C27017c.f54310a.m66512a(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.info.e$b */
    /* JADX INFO: compiled from: MarginCoinInfoHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/margin/market/info/MarginCoinInfoHelper$getRichTextSpan$2$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ URLSpan f33329b;

        public b(URLSpan uRLSpan) {
            this.f33329b = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            Router router = Router.f46192a;
            String url = this.f33329b.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "getURL(...)");
            router.m56184f(url).m4048k();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            C27017c c27017c = C27017c.f54310a;
            Context contextM66513b = c27017c.m66513b();
            int i11 = R$font.medium;
            ResourcesCompat.getFont(contextM66513b, i11);
            ds2.setTypeface(ResourcesCompat.getFont(c27017c.m66513b(), i11));
            ds2.setColor(c27017c.m66512a(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m39115f(View view, String str) {
        C43852m.m96591c("B4candle", "Spots", "2", null, 8, null);
        ViewExtKt.m66577h(view);
        C27063n.m66773k(true, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m39116g(Ref.ObjectRef objectRef, String str, MarketBannerEntity marketBannerEntity) {
        String link;
        C43852m.m96591c("B4candle", "Spots", "1", null, 8, null);
        InterfaceC46930a interfaceC46930a = (InterfaceC46930a) objectRef.element;
        if (interfaceC46930a != null) {
            interfaceC46930a.mo55424a(false);
        }
        C27063n.m66773k(false, str);
        if (marketBannerEntity != null && (link = marketBannerEntity.getLink()) != null) {
            Router.f46192a.m56184f(link).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m39117i(String str) {
        C43852m.m96591c("B4candle", "MoreInformation", "4", null, 8, null);
        C27057k.m66746b(str);
        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.copy_success, new Object[0]), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m39118l(int i11, String str) {
        String str2;
        if (i11 != 0) {
            str2 = i11 != 1 ? "3" : "2";
        } else {
            str2 = "1";
        }
        C43852m.m96591c("B4candle", "MoreInformation", str2, null, 8, null);
        if (str != null && str.length() != 0) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, zw.a] */
    /* JADX INFO: renamed from: e */
    public final void m39119e(@NotNull Context context, int i11, @Nullable List<MarketBannerEntity> list, @NotNull final View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        if (list == null || list.isEmpty() || list.get(0) == null) {
            ViewExtKt.m66577h(view);
            return;
        }
        final MarketBannerEntity marketBannerEntity = list.get(0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11 == 0 ? "market_banner_activity" : "market_banner_topic");
        sb2.append(marketBannerEntity != null ? marketBannerEntity.getId() : null);
        final String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i11 == 0 ? "market_banner_activity_badge" : "market_banner_topic_badge");
        sb3.append(marketBannerEntity != null ? marketBannerEntity.getId() : null);
        final String string2 = sb3.toString();
        if (C27063n.m66763a(string, false)) {
            ViewExtKt.m66577h(view);
            return;
        }
        ViewExtKt.m66594y(view);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ImageView imageView = (ImageView) view.findViewById(R$id.icon);
        TextView textView = (TextView) view.findViewById(R$id.title);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.close);
        C27017c c27017c = C27017c.f54310a;
        view.setBackground(C27017c.m66511i(c27017c, i11 == 0 ? R$drawable.shape_primary8_4r : R$drawable.shape_complementary16_4r, null, 2, null));
        imageView.setImageResource(i11 == 0 ? R$mipmap.ic_activity : R$mipmap.ic_topic);
        textView.setText(C27041f.m66668h(marketBannerEntity != null ? marketBannerEntity.getTitle() : null));
        textView.setTextColor(c27017c.m66512a(i11 == 0 ? R$color.primary : R$color.complementary));
        Intrinsics.checkNotNull(imageView2);
        C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.margin.market.info.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCoinInfoHelper.m39115f(view, string);
            }
        }, 1, null);
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.margin.market.info.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCoinInfoHelper.m39116g(objectRef, string2, marketBannerEntity);
            }
        }, 1, null);
        if (C27063n.m66763a(string2, true)) {
            objectRef.element = new QBadgeView(context).m55419B(ContextCompat.getColor(context, R$color.secondary)).mo55428e(3.0f, true).mo55431h(8388661).mo55427d(false).mo55425b(-1).mo55429f(imageView);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m39120h(@NotNull Context context, @NotNull LinearLayout layout, @NotNull List<String> list) {
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
            textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setTextDirection(3);
            textView.setPadding(iM66565c, iM66565c, iM66565c, iM66565c);
            textView.setBackgroundResource(R$drawable.shape_border8_emphasis2_4r);
            C27014a1.m66505e(textView, R$mipmap.kucoin_ic_copy, GravityCompat.END, iM66565c / 2);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.margin.market.info.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginCoinInfoHelper.m39117i(str);
                }
            }, 1, null);
            layout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
            if (i11 != 0) {
                C27046k.m66692g(textView, iM66565c);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m39121j(@NotNull Context context, @NotNull ViewGroup layout) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layout, "layout");
        layout.removeAllViews();
        TextView textView = new TextView(context);
        textView.setText("--");
        textView.setTextSize(12.0f);
        textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
        layout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: k */
    public final void m39122k(@NotNull Context context, @NotNull LinearLayout layout, @NotNull List<String> list, final int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(list, "list");
        layout.removeAllViews();
        int iM66565c = (int) C27025c.m66565c(context, 4);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            TextView textView = new TextView(context);
            textView.setText(C27041f.m66668h(str));
            textView.setTextSize(12.0f);
            textView.setTextColor(C27017c.f54310a.m66512a(R$color.primary));
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextDirection(3);
            textView.setPadding(iM66565c, iM66565c, iM66565c, iM66565c);
            textView.setBackgroundResource(R$drawable.shape_border16_primary8_4r);
            C27014a1.m66505e(textView, R$mipmap.ic_link, GravityCompat.START, iM66565c / 2);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.margin.market.info.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginCoinInfoHelper.m39118l(i11, str);
                }
            }, 1, null);
            layout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
            if (i12 != 0) {
                C27046k.m66692g(textView, iM66565c);
            }
            i12 = i13;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final SpannableStringBuilder m39123m(@Nullable List<MarketCoinInfoParagraph> list, int i11) {
        C27096v0 c27096v0 = new C27096v0();
        if (list != null && !list.isEmpty()) {
            if (i11 != -1) {
                MarketCoinInfoParagraph marketCoinInfoParagraph = list.get(i11);
                if (Intrinsics.areEqual(marketCoinInfoParagraph != null ? marketCoinInfoParagraph.getType() : null, "RICHTEXT")) {
                    MarketCoinInfoParagraph marketCoinInfoParagraph2 = list.get(i11);
                    C27096v0 c27096v0Append = c27096v0.append(m39124n(marketCoinInfoParagraph2 != null ? marketCoinInfoParagraph2.getSubText() : null));
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

    @NotNull
    /* JADX INFO: renamed from: n */
    public final SpannableStringBuilder m39124n(@Nullable String str) {
        Spanned spannedFromHtml = Html.fromHtml(C27041f.m66668h(str));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), ForegroundColorSpan.class)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis60)), spannableStringBuilder.getSpanStart(foregroundColorSpan), spannableStringBuilder.getSpanEnd(foregroundColorSpan), spannableStringBuilder.getSpanFlags(foregroundColorSpan));
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
