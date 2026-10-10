package com.kubi.home.gembox;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GemboxContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetHeatListIntent", "JumpToRn", "TrackClickIntent", "BindGemboxData", "Lcom/kubi/home/gembox/GemboxContract$UiIntent$BindGemboxData;", "Lcom/kubi/home/gembox/GemboxContract$UiIntent$GetHeatListIntent;", "Lcom/kubi/home/gembox/GemboxContract$UiIntent$JumpToRn;", "Lcom/kubi/home/gembox/GemboxContract$UiIntent$TrackClickIntent;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class GemboxContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: GemboxContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxContract$UiIntent$BindGemboxData;", "Lcom/kubi/home/gembox/GemboxContract$UiIntent;", "data", "Lcom/kubi/home/gembox/GemboxCardData;", "<init>", "(Lcom/kubi/home/gembox/GemboxCardData;)V", "getData", "()Lcom/kubi/home/gembox/GemboxCardData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BindGemboxData extends GemboxContract$UiIntent {

        @NotNull
        private final GemboxCardData data;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindGemboxData) && Intrinsics.areEqual(this.data, ((BindGemboxData) other).data);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindGemboxData(@NotNull GemboxCardData data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        @NotNull
        public final GemboxCardData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "BindGemboxData(data=" + this.data + ')';
        }
    }

    /* JADX INFO: compiled from: GemboxContract.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxContract$UiIntent$GetHeatListIntent;", "Lcom/kubi/home/gembox/GemboxContract$UiIntent;", "heatValue", "", BridgeParamKeyKt.MAX_COUNT, "", "<init>", "(FI)V", "getHeatValue", "()F", "getMaxCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GetHeatListIntent extends GemboxContract$UiIntent {
        private final float heatValue;
        private final int maxCount;

        public GetHeatListIntent(float f11, int i11) {
            super(null);
            this.heatValue = f11;
            this.maxCount = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetHeatListIntent)) {
                return false;
            }
            GetHeatListIntent getHeatListIntent = (GetHeatListIntent) other;
            return Float.compare(this.heatValue, getHeatListIntent.heatValue) == 0 && this.maxCount == getHeatListIntent.maxCount;
        }

        public final float getHeatValue() {
            return this.heatValue;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public int hashCode() {
            return (Float.hashCode(this.heatValue) * 31) + Integer.hashCode(this.maxCount);
        }

        @NotNull
        public String toString() {
            return "GetHeatListIntent(heatValue=" + this.heatValue + ", maxCount=" + this.maxCount + ')';
        }
    }

    /* JADX INFO: compiled from: GemboxContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxContract$UiIntent$JumpToRn;", "Lcom/kubi/home/gembox/GemboxContract$UiIntent;", "<init>", "()V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class JumpToRn extends GemboxContract$UiIntent {

        @NotNull
        public static final JumpToRn INSTANCE = new JumpToRn();

        private JumpToRn() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: GemboxContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxContract$UiIntent$TrackClickIntent;", "Lcom/kubi/home/gembox/GemboxContract$UiIntent;", "<init>", "()V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class TrackClickIntent extends GemboxContract$UiIntent {

        @NotNull
        public static final TrackClickIntent INSTANCE = new TrackClickIntent();

        private TrackClickIntent() {
            super(null);
        }
    }

    public /* synthetic */ GemboxContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GemboxContract$UiIntent() {
    }
}
