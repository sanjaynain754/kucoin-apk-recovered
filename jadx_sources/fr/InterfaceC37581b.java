package fr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: fr.b */
/* JADX INFO: compiled from: ICall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lfr/b;", "", "Lfr/c;", TUIConstants.TUIChat.CALL_BACK, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/c;)V", "cancel", "()V", "", "isCancelled", "()Z", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37581b {

    /* JADX INFO: renamed from: fr.b$a */
    /* JADX INFO: compiled from: ICall.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m84716a(InterfaceC37581b interfaceC37581b, InterfaceC37582c interfaceC37582c, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
            }
            if ((i11 & 1) != 0) {
                interfaceC37582c = new C37580a();
            }
            interfaceC37581b.mo42941a(interfaceC37582c);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo42941a(@NotNull InterfaceC37582c callback);

    void cancel();

    boolean isCancelled();
}
