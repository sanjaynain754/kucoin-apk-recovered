package com.kubi.chat.entity;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/chat/entity/ChatToken;", "", InterfaceC33826o0.f71244p, "", "endpoint", "(Ljava/lang/String;Ljava/lang/String;)V", "getEndpoint", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "getWsPath", "uid", "hashCode", "", "toString", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class ChatToken {

    @Nullable
    private final String endpoint;

    @Nullable
    private final String token;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatToken)) {
            return false;
        }
        ChatToken chatToken = (ChatToken) other;
        return Intrinsics.areEqual(this.token, chatToken.token) && Intrinsics.areEqual(this.endpoint, chatToken.endpoint);
    }

    public static /* synthetic */ ChatToken copy$default(ChatToken chatToken, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chatToken.token;
        }
        if ((i11 & 2) != 0) {
            str2 = chatToken.endpoint;
        }
        return chatToken.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    @NotNull
    public final ChatToken copy(@Nullable String token, @Nullable String endpoint) {
        return new ChatToken(token, endpoint);
    }

    @Nullable
    public final String getEndpoint() {
        return this.endpoint;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getWsPath(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        return C45148b.m99794d(this.endpoint) + "/v1/ws?uid=" + uid + "&token=" + C45148b.m99794d(this.token);
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endpoint;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChatToken(token=" + ((Object) this.token) + ", endpoint=" + ((Object) this.endpoint) + ')';
    }

    public ChatToken(@Nullable String str, @Nullable String str2) {
        this.token = str;
        this.endpoint = str2;
    }
}
