package rg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: rg0.a */
/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lrg0/a;", "", TUIConstants.TUIChat.OWNER, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Z", "", "d", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "b", "()Z", "isLocked", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC44082a {

    /* JADX INFO: renamed from: rg0.a$a */
    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m97141a(InterfaceC44082a interfaceC44082a, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i11 & 1) != 0) {
                obj = null;
            }
            return interfaceC44082a.mo91342a(obj);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m97142b(InterfaceC44082a interfaceC44082a, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i11 & 1) != 0) {
                obj = null;
            }
            interfaceC44082a.mo91345e(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo91342a(@Nullable Object owner);

    /* JADX INFO: renamed from: b */
    boolean mo91343b();

    @Nullable
    /* JADX INFO: renamed from: d */
    Object mo91344d(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: e */
    void mo91345e(@Nullable Object owner);
}
