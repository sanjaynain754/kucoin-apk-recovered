package io.trtc.tuikit.atomicxcore.api.contact;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J \u0001\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b)\u0010\u0012R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b\n\u0010\u0012R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b\u000b\u0010\u0012R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b\f\u0010\u0012R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b*\u0010\u0012¨\u0006+"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/contact/C2CSettingState;", "", "Lkotlinx/coroutines/flow/w;", "", "nickname", "avatarURL", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "remark", "", "isNotDisturb", "isPinned", "isContact", "isInBlacklist", "Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;", "receiveMessageOpt", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/contact/C2CSettingState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getNickname", "getAvatarURL", "getSignature", "getRemark", "getReceiveMessageOpt", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class C2CSettingState {

    @NotNull
    private final InterfaceC41678w<String> avatarURL;

    @NotNull
    private final InterfaceC41678w<Boolean> isContact;

    @NotNull
    private final InterfaceC41678w<Boolean> isInBlacklist;

    @NotNull
    private final InterfaceC41678w<Boolean> isNotDisturb;

    @NotNull
    private final InterfaceC41678w<Boolean> isPinned;

    @NotNull
    private final InterfaceC41678w<String> nickname;

    @NotNull
    private final InterfaceC41678w<ReceiveMessageOpt> receiveMessageOpt;

    @NotNull
    private final InterfaceC41678w<String> remark;

    @NotNull
    private final InterfaceC41678w<String> signature;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2CSettingState)) {
            return false;
        }
        C2CSettingState c2CSettingState = (C2CSettingState) other;
        return Intrinsics.areEqual(this.nickname, c2CSettingState.nickname) && Intrinsics.areEqual(this.avatarURL, c2CSettingState.avatarURL) && Intrinsics.areEqual(this.signature, c2CSettingState.signature) && Intrinsics.areEqual(this.remark, c2CSettingState.remark) && Intrinsics.areEqual(this.isNotDisturb, c2CSettingState.isNotDisturb) && Intrinsics.areEqual(this.isPinned, c2CSettingState.isPinned) && Intrinsics.areEqual(this.isContact, c2CSettingState.isContact) && Intrinsics.areEqual(this.isInBlacklist, c2CSettingState.isInBlacklist) && Intrinsics.areEqual(this.receiveMessageOpt, c2CSettingState.receiveMessageOpt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2CSettingState(@NotNull InterfaceC41678w<String> nickname, @NotNull InterfaceC41678w<String> avatarURL, @NotNull InterfaceC41678w<String> signature, @NotNull InterfaceC41678w<String> remark, @NotNull InterfaceC41678w<Boolean> isNotDisturb, @NotNull InterfaceC41678w<Boolean> isPinned, @NotNull InterfaceC41678w<Boolean> isContact, @NotNull InterfaceC41678w<Boolean> isInBlacklist, @NotNull InterfaceC41678w<? extends ReceiveMessageOpt> receiveMessageOpt) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(isNotDisturb, "isNotDisturb");
        Intrinsics.checkNotNullParameter(isPinned, "isPinned");
        Intrinsics.checkNotNullParameter(isContact, "isContact");
        Intrinsics.checkNotNullParameter(isInBlacklist, "isInBlacklist");
        Intrinsics.checkNotNullParameter(receiveMessageOpt, "receiveMessageOpt");
        this.nickname = nickname;
        this.avatarURL = avatarURL;
        this.signature = signature;
        this.remark = remark;
        this.isNotDisturb = isNotDisturb;
        this.isPinned = isPinned;
        this.isContact = isContact;
        this.isInBlacklist = isInBlacklist;
        this.receiveMessageOpt = receiveMessageOpt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2CSettingState copy$default(C2CSettingState c2CSettingState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, InterfaceC41678w interfaceC41678w4, InterfaceC41678w interfaceC41678w5, InterfaceC41678w interfaceC41678w6, InterfaceC41678w interfaceC41678w7, InterfaceC41678w interfaceC41678w8, InterfaceC41678w interfaceC41678w9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = c2CSettingState.nickname;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = c2CSettingState.avatarURL;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = c2CSettingState.signature;
        }
        if ((i11 & 8) != 0) {
            interfaceC41678w4 = c2CSettingState.remark;
        }
        if ((i11 & 16) != 0) {
            interfaceC41678w5 = c2CSettingState.isNotDisturb;
        }
        if ((i11 & 32) != 0) {
            interfaceC41678w6 = c2CSettingState.isPinned;
        }
        if ((i11 & 64) != 0) {
            interfaceC41678w7 = c2CSettingState.isContact;
        }
        if ((i11 & 128) != 0) {
            interfaceC41678w8 = c2CSettingState.isInBlacklist;
        }
        if ((i11 & 256) != 0) {
            interfaceC41678w9 = c2CSettingState.receiveMessageOpt;
        }
        InterfaceC41678w interfaceC41678w10 = interfaceC41678w8;
        InterfaceC41678w interfaceC41678w11 = interfaceC41678w9;
        InterfaceC41678w interfaceC41678w12 = interfaceC41678w6;
        InterfaceC41678w interfaceC41678w13 = interfaceC41678w7;
        InterfaceC41678w interfaceC41678w14 = interfaceC41678w5;
        InterfaceC41678w interfaceC41678w15 = interfaceC41678w3;
        return c2CSettingState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w15, interfaceC41678w4, interfaceC41678w14, interfaceC41678w12, interfaceC41678w13, interfaceC41678w10, interfaceC41678w11);
    }

    @NotNull
    public final InterfaceC41678w<String> component1() {
        return this.nickname;
    }

    @NotNull
    public final InterfaceC41678w<String> component2() {
        return this.avatarURL;
    }

    @NotNull
    public final InterfaceC41678w<String> component3() {
        return this.signature;
    }

    @NotNull
    public final InterfaceC41678w<String> component4() {
        return this.remark;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component5() {
        return this.isNotDisturb;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component6() {
        return this.isPinned;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component7() {
        return this.isContact;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> component8() {
        return this.isInBlacklist;
    }

    @NotNull
    public final InterfaceC41678w<ReceiveMessageOpt> component9() {
        return this.receiveMessageOpt;
    }

    @NotNull
    public final C2CSettingState copy(@NotNull InterfaceC41678w<String> nickname, @NotNull InterfaceC41678w<String> avatarURL, @NotNull InterfaceC41678w<String> signature, @NotNull InterfaceC41678w<String> remark, @NotNull InterfaceC41678w<Boolean> isNotDisturb, @NotNull InterfaceC41678w<Boolean> isPinned, @NotNull InterfaceC41678w<Boolean> isContact, @NotNull InterfaceC41678w<Boolean> isInBlacklist, @NotNull InterfaceC41678w<? extends ReceiveMessageOpt> receiveMessageOpt) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(isNotDisturb, "isNotDisturb");
        Intrinsics.checkNotNullParameter(isPinned, "isPinned");
        Intrinsics.checkNotNullParameter(isContact, "isContact");
        Intrinsics.checkNotNullParameter(isInBlacklist, "isInBlacklist");
        Intrinsics.checkNotNullParameter(receiveMessageOpt, "receiveMessageOpt");
        return new C2CSettingState(nickname, avatarURL, signature, remark, isNotDisturb, isPinned, isContact, isInBlacklist, receiveMessageOpt);
    }

    @NotNull
    public final InterfaceC41678w<String> getAvatarURL() {
        return this.avatarURL;
    }

    @NotNull
    public final InterfaceC41678w<String> getNickname() {
        return this.nickname;
    }

    @NotNull
    public final InterfaceC41678w<ReceiveMessageOpt> getReceiveMessageOpt() {
        return this.receiveMessageOpt;
    }

    @NotNull
    public final InterfaceC41678w<String> getRemark() {
        return this.remark;
    }

    @NotNull
    public final InterfaceC41678w<String> getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.receiveMessageOpt.hashCode() + AbstractC39397b.m88226a(this.isInBlacklist, AbstractC39397b.m88226a(this.isContact, AbstractC39397b.m88226a(this.isPinned, AbstractC39397b.m88226a(this.isNotDisturb, AbstractC39397b.m88226a(this.remark, AbstractC39397b.m88226a(this.signature, AbstractC39397b.m88226a(this.avatarURL, this.nickname.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isContact() {
        return this.isContact;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isInBlacklist() {
        return this.isInBlacklist;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isNotDisturb() {
        return this.isNotDisturb;
    }

    @NotNull
    public final InterfaceC41678w<Boolean> isPinned() {
        return this.isPinned;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("C2CSettingState(nickname=");
        sb2.append(this.nickname);
        sb2.append(", avatarURL=");
        sb2.append(this.avatarURL);
        sb2.append(", signature=");
        sb2.append(this.signature);
        sb2.append(", remark=");
        sb2.append(this.remark);
        sb2.append(", isNotDisturb=");
        sb2.append(this.isNotDisturb);
        sb2.append(", isPinned=");
        sb2.append(this.isPinned);
        sb2.append(", isContact=");
        sb2.append(this.isContact);
        sb2.append(", isInBlacklist=");
        sb2.append(this.isInBlacklist);
        sb2.append(", receiveMessageOpt=");
        return AbstractC39393c.m88222a(sb2, this.receiveMessageOpt, ')');
    }
}
