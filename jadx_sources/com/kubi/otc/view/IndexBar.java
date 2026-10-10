package com.kubi.otc.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$color;
import com.kubi.otc.R$styleable;
import com.kubi.utils.extensions.C27025c;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IndexBar.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001.B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J(\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0014J\b\u0010(\u001a\u00020\u0019H\u0002J\u000e\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0017J\u0014\u0010+\u001a\u00020\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140-R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/otc/view/IndexBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mWidth", "", "mHeight", "mPaint", "Landroid/graphics/Paint;", "mPressColor", "mGap", "", "mOffset", "mIndexStrings", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mListener", "Lcom/kubi/otc/view/IndexBar$IndexBarListener;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "computeGap", "setListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setIndexList", "list", "", "IndexBarListener", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIndexBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBar.kt\ncom/kubi/otc/view/IndexBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1869#2,2:186\n1878#2,3:188\n*S KotlinDebug\n*F\n+ 1 IndexBar.kt\ncom/kubi/otc/view/IndexBar\n*L\n73#1:186,2\n97#1:188,3\n*E\n"})
public final class IndexBar extends View {

    /* JADX INFO: renamed from: b */
    public int f38152b;

    /* JADX INFO: renamed from: c */
    public int f38153c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public Paint f38154d;

    /* JADX INFO: renamed from: e */
    public int f38155e;

    /* JADX INFO: renamed from: f */
    public float f38156f;

    /* JADX INFO: renamed from: g */
    public final int f38157g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public ArrayList<String> f38158h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public InterfaceC20287a f38159i;

    /* JADX INFO: renamed from: com.kubi.otc.view.IndexBar$a */
    /* JADX INFO: compiled from: IndexBar.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/otc/view/IndexBar$IndexBarListener;", "", "onPress", "", "pos", "", "index", "", "onRelease", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC20287a {
        /* JADX INFO: renamed from: a */
        void mo45027a(int i11, @NotNull String str);

        void onRelease();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexBar(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38157g = 12;
        this.f38158h = new ArrayList<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_IndexBar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_IndexBar_kucoin_ib_text_color, ContextCompat.getColor(context, R$color.primary));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.kucoin_IndexBar_kucoin_ib_text_size, (int) C27025c.m66568f(context, 12));
        this.f38155e = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_IndexBar_kucoin_ib_press_color, ContextCompat.getColor(context, R$color.c_large));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setTextSize(dimensionPixelSize);
        paint.setAntiAlias(true);
        this.f38154d = paint;
    }

    /* JADX INFO: renamed from: a */
    public final void m45522a() {
        this.f38156f = ((this.f38153c - getPaddingTop()) - getPaddingBottom()) / this.f38158h.size();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i11 = 0;
        for (Object obj : this.f38158h) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            float f11 = 2;
            canvas.drawText(str, (this.f38152b - this.f38154d.measureText(str)) / f11, getPaddingTop() + (this.f38156f * i11) + (((this.f38156f - this.f38154d.getFontMetrics().bottom) - this.f38154d.getFontMetrics().top) / f11), this.f38154d);
            i11 = i12;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 2)) {
            if (event.getAction() == 0) {
                setBackgroundColor(this.f38155e);
            }
            int y11 = (int) ((event.getY() - getPaddingTop()) / this.f38156f);
            if (y11 < 0) {
                y11 = 0;
            } else if (y11 >= this.f38158h.size()) {
                y11 = this.f38158h.size() - 1;
            }
            InterfaceC20287a interfaceC20287a = this.f38159i;
            if (interfaceC20287a != null) {
                String str = this.f38158h.get(y11);
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                interfaceC20287a.mo45027a(y11, str);
            }
        } else {
            setBackgroundColor(ContextCompat.getColor(getContext(), R$color.c_transparent));
            InterfaceC20287a interfaceC20287a2 = this.f38159i;
            if (interfaceC20287a2 != null) {
                interfaceC20287a2.onRelease();
            }
        }
        return true;
    }

    public final void setIndexList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f38158h.clear();
        if (list.isEmpty()) {
            this.f38158h.addAll(CollectionsKt.arrayListOf(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", RunnableC33958ua.f72251f));
        } else {
            this.f38158h.addAll(list);
        }
        m45522a();
    }

    public final void setListener(@NotNull InterfaceC20287a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38159i = listener;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Rect rect = new Rect();
        int iMax = 0;
        int iMin = 0;
        for (String str : this.f38158h) {
            this.f38154d.getTextBounds(str, 0, str.length(), rect);
            iMin = Math.max(rect.width() + this.f38157g, iMin);
            iMax = Math.max(rect.height() + this.f38157g, iMax);
        }
        int size = iMax * this.f38158h.size();
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                iMin = View.MeasureSpec.getSize(widthMeasureSpec);
            }
        } else {
            iMin = Math.min(iMin, View.MeasureSpec.getSize(widthMeasureSpec));
        }
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                size = View.MeasureSpec.getSize(heightMeasureSpec);
            }
        } else {
            size = Math.min(size, View.MeasureSpec.getSize(heightMeasureSpec));
        }
        setMeasuredDimension(iMin, size);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        this.f38152b = w11;
        this.f38153c = h11;
        m45522a();
    }
}
