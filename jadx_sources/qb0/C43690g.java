package qb0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qb0.g */
/* JADX INFO: compiled from: ReactContextExtensions.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/uimanager/events/Event;", "event", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/uimanager/events/Event;)V", "react-native-gesture-handler_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43690g {
    /* JADX INFO: renamed from: a */
    public static final void m96204a(@NotNull ReactContext reactContext, @NotNull Event<?> event) {
        Intrinsics.checkNotNullParameter(reactContext, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
        Intrinsics.checkNotNull(uIManager, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        ((FabricUIManager) uIManager).getEventDispatcher().dispatchEvent(event);
    }
}
