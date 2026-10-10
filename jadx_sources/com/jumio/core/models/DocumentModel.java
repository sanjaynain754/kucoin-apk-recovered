package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.data.document.Document;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.DocumentModel;
import com.jumio.core.util.JsonUtilKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086\u0002J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\rHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/core/models/DocumentModel;", "Lcom/jumio/core/model/StaticModel;", "documents", "", "Lcom/jumio/core/data/document/Document;", "<init>", "(Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "isEmpty", "", "()Z", "size", "", "getSize", "()I", "get", "code", "", "contains", "component1", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("DocumentModel")
@SourceDebugExtension({"SMAP\nDocumentModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentModel.kt\ncom/jumio/core/models/DocumentModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final /* data */ class DocumentModel implements StaticModel {

    /* JADX INFO: renamed from: b */
    public static final Companion f14238b = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final List f14239a;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/DocumentModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/DocumentModel;", "jsonArray", "Lorg/json/JSONArray;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final Document m14557a(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Document(it);
        }

        @NotNull
        public final DocumentModel fromJson(@NotNull JSONArray jsonArray) {
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            return new DocumentModel(JsonUtilKt.map(jsonArray, new Function1() { // from class: r9.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentModel.Companion.m14557a((JSONObject) obj);
                }
            }));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Document m14556a(String code) {
        Object next;
        try {
            Intrinsics.checkNotNullParameter(code, "code");
            Iterator it = this.f14239a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((Document) next).getF13795a(), code));
        } catch (Throwable th2) {
            throw th2;
        }
        return (Document) next;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentModel) && Intrinsics.areEqual(this.f14239a, ((DocumentModel) other).f14239a);
    }

    public DocumentModel(@NotNull List<Document> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f14239a = documents;
    }

    public final int hashCode() {
        return this.f14239a.hashCode();
    }

    public final String toString() {
        return "DocumentModel(documents=" + this.f14239a + ')';
    }

    public /* synthetic */ DocumentModel(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
