package io.trtc.tuikit.atomicxcore.impl.view.live.layer;

import android.content.Context;
import android.widget.FrameLayout;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.layer.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C40116c extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final int f89228a;

    /* JADX INFO: renamed from: b */
    public TUILiveBattleManager.BattleUser f89229b;

    /* JADX INFO: renamed from: c */
    public WeakReference f89230c;

    /* JADX INFO: renamed from: d */
    public final C39510r f89231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40116c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int iHashCode = hashCode();
        this.f89228a = iHashCode;
        C39510r c39510rM88229a = AbstractC39398a.m88229a("ForegroundSeatView", "file", "AtomicXCore-Live", "ForegroundSeatView");
        this.f89231d = c39510rM88229a;
        String message = "ForegroundSeatView new OID:" + iHashCode;
        Intrinsics.checkNotNullParameter(message, "message");
        c39510rM88229a.m88251a(0, message);
    }

    @Nullable
    public final TUILiveBattleManager.BattleUser getBattleUser() {
        return this.f89229b;
    }
}
