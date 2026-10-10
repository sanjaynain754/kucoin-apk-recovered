package p524p3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.bolts.Task;
import com.google.firebase.messaging.Constants;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: p3.m */
/* JADX INFO: compiled from: TaskCompletionSource.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00102\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lp3/m;", "TResult", "", "<init>", "()V", "", "e", "()Z", DbParams.KEY_CHANNEL_RESULT, "g", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "f", "(Ljava/lang/Exception;)Z", "", "b", "d", "(Ljava/lang/Object;)V", "c", "(Ljava/lang/Exception;)V", "Lcom/facebook/bolts/Task;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/bolts/Task;", "()Lcom/facebook/bolts/Task;", "task", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTaskCompletionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskCompletionSource.kt\ncom/facebook/bolts/TaskCompletionSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public class C43378m<TResult> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Task<TResult> task = new Task<>();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Task<TResult> m95534a() {
        return this.task;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95538e() {
        return this.task.m8420z();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m95539f(@Nullable Exception error) {
        return this.task.m8406A(error);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m95540g(@Nullable TResult result) {
        return this.task.m8407B(result);
    }

    /* JADX INFO: renamed from: b */
    public final void m95535b() {
        if (m95538e()) {
        } else {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m95536c(@Nullable Exception error) {
        if (m95539f(error)) {
        } else {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m95537d(@Nullable TResult result) {
        if (m95540g(result)) {
        } else {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
