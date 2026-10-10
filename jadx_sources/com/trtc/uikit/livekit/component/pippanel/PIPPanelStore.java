package com.trtc.uikit.livekit.component.pippanel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import td0.C44932a;

/* JADX INFO: compiled from: PIPPanelStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;", "", "<init>", "()V", "state", "Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelState;", "getState", "()Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelState;", "setPictureInPictureModeRoomId", "", "roomId", "", "reset", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PIPPanelStore {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f77996b = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile PIPPanelStore f77997c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C44932a f77998a;

    /* JADX INFO: compiled from: PIPPanelStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion;", "", "<init>", "()V", "instance", "Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelStore;", "sharedInstance", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nPIPPanelStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PIPPanelStore.kt\ncom/trtc/uikit/livekit/component/pippanel/PIPPanelStore$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final PIPPanelStore sharedInstance() {
            PIPPanelStore pIPPanelStore;
            PIPPanelStore pIPPanelStore2 = PIPPanelStore.f77997c;
            if (pIPPanelStore2 == null) {
                synchronized (this) {
                    pIPPanelStore = PIPPanelStore.f77997c;
                    if (pIPPanelStore == null) {
                        pIPPanelStore = new PIPPanelStore(null);
                        PIPPanelStore.f77997c = pIPPanelStore;
                    }
                }
                return pIPPanelStore;
            }
            return pIPPanelStore2;
        }
    }

    public /* synthetic */ PIPPanelStore(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public PIPPanelStore() {
        this.f77998a = new C44932a();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final C44932a getF77998a() {
        return this.f77998a;
    }

    /* JADX INFO: renamed from: d */
    public final void m79908d() {
        this.f77998a.m99359d().setValue("");
        this.f77998a.m99361f(false);
        this.f77998a.m99363h(false);
        this.f77998a.m99362g(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m79909e(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        this.f77998a.m99359d().setValue(roomId);
    }
}
