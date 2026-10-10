package tb0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.core.GestureHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tb0.b */
/* JADX INFO: compiled from: GestureHandlerEventDataBuilder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, m90084d2 = {"Ltb0/b;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", ExifInterface.GPS_DIRECTION_TRUE, "", "handler", "<init>", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/react/bridge/WritableMap;)V", "", "I", "numberOfPointers", "b", "handlerTag", "c", "state", "d", "pointerType", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC44918b<T extends GestureHandler<T>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int numberOfPointers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int handlerTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int pointerType;

    public AbstractC44918b(@NotNull T handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.numberOfPointers = handler.getNumberOfPointers();
        this.handlerTag = handler.getTag();
        this.state = handler.getState();
        this.pointerType = handler.getPointerType();
    }

    /* JADX INFO: renamed from: a */
    public void mo99350a(@NotNull WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        eventData.putInt("numberOfPointers", this.numberOfPointers);
        eventData.putInt("handlerTag", this.handlerTag);
        eventData.putInt("state", this.state);
        eventData.putInt("pointerType", this.pointerType);
    }
}
