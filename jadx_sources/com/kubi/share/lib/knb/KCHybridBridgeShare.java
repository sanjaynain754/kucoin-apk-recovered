package com.kubi.share.lib.knb;

import android.content.Context;
import android.util.Base64;
import androidx.lifecycle.LifecycleOwnerKt;
import c00.InterfaceC4766m;
import com.blankj.utilcode.util.C5290q;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeShareGalleryDataEntity;
import com.kubi.user.protocol.entity.SignTermItem;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCHybridBridgeShare.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u009c\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00050\u0019H\u0016JT\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00050\u0019H\u0002Jb\u0010!\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00050\u0019H\u0002JH\u0010\"\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00050\u0019H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u000bH\u0002J@\u0010&\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010'\u001a\u00020\u000b2\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00050\u0019H\u0016¨\u0006)"}, m90084d2 = {"Lcom/kubi/share/lib/knb/KCHybridBridgeShare;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeShareCall;", "<init>", "()V", FirebaseAnalytics.Event.SHARE, "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "category", "", "utmSource", "rcode", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "onlyDarkMode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "data", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeShareGalleryDataEntity;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "shareTextLink", "activity", "Lcom/kubi/sdk/BaseActivity;", "shareTitle", "shareContent", "shareLink", "shareImg", "shareGallery", "base64toBytes", "", "base64Data", "saveShareImage", "imgData", "Companion", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHybridBridgeShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeShare.kt\ncom/kubi/share/lib/knb/KCHybridBridgeShare\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n1#2:243\n*E\n"})
public final class KCHybridBridgeShare implements InterfaceC4766m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f49383a = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgeShare.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/share/lib/knb/KCHybridBridgeShare$Companion;", "", "<init>", "()V", "TAG", "", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // c00.InterfaceC4766m
    /* JADX INFO: renamed from: b */
    public void mo4819b(@NotNull Context ctx, @Nullable Object obj, @NotNull String category, @NotNull String utmSource, @NotNull String rcode, boolean z11, boolean z12, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable KCHybridBridgeShareGalleryDataEntity kCHybridBridgeShareGalleryDataEntity, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Function2<? super Boolean, ? super ProtocolException, Unit> function2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(rcode, "rcode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        }
        switch (category.hashCode()) {
            case -196315310:
                function2 = callback;
                BaseActivity baseActivity2 = baseActivity;
                if (category.equals("gallery")) {
                    m59695e(baseActivity2, kCHybridBridgeShareGalleryDataEntity, utmSource, rcode, function2);
                }
                function2.invoke(Boolean.FALSE, new ProtocolException("category=" + category + " no allow", null, null, false, 14, null));
                break;
            case 104387:
                function2 = callback;
                BaseActivity baseActivity3 = baseActivity;
                if (category.equals("img")) {
                    m59696f(baseActivity3, str, z11, z12, utmSource, str2, rcode, function2);
                }
                function2.invoke(Boolean.FALSE, new ProtocolException("category=" + category + " no allow", null, null, false, 14, null));
                break;
            case 3321850:
                if (!category.equals(SignTermItem.LINK)) {
                    function2 = callback;
                    function2.invoke(Boolean.FALSE, new ProtocolException("category=" + category + " no allow", null, null, false, 14, null));
                }
                m59697g(baseActivity, str3, str4, str5, utmSource, callback);
                break;
            case 3556653:
                if (!category.equals("text")) {
                    function2 = callback;
                    function2.invoke(Boolean.FALSE, new ProtocolException("category=" + category + " no allow", null, null, false, 14, null));
                }
                m59697g(baseActivity, str3, str4, str5, utmSource, callback);
                break;
            default:
                function2 = callback;
                function2.invoke(Boolean.FALSE, new ProtocolException("category=" + category + " no allow", null, null, false, 14, null));
                break;
        }
    }

    @Override // c00.InterfaceC4766m
    /* JADX INFO: renamed from: a */
    public void mo4818a(@NotNull Context ctx, @Nullable Object obj, @NotNull String imgData, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(imgData, "imgData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            LifecycleOwnerKt.getLifecycleScope(baseActivity).launchWhenStarted(new KCHybridBridgeShare$saveShareImage$1(baseActivity, callback, this, imgData, null));
        }
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m59694d(String str) {
        String str2;
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        int size = listSplit$default.size();
        if (size == 1) {
            str2 = (String) listSplit$default.get(0);
        } else {
            if (size != 2) {
                return null;
            }
            str2 = (String) listSplit$default.get(1);
        }
        return Base64.decode(str2, 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m59695e(BaseActivity baseActivity, KCHybridBridgeShareGalleryDataEntity kCHybridBridgeShareGalleryDataEntity, String str, String str2, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        if (kCHybridBridgeShareGalleryDataEntity == null) {
            function2.invoke(Boolean.FALSE, new ProtocolException("data is null", null, null, false, 14, null));
        } else {
            LifecycleOwnerKt.getLifecycleScope(baseActivity).launchWhenStarted(new KCHybridBridgeShare$shareGallery$1(str, function2, kCHybridBridgeShareGalleryDataEntity, str2, null));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m59696f(BaseActivity baseActivity, String str, boolean z11, boolean z12, String str2, String str3, String str4, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        LifecycleOwnerKt.getLifecycleScope(baseActivity).launchWhenStarted(new KCHybridBridgeShare$shareImg$1(str2, function2, str != null ? C5290q.m6355f(m59694d(str), 0) : null, z11, str3, z12, str4, null));
    }

    /* JADX INFO: renamed from: g */
    public final void m59697g(BaseActivity baseActivity, String str, String str2, String str3, String str4, Function2<? super Boolean, ? super ProtocolException, Unit> function2) {
        if ((str == null || str.length() == 0) && ((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0))) {
            function2.invoke(Boolean.FALSE, new ProtocolException("content is empty", null, null, false, 14, null));
        } else {
            LifecycleOwnerKt.getLifecycleScope(baseActivity).launchWhenStarted(new KCHybridBridgeShare$shareTextLink$1(str4, function2, str, str2, str3, null));
        }
    }
}
