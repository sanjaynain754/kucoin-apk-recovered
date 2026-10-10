package io.trtc.tuikit.atomicx.widget.basicwidget.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import cg0.C4968b;
import io.trtc.tuikit.atomicx.theme.ThemeStore;
import io.trtc.tuikit.atomicx.theme.tokens.ColorTokens;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicAvatar.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 +2\u00020\u0001:\u0002+,B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0014J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020\u001dH\u0014J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020\u001dH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/Badge;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "themeStore", "Lio/trtc/tuikit/atomicx/theme/ThemeStore;", "backgroundColor", "textColor", "backgroundPaint", "Landroid/graphics/Paint;", "textPaint", "badgeType", "Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/Badge$BadgeType;", "badgeText", "", "rectF", "Landroid/graphics/RectF;", "cachedDotSize", "cachedTextHeight", "cachedTextPadding", "cachedCornerRadius", "", "setType", "", "type", "setText", "text", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onAttachedToWindow", "drawDot", "drawTextBadge", "updateColors", "Companion", "BadgeType", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class Badge extends View {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f87481n = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ThemeStore f87482b;

    /* JADX INFO: renamed from: c */
    public int f87483c;

    /* JADX INFO: renamed from: d */
    public int f87484d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Paint f87485e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Paint f87486f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public BadgeType f87487g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public String f87488h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final RectF f87489i;

    /* JADX INFO: renamed from: j */
    public int f87490j;

    /* JADX INFO: renamed from: k */
    public int f87491k;

    /* JADX INFO: renamed from: l */
    public int f87492l;

    /* JADX INFO: renamed from: m */
    public float f87493m;

    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/Badge$BadgeType;", "", "<init>", "(Ljava/lang/String;I)V", "Dot", "Text", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum BadgeType {
        Dot,
        Text;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f87495c = EnumEntriesKt.enumEntries(m88122a());

        @NotNull
        public static EnumEntries<BadgeType> getEntries() {
            return f87495c;
        }
    }

    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/widget/basicwidget/avatar/Badge$Companion;", "", "<init>", "()V", "DOT_SIZE_DP", "", "TEXT_HEIGHT_DP", "TEXT_HORIZONTAL_PADDING_DP", "TEXT_CORNER_RADIUS_DP", "TEXT_SIZE_SP", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ Badge(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: io.trtc.tuikit.atomicx.widget.basicwidget.avatar.Badge$a */
    /* JADX INFO: compiled from: AtomicAvatar.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C39366a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeType.values().length];
            try {
                iArr[BadgeType.Dot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeType.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Badge(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87482b = ThemeStore.f87316e.shared(context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f87485e = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(TypedValue.applyDimension(2, 12.0f, getResources().getDisplayMetrics()));
        paint2.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.f87486f = paint2;
        this.f87487g = BadgeType.Text;
        this.f87488h = "";
        this.f87489i = new RectF();
        this.f87490j = C4968b.m5262a(context, 8.0f);
        this.f87491k = C4968b.m5262a(context, 16.0f);
        this.f87492l = C4968b.m5262a(context, 10.0f);
        this.f87493m = C4968b.m5262a(context, 8.0f);
        m88121e();
    }

    /* JADX INFO: renamed from: a */
    public final void m88117a(Canvas canvas) {
        this.f87485e.setColor(this.f87483c);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, this.f87485e);
    }

    /* JADX INFO: renamed from: b */
    public final void m88118b(Canvas canvas) {
        this.f87485e.setColor(this.f87483c);
        this.f87489i.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.f87489i;
        float f11 = this.f87493m;
        canvas.drawRoundRect(rectF, f11, f11, this.f87485e);
        this.f87486f.setColor(this.f87484d);
        canvas.drawText(this.f87488h, getWidth() / 2.0f, (getHeight() / 2.0f) - ((this.f87486f.descent() + this.f87486f.ascent()) / 2), this.f87486f);
    }

    /* JADX INFO: renamed from: e */
    public final void m88121e() {
        ColorTokens color = this.f87482b.m87980c().getValue().getCurrentTheme().getTokens().getColor();
        this.f87483c = color.getTextColorError();
        this.f87484d = color.getTextColorButton();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i11 = C39366a.$EnumSwitchMapping$0[this.f87487g.ordinal()];
        if (i11 == 1) {
            m88117a(canvas);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f87488h.length() > 0) {
                m88118b(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11 = C39366a.$EnumSwitchMapping$0[this.f87487g.ordinal()];
        if (i11 == 1) {
            int i12 = this.f87490j;
            setMeasuredDimension(i12, i12);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f87488h.length() == 0) {
                setMeasuredDimension(0, 0);
            } else {
                setMeasuredDimension((int) (((float) Math.ceil(this.f87486f.measureText(this.f87488h))) + this.f87492l), this.f87491k);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m88119c(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (!Intrinsics.areEqual(this.f87488h, text)) {
            this.f87488h = text;
            requestLayout();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m88120d(@NotNull BadgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f87487g != type) {
            this.f87487g = type;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m88121e();
    }
}
