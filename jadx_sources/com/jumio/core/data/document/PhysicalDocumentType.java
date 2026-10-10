package com.jumio.core.data.document;

import com.jumio.core.data.document.PhysicalDocumentType;
import com.jumio.core.util.JsonUtilKt;
import com.jumio.sdk.document.JumioDocumentType;
import com.jumio.sdk.document.JumioDocumentVariant;
import com.kubi.kyc.KycKey;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0018J\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0096\u0002J\u0013\u0010\u001d\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m90084d2 = {"Lcom/jumio/core/data/document/PhysicalDocumentType;", "Lcom/jumio/core/data/document/DocumentType;", "Ljava/io/Serializable;", KycKey.idType, "Lcom/jumio/sdk/document/JumioDocumentType;", "variants", "", "Lcom/jumio/core/data/document/DocumentVariant;", "<init>", "(Lcom/jumio/sdk/document/JumioDocumentType;Ljava/util/List;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getIdType", "()Lcom/jumio/sdk/document/JumioDocumentType;", "getVariants", "()Ljava/util/List;", "type", "", "getType", "()Ljava/lang/String;", "hasVariant", "", "variant", "Lcom/jumio/sdk/document/JumioDocumentVariant;", "getVariant", "compareTo", "", "other", "equals", "", "hashCode", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPhysicalDocumentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalDocumentType.kt\ncom/jumio/core/data/document/PhysicalDocumentType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1755#2,3:64\n1#3:67\n*S KotlinDebug\n*F\n+ 1 PhysicalDocumentType.kt\ncom/jumio/core/data/document/PhysicalDocumentType\n*L\n22#1:64,3\n*E\n"})
public final class PhysicalDocumentType implements DocumentType, Serializable {

    /* JADX INFO: renamed from: a */
    public final JumioDocumentType f13814a;

    /* JADX INFO: renamed from: b */
    public final List f13815b;

    public PhysicalDocumentType(@NotNull JumioDocumentType idType, @NotNull List<DocumentVariant> variants) {
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.f13814a = idType;
        this.f13815b = variants;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhysicalDocumentType(@NotNull JSONObject jsonObject) throws JSONException {
        List map;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString(KycKey.idType);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        JumioDocumentType jumioDocumentTypeValueOf = JumioDocumentType.valueOf(string);
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("variants");
        this(jumioDocumentTypeValueOf, (jSONArrayOptJSONArray == null || (map = JsonUtilKt.map(jSONArrayOptJSONArray, new Function1() { // from class: m9.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhysicalDocumentType.m14527a((JSONObject) obj);
            }
        })) == null) ? CollectionsKt.emptyList() : map);
    }

    /* JADX INFO: renamed from: a */
    public static final DocumentVariant m14527a(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DocumentVariant(it);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DocumentType other) {
        JumioDocumentType jumioDocumentType;
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof PhysicalDocumentType)) {
            return -1;
        }
        JumioDocumentType jumioDocumentType2 = this.f13814a;
        JumioDocumentType jumioDocumentType3 = JumioDocumentType.PASSPORT;
        if (jumioDocumentType2 == jumioDocumentType3 && ((PhysicalDocumentType) other).f13814a != jumioDocumentType3) {
            return -1;
        }
        JumioDocumentType jumioDocumentType4 = JumioDocumentType.DRIVING_LICENSE;
        if (jumioDocumentType2 == jumioDocumentType4 && ((PhysicalDocumentType) other).f13814a == jumioDocumentType3) {
            return 1;
        }
        if (jumioDocumentType2 == jumioDocumentType4 && ((PhysicalDocumentType) other).f13814a != jumioDocumentType4) {
            return -1;
        }
        JumioDocumentType jumioDocumentType5 = JumioDocumentType.ID_CARD;
        if (jumioDocumentType2 == jumioDocumentType5 && ((PhysicalDocumentType) other).f13814a == jumioDocumentType3) {
            return 1;
        }
        if (jumioDocumentType2 == jumioDocumentType5 && ((PhysicalDocumentType) other).f13814a == jumioDocumentType4) {
            return 1;
        }
        return ((jumioDocumentType2 == jumioDocumentType5 && ((PhysicalDocumentType) other).f13814a == JumioDocumentType.VISA) || jumioDocumentType2 != (jumioDocumentType = JumioDocumentType.VISA) || ((PhysicalDocumentType) other).f13814a == jumioDocumentType) ? -1 : 1;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof PhysicalDocumentType ? compareTo((DocumentType) other) : -1) == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: getIdType, reason: from getter */
    public final JumioDocumentType getF13814a() {
        return this.f13814a;
    }

    @Override // com.jumio.core.data.document.DocumentType
    @NotNull
    /* JADX INFO: renamed from: getType */
    public String getF13775a() {
        return this.f13814a.toString();
    }

    @Nullable
    public final DocumentVariant getVariant(@NotNull JumioDocumentVariant variant) {
        Object next;
        Intrinsics.checkNotNullParameter(variant, "variant");
        Iterator it = this.f13815b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((DocumentVariant) next).getF13809a() == variant) {
                return (DocumentVariant) next;
            }
        }
        next = null;
        return (DocumentVariant) next;
    }

    @NotNull
    public final List<DocumentVariant> getVariants() {
        return this.f13815b;
    }

    public final boolean hasVariant(@NotNull JumioDocumentVariant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        List list = this.f13815b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((DocumentVariant) it.next()).getF13809a() == variant) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}
