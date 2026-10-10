package com.kubi.share.lib.flutter;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b00.InterfaceC4417d0;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.share.api.IShareService;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCFlutterBridgeShareCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0016JX\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J6\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0002¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/share/lib/flutter/KCFlutterBridgeShareCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeShareCall;", "<init>", "()V", "getShareUrl", "", "ctx", "Landroid/content/Context;", "utmSource", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "shareImg", "imageData", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "", "onlyDarkMode", "shareLink", "savePhoto", "base64toBytes", "", "base64Data", "Companion", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeShareCallImpl implements InterfaceC4417d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f49349a = new Companion(null);

    /* JADX INFO: compiled from: KCFlutterBridgeShareCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/share/lib/flutter/KCFlutterBridgeShareCallImpl$Companion;", "", "<init>", "()V", "TAG", "", "REQUEST_CODE_SAVE", "", "needsStoragePermission", "", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m59648a() {
            return Build.VERSION.SDK_INT < 29;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4417d0
    /* JADX INFO: renamed from: a */
    public void mo4109a(@NotNull Context ctx, @NotNull String imageData, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgeShareCallImpl$savePhoto$1(ctx, callback, this, imageData, null), 3, null);
        } else {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("ctx is not FragmentActivity"), null, false, 12, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4417d0
    /* JADX INFO: renamed from: b */
    public void mo4110b(@NotNull Context ctx, @NotNull String imageData, @NotNull String utmSource, boolean z11, boolean z12, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgeShareCallImpl$shareImg$1(utmSource, callback, this, imageData, z11, str, z12, null), 3, null);
        } else {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("ctx is not FragmentActivity"), null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4417d0
    /* JADX INFO: renamed from: c */
    public void mo4111c(@NotNull Context ctx, @NotNull String utmSource, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(utmSource, "utmSource");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(IShareService.f49268a.get().mo38d(utmSource), null);
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m59647e(String str) {
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
}
