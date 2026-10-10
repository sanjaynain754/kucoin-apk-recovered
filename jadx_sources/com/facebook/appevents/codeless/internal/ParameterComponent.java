package com.facebook.appevents.codeless.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ParameterComponent.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\tR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u0010\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/appevents/codeless/internal/ParameterComponent;", "", "Lorg/json/JSONObject;", Constants.COMPONENT, "<init>", "(Lorg/json/JSONObject;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "name", "b", "d", "value", "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "c", "Ljava/util/List;", "()Ljava/util/List;", "path", "pathType", "e", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ParameterComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<PathComponent> path;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String pathType;

    public ParameterComponent(@NotNull JSONObject component) throws JSONException {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.name = string;
        String strOptString = component.optString("value");
        Intrinsics.checkNotNullExpressionValue(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.value = strOptString;
        String strOptString2 = component.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.pathType = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = component.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i11);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject));
            }
        }
        this.path = arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<PathComponent> m8076b() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPathType() {
        return this.pathType;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
