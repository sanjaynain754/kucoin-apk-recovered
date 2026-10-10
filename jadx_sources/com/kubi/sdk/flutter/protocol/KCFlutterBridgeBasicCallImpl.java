package com.kubi.sdk.flutter.protocol;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b00.InterfaceC4416d;
import com.kubi.data.BeepHelper;
import com.kubi.data.ClipboardDataHelper;
import com.kubi.event.api.C12572a;
import com.kubi.fingerprint.C12598b;
import com.kubi.lflutter.R$raw;
import com.kubi.otc.entity.OtcAd;
import com.kubi.router.core.Router;
import com.kubi.sdk.IActivityWithResult;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import f00.C37304a;
import g00.InterfaceC37764p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import my.C42677p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p741wy.InterfaceC45942b;
import p741wy.InterfaceC45957q;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgeBasicCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016JB\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J8\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J>\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J8\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016JD\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\u0006\u0010#\u001a\u00020$2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016¨\u0006%"}, m90084d2 = {"Lcom/kubi/sdk/flutter/protocol/KCFlutterBridgeBasicCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeBasicCall;", "<init>", "()V", "isClipboardReadAccessOpen", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "queryBizControlConfig", "uiSpmId", "", "sendFlutterEvent", ReportDataTable.COLUMN_PARAMS, "", "", "showAddHomePageDialog", "shortcutId", "appFlyerTrack", "eventId", "getTokenSm", "playAudio", "type", "playVideo", "url", "showToast", "msg", "launchQrScan", "bizType", "showBottomSheetDialog", "datas", "", "selectedIndex", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeBasicCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeBasicCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeBasicCallImpl\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n65#2:182\n1573#3:183\n1604#3,4:184\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeBasicCallImpl.kt\ncom/kubi/sdk/flutter/protocol/KCFlutterBridgeBasicCallImpl\n*L\n82#1:182\n159#1:183\n159#1:184,4\n*E\n"})
public final class KCFlutterBridgeBasicCallImpl implements InterfaceC4416d {
    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: a */
    public void mo4099a(@NotNull Context ctx, @NotNull String eventId, @NotNull String params, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC45942b interfaceC45942b = (InterfaceC45942b) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45942b.class)));
        if (interfaceC45942b == null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("appFlyerTrack failed, transmit not found", null, null, false, 14, null));
        } else {
            interfaceC45942b.mo84139m(eventId, params);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: b */
    public void mo4100b(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Pair<String, String> pairM23781i = C12598b.f21975a.m23781i("flutter_api");
        callback.invoke(pairM23781i != null ? pairM23781i.getSecond() : null, null);
    }

    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: c */
    public void mo4101c(@NotNull Context ctx, @NotNull String type, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Intrinsics.areEqual(type, "beep_income")) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            BeepHelper.m23642f("beep_income", R$raw.asset_in);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: d */
    public void mo4102d(@NotNull Context ctx, @Nullable String str, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if ((ctx instanceof IActivityWithResult) && (ctx instanceof FragmentActivity)) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgeBasicCallImpl$launchQrScan$1(ctx, str, callback, null), 3, null);
        } else {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalStateException("context is not FlutterEntryActivity."), null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: e */
    public void mo4103e(@NotNull Context ctx, @NotNull String uiSpmId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(uiSpmId, "uiSpmId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(C38057a.f85671a.m85928a(uiSpmId, true)), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: f */
    public void mo4104f(@NotNull Context ctx, @NotNull List<String> datas, long j11, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(datas, "datas");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(datas, 10));
        int i11 = 0;
        for (Object obj : datas) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SelectEntity(null, (String) obj, null, null, null, null, null, null, null, false, i11 == ((int) j11), null, 3069, null));
            i11 = i12;
        }
        if (ctx instanceof FragmentActivity) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) ctx), null, null, new KCFlutterBridgeBasicCallImpl$showBottomSheetDialog$1(arrayList, ctx, callback, null), 3, null);
        } else {
            callback.invoke(null, new ProtocolException(OtcAd.KYC_NOT_PASS, new IllegalStateException("context is not FlutterEntryActivity."), null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: g */
    public void mo4105g(@NotNull Context ctx, @NotNull Map<String, ? extends Object> params, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("com.kubi.event.FlutterEvent:flutterCommonEvent", params, 0L, 4, null);
        C42677p.f94436a.m93493m("homeFeed.sendFlutterEvent", params);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: h */
    public void mo4106h(@NotNull Context ctx, @NotNull String msg, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (TextUtils.isEmpty(msg)) {
            callback.invoke(Boolean.FALSE, null);
        } else {
            ToastCompat.m66441G(msg, new Object[0]);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: i */
    public void mo4107i(@NotNull Context ctx, @NotNull String url, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(InterfaceC37764p.a.m85187h(C37304a.f82764a, url, null, null, null, 14, null)), null);
    }

    @Override // b00.InterfaceC4416d
    /* JADX INFO: renamed from: j */
    public void mo4108j(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(ClipboardDataHelper.m23650a()), null);
    }

    @Override // b00.InterfaceC4416d
    public void showAddHomePageDialog(@NotNull Context ctx, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof FragmentActivity) {
            IAppletService.f46452a.get().mo15070e((FragmentActivity) ctx, shortcutId, callback);
        } else {
            callback.invoke(Boolean.FALSE, new ProtocolException("showAddHomePageDialog failed,check ctx", null, null, false, 14, null));
        }
    }
}
