package p569qq;

import androidx.annotation.MainThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qq.n */
/* JADX INFO: compiled from: TrackPageViewEvent.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lqq/n;", "", "<init>", "()V", "Lqq/f;", "", "b", "(Lqq/f;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43853n {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43853n f96923a = new C43853n();

    @JvmStatic
    @MainThread
    /* JADX INFO: renamed from: a */
    public static final void m96607a(@NotNull InterfaceC43845f interfaceC43845f) {
        Intrinsics.checkNotNullParameter(interfaceC43845f, "<this>");
        String pageId = interfaceC43845f.getPageId();
        if (pageId != null) {
            C43840a.m96551e("LCA: " + pageId + " page." + TIMPushProvider.f75063o, null, 2, null);
        }
        Iterator<InterfaceC43849j> it = C43848i.f96913a.m96587g().iterator();
        while (it.hasNext()) {
            it.next().mo42473a(interfaceC43845f, null);
        }
    }

    @JvmStatic
    @MainThread
    /* JADX INFO: renamed from: b */
    public static final void m96608b(@NotNull InterfaceC43845f interfaceC43845f) {
        Intrinsics.checkNotNullParameter(interfaceC43845f, "<this>");
        String pageId = interfaceC43845f.getPageId();
        if (pageId != null) {
            C43840a.m96551e("LCA: " + pageId + " page." + TIMPushProvider.f75062n, null, 2, null);
        }
        Iterator<InterfaceC43849j> it = C43848i.f96913a.m96587g().iterator();
        while (it.hasNext()) {
            it.next().mo42474b(interfaceC43845f, null);
        }
    }
}
