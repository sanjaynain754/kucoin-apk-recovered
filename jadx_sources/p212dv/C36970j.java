package p212dv;

import com.kubi.quotefacade.entity.HoldingData;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dv.j */
/* JADX INFO: compiled from: HoldingsCommonContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/event/HoldingsCommonContract$ShowHoldingsDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", "holdingData", "Lcom/kubi/quotefacade/entity/HoldingData;", "<init>", "(Lcom/kubi/quotefacade/entity/HoldingData;)V", "getHoldingData", "()Lcom/kubi/quotefacade/entity/HoldingData;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36970j implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final HoldingData f82086a;

    /* JADX WARN: Multi-variable type inference failed */
    public C36970j() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C36970j(@Nullable HoldingData holdingData) {
        this.f82086a = holdingData;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final HoldingData getF82086a() {
        return this.f82086a;
    }

    public /* synthetic */ C36970j(HoldingData holdingData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : holdingData);
    }
}
