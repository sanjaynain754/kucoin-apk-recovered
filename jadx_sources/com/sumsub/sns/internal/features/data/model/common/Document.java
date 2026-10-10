package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0004B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014R\u0013\u0010'\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b(\u0010\u0019R\u0011\u0010*\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0011\u0010-\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0011\u00100\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b/\u0010+¨\u00061"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/model/common/Document;", "Landroid/os/Parcelable;", "Lcom/sumsub/sns/internal/features/data/model/common/X;", "type", "Lcom/sumsub/sns/internal/features/data/model/common/M;", DbParams.KEY_CHANNEL_RESULT, "<init>", "(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/sumsub/sns/internal/features/data/model/common/X;", "component2", "()Lcom/sumsub/sns/internal/features/data/model/common/M;", "copy", "(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)Lcom/sumsub/sns/internal/features/data/model/common/Document;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sumsub/sns/internal/features/data/model/common/X;", "getType", "Lcom/sumsub/sns/internal/features/data/model/common/M;", "getResult", "Lcom/sumsub/sns/internal/features/data/model/common/n3;", "getReview", "()Lcom/sumsub/sns/internal/features/data/model/common/n3;", "review", "getCountry", "country", "isRejected", "()Z", "isApproved", "isSubmitted", "isReviewing", "getHasNoSideness", "hasNoSideness", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDocument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Document.kt\ncom/sumsub/sns/internal/features/data/model/common/Document\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1#2:83\n1761#3,3:84\n1740#3,3:87\n1761#3,3:90\n*S KotlinDebug\n*F\n+ 1 Document.kt\ncom/sumsub/sns/internal/features/data/model/common/Document\n*L\n36#1:84,3\n40#1:87,3\n47#1:90,3\n*E\n"})
public final /* data */ class Document implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Document> CREATOR = new C29019K();

    @Nullable
    private final C29027M result;

    @NotNull
    private final C29070X type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return Intrinsics.areEqual(this.type, document.type) && Intrinsics.areEqual(this.result, document.result);
    }

    public static /* synthetic */ Document copy$default(Document document, C29070X c29070x, C29027M c29027m, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c29070x = document.type;
        }
        if ((i11 & 2) != 0) {
            c29027m = document.result;
        }
        return document.copy(c29070x, c29027m);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C29070X getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C29027M getResult() {
        return this.result;
    }

    @NotNull
    public final Document copy(@NotNull C29070X type, @Nullable C29027M result) {
        return new Document(type, result);
    }

    @Nullable
    public final String getCountry() {
        C29027M c29027m = this.result;
        if (c29027m != null) {
            return c29027m.f58968b;
        }
        return null;
    }

    public final boolean getHasNoSideness() {
        return this.type.m69748e();
    }

    @Nullable
    public final C29027M getResult() {
        return this.result;
    }

    @Nullable
    public final C29164n3 getReview() {
        Map map;
        Collection collectionValues;
        C29164n3 c29164n3;
        C29027M c29027m = this.result;
        Object obj = null;
        if (((c29027m == null || (c29164n3 = c29027m.f58967a) == null) ? null : c29164n3.f59161c) != null) {
            return c29027m.f58967a;
        }
        if (c29027m == null || (map = c29027m.f58971e) == null || (collectionValues = map.values()) == null) {
            return null;
        }
        for (Object obj2 : collectionValues) {
            if (((C29164n3) obj2).f59161c != ReviewAnswerType.Unknown) {
                obj = obj2;
                break;
            }
        }
        return (C29164n3) obj;
    }

    @NotNull
    public final C29070X getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.f59014a.hashCode() * 31;
        C29027M c29027m = this.result;
        return iHashCode + (c29027m == null ? 0 : c29027m.hashCode());
    }

    public final boolean isApproved() {
        C29164n3 c29164n3;
        Map map;
        Collection collectionValues;
        C29027M c29027m = this.result;
        if (c29027m == null || (map = c29027m.f58971e) == null || (collectionValues = map.values()) == null) {
            C29027M c29027m2 = this.result;
            return (c29027m2 == null || (c29164n3 = c29027m2.f58967a) == null || c29164n3.f59161c != ReviewAnswerType.Green) ? false : true;
        }
        if (collectionValues.isEmpty()) {
            return true;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((C29164n3) it.next()).f59161c != ReviewAnswerType.Green) {
                return false;
            }
        }
        return true;
    }

    public final boolean isRejected() {
        C29164n3 c29164n3;
        Map map;
        Collection collectionValues;
        C29027M c29027m = this.result;
        if (c29027m == null || (map = c29027m.f58971e) == null || (collectionValues = map.values()) == null) {
            C29027M c29027m2 = this.result;
            return (c29027m2 == null || (c29164n3 = c29027m2.f58967a) == null || c29164n3.f59161c != ReviewAnswerType.Red) ? false : true;
        }
        if (collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((C29164n3) it.next()).f59161c == ReviewAnswerType.Red) {
                return true;
            }
        }
        return false;
    }

    public final boolean isReviewing() {
        Map map;
        Collection collectionValues;
        C29027M c29027m = this.result;
        if (c29027m == null || (map = c29027m.f58971e) == null || (collectionValues = map.values()) == null || collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((C29164n3) it.next()).f59161c == ReviewAnswerType.Unknown) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSubmitted() {
        C29027M c29027m = this.result;
        return (c29027m != null ? c29027m.f58967a : null) != null;
    }

    @NotNull
    public String toString() {
        return "Document(type=" + this.type + ", result=" + this.result + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.writeString(this.type.f59014a);
        C29027M c29027m = this.result;
        if (c29027m == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c29027m.writeToParcel(dest, flags);
        }
    }

    public Document(@NotNull C29070X c29070x, @Nullable C29027M c29027m) {
        this.type = c29070x;
        this.result = c29027m;
    }
}
