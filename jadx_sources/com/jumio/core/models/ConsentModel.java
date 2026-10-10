package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.ConsentModel;
import com.jumio.core.util.JsonUtilKt;
import com.jumio.sdk.consent.JumioConsentItem;
import com.jumio.sdk.enums.JumioConsentType;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jumio.core.AbstractC40683k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0017\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000bJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0019R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00020\t8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m90084d2 = {"Lcom/jumio/core/models/ConsentModel;", "Lcom/jumio/core/model/StaticModel;", "Ljava/io/Serializable;", "consentItems", "", "Lcom/jumio/sdk/consent/JumioConsentItem;", "<init>", "(Ljava/util/List;)V", "", "", "consentTimestamps", "", "isConsentResultPending", "allConsented", "getAllConsented", "()Z", "nonConsentedItems", "getNonConsentedItems", "()Ljava/util/List;", "isConsentSent", "setConsentSent", "(Z)V", "toJsonArray", "Lorg/json/JSONArray;", "saveResult", "", "item", DbParams.KEY_CHANNEL_RESULT, "timestamp", "getConsentDataIfNeeded", "", "addConsentOutcome", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("ConsentModel")
@SourceDebugExtension({"SMAP\nConsentModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentModel.kt\ncom/jumio/core/models/ConsentModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,76:1\n1293#2,4:77\n535#3:81\n520#3,6:82\n216#4,2:88\n*S KotlinDebug\n*F\n+ 1 ConsentModel.kt\ncom/jumio/core/models/ConsentModel\n*L\n14#1:77,4\n25#1:81\n25#1:82,6\n31#1:88,2\n*E\n"})
public final class ConsentModel implements StaticModel, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f14192a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f14193b;

    /* JADX INFO: renamed from: c */
    public boolean f14194c;

    /* JADX INFO: renamed from: d */
    public boolean f14195d;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/ConsentModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/ConsentModel;", "jsonArray", "Lorg/json/JSONArray;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final JumioConsentItem m14551a(JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String string = jsonObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jsonObject.getString("privacyPolicyUrl");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jsonObject.getString("text");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            JumioConsentType.Companion companion = JumioConsentType.INSTANCE;
            String string4 = jsonObject.getString("displayType");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return new JumioConsentItem(string, string2, string3, companion.fromString(string4));
        }

        @NotNull
        public final ConsentModel fromJson(@NotNull JSONArray jsonArray) {
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            return new ConsentModel(JsonUtilKt.map(jsonArray, new Function1() { // from class: r9.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConsentModel.Companion.m14551a((JSONObject) obj);
                }
            }));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsentModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ConsentModel(@NotNull List<JumioConsentItem> consentItems) {
        Intrinsics.checkNotNullParameter(consentItems, "consentItems");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : consentItems) {
            linkedHashMap.put(obj, Boolean.FALSE);
        }
        this.f14192a = linkedHashMap;
        this.f14193b = new LinkedHashMap();
    }

    public final void addConsentOutcome() {
        if (this.f14194c) {
            this.f14195d = true;
            this.f14194c = false;
        }
    }

    public final boolean getAllConsented() {
        return !this.f14192a.containsValue(Boolean.FALSE);
    }

    @NotNull
    public final List<JumioConsentItem> getNonConsentedItems() {
        LinkedHashMap linkedHashMap = this.f14192a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt.toList(linkedHashMap2.keySet());
    }

    public final boolean isConsentSent() {
        return this.f14192a.isEmpty() || this.f14195d;
    }

    public final void saveResult(@NotNull JumioConsentItem item, boolean result, long timestamp) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f14192a.put(item, Boolean.valueOf(result));
        this.f14193b.put(item, Long.valueOf(timestamp));
    }

    public final void setConsentSent(boolean z11) {
        this.f14195d = z11;
    }

    @Nullable
    public final String getConsentDataIfNeeded() {
        if (!isConsentSent()) {
            this.f14194c = true;
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : this.f14193b.entrySet()) {
                jSONArray.put(new JSONObject(AbstractC40683k0.m89258a((JumioConsentItem) entry.getKey(), Long.valueOf(((Number) entry.getValue()).longValue()))));
            }
            return jSONObject.put("consents", jSONArray).toString();
        }
        return null;
    }

    public /* synthetic */ ConsentModel(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
