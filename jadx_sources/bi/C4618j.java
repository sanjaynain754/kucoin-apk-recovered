package bi;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.data.trade.model.PositionEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bi.j */
/* JADX INFO: compiled from: ReversePositionEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/event/ReversePositionEvent;", "", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "<init>", "(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4618j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PositionEntity f4147a;

    public C4618j(@NotNull PositionEntity position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f4147a = position;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PositionEntity getF4147a() {
        return this.f4147a;
    }
}
