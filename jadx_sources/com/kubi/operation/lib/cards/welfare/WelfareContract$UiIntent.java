package com.kubi.operation.lib.cards.welfare;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareContract.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "LoadData", "ApplyJoinTask", "Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UiIntent$ApplyJoinTask;", "Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UiIntent$LoadData;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class WelfareContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: WelfareContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UiIntent$ApplyJoinTask;", "Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UiIntent;", "taskId", "", "<init>", "(Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ApplyJoinTask extends WelfareContract$UiIntent {

        @NotNull
        private final String taskId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplyJoinTask(@NotNull String taskId) {
            super(null);
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            this.taskId = taskId;
        }

        @NotNull
        public final String getTaskId() {
            return this.taskId;
        }
    }

    /* JADX INFO: compiled from: WelfareContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UiIntent$LoadData;", "Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadData extends WelfareContract$UiIntent {

        @NotNull
        public static final LoadData INSTANCE = new LoadData();

        private LoadData() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof LoadData);
        }

        @NotNull
        public String toString() {
            return "LoadData";
        }

        public int hashCode() {
            return -1291564367;
        }
    }

    public /* synthetic */ WelfareContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WelfareContract$UiIntent() {
    }
}
