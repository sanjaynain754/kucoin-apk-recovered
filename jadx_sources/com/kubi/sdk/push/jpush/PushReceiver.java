package com.kubi.sdk.push.jpush;

import android.content.Context;
import android.os.Bundle;
import cn.jiguang.privates.common.component.JCommonReceiver;
import cn.jiguang.privates.core.api.JCorePrivatesApi;
import cn.jiguang.privates.push.api.NotificationMessage;
import cn.jiguang.privates.push.api.PlatformTokenMessage;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.monitor.sensor.SensorCommonTrack;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.push.PushManger;
import j00.C40197a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: PushReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/push/jpush/PushReceiver;", "Lcn/jiguang/privates/common/component/JCommonReceiver;", "<init>", "()V", "onNotificationArrived", "", "context", "Landroid/content/Context;", "notificationMessage", "Lcn/jiguang/privates/push/api/NotificationMessage;", "onNotificationClicked", "onPlatformToken", "platformTokenMessage", "Lcn/jiguang/privates/push/api/PlatformTokenMessage;", "onConnectStatus", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "Companion", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPushReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushReceiver.kt\ncom/kubi/sdk/push/jpush/PushReceiver\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n71#2,4:121\n71#2,4:125\n1#3:129\n*S KotlinDebug\n*F\n+ 1 PushReceiver.kt\ncom/kubi/sdk/push/jpush/PushReceiver\n*L\n34#1:121,4\n63#1:125,4\n*E\n"})
public final class PushReceiver extends JCommonReceiver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f47598a = new Companion(null);

    /* JADX INFO: compiled from: PushReceiver.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/push/jpush/PushReceiver$Companion;", "", "<init>", "()V", "TAG", "", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // cn.jiguang.privates.common.component.JCommonReceiver
    public void onConnectStatus(@NotNull Context context, boolean enable) {
        Intrinsics.checkNotNullParameter(context, "context");
        C44128b.m97266j("PushReceiver", "onConnectStatus=" + enable);
        if (enable) {
            String registrationId = JCorePrivatesApi.getRegistrationId(context);
            if (registrationId == null) {
                registrationId = "";
            }
            C44128b.m97266j("PushReceiver", "get pushId=" + registrationId);
            PushManger.f47510a.m57929n(registrationId);
            SensorCommonTrack.a.b(registrationId);
        }
    }

    @Override // cn.jiguang.privates.common.component.JCommonReceiver
    public void onNotificationArrived(@Nullable Context context, @NotNull NotificationMessage notificationMessage) {
        Intrinsics.checkNotNullParameter(notificationMessage, "notificationMessage");
        C44128b.m97266j("PushReceiver", "onNotificationArrived " + notificationMessage);
        String strM88550a = C40197a.m88550a(notificationMessage.getPlatform());
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", "arrived");
        eventParametersBuilderAcquire.m42393d("category", strM88550a);
        TechnologyEvent.m42388d("offline_push", eventParametersBuilderAcquire);
    }

    @Override // cn.jiguang.privates.common.component.JCommonReceiver
    public void onNotificationClicked(@Nullable Context context, @NotNull NotificationMessage notificationMessage) throws JSONException {
        Intrinsics.checkNotNullParameter(notificationMessage, "notificationMessage");
        C44128b.m97266j("PushReceiver", "onNotificationClicked " + notificationMessage);
        String strM88550a = C40197a.m88550a(notificationMessage.getPlatform());
        Bundle extras = notificationMessage.getExtras();
        String string = extras != null ? extras.getString("template_code") : null;
        Bundle extras2 = notificationMessage.getExtras();
        String string2 = extras2 != null ? extras2.getString("business_custom_tracking") : null;
        Bundle extras3 = notificationMessage.getExtras();
        String string3 = extras3 != null ? extras3.getString("url") : null;
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42393d("type", "clicked");
        eventParametersBuilderAcquire.m42393d("category", strM88550a);
        TechnologyEvent.m42388d("offline_push", eventParametersBuilderAcquire);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_push_msg_id", notificationMessage.getMessageId());
        jSONObject.put("app_push_title", notificationMessage.getTitle());
        jSONObject.put("app_push_channel", strM88550a);
        jSONObject.put("app_push_service_name", "JPUSH_PRIVATE");
        if (string3 != null) {
            jSONObject.put("url", string3);
        }
        if (string != null) {
            jSONObject.put("postType", string);
        }
        if (string2 != null && string2.length() != 0) {
            JSONObject jSONObject2 = new JSONObject(string2);
            String strOptString = jSONObject2.optString("mc_track_1");
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() <= 0) {
                strOptString = null;
            }
            jSONObject.put("mc_track_1", strOptString);
            String strOptString2 = jSONObject2.optString("mc_track_2");
            Intrinsics.checkNotNull(strOptString2);
            if (strOptString2.length() <= 0) {
                strOptString2 = null;
            }
            jSONObject.put("mc_track_2", strOptString2);
            String strOptString3 = jSONObject2.optString("mc_track_3");
            Intrinsics.checkNotNull(strOptString3);
            jSONObject.put("mc_track_3", strOptString3.length() > 0 ? strOptString3 : null);
        }
        C43852m.m96605q("app_push_click", jSONObject);
    }

    @Override // cn.jiguang.privates.common.component.JCommonReceiver
    public void onPlatformToken(@Nullable Context context, @NotNull PlatformTokenMessage platformTokenMessage) {
        Intrinsics.checkNotNullParameter(platformTokenMessage, "platformTokenMessage");
        byte platform = platformTokenMessage.getPlatform();
        String token = platformTokenMessage.getToken();
        C44128b.m97266j("PushReceiver", "platform=" + ((int) platform) + ",token=" + token);
        String strM88550a = C40197a.m88550a(platform);
        PushManger pushManger = PushManger.f47510a;
        Intrinsics.checkNotNull(token);
        pushManger.m57930o(token, strM88550a);
    }
}
