package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes34.dex */
public final class SpanUtils {

    /* JADX INFO: renamed from: b0 */
    public static final String f6392b0 = System.getProperty("line.separator");

    /* JADX INFO: renamed from: A */
    public String f6393A;

    /* JADX INFO: renamed from: B */
    public Typeface f6394B;

    /* JADX INFO: renamed from: C */
    public Layout.Alignment f6395C;

    /* JADX INFO: renamed from: D */
    public int f6396D;

    /* JADX INFO: renamed from: E */
    public ClickableSpan f6397E;

    /* JADX INFO: renamed from: F */
    public String f6398F;

    /* JADX INFO: renamed from: G */
    public float f6399G;

    /* JADX INFO: renamed from: H */
    public BlurMaskFilter.Blur f6400H;

    /* JADX INFO: renamed from: I */
    public Shader f6401I;

    /* JADX INFO: renamed from: J */
    public float f6402J;

    /* JADX INFO: renamed from: K */
    public float f6403K;

    /* JADX INFO: renamed from: L */
    public float f6404L;

    /* JADX INFO: renamed from: M */
    public int f6405M;

    /* JADX INFO: renamed from: N */
    public Object[] f6406N;

    /* JADX INFO: renamed from: O */
    public Bitmap f6407O;

    /* JADX INFO: renamed from: P */
    public Drawable f6408P;

    /* JADX INFO: renamed from: Q */
    public Uri f6409Q;

    /* JADX INFO: renamed from: R */
    public int f6410R;

    /* JADX INFO: renamed from: S */
    public int f6411S;

    /* JADX INFO: renamed from: T */
    public int f6412T;

    /* JADX INFO: renamed from: U */
    public int f6413U;

    /* JADX INFO: renamed from: W */
    public boolean f6415W;

    /* JADX INFO: renamed from: a */
    public TextView f6419a;

    /* JADX INFO: renamed from: c */
    public int f6422c;

    /* JADX INFO: renamed from: d */
    public int f6423d;

    /* JADX INFO: renamed from: e */
    public int f6424e;

    /* JADX INFO: renamed from: f */
    public int f6425f;

    /* JADX INFO: renamed from: g */
    public int f6426g;

    /* JADX INFO: renamed from: h */
    public int f6427h;

    /* JADX INFO: renamed from: i */
    public int f6428i;

    /* JADX INFO: renamed from: j */
    public int f6429j;

    /* JADX INFO: renamed from: k */
    public int f6430k;

    /* JADX INFO: renamed from: l */
    public int f6431l;

    /* JADX INFO: renamed from: m */
    public int f6432m;

    /* JADX INFO: renamed from: n */
    public int f6433n;

    /* JADX INFO: renamed from: o */
    public int f6434o;

    /* JADX INFO: renamed from: p */
    public int f6435p;

    /* JADX INFO: renamed from: q */
    public boolean f6436q;

    /* JADX INFO: renamed from: r */
    public float f6437r;

    /* JADX INFO: renamed from: s */
    public float f6438s;

    /* JADX INFO: renamed from: t */
    public boolean f6439t;

    /* JADX INFO: renamed from: u */
    public boolean f6440u;

    /* JADX INFO: renamed from: v */
    public boolean f6441v;

    /* JADX INFO: renamed from: w */
    public boolean f6442w;

    /* JADX INFO: renamed from: x */
    public boolean f6443x;

    /* JADX INFO: renamed from: y */
    public boolean f6444y;

    /* JADX INFO: renamed from: z */
    public boolean f6445z;

    /* JADX INFO: renamed from: Y */
    public final int f6417Y = 0;

    /* JADX INFO: renamed from: Z */
    public final int f6418Z = 1;

    /* JADX INFO: renamed from: a0 */
    public final int f6420a0 = 2;

    /* JADX INFO: renamed from: V */
    public SerializableSpannableStringBuilder f6414V = new SerializableSpannableStringBuilder(null);

    /* JADX INFO: renamed from: b */
    public CharSequence f6421b = "";

    /* JADX INFO: renamed from: X */
    public int f6416X = -1;

    @SuppressLint({"ParcelCreator"})
    public static class CustomTypefaceSpan extends TypefaceSpan {
        private final Typeface newType;

        public /* synthetic */ CustomTypefaceSpan(Typeface typeface, C5245a c5245a) {
            this(typeface);
        }

