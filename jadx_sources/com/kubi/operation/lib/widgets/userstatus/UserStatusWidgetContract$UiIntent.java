package com.kubi.operation.lib.widgets.userstatus;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: UserStatusWidgetContract.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "LoadData", "CountDownFinish", "ApplyJoinTask", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$ApplyJoinTask;", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$CountDownFinish;", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$LoadData;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class UserStatusWidgetContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: UserStatusWidgetContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$ApplyJoinTask;", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent;", "taskId", "", "<init>", "(Ljava/lang/String;)V", "getTaskId", "()Ljava/lang/String;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ApplyJoinTask extends UserStatusWidgetContract$UiIntent {

        @NotNull
        private final String taskId;

        @NotNull
        public final String getTaskId() {
            return this.taskId;
        }
    }

    /* JADX INFO: compiled from: UserStatusWidgetContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$CountDownFinish;", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CountDownFinish extends UserStatusWidgetContract$UiIntent {

        @NotNull
        public static final CountDownFinish INSTANCE = new CountDownFinish();

        private CountDownFinish() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof CountDownFinish);
        }

        @NotNull
        public String toString() {
            return "CountDownFinish";
        }

        public int hashCode() {
            return 415896879;
        }
    }

    /* JADX INFO: compiled from: UserStatusWidgetContract.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent$LoadData;", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UiIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadData extends UserStatusWidgetContract$UiIntent {

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
            return 795694373;
        }
    }

    public /* synthetic */ UserStatusWidgetContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserStatusWidgetContract$UiIntent() {
    }
}
