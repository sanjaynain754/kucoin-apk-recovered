package com.facebook.appevents.codeless.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EventBinding.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\u0018\u0000 +2\u00020\u0001:\u0003,-.B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010(R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010(¨\u0006/"}, m90084d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding;", "", "", "eventName", "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", FirebaseAnalytics.Param.METHOD, "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "type", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "path", "Lcom/facebook/appevents/codeless/internal/ParameterComponent;", "parameters", "componentId", "pathType", "activityName", "<init>", "(Ljava/lang/String;Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "getMethod", "()Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "c", "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "getType", "()Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "d", "getAppVersion", "e", "Ljava/util/List;", "f", "g", "getComponentId", CmcdData.Factory.STREAMING_FORMAT_HLS, "getPathType", "i", "()Ljava/util/List;", "viewPath", "viewParameters", "j", "ActionType", "Companion", "MappingMethod", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class EventBinding {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MappingMethod method;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ActionType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String appVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<PathComponent> path;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<ParameterComponent> parameters;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String componentId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String pathType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String activityName;

    /* JADX INFO: compiled from: EventBinding.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "", "(Ljava/lang/String;I)V", "CLICK", "SELECTED", "TEXT_CHANGED", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* JADX INFO: compiled from: EventBinding.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$Companion;", "", "()V", "getInstanceFromJson", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Lorg/json/JSONObject;", "parseArray", "", "array", "Lorg/json/JSONArray;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final EventBinding getInstanceFromJson(@NotNull JSONObject mapping) throws JSONException, IllegalArgumentException {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString(FirebaseAnalytics.Param.METHOD);
            Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            MappingMethod mappingMethodValueOf = MappingMethod.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            ActionType actionTypeValueOf = ActionType.valueOf(upperCase2);
            String appVersion = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jsonPath = jSONArray.getJSONObject(i11);
                Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                arrayList.add(new PathComponent(jsonPath));
            }
            String pathType = mapping.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    JSONObject jsonParameter = jSONArrayOptJSONArray.getJSONObject(i12);
                    Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                    arrayList2.add(new ParameterComponent(jsonParameter));
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
            Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
            Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
            Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
            Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
            return new EventBinding(eventName, mappingMethodValueOf, actionTypeValueOf, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        @JvmStatic
        @NotNull
        public final List<EventBinding> parseArray(@Nullable JSONArray array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                try {
                    int length = array.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject = array.getJSONObject(i11);
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                        arrayList.add(getInstanceFromJson(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: EventBinding.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "", "(Ljava/lang/String;I)V", "MANUAL", "INFERENCE", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    public EventBinding(@NotNull String eventName, @NotNull MappingMethod method, @NotNull ActionType type, @NotNull String appVersion, @NotNull List<PathComponent> path, @NotNull List<ParameterComponent> parameters, @NotNull String componentId, @NotNull String pathType, @NotNull String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.eventName = eventName;
        this.method = method;
        this.type = type;
        this.appVersion = appVersion;
        this.path = path;
        this.parameters = parameters;
        this.componentId = componentId;
        this.pathType = pathType;
        this.activityName = activityName;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<ParameterComponent> m8071c() {
        List<ParameterComponent> listUnmodifiableList = Collections.unmodifiableList(this.parameters);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<PathComponent> m8072d() {
        List<PathComponent> listUnmodifiableList = Collections.unmodifiableList(this.path);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(path)");
        return listUnmodifiableList;
    }
}
