package com.trtc.uikit.livekit.component.giftaccess.store;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rd0.C43992b;

/* JADX INFO: compiled from: GiftStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/store/GiftStore;", "", "<init>", "()V", "giftCacheService", "Lcom/trtc/uikit/livekit/component/giftaccess/service/GiftCacheService;", "getGiftCacheService", "()Lcom/trtc/uikit/livekit/component/giftaccess/service/GiftCacheService;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GiftStore {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f77878b = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile GiftStore f77879c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C43992b f77880a = new C43992b();

    /* JADX INFO: compiled from: GiftStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/store/GiftStore$Companion;", "", "<init>", "()V", "sInstance", "Lcom/trtc/uikit/livekit/component/giftaccess/store/GiftStore;", "getInstance", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGiftStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftStore.kt\ncom/trtc/uikit/livekit/component/giftaccess/store/GiftStore$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final GiftStore getInstance() {
            GiftStore giftStore;
            GiftStore giftStore2 = GiftStore.f77879c;
            if (giftStore2 == null) {
                synchronized (this) {
                    giftStore = GiftStore.f77879c;
                    if (giftStore == null) {
                        giftStore = new GiftStore();
                        GiftStore.f77879c = giftStore;
                    }
                }
                return giftStore;
            }
            return giftStore2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final C43992b getF77880a() {
        return this.f77880a;
    }
}
