package com.kubi.sdk.pkg.task;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TaskStatus.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u001dB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/TaskStatus;", "", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "d", "()I", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "", "<set-?>", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "rolledBackBizList", "e", "lockedVersion", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "isSuccess", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class TaskStatus {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final TaskStatus f47431f = new TaskStatus(200, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public List<String> rolledBackBizList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String lockedVersion;

    /* JADX INFO: compiled from: TaskStatus.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tJ\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u000f\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/TaskStatus$Companion;", "", "()V", "OK", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "getOK", "()Lcom/kubi/sdk/pkg/task/TaskStatus;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "message", "", "locked", "version", DbParams.KEY_CHANNEL_RESULT, "code", "", "rollback", "bizList", "", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTaskStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStatus.kt\ncom/kubi/sdk/pkg/task/TaskStatus$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ TaskStatus result$default(Companion companion, int i11, String str, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                str = null;
            }
            return companion.result(i11, str);
        }

        @NotNull
        public final TaskStatus error(@Nullable String message) {
            return result(2000, message);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final TaskStatus locked(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            TaskStatus taskStatus = new TaskStatus(200, null, 2, 0 == true ? 1 : 0);
            taskStatus.lockedVersion = version;
            return taskStatus;
        }

        @NotNull
        public final TaskStatus result(int code, @Nullable String message) {
            return new TaskStatus(code, message, null);
        }

        @NotNull
        public final TaskStatus rollback(@NotNull List<String> bizList) {
            Intrinsics.checkNotNullParameter(bizList, "bizList");
            TaskStatus taskStatus = new TaskStatus(2002, "bundle 已回滚: " + bizList, null);
            taskStatus.rolledBackBizList = bizList;
            return taskStatus;
        }

        @NotNull
        public final TaskStatus getOK() {
            return TaskStatus.f47431f;
        }
    }

    public /* synthetic */ TaskStatus(int i11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str);
    }

    public TaskStatus(int i11, String str) {
        this.code = i11;
        this.message = str;
        this.rolledBackBizList = CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLockedVersion() {
        return this.lockedVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<String> m57806g() {
        return this.rolledBackBizList;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m57807h() {
        int i11 = this.code;
        return i11 == 200 || i11 == 201 || i11 == 1201;
    }

    public /* synthetic */ TaskStatus(int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str);
    }
}
