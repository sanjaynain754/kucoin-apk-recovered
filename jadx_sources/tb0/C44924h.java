package tb0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import rb0.C43980n;

/* JADX INFO: renamed from: tb0.h */
/* JADX INFO: compiled from: PinchGestureHandlerEventDataBuilder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0017"}, m90084d2 = {"Ltb0/h;", "Ltb0/b;", "Lrb0/n;", "handler", "<init>", "(Lrb0/n;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/react/bridge/WritableMap;)V", "", "e", "D", "scale", "", "f", "F", "focalX", "g", "focalY", CmcdData.Factory.STREAMING_FORMAT_HLS, "velocity", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44924h extends AbstractC44918b<C43980n> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final double scale;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float focalX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float focalY;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final double velocity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44924h(@NotNull C43980n handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.scale = handler.getScale();
        this.focalX = handler.getFocalPointX();
        this.focalY = handler.getFocalPointY();
        this.velocity = handler.getVelocity();
    }

    @Override // tb0.AbstractC44918b
    /* JADX INFO: renamed from: a */
    public void mo99350a(@NotNull WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.mo99350a(eventData);
        eventData.putDouble("scale", this.scale);
        eventData.putDouble("focalX", PixelUtil.toDIPFromPixel(this.focalX));
        eventData.putDouble("focalY", PixelUtil.toDIPFromPixel(this.focalY));
        eventData.putDouble("velocity", this.velocity);
    }
}
