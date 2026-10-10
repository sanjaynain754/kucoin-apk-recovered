package com.kubi.sdk.eventhub;

import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeEventHubCenter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/eventhub/EventHubTechStack;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RN", "FLUTTER", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum EventHubTechStack {
    RN(KCTurboFileModuleImpl.SOURCE_RN),
    FLUTTER(ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER);


    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f46557c = EnumEntriesKt.enumEntries(m56613a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: NativeEventHubCenter.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/eventhub/EventHubTechStack$Companion;", "", "<init>", "()V", "from", "Lcom/kubi/sdk/eventhub/EventHubTechStack;", "value", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nNativeEventHubCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeEventHubCenter.kt\ncom/kubi/sdk/eventhub/EventHubTechStack$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,426:1\n1310#2,2:427\n*S KotlinDebug\n*F\n+ 1 NativeEventHubCenter.kt\ncom/kubi/sdk/eventhub/EventHubTechStack$Companion\n*L\n31#1:427,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final EventHubTechStack from(@Nullable String value) {
            for (EventHubTechStack eventHubTechStack : EventHubTechStack.values()) {
                if (Intrinsics.areEqual(eventHubTechStack.getValue(), value)) {
                    return eventHubTechStack;
                }
            }
            return null;
        }
    }

    @NotNull
    public static EnumEntries<EventHubTechStack> getEntries() {
        return f46557c;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    EventHubTechStack(String str) {
        this.value = str;
    }
}
