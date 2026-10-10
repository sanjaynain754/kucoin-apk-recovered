package com.jumio.core.data.digitaldocument;

import com.jumio.core.data.digitaldocument.DigitalDocumentType;
import com.jumio.core.data.document.DocumentType;
import com.jumio.core.util.JsonUtilKt;
import java.io.Serializable;
import java.text.CollationKey;
import java.text.Collator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m90084d2 = {"Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;", "Lcom/jumio/core/data/document/DocumentType;", "Ljava/io/Serializable;", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "type", "", "getType", "()Ljava/lang/String;", "collationKey", "Ljava/text/CollationKey;", "getCollationKey", "()Ljava/text/CollationKey;", "title", "getTitle", "parts", "", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;", "getParts", "()Ljava/util/List;", "compareTo", "", "other", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DigitalDocumentType implements DocumentType, Serializable {

    /* JADX INFO: renamed from: a */
    public final String f13775a;

    /* JADX INFO: renamed from: b */
    public final String f13776b;

    /* JADX INFO: renamed from: c */
    public final List f13777c;

    public DigitalDocumentType(@NotNull JSONObject jsonObject) throws JSONException {
        List map;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("type");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f13775a = string;
        String strOptString = jsonObject.optString("title", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        this.f13776b = strOptString;
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("parts");
        this.f13777c = (jSONArrayOptJSONArray == null || (map = JsonUtilKt.map(jSONArrayOptJSONArray, new Function1() { // from class: l9.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DigitalDocumentType.m14520a((JSONObject) obj);
            }
        })) == null) ? CollectionsKt.emptyList() : map;
    }

    /* JADX INFO: renamed from: a */
    public static final DigitalDocumentPart m14520a(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DigitalDocumentPart(it);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DocumentType other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof DigitalDocumentType)) {
            return -1;
        }
        CollationKey collationKey = Collator.getInstance().getCollationKey(getF13775a());
        Intrinsics.checkNotNullExpressionValue(collationKey, "getCollationKey(...)");
        DigitalDocumentType digitalDocumentType = (DigitalDocumentType) other;
        digitalDocumentType.getClass();
        CollationKey collationKey2 = Collator.getInstance().getCollationKey(digitalDocumentType.getF13775a());
        Intrinsics.checkNotNullExpressionValue(collationKey2, "getCollationKey(...)");
        return collationKey.compareTo(collationKey2);
    }

    @NotNull
    public final List<DigitalDocumentPart> getParts() {
        return this.f13777c;
    }

    @NotNull
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF13776b() {
        return this.f13776b;
    }

    @Override // com.jumio.core.data.document.DocumentType
    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public String getF13775a() {
        return this.f13775a;
    }
}
