package com.kubi.transfer.batch;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.transfer.entity.Currency;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BatchTransferContract.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/transfer/batch/BatchTransferContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchCoinList", "Transfer", "Lcom/kubi/transfer/batch/BatchTransferContract$UiIntent$FetchCoinList;", "Lcom/kubi/transfer/batch/BatchTransferContract$UiIntent$Transfer;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BatchTransferContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: BatchTransferContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/transfer/batch/BatchTransferContract$UiIntent$FetchCoinList;", "Lcom/kubi/transfer/batch/BatchTransferContract$UiIntent;", "fromType", "", "toType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFromType", "()Ljava/lang/String;", "getToType", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchCoinList extends BatchTransferContract$UiIntent {

        @Nullable
        private final String fromType;

        @Nullable
        private final String toType;

        public FetchCoinList(@Nullable String str, @Nullable String str2) {
            super(null);
            this.fromType = str;
            this.toType = str2;
        }

        @Nullable
        public final String getFromType() {
            return this.fromType;
        }

        @Nullable
        public final String getToType() {
            return this.toType;
        }
    }

    /* JADX INFO: compiled from: BatchTransferContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/transfer/batch/BatchTransferContract$UiIntent$Transfer;", "Lcom/kubi/transfer/batch/BatchTransferContract$UiIntent;", "paramList", "", "Lcom/kubi/transfer/entity/Currency;", "<init>", "(Ljava/util/List;)V", "getParamList", "()Ljava/util/List;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Transfer extends BatchTransferContract$UiIntent {

        @NotNull
        private final List<Currency> paramList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transfer(@NotNull List<Currency> paramList) {
            super(null);
            Intrinsics.checkNotNullParameter(paramList, "paramList");
            this.paramList = paramList;
        }

        @NotNull
        public final List<Currency> getParamList() {
            return this.paramList;
        }
    }

    public /* synthetic */ BatchTransferContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BatchTransferContract$UiIntent() {
    }
}
