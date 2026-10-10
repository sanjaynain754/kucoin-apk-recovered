package com.jumio.core.extraction.docfinder.classifier;

import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult;", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;", "<init>", "(Ljava/util/List;)V", "getEntries", "()Ljava/util/List;", "side", "getSide", "()Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;", "country", "getCountry", "type", "getType", "defaultEntryForKey", "key", "", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Entry", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDocumentClassifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentClassifier.kt\ncom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
public final /* data */ class DocumentClassifierResult {

    /* JADX INFO: renamed from: a */
    public final List f14039a;

    /* JADX INFO: renamed from: b */
    public final Entry f14040b;

    /* JADX INFO: renamed from: c */
    public final Entry f14041c;

    /* JADX INFO: renamed from: d */
    public final Entry f14042d;

    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/classifier/DocumentClassifierResult$Entry;", "", "key", "", Constants.ScionAnalytics.PARAM_LABEL, "confidence", "", "aboveThreshold", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FZ)V", "getKey", "()Ljava/lang/String;", "getLabel", "getConfidence", "()F", "getAboveThreshold", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Entry {

        /* JADX INFO: renamed from: a */
        public final String f14043a;

        /* JADX INFO: renamed from: b */
        public final String f14044b;

        /* JADX INFO: renamed from: c */
        public final float f14045c;

        /* JADX INFO: renamed from: d */
        public final boolean f14046d;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) other;
            return Intrinsics.areEqual(this.f14043a, entry.f14043a) && Intrinsics.areEqual(this.f14044b, entry.f14044b) && Float.compare(this.f14045c, entry.f14045c) == 0 && this.f14046d == entry.f14046d;
        }

        public Entry(@NotNull String key, @NotNull String label, float f11, boolean z11) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f14043a = key;
            this.f14044b = label;
            this.f14045c = f11;
            this.f14046d = z11;
        }

        public static /* synthetic */ Entry copy$default(Entry entry, String str, String str2, float f11, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = entry.f14043a;
            }
            if ((i11 & 2) != 0) {
                str2 = entry.f14044b;
            }
            if ((i11 & 4) != 0) {
                f11 = entry.f14045c;
            }
            if ((i11 & 8) != 0) {
                z11 = entry.f14046d;
            }
            return entry.copy(str, str2, f11, z11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getF14043a() {
            return this.f14043a;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getF14044b() {
            return this.f14044b;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getF14045c() {
            return this.f14045c;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getF14046d() {
            return this.f14046d;
        }

        @NotNull
        public final Entry copy(@NotNull String key, @NotNull String label, float confidence, boolean aboveThreshold) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Entry(key, label, confidence, aboveThreshold);
        }

        public final boolean getAboveThreshold() {
            return this.f14046d;
        }

        public final float getConfidence() {
            return this.f14045c;
        }

        @NotNull
        public final String getKey() {
            return this.f14043a;
        }

        @NotNull
        public final String getLabel() {
            return this.f14044b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14046d) + ((Float.hashCode(this.f14045c) + ((this.f14044b.hashCode() + (this.f14043a.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Entry(key=" + this.f14043a + ", label=" + this.f14044b + ", confidence=" + this.f14045c + ", aboveThreshold=" + this.f14046d + ')';
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentClassifierResult) && Intrinsics.areEqual(this.f14039a, ((DocumentClassifierResult) other).f14039a);
    }

    public DocumentClassifierResult(@NotNull List<Entry> entries) {
        Object obj;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f14039a = entries;
        Iterator<T> it = entries.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Entry) next).getKey(), DocumentClassifier.KEY_SIDE));
        Entry entry = (Entry) next;
        this.f14040b = entry == null ? new Entry(DocumentClassifier.KEY_SIDE, "", 0.0f, false) : entry;
        Iterator it2 = this.f14039a.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.areEqual(((Entry) next2).getKey(), "country"));
        Entry entry2 = (Entry) next2;
        this.f14041c = entry2 == null ? new Entry("country", "", 0.0f, false) : entry2;
        for (Object obj2 : this.f14039a) {
            if (Intrinsics.areEqual(((Entry) obj2).getKey(), DocumentClassifier.KEY_TYPE)) {
                obj = obj2;
                break;
            }
        }
        Entry entry3 = (Entry) obj;
        this.f14042d = entry3 == null ? new Entry(DocumentClassifier.KEY_TYPE, "", 0.0f, false) : entry3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentClassifierResult copy$default(DocumentClassifierResult documentClassifierResult, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = documentClassifierResult.f14039a;
        }
        return documentClassifierResult.copy(list);
    }

    @NotNull
    public final List<Entry> component1() {
        return this.f14039a;
    }

    @NotNull
    public final DocumentClassifierResult copy(@NotNull List<Entry> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new DocumentClassifierResult(entries);
    }

    @NotNull
    /* JADX INFO: renamed from: getCountry, reason: from getter */
    public final Entry getF14041c() {
        return this.f14041c;
    }

    @NotNull
    public final List<Entry> getEntries() {
        return this.f14039a;
    }

    @NotNull
    /* JADX INFO: renamed from: getSide, reason: from getter */
    public final Entry getF14040b() {
        return this.f14040b;
    }

    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final Entry getF14042d() {
        return this.f14042d;
    }

    public int hashCode() {
        return this.f14039a.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentClassifierResult(entries=" + this.f14039a + ')';
    }
}
