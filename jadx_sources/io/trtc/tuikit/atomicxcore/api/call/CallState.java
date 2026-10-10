package io.trtc.tuikit.atomicxcore.api.call;

import com.tencent.bugly.proguard.InterfaceC33953u5;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00060\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u001c\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u0005j\b\u0012\u0004\u0012\u00020\n`\u00060\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r0\u0002\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\r0\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J&\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u0005j\b\u0012\u0004\u0012\u00020\n`\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\"\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r0\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\"\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\r0\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J¸\u0001\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00060\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u0005j\b\u0012\u0004\u0012\u00020\n`\u00060\u00022\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r0\u00022\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\r0\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010)R8\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00060\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010)R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010)R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010)R8\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u0005j\b\u0012\u0004\u0012\u00020\n`\u00060\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010)R4\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010)R4\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\r0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010&\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010)¨\u00066"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/call/CallState;", "", "Lkotlinx/coroutines/flow/w;", "Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;", "activeCall", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "recentCalls", "", InterfaceC33953u5.f72198E, "Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;", "selfInfo", "allParticipants", "", "", "speakerVolumes", "Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;", "networkQualities", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/call/CallState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getActiveCall", "setActiveCall", "(Lkotlinx/coroutines/flow/w;)V", "getRecentCalls", "setRecentCalls", "getCursor", "setCursor", "getSelfInfo", "setSelfInfo", "getAllParticipants", "setAllParticipants", "getSpeakerVolumes", "setSpeakerVolumes", "getNetworkQualities", "setNetworkQualities", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class CallState {

    @NotNull
    private InterfaceC41678w<CallInfo> activeCall;

    @NotNull
    private InterfaceC41678w<? extends LinkedHashSet<CallParticipantInfo>> allParticipants;

    @NotNull
    private InterfaceC41678w<String> cursor;

    @NotNull
    private InterfaceC41678w<? extends Map<String, NetworkQuality>> networkQualities;

    @NotNull
    private InterfaceC41678w<? extends LinkedHashSet<CallInfo>> recentCalls;

    @NotNull
    private InterfaceC41678w<CallParticipantInfo> selfInfo;

    @NotNull
    private InterfaceC41678w<? extends Map<String, Integer>> speakerVolumes;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallState)) {
            return false;
        }
        CallState callState = (CallState) other;
        return Intrinsics.areEqual(this.activeCall, callState.activeCall) && Intrinsics.areEqual(this.recentCalls, callState.recentCalls) && Intrinsics.areEqual(this.cursor, callState.cursor) && Intrinsics.areEqual(this.selfInfo, callState.selfInfo) && Intrinsics.areEqual(this.allParticipants, callState.allParticipants) && Intrinsics.areEqual(this.speakerVolumes, callState.speakerVolumes) && Intrinsics.areEqual(this.networkQualities, callState.networkQualities);
    }

    public CallState(@NotNull InterfaceC41678w<CallInfo> activeCall, @NotNull InterfaceC41678w<? extends LinkedHashSet<CallInfo>> recentCalls, @NotNull InterfaceC41678w<String> cursor, @NotNull InterfaceC41678w<CallParticipantInfo> selfInfo, @NotNull InterfaceC41678w<? extends LinkedHashSet<CallParticipantInfo>> allParticipants, @NotNull InterfaceC41678w<? extends Map<String, Integer>> speakerVolumes, @NotNull InterfaceC41678w<? extends Map<String, NetworkQuality>> networkQualities) {
        Intrinsics.checkNotNullParameter(activeCall, "activeCall");
        Intrinsics.checkNotNullParameter(recentCalls, "recentCalls");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(selfInfo, "selfInfo");
        Intrinsics.checkNotNullParameter(allParticipants, "allParticipants");
        Intrinsics.checkNotNullParameter(speakerVolumes, "speakerVolumes");
        Intrinsics.checkNotNullParameter(networkQualities, "networkQualities");
        this.activeCall = activeCall;
        this.recentCalls = recentCalls;
        this.cursor = cursor;
        this.selfInfo = selfInfo;
        this.allParticipants = allParticipants;
        this.speakerVolumes = speakerVolumes;
        this.networkQualities = networkQualities;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallState copy$default(CallState callState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, InterfaceC41678w interfaceC41678w5, InterfaceC41678w interfaceC41678w6, InterfaceC41678w interfaceC41678w7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = callState.activeCall;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = callState.recentCalls;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = callState.cursor;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = callState.selfInfo;
        }
        if ((i11 & 16) != 0) {
            interfaceC41678w5 = callState.allParticipants;
        }
        if ((i11 & 32) != 0) {
            interfaceC41678w6 = callState.speakerVolumes;
        }
        if ((i11 & 64) != 0) {
            interfaceC41678w7 = callState.networkQualities;
        }
        InterfaceC41678w interfaceC41678w8 = interfaceC41678w6;
        InterfaceC41678w interfaceC41678w9 = interfaceC41678w7;
        InterfaceC41678w interfaceC41678w10 = interfaceC41678w5;
        InterfaceC41678w interfaceC41678w11 = interfaceC41678w3;
        return callState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w11, interfaceC41678w4, interfaceC41678w10, interfaceC41678w8, interfaceC41678w9);
    }

    @NotNull
    public final InterfaceC41678w<CallInfo> component1() {
        return this.activeCall;
    }

    @NotNull
    public final InterfaceC41678w<LinkedHashSet<CallInfo>> component2() {
        return this.recentCalls;
    }

    @NotNull
    public final InterfaceC41678w<String> component3() {
        return this.cursor;
    }

    @NotNull
    public final InterfaceC41678w<CallParticipantInfo> component4() {
        return this.selfInfo;
    }

    @NotNull
    public final InterfaceC41678w<LinkedHashSet<CallParticipantInfo>> component5() {
        return this.allParticipants;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, Integer>> component6() {
        return this.speakerVolumes;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, NetworkQuality>> component7() {
        return this.networkQualities;
    }

    @NotNull
    public final CallState copy(@NotNull InterfaceC41678w<CallInfo> activeCall, @NotNull InterfaceC41678w<? extends LinkedHashSet<CallInfo>> recentCalls, @NotNull InterfaceC41678w<String> cursor, @NotNull InterfaceC41678w<CallParticipantInfo> selfInfo, @NotNull InterfaceC41678w<? extends LinkedHashSet<CallParticipantInfo>> allParticipants, @NotNull InterfaceC41678w<? extends Map<String, Integer>> speakerVolumes, @NotNull InterfaceC41678w<? extends Map<String, NetworkQuality>> networkQualities) {
        Intrinsics.checkNotNullParameter(activeCall, "activeCall");
        Intrinsics.checkNotNullParameter(recentCalls, "recentCalls");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(selfInfo, "selfInfo");
        Intrinsics.checkNotNullParameter(allParticipants, "allParticipants");
        Intrinsics.checkNotNullParameter(speakerVolumes, "speakerVolumes");
        Intrinsics.checkNotNullParameter(networkQualities, "networkQualities");
        return new CallState(activeCall, recentCalls, cursor, selfInfo, allParticipants, speakerVolumes, networkQualities);
    }

    @NotNull
    public final InterfaceC41678w<CallInfo> getActiveCall() {
        return this.activeCall;
    }

    @NotNull
    public final InterfaceC41678w<LinkedHashSet<CallParticipantInfo>> getAllParticipants() {
        return this.allParticipants;
    }

    @NotNull
    public final InterfaceC41678w<String> getCursor() {
        return this.cursor;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, NetworkQuality>> getNetworkQualities() {
        return this.networkQualities;
    }

    @NotNull
    public final InterfaceC41678w<LinkedHashSet<CallInfo>> getRecentCalls() {
        return this.recentCalls;
    }

    @NotNull
    public final InterfaceC41678w<CallParticipantInfo> getSelfInfo() {
        return this.selfInfo;
    }

    @NotNull
    public final InterfaceC41678w<Map<String, Integer>> getSpeakerVolumes() {
        return this.speakerVolumes;
    }

    public int hashCode() {
        return this.networkQualities.hashCode() + AbstractC39397b.m88226a(this.speakerVolumes, AbstractC39397b.m88226a(this.allParticipants, AbstractC39397b.m88226a(this.selfInfo, AbstractC39397b.m88226a(this.cursor, AbstractC39397b.m88226a(this.recentCalls, this.activeCall.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final void setActiveCall(@NotNull InterfaceC41678w<CallInfo> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.activeCall = interfaceC41678w;
    }

    public final void setAllParticipants(@NotNull InterfaceC41678w<? extends LinkedHashSet<CallParticipantInfo>> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.allParticipants = interfaceC41678w;
    }

    public final void setCursor(@NotNull InterfaceC41678w<String> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.cursor = interfaceC41678w;
    }

    public final void setNetworkQualities(@NotNull InterfaceC41678w<? extends Map<String, NetworkQuality>> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.networkQualities = interfaceC41678w;
    }

    public final void setRecentCalls(@NotNull InterfaceC41678w<? extends LinkedHashSet<CallInfo>> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.recentCalls = interfaceC41678w;
    }

    public final void setSelfInfo(@NotNull InterfaceC41678w<CallParticipantInfo> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.selfInfo = interfaceC41678w;
    }

    public final void setSpeakerVolumes(@NotNull InterfaceC41678w<? extends Map<String, Integer>> interfaceC41678w) {
        Intrinsics.checkNotNullParameter(interfaceC41678w, "<set-?>");
        this.speakerVolumes = interfaceC41678w;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CallState(activeCall=");
        sb2.append(this.activeCall);
        sb2.append(", recentCalls=");
        sb2.append(this.recentCalls);
        sb2.append(", cursor=");
        sb2.append(this.cursor);
        sb2.append(", selfInfo=");
        sb2.append(this.selfInfo);
        sb2.append(", allParticipants=");
        sb2.append(this.allParticipants);
        sb2.append(", speakerVolumes=");
        sb2.append(this.speakerVolumes);
        sb2.append(", networkQualities=");
        return AbstractC39393c.m88222a(sb2, this.networkQualities, ')');
    }
}
