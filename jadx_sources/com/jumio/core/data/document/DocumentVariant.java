package com.jumio.core.data.document;

import com.jumio.core.data.document.DocumentVariant;
import com.jumio.core.util.JsonUtilKt;
import com.jumio.sdk.document.JumioDocumentVariant;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m90084d2 = {"Lcom/jumio/core/data/document/DocumentVariant;", "Ljava/io/Serializable;", "variant", "Lcom/jumio/sdk/document/JumioDocumentVariant;", "parts", "", "Lcom/jumio/core/data/document/DocumentPart;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Lcom/jumio/core/data/document/DocumentFormat;", "<init>", "(Lcom/jumio/sdk/document/JumioDocumentVariant;Ljava/util/List;Lcom/jumio/core/data/document/DocumentFormat;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getVariant", "()Lcom/jumio/sdk/document/JumioDocumentVariant;", "getParts", "()Ljava/util/List;", "getFormat", "()Lcom/jumio/core/data/document/DocumentFormat;", "hasPart", "", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "getPart", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDocumentVariant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentVariant.kt\ncom/jumio/core/data/document/DocumentVariant\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class DocumentVariant implements Serializable {

    /* JADX INFO: renamed from: a */
    public final JumioDocumentVariant f13809a;

    /* JADX INFO: renamed from: b */
    public final List f13810b;

    /* JADX INFO: renamed from: c */
    public final DocumentFormat f13811c;

    public DocumentVariant(@NotNull JumioDocumentVariant variant, @NotNull List<DocumentPart> parts, @NotNull DocumentFormat format) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f13809a = variant;
        this.f13810b = parts;
        this.f13811c = format;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DocumentVariant(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("variant");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        JumioDocumentVariant jumioDocumentVariantValueOf = JumioDocumentVariant.valueOf(string);
        JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("parts");
        List listEmptyList = (jSONArrayOptJSONArray == null || (listEmptyList = JsonUtilKt.map(jSONArrayOptJSONArray, new Function1() { // from class: m9.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentVariant.m14526a((JSONObject) obj);
            }
        })) == null) ? CollectionsKt.emptyList() : listEmptyList;
        String strOptString = jsonObject.optString(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "NONE");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        this(jumioDocumentVariantValueOf, listEmptyList, DocumentFormat.valueOf(strOptString));
    }

    /* JADX INFO: renamed from: a */
    public static final DocumentPart m14526a(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DocumentPart(it);
    }

    @NotNull
    /* JADX INFO: renamed from: getFormat, reason: from getter */
    public final DocumentFormat getF13811c() {
        return this.f13811c;
    }

    @NotNull
    public final DocumentPart getPart(@NotNull JumioCredentialPart credentialPart) {
        Object next;
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        Iterator it = this.f13810b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DocumentPart) next).getF13807a() != credentialPart);
        DocumentPart documentPart = (DocumentPart) next;
        if (documentPart != null) {
            return documentPart;
        }
        throw new IllegalArgumentException(("Could not find " + credentialPart).toString());
    }

    @NotNull
    public final List<DocumentPart> getParts() {
        return this.f13810b;
    }

    @NotNull
    /* JADX INFO: renamed from: getVariant, reason: from getter */
    public final JumioDocumentVariant getF13809a() {
        return this.f13809a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
    public final boolean hasPart(@NotNull JumioCredentialPart credentialPart) {
        Intrinsics.checkNotNullParameter(credentialPart, "credentialPart");
        for (Object obj : this.f13810b) {
            if (((DocumentPart) obj).getF13807a() == credentialPart) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
