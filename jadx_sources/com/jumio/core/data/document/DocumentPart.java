package com.jumio.core.data.document;

import com.jumio.core.data.ScanMode;
import com.jumio.core.data.document.DocumentPart;
import com.jumio.core.util.JsonUtilKt;
import com.jumio.sdk.enums.JumioCredentialPart;
import java.io.Serializable;
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
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/core/data/document/DocumentPart;", "Ljava/io/Serializable;", "side", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "extraction", "", "Lcom/jumio/core/data/ScanMode;", "<init>", "(Lcom/jumio/sdk/enums/JumioCredentialPart;Ljava/util/List;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getSide", "()Lcom/jumio/sdk/enums/JumioCredentialPart;", "getExtraction", "()Ljava/util/List;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DocumentPart implements Serializable {

    /* JADX INFO: renamed from: a */
    public final JumioCredentialPart f13807a;

    /* JADX INFO: renamed from: b */
    public final List f13808b;

    public DocumentPart(@NotNull JumioCredentialPart side, @NotNull List<? extends ScanMode> extraction) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(extraction, "extraction");
        this.f13807a = side;
        this.f13808b = extraction;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DocumentPart(@NotNull JSONObject jsonObject) throws JSONException {
        List map;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("side");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        JumioCredentialPart jumioCredentialPartValueOf = JumioCredentialPart.valueOf(string);
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("extraction");
        this(jumioCredentialPartValueOf, (jSONArrayOptJSONArray == null || (map = JsonUtilKt.map(jSONArrayOptJSONArray, new Function1() { // from class: m9.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentPart.m14525a((String) obj);
            }
        })) == null) ? CollectionsKt.emptyList() : map);
    }

    /* JADX INFO: renamed from: a */
    public static final ScanMode m14525a(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ScanMode.valueOf(it);
    }

    @NotNull
    public final List<ScanMode> getExtraction() {
        return this.f13808b;
    }

    @NotNull
    /* JADX INFO: renamed from: getSide, reason: from getter */
    public final JumioCredentialPart getF13807a() {
        return this.f13807a;
    }
}
