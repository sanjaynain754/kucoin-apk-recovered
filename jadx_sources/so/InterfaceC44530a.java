package so;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: so.a */
/* JADX INFO: compiled from: ILogAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lso/a;", "", "", "priority", "type", "", "tag", "msg", "", "b", "(IILjava/lang/String;Ljava/lang/String;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "Logger-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC44530a {

    /* JADX INFO: renamed from: so.a$a */
    /* JADX INFO: compiled from: ILogAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m98543a(@NotNull InterfaceC44530a interfaceC44530a) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo57204a();

    /* JADX INFO: renamed from: b */
    void mo57205b(int priority, int type, @NotNull String tag, @NotNull String msg);
}
