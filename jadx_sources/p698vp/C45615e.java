package p698vp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.AccessToken;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$mipmap;
import com.kubi.margin.entity.Tag;
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

/* JADX INFO: renamed from: vp.e */
/* JADX INFO: compiled from: MarginTagViewHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u001a<\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u001a\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, m90084d2 = {"buildCommunity", "", "Lcom/google/android/flexbox/FlexboxLayout;", "mContext", "Landroid/content/Context;", C33616e0.f69644s, "", "", "onClick", "Lkotlin/Function2;", "", "buildTag", "Landroid/widget/LinearLayout;", "Lcom/kubi/margin/entity/Tag;", "onClickTag", "getIcon", "url", "generateFlutterRoute", "route", "needLogin", "", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginTagViewHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginTagViewHelper.kt\ncom/kubi/margin/util/MarginTagViewHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,118:1\n1878#2,3:119\n*S KotlinDebug\n*F\n+ 1 MarginTagViewHelper.kt\ncom/kubi/margin/util/MarginTagViewHelperKt\n*L\n52#1:119,3\n*E\n"})
public final class C45615e {
    /* JADX INFO: renamed from: c */
    public static final void m100702c(@NotNull FlexboxLayout flexboxLayout, @NotNull Context mContext, @NotNull List<String> tags, @NotNull final Function2<? super String, ? super Integer, Unit> onClick) {
        Intrinsics.checkNotNullParameter(flexboxLayout, "<this>");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        flexboxLayout.removeAllViews();
        int size = tags.size();
        for (final int i11 = 0; i11 < size; i11++) {
            final String str = tags.get(i11);
            if (str != null && str.length() != 0 && m100708i(str) != -1) {
                ImageView imageView = new ImageView(mContext);
                imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(C27029c.m66601d(imageView, 20), C27029c.m66601d(imageView, 20)));
                ViewExtKt.m66585p(imageView, 0, 0, C27029c.m66601d(imageView, 16), C27029c.m66601d(imageView, 8), 3, null);
                imageView.setImageResource(m100708i(str));
                C27046k.m66711z(imageView, 0L, new Function0() { // from class: vp.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C45615e.m100703d(onClick, str, i11);
                    }
                }, 1, null);
                flexboxLayout.addView(imageView);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m100704e(@NotNull LinearLayout linearLayout, @NotNull Context mContext, @Nullable List<Tag> list, @NotNull final Function2<? super Tag, ? super Integer, Unit> onClickTag) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(onClickTag, "onClickTag");
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
                C27046k.m66711z(textView, 0L, new Function0() { // from class: vp.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C45615e.m100705f(onClickTag, tag, i11);
                    }
                }, 1, null);
                linearLayout.addView(textView);
                i11 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m100705f(Function2 function2, Tag tag, int i11) {
        function2.invoke(tag, Integer.valueOf(i11 + 1));
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m100706g(@NotNull String route, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return "flutter?route=" + Uri.encode(route) + "&needLogin=" + z11;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m100707h(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m100706g(str, z11);
    }

    /* JADX INFO: renamed from: i */
    public static final int m100708i(String str) {
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
    public static final Unit m100703d(Function2 function2, String str, int i11) {
        function2.invoke(str, Integer.valueOf(i11));
        return Unit.INSTANCE;
    }
}
