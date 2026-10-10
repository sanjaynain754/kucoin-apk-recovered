package com.trtc.uikit.livekit.features.audiencecontainer.store;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import de0.InterfaceC36664a;
import ee0.C37139a;
import fe0.C37438a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudienceContainerStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceContainerStore;", "", "<init>", "()V", "viewListenerList", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/AudienceContainerViewListenerList;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$AudienceContainerViewListener;", "removeListener", "getAudienceContainerViewListenerList", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AudienceContainerStore {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f78550b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C37438a f78551a = new C37438a();

    /* JADX INFO: compiled from: AudienceContainerStore.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceContainerStore$Companion;", "", "<init>", "()V", "disableSliding", "", "disable", "", "disableHeaderFloatWin", "disableHeaderLiveData", "disableHeaderVisitorCnt", "disableFooterCoGuest", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void disableFooterCoGuest(boolean disable) {
            C37139a.f82409a.m83067a().setValue(Boolean.valueOf(disable));
        }

        @JvmStatic
        public final void disableHeaderFloatWin(boolean disable) {
            C37139a.f82409a.m83068b().setValue(Boolean.valueOf(disable));
        }

        @JvmStatic
        public final void disableHeaderLiveData(boolean disable) {
            C37139a.f82409a.m83069c().setValue(Boolean.valueOf(disable));
        }

        @JvmStatic
        public final void disableHeaderVisitorCnt(boolean disable) {
            C37139a.f82409a.m83070d().setValue(Boolean.valueOf(disable));
        }

        @JvmStatic
        public final void disableSliding(boolean disable) {
            C37139a.f82409a.m83071e().setValue(Boolean.valueOf(disable));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80743a(@NotNull InterfaceC36664a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f78551a.m84228a(listener);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C37438a getF78551a() {
        return this.f78551a;
    }

    /* JADX INFO: renamed from: c */
    public final void m80745c(@NotNull InterfaceC36664a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f78551a.m84230c(listener);
    }
}
