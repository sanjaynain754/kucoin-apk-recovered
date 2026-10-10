package qb0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qb0.h */
/* JADX INFO: compiled from: ReanimatedEventDispatcher.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lqb0/h;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/events/Event;", ExifInterface.GPS_DIRECTION_TRUE, "event", "Lcom/facebook/react/bridge/ReactContext;", "reactApplicationContext", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/react/uimanager/events/Event;Lcom/facebook/react/bridge/ReactContext;)V", "Lcom/swmansion/reanimated/ReanimatedModule;", "Lcom/swmansion/reanimated/ReanimatedModule;", "reanimatedModule", "react-native-gesture-handler_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43691h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ReanimatedModule reanimatedModule;

    /* JADX INFO: renamed from: a */
    public final <T extends Event<T>> void m96205a(@NotNull T event, @NotNull ReactContext reactApplicationContext) {
        NodesManager nodesManager;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        if (this.reanimatedModule == null) {
            this.reanimatedModule = (ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class);
        }
        ReanimatedModule reanimatedModule = this.reanimatedModule;
        if (reanimatedModule == null || (nodesManager = reanimatedModule.getNodesManager()) == null) {
            return;
        }
        nodesManager.onEventDispatch(event);
    }
}
