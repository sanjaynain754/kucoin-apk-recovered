package com.kubi.redpackage.protocol;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b00.InterfaceC4439v;
import com.kubi.otc.entity.OtcAd;
import com.kubi.redpackage.utils.RedPkgCategory;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p845zv.C46928a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeRedpacketCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J6\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/redpackage/protocol/KCFlutterBridgeRedpacketCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeRedpacketCall;", "<init>", "()V", "checkRedpacketCodeValid", "", "ctx", "Landroid/content/Context;", "redpacketCode", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "requestRedpacketInfoByCode", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeRedpacketCallImpl implements InterfaceC4439v {
    @Override // b00.InterfaceC4439v
    /* JADX INFO: renamed from: a */
    public void mo4221a(@NotNull Context ctx, @NotNull String redpacketCode, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) throws JSONException {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(redpacketCode, "redpacketCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean zM66664d = C27041f.m66664d(redpacketCode);
        callback.invoke(Boolean.valueOf(zM66664d), null);
        if (zM66664d) {
            return;
        }
        C46928a.m103398d(RedPkgCategory.RECEIVE_CODE_CHECK, false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4439v
    /* JADX INFO: renamed from: b */
    public void mo4222b(@NotNull Context ctx, @NotNull String redpacketCode, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(redpacketCode, "redpacketCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgeRedpacketCallImpl$requestRedpacketInfoByCode$1(redpacketCode, callback, null), 3, null);
        } else {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new RuntimeException("ctx is not FragmentActivity"), null, false, 12, null));
        }
    }
}
