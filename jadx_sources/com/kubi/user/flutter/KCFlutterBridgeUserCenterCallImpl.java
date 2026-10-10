package com.kubi.user.flutter;

import android.content.Context;
import b00.InterfaceC4425h0;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeUserCenterUserPoliciesInfo;
import com.kubi.user.R$string;
import com.kubi.user.config.LoginInfoConfig;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KCFlutterBridgeUserCenterCallImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J4\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\n\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J.\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/user/flutter/KCFlutterBridgeUserCenterCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeUserCenterCall;", "<init>", "()V", "gotoCheckLoginPage", "", "ctx", "Landroid/content/Context;", "spmId", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getUserPoliciesInfo", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeUserCenterUserPoliciesInfo;", "isBackLogin", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeUserCenterCallImpl implements InterfaceC4425h0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f53657a = new Companion(null);

    /* JADX INFO: compiled from: KCFlutterBridgeUserCenterCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/flutter/KCFlutterBridgeUserCenterCallImpl$Companion;", "", "<init>", "()V", "TAG", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // b00.InterfaceC4425h0
    /* JADX INFO: renamed from: b */
    public void mo4132b(@NotNull Context ctx, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (LoginInfoConfig.a.G()) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            callback.invoke(Boolean.valueOf(com.kubi.user.helper.a.a.a(str)), null);
        }
    }

    @Override // b00.InterfaceC4425h0
    /* JADX INFO: renamed from: c */
    public void mo4133c(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.FALSE, null);
    }

    @Override // b00.InterfaceC4425h0
    /* JADX INFO: renamed from: d */
    public void mo4134d(@NotNull Context ctx, @NotNull Function2<? super List<KCFlutterBridgeUserCenterUserPoliciesInfo>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        com.kubi.user.api.site.protocol.b bVar = com.kubi.user.api.site.protocol.b.a;
        String strD = bVar.d();
        C27017c c27017c = C27017c.f54310a;
        arrayList.add(new KCFlutterBridgeUserCenterUserPoliciesInfo(0L, strD, c27017c.m66516f(R$string.service_protocol, new Object[0])));
        arrayList.add(new KCFlutterBridgeUserCenterUserPoliciesInfo(1L, bVar.a(), c27017c.m66516f(R$string.privacy_policy, new Object[0])));
        C44128b.m97259c("KCFlutterBridgeUserCenterCallImpl", "User policies info: " + arrayList);
        callback.invoke(arrayList, null);
    }
}
