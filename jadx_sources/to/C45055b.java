package to;

import android.text.TextUtils;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.log.core.C17473a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import so.InterfaceC44530a;
import so.InterfaceC44531b;

/* JADX INFO: renamed from: to.b */
/* JADX INFO: compiled from: LogProcessor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lto/b;", "Lso/b;", "<init>", "()V", "", "priority", "type", "", "tag", "msg", "", "throwable", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45055b implements InterfaceC44531b {
    @Override // so.InterfaceC44531b
    /* JADX INFO: renamed from: a */
    public void mo98544a(int priority, int type, @NotNull String tag, @Nullable String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        String strM99652b = m99652b(msg, throwable);
        for (InterfaceC44530a interfaceC44530a : C17473a.f32591a.m37856a().m37836c()) {
            if (interfaceC44530a.mo57204a()) {
                interfaceC44530a.mo57205b(priority, type, tag, strM99652b);
            } else {
                interfaceC44530a.mo57205b(priority, type, tag, msg == null ? "empty message" : msg);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m99652b(String msg, Throwable throwable) {
        if (throwable != null && !TextUtils.isEmpty(msg)) {
            return msg + " : " + Log.getStackTraceString(throwable);
        }
        if (throwable == null || !TextUtils.isEmpty(msg)) {
            return msg == null ? "empty message" : msg;
        }
        String stackTraceString = Log.getStackTraceString(throwable);
        Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(throwable)");
        return stackTraceString;
    }
}
