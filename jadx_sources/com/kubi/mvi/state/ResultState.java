package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.tencent.bugly.proguard.C33864ph;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResultState.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0018B)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/mvi/state/ResultState;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "resultState", "data", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "<init>", "(ILjava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getResultState", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "getExtra", "Companion", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class ResultState<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final T data;

    @Nullable
    private final Object extra;
    private final int resultState;

    /* JADX INFO: compiled from: ResultState.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0001\u0010\u000bJ\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0001\u0010\u000bJ\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0001\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u000f\u001a\u0002H\u000b¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/mvi/state/ResultState$Companion;", "", "()V", "STATE_FAIL", "", "STATE_FINISH", "STATE_IDLE", "STATE_LOADING", "STATE_SUCCESS", C33864ph.f71456b, "Lcom/kubi/mvi/state/ResultState;", ExifInterface.GPS_DIRECTION_TRUE, "finish", "loading", "success", "data", "(Ljava/lang/Object;)Lcom/kubi/mvi/state/ResultState;", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final <T> ResultState<T> fail() {
            return new ResultState<>(3, null, null, 6, null);
        }

        @NotNull
        public final <T> ResultState<T> finish() {
            return new ResultState<>(4, null, null, 6, null);
        }

        @NotNull
        public final <T> ResultState<T> loading() {
            return new ResultState<>(2, null, null, 6, null);
        }

        @NotNull
        public final <T> ResultState<T> success(T data) {
            return new ResultState<>(1, data, null, 4, null);
        }
    }

    public ResultState() {
        this(0, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultState)) {
            return false;
        }
        ResultState resultState = (ResultState) other;
        return this.resultState == resultState.resultState && Intrinsics.areEqual(this.data, resultState.data) && Intrinsics.areEqual(this.extra, resultState.extra);
    }

    public ResultState(int i11, @Nullable T t11, @Nullable Object obj) {
        this.resultState = i11;
        this.data = t11;
        this.extra = obj;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public final int getResultState() {
        return this.resultState;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.resultState) * 31;
        T t11 = this.data;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        Object obj = this.extra;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResultState(resultState=" + this.resultState + ", data=" + this.data + ", extra=" + this.extra + ')';
    }

    public /* synthetic */ ResultState(int i11, Object obj, Object obj2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : obj, (i12 & 4) != 0 ? null : obj2);
    }
}
