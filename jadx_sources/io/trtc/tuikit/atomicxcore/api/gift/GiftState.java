package io.trtc.tuikit.atomicxcore.api.gift;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;", "", "Lkotlinx/coroutines/flow/w;", "", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "usableGifts", "<init>", "(Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "copy", "(Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/gift/GiftState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getUsableGifts", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class GiftState {

    @NotNull
    private final InterfaceC41678w<List<GiftCategory>> usableGifts;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GiftState) && Intrinsics.areEqual(this.usableGifts, ((GiftState) other).usableGifts);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftState copy$default(GiftState giftState, InterfaceC41678w interfaceC41678w, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = giftState.usableGifts;
        }
        return giftState.copy(interfaceC41678w);
    }

    @NotNull
    public final InterfaceC41678w<List<GiftCategory>> component1() {
        return this.usableGifts;
    }

    @NotNull
    public final InterfaceC41678w<List<GiftCategory>> getUsableGifts() {
        return this.usableGifts;
    }

    public int hashCode() {
        return this.usableGifts.hashCode();
    }

    @NotNull
    public String toString() {
        return AbstractC39393c.m88222a(new StringBuilder("GiftState(usableGifts="), this.usableGifts, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftState(@NotNull InterfaceC41678w<? extends List<GiftCategory>> usableGifts) {
        Intrinsics.checkNotNullParameter(usableGifts, "usableGifts");
        this.usableGifts = usableGifts;
    }

    @NotNull
    public final GiftState copy(@NotNull InterfaceC41678w<? extends List<GiftCategory>> usableGifts) {
        Intrinsics.checkNotNullParameter(usableGifts, "usableGifts");
        return new GiftState(usableGifts);
    }
}
