package com.kubi.redpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import androidx.core.net.MailTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5258a;
import com.blankj.utilcode.util.C5286o;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.redpackage.entity.RedPacketErrorResourceEntity;
import com.kubi.redpackage.exception.RedPkgMessage;
import com.kubi.redpackage.utils.RedPkgCategory;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27041f;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p845zv.C46928a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RedPackageHelper.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052%\b\u0002\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u001aY\u0010\f\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052%\b\u0002\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007\u001a\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u001a\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003\u001a\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0003\u001a.\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b\u001a \u0010\u001a\u001a\u00020\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¨\u0006 "}, m90084d2 = {"getRedPacket", "", "redCode", "", DbParams.KEY_CHANNEL_RESULT, "Lkotlin/Function1;", "Lorg/json/JSONObject;", "onComplete", "", "Lkotlin/ParameterName;", "name", "success", "getRedPacketInner", "activity", "Landroidx/fragment/app/FragmentActivity;", "getRedPackageNickName", "sendSmsIntent", "Landroid/content/Intent;", "keyWords", "getEmailIntent", "shareText", "jsonOrEmpty", "data", "code", "", "msg", "showRedPacketErrorDialog", "fm", "Landroidx/fragment/app/FragmentManager;", "resourceInfo", "", "Lcom/kubi/redpackage/entity/RedPacketErrorResourceEntity;", "RedpackageLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRedPackageHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPackageHelper.kt\ncom/kubi/redpackage/RedPackageHelperKt\n+ 2 RedPackageIssue.kt\ncom/kubi/redpackage/exception/RedPackageIssueKt\n*L\n1#1,159:1\n48#2,2:160\n*S KotlinDebug\n*F\n+ 1 RedPackageHelper.kt\ncom/kubi/redpackage/RedPackageHelperKt\n*L\n54#1:160,2\n*E\n"})
public final class RedPackageHelperKt {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Intent m53714c(@NotNull String shareText) {
        Intrinsics.checkNotNullParameter(shareText, "shareText");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(MailTo.MAILTO_SCHEME));
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, "");
        intent.putExtra("android.intent.extra.TEXT", shareText);
        return intent;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m53715d() {
        IUserService.Companion companion = IUserService.a;
        if (TextUtils.isEmpty(companion.get().d0().id)) {
            return null;
        }
        if (!TextUtils.isEmpty(companion.get().d0().getNicknameR())) {
            return companion.get().d0().getNicknameR();
        }
        return "User " + companion.get().d0().getReferralCode();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m53717f(String str, Function1 function1, Function1 function2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        m53716e(str, function1, function2);
    }

    @SuppressLint({"SetTextI18n"})
    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public static final void m53719h(@Nullable String str, @NotNull FragmentActivity activity, @Nullable Function1<? super JSONObject, Unit> function1, @Nullable Function1<? super Boolean, Unit> function2) throws JSONException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (str2.length() == 0 || !C27041f.m66664d(str2)) {
            if (function2 != null) {
                function2.invoke(Boolean.FALSE);
            }
            C46928a.m103398d(RedPkgCategory.RECEIVE_CODE_CHECK, false, null, null, 7, null);
            return;
        }
        Fragment fragmentM6319c = C5286o.m6319c(activity.getSupportFragmentManager(), str2);
        if (fragmentM6319c == null || !fragmentM6319c.isVisible()) {
            LifecycleOwnerKt.getLifecycleScope(activity).launchWhenStarted(new RedPackageHelperKt$getRedPacketInner$1((RedPackageApi) RetrofitFlowExKt.m42820a(RedPackageApi.class), str2, function1, activity, function2, null));
        } else if (function2 != null) {
            function2.invoke(Boolean.FALSE);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final JSONObject m53720i(@NotNull String data, int i11, @NotNull String msg, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(msg, "msg");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", data);
        jSONObject.put("code", i11);
        jSONObject.put("success", z11);
        jSONObject.put("msg", msg);
        return jSONObject;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ JSONObject m53721j(String str, int i11, String str2, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        if ((i12 & 8) != 0) {
            z11 = i11 == 0;
        }
        return m53720i(str, i11, str2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final Intent m53722k(@NotNull String keyWords) {
        Intrinsics.checkNotNullParameter(keyWords, "keyWords");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", "", null));
        intent.putExtra("sms_body", keyWords);
        return intent;
    }

    /* JADX INFO: renamed from: l */
    public static final void m53723l(@Nullable FragmentManager fragmentManager, @Nullable List<RedPacketErrorResourceEntity> list) {
        final RedPacketErrorResourceEntity redPacketErrorResourceEntity;
        if (fragmentManager == null || list == null || (redPacketErrorResourceEntity = (RedPacketErrorResourceEntity) CollectionsKt.firstOrNull((List) list)) == null || !redPacketErrorResourceEntity.isLegal()) {
            return;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54173d5(false).m54156M4(redPacketErrorResourceEntity.getMsgContent()).m54157N4(true).m54163T4(redPacketErrorResourceEntity.getBtnTxt(), new DialogInterface.OnClickListener() { // from class: com.kubi.redpackage.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                RedPackageHelperKt.m53724m(redPacketErrorResourceEntity, dialogInterface, i11);
            }
        }).m54172c5(fragmentManager);
    }

    /* JADX INFO: renamed from: e */
    public static final void m53716e(@Nullable final String str, @Nullable final Function1<? super JSONObject, Unit> function1, @Nullable final Function1<? super Boolean, Unit> function2) {
        final FragmentActivity fragmentActivity;
        View decorView;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) activityM6125h;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    Window window = fragmentActivity.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        decorView.post(new Runnable() { // from class: com.kubi.redpackage.b
                            @Override // java.lang.Runnable
                            public final void run() throws JSONException {
                                RedPackageHelperKt.m53718g(str, fragmentActivity, function1, function2);
                            }
                        });
                        return;
                    }
                    return;
                }
                m53719h(str, fragmentActivity, function1, function2);
            } catch (Throwable th2) {
                C44128b.m97263g("RedPackageHelper", th2);
                String message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                C43846g.m96568c(new RedPkgMessage(message, "RedPackageHelper", false, 4, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m53718g(String str, FragmentActivity fragmentActivity, Function1 function1, Function1 function2) throws JSONException {
        m53719h(str, fragmentActivity, function1, function2);
    }

    /* JADX INFO: renamed from: m */
    public static final void m53724m(RedPacketErrorResourceEntity redPacketErrorResourceEntity, DialogInterface dialogInterface, int i11) {
        RouteExKt.m56217H(redPacketErrorResourceEntity.getUrl());
    }
}
