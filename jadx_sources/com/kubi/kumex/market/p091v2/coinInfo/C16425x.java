package com.kubi.kumex.market.p091v2.coinInfo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.AccessToken;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.market.p091v2.coinInfo.entity.Tag;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33616e0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.x */
/* JADX INFO: compiled from: ViewExt.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a@\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u001a<\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u001a\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\rH\u0002¨\u0006\u0011"}, m90084d2 = {"buildTag", "", "Landroid/widget/LinearLayout;", "mContext", "Landroid/content/Context;", C33616e0.f69644s, "", "Lcom/kubi/kumex/market/v2/coinInfo/entity/Tag;", "onClickTag", "Lkotlin/Function2;", "", "buildCommunity", "Lcom/google/android/flexbox/FlexboxLayout;", "", "onClick", "getIcon", "url", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExt.kt\ncom/kubi/kumex/market/v2/coinInfo/ViewExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1878#2,3:118\n*S KotlinDebug\n*F\n+ 1 ViewExt.kt\ncom/kubi/kumex/market/v2/coinInfo/ViewExtKt\n*L\n31#1:118,3\n*E\n"})
public final class C16425x {
    /* JADX INFO: renamed from: c */
    public static final void m35104c(@NotNull FlexboxLayout flexboxLayout, @NotNull Context mContext, @NotNull List<String> tags, @NotNull final Function2<? super String, ? super Integer, Unit> onClick) {
        Intrinsics.checkNotNullParameter(flexboxLayout, "<this>");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        flexboxLayout.removeAllViews();
        int size = tags.size();
        for (final int i11 = 0; i11 < size; i11++) {
            final String str = tags.get(i11);
            if (str != null && str.length() != 0 && m35109h(str) != -1) {
                ImageView imageView = new ImageView(mContext);
                imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(C27029c.m66601d(imageView, 20), C27029c.m66601d(imageView, 20)));
                if (i11 == tags.size() - 1) {
                    ViewExtKt.m66585p(imageView, 0, 0, C27029c.m66601d(imageView, 0), C27029c.m66601d(imageView, 8), 3, null);
                } else {
                    ViewExtKt.m66585p(imageView, 0, 0, C27029c.m66601d(imageView, 16), C27029c.m66601d(imageView, 8), 3, null);
                }
                C27046k.m66701p(imageView, ContextCompat.getColor(mContext, R$color.c_icon));
                imageView.setImageResource(m35109h(str));
                C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.w
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16425x.m35105d(onClick, str, i11);
                    }
                }, 1, null);
                flexboxLayout.addView(imageView);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m35106e(@NotNull LinearLayout linearLayout, @NotNull Context mContext, @Nullable List<Tag> list, @Nullable final Function2<? super Tag, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        linearLayout.removeAllViews();
        if (list != null) {
            final int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final Tag tag = (Tag) obj;
                TextView textView = new TextView(mContext);
                textView.setText(C27041f.m66668h(tag.getTitle()) + ' ' + C27041f.m66668h(tag.getSubtitle()));
                textView.setTextColor(ContextCompat.getColor(mContext, R$color.c_text40));
                textView.setBackgroundResource(R$drawable.shape_border8_emphasis2_4r);
                textView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                textView.setTextSize(12.0f);
                textView.setMaxLines(1);
                textView.setMaxEms(10);
                textView.setPadding(C27029c.m66601d(textView, 4), C27029c.m66601d(textView, 1), C27029c.m66601d(textView, 4), C27029c.m66601d(textView, 1));
                ViewExtKt.m66585p(textView, 0, 0, C27029c.m66601d(textView, 8), 0, 11, null);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                Integer type = tag.getType();
                if (type != null && type.intValue() == 2) {
                    textView.setCompoundDrawablePadding(C27029c.m66601d(textView, 2));
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(mContext, R$mipmap.ic_discover_rank), (Drawable) null, (Drawable) null, (Drawable) null);
                }
                C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.coinInfo.v
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16425x.m35108g(function2, tag, i11);
                    }
                }, 1, null);
                linearLayout.addView(textView);
                i11 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m35107f(LinearLayout linearLayout, Context context, List list, Function2 function2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        m35106e(linearLayout, context, list, function2);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m35108g(Function2 function2, Tag tag, int i11) {
        if (function2 != null) {
            function2.invoke(tag, Integer.valueOf(i11 + 1));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final int m35109h(String str) {
        if (StringsKt.contains((CharSequence) str, (CharSequence) AccessToken.DEFAULT_GRAPH_DOMAIN, true)) {
            return R$mipmap.ic_facebook;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "twitter", true)) {
            return R$mipmap.ic_twitter;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "t.me", true) || StringsKt.contains((CharSequence) str, (CharSequence) "telegram.me", true)) {
            return R$mipmap.ic_telegram;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "youtube", true)) {
            return R$mipmap.ic_youtube;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "medium", true)) {
            return R$mipmap.ic_medium;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "reddit", true)) {
            return R$mipmap.ic_reddit;
        }
        if (StringsKt.contains((CharSequence) str, (CharSequence) "github", true)) {
            return R$mipmap.ic_github;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m35105d(Function2 function2, String str, int i11) {
        function2.invoke(str, Integer.valueOf(i11));
        return Unit.INSTANCE;
    }
}
