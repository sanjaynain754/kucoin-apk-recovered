package com.kubi.kyc.knb;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import b00.InterfaceC4430m;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.permissions.utils.PermissionCompat;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycAdvanceResult;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import gn.InterfaceC37974a;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgeKycCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0016J.\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\fH\u0017¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kyc/knb/KCFlutterBridgeKycCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKycCall;", "<init>", "()V", "advancebyChannel", "", "ctx", "Landroid/content/Context;", AppsFlyerProperties.CHANNEL, "", "data", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKycKycAdvanceResult;", "Lcom/kubi/sdk/protocol/ProtocolException;", "checkSumsubPermission", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeKycCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeKycCallImpl.kt\ncom/kubi/kyc/knb/KCFlutterBridgeKycCallImpl\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,173:1\n17#2,2:174\n37#3:176\n36#3,3:177\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeKycCallImpl.kt\ncom/kubi/kyc/knb/KCFlutterBridgeKycCallImpl\n*L\n133#1:174,2\n138#1:176\n138#1:177,3\n*E\n"})
public final class KCFlutterBridgeKycCallImpl implements InterfaceC4430m {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21.equals("KUCOIN_LEGO") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (r21.equals("KUCOIN") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        r1 = r3.optString("type", "");
        r2 = r3.optString("advanceToken", "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        if (p852kotlin.jvm.internal.Intrinsics.areEqual(r1, "ADVANCE") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
    
        p852kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
    
        if (r2.length() <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        r0 = kotlinx.coroutines.C41696j.m91104d(androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0), null, null, new com.kubi.kyc.knb.KCFlutterBridgeKycCallImpl$advancebyChannel$1(r0, r2, r4, null), 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        r4.invoke(null, new com.kubi.sdk.protocol.ProtocolException("advanceToken is empty", null, null, false, 14, null));
        r0 = p852kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // b00.InterfaceC4430m
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4177a(@NotNull Context ctx, @NotNull String channel, @NotNull String data, @NotNull Function2<? super KCFlutterBridgeKycKycAdvanceResult, ? super ProtocolException, Unit> function2) {
        Function2<? super KCFlutterBridgeKycKycAdvanceResult, ? super ProtocolException, Unit> callback = function2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FlutterEntryActivity flutterEntryActivity = ctx instanceof FlutterEntryActivity ? (FlutterEntryActivity) ctx : null;
        if (flutterEntryActivity == null) {
            callback.invoke(null, new ProtocolException("activity is null", null, null, false, 14, null));
        }
        JSONObject jSONObject = new JSONObject(data);
        switch (channel.hashCode()) {
            case -2067207429:
                break;
            case -1837872107:
                if (!channel.equals("SUMSUB")) {
                    callback = function2;
                    C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(flutterEntryActivity), null, null, new KCFlutterBridgeKycCallImpl$advancebyChannel$4(flutterEntryActivity, jSONObject.optString("infoData", ""), callback, null), 3, null);
                } else {
                    C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(flutterEntryActivity), null, null, new KCFlutterBridgeKycCallImpl$advancebyChannel$3(flutterEntryActivity, jSONObject.optString(InterfaceC33826o0.f71244p, ""), jSONObject.optString("idDocType", ""), jSONObject.optString("country", ""), function2, null), 3, null);
                }
                break;
            case 70949128:
                if (channel.equals("JUMIO")) {
                    C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(flutterEntryActivity), null, null, new KCFlutterBridgeKycCallImpl$advancebyChannel$2(flutterEntryActivity, jSONObject.optString(InterfaceC33826o0.f71244p, ""), jSONObject.optString("dataCenter", ""), callback, null), 3, null);
                }
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(flutterEntryActivity), null, null, new KCFlutterBridgeKycCallImpl$advancebyChannel$4(flutterEntryActivity, jSONObject.optString("infoData", ""), callback, null), 3, null);
                break;
            case 937954021:
                break;
            default:
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(flutterEntryActivity), null, null, new KCFlutterBridgeKycCallImpl$advancebyChannel$4(flutterEntryActivity, jSONObject.optString("infoData", ""), callback, null), 3, null);
                break;
        }
    }

    @Override // b00.InterfaceC4430m
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: b */
    public void mo4178b(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        List<String> listListOf;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37974a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (listListOf = ((InterfaceC37974a) objM56186h).mo4567a()) == null) {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"});
        }
        String[] strArr = (String[]) listListOf.toArray(new String[0]);
        if (PermissionCompat.f40528a.m49937a(ctx, (String[]) Arrays.copyOf(strArr, strArr.length)) == 0) {
            callback.invoke(Boolean.TRUE, null);
            return;
        }
        FragmentActivity fragmentActivity = ctx instanceof FragmentActivity ? (FragmentActivity) ctx : null;
        if (fragmentActivity != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new KCFlutterBridgeKycCallImpl$checkSumsubPermission$1(fragmentActivity, strArr, callback, null), 3, null);
        } else {
            callback.invoke(Boolean.FALSE, null);
        }
    }
}
