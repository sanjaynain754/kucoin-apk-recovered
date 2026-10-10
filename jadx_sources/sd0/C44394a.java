package sd0;

import cd0.InterfaceC4937c;
import com.facebook.react.uimanager.ViewProps;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sd0.a */
/* JADX INFO: compiled from: BarrageViewTypeDelegate.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/view/BarrageViewTypeDelegate;", "Lcom/trtc/uikit/livekit/component/barrage/view/adapter/BarrageItemTypeDelegate;", "<init>", "()V", "getItemType", "", ViewProps.POSITION, "barrage", "Lio/trtc/tuikit/atomicxcore/api/barrage/Barrage;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44394a implements InterfaceC4937c {
    @Override // cd0.InterfaceC4937c
    /* JADX INFO: renamed from: a */
    public int mo5170a(int i11, @NotNull Barrage barrage) {
        Intrinsics.checkNotNullParameter(barrage, "barrage");
        return (barrage.getExtensionInfo().containsKey("gift_view_type") && Intrinsics.areEqual("1", String.valueOf(barrage.getExtensionInfo().get("gift_view_type")))) ? 1 : 0;
    }
}
