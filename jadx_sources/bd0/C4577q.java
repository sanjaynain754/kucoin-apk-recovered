package bd0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: bd0.q */
/* JADX INFO: compiled from: EmojiSpan.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016JP\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/EmojiSpan;", "Landroid/text/style/ImageSpan;", "drawable", "Landroid/graphics/drawable/Drawable;", "emojiTranslateY", "", "<init>", "(Landroid/graphics/drawable/Drawable;I)V", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", ViewProps.TOP, "y", ViewProps.BOTTOM, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmojiSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiSpan.kt\ncom/trtc/uikit/livekit/component/barrage/view/EmojiSpan\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,53:1\n30#2,7:54\n*S KotlinDebug\n*F\n+ 1 EmojiSpan.kt\ncom/trtc/uikit/livekit/component/barrage/view/EmojiSpan\n*L\n44#1:54,7\n*E\n"})
public final class C4577q extends ImageSpan {

    /* JADX INFO: renamed from: b */
    public final int f4045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C4577q(@NotNull Drawable drawable, int i11) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f4045b = i11;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x11, int top, int y11, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        int iSave = canvas.save();
        try {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.translate(x11, ((y11 + ((fontMetricsInt.descent + fontMetricsInt.ascent) / 2)) - (getDrawable().getBounds().height() / 2)) - this.f4045b);
            getDrawable().draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm2) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        int i11 = getDrawable().getBounds().right;
        if (fm2 != null) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int iHeight = getDrawable().getBounds().height();
            int i12 = fontMetricsInt.descent;
            int i13 = fontMetricsInt.ascent;
            int i14 = (iHeight - (i12 - i13)) / 2;
            fm2.ascent = i13 - i14;
            fm2.top = fontMetricsInt.top - i14;
            fm2.bottom = i12 + i14;
            fm2.descent = i12 + i14;
        }
        return i11;
    }
}
