package je0;

import le0.InterfaceC42178a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: je0.b */
/* JADX INFO: compiled from: LiveServiceLocator.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/LiveServiceLocator;", "", "<init>", "()V", "liveWebService", "Lcom/trtc/uikit/livekit/kc/data/source/remote/LiveWebService;", "provideLiveWebService", "createLiveWebService", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40397b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40397b f89707a = new C40397b();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static volatile InterfaceC42178a f89708b;

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC42178a m89024b() {
        InterfaceC42178a interfaceC42178aM89023a;
        synchronized (this) {
            interfaceC42178aM89023a = f89708b;
            if (interfaceC42178aM89023a == null && (interfaceC42178aM89023a = f89708b) == null) {
                interfaceC42178aM89023a = f89707a.m89023a();
            }
        }
        return interfaceC42178aM89023a;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC42178a m89023a() {
        Object objCreate = C42597a.m93388d().create(InterfaceC42178a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (InterfaceC42178a) objCreate;
    }
}
