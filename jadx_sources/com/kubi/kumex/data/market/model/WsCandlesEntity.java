package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import h10.C38079a;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsCandlesEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006)"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/WsCandlesEntity;", "Landroid/os/Parcelable;", "subject", "Lcom/kubi/sdk/websocket/constant/WsSubjectEnum;", "symbol", "", KlineFlutterMiniConstants.PROP_CANDLES, "", "<init>", "(Lcom/kubi/sdk/websocket/constant/WsSubjectEnum;Ljava/lang/String;[Ljava/lang/String;)V", "getSubject", "()Lcom/kubi/sdk/websocket/constant/WsSubjectEnum;", "setSubject", "(Lcom/kubi/sdk/websocket/constant/WsSubjectEnum;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getCandles", "()[Ljava/lang/String;", "setCandles", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lcom/kubi/sdk/websocket/constant/WsSubjectEnum;Ljava/lang/String;[Ljava/lang/String;)Lcom/kubi/kumex/data/market/model/WsCandlesEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsCandlesEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WsCandlesEntity> CREATOR = new C15789a();

    @NotNull
    private String[] candles;

    @NotNull
    private C38079a subject;

    @NotNull
    private String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.WsCandlesEntity$a */
    /* JADX INFO: compiled from: WsCandlesEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15789a implements Parcelable.Creator<WsCandlesEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WsCandlesEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new WsCandlesEntity(C38079a.f85724a, parcel.readString(), parcel.createStringArray());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WsCandlesEntity[] newArray(int i11) {
            return new WsCandlesEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsCandlesEntity)) {
            return false;
        }
        WsCandlesEntity wsCandlesEntity = (WsCandlesEntity) other;
        return Intrinsics.areEqual(this.subject, wsCandlesEntity.subject) && Intrinsics.areEqual(this.symbol, wsCandlesEntity.symbol) && Intrinsics.areEqual(this.candles, wsCandlesEntity.candles);
    }

    public WsCandlesEntity(@NotNull C38079a subject, @NotNull String symbol, @NotNull String[] candles) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(candles, "candles");
        this.subject = subject;
        this.symbol = symbol;
        this.candles = candles;
    }

    public static /* synthetic */ WsCandlesEntity copy$default(WsCandlesEntity wsCandlesEntity, C38079a c38079a, String str, String[] strArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c38079a = wsCandlesEntity.subject;
        }
        if ((i11 & 2) != 0) {
            str = wsCandlesEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            strArr = wsCandlesEntity.candles;
        }
        return wsCandlesEntity.copy(c38079a, str, strArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C38079a getSubject() {
        return this.subject;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String[] getCandles() {
        return this.candles;
    }

    @NotNull
    public final WsCandlesEntity copy(@NotNull C38079a subject, @NotNull String symbol, @NotNull String[] candles) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(candles, "candles");
        return new WsCandlesEntity(subject, symbol, candles);
    }

    @NotNull
    public final String[] getCandles() {
        return this.candles;
    }

    @NotNull
    public final C38079a getSubject() {
        return this.subject;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((this.subject.hashCode() * 31) + this.symbol.hashCode()) * 31) + Arrays.hashCode(this.candles);
    }

    public final void setCandles(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.candles = strArr;
    }

    public final void setSubject(@NotNull C38079a c38079a) {
        Intrinsics.checkNotNullParameter(c38079a, "<set-?>");
        this.subject = c38079a;
    }

    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    @NotNull
    public String toString() {
        return "WsCandlesEntity(subject=" + this.subject + ", symbol=" + this.symbol + ", candles=" + Arrays.toString(this.candles) + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
        dest.writeString(this.symbol);
        dest.writeStringArray(this.candles);
    }
}
