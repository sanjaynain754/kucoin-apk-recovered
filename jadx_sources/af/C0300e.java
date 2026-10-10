package af;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.tradecorebiz.R$color;
import com.tencent.bugly.proguard.C33627eb;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: af.e */
/* JADX INFO: compiled from: TvUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¨\u0006\n"}, m90084d2 = {"displayRichText", "", "Landroid/widget/TextView;", "text1", "", "text2", "color", "", "onClick", "Lkotlin/Function0;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0300e {

    /* JADX INFO: renamed from: af.e$a */
    /* JADX INFO: compiled from: TvUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/core/spot/utils/TvUtilsKt$displayRichText$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0<Unit> f797b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TextView f798c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f799d;

        public a(Function0<Unit> function0, TextView textView, int i11) {
            this.f797b = function0;
            this.f798c = textView;
            this.f799d = i11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            this.f797b.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(ContextCompat.getColor(this.f798c.getContext(), this.f799d));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m1047a(@NotNull TextView textView, @NotNull String text1, @NotNull String text2, int i11, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(text1, "text1");
        Intrinsics.checkNotNullParameter(text2, "text2");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) text1);
        spannableStringBuilder.append((CharSequence) C33627eb.f69716f);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) text2);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), i11)), length, length2, 33);
        spannableStringBuilder.setSpan(new UnderlineSpan(), length, length2, 33);
        spannableStringBuilder.setSpan(new a(onClick, textView, i11), length, length2, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1048b(TextView textView, String str, String str2, int i11, Function0 function0, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = R$color.primary;
        }
        m1047a(textView, str, str2, i11, function0);
    }
}
