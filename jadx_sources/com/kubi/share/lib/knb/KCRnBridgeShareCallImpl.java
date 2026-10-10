package com.kubi.share.lib.knb;

import android.app.Activity;
import android.content.Context;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeShareGalleryDataEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeShareGalleryDataEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import e00.InterfaceC37016h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.share.lib.knb.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCRnBridgeShareCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0092\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u0015H\u0002¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/share/lib/knb/KCRnBridgeShareCallImpl;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeShareCall;", "<init>", "()V", FirebaseAnalytics.Event.SHARE, "", "ctx", "Landroid/content/Context;", "category", "", "utmSource", "rcode", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "onlyDarkMode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "data", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeShareGalleryDataEntity;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "entityConvert", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeShareGalleryDataEntity;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCRnBridgeShareCallImpl implements InterfaceC37016h {
    @Override // e00.InterfaceC37016h
    /* JADX INFO: renamed from: a */
    public void mo59708a(@NotNull Context ctx, @NotNull String category, @NotNull String utmSource, @NotNull String rcode, boolean z11, boolean z12, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable KCBridgeShareGalleryDataEntity kCBridgeShareGalleryDataEntity, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(rcode, "rcode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        BaseActivity baseActivity = activityM6125h instanceof BaseActivity ? (BaseActivity) activityM6125h : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            new KCHybridBridgeShare().mo4819b(baseActivity, null, category, utmSource, rcode, z11, z12, str, str2, str3, str4, str5, m59709b(kCBridgeShareGalleryDataEntity), callback);
        }
    }

    /* JADX INFO: renamed from: b */
    public final KCHybridBridgeShareGalleryDataEntity m59709b(KCBridgeShareGalleryDataEntity kCBridgeShareGalleryDataEntity) {
        if (kCBridgeShareGalleryDataEntity == null) {
            return null;
        }
        return new KCHybridBridgeShareGalleryDataEntity(kCBridgeShareGalleryDataEntity.getNeedQrCode(), kCBridgeShareGalleryDataEntity.getGalleryType(), kCBridgeShareGalleryDataEntity.getGalleryLink(), kCBridgeShareGalleryDataEntity.getGalleryIndex());
    }
}
