package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006 "}, m90084d2 = {"Lcom/kubi/otc/entity/FastQuotesModel;", "Landroid/os/Parcelable;", "quotes", "", "Lcom/kubi/otc/entity/FastQuoteModel;", "selectQuote", "<init>", "(Ljava/util/List;Lcom/kubi/otc/entity/FastQuoteModel;)V", "getQuotes", "()Ljava/util/List;", "getSelectQuote", "()Lcom/kubi/otc/entity/FastQuoteModel;", "setSelectQuote", "(Lcom/kubi/otc/entity/FastQuoteModel;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastQuotesModel implements Parcelable {

    @NotNull
    public static final String SIDE_BUY = "BUY";

    @NotNull
    public static final String SIDE_SELL = "SELL";

    @Nullable
    private final List<FastQuoteModel> quotes;

    @Nullable
    private FastQuoteModel selectQuote;

    @NotNull
    public static final Parcelable.Creator<FastQuotesModel> CREATOR = new Creator();

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastQuotesModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastQuotesModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(FastQuoteModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new FastQuotesModel(arrayList, parcel.readInt() != 0 ? FastQuoteModel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastQuotesModel[] newArray(int i11) {
            return new FastQuotesModel[i11];
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
        if (!(other instanceof FastQuotesModel)) {
            return false;
        }
        FastQuotesModel fastQuotesModel = (FastQuotesModel) other;
        return Intrinsics.areEqual(this.quotes, fastQuotesModel.quotes) && Intrinsics.areEqual(this.selectQuote, fastQuotesModel.selectQuote);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FastQuotesModel copy$default(FastQuotesModel fastQuotesModel, List list, FastQuoteModel fastQuoteModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = fastQuotesModel.quotes;
        }
        if ((i11 & 2) != 0) {
            fastQuoteModel = fastQuotesModel.selectQuote;
        }
        return fastQuotesModel.copy(list, fastQuoteModel);
    }

    @Nullable
    public final List<FastQuoteModel> component1() {
        return this.quotes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FastQuoteModel getSelectQuote() {
        return this.selectQuote;
    }

    @NotNull
    public final FastQuotesModel copy(@Nullable List<FastQuoteModel> quotes, @Nullable FastQuoteModel selectQuote) {
        return new FastQuotesModel(quotes, selectQuote);
    }

    @Nullable
    public final List<FastQuoteModel> getQuotes() {
        return this.quotes;
    }

    @Nullable
    public final FastQuoteModel getSelectQuote() {
        return this.selectQuote;
    }

    public int hashCode() {
        List<FastQuoteModel> list = this.quotes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        FastQuoteModel fastQuoteModel = this.selectQuote;
        return iHashCode + (fastQuoteModel != null ? fastQuoteModel.hashCode() : 0);
    }

    public final void setSelectQuote(@Nullable FastQuoteModel fastQuoteModel) {
        this.selectQuote = fastQuoteModel;
    }

    @NotNull
    public String toString() {
        return "FastQuotesModel(quotes=" + this.quotes + ", selectQuote=" + this.selectQuote + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<FastQuoteModel> list = this.quotes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<FastQuoteModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        FastQuoteModel fastQuoteModel = this.selectQuote;
        if (fastQuoteModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fastQuoteModel.writeToParcel(dest, flags);
        }
    }

    public FastQuotesModel(@Nullable List<FastQuoteModel> list, @Nullable FastQuoteModel fastQuoteModel) {
        this.quotes = list;
        this.selectQuote = fastQuoteModel;
    }
}
