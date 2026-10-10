package tb0;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.swmansion.gesturehandler.core.LongPressGestureHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tb0.d */
/* JADX INFO: compiled from: LongPressGestureHandlerEventDataBuilder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Ltb0/d;", "Ltb0/b;", "Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;", "handler", "<init>", "(Lcom/swmansion/gesturehandler/core/LongPressGestureHandler;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/react/bridge/WritableMap;)V", "", "e", "F", "x", "f", "y", "g", "absoluteX", CmcdData.Factory.STREAMING_FORMAT_HLS, "absoluteY", "", "i", "I", TypedValues.TransitionType.S_DURATION, "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44920d extends AbstractC44918b<LongPressGestureHandler> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float x;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float y;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float absoluteX;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final float absoluteY;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int duration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44920d(@NotNull LongPressGestureHandler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.x = handler.getLastAbsolutePositionX();
        this.y = handler.getLastAbsolutePositionY();
        this.absoluteX = handler.m71742H();
        this.absoluteY = handler.m71744I();
        this.duration = handler.m71878V0();
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
        eventData.putInt(TypedValues.TransitionType.S_DURATION, this.duration);
    }
}
