package tb0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.swmansion.gesturehandler.core.PanGestureHandler;
import com.swmansion.gesturehandler.core.StylusData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tb0.g */
/* JADX INFO: compiled from: PanGestureHandlerEventDataBuilder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Ltb0/g;", "Ltb0/b;", "Lcom/swmansion/gesturehandler/core/PanGestureHandler;", "handler", "<init>", "(Lcom/swmansion/gesturehandler/core/PanGestureHandler;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/react/bridge/WritableMap;)V", "", "e", "F", "x", "f", "y", "g", "absoluteX", CmcdData.Factory.STREAMING_FORMAT_HLS, "absoluteY", "i", "translationX", "j", "translationY", "k", "velocityX", CmcdData.Factory.STREAM_TYPE_LIVE, "velocityY", "Lcom/swmansion/gesturehandler/core/StylusData;", "m", "Lcom/swmansion/gesturehandler/core/StylusData;", "stylusData", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44923g extends AbstractC44918b<PanGestureHandler> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float x;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float y;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float absoluteX;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final float absoluteY;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float translationX;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final float translationY;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final float velocityX;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final float velocityY;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final StylusData stylusData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44923g(@NotNull PanGestureHandler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.x = handler.getLastAbsolutePositionX();
        this.y = handler.getLastAbsolutePositionY();
        this.absoluteX = handler.m71742H();
        this.absoluteY = handler.m71744I();
        this.translationX = handler.m71905V0();
        this.translationY = handler.m71906W0();
        this.velocityX = handler.getVelocityX();
        this.velocityY = handler.getVelocityY();
        this.stylusData = handler.getStylusData();
    }

    @Override // tb0.AbstractC44918b
    /* JADX INFO: renamed from: a */
    public void mo99350a(@NotNull WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.mo99350a(eventData);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.x));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.y));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.absoluteX));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.absoluteY));
        eventData.putDouble("translationX", PixelUtil.toDIPFromPixel(this.translationX));
        eventData.putDouble("translationY", PixelUtil.toDIPFromPixel(this.translationY));
        eventData.putDouble("velocityX", PixelUtil.toDIPFromPixel(this.velocityX));
        eventData.putDouble("velocityY", PixelUtil.toDIPFromPixel(this.velocityY));
        if (this.stylusData.getPressure() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.stylusData.m71939b());
    }
}
