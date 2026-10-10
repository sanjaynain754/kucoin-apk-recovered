package com.kubi.user.jsapi;

import android.content.Context;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiUserCenterUserInfo;
import com.kubi.user.exception.UserCenterMessage;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36571f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.user.jsapi.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCJsBridgeUserCenter.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J@\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016JJ\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/user/jsapi/KCJsBridgeUserCenter;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiUserCenterModule;", "<init>", "()V", "getTradePwd", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "url", "bizType", "h5Type", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getUserInfo", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiUserCenterUserInfo;", "gotoCheckLoginPage", "spmId", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJsBridgeUserCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeUserCenter.kt\ncom/kubi/user/jsapi/KCJsBridgeUserCenter\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,61:1\n72#2:62\n67#2,7:63\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeUserCenter.kt\ncom/kubi/user/jsapi/KCJsBridgeUserCenter\n*L\n34#1:62\n34#1:63,7\n*E\n"})
public class KCJsBridgeUserCenter implements InterfaceC36571f0 {
    @Override // d00.InterfaceC36571f0
    /* JADX INFO: renamed from: a */
    public void mo65550a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(UserCenterAccountOps.f53679a.m65541j(str)), null);
    }

    @Override // d00.InterfaceC36571f0
    /* JADX INFO: renamed from: b */
    public void mo65551b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("调用来源：source=");
        sb2.append(source);
        sb2.append(" url=");
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(" bizType=");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(" h5Type=");
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        C43846g.m96568c(new UserCenterMessage(sb2.toString(), "deprecated|KCJsBridgeUserCenter:getTradePwd", false, 4, null), null, 2, null);
        callback.invoke(null, new ProtocolException("getTradePwd method is not supported", null, null, false, 14, null));
    }

    @Override // d00.InterfaceC36571f0
    /* JADX INFO: renamed from: c */
    public void mo65552c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super KCJSApiUserCenterUserInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(UserCenterUserInfoMapper.f53719a.m65555c(UserCenterAccountOps.f53679a.m65539h()), null);
    }
}