        private CustomTypefaceSpan(Typeface typeface) {
            super("");
            this.newType = typeface;
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        private void apply(Paint paint, Typeface typeface) {
            int style;
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 == null) {
                style = 0;
            } else {
                style = typeface2.getStyle();
            }
            int i11 = style & (~typeface.getStyle());
            if ((i11 & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((i11 & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }
    }

    public static class SerializableSpannableStringBuilder extends SpannableStringBuilder implements Serializable {
        private static final long serialVersionUID = 4909567650765875771L;

        private SerializableSpannableStringBuilder() {
        }

        public /* synthetic */ SerializableSpannableStringBuilder(C5245a c5245a) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$a */
    public class C5245a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f6446b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f6447c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View.OnClickListener f6448d;

        public C5245a(int i11, boolean z11, View.OnClickListener onClickListener) {
            this.f6446b = i11;
            this.f6447c = z11;
            this.f6448d = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (view == null) {
                throw new NullPointerException("Argument 'widget' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            View.OnClickListener onClickListener = this.f6448d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            if (textPaint == null) {
                throw new NullPointerException("Argument 'paint' of type TextPaint (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            textPaint.setColor(this.f6446b);
            textPaint.setUnderlineText(this.f6447c);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$b */
    public static class C5246b implements LeadingMarginSpan {

        /* JADX INFO: renamed from: b */
        public final int f6450b;

        /* JADX INFO: renamed from: c */
        public final int f6451c;

        /* JADX INFO: renamed from: d */
        public final int f6452d;

        /* JADX INFO: renamed from: e */
        public Path f6453e;

        public /* synthetic */ C5246b(int i11, int i12, int i13, C5245a c5245a) {
            this(i11, i12, i13);
        }

        public C5246b(int i11, int i12, int i13) {
            this.f6453e = null;
            this.f6450b = i11;
            this.f6451c = i12;
            this.f6452d = i13;
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
            if (((Spanned) charSequence).getSpanStart(this) == i16) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.f6450b);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.f6453e == null) {
                        Path path = new Path();
                        this.f6453e = path;
                        path.addCircle(0.0f, 0.0f, this.f6451c, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate(i11 + (i12 * this.f6451c), (i13 + i15) / 2.0f);
                    canvas.drawPath(this.f6453e, paint);
                    canvas.restore();
                } else {
                    int i18 = this.f6451c;
                    canvas.drawCircle(i11 + (i12 * i18), (i13 + i15) / 2.0f, i18, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z11) {
            return (this.f6451c * 2) + this.f6452d;
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$c */
    public static abstract class AbstractC5247c extends ReplacementSpan {

        /* JADX INFO: renamed from: b */
        public final int f6454b;

        /* JADX INFO: renamed from: c */
        public WeakReference<Drawable> f6455c;

        public /* synthetic */ AbstractC5247c(int i11, C5245a c5245a) {
            this(i11);
        }

        /* JADX INFO: renamed from: b */
        public abstract Drawable mo6107b();

        public AbstractC5247c(int i11) {
            this.f6454b = i11;
        }

        /* JADX INFO: renamed from: a */
        public final Drawable m6106a() {
            WeakReference<Drawable> weakReference = this.f6455c;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableMo6107b = mo6107b();
            this.f6455c = new WeakReference<>(drawableMo6107b);
            return drawableMo6107b;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, @NonNull Paint paint) {
            int iHeight;
            float fHeight;
            if (canvas == null) {
                throw new NullPointerException("Argument 'canvas' of type Canvas (#0 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            if (paint == null) {
                throw new NullPointerException("Argument 'paint' of type Paint (#8 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            Drawable drawableM6106a = m6106a();
            Rect bounds = drawableM6106a.getBounds();
            canvas.save();
            if (bounds.height() < i15 - i13) {
                int i16 = this.f6454b;
                if (i16 == 3) {
                    fHeight = i13;
                } else {
                    if (i16 == 2) {
                        iHeight = ((i15 + i13) - bounds.height()) / 2;
                    } else if (i16 == 1) {
                        fHeight = i14 - bounds.height();
                    } else {
                        iHeight = i15 - bounds.height();
                    }
                    fHeight = iHeight;
                }
                canvas.translate(f11, fHeight);
            } else {
                canvas.translate(f11, i13);
            }
            drawableM6106a.draw(canvas);
            canvas.restore();
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
            int i13;
            if (paint == null) {
                throw new NullPointerException("Argument 'paint' of type Paint (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            Rect bounds = m6106a().getBounds();
            if (fontMetricsInt != null && (i13 = fontMetricsInt.bottom - fontMetricsInt.top) < bounds.height()) {
                int i14 = this.f6454b;
                if (i14 == 3) {
                    fontMetricsInt.top = fontMetricsInt.top;
                    fontMetricsInt.bottom = bounds.height() + fontMetricsInt.top;
                } else if (i14 == 2) {
                    int i15 = i13 / 4;
                    fontMetricsInt.top = ((-bounds.height()) / 2) - i15;
                    fontMetricsInt.bottom = (bounds.height() / 2) - i15;
                } else {
                    int i16 = -bounds.height();
                    int i17 = fontMetricsInt.bottom;
                    fontMetricsInt.top = i16 + i17;
                    fontMetricsInt.bottom = i17;
                }
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
            return bounds.right;
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$d */
    public static class C5248d extends AbstractC5247c {

        /* JADX INFO: renamed from: d */
        public Drawable f6456d;

        /* JADX INFO: renamed from: e */
        public Uri f6457e;

        /* JADX INFO: renamed from: f */
        public int f6458f;

        public /* synthetic */ C5248d(int i11, int i12, C5245a c5245a) {
            this(i11, i12);
        }

        public /* synthetic */ C5248d(Bitmap bitmap, int i11, C5245a c5245a) {
            this(bitmap, i11);
        }

        @Override // com.blankj.utilcode.util.SpanUtils.AbstractC5247c
        /* JADX INFO: renamed from: b */
        public Drawable mo6107b() {
            Drawable drawable = this.f6456d;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = null;
            if (this.f6457e != null) {
                try {
                    InputStream inputStreamOpenInputStream = C5287o0.m6331a().getContentResolver().openInputStream(this.f6457e);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(C5287o0.m6331a().getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    try {
                        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                        if (inputStreamOpenInputStream == null) {
                            return bitmapDrawable;
                        }
                        inputStreamOpenInputStream.close();
                        return bitmapDrawable;
                    } catch (Exception e11) {
                        e = e11;
                        drawable2 = bitmapDrawable;
                        Log.e("sms", "Failed to loaded content " + this.f6457e, e);
                        return drawable2;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } else {
                try {
                    drawable2 = ContextCompat.getDrawable(C5287o0.m6331a(), this.f6458f);
                    drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                    return drawable2;
                } catch (Exception unused) {
                    Log.e("sms", "Unable to find resource: " + this.f6458f);
                }
            }
            return drawable2;
        }

        public /* synthetic */ C5248d(Drawable drawable, int i11, C5245a c5245a) {
            this(drawable, i11);
        }

        public /* synthetic */ C5248d(Uri uri, int i11, C5245a c5245a) {
            this(uri, i11);
        }

        public C5248d(Bitmap bitmap, int i11) {
            super(i11, null);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C5287o0.m6331a().getResources(), bitmap);
            this.f6456d = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.f6456d.getIntrinsicHeight());
        }

        public C5248d(Drawable drawable, int i11) {
            super(i11, null);
            this.f6456d = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f6456d.getIntrinsicHeight());
        }

        public C5248d(Uri uri, int i11) {
            super(i11, null);
            this.f6457e = uri;
        }

        public C5248d(@DrawableRes int i11, int i12) {
            super(i12, null);
            this.f6458f = i11;
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$e */
    public static class C5249e implements LineHeightSpan {

        /* JADX INFO: renamed from: d */
        public static Paint.FontMetricsInt f6459d;

        /* JADX INFO: renamed from: b */
        public final int f6460b;

        /* JADX INFO: renamed from: c */
        public final int f6461c;

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i11, int i12, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = f6459d;
            if (fontMetricsInt2 == null) {
                Paint.FontMetricsInt fontMetricsInt3 = new Paint.FontMetricsInt();
                f6459d = fontMetricsInt3;
                fontMetricsInt3.top = fontMetricsInt.top;
                fontMetricsInt3.ascent = fontMetricsInt.ascent;
                fontMetricsInt3.descent = fontMetricsInt.descent;
                fontMetricsInt3.bottom = fontMetricsInt.bottom;
                fontMetricsInt3.leading = fontMetricsInt.leading;
            } else {
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
                fontMetricsInt.leading = fontMetricsInt2.leading;
            }
            int i15 = this.f6460b;
            int i16 = fontMetricsInt.descent;
            int i17 = fontMetricsInt.ascent;
            int i18 = i15 - (((i14 + i16) - i17) - i13);
            if (i18 > 0) {
                int i19 = this.f6461c;
                if (i19 == 3) {
                    fontMetricsInt.descent = i16 + i18;
                } else if (i19 == 2) {
                    int i21 = i18 / 2;
                    fontMetricsInt.descent = i16 + i21;
                    fontMetricsInt.ascent = i17 - i21;
                } else {
                    fontMetricsInt.ascent = i17 - i18;
                }
            }
            int i22 = fontMetricsInt.bottom;
            int i23 = fontMetricsInt.top;
            int i24 = i15 - (((i14 + i22) - i23) - i13);
            if (i24 > 0) {
                int i25 = this.f6461c;
                if (i25 == 3) {
                    fontMetricsInt.bottom = i22 + i24;
                } else if (i25 == 2) {
                    int i26 = i24 / 2;
                    fontMetricsInt.bottom = i22 + i26;
                    fontMetricsInt.top = i23 - i26;
                } else {
                    fontMetricsInt.top = i23 - i24;
                }
            }
            if (i12 == ((Spanned) charSequence).getSpanEnd(this)) {
                f6459d = null;
            }
        }

        public C5249e(int i11, int i12) {
            this.f6460b = i11;
            this.f6461c = i12;
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$f */
    public static class C5250f implements LeadingMarginSpan {

        /* JADX INFO: renamed from: b */
        public final int f6462b;

        /* JADX INFO: renamed from: c */
        public final int f6463c;

        /* JADX INFO: renamed from: d */
        public final int f6464d;

        public /* synthetic */ C5250f(int i11, int i12, int i13, C5245a c5245a) {
            this(i11, i12, i13);
        }

        public C5250f(int i11, int i12, int i13) {
            this.f6462b = i11;
            this.f6463c = i12;
            this.f6464d = i13;
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z11) {
            return this.f6463c + this.f6464d;
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f6462b);
            canvas.drawRect(i11, i13, i11 + (i12 * this.f6463c), i15, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$g */
    public static class C5251g extends CharacterStyle implements UpdateAppearance {

        /* JADX INFO: renamed from: b */
        public Shader f6465b;

        public /* synthetic */ C5251g(Shader shader, C5245a c5245a) {
            this(shader);
        }

        public C5251g(Shader shader) {
            this.f6465b = shader;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShader(this.f6465b);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$h */
    public static class C5252h extends CharacterStyle implements UpdateAppearance {

        /* JADX INFO: renamed from: b */
        public float f6466b;

        /* JADX INFO: renamed from: c */
        public float f6467c;

        /* JADX INFO: renamed from: d */
        public float f6468d;

        /* JADX INFO: renamed from: e */
        public int f6469e;

        public /* synthetic */ C5252h(float f11, float f12, float f13, int i11, C5245a c5245a) {
            this(f11, f12, f13, i11);
        }

        public C5252h(float f11, float f12, float f13, int i11) {
            this.f6466b = f11;
            this.f6467c = f12;
            this.f6468d = f13;
            this.f6469e = i11;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShadowLayer(this.f6466b, this.f6467c, this.f6468d, this.f6469e);
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$i */
    public static class C5253i extends ReplacementSpan {

        /* JADX INFO: renamed from: b */
        public final int f6470b;

        /* JADX INFO: renamed from: c */
        public final Paint f6471c;

        public /* synthetic */ C5253i(int i11, int i12, C5245a c5245a) {
            this(i11, i12);
        }

        public C5253i(int i11, int i12) {
            Paint paint = new Paint();
            this.f6471c = paint;
            this.f6470b = i11;
            paint.setColor(i12);
            paint.setStyle(Paint.Style.FILL);
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, float f11, int i13, int i14, int i15, @NonNull Paint paint) {
            if (canvas == null) {
                throw new NullPointerException("Argument 'canvas' of type Canvas (#0 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            if (paint == null) {
                throw new NullPointerException("Argument 'paint' of type Paint (#8 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            canvas.drawRect(f11, i13, f11 + this.f6470b, i15, this.f6471c);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            if (paint != null) {
                return this.f6470b;
            }
            throw new NullPointerException("Argument 'paint' of type Paint (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.SpanUtils$j */
    public static class C5254j extends ReplacementSpan {

        /* JADX INFO: renamed from: b */
        public final int f6472b;

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, @NonNull Paint paint) {
            if (canvas == null) {
                throw new NullPointerException("Argument 'canvas' of type Canvas (#0 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            if (paint == null) {
                throw new NullPointerException("Argument 'paint' of type Paint (#8 out of 9, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            CharSequence charSequenceSubSequence = charSequence.subSequence(i11, i12);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.drawText(charSequenceSubSequence.toString(), f11, i14 - (((((fontMetricsInt.descent + i14) + i14) + fontMetricsInt.ascent) / 2) - ((i15 + i13) / 2)), paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i11, int i12, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            if (paint != null) {
                return (int) paint.measureText(charSequence.subSequence(i11, i12).toString());
            }
            throw new NullPointerException("Argument 'paint' of type Paint (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }

        public C5254j(int i11) {
            this.f6472b = i11;
        }
    }

    /* JADX INFO: renamed from: i */
    public SpanUtils m6102i() {
        this.f6440u = true;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public SpanUtils m6094a(@NonNull CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Argument 'text' of type CharSequence (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6095b(0);
        this.f6421b = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m6096c() {
        if (this.f6415W) {
            return;
        }
        int i11 = this.f6416X;
        if (i11 == 0) {
            m6103j();
        } else if (i11 == 1) {
            m6104k();
        } else if (i11 == 2) {
            m6105l();
        }
        m6099f();
    }

    /* JADX INFO: renamed from: e */
    public SpanUtils m6098e(@ColorInt int i11, boolean z11, View.OnClickListener onClickListener) {
        TextView textView = this.f6419a;
        if (textView != null && textView.getMovementMethod() == null) {
            this.f6419a.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.f6397E = new C5245a(i11, z11, onClickListener);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m6099f() {
        this.f6422c = 33;
        this.f6423d = -16777217;
        this.f6424e = -16777217;
        this.f6425f = -1;
        this.f6427h = -16777217;
        this.f6430k = -1;
        this.f6432m = -16777217;
        this.f6435p = -1;
        this.f6437r = -1.0f;
        this.f6438s = -1.0f;
        this.f6439t = false;
        this.f6440u = false;
        this.f6441v = false;
        this.f6442w = false;
        this.f6443x = false;
        this.f6444y = false;
        this.f6445z = false;
        this.f6393A = null;
        this.f6394B = null;
        this.f6395C = null;
        this.f6396D = -1;
        this.f6397E = null;
        this.f6398F = null;
        this.f6399G = -1.0f;
        this.f6401I = null;
        this.f6402J = -1.0f;
        this.f6406N = null;
        this.f6407O = null;
        this.f6408P = null;
        this.f6409Q = null;
        this.f6410R = -1;
        this.f6412T = -1;
    }

    /* JADX INFO: renamed from: g */
    public SpanUtils m6100g(@IntRange(from = 0) int i11, boolean z11) {
        this.f6435p = i11;
        this.f6436q = z11;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public SpanUtils m6101h(@ColorInt int i11) {
        this.f6423d = i11;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m6103j() {
        if (this.f6421b.length() == 0) {
            return;
        }
        int length = this.f6414V.length();
        if (length == 0 && this.f6425f != -1) {
            this.f6414V.append((CharSequence) Character.toString((char) 2)).append((CharSequence) ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).setSpan(new AbsoluteSizeSpan(0), 0, 2, 33);
            length = 2;
        }
        this.f6414V.append(this.f6421b);
        int length2 = this.f6414V.length();
        if (this.f6396D != -1) {
            this.f6414V.setSpan(new C5254j(this.f6396D), length, length2, this.f6422c);
        }
        if (this.f6423d != -16777217) {
            this.f6414V.setSpan(new ForegroundColorSpan(this.f6423d), length, length2, this.f6422c);
        }
        if (this.f6424e != -16777217) {
            this.f6414V.setSpan(new BackgroundColorSpan(this.f6424e), length, length2, this.f6422c);
        }
        if (this.f6430k != -1) {
            this.f6414V.setSpan(new LeadingMarginSpan.Standard(this.f6430k, this.f6431l), length, length2, this.f6422c);
        }
        int i11 = this.f6427h;
        C5245a c5245a = null;
        if (i11 != -16777217) {
            this.f6414V.setSpan(new C5250f(i11, this.f6428i, this.f6429j, c5245a), length, length2, this.f6422c);
        }
        int i12 = this.f6432m;
        if (i12 != -16777217) {
            this.f6414V.setSpan(new C5246b(i12, this.f6433n, this.f6434o, c5245a), length, length2, this.f6422c);
        }
        if (this.f6435p != -1) {
            this.f6414V.setSpan(new AbsoluteSizeSpan(this.f6435p, this.f6436q), length, length2, this.f6422c);
        }
        if (this.f6437r != -1.0f) {
            this.f6414V.setSpan(new RelativeSizeSpan(this.f6437r), length, length2, this.f6422c);
        }
        if (this.f6438s != -1.0f) {
            this.f6414V.setSpan(new ScaleXSpan(this.f6438s), length, length2, this.f6422c);
        }
        int i13 = this.f6425f;
        if (i13 != -1) {
            this.f6414V.setSpan(new C5249e(i13, this.f6426g), length, length2, this.f6422c);
        }
        if (this.f6439t) {
            this.f6414V.setSpan(new StrikethroughSpan(), length, length2, this.f6422c);
        }
        if (this.f6440u) {
            this.f6414V.setSpan(new UnderlineSpan(), length, length2, this.f6422c);
        }
        if (this.f6441v) {
            this.f6414V.setSpan(new SuperscriptSpan(), length, length2, this.f6422c);
        }
        if (this.f6442w) {
            this.f6414V.setSpan(new SubscriptSpan(), length, length2, this.f6422c);
        }
        if (this.f6443x) {
            this.f6414V.setSpan(new StyleSpan(1), length, length2, this.f6422c);
        }
        if (this.f6444y) {
            this.f6414V.setSpan(new StyleSpan(2), length, length2, this.f6422c);
        }
        if (this.f6445z) {
            this.f6414V.setSpan(new StyleSpan(3), length, length2, this.f6422c);
        }
        if (this.f6393A != null) {
            this.f6414V.setSpan(new TypefaceSpan(this.f6393A), length, length2, this.f6422c);
        }
        if (this.f6394B != null) {
            this.f6414V.setSpan(new CustomTypefaceSpan(this.f6394B, c5245a), length, length2, this.f6422c);
        }
        if (this.f6395C != null) {
            this.f6414V.setSpan(new AlignmentSpan.Standard(this.f6395C), length, length2, this.f6422c);
        }
        ClickableSpan clickableSpan = this.f6397E;
        if (clickableSpan != null) {
            this.f6414V.setSpan(clickableSpan, length, length2, this.f6422c);
        }
        if (this.f6398F != null) {
            this.f6414V.setSpan(new URLSpan(this.f6398F), length, length2, this.f6422c);
        }
        if (this.f6399G != -1.0f) {
            this.f6414V.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.f6399G, this.f6400H)), length, length2, this.f6422c);
        }
        if (this.f6401I != null) {
            this.f6414V.setSpan(new C5251g(this.f6401I, c5245a), length, length2, this.f6422c);
        }
        if (this.f6402J != -1.0f) {
            this.f6414V.setSpan(new C5252h(this.f6402J, this.f6403K, this.f6404L, this.f6405M, null), length, length2, this.f6422c);
        }
        Object[] objArr = this.f6406N;
        if (objArr != null) {
            for (Object obj : objArr) {
                this.f6414V.setSpan(obj, length, length2, this.f6422c);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6104k() {
        int length = this.f6414V.length();
        this.f6421b = "<img>";
        m6103j();
        int length2 = this.f6414V.length();
        C5245a c5245a = null;
        if (this.f6407O != null) {
            this.f6414V.setSpan(new C5248d(this.f6407O, this.f6411S, c5245a), length, length2, this.f6422c);
            return;
        }
        if (this.f6408P != null) {
            this.f6414V.setSpan(new C5248d(this.f6408P, this.f6411S, c5245a), length, length2, this.f6422c);
        } else if (this.f6409Q != null) {
            this.f6414V.setSpan(new C5248d(this.f6409Q, this.f6411S, c5245a), length, length2, this.f6422c);
        } else if (this.f6410R != -1) {
            this.f6414V.setSpan(new C5248d(this.f6410R, this.f6411S, c5245a), length, length2, this.f6422c);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6105l() {
        int length = this.f6414V.length();
        this.f6421b = "< >";
        m6103j();
        this.f6414V.setSpan(new C5253i(this.f6412T, this.f6413U, null), length, this.f6414V.length(), this.f6422c);
    }

    public SpanUtils() {
        m6099f();
    }

    /* JADX INFO: renamed from: b */
    public final void m6095b(int i11) {
        m6096c();
        this.f6416X = i11;
    }

    /* JADX INFO: renamed from: d */
    public SpannableStringBuilder m6097d() {
        m6096c();
        TextView textView = this.f6419a;
        if (textView != null) {
            textView.setText(this.f6414V);
        }
        this.f6415W = true;
        return this.f6414V;
    }
}
