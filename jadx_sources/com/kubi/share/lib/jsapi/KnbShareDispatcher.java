package com.kubi.share.lib.jsapi;

import android.util.Base64;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiShareGalleryDataEntity;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KnbShareDispatcher.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00070\u000fJj\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00102\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00070\u000fJk\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0002\u0010\u001bJW\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/share/lib/jsapi/KnbShareDispatcher;", "", "<init>", "()V", "TAG", "", "shareTextLink", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "shareTitle", "shareContent", "shareLink", "utmSource", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "shareImg", BridgeParamKeyKt.SHARE_KEY_PIC, BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "onlyDarkMode", "qrCodeUrl", "rcode", "allowCustomInviteLink", "shareCustomGallery", BridgeParamKeyKt.SHARE_KEY_LINKURL, "(Lcom/kubi/sdk/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "shareGallery", "data", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareGalleryDataEntity;", "(Lcom/kubi/sdk/BaseActivity;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareGalleryDataEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "base64toBytes", "", "base64Data", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KnbShareDispatcher {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KnbShareDispatcher f49370a = new KnbShareDispatcher();

    /* JADX INFO: renamed from: b */
    public final void m59681b(@NotNull BaseActivity activity, @Nullable String str, @NotNull String utmSource, @NotNull String rcode, @NotNull String linkUrl, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(rcode, "rcode");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (str == null || str.length() == 0) {
            callback.invoke(Boolean.FALSE, new ProtocolException("data is null", null, null, false, 14, null));
        } else {
            LifecycleOwnerKt.getLifecycleScope(activity).launchWhenStarted(new KnbShareDispatcher$shareCustomGallery$1(utmSource, callback, linkUrl, bool, rcode, str, bool2, null));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final byte[] m59680a(@NotNull String base64Data) {
        String str;
        Intrinsics.checkNotNullParameter(base64Data, "base64Data");
        List listSplit$default = StringsKt.split$default((CharSequence) base64Data, new String[]{","}, false, 0, 6, (Object) null);
        int size = listSplit$default.size();
        if (size == 1) {
            str = (String) listSplit$default.get(0);
        } else {
            if (size != 2) {
                return null;
            }
            str = (String) listSplit$default.get(1);
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m59682c(@NotNull BaseActivity activity, @Nullable KCJSApiShareGalleryDataEntity kCJSApiShareGalleryDataEntity, @NotNull String utmSource, @NotNull String rcode, @Nullable Boolean bool, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(rcode, "rcode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (kCJSApiShareGalleryDataEntity == null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("data is null", null, null, false, 14, null));
            return;
        }
        long jM66652l = C27039d.m66652l(kCJSApiShareGalleryDataEntity.getGalleryIndex());
        if (0 > jM66652l || jM66652l >= 2147483648L) {
            callback.invoke(Boolean.FALSE, new ProtocolException("invalid gallery index", null, null, false, 14, null));
        } else {
            LifecycleOwnerKt.getLifecycleScope(activity).launchWhenStarted(new KnbShareDispatcher$shareGallery$1(utmSource, callback, kCJSApiShareGalleryDataEntity, jM66652l, rcode, bool, null));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m59683d(@NotNull BaseActivity activity, @Nullable String str, boolean z11, boolean z12, @NotNull String utmSource, @Nullable String str2, @NotNull String rcode, boolean z13, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(rcode, "rcode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LifecycleOwnerKt.getLifecycleScope(activity).launchWhenStarted(new KnbShareDispatcher$shareImg$1(str, callback, utmSource, z11, str2, z12, rcode, z13, null));
    }

    /* JADX INFO: renamed from: e */
    public final void m59684e(@NotNull BaseActivity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String utmSource, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if ((str == null || str.length() == 0) && ((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0))) {
            callback.invoke(Boolean.FALSE, new ProtocolException("content is empty", null, null, false, 14, null));
        } else {
            LifecycleOwnerKt.getLifecycleScope(activity).launchWhenStarted(new KnbShareDispatcher$shareTextLink$1(utmSource, callback, str, str2, str3, null));
        }
    }
}
