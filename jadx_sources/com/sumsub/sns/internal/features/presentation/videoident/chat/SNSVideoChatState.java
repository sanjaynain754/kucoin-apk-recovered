package com.sumsub.sns.internal.features.presentation.videoident.chat;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b7\u0018\u00002\u00020\u0001:\u0006\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0005\r\u0011\u000f\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "", "isConnected", "()Z", "com/sumsub/sns/internal/features/presentation/videoident/chat/w", "com/sumsub/sns/internal/features/presentation/videoident/chat/v", "com/sumsub/sns/internal/features/presentation/videoident/chat/y", "com/sumsub/sns/internal/features/presentation/videoident/chat/z", "com/sumsub/sns/internal/features/presentation/videoident/chat/x", "com/sumsub/sns/internal/features/presentation/videoident/chat/A", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class SNSVideoChatState {

    @NotNull
    private final String name;

    public /* synthetic */ SNSVideoChatState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private SNSVideoChatState(String str) {
        this.name = str;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean isConnected() {
        return ((this instanceof C32923x) || (this instanceof C32922w)) ? false : true;
    }

    @NotNull
    public String toString() {
        return "SNSVideoChatState->" + this.name;
    }
}
