package rb0;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rb0.n */
/* JADX INFO: compiled from: PinchGestureHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010*\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m90084d2 = {"Lrb0/n;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "h0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "", "force", "j", "(Z)V", "k0", "p0", "", "value", "N", "D", "Z0", "()D", "scale", "O", ICustomDataEditor.STRING_ARRAY_PARAM_1, "velocity", "", "P", "F", "X0", "()F", "focalPointX", "Q", "Y0", "focalPointY", "Lrb0/o;", "R", "Lrb0/o;", "scaleGestureDetector", ExifInterface.LATITUDE_SOUTH, "startingSpan", ExifInterface.GPS_DIRECTION_TRUE, "spanSlop", "Lrb0/o$b;", "U", "Lrb0/o$b;", "gestureListener", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43980n extends GestureHandler<C43980n> {

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public double scale;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public double velocity;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    public C43981o scaleGestureDetector;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public float startingSpan;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public float spanSlop;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public float focalPointX = Float.NaN;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public float focalPointY = Float.NaN;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final C43981o.b gestureListener = new a();

    /* JADX INFO: renamed from: rb0.n$a */
    /* JADX INFO: compiled from: PinchGestureHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"rb0/n$a", "Lrb0/o$b;", "Lrb0/o;", "detector", "", "b", "(Lrb0/o;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "c", "(Lrb0/o;)V", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a implements C43981o.b {
        public a() {
            C43980n.this.m71737E0(false);
        }

        @Override // rb0.C43981o.b
        /* JADX INFO: renamed from: a */
        public boolean mo96923a(C43981o detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            C43980n.this.startingSpan = detector.m96929d();
            return true;
        }

        @Override // rb0.C43981o.b
        /* JADX INFO: renamed from: b */
        public boolean mo96924b(C43981o detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double scale = C43980n.this.getScale();
            C43980n c43980n = C43980n.this;
            c43980n.scale = c43980n.getScale() * ((double) detector.m96932g());
            double dM96934i = detector.m96934i();
            if (dM96934i > 0.0d) {
                C43980n c43980n2 = C43980n.this;
                c43980n2.velocity = (c43980n2.getScale() - scale) / dM96934i;
            }
            if (Math.abs(C43980n.this.startingSpan - detector.m96929d()) < C43980n.this.spanSlop || C43980n.this.getState() != 2) {
                return true;
            }
            C43980n.this.m71778i();
            return true;
        }

        @Override // rb0.C43981o.b
        /* JADX INFO: renamed from: c */
        public void mo96925c(C43981o detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: k0 */
    public void mo71717k0() {
        this.scaleGestureDetector = null;
        this.focalPointX = Float.NaN;
        this.focalPointY = Float.NaN;
        mo71790p0();
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final float getFocalPointX() {
        return this.focalPointX;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final float getFocalPointY() {
        return this.focalPointY;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final double getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: a1, reason: from getter */
    public final double getVelocity() {
        return this.velocity;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: h0 */
    public void mo71715h0(@NotNull MotionEvent event, @NotNull MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (getState() == 0) {
            View view = getCom.tencent.qcloud.tuicore.TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW java.lang.String();
            Intrinsics.checkNotNull(view);
            Context context = view.getContext();
            mo71790p0();
            this.scaleGestureDetector = new C43981o(context, this.gestureListener);
            this.spanSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.focalPointX = event.getX();
            this.focalPointY = event.getY();
            m71786n();
        }
        C43981o c43981o = this.scaleGestureDetector;
        if (c43981o != null) {
            c43981o.m96936k(sourceEvent);
        }
        C43981o c43981o2 = this.scaleGestureDetector;
        if (c43981o2 != null) {
            PointF pointFM71757O0 = m71757O0(new PointF(c43981o2.m96930e(), c43981o2.m96931f()));
            this.focalPointX = pointFM71757O0.x;
            this.focalPointY = pointFM71757O0.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (getState() == 4) {
                m71808z();
            } else {
                m71730B();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: p0 */
    public void mo71790p0() {
        this.velocity = 0.0d;
        this.scale = 1.0d;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    /* JADX INFO: renamed from: j */
    public void mo71716j(boolean force) {
        if (getState() != 4) {
            mo71790p0();
        }
        super.mo71716j(force);
    }
}
