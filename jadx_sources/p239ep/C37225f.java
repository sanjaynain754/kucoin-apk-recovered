package p239ep;

import com.kubi.margin.api.entity.FundsInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ep.f */
/* JADX INFO: compiled from: CrossPosition.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/entity/MarginCrossPositionOfOther;", "Lcom/kubi/margin/entity/MarginCrossPosition;", "funds", "Lcom/kubi/margin/api/entity/FundsInfo;", "<init>", "(Lcom/kubi/margin/api/entity/FundsInfo;)V", "getFunds", "()Lcom/kubi/margin/api/entity/FundsInfo;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37225f implements InterfaceC37221b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FundsInfo f82546a;

    public C37225f(@NotNull FundsInfo funds) {
        Intrinsics.checkNotNullParameter(funds, "funds");
        this.f82546a = funds;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FundsInfo getF82546a() {
        return this.f82546a;
    }
}
