package p242ew;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p213dw.C36985a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ew.d */
/* JADX INFO: compiled from: SkeletonMask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001f\u001a\u00020\u0010H\u0014J\b\u0010 \u001a\u00020\u0016H\u0014J\b\u0010!\u001a\u00020\u001bH\u0014J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020'J(\u0010*\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020'H\u0002J(\u00100\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020'H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010.\u001a\u00020\u0003H\u0002J(\u00103\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020'H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, m90084d2 = {"Lcom/kubi/resources/shimmer/mask/SkeletonMask;", "Lcom/kubi/resources/shimmer/mask/SkeletonMaskable;", "parent", "Landroid/view/View;", "color", "", "<init>", "(Landroid/view/View;I)V", "getParent", "()Landroid/view/View;", "value", "getColor", "()I", "setColor", "(I)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "bitmap$delegate", "Lkotlin/Lazy;", "canvas", "Landroid/graphics/Canvas;", "getCanvas", "()Landroid/graphics/Canvas;", "canvas$delegate", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "createBitmap", "createCanvas", "createPaint", "draw", "", "rectF", "Landroid/graphics/RectF;", "cornerRadius", "", "rect", "Landroid/graphics/Rect;", "mask", "viewGroup", "Landroid/view/ViewGroup;", "maskCornerRadius", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "root", "maskViewIfValid", "isValid", "", "maskView", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSkeletonMask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkeletonMask.kt\ncom/kubi/resources/shimmer/mask/SkeletonMask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1#2:107\n1869#3,2:108\n*S KotlinDebug\n*F\n+ 1 SkeletonMask.kt\ncom/kubi/resources/shimmer/mask/SkeletonMask\n*L\n58#1:108,2\n*E\n"})
public abstract class AbstractC37270d implements InterfaceC37274h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final View f82638a;

    /* JADX INFO: renamed from: b */
    public int f82639b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f82640c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f82641d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f82642e;

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract Paint mo83420h();

    public AbstractC37270d(@NotNull View parent, @ColorInt int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f82638a = parent;
        this.f82639b = i11;
        this.f82640c = LazyKt.lazy(new Function0() { // from class: ew.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC37270d.m83415d(this.f82635b);
            }
        });
        this.f82641d = LazyKt.lazy(new Function0() { // from class: ew.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC37270d.m83416e(this.f82636b);
            }
        });
        this.f82642e = LazyKt.lazy(new Function0() { // from class: ew.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC37270d.m83417v(this.f82637b);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public Bitmap m83418f() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f82638a.getWidth(), this.f82638a.getHeight(), Bitmap.Config.ALPHA_8);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public Canvas m83419g() {
        return new Canvas(m83424l());
    }

    /* JADX INFO: renamed from: i */
    public final void m83421i(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawBitmap(m83424l(), 0.0f, 0.0f, m83427o());
    }

    /* JADX INFO: renamed from: l */
    public final Bitmap m83424l() {
        return (Bitmap) this.f82640c.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final Canvas m83425m() {
        return (Canvas) this.f82641d.getValue();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getF82639b() {
        return this.f82639b;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final Paint m83427o() {
        return (Paint) this.f82642e.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final View getF82638a() {
        return this.f82638a;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m83429q(View view) {
        if ((view instanceof RecyclerView) || (view instanceof ViewPager2)) {
            C36985a.m82805c("Passing ViewGroup with reusable children to SkeletonLayout - consider using applySkeleton() instead");
            return true;
        }
        if (!(view instanceof Space)) {
            return true;
        }
        C36985a.m82805c("Skipping Space during masking process");
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m83430r(View view, ViewGroup viewGroup, Paint paint, float f11) {
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup2 == null) {
            m83433u(view, viewGroup, paint, f11);
            return;
        }
        Iterator<T> it = C36985a.m82807e(viewGroup2).iterator();
        while (it.hasNext()) {
            m83430r((View) it.next(), viewGroup, paint, f11);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m83431s(@NotNull ViewGroup viewGroup, float f11) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setAntiAlias(f11 > 0.0f);
        m83430r(viewGroup, viewGroup, paint, f11);
    }

    /* JADX INFO: renamed from: t */
    public final void m83432t(View view, ViewGroup viewGroup, Paint paint, float f11) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        if (f11 > 0.0f) {
            m83423k(new RectF(rect.left, rect.top, rect.right, rect.bottom), f11, paint);
        } else {
            m83422j(rect, paint);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Bitmap m83415d(AbstractC37270d abstractC37270d) {
        return abstractC37270d.m83418f();
    }

    /* JADX INFO: renamed from: e */
    public static final Canvas m83416e(AbstractC37270d abstractC37270d) {
        return abstractC37270d.m83419g();
    }

    /* JADX INFO: renamed from: v */
    public static final Paint m83417v(AbstractC37270d abstractC37270d) {
        return abstractC37270d.mo83420h();
    }

    /* JADX INFO: renamed from: j */
    public final void m83422j(Rect rect, Paint paint) {
        m83425m().drawRect(rect, paint);
    }

    /* JADX INFO: renamed from: k */
    public final void m83423k(RectF rectF, float f11, Paint paint) {
        m83425m().drawRoundRect(rectF, f11, f11, paint);
    }

    /* JADX INFO: renamed from: u */
    public final void m83433u(View view, ViewGroup viewGroup, Paint paint, float f11) {
        if (m83429q(view)) {
            m83432t(view, viewGroup, paint, f11);
        }
    }
}
