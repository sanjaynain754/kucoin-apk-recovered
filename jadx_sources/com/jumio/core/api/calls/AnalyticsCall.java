package com.jumio.core.api.calls;

import com.jumio.analytics.AnalyticsEvent;
import com.jumio.analytics.MetaInfo;
import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.TimeModel;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import jumio.core.AbstractC40575O3;
import jumio.core.AbstractC40652e;
import jumio.core.C40534G2;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
public class AnalyticsCall extends AbstractC40575O3 {

    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/jumio/core/api/calls/AnalyticsCall$Companion;", "", "<init>", "()V", "DATA_EVENTS", "", "TIME_MODEL", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (!apiCallDataModel.getData().containsKey("DATA_EVENTS")) {
            throw new IllegalArgumentException("Events are missing");
        }
        if (!apiCallDataModel.getData().containsKey("TIME_MODEL")) {
            throw new IllegalArgumentException("TimeModel is missing");
        }
    }

    @Override // com.jumio.core.network.ApiCall
    public String getUri() {
        return AbstractC40652e.f90248a + StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.Rfft2dOptions, -38, -1, -84, -47, BuiltinOptions.CumsumOptions, -78, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DequantizeOptions, -120, -105, BuiltinOptions.NegOptions, -87, 9}, 7332388328695791698L);
    }

    @Override // com.jumio.core.network.ApiCall
    public final Object parseResponse(String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        return null;
    }

    @Override // jumio.core.AbstractC40575O3
    public final String getRequest() throws JSONException {
        Serializable serializable = getApiCallDataModel().getData().get("DATA_EVENTS");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.util.ArrayList<com.jumio.analytics.AnalyticsEvent>");
        if (!((ArrayList) serializable).isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Serializable serializable2 = getApiCallDataModel().getData().get("DATA_EVENTS");
            Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type java.util.ArrayList<com.jumio.analytics.AnalyticsEvent>");
            Iterator it = ((ArrayList) serializable2).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                AnalyticsEvent analyticsEvent = (AnalyticsEvent) next;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventType", analyticsEvent.getF13410b());
                Serializable serializable3 = getApiCallDataModel().getData().get("TIME_MODEL");
                Intrinsics.checkNotNull(serializable3, "null cannot be cast to non-null type com.jumio.core.models.TimeModel");
                jSONObject2.put("timestamp", ((TimeModel) serializable3).getCurrentTime(analyticsEvent.getF13409a()));
                C40534G2 f13411c = analyticsEvent.getF13411c();
                f13411c.getClass();
                JSONObject jSONObject3 = new JSONObject();
                Object jSONObject4 = f13411c.f89978a;
                if (jSONObject4 instanceof Map) {
                    Serializable serializable4 = f13411c.f89978a;
                    Intrinsics.checkNotNull(serializable4, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    jSONObject4 = new JSONObject((Map) serializable4);
                }
                jSONObject3.put("value", jSONObject4);
                MetaInfo metaInfo = f13411c.f89979b;
                if (metaInfo != null && metaInfo.size() != 0) {
                    jSONObject3.put("metainfo", new JSONObject(metaInfo));
                }
                jSONObject2.put("payload", jSONObject3);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(DbParams.TABLE_EVENTS, jSONArray);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new IllegalArgumentException("event list cannot be empty!");
    }

    @Override // com.jumio.core.network.ApiCall
    public final void responseReceived(int i11, long j11) {
    }
}
