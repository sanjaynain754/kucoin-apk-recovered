package com.kubi.kucoin.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.view.IndexBar;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p666ul.C45261b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: IndexBar.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001dB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0016J\"\u0010:\u001a\u0002082\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010;\u001a\u000208H\u0002J\u0010\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020>H\u0017J\b\u0010?\u001a\u000208H\u0002J\u0010\u0010@\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,H\u0002J(\u0010F\u001a\u0002082\u0006\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\nH\u0014J\b\u0010K\u001a\u000208H\u0002J\u0010\u0010L\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0014J\u0010\u0010M\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010N\u001a\u00020\n2\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\nH\u0002J\u0010\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020\nH\u0002J\u0010\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\nH\u0002J\b\u0010U\u001a\u00020\nH\u0002J\b\u0010V\u001a\u00020\nH\u0002J\u0018\u0010W\u001a\u0002082\u0006\u0010R\u001a\u00020\n2\u0006\u0010T\u001a\u00020\nH\u0014J\u0010\u0010^\u001a\u0002082\b\u0010X\u001a\u0004\u0018\u00010YJ\u0016\u0010_\u001a\u0002082\u000e\u0010`\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010/J\b\u0010a\u001a\u000208H\u0002J\u0010\u0010c\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u00103R\u000e\u00104\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010X\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0011\u0010b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bb\u0010\u0017¨\u0006e"}, m90084d2 = {"Lcom/kubi/kucoin/view/IndexBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mContext", "indexHeight", "mWidth", "mHeight", "mPaint", "Landroid/graphics/Paint;", "mTextColor", "bgRect", "Landroid/graphics/RectF;", "isRight", "", "()Z", "isRight$delegate", "Lkotlin/Lazy;", "mTextBgColor", "mTextHorizontalPadding", "mTextVerticalPadding", "mSelectTextColor", "mCircleTextPaint", "Landroid/text/TextPaint;", "mTextSize", "circleTextSize", "mSelectText", "", "getMSelectText", "()Ljava/lang/String;", "setMSelectText", "(Ljava/lang/String;)V", "mCirclePath", "Landroid/graphics/Path;", "mCircleRadius", "mCenterY", "", "mCirclePaint", "sourceDataList", "", "mTextBgWidth", "isPress", "setPress", "(Z)V", "currentIndex", "keyboardIsOpen", "mBgPaint", "setVisibleByKeyBoardVisible", "", ViewProps.VISIBLE, "init", "initPaint", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "measureBgRect", "drawBg", "canvas", "Landroid/graphics/Canvas;", "computePressIndexLocation", "x", "y", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "computeIndexHeight", "onDraw", "drawText", "measureSize", "realSize", "measureSpec", "measureW", "widthMeasureSpec", "measureH", "heightMeasureSpec", "getRealWidth", "getRealHeight", "onMeasure", "mOnIndexPressListener", "Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;", "getMOnIndexPressListener", "()Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;", "setMOnIndexPressListener", "(Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;)V", "setOnIndexPressListener", "setSourceDataList", "sourceList", "invalidateMySelft", "isMainThread", "drawCirclePath", "OnIndexPressListener", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIndexBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBar.kt\ncom/kubi/kucoin/view/IndexBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n2767#2:522\n1878#2,3:524\n2756#2:527\n1#3:523\n1#3:528\n*S KotlinDebug\n*F\n+ 1 IndexBar.kt\ncom/kubi/kucoin/view/IndexBar\n*L\n356#1:522\n356#1:524,3\n419#1:527\n356#1:523\n419#1:528\n*E\n"})
public final class IndexBar extends View {

    /* JADX INFO: renamed from: A */
    @NotNull
    public final Paint f28616A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public InterfaceC15757a f28617B;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Context f28618b;

    /* JADX INFO: renamed from: c */
    public int f28619c;

    /* JADX INFO: renamed from: d */
    public int f28620d;

    /* JADX INFO: renamed from: e */
    public int f28621e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public Paint f28622f;

    /* JADX INFO: renamed from: g */
    public int f28623g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public RectF f28624h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f28625i;

    /* JADX INFO: renamed from: j */
    public int f28626j;

    /* JADX INFO: renamed from: k */
    public int f28627k;

    /* JADX INFO: renamed from: l */
    public int f28628l;

    /* JADX INFO: renamed from: m */
    public int f28629m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public TextPaint f28630n;

    /* JADX INFO: renamed from: o */
    public int f28631o;

    /* JADX INFO: renamed from: p */
    public int f28632p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public String f28633q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Path f28634r;

    /* JADX INFO: renamed from: s */
    public int f28635s;

    /* JADX INFO: renamed from: t */
    public float f28636t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public Paint f28637u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public List<String> f28638v;

    /* JADX INFO: renamed from: w */
    public float f28639w;

    /* JADX INFO: renamed from: x */
    public boolean f28640x;

    /* JADX INFO: renamed from: y */
    public int f28641y;

    /* JADX INFO: renamed from: z */
    public boolean f28642z;

    /* JADX INFO: renamed from: com.kubi.kucoin.view.IndexBar$a */
    /* JADX INFO: compiled from: IndexBar.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;", "", "onIndexChange", "", "index", "", "text", "", "onMotionEventEnd", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC15757a {
        /* JADX INFO: renamed from: a */
        void mo19005a(int i11, @NotNull String str);

        /* JADX INFO: renamed from: b */
        void mo19006b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28622f = new TextPaint();
        this.f28624h = new RectF();
        this.f28625i = LazyKt.lazy(new Function0() { // from class: ul.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(IndexBar.m33213l(this.f101801b));
            }
        });
        this.f28630n = new TextPaint();
        this.f28633q = "";
        this.f28634r = new Path();
        this.f28635s = 50;
        this.f28637u = new Paint();
        this.f28641y = -1;
        this.f28616A = new Paint();
        m33219g(context, null, -1);
    }

    private final int getRealHeight() {
        List<String> list = this.f28638v;
        float f11 = 0.0f;
        if (list == null || list.isEmpty()) {
            return (int) 0.0f;
        }
        List<String> list2 = this.f28638v;
        if (list2 != null) {
            for (String str : list2) {
                f11 += (this.f28622f.getFontMetrics().bottom - this.f28622f.getFontMetrics().top) + this.f28628l;
            }
        }
        return (int) f11;
    }

    private final int getRealWidth() {
        Rect rect = new Rect();
        List<String> list = this.f28638v;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        List<String> list2 = this.f28638v;
        String str = list2 != null ? (String) CollectionsKt.firstOrNull((List) list2) : null;
        this.f28622f.getTextBounds(str, 0, str != null ? str.length() : 0, rect);
        return rect.width() + (this.f28627k * 2) + (this.f28635s * 2) + getPaddingEnd();
    }

    /* JADX INFO: renamed from: b */
    public final void m33214b() {
        int paddingTop = (this.f28621e - getPaddingTop()) - getPaddingBottom();
        List<String> list = this.f28638v;
        Intrinsics.checkNotNull(list);
        this.f28619c = paddingTop / list.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m33216d(Canvas canvas) {
        RectF rectF = this.f28624h;
        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, this.f28624h.width() / 2.0f, this.f28616A);
    }

    /* JADX INFO: renamed from: e */
    public final void m33217e(Canvas canvas) {
        if (this.f28640x) {
            this.f28634r.reset();
            float f11 = m33223k() ? this.f28624h.right + this.f28635s : this.f28624h.left - this.f28635s;
            this.f28634r.addCircle(f11, this.f28636t, this.f28635s, Path.Direction.CW);
            this.f28634r.close();
            canvas.drawPath(this.f28634r, this.f28637u);
            Paint.FontMetrics fontMetrics = this.f28630n.getFontMetrics();
            float f12 = 2;
            float fAbs = this.f28636t + (Math.abs((-fontMetrics.bottom) - fontMetrics.top) / f12);
            String str = this.f28633q;
            canvas.drawText(str, f11 - (this.f28630n.measureText(str) / f12), fAbs, this.f28630n);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33218f(Canvas canvas) {
        List<String> list = this.f28638v;
        if (list != null) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                Paint.FontMetrics fontMetrics = this.f28622f.getFontMetrics();
                int i13 = (int) (((this.f28619c - fontMetrics.bottom) - fontMetrics.top) / 2);
                if (this.f28641y == i11) {
                    this.f28622f.setColor(this.f28629m);
                    this.f28633q = str;
                } else {
                    this.f28622f.setColor(this.f28623g);
                }
                canvas.drawText(str, this.f28624h.centerX(), getPaddingTop() + i13 + (this.f28619c * i11), this.f28622f);
                i11 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m33219g(Context context, AttributeSet attributeSet, int i11) {
        this.f28618b = context;
        int iApplyDimension = (int) TypedValue.applyDimension(2, 16.0f, getResources().getDisplayMetrics());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IndexBar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f28631o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndexBar_indexTextSize, iApplyDimension);
        this.f28632p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndexBar_circleTextSize, iApplyDimension);
        this.f28635s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndexBar_circleRadiusSize, iApplyDimension);
        this.f28627k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndexBar_textHorizontalPadding, 0);
        this.f28628l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IndexBar_textVerticalPadding, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.IndexBar_indexTextColor, SupportMenu.CATEGORY_MASK);
        this.f28623g = color;
        this.f28626j = typedArrayObtainStyledAttributes.getColor(R$styleable.IndexBar_textBgColor, color);
        this.f28629m = typedArrayObtainStyledAttributes.getColor(R$styleable.IndexBar_selectTextColor, this.f28623g);
        typedArrayObtainStyledAttributes.recycle();
        m33220h();
        ViewExtKt.m66577h(this);
    }

    @Nullable
    /* JADX INFO: renamed from: getMOnIndexPressListener, reason: from getter */
    public final InterfaceC15757a getF28617B() {
        return this.f28617B;
    }

    @NotNull
    /* JADX INFO: renamed from: getMSelectText, reason: from getter */
    public final String getF28633q() {
        return this.f28633q;
    }

    /* JADX INFO: renamed from: h */
    public final void m33220h() {
        Paint paint = this.f28622f;
        paint.setTextSize(this.f28631o);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        TextPaint textPaint = this.f28630n;
        textPaint.setTextSize(this.f28632p);
        textPaint.setAntiAlias(true);
        textPaint.setColor(this.f28629m);
        Paint paint2 = this.f28637u;
        paint2.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(this.f28626j);
        Paint paint3 = this.f28616A;
        paint3.setStyle(style);
        paint3.setColor(this.f28626j);
        paint3.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m33223k() {
        return ((Boolean) this.f28625i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m33224m() {
        this.f28624h.left = m33223k() ? getPaddingEnd() : this.f28635s * 2.0f;
        this.f28624h.right = m33223k() ? this.f28620d - (this.f28635s * 2.0f) : this.f28620d - getPaddingEnd();
        RectF rectF = this.f28624h;
        rectF.top = 0.0f;
        rectF.bottom = this.f28621e;
        this.f28639w = rectF.width();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        m33216d(canvas);
        m33218f(canvas);
        m33217e(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        List<String> list = this.f28638v;
        if (list == null || list.isEmpty()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(m33227p(widthMeasureSpec), m33225n(heightMeasureSpec));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ResourceAsColor"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 2) {
                this.f28641y = -1;
                InterfaceC15757a interfaceC15757a = this.f28617B;
                if (interfaceC15757a != null) {
                    Intrinsics.checkNotNull(interfaceC15757a);
                    interfaceC15757a.mo19006b();
                }
                this.f28640x = false;
                m33221i();
            } else {
                m33215c(event.getX(), event.getY());
            }
        } else {
            if (m33223k() && event.getX() > this.f28624h.right) {
                return false;
            }
            if (!m33223k() && event.getX() < this.f28624h.left) {
                return false;
            }
            this.f28640x = true;
            m33215c(event.getX(), event.getY());
        }
        return true;
    }

    public final void setMOnIndexPressListener(@Nullable InterfaceC15757a interfaceC15757a) {
        this.f28617B = interfaceC15757a;
    }

    public final void setMSelectText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f28633q = str;
    }

    public final void setOnIndexPressListener(@Nullable InterfaceC15757a interfaceC15757a) {
        this.f28617B = interfaceC15757a;
    }

    public final void setPress(boolean z11) {
        this.f28640x = z11;
    }

    public final void setSourceDataList(@Nullable List<String> sourceList) {
        this.f28638v = sourceList;
        if (sourceList == null || sourceList.isEmpty() || this.f28642z) {
            ViewExtKt.m66577h(this);
            return;
        }
        ViewExtKt.m66594y(this);
        requestLayout();
        m33221i();
    }

    public final void setVisibleByKeyBoardVisible(boolean visible) {
        this.f28642z = visible;
        if (visible && ViewExtKt.m66581l(this)) {
            ViewExtKt.m66577h(this);
            return;
        }
        List<String> list = this.f28638v;
        if (list == null || list.isEmpty()) {
            return;
        }
        C27046k.m66685H(this);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m33213l(IndexBar indexBar) {
        return C45261b.m100050a(indexBar);
    }

    /* JADX INFO: renamed from: c */
    public final void m33215c(float f11, float f12) {
        List<String> list;
        String str;
        if (getContext() != null && (list = this.f28638v) != null && !list.isEmpty()) {
            this.f28636t = f12;
            int paddingTop = (int) ((f12 - getPaddingTop()) / this.f28619c);
            this.f28641y = paddingTop;
            if (paddingTop < 0) {
                this.f28641y = 0;
            } else {
                List<String> list2 = this.f28638v;
                Intrinsics.checkNotNull(list2);
                if (paddingTop >= list2.size()) {
                    List<String> list3 = this.f28638v;
                    Intrinsics.checkNotNull(list3);
                    this.f28641y = list3.size() - 1;
                }
            }
            m33221i();
            InterfaceC15757a interfaceC15757a = this.f28617B;
            if (interfaceC15757a != null) {
                int i11 = this.f28641y;
                List<String> list4 = this.f28638v;
                if (list4 == null || (str = list4.get(i11)) == null) {
                    str = "";
                }
                interfaceC15757a.mo19005a(i11, str);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m33221i() {
        if (m33222j()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m33222j() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final int m33225n(int i11) {
        return m33226o(getRealHeight(), i11);
    }

    /* JADX INFO: renamed from: o */
    public final int m33226o(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                return RangesKt.coerceAtLeast(i11, size);
            }
            return i11;
        }
        return RangesKt.coerceAtMost(i11, size);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        this.f28620d = w11;
        this.f28621e = h11;
        m33214b();
        m33224m();
    }

    /* JADX INFO: renamed from: p */
    public final int m33227p(int i11) {
        return m33226o(getRealWidth(), i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28622f = new TextPaint();
        this.f28624h = new RectF();
        this.f28625i = LazyKt.lazy(new Function0() { // from class: ul.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(IndexBar.m33213l(this.f101801b));
            }
        });
        this.f28630n = new TextPaint();
        this.f28633q = "";
        this.f28634r = new Path();
        this.f28635s = 50;
        this.f28637u = new Paint();
        this.f28641y = -1;
        this.f28616A = new Paint();
        m33219g(context, attributeSet, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28622f = new TextPaint();
        this.f28624h = new RectF();
        this.f28625i = LazyKt.lazy(new Function0() { // from class: ul.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(IndexBar.m33213l(this.f101801b));
            }
        });
        this.f28630n = new TextPaint();
        this.f28633q = "";
        this.f28634r = new Path();
        this.f28635s = 50;
        this.f28637u = new Paint();
        this.f28641y = -1;
        this.f28616A = new Paint();
        m33219g(context, attributeSet, i11);
    }
}
