package com.kubi.share.lib.jsapi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5258a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mvi.common.MviExKt;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeShareGalleryDataEntity;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiShareGalleryDataEntity;
import com.kubi.share.lib.knb.KCHybridBridgeShare;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36590y;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiShareModuleImpl.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J¤\u0001\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\u0010H\u0016JH\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\u001fH\u0002¨\u0006&"}, m90084d2 = {"Lcom/kubi/share/lib/jsapi/KCJSApiShareModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareModule;", "<init>", "()V", "shareWithOptions", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "options", "", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", FirebaseAnalytics.Event.SHARE, "category", "utmSource", "rcode", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "onlyDarkMode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "data", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareGalleryDataEntity;", "saveShareImage", "imgData", "needsStoragePermission", "entityConvert", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeShareGalleryDataEntity;", "Companion", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJSApiShareModuleImpl implements InterfaceC36590y {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f49369a = new Companion(null);

    /* JADX INFO: compiled from: KCJSApiShareModuleImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/share/lib/jsapi/KCJSApiShareModuleImpl$Companion;", "", "<init>", "()V", "TAG", "", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a2, code lost:
    
        if (r2.equals("text") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01b0, code lost:
    
        if (r2.equals(com.kubi.user.protocol.entity.SignTermItem.LINK) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b3, code lost:
    
        com.kubi.share.lib.jsapi.KnbShareDispatcher.f49370a.m59684e(r1, r14, r3, r4, r5, r25);
     */
    @Override // d00.InterfaceC36590y
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo59669b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Map<String, ? extends Object> options, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity;
        Function2<? super Boolean, ? super ProtocolException, Unit> callback = function2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        BaseActivity baseActivity = activityM6125h instanceof BaseActivity ? (BaseActivity) activityM6125h : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        }
        Object obj2 = options.get("category");
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            str = "";
        }
        Object obj3 = options.get("utmSource");
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        if (str2 == null) {
            str2 = "";
        }
        Object obj4 = options.get("rcode");
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        if (str3 == null) {
            str3 = "";
        }
        Object obj5 = options.get(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE);
        Boolean bool = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Object obj6 = options.get("onlyDarkMode");
        Boolean bool2 = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Object obj7 = options.get(BridgeParamKeyKt.SHARE_KEY_PIC);
        String str4 = obj7 instanceof String ? (String) obj7 : null;
        if (str4 == null) {
            str4 = "";
        }
        Object obj8 = options.get("qrCodeUrl");
        String str5 = obj8 instanceof String ? (String) obj8 : null;
        if (str5 == null) {
            str5 = "";
        }
        Object obj9 = options.get("title");
        String str6 = obj9 instanceof String ? (String) obj9 : null;
        if (str6 == null) {
            str6 = "";
        }
        Object obj10 = options.get("content");
        String str7 = obj10 instanceof String ? (String) obj10 : null;
        String str8 = str7 == null ? "" : str7;
        Object obj11 = options.get(BridgeParamKeyKt.SHARE_KEY_LINKURL);
        String str9 = obj11 instanceof String ? (String) obj11 : null;
        String str10 = str9 != null ? str9 : "";
        Object obj12 = options.get("data");
        Map map = obj12 instanceof Map ? (Map) obj12 : null;
        if (map != null) {
            Object obj13 = map.get(BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE);
            Boolean bool3 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            Object obj14 = map.get("galleryType");
            String str11 = obj14 instanceof String ? (String) obj14 : null;
            Object obj15 = map.get("galleryLink");
            String str12 = obj15 instanceof String ? (String) obj15 : null;
            Object obj16 = map.get("galleryIndex");
            Number number = obj16 instanceof Number ? (Number) obj16 : null;
            kCJSApiShareGalleryDataEntity = new KCJSApiShareGalleryDataEntity(zBooleanValue3, str11, str12, number != null ? Long.valueOf(number.longValue()) : null);
        } else {
            kCJSApiShareGalleryDataEntity = null;
        }
        Object obj17 = options.get("allowCustomInviteLink");
        Boolean bool4 = obj17 instanceof Boolean ? (Boolean) obj17 : null;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        switch (str.hashCode()) {
            case -196315310:
                BaseActivity baseActivity2 = baseActivity;
                String str13 = str2;
                String str14 = str3;
                if (str.equals("gallery")) {
                    KnbShareDispatcher.f49370a.m59682c(baseActivity2, kCJSApiShareGalleryDataEntity, str13, str14, Boolean.valueOf(zBooleanValue4), callback);
                }
                callback.invoke(Boolean.FALSE, new ProtocolException("category=" + str + " no allow", null, null, false, 14, null));
                break;
            case 104387:
                BaseActivity baseActivity3 = baseActivity;
                String str15 = str2;
                String str16 = str3;
                if (str.equals("img")) {
                    KnbShareDispatcher.f49370a.m59683d(baseActivity3, str4, zBooleanValue, zBooleanValue2, str15, str5, str16, zBooleanValue4, function2);
                }
                callback = function2;
                callback.invoke(Boolean.FALSE, new ProtocolException("category=" + str + " no allow", null, null, false, 14, null));
                break;
            case 3321850:
                break;
            case 3556653:
                break;
            case 821097121:
                if (str.equals("customGallery")) {
                    KnbShareDispatcher.f49370a.m59681b(baseActivity, str4, str2, str3, str10, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue4), function2);
                }
                callback.invoke(Boolean.FALSE, new ProtocolException("category=" + str + " no allow", null, null, false, 14, null));
                break;
            default:
                callback.invoke(Boolean.FALSE, new ProtocolException("category=" + str + " no allow", null, null, false, 14, null));
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r20.equals("text") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r20.equals(com.kubi.user.protocol.entity.SignTermItem.LINK) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        com.kubi.share.lib.jsapi.KnbShareDispatcher.f49370a.m59684e(r1, r27, r28, r29, r21, r6);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // d00.InterfaceC36590y
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo59670c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String category, @NotNull String utmSource, @NotNull String rcode, boolean z11, boolean z12, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        Function2<? super Boolean, ? super ProtocolException, Unit> callback = function2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(rcode, "rcode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Intrinsics.areEqual(source, "h5")) {
            Activity activityM6125h = C5258a.m6125h();
            BaseActivity baseActivity = activityM6125h instanceof BaseActivity ? (BaseActivity) activityM6125h : null;
            if (baseActivity == null) {
                callback.invoke(Boolean.FALSE, null);
                return;
            } else {
                new KCHybridBridgeShare().mo4819b(baseActivity, null, category, utmSource, rcode, z11, z12, str, str2, str3, str4, str5, m59671e(kCJSApiShareGalleryDataEntity), callback);
                return;
            }
        }
        BaseActivity baseActivity2 = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity2 == null) {
            callback.invoke(Boolean.FALSE, null);
        }
        switch (category.hashCode()) {
            case -196315310:
                if (category.equals("gallery")) {
                    KnbShareDispatcher.f49370a.m59682c(baseActivity2, kCJSApiShareGalleryDataEntity, utmSource, rcode, Boolean.FALSE, function2);
                }
                callback = function2;
                callback.invoke(Boolean.FALSE, new ProtocolException("category=" + category + " no allow", null, null, false, 14, null));
                break;
            case 104387:
                if (category.equals("img")) {
                    KnbShareDispatcher.f49370a.m59683d(baseActivity2, str, z11, z12, utmSource, str2, rcode, false, function2);
                }
                callback = function2;
                callback.invoke(Boolean.FALSE, new ProtocolException("category=" + category + " no allow", null, null, false, 14, null));
                break;
            case 3321850:
                break;
            case 3556653:
                break;
            default:
                callback.invoke(Boolean.FALSE, new ProtocolException("category=" + category + " no allow", null, null, false, 14, null));
                break;
        }
    }

    @Override // d00.InterfaceC36590y
    /* JADX INFO: renamed from: a */
    public void mo59668a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String imgData, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(imgData, "imgData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            MviExKt.m42518n(new KCJSApiShareModuleImpl$saveShareImage$1(this, activityM6125h, callback, imgData, null));
        } else {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("ctx is not FragmentActivity"), null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: e */
    public final KCHybridBridgeShareGalleryDataEntity m59671e(KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity) {
        if (kCJSApiShareGalleryDataEntity == null) {
            return null;
        }
        return new KCHybridBridgeShareGalleryDataEntity(kCJSApiShareGalleryDataEntity.getNeedQrCode(), kCJSApiShareGalleryDataEntity.getGalleryType(), kCJSApiShareGalleryDataEntity.getGalleryLink(), kCJSApiShareGalleryDataEntity.getGalleryIndex());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m59672f() {
        return Build.VERSION.SDK_INT < 29;
    }
}
